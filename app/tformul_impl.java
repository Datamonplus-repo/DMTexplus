package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tformul_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A583IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A626MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A626MatCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1514MacProCod = httpContext.GetPar( "MacProCod") ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A1514MacProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3316CodSol = (short)(GXutil.lval( httpContext.GetPar( "CodSol"))) ;
         n3316CodSol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A3316CodSol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A484ForCon = (byte)(GXutil.lval( httpContext.GetPar( "ForCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A484ForCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5362IntCodF = (byte)(GXutil.lval( httpContext.GetPar( "IntCodF"))) ;
         n5362IntCodF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A5362IntCodF) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8561Fam_Cod = (short)(GXutil.lval( httpContext.GetPar( "Fam_Cod"))) ;
         n8561Fam_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A8561Fam_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
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
         gxload_6( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A764ProForCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO DE FORMULAS", ""), (short)(0)) ;
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
      nRC_GXsfl_480 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_480"))) ;
      nGXsfl_480_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_480_idx"))) ;
      sGXsfl_480_idx = httpContext.GetPar( "sGXsfl_480_idx") ;
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

   public tformul_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tformul_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tformul_impl.class ));
   }

   public tformul_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkForPro = UIFactory.getCheckbox(this);
      cmbForBlo = new HTMLChoice();
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
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFORMUL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Externo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCodExt_Internalname, GXutil.rtrim( A5337ForCodExt), GXutil.rtrim( localUtil.format( A5337ForCodExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCodExt_Jsonclick, 0, "", "", "", "", "", 1, edtForCodExt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nº Interno F.", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtForNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli_Internalname, GXutil.rtrim( A1191ForNomCli), GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtForNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Formula", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFec_Internalname, localUtil.format(A485ForFec, "99/99/99"), localUtil.format( A485ForFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFec_Jsonclick, 0, "", "", "", "", "", 1, edtForFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Ultima Modificacion", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForUltMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUltMod_Internalname, localUtil.format(A495ForUltMod, "99/99/99"), localUtil.format( A495ForUltMod, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltMod_Jsonclick, 0, "", "", "", "", "", 1, edtForUltMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForUltMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForUltMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Código Matiz", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatCod_Jsonclick, 0, "", "", "", "", "", 1, edtMatCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Descripción Matiz", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMatDsc_Internalname, GXutil.rtrim( A627MatDsc), GXutil.rtrim( localUtil.format( A627MatDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMatDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Ultima Utilizacion", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForUltUti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUltUti_Internalname, localUtil.format(A496ForUltUti, "99/99/99"), localUtil.format( A496ForUltUti, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltUti_Jsonclick, 0, "", "", "", "", "", 1, edtForUltUti_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForUltUti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForUltUti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A492ForPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPreKgm_Enabled!=0) ? localUtil.format( A492ForPreKgm, "ZZZZZ9.999") : localUtil.format( A492ForPreKgm, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreKgm_Jsonclick, 0, "", "", "", "", "", 1, edtForPreKgm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Precio Mtr.", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A493ForPreMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPreMtr_Enabled!=0) ? localUtil.format( A493ForPreMtr, "ZZZZZ9.999") : localUtil.format( A493ForPreMtr, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreMtr_Jsonclick, 0, "", "", "", "", "", 1, edtForPreMtr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Precio Definitivo", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPreDef_Internalname, GXutil.rtrim( A491ForPreDef), GXutil.rtrim( localUtil.format( A491ForPreDef, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreDef_Jsonclick, 0, "", "", "", "", "", 1, edtForPreDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Opcion de Control", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCon_Internalname, GXutil.ltrim( localUtil.ntoc( A484ForCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A484ForCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A484ForCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCon_Jsonclick, 0, "", "", "", "", "", 1, edtForCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "ArtT1", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtT1_Internalname, GXutil.rtrim( A97ArtT1), GXutil.rtrim( localUtil.format( A97ArtT1, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtT1_Jsonclick, 0, "", "", "", "", "", 1, edtArtT1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "ArtTP1", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTP1_Internalname, GXutil.ltrim( localUtil.ntoc( A102ArtTP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A102ArtTP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A102ArtTP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTP1_Jsonclick, 0, "", "", "", "", "", 1, edtArtTP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "ArtT2", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtT2_Internalname, GXutil.rtrim( A98ArtT2), GXutil.rtrim( localUtil.format( A98ArtT2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtT2_Jsonclick, 0, "", "", "", "", "", 1, edtArtT2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "ArtTP2", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTP2_Internalname, GXutil.ltrim( localUtil.ntoc( A103ArtTP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A103ArtTP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A103ArtTP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTP2_Jsonclick, 0, "", "", "", "", "", 1, edtArtTP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "ArtT3", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtT3_Internalname, GXutil.rtrim( A99ArtT3), GXutil.rtrim( localUtil.format( A99ArtT3, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtT3_Jsonclick, 0, "", "", "", "", "", 1, edtArtT3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "ArtTP3", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTP3_Internalname, GXutil.ltrim( localUtil.ntoc( A104ArtTP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A104ArtTP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A104ArtTP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTP3_Jsonclick, 0, "", "", "", "", "", 1, edtArtTP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "ArtU1", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtU1_Internalname, GXutil.rtrim( A1674ArtU1), GXutil.rtrim( localUtil.format( A1674ArtU1, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtU1_Jsonclick, 0, "", "", "", "", "", 1, edtArtU1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "ArtU2", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtU2_Internalname, GXutil.rtrim( A1675ArtU2), GXutil.rtrim( localUtil.format( A1675ArtU2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtU2_Jsonclick, 0, "", "", "", "", "", 1, edtArtU2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "ArtU3", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtU3_Internalname, GXutil.rtrim( A1676ArtU3), GXutil.rtrim( localUtil.format( A1676ArtU3, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtU3_Jsonclick, 0, "", "", "", "", "", 1, edtArtU3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "ArtUP1", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUP1_Internalname, GXutil.ltrim( localUtil.ntoc( A1677ArtUP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1677ArtUP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1677ArtUP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUP1_Jsonclick, 0, "", "", "", "", "", 1, edtArtUP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "ArtUP2", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUP2_Internalname, GXutil.ltrim( localUtil.ntoc( A1678ArtUP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1678ArtUP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1678ArtUP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUP2_Jsonclick, 0, "", "", "", "", "", 1, edtArtUP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "ArtUP3", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUP3_Internalname, GXutil.ltrim( localUtil.ntoc( A1679ArtUP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1679ArtUP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1679ArtUP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUP3_Jsonclick, 0, "", "", "", "", "", 1, edtArtUP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "ArtMater", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtMater_Internalname, GXutil.rtrim( A1680ArtMater), GXutil.rtrim( localUtil.format( A1680ArtMater, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMater_Jsonclick, 0, "", "", "", "", "", 1, edtArtMater_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Busqueda Cliente-Serie", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindArt_Internalname, GXutil.rtrim( A473FindArt), GXutil.rtrim( localUtil.format( A473FindArt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindArt_Jsonclick, 0, "", "", "", "", "", 1, edtFindArt_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Codigo Empresa", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodV_Internalname, GXutil.rtrim( A400EmprCodV), GXutil.rtrim( localUtil.format( A400EmprCodV, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodV_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCodV_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Codigo Cliente virtual", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCodV_Internalname, GXutil.ltrim( localUtil.ntoc( A254CliCodV, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCodV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A254CliCodV), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A254CliCodV), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCodV_Jsonclick, 0, "", "", "", "", "", 1, edtCliCodV_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Ultima linea", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1159ForUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtForUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Formula Provisional,S/N", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkForPro.getInternalname(), A2749ForPro, "", "", 1, chkForPro.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(236, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,236);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Relacion de Baño", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForRelBan_Internalname, GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForRelBan_Enabled!=0) ? localUtil.format( A2838ForRelBan, "ZZZ9.99") : localUtil.format( A2838ForRelBan, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRelBan_Jsonclick, 0, "", "", "", "", "", 1, edtForRelBan_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Precio Alta Coste Form.", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrecioA_Internalname, GXutil.ltrim( localUtil.ntoc( A3007PrecioA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrecioA_Enabled!=0) ? localUtil.format( A3007PrecioA, "ZZZZZZ9.999") : localUtil.format( A3007PrecioA, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrecioA_Jsonclick, 0, "", "", "", "", "", 1, edtPrecioA_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Precio Modif. Coste Formula", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrecioM_Internalname, GXutil.ltrim( localUtil.ntoc( A3008PrecioM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrecioM_Enabled!=0) ? localUtil.format( A3008PrecioM, "ZZZZZZ9.999") : localUtil.format( A3008PrecioM, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrecioM_Jsonclick, 0, "", "", "", "", "", 1, edtPrecioM_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Tonalidad", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForTonal_Internalname, GXutil.rtrim( A995ForTonal), GXutil.rtrim( localUtil.format( A995ForTonal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTonal_Jsonclick, 0, "", "", "", "", "", 1, edtForTonal_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Nro. Archivo", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumArc_Internalname, GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumArc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumArc_Jsonclick, 0, "", "", "", "", "", 1, edtForNumArc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Solidez", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodSol_Internalname, GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCodSol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodSol_Jsonclick, 0, "", "", "", "", "", 1, edtCodSol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDscSol_Internalname, GXutil.rtrim( A3317DscSol), GXutil.rtrim( localUtil.format( A3317DscSol, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscSol_Jsonclick, 0, "", "", "", "", "", 1, edtDscSol_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForConDsc_Internalname, GXutil.rtrim( A3792ForConDsc), GXutil.rtrim( localUtil.format( A3792ForConDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForConDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForConDsc_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForEst_Internalname, GXutil.rtrim( A3588ForEst), GXutil.rtrim( localUtil.format( A3588ForEst, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForEst_Jsonclick, 0, "", "", "", "", "", 1, edtForEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Codigo de MacroProceso", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, GXutil.rtrim( A1514MacProCod), GXutil.rtrim( localUtil.format( A1514MacProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "", "", "", "", "", 1, edtMacProCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Descripción de MacroProceso", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc_Internalname, GXutil.rtrim( A1515MacProDsc), GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMacProDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "RGB (Color Formula)", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForRGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForRGB_Jsonclick, 0, "", "", "", "", "", 1, edtForRGB_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Coste Formula", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCosForm_Internalname, GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCosForm_Enabled!=0) ? localUtil.format( A4380ForCosForm, "ZZZZ9.99999") : localUtil.format( A4380ForCosForm, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosForm_Jsonclick, 0, "", "", "", "", "", 1, edtForCosForm_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtForTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Opcion Cliente", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForOpcCli_Internalname, GXutil.rtrim( A3560ForOpcCli), GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpcCli_Jsonclick, 0, "", "", "", "", "", 1, edtForOpcCli_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Codigo Intensidad Facturacion", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCodF_Internalname, GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCodF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCodF_Jsonclick, 0, "", "", "", "", "", 1, edtIntCodF_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Descripcion Intensidad", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDscF_Internalname, GXutil.rtrim( A5363IntDscF), GXutil.rtrim( localUtil.format( A5363IntDscF, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDscF_Jsonclick, 0, "", "", "", "", "", 1, edtIntDscF_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Fecha Aprobacion", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecApr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecApr_Internalname, localUtil.format(A3558ForFecApr, "99/99/99"), localUtil.format( A3558ForFecApr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecApr_Jsonclick, 0, "", "", "", "", "", 1, edtForFecApr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecApr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecApr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Usuario Ultimo", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCod_Internalname, GXutil.rtrim( A5624ForUsrCod), GXutil.rtrim( localUtil.format( A5624ForUsrCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCod_Jsonclick, 0, "", "", "", "", "", 1, edtForUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Dia-Hora Ultimo Acceso", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecHor_Internalname, localUtil.ttoc( A5625ForFecHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5625ForFecHor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecHor_Jsonclick, 0, "", "", "", "", "", 1, edtForFecHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Observaciones Precios", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtForObsM_Internalname, A5626ForObsM, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,351);\"", (short)(0), 1, edtForObsM_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Inc p/intensidad de color", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPInc_Internalname, GXutil.ltrim( localUtil.ntoc( A5653ForPInc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPInc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5653ForPInc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5653ForPInc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPInc_Jsonclick, 0, "", "", "", "", "", 1, edtForPInc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Descripción Color ampliada", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli2_Internalname, GXutil.rtrim( A6379ForNomCli2), GXutil.rtrim( localUtil.format( A6379ForNomCli2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli2_Jsonclick, 0, "", "", "", "", "", 1, edtForNomCli2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Utilizador que criou", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUsrCre_Internalname, GXutil.rtrim( A6608ForUsrCre), GXutil.rtrim( localUtil.format( A6608ForUsrCre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,371);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUsrCre_Jsonclick, 0, "", "", "", "", "", 1, edtForUsrCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Data de criacao", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCre_Internalname, localUtil.ttoc( A6609ForFecCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6609ForFecCre, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,376);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCre_Jsonclick, 0, "", "", "", "", "", 1, edtForFecCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "2do Color Cliente \"Largo\"", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNomCli3_Internalname, GXutil.rtrim( A7029ForNomCli3), GXutil.rtrim( localUtil.format( A7029ForNomCli3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNomCli3_Jsonclick, 0, "", "", "", "", "", 1, edtForNomCli3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Opcion Numerico", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForOpNum_Internalname, GXutil.ltrim( localUtil.ntoc( A7537ForOpNum, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForOpNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForOpNum_Jsonclick, 0, "", "", "", "", "", 1, edtForOpNum_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "Bloqueo Color?", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbForBlo, cmbForBlo.getInternalname(), GXutil.rtrim( A7781ForBlo), 1, cmbForBlo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbForBlo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,391);\"", "", true, (byte)(0), "HLP_TFORMUL.htm");
      cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "Tipo de Teñido", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForTipT_Internalname, GXutil.ltrim( localUtil.ntoc( A8043ForTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForTipT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8043ForTipT), "9") : localUtil.format( DecimalUtil.doubleToDec(A8043ForTipT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForTipT_Jsonclick, 0, "", "", "", "", "", 1, edtForTipT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "Codigo Familia", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFam_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A8561Fam_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFam_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8561Fam_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFam_Cod_Jsonclick, 0, "", "", "", "", "", 1, edtFam_Cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "Item1", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFor_item1_Internalname, GXutil.rtrim( A8777For_item1), GXutil.rtrim( localUtil.format( A8777For_item1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_item1_Jsonclick, 0, "", "", "", "", "", 1, edtFor_item1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "Color reoperado?", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFor_Reo_Internalname, GXutil.rtrim( A9792For_Reo), GXutil.rtrim( localUtil.format( A9792For_Reo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_Reo_Jsonclick, 0, "", "", "", "", "", 1, edtFor_Reo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "Fecha Control Inicio", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecCtrl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCtrl_Internalname, localUtil.ttoc( A11041ForFecCtrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11041ForFecCtrl, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCtrl_Jsonclick, 0, "", "", "", "", "", 1, edtForFecCtrl_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecCtrl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecCtrl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "Fecha Control Fin", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecCtrf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecCtrf_Internalname, localUtil.ttoc( A11042ForFecCtrf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11042ForFecCtrf, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecCtrf_Jsonclick, 0, "", "", "", "", "", 1, edtForFecCtrf_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecCtrf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecCtrf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "Kgs.Ultima Tintura Formula HSS", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForKgUTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4224ForKgUTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForKgUTin_Enabled!=0) ? localUtil.format( A4224ForKgUTin, "ZZZZZZZ.ZZ") : localUtil.format( A4224ForKgUTin, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForKgUTin_Jsonclick, 0, "", "", "", "", "", 1, edtForKgUTin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "Total Kgs.Tintados Formula HSS", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForKgTTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4225ForKgTTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForKgTTin_Enabled!=0) ? localUtil.format( A4225ForKgTTin, "ZZZZZZZ.ZZ") : localUtil.format( A4225ForKgTTin, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForKgTTin_Jsonclick, 0, "", "", "", "", "", 1, edtForKgTTin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "Total Coste Kg.Tint.Formu.HSS", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCosTTi_Internalname, GXutil.ltrim( localUtil.ntoc( A4226ForCosTTi, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCosTTi_Enabled!=0) ? localUtil.format( A4226ForCosTTi, "ZZZZZZZZZZ.ZZ") : localUtil.format( A4226ForCosTTi, "ZZZZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,436);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosTTi_Jsonclick, 0, "", "", "", "", "", 1, edtForCosTTi_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "Ultimo Ensayo", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltEnsCod_Internalname, GXutil.rtrim( A3569UltEnsCod), GXutil.rtrim( localUtil.format( A3569UltEnsCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,441);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltEnsCod_Jsonclick, 0, "", "", "", "", "", 1, edtUltEnsCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, httpContext.getMessage( "Fecha Precio Actual", ""), "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForPreFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPreFec_Internalname, localUtil.format(A3585ForPreFec, "99/99/99"), localUtil.format( A3585ForPreFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,446);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreFec_Jsonclick, 0, "", "", "", "", "", 1, edtForPreFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForPreFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForPreFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, httpContext.getMessage( "Precio Anterior", ""), "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A3586ForPreAnt, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPreAnt_Enabled!=0) ? localUtil.format( A3586ForPreAnt, "ZZZZZ9.999") : localUtil.format( A3586ForPreAnt, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPreAnt_Jsonclick, 0, "", "", "", "", "", 1, edtForPreAnt_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock88_Internalname, httpContext.getMessage( "Fecha Precio Anterior", ""), "", "", lblTextblock88_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtForFecAnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForFecAnt_Internalname, localUtil.format(A3587ForFecAnt, "99/99/99"), localUtil.format( A3587ForFecAnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,456);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForFecAnt_Jsonclick, 0, "", "", "", "", "", 1, edtForFecAnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMUL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtForFecAnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtForFecAnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TFORMUL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, httpContext.getMessage( "Item2", ""), "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 461,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFor_item2_Internalname, GXutil.rtrim( A11705For_item2), GXutil.rtrim( localUtil.format( A11705For_item2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,461);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFor_item2_Jsonclick, 0, "", "", "", "", "", 1, edtFor_item2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock90_Internalname, httpContext.getMessage( "Mas Observaciones", ""), "", "", lblTextblock90_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 466,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtForObs2_Internalname, A11706ForObs2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,466);\"", (short)(0), 1, edtForObs2_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock91_Internalname, httpContext.getMessage( "Ovservaciones Precio Lab Dip", ""), "", "", lblTextblock91_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 471,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtForObsFac_Internalname, A12732ForObsFac, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,471);\"", (short)(0), 1, edtForObsFac_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock92_Internalname, httpContext.getMessage( "For Lb Talao", ""), "", "", lblTextblock92_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 476,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForLbTalao_Internalname, GXutil.rtrim( A13102ForLbTalao), GXutil.rtrim( localUtil.format( A13102ForLbTalao, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,476);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForLbTalao_Jsonclick, 0, "", "", "", "", "", 1, edtForLbTalao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMUL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol480( ) ;
      nGXsfl_480_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount154 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_154 = (short)(1) ;
            scanStart12154( ) ;
            while ( RcdFound154 != 0 )
            {
               init_level_properties154( ) ;
               getByPrimaryKey12154( ) ;
               addRow12154( ) ;
               scanNext12154( ) ;
            }
            scanEnd12154( ) ;
            nBlankRcdCount154 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal12154( ) ;
         standaloneModal12154( ) ;
         sMode154 = Gx_mode ;
         while ( nGXsfl_480_idx < nRC_GXsfl_480 )
         {
            bGXsfl_480_Refreshing = true ;
            readRow12154( ) ;
            edtavnRcdDeleted_154_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_154_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_154_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_154_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORL_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForFR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFR_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForFR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForFR_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProFoNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFONPRG_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoNPrg_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForrbn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORRBN_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForrbn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForrbn_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORVOL_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForVol_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMQ_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMq_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            edtProForH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORH2O_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForH2O_Enabled), 5, 0), !bGXsfl_480_Refreshing);
            if ( ( nRcdExists_154 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal12154( ) ;
            }
            sendRow12154( ) ;
            bGXsfl_480_Refreshing = false ;
         }
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount154 = (short)(5) ;
         nRcdExists_154 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart12154( ) ;
            while ( RcdFound154 != 0 )
            {
               sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_480154( ) ;
               init_level_properties154( ) ;
               standaloneNotModal12154( ) ;
               getByPrimaryKey12154( ) ;
               standaloneModal12154( ) ;
               addRow12154( ) ;
               scanNext12154( ) ;
            }
            scanEnd12154( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode154 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_480154( ) ;
      initAll12154( ) ;
      init_level_properties154( ) ;
      nRcdExists_154 = (short)(0) ;
      nIsMod_154 = (short)(0) ;
      nRcdDeleted_154 = (short)(0) ;
      nBlankRcdCount154 = (short)(nBlankRcdUsr154+nBlankRcdCount154) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount154 > 0 )
      {
         standaloneNotModal12154( ) ;
         standaloneModal12154( ) ;
         addRow12154( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount154 = (short)(nBlankRcdCount154-1) ;
      }
      Gx_mode = sMode154 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 493,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 494,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 495,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 496,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMUL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 497,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFORMUL.htm");
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
         Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
         Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
         Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5337ForCodExt = httpContext.cgiGet( "Z5337ForCodExt") ;
         Z1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1192ForNumCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1191ForNomCli = httpContext.cgiGet( "Z1191ForNomCli") ;
         Z485ForFec = localUtil.ctod( httpContext.cgiGet( "Z485ForFec"), 0) ;
         Z495ForUltMod = localUtil.ctod( httpContext.cgiGet( "Z495ForUltMod"), 0) ;
         Z496ForUltUti = localUtil.ctod( httpContext.cgiGet( "Z496ForUltUti"), 0) ;
         Z492ForPreKgm = localUtil.ctond( httpContext.cgiGet( "Z492ForPreKgm")) ;
         Z493ForPreMtr = localUtil.ctond( httpContext.cgiGet( "Z493ForPreMtr")) ;
         Z491ForPreDef = httpContext.cgiGet( "Z491ForPreDef") ;
         Z1159ForUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1159ForUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2749ForPro = httpContext.cgiGet( "Z2749ForPro") ;
         Z2838ForRelBan = localUtil.ctond( httpContext.cgiGet( "Z2838ForRelBan")) ;
         Z3007PrecioA = localUtil.ctond( httpContext.cgiGet( "Z3007PrecioA")) ;
         Z3008PrecioM = localUtil.ctond( httpContext.cgiGet( "Z3008PrecioM")) ;
         Z995ForTonal = httpContext.cgiGet( "Z995ForTonal") ;
         Z3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( "Z3315ForNumArc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3588ForEst = httpContext.cgiGet( "Z3588ForEst") ;
         Z4339ForRGB = localUtil.ctol( httpContext.cgiGet( "Z4339ForRGB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z4380ForCosForm = localUtil.ctond( httpContext.cgiGet( "Z4380ForCosForm")) ;
         Z4384ForTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4384ForTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3560ForOpcCli = httpContext.cgiGet( "Z3560ForOpcCli") ;
         Z3558ForFecApr = localUtil.ctod( httpContext.cgiGet( "Z3558ForFecApr"), 0) ;
         Z5624ForUsrCod = httpContext.cgiGet( "Z5624ForUsrCod") ;
         Z5625ForFecHor = localUtil.ctot( httpContext.cgiGet( "Z5625ForFecHor"), 0) ;
         Z5626ForObsM = httpContext.cgiGet( "Z5626ForObsM") ;
         Z5653ForPInc = (short)(localUtil.ctol( httpContext.cgiGet( "Z5653ForPInc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5742ForSerDsc = httpContext.cgiGet( "Z5742ForSerDsc") ;
         Z6379ForNomCli2 = httpContext.cgiGet( "Z6379ForNomCli2") ;
         Z6608ForUsrCre = httpContext.cgiGet( "Z6608ForUsrCre") ;
         Z6609ForFecCre = localUtil.ctot( httpContext.cgiGet( "Z6609ForFecCre"), 0) ;
         Z7029ForNomCli3 = httpContext.cgiGet( "Z7029ForNomCli3") ;
         Z7537ForOpNum = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7537ForOpNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7781ForBlo = httpContext.cgiGet( "Z7781ForBlo") ;
         Z8043ForTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8043ForTipT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8777For_item1 = httpContext.cgiGet( "Z8777For_item1") ;
         Z9792For_Reo = httpContext.cgiGet( "Z9792For_Reo") ;
         Z11041ForFecCtrl = localUtil.ctot( httpContext.cgiGet( "Z11041ForFecCtrl"), 0) ;
         Z11042ForFecCtrf = localUtil.ctot( httpContext.cgiGet( "Z11042ForFecCtrf"), 0) ;
         Z4224ForKgUTin = localUtil.ctond( httpContext.cgiGet( "Z4224ForKgUTin")) ;
         Z4225ForKgTTin = localUtil.ctond( httpContext.cgiGet( "Z4225ForKgTTin")) ;
         Z4226ForCosTTi = localUtil.ctond( httpContext.cgiGet( "Z4226ForCosTTi")) ;
         Z3569UltEnsCod = httpContext.cgiGet( "Z3569UltEnsCod") ;
         Z3585ForPreFec = localUtil.ctod( httpContext.cgiGet( "Z3585ForPreFec"), 0) ;
         Z3586ForPreAnt = localUtil.ctond( httpContext.cgiGet( "Z3586ForPreAnt")) ;
         Z3587ForFecAnt = localUtil.ctod( httpContext.cgiGet( "Z3587ForFecAnt"), 0) ;
         Z11705For_item2 = httpContext.cgiGet( "Z11705For_item2") ;
         Z11706ForObs2 = httpContext.cgiGet( "Z11706ForObs2") ;
         Z12732ForObsFac = httpContext.cgiGet( "Z12732ForObsFac") ;
         Z13102ForLbTalao = httpContext.cgiGet( "Z13102ForLbTalao") ;
         Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z626MatCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z626MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z1514MacProCod = httpContext.cgiGet( "Z1514MacProCod") ;
         Z3316CodSol = (short)(localUtil.ctol( httpContext.cgiGet( "Z3316CodSol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z484ForCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z484ForCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5362IntCodF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5362IntCodF = ((0==A5362IntCodF) ? true : false) ;
         Z8561Fam_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "Z8561Fam_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_480 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_480"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A483ForColNum = 0 ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         }
         else
         {
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A831TipColCod = (byte)(0) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         }
         else
         {
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         }
         A5337ForCodExt = httpContext.cgiGet( edtForCodExt_Internalname) ;
         n5337ForCodExt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5337ForCodExt", A5337ForCodExt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForNumCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A486ForNumCol = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         }
         else
         {
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForNumCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1192ForNumCli = 0 ;
            n1192ForNumCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         }
         else
         {
            A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1192ForNumCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         }
         A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
         n1191ForNomCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1191ForNomCli", A1191ForNomCli);
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
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         if ( localUtil.vcdate( httpContext.cgiGet( edtForFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A485ForFec = GXutil.nullDate() ;
            n485ForFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         }
         else
         {
            A485ForFec = localUtil.ctod( httpContext.cgiGet( edtForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n485ForFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtForUltMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORULTMOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForUltMod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A495ForUltMod = GXutil.nullDate() ;
            n495ForUltMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         }
         else
         {
            A495ForUltMod = localUtil.ctod( httpContext.cgiGet( edtForUltMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n495ForUltMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtIntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A583IntCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         }
         else
         {
            A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         }
         A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
         n584IntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MATCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMatCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A626MatCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         }
         else
         {
            A626MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         }
         A627MatDsc = httpContext.cgiGet( edtMatDsc_Internalname) ;
         n627MatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtForUltUti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORULTUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForUltUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A496ForUltUti = GXutil.nullDate() ;
            n496ForUltUti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
         }
         else
         {
            A496ForUltUti = localUtil.ctod( httpContext.cgiGet( edtForUltUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n496ForUltUti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPreKgm_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A492ForPreKgm = DecimalUtil.ZERO ;
            n492ForPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
         }
         else
         {
            A492ForPreKgm = localUtil.ctond( httpContext.cgiGet( edtForPreKgm_Internalname)) ;
            n492ForPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPreMtr_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPREMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPreMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A493ForPreMtr = DecimalUtil.ZERO ;
            n493ForPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
         }
         else
         {
            A493ForPreMtr = localUtil.ctond( httpContext.cgiGet( edtForPreMtr_Internalname)) ;
            n493ForPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
         }
         A491ForPreDef = GXutil.upper( httpContext.cgiGet( edtForPreDef_Internalname)) ;
         n491ForPreDef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A491ForPreDef", A491ForPreDef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A484ForCon = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         }
         else
         {
            A484ForCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtForCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A97ArtT1 = httpContext.cgiGet( edtArtT1_Internalname) ;
         n97ArtT1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97ArtT1", A97ArtT1);
         A102ArtTP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n102ArtTP1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A102ArtTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A102ArtTP1), 3, 0));
         A98ArtT2 = httpContext.cgiGet( edtArtT2_Internalname) ;
         n98ArtT2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A98ArtT2", A98ArtT2);
         A103ArtTP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n103ArtTP2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A103ArtTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ArtTP2), 3, 0));
         A99ArtT3 = httpContext.cgiGet( edtArtT3_Internalname) ;
         n99ArtT3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99ArtT3", A99ArtT3);
         A104ArtTP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n104ArtTP3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A104ArtTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ArtTP3), 3, 0));
         A1674ArtU1 = httpContext.cgiGet( edtArtU1_Internalname) ;
         n1674ArtU1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1674ArtU1", A1674ArtU1);
         A1675ArtU2 = httpContext.cgiGet( edtArtU2_Internalname) ;
         n1675ArtU2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1675ArtU2", A1675ArtU2);
         A1676ArtU3 = httpContext.cgiGet( edtArtU3_Internalname) ;
         n1676ArtU3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1676ArtU3", A1676ArtU3);
         A1677ArtUP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1677ArtUP1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1677ArtUP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1677ArtUP1), 3, 0));
         A1678ArtUP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1678ArtUP2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1678ArtUP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1678ArtUP2), 3, 0));
         A1679ArtUP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1679ArtUP3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1679ArtUP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1679ArtUP3), 3, 0));
         A1680ArtMater = httpContext.cgiGet( edtArtMater_Internalname) ;
         n1680ArtMater = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1680ArtMater", A1680ArtMater);
         A473FindArt = httpContext.cgiGet( edtFindArt_Internalname) ;
         n473FindArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A473FindArt", A473FindArt);
         A400EmprCodV = GXutil.upper( httpContext.cgiGet( edtEmprCodV_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A400EmprCodV", A400EmprCodV);
         A254CliCodV = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A254CliCodV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A254CliCodV), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORULTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForUltLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1159ForUltLin = (short)(0) ;
            n1159ForUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         }
         else
         {
            A1159ForUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtForUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1159ForUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         }
         A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
         n2749ForPro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORRELBAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForRelBan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2838ForRelBan = DecimalUtil.ZERO ;
            n2838ForRelBan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         }
         else
         {
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
            n2838ForRelBan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecioA_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecioA_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRECIOA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrecioA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3007PrecioA = DecimalUtil.ZERO ;
            n3007PrecioA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrimstr( A3007PrecioA, 13, 5));
         }
         else
         {
            A3007PrecioA = localUtil.ctond( httpContext.cgiGet( edtPrecioA_Internalname)) ;
            n3007PrecioA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrimstr( A3007PrecioA, 13, 5));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecioM_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecioM_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRECIOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrecioM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3008PrecioM = DecimalUtil.ZERO ;
            n3008PrecioM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrimstr( A3008PrecioM, 13, 5));
         }
         else
         {
            A3008PrecioM = localUtil.ctond( httpContext.cgiGet( edtPrecioM_Internalname)) ;
            n3008PrecioM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrimstr( A3008PrecioM, 13, 5));
         }
         A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
         n995ForTonal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A995ForTonal", A995ForTonal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMARC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForNumArc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3315ForNumArc = 0 ;
            n3315ForNumArc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         }
         else
         {
            A3315ForNumArc = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumArc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3315ForNumArc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCodSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCodSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCodSol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3316CodSol = (short)(0) ;
            n3316CodSol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         }
         else
         {
            A3316CodSol = (short)(localUtil.ctol( httpContext.cgiGet( edtCodSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3316CodSol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         }
         A3317DscSol = httpContext.cgiGet( edtDscSol_Internalname) ;
         n3317DscSol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A3792ForConDsc = httpContext.cgiGet( edtForConDsc_Internalname) ;
         n3792ForConDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
         A3588ForEst = httpContext.cgiGet( edtForEst_Internalname) ;
         n3588ForEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3588ForEst", A3588ForEst);
         A1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1515MacProDsc = httpContext.cgiGet( edtMacProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORRGB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForRGB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4339ForRGB = 0 ;
            n4339ForRGB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         }
         else
         {
            A4339ForRGB = localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n4339ForRGB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSFORM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForCosForm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4380ForCosForm = DecimalUtil.ZERO ;
            n4380ForCosForm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         }
         else
         {
            A4380ForCosForm = localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)) ;
            n4380ForCosForm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForTipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4384ForTipArt = (short)(0) ;
            n4384ForTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         }
         else
         {
            A4384ForTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtForTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4384ForTipArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         }
         A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
         n3560ForOpcCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3560ForOpcCli", A3560ForOpcCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtIntCodF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5362IntCodF = (byte)(0) ;
            n5362IntCodF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         }
         else
         {
            A5362IntCodF = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCodF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5362IntCodF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         }
         n5362IntCodF = ((0==A5362IntCodF) ? true : false) ;
         A5363IntDscF = httpContext.cgiGet( edtIntDscF_Internalname) ;
         n5363IntDscF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
         if ( localUtil.vcdate( httpContext.cgiGet( edtForFecApr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORFECAPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecApr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3558ForFecApr = GXutil.nullDate() ;
            n3558ForFecApr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         }
         else
         {
            A3558ForFecApr = localUtil.ctod( httpContext.cgiGet( edtForFecApr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3558ForFecApr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         }
         A5624ForUsrCod = GXutil.upper( httpContext.cgiGet( edtForUsrCod_Internalname)) ;
         n5624ForUsrCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5624ForUsrCod", A5624ForUsrCod);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtForFecHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FORFECHOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecHor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
            n5625ForFecHor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A5625ForFecHor = localUtil.ctot( httpContext.cgiGet( edtForFecHor_Internalname)) ;
            n5625ForFecHor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5626ForObsM = httpContext.cgiGet( edtForObsM_Internalname) ;
         n5626ForObsM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5626ForObsM", A5626ForObsM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPInc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPInc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPINC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPInc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5653ForPInc = (short)(0) ;
            n5653ForPInc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5653ForPInc), 3, 0));
         }
         else
         {
            A5653ForPInc = (short)(localUtil.ctol( httpContext.cgiGet( edtForPInc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5653ForPInc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5653ForPInc), 3, 0));
         }
         A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
         n5742ForSerDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A6379ForNomCli2 = httpContext.cgiGet( edtForNomCli2_Internalname) ;
         n6379ForNomCli2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6379ForNomCli2", A6379ForNomCli2);
         A6608ForUsrCre = httpContext.cgiGet( edtForUsrCre_Internalname) ;
         n6608ForUsrCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6608ForUsrCre", A6608ForUsrCre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtForFecCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FORFECCRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecCre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
            n6609ForFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6609ForFecCre = localUtil.ctot( httpContext.cgiGet( edtForFecCre_Internalname)) ;
            n6609ForFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A7029ForNomCli3 = httpContext.cgiGet( edtForNomCli3_Internalname) ;
         n7029ForNomCli3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7029ForNomCli3", A7029ForNomCli3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForOpNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForOpNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FOROPNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForOpNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7537ForOpNum = (byte)(0) ;
            n7537ForOpNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         }
         else
         {
            A7537ForOpNum = (byte)(localUtil.ctol( httpContext.cgiGet( edtForOpNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7537ForOpNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         }
         cmbForBlo.setName( cmbForBlo.getInternalname() );
         cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
         A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForTipT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForTipT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORTIPT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForTipT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8043ForTipT = (byte)(0) ;
            n8043ForTipT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
         }
         else
         {
            A8043ForTipT = (byte)(localUtil.ctol( httpContext.cgiGet( edtForTipT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8043ForTipT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFam_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFam_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FAM_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFam_Cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8561Fam_Cod = (short)(0) ;
            n8561Fam_Cod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         }
         else
         {
            A8561Fam_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtFam_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8561Fam_Cod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         }
         A8777For_item1 = httpContext.cgiGet( edtFor_item1_Internalname) ;
         n8777For_item1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8777For_item1", A8777For_item1);
         A9792For_Reo = httpContext.cgiGet( edtFor_Reo_Internalname) ;
         n9792For_Reo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9792For_Reo", A9792For_Reo);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtForFecCtrl_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FORFECCTRL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecCtrl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
            n11041ForFecCtrl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11041ForFecCtrl = localUtil.ctot( httpContext.cgiGet( edtForFecCtrl_Internalname)) ;
            n11041ForFecCtrl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtForFecCtrf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FORFECCTRF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecCtrf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
            n11042ForFecCtrf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11042ForFecCtrf = localUtil.ctot( httpContext.cgiGet( edtForFecCtrf_Internalname)) ;
            n11042ForFecCtrf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForKgUTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForKgUTin_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORKGUTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForKgUTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4224ForKgUTin = DecimalUtil.ZERO ;
            n4224ForKgUTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrimstr( A4224ForKgUTin, 10, 2));
         }
         else
         {
            A4224ForKgUTin = localUtil.ctond( httpContext.cgiGet( edtForKgUTin_Internalname)) ;
            n4224ForKgUTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrimstr( A4224ForKgUTin, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForKgTTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForKgTTin_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORKGTTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForKgTTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4225ForKgTTin = DecimalUtil.ZERO ;
            n4225ForKgTTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrimstr( A4225ForKgTTin, 10, 2));
         }
         else
         {
            A4225ForKgTTin = localUtil.ctond( httpContext.cgiGet( edtForKgTTin_Internalname)) ;
            n4225ForKgTTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrimstr( A4225ForKgTTin, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCosTTi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCosTTi_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSTTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForCosTTi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4226ForCosTTi = DecimalUtil.ZERO ;
            n4226ForCosTTi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrimstr( A4226ForCosTTi, 13, 2));
         }
         else
         {
            A4226ForCosTTi = localUtil.ctond( httpContext.cgiGet( edtForCosTTi_Internalname)) ;
            n4226ForCosTTi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrimstr( A4226ForCosTTi, 13, 2));
         }
         A3569UltEnsCod = GXutil.upper( httpContext.cgiGet( edtUltEnsCod_Internalname)) ;
         n3569UltEnsCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3569UltEnsCod", A3569UltEnsCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtForPreFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORPREFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPreFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3585ForPreFec = GXutil.nullDate() ;
            n3585ForPreFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
         }
         else
         {
            A3585ForPreFec = localUtil.ctod( httpContext.cgiGet( edtForPreFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3585ForPreFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPreAnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPreAnt_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPREANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPreAnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3586ForPreAnt = DecimalUtil.ZERO ;
            n3586ForPreAnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrimstr( A3586ForPreAnt, 12, 5));
         }
         else
         {
            A3586ForPreAnt = localUtil.ctond( httpContext.cgiGet( edtForPreAnt_Internalname)) ;
            n3586ForPreAnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrimstr( A3586ForPreAnt, 12, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtForFecAnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FORFECANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForFecAnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3587ForFecAnt = GXutil.nullDate() ;
            n3587ForFecAnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
         }
         else
         {
            A3587ForFecAnt = localUtil.ctod( httpContext.cgiGet( edtForFecAnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3587ForFecAnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
         }
         A11705For_item2 = httpContext.cgiGet( edtFor_item2_Internalname) ;
         n11705For_item2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11705For_item2", A11705For_item2);
         A11706ForObs2 = httpContext.cgiGet( edtForObs2_Internalname) ;
         n11706ForObs2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11706ForObs2", A11706ForObs2);
         A12732ForObsFac = httpContext.cgiGet( edtForObsFac_Internalname) ;
         n12732ForObsFac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12732ForObsFac", A12732ForObsFac);
         A13102ForLbTalao = httpContext.cgiGet( edtForLbTalao_Internalname) ;
         n13102ForLbTalao = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13102ForLbTalao", A13102ForLbTalao);
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
            initAll1247( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_154_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_154_Enabled), 5, 0), !bGXsfl_480_Refreshing);
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
      disableAttributes1247( ) ;
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

   public void confirm_120( )
   {
      beforeValidate1247( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1247( ) ;
         }
         else
         {
            checkExtendedTable1247( ) ;
            if ( AnyError == 0 )
            {
               zm1247( 5) ;
               zm1247( 6) ;
               zm1247( 7) ;
               zm1247( 8) ;
               zm1247( 9) ;
               zm1247( 10) ;
               zm1247( 11) ;
               zm1247( 12) ;
               zm1247( 13) ;
               zm1247( 14) ;
               zm1247( 15) ;
               zm1247( 16) ;
               zm1247( 17) ;
            }
            closeExtendedTableCursors1247( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_12154( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode47 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues120( ) ;
      }
   }

   public void confirm_12154( )
   {
      nGXsfl_480_idx = 0 ;
      while ( nGXsfl_480_idx < nRC_GXsfl_480 )
      {
         readRow12154( ) ;
         if ( ( nRcdExists_154 != 0 ) || ( nIsMod_154 != 0 ) )
         {
            getKey12154( ) ;
            if ( ( nRcdExists_154 == 0 ) && ( nRcdDeleted_154 == 0 ) )
            {
               if ( RcdFound154 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate12154( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable12154( ) ;
                     if ( AnyError == 0 )
                     {
                        zm12154( 19) ;
                     }
                     closeExtendedTableCursors12154( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROFORL_" + sGXsfl_480_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound154 != 0 )
               {
                  if ( nRcdDeleted_154 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey12154( ) ;
                     load12154( ) ;
                     beforeValidate12154( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls12154( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_154 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate12154( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable12154( ) ;
                           if ( AnyError == 0 )
                           {
                              zm12154( 19) ;
                           }
                           closeExtendedTableCursors12154( ) ;
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
                  if ( nRcdDeleted_154 == 0 )
                  {
                     GXCCtl = "PROFORL_" + sGXsfl_480_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_154_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForL_Internalname, GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtProForFR_Internalname, GXutil.rtrim( A6549ProForFR)) ;
         httpContext.changePostValue( edtProFoNPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForrbn_Internalname, GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForVol_Internalname, GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForMq_Internalname, GXutil.rtrim( A9707ProForMq)) ;
         httpContext.changePostValue( edtProForH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_480_idx, GXutil.rtrim( Z6549ProForFR)) ;
         httpContext.changePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_480_idx, GXutil.rtrim( Z9707ProForMq)) ;
         httpContext.changePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_480_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_154 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_154_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_154_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFR_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForFR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFONPRG_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORRBN_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORVOL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMQ_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORH2O_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption120( )
   {
   }

   public void zm1247( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5337ForCodExt = T00126_A5337ForCodExt[0] ;
            Z1192ForNumCli = T00126_A1192ForNumCli[0] ;
            Z1191ForNomCli = T00126_A1191ForNomCli[0] ;
            Z485ForFec = T00126_A485ForFec[0] ;
            Z495ForUltMod = T00126_A495ForUltMod[0] ;
            Z496ForUltUti = T00126_A496ForUltUti[0] ;
            Z492ForPreKgm = T00126_A492ForPreKgm[0] ;
            Z493ForPreMtr = T00126_A493ForPreMtr[0] ;
            Z491ForPreDef = T00126_A491ForPreDef[0] ;
            Z1159ForUltLin = T00126_A1159ForUltLin[0] ;
            Z2749ForPro = T00126_A2749ForPro[0] ;
            Z2838ForRelBan = T00126_A2838ForRelBan[0] ;
            Z3007PrecioA = T00126_A3007PrecioA[0] ;
            Z3008PrecioM = T00126_A3008PrecioM[0] ;
            Z995ForTonal = T00126_A995ForTonal[0] ;
            Z3315ForNumArc = T00126_A3315ForNumArc[0] ;
            Z3588ForEst = T00126_A3588ForEst[0] ;
            Z4339ForRGB = T00126_A4339ForRGB[0] ;
            Z4380ForCosForm = T00126_A4380ForCosForm[0] ;
            Z4384ForTipArt = T00126_A4384ForTipArt[0] ;
            Z3560ForOpcCli = T00126_A3560ForOpcCli[0] ;
            Z3558ForFecApr = T00126_A3558ForFecApr[0] ;
            Z5624ForUsrCod = T00126_A5624ForUsrCod[0] ;
            Z5625ForFecHor = T00126_A5625ForFecHor[0] ;
            Z5626ForObsM = T00126_A5626ForObsM[0] ;
            Z5653ForPInc = T00126_A5653ForPInc[0] ;
            Z5742ForSerDsc = T00126_A5742ForSerDsc[0] ;
            Z6379ForNomCli2 = T00126_A6379ForNomCli2[0] ;
            Z6608ForUsrCre = T00126_A6608ForUsrCre[0] ;
            Z6609ForFecCre = T00126_A6609ForFecCre[0] ;
            Z7029ForNomCli3 = T00126_A7029ForNomCli3[0] ;
            Z7537ForOpNum = T00126_A7537ForOpNum[0] ;
            Z7781ForBlo = T00126_A7781ForBlo[0] ;
            Z8043ForTipT = T00126_A8043ForTipT[0] ;
            Z8777For_item1 = T00126_A8777For_item1[0] ;
            Z9792For_Reo = T00126_A9792For_Reo[0] ;
            Z11041ForFecCtrl = T00126_A11041ForFecCtrl[0] ;
            Z11042ForFecCtrf = T00126_A11042ForFecCtrf[0] ;
            Z4224ForKgUTin = T00126_A4224ForKgUTin[0] ;
            Z4225ForKgTTin = T00126_A4225ForKgTTin[0] ;
            Z4226ForCosTTi = T00126_A4226ForCosTTi[0] ;
            Z3569UltEnsCod = T00126_A3569UltEnsCod[0] ;
            Z3585ForPreFec = T00126_A3585ForPreFec[0] ;
            Z3586ForPreAnt = T00126_A3586ForPreAnt[0] ;
            Z3587ForFecAnt = T00126_A3587ForFecAnt[0] ;
            Z11705For_item2 = T00126_A11705For_item2[0] ;
            Z11706ForObs2 = T00126_A11706ForObs2[0] ;
            Z12732ForObsFac = T00126_A12732ForObsFac[0] ;
            Z13102ForLbTalao = T00126_A13102ForLbTalao[0] ;
            Z486ForNumCol = T00126_A486ForNumCol[0] ;
            Z583IntCod = T00126_A583IntCod[0] ;
            Z626MatCod = T00126_A626MatCod[0] ;
            Z129BarCod = T00126_A129BarCod[0] ;
            Z132BarCodReo = T00126_A132BarCodReo[0] ;
            Z130BarCodPar = T00126_A130BarCodPar[0] ;
            Z1514MacProCod = T00126_A1514MacProCod[0] ;
            Z3316CodSol = T00126_A3316CodSol[0] ;
            Z484ForCon = T00126_A484ForCon[0] ;
            Z5362IntCodF = T00126_A5362IntCodF[0] ;
            Z8561Fam_Cod = T00126_A8561Fam_Cod[0] ;
         }
         else
         {
            Z5337ForCodExt = A5337ForCodExt ;
            Z1192ForNumCli = A1192ForNumCli ;
            Z1191ForNomCli = A1191ForNomCli ;
            Z485ForFec = A485ForFec ;
            Z495ForUltMod = A495ForUltMod ;
            Z496ForUltUti = A496ForUltUti ;
            Z492ForPreKgm = A492ForPreKgm ;
            Z493ForPreMtr = A493ForPreMtr ;
            Z491ForPreDef = A491ForPreDef ;
            Z1159ForUltLin = A1159ForUltLin ;
            Z2749ForPro = A2749ForPro ;
            Z2838ForRelBan = A2838ForRelBan ;
            Z3007PrecioA = A3007PrecioA ;
            Z3008PrecioM = A3008PrecioM ;
            Z995ForTonal = A995ForTonal ;
            Z3315ForNumArc = A3315ForNumArc ;
            Z3588ForEst = A3588ForEst ;
            Z4339ForRGB = A4339ForRGB ;
            Z4380ForCosForm = A4380ForCosForm ;
            Z4384ForTipArt = A4384ForTipArt ;
            Z3560ForOpcCli = A3560ForOpcCli ;
            Z3558ForFecApr = A3558ForFecApr ;
            Z5624ForUsrCod = A5624ForUsrCod ;
            Z5625ForFecHor = A5625ForFecHor ;
            Z5626ForObsM = A5626ForObsM ;
            Z5653ForPInc = A5653ForPInc ;
            Z5742ForSerDsc = A5742ForSerDsc ;
            Z6379ForNomCli2 = A6379ForNomCli2 ;
            Z6608ForUsrCre = A6608ForUsrCre ;
            Z6609ForFecCre = A6609ForFecCre ;
            Z7029ForNomCli3 = A7029ForNomCli3 ;
            Z7537ForOpNum = A7537ForOpNum ;
            Z7781ForBlo = A7781ForBlo ;
            Z8043ForTipT = A8043ForTipT ;
            Z8777For_item1 = A8777For_item1 ;
            Z9792For_Reo = A9792For_Reo ;
            Z11041ForFecCtrl = A11041ForFecCtrl ;
            Z11042ForFecCtrf = A11042ForFecCtrf ;
            Z4224ForKgUTin = A4224ForKgUTin ;
            Z4225ForKgTTin = A4225ForKgTTin ;
            Z4226ForCosTTi = A4226ForCosTTi ;
            Z3569UltEnsCod = A3569UltEnsCod ;
            Z3585ForPreFec = A3585ForPreFec ;
            Z3586ForPreAnt = A3586ForPreAnt ;
            Z3587ForFecAnt = A3587ForFecAnt ;
            Z11705For_item2 = A11705For_item2 ;
            Z11706ForObs2 = A11706ForObs2 ;
            Z12732ForObsFac = A12732ForObsFac ;
            Z13102ForLbTalao = A13102ForLbTalao ;
            Z486ForNumCol = A486ForNumCol ;
            Z583IntCod = A583IntCod ;
            Z626MatCod = A626MatCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z1514MacProCod = A1514MacProCod ;
            Z3316CodSol = A3316CodSol ;
            Z484ForCon = A484ForCon ;
            Z5362IntCodF = A5362IntCodF ;
            Z8561Fam_Cod = A8561Fam_Cod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z5337ForCodExt = A5337ForCodExt ;
         Z1192ForNumCli = A1192ForNumCli ;
         Z1191ForNomCli = A1191ForNomCli ;
         Z485ForFec = A485ForFec ;
         Z495ForUltMod = A495ForUltMod ;
         Z496ForUltUti = A496ForUltUti ;
         Z492ForPreKgm = A492ForPreKgm ;
         Z493ForPreMtr = A493ForPreMtr ;
         Z491ForPreDef = A491ForPreDef ;
         Z1159ForUltLin = A1159ForUltLin ;
         Z2749ForPro = A2749ForPro ;
         Z2838ForRelBan = A2838ForRelBan ;
         Z3007PrecioA = A3007PrecioA ;
         Z3008PrecioM = A3008PrecioM ;
         Z995ForTonal = A995ForTonal ;
         Z3315ForNumArc = A3315ForNumArc ;
         Z3588ForEst = A3588ForEst ;
         Z4339ForRGB = A4339ForRGB ;
         Z4380ForCosForm = A4380ForCosForm ;
         Z4384ForTipArt = A4384ForTipArt ;
         Z3560ForOpcCli = A3560ForOpcCli ;
         Z3558ForFecApr = A3558ForFecApr ;
         Z5624ForUsrCod = A5624ForUsrCod ;
         Z5625ForFecHor = A5625ForFecHor ;
         Z5626ForObsM = A5626ForObsM ;
         Z5653ForPInc = A5653ForPInc ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z6379ForNomCli2 = A6379ForNomCli2 ;
         Z6608ForUsrCre = A6608ForUsrCre ;
         Z6609ForFecCre = A6609ForFecCre ;
         Z7029ForNomCli3 = A7029ForNomCli3 ;
         Z7537ForOpNum = A7537ForOpNum ;
         Z7781ForBlo = A7781ForBlo ;
         Z8043ForTipT = A8043ForTipT ;
         Z8777For_item1 = A8777For_item1 ;
         Z9792For_Reo = A9792For_Reo ;
         Z11041ForFecCtrl = A11041ForFecCtrl ;
         Z11042ForFecCtrf = A11042ForFecCtrf ;
         Z4224ForKgUTin = A4224ForKgUTin ;
         Z4225ForKgTTin = A4225ForKgTTin ;
         Z4226ForCosTTi = A4226ForCosTTi ;
         Z3569UltEnsCod = A3569UltEnsCod ;
         Z3585ForPreFec = A3585ForPreFec ;
         Z3586ForPreAnt = A3586ForPreAnt ;
         Z3587ForFecAnt = A3587ForFecAnt ;
         Z11705For_item2 = A11705For_item2 ;
         Z11706ForObs2 = A11706ForObs2 ;
         Z12732ForObsFac = A12732ForObsFac ;
         Z13102ForLbTalao = A13102ForLbTalao ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z583IntCod = A583IntCod ;
         Z626MatCod = A626MatCod ;
         Z831TipColCod = A831TipColCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1514MacProCod = A1514MacProCod ;
         Z3316CodSol = A3316CodSol ;
         Z484ForCon = A484ForCon ;
         Z5362IntCodF = A5362IntCodF ;
         Z8561Fam_Cod = A8561Fam_Cod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
         Z213BarSit = A213BarSit ;
         Z584IntDsc = A584IntDsc ;
         Z627MatDsc = A627MatDsc ;
         Z3792ForConDsc = A3792ForConDsc ;
         Z3317DscSol = A3317DscSol ;
         Z1515MacProDsc = A1515MacProDsc ;
         Z5363IntDscF = A5363IntDscF ;
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

   public void load1247( )
   {
      /* Using cursor T001220 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A5337ForCodExt = T001220_A5337ForCodExt[0] ;
         n5337ForCodExt = T001220_n5337ForCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5337ForCodExt", A5337ForCodExt);
         A1192ForNumCli = T001220_A1192ForNumCli[0] ;
         n1192ForNumCli = T001220_n1192ForNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         A1191ForNomCli = T001220_A1191ForNomCli[0] ;
         n1191ForNomCli = T001220_n1191ForNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1191ForNomCli", A1191ForNomCli);
         A213BarSit = T001220_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A485ForFec = T001220_A485ForFec[0] ;
         n485ForFec = T001220_n485ForFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         A495ForUltMod = T001220_A495ForUltMod[0] ;
         n495ForUltMod = T001220_n495ForUltMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         A584IntDsc = T001220_A584IntDsc[0] ;
         n584IntDsc = T001220_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A627MatDsc = T001220_A627MatDsc[0] ;
         n627MatDsc = T001220_n627MatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
         A496ForUltUti = T001220_A496ForUltUti[0] ;
         n496ForUltUti = T001220_n496ForUltUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
         A492ForPreKgm = T001220_A492ForPreKgm[0] ;
         n492ForPreKgm = T001220_n492ForPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
         A493ForPreMtr = T001220_A493ForPreMtr[0] ;
         n493ForPreMtr = T001220_n493ForPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
         A491ForPreDef = T001220_A491ForPreDef[0] ;
         n491ForPreDef = T001220_n491ForPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491ForPreDef", A491ForPreDef);
         A407EmprNom = T001220_A407EmprNom[0] ;
         n407EmprNom = T001220_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1159ForUltLin = T001220_A1159ForUltLin[0] ;
         n1159ForUltLin = T001220_n1159ForUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         A2749ForPro = T001220_A2749ForPro[0] ;
         n2749ForPro = T001220_n2749ForPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
         A2838ForRelBan = T001220_A2838ForRelBan[0] ;
         n2838ForRelBan = T001220_n2838ForRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         A3007PrecioA = T001220_A3007PrecioA[0] ;
         n3007PrecioA = T001220_n3007PrecioA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrimstr( A3007PrecioA, 13, 5));
         A3008PrecioM = T001220_A3008PrecioM[0] ;
         n3008PrecioM = T001220_n3008PrecioM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrimstr( A3008PrecioM, 13, 5));
         A995ForTonal = T001220_A995ForTonal[0] ;
         n995ForTonal = T001220_n995ForTonal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A995ForTonal", A995ForTonal);
         A3315ForNumArc = T001220_A3315ForNumArc[0] ;
         n3315ForNumArc = T001220_n3315ForNumArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         A3317DscSol = T001220_A3317DscSol[0] ;
         n3317DscSol = T001220_n3317DscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
         A279CliNom = T001220_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A832TipColDsc = T001220_A832TipColDsc[0] ;
         n832TipColDsc = T001220_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A3792ForConDsc = T001220_A3792ForConDsc[0] ;
         n3792ForConDsc = T001220_n3792ForConDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
         A3588ForEst = T001220_A3588ForEst[0] ;
         n3588ForEst = T001220_n3588ForEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3588ForEst", A3588ForEst);
         A1515MacProDsc = T001220_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A4339ForRGB = T001220_A4339ForRGB[0] ;
         n4339ForRGB = T001220_n4339ForRGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         A4380ForCosForm = T001220_A4380ForCosForm[0] ;
         n4380ForCosForm = T001220_n4380ForCosForm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         A4384ForTipArt = T001220_A4384ForTipArt[0] ;
         n4384ForTipArt = T001220_n4384ForTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         A3560ForOpcCli = T001220_A3560ForOpcCli[0] ;
         n3560ForOpcCli = T001220_n3560ForOpcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3560ForOpcCli", A3560ForOpcCli);
         A5363IntDscF = T001220_A5363IntDscF[0] ;
         n5363IntDscF = T001220_n5363IntDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
         A3558ForFecApr = T001220_A3558ForFecApr[0] ;
         n3558ForFecApr = T001220_n3558ForFecApr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         A5624ForUsrCod = T001220_A5624ForUsrCod[0] ;
         n5624ForUsrCod = T001220_n5624ForUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5624ForUsrCod", A5624ForUsrCod);
         A5625ForFecHor = T001220_A5625ForFecHor[0] ;
         n5625ForFecHor = T001220_n5625ForFecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5626ForObsM = T001220_A5626ForObsM[0] ;
         n5626ForObsM = T001220_n5626ForObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5626ForObsM", A5626ForObsM);
         A5653ForPInc = T001220_A5653ForPInc[0] ;
         n5653ForPInc = T001220_n5653ForPInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5653ForPInc), 3, 0));
         A5742ForSerDsc = T001220_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T001220_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A6379ForNomCli2 = T001220_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = T001220_n6379ForNomCli2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6379ForNomCli2", A6379ForNomCli2);
         A6608ForUsrCre = T001220_A6608ForUsrCre[0] ;
         n6608ForUsrCre = T001220_n6608ForUsrCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6608ForUsrCre", A6608ForUsrCre);
         A6609ForFecCre = T001220_A6609ForFecCre[0] ;
         n6609ForFecCre = T001220_n6609ForFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7029ForNomCli3 = T001220_A7029ForNomCli3[0] ;
         n7029ForNomCli3 = T001220_n7029ForNomCli3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7029ForNomCli3", A7029ForNomCli3);
         A7537ForOpNum = T001220_A7537ForOpNum[0] ;
         n7537ForOpNum = T001220_n7537ForOpNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         A7781ForBlo = T001220_A7781ForBlo[0] ;
         n7781ForBlo = T001220_n7781ForBlo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
         A8043ForTipT = T001220_A8043ForTipT[0] ;
         n8043ForTipT = T001220_n8043ForTipT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
         A8777For_item1 = T001220_A8777For_item1[0] ;
         n8777For_item1 = T001220_n8777For_item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8777For_item1", A8777For_item1);
         A9792For_Reo = T001220_A9792For_Reo[0] ;
         n9792For_Reo = T001220_n9792For_Reo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9792For_Reo", A9792For_Reo);
         A11041ForFecCtrl = T001220_A11041ForFecCtrl[0] ;
         n11041ForFecCtrl = T001220_n11041ForFecCtrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11042ForFecCtrf = T001220_A11042ForFecCtrf[0] ;
         n11042ForFecCtrf = T001220_n11042ForFecCtrf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4224ForKgUTin = T001220_A4224ForKgUTin[0] ;
         n4224ForKgUTin = T001220_n4224ForKgUTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrimstr( A4224ForKgUTin, 10, 2));
         A4225ForKgTTin = T001220_A4225ForKgTTin[0] ;
         n4225ForKgTTin = T001220_n4225ForKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrimstr( A4225ForKgTTin, 10, 2));
         A4226ForCosTTi = T001220_A4226ForCosTTi[0] ;
         n4226ForCosTTi = T001220_n4226ForCosTTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrimstr( A4226ForCosTTi, 13, 2));
         A3569UltEnsCod = T001220_A3569UltEnsCod[0] ;
         n3569UltEnsCod = T001220_n3569UltEnsCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3569UltEnsCod", A3569UltEnsCod);
         A3585ForPreFec = T001220_A3585ForPreFec[0] ;
         n3585ForPreFec = T001220_n3585ForPreFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
         A3586ForPreAnt = T001220_A3586ForPreAnt[0] ;
         n3586ForPreAnt = T001220_n3586ForPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrimstr( A3586ForPreAnt, 12, 5));
         A3587ForFecAnt = T001220_A3587ForFecAnt[0] ;
         n3587ForFecAnt = T001220_n3587ForFecAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
         A11705For_item2 = T001220_A11705For_item2[0] ;
         n11705For_item2 = T001220_n11705For_item2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11705For_item2", A11705For_item2);
         A11706ForObs2 = T001220_A11706ForObs2[0] ;
         n11706ForObs2 = T001220_n11706ForObs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11706ForObs2", A11706ForObs2);
         A12732ForObsFac = T001220_A12732ForObsFac[0] ;
         n12732ForObsFac = T001220_n12732ForObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12732ForObsFac", A12732ForObsFac);
         A13102ForLbTalao = T001220_A13102ForLbTalao[0] ;
         n13102ForLbTalao = T001220_n13102ForLbTalao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13102ForLbTalao", A13102ForLbTalao);
         A486ForNumCol = T001220_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A583IntCod = T001220_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A626MatCod = T001220_A626MatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         A129BarCod = T001220_A129BarCod[0] ;
         n129BarCod = T001220_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T001220_A132BarCodReo[0] ;
         n132BarCodReo = T001220_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T001220_A130BarCodPar[0] ;
         n130BarCodPar = T001220_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1514MacProCod = T001220_A1514MacProCod[0] ;
         n1514MacProCod = T001220_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3316CodSol = T001220_A3316CodSol[0] ;
         n3316CodSol = T001220_n3316CodSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         A484ForCon = T001220_A484ForCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         A5362IntCodF = T001220_A5362IntCodF[0] ;
         n5362IntCodF = T001220_n5362IntCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         A8561Fam_Cod = T001220_A8561Fam_Cod[0] ;
         n8561Fam_Cod = T001220_n8561Fam_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         zm1247( -4) ;
      }
      pr_default.close(18);
      onLoadActions1247( ) ;
   }

   public void onLoadActions1247( )
   {
   }

   public void checkExtendedTable1247( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00127 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00127_A407EmprNom[0] ;
      n407EmprNom = T00127_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00129 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T001210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T001210_A584IntDsc[0] ;
      n584IntDsc = T001210_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(8);
      /* Using cursor T001211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A627MatDsc = T001211_A627MatDsc[0] ;
      n627MatDsc = T001211_n627MatDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      pr_default.close(9);
      /* Using cursor T001213 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A213BarSit = T001213_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      pr_default.close(11);
      /* Using cursor T001214 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1515MacProDsc = T001214_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      pr_default.close(12);
      /* Using cursor T001215 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3317DscSol = T001215_A3317DscSol[0] ;
      n3317DscSol = T001215_n3317DscSol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      pr_default.close(13);
      /* Using cursor T001216 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A484ForCon)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORCTR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3792ForConDsc = T001216_A3792ForConDsc[0] ;
      n3792ForConDsc = T001216_n3792ForConDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
      pr_default.close(14);
      /* Using cursor T001217 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5362IntCodF) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5363IntDscF = T001217_A5363IntDscF[0] ;
      n5363IntDscF = T001217_n5363IntDscF[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
      pr_default.close(15);
      /* Using cursor T001218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A8561Fam_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FAMTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FAM_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(16);
      /* Using cursor T00128 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00128_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T001212 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T001212_A832TipColDsc[0] ;
      n832TipColDsc = T001212_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A491ForPreDef, "S") == 0 ) || ( GXutil.strcmp(A491ForPreDef, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Precio Definitivo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPREDEF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPreDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1247( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(6);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T001221 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001221_A407EmprNom[0] ;
      n407EmprNom = T001221_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_7( String A396EmprCod ,
                         int A486ForNumCol )
   {
      /* Using cursor T001222 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_8( String A396EmprCod ,
                         byte A583IntCod )
   {
      /* Using cursor T001223 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T001223_A584IntDsc[0] ;
      n584IntDsc = T001223_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
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
                         short A626MatCod )
   {
      /* Using cursor T001224 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A627MatDsc = T001224_A627MatDsc[0] ;
      n627MatDsc = T001224_n627MatDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A627MatDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_11( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T001225 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A213BarSit = T001225_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void gxload_12( String A396EmprCod ,
                          String A1514MacProCod )
   {
      /* Using cursor T001226 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1515MacProDsc = T001226_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1515MacProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_13( String A396EmprCod ,
                          short A3316CodSol )
   {
      /* Using cursor T001227 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3317DscSol = T001227_A3317DscSol[0] ;
      n3317DscSol = T001227_n3317DscSol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3317DscSol))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void gxload_14( String A396EmprCod ,
                          byte A484ForCon )
   {
      /* Using cursor T001228 */
      pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A484ForCon)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORCTR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3792ForConDsc = T001228_A3792ForConDsc[0] ;
      n3792ForConDsc = T001228_n3792ForConDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3792ForConDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_15( String A396EmprCod ,
                          byte A5362IntCodF )
   {
      /* Using cursor T001229 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5362IntCodF) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5363IntDscF = T001229_A5363IntDscF[0] ;
      n5363IntDscF = T001229_n5363IntDscF[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5363IntDscF))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void gxload_16( String A396EmprCod ,
                          short A8561Fam_Cod )
   {
      /* Using cursor T001230 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A8561Fam_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FAMTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FAM_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T001231 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T001231_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void gxload_10( String A396EmprCod ,
                          byte A831TipColCod )
   {
      /* Using cursor T001232 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T001232_A832TipColDsc[0] ;
      n832TipColDsc = T001232_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A832TipColDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void getKey1247( )
   {
      /* Using cursor T001233 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00126 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1247( 4) ;
         RcdFound47 = (short)(1) ;
         A494ForSer = T00126_A494ForSer[0] ;
         n494ForSer = T00126_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T00126_A482ForColNom[0] ;
         n482ForColNom = T00126_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T00126_A483ForColNum[0] ;
         n483ForColNum = T00126_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A5337ForCodExt = T00126_A5337ForCodExt[0] ;
         n5337ForCodExt = T00126_n5337ForCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5337ForCodExt", A5337ForCodExt);
         A1192ForNumCli = T00126_A1192ForNumCli[0] ;
         n1192ForNumCli = T00126_n1192ForNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
         A1191ForNomCli = T00126_A1191ForNomCli[0] ;
         n1191ForNomCli = T00126_n1191ForNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1191ForNomCli", A1191ForNomCli);
         A485ForFec = T00126_A485ForFec[0] ;
         n485ForFec = T00126_n485ForFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
         A495ForUltMod = T00126_A495ForUltMod[0] ;
         n495ForUltMod = T00126_n495ForUltMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
         A496ForUltUti = T00126_A496ForUltUti[0] ;
         n496ForUltUti = T00126_n496ForUltUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
         A492ForPreKgm = T00126_A492ForPreKgm[0] ;
         n492ForPreKgm = T00126_n492ForPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
         A493ForPreMtr = T00126_A493ForPreMtr[0] ;
         n493ForPreMtr = T00126_n493ForPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
         A491ForPreDef = T00126_A491ForPreDef[0] ;
         n491ForPreDef = T00126_n491ForPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491ForPreDef", A491ForPreDef);
         A1159ForUltLin = T00126_A1159ForUltLin[0] ;
         n1159ForUltLin = T00126_n1159ForUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
         A2749ForPro = T00126_A2749ForPro[0] ;
         n2749ForPro = T00126_n2749ForPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
         A2838ForRelBan = T00126_A2838ForRelBan[0] ;
         n2838ForRelBan = T00126_n2838ForRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
         A3007PrecioA = T00126_A3007PrecioA[0] ;
         n3007PrecioA = T00126_n3007PrecioA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrimstr( A3007PrecioA, 13, 5));
         A3008PrecioM = T00126_A3008PrecioM[0] ;
         n3008PrecioM = T00126_n3008PrecioM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrimstr( A3008PrecioM, 13, 5));
         A995ForTonal = T00126_A995ForTonal[0] ;
         n995ForTonal = T00126_n995ForTonal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A995ForTonal", A995ForTonal);
         A3315ForNumArc = T00126_A3315ForNumArc[0] ;
         n3315ForNumArc = T00126_n3315ForNumArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
         A3588ForEst = T00126_A3588ForEst[0] ;
         n3588ForEst = T00126_n3588ForEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3588ForEst", A3588ForEst);
         A4339ForRGB = T00126_A4339ForRGB[0] ;
         n4339ForRGB = T00126_n4339ForRGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
         A4380ForCosForm = T00126_A4380ForCosForm[0] ;
         n4380ForCosForm = T00126_n4380ForCosForm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         A4384ForTipArt = T00126_A4384ForTipArt[0] ;
         n4384ForTipArt = T00126_n4384ForTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
         A3560ForOpcCli = T00126_A3560ForOpcCli[0] ;
         n3560ForOpcCli = T00126_n3560ForOpcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3560ForOpcCli", A3560ForOpcCli);
         A3558ForFecApr = T00126_A3558ForFecApr[0] ;
         n3558ForFecApr = T00126_n3558ForFecApr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
         A5624ForUsrCod = T00126_A5624ForUsrCod[0] ;
         n5624ForUsrCod = T00126_n5624ForUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5624ForUsrCod", A5624ForUsrCod);
         A5625ForFecHor = T00126_A5625ForFecHor[0] ;
         n5625ForFecHor = T00126_n5625ForFecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5626ForObsM = T00126_A5626ForObsM[0] ;
         n5626ForObsM = T00126_n5626ForObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5626ForObsM", A5626ForObsM);
         A5653ForPInc = T00126_A5653ForPInc[0] ;
         n5653ForPInc = T00126_n5653ForPInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5653ForPInc), 3, 0));
         A5742ForSerDsc = T00126_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T00126_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A6379ForNomCli2 = T00126_A6379ForNomCli2[0] ;
         n6379ForNomCli2 = T00126_n6379ForNomCli2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6379ForNomCli2", A6379ForNomCli2);
         A6608ForUsrCre = T00126_A6608ForUsrCre[0] ;
         n6608ForUsrCre = T00126_n6608ForUsrCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6608ForUsrCre", A6608ForUsrCre);
         A6609ForFecCre = T00126_A6609ForFecCre[0] ;
         n6609ForFecCre = T00126_n6609ForFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7029ForNomCli3 = T00126_A7029ForNomCli3[0] ;
         n7029ForNomCli3 = T00126_n7029ForNomCli3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7029ForNomCli3", A7029ForNomCli3);
         A7537ForOpNum = T00126_A7537ForOpNum[0] ;
         n7537ForOpNum = T00126_n7537ForOpNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
         A7781ForBlo = T00126_A7781ForBlo[0] ;
         n7781ForBlo = T00126_n7781ForBlo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
         A8043ForTipT = T00126_A8043ForTipT[0] ;
         n8043ForTipT = T00126_n8043ForTipT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
         A8777For_item1 = T00126_A8777For_item1[0] ;
         n8777For_item1 = T00126_n8777For_item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8777For_item1", A8777For_item1);
         A9792For_Reo = T00126_A9792For_Reo[0] ;
         n9792For_Reo = T00126_n9792For_Reo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9792For_Reo", A9792For_Reo);
         A11041ForFecCtrl = T00126_A11041ForFecCtrl[0] ;
         n11041ForFecCtrl = T00126_n11041ForFecCtrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11042ForFecCtrf = T00126_A11042ForFecCtrf[0] ;
         n11042ForFecCtrf = T00126_n11042ForFecCtrf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4224ForKgUTin = T00126_A4224ForKgUTin[0] ;
         n4224ForKgUTin = T00126_n4224ForKgUTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrimstr( A4224ForKgUTin, 10, 2));
         A4225ForKgTTin = T00126_A4225ForKgTTin[0] ;
         n4225ForKgTTin = T00126_n4225ForKgTTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrimstr( A4225ForKgTTin, 10, 2));
         A4226ForCosTTi = T00126_A4226ForCosTTi[0] ;
         n4226ForCosTTi = T00126_n4226ForCosTTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrimstr( A4226ForCosTTi, 13, 2));
         A3569UltEnsCod = T00126_A3569UltEnsCod[0] ;
         n3569UltEnsCod = T00126_n3569UltEnsCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3569UltEnsCod", A3569UltEnsCod);
         A3585ForPreFec = T00126_A3585ForPreFec[0] ;
         n3585ForPreFec = T00126_n3585ForPreFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
         A3586ForPreAnt = T00126_A3586ForPreAnt[0] ;
         n3586ForPreAnt = T00126_n3586ForPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrimstr( A3586ForPreAnt, 12, 5));
         A3587ForFecAnt = T00126_A3587ForFecAnt[0] ;
         n3587ForFecAnt = T00126_n3587ForFecAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
         A11705For_item2 = T00126_A11705For_item2[0] ;
         n11705For_item2 = T00126_n11705For_item2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11705For_item2", A11705For_item2);
         A11706ForObs2 = T00126_A11706ForObs2[0] ;
         n11706ForObs2 = T00126_n11706ForObs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11706ForObs2", A11706ForObs2);
         A12732ForObsFac = T00126_A12732ForObsFac[0] ;
         n12732ForObsFac = T00126_n12732ForObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12732ForObsFac", A12732ForObsFac);
         A13102ForLbTalao = T00126_A13102ForLbTalao[0] ;
         n13102ForLbTalao = T00126_n13102ForLbTalao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13102ForLbTalao", A13102ForLbTalao);
         A396EmprCod = T00126_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00126_A252CliCod[0] ;
         n252CliCod = T00126_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A486ForNumCol = T00126_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A583IntCod = T00126_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A626MatCod = T00126_A626MatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         A831TipColCod = T00126_A831TipColCod[0] ;
         n831TipColCod = T00126_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A129BarCod = T00126_A129BarCod[0] ;
         n129BarCod = T00126_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00126_A132BarCodReo[0] ;
         n132BarCodReo = T00126_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00126_A130BarCodPar[0] ;
         n130BarCodPar = T00126_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1514MacProCod = T00126_A1514MacProCod[0] ;
         n1514MacProCod = T00126_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3316CodSol = T00126_A3316CodSol[0] ;
         n3316CodSol = T00126_n3316CodSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         A484ForCon = T00126_A484ForCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
         A5362IntCodF = T00126_A5362IntCodF[0] ;
         n5362IntCodF = T00126_n5362IntCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
         A8561Fam_Cod = T00126_A8561Fam_Cod[0] ;
         n8561Fam_Cod = T00126_n8561Fam_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1247( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1247( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1247( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1247( ) ;
      if ( RcdFound47 == 0 )
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
      RcdFound47 = (short)(0) ;
      /* Using cursor T001234 */
      pr_default.execute(32, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         while ( (pr_default.getStatus(32) != 101) && ( ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A252CliCod[0] < A252CliCod ) || ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A483ForColNum[0] < A483ForColNum ) || ( T001234_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A831TipColCod[0] < A831TipColCod ) ) )
         {
            pr_default.readNext(32);
         }
         if ( (pr_default.getStatus(32) != 101) && ( ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A252CliCod[0] > A252CliCod ) || ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A483ForColNum[0] > A483ForColNum ) || ( T001234_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T001234_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001234_A494ForSer[0], A494ForSer) == 0 ) && ( T001234_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001234_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001234_A831TipColCod[0] > A831TipColCod ) ) )
         {
            A396EmprCod = T001234_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T001234_A252CliCod[0] ;
            n252CliCod = T001234_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T001234_A494ForSer[0] ;
            n494ForSer = T001234_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T001234_A482ForColNom[0] ;
            n482ForColNom = T001234_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T001234_A483ForColNum[0] ;
            n483ForColNum = T001234_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T001234_A831TipColCod[0] ;
            n831TipColCod = T001234_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(32);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T001235 */
      pr_default.execute(33, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         while ( (pr_default.getStatus(33) != 101) && ( ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A252CliCod[0] > A252CliCod ) || ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A483ForColNum[0] > A483ForColNum ) || ( T001235_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A831TipColCod[0] > A831TipColCod ) ) )
         {
            pr_default.readNext(33);
         }
         if ( (pr_default.getStatus(33) != 101) && ( ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A252CliCod[0] < A252CliCod ) || ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A483ForColNum[0] < A483ForColNum ) || ( T001235_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T001235_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T001235_A494ForSer[0], A494ForSer) == 0 ) && ( T001235_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T001235_A396EmprCod[0], A396EmprCod) == 0 ) && ( T001235_A831TipColCod[0] < A831TipColCod ) ) )
         {
            A396EmprCod = T001235_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T001235_A252CliCod[0] ;
            n252CliCod = T001235_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T001235_A494ForSer[0] ;
            n494ForSer = T001235_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T001235_A482ForColNom[0] ;
            n482ForColNom = T001235_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T001235_A483ForColNum[0] ;
            n483ForColNum = T001235_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T001235_A831TipColCod[0] ;
            n831TipColCod = T001235_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(33);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1247( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1247( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = Z494ForSer ;
               n494ForSer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = Z482ForColNom ;
               n482ForColNom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = Z483ForColNum ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = Z831TipColCod ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
               update1247( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1247( ) ;
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
                  insert1247( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = Z494ForSer ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = Z482ForColNom ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = Z483ForColNum ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = Z831TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
      getKey1247( ) ;
      if ( RcdFound47 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = Z494ForSer ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = Z482ForColNom ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = Z483ForColNum ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = Z831TipColCod ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tformul");
      GX_FocusControl = edtForCodExt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_120( ) ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtForCodExt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1247( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForCodExt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1247( ) ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForCodExt_Internalname ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForCodExt_Internalname ;
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
      scanStart1247( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1247( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForCodExt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1247( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1247( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00125 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z5337ForCodExt, T00125_A5337ForCodExt[0]) != 0 ) || ( Z1192ForNumCli != T00125_A1192ForNumCli[0] ) || ( GXutil.strcmp(Z1191ForNomCli, T00125_A1191ForNomCli[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z485ForFec), GXutil.resetTime(T00125_A485ForFec[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z495ForUltMod), GXutil.resetTime(T00125_A495ForUltMod[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z496ForUltUti), GXutil.resetTime(T00125_A496ForUltUti[0])) ) || ( DecimalUtil.compareTo(Z492ForPreKgm, T00125_A492ForPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z493ForPreMtr, T00125_A493ForPreMtr[0]) != 0 ) || ( GXutil.strcmp(Z491ForPreDef, T00125_A491ForPreDef[0]) != 0 ) || ( Z1159ForUltLin != T00125_A1159ForUltLin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2749ForPro, T00125_A2749ForPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z2838ForRelBan, T00125_A2838ForRelBan[0]) != 0 ) || ( DecimalUtil.compareTo(Z3007PrecioA, T00125_A3007PrecioA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3008PrecioM, T00125_A3008PrecioM[0]) != 0 ) || ( GXutil.strcmp(Z995ForTonal, T00125_A995ForTonal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3315ForNumArc != T00125_A3315ForNumArc[0] ) || ( GXutil.strcmp(Z3588ForEst, T00125_A3588ForEst[0]) != 0 ) || ( Z4339ForRGB != T00125_A4339ForRGB[0] ) || ( DecimalUtil.compareTo(Z4380ForCosForm, T00125_A4380ForCosForm[0]) != 0 ) || ( Z4384ForTipArt != T00125_A4384ForTipArt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3560ForOpcCli, T00125_A3560ForOpcCli[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3558ForFecApr), GXutil.resetTime(T00125_A3558ForFecApr[0])) ) || ( GXutil.strcmp(Z5624ForUsrCod, T00125_A5624ForUsrCod[0]) != 0 ) || !( GXutil.dateCompare(Z5625ForFecHor, T00125_A5625ForFecHor[0]) ) || ( GXutil.strcmp(Z5626ForObsM, T00125_A5626ForObsM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5653ForPInc != T00125_A5653ForPInc[0] ) || ( GXutil.strcmp(Z5742ForSerDsc, T00125_A5742ForSerDsc[0]) != 0 ) || ( GXutil.strcmp(Z6379ForNomCli2, T00125_A6379ForNomCli2[0]) != 0 ) || ( GXutil.strcmp(Z6608ForUsrCre, T00125_A6608ForUsrCre[0]) != 0 ) || !( GXutil.dateCompare(Z6609ForFecCre, T00125_A6609ForFecCre[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7029ForNomCli3, T00125_A7029ForNomCli3[0]) != 0 ) || ( Z7537ForOpNum != T00125_A7537ForOpNum[0] ) || ( GXutil.strcmp(Z7781ForBlo, T00125_A7781ForBlo[0]) != 0 ) || ( Z8043ForTipT != T00125_A8043ForTipT[0] ) || ( GXutil.strcmp(Z8777For_item1, T00125_A8777For_item1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9792For_Reo, T00125_A9792For_Reo[0]) != 0 ) || !( GXutil.dateCompare(Z11041ForFecCtrl, T00125_A11041ForFecCtrl[0]) ) || !( GXutil.dateCompare(Z11042ForFecCtrf, T00125_A11042ForFecCtrf[0]) ) || ( DecimalUtil.compareTo(Z4224ForKgUTin, T00125_A4224ForKgUTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4225ForKgTTin, T00125_A4225ForKgTTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4226ForCosTTi, T00125_A4226ForCosTTi[0]) != 0 ) || ( GXutil.strcmp(Z3569UltEnsCod, T00125_A3569UltEnsCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3585ForPreFec), GXutil.resetTime(T00125_A3585ForPreFec[0])) ) || ( DecimalUtil.compareTo(Z3586ForPreAnt, T00125_A3586ForPreAnt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3587ForFecAnt), GXutil.resetTime(T00125_A3587ForFecAnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11705For_item2, T00125_A11705For_item2[0]) != 0 ) || ( GXutil.strcmp(Z11706ForObs2, T00125_A11706ForObs2[0]) != 0 ) || ( GXutil.strcmp(Z12732ForObsFac, T00125_A12732ForObsFac[0]) != 0 ) || ( GXutil.strcmp(Z13102ForLbTalao, T00125_A13102ForLbTalao[0]) != 0 ) || ( Z486ForNumCol != T00125_A486ForNumCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z583IntCod != T00125_A583IntCod[0] ) || ( Z626MatCod != T00125_A626MatCod[0] ) || ( Z129BarCod != T00125_A129BarCod[0] ) || ( Z132BarCodReo != T00125_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00125_A130BarCodPar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1514MacProCod, T00125_A1514MacProCod[0]) != 0 ) || ( Z3316CodSol != T00125_A3316CodSol[0] ) || ( Z484ForCon != T00125_A484ForCon[0] ) || ( Z5362IntCodF != T00125_A5362IntCodF[0] ) || ( Z8561Fam_Cod != T00125_A8561Fam_Cod[0] ) )
         {
            if ( GXutil.strcmp(Z5337ForCodExt, T00125_A5337ForCodExt[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForCodExt");
               GXutil.writeLogRaw("Old: ",Z5337ForCodExt);
               GXutil.writeLogRaw("Current: ",T00125_A5337ForCodExt[0]);
            }
            if ( Z1192ForNumCli != T00125_A1192ForNumCli[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNumCli");
               GXutil.writeLogRaw("Old: ",Z1192ForNumCli);
               GXutil.writeLogRaw("Current: ",T00125_A1192ForNumCli[0]);
            }
            if ( GXutil.strcmp(Z1191ForNomCli, T00125_A1191ForNomCli[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNomCli");
               GXutil.writeLogRaw("Old: ",Z1191ForNomCli);
               GXutil.writeLogRaw("Current: ",T00125_A1191ForNomCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z485ForFec), GXutil.resetTime(T00125_A485ForFec[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFec");
               GXutil.writeLogRaw("Old: ",Z485ForFec);
               GXutil.writeLogRaw("Current: ",T00125_A485ForFec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z495ForUltMod), GXutil.resetTime(T00125_A495ForUltMod[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForUltMod");
               GXutil.writeLogRaw("Old: ",Z495ForUltMod);
               GXutil.writeLogRaw("Current: ",T00125_A495ForUltMod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z496ForUltUti), GXutil.resetTime(T00125_A496ForUltUti[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForUltUti");
               GXutil.writeLogRaw("Old: ",Z496ForUltUti);
               GXutil.writeLogRaw("Current: ",T00125_A496ForUltUti[0]);
            }
            if ( DecimalUtil.compareTo(Z492ForPreKgm, T00125_A492ForPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPreKgm");
               GXutil.writeLogRaw("Old: ",Z492ForPreKgm);
               GXutil.writeLogRaw("Current: ",T00125_A492ForPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z493ForPreMtr, T00125_A493ForPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPreMtr");
               GXutil.writeLogRaw("Old: ",Z493ForPreMtr);
               GXutil.writeLogRaw("Current: ",T00125_A493ForPreMtr[0]);
            }
            if ( GXutil.strcmp(Z491ForPreDef, T00125_A491ForPreDef[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPreDef");
               GXutil.writeLogRaw("Old: ",Z491ForPreDef);
               GXutil.writeLogRaw("Current: ",T00125_A491ForPreDef[0]);
            }
            if ( Z1159ForUltLin != T00125_A1159ForUltLin[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForUltLin");
               GXutil.writeLogRaw("Old: ",Z1159ForUltLin);
               GXutil.writeLogRaw("Current: ",T00125_A1159ForUltLin[0]);
            }
            if ( GXutil.strcmp(Z2749ForPro, T00125_A2749ForPro[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPro");
               GXutil.writeLogRaw("Old: ",Z2749ForPro);
               GXutil.writeLogRaw("Current: ",T00125_A2749ForPro[0]);
            }
            if ( DecimalUtil.compareTo(Z2838ForRelBan, T00125_A2838ForRelBan[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForRelBan");
               GXutil.writeLogRaw("Old: ",Z2838ForRelBan);
               GXutil.writeLogRaw("Current: ",T00125_A2838ForRelBan[0]);
            }
            if ( DecimalUtil.compareTo(Z3007PrecioA, T00125_A3007PrecioA[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"PrecioA");
               GXutil.writeLogRaw("Old: ",Z3007PrecioA);
               GXutil.writeLogRaw("Current: ",T00125_A3007PrecioA[0]);
            }
            if ( DecimalUtil.compareTo(Z3008PrecioM, T00125_A3008PrecioM[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"PrecioM");
               GXutil.writeLogRaw("Old: ",Z3008PrecioM);
               GXutil.writeLogRaw("Current: ",T00125_A3008PrecioM[0]);
            }
            if ( GXutil.strcmp(Z995ForTonal, T00125_A995ForTonal[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForTonal");
               GXutil.writeLogRaw("Old: ",Z995ForTonal);
               GXutil.writeLogRaw("Current: ",T00125_A995ForTonal[0]);
            }
            if ( Z3315ForNumArc != T00125_A3315ForNumArc[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNumArc");
               GXutil.writeLogRaw("Old: ",Z3315ForNumArc);
               GXutil.writeLogRaw("Current: ",T00125_A3315ForNumArc[0]);
            }
            if ( GXutil.strcmp(Z3588ForEst, T00125_A3588ForEst[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForEst");
               GXutil.writeLogRaw("Old: ",Z3588ForEst);
               GXutil.writeLogRaw("Current: ",T00125_A3588ForEst[0]);
            }
            if ( Z4339ForRGB != T00125_A4339ForRGB[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForRGB");
               GXutil.writeLogRaw("Old: ",Z4339ForRGB);
               GXutil.writeLogRaw("Current: ",T00125_A4339ForRGB[0]);
            }
            if ( DecimalUtil.compareTo(Z4380ForCosForm, T00125_A4380ForCosForm[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForCosForm");
               GXutil.writeLogRaw("Old: ",Z4380ForCosForm);
               GXutil.writeLogRaw("Current: ",T00125_A4380ForCosForm[0]);
            }
            if ( Z4384ForTipArt != T00125_A4384ForTipArt[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForTipArt");
               GXutil.writeLogRaw("Old: ",Z4384ForTipArt);
               GXutil.writeLogRaw("Current: ",T00125_A4384ForTipArt[0]);
            }
            if ( GXutil.strcmp(Z3560ForOpcCli, T00125_A3560ForOpcCli[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForOpcCli");
               GXutil.writeLogRaw("Old: ",Z3560ForOpcCli);
               GXutil.writeLogRaw("Current: ",T00125_A3560ForOpcCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3558ForFecApr), GXutil.resetTime(T00125_A3558ForFecApr[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecApr");
               GXutil.writeLogRaw("Old: ",Z3558ForFecApr);
               GXutil.writeLogRaw("Current: ",T00125_A3558ForFecApr[0]);
            }
            if ( GXutil.strcmp(Z5624ForUsrCod, T00125_A5624ForUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForUsrCod");
               GXutil.writeLogRaw("Old: ",Z5624ForUsrCod);
               GXutil.writeLogRaw("Current: ",T00125_A5624ForUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(Z5625ForFecHor, T00125_A5625ForFecHor[0]) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecHor");
               GXutil.writeLogRaw("Old: ",Z5625ForFecHor);
               GXutil.writeLogRaw("Current: ",T00125_A5625ForFecHor[0]);
            }
            if ( GXutil.strcmp(Z5626ForObsM, T00125_A5626ForObsM[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForObsM");
               GXutil.writeLogRaw("Old: ",Z5626ForObsM);
               GXutil.writeLogRaw("Current: ",T00125_A5626ForObsM[0]);
            }
            if ( Z5653ForPInc != T00125_A5653ForPInc[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPInc");
               GXutil.writeLogRaw("Old: ",Z5653ForPInc);
               GXutil.writeLogRaw("Current: ",T00125_A5653ForPInc[0]);
            }
            if ( GXutil.strcmp(Z5742ForSerDsc, T00125_A5742ForSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForSerDsc");
               GXutil.writeLogRaw("Old: ",Z5742ForSerDsc);
               GXutil.writeLogRaw("Current: ",T00125_A5742ForSerDsc[0]);
            }
            if ( GXutil.strcmp(Z6379ForNomCli2, T00125_A6379ForNomCli2[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNomCli2");
               GXutil.writeLogRaw("Old: ",Z6379ForNomCli2);
               GXutil.writeLogRaw("Current: ",T00125_A6379ForNomCli2[0]);
            }
            if ( GXutil.strcmp(Z6608ForUsrCre, T00125_A6608ForUsrCre[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForUsrCre");
               GXutil.writeLogRaw("Old: ",Z6608ForUsrCre);
               GXutil.writeLogRaw("Current: ",T00125_A6608ForUsrCre[0]);
            }
            if ( !( GXutil.dateCompare(Z6609ForFecCre, T00125_A6609ForFecCre[0]) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecCre");
               GXutil.writeLogRaw("Old: ",Z6609ForFecCre);
               GXutil.writeLogRaw("Current: ",T00125_A6609ForFecCre[0]);
            }
            if ( GXutil.strcmp(Z7029ForNomCli3, T00125_A7029ForNomCli3[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNomCli3");
               GXutil.writeLogRaw("Old: ",Z7029ForNomCli3);
               GXutil.writeLogRaw("Current: ",T00125_A7029ForNomCli3[0]);
            }
            if ( Z7537ForOpNum != T00125_A7537ForOpNum[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForOpNum");
               GXutil.writeLogRaw("Old: ",Z7537ForOpNum);
               GXutil.writeLogRaw("Current: ",T00125_A7537ForOpNum[0]);
            }
            if ( GXutil.strcmp(Z7781ForBlo, T00125_A7781ForBlo[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForBlo");
               GXutil.writeLogRaw("Old: ",Z7781ForBlo);
               GXutil.writeLogRaw("Current: ",T00125_A7781ForBlo[0]);
            }
            if ( Z8043ForTipT != T00125_A8043ForTipT[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForTipT");
               GXutil.writeLogRaw("Old: ",Z8043ForTipT);
               GXutil.writeLogRaw("Current: ",T00125_A8043ForTipT[0]);
            }
            if ( GXutil.strcmp(Z8777For_item1, T00125_A8777For_item1[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"For_item1");
               GXutil.writeLogRaw("Old: ",Z8777For_item1);
               GXutil.writeLogRaw("Current: ",T00125_A8777For_item1[0]);
            }
            if ( GXutil.strcmp(Z9792For_Reo, T00125_A9792For_Reo[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"For_Reo");
               GXutil.writeLogRaw("Old: ",Z9792For_Reo);
               GXutil.writeLogRaw("Current: ",T00125_A9792For_Reo[0]);
            }
            if ( !( GXutil.dateCompare(Z11041ForFecCtrl, T00125_A11041ForFecCtrl[0]) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecCtrl");
               GXutil.writeLogRaw("Old: ",Z11041ForFecCtrl);
               GXutil.writeLogRaw("Current: ",T00125_A11041ForFecCtrl[0]);
            }
            if ( !( GXutil.dateCompare(Z11042ForFecCtrf, T00125_A11042ForFecCtrf[0]) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecCtrf");
               GXutil.writeLogRaw("Old: ",Z11042ForFecCtrf);
               GXutil.writeLogRaw("Current: ",T00125_A11042ForFecCtrf[0]);
            }
            if ( DecimalUtil.compareTo(Z4224ForKgUTin, T00125_A4224ForKgUTin[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForKgUTin");
               GXutil.writeLogRaw("Old: ",Z4224ForKgUTin);
               GXutil.writeLogRaw("Current: ",T00125_A4224ForKgUTin[0]);
            }
            if ( DecimalUtil.compareTo(Z4225ForKgTTin, T00125_A4225ForKgTTin[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForKgTTin");
               GXutil.writeLogRaw("Old: ",Z4225ForKgTTin);
               GXutil.writeLogRaw("Current: ",T00125_A4225ForKgTTin[0]);
            }
            if ( DecimalUtil.compareTo(Z4226ForCosTTi, T00125_A4226ForCosTTi[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForCosTTi");
               GXutil.writeLogRaw("Old: ",Z4226ForCosTTi);
               GXutil.writeLogRaw("Current: ",T00125_A4226ForCosTTi[0]);
            }
            if ( GXutil.strcmp(Z3569UltEnsCod, T00125_A3569UltEnsCod[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"UltEnsCod");
               GXutil.writeLogRaw("Old: ",Z3569UltEnsCod);
               GXutil.writeLogRaw("Current: ",T00125_A3569UltEnsCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3585ForPreFec), GXutil.resetTime(T00125_A3585ForPreFec[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPreFec");
               GXutil.writeLogRaw("Old: ",Z3585ForPreFec);
               GXutil.writeLogRaw("Current: ",T00125_A3585ForPreFec[0]);
            }
            if ( DecimalUtil.compareTo(Z3586ForPreAnt, T00125_A3586ForPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForPreAnt");
               GXutil.writeLogRaw("Old: ",Z3586ForPreAnt);
               GXutil.writeLogRaw("Current: ",T00125_A3586ForPreAnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3587ForFecAnt), GXutil.resetTime(T00125_A3587ForFecAnt[0])) ) )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForFecAnt");
               GXutil.writeLogRaw("Old: ",Z3587ForFecAnt);
               GXutil.writeLogRaw("Current: ",T00125_A3587ForFecAnt[0]);
            }
            if ( GXutil.strcmp(Z11705For_item2, T00125_A11705For_item2[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"For_item2");
               GXutil.writeLogRaw("Old: ",Z11705For_item2);
               GXutil.writeLogRaw("Current: ",T00125_A11705For_item2[0]);
            }
            if ( GXutil.strcmp(Z11706ForObs2, T00125_A11706ForObs2[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForObs2");
               GXutil.writeLogRaw("Old: ",Z11706ForObs2);
               GXutil.writeLogRaw("Current: ",T00125_A11706ForObs2[0]);
            }
            if ( GXutil.strcmp(Z12732ForObsFac, T00125_A12732ForObsFac[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForObsFac");
               GXutil.writeLogRaw("Old: ",Z12732ForObsFac);
               GXutil.writeLogRaw("Current: ",T00125_A12732ForObsFac[0]);
            }
            if ( GXutil.strcmp(Z13102ForLbTalao, T00125_A13102ForLbTalao[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForLbTalao");
               GXutil.writeLogRaw("Old: ",Z13102ForLbTalao);
               GXutil.writeLogRaw("Current: ",T00125_A13102ForLbTalao[0]);
            }
            if ( Z486ForNumCol != T00125_A486ForNumCol[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForNumCol");
               GXutil.writeLogRaw("Old: ",Z486ForNumCol);
               GXutil.writeLogRaw("Current: ",T00125_A486ForNumCol[0]);
            }
            if ( Z583IntCod != T00125_A583IntCod[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"IntCod");
               GXutil.writeLogRaw("Old: ",Z583IntCod);
               GXutil.writeLogRaw("Current: ",T00125_A583IntCod[0]);
            }
            if ( Z626MatCod != T00125_A626MatCod[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"MatCod");
               GXutil.writeLogRaw("Old: ",Z626MatCod);
               GXutil.writeLogRaw("Current: ",T00125_A626MatCod[0]);
            }
            if ( Z129BarCod != T00125_A129BarCod[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00125_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00125_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00125_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00125_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00125_A130BarCodPar[0]);
            }
            if ( GXutil.strcmp(Z1514MacProCod, T00125_A1514MacProCod[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"MacProCod");
               GXutil.writeLogRaw("Old: ",Z1514MacProCod);
               GXutil.writeLogRaw("Current: ",T00125_A1514MacProCod[0]);
            }
            if ( Z3316CodSol != T00125_A3316CodSol[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"CodSol");
               GXutil.writeLogRaw("Old: ",Z3316CodSol);
               GXutil.writeLogRaw("Current: ",T00125_A3316CodSol[0]);
            }
            if ( Z484ForCon != T00125_A484ForCon[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ForCon");
               GXutil.writeLogRaw("Old: ",Z484ForCon);
               GXutil.writeLogRaw("Current: ",T00125_A484ForCon[0]);
            }
            if ( Z5362IntCodF != T00125_A5362IntCodF[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"IntCodF");
               GXutil.writeLogRaw("Old: ",Z5362IntCodF);
               GXutil.writeLogRaw("Current: ",T00125_A5362IntCodF[0]);
            }
            if ( Z8561Fam_Cod != T00125_A8561Fam_Cod[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"Fam_Cod");
               GXutil.writeLogRaw("Old: ",Z8561Fam_Cod);
               GXutil.writeLogRaw("Current: ",T00125_A8561Fam_Cod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1247( )
   {
      beforeValidate1247( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1247( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1247( 0) ;
         checkOptimisticConcurrency1247( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1247( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1247( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001236 */
                  pr_default.execute(34, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n485ForFec), A485ForFec, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Boolean.valueOf(n496ForUltUti), A496ForUltUti, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n3007PrecioA), A3007PrecioA, Boolean.valueOf(n3008PrecioM), A3008PrecioM, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5626ForObsM), A5626ForObsM, Boolean.valueOf(n5653ForPInc), Short.valueOf(A5653ForPInc), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, Boolean.valueOf(n6608ForUsrCre), A6608ForUsrCre, Boolean.valueOf(n6609ForFecCre), A6609ForFecCre, Boolean.valueOf(n7029ForNomCli3), A7029ForNomCli3, Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n7781ForBlo), A7781ForBlo, Boolean.valueOf(n8043ForTipT), Byte.valueOf(A8043ForTipT), Boolean.valueOf(n8777For_item1), A8777For_item1, Boolean.valueOf(n9792For_Reo), A9792For_Reo, Boolean.valueOf(n11041ForFecCtrl), A11041ForFecCtrl, Boolean.valueOf(n11042ForFecCtrf), A11042ForFecCtrf, Boolean.valueOf(n4224ForKgUTin), A4224ForKgUTin, Boolean.valueOf(n4225ForKgTTin), A4225ForKgTTin, Boolean.valueOf(n4226ForCosTTi), A4226ForCosTTi, Boolean.valueOf(n3569UltEnsCod), A3569UltEnsCod, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3586ForPreAnt), A3586ForPreAnt, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n11705For_item2), A11705For_item2, Boolean.valueOf(n11706ForObs2), A11706ForObs2, Boolean.valueOf(n12732ForObsFac), A12732ForObsFac, Boolean.valueOf(n13102ForLbTalao), A13102ForLbTalao, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A486ForNumCol), Byte.valueOf(A583IntCod), Short.valueOf(A626MatCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol),
                  Byte.valueOf(A484ForCon), Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(34) == 1) )
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
                        processLevel1247( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption120( ) ;
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
            load1247( ) ;
         }
         endLevel1247( ) ;
      }
      closeExtendedTableCursors1247( ) ;
   }

   public void update1247( )
   {
      beforeValidate1247( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1247( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1247( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1247( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1247( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001237 */
                  pr_default.execute(35, new Object[] {Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n485ForFec), A485ForFec, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Boolean.valueOf(n496ForUltUti), A496ForUltUti, Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n3007PrecioA), A3007PrecioA, Boolean.valueOf(n3008PrecioM), A3008PrecioM, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n3558ForFecApr), A3558ForFecApr, Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n5626ForObsM), A5626ForObsM, Boolean.valueOf(n5653ForPInc), Short.valueOf(A5653ForPInc), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n6379ForNomCli2), A6379ForNomCli2, Boolean.valueOf(n6608ForUsrCre), A6608ForUsrCre, Boolean.valueOf(n6609ForFecCre), A6609ForFecCre, Boolean.valueOf(n7029ForNomCli3), A7029ForNomCli3, Boolean.valueOf(n7537ForOpNum), Byte.valueOf(A7537ForOpNum), Boolean.valueOf(n7781ForBlo), A7781ForBlo, Boolean.valueOf(n8043ForTipT), Byte.valueOf(A8043ForTipT), Boolean.valueOf(n8777For_item1), A8777For_item1, Boolean.valueOf(n9792For_Reo), A9792For_Reo, Boolean.valueOf(n11041ForFecCtrl), A11041ForFecCtrl, Boolean.valueOf(n11042ForFecCtrf), A11042ForFecCtrf, Boolean.valueOf(n4224ForKgUTin), A4224ForKgUTin, Boolean.valueOf(n4225ForKgTTin), A4225ForKgTTin, Boolean.valueOf(n4226ForCosTTi), A4226ForCosTTi, Boolean.valueOf(n3569UltEnsCod), A3569UltEnsCod, Boolean.valueOf(n3585ForPreFec), A3585ForPreFec, Boolean.valueOf(n3586ForPreAnt), A3586ForPreAnt, Boolean.valueOf(n3587ForFecAnt), A3587ForFecAnt, Boolean.valueOf(n11705For_item2), A11705For_item2, Boolean.valueOf(n11706ForObs2), A11706ForObs2, Boolean.valueOf(n12732ForObsFac), A12732ForObsFac, Boolean.valueOf(n13102ForLbTalao), A13102ForLbTalao, Integer.valueOf(A486ForNumCol), Byte.valueOf(A583IntCod), Short.valueOf(A626MatCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Byte.valueOf(A484ForCon), Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom),
                  A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(35) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1247( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1247( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption120( ) ;
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
         endLevel1247( ) ;
      }
      closeExtendedTableCursors1247( ) ;
   }

   public void deferredUpdate1247( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1247( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1247( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1247( ) ;
         afterConfirm1247( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1247( ) ;
            if ( AnyError == 0 )
            {
               scanStart12154( ) ;
               while ( RcdFound154 != 0 )
               {
                  getByPrimaryKey12154( ) ;
                  delete12154( ) ;
                  scanNext12154( ) ;
               }
               scanEnd12154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001238 */
                  pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound47 == 0 )
                        {
                           initAll1247( ) ;
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
                        resetCaption120( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1247( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1247( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001239 */
         pr_default.execute(37, new Object[] {A396EmprCod});
         A407EmprNom = T001239_A407EmprNom[0] ;
         n407EmprNom = T001239_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(37);
         /* Using cursor T001240 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T001240_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(38);
         /* Using cursor T001241 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         A832TipColDsc = T001241_A832TipColDsc[0] ;
         n832TipColDsc = T001241_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         pr_default.close(39);
         /* Using cursor T001242 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A213BarSit = T001242_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         pr_default.close(40);
         /* Using cursor T001243 */
         pr_default.execute(41, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
         A584IntDsc = T001243_A584IntDsc[0] ;
         n584IntDsc = T001243_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         pr_default.close(41);
         /* Using cursor T001244 */
         pr_default.execute(42, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
         A627MatDsc = T001244_A627MatDsc[0] ;
         n627MatDsc = T001244_n627MatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
         pr_default.close(42);
         /* Using cursor T001245 */
         pr_default.execute(43, new Object[] {A396EmprCod, Byte.valueOf(A484ForCon)});
         A3792ForConDsc = T001245_A3792ForConDsc[0] ;
         n3792ForConDsc = T001245_n3792ForConDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
         pr_default.close(43);
         /* Using cursor T001246 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
         A3317DscSol = T001246_A3317DscSol[0] ;
         n3317DscSol = T001246_n3317DscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
         pr_default.close(44);
         /* Using cursor T001247 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         A1515MacProDsc = T001247_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         pr_default.close(45);
         /* Using cursor T001248 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF)});
         A5363IntDscF = T001248_A5363IntDscF[0] ;
         n5363IntDscF = T001248_n5363IntDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
         pr_default.close(46);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001249 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T001250 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T001251 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T001252 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T001253 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T001254 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T001255 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T001256 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T001257 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T001258 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T001259 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T001260 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T001261 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T001262 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
      }
   }

   public void processNestedLevel12154( )
   {
      nGXsfl_480_idx = 0 ;
      while ( nGXsfl_480_idx < nRC_GXsfl_480 )
      {
         readRow12154( ) ;
         if ( ( nRcdExists_154 != 0 ) || ( nIsMod_154 != 0 ) )
         {
            standaloneNotModal12154( ) ;
            getKey12154( ) ;
            if ( ( nRcdExists_154 == 0 ) && ( nRcdDeleted_154 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert12154( ) ;
            }
            else
            {
               if ( RcdFound154 != 0 )
               {
                  if ( ( nRcdDeleted_154 != 0 ) && ( nRcdExists_154 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete12154( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_154 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update12154( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_154 == 0 )
                  {
                     GXCCtl = "PROFORL_" + sGXsfl_480_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_154_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForL_Internalname, GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtProForFR_Internalname, GXutil.rtrim( A6549ProForFR)) ;
         httpContext.changePostValue( edtProFoNPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForrbn_Internalname, GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForVol_Internalname, GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForMq_Internalname, GXutil.rtrim( A9707ProForMq)) ;
         httpContext.changePostValue( edtProForH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_480_idx, GXutil.rtrim( Z6549ProForFR)) ;
         httpContext.changePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_480_idx, GXutil.rtrim( Z9707ProForMq)) ;
         httpContext.changePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_480_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_154_"+sGXsfl_480_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_154 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_154_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_154_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORFR_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForFR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFONPRG_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORRBN_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORVOL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORMQ_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORH2O_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll12154( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_154 = (short)(0) ;
      nIsMod_154 = (short)(0) ;
      nRcdDeleted_154 = (short)(0) ;
   }

   public void processLevel1247( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel12154( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1247( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1247( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tformul");
         if ( AnyError == 0 )
         {
            confirmValues120( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tformul");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1247( )
   {
      /* Using cursor T001263 */
      pr_default.execute(61);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A396EmprCod = T001263_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T001263_A252CliCod[0] ;
         n252CliCod = T001263_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T001263_A494ForSer[0] ;
         n494ForSer = T001263_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T001263_A482ForColNom[0] ;
         n482ForColNom = T001263_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T001263_A483ForColNum[0] ;
         n483ForColNum = T001263_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T001263_A831TipColCod[0] ;
         n831TipColCod = T001263_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1247( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A396EmprCod = T001263_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T001263_A252CliCod[0] ;
         n252CliCod = T001263_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T001263_A494ForSer[0] ;
         n494ForSer = T001263_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T001263_A482ForColNom[0] ;
         n482ForColNom = T001263_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T001263_A483ForColNum[0] ;
         n483ForColNum = T001263_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T001263_A831TipColCod[0] ;
         n831TipColCod = T001263_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void scanEnd1247( )
   {
      pr_default.close(61);
   }

   public void afterConfirm1247( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1247( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1247( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1247( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1247( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1247( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1247( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtForCodExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCodExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCodExt_Enabled), 5, 0), true);
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtForNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCli_Enabled), 5, 0), true);
      edtForNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtForFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFec_Enabled), 5, 0), true);
      edtForUltMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltMod_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      edtMatCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatCod_Enabled), 5, 0), true);
      edtMatDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatDsc_Enabled), 5, 0), true);
      edtForUltUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Enabled), 5, 0), true);
      edtForPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreKgm_Enabled), 5, 0), true);
      edtForPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreMtr_Enabled), 5, 0), true);
      edtForPreDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreDef_Enabled), 5, 0), true);
      edtForCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCon_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtT1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtT1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtT1_Enabled), 5, 0), true);
      edtArtTP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTP1_Enabled), 5, 0), true);
      edtArtT2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtT2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtT2_Enabled), 5, 0), true);
      edtArtTP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTP2_Enabled), 5, 0), true);
      edtArtT3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtT3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtT3_Enabled), 5, 0), true);
      edtArtTP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTP3_Enabled), 5, 0), true);
      edtArtU1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtU1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtU1_Enabled), 5, 0), true);
      edtArtU2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtU2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtU2_Enabled), 5, 0), true);
      edtArtU3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtU3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtU3_Enabled), 5, 0), true);
      edtArtUP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUP1_Enabled), 5, 0), true);
      edtArtUP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUP2_Enabled), 5, 0), true);
      edtArtUP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUP3_Enabled), 5, 0), true);
      edtArtMater_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMater_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMater_Enabled), 5, 0), true);
      edtFindArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindArt_Enabled), 5, 0), true);
      edtEmprCodV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodV_Enabled), 5, 0), true);
      edtCliCodV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodV_Enabled), 5, 0), true);
      edtForUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLin_Enabled), 5, 0), true);
      chkForPro.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkForPro.getInternalname(), "Enabled", GXutil.ltrimstr( chkForPro.getEnabled(), 5, 0), true);
      edtForRelBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForRelBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForRelBan_Enabled), 5, 0), true);
      edtPrecioA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrecioA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrecioA_Enabled), 5, 0), true);
      edtPrecioM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrecioM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrecioM_Enabled), 5, 0), true);
      edtForTonal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTonal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTonal_Enabled), 5, 0), true);
      edtForNumArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumArc_Enabled), 5, 0), true);
      edtCodSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodSol_Enabled), 5, 0), true);
      edtDscSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscSol_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtForConDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForConDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForConDsc_Enabled), 5, 0), true);
      edtForEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForEst_Enabled), 5, 0), true);
      edtMacProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      edtMacProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc_Enabled), 5, 0), true);
      edtForRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForRGB_Enabled), 5, 0), true);
      edtForCosForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosForm_Enabled), 5, 0), true);
      edtForTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipArt_Enabled), 5, 0), true);
      edtForOpcCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForOpcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Enabled), 5, 0), true);
      edtIntCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodF_Enabled), 5, 0), true);
      edtIntDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDscF_Enabled), 5, 0), true);
      edtForFecApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecApr_Enabled), 5, 0), true);
      edtForUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUsrCod_Enabled), 5, 0), true);
      edtForFecHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecHor_Enabled), 5, 0), true);
      edtForObsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForObsM_Enabled), 5, 0), true);
      edtForPInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPInc_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtForNomCli2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli2_Enabled), 5, 0), true);
      edtForUsrCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUsrCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUsrCre_Enabled), 5, 0), true);
      edtForFecCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecCre_Enabled), 5, 0), true);
      edtForNomCli3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli3_Enabled), 5, 0), true);
      edtForOpNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForOpNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpNum_Enabled), 5, 0), true);
      cmbForBlo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbForBlo.getEnabled(), 5, 0), true);
      edtForTipT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTipT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipT_Enabled), 5, 0), true);
      edtFam_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFam_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFam_Cod_Enabled), 5, 0), true);
      edtFor_item1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFor_item1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_item1_Enabled), 5, 0), true);
      edtFor_Reo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFor_Reo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_Reo_Enabled), 5, 0), true);
      edtForFecCtrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecCtrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecCtrl_Enabled), 5, 0), true);
      edtForFecCtrf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecCtrf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecCtrf_Enabled), 5, 0), true);
      edtForKgUTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForKgUTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForKgUTin_Enabled), 5, 0), true);
      edtForKgTTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForKgTTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForKgTTin_Enabled), 5, 0), true);
      edtForCosTTi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosTTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosTTi_Enabled), 5, 0), true);
      edtUltEnsCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltEnsCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltEnsCod_Enabled), 5, 0), true);
      edtForPreFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreFec_Enabled), 5, 0), true);
      edtForPreAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreAnt_Enabled), 5, 0), true);
      edtForFecAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFecAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFecAnt_Enabled), 5, 0), true);
      edtFor_item2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFor_item2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFor_item2_Enabled), 5, 0), true);
      edtForObs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForObs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForObs2_Enabled), 5, 0), true);
      edtForObsFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForObsFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForObsFac_Enabled), 5, 0), true);
      edtForLbTalao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForLbTalao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLbTalao_Enabled), 5, 0), true);
   }

   public void zm12154( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6549ProForFR = T00123_A6549ProForFR[0] ;
            Z7802ProFoNPrg = T00123_A7802ProFoNPrg[0] ;
            Z8656ProForrbn = T00123_A8656ProForrbn[0] ;
            Z9704ProForVol = T00123_A9704ProForVol[0] ;
            Z9707ProForMq = T00123_A9707ProForMq[0] ;
            Z10542ProForH2O = T00123_A10542ProForH2O[0] ;
            Z764ProForCod = T00123_A764ProForCod[0] ;
         }
         else
         {
            Z6549ProForFR = A6549ProForFR ;
            Z7802ProFoNPrg = A7802ProFoNPrg ;
            Z8656ProForrbn = A8656ProForrbn ;
            Z9704ProForVol = A9704ProForVol ;
            Z9707ProForMq = A9707ProForMq ;
            Z10542ProForH2O = A10542ProForH2O ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1160ProForL = A1160ProForL ;
         Z6549ProForFR = A6549ProForFR ;
         Z7802ProFoNPrg = A7802ProFoNPrg ;
         Z8656ProForrbn = A8656ProForrbn ;
         Z9704ProForVol = A9704ProForVol ;
         Z9707ProForMq = A9707ProForMq ;
         Z10542ProForH2O = A10542ProForH2O ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z252CliCod = A252CliCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModal12154( )
   {
   }

   public void standaloneModal12154( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      }
      else
      {
         edtProForL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      }
   }

   public void load12154( )
   {
      /* Using cursor T001264 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A766ProForDsc = T001264_A766ProForDsc[0] ;
         A6549ProForFR = T001264_A6549ProForFR[0] ;
         A7802ProFoNPrg = T001264_A7802ProFoNPrg[0] ;
         A8656ProForrbn = T001264_A8656ProForrbn[0] ;
         A9704ProForVol = T001264_A9704ProForVol[0] ;
         A9707ProForMq = T001264_A9707ProForMq[0] ;
         A10542ProForH2O = T001264_A10542ProForH2O[0] ;
         A764ProForCod = T001264_A764ProForCod[0] ;
         zm12154( -18) ;
      }
      pr_default.close(62);
      onLoadActions12154( ) ;
   }

   public void onLoadActions12154( )
   {
   }

   public void checkExtendedTable12154( )
   {
      nIsDirty_154 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal12154( ) ;
      /* Using cursor T00124 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00124_A766ProForDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors12154( )
   {
      pr_default.close(2);
   }

   public void enableDisable12154( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T001265 */
      pr_default.execute(63, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(63) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T001265_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(63) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(63);
   }

   public void getKey12154( )
   {
      /* Using cursor T001266 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound154 = (short)(1) ;
      }
      else
      {
         RcdFound154 = (short)(0) ;
      }
      pr_default.close(64);
   }

   public void getByPrimaryKey12154( )
   {
      /* Using cursor T00123 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm12154( 18) ;
         RcdFound154 = (short)(1) ;
         initializeNonKey12154( ) ;
         A1160ProForL = T00123_A1160ProForL[0] ;
         A6549ProForFR = T00123_A6549ProForFR[0] ;
         A7802ProFoNPrg = T00123_A7802ProFoNPrg[0] ;
         A8656ProForrbn = T00123_A8656ProForrbn[0] ;
         A9704ProForVol = T00123_A9704ProForVol[0] ;
         A9707ProForMq = T00123_A9707ProForMq[0] ;
         A10542ProForH2O = T00123_A10542ProForH2O[0] ;
         A764ProForCod = T00123_A764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1160ProForL = A1160ProForL ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12154( ) ;
         load12154( ) ;
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound154 = (short)(0) ;
         initializeNonKey12154( ) ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12154( ) ;
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes12154( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency12154( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00122 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6549ProForFR, T00122_A6549ProForFR[0]) != 0 ) || ( Z7802ProFoNPrg != T00122_A7802ProFoNPrg[0] ) || ( DecimalUtil.compareTo(Z8656ProForrbn, T00122_A8656ProForrbn[0]) != 0 ) || ( Z9704ProForVol != T00122_A9704ProForVol[0] ) || ( GXutil.strcmp(Z9707ProForMq, T00122_A9707ProForMq[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10542ProForH2O != T00122_A10542ProForH2O[0] ) || ( GXutil.strcmp(Z764ProForCod, T00122_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6549ProForFR, T00122_A6549ProForFR[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForFR");
               GXutil.writeLogRaw("Old: ",Z6549ProForFR);
               GXutil.writeLogRaw("Current: ",T00122_A6549ProForFR[0]);
            }
            if ( Z7802ProFoNPrg != T00122_A7802ProFoNPrg[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProFoNPrg");
               GXutil.writeLogRaw("Old: ",Z7802ProFoNPrg);
               GXutil.writeLogRaw("Current: ",T00122_A7802ProFoNPrg[0]);
            }
            if ( DecimalUtil.compareTo(Z8656ProForrbn, T00122_A8656ProForrbn[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForrbn");
               GXutil.writeLogRaw("Old: ",Z8656ProForrbn);
               GXutil.writeLogRaw("Current: ",T00122_A8656ProForrbn[0]);
            }
            if ( Z9704ProForVol != T00122_A9704ProForVol[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForVol");
               GXutil.writeLogRaw("Old: ",Z9704ProForVol);
               GXutil.writeLogRaw("Current: ",T00122_A9704ProForVol[0]);
            }
            if ( GXutil.strcmp(Z9707ProForMq, T00122_A9707ProForMq[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForMq");
               GXutil.writeLogRaw("Old: ",Z9707ProForMq);
               GXutil.writeLogRaw("Current: ",T00122_A9707ProForMq[0]);
            }
            if ( Z10542ProForH2O != T00122_A10542ProForH2O[0] )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForH2O");
               GXutil.writeLogRaw("Old: ",Z10542ProForH2O);
               GXutil.writeLogRaw("Current: ",T00122_A10542ProForH2O[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T00122_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tformul:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T00122_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12154( )
   {
      beforeValidate12154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12154( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12154( 0) ;
         checkOptimisticConcurrency12154( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12154( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001267 */
                  pr_default.execute(65, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A396EmprCod, A764ProForCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  if ( (pr_default.getStatus(65) == 1) )
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
            load12154( ) ;
         }
         endLevel12154( ) ;
      }
      closeExtendedTableCursors12154( ) ;
   }

   public void update12154( )
   {
      beforeValidate12154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12154( ) ;
      }
      if ( ( nIsMod_154 != 0 ) || ( nIsDirty_154 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency12154( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm12154( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate12154( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T001268 */
                     pr_default.execute(66, new Object[] {A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A764ProForCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                     if ( (pr_default.getStatus(66) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate12154( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey12154( ) ;
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
            endLevel12154( ) ;
         }
      }
      closeExtendedTableCursors12154( ) ;
   }

   public void deferredUpdate12154( )
   {
   }

   public void delete12154( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12154( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12154( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12154( ) ;
         afterConfirm12154( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12154( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001269 */
               pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
      sMode154 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12154( ) ;
      Gx_mode = sMode154 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12154( )
   {
      standaloneModal12154( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001270 */
         pr_default.execute(68, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T001270_A766ProForDsc[0] ;
         pr_default.close(68);
      }
   }

   public void endLevel12154( )
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

   public void scanStart12154( )
   {
      /* Scan By routine */
      /* Using cursor T001271 */
      pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(69) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A1160ProForL = T001271_A1160ProForL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12154( )
   {
      /* Scan next routine */
      pr_default.readNext(69);
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(69) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A1160ProForL = T001271_A1160ProForL[0] ;
      }
   }

   public void scanEnd12154( )
   {
      pr_default.close(69);
   }

   public void afterConfirm12154( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12154( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12154( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12154( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12154( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12154( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12154( )
   {
      edtProForL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForFR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForFR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForFR_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProFoNPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoNPrg_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForrbn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForrbn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForrbn_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForVol_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMq_Enabled), 5, 0), !bGXsfl_480_Refreshing);
      edtProForH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForH2O_Enabled), 5, 0), !bGXsfl_480_Refreshing);
   }

   public void send_integrity_lvl_hashes12154( )
   {
   }

   public void send_integrity_lvl_hashes1247( )
   {
   }

   public void subsflControlProps_480154( )
   {
      edtavnRcdDeleted_154_Internalname = "vNRCDDELETED_154_"+sGXsfl_480_idx ;
      edtProForL_Internalname = "PROFORL_"+sGXsfl_480_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_480_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_480_idx ;
      edtProForFR_Internalname = "PROFORFR_"+sGXsfl_480_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_480_idx ;
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_480_idx ;
      edtProForVol_Internalname = "PROFORVOL_"+sGXsfl_480_idx ;
      edtProForMq_Internalname = "PROFORMQ_"+sGXsfl_480_idx ;
      edtProForH2O_Internalname = "PROFORH2O_"+sGXsfl_480_idx ;
   }

   public void subsflControlProps_fel_480154( )
   {
      edtavnRcdDeleted_154_Internalname = "vNRCDDELETED_154_"+sGXsfl_480_fel_idx ;
      edtProForL_Internalname = "PROFORL_"+sGXsfl_480_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_480_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_480_fel_idx ;
      edtProForFR_Internalname = "PROFORFR_"+sGXsfl_480_fel_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_480_fel_idx ;
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_480_fel_idx ;
      edtProForVol_Internalname = "PROFORVOL_"+sGXsfl_480_fel_idx ;
      edtProForMq_Internalname = "PROFORMQ_"+sGXsfl_480_fel_idx ;
      edtProForH2O_Internalname = "PROFORH2O_"+sGXsfl_480_fel_idx ;
   }

   public void addRow12154( )
   {
      nGXsfl_480_idx = (int)(nGXsfl_480_idx+1) ;
      sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_480154( ) ;
      sendRow12154( ) ;
   }

   public void sendRow12154( )
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
         if ( ((int)((nGXsfl_480_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 481,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_154_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_154_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_154), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_154), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,481);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_154_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_154_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 482,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForL_Internalname,GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,482);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 483,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,483);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 485,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFR_Internalname,GXutil.rtrim( A6549ProForFR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,485);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForFR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 486,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoNPrg_Internalname,GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFoNPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,486);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoNPrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoNPrg_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 487,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForrbn_Internalname,GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForrbn_Enabled!=0) ? localUtil.format( A8656ProForrbn, "ZZ9.99") : localUtil.format( A8656ProForrbn, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,487);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForrbn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForrbn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 488,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForVol_Internalname,GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9704ProForVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9704ProForVol), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,488);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForVol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForVol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 489,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForMq_Internalname,GXutil.rtrim( A9707ProForMq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,489);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForMq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForMq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_154_" + sGXsfl_480_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 490,'',false,'" + sGXsfl_480_idx + "',480)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForH2O_Internalname,GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10542ProForH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10542ProForH2O), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,490);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForH2O_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForH2O_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(480),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes12154( ) ;
      GXCCtl = "Z1160ProForL_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6549ProForFR_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6549ProForFR));
      GXCCtl = "Z7802ProFoNPrg_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8656ProForrbn_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9704ProForVol_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9707ProForMq_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9707ProForMq));
      GXCCtl = "Z10542ProForH2O_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_154_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_154_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_154_" + sGXsfl_480_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_154, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_154_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_154_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFR_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForFR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFONPRG_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORRBN_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORVOL_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForVol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMQ_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORH2O_"+sGXsfl_480_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow12154( )
   {
      nGXsfl_480_idx = (int)(nGXsfl_480_idx+1) ;
      sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_480154( ) ;
      edtavnRcdDeleted_154_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_154_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORL_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForFR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORFR_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFONPRG_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForrbn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORRBN_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORVOL_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORMQ_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORH2O_"+sGXsfl_480_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_154_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_154_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_154");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_154_Internalname ;
         wbErr = true ;
         nRcdDeleted_154 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_154 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_154_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORL_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForL_Internalname ;
         wbErr = true ;
         A1160ProForL = (short)(0) ;
      }
      else
      {
         A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      A6549ProForFR = httpContext.cgiGet( edtProForFR_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PROFONPRG_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoNPrg_Internalname ;
         wbErr = true ;
         A7802ProFoNPrg = 0 ;
      }
      else
      {
         A7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PROFORRBN_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForrbn_Internalname ;
         wbErr = true ;
         A8656ProForrbn = DecimalUtil.ZERO ;
      }
      else
      {
         A8656ProForrbn = localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PROFORVOL_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForVol_Internalname ;
         wbErr = true ;
         A9704ProForVol = 0 ;
      }
      else
      {
         A9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9707ProForMq = httpContext.cgiGet( edtProForMq_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORH2O_" + sGXsfl_480_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForH2O_Internalname ;
         wbErr = true ;
         A10542ProForH2O = (short)(0) ;
      }
      else
      {
         A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z1160ProForL_" + sGXsfl_480_idx ;
      Z1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6549ProForFR_" + sGXsfl_480_idx ;
      Z6549ProForFR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7802ProFoNPrg_" + sGXsfl_480_idx ;
      Z7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8656ProForrbn_" + sGXsfl_480_idx ;
      Z8656ProForrbn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9704ProForVol_" + sGXsfl_480_idx ;
      Z9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9707ProForMq_" + sGXsfl_480_idx ;
      Z9707ProForMq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10542ProForH2O_" + sGXsfl_480_idx ;
      Z10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_480_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_154_" + sGXsfl_480_idx ;
      nRcdDeleted_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_154_" + sGXsfl_480_idx ;
      nRcdExists_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_154_" + sGXsfl_480_idx ;
      nIsMod_154 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProForL_Enabled = edtProForL_Enabled ;
   }

   public void confirmValues120( )
   {
      nGXsfl_480_idx = 0 ;
      sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_480154( ) ;
      while ( nGXsfl_480_idx < nRC_GXsfl_480 )
      {
         nGXsfl_480_idx = (int)(nGXsfl_480_idx+1) ;
         sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_480154( ) ;
         httpContext.changePostValue( "Z1160ProForL_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z1160ProForL_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1160ProForL_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z6549ProForFR_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z6549ProForFR_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6549ProForFR_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z7802ProFoNPrg_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7802ProFoNPrg_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z8656ProForrbn_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z8656ProForrbn_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8656ProForrbn_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z9704ProForVol_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z9704ProForVol_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9704ProForVol_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z9707ProForMq_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z9707ProForMq_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9707ProForMq_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z10542ProForH2O_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z10542ProForH2O_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10542ProForH2O_"+sGXsfl_480_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_480_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_480_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_480_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tformul", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5337ForCodExt", GXutil.rtrim( Z5337ForCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1192ForNumCli", GXutil.ltrim( localUtil.ntoc( Z1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1191ForNomCli", GXutil.rtrim( Z1191ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z485ForFec", localUtil.dtoc( Z485ForFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z495ForUltMod", localUtil.dtoc( Z495ForUltMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z496ForUltUti", localUtil.dtoc( Z496ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z492ForPreKgm", GXutil.ltrim( localUtil.ntoc( Z492ForPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z493ForPreMtr", GXutil.ltrim( localUtil.ntoc( Z493ForPreMtr, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z491ForPreDef", GXutil.rtrim( Z491ForPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1159ForUltLin", GXutil.ltrim( localUtil.ntoc( Z1159ForUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2749ForPro", GXutil.rtrim( Z2749ForPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2838ForRelBan", GXutil.ltrim( localUtil.ntoc( Z2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3007PrecioA", GXutil.ltrim( localUtil.ntoc( Z3007PrecioA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3008PrecioM", GXutil.ltrim( localUtil.ntoc( Z3008PrecioM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z995ForTonal", GXutil.rtrim( Z995ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3315ForNumArc", GXutil.ltrim( localUtil.ntoc( Z3315ForNumArc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3588ForEst", GXutil.rtrim( Z3588ForEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4339ForRGB", GXutil.ltrim( localUtil.ntoc( Z4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4380ForCosForm", GXutil.ltrim( localUtil.ntoc( Z4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4384ForTipArt", GXutil.ltrim( localUtil.ntoc( Z4384ForTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3560ForOpcCli", GXutil.rtrim( Z3560ForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3558ForFecApr", localUtil.dtoc( Z3558ForFecApr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5624ForUsrCod", GXutil.rtrim( Z5624ForUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5625ForFecHor", localUtil.ttoc( Z5625ForFecHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5626ForObsM", Z5626ForObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5653ForPInc", GXutil.ltrim( localUtil.ntoc( Z5653ForPInc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6379ForNomCli2", GXutil.rtrim( Z6379ForNomCli2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6608ForUsrCre", GXutil.rtrim( Z6608ForUsrCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6609ForFecCre", localUtil.ttoc( Z6609ForFecCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7029ForNomCli3", GXutil.rtrim( Z7029ForNomCli3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7537ForOpNum", GXutil.ltrim( localUtil.ntoc( Z7537ForOpNum, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7781ForBlo", GXutil.rtrim( Z7781ForBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8043ForTipT", GXutil.ltrim( localUtil.ntoc( Z8043ForTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8777For_item1", GXutil.rtrim( Z8777For_item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9792For_Reo", GXutil.rtrim( Z9792For_Reo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11041ForFecCtrl", localUtil.ttoc( Z11041ForFecCtrl, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11042ForFecCtrf", localUtil.ttoc( Z11042ForFecCtrf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4224ForKgUTin", GXutil.ltrim( localUtil.ntoc( Z4224ForKgUTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4225ForKgTTin", GXutil.ltrim( localUtil.ntoc( Z4225ForKgTTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4226ForCosTTi", GXutil.ltrim( localUtil.ntoc( Z4226ForCosTTi, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3569UltEnsCod", GXutil.rtrim( Z3569UltEnsCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3585ForPreFec", localUtil.dtoc( Z3585ForPreFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3586ForPreAnt", GXutil.ltrim( localUtil.ntoc( Z3586ForPreAnt, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3587ForFecAnt", localUtil.dtoc( Z3587ForFecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11705For_item2", GXutil.rtrim( Z11705For_item2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11706ForObs2", Z11706ForObs2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12732ForObsFac", Z12732ForObsFac);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13102ForLbTalao", GXutil.rtrim( Z13102ForLbTalao));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z626MatCod", GXutil.ltrim( localUtil.ntoc( Z626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3316CodSol", GXutil.ltrim( localUtil.ntoc( Z3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z484ForCon", GXutil.ltrim( localUtil.ntoc( Z484ForCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5362IntCodF", GXutil.ltrim( localUtil.ntoc( Z5362IntCodF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8561Fam_Cod", GXutil.ltrim( localUtil.ntoc( Z8561Fam_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_480", GXutil.ltrim( localUtil.ntoc( nGXsfl_480_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tformul", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFORMUL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO DE FORMULAS", "") ;
   }

   public void initializeNonKey1247( )
   {
      A254CliCodV = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A254CliCodV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A254CliCodV), 6, 0));
      A97ArtT1 = "" ;
      n97ArtT1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97ArtT1", A97ArtT1);
      A98ArtT2 = "" ;
      n98ArtT2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A98ArtT2", A98ArtT2);
      A99ArtT3 = "" ;
      n99ArtT3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99ArtT3", A99ArtT3);
      A102ArtTP1 = (short)(0) ;
      n102ArtTP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A102ArtTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A102ArtTP1), 3, 0));
      A103ArtTP2 = (short)(0) ;
      n103ArtTP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A103ArtTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A103ArtTP2), 3, 0));
      A104ArtTP3 = (short)(0) ;
      n104ArtTP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104ArtTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A104ArtTP3), 3, 0));
      A400EmprCodV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A400EmprCodV", A400EmprCodV);
      A473FindArt = "" ;
      n473FindArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A473FindArt", A473FindArt);
      A1674ArtU1 = "" ;
      n1674ArtU1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1674ArtU1", A1674ArtU1);
      A1675ArtU2 = "" ;
      n1675ArtU2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1675ArtU2", A1675ArtU2);
      A1676ArtU3 = "" ;
      n1676ArtU3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1676ArtU3", A1676ArtU3);
      A1677ArtUP1 = (short)(0) ;
      n1677ArtUP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1677ArtUP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1677ArtUP1), 3, 0));
      A1678ArtUP2 = (short)(0) ;
      n1678ArtUP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1678ArtUP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1678ArtUP2), 3, 0));
      A1679ArtUP3 = (short)(0) ;
      n1679ArtUP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1679ArtUP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1679ArtUP3), 3, 0));
      A1680ArtMater = "" ;
      n1680ArtMater = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1680ArtMater", A1680ArtMater);
      A5337ForCodExt = "" ;
      n5337ForCodExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5337ForCodExt", A5337ForCodExt);
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      A1192ForNumCli = 0 ;
      n1192ForNumCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1192ForNumCli), 6, 0));
      A1191ForNomCli = "" ;
      n1191ForNomCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1191ForNomCli", A1191ForNomCli);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A485ForFec = GXutil.nullDate() ;
      n485ForFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
      A495ForUltMod = GXutil.nullDate() ;
      n495ForUltMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
      A583IntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A626MatCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
      A627MatDsc = "" ;
      n627MatDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      A496ForUltUti = GXutil.nullDate() ;
      n496ForUltUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
      A492ForPreKgm = DecimalUtil.ZERO ;
      n492ForPreKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrimstr( A492ForPreKgm, 12, 5));
      A493ForPreMtr = DecimalUtil.ZERO ;
      n493ForPreMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrimstr( A493ForPreMtr, 12, 5));
      A491ForPreDef = "" ;
      n491ForPreDef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A491ForPreDef", A491ForPreDef);
      A484ForCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.str( A484ForCon, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A1159ForUltLin = (short)(0) ;
      n1159ForUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1159ForUltLin), 4, 0));
      A2749ForPro = "" ;
      n2749ForPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
      A2838ForRelBan = DecimalUtil.ZERO ;
      n2838ForRelBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
      A3007PrecioA = DecimalUtil.ZERO ;
      n3007PrecioA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrimstr( A3007PrecioA, 13, 5));
      A3008PrecioM = DecimalUtil.ZERO ;
      n3008PrecioM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrimstr( A3008PrecioM, 13, 5));
      A995ForTonal = "" ;
      n995ForTonal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A995ForTonal", A995ForTonal);
      A3315ForNumArc = 0 ;
      n3315ForNumArc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3315ForNumArc), 8, 0));
      A3316CodSol = (short)(0) ;
      n3316CodSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
      A3317DscSol = "" ;
      n3317DscSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A832TipColDsc = "" ;
      n832TipColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      A3792ForConDsc = "" ;
      n3792ForConDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", A3792ForConDsc);
      A3588ForEst = "" ;
      n3588ForEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3588ForEst", A3588ForEst);
      A1514MacProCod = "" ;
      n1514MacProCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A1515MacProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A4339ForRGB = 0 ;
      n4339ForRGB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4339ForRGB), 10, 0));
      A4380ForCosForm = DecimalUtil.ZERO ;
      n4380ForCosForm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
      A4384ForTipArt = (short)(0) ;
      n4384ForTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4384ForTipArt), 4, 0));
      A3560ForOpcCli = "" ;
      n3560ForOpcCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3560ForOpcCli", A3560ForOpcCli);
      A5362IntCodF = (byte)(0) ;
      n5362IntCodF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5362IntCodF), 2, 0));
      n5362IntCodF = ((0==A5362IntCodF) ? true : false) ;
      A5363IntDscF = "" ;
      n5363IntDscF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", A5363IntDscF);
      A3558ForFecApr = GXutil.nullDate() ;
      n3558ForFecApr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
      A5624ForUsrCod = "" ;
      n5624ForUsrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5624ForUsrCod", A5624ForUsrCod);
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      n5625ForFecHor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5626ForObsM = "" ;
      n5626ForObsM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5626ForObsM", A5626ForObsM);
      A5653ForPInc = (short)(0) ;
      n5653ForPInc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5653ForPInc), 3, 0));
      A5742ForSerDsc = "" ;
      n5742ForSerDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      A6379ForNomCli2 = "" ;
      n6379ForNomCli2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6379ForNomCli2", A6379ForNomCli2);
      A6608ForUsrCre = "" ;
      n6608ForUsrCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6608ForUsrCre", A6608ForUsrCre);
      A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      n6609ForFecCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A7029ForNomCli3 = "" ;
      n7029ForNomCli3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7029ForNomCli3", A7029ForNomCli3);
      A7537ForOpNum = (byte)(0) ;
      n7537ForOpNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7537ForOpNum), 2, 0));
      A7781ForBlo = "" ;
      n7781ForBlo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
      A8043ForTipT = (byte)(0) ;
      n8043ForTipT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.str( A8043ForTipT, 1, 0));
      A8561Fam_Cod = (short)(0) ;
      n8561Fam_Cod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8561Fam_Cod), 4, 0));
      A8777For_item1 = "" ;
      n8777For_item1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8777For_item1", A8777For_item1);
      A9792For_Reo = "" ;
      n9792For_Reo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9792For_Reo", A9792For_Reo);
      A11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      n11041ForFecCtrl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      n11042ForFecCtrf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4224ForKgUTin = DecimalUtil.ZERO ;
      n4224ForKgUTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrimstr( A4224ForKgUTin, 10, 2));
      A4225ForKgTTin = DecimalUtil.ZERO ;
      n4225ForKgTTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrimstr( A4225ForKgTTin, 10, 2));
      A4226ForCosTTi = DecimalUtil.ZERO ;
      n4226ForCosTTi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrimstr( A4226ForCosTTi, 13, 2));
      A3569UltEnsCod = "" ;
      n3569UltEnsCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3569UltEnsCod", A3569UltEnsCod);
      A3585ForPreFec = GXutil.nullDate() ;
      n3585ForPreFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
      A3586ForPreAnt = DecimalUtil.ZERO ;
      n3586ForPreAnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrimstr( A3586ForPreAnt, 12, 5));
      A3587ForFecAnt = GXutil.nullDate() ;
      n3587ForFecAnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
      A11705For_item2 = "" ;
      n11705For_item2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11705For_item2", A11705For_item2);
      A11706ForObs2 = "" ;
      n11706ForObs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11706ForObs2", A11706ForObs2);
      A12732ForObsFac = "" ;
      n12732ForObsFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12732ForObsFac", A12732ForObsFac);
      A13102ForLbTalao = "" ;
      n13102ForLbTalao = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13102ForLbTalao", A13102ForLbTalao);
      Z5337ForCodExt = "" ;
      Z1192ForNumCli = 0 ;
      Z1191ForNomCli = "" ;
      Z485ForFec = GXutil.nullDate() ;
      Z495ForUltMod = GXutil.nullDate() ;
      Z496ForUltUti = GXutil.nullDate() ;
      Z492ForPreKgm = DecimalUtil.ZERO ;
      Z493ForPreMtr = DecimalUtil.ZERO ;
      Z491ForPreDef = "" ;
      Z1159ForUltLin = (short)(0) ;
      Z2749ForPro = "" ;
      Z2838ForRelBan = DecimalUtil.ZERO ;
      Z3007PrecioA = DecimalUtil.ZERO ;
      Z3008PrecioM = DecimalUtil.ZERO ;
      Z995ForTonal = "" ;
      Z3315ForNumArc = 0 ;
      Z3588ForEst = "" ;
      Z4339ForRGB = 0 ;
      Z4380ForCosForm = DecimalUtil.ZERO ;
      Z4384ForTipArt = (short)(0) ;
      Z3560ForOpcCli = "" ;
      Z3558ForFecApr = GXutil.nullDate() ;
      Z5624ForUsrCod = "" ;
      Z5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      Z5626ForObsM = "" ;
      Z5653ForPInc = (short)(0) ;
      Z5742ForSerDsc = "" ;
      Z6379ForNomCli2 = "" ;
      Z6608ForUsrCre = "" ;
      Z6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      Z7029ForNomCli3 = "" ;
      Z7537ForOpNum = (byte)(0) ;
      Z7781ForBlo = "" ;
      Z8043ForTipT = (byte)(0) ;
      Z8777For_item1 = "" ;
      Z9792For_Reo = "" ;
      Z11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      Z11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      Z4224ForKgUTin = DecimalUtil.ZERO ;
      Z4225ForKgTTin = DecimalUtil.ZERO ;
      Z4226ForCosTTi = DecimalUtil.ZERO ;
      Z3569UltEnsCod = "" ;
      Z3585ForPreFec = GXutil.nullDate() ;
      Z3586ForPreAnt = DecimalUtil.ZERO ;
      Z3587ForFecAnt = GXutil.nullDate() ;
      Z11705For_item2 = "" ;
      Z11706ForObs2 = "" ;
      Z12732ForObsFac = "" ;
      Z13102ForLbTalao = "" ;
      Z486ForNumCol = 0 ;
      Z583IntCod = (byte)(0) ;
      Z626MatCod = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z1514MacProCod = "" ;
      Z3316CodSol = (short)(0) ;
      Z484ForCon = (byte)(0) ;
      Z5362IntCodF = (byte)(0) ;
      Z8561Fam_Cod = (short)(0) ;
   }

   public void initAll1247( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = "" ;
      n494ForSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      A482ForColNom = "" ;
      n482ForColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey1247( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey12154( )
   {
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A6549ProForFR = "" ;
      A7802ProFoNPrg = 0 ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A9704ProForVol = 0 ;
      A9707ProForMq = "" ;
      A10542ProForH2O = (short)(0) ;
      Z6549ProForFR = "" ;
      Z7802ProFoNPrg = 0 ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z9704ProForVol = 0 ;
      Z9707ProForMq = "" ;
      Z10542ProForH2O = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll12154( )
   {
      A1160ProForL = (short)(0) ;
      initializeNonKey12154( ) ;
   }

   public void standaloneModalInsert12154( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241503333", true, true);
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
      httpContext.AddJavascriptSource("tformul.js", "?20268241503333", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties154( )
   {
      edtProForL_Enabled = defedtProForL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), !bGXsfl_480_Refreshing);
   }

   public void startgridcontrol480( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_154, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_154_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6549ProForFR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForFR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForrbn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForVol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9707ProForMq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForMq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtForCodExt_Internalname = "FORCODEXT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtForFec_Internalname = "FORFEC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtForUltMod_Internalname = "FORULTMOD" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtIntCod_Internalname = "INTCOD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtIntDsc_Internalname = "INTDSC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtMatCod_Internalname = "MATCOD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtMatDsc_Internalname = "MATDSC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtForUltUti_Internalname = "FORULTUTI" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtForPreKgm_Internalname = "FORPREKGM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtForPreMtr_Internalname = "FORPREMTR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtForPreDef_Internalname = "FORPREDEF" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtForCon_Internalname = "FORCON" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtArtT1_Internalname = "ARTT1" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtArtTP1_Internalname = "ARTTP1" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtArtT2_Internalname = "ARTT2" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtArtTP2_Internalname = "ARTTP2" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtArtT3_Internalname = "ARTT3" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtArtTP3_Internalname = "ARTTP3" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtArtU1_Internalname = "ARTU1" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtArtU2_Internalname = "ARTU2" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtArtU3_Internalname = "ARTU3" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtArtUP1_Internalname = "ARTUP1" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtArtUP2_Internalname = "ARTUP2" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtArtUP3_Internalname = "ARTUP3" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtArtMater_Internalname = "ARTMATER" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtFindArt_Internalname = "FINDART" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtEmprCodV_Internalname = "EMPRCODV" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtCliCodV_Internalname = "CLICODV" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtForUltLin_Internalname = "FORULTLIN" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      chkForPro.setInternalname( "FORPRO" );
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtForRelBan_Internalname = "FORRELBAN" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtPrecioA_Internalname = "PRECIOA" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtPrecioM_Internalname = "PRECIOM" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtForTonal_Internalname = "FORTONAL" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtForNumArc_Internalname = "FORNUMARC" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtCodSol_Internalname = "CODSOL" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtDscSol_Internalname = "DSCSOL" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtForConDsc_Internalname = "FORCONDSC" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtForEst_Internalname = "FOREST" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtMacProCod_Internalname = "MACPROCOD" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtMacProDsc_Internalname = "MACPRODSC" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtForRGB_Internalname = "FORRGB" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtForCosForm_Internalname = "FORCOSFORM" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtForTipArt_Internalname = "FORTIPART" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtForOpcCli_Internalname = "FOROPCCLI" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtIntCodF_Internalname = "INTCODF" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtIntDscF_Internalname = "INTDSCF" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtForFecApr_Internalname = "FORFECAPR" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtForUsrCod_Internalname = "FORUSRCOD" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtForFecHor_Internalname = "FORFECHOR" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtForObsM_Internalname = "FOROBSM" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtForPInc_Internalname = "FORPINC" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtForNomCli2_Internalname = "FORNOMCLI2" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtForUsrCre_Internalname = "FORUSRCRE" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtForFecCre_Internalname = "FORFECCRE" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtForNomCli3_Internalname = "FORNOMCLI3" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtForOpNum_Internalname = "FOROPNUM" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      cmbForBlo.setInternalname( "FORBLO" );
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtForTipT_Internalname = "FORTIPT" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtFam_Cod_Internalname = "FAM_COD" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtFor_item1_Internalname = "FOR_ITEM1" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtFor_Reo_Internalname = "FOR_REO" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtForFecCtrl_Internalname = "FORFECCTRL" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtForFecCtrf_Internalname = "FORFECCTRF" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtForKgUTin_Internalname = "FORKGUTIN" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtForKgTTin_Internalname = "FORKGTTIN" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtForCosTTi_Internalname = "FORCOSTTI" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtUltEnsCod_Internalname = "ULTENSCOD" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      edtForPreFec_Internalname = "FORPREFEC" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtForPreAnt_Internalname = "FORPREANT" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtForFecAnt_Internalname = "FORFECANT" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtFor_item2_Internalname = "FOR_ITEM2" ;
      lblTextblock90_Internalname = "TEXTBLOCK90" ;
      edtForObs2_Internalname = "FOROBS2" ;
      lblTextblock91_Internalname = "TEXTBLOCK91" ;
      edtForObsFac_Internalname = "FOROBSFAC" ;
      lblTextblock92_Internalname = "TEXTBLOCK92" ;
      edtForLbTalao_Internalname = "FORLBTALAO" ;
      edtavnRcdDeleted_154_Internalname = "vNRCDDELETED_154" ;
      edtProForL_Internalname = "PROFORL" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForFR_Internalname = "PROFORFR" ;
      edtProFoNPrg_Internalname = "PROFONPRG" ;
      edtProForrbn_Internalname = "PROFORRBN" ;
      edtProForVol_Internalname = "PROFORVOL" ;
      edtProForMq_Internalname = "PROFORMQ" ;
      edtProForH2O_Internalname = "PROFORH2O" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO DE FORMULAS", "") );
      edtProForH2O_Jsonclick = "" ;
      edtProForMq_Jsonclick = "" ;
      edtProForVol_Jsonclick = "" ;
      edtProForrbn_Jsonclick = "" ;
      edtProFoNPrg_Jsonclick = "" ;
      edtProForFR_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtProForL_Jsonclick = "" ;
      edtavnRcdDeleted_154_Jsonclick = "" ;
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
      edtProForH2O_Enabled = 1 ;
      edtProForMq_Enabled = 1 ;
      edtProForVol_Enabled = 1 ;
      edtProForrbn_Enabled = 1 ;
      edtProFoNPrg_Enabled = 1 ;
      edtProForFR_Enabled = 1 ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtProForL_Enabled = 1 ;
      edtavnRcdDeleted_154_Enabled = 1 ;
      edtForLbTalao_Jsonclick = "" ;
      edtForLbTalao_Backcolor = (int)(0xFFFFFF) ;
      edtForLbTalao_Enabled = 1 ;
      edtForObsFac_Backcolor = (int)(0xFFFFFF) ;
      edtForObsFac_Enabled = 1 ;
      edtForObs2_Backcolor = (int)(0xFFFFFF) ;
      edtForObs2_Enabled = 1 ;
      edtFor_item2_Jsonclick = "" ;
      edtFor_item2_Backcolor = (int)(0xFFFFFF) ;
      edtFor_item2_Enabled = 1 ;
      edtForFecAnt_Jsonclick = "" ;
      edtForFecAnt_Backcolor = (int)(0xFFFFFF) ;
      edtForFecAnt_Enabled = 1 ;
      edtForPreAnt_Jsonclick = "" ;
      edtForPreAnt_Backcolor = (int)(0xFFFFFF) ;
      edtForPreAnt_Enabled = 1 ;
      edtForPreFec_Jsonclick = "" ;
      edtForPreFec_Backcolor = (int)(0xFFFFFF) ;
      edtForPreFec_Enabled = 1 ;
      edtUltEnsCod_Jsonclick = "" ;
      edtUltEnsCod_Backcolor = (int)(0xFFFFFF) ;
      edtUltEnsCod_Enabled = 1 ;
      edtForCosTTi_Jsonclick = "" ;
      edtForCosTTi_Backcolor = (int)(0xFFFFFF) ;
      edtForCosTTi_Enabled = 1 ;
      edtForKgTTin_Jsonclick = "" ;
      edtForKgTTin_Backcolor = (int)(0xFFFFFF) ;
      edtForKgTTin_Enabled = 1 ;
      edtForKgUTin_Jsonclick = "" ;
      edtForKgUTin_Backcolor = (int)(0xFFFFFF) ;
      edtForKgUTin_Enabled = 1 ;
      edtForFecCtrf_Jsonclick = "" ;
      edtForFecCtrf_Backcolor = (int)(0xFFFFFF) ;
      edtForFecCtrf_Enabled = 1 ;
      edtForFecCtrl_Jsonclick = "" ;
      edtForFecCtrl_Backcolor = (int)(0xFFFFFF) ;
      edtForFecCtrl_Enabled = 1 ;
      edtFor_Reo_Jsonclick = "" ;
      edtFor_Reo_Backcolor = (int)(0xFFFFFF) ;
      edtFor_Reo_Enabled = 1 ;
      edtFor_item1_Jsonclick = "" ;
      edtFor_item1_Backcolor = (int)(0xFFFFFF) ;
      edtFor_item1_Enabled = 1 ;
      edtFam_Cod_Jsonclick = "" ;
      edtFam_Cod_Backcolor = (int)(0xFFFFFF) ;
      edtFam_Cod_Enabled = 1 ;
      edtForTipT_Jsonclick = "" ;
      edtForTipT_Backcolor = (int)(0xFFFFFF) ;
      edtForTipT_Enabled = 1 ;
      cmbForBlo.setJsonclick( "" );
      cmbForBlo.setEnabled( 1 );
      cmbForBlo.setIBackground( (int)(0xFFFFFF) );
      edtForOpNum_Jsonclick = "" ;
      edtForOpNum_Backcolor = (int)(0xFFFFFF) ;
      edtForOpNum_Enabled = 1 ;
      edtForNomCli3_Jsonclick = "" ;
      edtForNomCli3_Backcolor = (int)(0xFFFFFF) ;
      edtForNomCli3_Enabled = 1 ;
      edtForFecCre_Jsonclick = "" ;
      edtForFecCre_Backcolor = (int)(0xFFFFFF) ;
      edtForFecCre_Enabled = 1 ;
      edtForUsrCre_Jsonclick = "" ;
      edtForUsrCre_Backcolor = (int)(0xFFFFFF) ;
      edtForUsrCre_Enabled = 1 ;
      edtForNomCli2_Jsonclick = "" ;
      edtForNomCli2_Backcolor = (int)(0xFFFFFF) ;
      edtForNomCli2_Enabled = 1 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 1 ;
      edtForPInc_Jsonclick = "" ;
      edtForPInc_Backcolor = (int)(0xFFFFFF) ;
      edtForPInc_Enabled = 1 ;
      edtForObsM_Backcolor = (int)(0xFFFFFF) ;
      edtForObsM_Enabled = 1 ;
      edtForFecHor_Jsonclick = "" ;
      edtForFecHor_Backcolor = (int)(0xFFFFFF) ;
      edtForFecHor_Enabled = 1 ;
      edtForUsrCod_Jsonclick = "" ;
      edtForUsrCod_Backcolor = (int)(0xFFFFFF) ;
      edtForUsrCod_Enabled = 1 ;
      edtForFecApr_Jsonclick = "" ;
      edtForFecApr_Backcolor = (int)(0xFFFFFF) ;
      edtForFecApr_Enabled = 1 ;
      edtIntDscF_Jsonclick = "" ;
      edtIntDscF_Backcolor = (int)(0xFFFFFF) ;
      edtIntDscF_Enabled = 0 ;
      edtIntCodF_Jsonclick = "" ;
      edtIntCodF_Backcolor = (int)(0xFFFFFF) ;
      edtIntCodF_Enabled = 1 ;
      edtForOpcCli_Jsonclick = "" ;
      edtForOpcCli_Backcolor = (int)(0xFFFFFF) ;
      edtForOpcCli_Enabled = 1 ;
      edtForTipArt_Jsonclick = "" ;
      edtForTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtForTipArt_Enabled = 1 ;
      edtForCosForm_Jsonclick = "" ;
      edtForCosForm_Backcolor = (int)(0xFFFFFF) ;
      edtForCosForm_Enabled = 1 ;
      edtForRGB_Jsonclick = "" ;
      edtForRGB_Backcolor = (int)(0xFFFFFF) ;
      edtForRGB_Enabled = 1 ;
      edtMacProDsc_Jsonclick = "" ;
      edtMacProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMacProDsc_Enabled = 0 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Backcolor = (int)(0xFFFFFF) ;
      edtMacProCod_Enabled = 1 ;
      edtForEst_Jsonclick = "" ;
      edtForEst_Backcolor = (int)(0xFFFFFF) ;
      edtForEst_Enabled = 1 ;
      edtForConDsc_Jsonclick = "" ;
      edtForConDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForConDsc_Enabled = 0 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtDscSol_Jsonclick = "" ;
      edtDscSol_Backcolor = (int)(0xFFFFFF) ;
      edtDscSol_Enabled = 0 ;
      edtCodSol_Jsonclick = "" ;
      edtCodSol_Backcolor = (int)(0xFFFFFF) ;
      edtCodSol_Enabled = 1 ;
      edtForNumArc_Jsonclick = "" ;
      edtForNumArc_Backcolor = (int)(0xFFFFFF) ;
      edtForNumArc_Enabled = 1 ;
      edtForTonal_Jsonclick = "" ;
      edtForTonal_Backcolor = (int)(0xFFFFFF) ;
      edtForTonal_Enabled = 1 ;
      edtPrecioM_Jsonclick = "" ;
      edtPrecioM_Backcolor = (int)(0xFFFFFF) ;
      edtPrecioM_Enabled = 1 ;
      edtPrecioA_Jsonclick = "" ;
      edtPrecioA_Backcolor = (int)(0xFFFFFF) ;
      edtPrecioA_Enabled = 1 ;
      edtForRelBan_Jsonclick = "" ;
      edtForRelBan_Backcolor = (int)(0xFFFFFF) ;
      edtForRelBan_Enabled = 1 ;
      chkForPro.setIBackground( (int)(0xFFFFFF) );
      chkForPro.setEnabled( 1 );
      edtForUltLin_Jsonclick = "" ;
      edtForUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtForUltLin_Enabled = 1 ;
      edtCliCodV_Jsonclick = "" ;
      edtCliCodV_Backcolor = (int)(0xFFFFFF) ;
      edtCliCodV_Enabled = 0 ;
      edtEmprCodV_Jsonclick = "" ;
      edtEmprCodV_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCodV_Enabled = 0 ;
      edtFindArt_Jsonclick = "" ;
      edtFindArt_Backcolor = (int)(0xFFFFFF) ;
      edtFindArt_Enabled = 0 ;
      edtArtMater_Jsonclick = "" ;
      edtArtMater_Backcolor = (int)(0xFFFFFF) ;
      edtArtMater_Enabled = 0 ;
      edtArtUP3_Jsonclick = "" ;
      edtArtUP3_Backcolor = (int)(0xFFFFFF) ;
      edtArtUP3_Enabled = 0 ;
      edtArtUP2_Jsonclick = "" ;
      edtArtUP2_Backcolor = (int)(0xFFFFFF) ;
      edtArtUP2_Enabled = 0 ;
      edtArtUP1_Jsonclick = "" ;
      edtArtUP1_Backcolor = (int)(0xFFFFFF) ;
      edtArtUP1_Enabled = 0 ;
      edtArtU3_Jsonclick = "" ;
      edtArtU3_Backcolor = (int)(0xFFFFFF) ;
      edtArtU3_Enabled = 0 ;
      edtArtU2_Jsonclick = "" ;
      edtArtU2_Backcolor = (int)(0xFFFFFF) ;
      edtArtU2_Enabled = 0 ;
      edtArtU1_Jsonclick = "" ;
      edtArtU1_Backcolor = (int)(0xFFFFFF) ;
      edtArtU1_Enabled = 0 ;
      edtArtTP3_Jsonclick = "" ;
      edtArtTP3_Backcolor = (int)(0xFFFFFF) ;
      edtArtTP3_Enabled = 0 ;
      edtArtT3_Jsonclick = "" ;
      edtArtT3_Backcolor = (int)(0xFFFFFF) ;
      edtArtT3_Enabled = 0 ;
      edtArtTP2_Jsonclick = "" ;
      edtArtTP2_Backcolor = (int)(0xFFFFFF) ;
      edtArtTP2_Enabled = 0 ;
      edtArtT2_Jsonclick = "" ;
      edtArtT2_Backcolor = (int)(0xFFFFFF) ;
      edtArtT2_Enabled = 0 ;
      edtArtTP1_Jsonclick = "" ;
      edtArtTP1_Backcolor = (int)(0xFFFFFF) ;
      edtArtTP1_Enabled = 0 ;
      edtArtT1_Jsonclick = "" ;
      edtArtT1_Backcolor = (int)(0xFFFFFF) ;
      edtArtT1_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtForCon_Jsonclick = "" ;
      edtForCon_Backcolor = (int)(0xFFFFFF) ;
      edtForCon_Enabled = 1 ;
      edtForPreDef_Jsonclick = "" ;
      edtForPreDef_Backcolor = (int)(0xFFFFFF) ;
      edtForPreDef_Enabled = 1 ;
      edtForPreMtr_Jsonclick = "" ;
      edtForPreMtr_Backcolor = (int)(0xFFFFFF) ;
      edtForPreMtr_Enabled = 1 ;
      edtForPreKgm_Jsonclick = "" ;
      edtForPreKgm_Backcolor = (int)(0xFFFFFF) ;
      edtForPreKgm_Enabled = 1 ;
      edtForUltUti_Jsonclick = "" ;
      edtForUltUti_Backcolor = (int)(0xFFFFFF) ;
      edtForUltUti_Enabled = 1 ;
      edtMatDsc_Jsonclick = "" ;
      edtMatDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMatDsc_Enabled = 0 ;
      edtMatCod_Jsonclick = "" ;
      edtMatCod_Backcolor = (int)(0xFFFFFF) ;
      edtMatCod_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 1 ;
      edtForUltMod_Jsonclick = "" ;
      edtForUltMod_Backcolor = (int)(0xFFFFFF) ;
      edtForUltMod_Enabled = 1 ;
      edtForFec_Jsonclick = "" ;
      edtForFec_Backcolor = (int)(0xFFFFFF) ;
      edtForFec_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtForNomCli_Enabled = 1 ;
      edtForNumCli_Jsonclick = "" ;
      edtForNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtForNumCli_Enabled = 1 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtForNumCol_Enabled = 1 ;
      edtForCodExt_Jsonclick = "" ;
      edtForCodExt_Backcolor = (int)(0xFFFFFF) ;
      edtForCodExt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 1 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 1 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_480154( ) ;
      while ( nGXsfl_480_idx <= nRC_GXsfl_480 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal12154( ) ;
         standaloneModal12154( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow12154( ) ;
         nGXsfl_480_idx = (int)(nGXsfl_480_idx+1) ;
         sGXsfl_480_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_480_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_480154( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkForPro.setName( "FORPRO" );
      chkForPro.setWebtags( "" );
      chkForPro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), true);
      chkForPro.setCheckedValue( "N" );
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", A2749ForPro);
      cmbForBlo.setName( "FORBLO" );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", A7781ForBlo);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T001239 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001239_A407EmprNom[0] ;
      n407EmprNom = T001239_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(37);
      /* Using cursor T001240 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T001240_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(38);
      /* Using cursor T001241 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T001241_A832TipColDsc[0] ;
      n832TipColDsc = T001241_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(39);
      GX_FocusControl = edtForCodExt_Internalname ;
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
      /* Using cursor T001239 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T001239_A407EmprNom[0] ;
      n407EmprNom = T001239_n407EmprNom[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T001240 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T001240_A279CliNom[0] ;
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Tipcolcod( )
   {
      n7781ForBlo = false ;
      A7781ForBlo = cmbForBlo.getValue() ;
      n7781ForBlo = false ;
      cmbForBlo.setValue( A7781ForBlo );
      n252CliCod = false ;
      n494ForSer = false ;
      n482ForColNom = false ;
      n483ForColNum = false ;
      n831TipColCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T001241 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A832TipColDsc = T001241_A832TipColDsc[0] ;
      n832TipColDsc = T001241_n832TipColDsc[0] ;
      pr_default.close(39);
      dynload_actions( ) ;
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
         cmbForBlo.setValue( A7781ForBlo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A254CliCodV", GXutil.ltrim( localUtil.ntoc( A254CliCodV, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A97ArtT1", GXutil.rtrim( A97ArtT1));
      httpContext.ajax_rsp_assign_attri("", false, "A98ArtT2", GXutil.rtrim( A98ArtT2));
      httpContext.ajax_rsp_assign_attri("", false, "A99ArtT3", GXutil.rtrim( A99ArtT3));
      httpContext.ajax_rsp_assign_attri("", false, "A102ArtTP1", GXutil.ltrim( localUtil.ntoc( A102ArtTP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A103ArtTP2", GXutil.ltrim( localUtil.ntoc( A103ArtTP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A104ArtTP3", GXutil.ltrim( localUtil.ntoc( A104ArtTP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A400EmprCodV", GXutil.rtrim( A400EmprCodV));
      httpContext.ajax_rsp_assign_attri("", false, "A473FindArt", GXutil.rtrim( A473FindArt));
      httpContext.ajax_rsp_assign_attri("", false, "A1674ArtU1", GXutil.rtrim( A1674ArtU1));
      httpContext.ajax_rsp_assign_attri("", false, "A1675ArtU2", GXutil.rtrim( A1675ArtU2));
      httpContext.ajax_rsp_assign_attri("", false, "A1676ArtU3", GXutil.rtrim( A1676ArtU3));
      httpContext.ajax_rsp_assign_attri("", false, "A1677ArtUP1", GXutil.ltrim( localUtil.ntoc( A1677ArtUP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1678ArtUP2", GXutil.ltrim( localUtil.ntoc( A1678ArtUP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1679ArtUP3", GXutil.ltrim( localUtil.ntoc( A1679ArtUP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1680ArtMater", GXutil.rtrim( A1680ArtMater));
      httpContext.ajax_rsp_assign_attri("", false, "A5337ForCodExt", GXutil.rtrim( A5337ForCodExt));
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1192ForNumCli", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1191ForNomCli", GXutil.rtrim( A1191ForNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A485ForFec", localUtil.format(A485ForFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A495ForUltMod", localUtil.format(A495ForUltMod, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A496ForUltUti", localUtil.format(A496ForUltUti, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A492ForPreKgm", GXutil.ltrim( localUtil.ntoc( A492ForPreKgm, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A493ForPreMtr", GXutil.ltrim( localUtil.ntoc( A493ForPreMtr, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A491ForPreDef", GXutil.rtrim( A491ForPreDef));
      httpContext.ajax_rsp_assign_attri("", false, "A484ForCon", GXutil.ltrim( localUtil.ntoc( A484ForCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1159ForUltLin", GXutil.ltrim( localUtil.ntoc( A1159ForUltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2749ForPro", GXutil.rtrim( A2749ForPro));
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3007PrecioA", GXutil.ltrim( localUtil.ntoc( A3007PrecioA, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3008PrecioM", GXutil.ltrim( localUtil.ntoc( A3008PrecioM, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A995ForTonal", GXutil.rtrim( A995ForTonal));
      httpContext.ajax_rsp_assign_attri("", false, "A3315ForNumArc", GXutil.ltrim( localUtil.ntoc( A3315ForNumArc, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3588ForEst", GXutil.rtrim( A3588ForEst));
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", GXutil.rtrim( A1514MacProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4339ForRGB", GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4384ForTipArt", GXutil.ltrim( localUtil.ntoc( A4384ForTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3560ForOpcCli", GXutil.rtrim( A3560ForOpcCli));
      httpContext.ajax_rsp_assign_attri("", false, "A5362IntCodF", GXutil.ltrim( localUtil.ntoc( A5362IntCodF, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3558ForFecApr", localUtil.format(A3558ForFecApr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5624ForUsrCod", GXutil.rtrim( A5624ForUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5625ForFecHor", localUtil.ttoc( A5625ForFecHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5626ForObsM", A5626ForObsM);
      httpContext.ajax_rsp_assign_attri("", false, "A5653ForPInc", GXutil.ltrim( localUtil.ntoc( A5653ForPInc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6379ForNomCli2", GXutil.rtrim( A6379ForNomCli2));
      httpContext.ajax_rsp_assign_attri("", false, "A6608ForUsrCre", GXutil.rtrim( A6608ForUsrCre));
      httpContext.ajax_rsp_assign_attri("", false, "A6609ForFecCre", localUtil.ttoc( A6609ForFecCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A7029ForNomCli3", GXutil.rtrim( A7029ForNomCli3));
      httpContext.ajax_rsp_assign_attri("", false, "A7537ForOpNum", GXutil.ltrim( localUtil.ntoc( A7537ForOpNum, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7781ForBlo", GXutil.rtrim( A7781ForBlo));
      cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A8043ForTipT", GXutil.ltrim( localUtil.ntoc( A8043ForTipT, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8561Fam_Cod", GXutil.ltrim( localUtil.ntoc( A8561Fam_Cod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8777For_item1", GXutil.rtrim( A8777For_item1));
      httpContext.ajax_rsp_assign_attri("", false, "A9792For_Reo", GXutil.rtrim( A9792For_Reo));
      httpContext.ajax_rsp_assign_attri("", false, "A11041ForFecCtrl", localUtil.ttoc( A11041ForFecCtrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11042ForFecCtrf", localUtil.ttoc( A11042ForFecCtrf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4224ForKgUTin", GXutil.ltrim( localUtil.ntoc( A4224ForKgUTin, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4225ForKgTTin", GXutil.ltrim( localUtil.ntoc( A4225ForKgTTin, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4226ForCosTTi", GXutil.ltrim( localUtil.ntoc( A4226ForCosTTi, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3569UltEnsCod", GXutil.rtrim( A3569UltEnsCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3585ForPreFec", localUtil.format(A3585ForPreFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3586ForPreAnt", GXutil.ltrim( localUtil.ntoc( A3586ForPreAnt, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3587ForFecAnt", localUtil.format(A3587ForFecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11705For_item2", GXutil.rtrim( A11705For_item2));
      httpContext.ajax_rsp_assign_attri("", false, "A11706ForObs2", A11706ForObs2);
      httpContext.ajax_rsp_assign_attri("", false, "A12732ForObsFac", A12732ForObsFac);
      httpContext.ajax_rsp_assign_attri("", false, "A13102ForLbTalao", GXutil.rtrim( A13102ForLbTalao));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", GXutil.rtrim( A627MatDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", GXutil.rtrim( A3317DscSol));
      httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", GXutil.rtrim( A3792ForConDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", GXutil.rtrim( A5363IntDscF));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z254CliCodV", GXutil.ltrim( localUtil.ntoc( Z254CliCodV, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z97ArtT1", GXutil.rtrim( Z97ArtT1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z98ArtT2", GXutil.rtrim( Z98ArtT2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z99ArtT3", GXutil.rtrim( Z99ArtT3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z102ArtTP1", GXutil.ltrim( localUtil.ntoc( Z102ArtTP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z103ArtTP2", GXutil.ltrim( localUtil.ntoc( Z103ArtTP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z104ArtTP3", GXutil.ltrim( localUtil.ntoc( Z104ArtTP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z400EmprCodV", GXutil.rtrim( Z400EmprCodV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z473FindArt", GXutil.rtrim( Z473FindArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1674ArtU1", GXutil.rtrim( Z1674ArtU1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1675ArtU2", GXutil.rtrim( Z1675ArtU2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1676ArtU3", GXutil.rtrim( Z1676ArtU3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1677ArtUP1", GXutil.ltrim( localUtil.ntoc( Z1677ArtUP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1678ArtUP2", GXutil.ltrim( localUtil.ntoc( Z1678ArtUP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1679ArtUP3", GXutil.ltrim( localUtil.ntoc( Z1679ArtUP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1680ArtMater", GXutil.rtrim( Z1680ArtMater));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5337ForCodExt", GXutil.rtrim( Z5337ForCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1192ForNumCli", GXutil.ltrim( localUtil.ntoc( Z1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1191ForNomCli", GXutil.rtrim( Z1191ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z485ForFec", localUtil.format(Z485ForFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z495ForUltMod", localUtil.format(Z495ForUltMod, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z626MatCod", GXutil.ltrim( localUtil.ntoc( Z626MatCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z496ForUltUti", localUtil.format(Z496ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z492ForPreKgm", GXutil.ltrim( localUtil.ntoc( Z492ForPreKgm, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z493ForPreMtr", GXutil.ltrim( localUtil.ntoc( Z493ForPreMtr, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z491ForPreDef", GXutil.rtrim( Z491ForPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z484ForCon", GXutil.ltrim( localUtil.ntoc( Z484ForCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1159ForUltLin", GXutil.ltrim( localUtil.ntoc( Z1159ForUltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2749ForPro", GXutil.rtrim( Z2749ForPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2838ForRelBan", GXutil.ltrim( localUtil.ntoc( Z2838ForRelBan, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3007PrecioA", GXutil.ltrim( localUtil.ntoc( Z3007PrecioA, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3008PrecioM", GXutil.ltrim( localUtil.ntoc( Z3008PrecioM, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z995ForTonal", GXutil.rtrim( Z995ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3315ForNumArc", GXutil.ltrim( localUtil.ntoc( Z3315ForNumArc, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3316CodSol", GXutil.ltrim( localUtil.ntoc( Z3316CodSol, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3588ForEst", GXutil.rtrim( Z3588ForEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4339ForRGB", GXutil.ltrim( localUtil.ntoc( Z4339ForRGB, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4380ForCosForm", GXutil.ltrim( localUtil.ntoc( Z4380ForCosForm, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4384ForTipArt", GXutil.ltrim( localUtil.ntoc( Z4384ForTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3560ForOpcCli", GXutil.rtrim( Z3560ForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5362IntCodF", GXutil.ltrim( localUtil.ntoc( Z5362IntCodF, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3558ForFecApr", localUtil.format(Z3558ForFecApr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5624ForUsrCod", GXutil.rtrim( Z5624ForUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5625ForFecHor", localUtil.ttoc( Z5625ForFecHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5626ForObsM", Z5626ForObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5653ForPInc", GXutil.ltrim( localUtil.ntoc( Z5653ForPInc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6379ForNomCli2", GXutil.rtrim( Z6379ForNomCli2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6608ForUsrCre", GXutil.rtrim( Z6608ForUsrCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6609ForFecCre", localUtil.ttoc( Z6609ForFecCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7029ForNomCli3", GXutil.rtrim( Z7029ForNomCli3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7537ForOpNum", GXutil.ltrim( localUtil.ntoc( Z7537ForOpNum, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7781ForBlo", GXutil.rtrim( Z7781ForBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8043ForTipT", GXutil.ltrim( localUtil.ntoc( Z8043ForTipT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8561Fam_Cod", GXutil.ltrim( localUtil.ntoc( Z8561Fam_Cod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8777For_item1", GXutil.rtrim( Z8777For_item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9792For_Reo", GXutil.rtrim( Z9792For_Reo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11041ForFecCtrl", localUtil.ttoc( Z11041ForFecCtrl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11042ForFecCtrf", localUtil.ttoc( Z11042ForFecCtrf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4224ForKgUTin", GXutil.ltrim( localUtil.ntoc( Z4224ForKgUTin, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4225ForKgTTin", GXutil.ltrim( localUtil.ntoc( Z4225ForKgTTin, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4226ForCosTTi", GXutil.ltrim( localUtil.ntoc( Z4226ForCosTTi, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3569UltEnsCod", GXutil.rtrim( Z3569UltEnsCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3585ForPreFec", localUtil.format(Z3585ForPreFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3586ForPreAnt", GXutil.ltrim( localUtil.ntoc( Z3586ForPreAnt, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3587ForFecAnt", localUtil.format(Z3587ForFecAnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11705For_item2", GXutil.rtrim( Z11705For_item2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11706ForObs2", Z11706ForObs2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12732ForObsFac", Z12732ForObsFac);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13102ForLbTalao", GXutil.rtrim( Z13102ForLbTalao));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z627MatDsc", GXutil.rtrim( Z627MatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1515MacProDsc", GXutil.rtrim( Z1515MacProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3317DscSol", GXutil.rtrim( Z3317DscSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3792ForConDsc", GXutil.rtrim( Z3792ForConDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5363IntDscF", GXutil.rtrim( Z5363IntDscF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fornumcol( )
   {
      /* Using cursor T001272 */
      pr_default.execute(70, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(70) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(70);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T001242 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A213BarSit = T001242_A213BarSit[0] ;
      pr_default.close(40);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Intcod( )
   {
      n584IntDsc = false ;
      /* Using cursor T001243 */
      pr_default.execute(41, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A584IntDsc = T001243_A584IntDsc[0] ;
      n584IntDsc = T001243_n584IntDsc[0] ;
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
   }

   public void valid_Matcod( )
   {
      n627MatDsc = false ;
      /* Using cursor T001244 */
      pr_default.execute(42, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A627MatDsc = T001244_A627MatDsc[0] ;
      n627MatDsc = T001244_n627MatDsc[0] ;
      pr_default.close(42);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", GXutil.rtrim( A627MatDsc));
   }

   public void valid_Forcon( )
   {
      n3792ForConDsc = false ;
      /* Using cursor T001245 */
      pr_default.execute(43, new Object[] {A396EmprCod, Byte.valueOf(A484ForCon)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORCTR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A3792ForConDsc = T001245_A3792ForConDsc[0] ;
      n3792ForConDsc = T001245_n3792ForConDsc[0] ;
      pr_default.close(43);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3792ForConDsc", GXutil.rtrim( A3792ForConDsc));
   }

   public void valid_Clicodv( )
   {
      n252CliCod = false ;
      n494ForSer = false ;
      n97ArtT1 = false ;
      n98ArtT2 = false ;
      n99ArtT3 = false ;
      n102ArtTP1 = false ;
      n103ArtTP2 = false ;
      n104ArtTP3 = false ;
      n473FindArt = false ;
      n1674ArtU1 = false ;
      n1675ArtU2 = false ;
      n1676ArtU3 = false ;
      n1677ArtUP1 = false ;
      n1678ArtUP2 = false ;
      n1679ArtUP3 = false ;
      n1680ArtMater = false ;
      A254CliCodV = A252CliCod ;
      /* Using cursor T001219 */
      pr_default.execute(17, new Object[] {A400EmprCodV, Integer.valueOf(A254CliCodV), Boolean.valueOf(n494ForSer), A494ForSer});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A97ArtT1 = T001219_A97ArtT1[0] ;
         n97ArtT1 = T001219_n97ArtT1[0] ;
         A98ArtT2 = T001219_A98ArtT2[0] ;
         n98ArtT2 = T001219_n98ArtT2[0] ;
         A99ArtT3 = T001219_A99ArtT3[0] ;
         n99ArtT3 = T001219_n99ArtT3[0] ;
         A102ArtTP1 = T001219_A102ArtTP1[0] ;
         n102ArtTP1 = T001219_n102ArtTP1[0] ;
         A103ArtTP2 = T001219_A103ArtTP2[0] ;
         n103ArtTP2 = T001219_n103ArtTP2[0] ;
         A104ArtTP3 = T001219_A104ArtTP3[0] ;
         n104ArtTP3 = T001219_n104ArtTP3[0] ;
         A473FindArt = T001219_A473FindArt[0] ;
         n473FindArt = T001219_n473FindArt[0] ;
         A1674ArtU1 = T001219_A1674ArtU1[0] ;
         n1674ArtU1 = T001219_n1674ArtU1[0] ;
         A1675ArtU2 = T001219_A1675ArtU2[0] ;
         n1675ArtU2 = T001219_n1675ArtU2[0] ;
         A1676ArtU3 = T001219_A1676ArtU3[0] ;
         n1676ArtU3 = T001219_n1676ArtU3[0] ;
         A1677ArtUP1 = T001219_A1677ArtUP1[0] ;
         n1677ArtUP1 = T001219_n1677ArtUP1[0] ;
         A1678ArtUP2 = T001219_A1678ArtUP2[0] ;
         n1678ArtUP2 = T001219_n1678ArtUP2[0] ;
         A1679ArtUP3 = T001219_A1679ArtUP3[0] ;
         n1679ArtUP3 = T001219_n1679ArtUP3[0] ;
         A1680ArtMater = T001219_A1680ArtMater[0] ;
         n1680ArtMater = T001219_n1680ArtMater[0] ;
      }
      else
      {
         A1680ArtMater = "" ;
         n1680ArtMater = false ;
         A1679ArtUP3 = (short)(0) ;
         n1679ArtUP3 = false ;
         A1678ArtUP2 = (short)(0) ;
         n1678ArtUP2 = false ;
         A1677ArtUP1 = (short)(0) ;
         n1677ArtUP1 = false ;
         A1676ArtU3 = "" ;
         n1676ArtU3 = false ;
         A1675ArtU2 = "" ;
         n1675ArtU2 = false ;
         A1674ArtU1 = "" ;
         n1674ArtU1 = false ;
         A473FindArt = "" ;
         n473FindArt = false ;
         A104ArtTP3 = (short)(0) ;
         n104ArtTP3 = false ;
         A103ArtTP2 = (short)(0) ;
         n103ArtTP2 = false ;
         A102ArtTP1 = (short)(0) ;
         n102ArtTP1 = false ;
         A99ArtT3 = "" ;
         n99ArtT3 = false ;
         A98ArtT2 = "" ;
         n98ArtT2 = false ;
         A97ArtT1 = "" ;
         n97ArtT1 = false ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A254CliCodV", GXutil.ltrim( localUtil.ntoc( A254CliCodV, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A97ArtT1", GXutil.rtrim( A97ArtT1));
      httpContext.ajax_rsp_assign_attri("", false, "A98ArtT2", GXutil.rtrim( A98ArtT2));
      httpContext.ajax_rsp_assign_attri("", false, "A99ArtT3", GXutil.rtrim( A99ArtT3));
      httpContext.ajax_rsp_assign_attri("", false, "A102ArtTP1", GXutil.ltrim( localUtil.ntoc( A102ArtTP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A103ArtTP2", GXutil.ltrim( localUtil.ntoc( A103ArtTP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A104ArtTP3", GXutil.ltrim( localUtil.ntoc( A104ArtTP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A473FindArt", GXutil.rtrim( A473FindArt));
      httpContext.ajax_rsp_assign_attri("", false, "A1674ArtU1", GXutil.rtrim( A1674ArtU1));
      httpContext.ajax_rsp_assign_attri("", false, "A1675ArtU2", GXutil.rtrim( A1675ArtU2));
      httpContext.ajax_rsp_assign_attri("", false, "A1676ArtU3", GXutil.rtrim( A1676ArtU3));
      httpContext.ajax_rsp_assign_attri("", false, "A1677ArtUP1", GXutil.ltrim( localUtil.ntoc( A1677ArtUP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1678ArtUP2", GXutil.ltrim( localUtil.ntoc( A1678ArtUP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1679ArtUP3", GXutil.ltrim( localUtil.ntoc( A1679ArtUP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1680ArtMater", GXutil.rtrim( A1680ArtMater));
   }

   public void valid_Codsol( )
   {
      n3316CodSol = false ;
      n3317DscSol = false ;
      /* Using cursor T001246 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(44) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A3317DscSol = T001246_A3317DscSol[0] ;
      n3317DscSol = T001246_n3317DscSol[0] ;
      pr_default.close(44);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", GXutil.rtrim( A3317DscSol));
   }

   public void valid_Macprocod( )
   {
      n1514MacProCod = false ;
      /* Using cursor T001247 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A1515MacProDsc = T001247_A1515MacProDsc[0] ;
      pr_default.close(45);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
   }

   public void valid_Intcodf( )
   {
      n5362IntCodF = false ;
      n5363IntDscF = false ;
      /* Using cursor T001248 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5362IntCodF) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A5363IntDscF = T001248_A5363IntDscF[0] ;
      n5363IntDscF = T001248_n5363IntDscF[0] ;
      pr_default.close(46);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5363IntDscF", GXutil.rtrim( A5363IntDscF));
   }

   public void valid_Fam_cod( )
   {
      n8561Fam_Cod = false ;
      /* Using cursor T001273 */
      pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod)});
      if ( (pr_default.getStatus(71) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A8561Fam_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FAMTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FAM_COD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(71);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T001270 */
      pr_default.execute(68, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T001270_A766ProForDsc[0] ;
      pr_default.close(68);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORSER",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A254CliCodV',fld:'CLICODV',pic:'ZZZZZ9'},{av:'A97ArtT1',fld:'ARTT1',pic:''},{av:'A98ArtT2',fld:'ARTT2',pic:''},{av:'A99ArtT3',fld:'ARTT3',pic:''},{av:'A102ArtTP1',fld:'ARTTP1',pic:'ZZ9'},{av:'A103ArtTP2',fld:'ARTTP2',pic:'ZZ9'},{av:'A104ArtTP3',fld:'ARTTP3',pic:'ZZ9'},{av:'A400EmprCodV',fld:'EMPRCODV',pic:'@!'},{av:'A473FindArt',fld:'FINDART',pic:''},{av:'A1674ArtU1',fld:'ARTU1',pic:''},{av:'A1675ArtU2',fld:'ARTU2',pic:''},{av:'A1676ArtU3',fld:'ARTU3',pic:''},{av:'A1677ArtUP1',fld:'ARTUP1',pic:'ZZ9'},{av:'A1678ArtUP2',fld:'ARTUP2',pic:'ZZ9'},{av:'A1679ArtUP3',fld:'ARTUP3',pic:'ZZ9'},{av:'A1680ArtMater',fld:'ARTMATER',pic:''},{av:'A5337ForCodExt',fld:'FORCODEXT',pic:''},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A485ForFec',fld:'FORFEC',pic:''},{av:'A495ForUltMod',fld:'FORULTMOD',pic:''},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A626MatCod',fld:'MATCOD',pic:'ZZ9'},{av:'A496ForUltUti',fld:'FORULTUTI',pic:''},{av:'A492ForPreKgm',fld:'FORPREKGM',pic:'ZZZZZ9.999'},{av:'A493ForPreMtr',fld:'FORPREMTR',pic:'ZZZZZ9.999'},{av:'A491ForPreDef',fld:'FORPREDEF',pic:'@!'},{av:'A484ForCon',fld:'FORCON',pic:'9'},{av:'A1159ForUltLin',fld:'FORULTLIN',pic:'ZZZ9'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'A3007PrecioA',fld:'PRECIOA',pic:'ZZZZZZ9.999'},{av:'A3008PrecioM',fld:'PRECIOM',pic:'ZZZZZZ9.999'},{av:'A995ForTonal',fld:'FORTONAL',pic:''},{av:'A3315ForNumArc',fld:'FORNUMARC',pic:'ZZZZZZZ9'},{av:'A3316CodSol',fld:'CODSOL',pic:'ZZ9'},{av:'A3588ForEst',fld:'FOREST',pic:''},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'},{av:'A4380ForCosForm',fld:'FORCOSFORM',pic:'ZZZZ9.99999'},{av:'A4384ForTipArt',fld:'FORTIPART',pic:'ZZZ9'},{av:'A3560ForOpcCli',fld:'FOROPCCLI',pic:'@!'},{av:'A5362IntCodF',fld:'INTCODF',pic:'Z9'},{av:'A3558ForFecApr',fld:'FORFECAPR',pic:''},{av:'A5624ForUsrCod',fld:'FORUSRCOD',pic:'@!'},{av:'A5625ForFecHor',fld:'FORFECHOR',pic:'99/99/99 99:99'},{av:'A5626ForObsM',fld:'FOROBSM',pic:''},{av:'A5653ForPInc',fld:'FORPINC',pic:'ZZ9'},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A6379ForNomCli2',fld:'FORNOMCLI2',pic:''},{av:'A6608ForUsrCre',fld:'FORUSRCRE',pic:''},{av:'A6609ForFecCre',fld:'FORFECCRE',pic:'99/99/99 99:99'},{av:'A7029ForNomCli3',fld:'FORNOMCLI3',pic:''},{av:'A7537ForOpNum',fld:'FOROPNUM',pic:'Z9'},{av:'cmbForBlo'},{av:'A7781ForBlo',fld:'FORBLO',pic:'@!'},{av:'A8043ForTipT',fld:'FORTIPT',pic:'9'},{av:'A8561Fam_Cod',fld:'FAM_COD',pic:'ZZZ9'},{av:'A8777For_item1',fld:'FOR_ITEM1',pic:''},{av:'A9792For_Reo',fld:'FOR_REO',pic:''},{av:'A11041ForFecCtrl',fld:'FORFECCTRL',pic:'99/99/99 99:99'},{av:'A11042ForFecCtrf',fld:'FORFECCTRF',pic:'99/99/99 99:99'},{av:'A4224ForKgUTin',fld:'FORKGUTIN',pic:'ZZZZZZZ.ZZ'},{av:'A4225ForKgTTin',fld:'FORKGTTIN',pic:'ZZZZZZZ.ZZ'},{av:'A4226ForCosTTi',fld:'FORCOSTTI',pic:'ZZZZZZZZZZ.ZZ'},{av:'A3569UltEnsCod',fld:'ULTENSCOD',pic:'@!'},{av:'A3585ForPreFec',fld:'FORPREFEC',pic:''},{av:'A3586ForPreAnt',fld:'FORPREANT',pic:'ZZZZZ9.999'},{av:'A3587ForFecAnt',fld:'FORFECANT',pic:''},{av:'A11705For_item2',fld:'FOR_ITEM2',pic:''},{av:'A11706ForObs2',fld:'FOROBS2',pic:''},{av:'A12732ForObsFac',fld:'FOROBSFAC',pic:''},{av:'A13102ForLbTalao',fld:'FORLBTALAO',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A627MatDsc',fld:'MATDSC',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A3317DscSol',fld:'DSCSOL',pic:''},{av:'A3792ForConDsc',fld:'FORCONDSC',pic:''},{av:'A5363IntDscF',fld:'INTDSCF',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z254CliCodV'},{av:'Z97ArtT1'},{av:'Z98ArtT2'},{av:'Z99ArtT3'},{av:'Z102ArtTP1'},{av:'Z103ArtTP2'},{av:'Z104ArtTP3'},{av:'Z400EmprCodV'},{av:'Z473FindArt'},{av:'Z1674ArtU1'},{av:'Z1675ArtU2'},{av:'Z1676ArtU3'},{av:'Z1677ArtUP1'},{av:'Z1678ArtUP2'},{av:'Z1679ArtUP3'},{av:'Z1680ArtMater'},{av:'Z5337ForCodExt'},{av:'Z486ForNumCol'},{av:'Z1192ForNumCli'},{av:'Z1191ForNomCli'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z485ForFec'},{av:'Z495ForUltMod'},{av:'Z583IntCod'},{av:'Z626MatCod'},{av:'Z496ForUltUti'},{av:'Z492ForPreKgm'},{av:'Z493ForPreMtr'},{av:'Z491ForPreDef'},{av:'Z484ForCon'},{av:'Z1159ForUltLin'},{av:'Z2749ForPro'},{av:'Z2838ForRelBan'},{av:'Z3007PrecioA'},{av:'Z3008PrecioM'},{av:'Z995ForTonal'},{av:'Z3315ForNumArc'},{av:'Z3316CodSol'},{av:'Z3588ForEst'},{av:'Z1514MacProCod'},{av:'Z4339ForRGB'},{av:'Z4380ForCosForm'},{av:'Z4384ForTipArt'},{av:'Z3560ForOpcCli'},{av:'Z5362IntCodF'},{av:'Z3558ForFecApr'},{av:'Z5624ForUsrCod'},{av:'Z5625ForFecHor'},{av:'Z5626ForObsM'},{av:'Z5653ForPInc'},{av:'Z5742ForSerDsc'},{av:'Z6379ForNomCli2'},{av:'Z6608ForUsrCre'},{av:'Z6609ForFecCre'},{av:'Z7029ForNomCli3'},{av:'Z7537ForOpNum'},{av:'Z7781ForBlo'},{av:'Z8043ForTipT'},{av:'Z8561Fam_Cod'},{av:'Z8777For_item1'},{av:'Z9792For_Reo'},{av:'Z11041ForFecCtrl'},{av:'Z11042ForFecCtrf'},{av:'Z4224ForKgUTin'},{av:'Z4225ForKgTTin'},{av:'Z4226ForCosTTi'},{av:'Z3569UltEnsCod'},{av:'Z3585ForPreFec'},{av:'Z3586ForPreAnt'},{av:'Z3587ForFecAnt'},{av:'Z11705For_item2'},{av:'Z11706ForObs2'},{av:'Z12732ForObsFac'},{av:'Z13102ForLbTalao'},{av:'Z407EmprNom'},{av:'Z584IntDsc'},{av:'Z627MatDsc'},{av:'Z213BarSit'},{av:'Z1515MacProDsc'},{av:'Z3317DscSol'},{av:'Z3792ForConDsc'},{av:'Z5363IntDscF'},{av:'Z279CliNom'},{av:'Z832TipColDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_MATCOD","{handler:'valid_Matcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A626MatCod',fld:'MATCOD',pic:'ZZ9'},{av:'A627MatDsc',fld:'MATDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_MATCOD",",oparms:[{av:'A627MatDsc',fld:'MATDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORPREDEF","{handler:'valid_Forpredef',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORPREDEF",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FORCON","{handler:'valid_Forcon',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A484ForCon',fld:'FORCON',pic:'9'},{av:'A3792ForConDsc',fld:'FORCONDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FORCON",",oparms:[{av:'A3792ForConDsc',fld:'FORCONDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_EMPRCODV","{handler:'valid_Emprcodv',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_EMPRCODV",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_CLICODV","{handler:'valid_Clicodv',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A254CliCodV',fld:'CLICODV',pic:'ZZZZZ9'},{av:'A400EmprCodV',fld:'EMPRCODV',pic:'@!'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A97ArtT1',fld:'ARTT1',pic:''},{av:'A98ArtT2',fld:'ARTT2',pic:''},{av:'A99ArtT3',fld:'ARTT3',pic:''},{av:'A102ArtTP1',fld:'ARTTP1',pic:'ZZ9'},{av:'A103ArtTP2',fld:'ARTTP2',pic:'ZZ9'},{av:'A104ArtTP3',fld:'ARTTP3',pic:'ZZ9'},{av:'A473FindArt',fld:'FINDART',pic:''},{av:'A1674ArtU1',fld:'ARTU1',pic:''},{av:'A1675ArtU2',fld:'ARTU2',pic:''},{av:'A1676ArtU3',fld:'ARTU3',pic:''},{av:'A1677ArtUP1',fld:'ARTUP1',pic:'ZZ9'},{av:'A1678ArtUP2',fld:'ARTUP2',pic:'ZZ9'},{av:'A1679ArtUP3',fld:'ARTUP3',pic:'ZZ9'},{av:'A1680ArtMater',fld:'ARTMATER',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_CLICODV",",oparms:[{av:'A254CliCodV',fld:'CLICODV',pic:'ZZZZZ9'},{av:'A97ArtT1',fld:'ARTT1',pic:''},{av:'A98ArtT2',fld:'ARTT2',pic:''},{av:'A99ArtT3',fld:'ARTT3',pic:''},{av:'A102ArtTP1',fld:'ARTTP1',pic:'ZZ9'},{av:'A103ArtTP2',fld:'ARTTP2',pic:'ZZ9'},{av:'A104ArtTP3',fld:'ARTTP3',pic:'ZZ9'},{av:'A473FindArt',fld:'FINDART',pic:''},{av:'A1674ArtU1',fld:'ARTU1',pic:''},{av:'A1675ArtU2',fld:'ARTU2',pic:''},{av:'A1676ArtU3',fld:'ARTU3',pic:''},{av:'A1677ArtUP1',fld:'ARTUP1',pic:'ZZ9'},{av:'A1678ArtUP2',fld:'ARTUP2',pic:'ZZ9'},{av:'A1679ArtUP3',fld:'ARTUP3',pic:'ZZ9'},{av:'A1680ArtMater',fld:'ARTMATER',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_CODSOL","{handler:'valid_Codsol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3316CodSol',fld:'CODSOL',pic:'ZZ9'},{av:'A3317DscSol',fld:'DSCSOL',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_CODSOL",",oparms:[{av:'A3317DscSol',fld:'DSCSOL',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_MACPROCOD","{handler:'valid_Macprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_MACPROCOD",",oparms:[{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_INTCODF","{handler:'valid_Intcodf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5362IntCodF',fld:'INTCODF',pic:'Z9'},{av:'A5363IntDscF',fld:'INTDSCF',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_INTCODF",",oparms:[{av:'A5363IntDscF',fld:'INTDSCF',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_FAM_COD","{handler:'valid_Fam_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8561Fam_Cod',fld:'FAM_COD',pic:'ZZZ9'},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_FAM_COD",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_PROFORL","{handler:'valid_Proforl',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_PROFORL",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Proforh2o',iparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A2749ForPro',fld:'FORPRO',pic:''}]}");
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
      pr_default.close(68);
      pr_default.close(38);
      pr_default.close(37);
      pr_default.close(70);
      pr_default.close(41);
      pr_default.close(42);
      pr_default.close(39);
      pr_default.close(40);
      pr_default.close(45);
      pr_default.close(44);
      pr_default.close(43);
      pr_default.close(46);
      pr_default.close(71);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z5337ForCodExt = "" ;
      Z1191ForNomCli = "" ;
      Z485ForFec = GXutil.nullDate() ;
      Z495ForUltMod = GXutil.nullDate() ;
      Z496ForUltUti = GXutil.nullDate() ;
      Z492ForPreKgm = DecimalUtil.ZERO ;
      Z493ForPreMtr = DecimalUtil.ZERO ;
      Z491ForPreDef = "" ;
      Z2749ForPro = "" ;
      Z2838ForRelBan = DecimalUtil.ZERO ;
      Z3007PrecioA = DecimalUtil.ZERO ;
      Z3008PrecioM = DecimalUtil.ZERO ;
      Z995ForTonal = "" ;
      Z3588ForEst = "" ;
      Z4380ForCosForm = DecimalUtil.ZERO ;
      Z3560ForOpcCli = "" ;
      Z3558ForFecApr = GXutil.nullDate() ;
      Z5624ForUsrCod = "" ;
      Z5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      Z5626ForObsM = "" ;
      Z5742ForSerDsc = "" ;
      Z6379ForNomCli2 = "" ;
      Z6608ForUsrCre = "" ;
      Z6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      Z7029ForNomCli3 = "" ;
      Z7781ForBlo = "" ;
      Z8777For_item1 = "" ;
      Z9792For_Reo = "" ;
      Z11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      Z11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      Z4224ForKgUTin = DecimalUtil.ZERO ;
      Z4225ForKgTTin = DecimalUtil.ZERO ;
      Z4226ForCosTTi = DecimalUtil.ZERO ;
      Z3569UltEnsCod = "" ;
      Z3585ForPreFec = GXutil.nullDate() ;
      Z3586ForPreAnt = DecimalUtil.ZERO ;
      Z3587ForFecAnt = GXutil.nullDate() ;
      Z11705For_item2 = "" ;
      Z11706ForObs2 = "" ;
      Z12732ForObsFac = "" ;
      Z13102ForLbTalao = "" ;
      Z130BarCodPar = "" ;
      Z1514MacProCod = "" ;
      Z6549ProForFR = "" ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z9707ProForMq = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1514MacProCod = "" ;
      A764ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A2749ForPro = "" ;
      A7781ForBlo = "" ;
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
      A494ForSer = "" ;
      lblTextblock4_Jsonclick = "" ;
      A482ForColNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5337ForCodExt = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1191ForNomCli = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A485ForFec = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A495ForUltMod = GXutil.nullDate() ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A584IntDsc = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A627MatDsc = "" ;
      lblTextblock21_Jsonclick = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      lblTextblock22_Jsonclick = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A491ForPreDef = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock27_Jsonclick = "" ;
      A97ArtT1 = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A98ArtT2 = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A99ArtT3 = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A1674ArtU1 = "" ;
      lblTextblock34_Jsonclick = "" ;
      A1675ArtU2 = "" ;
      lblTextblock35_Jsonclick = "" ;
      A1676ArtU3 = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      A1680ArtMater = "" ;
      lblTextblock40_Jsonclick = "" ;
      A473FindArt = "" ;
      lblTextblock41_Jsonclick = "" ;
      A400EmprCodV = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      A3007PrecioA = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A3008PrecioM = DecimalUtil.ZERO ;
      lblTextblock48_Jsonclick = "" ;
      A995ForTonal = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      A3317DscSol = "" ;
      lblTextblock52_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock53_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock54_Jsonclick = "" ;
      A3792ForConDsc = "" ;
      lblTextblock55_Jsonclick = "" ;
      A3588ForEst = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      A1515MacProDsc = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      A3560ForOpcCli = "" ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      A5363IntDscF = "" ;
      lblTextblock64_Jsonclick = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      lblTextblock65_Jsonclick = "" ;
      A5624ForUsrCod = "" ;
      lblTextblock66_Jsonclick = "" ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock67_Jsonclick = "" ;
      A5626ForObsM = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock70_Jsonclick = "" ;
      A6379ForNomCli2 = "" ;
      lblTextblock71_Jsonclick = "" ;
      A6608ForUsrCre = "" ;
      lblTextblock72_Jsonclick = "" ;
      A6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock73_Jsonclick = "" ;
      A7029ForNomCli3 = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock75_Jsonclick = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      lblTextblock78_Jsonclick = "" ;
      A8777For_item1 = "" ;
      lblTextblock79_Jsonclick = "" ;
      A9792For_Reo = "" ;
      lblTextblock80_Jsonclick = "" ;
      A11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock81_Jsonclick = "" ;
      A11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock82_Jsonclick = "" ;
      A4224ForKgUTin = DecimalUtil.ZERO ;
      lblTextblock83_Jsonclick = "" ;
      A4225ForKgTTin = DecimalUtil.ZERO ;
      lblTextblock84_Jsonclick = "" ;
      A4226ForCosTTi = DecimalUtil.ZERO ;
      lblTextblock85_Jsonclick = "" ;
      A3569UltEnsCod = "" ;
      lblTextblock86_Jsonclick = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      lblTextblock87_Jsonclick = "" ;
      A3586ForPreAnt = DecimalUtil.ZERO ;
      lblTextblock88_Jsonclick = "" ;
      A3587ForFecAnt = GXutil.nullDate() ;
      lblTextblock89_Jsonclick = "" ;
      A11705For_item2 = "" ;
      lblTextblock90_Jsonclick = "" ;
      A11706ForObs2 = "" ;
      lblTextblock91_Jsonclick = "" ;
      A12732ForObsFac = "" ;
      lblTextblock92_Jsonclick = "" ;
      A13102ForLbTalao = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode154 = "" ;
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
      sMode47 = "" ;
      GXCCtl = "" ;
      A766ProForDsc = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A9707ProForMq = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      Z584IntDsc = "" ;
      Z627MatDsc = "" ;
      Z3792ForConDsc = "" ;
      Z3317DscSol = "" ;
      Z1515MacProDsc = "" ;
      Z5363IntDscF = "" ;
      T001220_A494ForSer = new String[] {""} ;
      T001220_n494ForSer = new boolean[] {false} ;
      T001220_A482ForColNom = new String[] {""} ;
      T001220_n482ForColNom = new boolean[] {false} ;
      T001220_A483ForColNum = new int[1] ;
      T001220_n483ForColNum = new boolean[] {false} ;
      T001220_A5337ForCodExt = new String[] {""} ;
      T001220_n5337ForCodExt = new boolean[] {false} ;
      T001220_A1192ForNumCli = new int[1] ;
      T001220_n1192ForNumCli = new boolean[] {false} ;
      T001220_A1191ForNomCli = new String[] {""} ;
      T001220_n1191ForNomCli = new boolean[] {false} ;
      T001220_A213BarSit = new byte[1] ;
      T001220_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n485ForFec = new boolean[] {false} ;
      T001220_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n495ForUltMod = new boolean[] {false} ;
      T001220_A584IntDsc = new String[] {""} ;
      T001220_n584IntDsc = new boolean[] {false} ;
      T001220_A627MatDsc = new String[] {""} ;
      T001220_n627MatDsc = new boolean[] {false} ;
      T001220_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n496ForUltUti = new boolean[] {false} ;
      T001220_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n492ForPreKgm = new boolean[] {false} ;
      T001220_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n493ForPreMtr = new boolean[] {false} ;
      T001220_A491ForPreDef = new String[] {""} ;
      T001220_n491ForPreDef = new boolean[] {false} ;
      T001220_A407EmprNom = new String[] {""} ;
      T001220_n407EmprNom = new boolean[] {false} ;
      T001220_A1159ForUltLin = new short[1] ;
      T001220_n1159ForUltLin = new boolean[] {false} ;
      T001220_A2749ForPro = new String[] {""} ;
      T001220_n2749ForPro = new boolean[] {false} ;
      T001220_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n2838ForRelBan = new boolean[] {false} ;
      T001220_A3007PrecioA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n3007PrecioA = new boolean[] {false} ;
      T001220_A3008PrecioM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n3008PrecioM = new boolean[] {false} ;
      T001220_A995ForTonal = new String[] {""} ;
      T001220_n995ForTonal = new boolean[] {false} ;
      T001220_A3315ForNumArc = new int[1] ;
      T001220_n3315ForNumArc = new boolean[] {false} ;
      T001220_A3317DscSol = new String[] {""} ;
      T001220_n3317DscSol = new boolean[] {false} ;
      T001220_A279CliNom = new String[] {""} ;
      T001220_A832TipColDsc = new String[] {""} ;
      T001220_n832TipColDsc = new boolean[] {false} ;
      T001220_A3792ForConDsc = new String[] {""} ;
      T001220_n3792ForConDsc = new boolean[] {false} ;
      T001220_A3588ForEst = new String[] {""} ;
      T001220_n3588ForEst = new boolean[] {false} ;
      T001220_A1515MacProDsc = new String[] {""} ;
      T001220_A4339ForRGB = new long[1] ;
      T001220_n4339ForRGB = new boolean[] {false} ;
      T001220_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n4380ForCosForm = new boolean[] {false} ;
      T001220_A4384ForTipArt = new short[1] ;
      T001220_n4384ForTipArt = new boolean[] {false} ;
      T001220_A3560ForOpcCli = new String[] {""} ;
      T001220_n3560ForOpcCli = new boolean[] {false} ;
      T001220_A5363IntDscF = new String[] {""} ;
      T001220_n5363IntDscF = new boolean[] {false} ;
      T001220_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n3558ForFecApr = new boolean[] {false} ;
      T001220_A5624ForUsrCod = new String[] {""} ;
      T001220_n5624ForUsrCod = new boolean[] {false} ;
      T001220_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n5625ForFecHor = new boolean[] {false} ;
      T001220_A5626ForObsM = new String[] {""} ;
      T001220_n5626ForObsM = new boolean[] {false} ;
      T001220_A5653ForPInc = new short[1] ;
      T001220_n5653ForPInc = new boolean[] {false} ;
      T001220_A5742ForSerDsc = new String[] {""} ;
      T001220_n5742ForSerDsc = new boolean[] {false} ;
      T001220_A6379ForNomCli2 = new String[] {""} ;
      T001220_n6379ForNomCli2 = new boolean[] {false} ;
      T001220_A6608ForUsrCre = new String[] {""} ;
      T001220_n6608ForUsrCre = new boolean[] {false} ;
      T001220_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n6609ForFecCre = new boolean[] {false} ;
      T001220_A7029ForNomCli3 = new String[] {""} ;
      T001220_n7029ForNomCli3 = new boolean[] {false} ;
      T001220_A7537ForOpNum = new byte[1] ;
      T001220_n7537ForOpNum = new boolean[] {false} ;
      T001220_A7781ForBlo = new String[] {""} ;
      T001220_n7781ForBlo = new boolean[] {false} ;
      T001220_A8043ForTipT = new byte[1] ;
      T001220_n8043ForTipT = new boolean[] {false} ;
      T001220_A8777For_item1 = new String[] {""} ;
      T001220_n8777For_item1 = new boolean[] {false} ;
      T001220_A9792For_Reo = new String[] {""} ;
      T001220_n9792For_Reo = new boolean[] {false} ;
      T001220_A11041ForFecCtrl = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n11041ForFecCtrl = new boolean[] {false} ;
      T001220_A11042ForFecCtrf = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n11042ForFecCtrf = new boolean[] {false} ;
      T001220_A4224ForKgUTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n4224ForKgUTin = new boolean[] {false} ;
      T001220_A4225ForKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n4225ForKgTTin = new boolean[] {false} ;
      T001220_A4226ForCosTTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n4226ForCosTTi = new boolean[] {false} ;
      T001220_A3569UltEnsCod = new String[] {""} ;
      T001220_n3569UltEnsCod = new boolean[] {false} ;
      T001220_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n3585ForPreFec = new boolean[] {false} ;
      T001220_A3586ForPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001220_n3586ForPreAnt = new boolean[] {false} ;
      T001220_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T001220_n3587ForFecAnt = new boolean[] {false} ;
      T001220_A11705For_item2 = new String[] {""} ;
      T001220_n11705For_item2 = new boolean[] {false} ;
      T001220_A11706ForObs2 = new String[] {""} ;
      T001220_n11706ForObs2 = new boolean[] {false} ;
      T001220_A12732ForObsFac = new String[] {""} ;
      T001220_n12732ForObsFac = new boolean[] {false} ;
      T001220_A13102ForLbTalao = new String[] {""} ;
      T001220_n13102ForLbTalao = new boolean[] {false} ;
      T001220_A396EmprCod = new String[] {""} ;
      T001220_A252CliCod = new int[1] ;
      T001220_n252CliCod = new boolean[] {false} ;
      T001220_A486ForNumCol = new int[1] ;
      T001220_A583IntCod = new byte[1] ;
      T001220_A626MatCod = new short[1] ;
      T001220_A831TipColCod = new byte[1] ;
      T001220_n831TipColCod = new boolean[] {false} ;
      T001220_A129BarCod = new int[1] ;
      T001220_n129BarCod = new boolean[] {false} ;
      T001220_A132BarCodReo = new byte[1] ;
      T001220_n132BarCodReo = new boolean[] {false} ;
      T001220_A130BarCodPar = new String[] {""} ;
      T001220_n130BarCodPar = new boolean[] {false} ;
      T001220_A1514MacProCod = new String[] {""} ;
      T001220_n1514MacProCod = new boolean[] {false} ;
      T001220_A3316CodSol = new short[1] ;
      T001220_n3316CodSol = new boolean[] {false} ;
      T001220_A484ForCon = new byte[1] ;
      T001220_A5362IntCodF = new byte[1] ;
      T001220_n5362IntCodF = new boolean[] {false} ;
      T001220_A8561Fam_Cod = new short[1] ;
      T001220_n8561Fam_Cod = new boolean[] {false} ;
      T00127_A407EmprNom = new String[] {""} ;
      T00127_n407EmprNom = new boolean[] {false} ;
      T00129_A396EmprCod = new String[] {""} ;
      T001210_A584IntDsc = new String[] {""} ;
      T001210_n584IntDsc = new boolean[] {false} ;
      T001211_A627MatDsc = new String[] {""} ;
      T001211_n627MatDsc = new boolean[] {false} ;
      T001213_A213BarSit = new byte[1] ;
      T001214_A1515MacProDsc = new String[] {""} ;
      T001215_A3317DscSol = new String[] {""} ;
      T001215_n3317DscSol = new boolean[] {false} ;
      T001216_A3792ForConDsc = new String[] {""} ;
      T001216_n3792ForConDsc = new boolean[] {false} ;
      T001217_A5363IntDscF = new String[] {""} ;
      T001217_n5363IntDscF = new boolean[] {false} ;
      T001218_A396EmprCod = new String[] {""} ;
      T00128_A279CliNom = new String[] {""} ;
      T001212_A832TipColDsc = new String[] {""} ;
      T001212_n832TipColDsc = new boolean[] {false} ;
      T001221_A407EmprNom = new String[] {""} ;
      T001221_n407EmprNom = new boolean[] {false} ;
      T001222_A396EmprCod = new String[] {""} ;
      T001223_A584IntDsc = new String[] {""} ;
      T001223_n584IntDsc = new boolean[] {false} ;
      T001224_A627MatDsc = new String[] {""} ;
      T001224_n627MatDsc = new boolean[] {false} ;
      T001225_A213BarSit = new byte[1] ;
      T001226_A1515MacProDsc = new String[] {""} ;
      T001227_A3317DscSol = new String[] {""} ;
      T001227_n3317DscSol = new boolean[] {false} ;
      T001228_A3792ForConDsc = new String[] {""} ;
      T001228_n3792ForConDsc = new boolean[] {false} ;
      T001229_A5363IntDscF = new String[] {""} ;
      T001229_n5363IntDscF = new boolean[] {false} ;
      T001230_A396EmprCod = new String[] {""} ;
      T001231_A279CliNom = new String[] {""} ;
      T001232_A832TipColDsc = new String[] {""} ;
      T001232_n832TipColDsc = new boolean[] {false} ;
      T001233_A396EmprCod = new String[] {""} ;
      T001233_A252CliCod = new int[1] ;
      T001233_n252CliCod = new boolean[] {false} ;
      T001233_A494ForSer = new String[] {""} ;
      T001233_n494ForSer = new boolean[] {false} ;
      T001233_A482ForColNom = new String[] {""} ;
      T001233_n482ForColNom = new boolean[] {false} ;
      T001233_A483ForColNum = new int[1] ;
      T001233_n483ForColNum = new boolean[] {false} ;
      T001233_A831TipColCod = new byte[1] ;
      T001233_n831TipColCod = new boolean[] {false} ;
      T00126_A494ForSer = new String[] {""} ;
      T00126_n494ForSer = new boolean[] {false} ;
      T00126_A482ForColNom = new String[] {""} ;
      T00126_n482ForColNom = new boolean[] {false} ;
      T00126_A483ForColNum = new int[1] ;
      T00126_n483ForColNum = new boolean[] {false} ;
      T00126_A5337ForCodExt = new String[] {""} ;
      T00126_n5337ForCodExt = new boolean[] {false} ;
      T00126_A1192ForNumCli = new int[1] ;
      T00126_n1192ForNumCli = new boolean[] {false} ;
      T00126_A1191ForNomCli = new String[] {""} ;
      T00126_n1191ForNomCli = new boolean[] {false} ;
      T00126_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n485ForFec = new boolean[] {false} ;
      T00126_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n495ForUltMod = new boolean[] {false} ;
      T00126_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n496ForUltUti = new boolean[] {false} ;
      T00126_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n492ForPreKgm = new boolean[] {false} ;
      T00126_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n493ForPreMtr = new boolean[] {false} ;
      T00126_A491ForPreDef = new String[] {""} ;
      T00126_n491ForPreDef = new boolean[] {false} ;
      T00126_A1159ForUltLin = new short[1] ;
      T00126_n1159ForUltLin = new boolean[] {false} ;
      T00126_A2749ForPro = new String[] {""} ;
      T00126_n2749ForPro = new boolean[] {false} ;
      T00126_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n2838ForRelBan = new boolean[] {false} ;
      T00126_A3007PrecioA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n3007PrecioA = new boolean[] {false} ;
      T00126_A3008PrecioM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n3008PrecioM = new boolean[] {false} ;
      T00126_A995ForTonal = new String[] {""} ;
      T00126_n995ForTonal = new boolean[] {false} ;
      T00126_A3315ForNumArc = new int[1] ;
      T00126_n3315ForNumArc = new boolean[] {false} ;
      T00126_A3588ForEst = new String[] {""} ;
      T00126_n3588ForEst = new boolean[] {false} ;
      T00126_A4339ForRGB = new long[1] ;
      T00126_n4339ForRGB = new boolean[] {false} ;
      T00126_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n4380ForCosForm = new boolean[] {false} ;
      T00126_A4384ForTipArt = new short[1] ;
      T00126_n4384ForTipArt = new boolean[] {false} ;
      T00126_A3560ForOpcCli = new String[] {""} ;
      T00126_n3560ForOpcCli = new boolean[] {false} ;
      T00126_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n3558ForFecApr = new boolean[] {false} ;
      T00126_A5624ForUsrCod = new String[] {""} ;
      T00126_n5624ForUsrCod = new boolean[] {false} ;
      T00126_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n5625ForFecHor = new boolean[] {false} ;
      T00126_A5626ForObsM = new String[] {""} ;
      T00126_n5626ForObsM = new boolean[] {false} ;
      T00126_A5653ForPInc = new short[1] ;
      T00126_n5653ForPInc = new boolean[] {false} ;
      T00126_A5742ForSerDsc = new String[] {""} ;
      T00126_n5742ForSerDsc = new boolean[] {false} ;
      T00126_A6379ForNomCli2 = new String[] {""} ;
      T00126_n6379ForNomCli2 = new boolean[] {false} ;
      T00126_A6608ForUsrCre = new String[] {""} ;
      T00126_n6608ForUsrCre = new boolean[] {false} ;
      T00126_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n6609ForFecCre = new boolean[] {false} ;
      T00126_A7029ForNomCli3 = new String[] {""} ;
      T00126_n7029ForNomCli3 = new boolean[] {false} ;
      T00126_A7537ForOpNum = new byte[1] ;
      T00126_n7537ForOpNum = new boolean[] {false} ;
      T00126_A7781ForBlo = new String[] {""} ;
      T00126_n7781ForBlo = new boolean[] {false} ;
      T00126_A8043ForTipT = new byte[1] ;
      T00126_n8043ForTipT = new boolean[] {false} ;
      T00126_A8777For_item1 = new String[] {""} ;
      T00126_n8777For_item1 = new boolean[] {false} ;
      T00126_A9792For_Reo = new String[] {""} ;
      T00126_n9792For_Reo = new boolean[] {false} ;
      T00126_A11041ForFecCtrl = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n11041ForFecCtrl = new boolean[] {false} ;
      T00126_A11042ForFecCtrf = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n11042ForFecCtrf = new boolean[] {false} ;
      T00126_A4224ForKgUTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n4224ForKgUTin = new boolean[] {false} ;
      T00126_A4225ForKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n4225ForKgTTin = new boolean[] {false} ;
      T00126_A4226ForCosTTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n4226ForCosTTi = new boolean[] {false} ;
      T00126_A3569UltEnsCod = new String[] {""} ;
      T00126_n3569UltEnsCod = new boolean[] {false} ;
      T00126_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n3585ForPreFec = new boolean[] {false} ;
      T00126_A3586ForPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00126_n3586ForPreAnt = new boolean[] {false} ;
      T00126_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00126_n3587ForFecAnt = new boolean[] {false} ;
      T00126_A11705For_item2 = new String[] {""} ;
      T00126_n11705For_item2 = new boolean[] {false} ;
      T00126_A11706ForObs2 = new String[] {""} ;
      T00126_n11706ForObs2 = new boolean[] {false} ;
      T00126_A12732ForObsFac = new String[] {""} ;
      T00126_n12732ForObsFac = new boolean[] {false} ;
      T00126_A13102ForLbTalao = new String[] {""} ;
      T00126_n13102ForLbTalao = new boolean[] {false} ;
      T00126_A396EmprCod = new String[] {""} ;
      T00126_A252CliCod = new int[1] ;
      T00126_n252CliCod = new boolean[] {false} ;
      T00126_A486ForNumCol = new int[1] ;
      T00126_A583IntCod = new byte[1] ;
      T00126_A626MatCod = new short[1] ;
      T00126_A831TipColCod = new byte[1] ;
      T00126_n831TipColCod = new boolean[] {false} ;
      T00126_A129BarCod = new int[1] ;
      T00126_n129BarCod = new boolean[] {false} ;
      T00126_A132BarCodReo = new byte[1] ;
      T00126_n132BarCodReo = new boolean[] {false} ;
      T00126_A130BarCodPar = new String[] {""} ;
      T00126_n130BarCodPar = new boolean[] {false} ;
      T00126_A1514MacProCod = new String[] {""} ;
      T00126_n1514MacProCod = new boolean[] {false} ;
      T00126_A3316CodSol = new short[1] ;
      T00126_n3316CodSol = new boolean[] {false} ;
      T00126_A484ForCon = new byte[1] ;
      T00126_A5362IntCodF = new byte[1] ;
      T00126_n5362IntCodF = new boolean[] {false} ;
      T00126_A8561Fam_Cod = new short[1] ;
      T00126_n8561Fam_Cod = new boolean[] {false} ;
      T001234_A396EmprCod = new String[] {""} ;
      T001234_A252CliCod = new int[1] ;
      T001234_n252CliCod = new boolean[] {false} ;
      T001234_A494ForSer = new String[] {""} ;
      T001234_n494ForSer = new boolean[] {false} ;
      T001234_A482ForColNom = new String[] {""} ;
      T001234_n482ForColNom = new boolean[] {false} ;
      T001234_A483ForColNum = new int[1] ;
      T001234_n483ForColNum = new boolean[] {false} ;
      T001234_A831TipColCod = new byte[1] ;
      T001234_n831TipColCod = new boolean[] {false} ;
      T001235_A396EmprCod = new String[] {""} ;
      T001235_A252CliCod = new int[1] ;
      T001235_n252CliCod = new boolean[] {false} ;
      T001235_A494ForSer = new String[] {""} ;
      T001235_n494ForSer = new boolean[] {false} ;
      T001235_A482ForColNom = new String[] {""} ;
      T001235_n482ForColNom = new boolean[] {false} ;
      T001235_A483ForColNum = new int[1] ;
      T001235_n483ForColNum = new boolean[] {false} ;
      T001235_A831TipColCod = new byte[1] ;
      T001235_n831TipColCod = new boolean[] {false} ;
      T00125_A494ForSer = new String[] {""} ;
      T00125_n494ForSer = new boolean[] {false} ;
      T00125_A482ForColNom = new String[] {""} ;
      T00125_n482ForColNom = new boolean[] {false} ;
      T00125_A483ForColNum = new int[1] ;
      T00125_n483ForColNum = new boolean[] {false} ;
      T00125_A5337ForCodExt = new String[] {""} ;
      T00125_n5337ForCodExt = new boolean[] {false} ;
      T00125_A1192ForNumCli = new int[1] ;
      T00125_n1192ForNumCli = new boolean[] {false} ;
      T00125_A1191ForNomCli = new String[] {""} ;
      T00125_n1191ForNomCli = new boolean[] {false} ;
      T00125_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n485ForFec = new boolean[] {false} ;
      T00125_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n495ForUltMod = new boolean[] {false} ;
      T00125_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n496ForUltUti = new boolean[] {false} ;
      T00125_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n492ForPreKgm = new boolean[] {false} ;
      T00125_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n493ForPreMtr = new boolean[] {false} ;
      T00125_A491ForPreDef = new String[] {""} ;
      T00125_n491ForPreDef = new boolean[] {false} ;
      T00125_A1159ForUltLin = new short[1] ;
      T00125_n1159ForUltLin = new boolean[] {false} ;
      T00125_A2749ForPro = new String[] {""} ;
      T00125_n2749ForPro = new boolean[] {false} ;
      T00125_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n2838ForRelBan = new boolean[] {false} ;
      T00125_A3007PrecioA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n3007PrecioA = new boolean[] {false} ;
      T00125_A3008PrecioM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n3008PrecioM = new boolean[] {false} ;
      T00125_A995ForTonal = new String[] {""} ;
      T00125_n995ForTonal = new boolean[] {false} ;
      T00125_A3315ForNumArc = new int[1] ;
      T00125_n3315ForNumArc = new boolean[] {false} ;
      T00125_A3588ForEst = new String[] {""} ;
      T00125_n3588ForEst = new boolean[] {false} ;
      T00125_A4339ForRGB = new long[1] ;
      T00125_n4339ForRGB = new boolean[] {false} ;
      T00125_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n4380ForCosForm = new boolean[] {false} ;
      T00125_A4384ForTipArt = new short[1] ;
      T00125_n4384ForTipArt = new boolean[] {false} ;
      T00125_A3560ForOpcCli = new String[] {""} ;
      T00125_n3560ForOpcCli = new boolean[] {false} ;
      T00125_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n3558ForFecApr = new boolean[] {false} ;
      T00125_A5624ForUsrCod = new String[] {""} ;
      T00125_n5624ForUsrCod = new boolean[] {false} ;
      T00125_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n5625ForFecHor = new boolean[] {false} ;
      T00125_A5626ForObsM = new String[] {""} ;
      T00125_n5626ForObsM = new boolean[] {false} ;
      T00125_A5653ForPInc = new short[1] ;
      T00125_n5653ForPInc = new boolean[] {false} ;
      T00125_A5742ForSerDsc = new String[] {""} ;
      T00125_n5742ForSerDsc = new boolean[] {false} ;
      T00125_A6379ForNomCli2 = new String[] {""} ;
      T00125_n6379ForNomCli2 = new boolean[] {false} ;
      T00125_A6608ForUsrCre = new String[] {""} ;
      T00125_n6608ForUsrCre = new boolean[] {false} ;
      T00125_A6609ForFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n6609ForFecCre = new boolean[] {false} ;
      T00125_A7029ForNomCli3 = new String[] {""} ;
      T00125_n7029ForNomCli3 = new boolean[] {false} ;
      T00125_A7537ForOpNum = new byte[1] ;
      T00125_n7537ForOpNum = new boolean[] {false} ;
      T00125_A7781ForBlo = new String[] {""} ;
      T00125_n7781ForBlo = new boolean[] {false} ;
      T00125_A8043ForTipT = new byte[1] ;
      T00125_n8043ForTipT = new boolean[] {false} ;
      T00125_A8777For_item1 = new String[] {""} ;
      T00125_n8777For_item1 = new boolean[] {false} ;
      T00125_A9792For_Reo = new String[] {""} ;
      T00125_n9792For_Reo = new boolean[] {false} ;
      T00125_A11041ForFecCtrl = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n11041ForFecCtrl = new boolean[] {false} ;
      T00125_A11042ForFecCtrf = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n11042ForFecCtrf = new boolean[] {false} ;
      T00125_A4224ForKgUTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n4224ForKgUTin = new boolean[] {false} ;
      T00125_A4225ForKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n4225ForKgTTin = new boolean[] {false} ;
      T00125_A4226ForCosTTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n4226ForCosTTi = new boolean[] {false} ;
      T00125_A3569UltEnsCod = new String[] {""} ;
      T00125_n3569UltEnsCod = new boolean[] {false} ;
      T00125_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n3585ForPreFec = new boolean[] {false} ;
      T00125_A3586ForPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00125_n3586ForPreAnt = new boolean[] {false} ;
      T00125_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00125_n3587ForFecAnt = new boolean[] {false} ;
      T00125_A11705For_item2 = new String[] {""} ;
      T00125_n11705For_item2 = new boolean[] {false} ;
      T00125_A11706ForObs2 = new String[] {""} ;
      T00125_n11706ForObs2 = new boolean[] {false} ;
      T00125_A12732ForObsFac = new String[] {""} ;
      T00125_n12732ForObsFac = new boolean[] {false} ;
      T00125_A13102ForLbTalao = new String[] {""} ;
      T00125_n13102ForLbTalao = new boolean[] {false} ;
      T00125_A396EmprCod = new String[] {""} ;
      T00125_A252CliCod = new int[1] ;
      T00125_n252CliCod = new boolean[] {false} ;
      T00125_A486ForNumCol = new int[1] ;
      T00125_A583IntCod = new byte[1] ;
      T00125_A626MatCod = new short[1] ;
      T00125_A831TipColCod = new byte[1] ;
      T00125_n831TipColCod = new boolean[] {false} ;
      T00125_A129BarCod = new int[1] ;
      T00125_n129BarCod = new boolean[] {false} ;
      T00125_A132BarCodReo = new byte[1] ;
      T00125_n132BarCodReo = new boolean[] {false} ;
      T00125_A130BarCodPar = new String[] {""} ;
      T00125_n130BarCodPar = new boolean[] {false} ;
      T00125_A1514MacProCod = new String[] {""} ;
      T00125_n1514MacProCod = new boolean[] {false} ;
      T00125_A3316CodSol = new short[1] ;
      T00125_n3316CodSol = new boolean[] {false} ;
      T00125_A484ForCon = new byte[1] ;
      T00125_A5362IntCodF = new byte[1] ;
      T00125_n5362IntCodF = new boolean[] {false} ;
      T00125_A8561Fam_Cod = new short[1] ;
      T00125_n8561Fam_Cod = new boolean[] {false} ;
      T001239_A407EmprNom = new String[] {""} ;
      T001239_n407EmprNom = new boolean[] {false} ;
      T001240_A279CliNom = new String[] {""} ;
      T001241_A832TipColDsc = new String[] {""} ;
      T001241_n832TipColDsc = new boolean[] {false} ;
      T001242_A213BarSit = new byte[1] ;
      T001243_A584IntDsc = new String[] {""} ;
      T001243_n584IntDsc = new boolean[] {false} ;
      T001244_A627MatDsc = new String[] {""} ;
      T001244_n627MatDsc = new boolean[] {false} ;
      T001245_A3792ForConDsc = new String[] {""} ;
      T001245_n3792ForConDsc = new boolean[] {false} ;
      T001246_A3317DscSol = new String[] {""} ;
      T001246_n3317DscSol = new boolean[] {false} ;
      T001247_A1515MacProDsc = new String[] {""} ;
      T001248_A5363IntDscF = new String[] {""} ;
      T001248_n5363IntDscF = new boolean[] {false} ;
      T001249_A396EmprCod = new String[] {""} ;
      T001249_A252CliCod = new int[1] ;
      T001249_n252CliCod = new boolean[] {false} ;
      T001249_A494ForSer = new String[] {""} ;
      T001249_n494ForSer = new boolean[] {false} ;
      T001249_A482ForColNom = new String[] {""} ;
      T001249_n482ForColNom = new boolean[] {false} ;
      T001249_A483ForColNum = new int[1] ;
      T001249_n483ForColNum = new boolean[] {false} ;
      T001249_A831TipColCod = new byte[1] ;
      T001249_n831TipColCod = new boolean[] {false} ;
      T001249_A13377ForNormaID = new String[] {""} ;
      T001250_A396EmprCod = new String[] {""} ;
      T001250_A252CliCod = new int[1] ;
      T001250_n252CliCod = new boolean[] {false} ;
      T001250_A494ForSer = new String[] {""} ;
      T001250_n494ForSer = new boolean[] {false} ;
      T001250_A482ForColNom = new String[] {""} ;
      T001250_n482ForColNom = new boolean[] {false} ;
      T001250_A483ForColNum = new int[1] ;
      T001250_n483ForColNum = new boolean[] {false} ;
      T001250_A831TipColCod = new byte[1] ;
      T001250_n831TipColCod = new boolean[] {false} ;
      T001250_A3571EnsCod = new String[] {""} ;
      T001251_A396EmprCod = new String[] {""} ;
      T001251_A252CliCod = new int[1] ;
      T001251_n252CliCod = new boolean[] {false} ;
      T001251_A494ForSer = new String[] {""} ;
      T001251_n494ForSer = new boolean[] {false} ;
      T001251_A482ForColNom = new String[] {""} ;
      T001251_n482ForColNom = new boolean[] {false} ;
      T001251_A483ForColNum = new int[1] ;
      T001251_n483ForColNum = new boolean[] {false} ;
      T001251_A831TipColCod = new byte[1] ;
      T001251_n831TipColCod = new boolean[] {false} ;
      T001251_A7270Procod_c = new String[] {""} ;
      T001251_A7272CliCod_d = new int[1] ;
      T001252_A396EmprCod = new String[] {""} ;
      T001252_A252CliCod = new int[1] ;
      T001252_n252CliCod = new boolean[] {false} ;
      T001252_A494ForSer = new String[] {""} ;
      T001252_n494ForSer = new boolean[] {false} ;
      T001252_A482ForColNom = new String[] {""} ;
      T001252_n482ForColNom = new boolean[] {false} ;
      T001252_A483ForColNum = new int[1] ;
      T001252_n483ForColNum = new boolean[] {false} ;
      T001252_A831TipColCod = new byte[1] ;
      T001252_n831TipColCod = new boolean[] {false} ;
      T001252_A6525ColAqP = new String[] {""} ;
      T001253_A396EmprCod = new String[] {""} ;
      T001253_A252CliCod = new int[1] ;
      T001253_n252CliCod = new boolean[] {false} ;
      T001253_A494ForSer = new String[] {""} ;
      T001253_n494ForSer = new boolean[] {false} ;
      T001253_A482ForColNom = new String[] {""} ;
      T001253_n482ForColNom = new boolean[] {false} ;
      T001253_A483ForColNum = new int[1] ;
      T001253_n483ForColNum = new boolean[] {false} ;
      T001253_A831TipColCod = new byte[1] ;
      T001253_n831TipColCod = new boolean[] {false} ;
      T001253_A7262CACPP = new String[] {""} ;
      T001254_A396EmprCod = new String[] {""} ;
      T001254_A252CliCod = new int[1] ;
      T001254_n252CliCod = new boolean[] {false} ;
      T001254_A494ForSer = new String[] {""} ;
      T001254_n494ForSer = new boolean[] {false} ;
      T001254_A482ForColNom = new String[] {""} ;
      T001254_n482ForColNom = new boolean[] {false} ;
      T001254_A483ForColNum = new int[1] ;
      T001254_n483ForColNum = new boolean[] {false} ;
      T001254_A831TipColCod = new byte[1] ;
      T001254_n831TipColCod = new boolean[] {false} ;
      T001254_A6037Mq_Grupo = new byte[1] ;
      T001255_A396EmprCod = new String[] {""} ;
      T001255_A252CliCod = new int[1] ;
      T001255_n252CliCod = new boolean[] {false} ;
      T001255_A494ForSer = new String[] {""} ;
      T001255_n494ForSer = new boolean[] {false} ;
      T001255_A482ForColNom = new String[] {""} ;
      T001255_n482ForColNom = new boolean[] {false} ;
      T001255_A483ForColNum = new int[1] ;
      T001255_n483ForColNum = new boolean[] {false} ;
      T001255_A831TipColCod = new byte[1] ;
      T001255_n831TipColCod = new boolean[] {false} ;
      T001255_A853For_ProC = new String[] {""} ;
      T001256_A396EmprCod = new String[] {""} ;
      T001256_A252CliCod = new int[1] ;
      T001256_n252CliCod = new boolean[] {false} ;
      T001256_A494ForSer = new String[] {""} ;
      T001256_n494ForSer = new boolean[] {false} ;
      T001256_A482ForColNom = new String[] {""} ;
      T001256_n482ForColNom = new boolean[] {false} ;
      T001256_A483ForColNum = new int[1] ;
      T001256_n483ForColNum = new boolean[] {false} ;
      T001256_A831TipColCod = new byte[1] ;
      T001256_n831TipColCod = new boolean[] {false} ;
      T001256_A9766ForProC = new String[] {""} ;
      T001257_A396EmprCod = new String[] {""} ;
      T001257_A252CliCod = new int[1] ;
      T001257_n252CliCod = new boolean[] {false} ;
      T001257_A494ForSer = new String[] {""} ;
      T001257_n494ForSer = new boolean[] {false} ;
      T001257_A482ForColNom = new String[] {""} ;
      T001257_n482ForColNom = new boolean[] {false} ;
      T001257_A483ForColNum = new int[1] ;
      T001257_n483ForColNum = new boolean[] {false} ;
      T001257_A831TipColCod = new byte[1] ;
      T001257_n831TipColCod = new boolean[] {false} ;
      T001257_A7797Sim_lin = new short[1] ;
      T001258_A396EmprCod = new String[] {""} ;
      T001258_A252CliCod = new int[1] ;
      T001258_n252CliCod = new boolean[] {false} ;
      T001258_A494ForSer = new String[] {""} ;
      T001258_n494ForSer = new boolean[] {false} ;
      T001258_A482ForColNom = new String[] {""} ;
      T001258_n482ForColNom = new boolean[] {false} ;
      T001258_A483ForColNum = new int[1] ;
      T001258_n483ForColNum = new boolean[] {false} ;
      T001258_A831TipColCod = new byte[1] ;
      T001258_n831TipColCod = new boolean[] {false} ;
      T001258_A7094Acab_Ter = new String[] {""} ;
      T001259_A396EmprCod = new String[] {""} ;
      T001259_A252CliCod = new int[1] ;
      T001259_n252CliCod = new boolean[] {false} ;
      T001259_A494ForSer = new String[] {""} ;
      T001259_n494ForSer = new boolean[] {false} ;
      T001259_A482ForColNom = new String[] {""} ;
      T001259_n482ForColNom = new boolean[] {false} ;
      T001259_A483ForColNum = new int[1] ;
      T001259_n483ForColNum = new boolean[] {false} ;
      T001259_A831TipColCod = new byte[1] ;
      T001259_n831TipColCod = new boolean[] {false} ;
      T001259_A3689ComForLin = new short[1] ;
      T001260_A396EmprCod = new String[] {""} ;
      T001260_A252CliCod = new int[1] ;
      T001260_n252CliCod = new boolean[] {false} ;
      T001260_A494ForSer = new String[] {""} ;
      T001260_n494ForSer = new boolean[] {false} ;
      T001260_A482ForColNom = new String[] {""} ;
      T001260_n482ForColNom = new boolean[] {false} ;
      T001260_A483ForColNum = new int[1] ;
      T001260_n483ForColNum = new boolean[] {false} ;
      T001260_A831TipColCod = new byte[1] ;
      T001260_n831TipColCod = new boolean[] {false} ;
      T001260_A1519RecCorLin = new byte[1] ;
      T001261_A396EmprCod = new String[] {""} ;
      T001261_A910Workstat = new String[] {""} ;
      T001261_A880EscLin = new short[1] ;
      T001262_A396EmprCod = new String[] {""} ;
      T001262_A252CliCod = new int[1] ;
      T001262_n252CliCod = new boolean[] {false} ;
      T001262_A494ForSer = new String[] {""} ;
      T001262_n494ForSer = new boolean[] {false} ;
      T001262_A482ForColNom = new String[] {""} ;
      T001262_n482ForColNom = new boolean[] {false} ;
      T001262_A483ForColNum = new int[1] ;
      T001262_n483ForColNum = new boolean[] {false} ;
      T001262_A831TipColCod = new byte[1] ;
      T001262_n831TipColCod = new boolean[] {false} ;
      T001262_A650ObsLin = new short[1] ;
      T001263_A396EmprCod = new String[] {""} ;
      T001263_A252CliCod = new int[1] ;
      T001263_n252CliCod = new boolean[] {false} ;
      T001263_A494ForSer = new String[] {""} ;
      T001263_n494ForSer = new boolean[] {false} ;
      T001263_A482ForColNom = new String[] {""} ;
      T001263_n482ForColNom = new boolean[] {false} ;
      T001263_A483ForColNum = new int[1] ;
      T001263_n483ForColNum = new boolean[] {false} ;
      T001263_A831TipColCod = new byte[1] ;
      T001263_n831TipColCod = new boolean[] {false} ;
      Z766ProForDsc = "" ;
      T001264_A494ForSer = new String[] {""} ;
      T001264_n494ForSer = new boolean[] {false} ;
      T001264_A482ForColNom = new String[] {""} ;
      T001264_n482ForColNom = new boolean[] {false} ;
      T001264_A483ForColNum = new int[1] ;
      T001264_n483ForColNum = new boolean[] {false} ;
      T001264_A831TipColCod = new byte[1] ;
      T001264_n831TipColCod = new boolean[] {false} ;
      T001264_A1160ProForL = new short[1] ;
      T001264_A766ProForDsc = new String[] {""} ;
      T001264_A6549ProForFR = new String[] {""} ;
      T001264_A7802ProFoNPrg = new int[1] ;
      T001264_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001264_A9704ProForVol = new int[1] ;
      T001264_A9707ProForMq = new String[] {""} ;
      T001264_A10542ProForH2O = new short[1] ;
      T001264_A396EmprCod = new String[] {""} ;
      T001264_A764ProForCod = new String[] {""} ;
      T001264_A252CliCod = new int[1] ;
      T001264_n252CliCod = new boolean[] {false} ;
      T00124_A766ProForDsc = new String[] {""} ;
      T001265_A766ProForDsc = new String[] {""} ;
      T001266_A396EmprCod = new String[] {""} ;
      T001266_A252CliCod = new int[1] ;
      T001266_n252CliCod = new boolean[] {false} ;
      T001266_A494ForSer = new String[] {""} ;
      T001266_n494ForSer = new boolean[] {false} ;
      T001266_A482ForColNom = new String[] {""} ;
      T001266_n482ForColNom = new boolean[] {false} ;
      T001266_A483ForColNum = new int[1] ;
      T001266_n483ForColNum = new boolean[] {false} ;
      T001266_A831TipColCod = new byte[1] ;
      T001266_n831TipColCod = new boolean[] {false} ;
      T001266_A1160ProForL = new short[1] ;
      T00123_A494ForSer = new String[] {""} ;
      T00123_n494ForSer = new boolean[] {false} ;
      T00123_A482ForColNom = new String[] {""} ;
      T00123_n482ForColNom = new boolean[] {false} ;
      T00123_A483ForColNum = new int[1] ;
      T00123_n483ForColNum = new boolean[] {false} ;
      T00123_A831TipColCod = new byte[1] ;
      T00123_n831TipColCod = new boolean[] {false} ;
      T00123_A1160ProForL = new short[1] ;
      T00123_A6549ProForFR = new String[] {""} ;
      T00123_A7802ProFoNPrg = new int[1] ;
      T00123_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00123_A9704ProForVol = new int[1] ;
      T00123_A9707ProForMq = new String[] {""} ;
      T00123_A10542ProForH2O = new short[1] ;
      T00123_A396EmprCod = new String[] {""} ;
      T00123_A764ProForCod = new String[] {""} ;
      T00123_A252CliCod = new int[1] ;
      T00123_n252CliCod = new boolean[] {false} ;
      T00122_A494ForSer = new String[] {""} ;
      T00122_n494ForSer = new boolean[] {false} ;
      T00122_A482ForColNom = new String[] {""} ;
      T00122_n482ForColNom = new boolean[] {false} ;
      T00122_A483ForColNum = new int[1] ;
      T00122_n483ForColNum = new boolean[] {false} ;
      T00122_A831TipColCod = new byte[1] ;
      T00122_n831TipColCod = new boolean[] {false} ;
      T00122_A1160ProForL = new short[1] ;
      T00122_A6549ProForFR = new String[] {""} ;
      T00122_A7802ProFoNPrg = new int[1] ;
      T00122_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00122_A9704ProForVol = new int[1] ;
      T00122_A9707ProForMq = new String[] {""} ;
      T00122_A10542ProForH2O = new short[1] ;
      T00122_A396EmprCod = new String[] {""} ;
      T00122_A764ProForCod = new String[] {""} ;
      T00122_A252CliCod = new int[1] ;
      T00122_n252CliCod = new boolean[] {false} ;
      T001270_A766ProForDsc = new String[] {""} ;
      T001271_A396EmprCod = new String[] {""} ;
      T001271_A252CliCod = new int[1] ;
      T001271_n252CliCod = new boolean[] {false} ;
      T001271_A494ForSer = new String[] {""} ;
      T001271_n494ForSer = new boolean[] {false} ;
      T001271_A482ForColNom = new String[] {""} ;
      T001271_n482ForColNom = new boolean[] {false} ;
      T001271_A483ForColNum = new int[1] ;
      T001271_n483ForColNum = new boolean[] {false} ;
      T001271_A831TipColCod = new byte[1] ;
      T001271_n831TipColCod = new boolean[] {false} ;
      T001271_A1160ProForL = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Z97ArtT1 = "" ;
      Z98ArtT2 = "" ;
      Z99ArtT3 = "" ;
      Z400EmprCodV = "" ;
      Z473FindArt = "" ;
      Z1674ArtU1 = "" ;
      Z1675ArtU2 = "" ;
      Z1676ArtU3 = "" ;
      Z1680ArtMater = "" ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ97ArtT1 = "" ;
      ZZ98ArtT2 = "" ;
      ZZ99ArtT3 = "" ;
      ZZ400EmprCodV = "" ;
      ZZ473FindArt = "" ;
      ZZ1674ArtU1 = "" ;
      ZZ1675ArtU2 = "" ;
      ZZ1676ArtU3 = "" ;
      ZZ1680ArtMater = "" ;
      ZZ5337ForCodExt = "" ;
      ZZ1191ForNomCli = "" ;
      ZZ130BarCodPar = "" ;
      ZZ485ForFec = GXutil.nullDate() ;
      ZZ495ForUltMod = GXutil.nullDate() ;
      ZZ496ForUltUti = GXutil.nullDate() ;
      ZZ492ForPreKgm = DecimalUtil.ZERO ;
      ZZ493ForPreMtr = DecimalUtil.ZERO ;
      ZZ491ForPreDef = "" ;
      ZZ2749ForPro = "" ;
      ZZ2838ForRelBan = DecimalUtil.ZERO ;
      ZZ3007PrecioA = DecimalUtil.ZERO ;
      ZZ3008PrecioM = DecimalUtil.ZERO ;
      ZZ995ForTonal = "" ;
      ZZ3588ForEst = "" ;
      ZZ1514MacProCod = "" ;
      ZZ4380ForCosForm = DecimalUtil.ZERO ;
      ZZ3560ForOpcCli = "" ;
      ZZ3558ForFecApr = GXutil.nullDate() ;
      ZZ5624ForUsrCod = "" ;
      ZZ5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      ZZ5626ForObsM = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ6379ForNomCli2 = "" ;
      ZZ6608ForUsrCre = "" ;
      ZZ6609ForFecCre = GXutil.resetTime( GXutil.nullDate() );
      ZZ7029ForNomCli3 = "" ;
      ZZ7781ForBlo = "" ;
      ZZ8777For_item1 = "" ;
      ZZ9792For_Reo = "" ;
      ZZ11041ForFecCtrl = GXutil.resetTime( GXutil.nullDate() );
      ZZ11042ForFecCtrf = GXutil.resetTime( GXutil.nullDate() );
      ZZ4224ForKgUTin = DecimalUtil.ZERO ;
      ZZ4225ForKgTTin = DecimalUtil.ZERO ;
      ZZ4226ForCosTTi = DecimalUtil.ZERO ;
      ZZ3569UltEnsCod = "" ;
      ZZ3585ForPreFec = GXutil.nullDate() ;
      ZZ3586ForPreAnt = DecimalUtil.ZERO ;
      ZZ3587ForFecAnt = GXutil.nullDate() ;
      ZZ11705For_item2 = "" ;
      ZZ11706ForObs2 = "" ;
      ZZ12732ForObsFac = "" ;
      ZZ13102ForLbTalao = "" ;
      ZZ407EmprNom = "" ;
      ZZ584IntDsc = "" ;
      ZZ627MatDsc = "" ;
      ZZ1515MacProDsc = "" ;
      ZZ3317DscSol = "" ;
      ZZ3792ForConDsc = "" ;
      ZZ5363IntDscF = "" ;
      ZZ279CliNom = "" ;
      ZZ832TipColDsc = "" ;
      T001272_A396EmprCod = new String[] {""} ;
      T001219_A97ArtT1 = new String[] {""} ;
      T001219_n97ArtT1 = new boolean[] {false} ;
      T001219_A98ArtT2 = new String[] {""} ;
      T001219_n98ArtT2 = new boolean[] {false} ;
      T001219_A99ArtT3 = new String[] {""} ;
      T001219_n99ArtT3 = new boolean[] {false} ;
      T001219_A102ArtTP1 = new short[1] ;
      T001219_n102ArtTP1 = new boolean[] {false} ;
      T001219_A103ArtTP2 = new short[1] ;
      T001219_n103ArtTP2 = new boolean[] {false} ;
      T001219_A104ArtTP3 = new short[1] ;
      T001219_n104ArtTP3 = new boolean[] {false} ;
      T001219_A473FindArt = new String[] {""} ;
      T001219_n473FindArt = new boolean[] {false} ;
      T001219_A1674ArtU1 = new String[] {""} ;
      T001219_n1674ArtU1 = new boolean[] {false} ;
      T001219_A1675ArtU2 = new String[] {""} ;
      T001219_n1675ArtU2 = new boolean[] {false} ;
      T001219_A1676ArtU3 = new String[] {""} ;
      T001219_n1676ArtU3 = new boolean[] {false} ;
      T001219_A1677ArtUP1 = new short[1] ;
      T001219_n1677ArtUP1 = new boolean[] {false} ;
      T001219_A1678ArtUP2 = new short[1] ;
      T001219_n1678ArtUP2 = new boolean[] {false} ;
      T001219_A1679ArtUP3 = new short[1] ;
      T001219_n1679ArtUP3 = new boolean[] {false} ;
      T001219_A1680ArtMater = new String[] {""} ;
      T001219_n1680ArtMater = new boolean[] {false} ;
      T001273_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tformul__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tformul__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tformul__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tformul__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tformul__default(),
         new Object[] {
             new Object[] {
            T00122_A494ForSer, T00122_A482ForColNom, T00122_A483ForColNum, T00122_A831TipColCod, T00122_A1160ProForL, T00122_A6549ProForFR, T00122_A7802ProFoNPrg, T00122_A8656ProForrbn, T00122_A9704ProForVol, T00122_A9707ProForMq,
            T00122_A10542ProForH2O, T00122_A396EmprCod, T00122_A764ProForCod, T00122_A252CliCod
            }
            , new Object[] {
            T00123_A494ForSer, T00123_A482ForColNom, T00123_A483ForColNum, T00123_A831TipColCod, T00123_A1160ProForL, T00123_A6549ProForFR, T00123_A7802ProFoNPrg, T00123_A8656ProForrbn, T00123_A9704ProForVol, T00123_A9707ProForMq,
            T00123_A10542ProForH2O, T00123_A396EmprCod, T00123_A764ProForCod, T00123_A252CliCod
            }
            , new Object[] {
            T00124_A766ProForDsc
            }
            , new Object[] {
            T00125_A494ForSer, T00125_A482ForColNom, T00125_A483ForColNum, T00125_A5337ForCodExt, T00125_n5337ForCodExt, T00125_A1192ForNumCli, T00125_n1192ForNumCli, T00125_A1191ForNomCli, T00125_n1191ForNomCli, T00125_A485ForFec,
            T00125_n485ForFec, T00125_A495ForUltMod, T00125_n495ForUltMod, T00125_A496ForUltUti, T00125_n496ForUltUti, T00125_A492ForPreKgm, T00125_n492ForPreKgm, T00125_A493ForPreMtr, T00125_n493ForPreMtr, T00125_A491ForPreDef,
            T00125_n491ForPreDef, T00125_A1159ForUltLin, T00125_n1159ForUltLin, T00125_A2749ForPro, T00125_n2749ForPro, T00125_A2838ForRelBan, T00125_n2838ForRelBan, T00125_A3007PrecioA, T00125_n3007PrecioA, T00125_A3008PrecioM,
            T00125_n3008PrecioM, T00125_A995ForTonal, T00125_n995ForTonal, T00125_A3315ForNumArc, T00125_n3315ForNumArc, T00125_A3588ForEst, T00125_n3588ForEst, T00125_A4339ForRGB, T00125_n4339ForRGB, T00125_A4380ForCosForm,
            T00125_n4380ForCosForm, T00125_A4384ForTipArt, T00125_n4384ForTipArt, T00125_A3560ForOpcCli, T00125_n3560ForOpcCli, T00125_A3558ForFecApr, T00125_n3558ForFecApr, T00125_A5624ForUsrCod, T00125_n5624ForUsrCod, T00125_A5625ForFecHor,
            T00125_n5625ForFecHor, T00125_A5626ForObsM, T00125_n5626ForObsM, T00125_A5653ForPInc, T00125_n5653ForPInc, T00125_A5742ForSerDsc, T00125_n5742ForSerDsc, T00125_A6379ForNomCli2, T00125_n6379ForNomCli2, T00125_A6608ForUsrCre,
            T00125_n6608ForUsrCre, T00125_A6609ForFecCre, T00125_n6609ForFecCre, T00125_A7029ForNomCli3, T00125_n7029ForNomCli3, T00125_A7537ForOpNum, T00125_n7537ForOpNum, T00125_A7781ForBlo, T00125_n7781ForBlo, T00125_A8043ForTipT,
            T00125_n8043ForTipT, T00125_A8777For_item1, T00125_n8777For_item1, T00125_A9792For_Reo, T00125_n9792For_Reo, T00125_A11041ForFecCtrl, T00125_n11041ForFecCtrl, T00125_A11042ForFecCtrf, T00125_n11042ForFecCtrf, T00125_A4224ForKgUTin,
            T00125_n4224ForKgUTin, T00125_A4225ForKgTTin, T00125_n4225ForKgTTin, T00125_A4226ForCosTTi, T00125_n4226ForCosTTi, T00125_A3569UltEnsCod, T00125_n3569UltEnsCod, T00125_A3585ForPreFec, T00125_n3585ForPreFec, T00125_A3586ForPreAnt,
            T00125_n3586ForPreAnt, T00125_A3587ForFecAnt, T00125_n3587ForFecAnt, T00125_A11705For_item2, T00125_n11705For_item2, T00125_A11706ForObs2, T00125_n11706ForObs2, T00125_A12732ForObsFac, T00125_n12732ForObsFac, T00125_A13102ForLbTalao,
            T00125_n13102ForLbTalao, T00125_A396EmprCod, T00125_A252CliCod, T00125_A486ForNumCol, T00125_A583IntCod, T00125_A626MatCod, T00125_A831TipColCod, T00125_A129BarCod, T00125_n129BarCod, T00125_A132BarCodReo,
            T00125_n132BarCodReo, T00125_A130BarCodPar, T00125_n130BarCodPar, T00125_A1514MacProCod, T00125_n1514MacProCod, T00125_A3316CodSol, T00125_n3316CodSol, T00125_A484ForCon, T00125_A5362IntCodF, T00125_n5362IntCodF,
            T00125_A8561Fam_Cod, T00125_n8561Fam_Cod
            }
            , new Object[] {
            T00126_A494ForSer, T00126_A482ForColNom, T00126_A483ForColNum, T00126_A5337ForCodExt, T00126_n5337ForCodExt, T00126_A1192ForNumCli, T00126_n1192ForNumCli, T00126_A1191ForNomCli, T00126_n1191ForNomCli, T00126_A485ForFec,
            T00126_n485ForFec, T00126_A495ForUltMod, T00126_n495ForUltMod, T00126_A496ForUltUti, T00126_n496ForUltUti, T00126_A492ForPreKgm, T00126_n492ForPreKgm, T00126_A493ForPreMtr, T00126_n493ForPreMtr, T00126_A491ForPreDef,
            T00126_n491ForPreDef, T00126_A1159ForUltLin, T00126_n1159ForUltLin, T00126_A2749ForPro, T00126_n2749ForPro, T00126_A2838ForRelBan, T00126_n2838ForRelBan, T00126_A3007PrecioA, T00126_n3007PrecioA, T00126_A3008PrecioM,
            T00126_n3008PrecioM, T00126_A995ForTonal, T00126_n995ForTonal, T00126_A3315ForNumArc, T00126_n3315ForNumArc, T00126_A3588ForEst, T00126_n3588ForEst, T00126_A4339ForRGB, T00126_n4339ForRGB, T00126_A4380ForCosForm,
            T00126_n4380ForCosForm, T00126_A4384ForTipArt, T00126_n4384ForTipArt, T00126_A3560ForOpcCli, T00126_n3560ForOpcCli, T00126_A3558ForFecApr, T00126_n3558ForFecApr, T00126_A5624ForUsrCod, T00126_n5624ForUsrCod, T00126_A5625ForFecHor,
            T00126_n5625ForFecHor, T00126_A5626ForObsM, T00126_n5626ForObsM, T00126_A5653ForPInc, T00126_n5653ForPInc, T00126_A5742ForSerDsc, T00126_n5742ForSerDsc, T00126_A6379ForNomCli2, T00126_n6379ForNomCli2, T00126_A6608ForUsrCre,
            T00126_n6608ForUsrCre, T00126_A6609ForFecCre, T00126_n6609ForFecCre, T00126_A7029ForNomCli3, T00126_n7029ForNomCli3, T00126_A7537ForOpNum, T00126_n7537ForOpNum, T00126_A7781ForBlo, T00126_n7781ForBlo, T00126_A8043ForTipT,
            T00126_n8043ForTipT, T00126_A8777For_item1, T00126_n8777For_item1, T00126_A9792For_Reo, T00126_n9792For_Reo, T00126_A11041ForFecCtrl, T00126_n11041ForFecCtrl, T00126_A11042ForFecCtrf, T00126_n11042ForFecCtrf, T00126_A4224ForKgUTin,
            T00126_n4224ForKgUTin, T00126_A4225ForKgTTin, T00126_n4225ForKgTTin, T00126_A4226ForCosTTi, T00126_n4226ForCosTTi, T00126_A3569UltEnsCod, T00126_n3569UltEnsCod, T00126_A3585ForPreFec, T00126_n3585ForPreFec, T00126_A3586ForPreAnt,
            T00126_n3586ForPreAnt, T00126_A3587ForFecAnt, T00126_n3587ForFecAnt, T00126_A11705For_item2, T00126_n11705For_item2, T00126_A11706ForObs2, T00126_n11706ForObs2, T00126_A12732ForObsFac, T00126_n12732ForObsFac, T00126_A13102ForLbTalao,
            T00126_n13102ForLbTalao, T00126_A396EmprCod, T00126_A252CliCod, T00126_A486ForNumCol, T00126_A583IntCod, T00126_A626MatCod, T00126_A831TipColCod, T00126_A129BarCod, T00126_n129BarCod, T00126_A132BarCodReo,
            T00126_n132BarCodReo, T00126_A130BarCodPar, T00126_n130BarCodPar, T00126_A1514MacProCod, T00126_n1514MacProCod, T00126_A3316CodSol, T00126_n3316CodSol, T00126_A484ForCon, T00126_A5362IntCodF, T00126_n5362IntCodF,
            T00126_A8561Fam_Cod, T00126_n8561Fam_Cod
            }
            , new Object[] {
            T00127_A407EmprNom, T00127_n407EmprNom
            }
            , new Object[] {
            T00128_A279CliNom
            }
            , new Object[] {
            T00129_A396EmprCod
            }
            , new Object[] {
            T001210_A584IntDsc, T001210_n584IntDsc
            }
            , new Object[] {
            T001211_A627MatDsc, T001211_n627MatDsc
            }
            , new Object[] {
            T001212_A832TipColDsc, T001212_n832TipColDsc
            }
            , new Object[] {
            T001213_A213BarSit
            }
            , new Object[] {
            T001214_A1515MacProDsc
            }
            , new Object[] {
            T001215_A3317DscSol, T001215_n3317DscSol
            }
            , new Object[] {
            T001216_A3792ForConDsc, T001216_n3792ForConDsc
            }
            , new Object[] {
            T001217_A5363IntDscF, T001217_n5363IntDscF
            }
            , new Object[] {
            T001218_A396EmprCod
            }
            , new Object[] {
            T001219_A97ArtT1, T001219_n97ArtT1, T001219_A98ArtT2, T001219_n98ArtT2, T001219_A99ArtT3, T001219_n99ArtT3, T001219_A102ArtTP1, T001219_n102ArtTP1, T001219_A103ArtTP2, T001219_n103ArtTP2,
            T001219_A104ArtTP3, T001219_n104ArtTP3, T001219_A473FindArt, T001219_n473FindArt, T001219_A1674ArtU1, T001219_n1674ArtU1, T001219_A1675ArtU2, T001219_n1675ArtU2, T001219_A1676ArtU3, T001219_n1676ArtU3,
            T001219_A1677ArtUP1, T001219_n1677ArtUP1, T001219_A1678ArtUP2, T001219_n1678ArtUP2, T001219_A1679ArtUP3, T001219_n1679ArtUP3, T001219_A1680ArtMater, T001219_n1680ArtMater
            }
            , new Object[] {
            T001220_A494ForSer, T001220_A482ForColNom, T001220_A483ForColNum, T001220_A5337ForCodExt, T001220_n5337ForCodExt, T001220_A1192ForNumCli, T001220_n1192ForNumCli, T001220_A1191ForNomCli, T001220_n1191ForNomCli, T001220_A213BarSit,
            T001220_A485ForFec, T001220_n485ForFec, T001220_A495ForUltMod, T001220_n495ForUltMod, T001220_A584IntDsc, T001220_n584IntDsc, T001220_A627MatDsc, T001220_n627MatDsc, T001220_A496ForUltUti, T001220_n496ForUltUti,
            T001220_A492ForPreKgm, T001220_n492ForPreKgm, T001220_A493ForPreMtr, T001220_n493ForPreMtr, T001220_A491ForPreDef, T001220_n491ForPreDef, T001220_A407EmprNom, T001220_n407EmprNom, T001220_A1159ForUltLin, T001220_n1159ForUltLin,
            T001220_A2749ForPro, T001220_n2749ForPro, T001220_A2838ForRelBan, T001220_n2838ForRelBan, T001220_A3007PrecioA, T001220_n3007PrecioA, T001220_A3008PrecioM, T001220_n3008PrecioM, T001220_A995ForTonal, T001220_n995ForTonal,
            T001220_A3315ForNumArc, T001220_n3315ForNumArc, T001220_A3317DscSol, T001220_n3317DscSol, T001220_A279CliNom, T001220_A832TipColDsc, T001220_n832TipColDsc, T001220_A3792ForConDsc, T001220_n3792ForConDsc, T001220_A3588ForEst,
            T001220_n3588ForEst, T001220_A1515MacProDsc, T001220_A4339ForRGB, T001220_n4339ForRGB, T001220_A4380ForCosForm, T001220_n4380ForCosForm, T001220_A4384ForTipArt, T001220_n4384ForTipArt, T001220_A3560ForOpcCli, T001220_n3560ForOpcCli,
            T001220_A5363IntDscF, T001220_n5363IntDscF, T001220_A3558ForFecApr, T001220_n3558ForFecApr, T001220_A5624ForUsrCod, T001220_n5624ForUsrCod, T001220_A5625ForFecHor, T001220_n5625ForFecHor, T001220_A5626ForObsM, T001220_n5626ForObsM,
            T001220_A5653ForPInc, T001220_n5653ForPInc, T001220_A5742ForSerDsc, T001220_n5742ForSerDsc, T001220_A6379ForNomCli2, T001220_n6379ForNomCli2, T001220_A6608ForUsrCre, T001220_n6608ForUsrCre, T001220_A6609ForFecCre, T001220_n6609ForFecCre,
            T001220_A7029ForNomCli3, T001220_n7029ForNomCli3, T001220_A7537ForOpNum, T001220_n7537ForOpNum, T001220_A7781ForBlo, T001220_n7781ForBlo, T001220_A8043ForTipT, T001220_n8043ForTipT, T001220_A8777For_item1, T001220_n8777For_item1,
            T001220_A9792For_Reo, T001220_n9792For_Reo, T001220_A11041ForFecCtrl, T001220_n11041ForFecCtrl, T001220_A11042ForFecCtrf, T001220_n11042ForFecCtrf, T001220_A4224ForKgUTin, T001220_n4224ForKgUTin, T001220_A4225ForKgTTin, T001220_n4225ForKgTTin,
            T001220_A4226ForCosTTi, T001220_n4226ForCosTTi, T001220_A3569UltEnsCod, T001220_n3569UltEnsCod, T001220_A3585ForPreFec, T001220_n3585ForPreFec, T001220_A3586ForPreAnt, T001220_n3586ForPreAnt, T001220_A3587ForFecAnt, T001220_n3587ForFecAnt,
            T001220_A11705For_item2, T001220_n11705For_item2, T001220_A11706ForObs2, T001220_n11706ForObs2, T001220_A12732ForObsFac, T001220_n12732ForObsFac, T001220_A13102ForLbTalao, T001220_n13102ForLbTalao, T001220_A396EmprCod, T001220_A252CliCod,
            T001220_A486ForNumCol, T001220_A583IntCod, T001220_A626MatCod, T001220_A831TipColCod, T001220_A129BarCod, T001220_n129BarCod, T001220_A132BarCodReo, T001220_n132BarCodReo, T001220_A130BarCodPar, T001220_n130BarCodPar,
            T001220_A1514MacProCod, T001220_n1514MacProCod, T001220_A3316CodSol, T001220_n3316CodSol, T001220_A484ForCon, T001220_A5362IntCodF, T001220_n5362IntCodF, T001220_A8561Fam_Cod, T001220_n8561Fam_Cod
            }
            , new Object[] {
            T001221_A407EmprNom, T001221_n407EmprNom
            }
            , new Object[] {
            T001222_A396EmprCod
            }
            , new Object[] {
            T001223_A584IntDsc, T001223_n584IntDsc
            }
            , new Object[] {
            T001224_A627MatDsc, T001224_n627MatDsc
            }
            , new Object[] {
            T001225_A213BarSit
            }
            , new Object[] {
            T001226_A1515MacProDsc
            }
            , new Object[] {
            T001227_A3317DscSol, T001227_n3317DscSol
            }
            , new Object[] {
            T001228_A3792ForConDsc, T001228_n3792ForConDsc
            }
            , new Object[] {
            T001229_A5363IntDscF, T001229_n5363IntDscF
            }
            , new Object[] {
            T001230_A396EmprCod
            }
            , new Object[] {
            T001231_A279CliNom
            }
            , new Object[] {
            T001232_A832TipColDsc, T001232_n832TipColDsc
            }
            , new Object[] {
            T001233_A396EmprCod, T001233_A252CliCod, T001233_A494ForSer, T001233_A482ForColNom, T001233_A483ForColNum, T001233_A831TipColCod
            }
            , new Object[] {
            T001234_A396EmprCod, T001234_A252CliCod, T001234_A494ForSer, T001234_A482ForColNom, T001234_A483ForColNum, T001234_A831TipColCod
            }
            , new Object[] {
            T001235_A396EmprCod, T001235_A252CliCod, T001235_A494ForSer, T001235_A482ForColNom, T001235_A483ForColNum, T001235_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001239_A407EmprNom, T001239_n407EmprNom
            }
            , new Object[] {
            T001240_A279CliNom
            }
            , new Object[] {
            T001241_A832TipColDsc, T001241_n832TipColDsc
            }
            , new Object[] {
            T001242_A213BarSit
            }
            , new Object[] {
            T001243_A584IntDsc, T001243_n584IntDsc
            }
            , new Object[] {
            T001244_A627MatDsc, T001244_n627MatDsc
            }
            , new Object[] {
            T001245_A3792ForConDsc, T001245_n3792ForConDsc
            }
            , new Object[] {
            T001246_A3317DscSol, T001246_n3317DscSol
            }
            , new Object[] {
            T001247_A1515MacProDsc
            }
            , new Object[] {
            T001248_A5363IntDscF, T001248_n5363IntDscF
            }
            , new Object[] {
            T001249_A396EmprCod, T001249_A252CliCod, T001249_A494ForSer, T001249_A482ForColNom, T001249_A483ForColNum, T001249_A831TipColCod, T001249_A13377ForNormaID
            }
            , new Object[] {
            T001250_A396EmprCod, T001250_A252CliCod, T001250_A494ForSer, T001250_A482ForColNom, T001250_A483ForColNum, T001250_A831TipColCod, T001250_A3571EnsCod
            }
            , new Object[] {
            T001251_A396EmprCod, T001251_A252CliCod, T001251_A494ForSer, T001251_A482ForColNom, T001251_A483ForColNum, T001251_A831TipColCod, T001251_A7270Procod_c, T001251_A7272CliCod_d
            }
            , new Object[] {
            T001252_A396EmprCod, T001252_A252CliCod, T001252_A494ForSer, T001252_A482ForColNom, T001252_A483ForColNum, T001252_A831TipColCod, T001252_A6525ColAqP
            }
            , new Object[] {
            T001253_A396EmprCod, T001253_A252CliCod, T001253_A494ForSer, T001253_A482ForColNom, T001253_A483ForColNum, T001253_A831TipColCod, T001253_A7262CACPP
            }
            , new Object[] {
            T001254_A396EmprCod, T001254_A252CliCod, T001254_A494ForSer, T001254_A482ForColNom, T001254_A483ForColNum, T001254_A831TipColCod, T001254_A6037Mq_Grupo
            }
            , new Object[] {
            T001255_A396EmprCod, T001255_A252CliCod, T001255_A494ForSer, T001255_A482ForColNom, T001255_A483ForColNum, T001255_A831TipColCod, T001255_A853For_ProC
            }
            , new Object[] {
            T001256_A396EmprCod, T001256_A252CliCod, T001256_A494ForSer, T001256_A482ForColNom, T001256_A483ForColNum, T001256_A831TipColCod, T001256_A9766ForProC
            }
            , new Object[] {
            T001257_A396EmprCod, T001257_A252CliCod, T001257_A494ForSer, T001257_A482ForColNom, T001257_A483ForColNum, T001257_A831TipColCod, T001257_A7797Sim_lin
            }
            , new Object[] {
            T001258_A396EmprCod, T001258_A252CliCod, T001258_A494ForSer, T001258_A482ForColNom, T001258_A483ForColNum, T001258_A831TipColCod, T001258_A7094Acab_Ter
            }
            , new Object[] {
            T001259_A396EmprCod, T001259_A252CliCod, T001259_A494ForSer, T001259_A482ForColNom, T001259_A483ForColNum, T001259_A831TipColCod, T001259_A3689ComForLin
            }
            , new Object[] {
            T001260_A396EmprCod, T001260_A252CliCod, T001260_A494ForSer, T001260_A482ForColNom, T001260_A483ForColNum, T001260_A831TipColCod, T001260_A1519RecCorLin
            }
            , new Object[] {
            T001261_A396EmprCod, T001261_A910Workstat, T001261_A880EscLin
            }
            , new Object[] {
            T001262_A396EmprCod, T001262_A252CliCod, T001262_A494ForSer, T001262_A482ForColNom, T001262_A483ForColNum, T001262_A831TipColCod, T001262_A650ObsLin
            }
            , new Object[] {
            T001263_A396EmprCod, T001263_A252CliCod, T001263_A494ForSer, T001263_A482ForColNom, T001263_A483ForColNum, T001263_A831TipColCod
            }
            , new Object[] {
            T001264_A494ForSer, T001264_A482ForColNom, T001264_A483ForColNum, T001264_A831TipColCod, T001264_A1160ProForL, T001264_A766ProForDsc, T001264_A6549ProForFR, T001264_A7802ProFoNPrg, T001264_A8656ProForrbn, T001264_A9704ProForVol,
            T001264_A9707ProForMq, T001264_A10542ProForH2O, T001264_A396EmprCod, T001264_A764ProForCod, T001264_A252CliCod
            }
            , new Object[] {
            T001265_A766ProForDsc
            }
            , new Object[] {
            T001266_A396EmprCod, T001266_A252CliCod, T001266_A494ForSer, T001266_A482ForColNom, T001266_A483ForColNum, T001266_A831TipColCod, T001266_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001270_A766ProForDsc
            }
            , new Object[] {
            T001271_A396EmprCod, T001271_A252CliCod, T001271_A494ForSer, T001271_A482ForColNom, T001271_A483ForColNum, T001271_A831TipColCod, T001271_A1160ProForL
            }
            , new Object[] {
            T001272_A396EmprCod
            }
            , new Object[] {
            T001273_A396EmprCod
            }
         }
      );
   }

   private byte Z831TipColCod ;
   private byte Z7537ForOpNum ;
   private byte Z8043ForTipT ;
   private byte Z583IntCod ;
   private byte Z132BarCodReo ;
   private byte Z484ForCon ;
   private byte Z5362IntCodF ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte A132BarCodReo ;
   private byte A484ForCon ;
   private byte A5362IntCodF ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte A7537ForOpNum ;
   private byte A8043ForTipT ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private byte ZZ132BarCodReo ;
   private byte ZZ583IntCod ;
   private byte ZZ484ForCon ;
   private byte ZZ5362IntCodF ;
   private byte ZZ7537ForOpNum ;
   private byte ZZ8043ForTipT ;
   private byte ZZ213BarSit ;
   private short Z1159ForUltLin ;
   private short Z4384ForTipArt ;
   private short Z5653ForPInc ;
   private short Z626MatCod ;
   private short Z3316CodSol ;
   private short Z8561Fam_Cod ;
   private short Z1160ProForL ;
   private short Z10542ProForH2O ;
   private short nRcdDeleted_154 ;
   private short nRcdExists_154 ;
   private short nIsMod_154 ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short A8561Fam_Cod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A102ArtTP1 ;
   private short A103ArtTP2 ;
   private short A104ArtTP3 ;
   private short A1677ArtUP1 ;
   private short A1678ArtUP2 ;
   private short A1679ArtUP3 ;
   private short A1159ForUltLin ;
   private short A4384ForTipArt ;
   private short A5653ForPInc ;
   private short nBlankRcdCount154 ;
   private short RcdFound154 ;
   private short nBlankRcdUsr154 ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_154 ;
   private short Z102ArtTP1 ;
   private short Z103ArtTP2 ;
   private short Z104ArtTP3 ;
   private short Z1677ArtUP1 ;
   private short Z1678ArtUP2 ;
   private short Z1679ArtUP3 ;
   private short ZZ102ArtTP1 ;
   private short ZZ103ArtTP2 ;
   private short ZZ104ArtTP3 ;
   private short ZZ1677ArtUP1 ;
   private short ZZ1678ArtUP2 ;
   private short ZZ1679ArtUP3 ;
   private short ZZ626MatCod ;
   private short ZZ1159ForUltLin ;
   private short ZZ3316CodSol ;
   private short ZZ4384ForTipArt ;
   private short ZZ5653ForPInc ;
   private short ZZ8561Fam_Cod ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z1192ForNumCli ;
   private int Z3315ForNumArc ;
   private int Z486ForNumCol ;
   private int Z129BarCod ;
   private int nRC_GXsfl_480 ;
   private int nGXsfl_480_idx=1 ;
   private int Z7802ProFoNPrg ;
   private int Z9704ProForVol ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int A483ForColNum ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtForCodExt_Enabled ;
   private int edtForNumCol_Enabled ;
   private int A1192ForNumCli ;
   private int edtForNumCli_Enabled ;
   private int edtForNomCli_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtForFec_Enabled ;
   private int edtForUltMod_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtMatCod_Enabled ;
   private int edtMatDsc_Enabled ;
   private int edtForUltUti_Enabled ;
   private int edtForPreKgm_Enabled ;
   private int edtForPreMtr_Enabled ;
   private int edtForPreDef_Enabled ;
   private int edtForCon_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtArtT1_Enabled ;
   private int edtArtTP1_Enabled ;
   private int edtArtT2_Enabled ;
   private int edtArtTP2_Enabled ;
   private int edtArtT3_Enabled ;
   private int edtArtTP3_Enabled ;
   private int edtArtU1_Enabled ;
   private int edtArtU2_Enabled ;
   private int edtArtU3_Enabled ;
   private int edtArtUP1_Enabled ;
   private int edtArtUP2_Enabled ;
   private int edtArtUP3_Enabled ;
   private int edtArtMater_Enabled ;
   private int edtFindArt_Enabled ;
   private int edtEmprCodV_Enabled ;
   private int A254CliCodV ;
   private int edtCliCodV_Enabled ;
   private int edtForUltLin_Enabled ;
   private int edtForRelBan_Enabled ;
   private int edtPrecioA_Enabled ;
   private int edtPrecioM_Enabled ;
   private int edtForTonal_Enabled ;
   private int A3315ForNumArc ;
   private int edtForNumArc_Enabled ;
   private int edtCodSol_Enabled ;
   private int edtDscSol_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtForConDsc_Enabled ;
   private int edtForEst_Enabled ;
   private int edtMacProCod_Enabled ;
   private int edtMacProDsc_Enabled ;
   private int edtForRGB_Enabled ;
   private int edtForCosForm_Enabled ;
   private int edtForTipArt_Enabled ;
   private int edtForOpcCli_Enabled ;
   private int edtIntCodF_Enabled ;
   private int edtIntDscF_Enabled ;
   private int edtForFecApr_Enabled ;
   private int edtForUsrCod_Enabled ;
   private int edtForFecHor_Enabled ;
   private int edtForObsM_Enabled ;
   private int edtForPInc_Enabled ;
   private int edtForSerDsc_Enabled ;
   private int edtForNomCli2_Enabled ;
   private int edtForUsrCre_Enabled ;
   private int edtForFecCre_Enabled ;
   private int edtForNomCli3_Enabled ;
   private int edtForOpNum_Enabled ;
   private int edtForTipT_Enabled ;
   private int edtFam_Cod_Enabled ;
   private int edtFor_item1_Enabled ;
   private int edtFor_Reo_Enabled ;
   private int edtForFecCtrl_Enabled ;
   private int edtForFecCtrf_Enabled ;
   private int edtForKgUTin_Enabled ;
   private int edtForKgTTin_Enabled ;
   private int edtForCosTTi_Enabled ;
   private int edtUltEnsCod_Enabled ;
   private int edtForPreFec_Enabled ;
   private int edtForPreAnt_Enabled ;
   private int edtForFecAnt_Enabled ;
   private int edtFor_item2_Enabled ;
   private int edtForObs2_Enabled ;
   private int edtForObsFac_Enabled ;
   private int edtForLbTalao_Enabled ;
   private int edtavnRcdDeleted_154_Enabled ;
   private int edtProForL_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForFR_Enabled ;
   private int edtProFoNPrg_Enabled ;
   private int edtProForrbn_Enabled ;
   private int edtProForVol_Enabled ;
   private int edtProForMq_Enabled ;
   private int edtProForH2O_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7802ProFoNPrg ;
   private int A9704ProForVol ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtProForL_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtForLbTalao_Backcolor ;
   private int edtForObsFac_Backcolor ;
   private int edtForObs2_Backcolor ;
   private int edtFor_item2_Backcolor ;
   private int edtForFecAnt_Backcolor ;
   private int edtForPreAnt_Backcolor ;
   private int edtForPreFec_Backcolor ;
   private int edtUltEnsCod_Backcolor ;
   private int edtForCosTTi_Backcolor ;
   private int edtForKgTTin_Backcolor ;
   private int edtForKgUTin_Backcolor ;
   private int edtForFecCtrf_Backcolor ;
   private int edtForFecCtrl_Backcolor ;
   private int edtFor_Reo_Backcolor ;
   private int edtFor_item1_Backcolor ;
   private int edtFam_Cod_Backcolor ;
   private int edtForTipT_Backcolor ;
   private int edtForOpNum_Backcolor ;
   private int edtForNomCli3_Backcolor ;
   private int edtForFecCre_Backcolor ;
   private int edtForUsrCre_Backcolor ;
   private int edtForNomCli2_Backcolor ;
   private int edtForSerDsc_Backcolor ;
   private int edtForPInc_Backcolor ;
   private int edtForObsM_Backcolor ;
   private int edtForFecHor_Backcolor ;
   private int edtForUsrCod_Backcolor ;
   private int edtForFecApr_Backcolor ;
   private int edtIntDscF_Backcolor ;
   private int edtIntCodF_Backcolor ;
   private int edtForOpcCli_Backcolor ;
   private int edtForTipArt_Backcolor ;
   private int edtForCosForm_Backcolor ;
   private int edtForRGB_Backcolor ;
   private int edtMacProDsc_Backcolor ;
   private int edtMacProCod_Backcolor ;
   private int edtForEst_Backcolor ;
   private int edtForConDsc_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtDscSol_Backcolor ;
   private int edtCodSol_Backcolor ;
   private int edtForNumArc_Backcolor ;
   private int edtForTonal_Backcolor ;
   private int edtPrecioM_Backcolor ;
   private int edtPrecioA_Backcolor ;
   private int edtForRelBan_Backcolor ;
   private int edtForUltLin_Backcolor ;
   private int edtCliCodV_Backcolor ;
   private int edtEmprCodV_Backcolor ;
   private int edtFindArt_Backcolor ;
   private int edtArtMater_Backcolor ;
   private int edtArtUP3_Backcolor ;
   private int edtArtUP2_Backcolor ;
   private int edtArtUP1_Backcolor ;
   private int edtArtU3_Backcolor ;
   private int edtArtU2_Backcolor ;
   private int edtArtU1_Backcolor ;
   private int edtArtTP3_Backcolor ;
   private int edtArtT3_Backcolor ;
   private int edtArtTP2_Backcolor ;
   private int edtArtT2_Backcolor ;
   private int edtArtTP1_Backcolor ;
   private int edtArtT1_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtForCon_Backcolor ;
   private int edtForPreDef_Backcolor ;
   private int edtForPreMtr_Backcolor ;
   private int edtForPreKgm_Backcolor ;
   private int edtForUltUti_Backcolor ;
   private int edtMatDsc_Backcolor ;
   private int edtMatCod_Backcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtForUltMod_Backcolor ;
   private int edtForFec_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtForNomCli_Backcolor ;
   private int edtForNumCli_Backcolor ;
   private int edtForNumCol_Backcolor ;
   private int edtForCodExt_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z254CliCodV ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private int ZZ254CliCodV ;
   private int ZZ486ForNumCol ;
   private int ZZ1192ForNumCli ;
   private int ZZ129BarCod ;
   private int ZZ3315ForNumArc ;
   private long Z4339ForRGB ;
   private long A4339ForRGB ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ4339ForRGB ;
   private java.math.BigDecimal Z492ForPreKgm ;
   private java.math.BigDecimal Z493ForPreMtr ;
   private java.math.BigDecimal Z2838ForRelBan ;
   private java.math.BigDecimal Z3007PrecioA ;
   private java.math.BigDecimal Z3008PrecioM ;
   private java.math.BigDecimal Z4380ForCosForm ;
   private java.math.BigDecimal Z4224ForKgUTin ;
   private java.math.BigDecimal Z4225ForKgTTin ;
   private java.math.BigDecimal Z4226ForCosTTi ;
   private java.math.BigDecimal Z3586ForPreAnt ;
   private java.math.BigDecimal Z8656ProForrbn ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A3007PrecioA ;
   private java.math.BigDecimal A3008PrecioM ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A4224ForKgUTin ;
   private java.math.BigDecimal A4225ForKgTTin ;
   private java.math.BigDecimal A4226ForCosTTi ;
   private java.math.BigDecimal A3586ForPreAnt ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal ZZ492ForPreKgm ;
   private java.math.BigDecimal ZZ493ForPreMtr ;
   private java.math.BigDecimal ZZ2838ForRelBan ;
   private java.math.BigDecimal ZZ3007PrecioA ;
   private java.math.BigDecimal ZZ3008PrecioM ;
   private java.math.BigDecimal ZZ4380ForCosForm ;
   private java.math.BigDecimal ZZ4224ForKgUTin ;
   private java.math.BigDecimal ZZ4225ForKgTTin ;
   private java.math.BigDecimal ZZ4226ForCosTTi ;
   private java.math.BigDecimal ZZ3586ForPreAnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z5337ForCodExt ;
   private String Z1191ForNomCli ;
   private String Z491ForPreDef ;
   private String Z2749ForPro ;
   private String Z995ForTonal ;
   private String Z3588ForEst ;
   private String Z3560ForOpcCli ;
   private String Z5624ForUsrCod ;
   private String Z5742ForSerDsc ;
   private String Z6379ForNomCli2 ;
   private String Z6608ForUsrCre ;
   private String Z7029ForNomCli3 ;
   private String Z7781ForBlo ;
   private String Z8777For_item1 ;
   private String Z9792For_Reo ;
   private String Z3569UltEnsCod ;
   private String Z11705For_item2 ;
   private String Z13102ForLbTalao ;
   private String Z130BarCodPar ;
   private String Z1514MacProCod ;
   private String Z6549ProForFR ;
   private String Z9707ProForMq ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1514MacProCod ;
   private String A764ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_480_idx="0001" ;
   private String Gx_mode ;
   private String A2749ForPro ;
   private String A7781ForBlo ;
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
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtForSer_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtForCodExt_Internalname ;
   private String A5337ForCodExt ;
   private String edtForCodExt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtForNumCli_Internalname ;
   private String edtForNumCli_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtForNomCli_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtForFec_Internalname ;
   private String edtForFec_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtForUltMod_Internalname ;
   private String edtForUltMod_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtMatCod_Internalname ;
   private String edtMatCod_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtMatDsc_Internalname ;
   private String A627MatDsc ;
   private String edtMatDsc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtForUltUti_Internalname ;
   private String edtForUltUti_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtForPreKgm_Internalname ;
   private String edtForPreKgm_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtForPreMtr_Internalname ;
   private String edtForPreMtr_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtForPreDef_Internalname ;
   private String A491ForPreDef ;
   private String edtForPreDef_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtForCon_Internalname ;
   private String edtForCon_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtArtT1_Internalname ;
   private String A97ArtT1 ;
   private String edtArtT1_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtArtTP1_Internalname ;
   private String edtArtTP1_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtArtT2_Internalname ;
   private String A98ArtT2 ;
   private String edtArtT2_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtArtTP2_Internalname ;
   private String edtArtTP2_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtArtT3_Internalname ;
   private String A99ArtT3 ;
   private String edtArtT3_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtArtTP3_Internalname ;
   private String edtArtTP3_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtArtU1_Internalname ;
   private String A1674ArtU1 ;
   private String edtArtU1_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtArtU2_Internalname ;
   private String A1675ArtU2 ;
   private String edtArtU2_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtArtU3_Internalname ;
   private String A1676ArtU3 ;
   private String edtArtU3_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtArtUP1_Internalname ;
   private String edtArtUP1_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtArtUP2_Internalname ;
   private String edtArtUP2_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtArtUP3_Internalname ;
   private String edtArtUP3_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtArtMater_Internalname ;
   private String A1680ArtMater ;
   private String edtArtMater_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtFindArt_Internalname ;
   private String A473FindArt ;
   private String edtFindArt_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtEmprCodV_Internalname ;
   private String A400EmprCodV ;
   private String edtEmprCodV_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtCliCodV_Internalname ;
   private String edtCliCodV_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtForUltLin_Internalname ;
   private String edtForUltLin_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtForRelBan_Internalname ;
   private String edtForRelBan_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtPrecioA_Internalname ;
   private String edtPrecioA_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtPrecioM_Internalname ;
   private String edtPrecioM_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtForTonal_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtForNumArc_Internalname ;
   private String edtForNumArc_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtCodSol_Internalname ;
   private String edtCodSol_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtDscSol_Internalname ;
   private String A3317DscSol ;
   private String edtDscSol_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtForConDsc_Internalname ;
   private String A3792ForConDsc ;
   private String edtForConDsc_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtForEst_Internalname ;
   private String A3588ForEst ;
   private String edtForEst_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtMacProCod_Internalname ;
   private String edtMacProCod_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtMacProDsc_Internalname ;
   private String A1515MacProDsc ;
   private String edtMacProDsc_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtForRGB_Internalname ;
   private String edtForRGB_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtForCosForm_Internalname ;
   private String edtForCosForm_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtForTipArt_Internalname ;
   private String edtForTipArt_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtForOpcCli_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtIntCodF_Internalname ;
   private String edtIntCodF_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtIntDscF_Internalname ;
   private String A5363IntDscF ;
   private String edtIntDscF_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtForFecApr_Internalname ;
   private String edtForFecApr_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtForUsrCod_Internalname ;
   private String A5624ForUsrCod ;
   private String edtForUsrCod_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtForFecHor_Internalname ;
   private String edtForFecHor_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtForObsM_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtForPInc_Internalname ;
   private String edtForPInc_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtForSerDsc_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtForNomCli2_Internalname ;
   private String A6379ForNomCli2 ;
   private String edtForNomCli2_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtForUsrCre_Internalname ;
   private String A6608ForUsrCre ;
   private String edtForUsrCre_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtForFecCre_Internalname ;
   private String edtForFecCre_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtForNomCli3_Internalname ;
   private String A7029ForNomCli3 ;
   private String edtForNomCli3_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtForOpNum_Internalname ;
   private String edtForOpNum_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtForTipT_Internalname ;
   private String edtForTipT_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtFam_Cod_Internalname ;
   private String edtFam_Cod_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtFor_item1_Internalname ;
   private String A8777For_item1 ;
   private String edtFor_item1_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtFor_Reo_Internalname ;
   private String A9792For_Reo ;
   private String edtFor_Reo_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtForFecCtrl_Internalname ;
   private String edtForFecCtrl_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtForFecCtrf_Internalname ;
   private String edtForFecCtrf_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtForKgUTin_Internalname ;
   private String edtForKgUTin_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtForKgTTin_Internalname ;
   private String edtForKgTTin_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtForCosTTi_Internalname ;
   private String edtForCosTTi_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtUltEnsCod_Internalname ;
   private String A3569UltEnsCod ;
   private String edtUltEnsCod_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String edtForPreFec_Internalname ;
   private String edtForPreFec_Jsonclick ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String edtForPreAnt_Internalname ;
   private String edtForPreAnt_Jsonclick ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock88_Jsonclick ;
   private String edtForFecAnt_Internalname ;
   private String edtForFecAnt_Jsonclick ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String edtFor_item2_Internalname ;
   private String A11705For_item2 ;
   private String edtFor_item2_Jsonclick ;
   private String lblTextblock90_Internalname ;
   private String lblTextblock90_Jsonclick ;
   private String edtForObs2_Internalname ;
   private String lblTextblock91_Internalname ;
   private String lblTextblock91_Jsonclick ;
   private String edtForObsFac_Internalname ;
   private String lblTextblock92_Internalname ;
   private String lblTextblock92_Jsonclick ;
   private String edtForLbTalao_Internalname ;
   private String A13102ForLbTalao ;
   private String edtForLbTalao_Jsonclick ;
   private String sMode154 ;
   private String edtavnRcdDeleted_154_Internalname ;
   private String edtProForL_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
   private String edtProForFR_Internalname ;
   private String edtProFoNPrg_Internalname ;
   private String edtProForrbn_Internalname ;
   private String edtProForVol_Internalname ;
   private String edtProForMq_Internalname ;
   private String edtProForH2O_Internalname ;
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
   private String sMode47 ;
   private String GXCCtl ;
   private String A766ProForDsc ;
   private String A6549ProForFR ;
   private String A9707ProForMq ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String Z584IntDsc ;
   private String Z627MatDsc ;
   private String Z3792ForConDsc ;
   private String Z3317DscSol ;
   private String Z1515MacProDsc ;
   private String Z5363IntDscF ;
   private String Z766ProForDsc ;
   private String sGXsfl_480_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_154_Jsonclick ;
   private String edtProForL_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForFR_Jsonclick ;
   private String edtProFoNPrg_Jsonclick ;
   private String edtProForrbn_Jsonclick ;
   private String edtProForVol_Jsonclick ;
   private String edtProForMq_Jsonclick ;
   private String edtProForH2O_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Z97ArtT1 ;
   private String Z98ArtT2 ;
   private String Z99ArtT3 ;
   private String Z400EmprCodV ;
   private String Z473FindArt ;
   private String Z1674ArtU1 ;
   private String Z1675ArtU2 ;
   private String Z1676ArtU3 ;
   private String Z1680ArtMater ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ97ArtT1 ;
   private String ZZ98ArtT2 ;
   private String ZZ99ArtT3 ;
   private String ZZ400EmprCodV ;
   private String ZZ473FindArt ;
   private String ZZ1674ArtU1 ;
   private String ZZ1675ArtU2 ;
   private String ZZ1676ArtU3 ;
   private String ZZ1680ArtMater ;
   private String ZZ5337ForCodExt ;
   private String ZZ1191ForNomCli ;
   private String ZZ130BarCodPar ;
   private String ZZ491ForPreDef ;
   private String ZZ2749ForPro ;
   private String ZZ995ForTonal ;
   private String ZZ3588ForEst ;
   private String ZZ1514MacProCod ;
   private String ZZ3560ForOpcCli ;
   private String ZZ5624ForUsrCod ;
   private String ZZ5742ForSerDsc ;
   private String ZZ6379ForNomCli2 ;
   private String ZZ6608ForUsrCre ;
   private String ZZ7029ForNomCli3 ;
   private String ZZ7781ForBlo ;
   private String ZZ8777For_item1 ;
   private String ZZ9792For_Reo ;
   private String ZZ3569UltEnsCod ;
   private String ZZ11705For_item2 ;
   private String ZZ13102ForLbTalao ;
   private String ZZ407EmprNom ;
   private String ZZ584IntDsc ;
   private String ZZ627MatDsc ;
   private String ZZ1515MacProDsc ;
   private String ZZ3317DscSol ;
   private String ZZ3792ForConDsc ;
   private String ZZ5363IntDscF ;
   private String ZZ279CliNom ;
   private String ZZ832TipColDsc ;
   private java.util.Date Z5625ForFecHor ;
   private java.util.Date Z6609ForFecCre ;
   private java.util.Date Z11041ForFecCtrl ;
   private java.util.Date Z11042ForFecCtrf ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date A6609ForFecCre ;
   private java.util.Date A11041ForFecCtrl ;
   private java.util.Date A11042ForFecCtrf ;
   private java.util.Date ZZ5625ForFecHor ;
   private java.util.Date ZZ6609ForFecCre ;
   private java.util.Date ZZ11041ForFecCtrl ;
   private java.util.Date ZZ11042ForFecCtrf ;
   private java.util.Date Z485ForFec ;
   private java.util.Date Z495ForUltMod ;
   private java.util.Date Z496ForUltUti ;
   private java.util.Date Z3558ForFecApr ;
   private java.util.Date Z3585ForPreFec ;
   private java.util.Date Z3587ForFecAnt ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private java.util.Date ZZ485ForFec ;
   private java.util.Date ZZ495ForUltMod ;
   private java.util.Date ZZ496ForUltUti ;
   private java.util.Date ZZ3558ForFecApr ;
   private java.util.Date ZZ3585ForPreFec ;
   private java.util.Date ZZ3587ForFecAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n1514MacProCod ;
   private boolean n3316CodSol ;
   private boolean n5362IntCodF ;
   private boolean n8561Fam_Cod ;
   private boolean n252CliCod ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean n2749ForPro ;
   private boolean n7781ForBlo ;
   private boolean bGXsfl_480_Refreshing=false ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n5337ForCodExt ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n485ForFec ;
   private boolean n495ForUltMod ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n496ForUltUti ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean n407EmprNom ;
   private boolean n97ArtT1 ;
   private boolean n102ArtTP1 ;
   private boolean n98ArtT2 ;
   private boolean n103ArtTP2 ;
   private boolean n99ArtT3 ;
   private boolean n104ArtTP3 ;
   private boolean n1674ArtU1 ;
   private boolean n1675ArtU2 ;
   private boolean n1676ArtU3 ;
   private boolean n1677ArtUP1 ;
   private boolean n1678ArtUP2 ;
   private boolean n1679ArtUP3 ;
   private boolean n1680ArtMater ;
   private boolean n473FindArt ;
   private boolean n1159ForUltLin ;
   private boolean n2838ForRelBan ;
   private boolean n3007PrecioA ;
   private boolean n3008PrecioM ;
   private boolean n995ForTonal ;
   private boolean n3315ForNumArc ;
   private boolean n3317DscSol ;
   private boolean n832TipColDsc ;
   private boolean n3792ForConDsc ;
   private boolean n3588ForEst ;
   private boolean n4339ForRGB ;
   private boolean n4380ForCosForm ;
   private boolean n4384ForTipArt ;
   private boolean n3560ForOpcCli ;
   private boolean n5363IntDscF ;
   private boolean n3558ForFecApr ;
   private boolean n5624ForUsrCod ;
   private boolean n5625ForFecHor ;
   private boolean n5626ForObsM ;
   private boolean n5653ForPInc ;
   private boolean n5742ForSerDsc ;
   private boolean n6379ForNomCli2 ;
   private boolean n6608ForUsrCre ;
   private boolean n6609ForFecCre ;
   private boolean n7029ForNomCli3 ;
   private boolean n7537ForOpNum ;
   private boolean n8043ForTipT ;
   private boolean n8777For_item1 ;
   private boolean n9792For_Reo ;
   private boolean n11041ForFecCtrl ;
   private boolean n11042ForFecCtrf ;
   private boolean n4224ForKgUTin ;
   private boolean n4225ForKgTTin ;
   private boolean n4226ForCosTTi ;
   private boolean n3569UltEnsCod ;
   private boolean n3585ForPreFec ;
   private boolean n3586ForPreAnt ;
   private boolean n3587ForFecAnt ;
   private boolean n11705For_item2 ;
   private boolean n11706ForObs2 ;
   private boolean n12732ForObsFac ;
   private boolean n13102ForLbTalao ;
   private boolean Gx_longc ;
   private String Z5626ForObsM ;
   private String Z11706ForObs2 ;
   private String Z12732ForObsFac ;
   private String A5626ForObsM ;
   private String A11706ForObs2 ;
   private String A12732ForObsFac ;
   private String ZZ5626ForObsM ;
   private String ZZ11706ForObs2 ;
   private String ZZ12732ForObsFac ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkForPro ;
   private HTMLChoice cmbForBlo ;
   private IDataStoreProvider pr_default ;
   private String[] T001220_A494ForSer ;
   private boolean[] T001220_n494ForSer ;
   private String[] T001220_A482ForColNom ;
   private boolean[] T001220_n482ForColNom ;
   private int[] T001220_A483ForColNum ;
   private boolean[] T001220_n483ForColNum ;
   private String[] T001220_A5337ForCodExt ;
   private boolean[] T001220_n5337ForCodExt ;
   private int[] T001220_A1192ForNumCli ;
   private boolean[] T001220_n1192ForNumCli ;
   private String[] T001220_A1191ForNomCli ;
   private boolean[] T001220_n1191ForNomCli ;
   private byte[] T001220_A213BarSit ;
   private java.util.Date[] T001220_A485ForFec ;
   private boolean[] T001220_n485ForFec ;
   private java.util.Date[] T001220_A495ForUltMod ;
   private boolean[] T001220_n495ForUltMod ;
   private String[] T001220_A584IntDsc ;
   private boolean[] T001220_n584IntDsc ;
   private String[] T001220_A627MatDsc ;
   private boolean[] T001220_n627MatDsc ;
   private java.util.Date[] T001220_A496ForUltUti ;
   private boolean[] T001220_n496ForUltUti ;
   private java.math.BigDecimal[] T001220_A492ForPreKgm ;
   private boolean[] T001220_n492ForPreKgm ;
   private java.math.BigDecimal[] T001220_A493ForPreMtr ;
   private boolean[] T001220_n493ForPreMtr ;
   private String[] T001220_A491ForPreDef ;
   private boolean[] T001220_n491ForPreDef ;
   private String[] T001220_A407EmprNom ;
   private boolean[] T001220_n407EmprNom ;
   private short[] T001220_A1159ForUltLin ;
   private boolean[] T001220_n1159ForUltLin ;
   private String[] T001220_A2749ForPro ;
   private boolean[] T001220_n2749ForPro ;
   private java.math.BigDecimal[] T001220_A2838ForRelBan ;
   private boolean[] T001220_n2838ForRelBan ;
   private java.math.BigDecimal[] T001220_A3007PrecioA ;
   private boolean[] T001220_n3007PrecioA ;
   private java.math.BigDecimal[] T001220_A3008PrecioM ;
   private boolean[] T001220_n3008PrecioM ;
   private String[] T001220_A995ForTonal ;
   private boolean[] T001220_n995ForTonal ;
   private int[] T001220_A3315ForNumArc ;
   private boolean[] T001220_n3315ForNumArc ;
   private String[] T001220_A3317DscSol ;
   private boolean[] T001220_n3317DscSol ;
   private String[] T001220_A279CliNom ;
   private String[] T001220_A832TipColDsc ;
   private boolean[] T001220_n832TipColDsc ;
   private String[] T001220_A3792ForConDsc ;
   private boolean[] T001220_n3792ForConDsc ;
   private String[] T001220_A3588ForEst ;
   private boolean[] T001220_n3588ForEst ;
   private String[] T001220_A1515MacProDsc ;
   private long[] T001220_A4339ForRGB ;
   private boolean[] T001220_n4339ForRGB ;
   private java.math.BigDecimal[] T001220_A4380ForCosForm ;
   private boolean[] T001220_n4380ForCosForm ;
   private short[] T001220_A4384ForTipArt ;
   private boolean[] T001220_n4384ForTipArt ;
   private String[] T001220_A3560ForOpcCli ;
   private boolean[] T001220_n3560ForOpcCli ;
   private String[] T001220_A5363IntDscF ;
   private boolean[] T001220_n5363IntDscF ;
   private java.util.Date[] T001220_A3558ForFecApr ;
   private boolean[] T001220_n3558ForFecApr ;
   private String[] T001220_A5624ForUsrCod ;
   private boolean[] T001220_n5624ForUsrCod ;
   private java.util.Date[] T001220_A5625ForFecHor ;
   private boolean[] T001220_n5625ForFecHor ;
   private String[] T001220_A5626ForObsM ;
   private boolean[] T001220_n5626ForObsM ;
   private short[] T001220_A5653ForPInc ;
   private boolean[] T001220_n5653ForPInc ;
   private String[] T001220_A5742ForSerDsc ;
   private boolean[] T001220_n5742ForSerDsc ;
   private String[] T001220_A6379ForNomCli2 ;
   private boolean[] T001220_n6379ForNomCli2 ;
   private String[] T001220_A6608ForUsrCre ;
   private boolean[] T001220_n6608ForUsrCre ;
   private java.util.Date[] T001220_A6609ForFecCre ;
   private boolean[] T001220_n6609ForFecCre ;
   private String[] T001220_A7029ForNomCli3 ;
   private boolean[] T001220_n7029ForNomCli3 ;
   private byte[] T001220_A7537ForOpNum ;
   private boolean[] T001220_n7537ForOpNum ;
   private String[] T001220_A7781ForBlo ;
   private boolean[] T001220_n7781ForBlo ;
   private byte[] T001220_A8043ForTipT ;
   private boolean[] T001220_n8043ForTipT ;
   private String[] T001220_A8777For_item1 ;
   private boolean[] T001220_n8777For_item1 ;
   private String[] T001220_A9792For_Reo ;
   private boolean[] T001220_n9792For_Reo ;
   private java.util.Date[] T001220_A11041ForFecCtrl ;
   private boolean[] T001220_n11041ForFecCtrl ;
   private java.util.Date[] T001220_A11042ForFecCtrf ;
   private boolean[] T001220_n11042ForFecCtrf ;
   private java.math.BigDecimal[] T001220_A4224ForKgUTin ;
   private boolean[] T001220_n4224ForKgUTin ;
   private java.math.BigDecimal[] T001220_A4225ForKgTTin ;
   private boolean[] T001220_n4225ForKgTTin ;
   private java.math.BigDecimal[] T001220_A4226ForCosTTi ;
   private boolean[] T001220_n4226ForCosTTi ;
   private String[] T001220_A3569UltEnsCod ;
   private boolean[] T001220_n3569UltEnsCod ;
   private java.util.Date[] T001220_A3585ForPreFec ;
   private boolean[] T001220_n3585ForPreFec ;
   private java.math.BigDecimal[] T001220_A3586ForPreAnt ;
   private boolean[] T001220_n3586ForPreAnt ;
   private java.util.Date[] T001220_A3587ForFecAnt ;
   private boolean[] T001220_n3587ForFecAnt ;
   private String[] T001220_A11705For_item2 ;
   private boolean[] T001220_n11705For_item2 ;
   private String[] T001220_A11706ForObs2 ;
   private boolean[] T001220_n11706ForObs2 ;
   private String[] T001220_A12732ForObsFac ;
   private boolean[] T001220_n12732ForObsFac ;
   private String[] T001220_A13102ForLbTalao ;
   private boolean[] T001220_n13102ForLbTalao ;
   private String[] T001220_A396EmprCod ;
   private int[] T001220_A252CliCod ;
   private boolean[] T001220_n252CliCod ;
   private int[] T001220_A486ForNumCol ;
   private byte[] T001220_A583IntCod ;
   private short[] T001220_A626MatCod ;
   private byte[] T001220_A831TipColCod ;
   private boolean[] T001220_n831TipColCod ;
   private int[] T001220_A129BarCod ;
   private boolean[] T001220_n129BarCod ;
   private byte[] T001220_A132BarCodReo ;
   private boolean[] T001220_n132BarCodReo ;
   private String[] T001220_A130BarCodPar ;
   private boolean[] T001220_n130BarCodPar ;
   private String[] T001220_A1514MacProCod ;
   private boolean[] T001220_n1514MacProCod ;
   private short[] T001220_A3316CodSol ;
   private boolean[] T001220_n3316CodSol ;
   private byte[] T001220_A484ForCon ;
   private byte[] T001220_A5362IntCodF ;
   private boolean[] T001220_n5362IntCodF ;
   private short[] T001220_A8561Fam_Cod ;
   private boolean[] T001220_n8561Fam_Cod ;
   private String[] T00127_A407EmprNom ;
   private boolean[] T00127_n407EmprNom ;
   private String[] T00129_A396EmprCod ;
   private String[] T001210_A584IntDsc ;
   private boolean[] T001210_n584IntDsc ;
   private String[] T001211_A627MatDsc ;
   private boolean[] T001211_n627MatDsc ;
   private byte[] T001213_A213BarSit ;
   private String[] T001214_A1515MacProDsc ;
   private String[] T001215_A3317DscSol ;
   private boolean[] T001215_n3317DscSol ;
   private String[] T001216_A3792ForConDsc ;
   private boolean[] T001216_n3792ForConDsc ;
   private String[] T001217_A5363IntDscF ;
   private boolean[] T001217_n5363IntDscF ;
   private String[] T001218_A396EmprCod ;
   private String[] T00128_A279CliNom ;
   private String[] T001212_A832TipColDsc ;
   private boolean[] T001212_n832TipColDsc ;
   private String[] T001221_A407EmprNom ;
   private boolean[] T001221_n407EmprNom ;
   private String[] T001222_A396EmprCod ;
   private String[] T001223_A584IntDsc ;
   private boolean[] T001223_n584IntDsc ;
   private String[] T001224_A627MatDsc ;
   private boolean[] T001224_n627MatDsc ;
   private byte[] T001225_A213BarSit ;
   private String[] T001226_A1515MacProDsc ;
   private String[] T001227_A3317DscSol ;
   private boolean[] T001227_n3317DscSol ;
   private String[] T001228_A3792ForConDsc ;
   private boolean[] T001228_n3792ForConDsc ;
   private String[] T001229_A5363IntDscF ;
   private boolean[] T001229_n5363IntDscF ;
   private String[] T001230_A396EmprCod ;
   private String[] T001231_A279CliNom ;
   private String[] T001232_A832TipColDsc ;
   private boolean[] T001232_n832TipColDsc ;
   private String[] T001233_A396EmprCod ;
   private int[] T001233_A252CliCod ;
   private boolean[] T001233_n252CliCod ;
   private String[] T001233_A494ForSer ;
   private boolean[] T001233_n494ForSer ;
   private String[] T001233_A482ForColNom ;
   private boolean[] T001233_n482ForColNom ;
   private int[] T001233_A483ForColNum ;
   private boolean[] T001233_n483ForColNum ;
   private byte[] T001233_A831TipColCod ;
   private boolean[] T001233_n831TipColCod ;
   private String[] T00126_A494ForSer ;
   private boolean[] T00126_n494ForSer ;
   private String[] T00126_A482ForColNom ;
   private boolean[] T00126_n482ForColNom ;
   private int[] T00126_A483ForColNum ;
   private boolean[] T00126_n483ForColNum ;
   private String[] T00126_A5337ForCodExt ;
   private boolean[] T00126_n5337ForCodExt ;
   private int[] T00126_A1192ForNumCli ;
   private boolean[] T00126_n1192ForNumCli ;
   private String[] T00126_A1191ForNomCli ;
   private boolean[] T00126_n1191ForNomCli ;
   private java.util.Date[] T00126_A485ForFec ;
   private boolean[] T00126_n485ForFec ;
   private java.util.Date[] T00126_A495ForUltMod ;
   private boolean[] T00126_n495ForUltMod ;
   private java.util.Date[] T00126_A496ForUltUti ;
   private boolean[] T00126_n496ForUltUti ;
   private java.math.BigDecimal[] T00126_A492ForPreKgm ;
   private boolean[] T00126_n492ForPreKgm ;
   private java.math.BigDecimal[] T00126_A493ForPreMtr ;
   private boolean[] T00126_n493ForPreMtr ;
   private String[] T00126_A491ForPreDef ;
   private boolean[] T00126_n491ForPreDef ;
   private short[] T00126_A1159ForUltLin ;
   private boolean[] T00126_n1159ForUltLin ;
   private String[] T00126_A2749ForPro ;
   private boolean[] T00126_n2749ForPro ;
   private java.math.BigDecimal[] T00126_A2838ForRelBan ;
   private boolean[] T00126_n2838ForRelBan ;
   private java.math.BigDecimal[] T00126_A3007PrecioA ;
   private boolean[] T00126_n3007PrecioA ;
   private java.math.BigDecimal[] T00126_A3008PrecioM ;
   private boolean[] T00126_n3008PrecioM ;
   private String[] T00126_A995ForTonal ;
   private boolean[] T00126_n995ForTonal ;
   private int[] T00126_A3315ForNumArc ;
   private boolean[] T00126_n3315ForNumArc ;
   private String[] T00126_A3588ForEst ;
   private boolean[] T00126_n3588ForEst ;
   private long[] T00126_A4339ForRGB ;
   private boolean[] T00126_n4339ForRGB ;
   private java.math.BigDecimal[] T00126_A4380ForCosForm ;
   private boolean[] T00126_n4380ForCosForm ;
   private short[] T00126_A4384ForTipArt ;
   private boolean[] T00126_n4384ForTipArt ;
   private String[] T00126_A3560ForOpcCli ;
   private boolean[] T00126_n3560ForOpcCli ;
   private java.util.Date[] T00126_A3558ForFecApr ;
   private boolean[] T00126_n3558ForFecApr ;
   private String[] T00126_A5624ForUsrCod ;
   private boolean[] T00126_n5624ForUsrCod ;
   private java.util.Date[] T00126_A5625ForFecHor ;
   private boolean[] T00126_n5625ForFecHor ;
   private String[] T00126_A5626ForObsM ;
   private boolean[] T00126_n5626ForObsM ;
   private short[] T00126_A5653ForPInc ;
   private boolean[] T00126_n5653ForPInc ;
   private String[] T00126_A5742ForSerDsc ;
   private boolean[] T00126_n5742ForSerDsc ;
   private String[] T00126_A6379ForNomCli2 ;
   private boolean[] T00126_n6379ForNomCli2 ;
   private String[] T00126_A6608ForUsrCre ;
   private boolean[] T00126_n6608ForUsrCre ;
   private java.util.Date[] T00126_A6609ForFecCre ;
   private boolean[] T00126_n6609ForFecCre ;
   private String[] T00126_A7029ForNomCli3 ;
   private boolean[] T00126_n7029ForNomCli3 ;
   private byte[] T00126_A7537ForOpNum ;
   private boolean[] T00126_n7537ForOpNum ;
   private String[] T00126_A7781ForBlo ;
   private boolean[] T00126_n7781ForBlo ;
   private byte[] T00126_A8043ForTipT ;
   private boolean[] T00126_n8043ForTipT ;
   private String[] T00126_A8777For_item1 ;
   private boolean[] T00126_n8777For_item1 ;
   private String[] T00126_A9792For_Reo ;
   private boolean[] T00126_n9792For_Reo ;
   private java.util.Date[] T00126_A11041ForFecCtrl ;
   private boolean[] T00126_n11041ForFecCtrl ;
   private java.util.Date[] T00126_A11042ForFecCtrf ;
   private boolean[] T00126_n11042ForFecCtrf ;
   private java.math.BigDecimal[] T00126_A4224ForKgUTin ;
   private boolean[] T00126_n4224ForKgUTin ;
   private java.math.BigDecimal[] T00126_A4225ForKgTTin ;
   private boolean[] T00126_n4225ForKgTTin ;
   private java.math.BigDecimal[] T00126_A4226ForCosTTi ;
   private boolean[] T00126_n4226ForCosTTi ;
   private String[] T00126_A3569UltEnsCod ;
   private boolean[] T00126_n3569UltEnsCod ;
   private java.util.Date[] T00126_A3585ForPreFec ;
   private boolean[] T00126_n3585ForPreFec ;
   private java.math.BigDecimal[] T00126_A3586ForPreAnt ;
   private boolean[] T00126_n3586ForPreAnt ;
   private java.util.Date[] T00126_A3587ForFecAnt ;
   private boolean[] T00126_n3587ForFecAnt ;
   private String[] T00126_A11705For_item2 ;
   private boolean[] T00126_n11705For_item2 ;
   private String[] T00126_A11706ForObs2 ;
   private boolean[] T00126_n11706ForObs2 ;
   private String[] T00126_A12732ForObsFac ;
   private boolean[] T00126_n12732ForObsFac ;
   private String[] T00126_A13102ForLbTalao ;
   private boolean[] T00126_n13102ForLbTalao ;
   private String[] T00126_A396EmprCod ;
   private int[] T00126_A252CliCod ;
   private boolean[] T00126_n252CliCod ;
   private int[] T00126_A486ForNumCol ;
   private byte[] T00126_A583IntCod ;
   private short[] T00126_A626MatCod ;
   private byte[] T00126_A831TipColCod ;
   private boolean[] T00126_n831TipColCod ;
   private int[] T00126_A129BarCod ;
   private boolean[] T00126_n129BarCod ;
   private byte[] T00126_A132BarCodReo ;
   private boolean[] T00126_n132BarCodReo ;
   private String[] T00126_A130BarCodPar ;
   private boolean[] T00126_n130BarCodPar ;
   private String[] T00126_A1514MacProCod ;
   private boolean[] T00126_n1514MacProCod ;
   private short[] T00126_A3316CodSol ;
   private boolean[] T00126_n3316CodSol ;
   private byte[] T00126_A484ForCon ;
   private byte[] T00126_A5362IntCodF ;
   private boolean[] T00126_n5362IntCodF ;
   private short[] T00126_A8561Fam_Cod ;
   private boolean[] T00126_n8561Fam_Cod ;
   private String[] T001234_A396EmprCod ;
   private int[] T001234_A252CliCod ;
   private boolean[] T001234_n252CliCod ;
   private String[] T001234_A494ForSer ;
   private boolean[] T001234_n494ForSer ;
   private String[] T001234_A482ForColNom ;
   private boolean[] T001234_n482ForColNom ;
   private int[] T001234_A483ForColNum ;
   private boolean[] T001234_n483ForColNum ;
   private byte[] T001234_A831TipColCod ;
   private boolean[] T001234_n831TipColCod ;
   private String[] T001235_A396EmprCod ;
   private int[] T001235_A252CliCod ;
   private boolean[] T001235_n252CliCod ;
   private String[] T001235_A494ForSer ;
   private boolean[] T001235_n494ForSer ;
   private String[] T001235_A482ForColNom ;
   private boolean[] T001235_n482ForColNom ;
   private int[] T001235_A483ForColNum ;
   private boolean[] T001235_n483ForColNum ;
   private byte[] T001235_A831TipColCod ;
   private boolean[] T001235_n831TipColCod ;
   private String[] T00125_A494ForSer ;
   private boolean[] T00125_n494ForSer ;
   private String[] T00125_A482ForColNom ;
   private boolean[] T00125_n482ForColNom ;
   private int[] T00125_A483ForColNum ;
   private boolean[] T00125_n483ForColNum ;
   private String[] T00125_A5337ForCodExt ;
   private boolean[] T00125_n5337ForCodExt ;
   private int[] T00125_A1192ForNumCli ;
   private boolean[] T00125_n1192ForNumCli ;
   private String[] T00125_A1191ForNomCli ;
   private boolean[] T00125_n1191ForNomCli ;
   private java.util.Date[] T00125_A485ForFec ;
   private boolean[] T00125_n485ForFec ;
   private java.util.Date[] T00125_A495ForUltMod ;
   private boolean[] T00125_n495ForUltMod ;
   private java.util.Date[] T00125_A496ForUltUti ;
   private boolean[] T00125_n496ForUltUti ;
   private java.math.BigDecimal[] T00125_A492ForPreKgm ;
   private boolean[] T00125_n492ForPreKgm ;
   private java.math.BigDecimal[] T00125_A493ForPreMtr ;
   private boolean[] T00125_n493ForPreMtr ;
   private String[] T00125_A491ForPreDef ;
   private boolean[] T00125_n491ForPreDef ;
   private short[] T00125_A1159ForUltLin ;
   private boolean[] T00125_n1159ForUltLin ;
   private String[] T00125_A2749ForPro ;
   private boolean[] T00125_n2749ForPro ;
   private java.math.BigDecimal[] T00125_A2838ForRelBan ;
   private boolean[] T00125_n2838ForRelBan ;
   private java.math.BigDecimal[] T00125_A3007PrecioA ;
   private boolean[] T00125_n3007PrecioA ;
   private java.math.BigDecimal[] T00125_A3008PrecioM ;
   private boolean[] T00125_n3008PrecioM ;
   private String[] T00125_A995ForTonal ;
   private boolean[] T00125_n995ForTonal ;
   private int[] T00125_A3315ForNumArc ;
   private boolean[] T00125_n3315ForNumArc ;
   private String[] T00125_A3588ForEst ;
   private boolean[] T00125_n3588ForEst ;
   private long[] T00125_A4339ForRGB ;
   private boolean[] T00125_n4339ForRGB ;
   private java.math.BigDecimal[] T00125_A4380ForCosForm ;
   private boolean[] T00125_n4380ForCosForm ;
   private short[] T00125_A4384ForTipArt ;
   private boolean[] T00125_n4384ForTipArt ;
   private String[] T00125_A3560ForOpcCli ;
   private boolean[] T00125_n3560ForOpcCli ;
   private java.util.Date[] T00125_A3558ForFecApr ;
   private boolean[] T00125_n3558ForFecApr ;
   private String[] T00125_A5624ForUsrCod ;
   private boolean[] T00125_n5624ForUsrCod ;
   private java.util.Date[] T00125_A5625ForFecHor ;
   private boolean[] T00125_n5625ForFecHor ;
   private String[] T00125_A5626ForObsM ;
   private boolean[] T00125_n5626ForObsM ;
   private short[] T00125_A5653ForPInc ;
   private boolean[] T00125_n5653ForPInc ;
   private String[] T00125_A5742ForSerDsc ;
   private boolean[] T00125_n5742ForSerDsc ;
   private String[] T00125_A6379ForNomCli2 ;
   private boolean[] T00125_n6379ForNomCli2 ;
   private String[] T00125_A6608ForUsrCre ;
   private boolean[] T00125_n6608ForUsrCre ;
   private java.util.Date[] T00125_A6609ForFecCre ;
   private boolean[] T00125_n6609ForFecCre ;
   private String[] T00125_A7029ForNomCli3 ;
   private boolean[] T00125_n7029ForNomCli3 ;
   private byte[] T00125_A7537ForOpNum ;
   private boolean[] T00125_n7537ForOpNum ;
   private String[] T00125_A7781ForBlo ;
   private boolean[] T00125_n7781ForBlo ;
   private byte[] T00125_A8043ForTipT ;
   private boolean[] T00125_n8043ForTipT ;
   private String[] T00125_A8777For_item1 ;
   private boolean[] T00125_n8777For_item1 ;
   private String[] T00125_A9792For_Reo ;
   private boolean[] T00125_n9792For_Reo ;
   private java.util.Date[] T00125_A11041ForFecCtrl ;
   private boolean[] T00125_n11041ForFecCtrl ;
   private java.util.Date[] T00125_A11042ForFecCtrf ;
   private boolean[] T00125_n11042ForFecCtrf ;
   private java.math.BigDecimal[] T00125_A4224ForKgUTin ;
   private boolean[] T00125_n4224ForKgUTin ;
   private java.math.BigDecimal[] T00125_A4225ForKgTTin ;
   private boolean[] T00125_n4225ForKgTTin ;
   private java.math.BigDecimal[] T00125_A4226ForCosTTi ;
   private boolean[] T00125_n4226ForCosTTi ;
   private String[] T00125_A3569UltEnsCod ;
   private boolean[] T00125_n3569UltEnsCod ;
   private java.util.Date[] T00125_A3585ForPreFec ;
   private boolean[] T00125_n3585ForPreFec ;
   private java.math.BigDecimal[] T00125_A3586ForPreAnt ;
   private boolean[] T00125_n3586ForPreAnt ;
   private java.util.Date[] T00125_A3587ForFecAnt ;
   private boolean[] T00125_n3587ForFecAnt ;
   private String[] T00125_A11705For_item2 ;
   private boolean[] T00125_n11705For_item2 ;
   private String[] T00125_A11706ForObs2 ;
   private boolean[] T00125_n11706ForObs2 ;
   private String[] T00125_A12732ForObsFac ;
   private boolean[] T00125_n12732ForObsFac ;
   private String[] T00125_A13102ForLbTalao ;
   private boolean[] T00125_n13102ForLbTalao ;
   private String[] T00125_A396EmprCod ;
   private int[] T00125_A252CliCod ;
   private boolean[] T00125_n252CliCod ;
   private int[] T00125_A486ForNumCol ;
   private byte[] T00125_A583IntCod ;
   private short[] T00125_A626MatCod ;
   private byte[] T00125_A831TipColCod ;
   private boolean[] T00125_n831TipColCod ;
   private int[] T00125_A129BarCod ;
   private boolean[] T00125_n129BarCod ;
   private byte[] T00125_A132BarCodReo ;
   private boolean[] T00125_n132BarCodReo ;
   private String[] T00125_A130BarCodPar ;
   private boolean[] T00125_n130BarCodPar ;
   private String[] T00125_A1514MacProCod ;
   private boolean[] T00125_n1514MacProCod ;
   private short[] T00125_A3316CodSol ;
   private boolean[] T00125_n3316CodSol ;
   private byte[] T00125_A484ForCon ;
   private byte[] T00125_A5362IntCodF ;
   private boolean[] T00125_n5362IntCodF ;
   private short[] T00125_A8561Fam_Cod ;
   private boolean[] T00125_n8561Fam_Cod ;
   private String[] T001239_A407EmprNom ;
   private boolean[] T001239_n407EmprNom ;
   private String[] T001240_A279CliNom ;
   private String[] T001241_A832TipColDsc ;
   private boolean[] T001241_n832TipColDsc ;
   private byte[] T001242_A213BarSit ;
   private String[] T001243_A584IntDsc ;
   private boolean[] T001243_n584IntDsc ;
   private String[] T001244_A627MatDsc ;
   private boolean[] T001244_n627MatDsc ;
   private String[] T001245_A3792ForConDsc ;
   private boolean[] T001245_n3792ForConDsc ;
   private String[] T001246_A3317DscSol ;
   private boolean[] T001246_n3317DscSol ;
   private String[] T001247_A1515MacProDsc ;
   private String[] T001248_A5363IntDscF ;
   private boolean[] T001248_n5363IntDscF ;
   private String[] T001249_A396EmprCod ;
   private int[] T001249_A252CliCod ;
   private boolean[] T001249_n252CliCod ;
   private String[] T001249_A494ForSer ;
   private boolean[] T001249_n494ForSer ;
   private String[] T001249_A482ForColNom ;
   private boolean[] T001249_n482ForColNom ;
   private int[] T001249_A483ForColNum ;
   private boolean[] T001249_n483ForColNum ;
   private byte[] T001249_A831TipColCod ;
   private boolean[] T001249_n831TipColCod ;
   private String[] T001249_A13377ForNormaID ;
   private String[] T001250_A396EmprCod ;
   private int[] T001250_A252CliCod ;
   private boolean[] T001250_n252CliCod ;
   private String[] T001250_A494ForSer ;
   private boolean[] T001250_n494ForSer ;
   private String[] T001250_A482ForColNom ;
   private boolean[] T001250_n482ForColNom ;
   private int[] T001250_A483ForColNum ;
   private boolean[] T001250_n483ForColNum ;
   private byte[] T001250_A831TipColCod ;
   private boolean[] T001250_n831TipColCod ;
   private String[] T001250_A3571EnsCod ;
   private String[] T001251_A396EmprCod ;
   private int[] T001251_A252CliCod ;
   private boolean[] T001251_n252CliCod ;
   private String[] T001251_A494ForSer ;
   private boolean[] T001251_n494ForSer ;
   private String[] T001251_A482ForColNom ;
   private boolean[] T001251_n482ForColNom ;
   private int[] T001251_A483ForColNum ;
   private boolean[] T001251_n483ForColNum ;
   private byte[] T001251_A831TipColCod ;
   private boolean[] T001251_n831TipColCod ;
   private String[] T001251_A7270Procod_c ;
   private int[] T001251_A7272CliCod_d ;
   private String[] T001252_A396EmprCod ;
   private int[] T001252_A252CliCod ;
   private boolean[] T001252_n252CliCod ;
   private String[] T001252_A494ForSer ;
   private boolean[] T001252_n494ForSer ;
   private String[] T001252_A482ForColNom ;
   private boolean[] T001252_n482ForColNom ;
   private int[] T001252_A483ForColNum ;
   private boolean[] T001252_n483ForColNum ;
   private byte[] T001252_A831TipColCod ;
   private boolean[] T001252_n831TipColCod ;
   private String[] T001252_A6525ColAqP ;
   private String[] T001253_A396EmprCod ;
   private int[] T001253_A252CliCod ;
   private boolean[] T001253_n252CliCod ;
   private String[] T001253_A494ForSer ;
   private boolean[] T001253_n494ForSer ;
   private String[] T001253_A482ForColNom ;
   private boolean[] T001253_n482ForColNom ;
   private int[] T001253_A483ForColNum ;
   private boolean[] T001253_n483ForColNum ;
   private byte[] T001253_A831TipColCod ;
   private boolean[] T001253_n831TipColCod ;
   private String[] T001253_A7262CACPP ;
   private String[] T001254_A396EmprCod ;
   private int[] T001254_A252CliCod ;
   private boolean[] T001254_n252CliCod ;
   private String[] T001254_A494ForSer ;
   private boolean[] T001254_n494ForSer ;
   private String[] T001254_A482ForColNom ;
   private boolean[] T001254_n482ForColNom ;
   private int[] T001254_A483ForColNum ;
   private boolean[] T001254_n483ForColNum ;
   private byte[] T001254_A831TipColCod ;
   private boolean[] T001254_n831TipColCod ;
   private byte[] T001254_A6037Mq_Grupo ;
   private String[] T001255_A396EmprCod ;
   private int[] T001255_A252CliCod ;
   private boolean[] T001255_n252CliCod ;
   private String[] T001255_A494ForSer ;
   private boolean[] T001255_n494ForSer ;
   private String[] T001255_A482ForColNom ;
   private boolean[] T001255_n482ForColNom ;
   private int[] T001255_A483ForColNum ;
   private boolean[] T001255_n483ForColNum ;
   private byte[] T001255_A831TipColCod ;
   private boolean[] T001255_n831TipColCod ;
   private String[] T001255_A853For_ProC ;
   private String[] T001256_A396EmprCod ;
   private int[] T001256_A252CliCod ;
   private boolean[] T001256_n252CliCod ;
   private String[] T001256_A494ForSer ;
   private boolean[] T001256_n494ForSer ;
   private String[] T001256_A482ForColNom ;
   private boolean[] T001256_n482ForColNom ;
   private int[] T001256_A483ForColNum ;
   private boolean[] T001256_n483ForColNum ;
   private byte[] T001256_A831TipColCod ;
   private boolean[] T001256_n831TipColCod ;
   private String[] T001256_A9766ForProC ;
   private String[] T001257_A396EmprCod ;
   private int[] T001257_A252CliCod ;
   private boolean[] T001257_n252CliCod ;
   private String[] T001257_A494ForSer ;
   private boolean[] T001257_n494ForSer ;
   private String[] T001257_A482ForColNom ;
   private boolean[] T001257_n482ForColNom ;
   private int[] T001257_A483ForColNum ;
   private boolean[] T001257_n483ForColNum ;
   private byte[] T001257_A831TipColCod ;
   private boolean[] T001257_n831TipColCod ;
   private short[] T001257_A7797Sim_lin ;
   private String[] T001258_A396EmprCod ;
   private int[] T001258_A252CliCod ;
   private boolean[] T001258_n252CliCod ;
   private String[] T001258_A494ForSer ;
   private boolean[] T001258_n494ForSer ;
   private String[] T001258_A482ForColNom ;
   private boolean[] T001258_n482ForColNom ;
   private int[] T001258_A483ForColNum ;
   private boolean[] T001258_n483ForColNum ;
   private byte[] T001258_A831TipColCod ;
   private boolean[] T001258_n831TipColCod ;
   private String[] T001258_A7094Acab_Ter ;
   private String[] T001259_A396EmprCod ;
   private int[] T001259_A252CliCod ;
   private boolean[] T001259_n252CliCod ;
   private String[] T001259_A494ForSer ;
   private boolean[] T001259_n494ForSer ;
   private String[] T001259_A482ForColNom ;
   private boolean[] T001259_n482ForColNom ;
   private int[] T001259_A483ForColNum ;
   private boolean[] T001259_n483ForColNum ;
   private byte[] T001259_A831TipColCod ;
   private boolean[] T001259_n831TipColCod ;
   private short[] T001259_A3689ComForLin ;
   private String[] T001260_A396EmprCod ;
   private int[] T001260_A252CliCod ;
   private boolean[] T001260_n252CliCod ;
   private String[] T001260_A494ForSer ;
   private boolean[] T001260_n494ForSer ;
   private String[] T001260_A482ForColNom ;
   private boolean[] T001260_n482ForColNom ;
   private int[] T001260_A483ForColNum ;
   private boolean[] T001260_n483ForColNum ;
   private byte[] T001260_A831TipColCod ;
   private boolean[] T001260_n831TipColCod ;
   private byte[] T001260_A1519RecCorLin ;
   private String[] T001261_A396EmprCod ;
   private String[] T001261_A910Workstat ;
   private short[] T001261_A880EscLin ;
   private String[] T001262_A396EmprCod ;
   private int[] T001262_A252CliCod ;
   private boolean[] T001262_n252CliCod ;
   private String[] T001262_A494ForSer ;
   private boolean[] T001262_n494ForSer ;
   private String[] T001262_A482ForColNom ;
   private boolean[] T001262_n482ForColNom ;
   private int[] T001262_A483ForColNum ;
   private boolean[] T001262_n483ForColNum ;
   private byte[] T001262_A831TipColCod ;
   private boolean[] T001262_n831TipColCod ;
   private short[] T001262_A650ObsLin ;
   private String[] T001263_A396EmprCod ;
   private int[] T001263_A252CliCod ;
   private boolean[] T001263_n252CliCod ;
   private String[] T001263_A494ForSer ;
   private boolean[] T001263_n494ForSer ;
   private String[] T001263_A482ForColNom ;
   private boolean[] T001263_n482ForColNom ;
   private int[] T001263_A483ForColNum ;
   private boolean[] T001263_n483ForColNum ;
   private byte[] T001263_A831TipColCod ;
   private boolean[] T001263_n831TipColCod ;
   private String[] T001264_A494ForSer ;
   private boolean[] T001264_n494ForSer ;
   private String[] T001264_A482ForColNom ;
   private boolean[] T001264_n482ForColNom ;
   private int[] T001264_A483ForColNum ;
   private boolean[] T001264_n483ForColNum ;
   private byte[] T001264_A831TipColCod ;
   private boolean[] T001264_n831TipColCod ;
   private short[] T001264_A1160ProForL ;
   private String[] T001264_A766ProForDsc ;
   private String[] T001264_A6549ProForFR ;
   private int[] T001264_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T001264_A8656ProForrbn ;
   private int[] T001264_A9704ProForVol ;
   private String[] T001264_A9707ProForMq ;
   private short[] T001264_A10542ProForH2O ;
   private String[] T001264_A396EmprCod ;
   private String[] T001264_A764ProForCod ;
   private int[] T001264_A252CliCod ;
   private boolean[] T001264_n252CliCod ;
   private String[] T00124_A766ProForDsc ;
   private String[] T001265_A766ProForDsc ;
   private String[] T001266_A396EmprCod ;
   private int[] T001266_A252CliCod ;
   private boolean[] T001266_n252CliCod ;
   private String[] T001266_A494ForSer ;
   private boolean[] T001266_n494ForSer ;
   private String[] T001266_A482ForColNom ;
   private boolean[] T001266_n482ForColNom ;
   private int[] T001266_A483ForColNum ;
   private boolean[] T001266_n483ForColNum ;
   private byte[] T001266_A831TipColCod ;
   private boolean[] T001266_n831TipColCod ;
   private short[] T001266_A1160ProForL ;
   private String[] T00123_A494ForSer ;
   private boolean[] T00123_n494ForSer ;
   private String[] T00123_A482ForColNom ;
   private boolean[] T00123_n482ForColNom ;
   private int[] T00123_A483ForColNum ;
   private boolean[] T00123_n483ForColNum ;
   private byte[] T00123_A831TipColCod ;
   private boolean[] T00123_n831TipColCod ;
   private short[] T00123_A1160ProForL ;
   private String[] T00123_A6549ProForFR ;
   private int[] T00123_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T00123_A8656ProForrbn ;
   private int[] T00123_A9704ProForVol ;
   private String[] T00123_A9707ProForMq ;
   private short[] T00123_A10542ProForH2O ;
   private String[] T00123_A396EmprCod ;
   private String[] T00123_A764ProForCod ;
   private int[] T00123_A252CliCod ;
   private boolean[] T00123_n252CliCod ;
   private String[] T00122_A494ForSer ;
   private boolean[] T00122_n494ForSer ;
   private String[] T00122_A482ForColNom ;
   private boolean[] T00122_n482ForColNom ;
   private int[] T00122_A483ForColNum ;
   private boolean[] T00122_n483ForColNum ;
   private byte[] T00122_A831TipColCod ;
   private boolean[] T00122_n831TipColCod ;
   private short[] T00122_A1160ProForL ;
   private String[] T00122_A6549ProForFR ;
   private int[] T00122_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T00122_A8656ProForrbn ;
   private int[] T00122_A9704ProForVol ;
   private String[] T00122_A9707ProForMq ;
   private short[] T00122_A10542ProForH2O ;
   private String[] T00122_A396EmprCod ;
   private String[] T00122_A764ProForCod ;
   private int[] T00122_A252CliCod ;
   private boolean[] T00122_n252CliCod ;
   private String[] T001270_A766ProForDsc ;
   private String[] T001271_A396EmprCod ;
   private int[] T001271_A252CliCod ;
   private boolean[] T001271_n252CliCod ;
   private String[] T001271_A494ForSer ;
   private boolean[] T001271_n494ForSer ;
   private String[] T001271_A482ForColNom ;
   private boolean[] T001271_n482ForColNom ;
   private int[] T001271_A483ForColNum ;
   private boolean[] T001271_n483ForColNum ;
   private byte[] T001271_A831TipColCod ;
   private boolean[] T001271_n831TipColCod ;
   private short[] T001271_A1160ProForL ;
   private String[] T001272_A396EmprCod ;
   private String[] T001219_A97ArtT1 ;
   private boolean[] T001219_n97ArtT1 ;
   private String[] T001219_A98ArtT2 ;
   private boolean[] T001219_n98ArtT2 ;
   private String[] T001219_A99ArtT3 ;
   private boolean[] T001219_n99ArtT3 ;
   private short[] T001219_A102ArtTP1 ;
   private boolean[] T001219_n102ArtTP1 ;
   private short[] T001219_A103ArtTP2 ;
   private boolean[] T001219_n103ArtTP2 ;
   private short[] T001219_A104ArtTP3 ;
   private boolean[] T001219_n104ArtTP3 ;
   private String[] T001219_A473FindArt ;
   private boolean[] T001219_n473FindArt ;
   private String[] T001219_A1674ArtU1 ;
   private boolean[] T001219_n1674ArtU1 ;
   private String[] T001219_A1675ArtU2 ;
   private boolean[] T001219_n1675ArtU2 ;
   private String[] T001219_A1676ArtU3 ;
   private boolean[] T001219_n1676ArtU3 ;
   private short[] T001219_A1677ArtUP1 ;
   private boolean[] T001219_n1677ArtUP1 ;
   private short[] T001219_A1678ArtUP2 ;
   private boolean[] T001219_n1678ArtUP2 ;
   private short[] T001219_A1679ArtUP3 ;
   private boolean[] T001219_n1679ArtUP3 ;
   private String[] T001219_A1680ArtMater ;
   private boolean[] T001219_n1680ArtMater ;
   private String[] T001273_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tformul__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformul__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformul__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformul__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformul__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00122", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, ProForCod, CliCod FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?  FOR UPDATE OF ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00123", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, ProForCod, CliCod FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00124", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00125", "SELECT ForSer, ForColNom, ForColNum, ForCodExt, ForNumCli, ForNomCli, ForFec, ForUltMod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForUltLin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, ForEst, ForRGB, ForCosForm, ForTipArt, ForOpcCli, ForFecApr, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, ForTipT, For_item1, For_Reo, ForFecCtrl, ForFecCtrf, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForObsFac, ForLbTalao, EmprCod, CliCod, ForNumCol, IntCod, MatCod, TipColCod, BarCod, BarCodReo, BarCodPar, MacProCod, CodSol, ForCon, IntCodF, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForCodExt, ForNumCli, ForNomCli, ForFec, ForUltMod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForUltLin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, ForEst, ForRGB, ForCosForm, ForTipArt, ForOpcCli, ForFecApr, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, ForTipT, For_item1, For_Reo, ForFecCtrl, ForFecCtrf, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForObsFac, ForLbTalao, ForNumCol, IntCod, MatCod, BarCod, BarCodReo, BarCodPar, MacProCod, CodSol, ForCon, IntCodF, Fam_Cod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00126", "SELECT ForSer, ForColNom, ForColNum, ForCodExt, ForNumCli, ForNomCli, ForFec, ForUltMod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForUltLin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, ForEst, ForRGB, ForCosForm, ForTipArt, ForOpcCli, ForFecApr, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, ForTipT, For_item1, For_Reo, ForFecCtrl, ForFecCtrf, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForObsFac, ForLbTalao, EmprCod, CliCod, ForNumCol, IntCod, MatCod, TipColCod, BarCod, BarCodReo, BarCodPar, MacProCod, CodSol, ForCon, IntCodF, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00127", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00128", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00129", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001210", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001211", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001212", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001213", "SELECT BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001214", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001215", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001216", "SELECT ForConDsc FROM TXPFORCTR WHERE EmprCod = ? AND ForCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001217", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001218", "SELECT EmprCod FROM TXPFAMTIP WHERE EmprCod = ? AND Fam_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001219", "SELECT COALESCE( ArtTra1, '') AS ArtT1, COALESCE( ArtTra2, '') AS ArtT2, COALESCE( ArtTra3, '') AS ArtT3, COALESCE( ArtTraP1, 0) AS ArtTP1, COALESCE( ArtTraP2, 0) AS ArtTP2, COALESCE( ArtTraP3, 0) AS ArtTP3, COALESCE( ArtCod, '') AS FindArt, COALESCE( ArtUrd1, '') AS ArtU1, COALESCE( ArtUrd2, '') AS ArtU2, COALESCE( ArtUrd3, '') AS ArtU3, COALESCE( ArtUrdP1, 0) AS ArtUP1, COALESCE( ArtUrdP2, 0) AS ArtUP2, COALESCE( ArtUrdP3, 0) AS ArtUP3, COALESCE( ArtMat, '') AS ArtMater FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001220", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ForCodExt, TM1.ForNumCli, TM1.ForNomCli, T5.BarSit, TM1.ForFec, TM1.ForUltMod, T6.IntDsc, T7.MatDsc, TM1.ForUltUti, TM1.ForPreKgm, TM1.ForPreMtr, TM1.ForPreDef, T2.EmprNom, TM1.ForUltLin, TM1.ForPro, TM1.ForRelBan, TM1.PrecioA, TM1.PrecioM, TM1.ForTonal, TM1.ForNumArc, T9.DscSol, T3.CliNom, T4.TipColDsc, T8.ForConDsc, TM1.ForEst, T10.MacProDsc, TM1.ForRGB, TM1.ForCosForm, TM1.ForTipArt, TM1.ForOpcCli, T11.IntDscF, TM1.ForFecApr, TM1.ForUsrCod, TM1.ForFecHor, TM1.ForObsM, TM1.ForPInc, TM1.ForSerDsc, TM1.ForNomCli2, TM1.ForUsrCre, TM1.ForFecCre, TM1.ForNomCli3, TM1.ForOpNum, TM1.ForBlo, TM1.ForTipT, TM1.For_item1, TM1.For_Reo, TM1.ForFecCtrl, TM1.ForFecCtrf, TM1.ForKgUTin, TM1.ForKgTTin, TM1.ForCosTTi, TM1.UltEnsCod, TM1.ForPreFec, TM1.ForPreAnt, TM1.ForFecAnt, TM1.For_item2, TM1.ForObs2, TM1.ForObsFac, TM1.ForLbTalao, TM1.EmprCod, TM1.CliCod, TM1.ForNumCol, TM1.IntCod, TM1.MatCod, TM1.TipColCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MacProCod, TM1.CodSol, TM1.ForCon, TM1.IntCodF, TM1.Fam_Cod FROM ((((((((((TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipColCod = TM1.TipColCod) LEFT JOIN TXPBARCAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) INNER JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = TM1.IntCod) INNER JOIN TXPMATICE T7 ON T7.EmprCod = TM1.EmprCod AND T7.MatCod = TM1.MatCod) INNER JOIN TXPFORCTR T8 ON T8.EmprCod = TM1.EmprCod AND T8.ForCon = TM1.ForCon) LEFT JOIN TXPSOLIDE T9 ON T9.EmprCod = TM1.EmprCod AND T9.CodSol = TM1.CodSol) LEFT JOIN TXPCMACPR T10 ON T10.EmprCod = TM1.EmprCod AND T10.MacProCod = TM1.MacProCod) LEFT JOIN TXPINTFAC T11 ON T11.EmprCod = TM1.EmprCod AND T11.IntCodF = TM1.IntCodF) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001221", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001222", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001223", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001224", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001225", "SELECT BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001226", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001227", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001228", "SELECT ForConDsc FROM TXPFORCTR WHERE EmprCod = ? AND ForCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001229", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001230", "SELECT EmprCod FROM TXPFAMTIP WHERE EmprCod = ? AND Fam_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001231", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001232", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001233", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001234", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ForSer > ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom > ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum > ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod > ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001235", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ForSer < ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom < ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum < ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001236", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ForCodExt, ForNumCli, ForNomCli, ForFec, ForUltMod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForUltLin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, ForEst, ForRGB, ForCosForm, ForTipArt, ForOpcCli, ForFecApr, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, ForTipT, For_item1, For_Reo, ForFecCtrl, ForFecCtrf, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForObsFac, ForLbTalao, EmprCod, CliCod, ForNumCol, IntCod, MatCod, TipColCod, BarCod, BarCodReo, BarCodPar, MacProCod, CodSol, ForCon, IntCodF, Fam_Cod, ObsUltLin, RecCorULin, ForSitCom, ComUltLin, ForCosUti, Sim_Ulin, Lb_CodL, Lb_CodC, ForcosH20, ForCosFab, ForCosFin, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T001237", "UPDATE TXPCFORMU SET ForCodExt=?, ForNumCli=?, ForNomCli=?, ForFec=?, ForUltMod=?, ForUltUti=?, ForPreKgm=?, ForPreMtr=?, ForPreDef=?, ForUltLin=?, ForPro=?, ForRelBan=?, PrecioA=?, PrecioM=?, ForTonal=?, ForNumArc=?, ForEst=?, ForRGB=?, ForCosForm=?, ForTipArt=?, ForOpcCli=?, ForFecApr=?, ForUsrCod=?, ForFecHor=?, ForObsM=?, ForPInc=?, ForSerDsc=?, ForNomCli2=?, ForUsrCre=?, ForFecCre=?, ForNomCli3=?, ForOpNum=?, ForBlo=?, ForTipT=?, For_item1=?, For_Reo=?, ForFecCtrl=?, ForFecCtrf=?, ForKgUTin=?, ForKgTTin=?, ForCosTTi=?, UltEnsCod=?, ForPreFec=?, ForPreAnt=?, ForFecAnt=?, For_item2=?, ForObs2=?, ForObsFac=?, ForLbTalao=?, ForNumCol=?, IntCod=?, MatCod=?, BarCod=?, BarCodReo=?, BarCodPar=?, MacProCod=?, CodSol=?, ForCon=?, IntCodF=?, Fam_Cod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T001238", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T001239", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001240", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001241", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001242", "SELECT BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001243", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001244", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001245", "SELECT ForConDsc FROM TXPFORCTR WHERE EmprCod = ? AND ForCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001246", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001247", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001248", "SELECT IntDscF FROM TXPINTFAC WHERE EmprCod = ? AND IntCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001249", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001250", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001251", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001252", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001253", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001254", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001255", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001256", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001257", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001258", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001259", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001260", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001261", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001262", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001263", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001264", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL, T2.ProForDsc, T1.ProForFR, T1.ProFoNPrg, T1.ProForrbn, T1.ProForVol, T1.ProForMq, T1.ProForH2O, T1.EmprCod, T1.ProForCod, T1.CliCod FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.ProForL = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001265", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001266", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T001267", "INSERT INTO TXPLFORMU(ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, ProForCod, CliCod, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T001268", "UPDATE TXPLFORMU SET ProForFR=?, ProFoNPrg=?, ProForrbn=?, ProForVol=?, ProForMq=?, ProForH2O=?, ProForCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T001269", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new ForEachCursor("T001270", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001271", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001272", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001273", "SELECT EmprCod FROM TXPFAMTIP WHERE EmprCod = ? AND Fam_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 26);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[87])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(47,5);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDate(48);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(49, 30);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(52, 8);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(53, 3);
               ((int[]) buf[102])[0] = rslt.getInt(54);
               ((int[]) buf[103])[0] = rslt.getInt(55);
               ((byte[]) buf[104])[0] = rslt.getByte(56);
               ((short[]) buf[105])[0] = rslt.getShort(57);
               ((byte[]) buf[106])[0] = rslt.getByte(58);
               ((int[]) buf[107])[0] = rslt.getInt(59);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((byte[]) buf[109])[0] = rslt.getByte(60);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(62, 6);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((short[]) buf[115])[0] = rslt.getShort(63);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((byte[]) buf[117])[0] = rslt.getByte(64);
               ((byte[]) buf[118])[0] = rslt.getByte(65);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(66);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 26);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[87])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(47,5);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDate(48);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(49, 30);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getVarchar(50);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((String[]) buf[97])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(52, 8);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(53, 3);
               ((int[]) buf[102])[0] = rslt.getInt(54);
               ((int[]) buf[103])[0] = rslt.getInt(55);
               ((byte[]) buf[104])[0] = rslt.getByte(56);
               ((short[]) buf[105])[0] = rslt.getShort(57);
               ((byte[]) buf[106])[0] = rslt.getByte(58);
               ((int[]) buf[107])[0] = rslt.getInt(59);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((byte[]) buf[109])[0] = rslt.getByte(60);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(62, 6);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((short[]) buf[115])[0] = rslt.getShort(63);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((byte[]) buf[117])[0] = rslt.getByte(64);
               ((byte[]) buf[118])[0] = rslt.getByte(65);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(66);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 30);
               ((String[]) buf[45])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 20);
               ((long[]) buf[52])[0] = rslt.getLong(30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(31,5);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(32);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDate(35);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[66])[0] = rslt.getGXDateTime(37);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(38);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(39);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(40, 26);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(41, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(42, 8);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDateTime(43);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((byte[]) buf[82])[0] = rslt.getByte(45);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(47);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(48, 30);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[92])[0] = rslt.getGXDateTime(50);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDateTime(51);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDate(56);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(57,5);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[108])[0] = rslt.getGXDate(58);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(59, 30);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getVarchar(60);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getVarchar(61);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getString(62, 8);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(63, 3);
               ((int[]) buf[119])[0] = rslt.getInt(64);
               ((int[]) buf[120])[0] = rslt.getInt(65);
               ((byte[]) buf[121])[0] = rslt.getByte(66);
               ((short[]) buf[122])[0] = rslt.getShort(67);
               ((byte[]) buf[123])[0] = rslt.getByte(68);
               ((int[]) buf[124])[0] = rslt.getInt(69);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((byte[]) buf[126])[0] = rslt.getByte(70);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(71, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(72, 6);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(73);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((byte[]) buf[134])[0] = rslt.getByte(74);
               ((byte[]) buf[135])[0] = rslt.getByte(75);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((short[]) buf[137])[0] = rslt.getShort(76);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               return;
            case 71 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
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
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               return;
            case 18 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 27 :
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
            case 28 :
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 32 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[21]).intValue());
               }
               stmt.setString(14, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 13);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[32]).intValue());
               }
               stmt.setString(20, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[35]).byteValue());
               }
               return;
            case 33 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[21]).intValue());
               }
               stmt.setString(14, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 13);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[32]).intValue());
               }
               stmt.setString(20, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[35]).byteValue());
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 2);
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
                  stmt.setString(6, (String)parms[11], 13);
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
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
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
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 20);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(21, ((Number) parms[41]).longValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[43], 5);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 8);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[53], false);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 300);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 26);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 20);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 8);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[65], false);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 30);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[69]).byteValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[73]).byteValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 30);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 1);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(40, (java.util.Date)parms[79], false);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(41, (java.util.Date)parms[81], false);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 1);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DATE );
               }
               else
               {
                  stmt.setDate(46, (java.util.Date)parms[91]);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 5);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DATE );
               }
               else
               {
                  stmt.setDate(48, (java.util.Date)parms[95]);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 30);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(50, (String)parms[99], 1000);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(51, (String)parms[101], 200);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 8);
               }
               stmt.setString(53, (String)parms[104], 3);
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(54, ((Number) parms[106]).intValue());
               }
               stmt.setInt(55, ((Number) parms[107]).intValue());
               stmt.setByte(56, ((Number) parms[108]).byteValue());
               stmt.setShort(57, ((Number) parms[109]).shortValue());
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[111]).byteValue());
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[113]).intValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[115]).byteValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[119], 6);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[121]).shortValue());
               }
               stmt.setByte(64, ((Number) parms[122]).byteValue());
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(65, ((Number) parms[124]).byteValue());
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[126]).shortValue());
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 20);
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[35]).longValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[43]);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 8);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[47], false);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 300);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 26);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 20);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 8);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(30, (java.util.Date)parms[59], false);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 30);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[63]).byteValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(34, ((Number) parms[67]).byteValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 30);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(37, (java.util.Date)parms[73], false);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[75], false);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DATE );
               }
               else
               {
                  stmt.setDate(43, (java.util.Date)parms[85]);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[87], 5);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DATE );
               }
               else
               {
                  stmt.setDate(45, (java.util.Date)parms[89]);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 30);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[93], 1000);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[95], 200);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[97], 8);
               }
               stmt.setInt(50, ((Number) parms[98]).intValue());
               stmt.setByte(51, ((Number) parms[99]).byteValue());
               stmt.setShort(52, ((Number) parms[100]).shortValue());
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[102]).intValue());
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(54, ((Number) parms[104]).byteValue());
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[106], 1);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[108], 6);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[110]).shortValue());
               }
               stmt.setByte(58, ((Number) parms[111]).byteValue());
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(59, ((Number) parms[113]).byteValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[115]).shortValue());
               }
               stmt.setString(61, (String)parms[116], 3);
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(62, ((Number) parms[118]).intValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[120], 16);
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[122], 13);
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(65, ((Number) parms[124]).intValue());
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(66, ((Number) parms[126]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 44 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               stmt.setString(6, (String)parms[9], 1);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setString(10, (String)parms[13], 6);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setString(12, (String)parms[15], 3);
               stmt.setString(13, (String)parms[16], 6);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[18]).intValue());
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[17]).byteValue());
               }
               stmt.setShort(14, ((Number) parms[18]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 71 :
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

