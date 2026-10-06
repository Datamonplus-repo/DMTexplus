package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmetpie_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"METBARMET") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asametbarmet1JZ412( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"METBARKIL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asametbarkil1JZ412( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
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
         gxload_14( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
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
         gxload_15( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "METRAJE DE PIEZAS", ""), (short)(0)) ;
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

   public tmetpie_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmetpie_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmetpie_impl.class ));
   }

   public tmetpie_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkDisDes = UIFactory.getCheckbox(this);
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
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMETPIE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMat_Internalname, GXutil.rtrim( A182BarMat), GXutil.rtrim( localUtil.format( A182BarMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMat_Jsonclick, 0, "", "", "", "", "", 1, edtBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "BarPes", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPes_Internalname, GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPes_Jsonclick, 0, "", "", "", "", "", 1, edtBarPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Total Kilos Metrados", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotKil_Enabled!=0) ? localUtil.format( A2810MetTotKil, "ZZZZZ9.99") : localUtil.format( A2810MetTotKil, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotKil_Jsonclick, 0, "", "", "", "", "", 1, edtMetTotKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Total Metros Metrados", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotMet_Enabled!=0) ? localUtil.format( A2811MetTotMet, "ZZZZZ9.99") : localUtil.format( A2811MetTotMet, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotMet_Jsonclick, 0, "", "", "", "", "", 1, edtMetTotMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Total Piezas Meradas", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotPie_Jsonclick, 0, "", "", "", "", "", 1, edtMetTotPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Desglose", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", "", 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Kilos Hoja de Ruta", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetBarKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2851MetBarKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetBarKil_Enabled!=0) ? localUtil.format( A2851MetBarKil, "ZZZZZ9.99") : localUtil.format( A2851MetBarKil, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetBarKil_Jsonclick, 0, "", "", "", "", "", 1, edtMetBarKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Metros Hoja de Ruta", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetBarMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2852MetBarMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetBarMet_Enabled!=0) ? localUtil.format( A2852MetBarMet, "ZZZZZ9.99") : localUtil.format( A2852MetBarMet, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetBarMet_Jsonclick, 0, "", "", "", "", "", 1, edtMetBarMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Merma Kilos", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetMerKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2849MetMerKil, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetMerKil_Enabled!=0) ? localUtil.format( A2849MetMerKil, "ZZ9.99") : localUtil.format( A2849MetMerKil, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetMerKil_Jsonclick, 0, "", "", "", "", "", 1, edtMetMerKil_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Merma Metros", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetMerMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2850MetMerMet, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetMerMet_Enabled!=0) ? localUtil.format( A2850MetMerMet, "ZZ9.99") : localUtil.format( A2850MetMerMet, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetMerMet_Jsonclick, 0, "", "", "", "", "", 1, edtMetMerMet_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol160( ) ;
      nGXsfl_160_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_413 = (short)(1) ;
            scanStart1JZ413( ) ;
            while ( RcdFound413 != 0 )
            {
               init_level_properties413( ) ;
               getByPrimaryKey1JZ413( ) ;
               addRow1JZ413( ) ;
               scanNext1JZ413( ) ;
            }
            scanEnd1JZ413( ) ;
            nBlankRcdCount413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2811MetTotMet = A2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         B2810MetTotKil = A2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         B2812MetTotPie = A2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         standaloneNotModal1JZ413( ) ;
         standaloneModal1JZ413( ) ;
         sMode413 = Gx_mode ;
         while ( nGXsfl_160_idx < nRC_GXsfl_160 )
         {
            bGXsfl_160_Refreshing = true ;
            readRow1JZ413( ) ;
            edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOB_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOb_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            edtMetPieId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEID_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieId_Enabled), 5, 0), !bGXsfl_160_Refreshing);
            if ( ( nRcdExists_413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JZ413( ) ;
            }
            sendRow1JZ413( ) ;
            bGXsfl_160_Refreshing = false ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2811MetTotMet = B2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = B2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = B2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount413 = (short)(5) ;
         nRcdExists_413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JZ413( ) ;
            while ( RcdFound413 != 0 )
            {
               sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_160413( ) ;
               init_level_properties413( ) ;
               standaloneNotModal1JZ413( ) ;
               getByPrimaryKey1JZ413( ) ;
               standaloneModal1JZ413( ) ;
               addRow1JZ413( ) ;
               scanNext1JZ413( ) ;
            }
            scanEnd1JZ413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode413 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_160413( ) ;
      initAll1JZ413( ) ;
      init_level_properties413( ) ;
      B2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      B2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      B2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
      nBlankRcdCount413 = (short)(nBlankRcdUsr413+nBlankRcdCount413) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount413 > 0 )
      {
         standaloneNotModal1JZ413( ) ;
         standaloneModal1JZ413( ) ;
         addRow1JZ413( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMetPieCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount413 = (short)(nBlankRcdCount413-1) ;
      }
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A2811MetTotMet = B2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2810MetTotKil = B2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      A2812MetTotPie = B2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMETPIE.htm");
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
         Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         O2811MetTotMet = localUtil.ctond( httpContext.cgiGet( "O2811MetTotMet")) ;
         O2810MetTotKil = localUtil.ctond( httpContext.cgiGet( "O2810MetTotKil")) ;
         O2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( "O2812MetTotPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_160 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_160"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2810MetTotKil = localUtil.ctond( httpContext.cgiGet( edtMetTotKil_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = localUtil.ctond( httpContext.cgiGet( edtMetTotMet_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( edtMetTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A2851MetBarKil = localUtil.ctond( httpContext.cgiGet( edtMetBarKil_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
         A2852MetBarMet = localUtil.ctond( httpContext.cgiGet( edtMetBarMet_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
         A2849MetMerKil = localUtil.ctond( httpContext.cgiGet( edtMetMerKil_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         A2850MetMerMet = localUtil.ctond( httpContext.cgiGet( edtMetMerMet_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
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
            A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
            initAll1JZ412( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_160_Refreshing);
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
      disableAttributes1JZ412( ) ;
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

   public void confirm_1JZ0( )
   {
      beforeValidate1JZ412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JZ412( ) ;
         }
         else
         {
            checkExtendedTable1JZ412( ) ;
            if ( AnyError == 0 )
            {
               zm1JZ412( 12) ;
               zm1JZ412( 13) ;
               zm1JZ412( 14) ;
               zm1JZ412( 15) ;
               zm1JZ412( 16) ;
               zm1JZ412( 17) ;
            }
            closeExtendedTableCursors1JZ412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode412 = Gx_mode ;
         confirm_1JZ413( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode412 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1JZ0( ) ;
      }
   }

   public void confirm_1JZ413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      s2850MetMerMet = O2850MetMerMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      s2849MetMerKil = O2849MetMerKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      nGXsfl_160_idx = 0 ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         readRow1JZ413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            getKey1JZ413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               if ( RcdFound413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JZ413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JZ413( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1JZ413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2811MetTotMet = A2811MetTotMet ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                     O2810MetTotKil = A2810MetTotKil ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                     O2812MetTotPie = A2812MetTotPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                     O2850MetMerMet = A2850MetMerMet ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
                     O2849MetMerKil = A2849MetMerKil ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "METPIECOD_" + sGXsfl_160_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMetPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( nRcdDeleted_413 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JZ413( ) ;
                     load1JZ413( ) ;
                     beforeValidate1JZ413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JZ413( ) ;
                        O2811MetTotMet = A2811MetTotMet ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                        O2810MetTotKil = A2810MetTotKil ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                        O2812MetTotPie = A2812MetTotPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                        O2850MetMerMet = A2850MetMerMet ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
                        O2849MetMerKil = A2849MetMerKil ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JZ413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JZ413( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1JZ413( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2811MetTotMet = A2811MetTotMet ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                           O2810MetTotKil = A2810MetTotKil ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                           O2812MetTotPie = A2812MetTotPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                           O2850MetMerMet = A2850MetMerMet ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
                           O2849MetMerKil = A2849MetMerKil ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOb_Internalname, GXutil.rtrim( A10779MetPieOb)) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( edtMetPieId_Internalname, GXutil.rtrim( A10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_160_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_160_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_160_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_160_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_160_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_160_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOB_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEID_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2811MetTotMet = s2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = s2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = s2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      O2850MetMerMet = s2850MetMerMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      O2849MetMerKil = s2849MetMerKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JZ0( )
   {
   }

   public void zm1JZ412( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -11 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z143BarDisNum = A143BarDisNum ;
         Z212BarSer = A212BarSer ;
         Z182BarMat = A182BarMat ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z864BarPes = A864BarPes ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z361DisCod = A361DisCod ;
         Z252CliCod = A252CliCod ;
         Z392DisUniMed = A392DisUniMed ;
         Z365DisDes = A365DisDes ;
         Z279CliNom = A279CliNom ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z199BarPie1 = A199BarPie1 ;
         Z2810MetTotKil = A2810MetTotKil ;
         Z2811MetTotMet = A2811MetTotMet ;
         Z2812MetTotPie = A2812MetTotPie ;
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

   public void load1JZ412( )
   {
      /* Using cursor T01JZ16 */
      pr_default.execute(10, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A143BarDisNum = T01JZ16_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A279CliNom = T01JZ16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T01JZ16_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A182BarMat = T01JZ16_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T01JZ16_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01JZ16_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01JZ16_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A392DisUniMed = T01JZ16_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A864BarPes = T01JZ16_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T01JZ16_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01JZ16_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = T01JZ16_A407EmprNom[0] ;
         n407EmprNom = T01JZ16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A365DisDes = T01JZ16_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A361DisCod = T01JZ16_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A252CliCod = T01JZ16_A252CliCod[0] ;
         n252CliCod = T01JZ16_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2810MetTotKil = T01JZ16_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = T01JZ16_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = T01JZ16_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A898BarPieNDes = T01JZ16_A898BarPieNDes[0] ;
         A199BarPie1 = T01JZ16_A199BarPie1[0] ;
         zm1JZ412( -11) ;
      }
      pr_default.close(10);
      onLoadActions1JZ412( ) ;
   }

   public void onLoadActions1JZ412( )
   {
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      GXt_decimal1 = A2852MetBarMet ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char5[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pmetros(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char2[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char5[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2852MetBarMet = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
      {
         A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      else
      {
         A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      GXt_decimal1 = A2851MetBarKil ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2851MetBarKil = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
      {
         A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      else
      {
         A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
   }

   public void checkExtendedTable1JZ412( )
   {
      nIsDirty_412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01JZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01JZ6_A407EmprNom[0] ;
      n407EmprNom = T01JZ6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01JZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A143BarDisNum = T01JZ7_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A212BarSer = T01JZ7_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A182BarMat = T01JZ7_A182BarMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = T01JZ7_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01JZ7_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01JZ7_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A864BarPes = T01JZ7_A864BarPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = T01JZ7_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = T01JZ7_A120BarAgrEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A361DisCod = T01JZ7_A361DisCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A252CliCod = T01JZ7_A252CliCod[0] ;
      n252CliCod = T01JZ7_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(5);
      /* Using cursor T01JZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01JZ8_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T01JZ8_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      pr_default.close(6);
      /* Using cursor T01JZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01JZ9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01JZ11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A898BarPieNDes = T01JZ11_A898BarPieNDes[0] ;
         A199BarPie1 = T01JZ11_A199BarPie1[0] ;
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         nIsDirty_412 = (short)(1) ;
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(8);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_412 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      /* Using cursor T01JZ13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A2810MetTotKil = T01JZ13_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = T01JZ13_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = T01JZ13_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         nIsDirty_412 = (short)(1) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         nIsDirty_412 = (short)(1) ;
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      pr_default.close(9);
      nIsDirty_412 = (short)(1) ;
      GXt_decimal1 = A2852MetBarMet ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pmetros(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2852MetBarMet = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
      {
         nIsDirty_412 = (short)(1) ;
         A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      nIsDirty_412 = (short)(1) ;
      GXt_decimal1 = A2851MetBarKil ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2851MetBarKil = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
      {
         nIsDirty_412 = (short)(1) ;
         A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
   }

   public void closeExtendedTableCursors1JZ412( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod )
   {
      /* Using cursor T01JZ17 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01JZ17_A407EmprNom[0] ;
      n407EmprNom = T01JZ17_n407EmprNom[0] ;
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

   public void gxload_13( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01JZ18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A143BarDisNum = T01JZ18_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A212BarSer = T01JZ18_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A182BarMat = T01JZ18_A182BarMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = T01JZ18_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01JZ18_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01JZ18_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A864BarPes = T01JZ18_A864BarPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = T01JZ18_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = T01JZ18_A120BarAgrEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A361DisCod = T01JZ18_A361DisCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A252CliCod = T01JZ18_A252CliCod[0] ;
      n252CliCod = T01JZ18_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A143BarDisNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A182BarMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A120BarAgrEst))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_14( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01JZ19 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01JZ19_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T01JZ19_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01JZ20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01JZ20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_16( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01JZ22 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A898BarPieNDes = T01JZ22_A898BarPieNDes[0] ;
         A199BarPie1 = T01JZ22_A199BarPie1[0] ;
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
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_17( String A396EmprCod ,
                          String A2809MetTerCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01JZ24 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A2810MetTotKil = T01JZ24_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = T01JZ24_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = T01JZ24_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1JZ412( )
   {
      /* Using cursor T01JZ25 */
      pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      else
      {
         RcdFound412 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1JZ412( 11) ;
         RcdFound412 = (short)(1) ;
         A2809MetTerCod = T01JZ5_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A396EmprCod = T01JZ5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01JZ5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01JZ5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01JZ5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JZ412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound412 = (short)(0) ;
            initializeNonKey1JZ412( ) ;
         }
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound412 = (short)(0) ;
         initializeNonKey1JZ412( ) ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1JZ412( ) ;
      if ( RcdFound412 == 0 )
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
      RcdFound412 = (short)(0) ;
      /* Using cursor T01JZ26 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ26_A129BarCod[0] < A129BarCod ) || ( T01JZ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ26_A132BarCodReo[0] < A132BarCodReo ) || ( T01JZ26_A132BarCodReo[0] == A132BarCodReo ) && ( T01JZ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ26_A129BarCod[0] > A129BarCod ) || ( T01JZ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ26_A132BarCodReo[0] > A132BarCodReo ) || ( T01JZ26_A132BarCodReo[0] == A132BarCodReo ) && ( T01JZ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ26_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ26_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01JZ26_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01JZ26_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01JZ26_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01JZ26_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01JZ26_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T01JZ27 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ27_A129BarCod[0] > A129BarCod ) || ( T01JZ27_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ27_A132BarCodReo[0] > A132BarCodReo ) || ( T01JZ27_A132BarCodReo[0] == A132BarCodReo ) && ( T01JZ27_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ27_A129BarCod[0] < A129BarCod ) || ( T01JZ27_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JZ27_A132BarCodReo[0] < A132BarCodReo ) || ( T01JZ27_A132BarCodReo[0] == A132BarCodReo ) && ( T01JZ27_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01JZ27_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01JZ27_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01JZ27_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01JZ27_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01JZ27_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01JZ27_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01JZ27_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JZ412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2850MetMerMet = O2850MetMerMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         A2849MetMerKil = O2849MetMerKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JZ412( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound412 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = Z2809MetTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               A2850MetMerMet = O2850MetMerMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
               A2849MetMerKil = O2849MetMerKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
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
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               A2850MetMerMet = O2850MetMerMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
               A2849MetMerKil = O2849MetMerKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
               update1JZ412( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               A2850MetMerMet = O2850MetMerMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
               A2849MetMerKil = O2849MetMerKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JZ412( ) ;
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
                  A2811MetTotMet = O2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  A2810MetTotKil = O2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  A2812MetTotPie = O2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  A2850MetMerMet = O2850MetMerMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
                  A2849MetMerKil = O2849MetMerKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JZ412( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = Z2809MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2850MetMerMet = O2850MetMerMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         A2849MetMerKil = O2849MetMerKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
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
      getKey1JZ412( ) ;
      if ( RcdFound412 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = Z2809MetTerCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmetpie");
   }

   public void insert_check( )
   {
      confirm_1JZ0( ) ;
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
      if ( RcdFound412 == 0 )
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
      scanStart1JZ412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1JZ412( ) ;
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
      if ( RcdFound412 == 0 )
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
      if ( RcdFound412 == 0 )
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
      scanStart1JZ412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound412 != 0 )
         {
            scanNext1JZ412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1JZ412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JZ412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JZ412( )
   {
      beforeValidate1JZ412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JZ412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JZ412( 0) ;
         checkOptimisticConcurrency1JZ412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JZ412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JZ412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JZ28 */
                  pr_default.execute(20, new Object[] {A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(20) == 1) )
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
                        processLevel1JZ412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JZ0( ) ;
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
            load1JZ412( ) ;
         }
         endLevel1JZ412( ) ;
      }
      closeExtendedTableCursors1JZ412( ) ;
   }

   public void update1JZ412( )
   {
      beforeValidate1JZ412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JZ412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JZ412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JZ412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JZ412( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCMETPI */
                  deferredUpdate1JZ412( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JZ412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JZ0( ) ;
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
         endLevel1JZ412( ) ;
      }
      closeExtendedTableCursors1JZ412( ) ;
   }

   public void deferredUpdate1JZ412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JZ412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JZ412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JZ412( ) ;
         afterConfirm1JZ412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JZ412( ) ;
            if ( AnyError == 0 )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               A2850MetMerMet = O2850MetMerMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
               A2849MetMerKil = O2849MetMerKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
               scanStart1JZ413( ) ;
               while ( RcdFound413 != 0 )
               {
                  getByPrimaryKey1JZ413( ) ;
                  delete1JZ413( ) ;
                  scanNext1JZ413( ) ;
                  O2811MetTotMet = A2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  O2810MetTotKil = A2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  O2812MetTotPie = A2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  O2850MetMerMet = A2850MetMerMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
                  O2849MetMerKil = A2849MetMerKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
               }
               scanEnd1JZ413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JZ29 */
                  pr_default.execute(21, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound412 == 0 )
                        {
                           initAll1JZ412( ) ;
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
                        resetCaption1JZ0( ) ;
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
      sMode412 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JZ412( ) ;
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JZ412( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01JZ30 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         A407EmprNom = T01JZ30_A407EmprNom[0] ;
         n407EmprNom = T01JZ30_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(22);
         /* Using cursor T01JZ31 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A143BarDisNum = T01JZ31_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A212BarSer = T01JZ31_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A182BarMat = T01JZ31_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T01JZ31_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01JZ31_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01JZ31_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A864BarPes = T01JZ31_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T01JZ31_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01JZ31_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A361DisCod = T01JZ31_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A252CliCod = T01JZ31_A252CliCod[0] ;
         n252CliCod = T01JZ31_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(23);
         /* Using cursor T01JZ32 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A392DisUniMed = T01JZ32_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A365DisDes = T01JZ32_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         pr_default.close(24);
         /* Using cursor T01JZ33 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01JZ33_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(25);
         /* Using cursor T01JZ35 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A898BarPieNDes = T01JZ35_A898BarPieNDes[0] ;
            A199BarPie1 = T01JZ35_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(26);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         /* Using cursor T01JZ37 */
         pr_default.execute(27, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A2810MetTotKil = T01JZ37_A2810MetTotKil[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            A2811MetTotMet = T01JZ37_A2811MetTotMet[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2812MetTotPie = T01JZ37_A2812MetTotPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2812MetTotPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         pr_default.close(27);
         GXt_decimal1 = A2852MetBarMet ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal6[0] = GXt_decimal1 ;
         new app.pmetros(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
         tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
         tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
         tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
         tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
         tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2852MetBarMet = GXt_decimal1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
         {
            A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         }
         else
         {
            A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         }
         GXt_decimal1 = A2851MetBarKil ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal6[0] = GXt_decimal1 ;
         new app.pkilos(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
         tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
         tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
         tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
         tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
         tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2851MetBarKil = GXt_decimal1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
         {
            A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         }
         else
         {
            A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01JZ38 */
         pr_default.execute(28, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevel1JZ413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      s2850MetMerMet = O2850MetMerMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      s2849MetMerKil = O2849MetMerKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      nGXsfl_160_idx = 0 ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         readRow1JZ413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            standaloneNotModal1JZ413( ) ;
            getKey1JZ413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JZ413( ) ;
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( ( nRcdDeleted_413 != 0 ) && ( nRcdExists_413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JZ413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JZ413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_160_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2811MetTotMet = A2811MetTotMet ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            O2810MetTotKil = A2810MetTotKil ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            O2812MetTotPie = A2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            O2850MetMerMet = A2850MetMerMet ;
            httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
            O2849MetMerKil = A2849MetMerKil ;
            httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOb_Internalname, GXutil.rtrim( A10779MetPieOb)) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( edtMetPieId_Internalname, GXutil.rtrim( A10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_160_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_160_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_160_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_160_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_160_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_160_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_160_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOB_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEID_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JZ413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         O2850MetMerMet = s2850MetMerMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         O2849MetMerKil = s2849MetMerKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
   }

   public void processLevel1JZ412( )
   {
      /* Save parent mode. */
      sMode412 = Gx_mode ;
      processNestedLevel1JZ413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         O2850MetMerMet = s2850MetMerMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         O2849MetMerKil = s2849MetMerKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1JZ412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JZ412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmetpie");
         if ( AnyError == 0 )
         {
            confirmValues1JZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmetpie");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JZ412( )
   {
      /* Using cursor T01JZ39 */
      pr_default.execute(29);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01JZ39_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01JZ39_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01JZ39_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01JZ39_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01JZ39_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JZ412( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01JZ39_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01JZ39_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01JZ39_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01JZ39_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01JZ39_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1JZ412( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1JZ412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JZ412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JZ412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JZ412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JZ412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JZ412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JZ412( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMetTotKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotKil_Enabled), 5, 0), true);
      edtMetTotMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotMet_Enabled), 5, 0), true);
      edtMetTotPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotPie_Enabled), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtMetBarKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetBarKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetBarKil_Enabled), 5, 0), true);
      edtMetBarMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetBarMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetBarMet_Enabled), 5, 0), true);
      edtMetMerKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetMerKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetMerKil_Enabled), 5, 0), true);
      edtMetMerMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetMerMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetMerMet_Enabled), 5, 0), true);
   }

   public void zm1JZ413( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01JZ3_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01JZ3_A2815MetPieMet[0] ;
            Z2816MetPieEst = T01JZ3_A2816MetPieEst[0] ;
            Z2846MetPieDsc = T01JZ3_A2846MetPieDsc[0] ;
            Z4909MetPieDef = T01JZ3_A4909MetPieDef[0] ;
            Z5136MetPieFch = T01JZ3_A5136MetPieFch[0] ;
            Z6635MetPieAnc = T01JZ3_A6635MetPieAnc[0] ;
            Z10779MetPieOb = T01JZ3_A10779MetPieOb[0] ;
            Z10780MetPiectr = T01JZ3_A10780MetPiectr[0] ;
            Z10784MetPieId = T01JZ3_A10784MetPieId[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z5136MetPieFch = A5136MetPieFch ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z10779MetPieOb = A10779MetPieOb ;
            Z10780MetPiectr = A10780MetPiectr ;
            Z10784MetPieId = A10784MetPieId ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z10779MetPieOb = A10779MetPieOb ;
         Z10780MetPiectr = A10780MetPiectr ;
         Z10784MetPieId = A10784MetPieId ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1JZ413( )
   {
   }

   public void standaloneModal1JZ413( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      }
   }

   public void load1JZ413( )
   {
      /* Using cursor T01JZ40 */
      pr_default.execute(30, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01JZ40_A2814MetPieKil[0] ;
         A2815MetPieMet = T01JZ40_A2815MetPieMet[0] ;
         A2816MetPieEst = T01JZ40_A2816MetPieEst[0] ;
         A2846MetPieDsc = T01JZ40_A2846MetPieDsc[0] ;
         A4909MetPieDef = T01JZ40_A4909MetPieDef[0] ;
         A5136MetPieFch = T01JZ40_A5136MetPieFch[0] ;
         A6635MetPieAnc = T01JZ40_A6635MetPieAnc[0] ;
         A10779MetPieOb = T01JZ40_A10779MetPieOb[0] ;
         A10780MetPiectr = T01JZ40_A10780MetPiectr[0] ;
         A10784MetPieId = T01JZ40_A10784MetPieId[0] ;
         zm1JZ413( -18) ;
      }
      pr_default.close(30);
      onLoadActions1JZ413( ) ;
   }

   public void onLoadActions1JZ413( )
   {
      if ( isIns( )  )
      {
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
      {
         A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      else
      {
         A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      if ( isIns( )  )
      {
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
      {
         A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      else
      {
         A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
   }

   public void checkExtendedTable1JZ413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1JZ413( ) ;
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
      {
         nIsDirty_413 = (short)(1) ;
         A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      else
      {
         nIsDirty_413 = (short)(1) ;
         A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
      {
         nIsDirty_413 = (short)(1) ;
         A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
      else
      {
         nIsDirty_413 = (short)(1) ;
         A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      }
   }

   public void closeExtendedTableCursors1JZ413( )
   {
   }

   public void enableDisable1JZ413( )
   {
   }

   public void getKey1JZ413( )
   {
      /* Using cursor T01JZ41 */
      pr_default.execute(31, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey1JZ413( )
   {
      /* Using cursor T01JZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1JZ413( 18) ;
         RcdFound413 = (short)(1) ;
         initializeNonKey1JZ413( ) ;
         A2813MetPieCod = T01JZ3_A2813MetPieCod[0] ;
         A2814MetPieKil = T01JZ3_A2814MetPieKil[0] ;
         A2815MetPieMet = T01JZ3_A2815MetPieMet[0] ;
         A2816MetPieEst = T01JZ3_A2816MetPieEst[0] ;
         A2846MetPieDsc = T01JZ3_A2846MetPieDsc[0] ;
         A4909MetPieDef = T01JZ3_A4909MetPieDef[0] ;
         A5136MetPieFch = T01JZ3_A5136MetPieFch[0] ;
         A6635MetPieAnc = T01JZ3_A6635MetPieAnc[0] ;
         A10779MetPieOb = T01JZ3_A10779MetPieOb[0] ;
         A10780MetPiectr = T01JZ3_A10780MetPiectr[0] ;
         A10784MetPieId = T01JZ3_A10784MetPieId[0] ;
         O2815MetPieMet = A2815MetPieMet ;
         O2814MetPieKil = A2814MetPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JZ413( ) ;
         load1JZ413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1JZ413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JZ413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JZ413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JZ413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01JZ2_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01JZ2_A2815MetPieMet[0]) != 0 ) || ( Z2816MetPieEst != T01JZ2_A2816MetPieEst[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T01JZ2_A2846MetPieDsc[0]) != 0 ) || ( Z4909MetPieDef != T01JZ2_A4909MetPieDef[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01JZ2_A5136MetPieFch[0])) ) || ( Z6635MetPieAnc != T01JZ2_A6635MetPieAnc[0] ) || ( GXutil.strcmp(Z10779MetPieOb, T01JZ2_A10779MetPieOb[0]) != 0 ) || ( GXutil.strcmp(Z10780MetPiectr, T01JZ2_A10780MetPiectr[0]) != 0 ) || ( GXutil.strcmp(Z10784MetPieId, T01JZ2_A10784MetPieId[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01JZ2_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01JZ2_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01JZ2_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01JZ2_A2815MetPieMet[0]);
            }
            if ( Z2816MetPieEst != T01JZ2_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01JZ2_A2816MetPieEst[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T01JZ2_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T01JZ2_A2846MetPieDsc[0]);
            }
            if ( Z4909MetPieDef != T01JZ2_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01JZ2_A4909MetPieDef[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01JZ2_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T01JZ2_A5136MetPieFch[0]);
            }
            if ( Z6635MetPieAnc != T01JZ2_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01JZ2_A6635MetPieAnc[0]);
            }
            if ( GXutil.strcmp(Z10779MetPieOb, T01JZ2_A10779MetPieOb[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieOb");
               GXutil.writeLogRaw("Old: ",Z10779MetPieOb);
               GXutil.writeLogRaw("Current: ",T01JZ2_A10779MetPieOb[0]);
            }
            if ( GXutil.strcmp(Z10780MetPiectr, T01JZ2_A10780MetPiectr[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPiectr");
               GXutil.writeLogRaw("Old: ",Z10780MetPiectr);
               GXutil.writeLogRaw("Current: ",T01JZ2_A10780MetPiectr[0]);
            }
            if ( GXutil.strcmp(Z10784MetPieId, T01JZ2_A10784MetPieId[0]) != 0 )
            {
               GXutil.writeLogln("tmetpie:[seudo value changed for attri]"+"MetPieId");
               GXutil.writeLogRaw("Old: ",Z10784MetPieId);
               GXutil.writeLogRaw("Current: ",T01JZ2_A10784MetPieId[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JZ413( )
   {
      beforeValidate1JZ413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JZ413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JZ413( 0) ;
         checkOptimisticConcurrency1JZ413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JZ413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JZ413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JZ42 */
                  pr_default.execute(32, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A2846MetPieDsc, Short.valueOf(A4909MetPieDef), A5136MetPieFch, Short.valueOf(A6635MetPieAnc), A10779MetPieOb, A10780MetPiectr, A10784MetPieId, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(32) == 1) )
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
            load1JZ413( ) ;
         }
         endLevel1JZ413( ) ;
      }
      closeExtendedTableCursors1JZ413( ) ;
   }

   public void update1JZ413( )
   {
      beforeValidate1JZ413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JZ413( ) ;
      }
      if ( ( nIsMod_413 != 0 ) || ( nIsDirty_413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JZ413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JZ413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JZ413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01JZ43 */
                     pr_default.execute(33, new Object[] {A2814MetPieKil, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A2846MetPieDsc, Short.valueOf(A4909MetPieDef), A5136MetPieFch, Short.valueOf(A6635MetPieAnc), A10779MetPieOb, A10780MetPiectr, A10784MetPieId, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1JZ413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JZ413( ) ;
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
            endLevel1JZ413( ) ;
         }
      }
      closeExtendedTableCursors1JZ413( ) ;
   }

   public void deferredUpdate1JZ413( )
   {
   }

   public void delete1JZ413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JZ413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JZ413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JZ413( ) ;
         afterConfirm1JZ413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JZ413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JZ44 */
               pr_default.execute(34, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JZ413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JZ413( )
   {
      standaloneModal1JZ413( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A2812MetTotPie = (short)(O2812MetTotPie+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2812MetTotPie = (short)(O2812MetTotPie-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
         {
            A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         }
         else
         {
            A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
         }
         if ( isIns( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
         {
            A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         }
         else
         {
            A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01JZ45 */
         pr_default.execute(35, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void endLevel1JZ413( )
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

   public void scanStart1JZ413( )
   {
      /* Scan By routine */
      /* Using cursor T01JZ46 */
      pr_default.execute(36, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01JZ46_A2813MetPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JZ413( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01JZ46_A2813MetPieCod[0] ;
      }
   }

   public void scanEnd1JZ413( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1JZ413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JZ413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JZ413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JZ413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JZ413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JZ413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JZ413( )
   {
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOb_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPiectr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_160_Refreshing);
      edtMetPieId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieId_Enabled), 5, 0), !bGXsfl_160_Refreshing);
   }

   public void send_integrity_lvl_hashes1JZ413( )
   {
   }

   public void send_integrity_lvl_hashes1JZ412( )
   {
   }

   public void subsflControlProps_160413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_160_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_160_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_160_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_160_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_160_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_160_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_160_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_160_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_160_idx ;
      edtMetPieOb_Internalname = "METPIEOB_"+sGXsfl_160_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_160_idx ;
      edtMetPieId_Internalname = "METPIEID_"+sGXsfl_160_idx ;
   }

   public void subsflControlProps_fel_160413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_160_fel_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_160_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_160_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_160_fel_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_160_fel_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_160_fel_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_160_fel_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_160_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_160_fel_idx ;
      edtMetPieOb_Internalname = "METPIEOB_"+sGXsfl_160_fel_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_160_fel_idx ;
      edtMetPieId_Internalname = "METPIEID_"+sGXsfl_160_fel_idx ;
   }

   public void addRow1JZ413( )
   {
      nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160413( ) ;
      sendRow1JZ413( ) ;
   }

   public void sendRow1JZ413( )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 161,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_413_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_413_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_413_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_413_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 162,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,162);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,163);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 164,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,164);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDsc_Internalname,GXutil.rtrim( A2846MetPieDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,167);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieFch_Internalname,localUtil.format(A5136MetPieFch, "99/99/99"),localUtil.format( A5136MetPieFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,168);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieOb_Internalname,GXutil.rtrim( A10779MetPieOb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieOb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieOb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiectr_Internalname,GXutil.rtrim( A10780MetPiectr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiectr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPiectr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_160_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_160_idx + "',160)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieId_Internalname,GXutil.rtrim( A10784MetPieId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,172);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieId_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(160),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1JZ413( ) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2813MetPieCod));
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2846MetPieDsc));
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10779MetPieOb));
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10780MetPiectr));
      GXCCtl = "Z10784MetPieId_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10784MetPieId));
      GXCCtl = "O2815MetPieMet_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2814MetPieKil_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_413_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_413_" + sGXsfl_160_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_413_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOD_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEKIL_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMET_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEEST_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDSC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDEF_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEFCH_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOB_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECTR_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEID_"+sGXsfl_160_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1JZ413( )
   {
      nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160413( ) ;
      edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOB_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEID_"+sGXsfl_160_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_413");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_413_Internalname ;
         wbErr = true ;
         nRcdDeleted_413 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEKIL_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieKil_Internalname ;
         wbErr = true ;
         A2814MetPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMET_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMet_Internalname ;
         wbErr = true ;
         A2815MetPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "METPIEEST_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieEst_Internalname ;
         wbErr = true ;
         A2816MetPieEst = (byte)(0) ;
      }
      else
      {
         A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2846MetPieDsc = httpContext.cgiGet( edtMetPieDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEDEF_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDef_Internalname ;
         wbErr = true ;
         A4909MetPieDef = (short)(0) ;
      }
      else
      {
         A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMetPieFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "METPIEFCH_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieFch_Internalname ;
         wbErr = true ;
         A5136MetPieFch = GXutil.nullDate() ;
      }
      else
      {
         A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( edtMetPieFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEANC_" + sGXsfl_160_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieAnc_Internalname ;
         wbErr = true ;
         A6635MetPieAnc = (short)(0) ;
      }
      else
      {
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10779MetPieOb = httpContext.cgiGet( edtMetPieOb_Internalname) ;
      A10780MetPiectr = httpContext.cgiGet( edtMetPiectr_Internalname) ;
      A10784MetPieId = httpContext.cgiGet( edtMetPieId_Internalname) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_160_idx ;
      Z2813MetPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_160_idx ;
      Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_160_idx ;
      Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_160_idx ;
      Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_160_idx ;
      Z2846MetPieDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_160_idx ;
      Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_160_idx ;
      Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_160_idx ;
      Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_160_idx ;
      Z10779MetPieOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_160_idx ;
      Z10780MetPiectr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10784MetPieId_" + sGXsfl_160_idx ;
      Z10784MetPieId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O2815MetPieMet_" + sGXsfl_160_idx ;
      O2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2814MetPieKil_" + sGXsfl_160_idx ;
      O2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_160_idx ;
      nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_413_" + sGXsfl_160_idx ;
      nRcdExists_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_413_" + sGXsfl_160_idx ;
      nIsMod_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieCod_Enabled = edtMetPieCod_Enabled ;
   }

   public void confirmValues1JZ0( )
   {
      nGXsfl_160_idx = 0 ;
      sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_160413( ) ;
      while ( nGXsfl_160_idx < nRC_GXsfl_160 )
      {
         nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
         sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_160413( ) ;
         httpContext.changePostValue( "Z2813MetPieCod_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z2813MetPieCod_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z2814MetPieKil_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z2814MetPieKil_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z2815MetPieMet_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z2815MetPieMet_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z2816MetPieEst_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z2816MetPieEst_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z2846MetPieDsc_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z4909MetPieDef_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z4909MetPieDef_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z5136MetPieFch_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z5136MetPieFch_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z6635MetPieAnc_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z10779MetPieOb_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z10779MetPieOb_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z10780MetPiectr_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z10780MetPiectr_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_160_idx) ;
         httpContext.changePostValue( "Z10784MetPieId_"+sGXsfl_160_idx, httpContext.cgiGet( "ZT_"+"Z10784MetPieId_"+sGXsfl_160_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_160_idx) ;
      }
      httpContext.changePostValue( "O2815MetPieMet", httpContext.cgiGet( "T2815MetPieMet")) ;
      httpContext.deletePostValue( "T2815MetPieMet") ;
      httpContext.changePostValue( "O2814MetPieKil", httpContext.cgiGet( "T2814MetPieKil")) ;
      httpContext.deletePostValue( "T2814MetPieKil") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmetpie", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "O2811MetTotMet", GXutil.ltrim( localUtil.ntoc( O2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2810MetTotKil", GXutil.ltrim( localUtil.ntoc( O2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2812MetTotPie", GXutil.ltrim( localUtil.ntoc( O2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_160", GXutil.ltrim( localUtil.ntoc( nGXsfl_160_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmetpie", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMETPIE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "METRAJE DE PIEZAS", "") ;
   }

   public void initializeNonKey1JZ412( )
   {
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A2850MetMerMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrimstr( A2850MetMerMet, 6, 2));
      A2849MetMerKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrimstr( A2849MetMerKil, 6, 2));
      A2851MetBarKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
      A2852MetBarMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A182BarMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A864BarPes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2810MetTotKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      A2811MetTotMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2812MetTotPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A898BarPieNDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      A199BarPie1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
   }

   public void initAll1JZ412( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2809MetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1JZ412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1JZ413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2816MetPieEst = (byte)(0) ;
      A2846MetPieDsc = "" ;
      A4909MetPieDef = (short)(0) ;
      A5136MetPieFch = GXutil.nullDate() ;
      A6635MetPieAnc = (short)(0) ;
      A10779MetPieOb = "" ;
      A10780MetPiectr = "" ;
      A10784MetPieId = "" ;
      O2815MetPieMet = A2815MetPieMet ;
      O2814MetPieKil = A2814MetPieKil ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z2816MetPieEst = (byte)(0) ;
      Z2846MetPieDsc = "" ;
      Z4909MetPieDef = (short)(0) ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z6635MetPieAnc = (short)(0) ;
      Z10779MetPieOb = "" ;
      Z10780MetPiectr = "" ;
      Z10784MetPieId = "" ;
   }

   public void initAll1JZ413( )
   {
      A2813MetPieCod = "" ;
      initializeNonKey1JZ413( ) ;
   }

   public void standaloneModalInsert1JZ413( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824159769", true, true);
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
      httpContext.AddJavascriptSource("tmetpie.js", "?2026824159769", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties413( )
   {
      edtMetPieCod_Enabled = defedtMetPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_160_Refreshing);
   }

   public void startgridcontrol160( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2846MetPieDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A5136MetPieFch, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10779MetPieOb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10780MetPiectr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10784MetPieId));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarMat_Internalname = "BARMAT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarPie_Internalname = "BARPIE" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarPes_Internalname = "BARPES" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtMetTotKil_Internalname = "METTOTKIL" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtMetTotMet_Internalname = "METTOTMET" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtMetTotPie_Internalname = "METTOTPIE" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      chkDisDes.setInternalname( "DISDES" );
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtMetBarKil_Internalname = "METBARKIL" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtMetBarMet_Internalname = "METBARMET" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtMetMerKil_Internalname = "METMERKIL" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtMetMerMet_Internalname = "METMERMET" ;
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieDsc_Internalname = "METPIEDSC" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      edtMetPieFch_Internalname = "METPIEFCH" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieOb_Internalname = "METPIEOB" ;
      edtMetPiectr_Internalname = "METPIECTR" ;
      edtMetPieId_Internalname = "METPIEID" ;
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
      Form.setCaption( httpContext.getMessage( "METRAJE DE PIEZAS", "") );
      edtMetPieId_Jsonclick = "" ;
      edtMetPiectr_Jsonclick = "" ;
      edtMetPieOb_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieFch_Jsonclick = "" ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieDsc_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtavnRcdDeleted_413_Jsonclick = "" ;
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
      edtMetPieId_Enabled = 1 ;
      edtMetPiectr_Enabled = 1 ;
      edtMetPieOb_Enabled = 1 ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPieFch_Enabled = 1 ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieDsc_Enabled = 1 ;
      edtMetPieEst_Enabled = 1 ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Enabled = 1 ;
      edtavnRcdDeleted_413_Enabled = 1 ;
      edtMetMerMet_Jsonclick = "" ;
      edtMetMerMet_Backcolor = (int)(0xFFFFFF) ;
      edtMetMerMet_Enabled = 0 ;
      edtMetMerKil_Jsonclick = "" ;
      edtMetMerKil_Backcolor = (int)(0xFFFFFF) ;
      edtMetMerKil_Enabled = 0 ;
      edtMetBarMet_Jsonclick = "" ;
      edtMetBarMet_Backcolor = (int)(0xFFFFFF) ;
      edtMetBarMet_Enabled = 0 ;
      edtMetBarKil_Jsonclick = "" ;
      edtMetBarKil_Backcolor = (int)(0xFFFFFF) ;
      edtMetBarKil_Enabled = 0 ;
      chkDisDes.setIBackground( (int)(0xFFFFFF) );
      chkDisDes.setEnabled( 0 );
      edtMetTotPie_Jsonclick = "" ;
      edtMetTotPie_Backcolor = (int)(0xFFFFFF) ;
      edtMetTotPie_Enabled = 0 ;
      edtMetTotMet_Jsonclick = "" ;
      edtMetTotMet_Backcolor = (int)(0xFFFFFF) ;
      edtMetTotMet_Enabled = 0 ;
      edtMetTotKil_Jsonclick = "" ;
      edtMetTotKil_Backcolor = (int)(0xFFFFFF) ;
      edtMetTotKil_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 0 ;
      edtBarPes_Jsonclick = "" ;
      edtBarPes_Backcolor = (int)(0xFFFFFF) ;
      edtBarPes_Enabled = 0 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Backcolor = (int)(0xFFFFFF) ;
      edtBarPie_Enabled = 0 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtDisUniMed_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarMat_Jsonclick = "" ;
      edtBarMat_Backcolor = (int)(0xFFFFFF) ;
      edtBarMat_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Backcolor = (int)(0xFFFFFF) ;
      edtMetTerCod_Enabled = 1 ;
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

   public void gx1asametbarmet1JZ412( String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar )
   {
      GXt_decimal1 = A2852MetBarMet ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pmetros(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2852MetBarMet = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrimstr( A2852MetBarMet, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2852MetBarMet, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asametbarkil1JZ412( String A396EmprCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar )
   {
      GXt_decimal1 = A2851MetBarKil ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2851MetBarKil = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrimstr( A2851MetBarKil, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2851MetBarKil, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_160413( ) ;
      while ( nGXsfl_160_idx <= nRC_GXsfl_160 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JZ413( ) ;
         standaloneModal1JZ413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JZ413( ) ;
         nGXsfl_160_idx = (int)(nGXsfl_160_idx+1) ;
         sGXsfl_160_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_160_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_160413( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01JZ30 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01JZ30_A407EmprNom[0] ;
      n407EmprNom = T01JZ30_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T01JZ31 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A143BarDisNum = T01JZ31_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A212BarSer = T01JZ31_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A182BarMat = T01JZ31_A182BarMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = T01JZ31_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01JZ31_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01JZ31_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A864BarPes = T01JZ31_A864BarPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = T01JZ31_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = T01JZ31_A120BarAgrEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A361DisCod = T01JZ31_A361DisCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A252CliCod = T01JZ31_A252CliCod[0] ;
      n252CliCod = T01JZ31_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(23);
      /* Using cursor T01JZ32 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01JZ32_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T01JZ32_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      pr_default.close(24);
      /* Using cursor T01JZ33 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T01JZ33_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(25);
      /* Using cursor T01JZ35 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A898BarPieNDes = T01JZ35_A898BarPieNDes[0] ;
         A199BarPie1 = T01JZ35_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(26);
      /* Using cursor T01JZ37 */
      pr_default.execute(27, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A2810MetTotKil = T01JZ37_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = T01JZ37_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = T01JZ37_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      pr_default.close(27);
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
      /* Using cursor T01JZ30 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01JZ30_A407EmprNom[0] ;
      n407EmprNom = T01JZ30_n407EmprNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01JZ31 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A143BarDisNum = T01JZ31_A143BarDisNum[0] ;
      A212BarSer = T01JZ31_A212BarSer[0] ;
      A182BarMat = T01JZ31_A182BarMat[0] ;
      A135BarColNom = T01JZ31_A135BarColNom[0] ;
      A136BarColNum = T01JZ31_A136BarColNum[0] ;
      A218BarTipCol = T01JZ31_A218BarTipCol[0] ;
      A864BarPes = T01JZ31_A864BarPes[0] ;
      A213BarSit = T01JZ31_A213BarSit[0] ;
      A120BarAgrEst = T01JZ31_A120BarAgrEst[0] ;
      A361DisCod = T01JZ31_A361DisCod[0] ;
      A252CliCod = T01JZ31_A252CliCod[0] ;
      n252CliCod = T01JZ31_n252CliCod[0] ;
      pr_default.close(23);
      /* Using cursor T01JZ32 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A392DisUniMed = T01JZ32_A392DisUniMed[0] ;
      A365DisDes = T01JZ32_A365DisDes[0] ;
      pr_default.close(24);
      /* Using cursor T01JZ33 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A279CliNom = T01JZ33_A279CliNom[0] ;
      pr_default.close(25);
      /* Using cursor T01JZ35 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A898BarPieNDes = T01JZ35_A898BarPieNDes[0] ;
         A199BarPie1 = T01JZ35_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         A199BarPie1 = (short)(0) ;
      }
      pr_default.close(26);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      /* Using cursor T01JZ37 */
      pr_default.execute(27, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A2810MetTotKil = T01JZ37_A2810MetTotKil[0] ;
         A2811MetTotMet = T01JZ37_A2811MetTotMet[0] ;
         A2812MetTotPie = T01JZ37_A2812MetTotPie[0] ;
      }
      else
      {
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         A2812MetTotPie = (short)(0) ;
      }
      pr_default.close(27);
      GXt_decimal1 = A2852MetBarMet ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pmetros(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      A2852MetBarMet = GXt_decimal1 ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2852MetBarMet)==0) )
      {
         A2850MetMerMet = ((A2852MetBarMet.subtract(A2811MetTotMet)).divide(A2852MetBarMet, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
      }
      else
      {
         A2850MetMerMet = DecimalUtil.doubleToDec(0) ;
      }
      GXt_decimal1 = A2851MetBarKil ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A129BarCod ;
      GXv_int4[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_decimal6[0] = GXt_decimal1 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2, GXv_decimal6) ;
      tmetpie_impl.this.A396EmprCod = GXv_char5[0] ;
      tmetpie_impl.this.A129BarCod = GXv_int3[0] ;
      tmetpie_impl.this.A132BarCodReo = GXv_int4[0] ;
      tmetpie_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpie_impl.this.GXt_decimal1 = GXv_decimal6[0] ;
      A2851MetBarKil = GXt_decimal1 ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2851MetBarKil)==0) )
      {
         A2849MetMerKil = ((A2851MetBarKil.subtract(A2810MetTotKil)).divide(A2851MetBarKil, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
      }
      else
      {
         A2849MetMerKil = DecimalUtil.doubleToDec(0) ;
      }
      dynload_actions( ) ;
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", GXutil.rtrim( A182BarMat));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2852MetBarMet", GXutil.ltrim( localUtil.ntoc( A2852MetBarMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2850MetMerMet", GXutil.ltrim( localUtil.ntoc( A2850MetMerMet, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2851MetBarKil", GXutil.ltrim( localUtil.ntoc( A2851MetBarKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2849MetMerKil", GXutil.ltrim( localUtil.ntoc( A2849MetMerKil, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z182BarMat", GXutil.rtrim( Z182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z864BarPes", GXutil.ltrim( localUtil.ntoc( Z864BarPes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z898BarPieNDes", GXutil.ltrim( localUtil.ntoc( Z898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z199BarPie1", GXutil.ltrim( localUtil.ntoc( Z199BarPie1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z198BarPie", GXutil.ltrim( localUtil.ntoc( Z198BarPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2810MetTotKil", GXutil.ltrim( localUtil.ntoc( Z2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2811MetTotMet", GXutil.ltrim( localUtil.ntoc( Z2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2812MetTotPie", GXutil.ltrim( localUtil.ntoc( Z2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2852MetBarMet", GXutil.ltrim( localUtil.ntoc( Z2852MetBarMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2850MetMerMet", GXutil.ltrim( localUtil.ntoc( Z2850MetMerMet, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2851MetBarKil", GXutil.ltrim( localUtil.ntoc( Z2851MetBarKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2849MetMerKil", GXutil.ltrim( localUtil.ntoc( Z2849MetMerKil, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2811MetTotMet", GXutil.ltrim( localUtil.ntoc( O2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2810MetTotKil", GXutil.ltrim( localUtil.ntoc( O2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2812MetTotPie", GXutil.ltrim( localUtil.ntoc( O2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METTERCOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A2852MetBarMet',fld:'METBARMET',pic:'ZZZZZ9.99'},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2851MetBarKil',fld:'METBARKIL',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'},{av:'A2852MetBarMet',fld:'METBARMET',pic:'ZZZZZ9.99'},{av:'A2850MetMerMet',fld:'METMERMET',pic:'ZZ9.99'},{av:'A2851MetBarKil',fld:'METBARKIL',pic:'ZZZZZ9.99'},{av:'A2849MetMerKil',fld:'METMERKIL',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z143BarDisNum'},{av:'Z212BarSer'},{av:'Z182BarMat'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z864BarPes'},{av:'Z213BarSit'},{av:'Z120BarAgrEst'},{av:'Z361DisCod'},{av:'Z252CliCod'},{av:'Z392DisUniMed'},{av:'Z365DisDes'},{av:'Z279CliNom'},{av:'Z898BarPieNDes'},{av:'Z199BarPie1'},{av:'Z198BarPie'},{av:'Z2810MetTotKil'},{av:'Z2811MetTotMet'},{av:'Z2812MetTotPie'},{av:'Z2852MetBarMet'},{av:'Z2850MetMerMet'},{av:'Z2851MetBarKil'},{av:'Z2849MetMerKil'},{av:'O2811MetTotMet'},{av:'O2810MetTotKil'},{av:'O2812MetTotPie'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METTOTKIL","{handler:'valid_Mettotkil',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METTOTKIL",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METTOTMET","{handler:'valid_Mettotmet',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METTOTMET",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METBARKIL","{handler:'valid_Metbarkil',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METBARKIL",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METBARMET","{handler:'valid_Metbarmet',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METBARMET",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METPIECOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METPIEKIL","{handler:'valid_Metpiekil',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METPIEKIL",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_METPIEMET","{handler:'valid_Metpiemet',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_METPIEMET",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Metpieid',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
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
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(27);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      O2811MetTotMet = DecimalUtil.ZERO ;
      O2810MetTotKil = DecimalUtil.ZERO ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z2846MetPieDsc = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z10779MetPieOb = "" ;
      Z10780MetPiectr = "" ;
      Z10784MetPieId = "" ;
      O2815MetPieMet = DecimalUtil.ZERO ;
      O2814MetPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A365DisDes = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A143BarDisNum = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      A182BarMat = "" ;
      lblTextblock11_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A392DisUniMed = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock20_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock21_Jsonclick = "" ;
      A2810MetTotKil = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A2811MetTotMet = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A2851MetBarKil = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A2852MetBarMet = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A2849MetMerKil = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      A2850MetMerMet = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B2811MetTotMet = DecimalUtil.ZERO ;
      B2810MetTotKil = DecimalUtil.ZERO ;
      sMode413 = "" ;
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
      sMode412 = "" ;
      s2811MetTotMet = DecimalUtil.ZERO ;
      s2810MetTotKil = DecimalUtil.ZERO ;
      s2850MetMerMet = DecimalUtil.ZERO ;
      O2850MetMerMet = DecimalUtil.ZERO ;
      s2849MetMerKil = DecimalUtil.ZERO ;
      O2849MetMerKil = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2846MetPieDsc = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A10779MetPieOb = "" ;
      A10780MetPiectr = "" ;
      A10784MetPieId = "" ;
      T2815MetPieMet = DecimalUtil.ZERO ;
      T2814MetPieKil = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z120BarAgrEst = "" ;
      Z392DisUniMed = "" ;
      Z365DisDes = "" ;
      Z279CliNom = "" ;
      Z2810MetTotKil = DecimalUtil.ZERO ;
      Z2811MetTotMet = DecimalUtil.ZERO ;
      T01JZ16_A2809MetTerCod = new String[] {""} ;
      T01JZ16_A143BarDisNum = new String[] {""} ;
      T01JZ16_A279CliNom = new String[] {""} ;
      T01JZ16_A212BarSer = new String[] {""} ;
      T01JZ16_A182BarMat = new String[] {""} ;
      T01JZ16_A135BarColNom = new String[] {""} ;
      T01JZ16_A136BarColNum = new int[1] ;
      T01JZ16_A218BarTipCol = new byte[1] ;
      T01JZ16_A392DisUniMed = new String[] {""} ;
      T01JZ16_A864BarPes = new short[1] ;
      T01JZ16_A213BarSit = new byte[1] ;
      T01JZ16_A120BarAgrEst = new String[] {""} ;
      T01JZ16_A407EmprNom = new String[] {""} ;
      T01JZ16_n407EmprNom = new boolean[] {false} ;
      T01JZ16_A365DisDes = new String[] {""} ;
      T01JZ16_A396EmprCod = new String[] {""} ;
      T01JZ16_A129BarCod = new int[1] ;
      T01JZ16_A132BarCodReo = new byte[1] ;
      T01JZ16_A130BarCodPar = new String[] {""} ;
      T01JZ16_A361DisCod = new int[1] ;
      T01JZ16_A252CliCod = new int[1] ;
      T01JZ16_n252CliCod = new boolean[] {false} ;
      T01JZ16_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ16_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ16_A2812MetTotPie = new short[1] ;
      T01JZ16_A898BarPieNDes = new int[1] ;
      T01JZ16_A199BarPie1 = new short[1] ;
      T01JZ6_A407EmprNom = new String[] {""} ;
      T01JZ6_n407EmprNom = new boolean[] {false} ;
      T01JZ7_A143BarDisNum = new String[] {""} ;
      T01JZ7_A212BarSer = new String[] {""} ;
      T01JZ7_A182BarMat = new String[] {""} ;
      T01JZ7_A135BarColNom = new String[] {""} ;
      T01JZ7_A136BarColNum = new int[1] ;
      T01JZ7_A218BarTipCol = new byte[1] ;
      T01JZ7_A864BarPes = new short[1] ;
      T01JZ7_A213BarSit = new byte[1] ;
      T01JZ7_A120BarAgrEst = new String[] {""} ;
      T01JZ7_A361DisCod = new int[1] ;
      T01JZ7_A252CliCod = new int[1] ;
      T01JZ7_n252CliCod = new boolean[] {false} ;
      T01JZ8_A392DisUniMed = new String[] {""} ;
      T01JZ8_A365DisDes = new String[] {""} ;
      T01JZ9_A279CliNom = new String[] {""} ;
      T01JZ11_A898BarPieNDes = new int[1] ;
      T01JZ11_A199BarPie1 = new short[1] ;
      T01JZ13_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ13_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ13_A2812MetTotPie = new short[1] ;
      T01JZ17_A407EmprNom = new String[] {""} ;
      T01JZ17_n407EmprNom = new boolean[] {false} ;
      T01JZ18_A143BarDisNum = new String[] {""} ;
      T01JZ18_A212BarSer = new String[] {""} ;
      T01JZ18_A182BarMat = new String[] {""} ;
      T01JZ18_A135BarColNom = new String[] {""} ;
      T01JZ18_A136BarColNum = new int[1] ;
      T01JZ18_A218BarTipCol = new byte[1] ;
      T01JZ18_A864BarPes = new short[1] ;
      T01JZ18_A213BarSit = new byte[1] ;
      T01JZ18_A120BarAgrEst = new String[] {""} ;
      T01JZ18_A361DisCod = new int[1] ;
      T01JZ18_A252CliCod = new int[1] ;
      T01JZ18_n252CliCod = new boolean[] {false} ;
      T01JZ19_A392DisUniMed = new String[] {""} ;
      T01JZ19_A365DisDes = new String[] {""} ;
      T01JZ20_A279CliNom = new String[] {""} ;
      T01JZ22_A898BarPieNDes = new int[1] ;
      T01JZ22_A199BarPie1 = new short[1] ;
      T01JZ24_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ24_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ24_A2812MetTotPie = new short[1] ;
      T01JZ25_A396EmprCod = new String[] {""} ;
      T01JZ25_A2809MetTerCod = new String[] {""} ;
      T01JZ25_A129BarCod = new int[1] ;
      T01JZ25_A132BarCodReo = new byte[1] ;
      T01JZ25_A130BarCodPar = new String[] {""} ;
      T01JZ5_A2809MetTerCod = new String[] {""} ;
      T01JZ5_A396EmprCod = new String[] {""} ;
      T01JZ5_A129BarCod = new int[1] ;
      T01JZ5_A132BarCodReo = new byte[1] ;
      T01JZ5_A130BarCodPar = new String[] {""} ;
      T01JZ26_A396EmprCod = new String[] {""} ;
      T01JZ26_A2809MetTerCod = new String[] {""} ;
      T01JZ26_A129BarCod = new int[1] ;
      T01JZ26_A132BarCodReo = new byte[1] ;
      T01JZ26_A130BarCodPar = new String[] {""} ;
      T01JZ27_A396EmprCod = new String[] {""} ;
      T01JZ27_A2809MetTerCod = new String[] {""} ;
      T01JZ27_A129BarCod = new int[1] ;
      T01JZ27_A132BarCodReo = new byte[1] ;
      T01JZ27_A130BarCodPar = new String[] {""} ;
      T01JZ4_A2809MetTerCod = new String[] {""} ;
      T01JZ4_A396EmprCod = new String[] {""} ;
      T01JZ4_A129BarCod = new int[1] ;
      T01JZ4_A132BarCodReo = new byte[1] ;
      T01JZ4_A130BarCodPar = new String[] {""} ;
      T01JZ30_A407EmprNom = new String[] {""} ;
      T01JZ30_n407EmprNom = new boolean[] {false} ;
      T01JZ31_A143BarDisNum = new String[] {""} ;
      T01JZ31_A212BarSer = new String[] {""} ;
      T01JZ31_A182BarMat = new String[] {""} ;
      T01JZ31_A135BarColNom = new String[] {""} ;
      T01JZ31_A136BarColNum = new int[1] ;
      T01JZ31_A218BarTipCol = new byte[1] ;
      T01JZ31_A864BarPes = new short[1] ;
      T01JZ31_A213BarSit = new byte[1] ;
      T01JZ31_A120BarAgrEst = new String[] {""} ;
      T01JZ31_A361DisCod = new int[1] ;
      T01JZ31_A252CliCod = new int[1] ;
      T01JZ31_n252CliCod = new boolean[] {false} ;
      T01JZ32_A392DisUniMed = new String[] {""} ;
      T01JZ32_A365DisDes = new String[] {""} ;
      T01JZ33_A279CliNom = new String[] {""} ;
      T01JZ35_A898BarPieNDes = new int[1] ;
      T01JZ35_A199BarPie1 = new short[1] ;
      T01JZ37_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ37_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ37_A2812MetTotPie = new short[1] ;
      T01JZ38_A396EmprCod = new String[] {""} ;
      T01JZ38_A2809MetTerCod = new String[] {""} ;
      T01JZ38_A129BarCod = new int[1] ;
      T01JZ38_A132BarCodReo = new byte[1] ;
      T01JZ38_A130BarCodPar = new String[] {""} ;
      T01JZ38_A2813MetPieCod = new String[] {""} ;
      T01JZ38_A12995MetPieDfLi = new short[1] ;
      T01JZ39_A396EmprCod = new String[] {""} ;
      T01JZ39_A2809MetTerCod = new String[] {""} ;
      T01JZ39_A129BarCod = new int[1] ;
      T01JZ39_A132BarCodReo = new byte[1] ;
      T01JZ39_A130BarCodPar = new String[] {""} ;
      T01JZ40_A2809MetTerCod = new String[] {""} ;
      T01JZ40_A129BarCod = new int[1] ;
      T01JZ40_A132BarCodReo = new byte[1] ;
      T01JZ40_A130BarCodPar = new String[] {""} ;
      T01JZ40_A2813MetPieCod = new String[] {""} ;
      T01JZ40_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ40_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ40_A2816MetPieEst = new byte[1] ;
      T01JZ40_A2846MetPieDsc = new String[] {""} ;
      T01JZ40_A4909MetPieDef = new short[1] ;
      T01JZ40_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01JZ40_A6635MetPieAnc = new short[1] ;
      T01JZ40_A10779MetPieOb = new String[] {""} ;
      T01JZ40_A10780MetPiectr = new String[] {""} ;
      T01JZ40_A10784MetPieId = new String[] {""} ;
      T01JZ40_A396EmprCod = new String[] {""} ;
      T01JZ41_A396EmprCod = new String[] {""} ;
      T01JZ41_A2809MetTerCod = new String[] {""} ;
      T01JZ41_A129BarCod = new int[1] ;
      T01JZ41_A132BarCodReo = new byte[1] ;
      T01JZ41_A130BarCodPar = new String[] {""} ;
      T01JZ41_A2813MetPieCod = new String[] {""} ;
      T01JZ3_A2809MetTerCod = new String[] {""} ;
      T01JZ3_A129BarCod = new int[1] ;
      T01JZ3_A132BarCodReo = new byte[1] ;
      T01JZ3_A130BarCodPar = new String[] {""} ;
      T01JZ3_A2813MetPieCod = new String[] {""} ;
      T01JZ3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ3_A2816MetPieEst = new byte[1] ;
      T01JZ3_A2846MetPieDsc = new String[] {""} ;
      T01JZ3_A4909MetPieDef = new short[1] ;
      T01JZ3_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01JZ3_A6635MetPieAnc = new short[1] ;
      T01JZ3_A10779MetPieOb = new String[] {""} ;
      T01JZ3_A10780MetPiectr = new String[] {""} ;
      T01JZ3_A10784MetPieId = new String[] {""} ;
      T01JZ3_A396EmprCod = new String[] {""} ;
      T01JZ2_A2809MetTerCod = new String[] {""} ;
      T01JZ2_A129BarCod = new int[1] ;
      T01JZ2_A132BarCodReo = new byte[1] ;
      T01JZ2_A130BarCodPar = new String[] {""} ;
      T01JZ2_A2813MetPieCod = new String[] {""} ;
      T01JZ2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JZ2_A2816MetPieEst = new byte[1] ;
      T01JZ2_A2846MetPieDsc = new String[] {""} ;
      T01JZ2_A4909MetPieDef = new short[1] ;
      T01JZ2_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01JZ2_A6635MetPieAnc = new short[1] ;
      T01JZ2_A10779MetPieOb = new String[] {""} ;
      T01JZ2_A10780MetPiectr = new String[] {""} ;
      T01JZ2_A10784MetPieId = new String[] {""} ;
      T01JZ2_A396EmprCod = new String[] {""} ;
      T01JZ45_A396EmprCod = new String[] {""} ;
      T01JZ45_A2809MetTerCod = new String[] {""} ;
      T01JZ45_A129BarCod = new int[1] ;
      T01JZ45_A132BarCodReo = new byte[1] ;
      T01JZ45_A130BarCodPar = new String[] {""} ;
      T01JZ45_A2813MetPieCod = new String[] {""} ;
      T01JZ45_A12995MetPieDfLi = new short[1] ;
      T01JZ46_A396EmprCod = new String[] {""} ;
      T01JZ46_A2809MetTerCod = new String[] {""} ;
      T01JZ46_A129BarCod = new int[1] ;
      T01JZ46_A132BarCodReo = new byte[1] ;
      T01JZ46_A130BarCodPar = new String[] {""} ;
      T01JZ46_A2813MetPieCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Z2852MetBarMet = DecimalUtil.ZERO ;
      Z2850MetMerMet = DecimalUtil.ZERO ;
      Z2851MetBarKil = DecimalUtil.ZERO ;
      Z2849MetMerKil = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ143BarDisNum = "" ;
      ZZ212BarSer = "" ;
      ZZ182BarMat = "" ;
      ZZ135BarColNom = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ392DisUniMed = "" ;
      ZZ365DisDes = "" ;
      ZZ279CliNom = "" ;
      ZZ2810MetTotKil = DecimalUtil.ZERO ;
      ZZ2811MetTotMet = DecimalUtil.ZERO ;
      ZZ2852MetBarMet = DecimalUtil.ZERO ;
      ZZ2850MetMerMet = DecimalUtil.ZERO ;
      ZZ2851MetBarKil = DecimalUtil.ZERO ;
      ZZ2849MetMerKil = DecimalUtil.ZERO ;
      ZO2811MetTotMet = DecimalUtil.ZERO ;
      ZO2810MetTotKil = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmetpie__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmetpie__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmetpie__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmetpie__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmetpie__default(),
         new Object[] {
             new Object[] {
            T01JZ2_A2809MetTerCod, T01JZ2_A129BarCod, T01JZ2_A132BarCodReo, T01JZ2_A130BarCodPar, T01JZ2_A2813MetPieCod, T01JZ2_A2814MetPieKil, T01JZ2_A2815MetPieMet, T01JZ2_A2816MetPieEst, T01JZ2_A2846MetPieDsc, T01JZ2_A4909MetPieDef,
            T01JZ2_A5136MetPieFch, T01JZ2_A6635MetPieAnc, T01JZ2_A10779MetPieOb, T01JZ2_A10780MetPiectr, T01JZ2_A10784MetPieId, T01JZ2_A396EmprCod
            }
            , new Object[] {
            T01JZ3_A2809MetTerCod, T01JZ3_A129BarCod, T01JZ3_A132BarCodReo, T01JZ3_A130BarCodPar, T01JZ3_A2813MetPieCod, T01JZ3_A2814MetPieKil, T01JZ3_A2815MetPieMet, T01JZ3_A2816MetPieEst, T01JZ3_A2846MetPieDsc, T01JZ3_A4909MetPieDef,
            T01JZ3_A5136MetPieFch, T01JZ3_A6635MetPieAnc, T01JZ3_A10779MetPieOb, T01JZ3_A10780MetPiectr, T01JZ3_A10784MetPieId, T01JZ3_A396EmprCod
            }
            , new Object[] {
            T01JZ4_A2809MetTerCod, T01JZ4_A396EmprCod, T01JZ4_A129BarCod, T01JZ4_A132BarCodReo, T01JZ4_A130BarCodPar
            }
            , new Object[] {
            T01JZ5_A2809MetTerCod, T01JZ5_A396EmprCod, T01JZ5_A129BarCod, T01JZ5_A132BarCodReo, T01JZ5_A130BarCodPar
            }
            , new Object[] {
            T01JZ6_A407EmprNom, T01JZ6_n407EmprNom
            }
            , new Object[] {
            T01JZ7_A143BarDisNum, T01JZ7_A212BarSer, T01JZ7_A182BarMat, T01JZ7_A135BarColNom, T01JZ7_A136BarColNum, T01JZ7_A218BarTipCol, T01JZ7_A864BarPes, T01JZ7_A213BarSit, T01JZ7_A120BarAgrEst, T01JZ7_A361DisCod,
            T01JZ7_A252CliCod, T01JZ7_n252CliCod
            }
            , new Object[] {
            T01JZ8_A392DisUniMed, T01JZ8_A365DisDes
            }
            , new Object[] {
            T01JZ9_A279CliNom
            }
            , new Object[] {
            T01JZ11_A898BarPieNDes, T01JZ11_A199BarPie1
            }
            , new Object[] {
            T01JZ13_A2810MetTotKil, T01JZ13_A2811MetTotMet, T01JZ13_A2812MetTotPie
            }
            , new Object[] {
            T01JZ16_A2809MetTerCod, T01JZ16_A143BarDisNum, T01JZ16_A279CliNom, T01JZ16_A212BarSer, T01JZ16_A182BarMat, T01JZ16_A135BarColNom, T01JZ16_A136BarColNum, T01JZ16_A218BarTipCol, T01JZ16_A392DisUniMed, T01JZ16_A864BarPes,
            T01JZ16_A213BarSit, T01JZ16_A120BarAgrEst, T01JZ16_A407EmprNom, T01JZ16_n407EmprNom, T01JZ16_A365DisDes, T01JZ16_A396EmprCod, T01JZ16_A129BarCod, T01JZ16_A132BarCodReo, T01JZ16_A130BarCodPar, T01JZ16_A361DisCod,
            T01JZ16_A252CliCod, T01JZ16_n252CliCod, T01JZ16_A2810MetTotKil, T01JZ16_A2811MetTotMet, T01JZ16_A2812MetTotPie, T01JZ16_A898BarPieNDes, T01JZ16_A199BarPie1
            }
            , new Object[] {
            T01JZ17_A407EmprNom, T01JZ17_n407EmprNom
            }
            , new Object[] {
            T01JZ18_A143BarDisNum, T01JZ18_A212BarSer, T01JZ18_A182BarMat, T01JZ18_A135BarColNom, T01JZ18_A136BarColNum, T01JZ18_A218BarTipCol, T01JZ18_A864BarPes, T01JZ18_A213BarSit, T01JZ18_A120BarAgrEst, T01JZ18_A361DisCod,
            T01JZ18_A252CliCod, T01JZ18_n252CliCod
            }
            , new Object[] {
            T01JZ19_A392DisUniMed, T01JZ19_A365DisDes
            }
            , new Object[] {
            T01JZ20_A279CliNom
            }
            , new Object[] {
            T01JZ22_A898BarPieNDes, T01JZ22_A199BarPie1
            }
            , new Object[] {
            T01JZ24_A2810MetTotKil, T01JZ24_A2811MetTotMet, T01JZ24_A2812MetTotPie
            }
            , new Object[] {
            T01JZ25_A396EmprCod, T01JZ25_A2809MetTerCod, T01JZ25_A129BarCod, T01JZ25_A132BarCodReo, T01JZ25_A130BarCodPar
            }
            , new Object[] {
            T01JZ26_A396EmprCod, T01JZ26_A2809MetTerCod, T01JZ26_A129BarCod, T01JZ26_A132BarCodReo, T01JZ26_A130BarCodPar
            }
            , new Object[] {
            T01JZ27_A396EmprCod, T01JZ27_A2809MetTerCod, T01JZ27_A129BarCod, T01JZ27_A132BarCodReo, T01JZ27_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JZ30_A407EmprNom, T01JZ30_n407EmprNom
            }
            , new Object[] {
            T01JZ31_A143BarDisNum, T01JZ31_A212BarSer, T01JZ31_A182BarMat, T01JZ31_A135BarColNom, T01JZ31_A136BarColNum, T01JZ31_A218BarTipCol, T01JZ31_A864BarPes, T01JZ31_A213BarSit, T01JZ31_A120BarAgrEst, T01JZ31_A361DisCod,
            T01JZ31_A252CliCod, T01JZ31_n252CliCod
            }
            , new Object[] {
            T01JZ32_A392DisUniMed, T01JZ32_A365DisDes
            }
            , new Object[] {
            T01JZ33_A279CliNom
            }
            , new Object[] {
            T01JZ35_A898BarPieNDes, T01JZ35_A199BarPie1
            }
            , new Object[] {
            T01JZ37_A2810MetTotKil, T01JZ37_A2811MetTotMet, T01JZ37_A2812MetTotPie
            }
            , new Object[] {
            T01JZ38_A396EmprCod, T01JZ38_A2809MetTerCod, T01JZ38_A129BarCod, T01JZ38_A132BarCodReo, T01JZ38_A130BarCodPar, T01JZ38_A2813MetPieCod, T01JZ38_A12995MetPieDfLi
            }
            , new Object[] {
            T01JZ39_A396EmprCod, T01JZ39_A2809MetTerCod, T01JZ39_A129BarCod, T01JZ39_A132BarCodReo, T01JZ39_A130BarCodPar
            }
            , new Object[] {
            T01JZ40_A2809MetTerCod, T01JZ40_A129BarCod, T01JZ40_A132BarCodReo, T01JZ40_A130BarCodPar, T01JZ40_A2813MetPieCod, T01JZ40_A2814MetPieKil, T01JZ40_A2815MetPieMet, T01JZ40_A2816MetPieEst, T01JZ40_A2846MetPieDsc, T01JZ40_A4909MetPieDef,
            T01JZ40_A5136MetPieFch, T01JZ40_A6635MetPieAnc, T01JZ40_A10779MetPieOb, T01JZ40_A10780MetPiectr, T01JZ40_A10784MetPieId, T01JZ40_A396EmprCod
            }
            , new Object[] {
            T01JZ41_A396EmprCod, T01JZ41_A2809MetTerCod, T01JZ41_A129BarCod, T01JZ41_A132BarCodReo, T01JZ41_A130BarCodPar, T01JZ41_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JZ45_A396EmprCod, T01JZ45_A2809MetTerCod, T01JZ45_A129BarCod, T01JZ45_A132BarCodReo, T01JZ45_A130BarCodPar, T01JZ45_A2813MetPieCod, T01JZ45_A12995MetPieDfLi
            }
            , new Object[] {
            T01JZ46_A396EmprCod, T01JZ46_A2809MetTerCod, T01JZ46_A129BarCod, T01JZ46_A132BarCodReo, T01JZ46_A130BarCodPar, T01JZ46_A2813MetPieCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A2816MetPieEst ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int4[] ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ213BarSit ;
   private short O2812MetTotPie ;
   private short Z4909MetPieDef ;
   private short Z6635MetPieAnc ;
   private short nRcdDeleted_413 ;
   private short nRcdExists_413 ;
   private short nIsMod_413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A864BarPes ;
   private short A2812MetTotPie ;
   private short nBlankRcdCount413 ;
   private short RcdFound413 ;
   private short B2812MetTotPie ;
   private short nBlankRcdUsr413 ;
   private short A199BarPie1 ;
   private short s2812MetTotPie ;
   private short A4909MetPieDef ;
   private short A6635MetPieAnc ;
   private short Z864BarPes ;
   private short Z199BarPie1 ;
   private short Z2812MetTotPie ;
   private short RcdFound412 ;
   private short nIsDirty_412 ;
   private short nIsDirty_413 ;
   private short ZZ864BarPes ;
   private short ZZ199BarPie1 ;
   private short ZZ2812MetTotPie ;
   private short ZO2812MetTotPie ;
   private int Z129BarCod ;
   private int nRC_GXsfl_160 ;
   private int nGXsfl_160_idx=1 ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarMat_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtBarPes_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMetTotKil_Enabled ;
   private int edtMetTotMet_Enabled ;
   private int edtMetTotPie_Enabled ;
   private int edtMetBarKil_Enabled ;
   private int edtMetBarMet_Enabled ;
   private int edtMetMerKil_Enabled ;
   private int edtMetMerMet_Enabled ;
   private int edtavnRcdDeleted_413_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieEst_Enabled ;
   private int edtMetPieDsc_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPieFch_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieOb_Enabled ;
   private int edtMetPiectr_Enabled ;
   private int edtMetPieId_Enabled ;
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
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMetPieCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMetMerMet_Backcolor ;
   private int edtMetMerKil_Backcolor ;
   private int edtMetBarMet_Backcolor ;
   private int edtMetBarKil_Backcolor ;
   private int edtMetTotPie_Backcolor ;
   private int edtMetTotMet_Backcolor ;
   private int edtMetTotKil_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtBarPes_Backcolor ;
   private int edtBarPie_Backcolor ;
   private int edtDisUniMed_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarMat_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtMetTerCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z198BarPie ;
   private int GXv_int3[] ;
   private int ZZ129BarCod ;
   private int ZZ136BarColNum ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ898BarPieNDes ;
   private int ZZ198BarPie ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O2811MetTotMet ;
   private java.math.BigDecimal O2810MetTotKil ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal O2815MetPieMet ;
   private java.math.BigDecimal O2814MetPieKil ;
   private java.math.BigDecimal A2810MetTotKil ;
   private java.math.BigDecimal A2811MetTotMet ;
   private java.math.BigDecimal A2851MetBarKil ;
   private java.math.BigDecimal A2852MetBarMet ;
   private java.math.BigDecimal A2849MetMerKil ;
   private java.math.BigDecimal A2850MetMerMet ;
   private java.math.BigDecimal B2811MetTotMet ;
   private java.math.BigDecimal B2810MetTotKil ;
   private java.math.BigDecimal s2811MetTotMet ;
   private java.math.BigDecimal s2810MetTotKil ;
   private java.math.BigDecimal s2850MetMerMet ;
   private java.math.BigDecimal O2850MetMerMet ;
   private java.math.BigDecimal s2849MetMerKil ;
   private java.math.BigDecimal O2849MetMerKil ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal T2815MetPieMet ;
   private java.math.BigDecimal T2814MetPieKil ;
   private java.math.BigDecimal Z2810MetTotKil ;
   private java.math.BigDecimal Z2811MetTotMet ;
   private java.math.BigDecimal Z2852MetBarMet ;
   private java.math.BigDecimal Z2850MetMerMet ;
   private java.math.BigDecimal Z2851MetBarKil ;
   private java.math.BigDecimal Z2849MetMerKil ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal ZZ2810MetTotKil ;
   private java.math.BigDecimal ZZ2811MetTotMet ;
   private java.math.BigDecimal ZZ2852MetBarMet ;
   private java.math.BigDecimal ZZ2850MetMerMet ;
   private java.math.BigDecimal ZZ2851MetBarKil ;
   private java.math.BigDecimal ZZ2849MetMerKil ;
   private java.math.BigDecimal ZO2811MetTotMet ;
   private java.math.BigDecimal ZO2810MetTotKil ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z2846MetPieDsc ;
   private String Z10779MetPieOb ;
   private String Z10780MetPiectr ;
   private String Z10784MetPieId ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_160_idx="0001" ;
   private String Gx_mode ;
   private String A365DisDes ;
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
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
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
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarMat_Internalname ;
   private String A182BarMat ;
   private String edtBarMat_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarPes_Internalname ;
   private String edtBarPes_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtMetTotKil_Internalname ;
   private String edtMetTotKil_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtMetTotMet_Internalname ;
   private String edtMetTotMet_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtMetTotPie_Internalname ;
   private String edtMetTotPie_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtMetBarKil_Internalname ;
   private String edtMetBarKil_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtMetBarMet_Internalname ;
   private String edtMetBarMet_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtMetMerKil_Internalname ;
   private String edtMetMerKil_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtMetMerMet_Internalname ;
   private String edtMetMerMet_Jsonclick ;
   private String sMode413 ;
   private String edtavnRcdDeleted_413_Internalname ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieDsc_Internalname ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPieFch_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieOb_Internalname ;
   private String edtMetPiectr_Internalname ;
   private String edtMetPieId_Internalname ;
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
   private String sMode412 ;
   private String GXCCtl ;
   private String A2813MetPieCod ;
   private String A2846MetPieDsc ;
   private String A10779MetPieOb ;
   private String A10780MetPiectr ;
   private String A10784MetPieId ;
   private String Z407EmprNom ;
   private String Z143BarDisNum ;
   private String Z212BarSer ;
   private String Z182BarMat ;
   private String Z135BarColNom ;
   private String Z120BarAgrEst ;
   private String Z392DisUniMed ;
   private String Z365DisDes ;
   private String Z279CliNom ;
   private String sGXsfl_160_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_413_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieDsc_Jsonclick ;
   private String edtMetPieDef_Jsonclick ;
   private String edtMetPieFch_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieOb_Jsonclick ;
   private String edtMetPiectr_Jsonclick ;
   private String edtMetPieId_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ143BarDisNum ;
   private String ZZ212BarSer ;
   private String ZZ182BarMat ;
   private String ZZ135BarColNom ;
   private String ZZ120BarAgrEst ;
   private String ZZ392DisUniMed ;
   private String ZZ365DisDes ;
   private String ZZ279CliNom ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date A5136MetPieFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_160_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkDisDes ;
   private IDataStoreProvider pr_default ;
   private String[] T01JZ16_A2809MetTerCod ;
   private String[] T01JZ16_A143BarDisNum ;
   private String[] T01JZ16_A279CliNom ;
   private String[] T01JZ16_A212BarSer ;
   private String[] T01JZ16_A182BarMat ;
   private String[] T01JZ16_A135BarColNom ;
   private int[] T01JZ16_A136BarColNum ;
   private byte[] T01JZ16_A218BarTipCol ;
   private String[] T01JZ16_A392DisUniMed ;
   private short[] T01JZ16_A864BarPes ;
   private byte[] T01JZ16_A213BarSit ;
   private String[] T01JZ16_A120BarAgrEst ;
   private String[] T01JZ16_A407EmprNom ;
   private boolean[] T01JZ16_n407EmprNom ;
   private String[] T01JZ16_A365DisDes ;
   private String[] T01JZ16_A396EmprCod ;
   private int[] T01JZ16_A129BarCod ;
   private byte[] T01JZ16_A132BarCodReo ;
   private String[] T01JZ16_A130BarCodPar ;
   private int[] T01JZ16_A361DisCod ;
   private int[] T01JZ16_A252CliCod ;
   private boolean[] T01JZ16_n252CliCod ;
   private java.math.BigDecimal[] T01JZ16_A2810MetTotKil ;
   private java.math.BigDecimal[] T01JZ16_A2811MetTotMet ;
   private short[] T01JZ16_A2812MetTotPie ;
   private int[] T01JZ16_A898BarPieNDes ;
   private short[] T01JZ16_A199BarPie1 ;
   private String[] T01JZ6_A407EmprNom ;
   private boolean[] T01JZ6_n407EmprNom ;
   private String[] T01JZ7_A143BarDisNum ;
   private String[] T01JZ7_A212BarSer ;
   private String[] T01JZ7_A182BarMat ;
   private String[] T01JZ7_A135BarColNom ;
   private int[] T01JZ7_A136BarColNum ;
   private byte[] T01JZ7_A218BarTipCol ;
   private short[] T01JZ7_A864BarPes ;
   private byte[] T01JZ7_A213BarSit ;
   private String[] T01JZ7_A120BarAgrEst ;
   private int[] T01JZ7_A361DisCod ;
   private int[] T01JZ7_A252CliCod ;
   private boolean[] T01JZ7_n252CliCod ;
   private String[] T01JZ8_A392DisUniMed ;
   private String[] T01JZ8_A365DisDes ;
   private String[] T01JZ9_A279CliNom ;
   private int[] T01JZ11_A898BarPieNDes ;
   private short[] T01JZ11_A199BarPie1 ;
   private java.math.BigDecimal[] T01JZ13_A2810MetTotKil ;
   private java.math.BigDecimal[] T01JZ13_A2811MetTotMet ;
   private short[] T01JZ13_A2812MetTotPie ;
   private String[] T01JZ17_A407EmprNom ;
   private boolean[] T01JZ17_n407EmprNom ;
   private String[] T01JZ18_A143BarDisNum ;
   private String[] T01JZ18_A212BarSer ;
   private String[] T01JZ18_A182BarMat ;
   private String[] T01JZ18_A135BarColNom ;
   private int[] T01JZ18_A136BarColNum ;
   private byte[] T01JZ18_A218BarTipCol ;
   private short[] T01JZ18_A864BarPes ;
   private byte[] T01JZ18_A213BarSit ;
   private String[] T01JZ18_A120BarAgrEst ;
   private int[] T01JZ18_A361DisCod ;
   private int[] T01JZ18_A252CliCod ;
   private boolean[] T01JZ18_n252CliCod ;
   private String[] T01JZ19_A392DisUniMed ;
   private String[] T01JZ19_A365DisDes ;
   private String[] T01JZ20_A279CliNom ;
   private int[] T01JZ22_A898BarPieNDes ;
   private short[] T01JZ22_A199BarPie1 ;
   private java.math.BigDecimal[] T01JZ24_A2810MetTotKil ;
   private java.math.BigDecimal[] T01JZ24_A2811MetTotMet ;
   private short[] T01JZ24_A2812MetTotPie ;
   private String[] T01JZ25_A396EmprCod ;
   private String[] T01JZ25_A2809MetTerCod ;
   private int[] T01JZ25_A129BarCod ;
   private byte[] T01JZ25_A132BarCodReo ;
   private String[] T01JZ25_A130BarCodPar ;
   private String[] T01JZ5_A2809MetTerCod ;
   private String[] T01JZ5_A396EmprCod ;
   private int[] T01JZ5_A129BarCod ;
   private byte[] T01JZ5_A132BarCodReo ;
   private String[] T01JZ5_A130BarCodPar ;
   private String[] T01JZ26_A396EmprCod ;
   private String[] T01JZ26_A2809MetTerCod ;
   private int[] T01JZ26_A129BarCod ;
   private byte[] T01JZ26_A132BarCodReo ;
   private String[] T01JZ26_A130BarCodPar ;
   private String[] T01JZ27_A396EmprCod ;
   private String[] T01JZ27_A2809MetTerCod ;
   private int[] T01JZ27_A129BarCod ;
   private byte[] T01JZ27_A132BarCodReo ;
   private String[] T01JZ27_A130BarCodPar ;
   private String[] T01JZ4_A2809MetTerCod ;
   private String[] T01JZ4_A396EmprCod ;
   private int[] T01JZ4_A129BarCod ;
   private byte[] T01JZ4_A132BarCodReo ;
   private String[] T01JZ4_A130BarCodPar ;
   private String[] T01JZ30_A407EmprNom ;
   private boolean[] T01JZ30_n407EmprNom ;
   private String[] T01JZ31_A143BarDisNum ;
   private String[] T01JZ31_A212BarSer ;
   private String[] T01JZ31_A182BarMat ;
   private String[] T01JZ31_A135BarColNom ;
   private int[] T01JZ31_A136BarColNum ;
   private byte[] T01JZ31_A218BarTipCol ;
   private short[] T01JZ31_A864BarPes ;
   private byte[] T01JZ31_A213BarSit ;
   private String[] T01JZ31_A120BarAgrEst ;
   private int[] T01JZ31_A361DisCod ;
   private int[] T01JZ31_A252CliCod ;
   private boolean[] T01JZ31_n252CliCod ;
   private String[] T01JZ32_A392DisUniMed ;
   private String[] T01JZ32_A365DisDes ;
   private String[] T01JZ33_A279CliNom ;
   private int[] T01JZ35_A898BarPieNDes ;
   private short[] T01JZ35_A199BarPie1 ;
   private java.math.BigDecimal[] T01JZ37_A2810MetTotKil ;
   private java.math.BigDecimal[] T01JZ37_A2811MetTotMet ;
   private short[] T01JZ37_A2812MetTotPie ;
   private String[] T01JZ38_A396EmprCod ;
   private String[] T01JZ38_A2809MetTerCod ;
   private int[] T01JZ38_A129BarCod ;
   private byte[] T01JZ38_A132BarCodReo ;
   private String[] T01JZ38_A130BarCodPar ;
   private String[] T01JZ38_A2813MetPieCod ;
   private short[] T01JZ38_A12995MetPieDfLi ;
   private String[] T01JZ39_A396EmprCod ;
   private String[] T01JZ39_A2809MetTerCod ;
   private int[] T01JZ39_A129BarCod ;
   private byte[] T01JZ39_A132BarCodReo ;
   private String[] T01JZ39_A130BarCodPar ;
   private String[] T01JZ40_A2809MetTerCod ;
   private int[] T01JZ40_A129BarCod ;
   private byte[] T01JZ40_A132BarCodReo ;
   private String[] T01JZ40_A130BarCodPar ;
   private String[] T01JZ40_A2813MetPieCod ;
   private java.math.BigDecimal[] T01JZ40_A2814MetPieKil ;
   private java.math.BigDecimal[] T01JZ40_A2815MetPieMet ;
   private byte[] T01JZ40_A2816MetPieEst ;
   private String[] T01JZ40_A2846MetPieDsc ;
   private short[] T01JZ40_A4909MetPieDef ;
   private java.util.Date[] T01JZ40_A5136MetPieFch ;
   private short[] T01JZ40_A6635MetPieAnc ;
   private String[] T01JZ40_A10779MetPieOb ;
   private String[] T01JZ40_A10780MetPiectr ;
   private String[] T01JZ40_A10784MetPieId ;
   private String[] T01JZ40_A396EmprCod ;
   private String[] T01JZ41_A396EmprCod ;
   private String[] T01JZ41_A2809MetTerCod ;
   private int[] T01JZ41_A129BarCod ;
   private byte[] T01JZ41_A132BarCodReo ;
   private String[] T01JZ41_A130BarCodPar ;
   private String[] T01JZ41_A2813MetPieCod ;
   private String[] T01JZ3_A2809MetTerCod ;
   private int[] T01JZ3_A129BarCod ;
   private byte[] T01JZ3_A132BarCodReo ;
   private String[] T01JZ3_A130BarCodPar ;
   private String[] T01JZ3_A2813MetPieCod ;
   private java.math.BigDecimal[] T01JZ3_A2814MetPieKil ;
   private java.math.BigDecimal[] T01JZ3_A2815MetPieMet ;
   private byte[] T01JZ3_A2816MetPieEst ;
   private String[] T01JZ3_A2846MetPieDsc ;
   private short[] T01JZ3_A4909MetPieDef ;
   private java.util.Date[] T01JZ3_A5136MetPieFch ;
   private short[] T01JZ3_A6635MetPieAnc ;
   private String[] T01JZ3_A10779MetPieOb ;
   private String[] T01JZ3_A10780MetPiectr ;
   private String[] T01JZ3_A10784MetPieId ;
   private String[] T01JZ3_A396EmprCod ;
   private String[] T01JZ2_A2809MetTerCod ;
   private int[] T01JZ2_A129BarCod ;
   private byte[] T01JZ2_A132BarCodReo ;
   private String[] T01JZ2_A130BarCodPar ;
   private String[] T01JZ2_A2813MetPieCod ;
   private java.math.BigDecimal[] T01JZ2_A2814MetPieKil ;
   private java.math.BigDecimal[] T01JZ2_A2815MetPieMet ;
   private byte[] T01JZ2_A2816MetPieEst ;
   private String[] T01JZ2_A2846MetPieDsc ;
   private short[] T01JZ2_A4909MetPieDef ;
   private java.util.Date[] T01JZ2_A5136MetPieFch ;
   private short[] T01JZ2_A6635MetPieAnc ;
   private String[] T01JZ2_A10779MetPieOb ;
   private String[] T01JZ2_A10780MetPiectr ;
   private String[] T01JZ2_A10784MetPieId ;
   private String[] T01JZ2_A396EmprCod ;
   private String[] T01JZ45_A396EmprCod ;
   private String[] T01JZ45_A2809MetTerCod ;
   private int[] T01JZ45_A129BarCod ;
   private byte[] T01JZ45_A132BarCodReo ;
   private String[] T01JZ45_A130BarCodPar ;
   private String[] T01JZ45_A2813MetPieCod ;
   private short[] T01JZ45_A12995MetPieDfLi ;
   private String[] T01JZ46_A396EmprCod ;
   private String[] T01JZ46_A2809MetTerCod ;
   private int[] T01JZ46_A129BarCod ;
   private byte[] T01JZ46_A132BarCodReo ;
   private String[] T01JZ46_A130BarCodPar ;
   private String[] T01JZ46_A2813MetPieCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmetpie__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpie__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpie__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpie__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JZ2", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ3", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ4", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF MetTerCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ5", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ7", "SELECT BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ8", "SELECT DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ11", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ13", "SELECT COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieKil) AS MetTotKil, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ16", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetTerCod, T3.BarDisNum, T5.CliNom, T3.BarSer, T3.BarMat, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T4.DisUniMed, T3.BarPes, T3.BarSit, T3.BarAgrEst, T2.EmprNom, T4.DisDes, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.DisCod, T3.CliCod, COALESCE( T7.MetTotKil, 0) AS MetTotKil, COALESCE( T7.MetTotMet, 0) AS MetTotMet, COALESCE( T7.MetTotPie, 0) AS MetTotPie, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes, COALESCE( T6.BarPie1, 0) AS BarPie1 FROM ((((((TXPCMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = T3.DisCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(MetPieKil) AS MetTotKil, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = TM1.EmprCod AND T7.MetTerCod = TM1.MetTerCod AND T7.BarCod = TM1.BarCod AND T7.BarCodReo = TM1.BarCodReo AND T7.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ18", "SELECT BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ19", "SELECT DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ22", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ24", "SELECT COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieKil) AS MetTotKil, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ25", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JZ27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JZ28", "INSERT INTO TXPCMETPI(MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T01JZ29", "DELETE FROM TXPCMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new ForEachCursor("T01JZ30", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ31", "SELECT BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ32", "SELECT DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ33", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ35", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ37", "SELECT COALESCE( T1.MetTotKil, 0) AS MetTotKil, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotPie, 0) AS MetTotPie FROM (SELECT SUM(MetPieKil) AS MetTotKil, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, COUNT(*) AS MetTotPie FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ38", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JZ39", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ40", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, EmprCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JZ41", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JZ42", "INSERT INTO TXPLMETPI(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, EmprCod, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01JZ43", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieEst=?, MetPieDsc=?, MetPieDef=?, MetPieFch=?, MetPieAnc=?, MetPieOb=?, MetPiectr=?, MetPieId=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01JZ44", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01JZ45", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JZ46", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 60);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((String[]) buf[14])[0] = rslt.getString(15, 9);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 60);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((String[]) buf[14])[0] = rslt.getString(15, 9);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 60);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((String[]) buf[14])[0] = rslt.getString(15, 9);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 60);
               stmt.setString(14, (String)parms[13], 40);
               stmt.setString(15, (String)parms[14], 9);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 33 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 60);
               stmt.setString(9, (String)parms[8], 40);
               stmt.setString(10, (String)parms[9], 9);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 9);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

