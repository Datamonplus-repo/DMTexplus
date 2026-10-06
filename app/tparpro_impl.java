package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparpro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A602MaqCod, A558HisProFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A503GruOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
         n656ParCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A656ParCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
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
         gxload_21( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A402EmprCodVir = httpContext.GetPar( "EmprCodVir") ;
         httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
         A134BarCodVir = (int)(GXutil.lval( httpContext.GetPar( "BarCodVir"))) ;
         A133BarCodReoV = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoV"))) ;
         A131BarCodParV = httpContext.GetPar( "BarCodParV") ;
         A195BarOrdLinV = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLinV"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A602MaqCod, A402EmprCodVir, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
         A402EmprCodVir = httpContext.GetPar( "EmprCodVir") ;
         httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
         A134BarCodVir = (int)(GXutil.lval( httpContext.GetPar( "BarCodVir"))) ;
         A133BarCodReoV = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoV"))) ;
         A131BarCodParV = httpContext.GetPar( "BarCodParV") ;
         A195BarOrdLinV = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLinV"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A602MaqCod, A558HisProFec, A561HisProLin, A402EmprCodVir, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARTES PRODUCCION", ""), (short)(0)) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public tparpro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tparpro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparpro_impl.class ));
   }

   public tparpro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPARPRO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFec_Internalname, localUtil.format(A558HisProFec, "99/99/99"), localUtil.format( A558HisProFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFec_Jsonclick, 0, "", "", "", "", "", 1, edtHisProFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPARPRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPARPRO.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProULin_Internalname, GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A567HisProULin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A567HisProULin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProULin_Jsonclick, 0, "", "", "", "", "", 1, edtHisProULin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "TotUni", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotUni_Internalname, GXutil.ltrim( localUtil.ntoc( A839TotUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotUni_Enabled!=0) ? localUtil.format( A839TotUni, "ZZZZZ9.99") : localUtil.format( A839TotUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotUni_Jsonclick, 0, "", "", "", "", "", 1, edtTotUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "EmprCodVir", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodVir_Internalname, GXutil.rtrim( A402EmprCodVir), GXutil.rtrim( localUtil.format( A402EmprCodVir, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodVir_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCodVir_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPARPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount59 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_59 = (short)(1) ;
            scanStart5659( ) ;
            while ( RcdFound59 != 0 )
            {
               init_level_properties59( ) ;
               getByPrimaryKey5659( ) ;
               addRow5659( ) ;
               scanNext5659( ) ;
            }
            scanEnd5659( ) ;
            nBlankRcdCount59 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal5659( ) ;
         standaloneModal5659( ) ;
         sMode59 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow5659( ) ;
            edtavnRcdDeleted_59_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_59_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_59_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_59_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODVIR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodVir_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodReoV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREOV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReoV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReoV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodParV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPARV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodParV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodParV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtGruOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRUOPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGruOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarOrdLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLINV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLinV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASEST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasEst_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCodFas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODFAS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodFas_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtFase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROUNI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProUni_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProTur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTUR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProTur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProHin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROHIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProHin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProHfi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROHFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProHfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHfi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProMfi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProMfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMfi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtParCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProTre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProTre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProTte_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTTE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProTte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTte_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisBarTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISBARTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisBarTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROEST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProEst_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProKgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKGR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProKgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarMla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMLA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarKla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKLA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROLOT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLot_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProTc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProBot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROBOT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBot_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProNPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProNPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProNpzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONPZS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProNpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDisUniMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISUNIMED_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHisProBan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROBAN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBan_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_59 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal5659( ) ;
            }
            sendRow5659( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount59 = (short)(5) ;
         nRcdExists_59 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart5659( ) ;
            while ( RcdFound59 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5559( ) ;
               init_level_properties59( ) ;
               standaloneNotModal5659( ) ;
               getByPrimaryKey5659( ) ;
               standaloneModal5659( ) ;
               addRow5659( ) ;
               scanNext5659( ) ;
            }
            scanEnd5659( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode59 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_5559( ) ;
      initAll5659( ) ;
      init_level_properties59( ) ;
      nRcdExists_59 = (short)(0) ;
      nIsMod_59 = (short)(0) ;
      nRcdDeleted_59 = (short)(0) ;
      nBlankRcdCount59 = (short)(nBlankRcdUsr59+nBlankRcdCount59) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount59 > 0 )
      {
         standaloneNotModal5659( ) ;
         standaloneModal5659( ) ;
         addRow5659( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHisProLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount59 = (short)(nBlankRcdCount59-1) ;
      }
      Gx_mode = sMode59 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPARPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPARPRO.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z558HisProFec = localUtil.ctod( httpContext.cgiGet( "Z558HisProFec"), 0) ;
         Z567HisProULin = (int)(localUtil.ctol( httpContext.cgiGet( "Z567HisProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPROFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A558HisProFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         }
         else
         {
            A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A567HisProULin = 0 ;
            n567HisProULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
         }
         else
         {
            A567HisProULin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n567HisProULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A839TotUni = localUtil.ctond( httpContext.cgiGet( edtTotUni_Internalname)) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
         A402EmprCodVir = GXutil.upper( httpContext.cgiGet( edtEmprCodVir_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
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
            initAll5658( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_59_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_59_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes5658( ) ;
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

   public void confirm_560( )
   {
      beforeValidate5658( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls5658( ) ;
         }
         else
         {
            checkExtendedTable5658( ) ;
            if ( AnyError == 0 )
            {
               zm5658( 14) ;
               zm5658( 15) ;
               zm5658( 16) ;
            }
            closeExtendedTableCursors5658( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode58 = Gx_mode ;
         confirm_5659( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode58 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode58 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues560( ) ;
      }
   }

   public void confirm_5659( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow5659( ) ;
         if ( ( nRcdExists_59 != 0 ) || ( nIsMod_59 != 0 ) )
         {
            getKey5659( ) ;
            if ( ( nRcdExists_59 == 0 ) && ( nRcdDeleted_59 == 0 ) )
            {
               if ( RcdFound59 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate5659( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable5659( ) ;
                     if ( AnyError == 0 )
                     {
                        zm5659( 18) ;
                        zm5659( 19) ;
                        zm5659( 20) ;
                        zm5659( 21) ;
                        zm5659( 22) ;
                        zm5659( 23) ;
                        zm5659( 24) ;
                        zm5659( 25) ;
                     }
                     closeExtendedTableCursors5659( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HISPROLIN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHisProLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound59 != 0 )
               {
                  if ( nRcdDeleted_59 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey5659( ) ;
                     load5659( ) ;
                     beforeValidate5659( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls5659( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_59 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate5659( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable5659( ) ;
                           if ( AnyError == 0 )
                           {
                              zm5659( 18) ;
                              zm5659( 19) ;
                              zm5659( 20) ;
                              zm5659( 21) ;
                              zm5659( 22) ;
                              zm5659( 23) ;
                              zm5659( 24) ;
                              zm5659( 25) ;
                           }
                           closeExtendedTableCursors5659( ) ;
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
                  if ( nRcdDeleted_59 == 0 )
                  {
                     GXCCtl = "HISPROLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_59_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodVir_Internalname, GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReoV_Internalname, GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarCodParV_Internalname, GXutil.rtrim( A131BarCodParV)) ;
         httpContext.changePostValue( edtGruOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodFas_Internalname, GXutil.rtrim( A307CodFas)) ;
         httpContext.changePostValue( edtFase_Internalname, GXutil.rtrim( A461Fase)) ;
         httpContext.changePostValue( edtHisProUni_Internalname, GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTur_Internalname, GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProHin_Internalname, GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMin_Internalname, GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProHfi_Internalname, GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMfi_Internalname, GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProF_Internalname, GXutil.rtrim( A557HisProF)) ;
         httpContext.changePostValue( edtParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTre_Internalname, GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTte_Internalname, GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisBarTip_Internalname, GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTip_Internalname, GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProCod_Internalname, GXutil.rtrim( A2504HisProCod)) ;
         httpContext.changePostValue( edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProLot_Internalname, GXutil.rtrim( A3610HisProLot)) ;
         httpContext.changePostValue( edtHisProTc_Internalname, GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProNPar_Internalname, GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProNpzs_Internalname, GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed)) ;
         httpContext.changePostValue( edtHisProBan_Internalname, GXutil.rtrim( A5339HisProBan)) ;
         httpContext.changePostValue( "ZT_"+"Z561HisProLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z461Fase_"+sGXsfl_55_idx, GXutil.rtrim( Z461Fase)) ;
         httpContext.changePostValue( "ZT_"+"Z568HisProUni_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z566HisProTur_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z560HisProHin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z563HisProMin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z559HisProHfi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z562HisProMfi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z557HisProF_"+sGXsfl_55_idx, GXutil.rtrim( Z557HisProF)) ;
         httpContext.changePostValue( "ZT_"+"Z565HisProTte_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z543HisBarTip_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z556HisProEst_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1525HisProKgr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1526HisProMtr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2247HisProTip_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2504HisProCod_"+sGXsfl_55_idx, GXutil.rtrim( Z2504HisProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3610HisProLot_"+sGXsfl_55_idx, GXutil.rtrim( Z3610HisProLot)) ;
         httpContext.changePostValue( "ZT_"+"Z3611HisProTc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3612HisProReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4439HisProBot_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4704HisProNPar_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4714HisProNpzs_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5339HisProBan_"+sGXsfl_55_idx, GXutil.rtrim( Z5339HisProBan)) ;
         httpContext.changePostValue( "ZT_"+"Z503GruOpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z656ParCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_59 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_59_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_59_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODVIR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREOV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReoV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPARV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodParV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRUOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLINV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODFAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodFas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROUNI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTUR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROHIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROHFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHfi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMfi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTTE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTte_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISBARTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisBarTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROLOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROBOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONPZS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISUNIMED_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROBAN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T005615 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A839TotUni = T005615_A839TotUni[0] ;
         n839TotUni = T005615_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      else
      {
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      /* End of After( level) rules */
   }

   public void resetCaption560( )
   {
   }

   public void zm5658( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z567HisProULin = T005617_A567HisProULin[0] ;
         }
         else
         {
            Z567HisProULin = A567HisProULin ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z558HisProFec = A558HisProFec ;
         Z567HisProULin = A567HisProULin ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z839TotUni = A839TotUni ;
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

   public void load5658( )
   {
      /* Using cursor T005621 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A567HisProULin = T005621_A567HisProULin[0] ;
         n567HisProULin = T005621_n567HisProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
         A407EmprNom = T005621_A407EmprNom[0] ;
         n407EmprNom = T005621_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A839TotUni = T005621_A839TotUni[0] ;
         n839TotUni = T005621_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
         zm5658( -13) ;
      }
      pr_default.close(14);
      onLoadActions5658( ) ;
   }

   public void onLoadActions5658( )
   {
      A402EmprCodVir = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
   }

   public void checkExtendedTable5658( )
   {
      nIsDirty_58 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T005618 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T005618_A407EmprNom[0] ;
      n407EmprNom = T005618_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      nIsDirty_58 = (short)(1) ;
      A402EmprCodVir = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
      /* Using cursor T005619 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      /* Using cursor T005615 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A839TotUni = T005615_A839TotUni[0] ;
         n839TotUni = T005615_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      else
      {
         nIsDirty_58 = (short)(1) ;
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors5658( )
   {
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod )
   {
      /* Using cursor T005622 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T005622_A407EmprNom[0] ;
      n407EmprNom = T005622_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_15( String A396EmprCod ,
                          String A602MaqCod )
   {
      /* Using cursor T005623 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_16( String A396EmprCod ,
                          String A602MaqCod ,
                          java.util.Date A558HisProFec )
   {
      /* Using cursor T005625 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A839TotUni = T005625_A839TotUni[0] ;
         n839TotUni = T005625_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      else
      {
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A839TotUni, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey5658( )
   {
      /* Using cursor T005626 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound58 = (short)(1) ;
      }
      else
      {
         RcdFound58 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T005617 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(11) != 101) )
      {
         zm5658( 13) ;
         RcdFound58 = (short)(1) ;
         A558HisProFec = T005617_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A567HisProULin = T005617_A567HisProULin[0] ;
         n567HisProULin = T005617_n567HisProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
         A396EmprCod = T005617_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T005617_A602MaqCod[0] ;
         n602MaqCod = T005617_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load5658( ) ;
         if ( AnyError == 1 )
         {
            RcdFound58 = (short)(0) ;
            initializeNonKey5658( ) ;
         }
         Gx_mode = sMode58 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound58 = (short)(0) ;
         initializeNonKey5658( ) ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode58 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKey5658( ) ;
      if ( RcdFound58 == 0 )
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
      RcdFound58 = (short)(0) ;
      /* Using cursor T005627 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, A558HisProFec});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T005627_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T005627_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T005627_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T005627_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T005627_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T005627_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T005627_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            A396EmprCod = T005627_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T005627_A602MaqCod[0] ;
            n602MaqCod = T005627_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T005627_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound58 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound58 = (short)(0) ;
      /* Using cursor T005628 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, A558HisProFec});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T005628_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T005628_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T005628_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T005628_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T005628_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T005628_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T005628_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            A396EmprCod = T005628_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T005628_A602MaqCod[0] ;
            n602MaqCod = T005628_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T005628_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound58 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey5658( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert5658( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound58 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A558HisProFec = Z558HisProFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
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
               update5658( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert5658( ) ;
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
                  insert5658( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = Z558HisProFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
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
      getKey5658( ) ;
      if ( RcdFound58 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = Z558HisProFec ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tparpro");
      GX_FocusControl = edtHisProULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_560( ) ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHisProULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart5658( ) ;
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd5658( ) ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProULin_Internalname ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProULin_Internalname ;
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
      scanStart5658( ) ;
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound58 != 0 )
         {
            scanNext5658( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd5658( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency5658( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T005616 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCHIPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(10) == 101) || ( Z567HisProULin != T005616_A567HisProULin[0] ) )
         {
            if ( Z567HisProULin != T005616_A567HisProULin[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProULin");
               GXutil.writeLogRaw("Old: ",Z567HisProULin);
               GXutil.writeLogRaw("Current: ",T005616_A567HisProULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCHIPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5658( )
   {
      beforeValidate5658( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5658( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5658( 0) ;
         checkOptimisticConcurrency5658( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5658( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5658( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005629 */
                  pr_default.execute(21, new Object[] {A558HisProFec, Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
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
                        processLevel5658( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption560( ) ;
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
            load5658( ) ;
         }
         endLevel5658( ) ;
      }
      closeExtendedTableCursors5658( ) ;
   }

   public void update5658( )
   {
      beforeValidate5658( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5658( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5658( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5658( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate5658( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005630 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCHIPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate5658( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel5658( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption560( ) ;
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
         endLevel5658( ) ;
      }
      closeExtendedTableCursors5658( ) ;
   }

   public void deferredUpdate5658( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate5658( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5658( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5658( ) ;
         afterConfirm5658( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5658( ) ;
            if ( AnyError == 0 )
            {
               scanStart5659( ) ;
               while ( RcdFound59 != 0 )
               {
                  getByPrimaryKey5659( ) ;
                  delete5659( ) ;
                  scanNext5659( ) ;
               }
               scanEnd5659( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005631 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound58 == 0 )
                        {
                           initAll5658( ) ;
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
                        resetCaption560( ) ;
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
      sMode58 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5658( ) ;
      Gx_mode = sMode58 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5658( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T005632 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         A407EmprNom = T005632_A407EmprNom[0] ;
         n407EmprNom = T005632_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(24);
         A402EmprCodVir = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
         /* Using cursor T005634 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A839TotUni = T005634_A839TotUni[0] ;
            n839TotUni = T005634_n839TotUni[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
         }
         else
         {
            A839TotUni = DecimalUtil.doubleToDec(0) ;
            n839TotUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
         }
         pr_default.close(25);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T005635 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Histórico de parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel5659( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow5659( ) ;
         if ( ( nRcdExists_59 != 0 ) || ( nIsMod_59 != 0 ) )
         {
            standaloneNotModal5659( ) ;
            getKey5659( ) ;
            if ( ( nRcdExists_59 == 0 ) && ( nRcdDeleted_59 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert5659( ) ;
            }
            else
            {
               if ( RcdFound59 != 0 )
               {
                  if ( ( nRcdDeleted_59 != 0 ) && ( nRcdExists_59 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete5659( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_59 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update5659( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_59 == 0 )
                  {
                     GXCCtl = "HISPROLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_59_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodVir_Internalname, GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReoV_Internalname, GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarCodParV_Internalname, GXutil.rtrim( A131BarCodParV)) ;
         httpContext.changePostValue( edtGruOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarOrdLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodFas_Internalname, GXutil.rtrim( A307CodFas)) ;
         httpContext.changePostValue( edtFase_Internalname, GXutil.rtrim( A461Fase)) ;
         httpContext.changePostValue( edtHisProUni_Internalname, GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTur_Internalname, GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProHin_Internalname, GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMin_Internalname, GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProHfi_Internalname, GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMfi_Internalname, GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProF_Internalname, GXutil.rtrim( A557HisProF)) ;
         httpContext.changePostValue( edtParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTre_Internalname, GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTte_Internalname, GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisBarTip_Internalname, GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProTip_Internalname, GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProCod_Internalname, GXutil.rtrim( A2504HisProCod)) ;
         httpContext.changePostValue( edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProLot_Internalname, GXutil.rtrim( A3610HisProLot)) ;
         httpContext.changePostValue( edtHisProTc_Internalname, GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProNPar_Internalname, GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProNpzs_Internalname, GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed)) ;
         httpContext.changePostValue( edtHisProBan_Internalname, GXutil.rtrim( A5339HisProBan)) ;
         httpContext.changePostValue( "ZT_"+"Z561HisProLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z461Fase_"+sGXsfl_55_idx, GXutil.rtrim( Z461Fase)) ;
         httpContext.changePostValue( "ZT_"+"Z568HisProUni_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z566HisProTur_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z560HisProHin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z563HisProMin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z559HisProHfi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z562HisProMfi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z557HisProF_"+sGXsfl_55_idx, GXutil.rtrim( Z557HisProF)) ;
         httpContext.changePostValue( "ZT_"+"Z565HisProTte_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z543HisBarTip_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z556HisProEst_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1525HisProKgr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1526HisProMtr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2247HisProTip_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2504HisProCod_"+sGXsfl_55_idx, GXutil.rtrim( Z2504HisProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3610HisProLot_"+sGXsfl_55_idx, GXutil.rtrim( Z3610HisProLot)) ;
         httpContext.changePostValue( "ZT_"+"Z3611HisProTc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3612HisProReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4439HisProBot_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4704HisProNPar_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4714HisProNpzs_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5339HisProBan_"+sGXsfl_55_idx, GXutil.rtrim( Z5339HisProBan)) ;
         httpContext.changePostValue( "ZT_"+"Z503GruOpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z656ParCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_59_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_59 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_59_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_59_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODVIR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREOV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReoV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPARV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodParV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRUOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARORDLINV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODFAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodFas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROUNI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTUR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROHIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROHFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHfi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMfi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTTE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTte_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISBARTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisBarTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROLOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROTC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROBOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONPZS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISUNIMED_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROBAN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T005634 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A839TotUni = T005634_A839TotUni[0] ;
         n839TotUni = T005634_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      else
      {
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      /* End of After( level) rules */
      initAll5659( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_59 = (short)(0) ;
      nIsMod_59 = (short)(0) ;
      nRcdDeleted_59 = (short)(0) ;
   }

   public void processLevel5658( )
   {
      /* Save parent mode. */
      sMode58 = Gx_mode ;
      processNestedLevel5659( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode58 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel5658( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeComplete5658( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tparpro");
         if ( AnyError == 0 )
         {
            confirmValues560( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tparpro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart5658( )
   {
      /* Using cursor T005636 */
      pr_default.execute(27);
      RcdFound58 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A396EmprCod = T005636_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T005636_A602MaqCod[0] ;
         n602MaqCod = T005636_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T005636_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5658( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound58 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A396EmprCod = T005636_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T005636_A602MaqCod[0] ;
         n602MaqCod = T005636_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T005636_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      }
   }

   public void scanEnd5658( )
   {
      pr_default.close(27);
   }

   public void afterConfirm5658( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert5658( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5658( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5658( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5658( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5658( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5658( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtHisProFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Enabled), 5, 0), true);
      edtHisProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProULin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTotUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotUni_Enabled), 5, 0), true);
      edtEmprCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodVir_Enabled), 5, 0), true);
   }

   public void zm5659( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z194BarOrdLin = T00563_A194BarOrdLin[0] ;
            Z461Fase = T00563_A461Fase[0] ;
            Z568HisProUni = T00563_A568HisProUni[0] ;
            Z566HisProTur = T00563_A566HisProTur[0] ;
            Z560HisProHin = T00563_A560HisProHin[0] ;
            Z563HisProMin = T00563_A563HisProMin[0] ;
            Z559HisProHfi = T00563_A559HisProHfi[0] ;
            Z562HisProMfi = T00563_A562HisProMfi[0] ;
            Z557HisProF = T00563_A557HisProF[0] ;
            Z565HisProTte = T00563_A565HisProTte[0] ;
            Z543HisBarTip = T00563_A543HisBarTip[0] ;
            Z556HisProEst = T00563_A556HisProEst[0] ;
            Z1525HisProKgr = T00563_A1525HisProKgr[0] ;
            Z1526HisProMtr = T00563_A1526HisProMtr[0] ;
            Z2247HisProTip = T00563_A2247HisProTip[0] ;
            Z2504HisProCod = T00563_A2504HisProCod[0] ;
            Z3610HisProLot = T00563_A3610HisProLot[0] ;
            Z3611HisProTc = T00563_A3611HisProTc[0] ;
            Z3612HisProReo = T00563_A3612HisProReo[0] ;
            Z4439HisProBot = T00563_A4439HisProBot[0] ;
            Z4704HisProNPar = T00563_A4704HisProNPar[0] ;
            Z4714HisProNpzs = T00563_A4714HisProNpzs[0] ;
            Z5339HisProBan = T00563_A5339HisProBan[0] ;
            Z503GruOpeCod = T00563_A503GruOpeCod[0] ;
            Z129BarCod = T00563_A129BarCod[0] ;
            Z132BarCodReo = T00563_A132BarCodReo[0] ;
            Z130BarCodPar = T00563_A130BarCodPar[0] ;
            Z656ParCod = T00563_A656ParCod[0] ;
         }
         else
         {
            Z194BarOrdLin = A194BarOrdLin ;
            Z461Fase = A461Fase ;
            Z568HisProUni = A568HisProUni ;
            Z566HisProTur = A566HisProTur ;
            Z560HisProHin = A560HisProHin ;
            Z563HisProMin = A563HisProMin ;
            Z559HisProHfi = A559HisProHfi ;
            Z562HisProMfi = A562HisProMfi ;
            Z557HisProF = A557HisProF ;
            Z565HisProTte = A565HisProTte ;
            Z543HisBarTip = A543HisBarTip ;
            Z556HisProEst = A556HisProEst ;
            Z1525HisProKgr = A1525HisProKgr ;
            Z1526HisProMtr = A1526HisProMtr ;
            Z2247HisProTip = A2247HisProTip ;
            Z2504HisProCod = A2504HisProCod ;
            Z3610HisProLot = A3610HisProLot ;
            Z3611HisProTc = A3611HisProTc ;
            Z3612HisProReo = A3612HisProReo ;
            Z4439HisProBot = A4439HisProBot ;
            Z4704HisProNPar = A4704HisProNPar ;
            Z4714HisProNpzs = A4714HisProNpzs ;
            Z5339HisProBan = A5339HisProBan ;
            Z503GruOpeCod = A503GruOpeCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z656ParCod = A656ParCod ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z602MaqCod = A602MaqCod ;
         Z561HisProLin = A561HisProLin ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z461Fase = A461Fase ;
         Z568HisProUni = A568HisProUni ;
         Z566HisProTur = A566HisProTur ;
         Z560HisProHin = A560HisProHin ;
         Z563HisProMin = A563HisProMin ;
         Z559HisProHfi = A559HisProHfi ;
         Z562HisProMfi = A562HisProMfi ;
         Z557HisProF = A557HisProF ;
         Z565HisProTte = A565HisProTte ;
         Z543HisBarTip = A543HisBarTip ;
         Z556HisProEst = A556HisProEst ;
         Z1525HisProKgr = A1525HisProKgr ;
         Z1526HisProMtr = A1526HisProMtr ;
         Z2247HisProTip = A2247HisProTip ;
         Z2504HisProCod = A2504HisProCod ;
         Z3610HisProLot = A3610HisProLot ;
         Z3611HisProTc = A3611HisProTc ;
         Z3612HisProReo = A3612HisProReo ;
         Z4439HisProBot = A4439HisProBot ;
         Z4704HisProNPar = A4704HisProNPar ;
         Z4714HisProNpzs = A4714HisProNpzs ;
         Z5339HisProBan = A5339HisProBan ;
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z656ParCod = A656ParCod ;
         Z558HisProFec = A558HisProFec ;
         Z361DisCod = A361DisCod ;
         Z392DisUniMed = A392DisUniMed ;
         Z1280BarMla = A1280BarMla ;
         Z1279BarKla = A1279BarKla ;
      }
   }

   public void standaloneNotModal5659( )
   {
   }

   public void standaloneModal5659( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHisProLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtHisProLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load5659( )
   {
      /* Using cursor T005638 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Integer.valueOf(A561HisProLin), A396EmprCod, A558HisProFec});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A361DisCod = T005638_A361DisCod[0] ;
         A194BarOrdLin = T005638_A194BarOrdLin[0] ;
         A461Fase = T005638_A461Fase[0] ;
         A568HisProUni = T005638_A568HisProUni[0] ;
         A566HisProTur = T005638_A566HisProTur[0] ;
         A560HisProHin = T005638_A560HisProHin[0] ;
         A563HisProMin = T005638_A563HisProMin[0] ;
         A559HisProHfi = T005638_A559HisProHfi[0] ;
         A562HisProMfi = T005638_A562HisProMfi[0] ;
         A557HisProF = T005638_A557HisProF[0] ;
         A565HisProTte = T005638_A565HisProTte[0] ;
         A543HisBarTip = T005638_A543HisBarTip[0] ;
         A556HisProEst = T005638_A556HisProEst[0] ;
         A1525HisProKgr = T005638_A1525HisProKgr[0] ;
         A1526HisProMtr = T005638_A1526HisProMtr[0] ;
         A2247HisProTip = T005638_A2247HisProTip[0] ;
         A2504HisProCod = T005638_A2504HisProCod[0] ;
         A3610HisProLot = T005638_A3610HisProLot[0] ;
         A3611HisProTc = T005638_A3611HisProTc[0] ;
         A3612HisProReo = T005638_A3612HisProReo[0] ;
         A4439HisProBot = T005638_A4439HisProBot[0] ;
         A4704HisProNPar = T005638_A4704HisProNPar[0] ;
         A4714HisProNpzs = T005638_A4714HisProNpzs[0] ;
         A392DisUniMed = T005638_A392DisUniMed[0] ;
         A5339HisProBan = T005638_A5339HisProBan[0] ;
         A503GruOpeCod = T005638_A503GruOpeCod[0] ;
         A129BarCod = T005638_A129BarCod[0] ;
         n129BarCod = T005638_n129BarCod[0] ;
         A132BarCodReo = T005638_A132BarCodReo[0] ;
         n132BarCodReo = T005638_n132BarCodReo[0] ;
         A130BarCodPar = T005638_A130BarCodPar[0] ;
         n130BarCodPar = T005638_n130BarCodPar[0] ;
         A656ParCod = T005638_A656ParCod[0] ;
         n656ParCod = T005638_n656ParCod[0] ;
         A1280BarMla = T005638_A1280BarMla[0] ;
         A1279BarKla = T005638_A1279BarKla[0] ;
         zm5659( -17) ;
      }
      pr_default.close(28);
      onLoadActions5659( ) ;
   }

   public void onLoadActions5659( )
   {
      A134BarCodVir = A129BarCod ;
      A133BarCodReoV = A132BarCodReo ;
      A131BarCodParV = A130BarCodPar ;
      A195BarOrdLinV = A194BarOrdLin ;
      /* Using cursor T00569 */
      pr_default.execute(6, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A462FasEst = T00569_A462FasEst[0] ;
         n462FasEst = T00569_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      pr_default.close(6);
      /* Using cursor T005611 */
      pr_default.execute(7, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A307CodFas = T005611_A307CodFas[0] ;
         n307CodFas = T005611_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      pr_default.close(7);
      if ( A560HisProHin <= A559HisProHfi )
      {
         A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
      }
      else
      {
         A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
      }
   }

   public void checkExtendedTable5659( )
   {
      nIsDirty_59 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal5659( ) ;
      /* Using cursor T00564 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "GRUOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGruOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T00565 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00565_A361DisCod[0] ;
      pr_default.close(3);
      /* Using cursor T00566 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            GXCCtl = "PARCOD_" + sGXsfl_55_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(4);
      /* Using cursor T00567 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T00567_A392DisUniMed[0] ;
      pr_default.close(5);
      /* Using cursor T005613 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A1280BarMla = T005613_A1280BarMla[0] ;
         A1279BarKla = T005613_A1279BarKla[0] ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         nIsDirty_59 = (short)(1) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(8);
      nIsDirty_59 = (short)(1) ;
      A134BarCodVir = A129BarCod ;
      nIsDirty_59 = (short)(1) ;
      A133BarCodReoV = A132BarCodReo ;
      nIsDirty_59 = (short)(1) ;
      A131BarCodParV = A130BarCodPar ;
      nIsDirty_59 = (short)(1) ;
      A195BarOrdLinV = A194BarOrdLin ;
      /* Using cursor T00569 */
      pr_default.execute(6, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A462FasEst = T00569_A462FasEst[0] ;
         n462FasEst = T00569_n462FasEst[0] ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      pr_default.close(6);
      /* Using cursor T005611 */
      pr_default.execute(7, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A307CodFas = T005611_A307CodFas[0] ;
         n307CodFas = T005611_n307CodFas[0] ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      pr_default.close(7);
      if ( ! ( ( ( A560HisProHin >= 0 ) && ( A560HisProHin <= 23 ) ) ) )
      {
         GXCCtl = "HISPROHIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hh Inicio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A560HisProHin <= A559HisProHfi )
      {
         nIsDirty_59 = (short)(1) ;
         A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
      }
      if ( ! ( ( ( A563HisProMin >= 0 ) && ( A563HisProMin <= 59 ) ) ) )
      {
         GXCCtl = "HISPROMIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Mm Inicio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A559HisProHfi >= 0 ) && ( A559HisProHfi <= 23 ) ) ) )
      {
         GXCCtl = "HISPROHFI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hh Fin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A562HisProMfi >= 0 ) && ( A562HisProMfi <= 59 ) ) ) )
      {
         GXCCtl = "HISPROMFI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Mm Fin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A557HisProF, "N") == 0 ) || ( GXutil.strcmp(A557HisProF, "S") == 0 ) ) )
      {
         GXCCtl = "HISPROF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "HisProF", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A543HisBarTip == 0 ) || ( A543HisBarTip == 1 ) || ( A543HisBarTip == 2 ) ) )
      {
         GXCCtl = "HISBARTIP_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisBarTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors5659( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable5659( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          int A503GruOpeCod )
   {
      /* Using cursor T005639 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "GRUOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGruOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void gxload_19( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T005640 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T005640_A361DisCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_20( String A396EmprCod ,
                          short A656ParCod )
   {
      /* Using cursor T005641 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            GXCCtl = "PARCOD_" + sGXsfl_55_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void gxload_21( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T005642 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T005642_A392DisUniMed[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void gxload_24( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T005644 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A1280BarMla = T005644_A1280BarMla[0] ;
         A1279BarKla = T005644_A1279BarKla[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(33) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void gxload_22( String A602MaqCod ,
                          String A402EmprCodVir ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T005646 */
      pr_default.execute(34, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(34) != 101) )
      {
         A462FasEst = T005646_A462FasEst[0] ;
         n462FasEst = T005646_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(34) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(34);
   }

   public void gxload_23( String A602MaqCod ,
                          java.util.Date A558HisProFec ,
                          int A561HisProLin ,
                          String A402EmprCodVir ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T005648 */
      pr_default.execute(35, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A307CodFas = T005648_A307CodFas[0] ;
         n307CodFas = T005648_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A307CodFas))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void getKey5659( )
   {
      /* Using cursor T005649 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound59 = (short)(1) ;
      }
      else
      {
         RcdFound59 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey5659( )
   {
      /* Using cursor T00563 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm5659( 17) ;
         RcdFound59 = (short)(1) ;
         initializeNonKey5659( ) ;
         A561HisProLin = T00563_A561HisProLin[0] ;
         A194BarOrdLin = T00563_A194BarOrdLin[0] ;
         A461Fase = T00563_A461Fase[0] ;
         A568HisProUni = T00563_A568HisProUni[0] ;
         A566HisProTur = T00563_A566HisProTur[0] ;
         A560HisProHin = T00563_A560HisProHin[0] ;
         A563HisProMin = T00563_A563HisProMin[0] ;
         A559HisProHfi = T00563_A559HisProHfi[0] ;
         A562HisProMfi = T00563_A562HisProMfi[0] ;
         A557HisProF = T00563_A557HisProF[0] ;
         A565HisProTte = T00563_A565HisProTte[0] ;
         A543HisBarTip = T00563_A543HisBarTip[0] ;
         A556HisProEst = T00563_A556HisProEst[0] ;
         A1525HisProKgr = T00563_A1525HisProKgr[0] ;
         A1526HisProMtr = T00563_A1526HisProMtr[0] ;
         A2247HisProTip = T00563_A2247HisProTip[0] ;
         A2504HisProCod = T00563_A2504HisProCod[0] ;
         A3610HisProLot = T00563_A3610HisProLot[0] ;
         A3611HisProTc = T00563_A3611HisProTc[0] ;
         A3612HisProReo = T00563_A3612HisProReo[0] ;
         A4439HisProBot = T00563_A4439HisProBot[0] ;
         A4704HisProNPar = T00563_A4704HisProNPar[0] ;
         A4714HisProNpzs = T00563_A4714HisProNpzs[0] ;
         A5339HisProBan = T00563_A5339HisProBan[0] ;
         A503GruOpeCod = T00563_A503GruOpeCod[0] ;
         A129BarCod = T00563_A129BarCod[0] ;
         n129BarCod = T00563_n129BarCod[0] ;
         A132BarCodReo = T00563_A132BarCodReo[0] ;
         n132BarCodReo = T00563_n132BarCodReo[0] ;
         A130BarCodPar = T00563_A130BarCodPar[0] ;
         n130BarCodPar = T00563_n130BarCodPar[0] ;
         A656ParCod = T00563_A656ParCod[0] ;
         n656ParCod = T00563_n656ParCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal5659( ) ;
         load5659( ) ;
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound59 = (short)(0) ;
         initializeNonKey5659( ) ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal5659( ) ;
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes5659( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency5659( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00562 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z194BarOrdLin != T00562_A194BarOrdLin[0] ) || ( GXutil.strcmp(Z461Fase, T00562_A461Fase[0]) != 0 ) || ( DecimalUtil.compareTo(Z568HisProUni, T00562_A568HisProUni[0]) != 0 ) || ( Z566HisProTur != T00562_A566HisProTur[0] ) || ( Z560HisProHin != T00562_A560HisProHin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z563HisProMin != T00562_A563HisProMin[0] ) || ( Z559HisProHfi != T00562_A559HisProHfi[0] ) || ( Z562HisProMfi != T00562_A562HisProMfi[0] ) || ( GXutil.strcmp(Z557HisProF, T00562_A557HisProF[0]) != 0 ) || ( Z565HisProTte != T00562_A565HisProTte[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z543HisBarTip != T00562_A543HisBarTip[0] ) || ( Z556HisProEst != T00562_A556HisProEst[0] ) || ( DecimalUtil.compareTo(Z1525HisProKgr, T00562_A1525HisProKgr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1526HisProMtr, T00562_A1526HisProMtr[0]) != 0 ) || ( Z2247HisProTip != T00562_A2247HisProTip[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2504HisProCod, T00562_A2504HisProCod[0]) != 0 ) || ( GXutil.strcmp(Z3610HisProLot, T00562_A3610HisProLot[0]) != 0 ) || ( Z3611HisProTc != T00562_A3611HisProTc[0] ) || ( Z3612HisProReo != T00562_A3612HisProReo[0] ) || ( Z4439HisProBot != T00562_A4439HisProBot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4704HisProNPar != T00562_A4704HisProNPar[0] ) || ( Z4714HisProNpzs != T00562_A4714HisProNpzs[0] ) || ( GXutil.strcmp(Z5339HisProBan, T00562_A5339HisProBan[0]) != 0 ) || ( Z503GruOpeCod != T00562_A503GruOpeCod[0] ) || ( Z129BarCod != T00562_A129BarCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z132BarCodReo != T00562_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00562_A130BarCodPar[0]) != 0 ) || ( Z656ParCod != T00562_A656ParCod[0] ) )
         {
            if ( Z194BarOrdLin != T00562_A194BarOrdLin[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"BarOrdLin");
               GXutil.writeLogRaw("Old: ",Z194BarOrdLin);
               GXutil.writeLogRaw("Current: ",T00562_A194BarOrdLin[0]);
            }
            if ( GXutil.strcmp(Z461Fase, T00562_A461Fase[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"Fase");
               GXutil.writeLogRaw("Old: ",Z461Fase);
               GXutil.writeLogRaw("Current: ",T00562_A461Fase[0]);
            }
            if ( DecimalUtil.compareTo(Z568HisProUni, T00562_A568HisProUni[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProUni");
               GXutil.writeLogRaw("Old: ",Z568HisProUni);
               GXutil.writeLogRaw("Current: ",T00562_A568HisProUni[0]);
            }
            if ( Z566HisProTur != T00562_A566HisProTur[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProTur");
               GXutil.writeLogRaw("Old: ",Z566HisProTur);
               GXutil.writeLogRaw("Current: ",T00562_A566HisProTur[0]);
            }
            if ( Z560HisProHin != T00562_A560HisProHin[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProHin");
               GXutil.writeLogRaw("Old: ",Z560HisProHin);
               GXutil.writeLogRaw("Current: ",T00562_A560HisProHin[0]);
            }
            if ( Z563HisProMin != T00562_A563HisProMin[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProMin");
               GXutil.writeLogRaw("Old: ",Z563HisProMin);
               GXutil.writeLogRaw("Current: ",T00562_A563HisProMin[0]);
            }
            if ( Z559HisProHfi != T00562_A559HisProHfi[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProHfi");
               GXutil.writeLogRaw("Old: ",Z559HisProHfi);
               GXutil.writeLogRaw("Current: ",T00562_A559HisProHfi[0]);
            }
            if ( Z562HisProMfi != T00562_A562HisProMfi[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProMfi");
               GXutil.writeLogRaw("Old: ",Z562HisProMfi);
               GXutil.writeLogRaw("Current: ",T00562_A562HisProMfi[0]);
            }
            if ( GXutil.strcmp(Z557HisProF, T00562_A557HisProF[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProF");
               GXutil.writeLogRaw("Old: ",Z557HisProF);
               GXutil.writeLogRaw("Current: ",T00562_A557HisProF[0]);
            }
            if ( Z565HisProTte != T00562_A565HisProTte[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProTte");
               GXutil.writeLogRaw("Old: ",Z565HisProTte);
               GXutil.writeLogRaw("Current: ",T00562_A565HisProTte[0]);
            }
            if ( Z543HisBarTip != T00562_A543HisBarTip[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisBarTip");
               GXutil.writeLogRaw("Old: ",Z543HisBarTip);
               GXutil.writeLogRaw("Current: ",T00562_A543HisBarTip[0]);
            }
            if ( Z556HisProEst != T00562_A556HisProEst[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProEst");
               GXutil.writeLogRaw("Old: ",Z556HisProEst);
               GXutil.writeLogRaw("Current: ",T00562_A556HisProEst[0]);
            }
            if ( DecimalUtil.compareTo(Z1525HisProKgr, T00562_A1525HisProKgr[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProKgr");
               GXutil.writeLogRaw("Old: ",Z1525HisProKgr);
               GXutil.writeLogRaw("Current: ",T00562_A1525HisProKgr[0]);
            }
            if ( DecimalUtil.compareTo(Z1526HisProMtr, T00562_A1526HisProMtr[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProMtr");
               GXutil.writeLogRaw("Old: ",Z1526HisProMtr);
               GXutil.writeLogRaw("Current: ",T00562_A1526HisProMtr[0]);
            }
            if ( Z2247HisProTip != T00562_A2247HisProTip[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProTip");
               GXutil.writeLogRaw("Old: ",Z2247HisProTip);
               GXutil.writeLogRaw("Current: ",T00562_A2247HisProTip[0]);
            }
            if ( GXutil.strcmp(Z2504HisProCod, T00562_A2504HisProCod[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProCod");
               GXutil.writeLogRaw("Old: ",Z2504HisProCod);
               GXutil.writeLogRaw("Current: ",T00562_A2504HisProCod[0]);
            }
            if ( GXutil.strcmp(Z3610HisProLot, T00562_A3610HisProLot[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProLot");
               GXutil.writeLogRaw("Old: ",Z3610HisProLot);
               GXutil.writeLogRaw("Current: ",T00562_A3610HisProLot[0]);
            }
            if ( Z3611HisProTc != T00562_A3611HisProTc[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProTc");
               GXutil.writeLogRaw("Old: ",Z3611HisProTc);
               GXutil.writeLogRaw("Current: ",T00562_A3611HisProTc[0]);
            }
            if ( Z3612HisProReo != T00562_A3612HisProReo[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProReo");
               GXutil.writeLogRaw("Old: ",Z3612HisProReo);
               GXutil.writeLogRaw("Current: ",T00562_A3612HisProReo[0]);
            }
            if ( Z4439HisProBot != T00562_A4439HisProBot[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProBot");
               GXutil.writeLogRaw("Old: ",Z4439HisProBot);
               GXutil.writeLogRaw("Current: ",T00562_A4439HisProBot[0]);
            }
            if ( Z4704HisProNPar != T00562_A4704HisProNPar[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProNPar");
               GXutil.writeLogRaw("Old: ",Z4704HisProNPar);
               GXutil.writeLogRaw("Current: ",T00562_A4704HisProNPar[0]);
            }
            if ( Z4714HisProNpzs != T00562_A4714HisProNpzs[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProNpzs");
               GXutil.writeLogRaw("Old: ",Z4714HisProNpzs);
               GXutil.writeLogRaw("Current: ",T00562_A4714HisProNpzs[0]);
            }
            if ( GXutil.strcmp(Z5339HisProBan, T00562_A5339HisProBan[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"HisProBan");
               GXutil.writeLogRaw("Old: ",Z5339HisProBan);
               GXutil.writeLogRaw("Current: ",T00562_A5339HisProBan[0]);
            }
            if ( Z503GruOpeCod != T00562_A503GruOpeCod[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"GruOpeCod");
               GXutil.writeLogRaw("Old: ",Z503GruOpeCod);
               GXutil.writeLogRaw("Current: ",T00562_A503GruOpeCod[0]);
            }
            if ( Z129BarCod != T00562_A129BarCod[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00562_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00562_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00562_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00562_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00562_A130BarCodPar[0]);
            }
            if ( Z656ParCod != T00562_A656ParCod[0] )
            {
               GXutil.writeLogln("tparpro:[seudo value changed for attri]"+"ParCod");
               GXutil.writeLogRaw("Old: ",Z656ParCod);
               GXutil.writeLogRaw("Current: ",T00562_A656ParCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLHIPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5659( )
   {
      beforeValidate5659( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5659( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5659( 0) ;
         checkOptimisticConcurrency5659( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5659( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5659( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005650 */
                  pr_default.execute(37, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Integer.valueOf(A561HisProLin), Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, A396EmprCod, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A558HisProFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  if ( (pr_default.getStatus(37) == 1) )
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
            load5659( ) ;
         }
         endLevel5659( ) ;
      }
      closeExtendedTableCursors5659( ) ;
   }

   public void update5659( )
   {
      beforeValidate5659( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5659( ) ;
      }
      if ( ( nIsMod_59 != 0 ) || ( nIsDirty_59 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency5659( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm5659( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate5659( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T005651 */
                     pr_default.execute(38, new Object[] {Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate5659( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey5659( ) ;
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
            endLevel5659( ) ;
         }
      }
      closeExtendedTableCursors5659( ) ;
   }

   public void deferredUpdate5659( )
   {
   }

   public void delete5659( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate5659( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5659( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5659( ) ;
         afterConfirm5659( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5659( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T005652 */
               pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
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
      sMode59 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5659( ) ;
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5659( )
   {
      standaloneModal5659( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A134BarCodVir = A129BarCod ;
         A133BarCodReoV = A132BarCodReo ;
         /* Using cursor T005653 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T005653_A361DisCod[0] ;
         pr_default.close(40);
         /* Using cursor T005654 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A392DisUniMed = T005654_A392DisUniMed[0] ;
         pr_default.close(41);
         /* Using cursor T005656 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            A1280BarMla = T005656_A1280BarMla[0] ;
            A1279BarKla = T005656_A1279BarKla[0] ;
         }
         else
         {
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
         }
         pr_default.close(42);
         A131BarCodParV = A130BarCodPar ;
         A195BarOrdLinV = A194BarOrdLin ;
         /* Using cursor T005658 */
         pr_default.execute(43, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            A462FasEst = T005658_A462FasEst[0] ;
            n462FasEst = T005658_n462FasEst[0] ;
         }
         else
         {
            A462FasEst = (byte)(3) ;
            n462FasEst = false ;
         }
         pr_default.close(43);
         /* Using cursor T005660 */
         pr_default.execute(44, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            A307CodFas = T005660_A307CodFas[0] ;
            n307CodFas = T005660_n307CodFas[0] ;
         }
         else
         {
            A307CodFas = "" ;
            n307CodFas = false ;
         }
         pr_default.close(44);
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T005661 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURAR PARAMETROS PERCHAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T005662 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS EMPAQUETAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T005663 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS CALANDRAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T005664 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA DATOS ABRIR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T005665 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T005666 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Histórico de parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
      }
   }

   public void endLevel5659( )
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

   public void scanStart5659( )
   {
      /* Scan By routine */
      /* Using cursor T005667 */
      pr_default.execute(51, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, A558HisProFec});
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A561HisProLin = T005667_A561HisProLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5659( )
   {
      /* Scan next routine */
      pr_default.readNext(51);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A561HisProLin = T005667_A561HisProLin[0] ;
      }
   }

   public void scanEnd5659( )
   {
      pr_default.close(51);
   }

   public void afterConfirm5659( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert5659( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate5659( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5659( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5659( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5659( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5659( )
   {
      edtHisProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodVir_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodReoV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReoV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReoV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodParV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodParV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodParV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtGruOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGruOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarOrdLinV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLinV_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasEst_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCodFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodFas_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProUni_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProTur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProHin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProHfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHfi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProMfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMfi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProTre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProTte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTte_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisBarTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProEst_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProKgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarMla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarKla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLot_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProTc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBot_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProNPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProNpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBan_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes5659( )
   {
   }

   public void send_integrity_lvl_hashes5658( )
   {
   }

   public void subsflControlProps_5559( )
   {
      edtavnRcdDeleted_59_Internalname = "vNRCDDELETED_59_"+sGXsfl_55_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_55_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodVir_Internalname = "BARCODVIR_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodReoV_Internalname = "BARCODREOV_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtBarCodParV_Internalname = "BARCODPARV_"+sGXsfl_55_idx ;
      edtGruOpeCod_Internalname = "GRUOPECOD_"+sGXsfl_55_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_55_idx ;
      edtBarOrdLinV_Internalname = "BARORDLINV_"+sGXsfl_55_idx ;
      edtFasEst_Internalname = "FASEST_"+sGXsfl_55_idx ;
      edtCodFas_Internalname = "CODFAS_"+sGXsfl_55_idx ;
      edtFase_Internalname = "FASE_"+sGXsfl_55_idx ;
      edtHisProUni_Internalname = "HISPROUNI_"+sGXsfl_55_idx ;
      edtHisProTur_Internalname = "HISPROTUR_"+sGXsfl_55_idx ;
      edtHisProHin_Internalname = "HISPROHIN_"+sGXsfl_55_idx ;
      edtHisProMin_Internalname = "HISPROMIN_"+sGXsfl_55_idx ;
      edtHisProHfi_Internalname = "HISPROHFI_"+sGXsfl_55_idx ;
      edtHisProMfi_Internalname = "HISPROMFI_"+sGXsfl_55_idx ;
      edtHisProF_Internalname = "HISPROF_"+sGXsfl_55_idx ;
      edtParCod_Internalname = "PARCOD_"+sGXsfl_55_idx ;
      edtHisProTre_Internalname = "HISPROTRE_"+sGXsfl_55_idx ;
      edtHisProTte_Internalname = "HISPROTTE_"+sGXsfl_55_idx ;
      edtHisBarTip_Internalname = "HISBARTIP_"+sGXsfl_55_idx ;
      edtHisProEst_Internalname = "HISPROEST_"+sGXsfl_55_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_55_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_55_idx ;
      edtHisProTip_Internalname = "HISPROTIP_"+sGXsfl_55_idx ;
      edtHisProCod_Internalname = "HISPROCOD_"+sGXsfl_55_idx ;
      edtBarMla_Internalname = "BARMLA_"+sGXsfl_55_idx ;
      edtBarKla_Internalname = "BARKLA_"+sGXsfl_55_idx ;
      edtHisProLot_Internalname = "HISPROLOT_"+sGXsfl_55_idx ;
      edtHisProTc_Internalname = "HISPROTC_"+sGXsfl_55_idx ;
      edtHisProReo_Internalname = "HISPROREO_"+sGXsfl_55_idx ;
      edtHisProBot_Internalname = "HISPROBOT_"+sGXsfl_55_idx ;
      edtHisProNPar_Internalname = "HISPRONPAR_"+sGXsfl_55_idx ;
      edtHisProNpzs_Internalname = "HISPRONPZS_"+sGXsfl_55_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_55_idx ;
      edtHisProBan_Internalname = "HISPROBAN_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_5559( )
   {
      edtavnRcdDeleted_59_Internalname = "vNRCDDELETED_59_"+sGXsfl_55_fel_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_55_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodVir_Internalname = "BARCODVIR_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodReoV_Internalname = "BARCODREOV_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtBarCodParV_Internalname = "BARCODPARV_"+sGXsfl_55_fel_idx ;
      edtGruOpeCod_Internalname = "GRUOPECOD_"+sGXsfl_55_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_55_fel_idx ;
      edtBarOrdLinV_Internalname = "BARORDLINV_"+sGXsfl_55_fel_idx ;
      edtFasEst_Internalname = "FASEST_"+sGXsfl_55_fel_idx ;
      edtCodFas_Internalname = "CODFAS_"+sGXsfl_55_fel_idx ;
      edtFase_Internalname = "FASE_"+sGXsfl_55_fel_idx ;
      edtHisProUni_Internalname = "HISPROUNI_"+sGXsfl_55_fel_idx ;
      edtHisProTur_Internalname = "HISPROTUR_"+sGXsfl_55_fel_idx ;
      edtHisProHin_Internalname = "HISPROHIN_"+sGXsfl_55_fel_idx ;
      edtHisProMin_Internalname = "HISPROMIN_"+sGXsfl_55_fel_idx ;
      edtHisProHfi_Internalname = "HISPROHFI_"+sGXsfl_55_fel_idx ;
      edtHisProMfi_Internalname = "HISPROMFI_"+sGXsfl_55_fel_idx ;
      edtHisProF_Internalname = "HISPROF_"+sGXsfl_55_fel_idx ;
      edtParCod_Internalname = "PARCOD_"+sGXsfl_55_fel_idx ;
      edtHisProTre_Internalname = "HISPROTRE_"+sGXsfl_55_fel_idx ;
      edtHisProTte_Internalname = "HISPROTTE_"+sGXsfl_55_fel_idx ;
      edtHisBarTip_Internalname = "HISBARTIP_"+sGXsfl_55_fel_idx ;
      edtHisProEst_Internalname = "HISPROEST_"+sGXsfl_55_fel_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_55_fel_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_55_fel_idx ;
      edtHisProTip_Internalname = "HISPROTIP_"+sGXsfl_55_fel_idx ;
      edtHisProCod_Internalname = "HISPROCOD_"+sGXsfl_55_fel_idx ;
      edtBarMla_Internalname = "BARMLA_"+sGXsfl_55_fel_idx ;
      edtBarKla_Internalname = "BARKLA_"+sGXsfl_55_fel_idx ;
      edtHisProLot_Internalname = "HISPROLOT_"+sGXsfl_55_fel_idx ;
      edtHisProTc_Internalname = "HISPROTC_"+sGXsfl_55_fel_idx ;
      edtHisProReo_Internalname = "HISPROREO_"+sGXsfl_55_fel_idx ;
      edtHisProBot_Internalname = "HISPROBOT_"+sGXsfl_55_fel_idx ;
      edtHisProNPar_Internalname = "HISPRONPAR_"+sGXsfl_55_fel_idx ;
      edtHisProNpzs_Internalname = "HISPRONPZS_"+sGXsfl_55_fel_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_55_fel_idx ;
      edtHisProBan_Internalname = "HISPROBAN_"+sGXsfl_55_fel_idx ;
   }

   public void addRow5659( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5559( ) ;
      sendRow5659( ) ;
   }

   public void sendRow5659( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_59_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_59_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_59), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_59), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_59_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_59_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodVir_Internalname,GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodVir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReoV_Internalname,GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodReoV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9") : localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReoV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReoV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodParV_Internalname,GXutil.rtrim( A131BarCodParV),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodParV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodParV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGruOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGruOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarOrdLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLinV_Internalname,GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarOrdLinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLinV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarOrdLinV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A462FasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A462FasEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodFas_Internalname,GXutil.rtrim( A307CodFas),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodFas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodFas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProUni_Internalname,GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProUni_Enabled!=0) ? localUtil.format( A568HisProUni, "ZZZZZ9.99") : localUtil.format( A568HisProUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProTur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9") : localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProTur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProHin_Internalname,GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProHin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProHin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProHin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMin_Internalname,GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99") : localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProMin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProHfi_Internalname,GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProHfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProHfi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProHfi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMfi_Internalname,GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProMfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99") : localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMfi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProMfi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTre_Internalname,GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProTre_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProTre_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTte_Internalname,GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProTte_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTte_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProTte_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarTip_Internalname,GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisBarTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9") : localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisBarTip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProEst_Internalname,GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProKgr_Enabled!=0) ? localUtil.format( A1525HisProKgr, "ZZZZZ9.99") : localUtil.format( A1525HisProKgr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProKgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProMtr_Enabled!=0) ? localUtil.format( A1526HisProMtr, "ZZZZZ9.99") : localUtil.format( A1526HisProMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTip_Internalname,GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProTip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProCod_Internalname,GXutil.rtrim( A2504HisProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMla_Internalname,GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMla_Enabled!=0) ? localUtil.format( A1280BarMla, "ZZZZZ9.99") : localUtil.format( A1280BarMla, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKla_Internalname,GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKla_Enabled!=0) ? localUtil.format( A1279BarKla, "ZZZZZ9.99") : localUtil.format( A1279BarKla, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLot_Internalname,GXutil.rtrim( A3610HisProLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProLot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTc_Internalname,GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProTc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProTc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProReo_Internalname,GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProBot_Internalname,GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProBot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProBot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProBot_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNPar_Internalname,GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProNPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProNPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProNPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNpzs_Internalname,GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProNpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProNpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProNpzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisUniMed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_59_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProBan_Internalname,GXutil.rtrim( A5339HisProBan),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProBan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProBan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes5659( ) ;
      GXCCtl = "Z561HisProLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z461Fase_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z461Fase));
      GXCCtl = "Z568HisProUni_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z566HisProTur_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z560HisProHin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z563HisProMin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z559HisProHfi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z562HisProMfi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z557HisProF_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z557HisProF));
      GXCCtl = "Z565HisProTte_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z543HisBarTip_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z556HisProEst_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1525HisProKgr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1526HisProMtr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2247HisProTip_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2504HisProCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2504HisProCod));
      GXCCtl = "Z3610HisProLot_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3610HisProLot));
      GXCCtl = "Z3611HisProTc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3612HisProReo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4439HisProBot_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4704HisProNPar_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4714HisProNpzs_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5339HisProBan_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5339HisProBan));
      GXCCtl = "Z503GruOpeCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z656ParCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_59_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_59_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_59_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_59, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_59_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_59_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODVIR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREOV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReoV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPARV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodParV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRUOPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLINV_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODFAS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodFas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFase_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROUNI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTUR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROHIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROHFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHfi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMfi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTTE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTte_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISBARTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisBarTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROEST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROKGR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKLA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROBOT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONPZS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROBAN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBan_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow5659( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5559( ) ;
      edtavnRcdDeleted_59_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_59_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODVIR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReoV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREOV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodParV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPARV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGruOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRUOPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarOrdLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARORDLINV_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASEST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodFas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODFAS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROUNI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProTur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTUR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProHin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROHIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProHfi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROHFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProMfi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProTre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProTte_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTTE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisBarTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISBARTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROEST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProKgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKGR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMLA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKLA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROLOT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProTc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROTC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProBot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROBOT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProNPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProNpzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONPZS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisUniMed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISUNIMED_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProBan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROBAN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_59_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_59_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_59");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_59_Internalname ;
         wbErr = true ;
         nRcdDeleted_59 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_59 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_59_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HISPROLIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProLin_Internalname ;
         wbErr = true ;
         A561HisProLin = 0 ;
      }
      else
      {
         A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
         n129BarCod = false ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
      }
      A134BarCodVir = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
         n132BarCodReo = false ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
      }
      A133BarCodReoV = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReoV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      n130BarCodPar = false ;
      A131BarCodParV = httpContext.cgiGet( edtBarCodParV_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "GRUOPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGruOpeCod_Internalname ;
         wbErr = true ;
         A503GruOpeCod = 0 ;
      }
      else
      {
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARORDLIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarOrdLin_Internalname ;
         wbErr = true ;
         A194BarOrdLin = (short)(0) ;
      }
      else
      {
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A195BarOrdLinV = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A462FasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n462FasEst = false ;
      A307CodFas = httpContext.cgiGet( edtCodFas_Internalname) ;
      n307CodFas = false ;
      A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROUNI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProUni_Internalname ;
         wbErr = true ;
         A568HisProUni = DecimalUtil.ZERO ;
      }
      else
      {
         A568HisProUni = localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HISPROTUR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProTur_Internalname ;
         wbErr = true ;
         A566HisProTur = (byte)(0) ;
      }
      else
      {
         A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISPROHIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHin_Internalname ;
         wbErr = true ;
         A560HisProHin = (byte)(0) ;
      }
      else
      {
         A560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISPROMIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMin_Internalname ;
         wbErr = true ;
         A563HisProMin = (byte)(0) ;
      }
      else
      {
         A563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISPROHFI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHfi_Internalname ;
         wbErr = true ;
         A559HisProHfi = (byte)(0) ;
      }
      else
      {
         A559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISPROMFI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMfi_Internalname ;
         wbErr = true ;
         A562HisProMfi = (byte)(0) ;
      }
      else
      {
         A562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParCod_Internalname ;
         wbErr = true ;
         A656ParCod = (short)(0) ;
         n656ParCod = false ;
      }
      else
      {
         A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n656ParCod = false ;
      }
      A564HisProTre = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTre_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISPROTTE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProTte_Internalname ;
         wbErr = true ;
         A565HisProTte = (short)(0) ;
      }
      else
      {
         A565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HISBARTIP_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisBarTip_Internalname ;
         wbErr = true ;
         A543HisBarTip = (byte)(0) ;
      }
      else
      {
         A543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HISPROEST_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProEst_Internalname ;
         wbErr = true ;
         A556HisProEst = (byte)(0) ;
      }
      else
      {
         A556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROKGR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProKgr_Internalname ;
         wbErr = true ;
         A1525HisProKgr = DecimalUtil.ZERO ;
      }
      else
      {
         A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROMTR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMtr_Internalname ;
         wbErr = true ;
         A1526HisProMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISPROTIP_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProTip_Internalname ;
         wbErr = true ;
         A2247HisProTip = (short)(0) ;
      }
      else
      {
         A2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2504HisProCod = httpContext.cgiGet( edtHisProCod_Internalname) ;
      A1280BarMla = localUtil.ctond( httpContext.cgiGet( edtBarMla_Internalname)) ;
      A1279BarKla = localUtil.ctond( httpContext.cgiGet( edtBarKla_Internalname)) ;
      A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HISPROTC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProTc_Internalname ;
         wbErr = true ;
         A3611HisProTc = (byte)(0) ;
      }
      else
      {
         A3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HISPROREO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProReo_Internalname ;
         wbErr = true ;
         A3612HisProReo = (byte)(0) ;
      }
      else
      {
         A3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HISPROBOT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProBot_Internalname ;
         wbErr = true ;
         A4439HisProBot = 0 ;
      }
      else
      {
         A4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HISPRONPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProNPar_Internalname ;
         wbErr = true ;
         A4704HisProNPar = 0 ;
      }
      else
      {
         A4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISPRONPZS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProNpzs_Internalname ;
         wbErr = true ;
         A4714HisProNpzs = (short)(0) ;
      }
      else
      {
         A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
      A5339HisProBan = httpContext.cgiGet( edtHisProBan_Internalname) ;
      GXCCtl = "Z561HisProLin_" + sGXsfl_55_idx ;
      Z561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z194BarOrdLin_" + sGXsfl_55_idx ;
      Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z461Fase_" + sGXsfl_55_idx ;
      Z461Fase = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z568HisProUni_" + sGXsfl_55_idx ;
      Z568HisProUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z566HisProTur_" + sGXsfl_55_idx ;
      Z566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z560HisProHin_" + sGXsfl_55_idx ;
      Z560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z563HisProMin_" + sGXsfl_55_idx ;
      Z563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z559HisProHfi_" + sGXsfl_55_idx ;
      Z559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z562HisProMfi_" + sGXsfl_55_idx ;
      Z562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z557HisProF_" + sGXsfl_55_idx ;
      Z557HisProF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z565HisProTte_" + sGXsfl_55_idx ;
      Z565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z543HisBarTip_" + sGXsfl_55_idx ;
      Z543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z556HisProEst_" + sGXsfl_55_idx ;
      Z556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1525HisProKgr_" + sGXsfl_55_idx ;
      Z1525HisProKgr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1526HisProMtr_" + sGXsfl_55_idx ;
      Z1526HisProMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2247HisProTip_" + sGXsfl_55_idx ;
      Z2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2504HisProCod_" + sGXsfl_55_idx ;
      Z2504HisProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3610HisProLot_" + sGXsfl_55_idx ;
      Z3610HisProLot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3611HisProTc_" + sGXsfl_55_idx ;
      Z3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3612HisProReo_" + sGXsfl_55_idx ;
      Z3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4439HisProBot_" + sGXsfl_55_idx ;
      Z4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4704HisProNPar_" + sGXsfl_55_idx ;
      Z4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4714HisProNpzs_" + sGXsfl_55_idx ;
      Z4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5339HisProBan_" + sGXsfl_55_idx ;
      Z5339HisProBan = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z503GruOpeCod_" + sGXsfl_55_idx ;
      Z503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z656ParCod_" + sGXsfl_55_idx ;
      Z656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_59_" + sGXsfl_55_idx ;
      nRcdDeleted_59 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_59_" + sGXsfl_55_idx ;
      nRcdExists_59 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_59_" + sGXsfl_55_idx ;
      nIsMod_59 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHisProLin_Enabled = edtHisProLin_Enabled ;
   }

   public void confirmValues560( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5559( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5559( ) ;
         httpContext.changePostValue( "Z561HisProLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z561HisProLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z561HisProLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z194BarOrdLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z194BarOrdLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z194BarOrdLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z461Fase_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z461Fase_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z461Fase_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z568HisProUni_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z568HisProUni_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z568HisProUni_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z566HisProTur_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z566HisProTur_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z566HisProTur_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z560HisProHin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z560HisProHin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z560HisProHin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z563HisProMin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z563HisProMin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z563HisProMin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z559HisProHfi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z559HisProHfi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z559HisProHfi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z562HisProMfi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z562HisProMfi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z562HisProMfi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z557HisProF_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z557HisProF_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z557HisProF_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z565HisProTte_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z565HisProTte_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z565HisProTte_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z543HisBarTip_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z543HisBarTip_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z543HisBarTip_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z556HisProEst_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z556HisProEst_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z556HisProEst_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z1525HisProKgr_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z1525HisProKgr_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1525HisProKgr_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z1526HisProMtr_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z1526HisProMtr_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1526HisProMtr_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2247HisProTip_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2247HisProTip_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2247HisProTip_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2504HisProCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2504HisProCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2504HisProCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3610HisProLot_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3610HisProLot_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3610HisProLot_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3611HisProTc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3611HisProTc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3611HisProTc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3612HisProReo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3612HisProReo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3612HisProReo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z4439HisProBot_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4439HisProBot_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4439HisProBot_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z4704HisProNPar_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4704HisProNPar_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4704HisProNPar_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z4714HisProNpzs_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4714HisProNpzs_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4714HisProNpzs_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z5339HisProBan_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z5339HisProBan_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5339HisProBan_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z503GruOpeCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z503GruOpeCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z503GruOpeCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z656ParCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z656ParCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z656ParCod_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tparpro", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.dtoc( Z558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z567HisProULin", GXutil.ltrim( localUtil.ntoc( Z567HisProULin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tparpro", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPARPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARTES PRODUCCION", "") ;
   }

   public void initializeNonKey5658( )
   {
      A402EmprCodVir = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", A402EmprCodVir);
      A567HisProULin = 0 ;
      n567HisProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A839TotUni = DecimalUtil.ZERO ;
      n839TotUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      Z567HisProULin = 0 ;
   }

   public void initAll5658( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A558HisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      initializeNonKey5658( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey5659( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A564HisProTre = (short)(0) ;
      A195BarOrdLinV = (short)(0) ;
      A131BarCodParV = "" ;
      A133BarCodReoV = (byte)(0) ;
      A134BarCodVir = 0 ;
      A307CodFas = "" ;
      n307CodFas = false ;
      A462FasEst = (byte)(0) ;
      n462FasEst = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      A503GruOpeCod = 0 ;
      A194BarOrdLin = (short)(0) ;
      A461Fase = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A566HisProTur = (byte)(0) ;
      A560HisProHin = (byte)(0) ;
      A563HisProMin = (byte)(0) ;
      A559HisProHfi = (byte)(0) ;
      A562HisProMfi = (byte)(0) ;
      A557HisProF = "" ;
      A656ParCod = (short)(0) ;
      n656ParCod = false ;
      A565HisProTte = (short)(0) ;
      A543HisBarTip = (byte)(0) ;
      A556HisProEst = (byte)(0) ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A2247HisProTip = (short)(0) ;
      A2504HisProCod = "" ;
      A1280BarMla = DecimalUtil.ZERO ;
      A1279BarKla = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A3611HisProTc = (byte)(0) ;
      A3612HisProReo = (byte)(0) ;
      A4439HisProBot = 0 ;
      A4704HisProNPar = 0 ;
      A4714HisProNpzs = (short)(0) ;
      A392DisUniMed = "" ;
      A5339HisProBan = "" ;
      Z194BarOrdLin = (short)(0) ;
      Z461Fase = "" ;
      Z568HisProUni = DecimalUtil.ZERO ;
      Z566HisProTur = (byte)(0) ;
      Z560HisProHin = (byte)(0) ;
      Z563HisProMin = (byte)(0) ;
      Z559HisProHfi = (byte)(0) ;
      Z562HisProMfi = (byte)(0) ;
      Z557HisProF = "" ;
      Z565HisProTte = (short)(0) ;
      Z543HisBarTip = (byte)(0) ;
      Z556HisProEst = (byte)(0) ;
      Z1525HisProKgr = DecimalUtil.ZERO ;
      Z1526HisProMtr = DecimalUtil.ZERO ;
      Z2247HisProTip = (short)(0) ;
      Z2504HisProCod = "" ;
      Z3610HisProLot = "" ;
      Z3611HisProTc = (byte)(0) ;
      Z3612HisProReo = (byte)(0) ;
      Z4439HisProBot = 0 ;
      Z4704HisProNPar = 0 ;
      Z4714HisProNpzs = (short)(0) ;
      Z5339HisProBan = "" ;
      Z503GruOpeCod = 0 ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z656ParCod = (short)(0) ;
   }

   public void initAll5659( )
   {
      A561HisProLin = 0 ;
      initializeNonKey5659( ) ;
   }

   public void standaloneModalInsert5659( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824152931", true, true);
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
      httpContext.AddJavascriptSource("tparpro.js", "?2026824152931", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties59( )
   {
      edtHisProLin_Enabled = defedtHisProLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_59, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_59_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReoV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A131BarCodParV));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodParV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOrdLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A307CodFas));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodFas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFase_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProHfi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMfi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTte_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisBarTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2504HisProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3610HisProLot));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProTc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5339HisProBan));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProBan_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHisProULin_Internalname = "HISPROULIN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTotUni_Internalname = "TOTUNI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprCodVir_Internalname = "EMPRCODVIR" ;
      edtavnRcdDeleted_59_Internalname = "vNRCDDELETED_59" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodVir_Internalname = "BARCODVIR" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodReoV_Internalname = "BARCODREOV" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarCodParV_Internalname = "BARCODPARV" ;
      edtGruOpeCod_Internalname = "GRUOPECOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtBarOrdLinV_Internalname = "BARORDLINV" ;
      edtFasEst_Internalname = "FASEST" ;
      edtCodFas_Internalname = "CODFAS" ;
      edtFase_Internalname = "FASE" ;
      edtHisProUni_Internalname = "HISPROUNI" ;
      edtHisProTur_Internalname = "HISPROTUR" ;
      edtHisProHin_Internalname = "HISPROHIN" ;
      edtHisProMin_Internalname = "HISPROMIN" ;
      edtHisProHfi_Internalname = "HISPROHFI" ;
      edtHisProMfi_Internalname = "HISPROMFI" ;
      edtHisProF_Internalname = "HISPROF" ;
      edtParCod_Internalname = "PARCOD" ;
      edtHisProTre_Internalname = "HISPROTRE" ;
      edtHisProTte_Internalname = "HISPROTTE" ;
      edtHisBarTip_Internalname = "HISBARTIP" ;
      edtHisProEst_Internalname = "HISPROEST" ;
      edtHisProKgr_Internalname = "HISPROKGR" ;
      edtHisProMtr_Internalname = "HISPROMTR" ;
      edtHisProTip_Internalname = "HISPROTIP" ;
      edtHisProCod_Internalname = "HISPROCOD" ;
      edtBarMla_Internalname = "BARMLA" ;
      edtBarKla_Internalname = "BARKLA" ;
      edtHisProLot_Internalname = "HISPROLOT" ;
      edtHisProTc_Internalname = "HISPROTC" ;
      edtHisProReo_Internalname = "HISPROREO" ;
      edtHisProBot_Internalname = "HISPROBOT" ;
      edtHisProNPar_Internalname = "HISPRONPAR" ;
      edtHisProNpzs_Internalname = "HISPRONPZS" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtHisProBan_Internalname = "HISPROBAN" ;
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
      Form.setCaption( httpContext.getMessage( "PARTES PRODUCCION", "") );
      edtHisProBan_Jsonclick = "" ;
      edtDisUniMed_Jsonclick = "" ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProNPar_Jsonclick = "" ;
      edtHisProBot_Jsonclick = "" ;
      edtHisProReo_Jsonclick = "" ;
      edtHisProTc_Jsonclick = "" ;
      edtHisProLot_Jsonclick = "" ;
      edtBarKla_Jsonclick = "" ;
      edtBarMla_Jsonclick = "" ;
      edtHisProCod_Jsonclick = "" ;
      edtHisProTip_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProEst_Jsonclick = "" ;
      edtHisBarTip_Jsonclick = "" ;
      edtHisProTte_Jsonclick = "" ;
      edtHisProTre_Jsonclick = "" ;
      edtParCod_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProMfi_Jsonclick = "" ;
      edtHisProHfi_Jsonclick = "" ;
      edtHisProMin_Jsonclick = "" ;
      edtHisProHin_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProUni_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtCodFas_Jsonclick = "" ;
      edtFasEst_Jsonclick = "" ;
      edtBarOrdLinV_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtBarCodParV_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReoV_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodVir_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtavnRcdDeleted_59_Jsonclick = "" ;
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
      edtHisProBan_Enabled = 1 ;
      edtDisUniMed_Enabled = 0 ;
      edtHisProNpzs_Enabled = 1 ;
      edtHisProNPar_Enabled = 1 ;
      edtHisProBot_Enabled = 1 ;
      edtHisProReo_Enabled = 1 ;
      edtHisProTc_Enabled = 1 ;
      edtHisProLot_Enabled = 1 ;
      edtBarKla_Enabled = 0 ;
      edtBarMla_Enabled = 0 ;
      edtHisProCod_Enabled = 1 ;
      edtHisProTip_Enabled = 1 ;
      edtHisProMtr_Enabled = 1 ;
      edtHisProKgr_Enabled = 1 ;
      edtHisProEst_Enabled = 1 ;
      edtHisBarTip_Enabled = 1 ;
      edtHisProTte_Enabled = 1 ;
      edtHisProTre_Enabled = 0 ;
      edtParCod_Enabled = 1 ;
      edtHisProF_Enabled = 1 ;
      edtHisProMfi_Enabled = 1 ;
      edtHisProHfi_Enabled = 1 ;
      edtHisProMin_Enabled = 1 ;
      edtHisProHin_Enabled = 1 ;
      edtHisProTur_Enabled = 1 ;
      edtHisProUni_Enabled = 1 ;
      edtFase_Enabled = 1 ;
      edtCodFas_Enabled = 0 ;
      edtFasEst_Enabled = 0 ;
      edtBarOrdLinV_Enabled = 0 ;
      edtBarOrdLin_Enabled = 1 ;
      edtGruOpeCod_Enabled = 1 ;
      edtBarCodParV_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReoV_Enabled = 0 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodVir_Enabled = 0 ;
      edtBarCod_Enabled = 1 ;
      edtHisProLin_Enabled = 1 ;
      edtavnRcdDeleted_59_Enabled = 1 ;
      edtEmprCodVir_Jsonclick = "" ;
      edtEmprCodVir_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCodVir_Enabled = 0 ;
      edtTotUni_Jsonclick = "" ;
      edtTotUni_Backcolor = (int)(0xFFFFFF) ;
      edtTotUni_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtHisProULin_Jsonclick = "" ;
      edtHisProULin_Backcolor = (int)(0xFFFFFF) ;
      edtHisProULin_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHisProFec_Jsonclick = "" ;
      edtHisProFec_Backcolor = (int)(0xFFFFFF) ;
      edtHisProFec_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5559( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal5659( ) ;
         standaloneModal5659( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow5659( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5559( ) ;
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
      /* Using cursor T005632 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T005632_A407EmprNom[0] ;
      n407EmprNom = T005632_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T005668 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(52);
      /* Using cursor T005634 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A839TotUni = T005634_A839TotUni[0] ;
         n839TotUni = T005634_n839TotUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      else
      {
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrimstr( A839TotUni, 9, 2));
      }
      pr_default.close(25);
      GX_FocusControl = edtHisProULin_Internalname ;
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
      /* Using cursor T005632 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T005632_A407EmprNom[0] ;
      n407EmprNom = T005632_n407EmprNom[0] ;
      pr_default.close(24);
      A402EmprCodVir = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", GXutil.rtrim( A402EmprCodVir));
   }

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      /* Using cursor T005668 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(52);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hisprofec( )
   {
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T005634 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A839TotUni = T005634_A839TotUni[0] ;
         n839TotUni = T005634_n839TotUni[0] ;
      }
      else
      {
         A839TotUni = DecimalUtil.doubleToDec(0) ;
         n839TotUni = false ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A402EmprCodVir", GXutil.rtrim( A402EmprCodVir));
      httpContext.ajax_rsp_assign_attri("", false, "A839TotUni", GXutil.ltrim( localUtil.ntoc( A839TotUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.format(Z558HisProFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z567HisProULin", GXutil.ltrim( localUtil.ntoc( Z567HisProULin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z402EmprCodVir", GXutil.rtrim( Z402EmprCodVir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z839TotUni", GXutil.ltrim( localUtil.ntoc( Z839TotUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T005653 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T005653_A361DisCod[0] ;
      pr_default.close(40);
      /* Using cursor T005654 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A392DisUniMed = T005654_A392DisUniMed[0] ;
      pr_default.close(41);
      /* Using cursor T005656 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(42) != 101) )
      {
         A1280BarMla = T005656_A1280BarMla[0] ;
         A1279BarKla = T005656_A1279BarKla[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(42);
      A131BarCodParV = A130BarCodPar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", GXutil.rtrim( A131BarCodParV));
   }

   public void valid_Gruopecod( )
   {
      /* Using cursor T005669 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGruOpeCod_Internalname ;
      }
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barordlin( )
   {
      n602MaqCod = false ;
      n462FasEst = false ;
      n307CodFas = false ;
      A195BarOrdLinV = A194BarOrdLin ;
      /* Using cursor T005658 */
      pr_default.execute(43, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(43) != 101) )
      {
         A462FasEst = T005658_A462FasEst[0] ;
         n462FasEst = T005658_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      pr_default.close(43);
      /* Using cursor T005660 */
      pr_default.execute(44, new Object[] {A402EmprCodVir, Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         A307CodFas = T005660_A307CodFas[0] ;
         n307CodFas = T005660_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      pr_default.close(44);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", GXutil.rtrim( A307CodFas));
   }

   public void valid_Parcod( )
   {
      n656ParCod = false ;
      /* Using cursor T005670 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParCod_Internalname ;
         }
      }
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A402EmprCodVir',fld:'EMPRCODVIR',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A402EmprCodVir',fld:'EMPRCODVIR',pic:'@!'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_HISPROFEC","{handler:'valid_Hisprofec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HISPROFEC",",oparms:[{av:'A567HisProULin',fld:'HISPROULIN',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A402EmprCodVir',fld:'EMPRCODVIR',pic:'@!'},{av:'A839TotUni',fld:'TOTUNI',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z558HisProFec'},{av:'Z567HisProULin'},{av:'Z407EmprNom'},{av:'Z402EmprCodVir'},{av:'Z839TotUni'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_EMPRCODVIR","{handler:'valid_Emprcodvir',iparms:[]");
      setEventMetadata("VALID_EMPRCODVIR",",oparms:[]}");
      setEventMetadata("VALID_HISPROLIN","{handler:'valid_Hisprolin',iparms:[]");
      setEventMetadata("VALID_HISPROLIN",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODVIR","{handler:'valid_Barcodvir',iparms:[]");
      setEventMetadata("VALID_BARCODVIR",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODREOV","{handler:'valid_Barcodreov',iparms:[]");
      setEventMetadata("VALID_BARCODREOV",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''}]}");
      setEventMetadata("VALID_BARCODPARV","{handler:'valid_Barcodparv',iparms:[]");
      setEventMetadata("VALID_BARCODPARV",",oparms:[]}");
      setEventMetadata("VALID_GRUOPECOD","{handler:'valid_Gruopecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_GRUOPECOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A402EmprCodVir',fld:'EMPRCODVIR',pic:'@!'},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A462FasEst',fld:'FASEST',pic:'9'},{av:'A307CodFas',fld:'CODFAS',pic:''}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A462FasEst',fld:'FASEST',pic:'9'},{av:'A307CodFas',fld:'CODFAS',pic:''}]}");
      setEventMetadata("VALID_BARORDLINV","{handler:'valid_Barordlinv',iparms:[]");
      setEventMetadata("VALID_BARORDLINV",",oparms:[]}");
      setEventMetadata("VALID_HISPROHIN","{handler:'valid_Hisprohin',iparms:[]");
      setEventMetadata("VALID_HISPROHIN",",oparms:[]}");
      setEventMetadata("VALID_HISPROMIN","{handler:'valid_Hispromin',iparms:[]");
      setEventMetadata("VALID_HISPROMIN",",oparms:[]}");
      setEventMetadata("VALID_HISPROHFI","{handler:'valid_Hisprohfi',iparms:[]");
      setEventMetadata("VALID_HISPROHFI",",oparms:[]}");
      setEventMetadata("VALID_HISPROMFI","{handler:'valid_Hispromfi',iparms:[]");
      setEventMetadata("VALID_HISPROMFI",",oparms:[]}");
      setEventMetadata("VALID_HISPROF","{handler:'valid_Hisprof',iparms:[]");
      setEventMetadata("VALID_HISPROF",",oparms:[]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PARCOD",",oparms:[]}");
      setEventMetadata("VALID_HISBARTIP","{handler:'valid_Hisbartip',iparms:[]");
      setEventMetadata("VALID_HISBARTIP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hisproban',iparms:[]");
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
      pr_default.close(53);
      pr_default.close(40);
      pr_default.close(54);
      pr_default.close(41);
      pr_default.close(44);
      pr_default.close(43);
      pr_default.close(42);
      pr_default.close(24);
      pr_default.close(52);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z558HisProFec = GXutil.nullDate() ;
      Z461Fase = "" ;
      Z568HisProUni = DecimalUtil.ZERO ;
      Z557HisProF = "" ;
      Z1525HisProKgr = DecimalUtil.ZERO ;
      Z1526HisProMtr = DecimalUtil.ZERO ;
      Z2504HisProCod = "" ;
      Z3610HisProLot = "" ;
      Z5339HisProBan = "" ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A402EmprCodVir = "" ;
      A131BarCodParV = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A839TotUni = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode59 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode58 = "" ;
      GXCCtl = "" ;
      A307CodFas = "" ;
      A461Fase = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A2504HisProCod = "" ;
      A1280BarMla = DecimalUtil.ZERO ;
      A1279BarKla = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A392DisUniMed = "" ;
      A5339HisProBan = "" ;
      T005615_A839TotUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005615_n839TotUni = new boolean[] {false} ;
      Z407EmprNom = "" ;
      Z839TotUni = DecimalUtil.ZERO ;
      T005621_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005621_A567HisProULin = new int[1] ;
      T005621_n567HisProULin = new boolean[] {false} ;
      T005621_A407EmprNom = new String[] {""} ;
      T005621_n407EmprNom = new boolean[] {false} ;
      T005621_A396EmprCod = new String[] {""} ;
      T005621_A602MaqCod = new String[] {""} ;
      T005621_n602MaqCod = new boolean[] {false} ;
      T005621_A839TotUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005621_n839TotUni = new boolean[] {false} ;
      T005618_A407EmprNom = new String[] {""} ;
      T005618_n407EmprNom = new boolean[] {false} ;
      T005619_A396EmprCod = new String[] {""} ;
      T005622_A407EmprNom = new String[] {""} ;
      T005622_n407EmprNom = new boolean[] {false} ;
      T005623_A396EmprCod = new String[] {""} ;
      T005625_A839TotUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005625_n839TotUni = new boolean[] {false} ;
      T005626_A396EmprCod = new String[] {""} ;
      T005626_A602MaqCod = new String[] {""} ;
      T005626_n602MaqCod = new boolean[] {false} ;
      T005626_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005617_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005617_A567HisProULin = new int[1] ;
      T005617_n567HisProULin = new boolean[] {false} ;
      T005617_A396EmprCod = new String[] {""} ;
      T005617_A602MaqCod = new String[] {""} ;
      T005617_n602MaqCod = new boolean[] {false} ;
      T005627_A396EmprCod = new String[] {""} ;
      T005627_A602MaqCod = new String[] {""} ;
      T005627_n602MaqCod = new boolean[] {false} ;
      T005627_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005628_A396EmprCod = new String[] {""} ;
      T005628_A602MaqCod = new String[] {""} ;
      T005628_n602MaqCod = new boolean[] {false} ;
      T005628_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005616_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005616_A567HisProULin = new int[1] ;
      T005616_n567HisProULin = new boolean[] {false} ;
      T005616_A396EmprCod = new String[] {""} ;
      T005616_A602MaqCod = new String[] {""} ;
      T005616_n602MaqCod = new boolean[] {false} ;
      T005632_A407EmprNom = new String[] {""} ;
      T005632_n407EmprNom = new boolean[] {false} ;
      T005634_A839TotUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005634_n839TotUni = new boolean[] {false} ;
      T005635_A396EmprCod = new String[] {""} ;
      T005635_A602MaqCod = new String[] {""} ;
      T005635_n602MaqCod = new boolean[] {false} ;
      T005635_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005635_A561HisProLin = new int[1] ;
      T005635_A3047LOParId = new String[] {""} ;
      T005636_A396EmprCod = new String[] {""} ;
      T005636_A602MaqCod = new String[] {""} ;
      T005636_n602MaqCod = new boolean[] {false} ;
      T005636_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      Z392DisUniMed = "" ;
      Z1280BarMla = DecimalUtil.ZERO ;
      Z1279BarKla = DecimalUtil.ZERO ;
      T005638_A361DisCod = new int[1] ;
      T005638_A602MaqCod = new String[] {""} ;
      T005638_n602MaqCod = new boolean[] {false} ;
      T005638_A561HisProLin = new int[1] ;
      T005638_A194BarOrdLin = new short[1] ;
      T005638_A461Fase = new String[] {""} ;
      T005638_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005638_A566HisProTur = new byte[1] ;
      T005638_A560HisProHin = new byte[1] ;
      T005638_A563HisProMin = new byte[1] ;
      T005638_A559HisProHfi = new byte[1] ;
      T005638_A562HisProMfi = new byte[1] ;
      T005638_A557HisProF = new String[] {""} ;
      T005638_A565HisProTte = new short[1] ;
      T005638_A543HisBarTip = new byte[1] ;
      T005638_A556HisProEst = new byte[1] ;
      T005638_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005638_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005638_A2247HisProTip = new short[1] ;
      T005638_A2504HisProCod = new String[] {""} ;
      T005638_A3610HisProLot = new String[] {""} ;
      T005638_A3611HisProTc = new byte[1] ;
      T005638_A3612HisProReo = new byte[1] ;
      T005638_A4439HisProBot = new int[1] ;
      T005638_A4704HisProNPar = new int[1] ;
      T005638_A4714HisProNpzs = new short[1] ;
      T005638_A392DisUniMed = new String[] {""} ;
      T005638_A5339HisProBan = new String[] {""} ;
      T005638_A396EmprCod = new String[] {""} ;
      T005638_A503GruOpeCod = new int[1] ;
      T005638_A129BarCod = new int[1] ;
      T005638_n129BarCod = new boolean[] {false} ;
      T005638_A132BarCodReo = new byte[1] ;
      T005638_n132BarCodReo = new boolean[] {false} ;
      T005638_A130BarCodPar = new String[] {""} ;
      T005638_n130BarCodPar = new boolean[] {false} ;
      T005638_A656ParCod = new short[1] ;
      T005638_n656ParCod = new boolean[] {false} ;
      T005638_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005638_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005638_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00569_A462FasEst = new byte[1] ;
      T00569_n462FasEst = new boolean[] {false} ;
      T005611_A307CodFas = new String[] {""} ;
      T005611_n307CodFas = new boolean[] {false} ;
      T00564_A396EmprCod = new String[] {""} ;
      T00565_A361DisCod = new int[1] ;
      T00566_A396EmprCod = new String[] {""} ;
      T00567_A392DisUniMed = new String[] {""} ;
      T005613_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005613_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005639_A396EmprCod = new String[] {""} ;
      T005640_A361DisCod = new int[1] ;
      T005641_A396EmprCod = new String[] {""} ;
      T005642_A392DisUniMed = new String[] {""} ;
      T005644_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005644_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005646_A462FasEst = new byte[1] ;
      T005646_n462FasEst = new boolean[] {false} ;
      T005648_A307CodFas = new String[] {""} ;
      T005648_n307CodFas = new boolean[] {false} ;
      T005649_A396EmprCod = new String[] {""} ;
      T005649_A602MaqCod = new String[] {""} ;
      T005649_n602MaqCod = new boolean[] {false} ;
      T005649_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005649_A561HisProLin = new int[1] ;
      T00563_A602MaqCod = new String[] {""} ;
      T00563_n602MaqCod = new boolean[] {false} ;
      T00563_A561HisProLin = new int[1] ;
      T00563_A194BarOrdLin = new short[1] ;
      T00563_A461Fase = new String[] {""} ;
      T00563_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00563_A566HisProTur = new byte[1] ;
      T00563_A560HisProHin = new byte[1] ;
      T00563_A563HisProMin = new byte[1] ;
      T00563_A559HisProHfi = new byte[1] ;
      T00563_A562HisProMfi = new byte[1] ;
      T00563_A557HisProF = new String[] {""} ;
      T00563_A565HisProTte = new short[1] ;
      T00563_A543HisBarTip = new byte[1] ;
      T00563_A556HisProEst = new byte[1] ;
      T00563_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00563_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00563_A2247HisProTip = new short[1] ;
      T00563_A2504HisProCod = new String[] {""} ;
      T00563_A3610HisProLot = new String[] {""} ;
      T00563_A3611HisProTc = new byte[1] ;
      T00563_A3612HisProReo = new byte[1] ;
      T00563_A4439HisProBot = new int[1] ;
      T00563_A4704HisProNPar = new int[1] ;
      T00563_A4714HisProNpzs = new short[1] ;
      T00563_A5339HisProBan = new String[] {""} ;
      T00563_A396EmprCod = new String[] {""} ;
      T00563_A503GruOpeCod = new int[1] ;
      T00563_A129BarCod = new int[1] ;
      T00563_n129BarCod = new boolean[] {false} ;
      T00563_A132BarCodReo = new byte[1] ;
      T00563_n132BarCodReo = new boolean[] {false} ;
      T00563_A130BarCodPar = new String[] {""} ;
      T00563_n130BarCodPar = new boolean[] {false} ;
      T00563_A656ParCod = new short[1] ;
      T00563_n656ParCod = new boolean[] {false} ;
      T00563_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00562_A602MaqCod = new String[] {""} ;
      T00562_n602MaqCod = new boolean[] {false} ;
      T00562_A561HisProLin = new int[1] ;
      T00562_A194BarOrdLin = new short[1] ;
      T00562_A461Fase = new String[] {""} ;
      T00562_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00562_A566HisProTur = new byte[1] ;
      T00562_A560HisProHin = new byte[1] ;
      T00562_A563HisProMin = new byte[1] ;
      T00562_A559HisProHfi = new byte[1] ;
      T00562_A562HisProMfi = new byte[1] ;
      T00562_A557HisProF = new String[] {""} ;
      T00562_A565HisProTte = new short[1] ;
      T00562_A543HisBarTip = new byte[1] ;
      T00562_A556HisProEst = new byte[1] ;
      T00562_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00562_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00562_A2247HisProTip = new short[1] ;
      T00562_A2504HisProCod = new String[] {""} ;
      T00562_A3610HisProLot = new String[] {""} ;
      T00562_A3611HisProTc = new byte[1] ;
      T00562_A3612HisProReo = new byte[1] ;
      T00562_A4439HisProBot = new int[1] ;
      T00562_A4704HisProNPar = new int[1] ;
      T00562_A4714HisProNpzs = new short[1] ;
      T00562_A5339HisProBan = new String[] {""} ;
      T00562_A396EmprCod = new String[] {""} ;
      T00562_A503GruOpeCod = new int[1] ;
      T00562_A129BarCod = new int[1] ;
      T00562_n129BarCod = new boolean[] {false} ;
      T00562_A132BarCodReo = new byte[1] ;
      T00562_n132BarCodReo = new boolean[] {false} ;
      T00562_A130BarCodPar = new String[] {""} ;
      T00562_n130BarCodPar = new boolean[] {false} ;
      T00562_A656ParCod = new short[1] ;
      T00562_n656ParCod = new boolean[] {false} ;
      T00562_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005653_A361DisCod = new int[1] ;
      T005654_A392DisUniMed = new String[] {""} ;
      T005656_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005656_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T005658_A462FasEst = new byte[1] ;
      T005658_n462FasEst = new boolean[] {false} ;
      T005660_A307CodFas = new String[] {""} ;
      T005660_n307CodFas = new boolean[] {false} ;
      T005661_A396EmprCod = new String[] {""} ;
      T005661_A602MaqCod = new String[] {""} ;
      T005661_n602MaqCod = new boolean[] {false} ;
      T005661_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005661_A561HisProLin = new int[1] ;
      T005661_A10501Peh_cod = new String[] {""} ;
      T005662_A396EmprCod = new String[] {""} ;
      T005662_A602MaqCod = new String[] {""} ;
      T005662_n602MaqCod = new boolean[] {false} ;
      T005662_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005662_A561HisProLin = new int[1] ;
      T005662_A10495Emh_cod = new String[] {""} ;
      T005663_A396EmprCod = new String[] {""} ;
      T005663_A602MaqCod = new String[] {""} ;
      T005663_n602MaqCod = new boolean[] {false} ;
      T005663_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005663_A561HisProLin = new int[1] ;
      T005663_A10487Cah_cod = new String[] {""} ;
      T005664_A396EmprCod = new String[] {""} ;
      T005664_A602MaqCod = new String[] {""} ;
      T005664_n602MaqCod = new boolean[] {false} ;
      T005664_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005664_A561HisProLin = new int[1] ;
      T005664_A10486Abh_cod = new String[] {""} ;
      T005665_A396EmprCod = new String[] {""} ;
      T005665_A602MaqCod = new String[] {""} ;
      T005665_n602MaqCod = new boolean[] {false} ;
      T005665_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005665_A561HisProLin = new int[1] ;
      T005665_A10090HisProCP = new String[] {""} ;
      T005666_A396EmprCod = new String[] {""} ;
      T005666_A602MaqCod = new String[] {""} ;
      T005666_n602MaqCod = new boolean[] {false} ;
      T005666_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005666_A561HisProLin = new int[1] ;
      T005666_A3047LOParId = new String[] {""} ;
      T005667_A396EmprCod = new String[] {""} ;
      T005667_A602MaqCod = new String[] {""} ;
      T005667_n602MaqCod = new boolean[] {false} ;
      T005667_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T005667_A561HisProLin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T005668_A396EmprCod = new String[] {""} ;
      Z402EmprCodVir = "" ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ558HisProFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ402EmprCodVir = "" ;
      ZZ839TotUni = DecimalUtil.ZERO ;
      Z131BarCodParV = "" ;
      T005669_A396EmprCod = new String[] {""} ;
      Z307CodFas = "" ;
      T005670_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tparpro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tparpro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tparpro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tparpro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tparpro__default(),
         new Object[] {
             new Object[] {
            T00562_A602MaqCod, T00562_A561HisProLin, T00562_A194BarOrdLin, T00562_A461Fase, T00562_A568HisProUni, T00562_A566HisProTur, T00562_A560HisProHin, T00562_A563HisProMin, T00562_A559HisProHfi, T00562_A562HisProMfi,
            T00562_A557HisProF, T00562_A565HisProTte, T00562_A543HisBarTip, T00562_A556HisProEst, T00562_A1525HisProKgr, T00562_A1526HisProMtr, T00562_A2247HisProTip, T00562_A2504HisProCod, T00562_A3610HisProLot, T00562_A3611HisProTc,
            T00562_A3612HisProReo, T00562_A4439HisProBot, T00562_A4704HisProNPar, T00562_A4714HisProNpzs, T00562_A5339HisProBan, T00562_A396EmprCod, T00562_A503GruOpeCod, T00562_A129BarCod, T00562_A132BarCodReo, T00562_A130BarCodPar,
            T00562_A656ParCod, T00562_n656ParCod, T00562_A558HisProFec
            }
            , new Object[] {
            T00563_A602MaqCod, T00563_A561HisProLin, T00563_A194BarOrdLin, T00563_A461Fase, T00563_A568HisProUni, T00563_A566HisProTur, T00563_A560HisProHin, T00563_A563HisProMin, T00563_A559HisProHfi, T00563_A562HisProMfi,
            T00563_A557HisProF, T00563_A565HisProTte, T00563_A543HisBarTip, T00563_A556HisProEst, T00563_A1525HisProKgr, T00563_A1526HisProMtr, T00563_A2247HisProTip, T00563_A2504HisProCod, T00563_A3610HisProLot, T00563_A3611HisProTc,
            T00563_A3612HisProReo, T00563_A4439HisProBot, T00563_A4704HisProNPar, T00563_A4714HisProNpzs, T00563_A5339HisProBan, T00563_A396EmprCod, T00563_A503GruOpeCod, T00563_A129BarCod, T00563_A132BarCodReo, T00563_A130BarCodPar,
            T00563_A656ParCod, T00563_n656ParCod, T00563_A558HisProFec
            }
            , new Object[] {
            T00564_A396EmprCod
            }
            , new Object[] {
            T00565_A361DisCod
            }
            , new Object[] {
            T00566_A396EmprCod
            }
            , new Object[] {
            T00567_A392DisUniMed
            }
            , new Object[] {
            T00569_A462FasEst, T00569_n462FasEst
            }
            , new Object[] {
            T005611_A307CodFas, T005611_n307CodFas
            }
            , new Object[] {
            T005613_A1280BarMla, T005613_A1279BarKla
            }
            , new Object[] {
            T005615_A839TotUni, T005615_n839TotUni
            }
            , new Object[] {
            T005616_A558HisProFec, T005616_A567HisProULin, T005616_n567HisProULin, T005616_A396EmprCod, T005616_A602MaqCod
            }
            , new Object[] {
            T005617_A558HisProFec, T005617_A567HisProULin, T005617_n567HisProULin, T005617_A396EmprCod, T005617_A602MaqCod
            }
            , new Object[] {
            T005618_A407EmprNom, T005618_n407EmprNom
            }
            , new Object[] {
            T005619_A396EmprCod
            }
            , new Object[] {
            T005621_A558HisProFec, T005621_A567HisProULin, T005621_n567HisProULin, T005621_A407EmprNom, T005621_n407EmprNom, T005621_A396EmprCod, T005621_A602MaqCod, T005621_A839TotUni, T005621_n839TotUni
            }
            , new Object[] {
            T005622_A407EmprNom, T005622_n407EmprNom
            }
            , new Object[] {
            T005623_A396EmprCod
            }
            , new Object[] {
            T005625_A839TotUni, T005625_n839TotUni
            }
            , new Object[] {
            T005626_A396EmprCod, T005626_A602MaqCod, T005626_A558HisProFec
            }
            , new Object[] {
            T005627_A396EmprCod, T005627_A602MaqCod, T005627_A558HisProFec
            }
            , new Object[] {
            T005628_A396EmprCod, T005628_A602MaqCod, T005628_A558HisProFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005632_A407EmprNom, T005632_n407EmprNom
            }
            , new Object[] {
            T005634_A839TotUni, T005634_n839TotUni
            }
            , new Object[] {
            T005635_A396EmprCod, T005635_A602MaqCod, T005635_A558HisProFec, T005635_A561HisProLin, T005635_A3047LOParId
            }
            , new Object[] {
            T005636_A396EmprCod, T005636_A602MaqCod, T005636_A558HisProFec
            }
            , new Object[] {
            T005638_A361DisCod, T005638_A602MaqCod, T005638_A561HisProLin, T005638_A194BarOrdLin, T005638_A461Fase, T005638_A568HisProUni, T005638_A566HisProTur, T005638_A560HisProHin, T005638_A563HisProMin, T005638_A559HisProHfi,
            T005638_A562HisProMfi, T005638_A557HisProF, T005638_A565HisProTte, T005638_A543HisBarTip, T005638_A556HisProEst, T005638_A1525HisProKgr, T005638_A1526HisProMtr, T005638_A2247HisProTip, T005638_A2504HisProCod, T005638_A3610HisProLot,
            T005638_A3611HisProTc, T005638_A3612HisProReo, T005638_A4439HisProBot, T005638_A4704HisProNPar, T005638_A4714HisProNpzs, T005638_A392DisUniMed, T005638_A5339HisProBan, T005638_A396EmprCod, T005638_A503GruOpeCod, T005638_A129BarCod,
            T005638_n129BarCod, T005638_A132BarCodReo, T005638_n132BarCodReo, T005638_A130BarCodPar, T005638_n130BarCodPar, T005638_A656ParCod, T005638_n656ParCod, T005638_A558HisProFec, T005638_A1280BarMla, T005638_A1279BarKla
            }
            , new Object[] {
            T005639_A396EmprCod
            }
            , new Object[] {
            T005640_A361DisCod
            }
            , new Object[] {
            T005641_A396EmprCod
            }
            , new Object[] {
            T005642_A392DisUniMed
            }
            , new Object[] {
            T005644_A1280BarMla, T005644_A1279BarKla
            }
            , new Object[] {
            T005646_A462FasEst, T005646_n462FasEst
            }
            , new Object[] {
            T005648_A307CodFas, T005648_n307CodFas
            }
            , new Object[] {
            T005649_A396EmprCod, T005649_A602MaqCod, T005649_A558HisProFec, T005649_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005653_A361DisCod
            }
            , new Object[] {
            T005654_A392DisUniMed
            }
            , new Object[] {
            T005656_A1280BarMla, T005656_A1279BarKla
            }
            , new Object[] {
            T005658_A462FasEst, T005658_n462FasEst
            }
            , new Object[] {
            T005660_A307CodFas, T005660_n307CodFas
            }
            , new Object[] {
            T005661_A396EmprCod, T005661_A602MaqCod, T005661_A558HisProFec, T005661_A561HisProLin, T005661_A10501Peh_cod
            }
            , new Object[] {
            T005662_A396EmprCod, T005662_A602MaqCod, T005662_A558HisProFec, T005662_A561HisProLin, T005662_A10495Emh_cod
            }
            , new Object[] {
            T005663_A396EmprCod, T005663_A602MaqCod, T005663_A558HisProFec, T005663_A561HisProLin, T005663_A10487Cah_cod
            }
            , new Object[] {
            T005664_A396EmprCod, T005664_A602MaqCod, T005664_A558HisProFec, T005664_A561HisProLin, T005664_A10486Abh_cod
            }
            , new Object[] {
            T005665_A396EmprCod, T005665_A602MaqCod, T005665_A558HisProFec, T005665_A561HisProLin, T005665_A10090HisProCP
            }
            , new Object[] {
            T005666_A396EmprCod, T005666_A602MaqCod, T005666_A558HisProFec, T005666_A561HisProLin, T005666_A3047LOParId
            }
            , new Object[] {
            T005667_A396EmprCod, T005667_A602MaqCod, T005667_A558HisProFec, T005667_A561HisProLin
            }
            , new Object[] {
            T005668_A396EmprCod
            }
            , new Object[] {
            T005669_A396EmprCod
            }
            , new Object[] {
            T005670_A396EmprCod
            }
         }
      );
   }

   private byte Z566HisProTur ;
   private byte Z560HisProHin ;
   private byte Z563HisProMin ;
   private byte Z559HisProHfi ;
   private byte Z562HisProMfi ;
   private byte Z543HisBarTip ;
   private byte Z556HisProEst ;
   private byte Z3611HisProTc ;
   private byte Z3612HisProReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A133BarCodReoV ;
   private byte nKeyPressed ;
   private byte A462FasEst ;
   private byte A566HisProTur ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A543HisBarTip ;
   private byte A556HisProEst ;
   private byte A3611HisProTc ;
   private byte A3612HisProReo ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte Z462FasEst ;
   private short Z194BarOrdLin ;
   private short Z565HisProTte ;
   private short Z2247HisProTip ;
   private short Z4714HisProNpzs ;
   private short Z656ParCod ;
   private short nRcdDeleted_59 ;
   private short nRcdExists_59 ;
   private short nIsMod_59 ;
   private short A656ParCod ;
   private short A195BarOrdLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount59 ;
   private short RcdFound59 ;
   private short nBlankRcdUsr59 ;
   private short A194BarOrdLin ;
   private short A564HisProTre ;
   private short A565HisProTte ;
   private short A2247HisProTip ;
   private short A4714HisProNpzs ;
   private short RcdFound58 ;
   private short nIsDirty_58 ;
   private short nIsDirty_59 ;
   private short Z195BarOrdLinV ;
   private int Z567HisProULin ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z561HisProLin ;
   private int Z4439HisProBot ;
   private int Z4704HisProNPar ;
   private int Z503GruOpeCod ;
   private int Z129BarCod ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A134BarCodVir ;
   private int A561HisProLin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtHisProFec_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A567HisProULin ;
   private int edtHisProULin_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTotUni_Enabled ;
   private int edtEmprCodVir_Enabled ;
   private int edtavnRcdDeleted_59_Enabled ;
   private int edtHisProLin_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodVir_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodReoV_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarCodParV_Enabled ;
   private int edtGruOpeCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtBarOrdLinV_Enabled ;
   private int edtFasEst_Enabled ;
   private int edtCodFas_Enabled ;
   private int edtFase_Enabled ;
   private int edtHisProUni_Enabled ;
   private int edtHisProTur_Enabled ;
   private int edtHisProHin_Enabled ;
   private int edtHisProMin_Enabled ;
   private int edtHisProHfi_Enabled ;
   private int edtHisProMfi_Enabled ;
   private int edtHisProF_Enabled ;
   private int edtParCod_Enabled ;
   private int edtHisProTre_Enabled ;
   private int edtHisProTte_Enabled ;
   private int edtHisBarTip_Enabled ;
   private int edtHisProEst_Enabled ;
   private int edtHisProKgr_Enabled ;
   private int edtHisProMtr_Enabled ;
   private int edtHisProTip_Enabled ;
   private int edtHisProCod_Enabled ;
   private int edtBarMla_Enabled ;
   private int edtBarKla_Enabled ;
   private int edtHisProLot_Enabled ;
   private int edtHisProTc_Enabled ;
   private int edtHisProReo_Enabled ;
   private int edtHisProBot_Enabled ;
   private int edtHisProNPar_Enabled ;
   private int edtHisProNpzs_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtHisProBan_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A4439HisProBot ;
   private int A4704HisProNPar ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHisProLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprCodVir_Backcolor ;
   private int edtTotUni_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHisProULin_Backcolor ;
   private int edtHisProFec_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ567HisProULin ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z568HisProUni ;
   private java.math.BigDecimal Z1525HisProKgr ;
   private java.math.BigDecimal Z1526HisProMtr ;
   private java.math.BigDecimal A839TotUni ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal Z839TotUni ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal ZZ839TotUni ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z461Fase ;
   private String Z557HisProF ;
   private String Z2504HisProCod ;
   private String Z3610HisProLot ;
   private String Z5339HisProBan ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A402EmprCodVir ;
   private String A131BarCodParV ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHisProFec_Internalname ;
   private String edtHisProFec_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHisProULin_Internalname ;
   private String edtHisProULin_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTotUni_Internalname ;
   private String edtTotUni_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprCodVir_Internalname ;
   private String edtEmprCodVir_Jsonclick ;
   private String sMode59 ;
   private String edtavnRcdDeleted_59_Internalname ;
   private String edtHisProLin_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodVir_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReoV_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodParV_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLinV_Internalname ;
   private String edtFasEst_Internalname ;
   private String edtCodFas_Internalname ;
   private String edtFase_Internalname ;
   private String edtHisProUni_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProHin_Internalname ;
   private String edtHisProMin_Internalname ;
   private String edtHisProHfi_Internalname ;
   private String edtHisProMfi_Internalname ;
   private String edtHisProF_Internalname ;
   private String edtParCod_Internalname ;
   private String edtHisProTre_Internalname ;
   private String edtHisProTte_Internalname ;
   private String edtHisBarTip_Internalname ;
   private String edtHisProEst_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProTip_Internalname ;
   private String edtHisProCod_Internalname ;
   private String edtBarMla_Internalname ;
   private String edtBarKla_Internalname ;
   private String edtHisProLot_Internalname ;
   private String edtHisProTc_Internalname ;
   private String edtHisProReo_Internalname ;
   private String edtHisProBot_Internalname ;
   private String edtHisProNPar_Internalname ;
   private String edtHisProNpzs_Internalname ;
   private String edtDisUniMed_Internalname ;
   private String edtHisProBan_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode58 ;
   private String GXCCtl ;
   private String A307CodFas ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A2504HisProCod ;
   private String A3610HisProLot ;
   private String A392DisUniMed ;
   private String A5339HisProBan ;
   private String Z407EmprNom ;
   private String Z392DisUniMed ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_59_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodVir_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodReoV_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCodParV_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtBarOrdLinV_Jsonclick ;
   private String edtFasEst_Jsonclick ;
   private String edtCodFas_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtHisProUni_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProHin_Jsonclick ;
   private String edtHisProMin_Jsonclick ;
   private String edtHisProHfi_Jsonclick ;
   private String edtHisProMfi_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtHisProTre_Jsonclick ;
   private String edtHisProTte_Jsonclick ;
   private String edtHisBarTip_Jsonclick ;
   private String edtHisProEst_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProTip_Jsonclick ;
   private String edtHisProCod_Jsonclick ;
   private String edtBarMla_Jsonclick ;
   private String edtBarKla_Jsonclick ;
   private String edtHisProLot_Jsonclick ;
   private String edtHisProTc_Jsonclick ;
   private String edtHisProReo_Jsonclick ;
   private String edtHisProBot_Jsonclick ;
   private String edtHisProNPar_Jsonclick ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String edtHisProBan_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Z402EmprCodVir ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ402EmprCodVir ;
   private String Z131BarCodParV ;
   private String Z307CodFas ;
   private java.util.Date Z558HisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date ZZ558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n602MaqCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n656ParCod ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n567HisProULin ;
   private boolean n407EmprNom ;
   private boolean n839TotUni ;
   private boolean n462FasEst ;
   private boolean n307CodFas ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T005615_A839TotUni ;
   private boolean[] T005615_n839TotUni ;
   private java.util.Date[] T005621_A558HisProFec ;
   private int[] T005621_A567HisProULin ;
   private boolean[] T005621_n567HisProULin ;
   private String[] T005621_A407EmprNom ;
   private boolean[] T005621_n407EmprNom ;
   private String[] T005621_A396EmprCod ;
   private String[] T005621_A602MaqCod ;
   private boolean[] T005621_n602MaqCod ;
   private java.math.BigDecimal[] T005621_A839TotUni ;
   private boolean[] T005621_n839TotUni ;
   private String[] T005618_A407EmprNom ;
   private boolean[] T005618_n407EmprNom ;
   private String[] T005619_A396EmprCod ;
   private String[] T005622_A407EmprNom ;
   private boolean[] T005622_n407EmprNom ;
   private String[] T005623_A396EmprCod ;
   private java.math.BigDecimal[] T005625_A839TotUni ;
   private boolean[] T005625_n839TotUni ;
   private String[] T005626_A396EmprCod ;
   private String[] T005626_A602MaqCod ;
   private boolean[] T005626_n602MaqCod ;
   private java.util.Date[] T005626_A558HisProFec ;
   private java.util.Date[] T005617_A558HisProFec ;
   private int[] T005617_A567HisProULin ;
   private boolean[] T005617_n567HisProULin ;
   private String[] T005617_A396EmprCod ;
   private String[] T005617_A602MaqCod ;
   private boolean[] T005617_n602MaqCod ;
   private String[] T005627_A396EmprCod ;
   private String[] T005627_A602MaqCod ;
   private boolean[] T005627_n602MaqCod ;
   private java.util.Date[] T005627_A558HisProFec ;
   private String[] T005628_A396EmprCod ;
   private String[] T005628_A602MaqCod ;
   private boolean[] T005628_n602MaqCod ;
   private java.util.Date[] T005628_A558HisProFec ;
   private java.util.Date[] T005616_A558HisProFec ;
   private int[] T005616_A567HisProULin ;
   private boolean[] T005616_n567HisProULin ;
   private String[] T005616_A396EmprCod ;
   private String[] T005616_A602MaqCod ;
   private boolean[] T005616_n602MaqCod ;
   private String[] T005632_A407EmprNom ;
   private boolean[] T005632_n407EmprNom ;
   private java.math.BigDecimal[] T005634_A839TotUni ;
   private boolean[] T005634_n839TotUni ;
   private String[] T005635_A396EmprCod ;
   private String[] T005635_A602MaqCod ;
   private boolean[] T005635_n602MaqCod ;
   private java.util.Date[] T005635_A558HisProFec ;
   private int[] T005635_A561HisProLin ;
   private String[] T005635_A3047LOParId ;
   private String[] T005636_A396EmprCod ;
   private String[] T005636_A602MaqCod ;
   private boolean[] T005636_n602MaqCod ;
   private java.util.Date[] T005636_A558HisProFec ;
   private int[] T005638_A361DisCod ;
   private String[] T005638_A602MaqCod ;
   private boolean[] T005638_n602MaqCod ;
   private int[] T005638_A561HisProLin ;
   private short[] T005638_A194BarOrdLin ;
   private String[] T005638_A461Fase ;
   private java.math.BigDecimal[] T005638_A568HisProUni ;
   private byte[] T005638_A566HisProTur ;
   private byte[] T005638_A560HisProHin ;
   private byte[] T005638_A563HisProMin ;
   private byte[] T005638_A559HisProHfi ;
   private byte[] T005638_A562HisProMfi ;
   private String[] T005638_A557HisProF ;
   private short[] T005638_A565HisProTte ;
   private byte[] T005638_A543HisBarTip ;
   private byte[] T005638_A556HisProEst ;
   private java.math.BigDecimal[] T005638_A1525HisProKgr ;
   private java.math.BigDecimal[] T005638_A1526HisProMtr ;
   private short[] T005638_A2247HisProTip ;
   private String[] T005638_A2504HisProCod ;
   private String[] T005638_A3610HisProLot ;
   private byte[] T005638_A3611HisProTc ;
   private byte[] T005638_A3612HisProReo ;
   private int[] T005638_A4439HisProBot ;
   private int[] T005638_A4704HisProNPar ;
   private short[] T005638_A4714HisProNpzs ;
   private String[] T005638_A392DisUniMed ;
   private String[] T005638_A5339HisProBan ;
   private String[] T005638_A396EmprCod ;
   private int[] T005638_A503GruOpeCod ;
   private int[] T005638_A129BarCod ;
   private boolean[] T005638_n129BarCod ;
   private byte[] T005638_A132BarCodReo ;
   private boolean[] T005638_n132BarCodReo ;
   private String[] T005638_A130BarCodPar ;
   private boolean[] T005638_n130BarCodPar ;
   private short[] T005638_A656ParCod ;
   private boolean[] T005638_n656ParCod ;
   private java.util.Date[] T005638_A558HisProFec ;
   private java.math.BigDecimal[] T005638_A1280BarMla ;
   private java.math.BigDecimal[] T005638_A1279BarKla ;
   private byte[] T00569_A462FasEst ;
   private boolean[] T00569_n462FasEst ;
   private String[] T005611_A307CodFas ;
   private boolean[] T005611_n307CodFas ;
   private String[] T00564_A396EmprCod ;
   private int[] T00565_A361DisCod ;
   private String[] T00566_A396EmprCod ;
   private String[] T00567_A392DisUniMed ;
   private java.math.BigDecimal[] T005613_A1280BarMla ;
   private java.math.BigDecimal[] T005613_A1279BarKla ;
   private String[] T005639_A396EmprCod ;
   private int[] T005640_A361DisCod ;
   private String[] T005641_A396EmprCod ;
   private String[] T005642_A392DisUniMed ;
   private java.math.BigDecimal[] T005644_A1280BarMla ;
   private java.math.BigDecimal[] T005644_A1279BarKla ;
   private byte[] T005646_A462FasEst ;
   private boolean[] T005646_n462FasEst ;
   private String[] T005648_A307CodFas ;
   private boolean[] T005648_n307CodFas ;
   private String[] T005649_A396EmprCod ;
   private String[] T005649_A602MaqCod ;
   private boolean[] T005649_n602MaqCod ;
   private java.util.Date[] T005649_A558HisProFec ;
   private int[] T005649_A561HisProLin ;
   private String[] T00563_A602MaqCod ;
   private boolean[] T00563_n602MaqCod ;
   private int[] T00563_A561HisProLin ;
   private short[] T00563_A194BarOrdLin ;
   private String[] T00563_A461Fase ;
   private java.math.BigDecimal[] T00563_A568HisProUni ;
   private byte[] T00563_A566HisProTur ;
   private byte[] T00563_A560HisProHin ;
   private byte[] T00563_A563HisProMin ;
   private byte[] T00563_A559HisProHfi ;
   private byte[] T00563_A562HisProMfi ;
   private String[] T00563_A557HisProF ;
   private short[] T00563_A565HisProTte ;
   private byte[] T00563_A543HisBarTip ;
   private byte[] T00563_A556HisProEst ;
   private java.math.BigDecimal[] T00563_A1525HisProKgr ;
   private java.math.BigDecimal[] T00563_A1526HisProMtr ;
   private short[] T00563_A2247HisProTip ;
   private String[] T00563_A2504HisProCod ;
   private String[] T00563_A3610HisProLot ;
   private byte[] T00563_A3611HisProTc ;
   private byte[] T00563_A3612HisProReo ;
   private int[] T00563_A4439HisProBot ;
   private int[] T00563_A4704HisProNPar ;
   private short[] T00563_A4714HisProNpzs ;
   private String[] T00563_A5339HisProBan ;
   private String[] T00563_A396EmprCod ;
   private int[] T00563_A503GruOpeCod ;
   private int[] T00563_A129BarCod ;
   private boolean[] T00563_n129BarCod ;
   private byte[] T00563_A132BarCodReo ;
   private boolean[] T00563_n132BarCodReo ;
   private String[] T00563_A130BarCodPar ;
   private boolean[] T00563_n130BarCodPar ;
   private short[] T00563_A656ParCod ;
   private boolean[] T00563_n656ParCod ;
   private java.util.Date[] T00563_A558HisProFec ;
   private String[] T00562_A602MaqCod ;
   private boolean[] T00562_n602MaqCod ;
   private int[] T00562_A561HisProLin ;
   private short[] T00562_A194BarOrdLin ;
   private String[] T00562_A461Fase ;
   private java.math.BigDecimal[] T00562_A568HisProUni ;
   private byte[] T00562_A566HisProTur ;
   private byte[] T00562_A560HisProHin ;
   private byte[] T00562_A563HisProMin ;
   private byte[] T00562_A559HisProHfi ;
   private byte[] T00562_A562HisProMfi ;
   private String[] T00562_A557HisProF ;
   private short[] T00562_A565HisProTte ;
   private byte[] T00562_A543HisBarTip ;
   private byte[] T00562_A556HisProEst ;
   private java.math.BigDecimal[] T00562_A1525HisProKgr ;
   private java.math.BigDecimal[] T00562_A1526HisProMtr ;
   private short[] T00562_A2247HisProTip ;
   private String[] T00562_A2504HisProCod ;
   private String[] T00562_A3610HisProLot ;
   private byte[] T00562_A3611HisProTc ;
   private byte[] T00562_A3612HisProReo ;
   private int[] T00562_A4439HisProBot ;
   private int[] T00562_A4704HisProNPar ;
   private short[] T00562_A4714HisProNpzs ;
   private String[] T00562_A5339HisProBan ;
   private String[] T00562_A396EmprCod ;
   private int[] T00562_A503GruOpeCod ;
   private int[] T00562_A129BarCod ;
   private boolean[] T00562_n129BarCod ;
   private byte[] T00562_A132BarCodReo ;
   private boolean[] T00562_n132BarCodReo ;
   private String[] T00562_A130BarCodPar ;
   private boolean[] T00562_n130BarCodPar ;
   private short[] T00562_A656ParCod ;
   private boolean[] T00562_n656ParCod ;
   private java.util.Date[] T00562_A558HisProFec ;
   private int[] T005653_A361DisCod ;
   private String[] T005654_A392DisUniMed ;
   private java.math.BigDecimal[] T005656_A1280BarMla ;
   private java.math.BigDecimal[] T005656_A1279BarKla ;
   private byte[] T005658_A462FasEst ;
   private boolean[] T005658_n462FasEst ;
   private String[] T005660_A307CodFas ;
   private boolean[] T005660_n307CodFas ;
   private String[] T005661_A396EmprCod ;
   private String[] T005661_A602MaqCod ;
   private boolean[] T005661_n602MaqCod ;
   private java.util.Date[] T005661_A558HisProFec ;
   private int[] T005661_A561HisProLin ;
   private String[] T005661_A10501Peh_cod ;
   private String[] T005662_A396EmprCod ;
   private String[] T005662_A602MaqCod ;
   private boolean[] T005662_n602MaqCod ;
   private java.util.Date[] T005662_A558HisProFec ;
   private int[] T005662_A561HisProLin ;
   private String[] T005662_A10495Emh_cod ;
   private String[] T005663_A396EmprCod ;
   private String[] T005663_A602MaqCod ;
   private boolean[] T005663_n602MaqCod ;
   private java.util.Date[] T005663_A558HisProFec ;
   private int[] T005663_A561HisProLin ;
   private String[] T005663_A10487Cah_cod ;
   private String[] T005664_A396EmprCod ;
   private String[] T005664_A602MaqCod ;
   private boolean[] T005664_n602MaqCod ;
   private java.util.Date[] T005664_A558HisProFec ;
   private int[] T005664_A561HisProLin ;
   private String[] T005664_A10486Abh_cod ;
   private String[] T005665_A396EmprCod ;
   private String[] T005665_A602MaqCod ;
   private boolean[] T005665_n602MaqCod ;
   private java.util.Date[] T005665_A558HisProFec ;
   private int[] T005665_A561HisProLin ;
   private String[] T005665_A10090HisProCP ;
   private String[] T005666_A396EmprCod ;
   private String[] T005666_A602MaqCod ;
   private boolean[] T005666_n602MaqCod ;
   private java.util.Date[] T005666_A558HisProFec ;
   private int[] T005666_A561HisProLin ;
   private String[] T005666_A3047LOParId ;
   private String[] T005667_A396EmprCod ;
   private String[] T005667_A602MaqCod ;
   private boolean[] T005667_n602MaqCod ;
   private java.util.Date[] T005667_A558HisProFec ;
   private int[] T005667_A561HisProLin ;
   private String[] T005668_A396EmprCod ;
   private String[] T005669_A396EmprCod ;
   private String[] T005670_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tparpro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparpro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparpro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparpro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00562", "SELECT MaqCod, HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?  FOR UPDATE OF BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00563", "SELECT MaqCod, HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00564", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00565", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00566", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00567", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00569", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod FROM (TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) WHERE (T2.EmprCod = ?) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod ) T1 WHERE T1.MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005611", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM (TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) WHERE (T2.EmprCod = ?) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005613", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005615", "SELECT COALESCE( T1.TotUni, 0) AS TotUni FROM (SELECT SUM(HisProUni) AS TotUni, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE HisProEst <> 9 GROUP BY EmprCod, MaqCod, HisProFec ) T1 WHERE T1.EmprCod = ? AND T1.MaqCod = ? AND T1.HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005616", "SELECT HisProFec, HisProULin, EmprCod, MaqCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?  FOR UPDATE OF HisProULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005617", "SELECT HisProFec, HisProULin, EmprCod, MaqCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005618", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005619", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005621", "SELECT /*+ FIRST_ROWS(100) */ TM1.HisProFec, TM1.HisProULin, T2.EmprNom, TM1.EmprCod, TM1.MaqCod, COALESCE( T3.TotUni, 0) AS TotUni FROM ((TXPCHIPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(HisProUni) AS TotUni, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE HisProEst <> 9 GROUP BY EmprCod, MaqCod, HisProFec ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod AND T3.HisProFec = TM1.HisProFec) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.HisProFec = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.HisProFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005622", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005623", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005625", "SELECT COALESCE( T1.TotUni, 0) AS TotUni FROM (SELECT SUM(HisProUni) AS TotUni, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE HisProEst <> 9 GROUP BY EmprCod, MaqCod, HisProFec ) T1 WHERE T1.EmprCod = ? AND T1.MaqCod = ? AND T1.HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005626", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005627", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and HisProFec > ?) ORDER BY EmprCod, MaqCod, HisProFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005628", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and HisProFec < ?) ORDER BY EmprCod DESC, MaqCod DESC, HisProFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T005629", "INSERT INTO TXPCHIPRO(HisProFec, HisProULin, EmprCod, MaqCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCHIPRO")
         ,new UpdateCursor("T005630", "UPDATE TXPCHIPRO SET HisProULin=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK, "TXPCHIPRO")
         ,new UpdateCursor("T005631", "DELETE FROM TXPCHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK, "TXPCHIPRO")
         ,new ForEachCursor("T005632", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005634", "SELECT COALESCE( T1.TotUni, 0) AS TotUni FROM (SELECT SUM(HisProUni) AS TotUni, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE HisProEst <> 9 GROUP BY EmprCod, MaqCod, HisProFec ) T1 WHERE T1.EmprCod = ? AND T1.MaqCod = ? AND T1.HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005635", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, LOParId FROM TXPLOHisP WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005636", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, HisProFec FROM TXPCHIPRO ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005638", "SELECT T2.DisCod, T1.MaqCod, T1.HisProLin, T1.BarOrdLin, T1.Fase, T1.HisProUni, T1.HisProTur, T1.HisProHin, T1.HisProMin, T1.HisProHfi, T1.HisProMfi, T1.HisProF, T1.HisProTte, T1.HisBarTip, T1.HisProEst, T1.HisProKgr, T1.HisProMtr, T1.HisProTip, T1.HisProCod, T1.HisProLot, T1.HisProTc, T1.HisProReo, T1.HisProBot, T1.HisProNPar, T1.HisProNpzs, T3.DisUniMed, T1.HisProBan, T1.EmprCod, T1.GruOpeCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod, T1.HisProFec, COALESCE( T4.BarMla, 0) AS BarMla, COALESCE( T4.BarKla, 0) AS BarKla FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.MaqCod = ? and T1.HisProLin = ? and T1.EmprCod = ? and T1.HisProFec = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005639", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005640", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005641", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005642", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005644", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005646", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod FROM (TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) WHERE (T2.EmprCod = ?) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod ) T1 WHERE T1.MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005648", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM (TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) WHERE (T2.EmprCod = ?) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005649", "SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T005650", "INSERT INTO TXPLHIPRO(MaqCod, HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod, HisProFec, HisProDTI, HisProDTF, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T005651", "UPDATE TXPLHIPRO SET BarOrdLin=?, Fase=?, HisProUni=?, HisProTur=?, HisProHin=?, HisProMin=?, HisProHfi=?, HisProMfi=?, HisProF=?, HisProTte=?, HisBarTip=?, HisProEst=?, HisProKgr=?, HisProMtr=?, HisProTip=?, HisProCod=?, HisProLot=?, HisProTc=?, HisProReo=?, HisProBot=?, HisProNPar=?, HisProNpzs=?, HisProBan=?, GruOpeCod=?, BarCod=?, BarCodReo=?, BarCodPar=?, ParCod=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T005652", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new ForEachCursor("T005653", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005654", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005656", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005658", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod FROM (TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) WHERE (T2.EmprCod = ?) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod ) T1 WHERE T1.MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005660", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM (TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) WHERE (T2.EmprCod = ?) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005661", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Peh_cod FROM TXPCAPE00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005662", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod FROM TXPCAEM00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005663", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Cah_cod FROM TXPCALA00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005664", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005665", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProCP FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005666", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, LOParId FROM TXPLOHisP WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005667", "SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE MaqCod = ? and EmprCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005668", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005669", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005670", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 15);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((int[]) buf[27])[0] = rslt.getInt(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 1);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 15);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((int[]) buf[27])[0] = rslt.getInt(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 1);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 10);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((String[]) buf[26])[0] = rslt.getString(27, 15);
               ((String[]) buf[27])[0] = rslt.getString(28, 3);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((int[]) buf[29])[0] = rslt.getInt(30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(31);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(33);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(34);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(36,2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 34 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 43 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 54 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setInt(8, ((Number) parms[8]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setDate(6, (java.util.Date)parms[7]);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setDate(6, (java.util.Date)parms[7]);
               return;
            case 21 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               stmt.setDate(4, (java.util.Date)parms[5]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setDate(4, (java.util.Date)parms[4]);
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
            case 31 :
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
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setInt(8, ((Number) parms[8]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setShort(17, ((Number) parms[17]).shortValue());
               stmt.setString(18, (String)parms[18], 8);
               stmt.setString(19, (String)parms[19], 10);
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setInt(22, ((Number) parms[22]).intValue());
               stmt.setInt(23, ((Number) parms[23]).intValue());
               stmt.setShort(24, ((Number) parms[24]).shortValue());
               stmt.setString(25, (String)parms[25], 15);
               stmt.setString(26, (String)parms[26], 3);
               stmt.setInt(27, ((Number) parms[27]).intValue());
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[35]).shortValue());
               }
               stmt.setDate(32, (java.util.Date)parms[36]);
               return;
            case 38 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 10);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 15);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[31]).shortValue());
               }
               stmt.setString(29, (String)parms[32], 3);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[34], 6);
               }
               stmt.setDate(31, (java.util.Date)parms[35]);
               stmt.setInt(32, ((Number) parms[36]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setInt(8, ((Number) parms[8]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 54 :
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
      }
   }

}

