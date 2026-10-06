package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tens000_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5097TipDisDsc = httpContext.GetPar( "TipDisDsc") ;
         n5097TipDisDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdiscodQP0( A396EmprCod, A5097TipDisDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5097TipDisDsc = httpContext.GetPar( "TipDisDsc") ;
         n5097TipDisDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdiscodQP0( A396EmprCod, A5097TipDisDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h5098TipDisCod = httpContext.GetPar( "h5098TipDisCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatipdiscodQP817( A396EmprCod, h5098TipDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"LB_FORDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5553Lb_ForCod = httpContext.GetPar( "Lb_ForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asalb_fordscQP818( A396EmprCod, A5553Lb_ForCod) ;
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A583IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A626MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
         n626MatCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A626MatCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
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
         gxload_10( A396EmprCod, A1514MacProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A3316CodSol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5098TipDisCod = httpContext.GetPar( "TipDisCod") ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A5098TipDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5801Lab_CodCau = (short)(GXutil.lval( httpContext.GetPar( "Lab_CodCau"))) ;
         n5801Lab_CodCau = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A5801Lab_CodCau) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA DE ENSAYOS", ""), (short)(0)) ;
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
      nRC_GXsfl_445 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_445"))) ;
      nGXsfl_445_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_445_idx"))) ;
      sGXsfl_445_idx = httpContext.GetPar( "sGXsfl_445_idx") ;
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

   public tens000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tens000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tens000_impl.class ));
   }

   public tens000_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbLb_EstLab = new HTMLChoice();
      chkLb_RecPip = UIFactory.getCheckbox(this);
      chkLb_Envio = UIFactory.getCheckbox(this);
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
      if ( cmbLb_EstLab.getItemCount() > 0 )
      {
         A5699Lb_EstLab = (byte)(GXutil.lval( cmbLb_EstLab.getValidValue(GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLb_EstLab.setValue( GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstLab.getInternalname(), "Values", cmbLb_EstLab.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TENS000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "", "", "", "", "", 1, edtLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Serie", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ArtCod_Internalname, GXutil.rtrim( A5533Lb_ArtCod), GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ArtDsc_Internalname, GXutil.rtrim( A5534Lb_ArtDsc), GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Tipo de Articulo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A5535Lb_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5535Lb_TipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5535Lb_TipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TipArt_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Tipo de Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TipArtD_Internalname, GXutil.rtrim( A5552Lb_TipArtD), GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TipArtD_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre de Color Empresa", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ColNom_Internalname, GXutil.rtrim( A5536Lb_ColNom), GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ColNom_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero Color Empresa", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_ColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ColNum_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ColNomC_Internalname, GXutil.rtrim( A5538Lb_ColNomC), GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ColNomC_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ColNomC_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ColNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A5539Lb_ColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_ColNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ColNumC_Jsonclick, 0, "", "", "", "", "", 1, edtLb_ColNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cartaz del Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Cartaz_Internalname, GXutil.rtrim( A5540Lb_Cartaz), GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Cartaz_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Cartaz_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FechaE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FechaE_Internalname, localUtil.format(A5541Lb_FechaE, "99/99/99"), localUtil.format( A5541Lb_FechaE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FechaE_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FechaE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FechaE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FechaE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Hora Entrada", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HoraE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HoraE_Internalname, localUtil.ttoc( A5542Lb_HoraE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5542Lb_HoraE, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HoraE_Jsonclick, 0, "", "", "", "", "", 1, edtLb_HoraE_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HoraE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HoraE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Usuario Alta", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Usuario_Internalname, GXutil.rtrim( A5543Lb_Usuario), GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Usuario_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Usuario_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Fecha Modificacion", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FechaM_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FechaM_Internalname, localUtil.format(A5544Lb_FechaM, "99/99/99"), localUtil.format( A5544Lb_FechaM, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FechaM_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FechaM_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FechaM_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FechaM_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Hora Modificacion", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HoraM_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HoraM_Internalname, localUtil.ttoc( A5545Lb_HoraM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5545Lb_HoraM, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HoraM_Jsonclick, 0, "", "", "", "", "", 1, edtLb_HoraM_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HoraM_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HoraM_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Usuario Modificacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UsuM_Internalname, GXutil.rtrim( A5546Lb_UsuM), GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UsuM_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UsuM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Rb", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Rb_Internalname, GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Rb_Enabled!=0) ? localUtil.format( A5547Lb_Rb, "ZZZ9.99") : localUtil.format( A5547Lb_Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Rb_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Rb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Código Matiz", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A626MatCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatCod_Jsonclick, 0, "", "", "", "", "", 1, edtMatCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Descripción Matiz", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMatDsc_Internalname, GXutil.rtrim( A627MatDsc), GXutil.rtrim( localUtil.format( A627MatDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMatDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Solidez", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodSol_Internalname, GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCodSol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3316CodSol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodSol_Jsonclick, 0, "", "", "", "", "", 1, edtCodSol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDscSol_Internalname, GXutil.rtrim( A3317DscSol), GXutil.rtrim( localUtil.format( A3317DscSol, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscSol_Jsonclick, 0, "", "", "", "", "", 1, edtDscSol_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_Obs_Internalname, A5548Lb_Obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", (short)(0), 1, edtLb_Obs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Ultima Opcion Realizada", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UltOp_Internalname, GXutil.rtrim( A5549Lb_UltOp), GXutil.rtrim( localUtil.format( A5549Lb_UltOp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UltOp_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UltOp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Ultima Linea Procesos", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UltlPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_UltlPq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5550Lb_UltlPq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5550Lb_UltlPq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UltlPq_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UltlPq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Estado Ensayo", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_EstEns_Internalname, GXutil.ltrim( localUtil.ntoc( A5569Lb_EstEns, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_EstEns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5569Lb_EstEns), "9") : localUtil.format( DecimalUtil.doubleToDec(A5569Lb_EstEns), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_EstEns_Jsonclick, 0, "", "", "", "", "", 1, edtLb_EstEns_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Tipo de Ensayo", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tipo_Internalname, GXutil.rtrim( A5570Lb_Tipo), GXutil.rtrim( localUtil.format( A5570Lb_Tipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tipo_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Fecha del Cartaz", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_cartazf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_cartazf_Internalname, localUtil.format(A5594Lb_cartazf, "99/99/99"), localUtil.format( A5594Lb_cartazf, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_cartazf_Jsonclick, 0, "", "", "", "", "", 1, edtLb_cartazf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_cartazf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_cartazf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Tipo Malha", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_malha_Internalname, GXutil.ltrim( localUtil.ntoc( A5595Lb_malha, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_malha_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5595Lb_malha), "9") : localUtil.format( DecimalUtil.doubleToDec(A5595Lb_malha), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_malha_Jsonclick, 0, "", "", "", "", "", 1, edtLb_malha_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Reproduccion", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_reprod_Internalname, GXutil.ltrim( localUtil.ntoc( A5596Lb_reprod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_reprod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5596Lb_reprod), "9") : localUtil.format( DecimalUtil.doubleToDec(A5596Lb_reprod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_reprod_Jsonclick, 0, "", "", "", "", "", 1, edtLb_reprod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Tipo de Receta", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TipRec_Internalname, GXutil.ltrim( localUtil.ntoc( A5597Lb_TipRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TipRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5597Lb_TipRec), "9") : localUtil.format( DecimalUtil.doubleToDec(A5597Lb_TipRec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TipRec_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TipRec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Imprimido?", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_impreso_Internalname, GXutil.ltrim( localUtil.ntoc( A5598Lb_impreso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_impreso_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5598Lb_impreso), "9") : localUtil.format( DecimalUtil.doubleToDec(A5598Lb_impreso), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_impreso_Jsonclick, 0, "", "", "", "", "", 1, edtLb_impreso_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Rgb Color", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_RGB_Internalname, GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_RGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5599Lb_RGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5599Lb_RGB), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_RGB_Jsonclick, 0, "", "", "", "", "", 1, edtLb_RGB_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Nº Identificacion de Malha Cru", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_IDM_Internalname, GXutil.ltrim( localUtil.ntoc( A5600Lb_IDM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_IDM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5600Lb_IDM), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5600Lb_IDM), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_IDM_Jsonclick, 0, "", "", "", "", "", 1, edtLb_IDM_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Temperatura Tinte", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tempt_Internalname, GXutil.ltrim( localUtil.ntoc( A5601Lb_Tempt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Tempt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tempt_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tempt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Temperatura 2", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Temp2_Internalname, GXutil.ltrim( localUtil.ntoc( A5610Lb_Temp2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Temp2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Temp2_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Temp2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Temperatura 3", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Temp3_Internalname, GXutil.ltrim( localUtil.ntoc( A5611Lb_Temp3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Temp3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Temp3_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Temp3_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Talao Cliente", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Talao_Internalname, GXutil.rtrim( A5700Lb_Talao), GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Talao_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Talao_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Local_Internalname, GXutil.rtrim( A5701Lb_Local), GXutil.rtrim( localUtil.format( A5701Lb_Local, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Local_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Local_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Estado Ensayo (0=Planif, 1=Lab)", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLb_EstLab, cmbLb_EstLab.getInternalname(), GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0)), 1, cmbLb_EstLab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbLb_EstLab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "", true, (byte)(0), "HLP_TENS000.htm");
      cmbLb_EstLab.setValue( GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstLab.getInternalname(), "Values", cmbLb_EstLab.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Ultimo Numero Opcion", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numopu_Internalname, GXutil.ltrim( localUtil.ntoc( A5717Lb_numopu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_numopu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5717Lb_numopu), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5717Lb_numopu), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numopu_Jsonclick, 0, "", "", "", "", "", 1, edtLb_numopu_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Codigo Causa Desvio", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLab_CodCau_Internalname, GXutil.ltrim( localUtil.ntoc( A5801Lab_CodCau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLab_CodCau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5801Lab_CodCau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5801Lab_CodCau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLab_CodCau_Jsonclick, 0, "", "", "", "", "", 1, edtLab_CodCau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Descripcion Causa", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLab_DscCau_Internalname, GXutil.rtrim( A5802Lab_DscCau), GXutil.rtrim( localUtil.format( A5802Lab_DscCau, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLab_DscCau_Jsonclick, 0, "", "", "", "", "", 1, edtLab_DscCau_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Dias Desvio,Fech Ent-Fech Env", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLab_desvio_Internalname, GXutil.ltrim( localUtil.ntoc( A5901Lab_desvio, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLab_desvio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5901Lab_desvio), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5901Lab_desvio), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLab_desvio_Jsonclick, 0, "", "", "", "", "", 1, edtLab_desvio_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Codigo Tipo Disposicion", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDisCod_Internalname, GXutil.rtrim( h5098TipDisCod), GXutil.rtrim( localUtil.format( h5098TipDisCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipDisCod_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Descripcion Tipo Disposicion", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDisDsc_Internalname, GXutil.rtrim( A5097TipDisDsc), GXutil.rtrim( localUtil.format( A5097TipDisDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDisDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipDisDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Numero de Fibras", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_nfibras_Internalname, GXutil.ltrim( localUtil.ntoc( A5988Lb_nfibras, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_nfibras_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_nfibras_Jsonclick, 0, "", "", "", "", "", 1, edtLb_nfibras_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Peso de Muestra (Gramos)", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_pesom_Internalname, GXutil.ltrim( localUtil.ntoc( A6056Lb_pesom, (byte)(9), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_pesom_Enabled!=0) ? localUtil.format( A6056Lb_pesom, "ZZZZ9.999") : localUtil.format( A6056Lb_pesom, "ZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_pesom_Jsonclick, 0, "", "", "", "", "", 1, edtLb_pesom_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Cantidad de Baño (ml)", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_volum_Internalname, GXutil.ltrim( localUtil.ntoc( A6057Lb_volum, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_volum_Enabled!=0) ? localUtil.format( A6057Lb_volum, "ZZZ9.99") : localUtil.format( A6057Lb_volum, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_volum_Jsonclick, 0, "", "", "", "", "", 1, edtLb_volum_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Codigo de MacroProceso", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProCod_Internalname, GXutil.rtrim( A1514MacProCod), GXutil.rtrim( localUtil.format( A1514MacProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProCod_Jsonclick, 0, "", "", "", "", "", 1, edtMacProCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Descripción de MacroProceso", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacProDsc_Internalname, GXutil.rtrim( A1515MacProDsc), GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMacProDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Pantone Informacion Color Cli", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Pantone_Internalname, GXutil.rtrim( A6546Lb_Pantone), GXutil.rtrim( localUtil.format( A6546Lb_Pantone, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Pantone_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Pantone_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Codigo Pedido Ensayo Cliente", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_PedCod_Internalname, GXutil.rtrim( A6618Lb_PedCod), GXutil.rtrim( localUtil.format( A6618Lb_PedCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_PedCod_Jsonclick, 0, "", "", "", "", "", 1, edtLb_PedCod_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Priorizar Ensayo", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_PriEns_Internalname, GXutil.rtrim( A6644Lb_PriEns), GXutil.rtrim( localUtil.format( A6644Lb_PriEns, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_PriEns_Jsonclick, 0, "", "", "", "", "", 1, edtLb_PriEns_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Trama", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra1_Internalname, GXutil.rtrim( A6653Lb_Tra1), GXutil.rtrim( localUtil.format( A6653Lb_Tra1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra1_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Porcent", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP1_Internalname, GXutil.ltrim( localUtil.ntoc( A6654Lb_TraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6654Lb_TraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6654Lb_TraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP1_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Trama2", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra2_Internalname, GXutil.rtrim( A6655Lb_Tra2), GXutil.rtrim( localUtil.format( A6655Lb_Tra2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra2_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Porcent2", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP2_Internalname, GXutil.ltrim( localUtil.ntoc( A6656Lb_TraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6656Lb_TraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6656Lb_TraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP2_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Trama3", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra3_Internalname, GXutil.rtrim( A6657Lb_Tra3), GXutil.rtrim( localUtil.format( A6657Lb_Tra3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra3_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Porcent3", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP3_Internalname, GXutil.ltrim( localUtil.ntoc( A6658Lb_TraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6658Lb_TraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6658Lb_TraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,351);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP3_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Fibra 4", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra4_Internalname, GXutil.rtrim( A6842Lb_Tra4), GXutil.rtrim( localUtil.format( A6842Lb_Tra4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra4_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra4_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Por4", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP4_Internalname, GXutil.ltrim( localUtil.ntoc( A6843Lb_TraP4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6843Lb_TraP4), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6843Lb_TraP4), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP4_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP4_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Fibra5", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra5_Internalname, GXutil.rtrim( A6844Lb_Tra5), GXutil.rtrim( localUtil.format( A6844Lb_Tra5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra5_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra5_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Porc 5", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP5_Internalname, GXutil.ltrim( localUtil.ntoc( A6845Lb_TraP5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6845Lb_TraP5), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6845Lb_TraP5), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,371);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP5_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP5_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Fibra 6", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Tra6_Internalname, GXutil.rtrim( A6846Lb_Tra6), GXutil.rtrim( localUtil.format( A6846Lb_Tra6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,376);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Tra6_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Tra6_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "Porc 6", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TraP6_Internalname, GXutil.ltrim( localUtil.ntoc( A6847Lb_TraP6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TraP6_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6847Lb_TraP6), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6847Lb_TraP6), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TraP6_Jsonclick, 0, "", "", "", "", "", 1, edtLb_TraP6_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Hilasa", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Hila_Internalname, GXutil.rtrim( A7780Lb_Hila), GXutil.rtrim( localUtil.format( A7780Lb_Hila, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Hila_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Hila_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "N colores solicitados", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NCoS_Internalname, GXutil.ltrim( localUtil.ntoc( A8946Lb_NCoS, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NCoS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8946Lb_NCoS), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8946Lb_NCoS), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NCoS_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NCoS_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "N Opciones realizados", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NOpR_Internalname, GXutil.ltrim( localUtil.ntoc( A8947Lb_NOpR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NOpR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8947Lb_NOpR), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8947Lb_NOpR), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NOpR_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NOpR_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "N colores Enviados", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A8948Lb_NCoE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8948Lb_NCoE), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8948Lb_NCoE), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NCoE_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NCoE_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "N Opciones Enviados", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NOpE_Internalname, GXutil.ltrim( localUtil.ntoc( A8949Lb_NOpE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NOpE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8949Lb_NOpE), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8949Lb_NOpE), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NOpE_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NOpE_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "N Opciones Rechazados", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NOpN_Internalname, GXutil.ltrim( localUtil.ntoc( A8950Lb_NOpN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NOpN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8950Lb_NOpN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8950Lb_NOpN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NOpN_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NOpN_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "Ultima Fecha Envio LAB DIP", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecE_Internalname, localUtil.format(A8951Lb_FecE, "99/99/99"), localUtil.format( A8951Lb_FecE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecE_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "Ultima Fecha Rechazo", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecN_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecN_Internalname, localUtil.format(A8952Lb_FecN, "99/99/99"), localUtil.format( A8952Lb_FecN, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecN_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecN_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecN_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "Fecha Aceptacion", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecR_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecR_Internalname, localUtil.format(A8953Lb_FecR, "99/99/99"), localUtil.format( A8953Lb_FecR, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecR_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecR_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecR_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecR_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENS000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "Dif Dias Envio y Recepcion", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_diasER_Internalname, GXutil.ltrim( localUtil.ntoc( A8954Lb_diasER, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_diasER_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8954Lb_diasER), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8954Lb_diasER), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_diasER_Jsonclick, 0, "", "", "", "", "", 1, edtLb_diasER_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "Obs Cliente Lab Dip", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_obsCl_Internalname, A9900Lb_obsCl, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,436);\"", (short)(0), 1, edtLb_obsCl_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "Obs Lab", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_obsLb_Internalname, A10883Lb_obsLb, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,441);\"", (short)(0), 1, edtLb_obsLb_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TENS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol445( ) ;
      nGXsfl_445_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount818 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_818 = (short)(1) ;
            scanStartQP818( ) ;
            while ( RcdFound818 != 0 )
            {
               init_level_properties818( ) ;
               getByPrimaryKeyQP818( ) ;
               addRowQP818( ) ;
               scanNextQP818( ) ;
            }
            scanEndQP818( ) ;
            nBlankRcdCount818 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalQP818( ) ;
         standaloneModalQP818( ) ;
         sMode818 = Gx_mode ;
         while ( nGXsfl_445_idx < nRC_GXsfl_445 )
         {
            bGXsfl_445_Refreshing = true ;
            readRowQP818( ) ;
            edtavnRcdDeleted_818_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_818_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_818_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_818_Enabled), 5, 0), !bGXsfl_445_Refreshing);
            edtLb_lineaPq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPQ_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_445_Refreshing);
            edtLb_ForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORCOD_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_ForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForCod_Enabled), 5, 0), !bGXsfl_445_Refreshing);
            edtLb_ForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORDSC_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_ForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForDsc_Enabled), 5, 0), !bGXsfl_445_Refreshing);
            chkLb_RecPip.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_RECPIP_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_RecPip.getEnabled(), 5, 0), !bGXsfl_445_Refreshing);
            chkLb_Envio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_ENVIO_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_Envio.getEnabled(), 5, 0), !bGXsfl_445_Refreshing);
            if ( ( nRcdExists_818 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalQP818( ) ;
            }
            sendRowQP818( ) ;
            bGXsfl_445_Refreshing = false ;
         }
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount818 = (short)(5) ;
         nRcdExists_818 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartQP818( ) ;
            while ( RcdFound818 != 0 )
            {
               sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_445818( ) ;
               init_level_properties818( ) ;
               standaloneNotModalQP818( ) ;
               getByPrimaryKeyQP818( ) ;
               standaloneModalQP818( ) ;
               addRowQP818( ) ;
               scanNextQP818( ) ;
            }
            scanEndQP818( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode818 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_445818( ) ;
      initAllQP818( ) ;
      init_level_properties818( ) ;
      nRcdExists_818 = (short)(0) ;
      nIsMod_818 = (short)(0) ;
      nRcdDeleted_818 = (short)(0) ;
      nBlankRcdCount818 = (short)(nBlankRcdUsr818+nBlankRcdCount818) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount818 > 0 )
      {
         standaloneNotModalQP818( ) ;
         standaloneModalQP818( ) ;
         addRowQP818( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_lineaPq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount818 = (short)(nBlankRcdCount818-1) ;
      }
      Gx_mode = sMode818 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 454,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 455,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 457,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 458,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TENS000.htm");
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
         Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5533Lb_ArtCod = httpContext.cgiGet( "Z5533Lb_ArtCod") ;
         Z5534Lb_ArtDsc = httpContext.cgiGet( "Z5534Lb_ArtDsc") ;
         Z5535Lb_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z5535Lb_TipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5552Lb_TipArtD = httpContext.cgiGet( "Z5552Lb_TipArtD") ;
         Z5536Lb_ColNom = httpContext.cgiGet( "Z5536Lb_ColNom") ;
         Z5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z5537Lb_ColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5538Lb_ColNomC = httpContext.cgiGet( "Z5538Lb_ColNomC") ;
         Z5539Lb_ColNumC = (int)(localUtil.ctol( httpContext.cgiGet( "Z5539Lb_ColNumC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5540Lb_Cartaz = httpContext.cgiGet( "Z5540Lb_Cartaz") ;
         Z5541Lb_FechaE = localUtil.ctod( httpContext.cgiGet( "Z5541Lb_FechaE"), 0) ;
         Z5542Lb_HoraE = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5542Lb_HoraE"), 0)) ;
         Z5543Lb_Usuario = httpContext.cgiGet( "Z5543Lb_Usuario") ;
         Z5544Lb_FechaM = localUtil.ctod( httpContext.cgiGet( "Z5544Lb_FechaM"), 0) ;
         Z5545Lb_HoraM = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5545Lb_HoraM"), 0)) ;
         Z5546Lb_UsuM = httpContext.cgiGet( "Z5546Lb_UsuM") ;
         Z5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( "Z5547Lb_Rb")) ;
         Z5549Lb_UltOp = httpContext.cgiGet( "Z5549Lb_UltOp") ;
         Z5550Lb_UltlPq = (short)(localUtil.ctol( httpContext.cgiGet( "Z5550Lb_UltlPq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5569Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5569Lb_EstEns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5570Lb_Tipo = httpContext.cgiGet( "Z5570Lb_Tipo") ;
         Z5594Lb_cartazf = localUtil.ctod( httpContext.cgiGet( "Z5594Lb_cartazf"), 0) ;
         Z5595Lb_malha = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5595Lb_malha"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5596Lb_reprod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5596Lb_reprod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5597Lb_TipRec = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5597Lb_TipRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5598Lb_impreso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5598Lb_impreso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( "Z5599Lb_RGB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z5600Lb_IDM = (int)(localUtil.ctol( httpContext.cgiGet( "Z5600Lb_IDM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5601Lb_Tempt = (short)(localUtil.ctol( httpContext.cgiGet( "Z5601Lb_Tempt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5610Lb_Temp2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5610Lb_Temp2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5611Lb_Temp3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5611Lb_Temp3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5700Lb_Talao = httpContext.cgiGet( "Z5700Lb_Talao") ;
         Z5701Lb_Local = httpContext.cgiGet( "Z5701Lb_Local") ;
         Z5699Lb_EstLab = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5699Lb_EstLab"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5717Lb_numopu = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5717Lb_numopu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5901Lab_desvio = (short)(localUtil.ctol( httpContext.cgiGet( "Z5901Lab_desvio"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5988Lb_nfibras = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5988Lb_nfibras"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6056Lb_pesom = localUtil.ctond( httpContext.cgiGet( "Z6056Lb_pesom")) ;
         Z6057Lb_volum = localUtil.ctond( httpContext.cgiGet( "Z6057Lb_volum")) ;
         Z6546Lb_Pantone = httpContext.cgiGet( "Z6546Lb_Pantone") ;
         Z6618Lb_PedCod = httpContext.cgiGet( "Z6618Lb_PedCod") ;
         Z6644Lb_PriEns = httpContext.cgiGet( "Z6644Lb_PriEns") ;
         Z6653Lb_Tra1 = httpContext.cgiGet( "Z6653Lb_Tra1") ;
         Z6654Lb_TraP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6654Lb_TraP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6655Lb_Tra2 = httpContext.cgiGet( "Z6655Lb_Tra2") ;
         Z6656Lb_TraP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6656Lb_TraP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6657Lb_Tra3 = httpContext.cgiGet( "Z6657Lb_Tra3") ;
         Z6658Lb_TraP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6658Lb_TraP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6842Lb_Tra4 = httpContext.cgiGet( "Z6842Lb_Tra4") ;
         Z6843Lb_TraP4 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6843Lb_TraP4"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6844Lb_Tra5 = httpContext.cgiGet( "Z6844Lb_Tra5") ;
         Z6845Lb_TraP5 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6845Lb_TraP5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6846Lb_Tra6 = httpContext.cgiGet( "Z6846Lb_Tra6") ;
         Z6847Lb_TraP6 = (short)(localUtil.ctol( httpContext.cgiGet( "Z6847Lb_TraP6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7780Lb_Hila = httpContext.cgiGet( "Z7780Lb_Hila") ;
         Z8946Lb_NCoS = (int)(localUtil.ctol( httpContext.cgiGet( "Z8946Lb_NCoS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8947Lb_NOpR = (int)(localUtil.ctol( httpContext.cgiGet( "Z8947Lb_NOpR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8948Lb_NCoE = (int)(localUtil.ctol( httpContext.cgiGet( "Z8948Lb_NCoE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8949Lb_NOpE = (int)(localUtil.ctol( httpContext.cgiGet( "Z8949Lb_NOpE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8950Lb_NOpN = (int)(localUtil.ctol( httpContext.cgiGet( "Z8950Lb_NOpN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8951Lb_FecE = localUtil.ctod( httpContext.cgiGet( "Z8951Lb_FecE"), 0) ;
         Z8952Lb_FecN = localUtil.ctod( httpContext.cgiGet( "Z8952Lb_FecN"), 0) ;
         Z8953Lb_FecR = localUtil.ctod( httpContext.cgiGet( "Z8953Lb_FecR"), 0) ;
         Z8954Lb_diasER = (int)(localUtil.ctol( httpContext.cgiGet( "Z8954Lb_diasER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9900Lb_obsCl = httpContext.cgiGet( "Z9900Lb_obsCl") ;
         Z10883Lb_obsLb = httpContext.cgiGet( "Z10883Lb_obsLb") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z626MatCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z626MatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1514MacProCod = httpContext.cgiGet( "Z1514MacProCod") ;
         Z3316CodSol = (short)(localUtil.ctol( httpContext.cgiGet( "Z3316CodSol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5098TipDisCod = httpContext.cgiGet( "Z5098TipDisCod") ;
         Z5801Lab_CodCau = (short)(localUtil.ctol( httpContext.cgiGet( "Z5801Lab_CodCau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_445 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_445"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5098TipDisCod = httpContext.cgiGet( "GXHCTIPDISCOD") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5532Lb_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         }
         else
         {
            A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5533Lb_ArtCod", A5533Lb_ArtCod);
         A5534Lb_ArtDsc = httpContext.cgiGet( edtLb_ArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5534Lb_ArtDsc", A5534Lb_ArtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5535Lb_TipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5535Lb_TipArt), 4, 0));
         }
         else
         {
            A5535Lb_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5535Lb_TipArt), 4, 0));
         }
         A5552Lb_TipArtD = httpContext.cgiGet( edtLb_TipArtD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5552Lb_TipArtD", A5552Lb_TipArtD);
         A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5536Lb_ColNom", A5536Lb_ColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_COLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_ColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5537Lb_ColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
         }
         else
         {
            A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
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
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5538Lb_ColNomC", A5538Lb_ColNomC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_ColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_ColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_COLNUMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_ColNumC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5539Lb_ColNumC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5539Lb_ColNumC), 6, 0));
         }
         else
         {
            A5539Lb_ColNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5539Lb_ColNumC), 6, 0));
         }
         A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5540Lb_Cartaz", A5540Lb_Cartaz);
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FechaE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECHAE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_FechaE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5541Lb_FechaE = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         }
         else
         {
            A5541Lb_FechaE = localUtil.ctod( httpContext.cgiGet( edtLb_FechaE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HoraE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HORAE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_HoraE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A5542Lb_HoraE = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraE_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5543Lb_Usuario = httpContext.cgiGet( edtLb_Usuario_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5543Lb_Usuario", A5543Lb_Usuario);
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FechaM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECHAM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_FechaM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5544Lb_FechaM = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
         }
         else
         {
            A5544Lb_FechaM = localUtil.ctod( httpContext.cgiGet( edtLb_FechaM_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HoraM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HORAM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_HoraM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A5545Lb_HoraM = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraM_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5546Lb_UsuM = httpContext.cgiGet( edtLb_UsuM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5546Lb_UsuM", A5546Lb_UsuM);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_RB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_Rb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5547Lb_Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrimstr( A5547Lb_Rb, 7, 2));
         }
         else
         {
            A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrimstr( A5547Lb_Rb, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtIntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A583IntCod = (byte)(0) ;
            n583IntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         }
         else
         {
            A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n583IntCod = false ;
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
            n626MatCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         }
         else
         {
            A626MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n626MatCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         }
         A627MatDsc = httpContext.cgiGet( edtMatDsc_Internalname) ;
         n627MatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
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
         A5548Lb_Obs = httpContext.cgiGet( edtLb_Obs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5548Lb_Obs", A5548Lb_Obs);
         A5549Lb_UltOp = httpContext.cgiGet( edtLb_UltOp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5549Lb_UltOp", A5549Lb_UltOp);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltlPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltlPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_ULTLPQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_UltlPq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5550Lb_UltlPq = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         }
         else
         {
            A5550Lb_UltlPq = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_UltlPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_EstEns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_EstEns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_ESTENS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_EstEns_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5569Lb_EstEns = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.str( A5569Lb_EstEns, 1, 0));
         }
         else
         {
            A5569Lb_EstEns = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_EstEns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.str( A5569Lb_EstEns, 1, 0));
         }
         A5570Lb_Tipo = httpContext.cgiGet( edtLb_Tipo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5570Lb_Tipo", A5570Lb_Tipo);
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_cartazf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_CARTAZF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_cartazf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5594Lb_cartazf = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         }
         else
         {
            A5594Lb_cartazf = localUtil.ctod( httpContext.cgiGet( edtLb_cartazf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_malha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_malha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_MALHA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_malha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5595Lb_malha = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.str( A5595Lb_malha, 1, 0));
         }
         else
         {
            A5595Lb_malha = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_malha_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.str( A5595Lb_malha, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_reprod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_reprod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_REPROD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_reprod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5596Lb_reprod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.str( A5596Lb_reprod, 1, 0));
         }
         else
         {
            A5596Lb_reprod = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_reprod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.str( A5596Lb_reprod, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TipRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TipRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TIPREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TipRec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5597Lb_TipRec = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.str( A5597Lb_TipRec, 1, 0));
         }
         else
         {
            A5597Lb_TipRec = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_TipRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.str( A5597Lb_TipRec, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_impreso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_impreso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_IMPRESO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_impreso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5598Lb_impreso = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.str( A5598Lb_impreso, 1, 0));
         }
         else
         {
            A5598Lb_impreso = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_impreso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.str( A5598Lb_impreso, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_RGB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_RGB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5599Lb_RGB = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
         }
         else
         {
            A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_IDM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_IDM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_IDM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_IDM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5600Lb_IDM = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5600Lb_IDM), 8, 0));
         }
         else
         {
            A5600Lb_IDM = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_IDM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5600Lb_IDM), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Tempt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Tempt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TEMPT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_Tempt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5601Lb_Tempt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5601Lb_Tempt), 4, 0));
         }
         else
         {
            A5601Lb_Tempt = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_Tempt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5601Lb_Tempt), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Temp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Temp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TEMP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_Temp2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5610Lb_Temp2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5610Lb_Temp2), 4, 0));
         }
         else
         {
            A5610Lb_Temp2 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_Temp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5610Lb_Temp2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Temp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Temp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TEMP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_Temp3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5611Lb_Temp3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5611Lb_Temp3), 4, 0));
         }
         else
         {
            A5611Lb_Temp3 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_Temp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5611Lb_Temp3), 4, 0));
         }
         A5700Lb_Talao = httpContext.cgiGet( edtLb_Talao_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5700Lb_Talao", A5700Lb_Talao);
         A5701Lb_Local = httpContext.cgiGet( edtLb_Local_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5701Lb_Local", A5701Lb_Local);
         cmbLb_EstLab.setName( cmbLb_EstLab.getInternalname() );
         cmbLb_EstLab.setValue( httpContext.cgiGet( cmbLb_EstLab.getInternalname()) );
         A5699Lb_EstLab = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_EstLab.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numopu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numopu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMOPU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_numopu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5717Lb_numopu = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5717Lb_numopu), 2, 0));
         }
         else
         {
            A5717Lb_numopu = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numopu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5717Lb_numopu), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLab_CodCau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLab_CodCau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LAB_CODCAU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLab_CodCau_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5801Lab_CodCau = (short)(0) ;
            n5801Lab_CodCau = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
         }
         else
         {
            A5801Lab_CodCau = (short)(localUtil.ctol( httpContext.cgiGet( edtLab_CodCau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5801Lab_CodCau = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
         }
         A5802Lab_DscCau = httpContext.cgiGet( edtLab_DscCau_Internalname) ;
         n5802Lab_DscCau = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLab_desvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLab_desvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LAB_DESVIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLab_desvio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5901Lab_desvio = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5901Lab_desvio), 4, 0));
         }
         else
         {
            A5901Lab_desvio = (short)(localUtil.ctol( httpContext.cgiGet( edtLab_desvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5901Lab_desvio), 4, 0));
         }
         h5098TipDisCod = httpContext.cgiGet( edtTipDisCod_Internalname) ;
         A5097TipDisDsc = httpContext.cgiGet( edtTipDisDsc_Internalname) ;
         n5097TipDisDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_nfibras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_nfibras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NFIBRAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_nfibras_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5988Lb_nfibras = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5988Lb_nfibras), 2, 0));
         }
         else
         {
            A5988Lb_nfibras = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_nfibras_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5988Lb_nfibras), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_pesom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_pesom_Internalname)), DecimalUtil.stringToDec("99999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_PESOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_pesom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6056Lb_pesom = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrimstr( A6056Lb_pesom, 9, 3));
         }
         else
         {
            A6056Lb_pesom = localUtil.ctond( httpContext.cgiGet( edtLb_pesom_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrimstr( A6056Lb_pesom, 9, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_volum_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_volum_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_VOLUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_volum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6057Lb_volum = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrimstr( A6057Lb_volum, 7, 2));
         }
         else
         {
            A6057Lb_volum = localUtil.ctond( httpContext.cgiGet( edtLb_volum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrimstr( A6057Lb_volum, 7, 2));
         }
         A1514MacProCod = httpContext.cgiGet( edtMacProCod_Internalname) ;
         n1514MacProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A1515MacProDsc = httpContext.cgiGet( edtMacProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6546Lb_Pantone = httpContext.cgiGet( edtLb_Pantone_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6546Lb_Pantone", A6546Lb_Pantone);
         A6618Lb_PedCod = httpContext.cgiGet( edtLb_PedCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6618Lb_PedCod", A6618Lb_PedCod);
         A6644Lb_PriEns = httpContext.cgiGet( edtLb_PriEns_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6644Lb_PriEns", A6644Lb_PriEns);
         A6653Lb_Tra1 = httpContext.cgiGet( edtLb_Tra1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6653Lb_Tra1", A6653Lb_Tra1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6654Lb_TraP1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6654Lb_TraP1), 3, 0));
         }
         else
         {
            A6654Lb_TraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6654Lb_TraP1), 3, 0));
         }
         A6655Lb_Tra2 = httpContext.cgiGet( edtLb_Tra2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6655Lb_Tra2", A6655Lb_Tra2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6656Lb_TraP2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6656Lb_TraP2), 3, 0));
         }
         else
         {
            A6656Lb_TraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6656Lb_TraP2), 3, 0));
         }
         A6657Lb_Tra3 = httpContext.cgiGet( edtLb_Tra3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6657Lb_Tra3", A6657Lb_Tra3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6658Lb_TraP3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6658Lb_TraP3), 3, 0));
         }
         else
         {
            A6658Lb_TraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6658Lb_TraP3), 3, 0));
         }
         A6842Lb_Tra4 = httpContext.cgiGet( edtLb_Tra4_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6842Lb_Tra4", A6842Lb_Tra4);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP4");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6843Lb_TraP4 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6843Lb_TraP4), 3, 0));
         }
         else
         {
            A6843Lb_TraP4 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6843Lb_TraP4), 3, 0));
         }
         A6844Lb_Tra5 = httpContext.cgiGet( edtLb_Tra5_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6844Lb_Tra5", A6844Lb_Tra5);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP5");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP5_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6845Lb_TraP5 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6845Lb_TraP5), 3, 0));
         }
         else
         {
            A6845Lb_TraP5 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6845Lb_TraP5), 3, 0));
         }
         A6846Lb_Tra6 = httpContext.cgiGet( edtLb_Tra6_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6846Lb_Tra6", A6846Lb_Tra6);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TraP6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TRAP6");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TraP6_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6847Lb_TraP6 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6847Lb_TraP6), 3, 0));
         }
         else
         {
            A6847Lb_TraP6 = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TraP6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6847Lb_TraP6), 3, 0));
         }
         A7780Lb_Hila = httpContext.cgiGet( edtLb_Hila_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7780Lb_Hila", A7780Lb_Hila);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NCoS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NCoS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NCOS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_NCoS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8946Lb_NCoS = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8946Lb_NCoS), 8, 0));
         }
         else
         {
            A8946Lb_NCoS = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NCoS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8946Lb_NCoS), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NOPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_NOpR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8947Lb_NOpR = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8947Lb_NOpR), 8, 0));
         }
         else
         {
            A8947Lb_NOpR = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NOpR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8947Lb_NOpR), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NCOE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_NCoE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8948Lb_NCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8948Lb_NCoE), 8, 0));
         }
         else
         {
            A8948Lb_NCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8948Lb_NCoE), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NOPE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_NOpE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8949Lb_NOpE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8949Lb_NOpE), 8, 0));
         }
         else
         {
            A8949Lb_NOpE = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NOpE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8949Lb_NOpE), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NOpN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NOPN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_NOpN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8950Lb_NOpN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8950Lb_NOpN), 8, 0));
         }
         else
         {
            A8950Lb_NOpN = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NOpN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8950Lb_NOpN), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_FecE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8951Lb_FecE = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
         }
         else
         {
            A8951Lb_FecE = localUtil.ctod( httpContext.cgiGet( edtLb_FecE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecN_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_FecN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8952Lb_FecN = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
         }
         else
         {
            A8952Lb_FecN = localUtil.ctod( httpContext.cgiGet( edtLb_FecN_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_FecR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8953Lb_FecR = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
         }
         else
         {
            A8953Lb_FecR = localUtil.ctod( httpContext.cgiGet( edtLb_FecR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_diasER_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_diasER_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_DIASER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_diasER_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8954Lb_diasER = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8954Lb_diasER), 6, 0));
         }
         else
         {
            A8954Lb_diasER = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_diasER_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8954Lb_diasER), 6, 0));
         }
         A9900Lb_obsCl = httpContext.cgiGet( edtLb_obsCl_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9900Lb_obsCl", A9900Lb_obsCl);
         A10883Lb_obsLb = httpContext.cgiGet( edtLb_obsLb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10883Lb_obsLb", A10883Lb_obsLb);
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
            A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
            initAllQP817( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_818_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_818_Enabled), 5, 0), !bGXsfl_445_Refreshing);
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
      disableAttributesQP817( ) ;
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

   public void confirm_QP0( )
   {
      beforeValidateQP817( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsQP817( ) ;
         }
         else
         {
            checkExtendedTableQP817( ) ;
            if ( AnyError == 0 )
            {
               zmQP817( 5) ;
               zmQP817( 6) ;
               zmQP817( 7) ;
               zmQP817( 8) ;
               zmQP817( 9) ;
               zmQP817( 10) ;
               zmQP817( 11) ;
               zmQP817( 12) ;
               zmQP817( 13) ;
            }
            closeExtendedTableCursorsQP817( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode817 = Gx_mode ;
         confirm_QP818( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode817 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesQP0( ) ;
      }
   }

   public void confirm_QP818( )
   {
      nGXsfl_445_idx = 0 ;
      while ( nGXsfl_445_idx < nRC_GXsfl_445 )
      {
         readRowQP818( ) ;
         if ( ( nRcdExists_818 != 0 ) || ( nIsMod_818 != 0 ) )
         {
            getKeyQP818( ) ;
            if ( ( nRcdExists_818 == 0 ) && ( nRcdDeleted_818 == 0 ) )
            {
               if ( RcdFound818 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateQP818( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableQP818( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsQP818( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LB_LINEAPQ_" + sGXsfl_445_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_lineaPq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound818 != 0 )
               {
                  if ( nRcdDeleted_818 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyQP818( ) ;
                     loadQP818( ) ;
                     beforeValidateQP818( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsQP818( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_818 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateQP818( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableQP818( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsQP818( ) ;
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
                  if ( nRcdDeleted_818 == 0 )
                  {
                     GXCCtl = "LB_LINEAPQ_" + sGXsfl_445_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_lineaPq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_818_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_lineaPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_ForCod_Internalname, GXutil.rtrim( A5553Lb_ForCod)) ;
         httpContext.changePostValue( edtLb_ForDsc_Internalname, GXutil.rtrim( A5554Lb_ForDsc)) ;
         httpContext.changePostValue( chkLb_RecPip.getInternalname(), ((GXutil.strcmp(A6372Lb_RecPip, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkLb_Envio.getInternalname(), ((GXutil.strcmp(A8621Lb_Envio, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_445_idx, GXutil.rtrim( Z5553Lb_ForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_445_idx, GXutil.rtrim( Z6372Lb_RecPip)) ;
         httpContext.changePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_445_idx, GXutil.rtrim( Z8621Lb_Envio)) ;
         httpContext.changePostValue( "nRcdDeleted_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_818 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_818_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINEAPQ_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORCOD_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORDSC_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RECPIP_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ENVIO_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionQP0( )
   {
   }

   public void zmQP817( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5533Lb_ArtCod = T00QP5_A5533Lb_ArtCod[0] ;
            Z5534Lb_ArtDsc = T00QP5_A5534Lb_ArtDsc[0] ;
            Z5535Lb_TipArt = T00QP5_A5535Lb_TipArt[0] ;
            Z5552Lb_TipArtD = T00QP5_A5552Lb_TipArtD[0] ;
            Z5536Lb_ColNom = T00QP5_A5536Lb_ColNom[0] ;
            Z5537Lb_ColNum = T00QP5_A5537Lb_ColNum[0] ;
            Z5538Lb_ColNomC = T00QP5_A5538Lb_ColNomC[0] ;
            Z5539Lb_ColNumC = T00QP5_A5539Lb_ColNumC[0] ;
            Z5540Lb_Cartaz = T00QP5_A5540Lb_Cartaz[0] ;
            Z5541Lb_FechaE = T00QP5_A5541Lb_FechaE[0] ;
            Z5542Lb_HoraE = T00QP5_A5542Lb_HoraE[0] ;
            Z5543Lb_Usuario = T00QP5_A5543Lb_Usuario[0] ;
            Z5544Lb_FechaM = T00QP5_A5544Lb_FechaM[0] ;
            Z5545Lb_HoraM = T00QP5_A5545Lb_HoraM[0] ;
            Z5546Lb_UsuM = T00QP5_A5546Lb_UsuM[0] ;
            Z5547Lb_Rb = T00QP5_A5547Lb_Rb[0] ;
            Z5549Lb_UltOp = T00QP5_A5549Lb_UltOp[0] ;
            Z5550Lb_UltlPq = T00QP5_A5550Lb_UltlPq[0] ;
            Z5569Lb_EstEns = T00QP5_A5569Lb_EstEns[0] ;
            Z5570Lb_Tipo = T00QP5_A5570Lb_Tipo[0] ;
            Z5594Lb_cartazf = T00QP5_A5594Lb_cartazf[0] ;
            Z5595Lb_malha = T00QP5_A5595Lb_malha[0] ;
            Z5596Lb_reprod = T00QP5_A5596Lb_reprod[0] ;
            Z5597Lb_TipRec = T00QP5_A5597Lb_TipRec[0] ;
            Z5598Lb_impreso = T00QP5_A5598Lb_impreso[0] ;
            Z5599Lb_RGB = T00QP5_A5599Lb_RGB[0] ;
            Z5600Lb_IDM = T00QP5_A5600Lb_IDM[0] ;
            Z5601Lb_Tempt = T00QP5_A5601Lb_Tempt[0] ;
            Z5610Lb_Temp2 = T00QP5_A5610Lb_Temp2[0] ;
            Z5611Lb_Temp3 = T00QP5_A5611Lb_Temp3[0] ;
            Z5700Lb_Talao = T00QP5_A5700Lb_Talao[0] ;
            Z5701Lb_Local = T00QP5_A5701Lb_Local[0] ;
            Z5699Lb_EstLab = T00QP5_A5699Lb_EstLab[0] ;
            Z5717Lb_numopu = T00QP5_A5717Lb_numopu[0] ;
            Z5901Lab_desvio = T00QP5_A5901Lab_desvio[0] ;
            Z5988Lb_nfibras = T00QP5_A5988Lb_nfibras[0] ;
            Z6056Lb_pesom = T00QP5_A6056Lb_pesom[0] ;
            Z6057Lb_volum = T00QP5_A6057Lb_volum[0] ;
            Z6546Lb_Pantone = T00QP5_A6546Lb_Pantone[0] ;
            Z6618Lb_PedCod = T00QP5_A6618Lb_PedCod[0] ;
            Z6644Lb_PriEns = T00QP5_A6644Lb_PriEns[0] ;
            Z6653Lb_Tra1 = T00QP5_A6653Lb_Tra1[0] ;
            Z6654Lb_TraP1 = T00QP5_A6654Lb_TraP1[0] ;
            Z6655Lb_Tra2 = T00QP5_A6655Lb_Tra2[0] ;
            Z6656Lb_TraP2 = T00QP5_A6656Lb_TraP2[0] ;
            Z6657Lb_Tra3 = T00QP5_A6657Lb_Tra3[0] ;
            Z6658Lb_TraP3 = T00QP5_A6658Lb_TraP3[0] ;
            Z6842Lb_Tra4 = T00QP5_A6842Lb_Tra4[0] ;
            Z6843Lb_TraP4 = T00QP5_A6843Lb_TraP4[0] ;
            Z6844Lb_Tra5 = T00QP5_A6844Lb_Tra5[0] ;
            Z6845Lb_TraP5 = T00QP5_A6845Lb_TraP5[0] ;
            Z6846Lb_Tra6 = T00QP5_A6846Lb_Tra6[0] ;
            Z6847Lb_TraP6 = T00QP5_A6847Lb_TraP6[0] ;
            Z7780Lb_Hila = T00QP5_A7780Lb_Hila[0] ;
            Z8946Lb_NCoS = T00QP5_A8946Lb_NCoS[0] ;
            Z8947Lb_NOpR = T00QP5_A8947Lb_NOpR[0] ;
            Z8948Lb_NCoE = T00QP5_A8948Lb_NCoE[0] ;
            Z8949Lb_NOpE = T00QP5_A8949Lb_NOpE[0] ;
            Z8950Lb_NOpN = T00QP5_A8950Lb_NOpN[0] ;
            Z8951Lb_FecE = T00QP5_A8951Lb_FecE[0] ;
            Z8952Lb_FecN = T00QP5_A8952Lb_FecN[0] ;
            Z8953Lb_FecR = T00QP5_A8953Lb_FecR[0] ;
            Z8954Lb_diasER = T00QP5_A8954Lb_diasER[0] ;
            Z9900Lb_obsCl = T00QP5_A9900Lb_obsCl[0] ;
            Z10883Lb_obsLb = T00QP5_A10883Lb_obsLb[0] ;
            Z252CliCod = T00QP5_A252CliCod[0] ;
            Z583IntCod = T00QP5_A583IntCod[0] ;
            Z626MatCod = T00QP5_A626MatCod[0] ;
            Z831TipColCod = T00QP5_A831TipColCod[0] ;
            Z1514MacProCod = T00QP5_A1514MacProCod[0] ;
            Z3316CodSol = T00QP5_A3316CodSol[0] ;
            Z5098TipDisCod = T00QP5_A5098TipDisCod[0] ;
            Z5801Lab_CodCau = T00QP5_A5801Lab_CodCau[0] ;
         }
         else
         {
            Z5533Lb_ArtCod = A5533Lb_ArtCod ;
            Z5534Lb_ArtDsc = A5534Lb_ArtDsc ;
            Z5535Lb_TipArt = A5535Lb_TipArt ;
            Z5552Lb_TipArtD = A5552Lb_TipArtD ;
            Z5536Lb_ColNom = A5536Lb_ColNom ;
            Z5537Lb_ColNum = A5537Lb_ColNum ;
            Z5538Lb_ColNomC = A5538Lb_ColNomC ;
            Z5539Lb_ColNumC = A5539Lb_ColNumC ;
            Z5540Lb_Cartaz = A5540Lb_Cartaz ;
            Z5541Lb_FechaE = A5541Lb_FechaE ;
            Z5542Lb_HoraE = A5542Lb_HoraE ;
            Z5543Lb_Usuario = A5543Lb_Usuario ;
            Z5544Lb_FechaM = A5544Lb_FechaM ;
            Z5545Lb_HoraM = A5545Lb_HoraM ;
            Z5546Lb_UsuM = A5546Lb_UsuM ;
            Z5547Lb_Rb = A5547Lb_Rb ;
            Z5549Lb_UltOp = A5549Lb_UltOp ;
            Z5550Lb_UltlPq = A5550Lb_UltlPq ;
            Z5569Lb_EstEns = A5569Lb_EstEns ;
            Z5570Lb_Tipo = A5570Lb_Tipo ;
            Z5594Lb_cartazf = A5594Lb_cartazf ;
            Z5595Lb_malha = A5595Lb_malha ;
            Z5596Lb_reprod = A5596Lb_reprod ;
            Z5597Lb_TipRec = A5597Lb_TipRec ;
            Z5598Lb_impreso = A5598Lb_impreso ;
            Z5599Lb_RGB = A5599Lb_RGB ;
            Z5600Lb_IDM = A5600Lb_IDM ;
            Z5601Lb_Tempt = A5601Lb_Tempt ;
            Z5610Lb_Temp2 = A5610Lb_Temp2 ;
            Z5611Lb_Temp3 = A5611Lb_Temp3 ;
            Z5700Lb_Talao = A5700Lb_Talao ;
            Z5701Lb_Local = A5701Lb_Local ;
            Z5699Lb_EstLab = A5699Lb_EstLab ;
            Z5717Lb_numopu = A5717Lb_numopu ;
            Z5901Lab_desvio = A5901Lab_desvio ;
            Z5988Lb_nfibras = A5988Lb_nfibras ;
            Z6056Lb_pesom = A6056Lb_pesom ;
            Z6057Lb_volum = A6057Lb_volum ;
            Z6546Lb_Pantone = A6546Lb_Pantone ;
            Z6618Lb_PedCod = A6618Lb_PedCod ;
            Z6644Lb_PriEns = A6644Lb_PriEns ;
            Z6653Lb_Tra1 = A6653Lb_Tra1 ;
            Z6654Lb_TraP1 = A6654Lb_TraP1 ;
            Z6655Lb_Tra2 = A6655Lb_Tra2 ;
            Z6656Lb_TraP2 = A6656Lb_TraP2 ;
            Z6657Lb_Tra3 = A6657Lb_Tra3 ;
            Z6658Lb_TraP3 = A6658Lb_TraP3 ;
            Z6842Lb_Tra4 = A6842Lb_Tra4 ;
            Z6843Lb_TraP4 = A6843Lb_TraP4 ;
            Z6844Lb_Tra5 = A6844Lb_Tra5 ;
            Z6845Lb_TraP5 = A6845Lb_TraP5 ;
            Z6846Lb_Tra6 = A6846Lb_Tra6 ;
            Z6847Lb_TraP6 = A6847Lb_TraP6 ;
            Z7780Lb_Hila = A7780Lb_Hila ;
            Z8946Lb_NCoS = A8946Lb_NCoS ;
            Z8947Lb_NOpR = A8947Lb_NOpR ;
            Z8948Lb_NCoE = A8948Lb_NCoE ;
            Z8949Lb_NOpE = A8949Lb_NOpE ;
            Z8950Lb_NOpN = A8950Lb_NOpN ;
            Z8951Lb_FecE = A8951Lb_FecE ;
            Z8952Lb_FecN = A8952Lb_FecN ;
            Z8953Lb_FecR = A8953Lb_FecR ;
            Z8954Lb_diasER = A8954Lb_diasER ;
            Z9900Lb_obsCl = A9900Lb_obsCl ;
            Z10883Lb_obsLb = A10883Lb_obsLb ;
            Z252CliCod = A252CliCod ;
            Z583IntCod = A583IntCod ;
            Z626MatCod = A626MatCod ;
            Z831TipColCod = A831TipColCod ;
            Z1514MacProCod = A1514MacProCod ;
            Z3316CodSol = A3316CodSol ;
            Z5098TipDisCod = A5098TipDisCod ;
            Z5801Lab_CodCau = A5801Lab_CodCau ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5533Lb_ArtCod = A5533Lb_ArtCod ;
         Z5534Lb_ArtDsc = A5534Lb_ArtDsc ;
         Z5535Lb_TipArt = A5535Lb_TipArt ;
         Z5552Lb_TipArtD = A5552Lb_TipArtD ;
         Z5536Lb_ColNom = A5536Lb_ColNom ;
         Z5537Lb_ColNum = A5537Lb_ColNum ;
         Z5538Lb_ColNomC = A5538Lb_ColNomC ;
         Z5539Lb_ColNumC = A5539Lb_ColNumC ;
         Z5540Lb_Cartaz = A5540Lb_Cartaz ;
         Z5541Lb_FechaE = A5541Lb_FechaE ;
         Z5542Lb_HoraE = A5542Lb_HoraE ;
         Z5543Lb_Usuario = A5543Lb_Usuario ;
         Z5544Lb_FechaM = A5544Lb_FechaM ;
         Z5545Lb_HoraM = A5545Lb_HoraM ;
         Z5546Lb_UsuM = A5546Lb_UsuM ;
         Z5547Lb_Rb = A5547Lb_Rb ;
         Z5548Lb_Obs = A5548Lb_Obs ;
         Z5549Lb_UltOp = A5549Lb_UltOp ;
         Z5550Lb_UltlPq = A5550Lb_UltlPq ;
         Z5569Lb_EstEns = A5569Lb_EstEns ;
         Z5570Lb_Tipo = A5570Lb_Tipo ;
         Z5594Lb_cartazf = A5594Lb_cartazf ;
         Z5595Lb_malha = A5595Lb_malha ;
         Z5596Lb_reprod = A5596Lb_reprod ;
         Z5597Lb_TipRec = A5597Lb_TipRec ;
         Z5598Lb_impreso = A5598Lb_impreso ;
         Z5599Lb_RGB = A5599Lb_RGB ;
         Z5600Lb_IDM = A5600Lb_IDM ;
         Z5601Lb_Tempt = A5601Lb_Tempt ;
         Z5610Lb_Temp2 = A5610Lb_Temp2 ;
         Z5611Lb_Temp3 = A5611Lb_Temp3 ;
         Z5700Lb_Talao = A5700Lb_Talao ;
         Z5701Lb_Local = A5701Lb_Local ;
         Z5699Lb_EstLab = A5699Lb_EstLab ;
         Z5717Lb_numopu = A5717Lb_numopu ;
         Z5901Lab_desvio = A5901Lab_desvio ;
         Z5988Lb_nfibras = A5988Lb_nfibras ;
         Z6056Lb_pesom = A6056Lb_pesom ;
         Z6057Lb_volum = A6057Lb_volum ;
         Z6546Lb_Pantone = A6546Lb_Pantone ;
         Z6618Lb_PedCod = A6618Lb_PedCod ;
         Z6644Lb_PriEns = A6644Lb_PriEns ;
         Z6653Lb_Tra1 = A6653Lb_Tra1 ;
         Z6654Lb_TraP1 = A6654Lb_TraP1 ;
         Z6655Lb_Tra2 = A6655Lb_Tra2 ;
         Z6656Lb_TraP2 = A6656Lb_TraP2 ;
         Z6657Lb_Tra3 = A6657Lb_Tra3 ;
         Z6658Lb_TraP3 = A6658Lb_TraP3 ;
         Z6842Lb_Tra4 = A6842Lb_Tra4 ;
         Z6843Lb_TraP4 = A6843Lb_TraP4 ;
         Z6844Lb_Tra5 = A6844Lb_Tra5 ;
         Z6845Lb_TraP5 = A6845Lb_TraP5 ;
         Z6846Lb_Tra6 = A6846Lb_Tra6 ;
         Z6847Lb_TraP6 = A6847Lb_TraP6 ;
         Z7780Lb_Hila = A7780Lb_Hila ;
         Z8946Lb_NCoS = A8946Lb_NCoS ;
         Z8947Lb_NOpR = A8947Lb_NOpR ;
         Z8948Lb_NCoE = A8948Lb_NCoE ;
         Z8949Lb_NOpE = A8949Lb_NOpE ;
         Z8950Lb_NOpN = A8950Lb_NOpN ;
         Z8951Lb_FecE = A8951Lb_FecE ;
         Z8952Lb_FecN = A8952Lb_FecN ;
         Z8953Lb_FecR = A8953Lb_FecR ;
         Z8954Lb_diasER = A8954Lb_diasER ;
         Z9900Lb_obsCl = A9900Lb_obsCl ;
         Z10883Lb_obsLb = A10883Lb_obsLb ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z583IntCod = A583IntCod ;
         Z626MatCod = A626MatCod ;
         Z831TipColCod = A831TipColCod ;
         Z1514MacProCod = A1514MacProCod ;
         Z3316CodSol = A3316CodSol ;
         Z5098TipDisCod = A5098TipDisCod ;
         Z5801Lab_CodCau = A5801Lab_CodCau ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
         Z584IntDsc = A584IntDsc ;
         Z627MatDsc = A627MatDsc ;
         Z3317DscSol = A3317DscSol ;
         Z5802Lab_DscCau = A5802Lab_DscCau ;
         Z5097TipDisDsc = A5097TipDisDsc ;
         Z1515MacProDsc = A1515MacProDsc ;
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

   public void loadQP817( )
   {
      /* Using cursor T00QP15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound817 = (short)(1) ;
         A5548Lb_Obs = T00QP15_A5548Lb_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5548Lb_Obs", A5548Lb_Obs);
         A407EmprNom = T00QP15_A407EmprNom[0] ;
         n407EmprNom = T00QP15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00QP15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5533Lb_ArtCod = T00QP15_A5533Lb_ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5533Lb_ArtCod", A5533Lb_ArtCod);
         A5534Lb_ArtDsc = T00QP15_A5534Lb_ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5534Lb_ArtDsc", A5534Lb_ArtDsc);
         A5535Lb_TipArt = T00QP15_A5535Lb_TipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5535Lb_TipArt), 4, 0));
         A5552Lb_TipArtD = T00QP15_A5552Lb_TipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5552Lb_TipArtD", A5552Lb_TipArtD);
         A5536Lb_ColNom = T00QP15_A5536Lb_ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5536Lb_ColNom", A5536Lb_ColNom);
         A5537Lb_ColNum = T00QP15_A5537Lb_ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
         A832TipColDsc = T00QP15_A832TipColDsc[0] ;
         n832TipColDsc = T00QP15_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A5538Lb_ColNomC = T00QP15_A5538Lb_ColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5538Lb_ColNomC", A5538Lb_ColNomC);
         A5539Lb_ColNumC = T00QP15_A5539Lb_ColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5539Lb_ColNumC), 6, 0));
         A5540Lb_Cartaz = T00QP15_A5540Lb_Cartaz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5540Lb_Cartaz", A5540Lb_Cartaz);
         A5541Lb_FechaE = T00QP15_A5541Lb_FechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         A5542Lb_HoraE = T00QP15_A5542Lb_HoraE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5543Lb_Usuario = T00QP15_A5543Lb_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5543Lb_Usuario", A5543Lb_Usuario);
         A5544Lb_FechaM = T00QP15_A5544Lb_FechaM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
         A5545Lb_HoraM = T00QP15_A5545Lb_HoraM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5546Lb_UsuM = T00QP15_A5546Lb_UsuM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5546Lb_UsuM", A5546Lb_UsuM);
         A5547Lb_Rb = T00QP15_A5547Lb_Rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrimstr( A5547Lb_Rb, 7, 2));
         A584IntDsc = T00QP15_A584IntDsc[0] ;
         n584IntDsc = T00QP15_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A627MatDsc = T00QP15_A627MatDsc[0] ;
         n627MatDsc = T00QP15_n627MatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
         A3317DscSol = T00QP15_A3317DscSol[0] ;
         n3317DscSol = T00QP15_n3317DscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
         A5549Lb_UltOp = T00QP15_A5549Lb_UltOp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5549Lb_UltOp", A5549Lb_UltOp);
         A5550Lb_UltlPq = T00QP15_A5550Lb_UltlPq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         A5569Lb_EstEns = T00QP15_A5569Lb_EstEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.str( A5569Lb_EstEns, 1, 0));
         A5570Lb_Tipo = T00QP15_A5570Lb_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5570Lb_Tipo", A5570Lb_Tipo);
         A5594Lb_cartazf = T00QP15_A5594Lb_cartazf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         A5595Lb_malha = T00QP15_A5595Lb_malha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.str( A5595Lb_malha, 1, 0));
         A5596Lb_reprod = T00QP15_A5596Lb_reprod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.str( A5596Lb_reprod, 1, 0));
         A5597Lb_TipRec = T00QP15_A5597Lb_TipRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.str( A5597Lb_TipRec, 1, 0));
         A5598Lb_impreso = T00QP15_A5598Lb_impreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.str( A5598Lb_impreso, 1, 0));
         A5599Lb_RGB = T00QP15_A5599Lb_RGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
         A5600Lb_IDM = T00QP15_A5600Lb_IDM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5600Lb_IDM), 8, 0));
         A5601Lb_Tempt = T00QP15_A5601Lb_Tempt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5601Lb_Tempt), 4, 0));
         A5610Lb_Temp2 = T00QP15_A5610Lb_Temp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5610Lb_Temp2), 4, 0));
         A5611Lb_Temp3 = T00QP15_A5611Lb_Temp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5611Lb_Temp3), 4, 0));
         A5700Lb_Talao = T00QP15_A5700Lb_Talao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5700Lb_Talao", A5700Lb_Talao);
         A5701Lb_Local = T00QP15_A5701Lb_Local[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5701Lb_Local", A5701Lb_Local);
         A5699Lb_EstLab = T00QP15_A5699Lb_EstLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
         A5717Lb_numopu = T00QP15_A5717Lb_numopu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5717Lb_numopu), 2, 0));
         A5802Lab_DscCau = T00QP15_A5802Lab_DscCau[0] ;
         n5802Lab_DscCau = T00QP15_n5802Lab_DscCau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
         A5901Lab_desvio = T00QP15_A5901Lab_desvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5901Lab_desvio), 4, 0));
         A5097TipDisDsc = T00QP15_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00QP15_n5097TipDisDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         A5988Lb_nfibras = T00QP15_A5988Lb_nfibras[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5988Lb_nfibras), 2, 0));
         A6056Lb_pesom = T00QP15_A6056Lb_pesom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrimstr( A6056Lb_pesom, 9, 3));
         A6057Lb_volum = T00QP15_A6057Lb_volum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrimstr( A6057Lb_volum, 7, 2));
         A1515MacProDsc = T00QP15_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         A6546Lb_Pantone = T00QP15_A6546Lb_Pantone[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6546Lb_Pantone", A6546Lb_Pantone);
         A6618Lb_PedCod = T00QP15_A6618Lb_PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6618Lb_PedCod", A6618Lb_PedCod);
         A6644Lb_PriEns = T00QP15_A6644Lb_PriEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6644Lb_PriEns", A6644Lb_PriEns);
         A6653Lb_Tra1 = T00QP15_A6653Lb_Tra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6653Lb_Tra1", A6653Lb_Tra1);
         A6654Lb_TraP1 = T00QP15_A6654Lb_TraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6654Lb_TraP1), 3, 0));
         A6655Lb_Tra2 = T00QP15_A6655Lb_Tra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6655Lb_Tra2", A6655Lb_Tra2);
         A6656Lb_TraP2 = T00QP15_A6656Lb_TraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6656Lb_TraP2), 3, 0));
         A6657Lb_Tra3 = T00QP15_A6657Lb_Tra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6657Lb_Tra3", A6657Lb_Tra3);
         A6658Lb_TraP3 = T00QP15_A6658Lb_TraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6658Lb_TraP3), 3, 0));
         A6842Lb_Tra4 = T00QP15_A6842Lb_Tra4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6842Lb_Tra4", A6842Lb_Tra4);
         A6843Lb_TraP4 = T00QP15_A6843Lb_TraP4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6843Lb_TraP4), 3, 0));
         A6844Lb_Tra5 = T00QP15_A6844Lb_Tra5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6844Lb_Tra5", A6844Lb_Tra5);
         A6845Lb_TraP5 = T00QP15_A6845Lb_TraP5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6845Lb_TraP5), 3, 0));
         A6846Lb_Tra6 = T00QP15_A6846Lb_Tra6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6846Lb_Tra6", A6846Lb_Tra6);
         A6847Lb_TraP6 = T00QP15_A6847Lb_TraP6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6847Lb_TraP6), 3, 0));
         A7780Lb_Hila = T00QP15_A7780Lb_Hila[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7780Lb_Hila", A7780Lb_Hila);
         A8946Lb_NCoS = T00QP15_A8946Lb_NCoS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8946Lb_NCoS), 8, 0));
         A8947Lb_NOpR = T00QP15_A8947Lb_NOpR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8947Lb_NOpR), 8, 0));
         A8948Lb_NCoE = T00QP15_A8948Lb_NCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8948Lb_NCoE), 8, 0));
         A8949Lb_NOpE = T00QP15_A8949Lb_NOpE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8949Lb_NOpE), 8, 0));
         A8950Lb_NOpN = T00QP15_A8950Lb_NOpN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8950Lb_NOpN), 8, 0));
         A8951Lb_FecE = T00QP15_A8951Lb_FecE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
         A8952Lb_FecN = T00QP15_A8952Lb_FecN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
         A8953Lb_FecR = T00QP15_A8953Lb_FecR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
         A8954Lb_diasER = T00QP15_A8954Lb_diasER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8954Lb_diasER), 6, 0));
         A9900Lb_obsCl = T00QP15_A9900Lb_obsCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9900Lb_obsCl", A9900Lb_obsCl);
         A10883Lb_obsLb = T00QP15_A10883Lb_obsLb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10883Lb_obsLb", A10883Lb_obsLb);
         A252CliCod = T00QP15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A583IntCod = T00QP15_A583IntCod[0] ;
         n583IntCod = T00QP15_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A626MatCod = T00QP15_A626MatCod[0] ;
         n626MatCod = T00QP15_n626MatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         A831TipColCod = T00QP15_A831TipColCod[0] ;
         n831TipColCod = T00QP15_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1514MacProCod = T00QP15_A1514MacProCod[0] ;
         n1514MacProCod = T00QP15_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3316CodSol = T00QP15_A3316CodSol[0] ;
         n3316CodSol = T00QP15_n3316CodSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         A5098TipDisCod = T00QP15_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP15_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5801Lab_CodCau = T00QP15_A5801Lab_CodCau[0] ;
         n5801Lab_CodCau = T00QP15_n5801Lab_CodCau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
         zmQP817( -4) ;
      }
      pr_default.close(13);
      onLoadActionsQP817( ) ;
   }

   public void onLoadActionsQP817( )
   {
      h5098TipDisCod = A5097TipDisDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
   }

   public void checkExtendedTableQP817( )
   {
      nIsDirty_817 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         nIsDirty_817 = (short)(1) ;
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
      }
      else
      {
         nIsDirty_817 = (short)(1) ;
         A5097TipDisDsc = h5098TipDisCod ;
         n5097TipDisDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         /* Using cursor T00QP16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n5097TipDisDsc), A5097TipDisDsc, A396EmprCod});
         A396EmprCod = T00QP16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5098TipDisCod = T00QP16_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP16_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5098TipDisCod = T00QP16_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP16_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion ", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         nIsDirty_817 = (short)(1) ;
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
      }
      else
      {
         nIsDirty_817 = (short)(1) ;
         A5097TipDisDsc = h5098TipDisCod ;
         n5097TipDisDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         /* Using cursor T00QP17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n5097TipDisDsc), A5097TipDisDsc, A396EmprCod});
         A396EmprCod = T00QP17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5098TipDisCod = T00QP17_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP17_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5098TipDisCod = T00QP17_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP17_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion ", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      /* Using cursor T00QP6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00QP6_A407EmprNom[0] ;
      n407EmprNom = T00QP6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00QP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00QP7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T00QP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A583IntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A584IntDsc = T00QP8_A584IntDsc[0] ;
      n584IntDsc = T00QP8_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(6);
      /* Using cursor T00QP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A626MatCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A627MatDsc = T00QP9_A627MatDsc[0] ;
      n627MatDsc = T00QP9_n627MatDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      pr_default.close(7);
      /* Using cursor T00QP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A831TipColCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A832TipColDsc = T00QP10_A832TipColDsc[0] ;
      n832TipColDsc = T00QP10_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(8);
      /* Using cursor T00QP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1515MacProDsc = T00QP11_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      pr_default.close(9);
      /* Using cursor T00QP12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3317DscSol = T00QP12_A3317DscSol[0] ;
      n3317DscSol = T00QP12_n3317DscSol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      pr_default.close(10);
      /* Using cursor T00QP13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A5097TipDisDsc)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5097TipDisDsc = T00QP13_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00QP13_n5097TipDisDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
      pr_default.close(11);
      /* Using cursor T00QP14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5801Lab_CodCau) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAUDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LAB_CODCAU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5802Lab_DscCau = T00QP14_A5802Lab_DscCau[0] ;
      n5802Lab_DscCau = T00QP14_n5802Lab_DscCau[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
      pr_default.close(12);
   }

   public void closeExtendedTableCursorsQP817( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T00QP18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00QP18_A407EmprNom[0] ;
      n407EmprNom = T00QP18_n407EmprNom[0] ;
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

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00QP19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00QP19_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_7( String A396EmprCod ,
                         byte A583IntCod )
   {
      /* Using cursor T00QP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A583IntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A584IntDsc = T00QP20_A584IntDsc[0] ;
      n584IntDsc = T00QP20_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_8( String A396EmprCod ,
                         short A626MatCod )
   {
      /* Using cursor T00QP21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A626MatCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A627MatDsc = T00QP21_A627MatDsc[0] ;
      n627MatDsc = T00QP21_n627MatDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A627MatDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_9( String A396EmprCod ,
                         byte A831TipColCod )
   {
      /* Using cursor T00QP22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A831TipColCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A832TipColDsc = T00QP22_A832TipColDsc[0] ;
      n832TipColDsc = T00QP22_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A832TipColDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_10( String A396EmprCod ,
                          String A1514MacProCod )
   {
      /* Using cursor T00QP23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1515MacProDsc = T00QP23_A1515MacProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1515MacProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_11( String A396EmprCod ,
                          short A3316CodSol )
   {
      /* Using cursor T00QP24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3317DscSol = T00QP24_A3317DscSol[0] ;
      n3317DscSol = T00QP24_n3317DscSol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3317DscSol))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_12( String A396EmprCod ,
                          String A5098TipDisCod )
   {
      /* Using cursor T00QP25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A5097TipDisDsc)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5097TipDisDsc = T00QP25_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00QP25_n5097TipDisDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5097TipDisDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void gxload_13( String A396EmprCod ,
                          short A5801Lab_CodCau )
   {
      /* Using cursor T00QP26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5801Lab_CodCau) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAUDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LAB_CODCAU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5802Lab_DscCau = T00QP26_A5802Lab_DscCau[0] ;
      n5802Lab_DscCau = T00QP26_n5802Lab_DscCau[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5802Lab_DscCau))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKeyQP817( )
   {
      /* Using cursor T00QP27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound817 = (short)(1) ;
      }
      else
      {
         RcdFound817 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00QP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmQP817( 4) ;
         RcdFound817 = (short)(1) ;
         A5548Lb_Obs = T00QP5_A5548Lb_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5548Lb_Obs", A5548Lb_Obs);
         A5532Lb_numero = T00QP5_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5533Lb_ArtCod = T00QP5_A5533Lb_ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5533Lb_ArtCod", A5533Lb_ArtCod);
         A5534Lb_ArtDsc = T00QP5_A5534Lb_ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5534Lb_ArtDsc", A5534Lb_ArtDsc);
         A5535Lb_TipArt = T00QP5_A5535Lb_TipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5535Lb_TipArt), 4, 0));
         A5552Lb_TipArtD = T00QP5_A5552Lb_TipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5552Lb_TipArtD", A5552Lb_TipArtD);
         A5536Lb_ColNom = T00QP5_A5536Lb_ColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5536Lb_ColNom", A5536Lb_ColNom);
         A5537Lb_ColNum = T00QP5_A5537Lb_ColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
         A5538Lb_ColNomC = T00QP5_A5538Lb_ColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5538Lb_ColNomC", A5538Lb_ColNomC);
         A5539Lb_ColNumC = T00QP5_A5539Lb_ColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5539Lb_ColNumC), 6, 0));
         A5540Lb_Cartaz = T00QP5_A5540Lb_Cartaz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5540Lb_Cartaz", A5540Lb_Cartaz);
         A5541Lb_FechaE = T00QP5_A5541Lb_FechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         A5542Lb_HoraE = T00QP5_A5542Lb_HoraE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5543Lb_Usuario = T00QP5_A5543Lb_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5543Lb_Usuario", A5543Lb_Usuario);
         A5544Lb_FechaM = T00QP5_A5544Lb_FechaM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
         A5545Lb_HoraM = T00QP5_A5545Lb_HoraM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5546Lb_UsuM = T00QP5_A5546Lb_UsuM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5546Lb_UsuM", A5546Lb_UsuM);
         A5547Lb_Rb = T00QP5_A5547Lb_Rb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrimstr( A5547Lb_Rb, 7, 2));
         A5549Lb_UltOp = T00QP5_A5549Lb_UltOp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5549Lb_UltOp", A5549Lb_UltOp);
         A5550Lb_UltlPq = T00QP5_A5550Lb_UltlPq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         A5569Lb_EstEns = T00QP5_A5569Lb_EstEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.str( A5569Lb_EstEns, 1, 0));
         A5570Lb_Tipo = T00QP5_A5570Lb_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5570Lb_Tipo", A5570Lb_Tipo);
         A5594Lb_cartazf = T00QP5_A5594Lb_cartazf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         A5595Lb_malha = T00QP5_A5595Lb_malha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.str( A5595Lb_malha, 1, 0));
         A5596Lb_reprod = T00QP5_A5596Lb_reprod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.str( A5596Lb_reprod, 1, 0));
         A5597Lb_TipRec = T00QP5_A5597Lb_TipRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.str( A5597Lb_TipRec, 1, 0));
         A5598Lb_impreso = T00QP5_A5598Lb_impreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.str( A5598Lb_impreso, 1, 0));
         A5599Lb_RGB = T00QP5_A5599Lb_RGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
         A5600Lb_IDM = T00QP5_A5600Lb_IDM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5600Lb_IDM), 8, 0));
         A5601Lb_Tempt = T00QP5_A5601Lb_Tempt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5601Lb_Tempt), 4, 0));
         A5610Lb_Temp2 = T00QP5_A5610Lb_Temp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5610Lb_Temp2), 4, 0));
         A5611Lb_Temp3 = T00QP5_A5611Lb_Temp3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5611Lb_Temp3), 4, 0));
         A5700Lb_Talao = T00QP5_A5700Lb_Talao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5700Lb_Talao", A5700Lb_Talao);
         A5701Lb_Local = T00QP5_A5701Lb_Local[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5701Lb_Local", A5701Lb_Local);
         A5699Lb_EstLab = T00QP5_A5699Lb_EstLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
         A5717Lb_numopu = T00QP5_A5717Lb_numopu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5717Lb_numopu), 2, 0));
         A5901Lab_desvio = T00QP5_A5901Lab_desvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5901Lab_desvio), 4, 0));
         A5988Lb_nfibras = T00QP5_A5988Lb_nfibras[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5988Lb_nfibras), 2, 0));
         A6056Lb_pesom = T00QP5_A6056Lb_pesom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrimstr( A6056Lb_pesom, 9, 3));
         A6057Lb_volum = T00QP5_A6057Lb_volum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrimstr( A6057Lb_volum, 7, 2));
         A6546Lb_Pantone = T00QP5_A6546Lb_Pantone[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6546Lb_Pantone", A6546Lb_Pantone);
         A6618Lb_PedCod = T00QP5_A6618Lb_PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6618Lb_PedCod", A6618Lb_PedCod);
         A6644Lb_PriEns = T00QP5_A6644Lb_PriEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6644Lb_PriEns", A6644Lb_PriEns);
         A6653Lb_Tra1 = T00QP5_A6653Lb_Tra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6653Lb_Tra1", A6653Lb_Tra1);
         A6654Lb_TraP1 = T00QP5_A6654Lb_TraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6654Lb_TraP1), 3, 0));
         A6655Lb_Tra2 = T00QP5_A6655Lb_Tra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6655Lb_Tra2", A6655Lb_Tra2);
         A6656Lb_TraP2 = T00QP5_A6656Lb_TraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6656Lb_TraP2), 3, 0));
         A6657Lb_Tra3 = T00QP5_A6657Lb_Tra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6657Lb_Tra3", A6657Lb_Tra3);
         A6658Lb_TraP3 = T00QP5_A6658Lb_TraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6658Lb_TraP3), 3, 0));
         A6842Lb_Tra4 = T00QP5_A6842Lb_Tra4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6842Lb_Tra4", A6842Lb_Tra4);
         A6843Lb_TraP4 = T00QP5_A6843Lb_TraP4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6843Lb_TraP4), 3, 0));
         A6844Lb_Tra5 = T00QP5_A6844Lb_Tra5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6844Lb_Tra5", A6844Lb_Tra5);
         A6845Lb_TraP5 = T00QP5_A6845Lb_TraP5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6845Lb_TraP5), 3, 0));
         A6846Lb_Tra6 = T00QP5_A6846Lb_Tra6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6846Lb_Tra6", A6846Lb_Tra6);
         A6847Lb_TraP6 = T00QP5_A6847Lb_TraP6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6847Lb_TraP6), 3, 0));
         A7780Lb_Hila = T00QP5_A7780Lb_Hila[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7780Lb_Hila", A7780Lb_Hila);
         A8946Lb_NCoS = T00QP5_A8946Lb_NCoS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8946Lb_NCoS), 8, 0));
         A8947Lb_NOpR = T00QP5_A8947Lb_NOpR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8947Lb_NOpR), 8, 0));
         A8948Lb_NCoE = T00QP5_A8948Lb_NCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8948Lb_NCoE), 8, 0));
         A8949Lb_NOpE = T00QP5_A8949Lb_NOpE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8949Lb_NOpE), 8, 0));
         A8950Lb_NOpN = T00QP5_A8950Lb_NOpN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8950Lb_NOpN), 8, 0));
         A8951Lb_FecE = T00QP5_A8951Lb_FecE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
         A8952Lb_FecN = T00QP5_A8952Lb_FecN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
         A8953Lb_FecR = T00QP5_A8953Lb_FecR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
         A8954Lb_diasER = T00QP5_A8954Lb_diasER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8954Lb_diasER), 6, 0));
         A9900Lb_obsCl = T00QP5_A9900Lb_obsCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9900Lb_obsCl", A9900Lb_obsCl);
         A10883Lb_obsLb = T00QP5_A10883Lb_obsLb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10883Lb_obsLb", A10883Lb_obsLb);
         A396EmprCod = T00QP5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00QP5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A583IntCod = T00QP5_A583IntCod[0] ;
         n583IntCod = T00QP5_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A626MatCod = T00QP5_A626MatCod[0] ;
         n626MatCod = T00QP5_n626MatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
         A831TipColCod = T00QP5_A831TipColCod[0] ;
         n831TipColCod = T00QP5_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1514MacProCod = T00QP5_A1514MacProCod[0] ;
         n1514MacProCod = T00QP5_n1514MacProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
         A3316CodSol = T00QP5_A3316CodSol[0] ;
         n3316CodSol = T00QP5_n3316CodSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
         A5098TipDisCod = T00QP5_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP5_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5801Lab_CodCau = T00QP5_A5801Lab_CodCau[0] ;
         n5801Lab_CodCau = T00QP5_n5801Lab_CodCau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         sMode817 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadQP817( ) ;
         if ( AnyError == 1 )
         {
            RcdFound817 = (short)(0) ;
            initializeNonKeyQP817( ) ;
         }
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound817 = (short)(0) ;
         initializeNonKeyQP817( ) ;
         sMode817 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyQP817( ) ;
      if ( RcdFound817 == 0 )
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
      RcdFound817 = (short)(0) ;
      /* Using cursor T00QP28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         while ( (pr_default.getStatus(26) != 101) && ( ( GXutil.strcmp(T00QP28_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00QP28_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QP28_A5532Lb_numero[0] < A5532Lb_numero ) ) )
         {
            pr_default.readNext(26);
         }
         if ( (pr_default.getStatus(26) != 101) && ( ( GXutil.strcmp(T00QP28_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00QP28_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QP28_A5532Lb_numero[0] > A5532Lb_numero ) ) )
         {
            A396EmprCod = T00QP28_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5532Lb_numero = T00QP28_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            RcdFound817 = (short)(1) ;
         }
      }
      pr_default.close(26);
   }

   public void move_previous( )
   {
      RcdFound817 = (short)(0) ;
      /* Using cursor T00QP29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         while ( (pr_default.getStatus(27) != 101) && ( ( GXutil.strcmp(T00QP29_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00QP29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QP29_A5532Lb_numero[0] > A5532Lb_numero ) ) )
         {
            pr_default.readNext(27);
         }
         if ( (pr_default.getStatus(27) != 101) && ( ( GXutil.strcmp(T00QP29_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00QP29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QP29_A5532Lb_numero[0] < A5532Lb_numero ) ) )
         {
            A396EmprCod = T00QP29_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5532Lb_numero = T00QP29_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            RcdFound817 = (short)(1) ;
         }
      }
      pr_default.close(27);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyQP817( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertQP817( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound817 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5532Lb_numero = Z5532Lb_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
               updateQP817( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertQP817( ) ;
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
                  insertQP817( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = Z5532Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
      getKeyQP817( ) ;
      if ( RcdFound817 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5532Lb_numero = Z5532Lb_numero ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tens000");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_QP0( ) ;
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
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartQP817( ) ;
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndQP817( ) ;
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
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStartQP817( ) ;
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound817 != 0 )
         {
            scanNextQP817( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndQP817( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyQP817( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
         {
            A5098TipDisCod = "" ;
            n5098TipDisCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         }
         else
         {
            A5097TipDisDsc = h5098TipDisCod ;
            n5097TipDisDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
            /* Using cursor T00QP30 */
            pr_default.execute(28, new Object[] {Boolean.valueOf(n5097TipDisDsc), A5097TipDisDsc, A396EmprCod});
            A396EmprCod = T00QP30_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5098TipDisCod = T00QP30_A5098TipDisCod[0] ;
            n5098TipDisCod = T00QP30_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
            A5098TipDisCod = T00QP30_A5098TipDisCod[0] ;
            n5098TipDisCod = T00QP30_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               pr_default.readNext(28);
               if ( ! ( (pr_default.getStatus(28) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion ", "")}), 1, "TIPDISCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(28);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00QP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z5533Lb_ArtCod, T00QP4_A5533Lb_ArtCod[0]) != 0 ) || ( GXutil.strcmp(Z5534Lb_ArtDsc, T00QP4_A5534Lb_ArtDsc[0]) != 0 ) || ( Z5535Lb_TipArt != T00QP4_A5535Lb_TipArt[0] ) || ( GXutil.strcmp(Z5552Lb_TipArtD, T00QP4_A5552Lb_TipArtD[0]) != 0 ) || ( GXutil.strcmp(Z5536Lb_ColNom, T00QP4_A5536Lb_ColNom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5537Lb_ColNum != T00QP4_A5537Lb_ColNum[0] ) || ( GXutil.strcmp(Z5538Lb_ColNomC, T00QP4_A5538Lb_ColNomC[0]) != 0 ) || ( Z5539Lb_ColNumC != T00QP4_A5539Lb_ColNumC[0] ) || ( GXutil.strcmp(Z5540Lb_Cartaz, T00QP4_A5540Lb_Cartaz[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5541Lb_FechaE), GXutil.resetTime(T00QP4_A5541Lb_FechaE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z5542Lb_HoraE, T00QP4_A5542Lb_HoraE[0]) ) || ( GXutil.strcmp(Z5543Lb_Usuario, T00QP4_A5543Lb_Usuario[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5544Lb_FechaM), GXutil.resetTime(T00QP4_A5544Lb_FechaM[0])) ) || !( GXutil.dateCompare(Z5545Lb_HoraM, T00QP4_A5545Lb_HoraM[0]) ) || ( GXutil.strcmp(Z5546Lb_UsuM, T00QP4_A5546Lb_UsuM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5547Lb_Rb, T00QP4_A5547Lb_Rb[0]) != 0 ) || ( GXutil.strcmp(Z5549Lb_UltOp, T00QP4_A5549Lb_UltOp[0]) != 0 ) || ( Z5550Lb_UltlPq != T00QP4_A5550Lb_UltlPq[0] ) || ( Z5569Lb_EstEns != T00QP4_A5569Lb_EstEns[0] ) || ( GXutil.strcmp(Z5570Lb_Tipo, T00QP4_A5570Lb_Tipo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5594Lb_cartazf), GXutil.resetTime(T00QP4_A5594Lb_cartazf[0])) ) || ( Z5595Lb_malha != T00QP4_A5595Lb_malha[0] ) || ( Z5596Lb_reprod != T00QP4_A5596Lb_reprod[0] ) || ( Z5597Lb_TipRec != T00QP4_A5597Lb_TipRec[0] ) || ( Z5598Lb_impreso != T00QP4_A5598Lb_impreso[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5599Lb_RGB != T00QP4_A5599Lb_RGB[0] ) || ( Z5600Lb_IDM != T00QP4_A5600Lb_IDM[0] ) || ( Z5601Lb_Tempt != T00QP4_A5601Lb_Tempt[0] ) || ( Z5610Lb_Temp2 != T00QP4_A5610Lb_Temp2[0] ) || ( Z5611Lb_Temp3 != T00QP4_A5611Lb_Temp3[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5700Lb_Talao, T00QP4_A5700Lb_Talao[0]) != 0 ) || ( GXutil.strcmp(Z5701Lb_Local, T00QP4_A5701Lb_Local[0]) != 0 ) || ( Z5699Lb_EstLab != T00QP4_A5699Lb_EstLab[0] ) || ( Z5717Lb_numopu != T00QP4_A5717Lb_numopu[0] ) || ( Z5901Lab_desvio != T00QP4_A5901Lab_desvio[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5988Lb_nfibras != T00QP4_A5988Lb_nfibras[0] ) || ( DecimalUtil.compareTo(Z6056Lb_pesom, T00QP4_A6056Lb_pesom[0]) != 0 ) || ( DecimalUtil.compareTo(Z6057Lb_volum, T00QP4_A6057Lb_volum[0]) != 0 ) || ( GXutil.strcmp(Z6546Lb_Pantone, T00QP4_A6546Lb_Pantone[0]) != 0 ) || ( GXutil.strcmp(Z6618Lb_PedCod, T00QP4_A6618Lb_PedCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6644Lb_PriEns, T00QP4_A6644Lb_PriEns[0]) != 0 ) || ( GXutil.strcmp(Z6653Lb_Tra1, T00QP4_A6653Lb_Tra1[0]) != 0 ) || ( Z6654Lb_TraP1 != T00QP4_A6654Lb_TraP1[0] ) || ( GXutil.strcmp(Z6655Lb_Tra2, T00QP4_A6655Lb_Tra2[0]) != 0 ) || ( Z6656Lb_TraP2 != T00QP4_A6656Lb_TraP2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6657Lb_Tra3, T00QP4_A6657Lb_Tra3[0]) != 0 ) || ( Z6658Lb_TraP3 != T00QP4_A6658Lb_TraP3[0] ) || ( GXutil.strcmp(Z6842Lb_Tra4, T00QP4_A6842Lb_Tra4[0]) != 0 ) || ( Z6843Lb_TraP4 != T00QP4_A6843Lb_TraP4[0] ) || ( GXutil.strcmp(Z6844Lb_Tra5, T00QP4_A6844Lb_Tra5[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6845Lb_TraP5 != T00QP4_A6845Lb_TraP5[0] ) || ( GXutil.strcmp(Z6846Lb_Tra6, T00QP4_A6846Lb_Tra6[0]) != 0 ) || ( Z6847Lb_TraP6 != T00QP4_A6847Lb_TraP6[0] ) || ( GXutil.strcmp(Z7780Lb_Hila, T00QP4_A7780Lb_Hila[0]) != 0 ) || ( Z8946Lb_NCoS != T00QP4_A8946Lb_NCoS[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8947Lb_NOpR != T00QP4_A8947Lb_NOpR[0] ) || ( Z8948Lb_NCoE != T00QP4_A8948Lb_NCoE[0] ) || ( Z8949Lb_NOpE != T00QP4_A8949Lb_NOpE[0] ) || ( Z8950Lb_NOpN != T00QP4_A8950Lb_NOpN[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z8951Lb_FecE), GXutil.resetTime(T00QP4_A8951Lb_FecE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z8952Lb_FecN), GXutil.resetTime(T00QP4_A8952Lb_FecN[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z8953Lb_FecR), GXutil.resetTime(T00QP4_A8953Lb_FecR[0])) ) || ( Z8954Lb_diasER != T00QP4_A8954Lb_diasER[0] ) || ( GXutil.strcmp(Z9900Lb_obsCl, T00QP4_A9900Lb_obsCl[0]) != 0 ) || ( GXutil.strcmp(Z10883Lb_obsLb, T00QP4_A10883Lb_obsLb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != T00QP4_A252CliCod[0] ) || ( Z583IntCod != T00QP4_A583IntCod[0] ) || ( Z626MatCod != T00QP4_A626MatCod[0] ) || ( Z831TipColCod != T00QP4_A831TipColCod[0] ) || ( GXutil.strcmp(Z1514MacProCod, T00QP4_A1514MacProCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3316CodSol != T00QP4_A3316CodSol[0] ) || ( GXutil.strcmp(Z5098TipDisCod, T00QP4_A5098TipDisCod[0]) != 0 ) || ( Z5801Lab_CodCau != T00QP4_A5801Lab_CodCau[0] ) )
         {
            if ( GXutil.strcmp(Z5533Lb_ArtCod, T00QP4_A5533Lb_ArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ArtCod");
               GXutil.writeLogRaw("Old: ",Z5533Lb_ArtCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A5533Lb_ArtCod[0]);
            }
            if ( GXutil.strcmp(Z5534Lb_ArtDsc, T00QP4_A5534Lb_ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ArtDsc");
               GXutil.writeLogRaw("Old: ",Z5534Lb_ArtDsc);
               GXutil.writeLogRaw("Current: ",T00QP4_A5534Lb_ArtDsc[0]);
            }
            if ( Z5535Lb_TipArt != T00QP4_A5535Lb_TipArt[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TipArt");
               GXutil.writeLogRaw("Old: ",Z5535Lb_TipArt);
               GXutil.writeLogRaw("Current: ",T00QP4_A5535Lb_TipArt[0]);
            }
            if ( GXutil.strcmp(Z5552Lb_TipArtD, T00QP4_A5552Lb_TipArtD[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TipArtD");
               GXutil.writeLogRaw("Old: ",Z5552Lb_TipArtD);
               GXutil.writeLogRaw("Current: ",T00QP4_A5552Lb_TipArtD[0]);
            }
            if ( GXutil.strcmp(Z5536Lb_ColNom, T00QP4_A5536Lb_ColNom[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ColNom");
               GXutil.writeLogRaw("Old: ",Z5536Lb_ColNom);
               GXutil.writeLogRaw("Current: ",T00QP4_A5536Lb_ColNom[0]);
            }
            if ( Z5537Lb_ColNum != T00QP4_A5537Lb_ColNum[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ColNum");
               GXutil.writeLogRaw("Old: ",Z5537Lb_ColNum);
               GXutil.writeLogRaw("Current: ",T00QP4_A5537Lb_ColNum[0]);
            }
            if ( GXutil.strcmp(Z5538Lb_ColNomC, T00QP4_A5538Lb_ColNomC[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ColNomC");
               GXutil.writeLogRaw("Old: ",Z5538Lb_ColNomC);
               GXutil.writeLogRaw("Current: ",T00QP4_A5538Lb_ColNomC[0]);
            }
            if ( Z5539Lb_ColNumC != T00QP4_A5539Lb_ColNumC[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ColNumC");
               GXutil.writeLogRaw("Old: ",Z5539Lb_ColNumC);
               GXutil.writeLogRaw("Current: ",T00QP4_A5539Lb_ColNumC[0]);
            }
            if ( GXutil.strcmp(Z5540Lb_Cartaz, T00QP4_A5540Lb_Cartaz[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Cartaz");
               GXutil.writeLogRaw("Old: ",Z5540Lb_Cartaz);
               GXutil.writeLogRaw("Current: ",T00QP4_A5540Lb_Cartaz[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5541Lb_FechaE), GXutil.resetTime(T00QP4_A5541Lb_FechaE[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_FechaE");
               GXutil.writeLogRaw("Old: ",Z5541Lb_FechaE);
               GXutil.writeLogRaw("Current: ",T00QP4_A5541Lb_FechaE[0]);
            }
            if ( !( GXutil.dateCompare(Z5542Lb_HoraE, T00QP4_A5542Lb_HoraE[0]) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_HoraE");
               GXutil.writeLogRaw("Old: ",Z5542Lb_HoraE);
               GXutil.writeLogRaw("Current: ",T00QP4_A5542Lb_HoraE[0]);
            }
            if ( GXutil.strcmp(Z5543Lb_Usuario, T00QP4_A5543Lb_Usuario[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Usuario");
               GXutil.writeLogRaw("Old: ",Z5543Lb_Usuario);
               GXutil.writeLogRaw("Current: ",T00QP4_A5543Lb_Usuario[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5544Lb_FechaM), GXutil.resetTime(T00QP4_A5544Lb_FechaM[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_FechaM");
               GXutil.writeLogRaw("Old: ",Z5544Lb_FechaM);
               GXutil.writeLogRaw("Current: ",T00QP4_A5544Lb_FechaM[0]);
            }
            if ( !( GXutil.dateCompare(Z5545Lb_HoraM, T00QP4_A5545Lb_HoraM[0]) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_HoraM");
               GXutil.writeLogRaw("Old: ",Z5545Lb_HoraM);
               GXutil.writeLogRaw("Current: ",T00QP4_A5545Lb_HoraM[0]);
            }
            if ( GXutil.strcmp(Z5546Lb_UsuM, T00QP4_A5546Lb_UsuM[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_UsuM");
               GXutil.writeLogRaw("Old: ",Z5546Lb_UsuM);
               GXutil.writeLogRaw("Current: ",T00QP4_A5546Lb_UsuM[0]);
            }
            if ( DecimalUtil.compareTo(Z5547Lb_Rb, T00QP4_A5547Lb_Rb[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Rb");
               GXutil.writeLogRaw("Old: ",Z5547Lb_Rb);
               GXutil.writeLogRaw("Current: ",T00QP4_A5547Lb_Rb[0]);
            }
            if ( GXutil.strcmp(Z5549Lb_UltOp, T00QP4_A5549Lb_UltOp[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_UltOp");
               GXutil.writeLogRaw("Old: ",Z5549Lb_UltOp);
               GXutil.writeLogRaw("Current: ",T00QP4_A5549Lb_UltOp[0]);
            }
            if ( Z5550Lb_UltlPq != T00QP4_A5550Lb_UltlPq[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_UltlPq");
               GXutil.writeLogRaw("Old: ",Z5550Lb_UltlPq);
               GXutil.writeLogRaw("Current: ",T00QP4_A5550Lb_UltlPq[0]);
            }
            if ( Z5569Lb_EstEns != T00QP4_A5569Lb_EstEns[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_EstEns");
               GXutil.writeLogRaw("Old: ",Z5569Lb_EstEns);
               GXutil.writeLogRaw("Current: ",T00QP4_A5569Lb_EstEns[0]);
            }
            if ( GXutil.strcmp(Z5570Lb_Tipo, T00QP4_A5570Lb_Tipo[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tipo");
               GXutil.writeLogRaw("Old: ",Z5570Lb_Tipo);
               GXutil.writeLogRaw("Current: ",T00QP4_A5570Lb_Tipo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5594Lb_cartazf), GXutil.resetTime(T00QP4_A5594Lb_cartazf[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_cartazf");
               GXutil.writeLogRaw("Old: ",Z5594Lb_cartazf);
               GXutil.writeLogRaw("Current: ",T00QP4_A5594Lb_cartazf[0]);
            }
            if ( Z5595Lb_malha != T00QP4_A5595Lb_malha[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_malha");
               GXutil.writeLogRaw("Old: ",Z5595Lb_malha);
               GXutil.writeLogRaw("Current: ",T00QP4_A5595Lb_malha[0]);
            }
            if ( Z5596Lb_reprod != T00QP4_A5596Lb_reprod[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_reprod");
               GXutil.writeLogRaw("Old: ",Z5596Lb_reprod);
               GXutil.writeLogRaw("Current: ",T00QP4_A5596Lb_reprod[0]);
            }
            if ( Z5597Lb_TipRec != T00QP4_A5597Lb_TipRec[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TipRec");
               GXutil.writeLogRaw("Old: ",Z5597Lb_TipRec);
               GXutil.writeLogRaw("Current: ",T00QP4_A5597Lb_TipRec[0]);
            }
            if ( Z5598Lb_impreso != T00QP4_A5598Lb_impreso[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_impreso");
               GXutil.writeLogRaw("Old: ",Z5598Lb_impreso);
               GXutil.writeLogRaw("Current: ",T00QP4_A5598Lb_impreso[0]);
            }
            if ( Z5599Lb_RGB != T00QP4_A5599Lb_RGB[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_RGB");
               GXutil.writeLogRaw("Old: ",Z5599Lb_RGB);
               GXutil.writeLogRaw("Current: ",T00QP4_A5599Lb_RGB[0]);
            }
            if ( Z5600Lb_IDM != T00QP4_A5600Lb_IDM[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_IDM");
               GXutil.writeLogRaw("Old: ",Z5600Lb_IDM);
               GXutil.writeLogRaw("Current: ",T00QP4_A5600Lb_IDM[0]);
            }
            if ( Z5601Lb_Tempt != T00QP4_A5601Lb_Tempt[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tempt");
               GXutil.writeLogRaw("Old: ",Z5601Lb_Tempt);
               GXutil.writeLogRaw("Current: ",T00QP4_A5601Lb_Tempt[0]);
            }
            if ( Z5610Lb_Temp2 != T00QP4_A5610Lb_Temp2[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Temp2");
               GXutil.writeLogRaw("Old: ",Z5610Lb_Temp2);
               GXutil.writeLogRaw("Current: ",T00QP4_A5610Lb_Temp2[0]);
            }
            if ( Z5611Lb_Temp3 != T00QP4_A5611Lb_Temp3[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Temp3");
               GXutil.writeLogRaw("Old: ",Z5611Lb_Temp3);
               GXutil.writeLogRaw("Current: ",T00QP4_A5611Lb_Temp3[0]);
            }
            if ( GXutil.strcmp(Z5700Lb_Talao, T00QP4_A5700Lb_Talao[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Talao");
               GXutil.writeLogRaw("Old: ",Z5700Lb_Talao);
               GXutil.writeLogRaw("Current: ",T00QP4_A5700Lb_Talao[0]);
            }
            if ( GXutil.strcmp(Z5701Lb_Local, T00QP4_A5701Lb_Local[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Local");
               GXutil.writeLogRaw("Old: ",Z5701Lb_Local);
               GXutil.writeLogRaw("Current: ",T00QP4_A5701Lb_Local[0]);
            }
            if ( Z5699Lb_EstLab != T00QP4_A5699Lb_EstLab[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_EstLab");
               GXutil.writeLogRaw("Old: ",Z5699Lb_EstLab);
               GXutil.writeLogRaw("Current: ",T00QP4_A5699Lb_EstLab[0]);
            }
            if ( Z5717Lb_numopu != T00QP4_A5717Lb_numopu[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_numopu");
               GXutil.writeLogRaw("Old: ",Z5717Lb_numopu);
               GXutil.writeLogRaw("Current: ",T00QP4_A5717Lb_numopu[0]);
            }
            if ( Z5901Lab_desvio != T00QP4_A5901Lab_desvio[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lab_desvio");
               GXutil.writeLogRaw("Old: ",Z5901Lab_desvio);
               GXutil.writeLogRaw("Current: ",T00QP4_A5901Lab_desvio[0]);
            }
            if ( Z5988Lb_nfibras != T00QP4_A5988Lb_nfibras[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_nfibras");
               GXutil.writeLogRaw("Old: ",Z5988Lb_nfibras);
               GXutil.writeLogRaw("Current: ",T00QP4_A5988Lb_nfibras[0]);
            }
            if ( DecimalUtil.compareTo(Z6056Lb_pesom, T00QP4_A6056Lb_pesom[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_pesom");
               GXutil.writeLogRaw("Old: ",Z6056Lb_pesom);
               GXutil.writeLogRaw("Current: ",T00QP4_A6056Lb_pesom[0]);
            }
            if ( DecimalUtil.compareTo(Z6057Lb_volum, T00QP4_A6057Lb_volum[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_volum");
               GXutil.writeLogRaw("Old: ",Z6057Lb_volum);
               GXutil.writeLogRaw("Current: ",T00QP4_A6057Lb_volum[0]);
            }
            if ( GXutil.strcmp(Z6546Lb_Pantone, T00QP4_A6546Lb_Pantone[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Pantone");
               GXutil.writeLogRaw("Old: ",Z6546Lb_Pantone);
               GXutil.writeLogRaw("Current: ",T00QP4_A6546Lb_Pantone[0]);
            }
            if ( GXutil.strcmp(Z6618Lb_PedCod, T00QP4_A6618Lb_PedCod[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_PedCod");
               GXutil.writeLogRaw("Old: ",Z6618Lb_PedCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A6618Lb_PedCod[0]);
            }
            if ( GXutil.strcmp(Z6644Lb_PriEns, T00QP4_A6644Lb_PriEns[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_PriEns");
               GXutil.writeLogRaw("Old: ",Z6644Lb_PriEns);
               GXutil.writeLogRaw("Current: ",T00QP4_A6644Lb_PriEns[0]);
            }
            if ( GXutil.strcmp(Z6653Lb_Tra1, T00QP4_A6653Lb_Tra1[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra1");
               GXutil.writeLogRaw("Old: ",Z6653Lb_Tra1);
               GXutil.writeLogRaw("Current: ",T00QP4_A6653Lb_Tra1[0]);
            }
            if ( Z6654Lb_TraP1 != T00QP4_A6654Lb_TraP1[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP1");
               GXutil.writeLogRaw("Old: ",Z6654Lb_TraP1);
               GXutil.writeLogRaw("Current: ",T00QP4_A6654Lb_TraP1[0]);
            }
            if ( GXutil.strcmp(Z6655Lb_Tra2, T00QP4_A6655Lb_Tra2[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra2");
               GXutil.writeLogRaw("Old: ",Z6655Lb_Tra2);
               GXutil.writeLogRaw("Current: ",T00QP4_A6655Lb_Tra2[0]);
            }
            if ( Z6656Lb_TraP2 != T00QP4_A6656Lb_TraP2[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP2");
               GXutil.writeLogRaw("Old: ",Z6656Lb_TraP2);
               GXutil.writeLogRaw("Current: ",T00QP4_A6656Lb_TraP2[0]);
            }
            if ( GXutil.strcmp(Z6657Lb_Tra3, T00QP4_A6657Lb_Tra3[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra3");
               GXutil.writeLogRaw("Old: ",Z6657Lb_Tra3);
               GXutil.writeLogRaw("Current: ",T00QP4_A6657Lb_Tra3[0]);
            }
            if ( Z6658Lb_TraP3 != T00QP4_A6658Lb_TraP3[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP3");
               GXutil.writeLogRaw("Old: ",Z6658Lb_TraP3);
               GXutil.writeLogRaw("Current: ",T00QP4_A6658Lb_TraP3[0]);
            }
            if ( GXutil.strcmp(Z6842Lb_Tra4, T00QP4_A6842Lb_Tra4[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra4");
               GXutil.writeLogRaw("Old: ",Z6842Lb_Tra4);
               GXutil.writeLogRaw("Current: ",T00QP4_A6842Lb_Tra4[0]);
            }
            if ( Z6843Lb_TraP4 != T00QP4_A6843Lb_TraP4[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP4");
               GXutil.writeLogRaw("Old: ",Z6843Lb_TraP4);
               GXutil.writeLogRaw("Current: ",T00QP4_A6843Lb_TraP4[0]);
            }
            if ( GXutil.strcmp(Z6844Lb_Tra5, T00QP4_A6844Lb_Tra5[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra5");
               GXutil.writeLogRaw("Old: ",Z6844Lb_Tra5);
               GXutil.writeLogRaw("Current: ",T00QP4_A6844Lb_Tra5[0]);
            }
            if ( Z6845Lb_TraP5 != T00QP4_A6845Lb_TraP5[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP5");
               GXutil.writeLogRaw("Old: ",Z6845Lb_TraP5);
               GXutil.writeLogRaw("Current: ",T00QP4_A6845Lb_TraP5[0]);
            }
            if ( GXutil.strcmp(Z6846Lb_Tra6, T00QP4_A6846Lb_Tra6[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Tra6");
               GXutil.writeLogRaw("Old: ",Z6846Lb_Tra6);
               GXutil.writeLogRaw("Current: ",T00QP4_A6846Lb_Tra6[0]);
            }
            if ( Z6847Lb_TraP6 != T00QP4_A6847Lb_TraP6[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_TraP6");
               GXutil.writeLogRaw("Old: ",Z6847Lb_TraP6);
               GXutil.writeLogRaw("Current: ",T00QP4_A6847Lb_TraP6[0]);
            }
            if ( GXutil.strcmp(Z7780Lb_Hila, T00QP4_A7780Lb_Hila[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Hila");
               GXutil.writeLogRaw("Old: ",Z7780Lb_Hila);
               GXutil.writeLogRaw("Current: ",T00QP4_A7780Lb_Hila[0]);
            }
            if ( Z8946Lb_NCoS != T00QP4_A8946Lb_NCoS[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_NCoS");
               GXutil.writeLogRaw("Old: ",Z8946Lb_NCoS);
               GXutil.writeLogRaw("Current: ",T00QP4_A8946Lb_NCoS[0]);
            }
            if ( Z8947Lb_NOpR != T00QP4_A8947Lb_NOpR[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_NOpR");
               GXutil.writeLogRaw("Old: ",Z8947Lb_NOpR);
               GXutil.writeLogRaw("Current: ",T00QP4_A8947Lb_NOpR[0]);
            }
            if ( Z8948Lb_NCoE != T00QP4_A8948Lb_NCoE[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_NCoE");
               GXutil.writeLogRaw("Old: ",Z8948Lb_NCoE);
               GXutil.writeLogRaw("Current: ",T00QP4_A8948Lb_NCoE[0]);
            }
            if ( Z8949Lb_NOpE != T00QP4_A8949Lb_NOpE[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_NOpE");
               GXutil.writeLogRaw("Old: ",Z8949Lb_NOpE);
               GXutil.writeLogRaw("Current: ",T00QP4_A8949Lb_NOpE[0]);
            }
            if ( Z8950Lb_NOpN != T00QP4_A8950Lb_NOpN[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_NOpN");
               GXutil.writeLogRaw("Old: ",Z8950Lb_NOpN);
               GXutil.writeLogRaw("Current: ",T00QP4_A8950Lb_NOpN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8951Lb_FecE), GXutil.resetTime(T00QP4_A8951Lb_FecE[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_FecE");
               GXutil.writeLogRaw("Old: ",Z8951Lb_FecE);
               GXutil.writeLogRaw("Current: ",T00QP4_A8951Lb_FecE[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8952Lb_FecN), GXutil.resetTime(T00QP4_A8952Lb_FecN[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_FecN");
               GXutil.writeLogRaw("Old: ",Z8952Lb_FecN);
               GXutil.writeLogRaw("Current: ",T00QP4_A8952Lb_FecN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8953Lb_FecR), GXutil.resetTime(T00QP4_A8953Lb_FecR[0])) ) )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_FecR");
               GXutil.writeLogRaw("Old: ",Z8953Lb_FecR);
               GXutil.writeLogRaw("Current: ",T00QP4_A8953Lb_FecR[0]);
            }
            if ( Z8954Lb_diasER != T00QP4_A8954Lb_diasER[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_diasER");
               GXutil.writeLogRaw("Old: ",Z8954Lb_diasER);
               GXutil.writeLogRaw("Current: ",T00QP4_A8954Lb_diasER[0]);
            }
            if ( GXutil.strcmp(Z9900Lb_obsCl, T00QP4_A9900Lb_obsCl[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_obsCl");
               GXutil.writeLogRaw("Old: ",Z9900Lb_obsCl);
               GXutil.writeLogRaw("Current: ",T00QP4_A9900Lb_obsCl[0]);
            }
            if ( GXutil.strcmp(Z10883Lb_obsLb, T00QP4_A10883Lb_obsLb[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_obsLb");
               GXutil.writeLogRaw("Old: ",Z10883Lb_obsLb);
               GXutil.writeLogRaw("Current: ",T00QP4_A10883Lb_obsLb[0]);
            }
            if ( Z252CliCod != T00QP4_A252CliCod[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A252CliCod[0]);
            }
            if ( Z583IntCod != T00QP4_A583IntCod[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"IntCod");
               GXutil.writeLogRaw("Old: ",Z583IntCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A583IntCod[0]);
            }
            if ( Z626MatCod != T00QP4_A626MatCod[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"MatCod");
               GXutil.writeLogRaw("Old: ",Z626MatCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A626MatCod[0]);
            }
            if ( Z831TipColCod != T00QP4_A831TipColCod[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"TipColCod");
               GXutil.writeLogRaw("Old: ",Z831TipColCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A831TipColCod[0]);
            }
            if ( GXutil.strcmp(Z1514MacProCod, T00QP4_A1514MacProCod[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"MacProCod");
               GXutil.writeLogRaw("Old: ",Z1514MacProCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A1514MacProCod[0]);
            }
            if ( Z3316CodSol != T00QP4_A3316CodSol[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"CodSol");
               GXutil.writeLogRaw("Old: ",Z3316CodSol);
               GXutil.writeLogRaw("Current: ",T00QP4_A3316CodSol[0]);
            }
            if ( GXutil.strcmp(Z5098TipDisCod, T00QP4_A5098TipDisCod[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"TipDisCod");
               GXutil.writeLogRaw("Old: ",Z5098TipDisCod);
               GXutil.writeLogRaw("Current: ",T00QP4_A5098TipDisCod[0]);
            }
            if ( Z5801Lab_CodCau != T00QP4_A5801Lab_CodCau[0] )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lab_CodCau");
               GXutil.writeLogRaw("Old: ",Z5801Lab_CodCau);
               GXutil.writeLogRaw("Current: ",T00QP4_A5801Lab_CodCau[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertQP817( )
   {
      beforeValidateQP817( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQP817( ) ;
      }
      if ( AnyError == 0 )
      {
         zmQP817( 0) ;
         checkOptimisticConcurrencyQP817( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQP817( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertQP817( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QP31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A5532Lb_numero), A5533Lb_ArtCod, A5534Lb_ArtDsc, Short.valueOf(A5535Lb_TipArt), A5552Lb_TipArtD, A5536Lb_ColNom, Integer.valueOf(A5537Lb_ColNum), A5538Lb_ColNomC, Integer.valueOf(A5539Lb_ColNumC), A5540Lb_Cartaz, A5541Lb_FechaE, A5542Lb_HoraE, A5543Lb_Usuario, A5544Lb_FechaM, A5545Lb_HoraM, A5546Lb_UsuM, A5547Lb_Rb, A5548Lb_Obs, A5549Lb_UltOp, Short.valueOf(A5550Lb_UltlPq), Byte.valueOf(A5569Lb_EstEns), A5570Lb_Tipo, A5594Lb_cartazf, Byte.valueOf(A5595Lb_malha), Byte.valueOf(A5596Lb_reprod), Byte.valueOf(A5597Lb_TipRec), Byte.valueOf(A5598Lb_impreso), Long.valueOf(A5599Lb_RGB), Integer.valueOf(A5600Lb_IDM), Short.valueOf(A5601Lb_Tempt), Short.valueOf(A5610Lb_Temp2), Short.valueOf(A5611Lb_Temp3), A5700Lb_Talao, A5701Lb_Local, Byte.valueOf(A5699Lb_EstLab), Byte.valueOf(A5717Lb_numopu), Short.valueOf(A5901Lab_desvio), Byte.valueOf(A5988Lb_nfibras), A6056Lb_pesom, A6057Lb_volum, A6546Lb_Pantone, A6618Lb_PedCod, A6644Lb_PriEns, A6653Lb_Tra1, Short.valueOf(A6654Lb_TraP1), A6655Lb_Tra2, Short.valueOf(A6656Lb_TraP2), A6657Lb_Tra3, Short.valueOf(A6658Lb_TraP3), A6842Lb_Tra4, Short.valueOf(A6843Lb_TraP4), A6844Lb_Tra5, Short.valueOf(A6845Lb_TraP5), A6846Lb_Tra6, Short.valueOf(A6847Lb_TraP6), A7780Lb_Hila, Integer.valueOf(A8946Lb_NCoS), Integer.valueOf(A8947Lb_NOpR), Integer.valueOf(A8948Lb_NCoE), Integer.valueOf(A8949Lb_NOpE), Integer.valueOf(A8950Lb_NOpN), A8951Lb_FecE, A8952Lb_FecN, A8953Lb_FecR, Integer.valueOf(A8954Lb_diasER), A9900Lb_obsCl, A10883Lb_obsLb, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n5098TipDisCod), A5098TipDisCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
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
                        processLevelQP817( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionQP0( ) ;
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
            loadQP817( ) ;
         }
         endLevelQP817( ) ;
      }
      closeExtendedTableCursorsQP817( ) ;
   }

   public void updateQP817( )
   {
      beforeValidateQP817( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQP817( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQP817( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQP817( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateQP817( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QP32 */
                  pr_default.execute(30, new Object[] {A5533Lb_ArtCod, A5534Lb_ArtDsc, Short.valueOf(A5535Lb_TipArt), A5552Lb_TipArtD, A5536Lb_ColNom, Integer.valueOf(A5537Lb_ColNum), A5538Lb_ColNomC, Integer.valueOf(A5539Lb_ColNumC), A5540Lb_Cartaz, A5541Lb_FechaE, A5542Lb_HoraE, A5543Lb_Usuario, A5544Lb_FechaM, A5545Lb_HoraM, A5546Lb_UsuM, A5547Lb_Rb, A5548Lb_Obs, A5549Lb_UltOp, Short.valueOf(A5550Lb_UltlPq), Byte.valueOf(A5569Lb_EstEns), A5570Lb_Tipo, A5594Lb_cartazf, Byte.valueOf(A5595Lb_malha), Byte.valueOf(A5596Lb_reprod), Byte.valueOf(A5597Lb_TipRec), Byte.valueOf(A5598Lb_impreso), Long.valueOf(A5599Lb_RGB), Integer.valueOf(A5600Lb_IDM), Short.valueOf(A5601Lb_Tempt), Short.valueOf(A5610Lb_Temp2), Short.valueOf(A5611Lb_Temp3), A5700Lb_Talao, A5701Lb_Local, Byte.valueOf(A5699Lb_EstLab), Byte.valueOf(A5717Lb_numopu), Short.valueOf(A5901Lab_desvio), Byte.valueOf(A5988Lb_nfibras), A6056Lb_pesom, A6057Lb_volum, A6546Lb_Pantone, A6618Lb_PedCod, A6644Lb_PriEns, A6653Lb_Tra1, Short.valueOf(A6654Lb_TraP1), A6655Lb_Tra2, Short.valueOf(A6656Lb_TraP2), A6657Lb_Tra3, Short.valueOf(A6658Lb_TraP3), A6842Lb_Tra4, Short.valueOf(A6843Lb_TraP4), A6844Lb_Tra5, Short.valueOf(A6845Lb_TraP5), A6846Lb_Tra6, Short.valueOf(A6847Lb_TraP6), A7780Lb_Hila, Integer.valueOf(A8946Lb_NCoS), Integer.valueOf(A8947Lb_NOpR), Integer.valueOf(A8948Lb_NCoE), Integer.valueOf(A8949Lb_NOpE), Integer.valueOf(A8950Lb_NOpN), A8951Lb_FecE, A8952Lb_FecN, A8953Lb_FecR, Integer.valueOf(A8954Lb_diasER), A9900Lb_obsCl, A10883Lb_obsLb, Integer.valueOf(A252CliCod), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n5098TipDisCod), A5098TipDisCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
                  if ( (pr_default.getStatus(30) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS001"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateQP817( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelQP817( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionQP0( ) ;
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
         endLevelQP817( ) ;
      }
      closeExtendedTableCursorsQP817( ) ;
   }

   public void deferredUpdateQP817( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateQP817( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQP817( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsQP817( ) ;
         afterConfirmQP817( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteQP817( ) ;
            if ( AnyError == 0 )
            {
               scanStartQP818( ) ;
               while ( RcdFound818 != 0 )
               {
                  getByPrimaryKeyQP818( ) ;
                  deleteQP818( ) ;
                  scanNextQP818( ) ;
               }
               scanEndQP818( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QP33 */
                  pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound817 == 0 )
                        {
                           initAllQP817( ) ;
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
                        resetCaptionQP0( ) ;
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
      sMode817 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelQP817( ) ;
      Gx_mode = sMode817 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsQP817( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00QP34 */
         pr_default.execute(32, new Object[] {A396EmprCod});
         A407EmprNom = T00QP34_A407EmprNom[0] ;
         n407EmprNom = T00QP34_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(32);
         /* Using cursor T00QP35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T00QP35_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(33);
         /* Using cursor T00QP36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         A832TipColDsc = T00QP36_A832TipColDsc[0] ;
         n832TipColDsc = T00QP36_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         pr_default.close(34);
         /* Using cursor T00QP37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         A584IntDsc = T00QP37_A584IntDsc[0] ;
         n584IntDsc = T00QP37_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         pr_default.close(35);
         /* Using cursor T00QP38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod)});
         A627MatDsc = T00QP38_A627MatDsc[0] ;
         n627MatDsc = T00QP38_n627MatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
         pr_default.close(36);
         /* Using cursor T00QP39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
         A3317DscSol = T00QP39_A3317DscSol[0] ;
         n3317DscSol = T00QP39_n3317DscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
         pr_default.close(37);
         /* Using cursor T00QP40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau)});
         A5802Lab_DscCau = T00QP40_A5802Lab_DscCau[0] ;
         n5802Lab_DscCau = T00QP40_n5802Lab_DscCau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
         pr_default.close(38);
         /* Using cursor T00QP41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
         A5097TipDisDsc = T00QP41_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00QP41_n5097TipDisDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         pr_default.close(39);
         /* Using cursor T00QP42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
         A1515MacProDsc = T00QP42_A1515MacProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
         pr_default.close(40);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00QP43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00QP44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
      }
   }

   public void processNestedLevelQP818( )
   {
      nGXsfl_445_idx = 0 ;
      while ( nGXsfl_445_idx < nRC_GXsfl_445 )
      {
         readRowQP818( ) ;
         if ( ( nRcdExists_818 != 0 ) || ( nIsMod_818 != 0 ) )
         {
            standaloneNotModalQP818( ) ;
            getKeyQP818( ) ;
            if ( ( nRcdExists_818 == 0 ) && ( nRcdDeleted_818 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertQP818( ) ;
            }
            else
            {
               if ( RcdFound818 != 0 )
               {
                  if ( ( nRcdDeleted_818 != 0 ) && ( nRcdExists_818 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteQP818( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_818 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateQP818( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_818 == 0 )
                  {
                     GXCCtl = "LB_LINEAPQ_" + sGXsfl_445_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_lineaPq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_818_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_lineaPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_ForCod_Internalname, GXutil.rtrim( A5553Lb_ForCod)) ;
         httpContext.changePostValue( edtLb_ForDsc_Internalname, GXutil.rtrim( A5554Lb_ForDsc)) ;
         httpContext.changePostValue( chkLb_RecPip.getInternalname(), ((GXutil.strcmp(A6372Lb_RecPip, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkLb_Envio.getInternalname(), ((GXutil.strcmp(A8621Lb_Envio, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_445_idx, GXutil.rtrim( Z5553Lb_ForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_445_idx, GXutil.rtrim( Z6372Lb_RecPip)) ;
         httpContext.changePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_445_idx, GXutil.rtrim( Z8621Lb_Envio)) ;
         httpContext.changePostValue( "nRcdDeleted_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_818_"+sGXsfl_445_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_818 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_818_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINEAPQ_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORCOD_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORDSC_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RECPIP_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ENVIO_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllQP818( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_818 = (short)(0) ;
      nIsMod_818 = (short)(0) ;
      nRcdDeleted_818 = (short)(0) ;
   }

   public void processLevelQP817( )
   {
      /* Save parent mode. */
      sMode817 = Gx_mode ;
      processNestedLevelQP818( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode817 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelQP817( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteQP817( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tens000");
         if ( AnyError == 0 )
         {
            confirmValuesQP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tens000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartQP817( )
   {
      /* Using cursor T00QP45 */
      pr_default.execute(43);
      RcdFound817 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound817 = (short)(1) ;
         A396EmprCod = T00QP45_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = T00QP45_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextQP817( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound817 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound817 = (short)(1) ;
         A396EmprCod = T00QP45_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = T00QP45_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      }
   }

   public void scanEndQP817( )
   {
      pr_default.close(43);
   }

   public void afterConfirmQP817( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertQP817( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateQP817( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteQP817( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteQP817( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateQP817( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesQP817( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtLb_ArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Enabled), 5, 0), true);
      edtLb_ArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtDsc_Enabled), 5, 0), true);
      edtLb_TipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipArt_Enabled), 5, 0), true);
      edtLb_TipArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TipArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipArtD_Enabled), 5, 0), true);
      edtLb_ColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Enabled), 5, 0), true);
      edtLb_ColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtLb_ColNomC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNomC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Enabled), 5, 0), true);
      edtLb_ColNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNumC_Enabled), 5, 0), true);
      edtLb_Cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Enabled), 5, 0), true);
      edtLb_FechaE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FechaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Enabled), 5, 0), true);
      edtLb_HoraE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HoraE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HoraE_Enabled), 5, 0), true);
      edtLb_Usuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Usuario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Usuario_Enabled), 5, 0), true);
      edtLb_FechaM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FechaM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaM_Enabled), 5, 0), true);
      edtLb_HoraM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HoraM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HoraM_Enabled), 5, 0), true);
      edtLb_UsuM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UsuM_Enabled), 5, 0), true);
      edtLb_Rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      edtMatCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatCod_Enabled), 5, 0), true);
      edtMatDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatDsc_Enabled), 5, 0), true);
      edtCodSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodSol_Enabled), 5, 0), true);
      edtDscSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscSol_Enabled), 5, 0), true);
      edtLb_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Obs_Enabled), 5, 0), true);
      edtLb_UltOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltOp_Enabled), 5, 0), true);
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
      edtLb_EstEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_EstEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_EstEns_Enabled), 5, 0), true);
      edtLb_Tipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tipo_Enabled), 5, 0), true);
      edtLb_cartazf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_cartazf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_cartazf_Enabled), 5, 0), true);
      edtLb_malha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_malha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_malha_Enabled), 5, 0), true);
      edtLb_reprod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_reprod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_reprod_Enabled), 5, 0), true);
      edtLb_TipRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TipRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipRec_Enabled), 5, 0), true);
      edtLb_impreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_impreso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_impreso_Enabled), 5, 0), true);
      edtLb_RGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_RGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_RGB_Enabled), 5, 0), true);
      edtLb_IDM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_IDM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDM_Enabled), 5, 0), true);
      edtLb_Tempt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tempt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tempt_Enabled), 5, 0), true);
      edtLb_Temp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Temp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Temp2_Enabled), 5, 0), true);
      edtLb_Temp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Temp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Temp3_Enabled), 5, 0), true);
      edtLb_Talao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Talao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Talao_Enabled), 5, 0), true);
      edtLb_Local_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Local_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Local_Enabled), 5, 0), true);
      cmbLb_EstLab.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstLab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLb_EstLab.getEnabled(), 5, 0), true);
      edtLb_numopu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numopu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numopu_Enabled), 5, 0), true);
      edtLab_CodCau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLab_CodCau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLab_CodCau_Enabled), 5, 0), true);
      edtLab_DscCau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLab_DscCau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLab_DscCau_Enabled), 5, 0), true);
      edtLab_desvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLab_desvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLab_desvio_Enabled), 5, 0), true);
      edtTipDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Enabled), 5, 0), true);
      edtTipDisDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDisDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisDsc_Enabled), 5, 0), true);
      edtLb_nfibras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_nfibras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_nfibras_Enabled), 5, 0), true);
      edtLb_pesom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_pesom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_pesom_Enabled), 5, 0), true);
      edtLb_volum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_volum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_volum_Enabled), 5, 0), true);
      edtMacProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProCod_Enabled), 5, 0), true);
      edtMacProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacProDsc_Enabled), 5, 0), true);
      edtLb_Pantone_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Pantone_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Pantone_Enabled), 5, 0), true);
      edtLb_PedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PedCod_Enabled), 5, 0), true);
      edtLb_PriEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PriEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PriEns_Enabled), 5, 0), true);
      edtLb_Tra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra1_Enabled), 5, 0), true);
      edtLb_TraP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP1_Enabled), 5, 0), true);
      edtLb_Tra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra2_Enabled), 5, 0), true);
      edtLb_TraP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP2_Enabled), 5, 0), true);
      edtLb_Tra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra3_Enabled), 5, 0), true);
      edtLb_TraP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP3_Enabled), 5, 0), true);
      edtLb_Tra4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra4_Enabled), 5, 0), true);
      edtLb_TraP4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP4_Enabled), 5, 0), true);
      edtLb_Tra5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra5_Enabled), 5, 0), true);
      edtLb_TraP5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP5_Enabled), 5, 0), true);
      edtLb_Tra6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Tra6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tra6_Enabled), 5, 0), true);
      edtLb_TraP6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TraP6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TraP6_Enabled), 5, 0), true);
      edtLb_Hila_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Hila_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Hila_Enabled), 5, 0), true);
      edtLb_NCoS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NCoS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NCoS_Enabled), 5, 0), true);
      edtLb_NOpR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NOpR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NOpR_Enabled), 5, 0), true);
      edtLb_NCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NCoE_Enabled), 5, 0), true);
      edtLb_NOpE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NOpE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NOpE_Enabled), 5, 0), true);
      edtLb_NOpN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NOpN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NOpN_Enabled), 5, 0), true);
      edtLb_FecE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecE_Enabled), 5, 0), true);
      edtLb_FecN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecN_Enabled), 5, 0), true);
      edtLb_FecR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecR_Enabled), 5, 0), true);
      edtLb_diasER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_diasER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_diasER_Enabled), 5, 0), true);
      edtLb_obsCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_obsCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsCl_Enabled), 5, 0), true);
      edtLb_obsLb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_obsLb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsLb_Enabled), 5, 0), true);
   }

   public void zmQP818( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5553Lb_ForCod = T00QP3_A5553Lb_ForCod[0] ;
            Z6372Lb_RecPip = T00QP3_A6372Lb_RecPip[0] ;
            Z8621Lb_Envio = T00QP3_A8621Lb_Envio[0] ;
         }
         else
         {
            Z5553Lb_ForCod = A5553Lb_ForCod ;
            Z6372Lb_RecPip = A6372Lb_RecPip ;
            Z8621Lb_Envio = A8621Lb_Envio ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5551Lb_lineaPq = A5551Lb_lineaPq ;
         Z5553Lb_ForCod = A5553Lb_ForCod ;
         Z6372Lb_RecPip = A6372Lb_RecPip ;
         Z8621Lb_Envio = A8621Lb_Envio ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalQP818( )
   {
   }

   public void standaloneModalQP818( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_lineaPq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_445_Refreshing);
      }
      else
      {
         edtLb_lineaPq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_445_Refreshing);
      }
   }

   public void loadQP818( )
   {
      /* Using cursor T00QP46 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A5553Lb_ForCod = T00QP46_A5553Lb_ForCod[0] ;
         A6372Lb_RecPip = T00QP46_A6372Lb_RecPip[0] ;
         A8621Lb_Envio = T00QP46_A8621Lb_Envio[0] ;
         zmQP818( -14) ;
      }
      pr_default.close(44);
      onLoadActionsQP818( ) ;
   }

   public void onLoadActionsQP818( )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      tens000_impl.this.A396EmprCod = GXv_char2[0] ;
      tens000_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tens000_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
   }

   public void checkExtendedTableQP818( )
   {
      nIsDirty_818 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalQP818( ) ;
      nIsDirty_818 = (short)(1) ;
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tens000_impl.this.A396EmprCod = GXv_char4[0] ;
      tens000_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tens000_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
      if ( ! ( ( GXutil.strcmp(A6372Lb_RecPip, "S") == 0 ) || ( GXutil.strcmp(A6372Lb_RecPip, "N") == 0 ) ) )
      {
         GXCCtl = "LB_RECPIP_" + sGXsfl_445_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Proceso en Receta Pipetaje", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkLb_RecPip.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsQP818( )
   {
   }

   public void enableDisableQP818( )
   {
   }

   public void getKeyQP818( )
   {
      /* Using cursor T00QP47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound818 = (short)(1) ;
      }
      else
      {
         RcdFound818 = (short)(0) ;
      }
      pr_default.close(45);
   }

   public void getByPrimaryKeyQP818( )
   {
      /* Using cursor T00QP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmQP818( 14) ;
         RcdFound818 = (short)(1) ;
         initializeNonKeyQP818( ) ;
         A5551Lb_lineaPq = T00QP3_A5551Lb_lineaPq[0] ;
         A5553Lb_ForCod = T00QP3_A5553Lb_ForCod[0] ;
         A6372Lb_RecPip = T00QP3_A6372Lb_RecPip[0] ;
         A8621Lb_Envio = T00QP3_A8621Lb_Envio[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5551Lb_lineaPq = A5551Lb_lineaPq ;
         sMode818 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalQP818( ) ;
         loadQP818( ) ;
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound818 = (short)(0) ;
         initializeNonKeyQP818( ) ;
         sMode818 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalQP818( ) ;
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesQP818( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyQP818( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00QP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5553Lb_ForCod, T00QP2_A5553Lb_ForCod[0]) != 0 ) || ( GXutil.strcmp(Z6372Lb_RecPip, T00QP2_A6372Lb_RecPip[0]) != 0 ) || ( GXutil.strcmp(Z8621Lb_Envio, T00QP2_A8621Lb_Envio[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5553Lb_ForCod, T00QP2_A5553Lb_ForCod[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_ForCod");
               GXutil.writeLogRaw("Old: ",Z5553Lb_ForCod);
               GXutil.writeLogRaw("Current: ",T00QP2_A5553Lb_ForCod[0]);
            }
            if ( GXutil.strcmp(Z6372Lb_RecPip, T00QP2_A6372Lb_RecPip[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_RecPip");
               GXutil.writeLogRaw("Old: ",Z6372Lb_RecPip);
               GXutil.writeLogRaw("Current: ",T00QP2_A6372Lb_RecPip[0]);
            }
            if ( GXutil.strcmp(Z8621Lb_Envio, T00QP2_A8621Lb_Envio[0]) != 0 )
            {
               GXutil.writeLogln("tens000:[seudo value changed for attri]"+"Lb_Envio");
               GXutil.writeLogRaw("Old: ",Z8621Lb_Envio);
               GXutil.writeLogRaw("Current: ",T00QP2_A8621Lb_Envio[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertQP818( )
   {
      beforeValidateQP818( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQP818( ) ;
      }
      if ( AnyError == 0 )
      {
         zmQP818( 0) ;
         checkOptimisticConcurrencyQP818( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQP818( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertQP818( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QP48 */
                  pr_default.execute(46, new Object[] {Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq), A5553Lb_ForCod, A6372Lb_RecPip, A8621Lb_Envio, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
                  if ( (pr_default.getStatus(46) == 1) )
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
            loadQP818( ) ;
         }
         endLevelQP818( ) ;
      }
      closeExtendedTableCursorsQP818( ) ;
   }

   public void updateQP818( )
   {
      beforeValidateQP818( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQP818( ) ;
      }
      if ( ( nIsMod_818 != 0 ) || ( nIsDirty_818 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyQP818( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmQP818( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateQP818( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00QP49 */
                     pr_default.execute(47, new Object[] {A5553Lb_ForCod, A6372Lb_RecPip, A8621Lb_Envio, A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
                     if ( (pr_default.getStatus(47) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS000"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateQP818( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyQP818( ) ;
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
            endLevelQP818( ) ;
         }
      }
      closeExtendedTableCursorsQP818( ) ;
   }

   public void deferredUpdateQP818( )
   {
   }

   public void deleteQP818( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateQP818( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQP818( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsQP818( ) ;
         afterConfirmQP818( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteQP818( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00QP50 */
               pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
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
      sMode818 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelQP818( ) ;
      Gx_mode = sMode818 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsQP818( )
   {
      standaloneModalQP818( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A5554Lb_ForDsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A5553Lb_ForCod ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tens000_impl.this.A396EmprCod = GXv_char4[0] ;
         tens000_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
         tens000_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5554Lb_ForDsc = GXt_char1 ;
      }
   }

   public void endLevelQP818( )
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

   public void scanStartQP818( )
   {
      /* Scan By routine */
      /* Using cursor T00QP51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      RcdFound818 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A5551Lb_lineaPq = T00QP51_A5551Lb_lineaPq[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextQP818( )
   {
      /* Scan next routine */
      pr_default.readNext(49);
      RcdFound818 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A5551Lb_lineaPq = T00QP51_A5551Lb_lineaPq[0] ;
      }
   }

   public void scanEndQP818( )
   {
      pr_default.close(49);
   }

   public void afterConfirmQP818( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertQP818( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateQP818( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteQP818( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteQP818( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateQP818( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesQP818( )
   {
      edtLb_lineaPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_445_Refreshing);
      edtLb_ForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForCod_Enabled), 5, 0), !bGXsfl_445_Refreshing);
      edtLb_ForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForDsc_Enabled), 5, 0), !bGXsfl_445_Refreshing);
      chkLb_RecPip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_RecPip.getEnabled(), 5, 0), !bGXsfl_445_Refreshing);
      chkLb_Envio.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_Envio.getEnabled(), 5, 0), !bGXsfl_445_Refreshing);
   }

   public void send_integrity_lvl_hashesQP818( )
   {
   }

   public void send_integrity_lvl_hashesQP817( )
   {
   }

   public void subsflControlProps_445818( )
   {
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818_"+sGXsfl_445_idx ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ_"+sGXsfl_445_idx ;
      edtLb_ForCod_Internalname = "LB_FORCOD_"+sGXsfl_445_idx ;
      edtLb_ForDsc_Internalname = "LB_FORDSC_"+sGXsfl_445_idx ;
      chkLb_RecPip.setInternalname( "LB_RECPIP_"+sGXsfl_445_idx );
      chkLb_Envio.setInternalname( "LB_ENVIO_"+sGXsfl_445_idx );
   }

   public void subsflControlProps_fel_445818( )
   {
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818_"+sGXsfl_445_fel_idx ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ_"+sGXsfl_445_fel_idx ;
      edtLb_ForCod_Internalname = "LB_FORCOD_"+sGXsfl_445_fel_idx ;
      edtLb_ForDsc_Internalname = "LB_FORDSC_"+sGXsfl_445_fel_idx ;
      chkLb_RecPip.setInternalname( "LB_RECPIP_"+sGXsfl_445_fel_idx );
      chkLb_Envio.setInternalname( "LB_ENVIO_"+sGXsfl_445_fel_idx );
   }

   public void addRowQP818( )
   {
      nGXsfl_445_idx = (int)(nGXsfl_445_idx+1) ;
      sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_445818( ) ;
      sendRowQP818( ) ;
   }

   public void sendRowQP818( )
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
         if ( ((int)((nGXsfl_445_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_445_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 446,'',false,'" + sGXsfl_445_idx + "',445)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_818_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_818_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_818), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_818), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,446);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_818_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_818_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(445),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_445_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 447,'',false,'" + sGXsfl_445_idx + "',445)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_lineaPq_Internalname,GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5551Lb_lineaPq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,447);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_lineaPq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_lineaPq_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(445),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_445_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 448,'',false,'" + sGXsfl_445_idx + "',445)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ForCod_Internalname,GXutil.rtrim( A5553Lb_ForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,448);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_ForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(445),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ForDsc_Internalname,GXutil.rtrim( A5554Lb_ForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_ForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(445),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_445_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 450,'',false,'" + sGXsfl_445_idx + "',445)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "LB_RECPIP_" + sGXsfl_445_idx ;
      chkLb_RecPip.setName( GXCCtl );
      chkLb_RecPip.setWebtags( "" );
      chkLb_RecPip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "TitleCaption", chkLb_RecPip.getCaption(), !bGXsfl_445_Refreshing);
      chkLb_RecPip.setCheckedValue( "N" );
      A6372Lb_RecPip = ((GXutil.strcmp(GXutil.rtrim( A6372Lb_RecPip), "S")==0) ? "S" : "N") ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkLb_RecPip.getInternalname(),A6372Lb_RecPip,"","",Integer.valueOf(-1),Integer.valueOf(chkLb_RecPip.getEnabled()),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(450, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,450);\""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_445_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 451,'',false,'" + sGXsfl_445_idx + "',445)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "LB_ENVIO_" + sGXsfl_445_idx ;
      chkLb_Envio.setName( GXCCtl );
      chkLb_Envio.setWebtags( "" );
      chkLb_Envio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "TitleCaption", chkLb_Envio.getCaption(), !bGXsfl_445_Refreshing);
      chkLb_Envio.setCheckedValue( "N" );
      A8621Lb_Envio = ((GXutil.strcmp(GXutil.rtrim( A8621Lb_Envio), "S")==0) ? "S" : "N") ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkLb_Envio.getInternalname(),A8621Lb_Envio,"","",Integer.valueOf(-1),Integer.valueOf(chkLb_Envio.getEnabled()),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(451, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,451);\""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesQP818( ) ;
      GXCCtl = "Z5551Lb_lineaPq_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5553Lb_ForCod_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5553Lb_ForCod));
      GXCCtl = "Z6372Lb_RecPip_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6372Lb_RecPip));
      GXCCtl = "Z8621Lb_Envio_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8621Lb_Envio));
      GXCCtl = "nRcdDeleted_818_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_818_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_818_" + sGXsfl_445_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_818_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINEAPQ_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FORCOD_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FORDSC_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RECPIP_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ENVIO_"+sGXsfl_445_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowQP818( )
   {
      nGXsfl_445_idx = (int)(nGXsfl_445_idx+1) ;
      sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_445818( ) ;
      edtavnRcdDeleted_818_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_818_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_lineaPq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPQ_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_ForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORCOD_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_ForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORDSC_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkLb_RecPip.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_RECPIP_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkLb_Envio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_ENVIO_"+sGXsfl_445_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_818");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_818_Internalname ;
         wbErr = true ;
         nRcdDeleted_818 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_818 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINEAPQ_" + sGXsfl_445_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_lineaPq_Internalname ;
         wbErr = true ;
         A5551Lb_lineaPq = (short)(0) ;
      }
      else
      {
         A5551Lb_lineaPq = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5553Lb_ForCod = httpContext.cgiGet( edtLb_ForCod_Internalname) ;
      A5554Lb_ForDsc = httpContext.cgiGet( edtLb_ForDsc_Internalname) ;
      A6372Lb_RecPip = ((GXutil.strcmp(httpContext.cgiGet( chkLb_RecPip.getInternalname()), "S")==0) ? "S" : "N") ;
      A8621Lb_Envio = ((GXutil.strcmp(httpContext.cgiGet( chkLb_Envio.getInternalname()), "S")==0) ? "S" : "N") ;
      GXCCtl = "Z5551Lb_lineaPq_" + sGXsfl_445_idx ;
      Z5551Lb_lineaPq = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5553Lb_ForCod_" + sGXsfl_445_idx ;
      Z5553Lb_ForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6372Lb_RecPip_" + sGXsfl_445_idx ;
      Z6372Lb_RecPip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8621Lb_Envio_" + sGXsfl_445_idx ;
      Z8621Lb_Envio = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_818_" + sGXsfl_445_idx ;
      nRcdDeleted_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_818_" + sGXsfl_445_idx ;
      nRcdExists_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_818_" + sGXsfl_445_idx ;
      nIsMod_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_lineaPq_Enabled = edtLb_lineaPq_Enabled ;
   }

   public void confirmValuesQP0( )
   {
      nGXsfl_445_idx = 0 ;
      sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_445818( ) ;
      while ( nGXsfl_445_idx < nRC_GXsfl_445 )
      {
         nGXsfl_445_idx = (int)(nGXsfl_445_idx+1) ;
         sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_445818( ) ;
         httpContext.changePostValue( "Z5551Lb_lineaPq_"+sGXsfl_445_idx, httpContext.cgiGet( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_445_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_445_idx) ;
         httpContext.changePostValue( "Z5553Lb_ForCod_"+sGXsfl_445_idx, httpContext.cgiGet( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_445_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_445_idx) ;
         httpContext.changePostValue( "Z6372Lb_RecPip_"+sGXsfl_445_idx, httpContext.cgiGet( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_445_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_445_idx) ;
         httpContext.changePostValue( "Z8621Lb_Envio_"+sGXsfl_445_idx, httpContext.cgiGet( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_445_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_445_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tens000", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5533Lb_ArtCod", GXutil.rtrim( Z5533Lb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5534Lb_ArtDsc", GXutil.rtrim( Z5534Lb_ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5535Lb_TipArt", GXutil.ltrim( localUtil.ntoc( Z5535Lb_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5552Lb_TipArtD", GXutil.rtrim( Z5552Lb_TipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5536Lb_ColNom", GXutil.rtrim( Z5536Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5537Lb_ColNum", GXutil.ltrim( localUtil.ntoc( Z5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5538Lb_ColNomC", GXutil.rtrim( Z5538Lb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5539Lb_ColNumC", GXutil.ltrim( localUtil.ntoc( Z5539Lb_ColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5540Lb_Cartaz", GXutil.rtrim( Z5540Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5541Lb_FechaE", localUtil.dtoc( Z5541Lb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5542Lb_HoraE", localUtil.ttoc( Z5542Lb_HoraE, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5543Lb_Usuario", GXutil.rtrim( Z5543Lb_Usuario));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5544Lb_FechaM", localUtil.dtoc( Z5544Lb_FechaM, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5545Lb_HoraM", localUtil.ttoc( Z5545Lb_HoraM, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5546Lb_UsuM", GXutil.rtrim( Z5546Lb_UsuM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5547Lb_Rb", GXutil.ltrim( localUtil.ntoc( Z5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5549Lb_UltOp", GXutil.rtrim( Z5549Lb_UltOp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( Z5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5569Lb_EstEns", GXutil.ltrim( localUtil.ntoc( Z5569Lb_EstEns, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5570Lb_Tipo", GXutil.rtrim( Z5570Lb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5594Lb_cartazf", localUtil.dtoc( Z5594Lb_cartazf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5595Lb_malha", GXutil.ltrim( localUtil.ntoc( Z5595Lb_malha, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5596Lb_reprod", GXutil.ltrim( localUtil.ntoc( Z5596Lb_reprod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5597Lb_TipRec", GXutil.ltrim( localUtil.ntoc( Z5597Lb_TipRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5598Lb_impreso", GXutil.ltrim( localUtil.ntoc( Z5598Lb_impreso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5599Lb_RGB", GXutil.ltrim( localUtil.ntoc( Z5599Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5600Lb_IDM", GXutil.ltrim( localUtil.ntoc( Z5600Lb_IDM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5601Lb_Tempt", GXutil.ltrim( localUtil.ntoc( Z5601Lb_Tempt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5610Lb_Temp2", GXutil.ltrim( localUtil.ntoc( Z5610Lb_Temp2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5611Lb_Temp3", GXutil.ltrim( localUtil.ntoc( Z5611Lb_Temp3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5700Lb_Talao", GXutil.rtrim( Z5700Lb_Talao));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5701Lb_Local", GXutil.rtrim( Z5701Lb_Local));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5699Lb_EstLab", GXutil.ltrim( localUtil.ntoc( Z5699Lb_EstLab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5717Lb_numopu", GXutil.ltrim( localUtil.ntoc( Z5717Lb_numopu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5901Lab_desvio", GXutil.ltrim( localUtil.ntoc( Z5901Lab_desvio, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5988Lb_nfibras", GXutil.ltrim( localUtil.ntoc( Z5988Lb_nfibras, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6056Lb_pesom", GXutil.ltrim( localUtil.ntoc( Z6056Lb_pesom, (byte)(9), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6057Lb_volum", GXutil.ltrim( localUtil.ntoc( Z6057Lb_volum, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6546Lb_Pantone", GXutil.rtrim( Z6546Lb_Pantone));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6618Lb_PedCod", GXutil.rtrim( Z6618Lb_PedCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6644Lb_PriEns", GXutil.rtrim( Z6644Lb_PriEns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6653Lb_Tra1", GXutil.rtrim( Z6653Lb_Tra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6654Lb_TraP1", GXutil.ltrim( localUtil.ntoc( Z6654Lb_TraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6655Lb_Tra2", GXutil.rtrim( Z6655Lb_Tra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6656Lb_TraP2", GXutil.ltrim( localUtil.ntoc( Z6656Lb_TraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6657Lb_Tra3", GXutil.rtrim( Z6657Lb_Tra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6658Lb_TraP3", GXutil.ltrim( localUtil.ntoc( Z6658Lb_TraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6842Lb_Tra4", GXutil.rtrim( Z6842Lb_Tra4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6843Lb_TraP4", GXutil.ltrim( localUtil.ntoc( Z6843Lb_TraP4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6844Lb_Tra5", GXutil.rtrim( Z6844Lb_Tra5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6845Lb_TraP5", GXutil.ltrim( localUtil.ntoc( Z6845Lb_TraP5, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6846Lb_Tra6", GXutil.rtrim( Z6846Lb_Tra6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6847Lb_TraP6", GXutil.ltrim( localUtil.ntoc( Z6847Lb_TraP6, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7780Lb_Hila", GXutil.rtrim( Z7780Lb_Hila));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8946Lb_NCoS", GXutil.ltrim( localUtil.ntoc( Z8946Lb_NCoS, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8947Lb_NOpR", GXutil.ltrim( localUtil.ntoc( Z8947Lb_NOpR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8948Lb_NCoE", GXutil.ltrim( localUtil.ntoc( Z8948Lb_NCoE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8949Lb_NOpE", GXutil.ltrim( localUtil.ntoc( Z8949Lb_NOpE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8950Lb_NOpN", GXutil.ltrim( localUtil.ntoc( Z8950Lb_NOpN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8951Lb_FecE", localUtil.dtoc( Z8951Lb_FecE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8952Lb_FecN", localUtil.dtoc( Z8952Lb_FecN, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8953Lb_FecR", localUtil.dtoc( Z8953Lb_FecR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8954Lb_diasER", GXutil.ltrim( localUtil.ntoc( Z8954Lb_diasER, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9900Lb_obsCl", Z9900Lb_obsCl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10883Lb_obsLb", Z10883Lb_obsLb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z626MatCod", GXutil.ltrim( localUtil.ntoc( Z626MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3316CodSol", GXutil.ltrim( localUtil.ntoc( Z3316CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5098TipDisCod", GXutil.rtrim( Z5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5801Lab_CodCau", GXutil.ltrim( localUtil.ntoc( Z5801Lab_CodCau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_445", GXutil.ltrim( localUtil.ntoc( nGXsfl_445_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTIPDISCOD", GXutil.rtrim( A5098TipDisCod));
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
      return formatLink("app.tens000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TENS000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA DE ENSAYOS", "") ;
   }

   public void initializeNonKeyQP817( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5533Lb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5533Lb_ArtCod", A5533Lb_ArtCod);
      A5534Lb_ArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5534Lb_ArtDsc", A5534Lb_ArtDsc);
      A5535Lb_TipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5535Lb_TipArt), 4, 0));
      A5552Lb_TipArtD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5552Lb_TipArtD", A5552Lb_TipArtD);
      A5536Lb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5536Lb_ColNom", A5536Lb_ColNom);
      A5537Lb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5537Lb_ColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      A832TipColDsc = "" ;
      n832TipColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      A5538Lb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5538Lb_ColNomC", A5538Lb_ColNomC);
      A5539Lb_ColNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5539Lb_ColNumC), 6, 0));
      A5540Lb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5540Lb_Cartaz", A5540Lb_Cartaz);
      A5541Lb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5543Lb_Usuario = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5543Lb_Usuario", A5543Lb_Usuario);
      A5544Lb_FechaM = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5546Lb_UsuM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5546Lb_UsuM", A5546Lb_UsuM);
      A5547Lb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrimstr( A5547Lb_Rb, 7, 2));
      A583IntCod = (byte)(0) ;
      n583IntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A626MatCod = (short)(0) ;
      n626MatCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A626MatCod), 3, 0));
      A627MatDsc = "" ;
      n627MatDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", A627MatDsc);
      A3316CodSol = (short)(0) ;
      n3316CodSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3316CodSol), 3, 0));
      A3317DscSol = "" ;
      n3317DscSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", A3317DscSol);
      A5548Lb_Obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5548Lb_Obs", A5548Lb_Obs);
      A5549Lb_UltOp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5549Lb_UltOp", A5549Lb_UltOp);
      A5550Lb_UltlPq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      A5569Lb_EstEns = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.str( A5569Lb_EstEns, 1, 0));
      A5570Lb_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5570Lb_Tipo", A5570Lb_Tipo);
      A5594Lb_cartazf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
      A5595Lb_malha = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.str( A5595Lb_malha, 1, 0));
      A5596Lb_reprod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.str( A5596Lb_reprod, 1, 0));
      A5597Lb_TipRec = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.str( A5597Lb_TipRec, 1, 0));
      A5598Lb_impreso = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.str( A5598Lb_impreso, 1, 0));
      A5599Lb_RGB = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
      A5600Lb_IDM = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5600Lb_IDM), 8, 0));
      A5601Lb_Tempt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5601Lb_Tempt), 4, 0));
      A5610Lb_Temp2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5610Lb_Temp2), 4, 0));
      A5611Lb_Temp3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5611Lb_Temp3), 4, 0));
      A5700Lb_Talao = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5700Lb_Talao", A5700Lb_Talao);
      A5701Lb_Local = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5701Lb_Local", A5701Lb_Local);
      A5699Lb_EstLab = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
      A5717Lb_numopu = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5717Lb_numopu), 2, 0));
      A5801Lab_CodCau = (short)(0) ;
      n5801Lab_CodCau = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5801Lab_CodCau), 4, 0));
      A5802Lab_DscCau = "" ;
      n5802Lab_DscCau = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", A5802Lab_DscCau);
      A5901Lab_desvio = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5901Lab_desvio), 4, 0));
      h5098TipDisCod = "" ;
      A5988Lb_nfibras = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5988Lb_nfibras), 2, 0));
      A6056Lb_pesom = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrimstr( A6056Lb_pesom, 9, 3));
      A6057Lb_volum = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrimstr( A6057Lb_volum, 7, 2));
      A1514MacProCod = "" ;
      n1514MacProCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", A1514MacProCod);
      A1515MacProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", A1515MacProDsc);
      A6546Lb_Pantone = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6546Lb_Pantone", A6546Lb_Pantone);
      A6618Lb_PedCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6618Lb_PedCod", A6618Lb_PedCod);
      A6644Lb_PriEns = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6644Lb_PriEns", A6644Lb_PriEns);
      A6653Lb_Tra1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6653Lb_Tra1", A6653Lb_Tra1);
      A6654Lb_TraP1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6654Lb_TraP1), 3, 0));
      A6655Lb_Tra2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6655Lb_Tra2", A6655Lb_Tra2);
      A6656Lb_TraP2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6656Lb_TraP2), 3, 0));
      A6657Lb_Tra3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6657Lb_Tra3", A6657Lb_Tra3);
      A6658Lb_TraP3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6658Lb_TraP3), 3, 0));
      A6842Lb_Tra4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6842Lb_Tra4", A6842Lb_Tra4);
      A6843Lb_TraP4 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6843Lb_TraP4), 3, 0));
      A6844Lb_Tra5 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6844Lb_Tra5", A6844Lb_Tra5);
      A6845Lb_TraP5 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6845Lb_TraP5), 3, 0));
      A6846Lb_Tra6 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6846Lb_Tra6", A6846Lb_Tra6);
      A6847Lb_TraP6 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6847Lb_TraP6), 3, 0));
      A7780Lb_Hila = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7780Lb_Hila", A7780Lb_Hila);
      A8946Lb_NCoS = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8946Lb_NCoS), 8, 0));
      A8947Lb_NOpR = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8947Lb_NOpR), 8, 0));
      A8948Lb_NCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8948Lb_NCoE), 8, 0));
      A8949Lb_NOpE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8949Lb_NOpE), 8, 0));
      A8950Lb_NOpN = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8950Lb_NOpN), 8, 0));
      A8951Lb_FecE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
      A8952Lb_FecN = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
      A8953Lb_FecR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
      A8954Lb_diasER = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8954Lb_diasER), 6, 0));
      A9900Lb_obsCl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9900Lb_obsCl", A9900Lb_obsCl);
      A10883Lb_obsLb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10883Lb_obsLb", A10883Lb_obsLb);
      Z5533Lb_ArtCod = "" ;
      Z5534Lb_ArtDsc = "" ;
      Z5535Lb_TipArt = (short)(0) ;
      Z5552Lb_TipArtD = "" ;
      Z5536Lb_ColNom = "" ;
      Z5537Lb_ColNum = 0 ;
      Z5538Lb_ColNomC = "" ;
      Z5539Lb_ColNumC = 0 ;
      Z5540Lb_Cartaz = "" ;
      Z5541Lb_FechaE = GXutil.nullDate() ;
      Z5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      Z5543Lb_Usuario = "" ;
      Z5544Lb_FechaM = GXutil.nullDate() ;
      Z5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      Z5546Lb_UsuM = "" ;
      Z5547Lb_Rb = DecimalUtil.ZERO ;
      Z5549Lb_UltOp = "" ;
      Z5550Lb_UltlPq = (short)(0) ;
      Z5569Lb_EstEns = (byte)(0) ;
      Z5570Lb_Tipo = "" ;
      Z5594Lb_cartazf = GXutil.nullDate() ;
      Z5595Lb_malha = (byte)(0) ;
      Z5596Lb_reprod = (byte)(0) ;
      Z5597Lb_TipRec = (byte)(0) ;
      Z5598Lb_impreso = (byte)(0) ;
      Z5599Lb_RGB = 0 ;
      Z5600Lb_IDM = 0 ;
      Z5601Lb_Tempt = (short)(0) ;
      Z5610Lb_Temp2 = (short)(0) ;
      Z5611Lb_Temp3 = (short)(0) ;
      Z5700Lb_Talao = "" ;
      Z5701Lb_Local = "" ;
      Z5699Lb_EstLab = (byte)(0) ;
      Z5717Lb_numopu = (byte)(0) ;
      Z5901Lab_desvio = (short)(0) ;
      Z5988Lb_nfibras = (byte)(0) ;
      Z6056Lb_pesom = DecimalUtil.ZERO ;
      Z6057Lb_volum = DecimalUtil.ZERO ;
      Z6546Lb_Pantone = "" ;
      Z6618Lb_PedCod = "" ;
      Z6644Lb_PriEns = "" ;
      Z6653Lb_Tra1 = "" ;
      Z6654Lb_TraP1 = (short)(0) ;
      Z6655Lb_Tra2 = "" ;
      Z6656Lb_TraP2 = (short)(0) ;
      Z6657Lb_Tra3 = "" ;
      Z6658Lb_TraP3 = (short)(0) ;
      Z6842Lb_Tra4 = "" ;
      Z6843Lb_TraP4 = (short)(0) ;
      Z6844Lb_Tra5 = "" ;
      Z6845Lb_TraP5 = (short)(0) ;
      Z6846Lb_Tra6 = "" ;
      Z6847Lb_TraP6 = (short)(0) ;
      Z7780Lb_Hila = "" ;
      Z8946Lb_NCoS = 0 ;
      Z8947Lb_NOpR = 0 ;
      Z8948Lb_NCoE = 0 ;
      Z8949Lb_NOpE = 0 ;
      Z8950Lb_NOpN = 0 ;
      Z8951Lb_FecE = GXutil.nullDate() ;
      Z8952Lb_FecN = GXutil.nullDate() ;
      Z8953Lb_FecR = GXutil.nullDate() ;
      Z8954Lb_diasER = 0 ;
      Z9900Lb_obsCl = "" ;
      Z10883Lb_obsLb = "" ;
      Z252CliCod = 0 ;
      Z583IntCod = (byte)(0) ;
      Z626MatCod = (short)(0) ;
      Z831TipColCod = (byte)(0) ;
      Z1514MacProCod = "" ;
      Z3316CodSol = (short)(0) ;
      Z5098TipDisCod = "" ;
      Z5801Lab_CodCau = (short)(0) ;
   }

   public void initAllQP817( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5532Lb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      initializeNonKeyQP817( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyQP818( )
   {
      A5554Lb_ForDsc = "" ;
      A5553Lb_ForCod = "" ;
      A6372Lb_RecPip = "" ;
      A8621Lb_Envio = "" ;
      Z5553Lb_ForCod = "" ;
      Z6372Lb_RecPip = "" ;
      Z8621Lb_Envio = "" ;
   }

   public void initAllQP818( )
   {
      A5551Lb_lineaPq = (short)(0) ;
      initializeNonKeyQP818( ) ;
   }

   public void standaloneModalInsertQP818( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524698", true, true);
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
      httpContext.AddJavascriptSource("tens000.js", "?20268241524698", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties818( )
   {
      edtLb_lineaPq_Enabled = defedtLb_lineaPq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_445_Refreshing);
   }

   public void startgridcontrol445( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5553Lb_ForCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5554Lb_ForDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6372Lb_RecPip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8621Lb_Envio));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtLb_numero_Internalname = "LB_NUMERO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtLb_TipArt_Internalname = "LB_TIPART" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtLb_TipArtD_Internalname = "LB_TIPARTD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtLb_ColNom_Internalname = "LB_COLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtLb_ColNum_Internalname = "LB_COLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtLb_ColNomC_Internalname = "LB_COLNOMC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtLb_ColNumC_Internalname = "LB_COLNUMC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtLb_Cartaz_Internalname = "LB_CARTAZ" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtLb_FechaE_Internalname = "LB_FECHAE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtLb_HoraE_Internalname = "LB_HORAE" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtLb_Usuario_Internalname = "LB_USUARIO" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtLb_FechaM_Internalname = "LB_FECHAM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtLb_HoraM_Internalname = "LB_HORAM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtLb_UsuM_Internalname = "LB_USUM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtLb_Rb_Internalname = "LB_RB" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtIntCod_Internalname = "INTCOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtIntDsc_Internalname = "INTDSC" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtMatCod_Internalname = "MATCOD" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtMatDsc_Internalname = "MATDSC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtCodSol_Internalname = "CODSOL" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtDscSol_Internalname = "DSCSOL" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtLb_Obs_Internalname = "LB_OBS" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtLb_UltOp_Internalname = "LB_ULTOP" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtLb_UltlPq_Internalname = "LB_ULTLPQ" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtLb_EstEns_Internalname = "LB_ESTENS" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtLb_Tipo_Internalname = "LB_TIPO" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtLb_cartazf_Internalname = "LB_CARTAZF" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtLb_malha_Internalname = "LB_MALHA" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtLb_reprod_Internalname = "LB_REPROD" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtLb_TipRec_Internalname = "LB_TIPREC" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtLb_impreso_Internalname = "LB_IMPRESO" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtLb_RGB_Internalname = "LB_RGB" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtLb_IDM_Internalname = "LB_IDM" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtLb_Tempt_Internalname = "LB_TEMPT" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtLb_Temp2_Internalname = "LB_TEMP2" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtLb_Temp3_Internalname = "LB_TEMP3" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtLb_Talao_Internalname = "LB_TALAO" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtLb_Local_Internalname = "LB_LOCAL" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      cmbLb_EstLab.setInternalname( "LB_ESTLAB" );
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtLb_numopu_Internalname = "LB_NUMOPU" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtLab_CodCau_Internalname = "LAB_CODCAU" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtLab_DscCau_Internalname = "LAB_DSCCAU" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtLab_desvio_Internalname = "LAB_DESVIO" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtTipDisCod_Internalname = "TIPDISCOD" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtTipDisDsc_Internalname = "TIPDISDSC" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtLb_nfibras_Internalname = "LB_NFIBRAS" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtLb_pesom_Internalname = "LB_PESOM" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtLb_volum_Internalname = "LB_VOLUM" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtMacProCod_Internalname = "MACPROCOD" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtMacProDsc_Internalname = "MACPRODSC" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtLb_Pantone_Internalname = "LB_PANTONE" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtLb_PedCod_Internalname = "LB_PEDCOD" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtLb_PriEns_Internalname = "LB_PRIENS" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtLb_Tra1_Internalname = "LB_TRA1" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtLb_TraP1_Internalname = "LB_TRAP1" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtLb_Tra2_Internalname = "LB_TRA2" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtLb_TraP2_Internalname = "LB_TRAP2" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtLb_Tra3_Internalname = "LB_TRA3" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtLb_TraP3_Internalname = "LB_TRAP3" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtLb_Tra4_Internalname = "LB_TRA4" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtLb_TraP4_Internalname = "LB_TRAP4" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtLb_Tra5_Internalname = "LB_TRA5" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtLb_TraP5_Internalname = "LB_TRAP5" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtLb_Tra6_Internalname = "LB_TRA6" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtLb_TraP6_Internalname = "LB_TRAP6" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtLb_Hila_Internalname = "LB_HILA" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtLb_NCoS_Internalname = "LB_NCOS" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtLb_NOpR_Internalname = "LB_NOPR" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtLb_NCoE_Internalname = "LB_NCOE" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtLb_NOpE_Internalname = "LB_NOPE" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtLb_NOpN_Internalname = "LB_NOPN" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtLb_FecE_Internalname = "LB_FECE" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtLb_FecN_Internalname = "LB_FECN" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtLb_FecR_Internalname = "LB_FECR" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtLb_diasER_Internalname = "LB_DIASER" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtLb_obsCl_Internalname = "LB_OBSCL" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtLb_obsLb_Internalname = "LB_OBSLB" ;
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818" ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ" ;
      edtLb_ForCod_Internalname = "LB_FORCOD" ;
      edtLb_ForDsc_Internalname = "LB_FORDSC" ;
      chkLb_RecPip.setInternalname( "LB_RECPIP" );
      chkLb_Envio.setInternalname( "LB_ENVIO" );
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
      Form.setCaption( httpContext.getMessage( "ENTRADA DE ENSAYOS", "") );
      chkLb_Envio.setCaption( "" );
      chkLb_RecPip.setCaption( "" );
      edtLb_ForDsc_Jsonclick = "" ;
      edtLb_ForCod_Jsonclick = "" ;
      edtLb_lineaPq_Jsonclick = "" ;
      edtavnRcdDeleted_818_Jsonclick = "" ;
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
      chkLb_Envio.setEnabled( 1 );
      chkLb_RecPip.setEnabled( 1 );
      edtLb_ForDsc_Enabled = 0 ;
      edtLb_ForCod_Enabled = 1 ;
      edtLb_lineaPq_Enabled = 1 ;
      edtavnRcdDeleted_818_Enabled = 1 ;
      edtLb_obsLb_Backcolor = (int)(0xFFFFFF) ;
      edtLb_obsLb_Enabled = 1 ;
      edtLb_obsCl_Backcolor = (int)(0xFFFFFF) ;
      edtLb_obsCl_Enabled = 1 ;
      edtLb_diasER_Jsonclick = "" ;
      edtLb_diasER_Backcolor = (int)(0xFFFFFF) ;
      edtLb_diasER_Enabled = 1 ;
      edtLb_FecR_Jsonclick = "" ;
      edtLb_FecR_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecR_Enabled = 1 ;
      edtLb_FecN_Jsonclick = "" ;
      edtLb_FecN_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecN_Enabled = 1 ;
      edtLb_FecE_Jsonclick = "" ;
      edtLb_FecE_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecE_Enabled = 1 ;
      edtLb_NOpN_Jsonclick = "" ;
      edtLb_NOpN_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NOpN_Enabled = 1 ;
      edtLb_NOpE_Jsonclick = "" ;
      edtLb_NOpE_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NOpE_Enabled = 1 ;
      edtLb_NCoE_Jsonclick = "" ;
      edtLb_NCoE_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NCoE_Enabled = 1 ;
      edtLb_NOpR_Jsonclick = "" ;
      edtLb_NOpR_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NOpR_Enabled = 1 ;
      edtLb_NCoS_Jsonclick = "" ;
      edtLb_NCoS_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NCoS_Enabled = 1 ;
      edtLb_Hila_Jsonclick = "" ;
      edtLb_Hila_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Hila_Enabled = 1 ;
      edtLb_TraP6_Jsonclick = "" ;
      edtLb_TraP6_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP6_Enabled = 1 ;
      edtLb_Tra6_Jsonclick = "" ;
      edtLb_Tra6_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra6_Enabled = 1 ;
      edtLb_TraP5_Jsonclick = "" ;
      edtLb_TraP5_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP5_Enabled = 1 ;
      edtLb_Tra5_Jsonclick = "" ;
      edtLb_Tra5_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra5_Enabled = 1 ;
      edtLb_TraP4_Jsonclick = "" ;
      edtLb_TraP4_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP4_Enabled = 1 ;
      edtLb_Tra4_Jsonclick = "" ;
      edtLb_Tra4_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra4_Enabled = 1 ;
      edtLb_TraP3_Jsonclick = "" ;
      edtLb_TraP3_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP3_Enabled = 1 ;
      edtLb_Tra3_Jsonclick = "" ;
      edtLb_Tra3_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra3_Enabled = 1 ;
      edtLb_TraP2_Jsonclick = "" ;
      edtLb_TraP2_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP2_Enabled = 1 ;
      edtLb_Tra2_Jsonclick = "" ;
      edtLb_Tra2_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra2_Enabled = 1 ;
      edtLb_TraP1_Jsonclick = "" ;
      edtLb_TraP1_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TraP1_Enabled = 1 ;
      edtLb_Tra1_Jsonclick = "" ;
      edtLb_Tra1_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tra1_Enabled = 1 ;
      edtLb_PriEns_Jsonclick = "" ;
      edtLb_PriEns_Backcolor = (int)(0xFFFFFF) ;
      edtLb_PriEns_Enabled = 1 ;
      edtLb_PedCod_Jsonclick = "" ;
      edtLb_PedCod_Backcolor = (int)(0xFFFFFF) ;
      edtLb_PedCod_Enabled = 1 ;
      edtLb_Pantone_Jsonclick = "" ;
      edtLb_Pantone_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Pantone_Enabled = 1 ;
      edtMacProDsc_Jsonclick = "" ;
      edtMacProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMacProDsc_Enabled = 0 ;
      edtMacProCod_Jsonclick = "" ;
      edtMacProCod_Backcolor = (int)(0xFFFFFF) ;
      edtMacProCod_Enabled = 1 ;
      edtLb_volum_Jsonclick = "" ;
      edtLb_volum_Backcolor = (int)(0xFFFFFF) ;
      edtLb_volum_Enabled = 1 ;
      edtLb_pesom_Jsonclick = "" ;
      edtLb_pesom_Backcolor = (int)(0xFFFFFF) ;
      edtLb_pesom_Enabled = 1 ;
      edtLb_nfibras_Jsonclick = "" ;
      edtLb_nfibras_Backcolor = (int)(0xFFFFFF) ;
      edtLb_nfibras_Enabled = 1 ;
      edtTipDisDsc_Jsonclick = "" ;
      edtTipDisDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipDisDsc_Enabled = 0 ;
      edtTipDisCod_Jsonclick = "" ;
      edtTipDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipDisCod_Enabled = 1 ;
      edtLab_desvio_Jsonclick = "" ;
      edtLab_desvio_Backcolor = (int)(0xFFFFFF) ;
      edtLab_desvio_Enabled = 1 ;
      edtLab_DscCau_Jsonclick = "" ;
      edtLab_DscCau_Backcolor = (int)(0xFFFFFF) ;
      edtLab_DscCau_Enabled = 0 ;
      edtLab_CodCau_Jsonclick = "" ;
      edtLab_CodCau_Backcolor = (int)(0xFFFFFF) ;
      edtLab_CodCau_Enabled = 1 ;
      edtLb_numopu_Jsonclick = "" ;
      edtLb_numopu_Backcolor = (int)(0xFFFFFF) ;
      edtLb_numopu_Enabled = 1 ;
      cmbLb_EstLab.setJsonclick( "" );
      cmbLb_EstLab.setEnabled( 1 );
      cmbLb_EstLab.setIBackground( (int)(0xFFFFFF) );
      edtLb_Local_Jsonclick = "" ;
      edtLb_Local_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Local_Enabled = 1 ;
      edtLb_Talao_Jsonclick = "" ;
      edtLb_Talao_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Talao_Enabled = 1 ;
      edtLb_Temp3_Jsonclick = "" ;
      edtLb_Temp3_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Temp3_Enabled = 1 ;
      edtLb_Temp2_Jsonclick = "" ;
      edtLb_Temp2_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Temp2_Enabled = 1 ;
      edtLb_Tempt_Jsonclick = "" ;
      edtLb_Tempt_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tempt_Enabled = 1 ;
      edtLb_IDM_Jsonclick = "" ;
      edtLb_IDM_Backcolor = (int)(0xFFFFFF) ;
      edtLb_IDM_Enabled = 1 ;
      edtLb_RGB_Jsonclick = "" ;
      edtLb_RGB_Backcolor = (int)(0xFFFFFF) ;
      edtLb_RGB_Enabled = 1 ;
      edtLb_impreso_Jsonclick = "" ;
      edtLb_impreso_Backcolor = (int)(0xFFFFFF) ;
      edtLb_impreso_Enabled = 1 ;
      edtLb_TipRec_Jsonclick = "" ;
      edtLb_TipRec_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TipRec_Enabled = 1 ;
      edtLb_reprod_Jsonclick = "" ;
      edtLb_reprod_Backcolor = (int)(0xFFFFFF) ;
      edtLb_reprod_Enabled = 1 ;
      edtLb_malha_Jsonclick = "" ;
      edtLb_malha_Backcolor = (int)(0xFFFFFF) ;
      edtLb_malha_Enabled = 1 ;
      edtLb_cartazf_Jsonclick = "" ;
      edtLb_cartazf_Backcolor = (int)(0xFFFFFF) ;
      edtLb_cartazf_Enabled = 1 ;
      edtLb_Tipo_Jsonclick = "" ;
      edtLb_Tipo_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Tipo_Enabled = 1 ;
      edtLb_EstEns_Jsonclick = "" ;
      edtLb_EstEns_Backcolor = (int)(0xFFFFFF) ;
      edtLb_EstEns_Enabled = 1 ;
      edtLb_UltlPq_Jsonclick = "" ;
      edtLb_UltlPq_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UltlPq_Enabled = 1 ;
      edtLb_UltOp_Jsonclick = "" ;
      edtLb_UltOp_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UltOp_Enabled = 1 ;
      edtLb_Obs_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Obs_Enabled = 1 ;
      edtDscSol_Jsonclick = "" ;
      edtDscSol_Backcolor = (int)(0xFFFFFF) ;
      edtDscSol_Enabled = 0 ;
      edtCodSol_Jsonclick = "" ;
      edtCodSol_Backcolor = (int)(0xFFFFFF) ;
      edtCodSol_Enabled = 1 ;
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
      edtLb_Rb_Jsonclick = "" ;
      edtLb_Rb_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Rb_Enabled = 1 ;
      edtLb_UsuM_Jsonclick = "" ;
      edtLb_UsuM_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UsuM_Enabled = 1 ;
      edtLb_HoraM_Jsonclick = "" ;
      edtLb_HoraM_Backcolor = (int)(0xFFFFFF) ;
      edtLb_HoraM_Enabled = 1 ;
      edtLb_FechaM_Jsonclick = "" ;
      edtLb_FechaM_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FechaM_Enabled = 1 ;
      edtLb_Usuario_Jsonclick = "" ;
      edtLb_Usuario_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Usuario_Enabled = 1 ;
      edtLb_HoraE_Jsonclick = "" ;
      edtLb_HoraE_Backcolor = (int)(0xFFFFFF) ;
      edtLb_HoraE_Enabled = 1 ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_FechaE_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FechaE_Enabled = 1 ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_Cartaz_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Cartaz_Enabled = 1 ;
      edtLb_ColNumC_Jsonclick = "" ;
      edtLb_ColNumC_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ColNumC_Enabled = 1 ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ColNomC_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ColNomC_Enabled = 1 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNum_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ColNum_Enabled = 1 ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_ColNom_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ColNom_Enabled = 1 ;
      edtLb_TipArtD_Jsonclick = "" ;
      edtLb_TipArtD_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TipArtD_Enabled = 1 ;
      edtLb_TipArt_Jsonclick = "" ;
      edtLb_TipArt_Backcolor = (int)(0xFFFFFF) ;
      edtLb_TipArt_Enabled = 1 ;
      edtLb_ArtDsc_Jsonclick = "" ;
      edtLb_ArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ArtDsc_Enabled = 1 ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtLb_ArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtLb_ArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Backcolor = (int)(0xFFFFFF) ;
      edtLb_numero_Enabled = 1 ;
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

   public void gxsgatipdiscodQP0( String A396EmprCod ,
                                  String A5097TipDisDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipdiscod_dataQP0( A396EmprCod, A5097TipDisDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatipdiscod_dataQP0( String A396EmprCod ,
                                          String A5097TipDisDsc )
   {
      l5097TipDisDsc = GXutil.padr( GXutil.rtrim( A5097TipDisDsc), 30, "%") ;
      n5097TipDisDsc = false ;
      /* Using cursor T00QP52 */
      pr_default.execute(50, new Object[] {A396EmprCod, l5097TipDisDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(50) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T00QP52_A5097TipDisDsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T00QP52_A5097TipDisDsc[0]));
         pr_default.readNext(50);
      }
      pr_default.close(50);
   }

   public void gxhcatipdiscodQP817( String A396EmprCod ,
                                    String A5097TipDisDsc )
   {
      /* Using cursor T00QP53 */
      pr_default.execute(51, new Object[] {Boolean.valueOf(n5097TipDisDsc), A5097TipDisDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(51) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A5097TipDisDsc = T00QP53_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00QP53_n5097TipDisDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
         A396EmprCod = T00QP53_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5098TipDisCod = T00QP53_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP53_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         pr_default.readNext(51);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5098TipDisCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(51);
   }

   public void gx3asalb_fordscQP818( String A396EmprCod ,
                                     String A5553Lb_ForCod )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tens000_impl.this.A396EmprCod = GXv_char4[0] ;
      tens000_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tens000_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5554Lb_ForDsc))+"\"") ;
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
      subsflControlProps_445818( ) ;
      while ( nGXsfl_445_idx <= nRC_GXsfl_445 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalQP818( ) ;
         standaloneModalQP818( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowQP818( ) ;
         nGXsfl_445_idx = (int)(nGXsfl_445_idx+1) ;
         sGXsfl_445_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_445_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_445818( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbLb_EstLab.setName( "LB_ESTLAB" );
      cmbLb_EstLab.setWebtags( "" );
      cmbLb_EstLab.addItem("*", httpContext.getMessage( "Aprovado o Reprobado", ""), (short)(0));
      cmbLb_EstLab.addItem("A", httpContext.getMessage( "Aprovado", ""), (short)(0));
      cmbLb_EstLab.addItem("R", httpContext.getMessage( "Reprovado", ""), (short)(0));
      if ( cmbLb_EstLab.getItemCount() > 0 )
      {
         A5699Lb_EstLab = (byte)(GXutil.lval( cmbLb_EstLab.getValidValue(GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.str( A5699Lb_EstLab, 1, 0));
      }
      GXCCtl = "LB_RECPIP_" + sGXsfl_445_idx ;
      chkLb_RecPip.setName( GXCCtl );
      chkLb_RecPip.setWebtags( "" );
      chkLb_RecPip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "TitleCaption", chkLb_RecPip.getCaption(), !bGXsfl_445_Refreshing);
      chkLb_RecPip.setCheckedValue( "N" );
      A6372Lb_RecPip = ((GXutil.strcmp(GXutil.rtrim( A6372Lb_RecPip), "S")==0) ? "S" : "N") ;
      GXCCtl = "LB_ENVIO_" + sGXsfl_445_idx ;
      chkLb_Envio.setName( GXCCtl );
      chkLb_Envio.setWebtags( "" );
      chkLb_Envio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "TitleCaption", chkLb_Envio.getCaption(), !bGXsfl_445_Refreshing);
      chkLb_Envio.setCheckedValue( "N" );
      A8621Lb_Envio = ((GXutil.strcmp(GXutil.rtrim( A8621Lb_Envio), "S")==0) ? "S" : "N") ;
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00QP54 */
      pr_default.execute(52, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00QP54_A407EmprNom[0] ;
      n407EmprNom = T00QP54_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(52);
      GX_FocusControl = edtCliCod_Internalname ;
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
      /* Using cursor T00QP55 */
      pr_default.execute(53, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00QP55_A407EmprNom[0] ;
      n407EmprNom = T00QP55_n407EmprNom[0] ;
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Lb_numero( )
   {
      A5699Lb_EstLab = (byte)(GXutil.lval( cmbLb_EstLab.getValue())) ;
      cmbLb_EstLab.setValue( GXutil.str( A5699Lb_EstLab, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbLb_EstLab.getItemCount() > 0 )
      {
         A5699Lb_EstLab = (byte)(GXutil.lval( cmbLb_EstLab.getValidValue(GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0))))) ;
         cmbLb_EstLab.setValue( GXutil.str( A5699Lb_EstLab, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLb_EstLab.setValue( GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5533Lb_ArtCod", GXutil.rtrim( A5533Lb_ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5534Lb_ArtDsc", GXutil.rtrim( A5534Lb_ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5535Lb_TipArt", GXutil.ltrim( localUtil.ntoc( A5535Lb_TipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5552Lb_TipArtD", GXutil.rtrim( A5552Lb_TipArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A5536Lb_ColNom", GXutil.rtrim( A5536Lb_ColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5537Lb_ColNum", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5538Lb_ColNomC", GXutil.rtrim( A5538Lb_ColNomC));
      httpContext.ajax_rsp_assign_attri("", false, "A5539Lb_ColNumC", GXutil.ltrim( localUtil.ntoc( A5539Lb_ColNumC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5540Lb_Cartaz", GXutil.rtrim( A5540Lb_Cartaz));
      httpContext.ajax_rsp_assign_attri("", false, "A5541Lb_FechaE", localUtil.format(A5541Lb_FechaE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5542Lb_HoraE", localUtil.ttoc( A5542Lb_HoraE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5543Lb_Usuario", GXutil.rtrim( A5543Lb_Usuario));
      httpContext.ajax_rsp_assign_attri("", false, "A5544Lb_FechaM", localUtil.format(A5544Lb_FechaM, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5545Lb_HoraM", localUtil.ttoc( A5545Lb_HoraM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5546Lb_UsuM", GXutil.rtrim( A5546Lb_UsuM));
      httpContext.ajax_rsp_assign_attri("", false, "A5547Lb_Rb", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A626MatCod", GXutil.ltrim( localUtil.ntoc( A626MatCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3316CodSol", GXutil.ltrim( localUtil.ntoc( A3316CodSol, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5548Lb_Obs", A5548Lb_Obs);
      httpContext.ajax_rsp_assign_attri("", false, "A5549Lb_UltOp", GXutil.rtrim( A5549Lb_UltOp));
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( A5550Lb_UltlPq, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5569Lb_EstEns", GXutil.ltrim( localUtil.ntoc( A5569Lb_EstEns, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5570Lb_Tipo", GXutil.rtrim( A5570Lb_Tipo));
      httpContext.ajax_rsp_assign_attri("", false, "A5594Lb_cartazf", localUtil.format(A5594Lb_cartazf, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5595Lb_malha", GXutil.ltrim( localUtil.ntoc( A5595Lb_malha, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5596Lb_reprod", GXutil.ltrim( localUtil.ntoc( A5596Lb_reprod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5597Lb_TipRec", GXutil.ltrim( localUtil.ntoc( A5597Lb_TipRec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5598Lb_impreso", GXutil.ltrim( localUtil.ntoc( A5598Lb_impreso, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5600Lb_IDM", GXutil.ltrim( localUtil.ntoc( A5600Lb_IDM, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5601Lb_Tempt", GXutil.ltrim( localUtil.ntoc( A5601Lb_Tempt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5610Lb_Temp2", GXutil.ltrim( localUtil.ntoc( A5610Lb_Temp2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5611Lb_Temp3", GXutil.ltrim( localUtil.ntoc( A5611Lb_Temp3, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5700Lb_Talao", GXutil.rtrim( A5700Lb_Talao));
      httpContext.ajax_rsp_assign_attri("", false, "A5701Lb_Local", GXutil.rtrim( A5701Lb_Local));
      httpContext.ajax_rsp_assign_attri("", false, "A5699Lb_EstLab", GXutil.ltrim( localUtil.ntoc( A5699Lb_EstLab, (byte)(1), (byte)(0), ".", "")));
      cmbLb_EstLab.setValue( GXutil.trim( GXutil.str( A5699Lb_EstLab, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstLab.getInternalname(), "Values", cmbLb_EstLab.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A5717Lb_numopu", GXutil.ltrim( localUtil.ntoc( A5717Lb_numopu, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5801Lab_CodCau", GXutil.ltrim( localUtil.ntoc( A5801Lab_CodCau, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5901Lab_desvio", GXutil.ltrim( localUtil.ntoc( A5901Lab_desvio, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", GXutil.rtrim( A5098TipDisCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5988Lb_nfibras", GXutil.ltrim( localUtil.ntoc( A5988Lb_nfibras, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6056Lb_pesom", GXutil.ltrim( localUtil.ntoc( A6056Lb_pesom, (byte)(9), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6057Lb_volum", GXutil.ltrim( localUtil.ntoc( A6057Lb_volum, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1514MacProCod", GXutil.rtrim( A1514MacProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6546Lb_Pantone", GXutil.rtrim( A6546Lb_Pantone));
      httpContext.ajax_rsp_assign_attri("", false, "A6618Lb_PedCod", GXutil.rtrim( A6618Lb_PedCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6644Lb_PriEns", GXutil.rtrim( A6644Lb_PriEns));
      httpContext.ajax_rsp_assign_attri("", false, "A6653Lb_Tra1", GXutil.rtrim( A6653Lb_Tra1));
      httpContext.ajax_rsp_assign_attri("", false, "A6654Lb_TraP1", GXutil.ltrim( localUtil.ntoc( A6654Lb_TraP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6655Lb_Tra2", GXutil.rtrim( A6655Lb_Tra2));
      httpContext.ajax_rsp_assign_attri("", false, "A6656Lb_TraP2", GXutil.ltrim( localUtil.ntoc( A6656Lb_TraP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6657Lb_Tra3", GXutil.rtrim( A6657Lb_Tra3));
      httpContext.ajax_rsp_assign_attri("", false, "A6658Lb_TraP3", GXutil.ltrim( localUtil.ntoc( A6658Lb_TraP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6842Lb_Tra4", GXutil.rtrim( A6842Lb_Tra4));
      httpContext.ajax_rsp_assign_attri("", false, "A6843Lb_TraP4", GXutil.ltrim( localUtil.ntoc( A6843Lb_TraP4, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6844Lb_Tra5", GXutil.rtrim( A6844Lb_Tra5));
      httpContext.ajax_rsp_assign_attri("", false, "A6845Lb_TraP5", GXutil.ltrim( localUtil.ntoc( A6845Lb_TraP5, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6846Lb_Tra6", GXutil.rtrim( A6846Lb_Tra6));
      httpContext.ajax_rsp_assign_attri("", false, "A6847Lb_TraP6", GXutil.ltrim( localUtil.ntoc( A6847Lb_TraP6, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7780Lb_Hila", GXutil.rtrim( A7780Lb_Hila));
      httpContext.ajax_rsp_assign_attri("", false, "A8946Lb_NCoS", GXutil.ltrim( localUtil.ntoc( A8946Lb_NCoS, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8947Lb_NOpR", GXutil.ltrim( localUtil.ntoc( A8947Lb_NOpR, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8948Lb_NCoE", GXutil.ltrim( localUtil.ntoc( A8948Lb_NCoE, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8949Lb_NOpE", GXutil.ltrim( localUtil.ntoc( A8949Lb_NOpE, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8950Lb_NOpN", GXutil.ltrim( localUtil.ntoc( A8950Lb_NOpN, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8951Lb_FecE", localUtil.format(A8951Lb_FecE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8952Lb_FecN", localUtil.format(A8952Lb_FecN, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8953Lb_FecR", localUtil.format(A8953Lb_FecR, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8954Lb_diasER", GXutil.ltrim( localUtil.ntoc( A8954Lb_diasER, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9900Lb_obsCl", A9900Lb_obsCl);
      httpContext.ajax_rsp_assign_attri("", false, "A10883Lb_obsLb", A10883Lb_obsLb);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", GXutil.rtrim( A627MatDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", GXutil.rtrim( A3317DscSol));
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", GXutil.rtrim( A5097TipDisDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", GXutil.rtrim( A5802Lab_DscCau));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5533Lb_ArtCod", GXutil.rtrim( Z5533Lb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5534Lb_ArtDsc", GXutil.rtrim( Z5534Lb_ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5535Lb_TipArt", GXutil.ltrim( localUtil.ntoc( Z5535Lb_TipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5552Lb_TipArtD", GXutil.rtrim( Z5552Lb_TipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5536Lb_ColNom", GXutil.rtrim( Z5536Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5537Lb_ColNum", GXutil.ltrim( localUtil.ntoc( Z5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5538Lb_ColNomC", GXutil.rtrim( Z5538Lb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5539Lb_ColNumC", GXutil.ltrim( localUtil.ntoc( Z5539Lb_ColNumC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5540Lb_Cartaz", GXutil.rtrim( Z5540Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5541Lb_FechaE", localUtil.format(Z5541Lb_FechaE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5542Lb_HoraE", localUtil.ttoc( Z5542Lb_HoraE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5543Lb_Usuario", GXutil.rtrim( Z5543Lb_Usuario));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5544Lb_FechaM", localUtil.format(Z5544Lb_FechaM, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5545Lb_HoraM", localUtil.ttoc( Z5545Lb_HoraM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5546Lb_UsuM", GXutil.rtrim( Z5546Lb_UsuM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5547Lb_Rb", GXutil.ltrim( localUtil.ntoc( Z5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z626MatCod", GXutil.ltrim( localUtil.ntoc( Z626MatCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3316CodSol", GXutil.ltrim( localUtil.ntoc( Z3316CodSol, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5548Lb_Obs", Z5548Lb_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5549Lb_UltOp", GXutil.rtrim( Z5549Lb_UltOp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( Z5550Lb_UltlPq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5569Lb_EstEns", GXutil.ltrim( localUtil.ntoc( Z5569Lb_EstEns, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5570Lb_Tipo", GXutil.rtrim( Z5570Lb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5594Lb_cartazf", localUtil.format(Z5594Lb_cartazf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5595Lb_malha", GXutil.ltrim( localUtil.ntoc( Z5595Lb_malha, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5596Lb_reprod", GXutil.ltrim( localUtil.ntoc( Z5596Lb_reprod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5597Lb_TipRec", GXutil.ltrim( localUtil.ntoc( Z5597Lb_TipRec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5598Lb_impreso", GXutil.ltrim( localUtil.ntoc( Z5598Lb_impreso, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5599Lb_RGB", GXutil.ltrim( localUtil.ntoc( Z5599Lb_RGB, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5600Lb_IDM", GXutil.ltrim( localUtil.ntoc( Z5600Lb_IDM, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5601Lb_Tempt", GXutil.ltrim( localUtil.ntoc( Z5601Lb_Tempt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5610Lb_Temp2", GXutil.ltrim( localUtil.ntoc( Z5610Lb_Temp2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5611Lb_Temp3", GXutil.ltrim( localUtil.ntoc( Z5611Lb_Temp3, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5700Lb_Talao", GXutil.rtrim( Z5700Lb_Talao));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5701Lb_Local", GXutil.rtrim( Z5701Lb_Local));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5699Lb_EstLab", GXutil.ltrim( localUtil.ntoc( Z5699Lb_EstLab, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5717Lb_numopu", GXutil.ltrim( localUtil.ntoc( Z5717Lb_numopu, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5801Lab_CodCau", GXutil.ltrim( localUtil.ntoc( Z5801Lab_CodCau, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5901Lab_desvio", GXutil.ltrim( localUtil.ntoc( Z5901Lab_desvio, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5098TipDisCod", GXutil.rtrim( Z5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5988Lb_nfibras", GXutil.ltrim( localUtil.ntoc( Z5988Lb_nfibras, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6056Lb_pesom", GXutil.ltrim( localUtil.ntoc( Z6056Lb_pesom, (byte)(9), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6057Lb_volum", GXutil.ltrim( localUtil.ntoc( Z6057Lb_volum, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1514MacProCod", GXutil.rtrim( Z1514MacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6546Lb_Pantone", GXutil.rtrim( Z6546Lb_Pantone));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6618Lb_PedCod", GXutil.rtrim( Z6618Lb_PedCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6644Lb_PriEns", GXutil.rtrim( Z6644Lb_PriEns));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6653Lb_Tra1", GXutil.rtrim( Z6653Lb_Tra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6654Lb_TraP1", GXutil.ltrim( localUtil.ntoc( Z6654Lb_TraP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6655Lb_Tra2", GXutil.rtrim( Z6655Lb_Tra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6656Lb_TraP2", GXutil.ltrim( localUtil.ntoc( Z6656Lb_TraP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6657Lb_Tra3", GXutil.rtrim( Z6657Lb_Tra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6658Lb_TraP3", GXutil.ltrim( localUtil.ntoc( Z6658Lb_TraP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6842Lb_Tra4", GXutil.rtrim( Z6842Lb_Tra4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6843Lb_TraP4", GXutil.ltrim( localUtil.ntoc( Z6843Lb_TraP4, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6844Lb_Tra5", GXutil.rtrim( Z6844Lb_Tra5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6845Lb_TraP5", GXutil.ltrim( localUtil.ntoc( Z6845Lb_TraP5, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6846Lb_Tra6", GXutil.rtrim( Z6846Lb_Tra6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6847Lb_TraP6", GXutil.ltrim( localUtil.ntoc( Z6847Lb_TraP6, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7780Lb_Hila", GXutil.rtrim( Z7780Lb_Hila));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8946Lb_NCoS", GXutil.ltrim( localUtil.ntoc( Z8946Lb_NCoS, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8947Lb_NOpR", GXutil.ltrim( localUtil.ntoc( Z8947Lb_NOpR, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8948Lb_NCoE", GXutil.ltrim( localUtil.ntoc( Z8948Lb_NCoE, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8949Lb_NOpE", GXutil.ltrim( localUtil.ntoc( Z8949Lb_NOpE, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8950Lb_NOpN", GXutil.ltrim( localUtil.ntoc( Z8950Lb_NOpN, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8951Lb_FecE", localUtil.format(Z8951Lb_FecE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8952Lb_FecN", localUtil.format(Z8952Lb_FecN, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8953Lb_FecR", localUtil.format(Z8953Lb_FecR, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8954Lb_diasER", GXutil.ltrim( localUtil.ntoc( Z8954Lb_diasER, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9900Lb_obsCl", Z9900Lb_obsCl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10883Lb_obsLb", Z10883Lb_obsLb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z627MatDsc", GXutil.rtrim( Z627MatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1515MacProDsc", GXutil.rtrim( Z1515MacProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3317DscSol", GXutil.rtrim( Z3317DscSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5097TipDisDsc", GXutil.rtrim( Z5097TipDisDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5802Lab_DscCau", GXutil.rtrim( Z5802Lab_DscCau));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", GXutil.rtrim( h5098TipDisCod));
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T00QP56 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T00QP56_A279CliNom[0] ;
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Tipcolcod( )
   {
      n831TipColCod = false ;
      n832TipColDsc = false ;
      /* Using cursor T00QP57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(55) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A831TipColCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A832TipColDsc = T00QP57_A832TipColDsc[0] ;
      n832TipColDsc = T00QP57_n832TipColDsc[0] ;
      pr_default.close(55);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
   }

   public void valid_Intcod( )
   {
      n583IntCod = false ;
      n584IntDsc = false ;
      /* Using cursor T00QP58 */
      pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(56) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A583IntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A584IntDsc = T00QP58_A584IntDsc[0] ;
      n584IntDsc = T00QP58_n584IntDsc[0] ;
      pr_default.close(56);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
   }

   public void valid_Matcod( )
   {
      n626MatCod = false ;
      n627MatDsc = false ;
      /* Using cursor T00QP59 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n626MatCod), Short.valueOf(A626MatCod)});
      if ( (pr_default.getStatus(57) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A626MatCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MATICE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MATCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A627MatDsc = T00QP59_A627MatDsc[0] ;
      n627MatDsc = T00QP59_n627MatDsc[0] ;
      pr_default.close(57);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A627MatDsc", GXutil.rtrim( A627MatDsc));
   }

   public void valid_Codsol( )
   {
      n3316CodSol = false ;
      n3317DscSol = false ;
      /* Using cursor T00QP60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol)});
      if ( (pr_default.getStatus(58) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3316CodSol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SOLIDEZ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A3317DscSol = T00QP60_A3317DscSol[0] ;
      n3317DscSol = T00QP60_n3317DscSol[0] ;
      pr_default.close(58);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3317DscSol", GXutil.rtrim( A3317DscSol));
   }

   public void valid_Lab_codcau( )
   {
      n5801Lab_CodCau = false ;
      n5802Lab_DscCau = false ;
      /* Using cursor T00QP61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n5801Lab_CodCau), Short.valueOf(A5801Lab_CodCau)});
      if ( (pr_default.getStatus(59) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A5801Lab_CodCau) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAUDES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LAB_CODCAU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A5802Lab_DscCau = T00QP61_A5802Lab_DscCau[0] ;
      n5802Lab_DscCau = T00QP61_n5802Lab_DscCau[0] ;
      pr_default.close(59);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5802Lab_DscCau", GXutil.rtrim( A5802Lab_DscCau));
   }

   public void valid_Tipdiscod( )
   {
      n5098TipDisCod = false ;
      n5097TipDisDsc = false ;
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
      }
      else
      {
         A5097TipDisDsc = h5098TipDisCod ;
         n5097TipDisDsc = false ;
         /* Using cursor T00QP62 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n5097TipDisDsc), A5097TipDisDsc, A396EmprCod});
         A396EmprCod = T00QP62_A396EmprCod[0] ;
         A5098TipDisCod = T00QP62_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP62_n5098TipDisCod[0] ;
         A5098TipDisCod = T00QP62_A5098TipDisCod[0] ;
         n5098TipDisCod = T00QP62_n5098TipDisCod[0] ;
         if ( ! ( (pr_default.getStatus(60) == 101) ) )
         {
            pr_default.readNext(60);
            if ( ! ( (pr_default.getStatus(60) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion ", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(60);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      /* Using cursor T00QP63 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(61) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A5097TipDisDsc)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A5097TipDisDsc = T00QP63_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00QP63_n5097TipDisDsc[0] ;
      pr_default.close(61);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", GXutil.rtrim( A5098TipDisCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", GXutil.rtrim( A5097TipDisDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", GXutil.rtrim( h5098TipDisCod));
   }

   public void valid_Macprocod( )
   {
      n1514MacProCod = false ;
      /* Using cursor T00QP64 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
      if ( (pr_default.getStatus(62) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1514MacProCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMACPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MACPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A1515MacProDsc = T00QP64_A1515MacProDsc[0] ;
      pr_default.close(62);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1515MacProDsc", GXutil.rtrim( A1515MacProDsc));
   }

   public void valid_Lb_forcod( )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tens000_impl.this.A396EmprCod = GXv_char4[0] ;
      tens000_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tens000_impl.this.GXt_char1 = GXv_char2[0] ;
      A5554Lb_ForDsc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5554Lb_ForDsc", GXutil.rtrim( A5554Lb_ForDsc));
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
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'h5098TipDisCod'},{av:'cmbLb_EstLab'},{av:'A5699Lb_EstLab',fld:'LB_ESTLAB',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5534Lb_ArtDsc',fld:'LB_ARTDSC',pic:''},{av:'A5535Lb_TipArt',fld:'LB_TIPART',pic:'ZZZ9'},{av:'A5552Lb_TipArtD',fld:'LB_TIPARTD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5538Lb_ColNomC',fld:'LB_COLNOMC',pic:''},{av:'A5539Lb_ColNumC',fld:'LB_COLNUMC',pic:'ZZZZZ9'},{av:'A5540Lb_Cartaz',fld:'LB_CARTAZ',pic:''},{av:'A5541Lb_FechaE',fld:'LB_FECHAE',pic:''},{av:'A5542Lb_HoraE',fld:'LB_HORAE',pic:'99:99'},{av:'A5543Lb_Usuario',fld:'LB_USUARIO',pic:''},{av:'A5544Lb_FechaM',fld:'LB_FECHAM',pic:''},{av:'A5545Lb_HoraM',fld:'LB_HORAM',pic:'99:99'},{av:'A5546Lb_UsuM',fld:'LB_USUM',pic:''},{av:'A5547Lb_Rb',fld:'LB_RB',pic:'ZZZ9.99'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A626MatCod',fld:'MATCOD',pic:'ZZ9'},{av:'A3316CodSol',fld:'CODSOL',pic:'ZZ9'},{av:'A5548Lb_Obs',fld:'LB_OBS',pic:''},{av:'A5549Lb_UltOp',fld:'LB_ULTOP',pic:''},{av:'A5550Lb_UltlPq',fld:'LB_ULTLPQ',pic:'ZZZ9'},{av:'A5569Lb_EstEns',fld:'LB_ESTENS',pic:'9'},{av:'A5570Lb_Tipo',fld:'LB_TIPO',pic:''},{av:'A5594Lb_cartazf',fld:'LB_CARTAZF',pic:''},{av:'A5595Lb_malha',fld:'LB_MALHA',pic:'9'},{av:'A5596Lb_reprod',fld:'LB_REPROD',pic:'9'},{av:'A5597Lb_TipRec',fld:'LB_TIPREC',pic:'9'},{av:'A5598Lb_impreso',fld:'LB_IMPRESO',pic:'9'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'},{av:'A5600Lb_IDM',fld:'LB_IDM',pic:'ZZZZZZZ9'},{av:'A5601Lb_Tempt',fld:'LB_TEMPT',pic:'ZZZ9'},{av:'A5610Lb_Temp2',fld:'LB_TEMP2',pic:'ZZZ9'},{av:'A5611Lb_Temp3',fld:'LB_TEMP3',pic:'ZZZ9'},{av:'A5700Lb_Talao',fld:'LB_TALAO',pic:''},{av:'A5701Lb_Local',fld:'LB_LOCAL',pic:''},{av:'cmbLb_EstLab'},{av:'A5699Lb_EstLab',fld:'LB_ESTLAB',pic:'9'},{av:'A5717Lb_numopu',fld:'LB_NUMOPU',pic:'Z9'},{av:'A5801Lab_CodCau',fld:'LAB_CODCAU',pic:'ZZZ9'},{av:'A5901Lab_desvio',fld:'LAB_DESVIO',pic:'ZZZ9'},{av:'A5098TipDisCod',fld:'TIPDISCOD',pic:''},{av:'A5988Lb_nfibras',fld:'LB_NFIBRAS',pic:'Z9'},{av:'A6056Lb_pesom',fld:'LB_PESOM',pic:'ZZZZ9.999'},{av:'A6057Lb_volum',fld:'LB_VOLUM',pic:'ZZZ9.99'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A6546Lb_Pantone',fld:'LB_PANTONE',pic:''},{av:'A6618Lb_PedCod',fld:'LB_PEDCOD',pic:''},{av:'A6644Lb_PriEns',fld:'LB_PRIENS',pic:''},{av:'A6653Lb_Tra1',fld:'LB_TRA1',pic:''},{av:'A6654Lb_TraP1',fld:'LB_TRAP1',pic:'ZZ9'},{av:'A6655Lb_Tra2',fld:'LB_TRA2',pic:''},{av:'A6656Lb_TraP2',fld:'LB_TRAP2',pic:'ZZ9'},{av:'A6657Lb_Tra3',fld:'LB_TRA3',pic:''},{av:'A6658Lb_TraP3',fld:'LB_TRAP3',pic:'ZZ9'},{av:'A6842Lb_Tra4',fld:'LB_TRA4',pic:''},{av:'A6843Lb_TraP4',fld:'LB_TRAP4',pic:'ZZ9'},{av:'A6844Lb_Tra5',fld:'LB_TRA5',pic:''},{av:'A6845Lb_TraP5',fld:'LB_TRAP5',pic:'ZZ9'},{av:'A6846Lb_Tra6',fld:'LB_TRA6',pic:''},{av:'A6847Lb_TraP6',fld:'LB_TRAP6',pic:'ZZ9'},{av:'A7780Lb_Hila',fld:'LB_HILA',pic:''},{av:'A8946Lb_NCoS',fld:'LB_NCOS',pic:'ZZZZZZZ9'},{av:'A8947Lb_NOpR',fld:'LB_NOPR',pic:'ZZZZZZZ9'},{av:'A8948Lb_NCoE',fld:'LB_NCOE',pic:'ZZZZZZZ9'},{av:'A8949Lb_NOpE',fld:'LB_NOPE',pic:'ZZZZZZZ9'},{av:'A8950Lb_NOpN',fld:'LB_NOPN',pic:'ZZZZZZZ9'},{av:'A8951Lb_FecE',fld:'LB_FECE',pic:''},{av:'A8952Lb_FecN',fld:'LB_FECN',pic:''},{av:'A8953Lb_FecR',fld:'LB_FECR',pic:''},{av:'A8954Lb_diasER',fld:'LB_DIASER',pic:'ZZZZZ9'},{av:'A9900Lb_obsCl',fld:'LB_OBSCL',pic:''},{av:'A10883Lb_obsLb',fld:'LB_OBSLB',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A627MatDsc',fld:'MATDSC',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''},{av:'A3317DscSol',fld:'DSCSOL',pic:''},{av:'A5097TipDisDsc',fld:'TIPDISDSC',pic:''},{av:'A5802Lab_DscCau',fld:'LAB_DSCCAU',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z5532Lb_numero'},{av:'Z252CliCod'},{av:'Z5533Lb_ArtCod'},{av:'Z5534Lb_ArtDsc'},{av:'Z5535Lb_TipArt'},{av:'Z5552Lb_TipArtD'},{av:'Z5536Lb_ColNom'},{av:'Z5537Lb_ColNum'},{av:'Z831TipColCod'},{av:'Z5538Lb_ColNomC'},{av:'Z5539Lb_ColNumC'},{av:'Z5540Lb_Cartaz'},{av:'Z5541Lb_FechaE'},{av:'Z5542Lb_HoraE'},{av:'Z5543Lb_Usuario'},{av:'Z5544Lb_FechaM'},{av:'Z5545Lb_HoraM'},{av:'Z5546Lb_UsuM'},{av:'Z5547Lb_Rb'},{av:'Z583IntCod'},{av:'Z626MatCod'},{av:'Z3316CodSol'},{av:'Z5548Lb_Obs'},{av:'Z5549Lb_UltOp'},{av:'Z5550Lb_UltlPq'},{av:'Z5569Lb_EstEns'},{av:'Z5570Lb_Tipo'},{av:'Z5594Lb_cartazf'},{av:'Z5595Lb_malha'},{av:'Z5596Lb_reprod'},{av:'Z5597Lb_TipRec'},{av:'Z5598Lb_impreso'},{av:'Z5599Lb_RGB'},{av:'Z5600Lb_IDM'},{av:'Z5601Lb_Tempt'},{av:'Z5610Lb_Temp2'},{av:'Z5611Lb_Temp3'},{av:'Z5700Lb_Talao'},{av:'Z5701Lb_Local'},{av:'Z5699Lb_EstLab'},{av:'Z5717Lb_numopu'},{av:'Z5801Lab_CodCau'},{av:'Z5901Lab_desvio'},{av:'Z5098TipDisCod'},{av:'Z5988Lb_nfibras'},{av:'Z6056Lb_pesom'},{av:'Z6057Lb_volum'},{av:'Z1514MacProCod'},{av:'Z6546Lb_Pantone'},{av:'Z6618Lb_PedCod'},{av:'Z6644Lb_PriEns'},{av:'Z6653Lb_Tra1'},{av:'Z6654Lb_TraP1'},{av:'Z6655Lb_Tra2'},{av:'Z6656Lb_TraP2'},{av:'Z6657Lb_Tra3'},{av:'Z6658Lb_TraP3'},{av:'Z6842Lb_Tra4'},{av:'Z6843Lb_TraP4'},{av:'Z6844Lb_Tra5'},{av:'Z6845Lb_TraP5'},{av:'Z6846Lb_Tra6'},{av:'Z6847Lb_TraP6'},{av:'Z7780Lb_Hila'},{av:'Z8946Lb_NCoS'},{av:'Z8947Lb_NOpR'},{av:'Z8948Lb_NCoE'},{av:'Z8949Lb_NOpE'},{av:'Z8950Lb_NOpN'},{av:'Z8951Lb_FecE'},{av:'Z8952Lb_FecN'},{av:'Z8953Lb_FecR'},{av:'Z8954Lb_diasER'},{av:'Z9900Lb_obsCl'},{av:'Z10883Lb_obsLb'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z584IntDsc'},{av:'Z627MatDsc'},{av:'Z832TipColDsc'},{av:'Z1515MacProDsc'},{av:'Z3317DscSol'},{av:'Z5097TipDisDsc'},{av:'Z5802Lab_DscCau'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'h5098TipDisCod'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''}]}");
      setEventMetadata("VALID_MATCOD","{handler:'valid_Matcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A626MatCod',fld:'MATCOD',pic:'ZZ9'},{av:'A627MatDsc',fld:'MATDSC',pic:''}]");
      setEventMetadata("VALID_MATCOD",",oparms:[{av:'A627MatDsc',fld:'MATDSC',pic:''}]}");
      setEventMetadata("VALID_CODSOL","{handler:'valid_Codsol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3316CodSol',fld:'CODSOL',pic:'ZZ9'},{av:'A3317DscSol',fld:'DSCSOL',pic:''}]");
      setEventMetadata("VALID_CODSOL",",oparms:[{av:'A3317DscSol',fld:'DSCSOL',pic:''}]}");
      setEventMetadata("VALID_LAB_CODCAU","{handler:'valid_Lab_codcau',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5801Lab_CodCau',fld:'LAB_CODCAU',pic:'ZZZ9'},{av:'A5802Lab_DscCau',fld:'LAB_DSCCAU',pic:''}]");
      setEventMetadata("VALID_LAB_CODCAU",",oparms:[{av:'A5802Lab_DscCau',fld:'LAB_DSCCAU',pic:''}]}");
      setEventMetadata("VALID_TIPDISCOD","{handler:'valid_Tipdiscod',iparms:[{av:'h5098TipDisCod'},{av:'A5098TipDisCod',fld:'TIPDISCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5097TipDisDsc',fld:'TIPDISDSC',pic:''}]");
      setEventMetadata("VALID_TIPDISCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5098TipDisCod',fld:'TIPDISCOD',pic:''},{av:'A5097TipDisDsc',fld:'TIPDISDSC',pic:''},{av:'h5098TipDisCod'}]}");
      setEventMetadata("VALID_MACPROCOD","{handler:'valid_Macprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1514MacProCod',fld:'MACPROCOD',pic:''},{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''}]");
      setEventMetadata("VALID_MACPROCOD",",oparms:[{av:'A1515MacProDsc',fld:'MACPRODSC',pic:''}]}");
      setEventMetadata("VALID_LB_LINEAPQ","{handler:'valid_Lb_lineapq',iparms:[]");
      setEventMetadata("VALID_LB_LINEAPQ",",oparms:[]}");
      setEventMetadata("VALID_LB_FORCOD","{handler:'valid_Lb_forcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5553Lb_ForCod',fld:'LB_FORCOD',pic:''},{av:'A5554Lb_ForDsc',fld:'LB_FORDSC',pic:''}]");
      setEventMetadata("VALID_LB_FORCOD",",oparms:[{av:'A5554Lb_ForDsc',fld:'LB_FORDSC',pic:''}]}");
      setEventMetadata("VALID_LB_RECPIP","{handler:'valid_Lb_recpip',iparms:[]");
      setEventMetadata("VALID_LB_RECPIP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_envio',iparms:[]");
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
      pr_default.close(54);
      pr_default.close(33);
      pr_default.close(53);
      pr_default.close(52);
      pr_default.close(32);
      pr_default.close(56);
      pr_default.close(35);
      pr_default.close(57);
      pr_default.close(36);
      pr_default.close(55);
      pr_default.close(34);
      pr_default.close(62);
      pr_default.close(40);
      pr_default.close(58);
      pr_default.close(37);
      pr_default.close(61);
      pr_default.close(39);
      pr_default.close(59);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z5533Lb_ArtCod = "" ;
      Z5534Lb_ArtDsc = "" ;
      Z5552Lb_TipArtD = "" ;
      Z5536Lb_ColNom = "" ;
      Z5538Lb_ColNomC = "" ;
      Z5540Lb_Cartaz = "" ;
      Z5541Lb_FechaE = GXutil.nullDate() ;
      Z5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      Z5543Lb_Usuario = "" ;
      Z5544Lb_FechaM = GXutil.nullDate() ;
      Z5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      Z5546Lb_UsuM = "" ;
      Z5547Lb_Rb = DecimalUtil.ZERO ;
      Z5549Lb_UltOp = "" ;
      Z5570Lb_Tipo = "" ;
      Z5594Lb_cartazf = GXutil.nullDate() ;
      Z5700Lb_Talao = "" ;
      Z5701Lb_Local = "" ;
      Z6056Lb_pesom = DecimalUtil.ZERO ;
      Z6057Lb_volum = DecimalUtil.ZERO ;
      Z6546Lb_Pantone = "" ;
      Z6618Lb_PedCod = "" ;
      Z6644Lb_PriEns = "" ;
      Z6653Lb_Tra1 = "" ;
      Z6655Lb_Tra2 = "" ;
      Z6657Lb_Tra3 = "" ;
      Z6842Lb_Tra4 = "" ;
      Z6844Lb_Tra5 = "" ;
      Z6846Lb_Tra6 = "" ;
      Z7780Lb_Hila = "" ;
      Z8951Lb_FecE = GXutil.nullDate() ;
      Z8952Lb_FecN = GXutil.nullDate() ;
      Z8953Lb_FecR = GXutil.nullDate() ;
      Z9900Lb_obsCl = "" ;
      Z10883Lb_obsLb = "" ;
      Z1514MacProCod = "" ;
      Z5098TipDisCod = "" ;
      Z5553Lb_ForCod = "" ;
      Z6372Lb_RecPip = "" ;
      Z8621Lb_Envio = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5097TipDisDsc = "" ;
      h5098TipDisCod = "" ;
      A5553Lb_ForCod = "" ;
      A1514MacProCod = "" ;
      A5098TipDisCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5533Lb_ArtCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5534Lb_ArtDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A5552Lb_TipArtD = "" ;
      lblTextblock10_Jsonclick = "" ;
      A5536Lb_ColNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      A5538Lb_ColNomC = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A5540Lb_Cartaz = "" ;
      lblTextblock17_Jsonclick = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      lblTextblock18_Jsonclick = "" ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock19_Jsonclick = "" ;
      A5543Lb_Usuario = "" ;
      lblTextblock20_Jsonclick = "" ;
      A5544Lb_FechaM = GXutil.nullDate() ;
      lblTextblock21_Jsonclick = "" ;
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock22_Jsonclick = "" ;
      A5546Lb_UsuM = "" ;
      lblTextblock23_Jsonclick = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A584IntDsc = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A627MatDsc = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A3317DscSol = "" ;
      lblTextblock30_Jsonclick = "" ;
      A5548Lb_Obs = "" ;
      lblTextblock31_Jsonclick = "" ;
      A5549Lb_UltOp = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A5570Lb_Tipo = "" ;
      lblTextblock35_Jsonclick = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A5700Lb_Talao = "" ;
      lblTextblock46_Jsonclick = "" ;
      A5701Lb_Local = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      A5802Lab_DscCau = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      A6056Lb_pesom = DecimalUtil.ZERO ;
      lblTextblock56_Jsonclick = "" ;
      A6057Lb_volum = DecimalUtil.ZERO ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      A1515MacProDsc = "" ;
      lblTextblock59_Jsonclick = "" ;
      A6546Lb_Pantone = "" ;
      lblTextblock60_Jsonclick = "" ;
      A6618Lb_PedCod = "" ;
      lblTextblock61_Jsonclick = "" ;
      A6644Lb_PriEns = "" ;
      lblTextblock62_Jsonclick = "" ;
      A6653Lb_Tra1 = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      A6655Lb_Tra2 = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      A6657Lb_Tra3 = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      A6842Lb_Tra4 = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      A6844Lb_Tra5 = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      A6846Lb_Tra6 = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      A7780Lb_Hila = "" ;
      lblTextblock75_Jsonclick = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      lblTextblock78_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      lblTextblock80_Jsonclick = "" ;
      A8951Lb_FecE = GXutil.nullDate() ;
      lblTextblock81_Jsonclick = "" ;
      A8952Lb_FecN = GXutil.nullDate() ;
      lblTextblock82_Jsonclick = "" ;
      A8953Lb_FecR = GXutil.nullDate() ;
      lblTextblock83_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      A9900Lb_obsCl = "" ;
      lblTextblock85_Jsonclick = "" ;
      A10883Lb_obsLb = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode818 = "" ;
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
      sMode817 = "" ;
      GXCCtl = "" ;
      A5554Lb_ForDsc = "" ;
      A6372Lb_RecPip = "" ;
      A8621Lb_Envio = "" ;
      Z5548Lb_Obs = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      Z584IntDsc = "" ;
      Z627MatDsc = "" ;
      Z3317DscSol = "" ;
      Z5802Lab_DscCau = "" ;
      Z5097TipDisDsc = "" ;
      Z1515MacProDsc = "" ;
      T00QP15_A5548Lb_Obs = new String[] {""} ;
      T00QP15_A5532Lb_numero = new int[1] ;
      T00QP15_A407EmprNom = new String[] {""} ;
      T00QP15_n407EmprNom = new boolean[] {false} ;
      T00QP15_A279CliNom = new String[] {""} ;
      T00QP15_A5533Lb_ArtCod = new String[] {""} ;
      T00QP15_A5534Lb_ArtDsc = new String[] {""} ;
      T00QP15_A5535Lb_TipArt = new short[1] ;
      T00QP15_A5552Lb_TipArtD = new String[] {""} ;
      T00QP15_A5536Lb_ColNom = new String[] {""} ;
      T00QP15_A5537Lb_ColNum = new int[1] ;
      T00QP15_A832TipColDsc = new String[] {""} ;
      T00QP15_n832TipColDsc = new boolean[] {false} ;
      T00QP15_A5538Lb_ColNomC = new String[] {""} ;
      T00QP15_A5539Lb_ColNumC = new int[1] ;
      T00QP15_A5540Lb_Cartaz = new String[] {""} ;
      T00QP15_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A5543Lb_Usuario = new String[] {""} ;
      T00QP15_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A5546Lb_UsuM = new String[] {""} ;
      T00QP15_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP15_A584IntDsc = new String[] {""} ;
      T00QP15_n584IntDsc = new boolean[] {false} ;
      T00QP15_A627MatDsc = new String[] {""} ;
      T00QP15_n627MatDsc = new boolean[] {false} ;
      T00QP15_A3317DscSol = new String[] {""} ;
      T00QP15_n3317DscSol = new boolean[] {false} ;
      T00QP15_A5549Lb_UltOp = new String[] {""} ;
      T00QP15_A5550Lb_UltlPq = new short[1] ;
      T00QP15_A5569Lb_EstEns = new byte[1] ;
      T00QP15_A5570Lb_Tipo = new String[] {""} ;
      T00QP15_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A5595Lb_malha = new byte[1] ;
      T00QP15_A5596Lb_reprod = new byte[1] ;
      T00QP15_A5597Lb_TipRec = new byte[1] ;
      T00QP15_A5598Lb_impreso = new byte[1] ;
      T00QP15_A5599Lb_RGB = new long[1] ;
      T00QP15_A5600Lb_IDM = new int[1] ;
      T00QP15_A5601Lb_Tempt = new short[1] ;
      T00QP15_A5610Lb_Temp2 = new short[1] ;
      T00QP15_A5611Lb_Temp3 = new short[1] ;
      T00QP15_A5700Lb_Talao = new String[] {""} ;
      T00QP15_A5701Lb_Local = new String[] {""} ;
      T00QP15_A5699Lb_EstLab = new byte[1] ;
      T00QP15_A5717Lb_numopu = new byte[1] ;
      T00QP15_A5802Lab_DscCau = new String[] {""} ;
      T00QP15_n5802Lab_DscCau = new boolean[] {false} ;
      T00QP15_A5901Lab_desvio = new short[1] ;
      T00QP15_A5097TipDisDsc = new String[] {""} ;
      T00QP15_n5097TipDisDsc = new boolean[] {false} ;
      T00QP15_A5988Lb_nfibras = new byte[1] ;
      T00QP15_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP15_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP15_A1515MacProDsc = new String[] {""} ;
      T00QP15_A6546Lb_Pantone = new String[] {""} ;
      T00QP15_A6618Lb_PedCod = new String[] {""} ;
      T00QP15_A6644Lb_PriEns = new String[] {""} ;
      T00QP15_A6653Lb_Tra1 = new String[] {""} ;
      T00QP15_A6654Lb_TraP1 = new short[1] ;
      T00QP15_A6655Lb_Tra2 = new String[] {""} ;
      T00QP15_A6656Lb_TraP2 = new short[1] ;
      T00QP15_A6657Lb_Tra3 = new String[] {""} ;
      T00QP15_A6658Lb_TraP3 = new short[1] ;
      T00QP15_A6842Lb_Tra4 = new String[] {""} ;
      T00QP15_A6843Lb_TraP4 = new short[1] ;
      T00QP15_A6844Lb_Tra5 = new String[] {""} ;
      T00QP15_A6845Lb_TraP5 = new short[1] ;
      T00QP15_A6846Lb_Tra6 = new String[] {""} ;
      T00QP15_A6847Lb_TraP6 = new short[1] ;
      T00QP15_A7780Lb_Hila = new String[] {""} ;
      T00QP15_A8946Lb_NCoS = new int[1] ;
      T00QP15_A8947Lb_NOpR = new int[1] ;
      T00QP15_A8948Lb_NCoE = new int[1] ;
      T00QP15_A8949Lb_NOpE = new int[1] ;
      T00QP15_A8950Lb_NOpN = new int[1] ;
      T00QP15_A8951Lb_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A8952Lb_FecN = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A8953Lb_FecR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP15_A8954Lb_diasER = new int[1] ;
      T00QP15_A9900Lb_obsCl = new String[] {""} ;
      T00QP15_A10883Lb_obsLb = new String[] {""} ;
      T00QP15_A396EmprCod = new String[] {""} ;
      T00QP15_A252CliCod = new int[1] ;
      T00QP15_A583IntCod = new byte[1] ;
      T00QP15_n583IntCod = new boolean[] {false} ;
      T00QP15_A626MatCod = new short[1] ;
      T00QP15_n626MatCod = new boolean[] {false} ;
      T00QP15_A831TipColCod = new byte[1] ;
      T00QP15_n831TipColCod = new boolean[] {false} ;
      T00QP15_A1514MacProCod = new String[] {""} ;
      T00QP15_n1514MacProCod = new boolean[] {false} ;
      T00QP15_A3316CodSol = new short[1] ;
      T00QP15_n3316CodSol = new boolean[] {false} ;
      T00QP15_A5098TipDisCod = new String[] {""} ;
      T00QP15_n5098TipDisCod = new boolean[] {false} ;
      T00QP15_A5801Lab_CodCau = new short[1] ;
      T00QP15_n5801Lab_CodCau = new boolean[] {false} ;
      T00QP16_A5097TipDisDsc = new String[] {""} ;
      T00QP16_n5097TipDisDsc = new boolean[] {false} ;
      T00QP16_A396EmprCod = new String[] {""} ;
      T00QP16_A5098TipDisCod = new String[] {""} ;
      T00QP16_n5098TipDisCod = new boolean[] {false} ;
      T00QP17_A5097TipDisDsc = new String[] {""} ;
      T00QP17_n5097TipDisDsc = new boolean[] {false} ;
      T00QP17_A396EmprCod = new String[] {""} ;
      T00QP17_A5098TipDisCod = new String[] {""} ;
      T00QP17_n5098TipDisCod = new boolean[] {false} ;
      T00QP6_A407EmprNom = new String[] {""} ;
      T00QP6_n407EmprNom = new boolean[] {false} ;
      T00QP7_A279CliNom = new String[] {""} ;
      T00QP8_A584IntDsc = new String[] {""} ;
      T00QP8_n584IntDsc = new boolean[] {false} ;
      T00QP9_A627MatDsc = new String[] {""} ;
      T00QP9_n627MatDsc = new boolean[] {false} ;
      T00QP10_A832TipColDsc = new String[] {""} ;
      T00QP10_n832TipColDsc = new boolean[] {false} ;
      T00QP11_A1515MacProDsc = new String[] {""} ;
      T00QP12_A3317DscSol = new String[] {""} ;
      T00QP12_n3317DscSol = new boolean[] {false} ;
      T00QP13_A5097TipDisDsc = new String[] {""} ;
      T00QP13_n5097TipDisDsc = new boolean[] {false} ;
      T00QP14_A5802Lab_DscCau = new String[] {""} ;
      T00QP14_n5802Lab_DscCau = new boolean[] {false} ;
      T00QP18_A407EmprNom = new String[] {""} ;
      T00QP18_n407EmprNom = new boolean[] {false} ;
      T00QP19_A279CliNom = new String[] {""} ;
      T00QP20_A584IntDsc = new String[] {""} ;
      T00QP20_n584IntDsc = new boolean[] {false} ;
      T00QP21_A627MatDsc = new String[] {""} ;
      T00QP21_n627MatDsc = new boolean[] {false} ;
      T00QP22_A832TipColDsc = new String[] {""} ;
      T00QP22_n832TipColDsc = new boolean[] {false} ;
      T00QP23_A1515MacProDsc = new String[] {""} ;
      T00QP24_A3317DscSol = new String[] {""} ;
      T00QP24_n3317DscSol = new boolean[] {false} ;
      T00QP25_A5097TipDisDsc = new String[] {""} ;
      T00QP25_n5097TipDisDsc = new boolean[] {false} ;
      T00QP26_A5802Lab_DscCau = new String[] {""} ;
      T00QP26_n5802Lab_DscCau = new boolean[] {false} ;
      T00QP27_A396EmprCod = new String[] {""} ;
      T00QP27_A5532Lb_numero = new int[1] ;
      T00QP5_A5548Lb_Obs = new String[] {""} ;
      T00QP5_A5532Lb_numero = new int[1] ;
      T00QP5_A5533Lb_ArtCod = new String[] {""} ;
      T00QP5_A5534Lb_ArtDsc = new String[] {""} ;
      T00QP5_A5535Lb_TipArt = new short[1] ;
      T00QP5_A5552Lb_TipArtD = new String[] {""} ;
      T00QP5_A5536Lb_ColNom = new String[] {""} ;
      T00QP5_A5537Lb_ColNum = new int[1] ;
      T00QP5_A5538Lb_ColNomC = new String[] {""} ;
      T00QP5_A5539Lb_ColNumC = new int[1] ;
      T00QP5_A5540Lb_Cartaz = new String[] {""} ;
      T00QP5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A5543Lb_Usuario = new String[] {""} ;
      T00QP5_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A5546Lb_UsuM = new String[] {""} ;
      T00QP5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP5_A5549Lb_UltOp = new String[] {""} ;
      T00QP5_A5550Lb_UltlPq = new short[1] ;
      T00QP5_A5569Lb_EstEns = new byte[1] ;
      T00QP5_A5570Lb_Tipo = new String[] {""} ;
      T00QP5_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A5595Lb_malha = new byte[1] ;
      T00QP5_A5596Lb_reprod = new byte[1] ;
      T00QP5_A5597Lb_TipRec = new byte[1] ;
      T00QP5_A5598Lb_impreso = new byte[1] ;
      T00QP5_A5599Lb_RGB = new long[1] ;
      T00QP5_A5600Lb_IDM = new int[1] ;
      T00QP5_A5601Lb_Tempt = new short[1] ;
      T00QP5_A5610Lb_Temp2 = new short[1] ;
      T00QP5_A5611Lb_Temp3 = new short[1] ;
      T00QP5_A5700Lb_Talao = new String[] {""} ;
      T00QP5_A5701Lb_Local = new String[] {""} ;
      T00QP5_A5699Lb_EstLab = new byte[1] ;
      T00QP5_A5717Lb_numopu = new byte[1] ;
      T00QP5_A5901Lab_desvio = new short[1] ;
      T00QP5_A5988Lb_nfibras = new byte[1] ;
      T00QP5_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP5_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP5_A6546Lb_Pantone = new String[] {""} ;
      T00QP5_A6618Lb_PedCod = new String[] {""} ;
      T00QP5_A6644Lb_PriEns = new String[] {""} ;
      T00QP5_A6653Lb_Tra1 = new String[] {""} ;
      T00QP5_A6654Lb_TraP1 = new short[1] ;
      T00QP5_A6655Lb_Tra2 = new String[] {""} ;
      T00QP5_A6656Lb_TraP2 = new short[1] ;
      T00QP5_A6657Lb_Tra3 = new String[] {""} ;
      T00QP5_A6658Lb_TraP3 = new short[1] ;
      T00QP5_A6842Lb_Tra4 = new String[] {""} ;
      T00QP5_A6843Lb_TraP4 = new short[1] ;
      T00QP5_A6844Lb_Tra5 = new String[] {""} ;
      T00QP5_A6845Lb_TraP5 = new short[1] ;
      T00QP5_A6846Lb_Tra6 = new String[] {""} ;
      T00QP5_A6847Lb_TraP6 = new short[1] ;
      T00QP5_A7780Lb_Hila = new String[] {""} ;
      T00QP5_A8946Lb_NCoS = new int[1] ;
      T00QP5_A8947Lb_NOpR = new int[1] ;
      T00QP5_A8948Lb_NCoE = new int[1] ;
      T00QP5_A8949Lb_NOpE = new int[1] ;
      T00QP5_A8950Lb_NOpN = new int[1] ;
      T00QP5_A8951Lb_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A8952Lb_FecN = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A8953Lb_FecR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP5_A8954Lb_diasER = new int[1] ;
      T00QP5_A9900Lb_obsCl = new String[] {""} ;
      T00QP5_A10883Lb_obsLb = new String[] {""} ;
      T00QP5_A396EmprCod = new String[] {""} ;
      T00QP5_A252CliCod = new int[1] ;
      T00QP5_A583IntCod = new byte[1] ;
      T00QP5_n583IntCod = new boolean[] {false} ;
      T00QP5_A626MatCod = new short[1] ;
      T00QP5_n626MatCod = new boolean[] {false} ;
      T00QP5_A831TipColCod = new byte[1] ;
      T00QP5_n831TipColCod = new boolean[] {false} ;
      T00QP5_A1514MacProCod = new String[] {""} ;
      T00QP5_n1514MacProCod = new boolean[] {false} ;
      T00QP5_A3316CodSol = new short[1] ;
      T00QP5_n3316CodSol = new boolean[] {false} ;
      T00QP5_A5098TipDisCod = new String[] {""} ;
      T00QP5_n5098TipDisCod = new boolean[] {false} ;
      T00QP5_A5801Lab_CodCau = new short[1] ;
      T00QP5_n5801Lab_CodCau = new boolean[] {false} ;
      T00QP28_A396EmprCod = new String[] {""} ;
      T00QP28_A5532Lb_numero = new int[1] ;
      T00QP29_A396EmprCod = new String[] {""} ;
      T00QP29_A5532Lb_numero = new int[1] ;
      T00QP30_A5097TipDisDsc = new String[] {""} ;
      T00QP30_n5097TipDisDsc = new boolean[] {false} ;
      T00QP30_A396EmprCod = new String[] {""} ;
      T00QP30_A5098TipDisCod = new String[] {""} ;
      T00QP30_n5098TipDisCod = new boolean[] {false} ;
      T00QP4_A5548Lb_Obs = new String[] {""} ;
      T00QP4_A5532Lb_numero = new int[1] ;
      T00QP4_A5533Lb_ArtCod = new String[] {""} ;
      T00QP4_A5534Lb_ArtDsc = new String[] {""} ;
      T00QP4_A5535Lb_TipArt = new short[1] ;
      T00QP4_A5552Lb_TipArtD = new String[] {""} ;
      T00QP4_A5536Lb_ColNom = new String[] {""} ;
      T00QP4_A5537Lb_ColNum = new int[1] ;
      T00QP4_A5538Lb_ColNomC = new String[] {""} ;
      T00QP4_A5539Lb_ColNumC = new int[1] ;
      T00QP4_A5540Lb_Cartaz = new String[] {""} ;
      T00QP4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A5543Lb_Usuario = new String[] {""} ;
      T00QP4_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A5546Lb_UsuM = new String[] {""} ;
      T00QP4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP4_A5549Lb_UltOp = new String[] {""} ;
      T00QP4_A5550Lb_UltlPq = new short[1] ;
      T00QP4_A5569Lb_EstEns = new byte[1] ;
      T00QP4_A5570Lb_Tipo = new String[] {""} ;
      T00QP4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A5595Lb_malha = new byte[1] ;
      T00QP4_A5596Lb_reprod = new byte[1] ;
      T00QP4_A5597Lb_TipRec = new byte[1] ;
      T00QP4_A5598Lb_impreso = new byte[1] ;
      T00QP4_A5599Lb_RGB = new long[1] ;
      T00QP4_A5600Lb_IDM = new int[1] ;
      T00QP4_A5601Lb_Tempt = new short[1] ;
      T00QP4_A5610Lb_Temp2 = new short[1] ;
      T00QP4_A5611Lb_Temp3 = new short[1] ;
      T00QP4_A5700Lb_Talao = new String[] {""} ;
      T00QP4_A5701Lb_Local = new String[] {""} ;
      T00QP4_A5699Lb_EstLab = new byte[1] ;
      T00QP4_A5717Lb_numopu = new byte[1] ;
      T00QP4_A5901Lab_desvio = new short[1] ;
      T00QP4_A5988Lb_nfibras = new byte[1] ;
      T00QP4_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP4_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QP4_A6546Lb_Pantone = new String[] {""} ;
      T00QP4_A6618Lb_PedCod = new String[] {""} ;
      T00QP4_A6644Lb_PriEns = new String[] {""} ;
      T00QP4_A6653Lb_Tra1 = new String[] {""} ;
      T00QP4_A6654Lb_TraP1 = new short[1] ;
      T00QP4_A6655Lb_Tra2 = new String[] {""} ;
      T00QP4_A6656Lb_TraP2 = new short[1] ;
      T00QP4_A6657Lb_Tra3 = new String[] {""} ;
      T00QP4_A6658Lb_TraP3 = new short[1] ;
      T00QP4_A6842Lb_Tra4 = new String[] {""} ;
      T00QP4_A6843Lb_TraP4 = new short[1] ;
      T00QP4_A6844Lb_Tra5 = new String[] {""} ;
      T00QP4_A6845Lb_TraP5 = new short[1] ;
      T00QP4_A6846Lb_Tra6 = new String[] {""} ;
      T00QP4_A6847Lb_TraP6 = new short[1] ;
      T00QP4_A7780Lb_Hila = new String[] {""} ;
      T00QP4_A8946Lb_NCoS = new int[1] ;
      T00QP4_A8947Lb_NOpR = new int[1] ;
      T00QP4_A8948Lb_NCoE = new int[1] ;
      T00QP4_A8949Lb_NOpE = new int[1] ;
      T00QP4_A8950Lb_NOpN = new int[1] ;
      T00QP4_A8951Lb_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A8952Lb_FecN = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A8953Lb_FecR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QP4_A8954Lb_diasER = new int[1] ;
      T00QP4_A9900Lb_obsCl = new String[] {""} ;
      T00QP4_A10883Lb_obsLb = new String[] {""} ;
      T00QP4_A396EmprCod = new String[] {""} ;
      T00QP4_A252CliCod = new int[1] ;
      T00QP4_A583IntCod = new byte[1] ;
      T00QP4_n583IntCod = new boolean[] {false} ;
      T00QP4_A626MatCod = new short[1] ;
      T00QP4_n626MatCod = new boolean[] {false} ;
      T00QP4_A831TipColCod = new byte[1] ;
      T00QP4_n831TipColCod = new boolean[] {false} ;
      T00QP4_A1514MacProCod = new String[] {""} ;
      T00QP4_n1514MacProCod = new boolean[] {false} ;
      T00QP4_A3316CodSol = new short[1] ;
      T00QP4_n3316CodSol = new boolean[] {false} ;
      T00QP4_A5098TipDisCod = new String[] {""} ;
      T00QP4_n5098TipDisCod = new boolean[] {false} ;
      T00QP4_A5801Lab_CodCau = new short[1] ;
      T00QP4_n5801Lab_CodCau = new boolean[] {false} ;
      T00QP34_A407EmprNom = new String[] {""} ;
      T00QP34_n407EmprNom = new boolean[] {false} ;
      T00QP35_A279CliNom = new String[] {""} ;
      T00QP36_A832TipColDsc = new String[] {""} ;
      T00QP36_n832TipColDsc = new boolean[] {false} ;
      T00QP37_A584IntDsc = new String[] {""} ;
      T00QP37_n584IntDsc = new boolean[] {false} ;
      T00QP38_A627MatDsc = new String[] {""} ;
      T00QP38_n627MatDsc = new boolean[] {false} ;
      T00QP39_A3317DscSol = new String[] {""} ;
      T00QP39_n3317DscSol = new boolean[] {false} ;
      T00QP40_A5802Lab_DscCau = new String[] {""} ;
      T00QP40_n5802Lab_DscCau = new boolean[] {false} ;
      T00QP41_A5097TipDisDsc = new String[] {""} ;
      T00QP41_n5097TipDisDsc = new boolean[] {false} ;
      T00QP42_A1515MacProDsc = new String[] {""} ;
      T00QP43_A396EmprCod = new String[] {""} ;
      T00QP43_A5532Lb_numero = new int[1] ;
      T00QP43_A13379LbNormaID = new String[] {""} ;
      T00QP44_A396EmprCod = new String[] {""} ;
      T00QP44_A5532Lb_numero = new int[1] ;
      T00QP44_A5555Lb_opcion = new String[] {""} ;
      T00QP45_A396EmprCod = new String[] {""} ;
      T00QP45_A5532Lb_numero = new int[1] ;
      T00QP46_A5532Lb_numero = new int[1] ;
      T00QP46_A5551Lb_lineaPq = new short[1] ;
      T00QP46_A5553Lb_ForCod = new String[] {""} ;
      T00QP46_A6372Lb_RecPip = new String[] {""} ;
      T00QP46_A8621Lb_Envio = new String[] {""} ;
      T00QP46_A396EmprCod = new String[] {""} ;
      T00QP47_A396EmprCod = new String[] {""} ;
      T00QP47_A5532Lb_numero = new int[1] ;
      T00QP47_A5551Lb_lineaPq = new short[1] ;
      T00QP3_A5532Lb_numero = new int[1] ;
      T00QP3_A5551Lb_lineaPq = new short[1] ;
      T00QP3_A5553Lb_ForCod = new String[] {""} ;
      T00QP3_A6372Lb_RecPip = new String[] {""} ;
      T00QP3_A8621Lb_Envio = new String[] {""} ;
      T00QP3_A396EmprCod = new String[] {""} ;
      T00QP2_A5532Lb_numero = new int[1] ;
      T00QP2_A5551Lb_lineaPq = new short[1] ;
      T00QP2_A5553Lb_ForCod = new String[] {""} ;
      T00QP2_A6372Lb_RecPip = new String[] {""} ;
      T00QP2_A8621Lb_Envio = new String[] {""} ;
      T00QP2_A396EmprCod = new String[] {""} ;
      T00QP51_A396EmprCod = new String[] {""} ;
      T00QP51_A5532Lb_numero = new int[1] ;
      T00QP51_A5551Lb_lineaPq = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l5097TipDisDsc = "" ;
      T00QP52_A5097TipDisDsc = new String[] {""} ;
      T00QP52_n5097TipDisDsc = new boolean[] {false} ;
      T00QP53_A5097TipDisDsc = new String[] {""} ;
      T00QP53_n5097TipDisDsc = new boolean[] {false} ;
      T00QP53_A396EmprCod = new String[] {""} ;
      T00QP53_A5098TipDisCod = new String[] {""} ;
      T00QP53_n5098TipDisCod = new boolean[] {false} ;
      T00QP54_A407EmprNom = new String[] {""} ;
      T00QP54_n407EmprNom = new boolean[] {false} ;
      T00QP55_A407EmprNom = new String[] {""} ;
      T00QP55_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ5533Lb_ArtCod = "" ;
      ZZ5534Lb_ArtDsc = "" ;
      ZZ5552Lb_TipArtD = "" ;
      ZZ5536Lb_ColNom = "" ;
      ZZ5538Lb_ColNomC = "" ;
      ZZ5540Lb_Cartaz = "" ;
      ZZ5541Lb_FechaE = GXutil.nullDate() ;
      ZZ5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      ZZ5543Lb_Usuario = "" ;
      ZZ5544Lb_FechaM = GXutil.nullDate() ;
      ZZ5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      ZZ5546Lb_UsuM = "" ;
      ZZ5547Lb_Rb = DecimalUtil.ZERO ;
      ZZ5548Lb_Obs = "" ;
      ZZ5549Lb_UltOp = "" ;
      ZZ5570Lb_Tipo = "" ;
      ZZ5594Lb_cartazf = GXutil.nullDate() ;
      ZZ5700Lb_Talao = "" ;
      ZZ5701Lb_Local = "" ;
      ZZ5098TipDisCod = "" ;
      ZZ6056Lb_pesom = DecimalUtil.ZERO ;
      ZZ6057Lb_volum = DecimalUtil.ZERO ;
      ZZ1514MacProCod = "" ;
      ZZ6546Lb_Pantone = "" ;
      ZZ6618Lb_PedCod = "" ;
      ZZ6644Lb_PriEns = "" ;
      ZZ6653Lb_Tra1 = "" ;
      ZZ6655Lb_Tra2 = "" ;
      ZZ6657Lb_Tra3 = "" ;
      ZZ6842Lb_Tra4 = "" ;
      ZZ6844Lb_Tra5 = "" ;
      ZZ6846Lb_Tra6 = "" ;
      ZZ7780Lb_Hila = "" ;
      ZZ8951Lb_FecE = GXutil.nullDate() ;
      ZZ8952Lb_FecN = GXutil.nullDate() ;
      ZZ8953Lb_FecR = GXutil.nullDate() ;
      ZZ9900Lb_obsCl = "" ;
      ZZ10883Lb_obsLb = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ584IntDsc = "" ;
      ZZ627MatDsc = "" ;
      ZZ832TipColDsc = "" ;
      ZZ1515MacProDsc = "" ;
      ZZ3317DscSol = "" ;
      ZZ5097TipDisDsc = "" ;
      ZZ5802Lab_DscCau = "" ;
      Zh5098TipDisCod = "" ;
      T00QP56_A279CliNom = new String[] {""} ;
      T00QP57_A832TipColDsc = new String[] {""} ;
      T00QP57_n832TipColDsc = new boolean[] {false} ;
      T00QP58_A584IntDsc = new String[] {""} ;
      T00QP58_n584IntDsc = new boolean[] {false} ;
      T00QP59_A627MatDsc = new String[] {""} ;
      T00QP59_n627MatDsc = new boolean[] {false} ;
      T00QP60_A3317DscSol = new String[] {""} ;
      T00QP60_n3317DscSol = new boolean[] {false} ;
      T00QP61_A5802Lab_DscCau = new String[] {""} ;
      T00QP61_n5802Lab_DscCau = new boolean[] {false} ;
      T00QP62_A5097TipDisDsc = new String[] {""} ;
      T00QP62_n5097TipDisDsc = new boolean[] {false} ;
      T00QP62_A396EmprCod = new String[] {""} ;
      T00QP62_A5098TipDisCod = new String[] {""} ;
      T00QP62_n5098TipDisCod = new boolean[] {false} ;
      T00QP63_A5097TipDisDsc = new String[] {""} ;
      T00QP63_n5097TipDisDsc = new boolean[] {false} ;
      T00QP64_A1515MacProDsc = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z5554Lb_ForDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tens000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tens000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tens000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tens000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tens000__default(),
         new Object[] {
             new Object[] {
            T00QP2_A5532Lb_numero, T00QP2_A5551Lb_lineaPq, T00QP2_A5553Lb_ForCod, T00QP2_A6372Lb_RecPip, T00QP2_A8621Lb_Envio, T00QP2_A396EmprCod
            }
            , new Object[] {
            T00QP3_A5532Lb_numero, T00QP3_A5551Lb_lineaPq, T00QP3_A5553Lb_ForCod, T00QP3_A6372Lb_RecPip, T00QP3_A8621Lb_Envio, T00QP3_A396EmprCod
            }
            , new Object[] {
            T00QP4_A5548Lb_Obs, T00QP4_A5532Lb_numero, T00QP4_A5533Lb_ArtCod, T00QP4_A5534Lb_ArtDsc, T00QP4_A5535Lb_TipArt, T00QP4_A5552Lb_TipArtD, T00QP4_A5536Lb_ColNom, T00QP4_A5537Lb_ColNum, T00QP4_A5538Lb_ColNomC, T00QP4_A5539Lb_ColNumC,
            T00QP4_A5540Lb_Cartaz, T00QP4_A5541Lb_FechaE, T00QP4_A5542Lb_HoraE, T00QP4_A5543Lb_Usuario, T00QP4_A5544Lb_FechaM, T00QP4_A5545Lb_HoraM, T00QP4_A5546Lb_UsuM, T00QP4_A5547Lb_Rb, T00QP4_A5549Lb_UltOp, T00QP4_A5550Lb_UltlPq,
            T00QP4_A5569Lb_EstEns, T00QP4_A5570Lb_Tipo, T00QP4_A5594Lb_cartazf, T00QP4_A5595Lb_malha, T00QP4_A5596Lb_reprod, T00QP4_A5597Lb_TipRec, T00QP4_A5598Lb_impreso, T00QP4_A5599Lb_RGB, T00QP4_A5600Lb_IDM, T00QP4_A5601Lb_Tempt,
            T00QP4_A5610Lb_Temp2, T00QP4_A5611Lb_Temp3, T00QP4_A5700Lb_Talao, T00QP4_A5701Lb_Local, T00QP4_A5699Lb_EstLab, T00QP4_A5717Lb_numopu, T00QP4_A5901Lab_desvio, T00QP4_A5988Lb_nfibras, T00QP4_A6056Lb_pesom, T00QP4_A6057Lb_volum,
            T00QP4_A6546Lb_Pantone, T00QP4_A6618Lb_PedCod, T00QP4_A6644Lb_PriEns, T00QP4_A6653Lb_Tra1, T00QP4_A6654Lb_TraP1, T00QP4_A6655Lb_Tra2, T00QP4_A6656Lb_TraP2, T00QP4_A6657Lb_Tra3, T00QP4_A6658Lb_TraP3, T00QP4_A6842Lb_Tra4,
            T00QP4_A6843Lb_TraP4, T00QP4_A6844Lb_Tra5, T00QP4_A6845Lb_TraP5, T00QP4_A6846Lb_Tra6, T00QP4_A6847Lb_TraP6, T00QP4_A7780Lb_Hila, T00QP4_A8946Lb_NCoS, T00QP4_A8947Lb_NOpR, T00QP4_A8948Lb_NCoE, T00QP4_A8949Lb_NOpE,
            T00QP4_A8950Lb_NOpN, T00QP4_A8951Lb_FecE, T00QP4_A8952Lb_FecN, T00QP4_A8953Lb_FecR, T00QP4_A8954Lb_diasER, T00QP4_A9900Lb_obsCl, T00QP4_A10883Lb_obsLb, T00QP4_A396EmprCod, T00QP4_A252CliCod, T00QP4_A583IntCod,
            T00QP4_n583IntCod, T00QP4_A626MatCod, T00QP4_n626MatCod, T00QP4_A831TipColCod, T00QP4_n831TipColCod, T00QP4_A1514MacProCod, T00QP4_n1514MacProCod, T00QP4_A3316CodSol, T00QP4_n3316CodSol, T00QP4_A5098TipDisCod,
            T00QP4_n5098TipDisCod, T00QP4_A5801Lab_CodCau, T00QP4_n5801Lab_CodCau
            }
            , new Object[] {
            T00QP5_A5548Lb_Obs, T00QP5_A5532Lb_numero, T00QP5_A5533Lb_ArtCod, T00QP5_A5534Lb_ArtDsc, T00QP5_A5535Lb_TipArt, T00QP5_A5552Lb_TipArtD, T00QP5_A5536Lb_ColNom, T00QP5_A5537Lb_ColNum, T00QP5_A5538Lb_ColNomC, T00QP5_A5539Lb_ColNumC,
            T00QP5_A5540Lb_Cartaz, T00QP5_A5541Lb_FechaE, T00QP5_A5542Lb_HoraE, T00QP5_A5543Lb_Usuario, T00QP5_A5544Lb_FechaM, T00QP5_A5545Lb_HoraM, T00QP5_A5546Lb_UsuM, T00QP5_A5547Lb_Rb, T00QP5_A5549Lb_UltOp, T00QP5_A5550Lb_UltlPq,
            T00QP5_A5569Lb_EstEns, T00QP5_A5570Lb_Tipo, T00QP5_A5594Lb_cartazf, T00QP5_A5595Lb_malha, T00QP5_A5596Lb_reprod, T00QP5_A5597Lb_TipRec, T00QP5_A5598Lb_impreso, T00QP5_A5599Lb_RGB, T00QP5_A5600Lb_IDM, T00QP5_A5601Lb_Tempt,
            T00QP5_A5610Lb_Temp2, T00QP5_A5611Lb_Temp3, T00QP5_A5700Lb_Talao, T00QP5_A5701Lb_Local, T00QP5_A5699Lb_EstLab, T00QP5_A5717Lb_numopu, T00QP5_A5901Lab_desvio, T00QP5_A5988Lb_nfibras, T00QP5_A6056Lb_pesom, T00QP5_A6057Lb_volum,
            T00QP5_A6546Lb_Pantone, T00QP5_A6618Lb_PedCod, T00QP5_A6644Lb_PriEns, T00QP5_A6653Lb_Tra1, T00QP5_A6654Lb_TraP1, T00QP5_A6655Lb_Tra2, T00QP5_A6656Lb_TraP2, T00QP5_A6657Lb_Tra3, T00QP5_A6658Lb_TraP3, T00QP5_A6842Lb_Tra4,
            T00QP5_A6843Lb_TraP4, T00QP5_A6844Lb_Tra5, T00QP5_A6845Lb_TraP5, T00QP5_A6846Lb_Tra6, T00QP5_A6847Lb_TraP6, T00QP5_A7780Lb_Hila, T00QP5_A8946Lb_NCoS, T00QP5_A8947Lb_NOpR, T00QP5_A8948Lb_NCoE, T00QP5_A8949Lb_NOpE,
            T00QP5_A8950Lb_NOpN, T00QP5_A8951Lb_FecE, T00QP5_A8952Lb_FecN, T00QP5_A8953Lb_FecR, T00QP5_A8954Lb_diasER, T00QP5_A9900Lb_obsCl, T00QP5_A10883Lb_obsLb, T00QP5_A396EmprCod, T00QP5_A252CliCod, T00QP5_A583IntCod,
            T00QP5_n583IntCod, T00QP5_A626MatCod, T00QP5_n626MatCod, T00QP5_A831TipColCod, T00QP5_n831TipColCod, T00QP5_A1514MacProCod, T00QP5_n1514MacProCod, T00QP5_A3316CodSol, T00QP5_n3316CodSol, T00QP5_A5098TipDisCod,
            T00QP5_n5098TipDisCod, T00QP5_A5801Lab_CodCau, T00QP5_n5801Lab_CodCau
            }
            , new Object[] {
            T00QP6_A407EmprNom, T00QP6_n407EmprNom
            }
            , new Object[] {
            T00QP7_A279CliNom
            }
            , new Object[] {
            T00QP8_A584IntDsc, T00QP8_n584IntDsc
            }
            , new Object[] {
            T00QP9_A627MatDsc, T00QP9_n627MatDsc
            }
            , new Object[] {
            T00QP10_A832TipColDsc, T00QP10_n832TipColDsc
            }
            , new Object[] {
            T00QP11_A1515MacProDsc
            }
            , new Object[] {
            T00QP12_A3317DscSol, T00QP12_n3317DscSol
            }
            , new Object[] {
            T00QP13_A5097TipDisDsc, T00QP13_n5097TipDisDsc
            }
            , new Object[] {
            T00QP14_A5802Lab_DscCau, T00QP14_n5802Lab_DscCau
            }
            , new Object[] {
            T00QP15_A5548Lb_Obs, T00QP15_A5532Lb_numero, T00QP15_A407EmprNom, T00QP15_n407EmprNom, T00QP15_A279CliNom, T00QP15_A5533Lb_ArtCod, T00QP15_A5534Lb_ArtDsc, T00QP15_A5535Lb_TipArt, T00QP15_A5552Lb_TipArtD, T00QP15_A5536Lb_ColNom,
            T00QP15_A5537Lb_ColNum, T00QP15_A832TipColDsc, T00QP15_n832TipColDsc, T00QP15_A5538Lb_ColNomC, T00QP15_A5539Lb_ColNumC, T00QP15_A5540Lb_Cartaz, T00QP15_A5541Lb_FechaE, T00QP15_A5542Lb_HoraE, T00QP15_A5543Lb_Usuario, T00QP15_A5544Lb_FechaM,
            T00QP15_A5545Lb_HoraM, T00QP15_A5546Lb_UsuM, T00QP15_A5547Lb_Rb, T00QP15_A584IntDsc, T00QP15_n584IntDsc, T00QP15_A627MatDsc, T00QP15_n627MatDsc, T00QP15_A3317DscSol, T00QP15_n3317DscSol, T00QP15_A5549Lb_UltOp,
            T00QP15_A5550Lb_UltlPq, T00QP15_A5569Lb_EstEns, T00QP15_A5570Lb_Tipo, T00QP15_A5594Lb_cartazf, T00QP15_A5595Lb_malha, T00QP15_A5596Lb_reprod, T00QP15_A5597Lb_TipRec, T00QP15_A5598Lb_impreso, T00QP15_A5599Lb_RGB, T00QP15_A5600Lb_IDM,
            T00QP15_A5601Lb_Tempt, T00QP15_A5610Lb_Temp2, T00QP15_A5611Lb_Temp3, T00QP15_A5700Lb_Talao, T00QP15_A5701Lb_Local, T00QP15_A5699Lb_EstLab, T00QP15_A5717Lb_numopu, T00QP15_A5802Lab_DscCau, T00QP15_n5802Lab_DscCau, T00QP15_A5901Lab_desvio,
            T00QP15_A5097TipDisDsc, T00QP15_n5097TipDisDsc, T00QP15_A5988Lb_nfibras, T00QP15_A6056Lb_pesom, T00QP15_A6057Lb_volum, T00QP15_A1515MacProDsc, T00QP15_A6546Lb_Pantone, T00QP15_A6618Lb_PedCod, T00QP15_A6644Lb_PriEns, T00QP15_A6653Lb_Tra1,
            T00QP15_A6654Lb_TraP1, T00QP15_A6655Lb_Tra2, T00QP15_A6656Lb_TraP2, T00QP15_A6657Lb_Tra3, T00QP15_A6658Lb_TraP3, T00QP15_A6842Lb_Tra4, T00QP15_A6843Lb_TraP4, T00QP15_A6844Lb_Tra5, T00QP15_A6845Lb_TraP5, T00QP15_A6846Lb_Tra6,
            T00QP15_A6847Lb_TraP6, T00QP15_A7780Lb_Hila, T00QP15_A8946Lb_NCoS, T00QP15_A8947Lb_NOpR, T00QP15_A8948Lb_NCoE, T00QP15_A8949Lb_NOpE, T00QP15_A8950Lb_NOpN, T00QP15_A8951Lb_FecE, T00QP15_A8952Lb_FecN, T00QP15_A8953Lb_FecR,
            T00QP15_A8954Lb_diasER, T00QP15_A9900Lb_obsCl, T00QP15_A10883Lb_obsLb, T00QP15_A396EmprCod, T00QP15_A252CliCod, T00QP15_A583IntCod, T00QP15_n583IntCod, T00QP15_A626MatCod, T00QP15_n626MatCod, T00QP15_A831TipColCod,
            T00QP15_n831TipColCod, T00QP15_A1514MacProCod, T00QP15_n1514MacProCod, T00QP15_A3316CodSol, T00QP15_n3316CodSol, T00QP15_A5098TipDisCod, T00QP15_n5098TipDisCod, T00QP15_A5801Lab_CodCau, T00QP15_n5801Lab_CodCau
            }
            , new Object[] {
            T00QP16_A5097TipDisDsc, T00QP16_n5097TipDisDsc, T00QP16_A396EmprCod, T00QP16_A5098TipDisCod
            }
            , new Object[] {
            T00QP17_A5097TipDisDsc, T00QP17_n5097TipDisDsc, T00QP17_A396EmprCod, T00QP17_A5098TipDisCod
            }
            , new Object[] {
            T00QP18_A407EmprNom, T00QP18_n407EmprNom
            }
            , new Object[] {
            T00QP19_A279CliNom
            }
            , new Object[] {
            T00QP20_A584IntDsc, T00QP20_n584IntDsc
            }
            , new Object[] {
            T00QP21_A627MatDsc, T00QP21_n627MatDsc
            }
            , new Object[] {
            T00QP22_A832TipColDsc, T00QP22_n832TipColDsc
            }
            , new Object[] {
            T00QP23_A1515MacProDsc
            }
            , new Object[] {
            T00QP24_A3317DscSol, T00QP24_n3317DscSol
            }
            , new Object[] {
            T00QP25_A5097TipDisDsc, T00QP25_n5097TipDisDsc
            }
            , new Object[] {
            T00QP26_A5802Lab_DscCau, T00QP26_n5802Lab_DscCau
            }
            , new Object[] {
            T00QP27_A396EmprCod, T00QP27_A5532Lb_numero
            }
            , new Object[] {
            T00QP28_A396EmprCod, T00QP28_A5532Lb_numero
            }
            , new Object[] {
            T00QP29_A396EmprCod, T00QP29_A5532Lb_numero
            }
            , new Object[] {
            T00QP30_A5097TipDisDsc, T00QP30_n5097TipDisDsc, T00QP30_A396EmprCod, T00QP30_A5098TipDisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00QP34_A407EmprNom, T00QP34_n407EmprNom
            }
            , new Object[] {
            T00QP35_A279CliNom
            }
            , new Object[] {
            T00QP36_A832TipColDsc, T00QP36_n832TipColDsc
            }
            , new Object[] {
            T00QP37_A584IntDsc, T00QP37_n584IntDsc
            }
            , new Object[] {
            T00QP38_A627MatDsc, T00QP38_n627MatDsc
            }
            , new Object[] {
            T00QP39_A3317DscSol, T00QP39_n3317DscSol
            }
            , new Object[] {
            T00QP40_A5802Lab_DscCau, T00QP40_n5802Lab_DscCau
            }
            , new Object[] {
            T00QP41_A5097TipDisDsc, T00QP41_n5097TipDisDsc
            }
            , new Object[] {
            T00QP42_A1515MacProDsc
            }
            , new Object[] {
            T00QP43_A396EmprCod, T00QP43_A5532Lb_numero, T00QP43_A13379LbNormaID
            }
            , new Object[] {
            T00QP44_A396EmprCod, T00QP44_A5532Lb_numero, T00QP44_A5555Lb_opcion
            }
            , new Object[] {
            T00QP45_A396EmprCod, T00QP45_A5532Lb_numero
            }
            , new Object[] {
            T00QP46_A5532Lb_numero, T00QP46_A5551Lb_lineaPq, T00QP46_A5553Lb_ForCod, T00QP46_A6372Lb_RecPip, T00QP46_A8621Lb_Envio, T00QP46_A396EmprCod
            }
            , new Object[] {
            T00QP47_A396EmprCod, T00QP47_A5532Lb_numero, T00QP47_A5551Lb_lineaPq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00QP51_A396EmprCod, T00QP51_A5532Lb_numero, T00QP51_A5551Lb_lineaPq
            }
            , new Object[] {
            T00QP52_A5097TipDisDsc, T00QP52_n5097TipDisDsc
            }
            , new Object[] {
            T00QP53_A5097TipDisDsc, T00QP53_n5097TipDisDsc, T00QP53_A396EmprCod, T00QP53_A5098TipDisCod
            }
            , new Object[] {
            T00QP54_A407EmprNom, T00QP54_n407EmprNom
            }
            , new Object[] {
            T00QP55_A407EmprNom, T00QP55_n407EmprNom
            }
            , new Object[] {
            T00QP56_A279CliNom
            }
            , new Object[] {
            T00QP57_A832TipColDsc, T00QP57_n832TipColDsc
            }
            , new Object[] {
            T00QP58_A584IntDsc, T00QP58_n584IntDsc
            }
            , new Object[] {
            T00QP59_A627MatDsc, T00QP59_n627MatDsc
            }
            , new Object[] {
            T00QP60_A3317DscSol, T00QP60_n3317DscSol
            }
            , new Object[] {
            T00QP61_A5802Lab_DscCau, T00QP61_n5802Lab_DscCau
            }
            , new Object[] {
            T00QP62_A5097TipDisDsc, T00QP62_n5097TipDisDsc, T00QP62_A396EmprCod, T00QP62_A5098TipDisCod
            }
            , new Object[] {
            T00QP63_A5097TipDisDsc, T00QP63_n5097TipDisDsc
            }
            , new Object[] {
            T00QP64_A1515MacProDsc
            }
         }
      );
   }

   private byte Z5569Lb_EstEns ;
   private byte Z5595Lb_malha ;
   private byte Z5596Lb_reprod ;
   private byte Z5597Lb_TipRec ;
   private byte Z5598Lb_impreso ;
   private byte Z5699Lb_EstLab ;
   private byte Z5717Lb_numopu ;
   private byte Z5988Lb_nfibras ;
   private byte Z583IntCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte A5699Lb_EstLab ;
   private byte A5569Lb_EstEns ;
   private byte A5595Lb_malha ;
   private byte A5596Lb_reprod ;
   private byte A5597Lb_TipRec ;
   private byte A5598Lb_impreso ;
   private byte A5717Lb_numopu ;
   private byte A5988Lb_nfibras ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private byte ZZ583IntCod ;
   private byte ZZ5569Lb_EstEns ;
   private byte ZZ5595Lb_malha ;
   private byte ZZ5596Lb_reprod ;
   private byte ZZ5597Lb_TipRec ;
   private byte ZZ5598Lb_impreso ;
   private byte ZZ5699Lb_EstLab ;
   private byte ZZ5717Lb_numopu ;
   private byte ZZ5988Lb_nfibras ;
   private short Z5535Lb_TipArt ;
   private short Z5550Lb_UltlPq ;
   private short Z5601Lb_Tempt ;
   private short Z5610Lb_Temp2 ;
   private short Z5611Lb_Temp3 ;
   private short Z5901Lab_desvio ;
   private short Z6654Lb_TraP1 ;
   private short Z6656Lb_TraP2 ;
   private short Z6658Lb_TraP3 ;
   private short Z6843Lb_TraP4 ;
   private short Z6845Lb_TraP5 ;
   private short Z6847Lb_TraP6 ;
   private short Z626MatCod ;
   private short Z3316CodSol ;
   private short Z5801Lab_CodCau ;
   private short Z5551Lb_lineaPq ;
   private short nRcdDeleted_818 ;
   private short nRcdExists_818 ;
   private short nIsMod_818 ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short A5801Lab_CodCau ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5535Lb_TipArt ;
   private short A5550Lb_UltlPq ;
   private short A5601Lb_Tempt ;
   private short A5610Lb_Temp2 ;
   private short A5611Lb_Temp3 ;
   private short A5901Lab_desvio ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short nBlankRcdCount818 ;
   private short RcdFound818 ;
   private short nBlankRcdUsr818 ;
   private short A5551Lb_lineaPq ;
   private short RcdFound817 ;
   private short nIsDirty_817 ;
   private short nIsDirty_818 ;
   private short gxhchits ;
   private short ZZ5535Lb_TipArt ;
   private short ZZ626MatCod ;
   private short ZZ3316CodSol ;
   private short ZZ5550Lb_UltlPq ;
   private short ZZ5601Lb_Tempt ;
   private short ZZ5610Lb_Temp2 ;
   private short ZZ5611Lb_Temp3 ;
   private short ZZ5801Lab_CodCau ;
   private short ZZ5901Lab_desvio ;
   private short ZZ6654Lb_TraP1 ;
   private short ZZ6656Lb_TraP2 ;
   private short ZZ6658Lb_TraP3 ;
   private short ZZ6843Lb_TraP4 ;
   private short ZZ6845Lb_TraP5 ;
   private short ZZ6847Lb_TraP6 ;
   private int Z5532Lb_numero ;
   private int Z5537Lb_ColNum ;
   private int Z5539Lb_ColNumC ;
   private int Z5600Lb_IDM ;
   private int Z8946Lb_NCoS ;
   private int Z8947Lb_NOpR ;
   private int Z8948Lb_NCoE ;
   private int Z8949Lb_NOpE ;
   private int Z8950Lb_NOpN ;
   private int Z8954Lb_diasER ;
   private int Z252CliCod ;
   private int nRC_GXsfl_445 ;
   private int nGXsfl_445_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A5532Lb_numero ;
   private int edtLb_numero_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtLb_ArtCod_Enabled ;
   private int edtLb_ArtDsc_Enabled ;
   private int edtLb_TipArt_Enabled ;
   private int edtLb_TipArtD_Enabled ;
   private int edtLb_ColNom_Enabled ;
   private int A5537Lb_ColNum ;
   private int edtLb_ColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtLb_ColNomC_Enabled ;
   private int A5539Lb_ColNumC ;
   private int edtLb_ColNumC_Enabled ;
   private int edtLb_Cartaz_Enabled ;
   private int edtLb_FechaE_Enabled ;
   private int edtLb_HoraE_Enabled ;
   private int edtLb_Usuario_Enabled ;
   private int edtLb_FechaM_Enabled ;
   private int edtLb_HoraM_Enabled ;
   private int edtLb_UsuM_Enabled ;
   private int edtLb_Rb_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtMatCod_Enabled ;
   private int edtMatDsc_Enabled ;
   private int edtCodSol_Enabled ;
   private int edtDscSol_Enabled ;
   private int edtLb_Obs_Enabled ;
   private int edtLb_UltOp_Enabled ;
   private int edtLb_UltlPq_Enabled ;
   private int edtLb_EstEns_Enabled ;
   private int edtLb_Tipo_Enabled ;
   private int edtLb_cartazf_Enabled ;
   private int edtLb_malha_Enabled ;
   private int edtLb_reprod_Enabled ;
   private int edtLb_TipRec_Enabled ;
   private int edtLb_impreso_Enabled ;
   private int edtLb_RGB_Enabled ;
   private int A5600Lb_IDM ;
   private int edtLb_IDM_Enabled ;
   private int edtLb_Tempt_Enabled ;
   private int edtLb_Temp2_Enabled ;
   private int edtLb_Temp3_Enabled ;
   private int edtLb_Talao_Enabled ;
   private int edtLb_Local_Enabled ;
   private int edtLb_numopu_Enabled ;
   private int edtLab_CodCau_Enabled ;
   private int edtLab_DscCau_Enabled ;
   private int edtLab_desvio_Enabled ;
   private int edtTipDisCod_Enabled ;
   private int edtTipDisDsc_Enabled ;
   private int edtLb_nfibras_Enabled ;
   private int edtLb_pesom_Enabled ;
   private int edtLb_volum_Enabled ;
   private int edtMacProCod_Enabled ;
   private int edtMacProDsc_Enabled ;
   private int edtLb_Pantone_Enabled ;
   private int edtLb_PedCod_Enabled ;
   private int edtLb_PriEns_Enabled ;
   private int edtLb_Tra1_Enabled ;
   private int edtLb_TraP1_Enabled ;
   private int edtLb_Tra2_Enabled ;
   private int edtLb_TraP2_Enabled ;
   private int edtLb_Tra3_Enabled ;
   private int edtLb_TraP3_Enabled ;
   private int edtLb_Tra4_Enabled ;
   private int edtLb_TraP4_Enabled ;
   private int edtLb_Tra5_Enabled ;
   private int edtLb_TraP5_Enabled ;
   private int edtLb_Tra6_Enabled ;
   private int edtLb_TraP6_Enabled ;
   private int edtLb_Hila_Enabled ;
   private int A8946Lb_NCoS ;
   private int edtLb_NCoS_Enabled ;
   private int A8947Lb_NOpR ;
   private int edtLb_NOpR_Enabled ;
   private int A8948Lb_NCoE ;
   private int edtLb_NCoE_Enabled ;
   private int A8949Lb_NOpE ;
   private int edtLb_NOpE_Enabled ;
   private int A8950Lb_NOpN ;
   private int edtLb_NOpN_Enabled ;
   private int edtLb_FecE_Enabled ;
   private int edtLb_FecN_Enabled ;
   private int edtLb_FecR_Enabled ;
   private int A8954Lb_diasER ;
   private int edtLb_diasER_Enabled ;
   private int edtLb_obsCl_Enabled ;
   private int edtLb_obsLb_Enabled ;
   private int edtavnRcdDeleted_818_Enabled ;
   private int edtLb_lineaPq_Enabled ;
   private int edtLb_ForCod_Enabled ;
   private int edtLb_ForDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtLb_lineaPq_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtLb_obsLb_Backcolor ;
   private int edtLb_obsCl_Backcolor ;
   private int edtLb_diasER_Backcolor ;
   private int edtLb_FecR_Backcolor ;
   private int edtLb_FecN_Backcolor ;
   private int edtLb_FecE_Backcolor ;
   private int edtLb_NOpN_Backcolor ;
   private int edtLb_NOpE_Backcolor ;
   private int edtLb_NCoE_Backcolor ;
   private int edtLb_NOpR_Backcolor ;
   private int edtLb_NCoS_Backcolor ;
   private int edtLb_Hila_Backcolor ;
   private int edtLb_TraP6_Backcolor ;
   private int edtLb_Tra6_Backcolor ;
   private int edtLb_TraP5_Backcolor ;
   private int edtLb_Tra5_Backcolor ;
   private int edtLb_TraP4_Backcolor ;
   private int edtLb_Tra4_Backcolor ;
   private int edtLb_TraP3_Backcolor ;
   private int edtLb_Tra3_Backcolor ;
   private int edtLb_TraP2_Backcolor ;
   private int edtLb_Tra2_Backcolor ;
   private int edtLb_TraP1_Backcolor ;
   private int edtLb_Tra1_Backcolor ;
   private int edtLb_PriEns_Backcolor ;
   private int edtLb_PedCod_Backcolor ;
   private int edtLb_Pantone_Backcolor ;
   private int edtMacProDsc_Backcolor ;
   private int edtMacProCod_Backcolor ;
   private int edtLb_volum_Backcolor ;
   private int edtLb_pesom_Backcolor ;
   private int edtLb_nfibras_Backcolor ;
   private int edtTipDisDsc_Backcolor ;
   private int edtTipDisCod_Backcolor ;
   private int edtLab_desvio_Backcolor ;
   private int edtLab_DscCau_Backcolor ;
   private int edtLab_CodCau_Backcolor ;
   private int edtLb_numopu_Backcolor ;
   private int edtLb_Local_Backcolor ;
   private int edtLb_Talao_Backcolor ;
   private int edtLb_Temp3_Backcolor ;
   private int edtLb_Temp2_Backcolor ;
   private int edtLb_Tempt_Backcolor ;
   private int edtLb_IDM_Backcolor ;
   private int edtLb_RGB_Backcolor ;
   private int edtLb_impreso_Backcolor ;
   private int edtLb_TipRec_Backcolor ;
   private int edtLb_reprod_Backcolor ;
   private int edtLb_malha_Backcolor ;
   private int edtLb_cartazf_Backcolor ;
   private int edtLb_Tipo_Backcolor ;
   private int edtLb_EstEns_Backcolor ;
   private int edtLb_UltlPq_Backcolor ;
   private int edtLb_UltOp_Backcolor ;
   private int edtLb_Obs_Backcolor ;
   private int edtDscSol_Backcolor ;
   private int edtCodSol_Backcolor ;
   private int edtMatDsc_Backcolor ;
   private int edtMatCod_Backcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtLb_Rb_Backcolor ;
   private int edtLb_UsuM_Backcolor ;
   private int edtLb_HoraM_Backcolor ;
   private int edtLb_FechaM_Backcolor ;
   private int edtLb_Usuario_Backcolor ;
   private int edtLb_HoraE_Backcolor ;
   private int edtLb_FechaE_Backcolor ;
   private int edtLb_Cartaz_Backcolor ;
   private int edtLb_ColNumC_Backcolor ;
   private int edtLb_ColNomC_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtLb_ColNum_Backcolor ;
   private int edtLb_ColNom_Backcolor ;
   private int edtLb_TipArtD_Backcolor ;
   private int edtLb_TipArt_Backcolor ;
   private int edtLb_ArtDsc_Backcolor ;
   private int edtLb_ArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtLb_numero_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int gxdynajaxindex ;
   private int ZZ5532Lb_numero ;
   private int ZZ252CliCod ;
   private int ZZ5537Lb_ColNum ;
   private int ZZ5539Lb_ColNumC ;
   private int ZZ5600Lb_IDM ;
   private int ZZ8946Lb_NCoS ;
   private int ZZ8947Lb_NOpR ;
   private int ZZ8948Lb_NCoE ;
   private int ZZ8949Lb_NOpE ;
   private int ZZ8950Lb_NOpN ;
   private int ZZ8954Lb_diasER ;
   private long Z5599Lb_RGB ;
   private long A5599Lb_RGB ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ5599Lb_RGB ;
   private java.math.BigDecimal Z5547Lb_Rb ;
   private java.math.BigDecimal Z6056Lb_pesom ;
   private java.math.BigDecimal Z6057Lb_volum ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A6056Lb_pesom ;
   private java.math.BigDecimal A6057Lb_volum ;
   private java.math.BigDecimal ZZ5547Lb_Rb ;
   private java.math.BigDecimal ZZ6056Lb_pesom ;
   private java.math.BigDecimal ZZ6057Lb_volum ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5533Lb_ArtCod ;
   private String Z5534Lb_ArtDsc ;
   private String Z5552Lb_TipArtD ;
   private String Z5536Lb_ColNom ;
   private String Z5538Lb_ColNomC ;
   private String Z5540Lb_Cartaz ;
   private String Z5543Lb_Usuario ;
   private String Z5546Lb_UsuM ;
   private String Z5549Lb_UltOp ;
   private String Z5570Lb_Tipo ;
   private String Z5700Lb_Talao ;
   private String Z5701Lb_Local ;
   private String Z6546Lb_Pantone ;
   private String Z6618Lb_PedCod ;
   private String Z6644Lb_PriEns ;
   private String Z6653Lb_Tra1 ;
   private String Z6655Lb_Tra2 ;
   private String Z6657Lb_Tra3 ;
   private String Z6842Lb_Tra4 ;
   private String Z6844Lb_Tra5 ;
   private String Z6846Lb_Tra6 ;
   private String Z7780Lb_Hila ;
   private String Z1514MacProCod ;
   private String Z5098TipDisCod ;
   private String Z5553Lb_ForCod ;
   private String Z6372Lb_RecPip ;
   private String Z8621Lb_Envio ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5097TipDisDsc ;
   private String h5098TipDisCod ;
   private String A5553Lb_ForCod ;
   private String A1514MacProCod ;
   private String A5098TipDisCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_445_idx="0001" ;
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
   private String edtLb_numero_Internalname ;
   private String edtLb_numero_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtLb_ArtCod_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtLb_ArtDsc_Internalname ;
   private String A5534Lb_ArtDsc ;
   private String edtLb_ArtDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtLb_TipArt_Internalname ;
   private String edtLb_TipArt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtLb_TipArtD_Internalname ;
   private String A5552Lb_TipArtD ;
   private String edtLb_TipArtD_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtLb_ColNom_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtLb_ColNum_Internalname ;
   private String edtLb_ColNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtLb_ColNomC_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtLb_ColNumC_Internalname ;
   private String edtLb_ColNumC_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtLb_Cartaz_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtLb_FechaE_Internalname ;
   private String edtLb_FechaE_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtLb_HoraE_Internalname ;
   private String edtLb_HoraE_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtLb_Usuario_Internalname ;
   private String A5543Lb_Usuario ;
   private String edtLb_Usuario_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtLb_FechaM_Internalname ;
   private String edtLb_FechaM_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtLb_HoraM_Internalname ;
   private String edtLb_HoraM_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtLb_UsuM_Internalname ;
   private String A5546Lb_UsuM ;
   private String edtLb_UsuM_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtLb_Rb_Internalname ;
   private String edtLb_Rb_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtMatCod_Internalname ;
   private String edtMatCod_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtMatDsc_Internalname ;
   private String A627MatDsc ;
   private String edtMatDsc_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtCodSol_Internalname ;
   private String edtCodSol_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtDscSol_Internalname ;
   private String A3317DscSol ;
   private String edtDscSol_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtLb_Obs_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtLb_UltOp_Internalname ;
   private String A5549Lb_UltOp ;
   private String edtLb_UltOp_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtLb_UltlPq_Internalname ;
   private String edtLb_UltlPq_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtLb_EstEns_Internalname ;
   private String edtLb_EstEns_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtLb_Tipo_Internalname ;
   private String A5570Lb_Tipo ;
   private String edtLb_Tipo_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtLb_cartazf_Internalname ;
   private String edtLb_cartazf_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtLb_malha_Internalname ;
   private String edtLb_malha_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtLb_reprod_Internalname ;
   private String edtLb_reprod_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtLb_TipRec_Internalname ;
   private String edtLb_TipRec_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtLb_impreso_Internalname ;
   private String edtLb_impreso_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtLb_RGB_Internalname ;
   private String edtLb_RGB_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtLb_IDM_Internalname ;
   private String edtLb_IDM_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtLb_Tempt_Internalname ;
   private String edtLb_Tempt_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtLb_Temp2_Internalname ;
   private String edtLb_Temp2_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtLb_Temp3_Internalname ;
   private String edtLb_Temp3_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtLb_Talao_Internalname ;
   private String A5700Lb_Talao ;
   private String edtLb_Talao_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtLb_Local_Internalname ;
   private String A5701Lb_Local ;
   private String edtLb_Local_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtLb_numopu_Internalname ;
   private String edtLb_numopu_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtLab_CodCau_Internalname ;
   private String edtLab_CodCau_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtLab_DscCau_Internalname ;
   private String A5802Lab_DscCau ;
   private String edtLab_DscCau_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtLab_desvio_Internalname ;
   private String edtLab_desvio_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtTipDisCod_Internalname ;
   private String edtTipDisCod_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtTipDisDsc_Internalname ;
   private String edtTipDisDsc_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtLb_nfibras_Internalname ;
   private String edtLb_nfibras_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtLb_pesom_Internalname ;
   private String edtLb_pesom_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtLb_volum_Internalname ;
   private String edtLb_volum_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtMacProCod_Internalname ;
   private String edtMacProCod_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtMacProDsc_Internalname ;
   private String A1515MacProDsc ;
   private String edtMacProDsc_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtLb_Pantone_Internalname ;
   private String A6546Lb_Pantone ;
   private String edtLb_Pantone_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtLb_PedCod_Internalname ;
   private String A6618Lb_PedCod ;
   private String edtLb_PedCod_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtLb_PriEns_Internalname ;
   private String A6644Lb_PriEns ;
   private String edtLb_PriEns_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtLb_Tra1_Internalname ;
   private String A6653Lb_Tra1 ;
   private String edtLb_Tra1_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtLb_TraP1_Internalname ;
   private String edtLb_TraP1_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtLb_Tra2_Internalname ;
   private String A6655Lb_Tra2 ;
   private String edtLb_Tra2_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtLb_TraP2_Internalname ;
   private String edtLb_TraP2_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtLb_Tra3_Internalname ;
   private String A6657Lb_Tra3 ;
   private String edtLb_Tra3_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtLb_TraP3_Internalname ;
   private String edtLb_TraP3_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtLb_Tra4_Internalname ;
   private String A6842Lb_Tra4 ;
   private String edtLb_Tra4_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtLb_TraP4_Internalname ;
   private String edtLb_TraP4_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtLb_Tra5_Internalname ;
   private String A6844Lb_Tra5 ;
   private String edtLb_Tra5_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtLb_TraP5_Internalname ;
   private String edtLb_TraP5_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtLb_Tra6_Internalname ;
   private String A6846Lb_Tra6 ;
   private String edtLb_Tra6_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtLb_TraP6_Internalname ;
   private String edtLb_TraP6_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtLb_Hila_Internalname ;
   private String A7780Lb_Hila ;
   private String edtLb_Hila_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtLb_NCoS_Internalname ;
   private String edtLb_NCoS_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtLb_NOpR_Internalname ;
   private String edtLb_NOpR_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtLb_NCoE_Internalname ;
   private String edtLb_NCoE_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtLb_NOpE_Internalname ;
   private String edtLb_NOpE_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtLb_NOpN_Internalname ;
   private String edtLb_NOpN_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtLb_FecE_Internalname ;
   private String edtLb_FecE_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtLb_FecN_Internalname ;
   private String edtLb_FecN_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtLb_FecR_Internalname ;
   private String edtLb_FecR_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtLb_diasER_Internalname ;
   private String edtLb_diasER_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtLb_obsCl_Internalname ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtLb_obsLb_Internalname ;
   private String sMode818 ;
   private String edtavnRcdDeleted_818_Internalname ;
   private String edtLb_lineaPq_Internalname ;
   private String edtLb_ForCod_Internalname ;
   private String edtLb_ForDsc_Internalname ;
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
   private String sMode817 ;
   private String GXCCtl ;
   private String A5554Lb_ForDsc ;
   private String A6372Lb_RecPip ;
   private String A8621Lb_Envio ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String Z584IntDsc ;
   private String Z627MatDsc ;
   private String Z3317DscSol ;
   private String Z5802Lab_DscCau ;
   private String Z5097TipDisDsc ;
   private String Z1515MacProDsc ;
   private String sGXsfl_445_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_818_Jsonclick ;
   private String edtLb_lineaPq_Jsonclick ;
   private String edtLb_ForCod_Jsonclick ;
   private String edtLb_ForDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String gxwrpcisep ;
   private String l5097TipDisDsc ;
   private String ZZ396EmprCod ;
   private String ZZ5533Lb_ArtCod ;
   private String ZZ5534Lb_ArtDsc ;
   private String ZZ5552Lb_TipArtD ;
   private String ZZ5536Lb_ColNom ;
   private String ZZ5538Lb_ColNomC ;
   private String ZZ5540Lb_Cartaz ;
   private String ZZ5543Lb_Usuario ;
   private String ZZ5546Lb_UsuM ;
   private String ZZ5549Lb_UltOp ;
   private String ZZ5570Lb_Tipo ;
   private String ZZ5700Lb_Talao ;
   private String ZZ5701Lb_Local ;
   private String ZZ5098TipDisCod ;
   private String ZZ1514MacProCod ;
   private String ZZ6546Lb_Pantone ;
   private String ZZ6618Lb_PedCod ;
   private String ZZ6644Lb_PriEns ;
   private String ZZ6653Lb_Tra1 ;
   private String ZZ6655Lb_Tra2 ;
   private String ZZ6657Lb_Tra3 ;
   private String ZZ6842Lb_Tra4 ;
   private String ZZ6844Lb_Tra5 ;
   private String ZZ6846Lb_Tra6 ;
   private String ZZ7780Lb_Hila ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ584IntDsc ;
   private String ZZ627MatDsc ;
   private String ZZ832TipColDsc ;
   private String ZZ1515MacProDsc ;
   private String ZZ3317DscSol ;
   private String ZZ5097TipDisDsc ;
   private String ZZ5802Lab_DscCau ;
   private String Zh5098TipDisCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z5554Lb_ForDsc ;
   private java.util.Date Z5542Lb_HoraE ;
   private java.util.Date Z5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date ZZ5542Lb_HoraE ;
   private java.util.Date ZZ5545Lb_HoraM ;
   private java.util.Date Z5541Lb_FechaE ;
   private java.util.Date Z5544Lb_FechaM ;
   private java.util.Date Z5594Lb_cartazf ;
   private java.util.Date Z8951Lb_FecE ;
   private java.util.Date Z8952Lb_FecN ;
   private java.util.Date Z8953Lb_FecR ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A8951Lb_FecE ;
   private java.util.Date A8952Lb_FecN ;
   private java.util.Date A8953Lb_FecR ;
   private java.util.Date ZZ5541Lb_FechaE ;
   private java.util.Date ZZ5544Lb_FechaM ;
   private java.util.Date ZZ5594Lb_cartazf ;
   private java.util.Date ZZ8951Lb_FecE ;
   private java.util.Date ZZ8952Lb_FecN ;
   private java.util.Date ZZ8953Lb_FecR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5097TipDisDsc ;
   private boolean n583IntCod ;
   private boolean n626MatCod ;
   private boolean n831TipColCod ;
   private boolean n1514MacProCod ;
   private boolean n3316CodSol ;
   private boolean n5098TipDisCod ;
   private boolean n5801Lab_CodCau ;
   private boolean wbErr ;
   private boolean bGXsfl_445_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n3317DscSol ;
   private boolean n5802Lab_DscCau ;
   private boolean Gx_longc ;
   private String A5548Lb_Obs ;
   private String Z5548Lb_Obs ;
   private String ZZ5548Lb_Obs ;
   private String Z9900Lb_obsCl ;
   private String Z10883Lb_obsLb ;
   private String A9900Lb_obsCl ;
   private String A10883Lb_obsLb ;
   private String ZZ9900Lb_obsCl ;
   private String ZZ10883Lb_obsLb ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbLb_EstLab ;
   private ICheckbox chkLb_RecPip ;
   private ICheckbox chkLb_Envio ;
   private IDataStoreProvider pr_default ;
   private String[] T00QP15_A5548Lb_Obs ;
   private int[] T00QP15_A5532Lb_numero ;
   private String[] T00QP15_A407EmprNom ;
   private boolean[] T00QP15_n407EmprNom ;
   private String[] T00QP15_A279CliNom ;
   private String[] T00QP15_A5533Lb_ArtCod ;
   private String[] T00QP15_A5534Lb_ArtDsc ;
   private short[] T00QP15_A5535Lb_TipArt ;
   private String[] T00QP15_A5552Lb_TipArtD ;
   private String[] T00QP15_A5536Lb_ColNom ;
   private int[] T00QP15_A5537Lb_ColNum ;
   private String[] T00QP15_A832TipColDsc ;
   private boolean[] T00QP15_n832TipColDsc ;
   private String[] T00QP15_A5538Lb_ColNomC ;
   private int[] T00QP15_A5539Lb_ColNumC ;
   private String[] T00QP15_A5540Lb_Cartaz ;
   private java.util.Date[] T00QP15_A5541Lb_FechaE ;
   private java.util.Date[] T00QP15_A5542Lb_HoraE ;
   private String[] T00QP15_A5543Lb_Usuario ;
   private java.util.Date[] T00QP15_A5544Lb_FechaM ;
   private java.util.Date[] T00QP15_A5545Lb_HoraM ;
   private String[] T00QP15_A5546Lb_UsuM ;
   private java.math.BigDecimal[] T00QP15_A5547Lb_Rb ;
   private String[] T00QP15_A584IntDsc ;
   private boolean[] T00QP15_n584IntDsc ;
   private String[] T00QP15_A627MatDsc ;
   private boolean[] T00QP15_n627MatDsc ;
   private String[] T00QP15_A3317DscSol ;
   private boolean[] T00QP15_n3317DscSol ;
   private String[] T00QP15_A5549Lb_UltOp ;
   private short[] T00QP15_A5550Lb_UltlPq ;
   private byte[] T00QP15_A5569Lb_EstEns ;
   private String[] T00QP15_A5570Lb_Tipo ;
   private java.util.Date[] T00QP15_A5594Lb_cartazf ;
   private byte[] T00QP15_A5595Lb_malha ;
   private byte[] T00QP15_A5596Lb_reprod ;
   private byte[] T00QP15_A5597Lb_TipRec ;
   private byte[] T00QP15_A5598Lb_impreso ;
   private long[] T00QP15_A5599Lb_RGB ;
   private int[] T00QP15_A5600Lb_IDM ;
   private short[] T00QP15_A5601Lb_Tempt ;
   private short[] T00QP15_A5610Lb_Temp2 ;
   private short[] T00QP15_A5611Lb_Temp3 ;
   private String[] T00QP15_A5700Lb_Talao ;
   private String[] T00QP15_A5701Lb_Local ;
   private byte[] T00QP15_A5699Lb_EstLab ;
   private byte[] T00QP15_A5717Lb_numopu ;
   private String[] T00QP15_A5802Lab_DscCau ;
   private boolean[] T00QP15_n5802Lab_DscCau ;
   private short[] T00QP15_A5901Lab_desvio ;
   private String[] T00QP15_A5097TipDisDsc ;
   private boolean[] T00QP15_n5097TipDisDsc ;
   private byte[] T00QP15_A5988Lb_nfibras ;
   private java.math.BigDecimal[] T00QP15_A6056Lb_pesom ;
   private java.math.BigDecimal[] T00QP15_A6057Lb_volum ;
   private String[] T00QP15_A1515MacProDsc ;
   private String[] T00QP15_A6546Lb_Pantone ;
   private String[] T00QP15_A6618Lb_PedCod ;
   private String[] T00QP15_A6644Lb_PriEns ;
   private String[] T00QP15_A6653Lb_Tra1 ;
   private short[] T00QP15_A6654Lb_TraP1 ;
   private String[] T00QP15_A6655Lb_Tra2 ;
   private short[] T00QP15_A6656Lb_TraP2 ;
   private String[] T00QP15_A6657Lb_Tra3 ;
   private short[] T00QP15_A6658Lb_TraP3 ;
   private String[] T00QP15_A6842Lb_Tra4 ;
   private short[] T00QP15_A6843Lb_TraP4 ;
   private String[] T00QP15_A6844Lb_Tra5 ;
   private short[] T00QP15_A6845Lb_TraP5 ;
   private String[] T00QP15_A6846Lb_Tra6 ;
   private short[] T00QP15_A6847Lb_TraP6 ;
   private String[] T00QP15_A7780Lb_Hila ;
   private int[] T00QP15_A8946Lb_NCoS ;
   private int[] T00QP15_A8947Lb_NOpR ;
   private int[] T00QP15_A8948Lb_NCoE ;
   private int[] T00QP15_A8949Lb_NOpE ;
   private int[] T00QP15_A8950Lb_NOpN ;
   private java.util.Date[] T00QP15_A8951Lb_FecE ;
   private java.util.Date[] T00QP15_A8952Lb_FecN ;
   private java.util.Date[] T00QP15_A8953Lb_FecR ;
   private int[] T00QP15_A8954Lb_diasER ;
   private String[] T00QP15_A9900Lb_obsCl ;
   private String[] T00QP15_A10883Lb_obsLb ;
   private String[] T00QP15_A396EmprCod ;
   private int[] T00QP15_A252CliCod ;
   private byte[] T00QP15_A583IntCod ;
   private boolean[] T00QP15_n583IntCod ;
   private short[] T00QP15_A626MatCod ;
   private boolean[] T00QP15_n626MatCod ;
   private byte[] T00QP15_A831TipColCod ;
   private boolean[] T00QP15_n831TipColCod ;
   private String[] T00QP15_A1514MacProCod ;
   private boolean[] T00QP15_n1514MacProCod ;
   private short[] T00QP15_A3316CodSol ;
   private boolean[] T00QP15_n3316CodSol ;
   private String[] T00QP15_A5098TipDisCod ;
   private boolean[] T00QP15_n5098TipDisCod ;
   private short[] T00QP15_A5801Lab_CodCau ;
   private boolean[] T00QP15_n5801Lab_CodCau ;
   private String[] T00QP16_A5097TipDisDsc ;
   private boolean[] T00QP16_n5097TipDisDsc ;
   private String[] T00QP16_A396EmprCod ;
   private String[] T00QP16_A5098TipDisCod ;
   private boolean[] T00QP16_n5098TipDisCod ;
   private String[] T00QP17_A5097TipDisDsc ;
   private boolean[] T00QP17_n5097TipDisDsc ;
   private String[] T00QP17_A396EmprCod ;
   private String[] T00QP17_A5098TipDisCod ;
   private boolean[] T00QP17_n5098TipDisCod ;
   private String[] T00QP6_A407EmprNom ;
   private boolean[] T00QP6_n407EmprNom ;
   private String[] T00QP7_A279CliNom ;
   private String[] T00QP8_A584IntDsc ;
   private boolean[] T00QP8_n584IntDsc ;
   private String[] T00QP9_A627MatDsc ;
   private boolean[] T00QP9_n627MatDsc ;
   private String[] T00QP10_A832TipColDsc ;
   private boolean[] T00QP10_n832TipColDsc ;
   private String[] T00QP11_A1515MacProDsc ;
   private String[] T00QP12_A3317DscSol ;
   private boolean[] T00QP12_n3317DscSol ;
   private String[] T00QP13_A5097TipDisDsc ;
   private boolean[] T00QP13_n5097TipDisDsc ;
   private String[] T00QP14_A5802Lab_DscCau ;
   private boolean[] T00QP14_n5802Lab_DscCau ;
   private String[] T00QP18_A407EmprNom ;
   private boolean[] T00QP18_n407EmprNom ;
   private String[] T00QP19_A279CliNom ;
   private String[] T00QP20_A584IntDsc ;
   private boolean[] T00QP20_n584IntDsc ;
   private String[] T00QP21_A627MatDsc ;
   private boolean[] T00QP21_n627MatDsc ;
   private String[] T00QP22_A832TipColDsc ;
   private boolean[] T00QP22_n832TipColDsc ;
   private String[] T00QP23_A1515MacProDsc ;
   private String[] T00QP24_A3317DscSol ;
   private boolean[] T00QP24_n3317DscSol ;
   private String[] T00QP25_A5097TipDisDsc ;
   private boolean[] T00QP25_n5097TipDisDsc ;
   private String[] T00QP26_A5802Lab_DscCau ;
   private boolean[] T00QP26_n5802Lab_DscCau ;
   private String[] T00QP27_A396EmprCod ;
   private int[] T00QP27_A5532Lb_numero ;
   private String[] T00QP5_A5548Lb_Obs ;
   private int[] T00QP5_A5532Lb_numero ;
   private String[] T00QP5_A5533Lb_ArtCod ;
   private String[] T00QP5_A5534Lb_ArtDsc ;
   private short[] T00QP5_A5535Lb_TipArt ;
   private String[] T00QP5_A5552Lb_TipArtD ;
   private String[] T00QP5_A5536Lb_ColNom ;
   private int[] T00QP5_A5537Lb_ColNum ;
   private String[] T00QP5_A5538Lb_ColNomC ;
   private int[] T00QP5_A5539Lb_ColNumC ;
   private String[] T00QP5_A5540Lb_Cartaz ;
   private java.util.Date[] T00QP5_A5541Lb_FechaE ;
   private java.util.Date[] T00QP5_A5542Lb_HoraE ;
   private String[] T00QP5_A5543Lb_Usuario ;
   private java.util.Date[] T00QP5_A5544Lb_FechaM ;
   private java.util.Date[] T00QP5_A5545Lb_HoraM ;
   private String[] T00QP5_A5546Lb_UsuM ;
   private java.math.BigDecimal[] T00QP5_A5547Lb_Rb ;
   private String[] T00QP5_A5549Lb_UltOp ;
   private short[] T00QP5_A5550Lb_UltlPq ;
   private byte[] T00QP5_A5569Lb_EstEns ;
   private String[] T00QP5_A5570Lb_Tipo ;
   private java.util.Date[] T00QP5_A5594Lb_cartazf ;
   private byte[] T00QP5_A5595Lb_malha ;
   private byte[] T00QP5_A5596Lb_reprod ;
   private byte[] T00QP5_A5597Lb_TipRec ;
   private byte[] T00QP5_A5598Lb_impreso ;
   private long[] T00QP5_A5599Lb_RGB ;
   private int[] T00QP5_A5600Lb_IDM ;
   private short[] T00QP5_A5601Lb_Tempt ;
   private short[] T00QP5_A5610Lb_Temp2 ;
   private short[] T00QP5_A5611Lb_Temp3 ;
   private String[] T00QP5_A5700Lb_Talao ;
   private String[] T00QP5_A5701Lb_Local ;
   private byte[] T00QP5_A5699Lb_EstLab ;
   private byte[] T00QP5_A5717Lb_numopu ;
   private short[] T00QP5_A5901Lab_desvio ;
   private byte[] T00QP5_A5988Lb_nfibras ;
   private java.math.BigDecimal[] T00QP5_A6056Lb_pesom ;
   private java.math.BigDecimal[] T00QP5_A6057Lb_volum ;
   private String[] T00QP5_A6546Lb_Pantone ;
   private String[] T00QP5_A6618Lb_PedCod ;
   private String[] T00QP5_A6644Lb_PriEns ;
   private String[] T00QP5_A6653Lb_Tra1 ;
   private short[] T00QP5_A6654Lb_TraP1 ;
   private String[] T00QP5_A6655Lb_Tra2 ;
   private short[] T00QP5_A6656Lb_TraP2 ;
   private String[] T00QP5_A6657Lb_Tra3 ;
   private short[] T00QP5_A6658Lb_TraP3 ;
   private String[] T00QP5_A6842Lb_Tra4 ;
   private short[] T00QP5_A6843Lb_TraP4 ;
   private String[] T00QP5_A6844Lb_Tra5 ;
   private short[] T00QP5_A6845Lb_TraP5 ;
   private String[] T00QP5_A6846Lb_Tra6 ;
   private short[] T00QP5_A6847Lb_TraP6 ;
   private String[] T00QP5_A7780Lb_Hila ;
   private int[] T00QP5_A8946Lb_NCoS ;
   private int[] T00QP5_A8947Lb_NOpR ;
   private int[] T00QP5_A8948Lb_NCoE ;
   private int[] T00QP5_A8949Lb_NOpE ;
   private int[] T00QP5_A8950Lb_NOpN ;
   private java.util.Date[] T00QP5_A8951Lb_FecE ;
   private java.util.Date[] T00QP5_A8952Lb_FecN ;
   private java.util.Date[] T00QP5_A8953Lb_FecR ;
   private int[] T00QP5_A8954Lb_diasER ;
   private String[] T00QP5_A9900Lb_obsCl ;
   private String[] T00QP5_A10883Lb_obsLb ;
   private String[] T00QP5_A396EmprCod ;
   private int[] T00QP5_A252CliCod ;
   private byte[] T00QP5_A583IntCod ;
   private boolean[] T00QP5_n583IntCod ;
   private short[] T00QP5_A626MatCod ;
   private boolean[] T00QP5_n626MatCod ;
   private byte[] T00QP5_A831TipColCod ;
   private boolean[] T00QP5_n831TipColCod ;
   private String[] T00QP5_A1514MacProCod ;
   private boolean[] T00QP5_n1514MacProCod ;
   private short[] T00QP5_A3316CodSol ;
   private boolean[] T00QP5_n3316CodSol ;
   private String[] T00QP5_A5098TipDisCod ;
   private boolean[] T00QP5_n5098TipDisCod ;
   private short[] T00QP5_A5801Lab_CodCau ;
   private boolean[] T00QP5_n5801Lab_CodCau ;
   private String[] T00QP28_A396EmprCod ;
   private int[] T00QP28_A5532Lb_numero ;
   private String[] T00QP29_A396EmprCod ;
   private int[] T00QP29_A5532Lb_numero ;
   private String[] T00QP30_A5097TipDisDsc ;
   private boolean[] T00QP30_n5097TipDisDsc ;
   private String[] T00QP30_A396EmprCod ;
   private String[] T00QP30_A5098TipDisCod ;
   private boolean[] T00QP30_n5098TipDisCod ;
   private String[] T00QP4_A5548Lb_Obs ;
   private int[] T00QP4_A5532Lb_numero ;
   private String[] T00QP4_A5533Lb_ArtCod ;
   private String[] T00QP4_A5534Lb_ArtDsc ;
   private short[] T00QP4_A5535Lb_TipArt ;
   private String[] T00QP4_A5552Lb_TipArtD ;
   private String[] T00QP4_A5536Lb_ColNom ;
   private int[] T00QP4_A5537Lb_ColNum ;
   private String[] T00QP4_A5538Lb_ColNomC ;
   private int[] T00QP4_A5539Lb_ColNumC ;
   private String[] T00QP4_A5540Lb_Cartaz ;
   private java.util.Date[] T00QP4_A5541Lb_FechaE ;
   private java.util.Date[] T00QP4_A5542Lb_HoraE ;
   private String[] T00QP4_A5543Lb_Usuario ;
   private java.util.Date[] T00QP4_A5544Lb_FechaM ;
   private java.util.Date[] T00QP4_A5545Lb_HoraM ;
   private String[] T00QP4_A5546Lb_UsuM ;
   private java.math.BigDecimal[] T00QP4_A5547Lb_Rb ;
   private String[] T00QP4_A5549Lb_UltOp ;
   private short[] T00QP4_A5550Lb_UltlPq ;
   private byte[] T00QP4_A5569Lb_EstEns ;
   private String[] T00QP4_A5570Lb_Tipo ;
   private java.util.Date[] T00QP4_A5594Lb_cartazf ;
   private byte[] T00QP4_A5595Lb_malha ;
   private byte[] T00QP4_A5596Lb_reprod ;
   private byte[] T00QP4_A5597Lb_TipRec ;
   private byte[] T00QP4_A5598Lb_impreso ;
   private long[] T00QP4_A5599Lb_RGB ;
   private int[] T00QP4_A5600Lb_IDM ;
   private short[] T00QP4_A5601Lb_Tempt ;
   private short[] T00QP4_A5610Lb_Temp2 ;
   private short[] T00QP4_A5611Lb_Temp3 ;
   private String[] T00QP4_A5700Lb_Talao ;
   private String[] T00QP4_A5701Lb_Local ;
   private byte[] T00QP4_A5699Lb_EstLab ;
   private byte[] T00QP4_A5717Lb_numopu ;
   private short[] T00QP4_A5901Lab_desvio ;
   private byte[] T00QP4_A5988Lb_nfibras ;
   private java.math.BigDecimal[] T00QP4_A6056Lb_pesom ;
   private java.math.BigDecimal[] T00QP4_A6057Lb_volum ;
   private String[] T00QP4_A6546Lb_Pantone ;
   private String[] T00QP4_A6618Lb_PedCod ;
   private String[] T00QP4_A6644Lb_PriEns ;
   private String[] T00QP4_A6653Lb_Tra1 ;
   private short[] T00QP4_A6654Lb_TraP1 ;
   private String[] T00QP4_A6655Lb_Tra2 ;
   private short[] T00QP4_A6656Lb_TraP2 ;
   private String[] T00QP4_A6657Lb_Tra3 ;
   private short[] T00QP4_A6658Lb_TraP3 ;
   private String[] T00QP4_A6842Lb_Tra4 ;
   private short[] T00QP4_A6843Lb_TraP4 ;
   private String[] T00QP4_A6844Lb_Tra5 ;
   private short[] T00QP4_A6845Lb_TraP5 ;
   private String[] T00QP4_A6846Lb_Tra6 ;
   private short[] T00QP4_A6847Lb_TraP6 ;
   private String[] T00QP4_A7780Lb_Hila ;
   private int[] T00QP4_A8946Lb_NCoS ;
   private int[] T00QP4_A8947Lb_NOpR ;
   private int[] T00QP4_A8948Lb_NCoE ;
   private int[] T00QP4_A8949Lb_NOpE ;
   private int[] T00QP4_A8950Lb_NOpN ;
   private java.util.Date[] T00QP4_A8951Lb_FecE ;
   private java.util.Date[] T00QP4_A8952Lb_FecN ;
   private java.util.Date[] T00QP4_A8953Lb_FecR ;
   private int[] T00QP4_A8954Lb_diasER ;
   private String[] T00QP4_A9900Lb_obsCl ;
   private String[] T00QP4_A10883Lb_obsLb ;
   private String[] T00QP4_A396EmprCod ;
   private int[] T00QP4_A252CliCod ;
   private byte[] T00QP4_A583IntCod ;
   private boolean[] T00QP4_n583IntCod ;
   private short[] T00QP4_A626MatCod ;
   private boolean[] T00QP4_n626MatCod ;
   private byte[] T00QP4_A831TipColCod ;
   private boolean[] T00QP4_n831TipColCod ;
   private String[] T00QP4_A1514MacProCod ;
   private boolean[] T00QP4_n1514MacProCod ;
   private short[] T00QP4_A3316CodSol ;
   private boolean[] T00QP4_n3316CodSol ;
   private String[] T00QP4_A5098TipDisCod ;
   private boolean[] T00QP4_n5098TipDisCod ;
   private short[] T00QP4_A5801Lab_CodCau ;
   private boolean[] T00QP4_n5801Lab_CodCau ;
   private String[] T00QP34_A407EmprNom ;
   private boolean[] T00QP34_n407EmprNom ;
   private String[] T00QP35_A279CliNom ;
   private String[] T00QP36_A832TipColDsc ;
   private boolean[] T00QP36_n832TipColDsc ;
   private String[] T00QP37_A584IntDsc ;
   private boolean[] T00QP37_n584IntDsc ;
   private String[] T00QP38_A627MatDsc ;
   private boolean[] T00QP38_n627MatDsc ;
   private String[] T00QP39_A3317DscSol ;
   private boolean[] T00QP39_n3317DscSol ;
   private String[] T00QP40_A5802Lab_DscCau ;
   private boolean[] T00QP40_n5802Lab_DscCau ;
   private String[] T00QP41_A5097TipDisDsc ;
   private boolean[] T00QP41_n5097TipDisDsc ;
   private String[] T00QP42_A1515MacProDsc ;
   private String[] T00QP43_A396EmprCod ;
   private int[] T00QP43_A5532Lb_numero ;
   private String[] T00QP43_A13379LbNormaID ;
   private String[] T00QP44_A396EmprCod ;
   private int[] T00QP44_A5532Lb_numero ;
   private String[] T00QP44_A5555Lb_opcion ;
   private String[] T00QP45_A396EmprCod ;
   private int[] T00QP45_A5532Lb_numero ;
   private int[] T00QP46_A5532Lb_numero ;
   private short[] T00QP46_A5551Lb_lineaPq ;
   private String[] T00QP46_A5553Lb_ForCod ;
   private String[] T00QP46_A6372Lb_RecPip ;
   private String[] T00QP46_A8621Lb_Envio ;
   private String[] T00QP46_A396EmprCod ;
   private String[] T00QP47_A396EmprCod ;
   private int[] T00QP47_A5532Lb_numero ;
   private short[] T00QP47_A5551Lb_lineaPq ;
   private int[] T00QP3_A5532Lb_numero ;
   private short[] T00QP3_A5551Lb_lineaPq ;
   private String[] T00QP3_A5553Lb_ForCod ;
   private String[] T00QP3_A6372Lb_RecPip ;
   private String[] T00QP3_A8621Lb_Envio ;
   private String[] T00QP3_A396EmprCod ;
   private int[] T00QP2_A5532Lb_numero ;
   private short[] T00QP2_A5551Lb_lineaPq ;
   private String[] T00QP2_A5553Lb_ForCod ;
   private String[] T00QP2_A6372Lb_RecPip ;
   private String[] T00QP2_A8621Lb_Envio ;
   private String[] T00QP2_A396EmprCod ;
   private String[] T00QP51_A396EmprCod ;
   private int[] T00QP51_A5532Lb_numero ;
   private short[] T00QP51_A5551Lb_lineaPq ;
   private String[] T00QP52_A5097TipDisDsc ;
   private boolean[] T00QP52_n5097TipDisDsc ;
   private String[] T00QP53_A5097TipDisDsc ;
   private boolean[] T00QP53_n5097TipDisDsc ;
   private String[] T00QP53_A396EmprCod ;
   private String[] T00QP53_A5098TipDisCod ;
   private boolean[] T00QP53_n5098TipDisCod ;
   private String[] T00QP54_A407EmprNom ;
   private boolean[] T00QP54_n407EmprNom ;
   private String[] T00QP55_A407EmprNom ;
   private boolean[] T00QP55_n407EmprNom ;
   private String[] T00QP56_A279CliNom ;
   private String[] T00QP57_A832TipColDsc ;
   private boolean[] T00QP57_n832TipColDsc ;
   private String[] T00QP58_A584IntDsc ;
   private boolean[] T00QP58_n584IntDsc ;
   private String[] T00QP59_A627MatDsc ;
   private boolean[] T00QP59_n627MatDsc ;
   private String[] T00QP60_A3317DscSol ;
   private boolean[] T00QP60_n3317DscSol ;
   private String[] T00QP61_A5802Lab_DscCau ;
   private boolean[] T00QP61_n5802Lab_DscCau ;
   private String[] T00QP62_A5097TipDisDsc ;
   private boolean[] T00QP62_n5097TipDisDsc ;
   private String[] T00QP62_A396EmprCod ;
   private String[] T00QP62_A5098TipDisCod ;
   private boolean[] T00QP62_n5098TipDisCod ;
   private String[] T00QP63_A5097TipDisDsc ;
   private boolean[] T00QP63_n5097TipDisDsc ;
   private String[] T00QP64_A1515MacProDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tens000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00QP2", "SELECT Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio, EmprCod FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?  FOR UPDATE OF Lb_ForCod, Lb_RecPip, Lb_Envio NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP3", "SELECT Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio, EmprCod FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP4", "SELECT Lb_Obs, Lb_numero, Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_TipArtD, Lb_ColNom, Lb_ColNum, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, Lb_UltOp, Lb_UltlPq, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_Talao, Lb_Local, Lb_EstLab, Lb_numopu, Lab_desvio, Lb_nfibras, Lb_pesom, Lb_volum, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, EmprCod, CliCod, IntCod, MatCod, TipColCod, MacProCod, CodSol, TipDisCod, Lab_CodCau FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ?  FOR UPDATE OF Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_TipArtD, Lb_ColNom, Lb_ColNum, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, Lb_Obs, Lb_UltOp, Lb_UltlPq, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_Talao, Lb_Local, Lb_EstLab, Lb_numopu, Lab_desvio, Lb_nfibras, Lb_pesom, Lb_volum, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, CliCod, IntCod, MatCod, TipColCod, MacProCod, CodSol, TipDisCod, Lab_CodCau NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP5", "SELECT Lb_Obs, Lb_numero, Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_TipArtD, Lb_ColNom, Lb_ColNum, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, Lb_UltOp, Lb_UltlPq, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_Talao, Lb_Local, Lb_EstLab, Lb_numopu, Lab_desvio, Lb_nfibras, Lb_pesom, Lb_volum, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, EmprCod, CliCod, IntCod, MatCod, TipColCod, MacProCod, CodSol, TipDisCod, Lab_CodCau FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP8", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP9", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP10", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP11", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP12", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP13", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP14", "SELECT Lab_DscCau FROM TXPCAUDES WHERE EmprCod = ? AND Lab_CodCau = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP15", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_Obs, TM1.Lb_numero, T2.EmprNom, T3.CliNom, TM1.Lb_ArtCod, TM1.Lb_ArtDsc, TM1.Lb_TipArt, TM1.Lb_TipArtD, TM1.Lb_ColNom, TM1.Lb_ColNum, T4.TipColDsc, TM1.Lb_ColNomC, TM1.Lb_ColNumC, TM1.Lb_Cartaz, TM1.Lb_FechaE, TM1.Lb_HoraE, TM1.Lb_Usuario, TM1.Lb_FechaM, TM1.Lb_HoraM, TM1.Lb_UsuM, TM1.Lb_Rb, T5.IntDsc, T6.MatDsc, T7.DscSol, TM1.Lb_UltOp, TM1.Lb_UltlPq, TM1.Lb_EstEns, TM1.Lb_Tipo, TM1.Lb_cartazf, TM1.Lb_malha, TM1.Lb_reprod, TM1.Lb_TipRec, TM1.Lb_impreso, TM1.Lb_RGB, TM1.Lb_IDM, TM1.Lb_Tempt, TM1.Lb_Temp2, TM1.Lb_Temp3, TM1.Lb_Talao, TM1.Lb_Local, TM1.Lb_EstLab, TM1.Lb_numopu, T8.Lab_DscCau, TM1.Lab_desvio, T9.TipDisDsc, TM1.Lb_nfibras, TM1.Lb_pesom, TM1.Lb_volum, T10.MacProDsc, TM1.Lb_Pantone, TM1.Lb_PedCod, TM1.Lb_PriEns, TM1.Lb_Tra1, TM1.Lb_TraP1, TM1.Lb_Tra2, TM1.Lb_TraP2, TM1.Lb_Tra3, TM1.Lb_TraP3, TM1.Lb_Tra4, TM1.Lb_TraP4, TM1.Lb_Tra5, TM1.Lb_TraP5, TM1.Lb_Tra6, TM1.Lb_TraP6, TM1.Lb_Hila, TM1.Lb_NCoS, TM1.Lb_NOpR, TM1.Lb_NCoE, TM1.Lb_NOpE, TM1.Lb_NOpN, TM1.Lb_FecE, TM1.Lb_FecN, TM1.Lb_FecR, TM1.Lb_diasER, TM1.Lb_obsCl, TM1.Lb_obsLb, TM1.EmprCod, TM1.CliCod, TM1.IntCod, TM1.MatCod, TM1.TipColCod, TM1.MacProCod, TM1.CodSol, TM1.TipDisCod, TM1.Lab_CodCau FROM (((((((((TXPENS001 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipColCod = TM1.TipColCod) LEFT JOIN TXPINTENS T5 ON T5.EmprCod = TM1.EmprCod AND T5.IntCod = TM1.IntCod) LEFT JOIN TXPMATICE T6 ON T6.EmprCod = TM1.EmprCod AND T6.MatCod = TM1.MatCod) LEFT JOIN TXPSOLIDE T7 ON T7.EmprCod = TM1.EmprCod AND T7.CodSol = TM1.CodSol) LEFT JOIN TXPCAUDES T8 ON T8.EmprCod = TM1.EmprCod AND T8.Lab_CodCau = TM1.Lab_CodCau) LEFT JOIN TXPTIPDIS T9 ON T9.EmprCod = TM1.EmprCod AND T9.TipDisCod = TM1.TipDisCod) LEFT JOIN TXPCMACPR T10 ON T10.EmprCod = TM1.EmprCod AND T10.MacProCod = TM1.MacProCod) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? ORDER BY TM1.EmprCod, TM1.Lb_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP16", "SELECT /*+ FIRST_ROWS */ TipDisDsc, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (TipDisDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP17", "SELECT /*+ FIRST_ROWS */ TipDisDsc, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (TipDisDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP20", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP21", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP22", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP23", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP24", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP25", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP26", "SELECT Lab_DscCau FROM TXPCAUDES WHERE EmprCod = ? AND Lab_CodCau = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP27", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP28", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE ( EmprCod > ? or EmprCod = ? and Lb_numero > ?) ORDER BY EmprCod, Lb_numero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QP29", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE ( EmprCod < ? or EmprCod = ? and Lb_numero < ?) ORDER BY EmprCod DESC, Lb_numero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QP30", "SELECT /*+ FIRST_ROWS */ TipDisDsc, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (TipDisDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00QP31", "INSERT INTO TXPENS001(Lb_numero, Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_TipArtD, Lb_ColNom, Lb_ColNum, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, Lb_Obs, Lb_UltOp, Lb_UltlPq, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_Talao, Lb_Local, Lb_EstLab, Lb_numopu, Lab_desvio, Lb_nfibras, Lb_pesom, Lb_volum, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, EmprCod, CliCod, IntCod, MatCod, TipColCod, MacProCod, CodSol, TipDisCod, Lab_CodCau, Lb_staLb, Lb_PquiID, Lb_PrecioP, Lb_Branco1, Lb_Gots, Lb_WebCode, Lb_CliDest, IluminaID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', ' ', ' ', 0, 0)", GX_NOMASK, "TXPENS001")
         ,new UpdateCursor("T00QP32", "UPDATE TXPENS001 SET Lb_ArtCod=?, Lb_ArtDsc=?, Lb_TipArt=?, Lb_TipArtD=?, Lb_ColNom=?, Lb_ColNum=?, Lb_ColNomC=?, Lb_ColNumC=?, Lb_Cartaz=?, Lb_FechaE=?, Lb_HoraE=?, Lb_Usuario=?, Lb_FechaM=?, Lb_HoraM=?, Lb_UsuM=?, Lb_Rb=?, Lb_Obs=?, Lb_UltOp=?, Lb_UltlPq=?, Lb_EstEns=?, Lb_Tipo=?, Lb_cartazf=?, Lb_malha=?, Lb_reprod=?, Lb_TipRec=?, Lb_impreso=?, Lb_RGB=?, Lb_IDM=?, Lb_Tempt=?, Lb_Temp2=?, Lb_Temp3=?, Lb_Talao=?, Lb_Local=?, Lb_EstLab=?, Lb_numopu=?, Lab_desvio=?, Lb_nfibras=?, Lb_pesom=?, Lb_volum=?, Lb_Pantone=?, Lb_PedCod=?, Lb_PriEns=?, Lb_Tra1=?, Lb_TraP1=?, Lb_Tra2=?, Lb_TraP2=?, Lb_Tra3=?, Lb_TraP3=?, Lb_Tra4=?, Lb_TraP4=?, Lb_Tra5=?, Lb_TraP5=?, Lb_Tra6=?, Lb_TraP6=?, Lb_Hila=?, Lb_NCoS=?, Lb_NOpR=?, Lb_NCoE=?, Lb_NOpE=?, Lb_NOpN=?, Lb_FecE=?, Lb_FecN=?, Lb_FecR=?, Lb_diasER=?, Lb_obsCl=?, Lb_obsLb=?, CliCod=?, IntCod=?, MatCod=?, TipColCod=?, MacProCod=?, CodSol=?, TipDisCod=?, Lab_CodCau=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK, "TXPENS001")
         ,new UpdateCursor("T00QP33", "DELETE FROM TXPENS001  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK, "TXPENS001")
         ,new ForEachCursor("T00QP34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP35", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP36", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP37", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP38", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP39", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP40", "SELECT Lab_DscCau FROM TXPCAUDES WHERE EmprCod = ? AND Lab_CodCau = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP41", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP42", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP43", "SELECT * FROM (SELECT EmprCod, Lb_numero, LbNormaID FROM TXPLBDNOR WHERE EmprCod = ? AND Lb_numero = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QP44", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QP45", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero FROM TXPENS001 ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP46", "SELECT Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio, EmprCod FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? and Lb_lineaPq = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP47", "SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00QP48", "INSERT INTO TXPENS000(Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS000")
         ,new UpdateCursor("T00QP49", "UPDATE TXPENS000 SET Lb_ForCod=?, Lb_RecPip=?, Lb_Envio=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?", GX_NOMASK, "TXPENS000")
         ,new UpdateCursor("T00QP50", "DELETE FROM TXPENS000  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?", GX_NOMASK, "TXPENS000")
         ,new ForEachCursor("T00QP51", "SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP52", "SELECT * FROM (SELECT DISTINCT TipDisDsc FROM TXPTIPDIS WHERE (EmprCod = ?) AND (UPPER(TipDisDsc) like '%' || UPPER(?)) ORDER BY TipDisDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP53", "SELECT TipDisDsc, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (TipDisDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP54", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP55", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP56", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP57", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP58", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP59", "SELECT MatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP60", "SELECT DscSol FROM TXPSOLIDE WHERE EmprCod = ? AND CodSol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP61", "SELECT Lab_DscCau FROM TXPCAUDES WHERE EmprCod = ? AND Lab_CodCau = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP62", "SELECT /*+ FIRST_ROWS */ TipDisDsc, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (TipDisDsc = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP63", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QP64", "SELECT MacProDsc FROM TXPCMACPR WHERE EmprCod = ? AND MacProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(13));
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((byte[]) buf[26])[0] = rslt.getByte(27);
               ((long[]) buf[27])[0] = rslt.getLong(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 20);
               ((String[]) buf[33])[0] = rslt.getString(34, 10);
               ((byte[]) buf[34])[0] = rslt.getByte(35);
               ((byte[]) buf[35])[0] = rslt.getByte(36);
               ((short[]) buf[36])[0] = rslt.getShort(37);
               ((byte[]) buf[37])[0] = rslt.getByte(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,3);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[40])[0] = rslt.getString(41, 100);
               ((String[]) buf[41])[0] = rslt.getString(42, 50);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((String[]) buf[43])[0] = rslt.getString(44, 4);
               ((short[]) buf[44])[0] = rslt.getShort(45);
               ((String[]) buf[45])[0] = rslt.getString(46, 4);
               ((short[]) buf[46])[0] = rslt.getShort(47);
               ((String[]) buf[47])[0] = rslt.getString(48, 4);
               ((short[]) buf[48])[0] = rslt.getShort(49);
               ((String[]) buf[49])[0] = rslt.getString(50, 4);
               ((short[]) buf[50])[0] = rslt.getShort(51);
               ((String[]) buf[51])[0] = rslt.getString(52, 4);
               ((short[]) buf[52])[0] = rslt.getShort(53);
               ((String[]) buf[53])[0] = rslt.getString(54, 4);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((String[]) buf[55])[0] = rslt.getString(56, 20);
               ((int[]) buf[56])[0] = rslt.getInt(57);
               ((int[]) buf[57])[0] = rslt.getInt(58);
               ((int[]) buf[58])[0] = rslt.getInt(59);
               ((int[]) buf[59])[0] = rslt.getInt(60);
               ((int[]) buf[60])[0] = rslt.getInt(61);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(62);
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDate(63);
               ((java.util.Date[]) buf[63])[0] = rslt.getGXDate(64);
               ((int[]) buf[64])[0] = rslt.getInt(65);
               ((String[]) buf[65])[0] = rslt.getVarchar(66);
               ((String[]) buf[66])[0] = rslt.getVarchar(67);
               ((String[]) buf[67])[0] = rslt.getString(68, 3);
               ((int[]) buf[68])[0] = rslt.getInt(69);
               ((byte[]) buf[69])[0] = rslt.getByte(70);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(71);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((byte[]) buf[73])[0] = rslt.getByte(72);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(73, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(74);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(76);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(13));
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((byte[]) buf[26])[0] = rslt.getByte(27);
               ((long[]) buf[27])[0] = rslt.getLong(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 20);
               ((String[]) buf[33])[0] = rslt.getString(34, 10);
               ((byte[]) buf[34])[0] = rslt.getByte(35);
               ((byte[]) buf[35])[0] = rslt.getByte(36);
               ((short[]) buf[36])[0] = rslt.getShort(37);
               ((byte[]) buf[37])[0] = rslt.getByte(38);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,3);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[40])[0] = rslt.getString(41, 100);
               ((String[]) buf[41])[0] = rslt.getString(42, 50);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((String[]) buf[43])[0] = rslt.getString(44, 4);
               ((short[]) buf[44])[0] = rslt.getShort(45);
               ((String[]) buf[45])[0] = rslt.getString(46, 4);
               ((short[]) buf[46])[0] = rslt.getShort(47);
               ((String[]) buf[47])[0] = rslt.getString(48, 4);
               ((short[]) buf[48])[0] = rslt.getShort(49);
               ((String[]) buf[49])[0] = rslt.getString(50, 4);
               ((short[]) buf[50])[0] = rslt.getShort(51);
               ((String[]) buf[51])[0] = rslt.getString(52, 4);
               ((short[]) buf[52])[0] = rslt.getShort(53);
               ((String[]) buf[53])[0] = rslt.getString(54, 4);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((String[]) buf[55])[0] = rslt.getString(56, 20);
               ((int[]) buf[56])[0] = rslt.getInt(57);
               ((int[]) buf[57])[0] = rslt.getInt(58);
               ((int[]) buf[58])[0] = rslt.getInt(59);
               ((int[]) buf[59])[0] = rslt.getInt(60);
               ((int[]) buf[60])[0] = rslt.getInt(61);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(62);
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDate(63);
               ((java.util.Date[]) buf[63])[0] = rslt.getGXDate(64);
               ((int[]) buf[64])[0] = rslt.getInt(65);
               ((String[]) buf[65])[0] = rslt.getVarchar(66);
               ((String[]) buf[66])[0] = rslt.getVarchar(67);
               ((String[]) buf[67])[0] = rslt.getString(68, 3);
               ((int[]) buf[68])[0] = rslt.getInt(69);
               ((byte[]) buf[69])[0] = rslt.getByte(70);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(71);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((byte[]) buf[73])[0] = rslt.getByte(72);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(73, 6);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(74);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(76);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 20);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[17])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((String[]) buf[18])[0] = rslt.getString(17, 10);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(18);
               ((java.util.Date[]) buf[20])[0] = GXutil.resetDate(rslt.getGXDateTime(19));
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[23])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 1);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((String[]) buf[32])[0] = rslt.getString(28, 1);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(29);
               ((byte[]) buf[34])[0] = rslt.getByte(30);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((byte[]) buf[36])[0] = rslt.getByte(32);
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((long[]) buf[38])[0] = rslt.getLong(34);
               ((int[]) buf[39])[0] = rslt.getInt(35);
               ((short[]) buf[40])[0] = rslt.getShort(36);
               ((short[]) buf[41])[0] = rslt.getShort(37);
               ((short[]) buf[42])[0] = rslt.getShort(38);
               ((String[]) buf[43])[0] = rslt.getString(39, 20);
               ((String[]) buf[44])[0] = rslt.getString(40, 10);
               ((byte[]) buf[45])[0] = rslt.getByte(41);
               ((byte[]) buf[46])[0] = rslt.getByte(42);
               ((String[]) buf[47])[0] = rslt.getString(43, 40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(44);
               ((String[]) buf[50])[0] = rslt.getString(45, 30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(46);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(47,3);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(48,2);
               ((String[]) buf[55])[0] = rslt.getString(49, 20);
               ((String[]) buf[56])[0] = rslt.getString(50, 100);
               ((String[]) buf[57])[0] = rslt.getString(51, 50);
               ((String[]) buf[58])[0] = rslt.getString(52, 1);
               ((String[]) buf[59])[0] = rslt.getString(53, 4);
               ((short[]) buf[60])[0] = rslt.getShort(54);
               ((String[]) buf[61])[0] = rslt.getString(55, 4);
               ((short[]) buf[62])[0] = rslt.getShort(56);
               ((String[]) buf[63])[0] = rslt.getString(57, 4);
               ((short[]) buf[64])[0] = rslt.getShort(58);
               ((String[]) buf[65])[0] = rslt.getString(59, 4);
               ((short[]) buf[66])[0] = rslt.getShort(60);
               ((String[]) buf[67])[0] = rslt.getString(61, 4);
               ((short[]) buf[68])[0] = rslt.getShort(62);
               ((String[]) buf[69])[0] = rslt.getString(63, 4);
               ((short[]) buf[70])[0] = rslt.getShort(64);
               ((String[]) buf[71])[0] = rslt.getString(65, 20);
               ((int[]) buf[72])[0] = rslt.getInt(66);
               ((int[]) buf[73])[0] = rslt.getInt(67);
               ((int[]) buf[74])[0] = rslt.getInt(68);
               ((int[]) buf[75])[0] = rslt.getInt(69);
               ((int[]) buf[76])[0] = rslt.getInt(70);
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDate(71);
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDate(72);
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDate(73);
               ((int[]) buf[80])[0] = rslt.getInt(74);
               ((String[]) buf[81])[0] = rslt.getVarchar(75);
               ((String[]) buf[82])[0] = rslt.getVarchar(76);
               ((String[]) buf[83])[0] = rslt.getString(77, 3);
               ((int[]) buf[84])[0] = rslt.getInt(78);
               ((byte[]) buf[85])[0] = rslt.getByte(79);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((byte[]) buf[89])[0] = rslt.getByte(81);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(82, 6);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(83);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((short[]) buf[97])[0] = rslt.getShort(85);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
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
            case 7 :
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
            case 8 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setString(2, (String)parms[2], 1);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 20);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDateTime(12, (java.util.Date)parms[11], true);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setDateTime(15, (java.util.Date)parms[14], true);
               stmt.setString(16, (String)parms[15], 10);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setLongVarchar(18, (String)parms[17], false);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setString(22, (String)parms[21], 1);
               stmt.setDate(23, (java.util.Date)parms[22]);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setLong(28, ((Number) parms[27]).longValue());
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setShort(32, ((Number) parms[31]).shortValue());
               stmt.setString(33, (String)parms[32], 20);
               stmt.setString(34, (String)parms[33], 10);
               stmt.setByte(35, ((Number) parms[34]).byteValue());
               stmt.setByte(36, ((Number) parms[35]).byteValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setByte(38, ((Number) parms[37]).byteValue());
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 3);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setString(41, (String)parms[40], 100);
               stmt.setString(42, (String)parms[41], 50);
               stmt.setString(43, (String)parms[42], 1);
               stmt.setString(44, (String)parms[43], 4);
               stmt.setShort(45, ((Number) parms[44]).shortValue());
               stmt.setString(46, (String)parms[45], 4);
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setString(48, (String)parms[47], 4);
               stmt.setShort(49, ((Number) parms[48]).shortValue());
               stmt.setString(50, (String)parms[49], 4);
               stmt.setShort(51, ((Number) parms[50]).shortValue());
               stmt.setString(52, (String)parms[51], 4);
               stmt.setShort(53, ((Number) parms[52]).shortValue());
               stmt.setString(54, (String)parms[53], 4);
               stmt.setShort(55, ((Number) parms[54]).shortValue());
               stmt.setString(56, (String)parms[55], 20);
               stmt.setInt(57, ((Number) parms[56]).intValue());
               stmt.setInt(58, ((Number) parms[57]).intValue());
               stmt.setInt(59, ((Number) parms[58]).intValue());
               stmt.setInt(60, ((Number) parms[59]).intValue());
               stmt.setInt(61, ((Number) parms[60]).intValue());
               stmt.setDate(62, (java.util.Date)parms[61]);
               stmt.setDate(63, (java.util.Date)parms[62]);
               stmt.setDate(64, (java.util.Date)parms[63]);
               stmt.setInt(65, ((Number) parms[64]).intValue());
               stmt.setVarchar(66, (String)parms[65], 300, false);
               stmt.setVarchar(67, (String)parms[66], 300, false);
               stmt.setString(68, (String)parms[67], 3);
               stmt.setInt(69, ((Number) parms[68]).intValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(70, ((Number) parms[70]).byteValue());
               }
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
                  stmt.setByte(72, ((Number) parms[74]).byteValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[76], 6);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[78]).shortValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(76, ((Number) parms[82]).shortValue());
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
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDateTime(11, (java.util.Date)parms[10], true);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDateTime(14, (java.util.Date)parms[13], true);
               stmt.setString(15, (String)parms[14], 10);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setLongVarchar(17, (String)parms[16], false);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setString(21, (String)parms[20], 1);
               stmt.setDate(22, (java.util.Date)parms[21]);
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setLong(27, ((Number) parms[26]).longValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setString(32, (String)parms[31], 20);
               stmt.setString(33, (String)parms[32], 10);
               stmt.setByte(34, ((Number) parms[33]).byteValue());
               stmt.setByte(35, ((Number) parms[34]).byteValue());
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setByte(37, ((Number) parms[36]).byteValue());
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 3);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 2);
               stmt.setString(40, (String)parms[39], 100);
               stmt.setString(41, (String)parms[40], 50);
               stmt.setString(42, (String)parms[41], 1);
               stmt.setString(43, (String)parms[42], 4);
               stmt.setShort(44, ((Number) parms[43]).shortValue());
               stmt.setString(45, (String)parms[44], 4);
               stmt.setShort(46, ((Number) parms[45]).shortValue());
               stmt.setString(47, (String)parms[46], 4);
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setString(49, (String)parms[48], 4);
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setString(51, (String)parms[50], 4);
               stmt.setShort(52, ((Number) parms[51]).shortValue());
               stmt.setString(53, (String)parms[52], 4);
               stmt.setShort(54, ((Number) parms[53]).shortValue());
               stmt.setString(55, (String)parms[54], 20);
               stmt.setInt(56, ((Number) parms[55]).intValue());
               stmt.setInt(57, ((Number) parms[56]).intValue());
               stmt.setInt(58, ((Number) parms[57]).intValue());
               stmt.setInt(59, ((Number) parms[58]).intValue());
               stmt.setInt(60, ((Number) parms[59]).intValue());
               stmt.setDate(61, (java.util.Date)parms[60]);
               stmt.setDate(62, (java.util.Date)parms[61]);
               stmt.setDate(63, (java.util.Date)parms[62]);
               stmt.setInt(64, ((Number) parms[63]).intValue());
               stmt.setVarchar(65, (String)parms[64], 300, false);
               stmt.setVarchar(66, (String)parms[65], 300, false);
               stmt.setInt(67, ((Number) parms[66]).intValue());
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(68, ((Number) parms[68]).byteValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(70, ((Number) parms[72]).byteValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[74], 6);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[76]).shortValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[80]).shortValue());
               }
               stmt.setString(75, (String)parms[81], 3);
               stmt.setInt(76, ((Number) parms[82]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 46 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
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
      }
   }

}

