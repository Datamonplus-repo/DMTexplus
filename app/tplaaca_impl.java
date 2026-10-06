package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplaaca_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"PLAMTR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaplamtrVF334( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"PLAKGM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaplakgmVF334( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PLANIFICACION ACABADOS", ""), (short)(0)) ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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

   public tplaaca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplaaca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplaaca_impl.class ));
   }

   public tplaaca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLAACA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "PlaFecTin", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPlaFecTin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPlaFecTin_Internalname, localUtil.format(A2461PlaFecTin, "99/99/99"), localUtil.format( A2461PlaFecTin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPlaFecTin_Jsonclick, 0, "", "", "", "", "", 1, edtPlaFecTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLAACA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPlaFecTin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPlaFecTin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPLAACA.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount334 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_334 = (short)(1) ;
            scanStartVF334( ) ;
            while ( RcdFound334 != 0 )
            {
               init_level_properties334( ) ;
               getByPrimaryKeyVF334( ) ;
               addRowVF334( ) ;
               scanNextVF334( ) ;
            }
            scanEndVF334( ) ;
            nBlankRcdCount334 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalVF334( ) ;
         standaloneModalVF334( ) ;
         sMode334 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRowVF334( ) ;
            edtavnRcdDeleted_334_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_334_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_334_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_334_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtplakgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAKGM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtplakgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtplakgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtplamtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtplamtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtplamtr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlanumpas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLANUMPAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlanumpas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlanumpas_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAOBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaObs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAORDLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaOrdLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP3_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp3_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP4_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp4_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP5_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp5_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTcp6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP6_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp6_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTfLc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTfGc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFGC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTfGc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfGc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTfLF1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLF1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLF1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLF1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTfLF2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLF2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLF2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLF2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaTfGf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFGF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaTfGf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfGf_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_334 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalVF334( ) ;
            }
            sendRowVF334( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode334 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount334 = (short)(5) ;
         nRcdExists_334 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartVF334( ) ;
            while ( RcdFound334 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_45334( ) ;
               init_level_properties334( ) ;
               standaloneNotModalVF334( ) ;
               getByPrimaryKeyVF334( ) ;
               standaloneModalVF334( ) ;
               addRowVF334( ) ;
               scanNextVF334( ) ;
            }
            scanEndVF334( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode334 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_45334( ) ;
      initAllVF334( ) ;
      init_level_properties334( ) ;
      nRcdExists_334 = (short)(0) ;
      nIsMod_334 = (short)(0) ;
      nRcdDeleted_334 = (short)(0) ;
      nBlankRcdCount334 = (short)(nBlankRcdUsr334+nBlankRcdCount334) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount334 > 0 )
      {
         standaloneNotModalVF334( ) ;
         standaloneModalVF334( ) ;
         addRowVF334( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount334 = (short)(nBlankRcdCount334-1) ;
      }
      Gx_mode = sMode334 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLAACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLAACA.htm");
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
         Z2461PlaFecTin = localUtil.ctod( httpContext.cgiGet( "Z2461PlaFecTin"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
         A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( localUtil.vcdate( httpContext.cgiGet( edtPlaFecTin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PLAFECTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPlaFecTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2461PlaFecTin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
         }
         else
         {
            A2461PlaFecTin = localUtil.ctod( httpContext.cgiGet( edtPlaFecTin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
         }
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
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A2461PlaFecTin = localUtil.parseDateParm( httpContext.GetPar( "PlaFecTin")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
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
            initAllVF333( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_334_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_334_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributesVF333( ) ;
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

   public void confirm_VF0( )
   {
      beforeValidateVF333( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsVF333( ) ;
         }
         else
         {
            checkExtendedTableVF333( ) ;
            if ( AnyError == 0 )
            {
               zmVF333( 5) ;
               zmVF333( 6) ;
            }
            closeExtendedTableCursorsVF333( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode333 = Gx_mode ;
         confirm_VF334( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode333 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode333 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesVF0( ) ;
      }
   }

   public void confirm_VF334( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowVF334( ) ;
         if ( ( nRcdExists_334 != 0 ) || ( nIsMod_334 != 0 ) )
         {
            getKeyVF334( ) ;
            if ( ( nRcdExists_334 == 0 ) && ( nRcdDeleted_334 == 0 ) )
            {
               if ( RcdFound334 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateVF334( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableVF334( ) ;
                     if ( AnyError == 0 )
                     {
                        zmVF334( 8) ;
                        zmVF334( 9) ;
                        zmVF334( 10) ;
                     }
                     closeExtendedTableCursorsVF334( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound334 != 0 )
               {
                  if ( nRcdDeleted_334 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyVF334( ) ;
                     loadVF334( ) ;
                     beforeValidateVF334( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsVF334( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_334 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateVF334( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableVF334( ) ;
                           if ( AnyError == 0 )
                           {
                              zmVF334( 8) ;
                              zmVF334( 9) ;
                              zmVF334( 10) ;
                           }
                           closeExtendedTableCursorsVF334( ) ;
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
                  if ( nRcdDeleted_334 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_334_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtplakgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtplamtr_Internalname, GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlanumpas_Internalname, GXutil.ltrim( localUtil.ntoc( A2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaObs_Internalname, A6439PlaObs) ;
         httpContext.changePostValue( edtPlaOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp1_Internalname, GXutil.ltrim( localUtil.ntoc( A6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp2_Internalname, GXutil.ltrim( localUtil.ntoc( A6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp3_Internalname, GXutil.ltrim( localUtil.ntoc( A6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp4_Internalname, GXutil.ltrim( localUtil.ntoc( A6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp5_Internalname, GXutil.ltrim( localUtil.ntoc( A6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp6_Internalname, GXutil.ltrim( localUtil.ntoc( A6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLc_Internalname, GXutil.ltrim( localUtil.ntoc( A6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfGc_Internalname, GXutil.ltrim( localUtil.ntoc( A6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLF1_Internalname, GXutil.ltrim( localUtil.ntoc( A6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLF2_Internalname, GXutil.ltrim( localUtil.ntoc( A6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfGf_Internalname, GXutil.ltrim( localUtil.ntoc( A6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_45_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2463Planumpas_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6440PlaOrdLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6441PlaTcp1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6442PlaTcp2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6443PlaTcp3_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6444PlaTcp4_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6445PlaTcp5_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6446PlaTcp6_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6447PlaTfLc_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6448PlaTfGc_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6449PlaTfLF1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6450PlaTfLF2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6451PlaTfGf_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_334 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_334_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_334_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAKGM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplakgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplamtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLANUMPAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlanumpas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAORDLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP3_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP5_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP6_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFGC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLF1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLF2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFGF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionVF0( )
   {
   }

   public void zmVF333( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -4 )
      {
         Z2461PlaFecTin = A2461PlaFecTin ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
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

   public void loadVF333( )
   {
      /* Using cursor T00VF12 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound333 = (short)(1) ;
         A606MaqDsc = T00VF12_A606MaqDsc[0] ;
         n606MaqDsc = T00VF12_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A407EmprNom = T00VF12_A407EmprNom[0] ;
         n407EmprNom = T00VF12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmVF333( -4) ;
      }
      pr_default.close(9);
      onLoadActionsVF333( ) ;
   }

   public void onLoadActionsVF333( )
   {
   }

   public void checkExtendedTableVF333( )
   {
      nIsDirty_333 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00VF10 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00VF10_A407EmprNom[0] ;
      n407EmprNom = T00VF10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T00VF11 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T00VF11_A606MaqDsc[0] ;
      n606MaqDsc = T00VF11_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(8);
   }

   public void closeExtendedTableCursorsVF333( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T00VF13 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00VF13_A407EmprNom[0] ;
      n407EmprNom = T00VF13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T00VF14 */
      pr_default.execute(11, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T00VF14_A606MaqDsc[0] ;
      n606MaqDsc = T00VF14_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKeyVF333( )
   {
      /* Using cursor T00VF15 */
      pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound333 = (short)(1) ;
      }
      else
      {
         RcdFound333 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00VF9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zmVF333( 4) ;
         RcdFound333 = (short)(1) ;
         A2461PlaFecTin = T00VF9_A2461PlaFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
         A396EmprCod = T00VF9_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T00VF9_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z2461PlaFecTin = A2461PlaFecTin ;
         sMode333 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadVF333( ) ;
         if ( AnyError == 1 )
         {
            RcdFound333 = (short)(0) ;
            initializeNonKeyVF333( ) ;
         }
         Gx_mode = sMode333 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound333 = (short)(0) ;
         initializeNonKeyVF333( ) ;
         sMode333 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode333 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKeyVF333( ) ;
      if ( RcdFound333 == 0 )
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
      RcdFound333 = (short)(0) ;
      /* Using cursor T00VF16 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A2461PlaFecTin});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VF16_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T00VF16_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T00VF16_A2461PlaFecTin[0]).before( GXutil.resetTime( A2461PlaFecTin )) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VF16_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T00VF16_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T00VF16_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T00VF16_A2461PlaFecTin[0]).after( GXutil.resetTime( A2461PlaFecTin )) ) )
         {
            A396EmprCod = T00VF16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T00VF16_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A2461PlaFecTin = T00VF16_A2461PlaFecTin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
            RcdFound333 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound333 = (short)(0) ;
      /* Using cursor T00VF17 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A2461PlaFecTin});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VF17_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T00VF17_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T00VF17_A2461PlaFecTin[0]).after( GXutil.resetTime( A2461PlaFecTin )) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00VF17_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T00VF17_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T00VF17_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T00VF17_A2461PlaFecTin[0]).before( GXutil.resetTime( A2461PlaFecTin )) ) )
         {
            A396EmprCod = T00VF17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T00VF17_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A2461PlaFecTin = T00VF17_A2461PlaFecTin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
            RcdFound333 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyVF333( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertVF333( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound333 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A2461PlaFecTin), GXutil.resetTime(Z2461PlaFecTin)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A2461PlaFecTin = Z2461PlaFecTin ;
               httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
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
               updateVF333( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A2461PlaFecTin), GXutil.resetTime(Z2461PlaFecTin)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertVF333( ) ;
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
                  insertVF333( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A2461PlaFecTin), GXutil.resetTime(Z2461PlaFecTin)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A2461PlaFecTin = Z2461PlaFecTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
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
      getKeyVF333( ) ;
      if ( RcdFound333 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A2461PlaFecTin), GXutil.resetTime(Z2461PlaFecTin)) ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A2461PlaFecTin = Z2461PlaFecTin ;
            httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A2461PlaFecTin), GXutil.resetTime(Z2461PlaFecTin)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplaaca");
   }

   public void insert_check( )
   {
      confirm_VF0( ) ;
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
      if ( RcdFound333 == 0 )
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
      scanStartVF333( ) ;
      if ( RcdFound333 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndVF333( ) ;
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
      if ( RcdFound333 == 0 )
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
      if ( RcdFound333 == 0 )
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
      scanStartVF333( ) ;
      if ( RcdFound333 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound333 != 0 )
         {
            scanNextVF333( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndVF333( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyVF333( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00VF8 */
         pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPLATI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPLATI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertVF333( )
   {
      beforeValidateVF333( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVF333( ) ;
      }
      if ( AnyError == 0 )
      {
         zmVF333( 0) ;
         checkOptimisticConcurrencyVF333( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVF333( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertVF333( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VF18 */
                  pr_default.execute(15, new Object[] {A2461PlaFecTin, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPLATI");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevelVF333( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionVF0( ) ;
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
            loadVF333( ) ;
         }
         endLevelVF333( ) ;
      }
      closeExtendedTableCursorsVF333( ) ;
   }

   public void updateVF333( )
   {
      beforeValidateVF333( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVF333( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVF333( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVF333( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateVF333( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCPLATI */
                  deferredUpdateVF333( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelVF333( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionVF0( ) ;
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
         endLevelVF333( ) ;
      }
      closeExtendedTableCursorsVF333( ) ;
   }

   public void deferredUpdateVF333( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateVF333( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVF333( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsVF333( ) ;
         afterConfirmVF333( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteVF333( ) ;
            if ( AnyError == 0 )
            {
               scanStartVF334( ) ;
               while ( RcdFound334 != 0 )
               {
                  getByPrimaryKeyVF334( ) ;
                  deleteVF334( ) ;
                  scanNextVF334( ) ;
               }
               scanEndVF334( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VF19 */
                  pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPLATI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound333 == 0 )
                        {
                           initAllVF333( ) ;
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
                        resetCaptionVF0( ) ;
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
      sMode333 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelVF333( ) ;
      Gx_mode = sMode333 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsVF333( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00VF20 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T00VF20_A407EmprNom[0] ;
         n407EmprNom = T00VF20_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T00VF21 */
         pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T00VF21_A606MaqDsc[0] ;
         n606MaqDsc = T00VF21_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(18);
      }
   }

   public void processNestedLevelVF334( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowVF334( ) ;
         if ( ( nRcdExists_334 != 0 ) || ( nIsMod_334 != 0 ) )
         {
            standaloneNotModalVF334( ) ;
            getKeyVF334( ) ;
            if ( ( nRcdExists_334 == 0 ) && ( nRcdDeleted_334 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertVF334( ) ;
            }
            else
            {
               if ( RcdFound334 != 0 )
               {
                  if ( ( nRcdDeleted_334 != 0 ) && ( nRcdExists_334 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteVF334( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_334 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateVF334( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_334 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_334_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtplakgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtplamtr_Internalname, GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlanumpas_Internalname, GXutil.ltrim( localUtil.ntoc( A2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaObs_Internalname, A6439PlaObs) ;
         httpContext.changePostValue( edtPlaOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp1_Internalname, GXutil.ltrim( localUtil.ntoc( A6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp2_Internalname, GXutil.ltrim( localUtil.ntoc( A6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp3_Internalname, GXutil.ltrim( localUtil.ntoc( A6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp4_Internalname, GXutil.ltrim( localUtil.ntoc( A6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp5_Internalname, GXutil.ltrim( localUtil.ntoc( A6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTcp6_Internalname, GXutil.ltrim( localUtil.ntoc( A6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLc_Internalname, GXutil.ltrim( localUtil.ntoc( A6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfGc_Internalname, GXutil.ltrim( localUtil.ntoc( A6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLF1_Internalname, GXutil.ltrim( localUtil.ntoc( A6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfLF2_Internalname, GXutil.ltrim( localUtil.ntoc( A6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaTfGf_Internalname, GXutil.ltrim( localUtil.ntoc( A6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_45_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2463Planumpas_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6440PlaOrdLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6441PlaTcp1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6442PlaTcp2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6443PlaTcp3_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6444PlaTcp4_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6445PlaTcp5_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6446PlaTcp6_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6447PlaTfLc_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6448PlaTfGc_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6449PlaTfLF1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6450PlaTfLF2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6451PlaTfGf_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_334_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_334 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_334_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_334_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAKGM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplakgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplamtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLANUMPAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlanumpas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAORDLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP3_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP5_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATCP6_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp6_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFGC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLF1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFLF2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLATFGF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllVF334( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_334 = (short)(0) ;
      nIsMod_334 = (short)(0) ;
      nRcdDeleted_334 = (short)(0) ;
   }

   public void processLevelVF333( )
   {
      /* Save parent mode. */
      sMode333 = Gx_mode ;
      processNestedLevelVF334( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode333 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelVF333( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteVF333( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplaaca");
         if ( AnyError == 0 )
         {
            confirmValuesVF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplaaca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartVF333( )
   {
      /* Using cursor T00VF22 */
      pr_default.execute(19);
      RcdFound333 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound333 = (short)(1) ;
         A396EmprCod = T00VF22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T00VF22_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A2461PlaFecTin = T00VF22_A2461PlaFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextVF333( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound333 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound333 = (short)(1) ;
         A396EmprCod = T00VF22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T00VF22_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A2461PlaFecTin = T00VF22_A2461PlaFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
      }
   }

   public void scanEndVF333( )
   {
      pr_default.close(19);
   }

   public void afterConfirmVF333( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertVF333( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateVF333( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteVF333( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteVF333( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateVF333( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesVF333( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPlaFecTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaFecTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaFecTin_Enabled), 5, 0), true);
   }

   public void zmVF334( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2463Planumpas = T00VF3_A2463Planumpas[0] ;
            Z6440PlaOrdLin = T00VF3_A6440PlaOrdLin[0] ;
            Z6441PlaTcp1 = T00VF3_A6441PlaTcp1[0] ;
            Z6442PlaTcp2 = T00VF3_A6442PlaTcp2[0] ;
            Z6443PlaTcp3 = T00VF3_A6443PlaTcp3[0] ;
            Z6444PlaTcp4 = T00VF3_A6444PlaTcp4[0] ;
            Z6445PlaTcp5 = T00VF3_A6445PlaTcp5[0] ;
            Z6446PlaTcp6 = T00VF3_A6446PlaTcp6[0] ;
            Z6447PlaTfLc = T00VF3_A6447PlaTfLc[0] ;
            Z6448PlaTfGc = T00VF3_A6448PlaTfGc[0] ;
            Z6449PlaTfLF1 = T00VF3_A6449PlaTfLF1[0] ;
            Z6450PlaTfLF2 = T00VF3_A6450PlaTfLF2[0] ;
            Z6451PlaTfGf = T00VF3_A6451PlaTfGf[0] ;
         }
         else
         {
            Z2463Planumpas = A2463Planumpas ;
            Z6440PlaOrdLin = A6440PlaOrdLin ;
            Z6441PlaTcp1 = A6441PlaTcp1 ;
            Z6442PlaTcp2 = A6442PlaTcp2 ;
            Z6443PlaTcp3 = A6443PlaTcp3 ;
            Z6444PlaTcp4 = A6444PlaTcp4 ;
            Z6445PlaTcp5 = A6445PlaTcp5 ;
            Z6446PlaTcp6 = A6446PlaTcp6 ;
            Z6447PlaTfLc = A6447PlaTfLc ;
            Z6448PlaTfGc = A6448PlaTfGc ;
            Z6449PlaTfLF1 = A6449PlaTfLF1 ;
            Z6450PlaTfLF2 = A6450PlaTfLF2 ;
            Z6451PlaTfGf = A6451PlaTfGf ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z602MaqCod = A602MaqCod ;
         Z2463Planumpas = A2463Planumpas ;
         Z6439PlaObs = A6439PlaObs ;
         Z6440PlaOrdLin = A6440PlaOrdLin ;
         Z6441PlaTcp1 = A6441PlaTcp1 ;
         Z6442PlaTcp2 = A6442PlaTcp2 ;
         Z6443PlaTcp3 = A6443PlaTcp3 ;
         Z6444PlaTcp4 = A6444PlaTcp4 ;
         Z6445PlaTcp5 = A6445PlaTcp5 ;
         Z6446PlaTcp6 = A6446PlaTcp6 ;
         Z6447PlaTfLc = A6447PlaTfLc ;
         Z6448PlaTfGc = A6448PlaTfGc ;
         Z6449PlaTfLF1 = A6449PlaTfLF1 ;
         Z6450PlaTfLF2 = A6450PlaTfLF2 ;
         Z6451PlaTfGf = A6451PlaTfGf ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2461PlaFecTin = A2461PlaFecTin ;
         Z361DisCod = A361DisCod ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z365DisDes = A365DisDes ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z199BarPie1 = A199BarPie1 ;
      }
   }

   public void standaloneNotModalVF334( )
   {
   }

   public void standaloneModalVF334( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void loadVF334( )
   {
      /* Using cursor T00VF24 */
      pr_default.execute(20, new Object[] {A602MaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2461PlaFecTin});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound334 = (short)(1) ;
         A6439PlaObs = T00VF24_A6439PlaObs[0] ;
         n6439PlaObs = T00VF24_n6439PlaObs[0] ;
         A361DisCod = T00VF24_A361DisCod[0] ;
         A212BarSer = T00VF24_A212BarSer[0] ;
         A1652BarSerDsc = T00VF24_A1652BarSerDsc[0] ;
         A135BarColNom = T00VF24_A135BarColNom[0] ;
         A136BarColNum = T00VF24_A136BarColNum[0] ;
         A218BarTipCol = T00VF24_A218BarTipCol[0] ;
         A2463Planumpas = T00VF24_A2463Planumpas[0] ;
         n2463Planumpas = T00VF24_n2463Planumpas[0] ;
         A6440PlaOrdLin = T00VF24_A6440PlaOrdLin[0] ;
         n6440PlaOrdLin = T00VF24_n6440PlaOrdLin[0] ;
         A6441PlaTcp1 = T00VF24_A6441PlaTcp1[0] ;
         n6441PlaTcp1 = T00VF24_n6441PlaTcp1[0] ;
         A6442PlaTcp2 = T00VF24_A6442PlaTcp2[0] ;
         n6442PlaTcp2 = T00VF24_n6442PlaTcp2[0] ;
         A6443PlaTcp3 = T00VF24_A6443PlaTcp3[0] ;
         n6443PlaTcp3 = T00VF24_n6443PlaTcp3[0] ;
         A6444PlaTcp4 = T00VF24_A6444PlaTcp4[0] ;
         n6444PlaTcp4 = T00VF24_n6444PlaTcp4[0] ;
         A6445PlaTcp5 = T00VF24_A6445PlaTcp5[0] ;
         n6445PlaTcp5 = T00VF24_n6445PlaTcp5[0] ;
         A6446PlaTcp6 = T00VF24_A6446PlaTcp6[0] ;
         n6446PlaTcp6 = T00VF24_n6446PlaTcp6[0] ;
         A6447PlaTfLc = T00VF24_A6447PlaTfLc[0] ;
         n6447PlaTfLc = T00VF24_n6447PlaTfLc[0] ;
         A6448PlaTfGc = T00VF24_A6448PlaTfGc[0] ;
         n6448PlaTfGc = T00VF24_n6448PlaTfGc[0] ;
         A6449PlaTfLF1 = T00VF24_A6449PlaTfLF1[0] ;
         n6449PlaTfLF1 = T00VF24_n6449PlaTfLF1[0] ;
         A6450PlaTfLF2 = T00VF24_A6450PlaTfLF2[0] ;
         n6450PlaTfLF2 = T00VF24_n6450PlaTfLF2[0] ;
         A6451PlaTfGf = T00VF24_A6451PlaTfGf[0] ;
         n6451PlaTfGf = T00VF24_n6451PlaTfGf[0] ;
         A365DisDes = T00VF24_A365DisDes[0] ;
         A898BarPieNDes = T00VF24_A898BarPieNDes[0] ;
         A199BarPie1 = T00VF24_A199BarPie1[0] ;
         zmVF334( -7) ;
      }
      pr_default.close(20);
      onLoadActionsVF334( ) ;
   }

   public void onLoadActionsVF334( )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      GXt_decimal1 = A3294plamtr ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.core.pponmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A3294plamtr = GXt_decimal1 ;
      GXt_decimal1 = A2462plakgm ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.pponkil(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A2462plakgm = GXt_decimal1 ;
   }

   public void checkExtendedTableVF334( )
   {
      nIsDirty_334 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalVF334( ) ;
      /* Using cursor T00VF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00VF4_A361DisCod[0] ;
      A212BarSer = T00VF4_A212BarSer[0] ;
      A1652BarSerDsc = T00VF4_A1652BarSerDsc[0] ;
      A135BarColNom = T00VF4_A135BarColNom[0] ;
      A136BarColNum = T00VF4_A136BarColNum[0] ;
      A218BarTipCol = T00VF4_A218BarTipCol[0] ;
      pr_default.close(2);
      /* Using cursor T00VF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A365DisDes = T00VF5_A365DisDes[0] ;
      pr_default.close(3);
      /* Using cursor T00VF7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A898BarPieNDes = T00VF7_A898BarPieNDes[0] ;
         A199BarPie1 = T00VF7_A199BarPie1[0] ;
      }
      else
      {
         nIsDirty_334 = (short)(1) ;
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         nIsDirty_334 = (short)(1) ;
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_334 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         nIsDirty_334 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
      }
      nIsDirty_334 = (short)(1) ;
      GXt_decimal1 = A3294plamtr ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.core.pponmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A3294plamtr = GXt_decimal1 ;
      nIsDirty_334 = (short)(1) ;
      GXt_decimal1 = A2462plakgm ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.pponkil(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A2462plakgm = GXt_decimal1 ;
   }

   public void closeExtendedTableCursorsVF334( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisableVF334( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T00VF25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00VF25_A361DisCod[0] ;
      A212BarSer = T00VF25_A212BarSer[0] ;
      A1652BarSerDsc = T00VF25_A1652BarSerDsc[0] ;
      A135BarColNom = T00VF25_A135BarColNom[0] ;
      A136BarColNum = T00VF25_A136BarColNum[0] ;
      A218BarTipCol = T00VF25_A218BarTipCol[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_9( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T00VF26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A365DisDes = T00VF26_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_10( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T00VF28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A898BarPieNDes = T00VF28_A898BarPieNDes[0] ;
         A199BarPie1 = T00VF28_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKeyVF334( )
   {
      /* Using cursor T00VF29 */
      pr_default.execute(24, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound334 = (short)(1) ;
      }
      else
      {
         RcdFound334 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKeyVF334( )
   {
      /* Using cursor T00VF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmVF334( 7) ;
         RcdFound334 = (short)(1) ;
         initializeNonKeyVF334( ) ;
         A6439PlaObs = T00VF3_A6439PlaObs[0] ;
         n6439PlaObs = T00VF3_n6439PlaObs[0] ;
         A2463Planumpas = T00VF3_A2463Planumpas[0] ;
         n2463Planumpas = T00VF3_n2463Planumpas[0] ;
         A6440PlaOrdLin = T00VF3_A6440PlaOrdLin[0] ;
         n6440PlaOrdLin = T00VF3_n6440PlaOrdLin[0] ;
         A6441PlaTcp1 = T00VF3_A6441PlaTcp1[0] ;
         n6441PlaTcp1 = T00VF3_n6441PlaTcp1[0] ;
         A6442PlaTcp2 = T00VF3_A6442PlaTcp2[0] ;
         n6442PlaTcp2 = T00VF3_n6442PlaTcp2[0] ;
         A6443PlaTcp3 = T00VF3_A6443PlaTcp3[0] ;
         n6443PlaTcp3 = T00VF3_n6443PlaTcp3[0] ;
         A6444PlaTcp4 = T00VF3_A6444PlaTcp4[0] ;
         n6444PlaTcp4 = T00VF3_n6444PlaTcp4[0] ;
         A6445PlaTcp5 = T00VF3_A6445PlaTcp5[0] ;
         n6445PlaTcp5 = T00VF3_n6445PlaTcp5[0] ;
         A6446PlaTcp6 = T00VF3_A6446PlaTcp6[0] ;
         n6446PlaTcp6 = T00VF3_n6446PlaTcp6[0] ;
         A6447PlaTfLc = T00VF3_A6447PlaTfLc[0] ;
         n6447PlaTfLc = T00VF3_n6447PlaTfLc[0] ;
         A6448PlaTfGc = T00VF3_A6448PlaTfGc[0] ;
         n6448PlaTfGc = T00VF3_n6448PlaTfGc[0] ;
         A6449PlaTfLF1 = T00VF3_A6449PlaTfLF1[0] ;
         n6449PlaTfLF1 = T00VF3_n6449PlaTfLF1[0] ;
         A6450PlaTfLF2 = T00VF3_A6450PlaTfLF2[0] ;
         n6450PlaTfLF2 = T00VF3_n6450PlaTfLF2[0] ;
         A6451PlaTfGf = T00VF3_A6451PlaTfGf[0] ;
         n6451PlaTfGf = T00VF3_n6451PlaTfGf[0] ;
         A129BarCod = T00VF3_A129BarCod[0] ;
         A132BarCodReo = T00VF3_A132BarCodReo[0] ;
         A130BarCodPar = T00VF3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z2461PlaFecTin = A2461PlaFecTin ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode334 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalVF334( ) ;
         loadVF334( ) ;
         Gx_mode = sMode334 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound334 = (short)(0) ;
         initializeNonKeyVF334( ) ;
         sMode334 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalVF334( ) ;
         Gx_mode = sMode334 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesVF334( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyVF334( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00VF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPLATI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z2463Planumpas != T00VF2_A2463Planumpas[0] ) || ( Z6440PlaOrdLin != T00VF2_A6440PlaOrdLin[0] ) || ( Z6441PlaTcp1 != T00VF2_A6441PlaTcp1[0] ) || ( Z6442PlaTcp2 != T00VF2_A6442PlaTcp2[0] ) || ( Z6443PlaTcp3 != T00VF2_A6443PlaTcp3[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6444PlaTcp4 != T00VF2_A6444PlaTcp4[0] ) || ( Z6445PlaTcp5 != T00VF2_A6445PlaTcp5[0] ) || ( Z6446PlaTcp6 != T00VF2_A6446PlaTcp6[0] ) || ( Z6447PlaTfLc != T00VF2_A6447PlaTfLc[0] ) || ( Z6448PlaTfGc != T00VF2_A6448PlaTfGc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6449PlaTfLF1 != T00VF2_A6449PlaTfLF1[0] ) || ( Z6450PlaTfLF2 != T00VF2_A6450PlaTfLF2[0] ) || ( Z6451PlaTfGf != T00VF2_A6451PlaTfGf[0] ) )
         {
            if ( Z2463Planumpas != T00VF2_A2463Planumpas[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"Planumpas");
               GXutil.writeLogRaw("Old: ",Z2463Planumpas);
               GXutil.writeLogRaw("Current: ",T00VF2_A2463Planumpas[0]);
            }
            if ( Z6440PlaOrdLin != T00VF2_A6440PlaOrdLin[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaOrdLin");
               GXutil.writeLogRaw("Old: ",Z6440PlaOrdLin);
               GXutil.writeLogRaw("Current: ",T00VF2_A6440PlaOrdLin[0]);
            }
            if ( Z6441PlaTcp1 != T00VF2_A6441PlaTcp1[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp1");
               GXutil.writeLogRaw("Old: ",Z6441PlaTcp1);
               GXutil.writeLogRaw("Current: ",T00VF2_A6441PlaTcp1[0]);
            }
            if ( Z6442PlaTcp2 != T00VF2_A6442PlaTcp2[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp2");
               GXutil.writeLogRaw("Old: ",Z6442PlaTcp2);
               GXutil.writeLogRaw("Current: ",T00VF2_A6442PlaTcp2[0]);
            }
            if ( Z6443PlaTcp3 != T00VF2_A6443PlaTcp3[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp3");
               GXutil.writeLogRaw("Old: ",Z6443PlaTcp3);
               GXutil.writeLogRaw("Current: ",T00VF2_A6443PlaTcp3[0]);
            }
            if ( Z6444PlaTcp4 != T00VF2_A6444PlaTcp4[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp4");
               GXutil.writeLogRaw("Old: ",Z6444PlaTcp4);
               GXutil.writeLogRaw("Current: ",T00VF2_A6444PlaTcp4[0]);
            }
            if ( Z6445PlaTcp5 != T00VF2_A6445PlaTcp5[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp5");
               GXutil.writeLogRaw("Old: ",Z6445PlaTcp5);
               GXutil.writeLogRaw("Current: ",T00VF2_A6445PlaTcp5[0]);
            }
            if ( Z6446PlaTcp6 != T00VF2_A6446PlaTcp6[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTcp6");
               GXutil.writeLogRaw("Old: ",Z6446PlaTcp6);
               GXutil.writeLogRaw("Current: ",T00VF2_A6446PlaTcp6[0]);
            }
            if ( Z6447PlaTfLc != T00VF2_A6447PlaTfLc[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTfLc");
               GXutil.writeLogRaw("Old: ",Z6447PlaTfLc);
               GXutil.writeLogRaw("Current: ",T00VF2_A6447PlaTfLc[0]);
            }
            if ( Z6448PlaTfGc != T00VF2_A6448PlaTfGc[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTfGc");
               GXutil.writeLogRaw("Old: ",Z6448PlaTfGc);
               GXutil.writeLogRaw("Current: ",T00VF2_A6448PlaTfGc[0]);
            }
            if ( Z6449PlaTfLF1 != T00VF2_A6449PlaTfLF1[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTfLF1");
               GXutil.writeLogRaw("Old: ",Z6449PlaTfLF1);
               GXutil.writeLogRaw("Current: ",T00VF2_A6449PlaTfLF1[0]);
            }
            if ( Z6450PlaTfLF2 != T00VF2_A6450PlaTfLF2[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTfLF2");
               GXutil.writeLogRaw("Old: ",Z6450PlaTfLF2);
               GXutil.writeLogRaw("Current: ",T00VF2_A6450PlaTfLF2[0]);
            }
            if ( Z6451PlaTfGf != T00VF2_A6451PlaTfGf[0] )
            {
               GXutil.writeLogln("tplaaca:[seudo value changed for attri]"+"PlaTfGf");
               GXutil.writeLogRaw("Old: ",Z6451PlaTfGf);
               GXutil.writeLogRaw("Current: ",T00VF2_A6451PlaTfGf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPLATI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertVF334( )
   {
      beforeValidateVF334( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVF334( ) ;
      }
      if ( AnyError == 0 )
      {
         zmVF334( 0) ;
         checkOptimisticConcurrencyVF334( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmVF334( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertVF334( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00VF30 */
                  pr_default.execute(25, new Object[] {A602MaqCod, Boolean.valueOf(n2463Planumpas), Byte.valueOf(A2463Planumpas), Boolean.valueOf(n6439PlaObs), A6439PlaObs, Boolean.valueOf(n6440PlaOrdLin), Short.valueOf(A6440PlaOrdLin), Boolean.valueOf(n6441PlaTcp1), Short.valueOf(A6441PlaTcp1), Boolean.valueOf(n6442PlaTcp2), Short.valueOf(A6442PlaTcp2), Boolean.valueOf(n6443PlaTcp3), Short.valueOf(A6443PlaTcp3), Boolean.valueOf(n6444PlaTcp4), Short.valueOf(A6444PlaTcp4), Boolean.valueOf(n6445PlaTcp5), Short.valueOf(A6445PlaTcp5), Boolean.valueOf(n6446PlaTcp6), Short.valueOf(A6446PlaTcp6), Boolean.valueOf(n6447PlaTfLc), Short.valueOf(A6447PlaTfLc), Boolean.valueOf(n6448PlaTfGc), Short.valueOf(A6448PlaTfGc), Boolean.valueOf(n6449PlaTfLF1), Short.valueOf(A6449PlaTfLF1), Boolean.valueOf(n6450PlaTfLF2), Short.valueOf(A6450PlaTfLF2), Boolean.valueOf(n6451PlaTfGf), Short.valueOf(A6451PlaTfGf), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2461PlaFecTin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPLATI");
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
            loadVF334( ) ;
         }
         endLevelVF334( ) ;
      }
      closeExtendedTableCursorsVF334( ) ;
   }

   public void updateVF334( )
   {
      beforeValidateVF334( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableVF334( ) ;
      }
      if ( ( nIsMod_334 != 0 ) || ( nIsDirty_334 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyVF334( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmVF334( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateVF334( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00VF31 */
                     pr_default.execute(26, new Object[] {Boolean.valueOf(n2463Planumpas), Byte.valueOf(A2463Planumpas), Boolean.valueOf(n6439PlaObs), A6439PlaObs, Boolean.valueOf(n6440PlaOrdLin), Short.valueOf(A6440PlaOrdLin), Boolean.valueOf(n6441PlaTcp1), Short.valueOf(A6441PlaTcp1), Boolean.valueOf(n6442PlaTcp2), Short.valueOf(A6442PlaTcp2), Boolean.valueOf(n6443PlaTcp3), Short.valueOf(A6443PlaTcp3), Boolean.valueOf(n6444PlaTcp4), Short.valueOf(A6444PlaTcp4), Boolean.valueOf(n6445PlaTcp5), Short.valueOf(A6445PlaTcp5), Boolean.valueOf(n6446PlaTcp6), Short.valueOf(A6446PlaTcp6), Boolean.valueOf(n6447PlaTfLc), Short.valueOf(A6447PlaTfLc), Boolean.valueOf(n6448PlaTfGc), Short.valueOf(A6448PlaTfGc), Boolean.valueOf(n6449PlaTfLF1), Short.valueOf(A6449PlaTfLF1), Boolean.valueOf(n6450PlaTfLF2), Short.valueOf(A6450PlaTfLF2), Boolean.valueOf(n6451PlaTfGf), Short.valueOf(A6451PlaTfGf), A396EmprCod, A602MaqCod, A2461PlaFecTin, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPLATI");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPLATI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateVF334( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyVF334( ) ;
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
            endLevelVF334( ) ;
         }
      }
      closeExtendedTableCursorsVF334( ) ;
   }

   public void deferredUpdateVF334( )
   {
   }

   public void deleteVF334( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateVF334( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyVF334( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsVF334( ) ;
         afterConfirmVF334( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteVF334( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00VF32 */
               pr_default.execute(27, new Object[] {A396EmprCod, A602MaqCod, A2461PlaFecTin, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPLATI");
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
      sMode334 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelVF334( ) ;
      Gx_mode = sMode334 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsVF334( )
   {
      standaloneModalVF334( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00VF33 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T00VF33_A361DisCod[0] ;
         A212BarSer = T00VF33_A212BarSer[0] ;
         A1652BarSerDsc = T00VF33_A1652BarSerDsc[0] ;
         A135BarColNom = T00VF33_A135BarColNom[0] ;
         A136BarColNum = T00VF33_A136BarColNum[0] ;
         A218BarTipCol = T00VF33_A218BarTipCol[0] ;
         pr_default.close(28);
         /* Using cursor T00VF34 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A365DisDes = T00VF34_A365DisDes[0] ;
         pr_default.close(29);
         /* Using cursor T00VF36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            A898BarPieNDes = T00VF36_A898BarPieNDes[0] ;
            A199BarPie1 = T00VF36_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(30);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         GXt_decimal1 = A3294plamtr ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.core.pponmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
         tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
         A3294plamtr = GXt_decimal1 ;
         GXt_decimal1 = A2462plakgm ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.pponkil(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
         tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
         A2462plakgm = GXt_decimal1 ;
      }
   }

   public void endLevelVF334( )
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

   public void scanStartVF334( )
   {
      /* Scan By routine */
      /* Using cursor T00VF37 */
      pr_default.execute(31, new Object[] {A602MaqCod, A396EmprCod, A2461PlaFecTin});
      RcdFound334 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound334 = (short)(1) ;
         A129BarCod = T00VF37_A129BarCod[0] ;
         A132BarCodReo = T00VF37_A132BarCodReo[0] ;
         A130BarCodPar = T00VF37_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextVF334( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound334 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound334 = (short)(1) ;
         A129BarCod = T00VF37_A129BarCod[0] ;
         A132BarCodReo = T00VF37_A132BarCodReo[0] ;
         A130BarCodPar = T00VF37_A130BarCodPar[0] ;
      }
   }

   public void scanEndVF334( )
   {
      pr_default.close(31);
   }

   public void afterConfirmVF334( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertVF334( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateVF334( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteVF334( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteVF334( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateVF334( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesVF334( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtplakgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtplakgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtplakgm_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtplamtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtplamtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtplamtr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlanumpas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlanumpas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlanumpas_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaObs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaOrdLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp3_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp4_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp5_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTcp6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTcp6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTcp6_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTfLc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTfGc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTfGc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfGc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTfLF1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLF1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLF1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTfLF2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTfLF2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfLF2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaTfGf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaTfGf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaTfGf_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashesVF334( )
   {
   }

   public void send_integrity_lvl_hashesVF333( )
   {
   }

   public void subsflControlProps_45334( )
   {
      edtavnRcdDeleted_334_Internalname = "vNRCDDELETED_334_"+sGXsfl_45_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_45_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_45_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_45_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_45_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_45_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_45_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_45_idx ;
      edtplakgm_Internalname = "PLAKGM_"+sGXsfl_45_idx ;
      edtplamtr_Internalname = "PLAMTR_"+sGXsfl_45_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_45_idx ;
      edtBarTipCol_Internalname = "BARTIPCOL_"+sGXsfl_45_idx ;
      edtPlanumpas_Internalname = "PLANUMPAS_"+sGXsfl_45_idx ;
      edtPlaObs_Internalname = "PLAOBS_"+sGXsfl_45_idx ;
      edtPlaOrdLin_Internalname = "PLAORDLIN_"+sGXsfl_45_idx ;
      edtPlaTcp1_Internalname = "PLATCP1_"+sGXsfl_45_idx ;
      edtPlaTcp2_Internalname = "PLATCP2_"+sGXsfl_45_idx ;
      edtPlaTcp3_Internalname = "PLATCP3_"+sGXsfl_45_idx ;
      edtPlaTcp4_Internalname = "PLATCP4_"+sGXsfl_45_idx ;
      edtPlaTcp5_Internalname = "PLATCP5_"+sGXsfl_45_idx ;
      edtPlaTcp6_Internalname = "PLATCP6_"+sGXsfl_45_idx ;
      edtPlaTfLc_Internalname = "PLATFLC_"+sGXsfl_45_idx ;
      edtPlaTfGc_Internalname = "PLATFGC_"+sGXsfl_45_idx ;
      edtPlaTfLF1_Internalname = "PLATFLF1_"+sGXsfl_45_idx ;
      edtPlaTfLF2_Internalname = "PLATFLF2_"+sGXsfl_45_idx ;
      edtPlaTfGf_Internalname = "PLATFGF_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_45334( )
   {
      edtavnRcdDeleted_334_Internalname = "vNRCDDELETED_334_"+sGXsfl_45_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_45_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_45_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_45_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_45_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_45_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_45_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_45_fel_idx ;
      edtplakgm_Internalname = "PLAKGM_"+sGXsfl_45_fel_idx ;
      edtplamtr_Internalname = "PLAMTR_"+sGXsfl_45_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_45_fel_idx ;
      edtBarTipCol_Internalname = "BARTIPCOL_"+sGXsfl_45_fel_idx ;
      edtPlanumpas_Internalname = "PLANUMPAS_"+sGXsfl_45_fel_idx ;
      edtPlaObs_Internalname = "PLAOBS_"+sGXsfl_45_fel_idx ;
      edtPlaOrdLin_Internalname = "PLAORDLIN_"+sGXsfl_45_fel_idx ;
      edtPlaTcp1_Internalname = "PLATCP1_"+sGXsfl_45_fel_idx ;
      edtPlaTcp2_Internalname = "PLATCP2_"+sGXsfl_45_fel_idx ;
      edtPlaTcp3_Internalname = "PLATCP3_"+sGXsfl_45_fel_idx ;
      edtPlaTcp4_Internalname = "PLATCP4_"+sGXsfl_45_fel_idx ;
      edtPlaTcp5_Internalname = "PLATCP5_"+sGXsfl_45_fel_idx ;
      edtPlaTcp6_Internalname = "PLATCP6_"+sGXsfl_45_fel_idx ;
      edtPlaTfLc_Internalname = "PLATFLC_"+sGXsfl_45_fel_idx ;
      edtPlaTfGc_Internalname = "PLATFGC_"+sGXsfl_45_fel_idx ;
      edtPlaTfLF1_Internalname = "PLATFLF1_"+sGXsfl_45_fel_idx ;
      edtPlaTfLF2_Internalname = "PLATFLF2_"+sGXsfl_45_fel_idx ;
      edtPlaTfGf_Internalname = "PLATFGF_"+sGXsfl_45_fel_idx ;
   }

   public void addRowVF334( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45334( ) ;
      sendRowVF334( ) ;
   }

   public void sendRowVF334( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_334_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_334_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_334), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_334), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_334_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_334_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSerDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtplakgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtplakgm_Enabled!=0) ? localUtil.format( A2462plakgm, "ZZZZZ9.99") : localUtil.format( A2462plakgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtplakgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtplakgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtplamtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtplamtr_Enabled!=0) ? localUtil.format( A3294plamtr, "ZZZZZ9.99") : localUtil.format( A3294plamtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtplamtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtplamtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlanumpas_Internalname,GXutil.ltrim( localUtil.ntoc( A2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlanumpas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2463Planumpas), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2463Planumpas), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlanumpas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlanumpas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaObs_Internalname,A6439PlaObs,A6439PlaObs,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6440PlaOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6440PlaOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaOrdLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp1_Internalname,GXutil.ltrim( localUtil.ntoc( A6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6441PlaTcp1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6441PlaTcp1), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp2_Internalname,GXutil.ltrim( localUtil.ntoc( A6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6442PlaTcp2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6442PlaTcp2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp3_Internalname,GXutil.ltrim( localUtil.ntoc( A6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6443PlaTcp3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6443PlaTcp3), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp3_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp4_Internalname,GXutil.ltrim( localUtil.ntoc( A6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6444PlaTcp4), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6444PlaTcp4), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp5_Internalname,GXutil.ltrim( localUtil.ntoc( A6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6445PlaTcp5), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6445PlaTcp5), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp5_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTcp6_Internalname,GXutil.ltrim( localUtil.ntoc( A6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTcp6_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6446PlaTcp6), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6446PlaTcp6), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTcp6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTcp6_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTfLc_Internalname,GXutil.ltrim( localUtil.ntoc( A6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTfLc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6447PlaTfLc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6447PlaTfLc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTfLc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTfLc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTfGc_Internalname,GXutil.ltrim( localUtil.ntoc( A6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTfGc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6448PlaTfGc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6448PlaTfGc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTfGc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTfGc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTfLF1_Internalname,GXutil.ltrim( localUtil.ntoc( A6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTfLF1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6449PlaTfLF1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6449PlaTfLF1), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTfLF1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTfLF1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTfLF2_Internalname,GXutil.ltrim( localUtil.ntoc( A6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTfLF2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6450PlaTfLF2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6450PlaTfLF2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTfLF2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTfLF2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_334_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaTfGf_Internalname,GXutil.ltrim( localUtil.ntoc( A6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaTfGf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6451PlaTfGf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6451PlaTfGf), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaTfGf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaTfGf_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesVF334( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z2463Planumpas_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2463Planumpas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6440PlaOrdLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6440PlaOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6441PlaTcp1_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6441PlaTcp1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6442PlaTcp2_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6442PlaTcp2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6443PlaTcp3_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6443PlaTcp3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6444PlaTcp4_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6444PlaTcp4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6445PlaTcp5_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6445PlaTcp5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6446PlaTcp6_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6446PlaTcp6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6447PlaTfLc_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6447PlaTfLc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6448PlaTfGc_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6448PlaTfGc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6449PlaTfLF1_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6449PlaTfLF1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6450PlaTfLF2_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6450PlaTfLF2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6451PlaTfGf_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6451PlaTfGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_334_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_334_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_334_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_334, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_334_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_334_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAKGM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplakgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtplamtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLANUMPAS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlanumpas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAORDLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP3_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp4_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP5_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp5_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATCP6_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp6_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATFLC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATFGC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATFLF1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATFLF2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLATFGF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowVF334( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45334( ) ;
      edtavnRcdDeleted_334_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_334_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtplakgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAKGM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtplamtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlanumpas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLANUMPAS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAOBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAORDLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP3_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP4_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP5_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTcp6_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATCP6_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTfLc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTfGc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFGC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTfLF1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLF1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTfLF2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFLF2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaTfGf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLATFGF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_334_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_334_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_334");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_334_Internalname ;
         wbErr = true ;
         nRcdDeleted_334 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_334 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_334_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2462plakgm = localUtil.ctond( httpContext.cgiGet( edtplakgm_Internalname)) ;
      A3294plamtr = localUtil.ctond( httpContext.cgiGet( edtplamtr_Internalname)) ;
      A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlanumpas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlanumpas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PLANUMPAS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlanumpas_Internalname ;
         wbErr = true ;
         A2463Planumpas = (byte)(0) ;
         n2463Planumpas = false ;
      }
      else
      {
         A2463Planumpas = (byte)(localUtil.ctol( httpContext.cgiGet( edtPlanumpas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2463Planumpas = false ;
      }
      A6439PlaObs = httpContext.cgiGet( edtPlaObs_Internalname) ;
      n6439PlaObs = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLAORDLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaOrdLin_Internalname ;
         wbErr = true ;
         A6440PlaOrdLin = (short)(0) ;
         n6440PlaOrdLin = false ;
      }
      else
      {
         A6440PlaOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6440PlaOrdLin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP1_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp1_Internalname ;
         wbErr = true ;
         A6441PlaTcp1 = (short)(0) ;
         n6441PlaTcp1 = false ;
      }
      else
      {
         A6441PlaTcp1 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6441PlaTcp1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP2_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp2_Internalname ;
         wbErr = true ;
         A6442PlaTcp2 = (short)(0) ;
         n6442PlaTcp2 = false ;
      }
      else
      {
         A6442PlaTcp2 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6442PlaTcp2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP3_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp3_Internalname ;
         wbErr = true ;
         A6443PlaTcp3 = (short)(0) ;
         n6443PlaTcp3 = false ;
      }
      else
      {
         A6443PlaTcp3 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6443PlaTcp3 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP4_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp4_Internalname ;
         wbErr = true ;
         A6444PlaTcp4 = (short)(0) ;
         n6444PlaTcp4 = false ;
      }
      else
      {
         A6444PlaTcp4 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6444PlaTcp4 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP5_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp5_Internalname ;
         wbErr = true ;
         A6445PlaTcp5 = (short)(0) ;
         n6445PlaTcp5 = false ;
      }
      else
      {
         A6445PlaTcp5 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6445PlaTcp5 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTcp6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATCP6_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTcp6_Internalname ;
         wbErr = true ;
         A6446PlaTcp6 = (short)(0) ;
         n6446PlaTcp6 = false ;
      }
      else
      {
         A6446PlaTcp6 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTcp6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6446PlaTcp6 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATFLC_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTfLc_Internalname ;
         wbErr = true ;
         A6447PlaTfLc = (short)(0) ;
         n6447PlaTfLc = false ;
      }
      else
      {
         A6447PlaTfLc = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTfLc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6447PlaTfLc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfGc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfGc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLATFGC_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTfGc_Internalname ;
         wbErr = true ;
         A6448PlaTfGc = (short)(0) ;
         n6448PlaTfGc = false ;
      }
      else
      {
         A6448PlaTfGc = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTfGc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6448PlaTfGc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLF1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLF1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATFLF1_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTfLF1_Internalname ;
         wbErr = true ;
         A6449PlaTfLF1 = (short)(0) ;
         n6449PlaTfLF1 = false ;
      }
      else
      {
         A6449PlaTfLF1 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTfLF1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6449PlaTfLF1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLF2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfLF2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLATFLF2_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTfLF2_Internalname ;
         wbErr = true ;
         A6450PlaTfLF2 = (short)(0) ;
         n6450PlaTfLF2 = false ;
      }
      else
      {
         A6450PlaTfLF2 = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTfLF2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6450PlaTfLF2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaTfGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLATFGF_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaTfGf_Internalname ;
         wbErr = true ;
         A6451PlaTfGf = (short)(0) ;
         n6451PlaTfGf = false ;
      }
      else
      {
         A6451PlaTfGf = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaTfGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6451PlaTfGf = false ;
      }
      GXCCtl = "Z129BarCod_" + sGXsfl_45_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_45_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_45_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2463Planumpas_" + sGXsfl_45_idx ;
      Z2463Planumpas = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6440PlaOrdLin_" + sGXsfl_45_idx ;
      Z6440PlaOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6441PlaTcp1_" + sGXsfl_45_idx ;
      Z6441PlaTcp1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6442PlaTcp2_" + sGXsfl_45_idx ;
      Z6442PlaTcp2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6443PlaTcp3_" + sGXsfl_45_idx ;
      Z6443PlaTcp3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6444PlaTcp4_" + sGXsfl_45_idx ;
      Z6444PlaTcp4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6445PlaTcp5_" + sGXsfl_45_idx ;
      Z6445PlaTcp5 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6446PlaTcp6_" + sGXsfl_45_idx ;
      Z6446PlaTcp6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6447PlaTfLc_" + sGXsfl_45_idx ;
      Z6447PlaTfLc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6448PlaTfGc_" + sGXsfl_45_idx ;
      Z6448PlaTfGc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6449PlaTfLF1_" + sGXsfl_45_idx ;
      Z6449PlaTfLF1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6450PlaTfLF2_" + sGXsfl_45_idx ;
      Z6450PlaTfLF2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6451PlaTfGf_" + sGXsfl_45_idx ;
      Z6451PlaTfGf = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_334_" + sGXsfl_45_idx ;
      nRcdDeleted_334 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_334_" + sGXsfl_45_idx ;
      nRcdExists_334 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_334_" + sGXsfl_45_idx ;
      nIsMod_334 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValuesVF0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45334( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45334( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z2463Planumpas_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z2463Planumpas_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2463Planumpas_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6440PlaOrdLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6440PlaOrdLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6440PlaOrdLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6441PlaTcp1_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6441PlaTcp1_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6441PlaTcp1_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6442PlaTcp2_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6442PlaTcp2_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6442PlaTcp2_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6443PlaTcp3_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6443PlaTcp3_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6443PlaTcp3_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6444PlaTcp4_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6444PlaTcp4_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6444PlaTcp4_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6445PlaTcp5_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6445PlaTcp5_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6445PlaTcp5_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6446PlaTcp6_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6446PlaTcp6_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6446PlaTcp6_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6447PlaTfLc_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6447PlaTfLc_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6447PlaTfLc_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6448PlaTfGc_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6448PlaTfGc_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6448PlaTfGc_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6449PlaTfLF1_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6449PlaTfLF1_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6449PlaTfLF1_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6450PlaTfLF2_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6450PlaTfLF2_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6450PlaTfLF2_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6451PlaTfGf_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6451PlaTfGf_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6451PlaTfGf_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplaaca", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2461PlaFecTin", localUtil.dtoc( Z2461PlaFecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tplaaca", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLAACA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PLANIFICACION ACABADOS", "") ;
   }

   public void initializeNonKeyVF333( )
   {
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
   }

   public void initAllVF333( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A2461PlaFecTin = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A2461PlaFecTin", localUtil.format(A2461PlaFecTin, "99/99/99"));
      initializeNonKeyVF333( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyVF334( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2462plakgm = DecimalUtil.ZERO ;
      A3294plamtr = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A198BarPie = 0 ;
      A218BarTipCol = (byte)(0) ;
      A2463Planumpas = (byte)(0) ;
      n2463Planumpas = false ;
      A6439PlaObs = "" ;
      n6439PlaObs = false ;
      A6440PlaOrdLin = (short)(0) ;
      n6440PlaOrdLin = false ;
      A6441PlaTcp1 = (short)(0) ;
      n6441PlaTcp1 = false ;
      A6442PlaTcp2 = (short)(0) ;
      n6442PlaTcp2 = false ;
      A6443PlaTcp3 = (short)(0) ;
      n6443PlaTcp3 = false ;
      A6444PlaTcp4 = (short)(0) ;
      n6444PlaTcp4 = false ;
      A6445PlaTcp5 = (short)(0) ;
      n6445PlaTcp5 = false ;
      A6446PlaTcp6 = (short)(0) ;
      n6446PlaTcp6 = false ;
      A6447PlaTfLc = (short)(0) ;
      n6447PlaTfLc = false ;
      A6448PlaTfGc = (short)(0) ;
      n6448PlaTfGc = false ;
      A6449PlaTfLF1 = (short)(0) ;
      n6449PlaTfLF1 = false ;
      A6450PlaTfLF2 = (short)(0) ;
      n6450PlaTfLF2 = false ;
      A6451PlaTfGf = (short)(0) ;
      n6451PlaTfGf = false ;
      A898BarPieNDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A199BarPie1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      Z2463Planumpas = (byte)(0) ;
      Z6440PlaOrdLin = (short)(0) ;
      Z6441PlaTcp1 = (short)(0) ;
      Z6442PlaTcp2 = (short)(0) ;
      Z6443PlaTcp3 = (short)(0) ;
      Z6444PlaTcp4 = (short)(0) ;
      Z6445PlaTcp5 = (short)(0) ;
      Z6446PlaTcp6 = (short)(0) ;
      Z6447PlaTfLc = (short)(0) ;
      Z6448PlaTfGc = (short)(0) ;
      Z6449PlaTfLF1 = (short)(0) ;
      Z6450PlaTfLF2 = (short)(0) ;
      Z6451PlaTfGf = (short)(0) ;
   }

   public void initAllVF334( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKeyVF334( ) ;
   }

   public void standaloneModalInsertVF334( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532814", true, true);
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
      httpContext.AddJavascriptSource("tplaaca.js", "?20268241532814", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties334( )
   {
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_334, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_334_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtplakgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtplamtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2463Planumpas, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlanumpas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A6439PlaObs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6440PlaOrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6441PlaTcp1, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6442PlaTcp2, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6443PlaTcp3, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6444PlaTcp4, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp4_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6445PlaTcp5, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp5_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6446PlaTcp6, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTcp6_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6447PlaTfLc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6448PlaTfGc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6449PlaTfLF1, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6450PlaTfLF2, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfLF2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6451PlaTfGf, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaTfGf_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPlaFecTin_Internalname = "PLAFECTIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_334_Internalname = "vNRCDDELETED_334" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtplakgm_Internalname = "PLAKGM" ;
      edtplamtr_Internalname = "PLAMTR" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtPlanumpas_Internalname = "PLANUMPAS" ;
      edtPlaObs_Internalname = "PLAOBS" ;
      edtPlaOrdLin_Internalname = "PLAORDLIN" ;
      edtPlaTcp1_Internalname = "PLATCP1" ;
      edtPlaTcp2_Internalname = "PLATCP2" ;
      edtPlaTcp3_Internalname = "PLATCP3" ;
      edtPlaTcp4_Internalname = "PLATCP4" ;
      edtPlaTcp5_Internalname = "PLATCP5" ;
      edtPlaTcp6_Internalname = "PLATCP6" ;
      edtPlaTfLc_Internalname = "PLATFLC" ;
      edtPlaTfGc_Internalname = "PLATFGC" ;
      edtPlaTfLF1_Internalname = "PLATFLF1" ;
      edtPlaTfLF2_Internalname = "PLATFLF2" ;
      edtPlaTfGf_Internalname = "PLATFGF" ;
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
      Form.setCaption( httpContext.getMessage( "PLANIFICACION ACABADOS", "") );
      edtPlaTfGf_Jsonclick = "" ;
      edtPlaTfLF2_Jsonclick = "" ;
      edtPlaTfLF1_Jsonclick = "" ;
      edtPlaTfGc_Jsonclick = "" ;
      edtPlaTfLc_Jsonclick = "" ;
      edtPlaTcp6_Jsonclick = "" ;
      edtPlaTcp5_Jsonclick = "" ;
      edtPlaTcp4_Jsonclick = "" ;
      edtPlaTcp3_Jsonclick = "" ;
      edtPlaTcp2_Jsonclick = "" ;
      edtPlaTcp1_Jsonclick = "" ;
      edtPlaOrdLin_Jsonclick = "" ;
      edtPlaObs_Jsonclick = "" ;
      edtPlanumpas_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtplamtr_Jsonclick = "" ;
      edtplakgm_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtavnRcdDeleted_334_Jsonclick = "" ;
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
      edtPlaTfGf_Enabled = 1 ;
      edtPlaTfLF2_Enabled = 1 ;
      edtPlaTfLF1_Enabled = 1 ;
      edtPlaTfGc_Enabled = 1 ;
      edtPlaTfLc_Enabled = 1 ;
      edtPlaTcp6_Enabled = 1 ;
      edtPlaTcp5_Enabled = 1 ;
      edtPlaTcp4_Enabled = 1 ;
      edtPlaTcp3_Enabled = 1 ;
      edtPlaTcp2_Enabled = 1 ;
      edtPlaTcp1_Enabled = 1 ;
      edtPlaOrdLin_Enabled = 1 ;
      edtPlaObs_Enabled = 1 ;
      edtPlanumpas_Enabled = 1 ;
      edtBarTipCol_Enabled = 0 ;
      edtBarPie_Enabled = 0 ;
      edtplamtr_Enabled = 0 ;
      edtplakgm_Enabled = 0 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtavnRcdDeleted_334_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPlaFecTin_Jsonclick = "" ;
      edtPlaFecTin_Backcolor = (int)(0xFFFFFF) ;
      edtPlaFecTin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
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

   public void gx2asaplamtrVF334( String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar )
   {
      GXt_decimal1 = A3294plamtr ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.core.pponmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A3294plamtr = GXt_decimal1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asaplakgmVF334( String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar )
   {
      GXt_decimal1 = A2462plakgm ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.pponkil(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A2462plakgm = GXt_decimal1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_45334( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalVF334( ) ;
         standaloneModalVF334( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowVF334( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45334( ) ;
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
      /* Using cursor T00VF20 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00VF20_A407EmprNom[0] ;
      n407EmprNom = T00VF20_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T00VF21 */
      pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T00VF21_A606MaqDsc[0] ;
      n606MaqDsc = T00VF21_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(18);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00VF20 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00VF20_A407EmprNom[0] ;
      n407EmprNom = T00VF20_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor T00VF21 */
      pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A606MaqDsc = T00VF21_A606MaqDsc[0] ;
      n606MaqDsc = T00VF21_n606MaqDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Plafectin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2461PlaFecTin", localUtil.format(Z2461PlaFecTin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T00VF33 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T00VF33_A361DisCod[0] ;
      A212BarSer = T00VF33_A212BarSer[0] ;
      A1652BarSerDsc = T00VF33_A1652BarSerDsc[0] ;
      A135BarColNom = T00VF33_A135BarColNom[0] ;
      A136BarColNum = T00VF33_A136BarColNum[0] ;
      A218BarTipCol = T00VF33_A218BarTipCol[0] ;
      pr_default.close(28);
      /* Using cursor T00VF34 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A365DisDes = T00VF34_A365DisDes[0] ;
      pr_default.close(29);
      /* Using cursor T00VF36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) != 101) )
      {
         A898BarPieNDes = T00VF36_A898BarPieNDes[0] ;
         A199BarPie1 = T00VF36_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         A199BarPie1 = (short)(0) ;
      }
      pr_default.close(30);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      GXt_decimal1 = A3294plamtr ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.core.pponmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A3294plamtr = GXt_decimal1 ;
      GXt_decimal1 = A2462plakgm ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.pponkil(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal2) ;
      tplaaca_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A2462plakgm = GXt_decimal1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3294plamtr", GXutil.ltrim( localUtil.ntoc( A3294plamtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2462plakgm", GXutil.ltrim( localUtil.ntoc( A2462plakgm, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("VALID_PLAFECTIN","{handler:'valid_Plafectin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2461PlaFecTin',fld:'PLAFECTIN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PLAFECTIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z2461PlaFecTin'},{av:'Z407EmprNom'},{av:'Z606MaqDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A3294plamtr',fld:'PLAMTR',pic:'ZZZZZ9.99'},{av:'A2462plakgm',fld:'PLAKGM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A3294plamtr',fld:'PLAMTR',pic:'ZZZZZ9.99'},{av:'A2462plakgm',fld:'PLAKGM',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("NULL","{handler:'valid_Platfgf',iparms:[]");
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
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z2461PlaFecTin = GXutil.nullDate() ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
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
      A606MaqDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A2461PlaFecTin = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode334 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A365DisDes = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode333 = "" ;
      GXCCtl = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2462plakgm = DecimalUtil.ZERO ;
      A3294plamtr = DecimalUtil.ZERO ;
      A6439PlaObs = "" ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      T00VF12_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF12_A606MaqDsc = new String[] {""} ;
      T00VF12_n606MaqDsc = new boolean[] {false} ;
      T00VF12_A407EmprNom = new String[] {""} ;
      T00VF12_n407EmprNom = new boolean[] {false} ;
      T00VF12_A396EmprCod = new String[] {""} ;
      T00VF12_A602MaqCod = new String[] {""} ;
      T00VF10_A407EmprNom = new String[] {""} ;
      T00VF10_n407EmprNom = new boolean[] {false} ;
      T00VF11_A606MaqDsc = new String[] {""} ;
      T00VF11_n606MaqDsc = new boolean[] {false} ;
      T00VF13_A407EmprNom = new String[] {""} ;
      T00VF13_n407EmprNom = new boolean[] {false} ;
      T00VF14_A606MaqDsc = new String[] {""} ;
      T00VF14_n606MaqDsc = new boolean[] {false} ;
      T00VF15_A396EmprCod = new String[] {""} ;
      T00VF15_A602MaqCod = new String[] {""} ;
      T00VF15_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF9_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF9_A396EmprCod = new String[] {""} ;
      T00VF9_A602MaqCod = new String[] {""} ;
      T00VF16_A396EmprCod = new String[] {""} ;
      T00VF16_A602MaqCod = new String[] {""} ;
      T00VF16_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF17_A396EmprCod = new String[] {""} ;
      T00VF17_A602MaqCod = new String[] {""} ;
      T00VF17_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF8_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF8_A396EmprCod = new String[] {""} ;
      T00VF8_A602MaqCod = new String[] {""} ;
      T00VF20_A407EmprNom = new String[] {""} ;
      T00VF20_n407EmprNom = new boolean[] {false} ;
      T00VF21_A606MaqDsc = new String[] {""} ;
      T00VF21_n606MaqDsc = new boolean[] {false} ;
      T00VF22_A396EmprCod = new String[] {""} ;
      T00VF22_A602MaqCod = new String[] {""} ;
      T00VF22_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      Z6439PlaObs = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z365DisDes = "" ;
      T00VF24_A6439PlaObs = new String[] {""} ;
      T00VF24_n6439PlaObs = new boolean[] {false} ;
      T00VF24_A361DisCod = new int[1] ;
      T00VF24_A602MaqCod = new String[] {""} ;
      T00VF24_A212BarSer = new String[] {""} ;
      T00VF24_A1652BarSerDsc = new String[] {""} ;
      T00VF24_A135BarColNom = new String[] {""} ;
      T00VF24_A136BarColNum = new int[1] ;
      T00VF24_A218BarTipCol = new byte[1] ;
      T00VF24_A2463Planumpas = new byte[1] ;
      T00VF24_n2463Planumpas = new boolean[] {false} ;
      T00VF24_A6440PlaOrdLin = new short[1] ;
      T00VF24_n6440PlaOrdLin = new boolean[] {false} ;
      T00VF24_A6441PlaTcp1 = new short[1] ;
      T00VF24_n6441PlaTcp1 = new boolean[] {false} ;
      T00VF24_A6442PlaTcp2 = new short[1] ;
      T00VF24_n6442PlaTcp2 = new boolean[] {false} ;
      T00VF24_A6443PlaTcp3 = new short[1] ;
      T00VF24_n6443PlaTcp3 = new boolean[] {false} ;
      T00VF24_A6444PlaTcp4 = new short[1] ;
      T00VF24_n6444PlaTcp4 = new boolean[] {false} ;
      T00VF24_A6445PlaTcp5 = new short[1] ;
      T00VF24_n6445PlaTcp5 = new boolean[] {false} ;
      T00VF24_A6446PlaTcp6 = new short[1] ;
      T00VF24_n6446PlaTcp6 = new boolean[] {false} ;
      T00VF24_A6447PlaTfLc = new short[1] ;
      T00VF24_n6447PlaTfLc = new boolean[] {false} ;
      T00VF24_A6448PlaTfGc = new short[1] ;
      T00VF24_n6448PlaTfGc = new boolean[] {false} ;
      T00VF24_A6449PlaTfLF1 = new short[1] ;
      T00VF24_n6449PlaTfLF1 = new boolean[] {false} ;
      T00VF24_A6450PlaTfLF2 = new short[1] ;
      T00VF24_n6450PlaTfLF2 = new boolean[] {false} ;
      T00VF24_A6451PlaTfGf = new short[1] ;
      T00VF24_n6451PlaTfGf = new boolean[] {false} ;
      T00VF24_A365DisDes = new String[] {""} ;
      T00VF24_A396EmprCod = new String[] {""} ;
      T00VF24_A129BarCod = new int[1] ;
      T00VF24_A132BarCodReo = new byte[1] ;
      T00VF24_A130BarCodPar = new String[] {""} ;
      T00VF24_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF24_A898BarPieNDes = new int[1] ;
      T00VF24_A199BarPie1 = new short[1] ;
      T00VF4_A361DisCod = new int[1] ;
      T00VF4_A212BarSer = new String[] {""} ;
      T00VF4_A1652BarSerDsc = new String[] {""} ;
      T00VF4_A135BarColNom = new String[] {""} ;
      T00VF4_A136BarColNum = new int[1] ;
      T00VF4_A218BarTipCol = new byte[1] ;
      T00VF5_A365DisDes = new String[] {""} ;
      T00VF7_A898BarPieNDes = new int[1] ;
      T00VF7_A199BarPie1 = new short[1] ;
      T00VF25_A361DisCod = new int[1] ;
      T00VF25_A212BarSer = new String[] {""} ;
      T00VF25_A1652BarSerDsc = new String[] {""} ;
      T00VF25_A135BarColNom = new String[] {""} ;
      T00VF25_A136BarColNum = new int[1] ;
      T00VF25_A218BarTipCol = new byte[1] ;
      T00VF26_A365DisDes = new String[] {""} ;
      T00VF28_A898BarPieNDes = new int[1] ;
      T00VF28_A199BarPie1 = new short[1] ;
      T00VF29_A396EmprCod = new String[] {""} ;
      T00VF29_A602MaqCod = new String[] {""} ;
      T00VF29_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF29_A129BarCod = new int[1] ;
      T00VF29_A132BarCodReo = new byte[1] ;
      T00VF29_A130BarCodPar = new String[] {""} ;
      T00VF3_A6439PlaObs = new String[] {""} ;
      T00VF3_n6439PlaObs = new boolean[] {false} ;
      T00VF3_A602MaqCod = new String[] {""} ;
      T00VF3_A2463Planumpas = new byte[1] ;
      T00VF3_n2463Planumpas = new boolean[] {false} ;
      T00VF3_A6440PlaOrdLin = new short[1] ;
      T00VF3_n6440PlaOrdLin = new boolean[] {false} ;
      T00VF3_A6441PlaTcp1 = new short[1] ;
      T00VF3_n6441PlaTcp1 = new boolean[] {false} ;
      T00VF3_A6442PlaTcp2 = new short[1] ;
      T00VF3_n6442PlaTcp2 = new boolean[] {false} ;
      T00VF3_A6443PlaTcp3 = new short[1] ;
      T00VF3_n6443PlaTcp3 = new boolean[] {false} ;
      T00VF3_A6444PlaTcp4 = new short[1] ;
      T00VF3_n6444PlaTcp4 = new boolean[] {false} ;
      T00VF3_A6445PlaTcp5 = new short[1] ;
      T00VF3_n6445PlaTcp5 = new boolean[] {false} ;
      T00VF3_A6446PlaTcp6 = new short[1] ;
      T00VF3_n6446PlaTcp6 = new boolean[] {false} ;
      T00VF3_A6447PlaTfLc = new short[1] ;
      T00VF3_n6447PlaTfLc = new boolean[] {false} ;
      T00VF3_A6448PlaTfGc = new short[1] ;
      T00VF3_n6448PlaTfGc = new boolean[] {false} ;
      T00VF3_A6449PlaTfLF1 = new short[1] ;
      T00VF3_n6449PlaTfLF1 = new boolean[] {false} ;
      T00VF3_A6450PlaTfLF2 = new short[1] ;
      T00VF3_n6450PlaTfLF2 = new boolean[] {false} ;
      T00VF3_A6451PlaTfGf = new short[1] ;
      T00VF3_n6451PlaTfGf = new boolean[] {false} ;
      T00VF3_A396EmprCod = new String[] {""} ;
      T00VF3_A129BarCod = new int[1] ;
      T00VF3_A132BarCodReo = new byte[1] ;
      T00VF3_A130BarCodPar = new String[] {""} ;
      T00VF3_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF2_A6439PlaObs = new String[] {""} ;
      T00VF2_n6439PlaObs = new boolean[] {false} ;
      T00VF2_A602MaqCod = new String[] {""} ;
      T00VF2_A2463Planumpas = new byte[1] ;
      T00VF2_n2463Planumpas = new boolean[] {false} ;
      T00VF2_A6440PlaOrdLin = new short[1] ;
      T00VF2_n6440PlaOrdLin = new boolean[] {false} ;
      T00VF2_A6441PlaTcp1 = new short[1] ;
      T00VF2_n6441PlaTcp1 = new boolean[] {false} ;
      T00VF2_A6442PlaTcp2 = new short[1] ;
      T00VF2_n6442PlaTcp2 = new boolean[] {false} ;
      T00VF2_A6443PlaTcp3 = new short[1] ;
      T00VF2_n6443PlaTcp3 = new boolean[] {false} ;
      T00VF2_A6444PlaTcp4 = new short[1] ;
      T00VF2_n6444PlaTcp4 = new boolean[] {false} ;
      T00VF2_A6445PlaTcp5 = new short[1] ;
      T00VF2_n6445PlaTcp5 = new boolean[] {false} ;
      T00VF2_A6446PlaTcp6 = new short[1] ;
      T00VF2_n6446PlaTcp6 = new boolean[] {false} ;
      T00VF2_A6447PlaTfLc = new short[1] ;
      T00VF2_n6447PlaTfLc = new boolean[] {false} ;
      T00VF2_A6448PlaTfGc = new short[1] ;
      T00VF2_n6448PlaTfGc = new boolean[] {false} ;
      T00VF2_A6449PlaTfLF1 = new short[1] ;
      T00VF2_n6449PlaTfLF1 = new boolean[] {false} ;
      T00VF2_A6450PlaTfLF2 = new short[1] ;
      T00VF2_n6450PlaTfLF2 = new boolean[] {false} ;
      T00VF2_A6451PlaTfGf = new short[1] ;
      T00VF2_n6451PlaTfGf = new boolean[] {false} ;
      T00VF2_A396EmprCod = new String[] {""} ;
      T00VF2_A129BarCod = new int[1] ;
      T00VF2_A132BarCodReo = new byte[1] ;
      T00VF2_A130BarCodPar = new String[] {""} ;
      T00VF2_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF33_A361DisCod = new int[1] ;
      T00VF33_A212BarSer = new String[] {""} ;
      T00VF33_A1652BarSerDsc = new String[] {""} ;
      T00VF33_A135BarColNom = new String[] {""} ;
      T00VF33_A136BarColNum = new int[1] ;
      T00VF33_A218BarTipCol = new byte[1] ;
      T00VF34_A365DisDes = new String[] {""} ;
      T00VF36_A898BarPieNDes = new int[1] ;
      T00VF36_A199BarPie1 = new short[1] ;
      T00VF37_A396EmprCod = new String[] {""} ;
      T00VF37_A602MaqCod = new String[] {""} ;
      T00VF37_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00VF37_A129BarCod = new int[1] ;
      T00VF37_A132BarCodReo = new byte[1] ;
      T00VF37_A130BarCodPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ2461PlaFecTin = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ606MaqDsc = "" ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      Z3294plamtr = DecimalUtil.ZERO ;
      Z2462plakgm = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplaaca__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplaaca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplaaca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplaaca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplaaca__default(),
         new Object[] {
             new Object[] {
            T00VF2_A6439PlaObs, T00VF2_n6439PlaObs, T00VF2_A602MaqCod, T00VF2_A2463Planumpas, T00VF2_n2463Planumpas, T00VF2_A6440PlaOrdLin, T00VF2_n6440PlaOrdLin, T00VF2_A6441PlaTcp1, T00VF2_n6441PlaTcp1, T00VF2_A6442PlaTcp2,
            T00VF2_n6442PlaTcp2, T00VF2_A6443PlaTcp3, T00VF2_n6443PlaTcp3, T00VF2_A6444PlaTcp4, T00VF2_n6444PlaTcp4, T00VF2_A6445PlaTcp5, T00VF2_n6445PlaTcp5, T00VF2_A6446PlaTcp6, T00VF2_n6446PlaTcp6, T00VF2_A6447PlaTfLc,
            T00VF2_n6447PlaTfLc, T00VF2_A6448PlaTfGc, T00VF2_n6448PlaTfGc, T00VF2_A6449PlaTfLF1, T00VF2_n6449PlaTfLF1, T00VF2_A6450PlaTfLF2, T00VF2_n6450PlaTfLF2, T00VF2_A6451PlaTfGf, T00VF2_n6451PlaTfGf, T00VF2_A396EmprCod,
            T00VF2_A129BarCod, T00VF2_A132BarCodReo, T00VF2_A130BarCodPar, T00VF2_A2461PlaFecTin
            }
            , new Object[] {
            T00VF3_A6439PlaObs, T00VF3_n6439PlaObs, T00VF3_A602MaqCod, T00VF3_A2463Planumpas, T00VF3_n2463Planumpas, T00VF3_A6440PlaOrdLin, T00VF3_n6440PlaOrdLin, T00VF3_A6441PlaTcp1, T00VF3_n6441PlaTcp1, T00VF3_A6442PlaTcp2,
            T00VF3_n6442PlaTcp2, T00VF3_A6443PlaTcp3, T00VF3_n6443PlaTcp3, T00VF3_A6444PlaTcp4, T00VF3_n6444PlaTcp4, T00VF3_A6445PlaTcp5, T00VF3_n6445PlaTcp5, T00VF3_A6446PlaTcp6, T00VF3_n6446PlaTcp6, T00VF3_A6447PlaTfLc,
            T00VF3_n6447PlaTfLc, T00VF3_A6448PlaTfGc, T00VF3_n6448PlaTfGc, T00VF3_A6449PlaTfLF1, T00VF3_n6449PlaTfLF1, T00VF3_A6450PlaTfLF2, T00VF3_n6450PlaTfLF2, T00VF3_A6451PlaTfGf, T00VF3_n6451PlaTfGf, T00VF3_A396EmprCod,
            T00VF3_A129BarCod, T00VF3_A132BarCodReo, T00VF3_A130BarCodPar, T00VF3_A2461PlaFecTin
            }
            , new Object[] {
            T00VF4_A361DisCod, T00VF4_A212BarSer, T00VF4_A1652BarSerDsc, T00VF4_A135BarColNom, T00VF4_A136BarColNum, T00VF4_A218BarTipCol
            }
            , new Object[] {
            T00VF5_A365DisDes
            }
            , new Object[] {
            T00VF7_A898BarPieNDes, T00VF7_A199BarPie1
            }
            , new Object[] {
            T00VF8_A2461PlaFecTin, T00VF8_A396EmprCod, T00VF8_A602MaqCod
            }
            , new Object[] {
            T00VF9_A2461PlaFecTin, T00VF9_A396EmprCod, T00VF9_A602MaqCod
            }
            , new Object[] {
            T00VF10_A407EmprNom, T00VF10_n407EmprNom
            }
            , new Object[] {
            T00VF11_A606MaqDsc, T00VF11_n606MaqDsc
            }
            , new Object[] {
            T00VF12_A2461PlaFecTin, T00VF12_A606MaqDsc, T00VF12_n606MaqDsc, T00VF12_A407EmprNom, T00VF12_n407EmprNom, T00VF12_A396EmprCod, T00VF12_A602MaqCod
            }
            , new Object[] {
            T00VF13_A407EmprNom, T00VF13_n407EmprNom
            }
            , new Object[] {
            T00VF14_A606MaqDsc, T00VF14_n606MaqDsc
            }
            , new Object[] {
            T00VF15_A396EmprCod, T00VF15_A602MaqCod, T00VF15_A2461PlaFecTin
            }
            , new Object[] {
            T00VF16_A396EmprCod, T00VF16_A602MaqCod, T00VF16_A2461PlaFecTin
            }
            , new Object[] {
            T00VF17_A396EmprCod, T00VF17_A602MaqCod, T00VF17_A2461PlaFecTin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00VF20_A407EmprNom, T00VF20_n407EmprNom
            }
            , new Object[] {
            T00VF21_A606MaqDsc, T00VF21_n606MaqDsc
            }
            , new Object[] {
            T00VF22_A396EmprCod, T00VF22_A602MaqCod, T00VF22_A2461PlaFecTin
            }
            , new Object[] {
            T00VF24_A6439PlaObs, T00VF24_n6439PlaObs, T00VF24_A361DisCod, T00VF24_A602MaqCod, T00VF24_A212BarSer, T00VF24_A1652BarSerDsc, T00VF24_A135BarColNom, T00VF24_A136BarColNum, T00VF24_A218BarTipCol, T00VF24_A2463Planumpas,
            T00VF24_n2463Planumpas, T00VF24_A6440PlaOrdLin, T00VF24_n6440PlaOrdLin, T00VF24_A6441PlaTcp1, T00VF24_n6441PlaTcp1, T00VF24_A6442PlaTcp2, T00VF24_n6442PlaTcp2, T00VF24_A6443PlaTcp3, T00VF24_n6443PlaTcp3, T00VF24_A6444PlaTcp4,
            T00VF24_n6444PlaTcp4, T00VF24_A6445PlaTcp5, T00VF24_n6445PlaTcp5, T00VF24_A6446PlaTcp6, T00VF24_n6446PlaTcp6, T00VF24_A6447PlaTfLc, T00VF24_n6447PlaTfLc, T00VF24_A6448PlaTfGc, T00VF24_n6448PlaTfGc, T00VF24_A6449PlaTfLF1,
            T00VF24_n6449PlaTfLF1, T00VF24_A6450PlaTfLF2, T00VF24_n6450PlaTfLF2, T00VF24_A6451PlaTfGf, T00VF24_n6451PlaTfGf, T00VF24_A365DisDes, T00VF24_A396EmprCod, T00VF24_A129BarCod, T00VF24_A132BarCodReo, T00VF24_A130BarCodPar,
            T00VF24_A2461PlaFecTin, T00VF24_A898BarPieNDes, T00VF24_A199BarPie1
            }
            , new Object[] {
            T00VF25_A361DisCod, T00VF25_A212BarSer, T00VF25_A1652BarSerDsc, T00VF25_A135BarColNom, T00VF25_A136BarColNum, T00VF25_A218BarTipCol
            }
            , new Object[] {
            T00VF26_A365DisDes
            }
            , new Object[] {
            T00VF28_A898BarPieNDes, T00VF28_A199BarPie1
            }
            , new Object[] {
            T00VF29_A396EmprCod, T00VF29_A602MaqCod, T00VF29_A2461PlaFecTin, T00VF29_A129BarCod, T00VF29_A132BarCodReo, T00VF29_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00VF33_A361DisCod, T00VF33_A212BarSer, T00VF33_A1652BarSerDsc, T00VF33_A135BarColNom, T00VF33_A136BarColNum, T00VF33_A218BarTipCol
            }
            , new Object[] {
            T00VF34_A365DisDes
            }
            , new Object[] {
            T00VF36_A898BarPieNDes, T00VF36_A199BarPie1
            }
            , new Object[] {
            T00VF37_A396EmprCod, T00VF37_A602MaqCod, T00VF37_A2461PlaFecTin, T00VF37_A129BarCod, T00VF37_A132BarCodReo, T00VF37_A130BarCodPar
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z2463Planumpas ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A2463Planumpas ;
   private byte Gx_BScreen ;
   private byte Z218BarTipCol ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z6440PlaOrdLin ;
   private short Z6441PlaTcp1 ;
   private short Z6442PlaTcp2 ;
   private short Z6443PlaTcp3 ;
   private short Z6444PlaTcp4 ;
   private short Z6445PlaTcp5 ;
   private short Z6446PlaTcp6 ;
   private short Z6447PlaTfLc ;
   private short Z6448PlaTfGc ;
   private short Z6449PlaTfLF1 ;
   private short Z6450PlaTfLF2 ;
   private short Z6451PlaTfGf ;
   private short nRcdDeleted_334 ;
   private short nRcdExists_334 ;
   private short nIsMod_334 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount334 ;
   private short RcdFound334 ;
   private short nBlankRcdUsr334 ;
   private short A199BarPie1 ;
   private short A6440PlaOrdLin ;
   private short A6441PlaTcp1 ;
   private short A6442PlaTcp2 ;
   private short A6443PlaTcp3 ;
   private short A6444PlaTcp4 ;
   private short A6445PlaTcp5 ;
   private short A6446PlaTcp6 ;
   private short A6447PlaTfLc ;
   private short A6448PlaTfGc ;
   private short A6449PlaTfLF1 ;
   private short A6450PlaTfLF2 ;
   private short A6451PlaTfGf ;
   private short RcdFound333 ;
   private short nIsDirty_333 ;
   private short Z199BarPie1 ;
   private short nIsDirty_334 ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPlaFecTin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_334_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtplakgm_Enabled ;
   private int edtplamtr_Enabled ;
   private int edtBarPie_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtPlanumpas_Enabled ;
   private int edtPlaObs_Enabled ;
   private int edtPlaOrdLin_Enabled ;
   private int edtPlaTcp1_Enabled ;
   private int edtPlaTcp2_Enabled ;
   private int edtPlaTcp3_Enabled ;
   private int edtPlaTcp4_Enabled ;
   private int edtPlaTcp5_Enabled ;
   private int edtPlaTcp6_Enabled ;
   private int edtPlaTfLc_Enabled ;
   private int edtPlaTfGc_Enabled ;
   private int edtPlaTfLF1_Enabled ;
   private int edtPlaTfLF2_Enabled ;
   private int edtPlaTfGf_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A898BarPieNDes ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z136BarColNum ;
   private int Z898BarPieNDes ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPlaFecTin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z198BarPie ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A2462plakgm ;
   private java.math.BigDecimal A3294plamtr ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal Z3294plamtr ;
   private java.math.BigDecimal Z2462plakgm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPlaFecTin_Internalname ;
   private String edtPlaFecTin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode334 ;
   private String edtavnRcdDeleted_334_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtplakgm_Internalname ;
   private String edtplamtr_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtPlanumpas_Internalname ;
   private String edtPlaObs_Internalname ;
   private String edtPlaOrdLin_Internalname ;
   private String edtPlaTcp1_Internalname ;
   private String edtPlaTcp2_Internalname ;
   private String edtPlaTcp3_Internalname ;
   private String edtPlaTcp4_Internalname ;
   private String edtPlaTcp5_Internalname ;
   private String edtPlaTcp6_Internalname ;
   private String edtPlaTfLc_Internalname ;
   private String edtPlaTfGc_Internalname ;
   private String edtPlaTfLF1_Internalname ;
   private String edtPlaTfLF2_Internalname ;
   private String edtPlaTfGf_Internalname ;
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
   private String A365DisDes ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode333 ;
   private String GXCCtl ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String Z407EmprNom ;
   private String Z606MaqDsc ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z365DisDes ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_334_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtplakgm_Jsonclick ;
   private String edtplamtr_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtPlanumpas_Jsonclick ;
   private String edtPlaObs_Jsonclick ;
   private String edtPlaOrdLin_Jsonclick ;
   private String edtPlaTcp1_Jsonclick ;
   private String edtPlaTcp2_Jsonclick ;
   private String edtPlaTcp3_Jsonclick ;
   private String edtPlaTcp4_Jsonclick ;
   private String edtPlaTcp5_Jsonclick ;
   private String edtPlaTcp6_Jsonclick ;
   private String edtPlaTfLc_Jsonclick ;
   private String edtPlaTfGc_Jsonclick ;
   private String edtPlaTfLF1_Jsonclick ;
   private String edtPlaTfLF2_Jsonclick ;
   private String edtPlaTfGf_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private java.util.Date Z2461PlaFecTin ;
   private java.util.Date A2461PlaFecTin ;
   private java.util.Date ZZ2461PlaFecTin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n606MaqDsc ;
   private boolean n407EmprNom ;
   private boolean n6439PlaObs ;
   private boolean n2463Planumpas ;
   private boolean n6440PlaOrdLin ;
   private boolean n6441PlaTcp1 ;
   private boolean n6442PlaTcp2 ;
   private boolean n6443PlaTcp3 ;
   private boolean n6444PlaTcp4 ;
   private boolean n6445PlaTcp5 ;
   private boolean n6446PlaTcp6 ;
   private boolean n6447PlaTfLc ;
   private boolean n6448PlaTfGc ;
   private boolean n6449PlaTfLF1 ;
   private boolean n6450PlaTfLF2 ;
   private boolean n6451PlaTfGf ;
   private boolean Gx_longc ;
   private String A6439PlaObs ;
   private String Z6439PlaObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T00VF12_A2461PlaFecTin ;
   private String[] T00VF12_A606MaqDsc ;
   private boolean[] T00VF12_n606MaqDsc ;
   private String[] T00VF12_A407EmprNom ;
   private boolean[] T00VF12_n407EmprNom ;
   private String[] T00VF12_A396EmprCod ;
   private String[] T00VF12_A602MaqCod ;
   private String[] T00VF10_A407EmprNom ;
   private boolean[] T00VF10_n407EmprNom ;
   private String[] T00VF11_A606MaqDsc ;
   private boolean[] T00VF11_n606MaqDsc ;
   private String[] T00VF13_A407EmprNom ;
   private boolean[] T00VF13_n407EmprNom ;
   private String[] T00VF14_A606MaqDsc ;
   private boolean[] T00VF14_n606MaqDsc ;
   private String[] T00VF15_A396EmprCod ;
   private String[] T00VF15_A602MaqCod ;
   private java.util.Date[] T00VF15_A2461PlaFecTin ;
   private java.util.Date[] T00VF9_A2461PlaFecTin ;
   private String[] T00VF9_A396EmprCod ;
   private String[] T00VF9_A602MaqCod ;
   private String[] T00VF16_A396EmprCod ;
   private String[] T00VF16_A602MaqCod ;
   private java.util.Date[] T00VF16_A2461PlaFecTin ;
   private String[] T00VF17_A396EmprCod ;
   private String[] T00VF17_A602MaqCod ;
   private java.util.Date[] T00VF17_A2461PlaFecTin ;
   private java.util.Date[] T00VF8_A2461PlaFecTin ;
   private String[] T00VF8_A396EmprCod ;
   private String[] T00VF8_A602MaqCod ;
   private String[] T00VF20_A407EmprNom ;
   private boolean[] T00VF20_n407EmprNom ;
   private String[] T00VF21_A606MaqDsc ;
   private boolean[] T00VF21_n606MaqDsc ;
   private String[] T00VF22_A396EmprCod ;
   private String[] T00VF22_A602MaqCod ;
   private java.util.Date[] T00VF22_A2461PlaFecTin ;
   private String[] T00VF24_A6439PlaObs ;
   private boolean[] T00VF24_n6439PlaObs ;
   private int[] T00VF24_A361DisCod ;
   private String[] T00VF24_A602MaqCod ;
   private String[] T00VF24_A212BarSer ;
   private String[] T00VF24_A1652BarSerDsc ;
   private String[] T00VF24_A135BarColNom ;
   private int[] T00VF24_A136BarColNum ;
   private byte[] T00VF24_A218BarTipCol ;
   private byte[] T00VF24_A2463Planumpas ;
   private boolean[] T00VF24_n2463Planumpas ;
   private short[] T00VF24_A6440PlaOrdLin ;
   private boolean[] T00VF24_n6440PlaOrdLin ;
   private short[] T00VF24_A6441PlaTcp1 ;
   private boolean[] T00VF24_n6441PlaTcp1 ;
   private short[] T00VF24_A6442PlaTcp2 ;
   private boolean[] T00VF24_n6442PlaTcp2 ;
   private short[] T00VF24_A6443PlaTcp3 ;
   private boolean[] T00VF24_n6443PlaTcp3 ;
   private short[] T00VF24_A6444PlaTcp4 ;
   private boolean[] T00VF24_n6444PlaTcp4 ;
   private short[] T00VF24_A6445PlaTcp5 ;
   private boolean[] T00VF24_n6445PlaTcp5 ;
   private short[] T00VF24_A6446PlaTcp6 ;
   private boolean[] T00VF24_n6446PlaTcp6 ;
   private short[] T00VF24_A6447PlaTfLc ;
   private boolean[] T00VF24_n6447PlaTfLc ;
   private short[] T00VF24_A6448PlaTfGc ;
   private boolean[] T00VF24_n6448PlaTfGc ;
   private short[] T00VF24_A6449PlaTfLF1 ;
   private boolean[] T00VF24_n6449PlaTfLF1 ;
   private short[] T00VF24_A6450PlaTfLF2 ;
   private boolean[] T00VF24_n6450PlaTfLF2 ;
   private short[] T00VF24_A6451PlaTfGf ;
   private boolean[] T00VF24_n6451PlaTfGf ;
   private String[] T00VF24_A365DisDes ;
   private String[] T00VF24_A396EmprCod ;
   private int[] T00VF24_A129BarCod ;
   private byte[] T00VF24_A132BarCodReo ;
   private String[] T00VF24_A130BarCodPar ;
   private java.util.Date[] T00VF24_A2461PlaFecTin ;
   private int[] T00VF24_A898BarPieNDes ;
   private short[] T00VF24_A199BarPie1 ;
   private int[] T00VF4_A361DisCod ;
   private String[] T00VF4_A212BarSer ;
   private String[] T00VF4_A1652BarSerDsc ;
   private String[] T00VF4_A135BarColNom ;
   private int[] T00VF4_A136BarColNum ;
   private byte[] T00VF4_A218BarTipCol ;
   private String[] T00VF5_A365DisDes ;
   private int[] T00VF7_A898BarPieNDes ;
   private short[] T00VF7_A199BarPie1 ;
   private int[] T00VF25_A361DisCod ;
   private String[] T00VF25_A212BarSer ;
   private String[] T00VF25_A1652BarSerDsc ;
   private String[] T00VF25_A135BarColNom ;
   private int[] T00VF25_A136BarColNum ;
   private byte[] T00VF25_A218BarTipCol ;
   private String[] T00VF26_A365DisDes ;
   private int[] T00VF28_A898BarPieNDes ;
   private short[] T00VF28_A199BarPie1 ;
   private String[] T00VF29_A396EmprCod ;
   private String[] T00VF29_A602MaqCod ;
   private java.util.Date[] T00VF29_A2461PlaFecTin ;
   private int[] T00VF29_A129BarCod ;
   private byte[] T00VF29_A132BarCodReo ;
   private String[] T00VF29_A130BarCodPar ;
   private String[] T00VF3_A6439PlaObs ;
   private boolean[] T00VF3_n6439PlaObs ;
   private String[] T00VF3_A602MaqCod ;
   private byte[] T00VF3_A2463Planumpas ;
   private boolean[] T00VF3_n2463Planumpas ;
   private short[] T00VF3_A6440PlaOrdLin ;
   private boolean[] T00VF3_n6440PlaOrdLin ;
   private short[] T00VF3_A6441PlaTcp1 ;
   private boolean[] T00VF3_n6441PlaTcp1 ;
   private short[] T00VF3_A6442PlaTcp2 ;
   private boolean[] T00VF3_n6442PlaTcp2 ;
   private short[] T00VF3_A6443PlaTcp3 ;
   private boolean[] T00VF3_n6443PlaTcp3 ;
   private short[] T00VF3_A6444PlaTcp4 ;
   private boolean[] T00VF3_n6444PlaTcp4 ;
   private short[] T00VF3_A6445PlaTcp5 ;
   private boolean[] T00VF3_n6445PlaTcp5 ;
   private short[] T00VF3_A6446PlaTcp6 ;
   private boolean[] T00VF3_n6446PlaTcp6 ;
   private short[] T00VF3_A6447PlaTfLc ;
   private boolean[] T00VF3_n6447PlaTfLc ;
   private short[] T00VF3_A6448PlaTfGc ;
   private boolean[] T00VF3_n6448PlaTfGc ;
   private short[] T00VF3_A6449PlaTfLF1 ;
   private boolean[] T00VF3_n6449PlaTfLF1 ;
   private short[] T00VF3_A6450PlaTfLF2 ;
   private boolean[] T00VF3_n6450PlaTfLF2 ;
   private short[] T00VF3_A6451PlaTfGf ;
   private boolean[] T00VF3_n6451PlaTfGf ;
   private String[] T00VF3_A396EmprCod ;
   private int[] T00VF3_A129BarCod ;
   private byte[] T00VF3_A132BarCodReo ;
   private String[] T00VF3_A130BarCodPar ;
   private java.util.Date[] T00VF3_A2461PlaFecTin ;
   private String[] T00VF2_A6439PlaObs ;
   private boolean[] T00VF2_n6439PlaObs ;
   private String[] T00VF2_A602MaqCod ;
   private byte[] T00VF2_A2463Planumpas ;
   private boolean[] T00VF2_n2463Planumpas ;
   private short[] T00VF2_A6440PlaOrdLin ;
   private boolean[] T00VF2_n6440PlaOrdLin ;
   private short[] T00VF2_A6441PlaTcp1 ;
   private boolean[] T00VF2_n6441PlaTcp1 ;
   private short[] T00VF2_A6442PlaTcp2 ;
   private boolean[] T00VF2_n6442PlaTcp2 ;
   private short[] T00VF2_A6443PlaTcp3 ;
   private boolean[] T00VF2_n6443PlaTcp3 ;
   private short[] T00VF2_A6444PlaTcp4 ;
   private boolean[] T00VF2_n6444PlaTcp4 ;
   private short[] T00VF2_A6445PlaTcp5 ;
   private boolean[] T00VF2_n6445PlaTcp5 ;
   private short[] T00VF2_A6446PlaTcp6 ;
   private boolean[] T00VF2_n6446PlaTcp6 ;
   private short[] T00VF2_A6447PlaTfLc ;
   private boolean[] T00VF2_n6447PlaTfLc ;
   private short[] T00VF2_A6448PlaTfGc ;
   private boolean[] T00VF2_n6448PlaTfGc ;
   private short[] T00VF2_A6449PlaTfLF1 ;
   private boolean[] T00VF2_n6449PlaTfLF1 ;
   private short[] T00VF2_A6450PlaTfLF2 ;
   private boolean[] T00VF2_n6450PlaTfLF2 ;
   private short[] T00VF2_A6451PlaTfGf ;
   private boolean[] T00VF2_n6451PlaTfGf ;
   private String[] T00VF2_A396EmprCod ;
   private int[] T00VF2_A129BarCod ;
   private byte[] T00VF2_A132BarCodReo ;
   private String[] T00VF2_A130BarCodPar ;
   private java.util.Date[] T00VF2_A2461PlaFecTin ;
   private int[] T00VF33_A361DisCod ;
   private String[] T00VF33_A212BarSer ;
   private String[] T00VF33_A1652BarSerDsc ;
   private String[] T00VF33_A135BarColNom ;
   private int[] T00VF33_A136BarColNum ;
   private byte[] T00VF33_A218BarTipCol ;
   private String[] T00VF34_A365DisDes ;
   private int[] T00VF36_A898BarPieNDes ;
   private short[] T00VF36_A199BarPie1 ;
   private String[] T00VF37_A396EmprCod ;
   private String[] T00VF37_A602MaqCod ;
   private java.util.Date[] T00VF37_A2461PlaFecTin ;
   private int[] T00VF37_A129BarCod ;
   private byte[] T00VF37_A132BarCodReo ;
   private String[] T00VF37_A130BarCodPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplaaca__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaaca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaaca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaaca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplaaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00VF2", "SELECT PlaObs, MaqCod, Planumpas, PlaOrdLin, PlaTcp1, PlaTcp2, PlaTcp3, PlaTcp4, PlaTcp5, PlaTcp6, PlaTfLc, PlaTfGc, PlaTfLF1, PlaTfLF2, PlaTfGf, EmprCod, BarCod, BarCodReo, BarCodPar, PlaFecTin FROM TXPLPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF Planumpas, PlaObs, PlaOrdLin, PlaTcp1, PlaTcp2, PlaTcp3, PlaTcp4, PlaTcp5, PlaTcp6, PlaTfLc, PlaTfGc, PlaTfLF1, PlaTfLF2, PlaTfGf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF3", "SELECT PlaObs, MaqCod, Planumpas, PlaOrdLin, PlaTcp1, PlaTcp2, PlaTcp3, PlaTcp4, PlaTcp5, PlaTcp6, PlaTfLc, PlaTfGc, PlaTfLF1, PlaTfLF2, PlaTfGf, EmprCod, BarCod, BarCodReo, BarCodPar, PlaFecTin FROM TXPLPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF4", "SELECT DisCod, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF5", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF7", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF8", "SELECT PlaFecTin, EmprCod, MaqCod FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ?  FOR UPDATE OF PlaFecTin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF9", "SELECT PlaFecTin, EmprCod, MaqCod FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF11", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF12", "SELECT /*+ FIRST_ROWS(100) */ TM1.PlaFecTin, T3.MaqDsc, T2.EmprNom, TM1.EmprCod, TM1.MaqCod FROM ((TXPCPLATI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.PlaFecTin = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.PlaFecTin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF14", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and PlaFecTin > ?) ORDER BY EmprCod, MaqCod, PlaFecTin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00VF17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and PlaFecTin < ?) ORDER BY EmprCod DESC, MaqCod DESC, PlaFecTin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00VF18", "INSERT INTO TXPCPLATI(PlaFecTin, EmprCod, MaqCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCPLATI")
         ,new UpdateCursor("T00VF19", "DELETE FROM TXPCPLATI  WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ?", GX_NOMASK, "TXPCPLATI")
         ,new ForEachCursor("T00VF20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF21", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI ORDER BY EmprCod, MaqCod, PlaFecTin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF24", "SELECT T1.PlaObs, T2.DisCod, T1.MaqCod, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.Planumpas, T1.PlaOrdLin, T1.PlaTcp1, T1.PlaTcp2, T1.PlaTcp3, T1.PlaTcp4, T1.PlaTcp5, T1.PlaTcp6, T1.PlaTfLc, T1.PlaTfGc, T1.PlaTfLF1, T1.PlaTfLF2, T1.PlaTfGf, T3.DisDes, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PlaFecTin, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes, COALESCE( T4.BarPie1, 0) AS BarPie1 FROM (((TXPLPLATI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.MaqCod = ? and T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.PlaFecTin = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.PlaFecTin, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF25", "SELECT DisCod, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF26", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF28", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF29", "SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00VF30", "INSERT INTO TXPLPLATI(MaqCod, Planumpas, PlaObs, PlaOrdLin, PlaTcp1, PlaTcp2, PlaTcp3, PlaTcp4, PlaTcp5, PlaTcp6, PlaTfLc, PlaTfGc, PlaTfLF1, PlaTfLF2, PlaTfGf, EmprCod, BarCod, BarCodReo, BarCodPar, PlaFecTin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPLATI")
         ,new UpdateCursor("T00VF31", "UPDATE TXPLPLATI SET Planumpas=?, PlaObs=?, PlaOrdLin=?, PlaTcp1=?, PlaTcp2=?, PlaTcp3=?, PlaTcp4=?, PlaTcp5=?, PlaTcp6=?, PlaTfLc=?, PlaTfGc=?, PlaTfLF1=?, PlaTfLF2=?, PlaTfGf=?  WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLPLATI")
         ,new UpdateCursor("T00VF32", "DELETE FROM TXPLPLATI  WHERE EmprCod = ? AND MaqCod = ? AND PlaFecTin = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLPLATI")
         ,new ForEachCursor("T00VF33", "SELECT DisCod, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF34", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF36", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00VF37", "SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE MaqCod = ? and EmprCod = ? and PlaFecTin = ? ORDER BY EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((byte[]) buf[31])[0] = rslt.getByte(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((byte[]) buf[31])[0] = rslt.getByte(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 1);
               ((String[]) buf[36])[0] = rslt.getString(23, 3);
               ((int[]) buf[37])[0] = rslt.getInt(24);
               ((byte[]) buf[38])[0] = rslt.getByte(25);
               ((String[]) buf[39])[0] = rslt.getString(26, 1);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(27);
               ((int[]) buf[41])[0] = rslt.getInt(28);
               ((short[]) buf[42])[0] = rslt.getShort(29);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 15 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               stmt.setString(16, (String)parms[29], 3);
               stmt.setInt(17, ((Number) parms[30]).intValue());
               stmt.setByte(18, ((Number) parms[31]).byteValue());
               stmt.setString(19, (String)parms[32], 1);
               stmt.setDate(20, (java.util.Date)parms[33]);
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setString(15, (String)parms[28], 3);
               stmt.setString(16, (String)parms[29], 6);
               stmt.setDate(17, (java.util.Date)parms[30]);
               stmt.setInt(18, ((Number) parms[31]).intValue());
               stmt.setByte(19, ((Number) parms[32]).byteValue());
               stmt.setString(20, (String)parms[33], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

