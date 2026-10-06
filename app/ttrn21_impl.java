package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn21_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = httpContext.GetPar( "SerEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = httpContext.GetPar( "ColCom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = httpContext.GetPar( "ColFon") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A252CliCod, A2141SerEst, A1013DibCli, A1014DibInt, A2074ColCom, A2078ColFon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = httpContext.GetPar( "SerEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = httpContext.GetPar( "ColCom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = httpContext.GetPar( "ColFon") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A252CliCod, A2141SerEst, A1013DibCli, A1014DibInt, A2074ColCom, A2078ColFon, A2098MolCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = httpContext.GetPar( "SerEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = httpContext.GetPar( "ColCom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = httpContext.GetPar( "ColFon") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A252CliCod, A2141SerEst, A1013DibCli, A1014DibInt, A2074ColCom, A2078ColFon, A2098MolCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2107PasCod = httpContext.GetPar( "PasCod") ;
         n2107PasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A2107PasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A2144UniEstCod = httpContext.GetPar( "UniEstCod") ;
         n2144UniEstCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A2144UniEstCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Formulas Estampacion (PASTAS)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
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

   public ttrn21_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn21_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn21_impl.class ));
   }

   public ttrn21_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn21.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSerEst_Internalname, GXutil.rtrim( A2141SerEst), GXutil.rtrim( localUtil.format( A2141SerEst, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSerEst_Jsonclick, 0, "", "", "", "", "", 1, edtSerEst_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Combinacion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColCom_Internalname, GXutil.rtrim( A2074ColCom), GXutil.rtrim( localUtil.format( A2074ColCom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColCom_Jsonclick, 0, "", "", "", "", "", 1, edtColCom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fondo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColFon_Internalname, GXutil.rtrim( A2078ColFon), GXutil.rtrim( localUtil.format( A2078ColFon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColFon_Jsonclick, 0, "", "", "", "", "", 1, edtColFon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo de Molde", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMolCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMolCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMolCod_Jsonclick, 0, "", "", "", "", "", 1, edtMolCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Total Pastas por Molde", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotPasFor_Internalname, GXutil.ltrim( localUtil.ntoc( A2142TotPasFor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotPasFor_Enabled!=0) ? localUtil.format( A2142TotPasFor, "ZZZZZ9.99") : localUtil.format( A2142TotPasFor, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotPasFor_Jsonclick, 0, "", "", "", "", "", 1, edtTotPasFor_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultima Linea Pastas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPasForUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPasForUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2655PasForUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2655PasForUL), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPasForUL_Jsonclick, 0, "", "", "", "", "", 1, edtPasForUL_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Total Partes Pastas(formula)", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotParPas_Internalname, GXutil.ltrim( localUtil.ntoc( A6042TotParPas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotParPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6042TotParPas), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6042TotParPas), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotParPas_Jsonclick, 0, "", "", "", "", "", 1, edtTotParPas_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Total Color por Molde-Formula", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotColMol_Internalname, GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotColMol_Enabled!=0) ? localUtil.format( A6047TotColMol, "ZZZZZZ9.99") : localUtil.format( A6047TotColMol, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotColMol_Jsonclick, 0, "", "", "", "", "", 1, edtTotColMol_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Pesada Minima", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMolPesMin_Internalname, GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMolPesMin_Enabled!=0) ? localUtil.format( A2650MolPesMin, "ZZZZZ9.99") : localUtil.format( A2650MolPesMin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMolPesMin_Jsonclick, 0, "", "", "", "", "", 1, edtMolPesMin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Total Suma Pasta Partes", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotPasForP_Internalname, GXutil.ltrim( localUtil.ntoc( A6048TotPasForP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotPasForP_Enabled!=0) ? localUtil.format( A6048TotPasForP, "ZZZZZ9.99") : localUtil.format( A6048TotPasForP, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotPasForP_Jsonclick, 0, "", "", "", "", "", 1, edtTotPasForP_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn21.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount581 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_581 = (short)(1) ;
            scanStart1LZ581( ) ;
            while ( RcdFound581 != 0 )
            {
               init_level_properties581( ) ;
               getByPrimaryKey1LZ581( ) ;
               addRow1LZ581( ) ;
               scanNext1LZ581( ) ;
            }
            scanEnd1LZ581( ) ;
            nBlankRcdCount581 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6048TotPasForP = A6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         B6042TotParPas = A6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         B2142TotPasFor = A2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         standaloneNotModal1LZ581( ) ;
         standaloneModal1LZ581( ) ;
         sMode581 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow1LZ581( ) ;
            edtavnRcdDeleted_581_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_581_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_581_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_581_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCAN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCan_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORPRE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForPre_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForSob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORSOB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForSob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForSob_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCON_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCon_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORPAR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForPar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForFCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORFCAN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForFCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForFCan_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForFRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORFREA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForFRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForFRea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtPasForCanP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCANP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForCanP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCanP_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_581 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LZ581( ) ;
            }
            sendRow1LZ581( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6048TotPasForP = B6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         A6042TotParPas = B6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A2142TotPasFor = B2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount581 = (short)(5) ;
         nRcdExists_581 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LZ581( ) ;
            while ( RcdFound581 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_100581( ) ;
               init_level_properties581( ) ;
               standaloneNotModal1LZ581( ) ;
               getByPrimaryKey1LZ581( ) ;
               standaloneModal1LZ581( ) ;
               addRow1LZ581( ) ;
               scanNext1LZ581( ) ;
            }
            scanEnd1LZ581( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode581 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_100581( ) ;
      initAll1LZ581( ) ;
      init_level_properties581( ) ;
      B6048TotPasForP = A6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      B6042TotParPas = A6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      B2142TotPasFor = A2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      nRcdExists_581 = (short)(0) ;
      nIsMod_581 = (short)(0) ;
      nRcdDeleted_581 = (short)(0) ;
      nBlankRcdCount581 = (short)(nBlankRcdUsr581+nBlankRcdCount581) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount581 > 0 )
      {
         standaloneNotModal1LZ581( ) ;
         standaloneModal1LZ581( ) ;
         addRow1LZ581( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPasForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount581 = (short)(nBlankRcdCount581-1) ;
      }
      Gx_mode = sMode581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6048TotPasForP = B6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      A6042TotParPas = B6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      A2142TotPasFor = B2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn21.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn21.htm");
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
      e111LZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2141SerEst = httpContext.cgiGet( "Z2141SerEst") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2074ColCom = httpContext.cgiGet( "Z2074ColCom") ;
            Z2078ColFon = httpContext.cgiGet( "Z2078ColFon") ;
            Z2098MolCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2098MolCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2655PasForUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z2655PasForUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2650MolPesMin = localUtil.ctond( httpContext.cgiGet( "Z2650MolPesMin")) ;
            O6048TotPasForP = localUtil.ctond( httpContext.cgiGet( "O6048TotPasForP")) ;
            O6042TotParPas = (byte)(localUtil.ctol( httpContext.cgiGet( "O6042TotParPas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O2142TotPasFor = localUtil.ctond( httpContext.cgiGet( "O2142TotPasFor")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A2141SerEst = httpContext.cgiGet( edtSerEst_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1014DibInt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            else
            {
               A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            A2074ColCom = httpContext.cgiGet( edtColCom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = httpContext.cgiGet( edtColFon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMolCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2098MolCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
            }
            else
            {
               A2098MolCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A2142TotPasFor = localUtil.ctond( httpContext.cgiGet( edtTotPasFor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PASFORUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPasForUL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2655PasForUL = (short)(0) ;
               n2655PasForUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2655PasForUL), 3, 0));
            }
            else
            {
               A2655PasForUL = (short)(localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2655PasForUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2655PasForUL), 3, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A6042TotParPas = (byte)(localUtil.ctol( httpContext.cgiGet( edtTotParPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            A6047TotColMol = localUtil.ctond( httpContext.cgiGet( edtTotColMol_Internalname)) ;
            n6047TotColMol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MOLPESMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMolPesMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2650MolPesMin = DecimalUtil.ZERO ;
               n2650MolPesMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrimstr( A2650MolPesMin, 9, 2));
            }
            else
            {
               A2650MolPesMin = localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)) ;
               n2650MolPesMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrimstr( A2650MolPesMin, 9, 2));
            }
            A6048TotPasForP = localUtil.ctond( httpContext.cgiGet( edtTotPasForP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2141SerEst = httpContext.GetPar( "SerEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A2074ColCom = httpContext.GetPar( "ColCom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
               A2078ColFon = httpContext.GetPar( "ColFon") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
               A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
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
                        e111LZ2 ();
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
            initAll1LZ557( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_581_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_581_Enabled), 5, 0), !bGXsfl_100_Refreshing);
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
      disableAttributes1LZ557( ) ;
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

   public void confirm_1LZ0( )
   {
      beforeValidate1LZ557( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LZ557( ) ;
         }
         else
         {
            checkExtendedTable1LZ557( ) ;
            if ( AnyError == 0 )
            {
               zm1LZ557( 7) ;
               zm1LZ557( 8) ;
               zm1LZ557( 9) ;
               zm1LZ557( 10) ;
               zm1LZ557( 11) ;
            }
            closeExtendedTableCursors1LZ557( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode557 = Gx_mode ;
         confirm_1LZ581( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode557 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LZ0( ) ;
      }
   }

   public void confirm_1LZ581( )
   {
      s6048TotPasForP = O6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      s6042TotParPas = O6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      s2142TotPasFor = O2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1LZ581( ) ;
         if ( ( nRcdExists_581 != 0 ) || ( nIsMod_581 != 0 ) )
         {
            getKey1LZ581( ) ;
            if ( ( nRcdExists_581 == 0 ) && ( nRcdDeleted_581 == 0 ) )
            {
               if ( RcdFound581 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LZ581( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LZ581( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1LZ581( 13) ;
                        zm1LZ581( 14) ;
                     }
                     closeExtendedTableCursors1LZ581( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6048TotPasForP = A6048TotPasForP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
                     O6042TotParPas = A6042TotParPas ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
                     O2142TotPasFor = A2142TotPasFor ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "PASFORLIN_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPasForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound581 != 0 )
               {
                  if ( nRcdDeleted_581 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LZ581( ) ;
                     load1LZ581( ) ;
                     beforeValidate1LZ581( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LZ581( ) ;
                        O6048TotPasForP = A6048TotPasForP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
                        O6042TotParPas = A6042TotParPas ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
                        O2142TotPasFor = A2142TotPasFor ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_581 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LZ581( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LZ581( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1LZ581( 13) ;
                              zm1LZ581( 14) ;
                           }
                           closeExtendedTableCursors1LZ581( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6048TotPasForP = A6048TotPasForP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
                           O6042TotParPas = A6042TotParPas ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
                           O2142TotPasFor = A2142TotPasFor ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_581 == 0 )
                  {
                     GXCCtl = "PASFORLIN_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPasForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_581_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasCod_Internalname, GXutil.rtrim( A2107PasCod)) ;
         httpContext.changePostValue( edtPasDsc_Internalname, GXutil.rtrim( A2108PasDsc)) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtPasForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForPre_Internalname, GXutil.ltrim( localUtil.ntoc( A2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForSob_Internalname, GXutil.ltrim( localUtil.ntoc( A2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForCon_Internalname, GXutil.ltrim( localUtil.ntoc( A2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForFCan_Internalname, GXutil.ltrim( localUtil.ntoc( A6044PasForFCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForFRea_Internalname, GXutil.ltrim( localUtil.ntoc( A6049PasForFRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForCanP_Internalname, GXutil.ltrim( localUtil.ntoc( A6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2654PasForLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2109PasForCan_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2111PasForPre_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2112PasForSob_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2110PasForCon_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6043PasForPar_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6050PasForCanP_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_100_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_100_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T6050PasForCanP_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6043PasForPar_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2109PasForCan_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_581 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_581_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_581_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORSOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForSob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCON_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORPAR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORFCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORFREA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCANP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCanP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6048TotPasForP = s6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      O6042TotParPas = s6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      O2142TotPasFor = s2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LZ0( )
   {
   }

   public void e111LZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn21_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttrn21_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn21_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn21_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn21_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn21_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LZ557( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2655PasForUL = T01LZ7_A2655PasForUL[0] ;
            Z2650MolPesMin = T01LZ7_A2650MolPesMin[0] ;
         }
         else
         {
            Z2655PasForUL = A2655PasForUL ;
            Z2650MolPesMin = A2650MolPesMin ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z2098MolCod = A2098MolCod ;
         Z2655PasForUL = A2655PasForUL ;
         Z2650MolPesMin = A2650MolPesMin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2141SerEst = A2141SerEst ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z2142TotPasFor = A2142TotPasFor ;
         Z6042TotParPas = A6042TotParPas ;
         Z6048TotPasForP = A6048TotPasForP ;
         Z6047TotColMol = A6047TotColMol ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TTrn21" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01LZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LZ8_A407EmprNom[0] ;
      n407EmprNom = T01LZ8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
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

   public void load1LZ557( )
   {
      /* Using cursor T01LZ17 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A279CliNom = T01LZ17_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A2655PasForUL = T01LZ17_A2655PasForUL[0] ;
         n2655PasForUL = T01LZ17_n2655PasForUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2655PasForUL), 3, 0));
         A407EmprNom = T01LZ17_A407EmprNom[0] ;
         n407EmprNom = T01LZ17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2650MolPesMin = T01LZ17_A2650MolPesMin[0] ;
         n2650MolPesMin = T01LZ17_n2650MolPesMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrimstr( A2650MolPesMin, 9, 2));
         A2142TotPasFor = T01LZ17_A2142TotPasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = T01LZ17_A6042TotParPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6047TotColMol = T01LZ17_A6047TotColMol[0] ;
         n6047TotColMol = T01LZ17_n6047TotColMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
         A6048TotPasForP = T01LZ17_A6048TotPasForP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         zm1LZ557( -6) ;
      }
      pr_default.close(11);
      onLoadActions1LZ557( ) ;
   }

   public void onLoadActions1LZ557( )
   {
      O6048TotPasForP = A6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      O6042TotParPas = A6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      O2142TotPasFor = A2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
   }

   public void checkExtendedTable1LZ557( )
   {
      nIsDirty_557 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LZ9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01LZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COLFON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
      /* Using cursor T01LZ12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A2142TotPasFor = T01LZ12_A2142TotPasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = T01LZ12_A6042TotParPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6048TotPasForP = T01LZ12_A6048TotPasForP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      else
      {
         nIsDirty_557 = (short)(1) ;
         A2142TotPasFor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         nIsDirty_557 = (short)(1) ;
         A6042TotParPas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         nIsDirty_557 = (short)(1) ;
         A6048TotPasForP = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      pr_default.close(9);
      /* Using cursor T01LZ14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A6047TotColMol = T01LZ14_A6047TotColMol[0] ;
         n6047TotColMol = T01LZ14_n6047TotColMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      else
      {
         nIsDirty_557 = (short)(1) ;
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
         n6047TotColMol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      pr_default.close(10);
   }

   public void closeExtendedTableCursors1LZ557( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01LZ18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LZ18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_9( String A396EmprCod ,
                         int A252CliCod ,
                         String A2141SerEst ,
                         String A1013DibCli ,
                         int A1014DibInt ,
                         String A2074ColCom ,
                         String A2078ColFon )
   {
      /* Using cursor T01LZ19 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COLFON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_10( String A396EmprCod ,
                          int A252CliCod ,
                          String A2141SerEst ,
                          String A1013DibCli ,
                          int A1014DibInt ,
                          String A2074ColCom ,
                          String A2078ColFon ,
                          byte A2098MolCod )
   {
      /* Using cursor T01LZ21 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A2142TotPasFor = T01LZ21_A2142TotPasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = T01LZ21_A6042TotParPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6048TotPasForP = T01LZ21_A6048TotPasForP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      else
      {
         A2142TotPasFor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6048TotPasForP = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2142TotPasFor, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6042TotParPas, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6048TotPasForP, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_11( String A396EmprCod ,
                          int A252CliCod ,
                          String A2141SerEst ,
                          String A1013DibCli ,
                          int A1014DibInt ,
                          String A2074ColCom ,
                          String A2078ColFon ,
                          byte A2098MolCod )
   {
      /* Using cursor T01LZ23 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A6047TotColMol = T01LZ23_A6047TotColMol[0] ;
         n6047TotColMol = T01LZ23_n6047TotColMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      else
      {
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
         n6047TotColMol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1LZ557( )
   {
      /* Using cursor T01LZ24 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound557 = (short)(1) ;
      }
      else
      {
         RcdFound557 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01LZ7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LZ557( 6) ;
         RcdFound557 = (short)(1) ;
         A2098MolCod = T01LZ7_A2098MolCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
         A2655PasForUL = T01LZ7_A2655PasForUL[0] ;
         n2655PasForUL = T01LZ7_n2655PasForUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2655PasForUL), 3, 0));
         A2650MolPesMin = T01LZ7_A2650MolPesMin[0] ;
         n2650MolPesMin = T01LZ7_n2650MolPesMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrimstr( A2650MolPesMin, 9, 2));
         A252CliCod = T01LZ7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T01LZ7_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LZ7_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2141SerEst = T01LZ7_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A2074ColCom = T01LZ7_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LZ7_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         sMode557 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LZ557( ) ;
         if ( AnyError == 1 )
         {
            RcdFound557 = (short)(0) ;
            initializeNonKey1LZ557( ) ;
         }
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound557 = (short)(0) ;
         initializeNonKey1LZ557( ) ;
         sMode557 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1LZ557( ) ;
      if ( RcdFound557 == 0 )
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
      RcdFound557 = (short)(0) ;
      /* Using cursor T01LZ25 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A2141SerEst, Integer.valueOf(A252CliCod), A1013DibCli, A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2074ColCom, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2078ColFon, A2078ColFon, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Byte.valueOf(A2098MolCod), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01LZ25_A252CliCod[0] < A252CliCod ) || ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) < 0 ) || ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( T01LZ25_A1014DibInt[0] < A1014DibInt ) || ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) < 0 ) || ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2078ColFon[0], A2078ColFon) < 0 ) || ( GXutil.strcmp(T01LZ25_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( T01LZ25_A2098MolCod[0] < A2098MolCod ) ) && ( GXutil.strcmp(T01LZ25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01LZ25_A252CliCod[0] > A252CliCod ) || ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) > 0 ) || ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( T01LZ25_A1014DibInt[0] > A1014DibInt ) || ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) > 0 ) || ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ25_A2078ColFon[0], A2078ColFon) > 0 ) || ( GXutil.strcmp(T01LZ25_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01LZ25_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ25_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ25_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ25_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ25_A252CliCod[0] == A252CliCod ) && ( T01LZ25_A2098MolCod[0] > A2098MolCod ) ) && ( GXutil.strcmp(T01LZ25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LZ25_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = T01LZ25_A2141SerEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = T01LZ25_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = T01LZ25_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = T01LZ25_A2074ColCom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = T01LZ25_A2078ColFon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            A2098MolCod = T01LZ25_A2098MolCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
            RcdFound557 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound557 = (short)(0) ;
      /* Using cursor T01LZ26 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A2141SerEst, Integer.valueOf(A252CliCod), A1013DibCli, A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2074ColCom, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2078ColFon, A2078ColFon, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Byte.valueOf(A2098MolCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01LZ26_A252CliCod[0] > A252CliCod ) || ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) > 0 ) || ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( T01LZ26_A1014DibInt[0] > A1014DibInt ) || ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) > 0 ) || ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2078ColFon[0], A2078ColFon) > 0 ) || ( GXutil.strcmp(T01LZ26_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( T01LZ26_A2098MolCod[0] > A2098MolCod ) ) && ( GXutil.strcmp(T01LZ26_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01LZ26_A252CliCod[0] < A252CliCod ) || ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) < 0 ) || ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( T01LZ26_A1014DibInt[0] < A1014DibInt ) || ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) < 0 ) || ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LZ26_A2078ColFon[0], A2078ColFon) < 0 ) || ( GXutil.strcmp(T01LZ26_A2078ColFon[0], A2078ColFon) == 0 ) && ( GXutil.strcmp(T01LZ26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LZ26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LZ26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LZ26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LZ26_A252CliCod[0] == A252CliCod ) && ( T01LZ26_A2098MolCod[0] < A2098MolCod ) ) && ( GXutil.strcmp(T01LZ26_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LZ26_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = T01LZ26_A2141SerEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = T01LZ26_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = T01LZ26_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = T01LZ26_A2074ColCom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = T01LZ26_A2078ColFon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            A2098MolCod = T01LZ26_A2098MolCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
            RcdFound557 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LZ557( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6048TotPasForP = O6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         A6042TotParPas = O6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A2142TotPasFor = O2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LZ557( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound557 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) || ( A2098MolCod != Z2098MolCod ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2141SerEst = Z2141SerEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
               A1013DibCli = Z1013DibCli ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A1014DibInt = Z1014DibInt ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A2074ColCom = Z2074ColCom ;
               httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
               A2078ColFon = Z2078ColFon ;
               httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
               A2098MolCod = Z2098MolCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6048TotPasForP = O6048TotPasForP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
               A6042TotParPas = O6042TotParPas ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
               A2142TotPasFor = O2142TotPasFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6048TotPasForP = O6048TotPasForP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
               A6042TotParPas = O6042TotParPas ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
               A2142TotPasFor = O2142TotPasFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               update1LZ557( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) || ( A2098MolCod != Z2098MolCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6048TotPasForP = O6048TotPasForP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
               A6042TotParPas = O6042TotParPas ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
               A2142TotPasFor = O2142TotPasFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LZ557( ) ;
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
                  A6048TotPasForP = O6048TotPasForP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
                  A6042TotParPas = O6042TotParPas ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
                  A2142TotPasFor = O2142TotPasFor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LZ557( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) || ( A2098MolCod != Z2098MolCod ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = Z2141SerEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = Z1013DibCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = Z1014DibInt ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = Z2074ColCom ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = Z2078ColFon ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = Z2098MolCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6048TotPasForP = O6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         A6042TotParPas = O6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A2142TotPasFor = O2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1LZ557( ) ;
      if ( RcdFound557 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) || ( A2098MolCod != Z2098MolCod ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = Z2141SerEst ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = Z1013DibCli ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = Z1014DibInt ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = Z2074ColCom ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = Z2078ColFon ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            A2098MolCod = Z2098MolCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) || ( A2098MolCod != Z2098MolCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn21");
      GX_FocusControl = edtPasForUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LZ0( ) ;
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
      if ( RcdFound557 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPasForUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LZ557( ) ;
      if ( RcdFound557 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPasForUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LZ557( ) ;
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
      if ( RcdFound557 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPasForUL_Internalname ;
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
      if ( RcdFound557 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPasForUL_Internalname ;
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
      scanStart1LZ557( ) ;
      if ( RcdFound557 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound557 != 0 )
         {
            scanNext1LZ557( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPasForUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LZ557( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LZ557( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFORES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z2655PasForUL != T01LZ6_A2655PasForUL[0] ) || ( DecimalUtil.compareTo(Z2650MolPesMin, T01LZ6_A2650MolPesMin[0]) != 0 ) )
         {
            if ( Z2655PasForUL != T01LZ6_A2655PasForUL[0] )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForUL");
               GXutil.writeLogRaw("Old: ",Z2655PasForUL);
               GXutil.writeLogRaw("Current: ",T01LZ6_A2655PasForUL[0]);
            }
            if ( DecimalUtil.compareTo(Z2650MolPesMin, T01LZ6_A2650MolPesMin[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"MolPesMin");
               GXutil.writeLogRaw("Old: ",Z2650MolPesMin);
               GXutil.writeLogRaw("Current: ",T01LZ6_A2650MolPesMin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMFORES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LZ557( )
   {
      beforeValidate1LZ557( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LZ557( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LZ557( 0) ;
         checkOptimisticConcurrency1LZ557( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LZ557( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LZ557( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LZ27 */
                  pr_default.execute(19, new Object[] {Byte.valueOf(A2098MolCod), Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, A396EmprCod, Integer.valueOf(A252CliCod), A1013DibCli, Integer.valueOf(A1014DibInt), A2141SerEst, A2074ColCom, A2078ColFon});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
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
                        processLevel1LZ557( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LZ0( ) ;
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
            load1LZ557( ) ;
         }
         endLevel1LZ557( ) ;
      }
      closeExtendedTableCursors1LZ557( ) ;
   }

   public void update1LZ557( )
   {
      beforeValidate1LZ557( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LZ557( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LZ557( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LZ557( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LZ557( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LZ28 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFORES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LZ557( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LZ557( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1LZ0( ) ;
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
         endLevel1LZ557( ) ;
      }
      closeExtendedTableCursors1LZ557( ) ;
   }

   public void deferredUpdate1LZ557( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LZ557( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LZ557( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LZ557( ) ;
         afterConfirm1LZ557( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LZ557( ) ;
            if ( AnyError == 0 )
            {
               A6048TotPasForP = O6048TotPasForP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
               A6042TotParPas = O6042TotParPas ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
               A2142TotPasFor = O2142TotPasFor ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               scanStart1LZ581( ) ;
               while ( RcdFound581 != 0 )
               {
                  getByPrimaryKey1LZ581( ) ;
                  delete1LZ581( ) ;
                  scanNext1LZ581( ) ;
                  O6048TotPasForP = A6048TotPasForP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
                  O6042TotParPas = A6042TotParPas ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
                  O2142TotPasFor = A2142TotPasFor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               }
               scanEnd1LZ581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LZ29 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound557 == 0 )
                        {
                           initAll1LZ557( ) ;
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
                        resetCaption1LZ0( ) ;
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
      sMode557 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LZ557( ) ;
      Gx_mode = sMode557 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LZ557( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LZ30 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01LZ30_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
         /* Using cursor T01LZ32 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A2142TotPasFor = T01LZ32_A2142TotPasFor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            A6042TotParPas = T01LZ32_A6042TotParPas[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            A6048TotPasForP = T01LZ32_A6048TotPasForP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         }
         else
         {
            A2142TotPasFor = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            A6042TotParPas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            A6048TotPasForP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         }
         pr_default.close(23);
         /* Using cursor T01LZ34 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A6047TotColMol = T01LZ34_A6047TotColMol[0] ;
            n6047TotColMol = T01LZ34_n6047TotColMol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
         }
         else
         {
            A6047TotColMol = DecimalUtil.doubleToDec(0) ;
            n6047TotColMol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
         }
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LZ35 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1LZ581( )
   {
      s6048TotPasForP = O6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      s6042TotParPas = O6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      s2142TotPasFor = O2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1LZ581( ) ;
         if ( ( nRcdExists_581 != 0 ) || ( nIsMod_581 != 0 ) )
         {
            standaloneNotModal1LZ581( ) ;
            getKey1LZ581( ) ;
            if ( ( nRcdExists_581 == 0 ) && ( nRcdDeleted_581 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LZ581( ) ;
            }
            else
            {
               if ( RcdFound581 != 0 )
               {
                  if ( ( nRcdDeleted_581 != 0 ) && ( nRcdExists_581 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LZ581( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_581 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LZ581( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_581 == 0 )
                  {
                     GXCCtl = "PASFORLIN_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPasForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6048TotPasForP = A6048TotPasForP ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
            O6042TotParPas = A6042TotParPas ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            O2142TotPasFor = A2142TotPasFor ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_581_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasCod_Internalname, GXutil.rtrim( A2107PasCod)) ;
         httpContext.changePostValue( edtPasDsc_Internalname, GXutil.rtrim( A2108PasDsc)) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtPasForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForPre_Internalname, GXutil.ltrim( localUtil.ntoc( A2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForSob_Internalname, GXutil.ltrim( localUtil.ntoc( A2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForCon_Internalname, GXutil.ltrim( localUtil.ntoc( A2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForFCan_Internalname, GXutil.ltrim( localUtil.ntoc( A6044PasForFCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForFRea_Internalname, GXutil.ltrim( localUtil.ntoc( A6049PasForFRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasForCanP_Internalname, GXutil.ltrim( localUtil.ntoc( A6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2654PasForLin_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2109PasForCan_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2111PasForPre_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2112PasForSob_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2110PasForCon_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6043PasForPar_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6050PasForCanP_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_100_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_100_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T6050PasForCanP_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6043PasForPar_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2109PasForCan_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_581_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_581 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_581_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_581_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORSOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForSob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCON_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORPAR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORFCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORFREA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORCANP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCanP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LZ581( ) ;
      if ( AnyError != 0 )
      {
         O6048TotPasForP = s6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         O6042TotParPas = s6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         O2142TotPasFor = s2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      }
      nRcdExists_581 = (short)(0) ;
      nIsMod_581 = (short)(0) ;
      nRcdDeleted_581 = (short)(0) ;
   }

   public void processLevel1LZ557( )
   {
      /* Save parent mode. */
      sMode557 = Gx_mode ;
      processNestedLevel1LZ581( ) ;
      if ( AnyError != 0 )
      {
         O6048TotPasForP = s6048TotPasForP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         O6042TotParPas = s6042TotParPas ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         O2142TotPasFor = s2142TotPasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode557 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LZ557( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LZ557( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn21");
         if ( AnyError == 0 )
         {
            confirmValues1LZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn21");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LZ557( )
   {
      /* Scan By routine */
      /* Using cursor T01LZ36 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      RcdFound557 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A252CliCod = T01LZ36_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = T01LZ36_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = T01LZ36_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LZ36_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = T01LZ36_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LZ36_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = T01LZ36_A2098MolCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LZ557( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound557 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A252CliCod = T01LZ36_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = T01LZ36_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = T01LZ36_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LZ36_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = T01LZ36_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LZ36_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = T01LZ36_A2098MolCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
      }
   }

   public void scanEnd1LZ557( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1LZ557( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LZ557( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LZ557( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LZ557( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LZ557( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LZ557( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LZ557( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtSerEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSerEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSerEst_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtColCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColCom_Enabled), 5, 0), true);
      edtColFon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFon_Enabled), 5, 0), true);
      edtMolCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTotPasFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotPasFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotPasFor_Enabled), 5, 0), true);
      edtPasForUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForUL_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTotParPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotParPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotParPas_Enabled), 5, 0), true);
      edtTotColMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotColMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotColMol_Enabled), 5, 0), true);
      edtMolPesMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolPesMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPesMin_Enabled), 5, 0), true);
      edtTotPasForP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotPasForP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotPasForP_Enabled), 5, 0), true);
   }

   public void zm1LZ581( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2109PasForCan = T01LZ3_A2109PasForCan[0] ;
            Z2111PasForPre = T01LZ3_A2111PasForPre[0] ;
            Z2112PasForSob = T01LZ3_A2112PasForSob[0] ;
            Z2110PasForCon = T01LZ3_A2110PasForCon[0] ;
            Z6043PasForPar = T01LZ3_A6043PasForPar[0] ;
            Z6050PasForCanP = T01LZ3_A6050PasForCanP[0] ;
            Z2107PasCod = T01LZ3_A2107PasCod[0] ;
            Z2144UniEstCod = T01LZ3_A2144UniEstCod[0] ;
         }
         else
         {
            Z2109PasForCan = A2109PasForCan ;
            Z2111PasForPre = A2111PasForPre ;
            Z2112PasForSob = A2112PasForSob ;
            Z2110PasForCon = A2110PasForCon ;
            Z6043PasForPar = A6043PasForPar ;
            Z6050PasForCanP = A6050PasForCanP ;
            Z2107PasCod = A2107PasCod ;
            Z2144UniEstCod = A2144UniEstCod ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         Z2654PasForLin = A2654PasForLin ;
         Z2109PasForCan = A2109PasForCan ;
         Z2111PasForPre = A2111PasForPre ;
         Z2112PasForSob = A2112PasForSob ;
         Z2110PasForCon = A2110PasForCon ;
         Z6043PasForPar = A6043PasForPar ;
         Z6050PasForCanP = A6050PasForCanP ;
         Z396EmprCod = A396EmprCod ;
         Z2107PasCod = A2107PasCod ;
         Z2144UniEstCod = A2144UniEstCod ;
         Z2108PasDsc = A2108PasDsc ;
      }
   }

   public void standaloneNotModal1LZ581( )
   {
   }

   public void standaloneModal1LZ581( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPasForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtPasForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void load1LZ581( )
   {
      /* Using cursor T01LZ37 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound581 = (short)(1) ;
         A2108PasDsc = T01LZ37_A2108PasDsc[0] ;
         n2108PasDsc = T01LZ37_n2108PasDsc[0] ;
         A2109PasForCan = T01LZ37_A2109PasForCan[0] ;
         n2109PasForCan = T01LZ37_n2109PasForCan[0] ;
         A2111PasForPre = T01LZ37_A2111PasForPre[0] ;
         n2111PasForPre = T01LZ37_n2111PasForPre[0] ;
         A2112PasForSob = T01LZ37_A2112PasForSob[0] ;
         n2112PasForSob = T01LZ37_n2112PasForSob[0] ;
         A2110PasForCon = T01LZ37_A2110PasForCon[0] ;
         n2110PasForCon = T01LZ37_n2110PasForCon[0] ;
         A6043PasForPar = T01LZ37_A6043PasForPar[0] ;
         n6043PasForPar = T01LZ37_n6043PasForPar[0] ;
         A6050PasForCanP = T01LZ37_A6050PasForCanP[0] ;
         n6050PasForCanP = T01LZ37_n6050PasForCanP[0] ;
         A2107PasCod = T01LZ37_A2107PasCod[0] ;
         n2107PasCod = T01LZ37_n2107PasCod[0] ;
         A2144UniEstCod = T01LZ37_A2144UniEstCod[0] ;
         n2144UniEstCod = T01LZ37_n2144UniEstCod[0] ;
         zm1LZ581( -12) ;
      }
      pr_default.close(27);
      onLoadActions1LZ581( ) ;
   }

   public void onLoadActions1LZ581( )
   {
      if ( isIns( )  )
      {
         A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan).subtract(O2109PasForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2142TotPasFor = O2142TotPasFor.subtract(O2109PasForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar-O6043PasForPar) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6042TotParPas = (byte)(O6042TotParPas-O6043PasForPar) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            }
         }
      }
      if ( ! (0==A6042TotParPas) )
      {
         A6044PasForFCan = GXutil.roundDecimal( (A2650MolPesMin.divide(DecimalUtil.doubleToDec(A6042TotParPas), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A6043PasForPar)), 2) ;
      }
      else
      {
         A6044PasForFCan = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP).subtract(O6050PasForCanP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6048TotPasForP = O6048TotPasForP.subtract(O6050PasForCanP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A6048TotPasForP)==0) )
      {
         A6049PasForFRea = GXutil.roundDecimal( A6050PasForCanP.multiply(((A6048TotPasForP.subtract((A6047TotColMol.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))).divide(A6048TotPasForP, 18, java.math.RoundingMode.DOWN))), 2) ;
      }
      else
      {
         A6049PasForFRea = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void checkExtendedTable1LZ581( )
   {
      nIsDirty_581 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LZ581( ) ;
      /* Using cursor T01LZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01LZ4_A2108PasDsc[0] ;
      n2108PasDsc = T01LZ4_n2108PasDsc[0] ;
      pr_default.close(2);
      /* Using cursor T01LZ5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( isIns( )  )
      {
         nIsDirty_581 = (short)(1) ;
         A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_581 = (short)(1) ;
            A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan).subtract(O2109PasForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_581 = (short)(1) ;
               A2142TotPasFor = O2142TotPasFor.subtract(O2109PasForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_581 = (short)(1) ;
         A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_581 = (short)(1) ;
            A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar-O6043PasForPar) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_581 = (short)(1) ;
               A6042TotParPas = (byte)(O6042TotParPas-O6043PasForPar) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            }
         }
      }
      if ( ! (0==A6042TotParPas) )
      {
         nIsDirty_581 = (short)(1) ;
         A6044PasForFCan = GXutil.roundDecimal( (A2650MolPesMin.divide(DecimalUtil.doubleToDec(A6042TotParPas), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A6043PasForPar)), 2) ;
      }
      else
      {
         nIsDirty_581 = (short)(1) ;
         A6044PasForFCan = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_581 = (short)(1) ;
         A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_581 = (short)(1) ;
            A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP).subtract(O6050PasForCanP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_581 = (short)(1) ;
               A6048TotPasForP = O6048TotPasForP.subtract(O6050PasForCanP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A6048TotPasForP)==0) )
      {
         nIsDirty_581 = (short)(1) ;
         A6049PasForFRea = GXutil.roundDecimal( A6050PasForCanP.multiply(((A6048TotPasForP.subtract((A6047TotColMol.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))).divide(A6048TotPasForP, 18, java.math.RoundingMode.DOWN))), 2) ;
      }
      else
      {
         nIsDirty_581 = (short)(1) ;
         A6049PasForFRea = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void closeExtendedTableCursors1LZ581( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1LZ581( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          String A2107PasCod )
   {
      /* Using cursor T01LZ38 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01LZ38_A2108PasDsc[0] ;
      n2108PasDsc = T01LZ38_n2108PasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2108PasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void gxload_14( String A2144UniEstCod )
   {
      /* Using cursor T01LZ39 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
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

   public void getKey1LZ581( )
   {
      /* Using cursor T01LZ40 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound581 = (short)(1) ;
      }
      else
      {
         RcdFound581 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey1LZ581( )
   {
      /* Using cursor T01LZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LZ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LZ581( 12) ;
         RcdFound581 = (short)(1) ;
         initializeNonKey1LZ581( ) ;
         A2654PasForLin = T01LZ3_A2654PasForLin[0] ;
         A2109PasForCan = T01LZ3_A2109PasForCan[0] ;
         n2109PasForCan = T01LZ3_n2109PasForCan[0] ;
         A2111PasForPre = T01LZ3_A2111PasForPre[0] ;
         n2111PasForPre = T01LZ3_n2111PasForPre[0] ;
         A2112PasForSob = T01LZ3_A2112PasForSob[0] ;
         n2112PasForSob = T01LZ3_n2112PasForSob[0] ;
         A2110PasForCon = T01LZ3_A2110PasForCon[0] ;
         n2110PasForCon = T01LZ3_n2110PasForCon[0] ;
         A6043PasForPar = T01LZ3_A6043PasForPar[0] ;
         n6043PasForPar = T01LZ3_n6043PasForPar[0] ;
         A6050PasForCanP = T01LZ3_A6050PasForCanP[0] ;
         n6050PasForCanP = T01LZ3_n6050PasForCanP[0] ;
         A2107PasCod = T01LZ3_A2107PasCod[0] ;
         n2107PasCod = T01LZ3_n2107PasCod[0] ;
         A2144UniEstCod = T01LZ3_A2144UniEstCod[0] ;
         n2144UniEstCod = T01LZ3_n2144UniEstCod[0] ;
         O6050PasForCanP = A6050PasForCanP ;
         n6050PasForCanP = false ;
         O6043PasForPar = A6043PasForPar ;
         n6043PasForPar = false ;
         O2109PasForCan = A2109PasForCan ;
         n2109PasForCan = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         Z2654PasForLin = A2654PasForLin ;
         sMode581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LZ581( ) ;
         load1LZ581( ) ;
         Gx_mode = sMode581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound581 = (short)(0) ;
         initializeNonKey1LZ581( ) ;
         sMode581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LZ581( ) ;
         Gx_mode = sMode581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LZ581( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LZ581( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPASFOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2109PasForCan, T01LZ2_A2109PasForCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z2111PasForPre, T01LZ2_A2111PasForPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z2112PasForSob, T01LZ2_A2112PasForSob[0]) != 0 ) || ( DecimalUtil.compareTo(Z2110PasForCon, T01LZ2_A2110PasForCon[0]) != 0 ) || ( Z6043PasForPar != T01LZ2_A6043PasForPar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6050PasForCanP, T01LZ2_A6050PasForCanP[0]) != 0 ) || ( GXutil.strcmp(Z2107PasCod, T01LZ2_A2107PasCod[0]) != 0 ) || ( GXutil.strcmp(Z2144UniEstCod, T01LZ2_A2144UniEstCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2109PasForCan, T01LZ2_A2109PasForCan[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForCan");
               GXutil.writeLogRaw("Old: ",Z2109PasForCan);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2109PasForCan[0]);
            }
            if ( DecimalUtil.compareTo(Z2111PasForPre, T01LZ2_A2111PasForPre[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForPre");
               GXutil.writeLogRaw("Old: ",Z2111PasForPre);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2111PasForPre[0]);
            }
            if ( DecimalUtil.compareTo(Z2112PasForSob, T01LZ2_A2112PasForSob[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForSob");
               GXutil.writeLogRaw("Old: ",Z2112PasForSob);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2112PasForSob[0]);
            }
            if ( DecimalUtil.compareTo(Z2110PasForCon, T01LZ2_A2110PasForCon[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForCon");
               GXutil.writeLogRaw("Old: ",Z2110PasForCon);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2110PasForCon[0]);
            }
            if ( Z6043PasForPar != T01LZ2_A6043PasForPar[0] )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForPar");
               GXutil.writeLogRaw("Old: ",Z6043PasForPar);
               GXutil.writeLogRaw("Current: ",T01LZ2_A6043PasForPar[0]);
            }
            if ( DecimalUtil.compareTo(Z6050PasForCanP, T01LZ2_A6050PasForCanP[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasForCanP");
               GXutil.writeLogRaw("Old: ",Z6050PasForCanP);
               GXutil.writeLogRaw("Current: ",T01LZ2_A6050PasForCanP[0]);
            }
            if ( GXutil.strcmp(Z2107PasCod, T01LZ2_A2107PasCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"PasCod");
               GXutil.writeLogRaw("Old: ",Z2107PasCod);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2107PasCod[0]);
            }
            if ( GXutil.strcmp(Z2144UniEstCod, T01LZ2_A2144UniEstCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn21:[seudo value changed for attri]"+"UniEstCod");
               GXutil.writeLogRaw("Old: ",Z2144UniEstCod);
               GXutil.writeLogRaw("Current: ",T01LZ2_A2144UniEstCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPASFOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LZ581( )
   {
      beforeValidate1LZ581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LZ581( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LZ581( 0) ;
         checkOptimisticConcurrency1LZ581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LZ581( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LZ581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LZ41 */
                  pr_default.execute(31, new Object[] {Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin), Boolean.valueOf(n2109PasForCan), A2109PasForCan, Boolean.valueOf(n2111PasForPre), A2111PasForPre, Boolean.valueOf(n2112PasForSob), A2112PasForSob, Boolean.valueOf(n2110PasForCon), A2110PasForCon, Boolean.valueOf(n6043PasForPar), Short.valueOf(A6043PasForPar), Boolean.valueOf(n6050PasForCanP), A6050PasForCanP, A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
                  if ( (pr_default.getStatus(31) == 1) )
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
            load1LZ581( ) ;
         }
         endLevel1LZ581( ) ;
      }
      closeExtendedTableCursors1LZ581( ) ;
   }

   public void update1LZ581( )
   {
      beforeValidate1LZ581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LZ581( ) ;
      }
      if ( ( nIsMod_581 != 0 ) || ( nIsDirty_581 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LZ581( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LZ581( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LZ581( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LZ42 */
                     pr_default.execute(32, new Object[] {Boolean.valueOf(n2109PasForCan), A2109PasForCan, Boolean.valueOf(n2111PasForPre), A2111PasForPre, Boolean.valueOf(n2112PasForSob), A2112PasForSob, Boolean.valueOf(n2110PasForCon), A2110PasForCon, Boolean.valueOf(n6043PasForPar), Short.valueOf(A6043PasForPar), Boolean.valueOf(n6050PasForCanP), A6050PasForCanP, Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPASFOR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LZ581( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LZ581( ) ;
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
            endLevel1LZ581( ) ;
         }
      }
      closeExtendedTableCursors1LZ581( ) ;
   }

   public void deferredUpdate1LZ581( )
   {
   }

   public void delete1LZ581( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LZ581( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LZ581( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LZ581( ) ;
         afterConfirm1LZ581( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LZ581( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LZ43 */
               pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
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
      sMode581 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LZ581( ) ;
      Gx_mode = sMode581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LZ581( )
   {
      standaloneModal1LZ581( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LZ44 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
         A2108PasDsc = T01LZ44_A2108PasDsc[0] ;
         n2108PasDsc = T01LZ44_n2108PasDsc[0] ;
         pr_default.close(34);
         if ( isIns( )  )
         {
            A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2142TotPasFor = O2142TotPasFor.add(A2109PasForCan).subtract(O2109PasForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2142TotPasFor = O2142TotPasFor.subtract(O2109PasForCan) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6042TotParPas = (byte)(O6042TotParPas+A6043PasForPar-O6043PasForPar) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6042TotParPas = (byte)(O6042TotParPas-O6043PasForPar) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
               }
            }
         }
         if ( ! (0==A6042TotParPas) )
         {
            A6044PasForFCan = GXutil.roundDecimal( (A2650MolPesMin.divide(DecimalUtil.doubleToDec(A6042TotParPas), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A6043PasForPar)), 2) ;
         }
         else
         {
            A6044PasForFCan = DecimalUtil.doubleToDec(0) ;
         }
         if ( isIns( )  )
         {
            A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6048TotPasForP = O6048TotPasForP.add(A6050PasForCanP).subtract(O6050PasForCanP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6048TotPasForP = O6048TotPasForP.subtract(O6050PasForCanP) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A6048TotPasForP)==0) )
         {
            A6049PasForFRea = GXutil.roundDecimal( A6050PasForCanP.multiply(((A6048TotPasForP.subtract((A6047TotColMol.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))).divide(A6048TotPasForP, 18, java.math.RoundingMode.DOWN))), 2) ;
         }
         else
         {
            A6049PasForFRea = DecimalUtil.doubleToDec(0) ;
         }
      }
   }

   public void endLevel1LZ581( )
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

   public void scanStart1LZ581( )
   {
      /* Scan By routine */
      /* Using cursor T01LZ45 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      RcdFound581 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound581 = (short)(1) ;
         A2654PasForLin = T01LZ45_A2654PasForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LZ581( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound581 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound581 = (short)(1) ;
         A2654PasForLin = T01LZ45_A2654PasForLin[0] ;
      }
   }

   public void scanEnd1LZ581( )
   {
      pr_default.close(35);
   }

   public void afterConfirm1LZ581( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LZ581( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LZ581( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LZ581( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LZ581( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LZ581( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LZ581( )
   {
      edtPasForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtUniEstCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCan_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForPre_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForSob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForSob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForSob_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCon_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForPar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForFCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForFCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForFCan_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForFRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForFRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForFRea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtPasForCanP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForCanP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForCanP_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashes1LZ581( )
   {
   }

   public void send_integrity_lvl_hashes1LZ557( )
   {
   }

   public void subsflControlProps_100581( )
   {
      edtavnRcdDeleted_581_Internalname = "vNRCDDELETED_581_"+sGXsfl_100_idx ;
      edtPasForLin_Internalname = "PASFORLIN_"+sGXsfl_100_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_100_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_100_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_100_idx ;
      edtPasForCan_Internalname = "PASFORCAN_"+sGXsfl_100_idx ;
      edtPasForPre_Internalname = "PASFORPRE_"+sGXsfl_100_idx ;
      edtPasForSob_Internalname = "PASFORSOB_"+sGXsfl_100_idx ;
      edtPasForCon_Internalname = "PASFORCON_"+sGXsfl_100_idx ;
      edtPasForPar_Internalname = "PASFORPAR_"+sGXsfl_100_idx ;
      edtPasForFCan_Internalname = "PASFORFCAN_"+sGXsfl_100_idx ;
      edtPasForFRea_Internalname = "PASFORFREA_"+sGXsfl_100_idx ;
      edtPasForCanP_Internalname = "PASFORCANP_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_100581( )
   {
      edtavnRcdDeleted_581_Internalname = "vNRCDDELETED_581_"+sGXsfl_100_fel_idx ;
      edtPasForLin_Internalname = "PASFORLIN_"+sGXsfl_100_fel_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_100_fel_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_100_fel_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_100_fel_idx ;
      edtPasForCan_Internalname = "PASFORCAN_"+sGXsfl_100_fel_idx ;
      edtPasForPre_Internalname = "PASFORPRE_"+sGXsfl_100_fel_idx ;
      edtPasForSob_Internalname = "PASFORSOB_"+sGXsfl_100_fel_idx ;
      edtPasForCon_Internalname = "PASFORCON_"+sGXsfl_100_fel_idx ;
      edtPasForPar_Internalname = "PASFORPAR_"+sGXsfl_100_fel_idx ;
      edtPasForFCan_Internalname = "PASFORFCAN_"+sGXsfl_100_fel_idx ;
      edtPasForFRea_Internalname = "PASFORFREA_"+sGXsfl_100_fel_idx ;
      edtPasForCanP_Internalname = "PASFORCANP_"+sGXsfl_100_fel_idx ;
   }

   public void addRow1LZ581( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100581( ) ;
      sendRow1LZ581( ) ;
   }

   public void sendRow1LZ581( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_581_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_581_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_581), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_581), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_581_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_581_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2654PasForLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasCod_Internalname,GXutil.rtrim( A2107PasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasDsc_Internalname,GXutil.rtrim( A2108PasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUniEstCod_Internalname,GXutil.rtrim( A2144UniEstCod),GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUniEstCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUniEstCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForCan_Enabled!=0) ? localUtil.format( A2109PasForCan, "ZZZZZ9.999") : localUtil.format( A2109PasForCan, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForPre_Internalname,GXutil.ltrim( localUtil.ntoc( A2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForPre_Enabled!=0) ? localUtil.format( A2111PasForPre, "ZZZZZ9.999") : localUtil.format( A2111PasForPre, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForSob_Internalname,GXutil.ltrim( localUtil.ntoc( A2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForSob_Enabled!=0) ? localUtil.format( A2112PasForSob, "ZZZZZ9.999") : localUtil.format( A2112PasForSob, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForSob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForSob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForCon_Internalname,GXutil.ltrim( localUtil.ntoc( A2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForCon_Enabled!=0) ? localUtil.format( A2110PasForCon, "ZZZZZ9.999") : localUtil.format( A2110PasForCon, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForPar_Internalname,GXutil.ltrim( localUtil.ntoc( A6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6043PasForPar), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6043PasForPar), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForFCan_Internalname,GXutil.ltrim( localUtil.ntoc( A6044PasForFCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForFCan_Enabled!=0) ? localUtil.format( A6044PasForFCan, "ZZZZZ9.999") : localUtil.format( A6044PasForFCan, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForFCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForFCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForFRea_Internalname,GXutil.ltrim( localUtil.ntoc( A6049PasForFRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForFRea_Enabled!=0) ? localUtil.format( A6049PasForFRea, "ZZZZZ9.999") : localUtil.format( A6049PasForFRea, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForFRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForFRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_581_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForCanP_Internalname,GXutil.ltrim( localUtil.ntoc( A6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForCanP_Enabled!=0) ? localUtil.format( A6050PasForCanP, "ZZZZZ9.999") : localUtil.format( A6050PasForCanP, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForCanP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasForCanP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LZ581( ) ;
      GXCCtl = "Z2654PasForLin_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2654PasForLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2109PasForCan_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2111PasForPre_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2111PasForPre, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2112PasForSob_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2112PasForSob, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2110PasForCon_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2110PasForCon, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6043PasForPar_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6050PasForCanP_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2107PasCod_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2107PasCod));
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2144UniEstCod));
      GXCCtl = "O6050PasForCanP_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6050PasForCanP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6043PasForPar_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6043PasForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2109PasForCan_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2109PasForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_581_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_581_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_581_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_581, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_581_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_581_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASDSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UNIESTCOD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORSOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForSob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORCON_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORPAR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORFCAN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORFREA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORCANP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCanP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LZ581( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100581( ) ;
      edtavnRcdDeleted_581_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_581_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCAN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORPRE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForSob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORSOB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCON_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORPAR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForFCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORFCAN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForFRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORFREA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForCanP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORCANP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_581_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_581_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_581");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_581_Internalname ;
         wbErr = true ;
         nRcdDeleted_581 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_581 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_581_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PASFORLIN_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForLin_Internalname ;
         wbErr = true ;
         A2654PasForLin = (short)(0) ;
      }
      else
      {
         A2654PasForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2107PasCod = httpContext.cgiGet( edtPasCod_Internalname) ;
      n2107PasCod = false ;
      A2108PasDsc = httpContext.cgiGet( edtPasDsc_Internalname) ;
      n2108PasDsc = false ;
      A2144UniEstCod = GXutil.upper( httpContext.cgiGet( edtUniEstCod_Internalname)) ;
      n2144UniEstCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPasForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPasForCan_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PASFORCAN_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForCan_Internalname ;
         wbErr = true ;
         A2109PasForCan = DecimalUtil.ZERO ;
         n2109PasForCan = false ;
      }
      else
      {
         A2109PasForCan = localUtil.ctond( httpContext.cgiGet( edtPasForCan_Internalname)) ;
         n2109PasForCan = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPasForPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPasForPre_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PASFORPRE_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForPre_Internalname ;
         wbErr = true ;
         A2111PasForPre = DecimalUtil.ZERO ;
         n2111PasForPre = false ;
      }
      else
      {
         A2111PasForPre = localUtil.ctond( httpContext.cgiGet( edtPasForPre_Internalname)) ;
         n2111PasForPre = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPasForSob_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPasForSob_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PASFORSOB_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForSob_Internalname ;
         wbErr = true ;
         A2112PasForSob = DecimalUtil.ZERO ;
         n2112PasForSob = false ;
      }
      else
      {
         A2112PasForSob = localUtil.ctond( httpContext.cgiGet( edtPasForSob_Internalname)) ;
         n2112PasForSob = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPasForCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPasForCon_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PASFORCON_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForCon_Internalname ;
         wbErr = true ;
         A2110PasForCon = DecimalUtil.ZERO ;
         n2110PasForCon = false ;
      }
      else
      {
         A2110PasForCon = localUtil.ctond( httpContext.cgiGet( edtPasForCon_Internalname)) ;
         n2110PasForCon = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPasForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPasForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PASFORPAR_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForPar_Internalname ;
         wbErr = true ;
         A6043PasForPar = (short)(0) ;
         n6043PasForPar = false ;
      }
      else
      {
         A6043PasForPar = (short)(localUtil.ctol( httpContext.cgiGet( edtPasForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6043PasForPar = false ;
      }
      A6044PasForFCan = localUtil.ctond( httpContext.cgiGet( edtPasForFCan_Internalname)) ;
      A6049PasForFRea = localUtil.ctond( httpContext.cgiGet( edtPasForFRea_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPasForCanP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPasForCanP_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PASFORCANP_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForCanP_Internalname ;
         wbErr = true ;
         A6050PasForCanP = DecimalUtil.ZERO ;
         n6050PasForCanP = false ;
      }
      else
      {
         A6050PasForCanP = localUtil.ctond( httpContext.cgiGet( edtPasForCanP_Internalname)) ;
         n6050PasForCanP = false ;
      }
      GXCCtl = "Z2654PasForLin_" + sGXsfl_100_idx ;
      Z2654PasForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2109PasForCan_" + sGXsfl_100_idx ;
      Z2109PasForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2111PasForPre_" + sGXsfl_100_idx ;
      Z2111PasForPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2112PasForSob_" + sGXsfl_100_idx ;
      Z2112PasForSob = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2110PasForCon_" + sGXsfl_100_idx ;
      Z2110PasForCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6043PasForPar_" + sGXsfl_100_idx ;
      Z6043PasForPar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6050PasForCanP_" + sGXsfl_100_idx ;
      Z6050PasForCanP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2107PasCod_" + sGXsfl_100_idx ;
      Z2107PasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_100_idx ;
      Z2144UniEstCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O6050PasForCanP_" + sGXsfl_100_idx ;
      O6050PasForCanP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6043PasForPar_" + sGXsfl_100_idx ;
      O6043PasForPar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2109PasForCan_" + sGXsfl_100_idx ;
      O2109PasForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_581_" + sGXsfl_100_idx ;
      nRcdDeleted_581 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_581_" + sGXsfl_100_idx ;
      nRcdExists_581 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_581_" + sGXsfl_100_idx ;
      nIsMod_581 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPasForLin_Enabled = edtPasForLin_Enabled ;
   }

   public void confirmValues1LZ0( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100581( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_100581( ) ;
         httpContext.changePostValue( "Z2654PasForLin_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2654PasForLin_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2654PasForLin_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2109PasForCan_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2109PasForCan_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2109PasForCan_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2111PasForPre_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2111PasForPre_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2111PasForPre_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2112PasForSob_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2112PasForSob_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2112PasForSob_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2110PasForCon_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2110PasForCon_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2110PasForCon_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z6043PasForPar_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z6043PasForPar_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6043PasForPar_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z6050PasForCanP_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z6050PasForCanP_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6050PasForCanP_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2107PasCod_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2107PasCod_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z2144UniEstCod_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z2144UniEstCod_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_100_idx) ;
      }
      httpContext.changePostValue( "O6050PasForCanP", httpContext.cgiGet( "T6050PasForCanP")) ;
      httpContext.deletePostValue( "T6050PasForCanP") ;
      httpContext.changePostValue( "O6043PasForPar", httpContext.cgiGet( "T6043PasForPar")) ;
      httpContext.deletePostValue( "T6043PasForPar") ;
      httpContext.changePostValue( "O2109PasForCan", httpContext.cgiGet( "T2109PasForCan")) ;
      httpContext.deletePostValue( "T2109PasForCan") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn21", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2098MolCod", GXutil.ltrim( localUtil.ntoc( Z2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2655PasForUL", GXutil.ltrim( localUtil.ntoc( Z2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2650MolPesMin", GXutil.ltrim( localUtil.ntoc( Z2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6048TotPasForP", GXutil.ltrim( localUtil.ntoc( O6048TotPasForP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6042TotParPas", GXutil.ltrim( localUtil.ntoc( O6042TotParPas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2142TotPasFor", GXutil.ltrim( localUtil.ntoc( O2142TotPasFor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.ttrn21", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrn21" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Formulas Estampacion (PASTAS)", "") ;
   }

   public void initializeNonKey1LZ557( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A2142TotPasFor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      A2655PasForUL = (short)(0) ;
      n2655PasForUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2655PasForUL), 3, 0));
      A6042TotParPas = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      A6047TotColMol = DecimalUtil.ZERO ;
      n6047TotColMol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      A2650MolPesMin = DecimalUtil.ZERO ;
      n2650MolPesMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrimstr( A2650MolPesMin, 9, 2));
      A6048TotPasForP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      O6048TotPasForP = A6048TotPasForP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      O6042TotParPas = A6042TotParPas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
      O2142TotPasFor = A2142TotPasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
      Z2655PasForUL = (short)(0) ;
      Z2650MolPesMin = DecimalUtil.ZERO ;
   }

   public void initAll1LZ557( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A2141SerEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
      A1013DibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A2074ColCom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
      A2078ColFon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
      A2098MolCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2098MolCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2098MolCod), 2, 0));
      initializeNonKey1LZ557( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LZ581( )
   {
      A6049PasForFRea = DecimalUtil.ZERO ;
      A6044PasForFCan = DecimalUtil.ZERO ;
      A2107PasCod = "" ;
      n2107PasCod = false ;
      A2108PasDsc = "" ;
      n2108PasDsc = false ;
      A2144UniEstCod = "" ;
      n2144UniEstCod = false ;
      A2109PasForCan = DecimalUtil.ZERO ;
      n2109PasForCan = false ;
      A2111PasForPre = DecimalUtil.ZERO ;
      n2111PasForPre = false ;
      A2112PasForSob = DecimalUtil.ZERO ;
      n2112PasForSob = false ;
      A2110PasForCon = DecimalUtil.ZERO ;
      n2110PasForCon = false ;
      A6043PasForPar = (short)(0) ;
      n6043PasForPar = false ;
      A6050PasForCanP = DecimalUtil.ZERO ;
      n6050PasForCanP = false ;
      O6050PasForCanP = A6050PasForCanP ;
      n6050PasForCanP = false ;
      O6043PasForPar = A6043PasForPar ;
      n6043PasForPar = false ;
      O2109PasForCan = A2109PasForCan ;
      n2109PasForCan = false ;
      Z2109PasForCan = DecimalUtil.ZERO ;
      Z2111PasForPre = DecimalUtil.ZERO ;
      Z2112PasForSob = DecimalUtil.ZERO ;
      Z2110PasForCon = DecimalUtil.ZERO ;
      Z6043PasForPar = (short)(0) ;
      Z6050PasForCanP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
      Z2144UniEstCod = "" ;
   }

   public void initAll1LZ581( )
   {
      A2654PasForLin = (short)(0) ;
      initializeNonKey1LZ581( ) ;
   }

   public void standaloneModalInsert1LZ581( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241593875", true, true);
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
      httpContext.AddJavascriptSource("ttrn21.js", "?20268241593875", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties581( )
   {
      edtPasForLin_Enabled = defedtPasForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForLin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_581, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_581_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2654PasForLin, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2107PasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2108PasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2144UniEstCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2109PasForCan, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2111PasForPre, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2112PasForSob, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForSob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2110PasForCon, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6043PasForPar, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6044PasForFCan, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6049PasForFRea, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForFRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6050PasForCanP, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForCanP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSerEst_Internalname = "SEREST" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtColCom_Internalname = "COLCOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtColFon_Internalname = "COLFON" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMolCod_Internalname = "MOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTotPasFor_Internalname = "TOTPASFOR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPasForUL_Internalname = "PASFORUL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTotParPas_Internalname = "TOTPARPAS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTotColMol_Internalname = "TOTCOLMOL" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtMolPesMin_Internalname = "MOLPESMIN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtTotPasForP_Internalname = "TOTPASFORP" ;
      edtavnRcdDeleted_581_Internalname = "vNRCDDELETED_581" ;
      edtPasForLin_Internalname = "PASFORLIN" ;
      edtPasCod_Internalname = "PASCOD" ;
      edtPasDsc_Internalname = "PASDSC" ;
      edtUniEstCod_Internalname = "UNIESTCOD" ;
      edtPasForCan_Internalname = "PASFORCAN" ;
      edtPasForPre_Internalname = "PASFORPRE" ;
      edtPasForSob_Internalname = "PASFORSOB" ;
      edtPasForCon_Internalname = "PASFORCON" ;
      edtPasForPar_Internalname = "PASFORPAR" ;
      edtPasForFCan_Internalname = "PASFORFCAN" ;
      edtPasForFRea_Internalname = "PASFORFREA" ;
      edtPasForCanP_Internalname = "PASFORCANP" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Formulas Estampacion (PASTAS)", "") );
      edtPasForCanP_Jsonclick = "" ;
      edtPasForFRea_Jsonclick = "" ;
      edtPasForFCan_Jsonclick = "" ;
      edtPasForPar_Jsonclick = "" ;
      edtPasForCon_Jsonclick = "" ;
      edtPasForSob_Jsonclick = "" ;
      edtPasForPre_Jsonclick = "" ;
      edtPasForCan_Jsonclick = "" ;
      edtUniEstCod_Jsonclick = "" ;
      edtPasDsc_Jsonclick = "" ;
      edtPasCod_Jsonclick = "" ;
      edtPasForLin_Jsonclick = "" ;
      edtavnRcdDeleted_581_Jsonclick = "" ;
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
      edtPasForCanP_Enabled = 1 ;
      edtPasForFRea_Enabled = 0 ;
      edtPasForFCan_Enabled = 0 ;
      edtPasForPar_Enabled = 1 ;
      edtPasForCon_Enabled = 1 ;
      edtPasForSob_Enabled = 1 ;
      edtPasForPre_Enabled = 1 ;
      edtPasForCan_Enabled = 1 ;
      edtUniEstCod_Enabled = 1 ;
      edtPasDsc_Enabled = 0 ;
      edtPasCod_Enabled = 1 ;
      edtPasForLin_Enabled = 1 ;
      edtavnRcdDeleted_581_Enabled = 1 ;
      edtTotPasForP_Jsonclick = "" ;
      edtTotPasForP_Backcolor = (int)(0xFFFFFF) ;
      edtTotPasForP_Enabled = 0 ;
      edtMolPesMin_Jsonclick = "" ;
      edtMolPesMin_Backcolor = (int)(0xFFFFFF) ;
      edtMolPesMin_Enabled = 1 ;
      edtTotColMol_Jsonclick = "" ;
      edtTotColMol_Backcolor = (int)(0xFFFFFF) ;
      edtTotColMol_Enabled = 0 ;
      edtTotParPas_Jsonclick = "" ;
      edtTotParPas_Backcolor = (int)(0xFFFFFF) ;
      edtTotParPas_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtPasForUL_Jsonclick = "" ;
      edtPasForUL_Backcolor = (int)(0xFFFFFF) ;
      edtPasForUL_Enabled = 1 ;
      edtTotPasFor_Jsonclick = "" ;
      edtTotPasFor_Backcolor = (int)(0xFFFFFF) ;
      edtTotPasFor_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMolCod_Jsonclick = "" ;
      edtMolCod_Backcolor = (int)(0xFFFFFF) ;
      edtMolCod_Enabled = 1 ;
      edtColFon_Jsonclick = "" ;
      edtColFon_Backcolor = (int)(0xFFFFFF) ;
      edtColFon_Enabled = 1 ;
      edtColCom_Jsonclick = "" ;
      edtColCom_Backcolor = (int)(0xFFFFFF) ;
      edtColCom_Enabled = 1 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 1 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 1 ;
      edtSerEst_Jsonclick = "" ;
      edtSerEst_Backcolor = (int)(0xFFFFFF) ;
      edtSerEst_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_100581( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LZ581( ) ;
         standaloneModal1LZ581( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LZ581( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_100581( ) ;
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
      /* Using cursor T01LZ46 */
      pr_default.execute(36, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LZ46_A407EmprNom[0] ;
      n407EmprNom = T01LZ46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(36);
      /* Using cursor T01LZ30 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LZ30_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(22);
      /* Using cursor T01LZ47 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COLFON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(37);
      /* Using cursor T01LZ32 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A2142TotPasFor = T01LZ32_A2142TotPasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = T01LZ32_A6042TotParPas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6048TotPasForP = T01LZ32_A6048TotPasForP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      else
      {
         A2142TotPasFor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrimstr( A2142TotPasFor, 9, 2));
         A6042TotParPas = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6042TotParPas), 2, 0));
         A6048TotPasForP = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrimstr( A6048TotPasForP, 9, 2));
      }
      pr_default.close(23);
      /* Using cursor T01LZ34 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A6047TotColMol = T01LZ34_A6047TotColMol[0] ;
         n6047TotColMol = T01LZ34_n6047TotColMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      else
      {
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
         n6047TotColMol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrimstr( A6047TotColMol, 10, 2));
      }
      pr_default.close(24);
      GX_FocusControl = edtPasForUL_Internalname ;
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
      /* Using cursor T01LZ30 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01LZ30_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Colfon( )
   {
      /* Using cursor T01LZ47 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COLFON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Molcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01LZ32 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A2142TotPasFor = T01LZ32_A2142TotPasFor[0] ;
         A6042TotParPas = T01LZ32_A6042TotParPas[0] ;
         A6048TotPasForP = T01LZ32_A6048TotPasForP[0] ;
      }
      else
      {
         A2142TotPasFor = DecimalUtil.doubleToDec(0) ;
         A6042TotParPas = (byte)(0) ;
         A6048TotPasForP = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(23);
      /* Using cursor T01LZ34 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A6047TotColMol = T01LZ34_A6047TotColMol[0] ;
         n6047TotColMol = T01LZ34_n6047TotColMol[0] ;
      }
      else
      {
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
         n6047TotColMol = false ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2655PasForUL", GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2650MolPesMin", GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2142TotPasFor", GXutil.ltrim( localUtil.ntoc( A2142TotPasFor, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6042TotParPas", GXutil.ltrim( localUtil.ntoc( A6042TotParPas, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6048TotPasForP", GXutil.ltrim( localUtil.ntoc( A6048TotPasForP, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2098MolCod", GXutil.ltrim( localUtil.ntoc( Z2098MolCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2655PasForUL", GXutil.ltrim( localUtil.ntoc( Z2655PasForUL, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2650MolPesMin", GXutil.ltrim( localUtil.ntoc( Z2650MolPesMin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2142TotPasFor", GXutil.ltrim( localUtil.ntoc( Z2142TotPasFor, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6042TotParPas", GXutil.ltrim( localUtil.ntoc( Z6042TotParPas, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6048TotPasForP", GXutil.ltrim( localUtil.ntoc( Z6048TotPasForP, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6047TotColMol", GXutil.ltrim( localUtil.ntoc( Z6047TotColMol, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6048TotPasForP", GXutil.ltrim( localUtil.ntoc( O6048TotPasForP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6042TotParPas", GXutil.ltrim( localUtil.ntoc( O6042TotParPas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2142TotPasFor", GXutil.ltrim( localUtil.ntoc( O2142TotPasFor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pascod( )
   {
      n2107PasCod = false ;
      n2108PasDsc = false ;
      /* Using cursor T01LZ44 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
      }
      A2108PasDsc = T01LZ44_A2108PasDsc[0] ;
      n2108PasDsc = T01LZ44_n2108PasDsc[0] ;
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", GXutil.rtrim( A2108PasDsc));
   }

   public void valid_Uniestcod( )
   {
      n2144UniEstCod = false ;
      /* Using cursor T01LZ48 */
      pr_default.execute(38, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNIESTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
      }
      pr_default.close(38);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_SEREST","{handler:'valid_Serest',iparms:[]");
      setEventMetadata("VALID_SEREST",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_COLCOM","{handler:'valid_Colcom',iparms:[]");
      setEventMetadata("VALID_COLCOM",",oparms:[]}");
      setEventMetadata("VALID_COLFON","{handler:'valid_Colfon',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''}]");
      setEventMetadata("VALID_COLFON",",oparms:[]}");
      setEventMetadata("VALID_MOLCOD","{handler:'valid_Molcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''},{av:'A2098MolCod',fld:'MOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MOLCOD",",oparms:[{av:'A2655PasForUL',fld:'PASFORUL',pic:'ZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2650MolPesMin',fld:'MOLPESMIN',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2142TotPasFor',fld:'TOTPASFOR',pic:'ZZZZZ9.99'},{av:'A6042TotParPas',fld:'TOTPARPAS',pic:'Z9'},{av:'A6048TotPasForP',fld:'TOTPASFORP',pic:'ZZZZZ9.99'},{av:'A6047TotColMol',fld:'TOTCOLMOL',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z2141SerEst'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z2074ColCom'},{av:'Z2078ColFon'},{av:'Z2098MolCod'},{av:'Z2655PasForUL'},{av:'Z407EmprNom'},{av:'Z2650MolPesMin'},{av:'Z279CliNom'},{av:'Z2142TotPasFor'},{av:'Z6042TotParPas'},{av:'Z6048TotPasForP'},{av:'Z6047TotColMol'},{av:'O6048TotPasForP'},{av:'O6042TotParPas'},{av:'O2142TotPasFor'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TOTPARPAS","{handler:'valid_Totparpas',iparms:[]");
      setEventMetadata("VALID_TOTPARPAS",",oparms:[]}");
      setEventMetadata("VALID_TOTCOLMOL","{handler:'valid_Totcolmol',iparms:[]");
      setEventMetadata("VALID_TOTCOLMOL",",oparms:[]}");
      setEventMetadata("VALID_MOLPESMIN","{handler:'valid_Molpesmin',iparms:[]");
      setEventMetadata("VALID_MOLPESMIN",",oparms:[]}");
      setEventMetadata("VALID_TOTPASFORP","{handler:'valid_Totpasforp',iparms:[]");
      setEventMetadata("VALID_TOTPASFORP",",oparms:[]}");
      setEventMetadata("VALID_PASFORLIN","{handler:'valid_Pasforlin',iparms:[]");
      setEventMetadata("VALID_PASFORLIN",",oparms:[]}");
      setEventMetadata("VALID_PASCOD","{handler:'valid_Pascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2107PasCod',fld:'PASCOD',pic:''},{av:'A2108PasDsc',fld:'PASDSC',pic:''}]");
      setEventMetadata("VALID_PASCOD",",oparms:[{av:'A2108PasDsc',fld:'PASDSC',pic:''}]}");
      setEventMetadata("VALID_UNIESTCOD","{handler:'valid_Uniestcod',iparms:[{av:'A2144UniEstCod',fld:'UNIESTCOD',pic:'@!'}]");
      setEventMetadata("VALID_UNIESTCOD",",oparms:[]}");
      setEventMetadata("VALID_PASFORCAN","{handler:'valid_Pasforcan',iparms:[]");
      setEventMetadata("VALID_PASFORCAN",",oparms:[]}");
      setEventMetadata("VALID_PASFORPAR","{handler:'valid_Pasforpar',iparms:[]");
      setEventMetadata("VALID_PASFORPAR",",oparms:[]}");
      setEventMetadata("VALID_PASFORCANP","{handler:'valid_Pasforcanp',iparms:[]");
      setEventMetadata("VALID_PASFORCANP",",oparms:[]}");
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
      pr_default.close(34);
      pr_default.close(38);
      pr_default.close(22);
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2141SerEst = "" ;
      Z1013DibCli = "" ;
      Z2074ColCom = "" ;
      Z2078ColFon = "" ;
      Z2650MolPesMin = DecimalUtil.ZERO ;
      O6048TotPasForP = DecimalUtil.ZERO ;
      O2142TotPasFor = DecimalUtil.ZERO ;
      Z2109PasForCan = DecimalUtil.ZERO ;
      Z2111PasForPre = DecimalUtil.ZERO ;
      Z2112PasForSob = DecimalUtil.ZERO ;
      Z2110PasForCon = DecimalUtil.ZERO ;
      Z6050PasForCanP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
      Z2144UniEstCod = "" ;
      O6050PasForCanP = DecimalUtil.ZERO ;
      O2109PasForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2141SerEst = "" ;
      A1013DibCli = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A2107PasCod = "" ;
      A2144UniEstCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      A2142TotPasFor = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A6047TotColMol = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A6048TotPasForP = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B6048TotPasForP = DecimalUtil.ZERO ;
      B2142TotPasFor = DecimalUtil.ZERO ;
      sMode581 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode557 = "" ;
      s6048TotPasForP = DecimalUtil.ZERO ;
      s2142TotPasFor = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2108PasDsc = "" ;
      A2109PasForCan = DecimalUtil.ZERO ;
      A2111PasForPre = DecimalUtil.ZERO ;
      A2112PasForSob = DecimalUtil.ZERO ;
      A2110PasForCon = DecimalUtil.ZERO ;
      A6044PasForFCan = DecimalUtil.ZERO ;
      A6049PasForFRea = DecimalUtil.ZERO ;
      A6050PasForCanP = DecimalUtil.ZERO ;
      T6050PasForCanP = DecimalUtil.ZERO ;
      T2109PasForCan = DecimalUtil.ZERO ;
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
      Z279CliNom = "" ;
      Z2142TotPasFor = DecimalUtil.ZERO ;
      Z6048TotPasForP = DecimalUtil.ZERO ;
      Z6047TotColMol = DecimalUtil.ZERO ;
      T01LZ8_A407EmprNom = new String[] {""} ;
      T01LZ8_n407EmprNom = new boolean[] {false} ;
      T01LZ17_A2098MolCod = new byte[1] ;
      T01LZ17_A279CliNom = new String[] {""} ;
      T01LZ17_A2655PasForUL = new short[1] ;
      T01LZ17_n2655PasForUL = new boolean[] {false} ;
      T01LZ17_A407EmprNom = new String[] {""} ;
      T01LZ17_n407EmprNom = new boolean[] {false} ;
      T01LZ17_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ17_n2650MolPesMin = new boolean[] {false} ;
      T01LZ17_A396EmprCod = new String[] {""} ;
      T01LZ17_A252CliCod = new int[1] ;
      T01LZ17_A1013DibCli = new String[] {""} ;
      T01LZ17_A1014DibInt = new int[1] ;
      T01LZ17_A2141SerEst = new String[] {""} ;
      T01LZ17_A2074ColCom = new String[] {""} ;
      T01LZ17_A2078ColFon = new String[] {""} ;
      T01LZ17_A2142TotPasFor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ17_A6042TotParPas = new byte[1] ;
      T01LZ17_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ17_n6047TotColMol = new boolean[] {false} ;
      T01LZ17_A6048TotPasForP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ9_A279CliNom = new String[] {""} ;
      T01LZ10_A396EmprCod = new String[] {""} ;
      T01LZ12_A2142TotPasFor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ12_A6042TotParPas = new byte[1] ;
      T01LZ12_A6048TotPasForP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ14_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ14_n6047TotColMol = new boolean[] {false} ;
      T01LZ18_A279CliNom = new String[] {""} ;
      T01LZ19_A396EmprCod = new String[] {""} ;
      T01LZ21_A2142TotPasFor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ21_A6042TotParPas = new byte[1] ;
      T01LZ21_A6048TotPasForP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ23_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ23_n6047TotColMol = new boolean[] {false} ;
      T01LZ24_A396EmprCod = new String[] {""} ;
      T01LZ24_A252CliCod = new int[1] ;
      T01LZ24_A2141SerEst = new String[] {""} ;
      T01LZ24_A1013DibCli = new String[] {""} ;
      T01LZ24_A1014DibInt = new int[1] ;
      T01LZ24_A2074ColCom = new String[] {""} ;
      T01LZ24_A2078ColFon = new String[] {""} ;
      T01LZ24_A2098MolCod = new byte[1] ;
      T01LZ7_A2098MolCod = new byte[1] ;
      T01LZ7_A2655PasForUL = new short[1] ;
      T01LZ7_n2655PasForUL = new boolean[] {false} ;
      T01LZ7_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ7_n2650MolPesMin = new boolean[] {false} ;
      T01LZ7_A396EmprCod = new String[] {""} ;
      T01LZ7_A252CliCod = new int[1] ;
      T01LZ7_A1013DibCli = new String[] {""} ;
      T01LZ7_A1014DibInt = new int[1] ;
      T01LZ7_A2141SerEst = new String[] {""} ;
      T01LZ7_A2074ColCom = new String[] {""} ;
      T01LZ7_A2078ColFon = new String[] {""} ;
      T01LZ25_A396EmprCod = new String[] {""} ;
      T01LZ25_A252CliCod = new int[1] ;
      T01LZ25_A2141SerEst = new String[] {""} ;
      T01LZ25_A1013DibCli = new String[] {""} ;
      T01LZ25_A1014DibInt = new int[1] ;
      T01LZ25_A2074ColCom = new String[] {""} ;
      T01LZ25_A2078ColFon = new String[] {""} ;
      T01LZ25_A2098MolCod = new byte[1] ;
      T01LZ26_A396EmprCod = new String[] {""} ;
      T01LZ26_A252CliCod = new int[1] ;
      T01LZ26_A2141SerEst = new String[] {""} ;
      T01LZ26_A1013DibCli = new String[] {""} ;
      T01LZ26_A1014DibInt = new int[1] ;
      T01LZ26_A2074ColCom = new String[] {""} ;
      T01LZ26_A2078ColFon = new String[] {""} ;
      T01LZ26_A2098MolCod = new byte[1] ;
      T01LZ6_A2098MolCod = new byte[1] ;
      T01LZ6_A2655PasForUL = new short[1] ;
      T01LZ6_n2655PasForUL = new boolean[] {false} ;
      T01LZ6_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ6_n2650MolPesMin = new boolean[] {false} ;
      T01LZ6_A396EmprCod = new String[] {""} ;
      T01LZ6_A252CliCod = new int[1] ;
      T01LZ6_A1013DibCli = new String[] {""} ;
      T01LZ6_A1014DibInt = new int[1] ;
      T01LZ6_A2141SerEst = new String[] {""} ;
      T01LZ6_A2074ColCom = new String[] {""} ;
      T01LZ6_A2078ColFon = new String[] {""} ;
      T01LZ30_A279CliNom = new String[] {""} ;
      T01LZ32_A2142TotPasFor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ32_A6042TotParPas = new byte[1] ;
      T01LZ32_A6048TotPasForP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ34_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ34_n6047TotColMol = new boolean[] {false} ;
      T01LZ35_A396EmprCod = new String[] {""} ;
      T01LZ35_A252CliCod = new int[1] ;
      T01LZ35_A2141SerEst = new String[] {""} ;
      T01LZ35_A1013DibCli = new String[] {""} ;
      T01LZ35_A1014DibInt = new int[1] ;
      T01LZ35_A2074ColCom = new String[] {""} ;
      T01LZ35_A2078ColFon = new String[] {""} ;
      T01LZ35_A2098MolCod = new byte[1] ;
      T01LZ35_A2535ForPrdLin = new short[1] ;
      T01LZ36_A396EmprCod = new String[] {""} ;
      T01LZ36_A252CliCod = new int[1] ;
      T01LZ36_A2141SerEst = new String[] {""} ;
      T01LZ36_A1013DibCli = new String[] {""} ;
      T01LZ36_A1014DibInt = new int[1] ;
      T01LZ36_A2074ColCom = new String[] {""} ;
      T01LZ36_A2078ColFon = new String[] {""} ;
      T01LZ36_A2098MolCod = new byte[1] ;
      Z2108PasDsc = "" ;
      T01LZ37_A252CliCod = new int[1] ;
      T01LZ37_A2141SerEst = new String[] {""} ;
      T01LZ37_A1013DibCli = new String[] {""} ;
      T01LZ37_A1014DibInt = new int[1] ;
      T01LZ37_A2074ColCom = new String[] {""} ;
      T01LZ37_A2078ColFon = new String[] {""} ;
      T01LZ37_A2098MolCod = new byte[1] ;
      T01LZ37_A2654PasForLin = new short[1] ;
      T01LZ37_A2108PasDsc = new String[] {""} ;
      T01LZ37_n2108PasDsc = new boolean[] {false} ;
      T01LZ37_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ37_n2109PasForCan = new boolean[] {false} ;
      T01LZ37_A2111PasForPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ37_n2111PasForPre = new boolean[] {false} ;
      T01LZ37_A2112PasForSob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ37_n2112PasForSob = new boolean[] {false} ;
      T01LZ37_A2110PasForCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ37_n2110PasForCon = new boolean[] {false} ;
      T01LZ37_A6043PasForPar = new short[1] ;
      T01LZ37_n6043PasForPar = new boolean[] {false} ;
      T01LZ37_A6050PasForCanP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ37_n6050PasForCanP = new boolean[] {false} ;
      T01LZ37_A396EmprCod = new String[] {""} ;
      T01LZ37_A2107PasCod = new String[] {""} ;
      T01LZ37_n2107PasCod = new boolean[] {false} ;
      T01LZ37_A2144UniEstCod = new String[] {""} ;
      T01LZ37_n2144UniEstCod = new boolean[] {false} ;
      T01LZ4_A2108PasDsc = new String[] {""} ;
      T01LZ4_n2108PasDsc = new boolean[] {false} ;
      T01LZ5_A2144UniEstCod = new String[] {""} ;
      T01LZ5_n2144UniEstCod = new boolean[] {false} ;
      T01LZ38_A2108PasDsc = new String[] {""} ;
      T01LZ38_n2108PasDsc = new boolean[] {false} ;
      T01LZ39_A2144UniEstCod = new String[] {""} ;
      T01LZ39_n2144UniEstCod = new boolean[] {false} ;
      T01LZ40_A396EmprCod = new String[] {""} ;
      T01LZ40_A252CliCod = new int[1] ;
      T01LZ40_A2141SerEst = new String[] {""} ;
      T01LZ40_A1013DibCli = new String[] {""} ;
      T01LZ40_A1014DibInt = new int[1] ;
      T01LZ40_A2074ColCom = new String[] {""} ;
      T01LZ40_A2078ColFon = new String[] {""} ;
      T01LZ40_A2098MolCod = new byte[1] ;
      T01LZ40_A2654PasForLin = new short[1] ;
      T01LZ3_A252CliCod = new int[1] ;
      T01LZ3_A2141SerEst = new String[] {""} ;
      T01LZ3_A1013DibCli = new String[] {""} ;
      T01LZ3_A1014DibInt = new int[1] ;
      T01LZ3_A2074ColCom = new String[] {""} ;
      T01LZ3_A2078ColFon = new String[] {""} ;
      T01LZ3_A2098MolCod = new byte[1] ;
      T01LZ3_A2654PasForLin = new short[1] ;
      T01LZ3_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ3_n2109PasForCan = new boolean[] {false} ;
      T01LZ3_A2111PasForPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ3_n2111PasForPre = new boolean[] {false} ;
      T01LZ3_A2112PasForSob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ3_n2112PasForSob = new boolean[] {false} ;
      T01LZ3_A2110PasForCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ3_n2110PasForCon = new boolean[] {false} ;
      T01LZ3_A6043PasForPar = new short[1] ;
      T01LZ3_n6043PasForPar = new boolean[] {false} ;
      T01LZ3_A6050PasForCanP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ3_n6050PasForCanP = new boolean[] {false} ;
      T01LZ3_A396EmprCod = new String[] {""} ;
      T01LZ3_A2107PasCod = new String[] {""} ;
      T01LZ3_n2107PasCod = new boolean[] {false} ;
      T01LZ3_A2144UniEstCod = new String[] {""} ;
      T01LZ3_n2144UniEstCod = new boolean[] {false} ;
      T01LZ2_A252CliCod = new int[1] ;
      T01LZ2_A2141SerEst = new String[] {""} ;
      T01LZ2_A1013DibCli = new String[] {""} ;
      T01LZ2_A1014DibInt = new int[1] ;
      T01LZ2_A2074ColCom = new String[] {""} ;
      T01LZ2_A2078ColFon = new String[] {""} ;
      T01LZ2_A2098MolCod = new byte[1] ;
      T01LZ2_A2654PasForLin = new short[1] ;
      T01LZ2_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ2_n2109PasForCan = new boolean[] {false} ;
      T01LZ2_A2111PasForPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ2_n2111PasForPre = new boolean[] {false} ;
      T01LZ2_A2112PasForSob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ2_n2112PasForSob = new boolean[] {false} ;
      T01LZ2_A2110PasForCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ2_n2110PasForCon = new boolean[] {false} ;
      T01LZ2_A6043PasForPar = new short[1] ;
      T01LZ2_n6043PasForPar = new boolean[] {false} ;
      T01LZ2_A6050PasForCanP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LZ2_n6050PasForCanP = new boolean[] {false} ;
      T01LZ2_A396EmprCod = new String[] {""} ;
      T01LZ2_A2107PasCod = new String[] {""} ;
      T01LZ2_n2107PasCod = new boolean[] {false} ;
      T01LZ2_A2144UniEstCod = new String[] {""} ;
      T01LZ2_n2144UniEstCod = new boolean[] {false} ;
      T01LZ44_A2108PasDsc = new String[] {""} ;
      T01LZ44_n2108PasDsc = new boolean[] {false} ;
      T01LZ45_A396EmprCod = new String[] {""} ;
      T01LZ45_A252CliCod = new int[1] ;
      T01LZ45_A2141SerEst = new String[] {""} ;
      T01LZ45_A1013DibCli = new String[] {""} ;
      T01LZ45_A1014DibInt = new int[1] ;
      T01LZ45_A2074ColCom = new String[] {""} ;
      T01LZ45_A2078ColFon = new String[] {""} ;
      T01LZ45_A2098MolCod = new byte[1] ;
      T01LZ45_A2654PasForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01LZ46_A407EmprNom = new String[] {""} ;
      T01LZ46_n407EmprNom = new boolean[] {false} ;
      T01LZ47_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2141SerEst = "" ;
      ZZ1013DibCli = "" ;
      ZZ2074ColCom = "" ;
      ZZ2078ColFon = "" ;
      ZZ407EmprNom = "" ;
      ZZ2650MolPesMin = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      ZZ2142TotPasFor = DecimalUtil.ZERO ;
      ZZ6048TotPasForP = DecimalUtil.ZERO ;
      ZZ6047TotColMol = DecimalUtil.ZERO ;
      ZO6048TotPasForP = DecimalUtil.ZERO ;
      ZO2142TotPasFor = DecimalUtil.ZERO ;
      T01LZ48_A2144UniEstCod = new String[] {""} ;
      T01LZ48_n2144UniEstCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn21__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn21__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn21__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn21__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn21__default(),
         new Object[] {
             new Object[] {
            T01LZ2_A252CliCod, T01LZ2_A2141SerEst, T01LZ2_A1013DibCli, T01LZ2_A1014DibInt, T01LZ2_A2074ColCom, T01LZ2_A2078ColFon, T01LZ2_A2098MolCod, T01LZ2_A2654PasForLin, T01LZ2_A2109PasForCan, T01LZ2_n2109PasForCan,
            T01LZ2_A2111PasForPre, T01LZ2_n2111PasForPre, T01LZ2_A2112PasForSob, T01LZ2_n2112PasForSob, T01LZ2_A2110PasForCon, T01LZ2_n2110PasForCon, T01LZ2_A6043PasForPar, T01LZ2_n6043PasForPar, T01LZ2_A6050PasForCanP, T01LZ2_n6050PasForCanP,
            T01LZ2_A396EmprCod, T01LZ2_A2107PasCod, T01LZ2_n2107PasCod, T01LZ2_A2144UniEstCod, T01LZ2_n2144UniEstCod
            }
            , new Object[] {
            T01LZ3_A252CliCod, T01LZ3_A2141SerEst, T01LZ3_A1013DibCli, T01LZ3_A1014DibInt, T01LZ3_A2074ColCom, T01LZ3_A2078ColFon, T01LZ3_A2098MolCod, T01LZ3_A2654PasForLin, T01LZ3_A2109PasForCan, T01LZ3_n2109PasForCan,
            T01LZ3_A2111PasForPre, T01LZ3_n2111PasForPre, T01LZ3_A2112PasForSob, T01LZ3_n2112PasForSob, T01LZ3_A2110PasForCon, T01LZ3_n2110PasForCon, T01LZ3_A6043PasForPar, T01LZ3_n6043PasForPar, T01LZ3_A6050PasForCanP, T01LZ3_n6050PasForCanP,
            T01LZ3_A396EmprCod, T01LZ3_A2107PasCod, T01LZ3_n2107PasCod, T01LZ3_A2144UniEstCod, T01LZ3_n2144UniEstCod
            }
            , new Object[] {
            T01LZ4_A2108PasDsc, T01LZ4_n2108PasDsc
            }
            , new Object[] {
            T01LZ5_A2144UniEstCod
            }
            , new Object[] {
            T01LZ6_A2098MolCod, T01LZ6_A2655PasForUL, T01LZ6_n2655PasForUL, T01LZ6_A2650MolPesMin, T01LZ6_n2650MolPesMin, T01LZ6_A396EmprCod, T01LZ6_A252CliCod, T01LZ6_A1013DibCli, T01LZ6_A1014DibInt, T01LZ6_A2141SerEst,
            T01LZ6_A2074ColCom, T01LZ6_A2078ColFon
            }
            , new Object[] {
            T01LZ7_A2098MolCod, T01LZ7_A2655PasForUL, T01LZ7_n2655PasForUL, T01LZ7_A2650MolPesMin, T01LZ7_n2650MolPesMin, T01LZ7_A396EmprCod, T01LZ7_A252CliCod, T01LZ7_A1013DibCli, T01LZ7_A1014DibInt, T01LZ7_A2141SerEst,
            T01LZ7_A2074ColCom, T01LZ7_A2078ColFon
            }
            , new Object[] {
            T01LZ8_A407EmprNom, T01LZ8_n407EmprNom
            }
            , new Object[] {
            T01LZ9_A279CliNom
            }
            , new Object[] {
            T01LZ10_A396EmprCod
            }
            , new Object[] {
            T01LZ12_A2142TotPasFor, T01LZ12_A6042TotParPas, T01LZ12_A6048TotPasForP
            }
            , new Object[] {
            T01LZ14_A6047TotColMol, T01LZ14_n6047TotColMol
            }
            , new Object[] {
            T01LZ17_A2098MolCod, T01LZ17_A279CliNom, T01LZ17_A2655PasForUL, T01LZ17_n2655PasForUL, T01LZ17_A407EmprNom, T01LZ17_n407EmprNom, T01LZ17_A2650MolPesMin, T01LZ17_n2650MolPesMin, T01LZ17_A396EmprCod, T01LZ17_A252CliCod,
            T01LZ17_A1013DibCli, T01LZ17_A1014DibInt, T01LZ17_A2141SerEst, T01LZ17_A2074ColCom, T01LZ17_A2078ColFon, T01LZ17_A2142TotPasFor, T01LZ17_A6042TotParPas, T01LZ17_A6047TotColMol, T01LZ17_n6047TotColMol, T01LZ17_A6048TotPasForP
            }
            , new Object[] {
            T01LZ18_A279CliNom
            }
            , new Object[] {
            T01LZ19_A396EmprCod
            }
            , new Object[] {
            T01LZ21_A2142TotPasFor, T01LZ21_A6042TotParPas, T01LZ21_A6048TotPasForP
            }
            , new Object[] {
            T01LZ23_A6047TotColMol, T01LZ23_n6047TotColMol
            }
            , new Object[] {
            T01LZ24_A396EmprCod, T01LZ24_A252CliCod, T01LZ24_A2141SerEst, T01LZ24_A1013DibCli, T01LZ24_A1014DibInt, T01LZ24_A2074ColCom, T01LZ24_A2078ColFon, T01LZ24_A2098MolCod
            }
            , new Object[] {
            T01LZ25_A396EmprCod, T01LZ25_A252CliCod, T01LZ25_A2141SerEst, T01LZ25_A1013DibCli, T01LZ25_A1014DibInt, T01LZ25_A2074ColCom, T01LZ25_A2078ColFon, T01LZ25_A2098MolCod
            }
            , new Object[] {
            T01LZ26_A396EmprCod, T01LZ26_A252CliCod, T01LZ26_A2141SerEst, T01LZ26_A1013DibCli, T01LZ26_A1014DibInt, T01LZ26_A2074ColCom, T01LZ26_A2078ColFon, T01LZ26_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LZ30_A279CliNom
            }
            , new Object[] {
            T01LZ32_A2142TotPasFor, T01LZ32_A6042TotParPas, T01LZ32_A6048TotPasForP
            }
            , new Object[] {
            T01LZ34_A6047TotColMol, T01LZ34_n6047TotColMol
            }
            , new Object[] {
            T01LZ35_A396EmprCod, T01LZ35_A252CliCod, T01LZ35_A2141SerEst, T01LZ35_A1013DibCli, T01LZ35_A1014DibInt, T01LZ35_A2074ColCom, T01LZ35_A2078ColFon, T01LZ35_A2098MolCod, T01LZ35_A2535ForPrdLin
            }
            , new Object[] {
            T01LZ36_A396EmprCod, T01LZ36_A252CliCod, T01LZ36_A2141SerEst, T01LZ36_A1013DibCli, T01LZ36_A1014DibInt, T01LZ36_A2074ColCom, T01LZ36_A2078ColFon, T01LZ36_A2098MolCod
            }
            , new Object[] {
            T01LZ37_A252CliCod, T01LZ37_A2141SerEst, T01LZ37_A1013DibCli, T01LZ37_A1014DibInt, T01LZ37_A2074ColCom, T01LZ37_A2078ColFon, T01LZ37_A2098MolCod, T01LZ37_A2654PasForLin, T01LZ37_A2108PasDsc, T01LZ37_n2108PasDsc,
            T01LZ37_A2109PasForCan, T01LZ37_n2109PasForCan, T01LZ37_A2111PasForPre, T01LZ37_n2111PasForPre, T01LZ37_A2112PasForSob, T01LZ37_n2112PasForSob, T01LZ37_A2110PasForCon, T01LZ37_n2110PasForCon, T01LZ37_A6043PasForPar, T01LZ37_n6043PasForPar,
            T01LZ37_A6050PasForCanP, T01LZ37_n6050PasForCanP, T01LZ37_A396EmprCod, T01LZ37_A2107PasCod, T01LZ37_n2107PasCod, T01LZ37_A2144UniEstCod, T01LZ37_n2144UniEstCod
            }
            , new Object[] {
            T01LZ38_A2108PasDsc, T01LZ38_n2108PasDsc
            }
            , new Object[] {
            T01LZ39_A2144UniEstCod
            }
            , new Object[] {
            T01LZ40_A396EmprCod, T01LZ40_A252CliCod, T01LZ40_A2141SerEst, T01LZ40_A1013DibCli, T01LZ40_A1014DibInt, T01LZ40_A2074ColCom, T01LZ40_A2078ColFon, T01LZ40_A2098MolCod, T01LZ40_A2654PasForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LZ44_A2108PasDsc, T01LZ44_n2108PasDsc
            }
            , new Object[] {
            T01LZ45_A396EmprCod, T01LZ45_A252CliCod, T01LZ45_A2141SerEst, T01LZ45_A1013DibCli, T01LZ45_A1014DibInt, T01LZ45_A2074ColCom, T01LZ45_A2078ColFon, T01LZ45_A2098MolCod, T01LZ45_A2654PasForLin
            }
            , new Object[] {
            T01LZ46_A407EmprNom, T01LZ46_n407EmprNom
            }
            , new Object[] {
            T01LZ47_A396EmprCod
            }
            , new Object[] {
            T01LZ48_A2144UniEstCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTrn21" ;
   }

   private byte Z2098MolCod ;
   private byte O6042TotParPas ;
   private byte GxWebError ;
   private byte A2098MolCod ;
   private byte nKeyPressed ;
   private byte A6042TotParPas ;
   private byte B6042TotParPas ;
   private byte s6042TotParPas ;
   private byte Z6042TotParPas ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ2098MolCod ;
   private byte ZZ6042TotParPas ;
   private byte ZO6042TotParPas ;
   private short Z2655PasForUL ;
   private short Z2654PasForLin ;
   private short Z6043PasForPar ;
   private short O6043PasForPar ;
   private short nRcdDeleted_581 ;
   private short nRcdExists_581 ;
   private short nIsMod_581 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2655PasForUL ;
   private short nBlankRcdCount581 ;
   private short RcdFound581 ;
   private short nBlankRcdUsr581 ;
   private short A2654PasForLin ;
   private short A6043PasForPar ;
   private short T6043PasForPar ;
   private short RcdFound557 ;
   private short nIsDirty_557 ;
   private short nIsDirty_581 ;
   private short ZZ2655PasForUL ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtSerEst_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtColCom_Enabled ;
   private int edtColFon_Enabled ;
   private int edtMolCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTotPasFor_Enabled ;
   private int edtPasForUL_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTotParPas_Enabled ;
   private int edtTotColMol_Enabled ;
   private int edtMolPesMin_Enabled ;
   private int edtTotPasForP_Enabled ;
   private int edtavnRcdDeleted_581_Enabled ;
   private int edtPasForLin_Enabled ;
   private int edtPasCod_Enabled ;
   private int edtPasDsc_Enabled ;
   private int edtUniEstCod_Enabled ;
   private int edtPasForCan_Enabled ;
   private int edtPasForPre_Enabled ;
   private int edtPasForSob_Enabled ;
   private int edtPasForCon_Enabled ;
   private int edtPasForPar_Enabled ;
   private int edtPasForFCan_Enabled ;
   private int edtPasForFRea_Enabled ;
   private int edtPasForCanP_Enabled ;
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
   private int defedtPasForLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTotPasForP_Backcolor ;
   private int edtMolPesMin_Backcolor ;
   private int edtTotColMol_Backcolor ;
   private int edtTotParPas_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPasForUL_Backcolor ;
   private int edtTotPasFor_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtMolCod_Backcolor ;
   private int edtColFon_Backcolor ;
   private int edtColCom_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtSerEst_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2650MolPesMin ;
   private java.math.BigDecimal O6048TotPasForP ;
   private java.math.BigDecimal O2142TotPasFor ;
   private java.math.BigDecimal Z2109PasForCan ;
   private java.math.BigDecimal Z2111PasForPre ;
   private java.math.BigDecimal Z2112PasForSob ;
   private java.math.BigDecimal Z2110PasForCon ;
   private java.math.BigDecimal Z6050PasForCanP ;
   private java.math.BigDecimal O6050PasForCanP ;
   private java.math.BigDecimal O2109PasForCan ;
   private java.math.BigDecimal A2142TotPasFor ;
   private java.math.BigDecimal A6047TotColMol ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal A6048TotPasForP ;
   private java.math.BigDecimal B6048TotPasForP ;
   private java.math.BigDecimal B2142TotPasFor ;
   private java.math.BigDecimal s6048TotPasForP ;
   private java.math.BigDecimal s2142TotPasFor ;
   private java.math.BigDecimal A2109PasForCan ;
   private java.math.BigDecimal A2111PasForPre ;
   private java.math.BigDecimal A2112PasForSob ;
   private java.math.BigDecimal A2110PasForCon ;
   private java.math.BigDecimal A6044PasForFCan ;
   private java.math.BigDecimal A6049PasForFRea ;
   private java.math.BigDecimal A6050PasForCanP ;
   private java.math.BigDecimal T6050PasForCanP ;
   private java.math.BigDecimal T2109PasForCan ;
   private java.math.BigDecimal Z2142TotPasFor ;
   private java.math.BigDecimal Z6048TotPasForP ;
   private java.math.BigDecimal Z6047TotColMol ;
   private java.math.BigDecimal ZZ2650MolPesMin ;
   private java.math.BigDecimal ZZ2142TotPasFor ;
   private java.math.BigDecimal ZZ6048TotPasForP ;
   private java.math.BigDecimal ZZ6047TotColMol ;
   private java.math.BigDecimal ZO6048TotPasForP ;
   private java.math.BigDecimal ZO2142TotPasFor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2141SerEst ;
   private String Z1013DibCli ;
   private String Z2074ColCom ;
   private String Z2078ColFon ;
   private String Z2107PasCod ;
   private String Z2144UniEstCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A2107PasCod ;
   private String A2144UniEstCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_100_idx="0001" ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtSerEst_Internalname ;
   private String edtSerEst_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtColCom_Internalname ;
   private String edtColCom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtColFon_Internalname ;
   private String edtColFon_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMolCod_Internalname ;
   private String edtMolCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTotPasFor_Internalname ;
   private String edtTotPasFor_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPasForUL_Internalname ;
   private String edtPasForUL_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTotParPas_Internalname ;
   private String edtTotParPas_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTotColMol_Internalname ;
   private String edtTotColMol_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtMolPesMin_Internalname ;
   private String edtMolPesMin_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtTotPasForP_Internalname ;
   private String edtTotPasForP_Jsonclick ;
   private String sMode581 ;
   private String edtavnRcdDeleted_581_Internalname ;
   private String edtPasForLin_Internalname ;
   private String edtPasCod_Internalname ;
   private String edtPasDsc_Internalname ;
   private String edtUniEstCod_Internalname ;
   private String edtPasForCan_Internalname ;
   private String edtPasForPre_Internalname ;
   private String edtPasForSob_Internalname ;
   private String edtPasForCon_Internalname ;
   private String edtPasForPar_Internalname ;
   private String edtPasForFCan_Internalname ;
   private String edtPasForFRea_Internalname ;
   private String edtPasForCanP_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode557 ;
   private String GXCCtl ;
   private String A2108PasDsc ;
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
   private String Z279CliNom ;
   private String Z2108PasDsc ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_581_Jsonclick ;
   private String edtPasForLin_Jsonclick ;
   private String edtPasCod_Jsonclick ;
   private String edtPasDsc_Jsonclick ;
   private String edtUniEstCod_Jsonclick ;
   private String edtPasForCan_Jsonclick ;
   private String edtPasForPre_Jsonclick ;
   private String edtPasForSob_Jsonclick ;
   private String edtPasForCon_Jsonclick ;
   private String edtPasForPar_Jsonclick ;
   private String edtPasForFCan_Jsonclick ;
   private String edtPasForFRea_Jsonclick ;
   private String edtPasForCanP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2141SerEst ;
   private String ZZ1013DibCli ;
   private String ZZ2074ColCom ;
   private String ZZ2078ColFon ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2107PasCod ;
   private boolean n2144UniEstCod ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n2655PasForUL ;
   private boolean n407EmprNom ;
   private boolean n6047TotColMol ;
   private boolean n2650MolPesMin ;
   private boolean returnInSub ;
   private boolean n2108PasDsc ;
   private boolean n2109PasForCan ;
   private boolean n2111PasForPre ;
   private boolean n2112PasForSob ;
   private boolean n2110PasForCon ;
   private boolean n6043PasForPar ;
   private boolean n6050PasForCanP ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01LZ8_A407EmprNom ;
   private boolean[] T01LZ8_n407EmprNom ;
   private byte[] T01LZ17_A2098MolCod ;
   private String[] T01LZ17_A279CliNom ;
   private short[] T01LZ17_A2655PasForUL ;
   private boolean[] T01LZ17_n2655PasForUL ;
   private String[] T01LZ17_A407EmprNom ;
   private boolean[] T01LZ17_n407EmprNom ;
   private java.math.BigDecimal[] T01LZ17_A2650MolPesMin ;
   private boolean[] T01LZ17_n2650MolPesMin ;
   private String[] T01LZ17_A396EmprCod ;
   private int[] T01LZ17_A252CliCod ;
   private String[] T01LZ17_A1013DibCli ;
   private int[] T01LZ17_A1014DibInt ;
   private String[] T01LZ17_A2141SerEst ;
   private String[] T01LZ17_A2074ColCom ;
   private String[] T01LZ17_A2078ColFon ;
   private java.math.BigDecimal[] T01LZ17_A2142TotPasFor ;
   private byte[] T01LZ17_A6042TotParPas ;
   private java.math.BigDecimal[] T01LZ17_A6047TotColMol ;
   private boolean[] T01LZ17_n6047TotColMol ;
   private java.math.BigDecimal[] T01LZ17_A6048TotPasForP ;
   private String[] T01LZ9_A279CliNom ;
   private String[] T01LZ10_A396EmprCod ;
   private java.math.BigDecimal[] T01LZ12_A2142TotPasFor ;
   private byte[] T01LZ12_A6042TotParPas ;
   private java.math.BigDecimal[] T01LZ12_A6048TotPasForP ;
   private java.math.BigDecimal[] T01LZ14_A6047TotColMol ;
   private boolean[] T01LZ14_n6047TotColMol ;
   private String[] T01LZ18_A279CliNom ;
   private String[] T01LZ19_A396EmprCod ;
   private java.math.BigDecimal[] T01LZ21_A2142TotPasFor ;
   private byte[] T01LZ21_A6042TotParPas ;
   private java.math.BigDecimal[] T01LZ21_A6048TotPasForP ;
   private java.math.BigDecimal[] T01LZ23_A6047TotColMol ;
   private boolean[] T01LZ23_n6047TotColMol ;
   private String[] T01LZ24_A396EmprCod ;
   private int[] T01LZ24_A252CliCod ;
   private String[] T01LZ24_A2141SerEst ;
   private String[] T01LZ24_A1013DibCli ;
   private int[] T01LZ24_A1014DibInt ;
   private String[] T01LZ24_A2074ColCom ;
   private String[] T01LZ24_A2078ColFon ;
   private byte[] T01LZ24_A2098MolCod ;
   private byte[] T01LZ7_A2098MolCod ;
   private short[] T01LZ7_A2655PasForUL ;
   private boolean[] T01LZ7_n2655PasForUL ;
   private java.math.BigDecimal[] T01LZ7_A2650MolPesMin ;
   private boolean[] T01LZ7_n2650MolPesMin ;
   private String[] T01LZ7_A396EmprCod ;
   private int[] T01LZ7_A252CliCod ;
   private String[] T01LZ7_A1013DibCli ;
   private int[] T01LZ7_A1014DibInt ;
   private String[] T01LZ7_A2141SerEst ;
   private String[] T01LZ7_A2074ColCom ;
   private String[] T01LZ7_A2078ColFon ;
   private String[] T01LZ25_A396EmprCod ;
   private int[] T01LZ25_A252CliCod ;
   private String[] T01LZ25_A2141SerEst ;
   private String[] T01LZ25_A1013DibCli ;
   private int[] T01LZ25_A1014DibInt ;
   private String[] T01LZ25_A2074ColCom ;
   private String[] T01LZ25_A2078ColFon ;
   private byte[] T01LZ25_A2098MolCod ;
   private String[] T01LZ26_A396EmprCod ;
   private int[] T01LZ26_A252CliCod ;
   private String[] T01LZ26_A2141SerEst ;
   private String[] T01LZ26_A1013DibCli ;
   private int[] T01LZ26_A1014DibInt ;
   private String[] T01LZ26_A2074ColCom ;
   private String[] T01LZ26_A2078ColFon ;
   private byte[] T01LZ26_A2098MolCod ;
   private byte[] T01LZ6_A2098MolCod ;
   private short[] T01LZ6_A2655PasForUL ;
   private boolean[] T01LZ6_n2655PasForUL ;
   private java.math.BigDecimal[] T01LZ6_A2650MolPesMin ;
   private boolean[] T01LZ6_n2650MolPesMin ;
   private String[] T01LZ6_A396EmprCod ;
   private int[] T01LZ6_A252CliCod ;
   private String[] T01LZ6_A1013DibCli ;
   private int[] T01LZ6_A1014DibInt ;
   private String[] T01LZ6_A2141SerEst ;
   private String[] T01LZ6_A2074ColCom ;
   private String[] T01LZ6_A2078ColFon ;
   private String[] T01LZ30_A279CliNom ;
   private java.math.BigDecimal[] T01LZ32_A2142TotPasFor ;
   private byte[] T01LZ32_A6042TotParPas ;
   private java.math.BigDecimal[] T01LZ32_A6048TotPasForP ;
   private java.math.BigDecimal[] T01LZ34_A6047TotColMol ;
   private boolean[] T01LZ34_n6047TotColMol ;
   private String[] T01LZ35_A396EmprCod ;
   private int[] T01LZ35_A252CliCod ;
   private String[] T01LZ35_A2141SerEst ;
   private String[] T01LZ35_A1013DibCli ;
   private int[] T01LZ35_A1014DibInt ;
   private String[] T01LZ35_A2074ColCom ;
   private String[] T01LZ35_A2078ColFon ;
   private byte[] T01LZ35_A2098MolCod ;
   private short[] T01LZ35_A2535ForPrdLin ;
   private String[] T01LZ36_A396EmprCod ;
   private int[] T01LZ36_A252CliCod ;
   private String[] T01LZ36_A2141SerEst ;
   private String[] T01LZ36_A1013DibCli ;
   private int[] T01LZ36_A1014DibInt ;
   private String[] T01LZ36_A2074ColCom ;
   private String[] T01LZ36_A2078ColFon ;
   private byte[] T01LZ36_A2098MolCod ;
   private int[] T01LZ37_A252CliCod ;
   private String[] T01LZ37_A2141SerEst ;
   private String[] T01LZ37_A1013DibCli ;
   private int[] T01LZ37_A1014DibInt ;
   private String[] T01LZ37_A2074ColCom ;
   private String[] T01LZ37_A2078ColFon ;
   private byte[] T01LZ37_A2098MolCod ;
   private short[] T01LZ37_A2654PasForLin ;
   private String[] T01LZ37_A2108PasDsc ;
   private boolean[] T01LZ37_n2108PasDsc ;
   private java.math.BigDecimal[] T01LZ37_A2109PasForCan ;
   private boolean[] T01LZ37_n2109PasForCan ;
   private java.math.BigDecimal[] T01LZ37_A2111PasForPre ;
   private boolean[] T01LZ37_n2111PasForPre ;
   private java.math.BigDecimal[] T01LZ37_A2112PasForSob ;
   private boolean[] T01LZ37_n2112PasForSob ;
   private java.math.BigDecimal[] T01LZ37_A2110PasForCon ;
   private boolean[] T01LZ37_n2110PasForCon ;
   private short[] T01LZ37_A6043PasForPar ;
   private boolean[] T01LZ37_n6043PasForPar ;
   private java.math.BigDecimal[] T01LZ37_A6050PasForCanP ;
   private boolean[] T01LZ37_n6050PasForCanP ;
   private String[] T01LZ37_A396EmprCod ;
   private String[] T01LZ37_A2107PasCod ;
   private boolean[] T01LZ37_n2107PasCod ;
   private String[] T01LZ37_A2144UniEstCod ;
   private boolean[] T01LZ37_n2144UniEstCod ;
   private String[] T01LZ4_A2108PasDsc ;
   private boolean[] T01LZ4_n2108PasDsc ;
   private String[] T01LZ5_A2144UniEstCod ;
   private boolean[] T01LZ5_n2144UniEstCod ;
   private String[] T01LZ38_A2108PasDsc ;
   private boolean[] T01LZ38_n2108PasDsc ;
   private String[] T01LZ39_A2144UniEstCod ;
   private boolean[] T01LZ39_n2144UniEstCod ;
   private String[] T01LZ40_A396EmprCod ;
   private int[] T01LZ40_A252CliCod ;
   private String[] T01LZ40_A2141SerEst ;
   private String[] T01LZ40_A1013DibCli ;
   private int[] T01LZ40_A1014DibInt ;
   private String[] T01LZ40_A2074ColCom ;
   private String[] T01LZ40_A2078ColFon ;
   private byte[] T01LZ40_A2098MolCod ;
   private short[] T01LZ40_A2654PasForLin ;
   private int[] T01LZ3_A252CliCod ;
   private String[] T01LZ3_A2141SerEst ;
   private String[] T01LZ3_A1013DibCli ;
   private int[] T01LZ3_A1014DibInt ;
   private String[] T01LZ3_A2074ColCom ;
   private String[] T01LZ3_A2078ColFon ;
   private byte[] T01LZ3_A2098MolCod ;
   private short[] T01LZ3_A2654PasForLin ;
   private java.math.BigDecimal[] T01LZ3_A2109PasForCan ;
   private boolean[] T01LZ3_n2109PasForCan ;
   private java.math.BigDecimal[] T01LZ3_A2111PasForPre ;
   private boolean[] T01LZ3_n2111PasForPre ;
   private java.math.BigDecimal[] T01LZ3_A2112PasForSob ;
   private boolean[] T01LZ3_n2112PasForSob ;
   private java.math.BigDecimal[] T01LZ3_A2110PasForCon ;
   private boolean[] T01LZ3_n2110PasForCon ;
   private short[] T01LZ3_A6043PasForPar ;
   private boolean[] T01LZ3_n6043PasForPar ;
   private java.math.BigDecimal[] T01LZ3_A6050PasForCanP ;
   private boolean[] T01LZ3_n6050PasForCanP ;
   private String[] T01LZ3_A396EmprCod ;
   private String[] T01LZ3_A2107PasCod ;
   private boolean[] T01LZ3_n2107PasCod ;
   private String[] T01LZ3_A2144UniEstCod ;
   private boolean[] T01LZ3_n2144UniEstCod ;
   private int[] T01LZ2_A252CliCod ;
   private String[] T01LZ2_A2141SerEst ;
   private String[] T01LZ2_A1013DibCli ;
   private int[] T01LZ2_A1014DibInt ;
   private String[] T01LZ2_A2074ColCom ;
   private String[] T01LZ2_A2078ColFon ;
   private byte[] T01LZ2_A2098MolCod ;
   private short[] T01LZ2_A2654PasForLin ;
   private java.math.BigDecimal[] T01LZ2_A2109PasForCan ;
   private boolean[] T01LZ2_n2109PasForCan ;
   private java.math.BigDecimal[] T01LZ2_A2111PasForPre ;
   private boolean[] T01LZ2_n2111PasForPre ;
   private java.math.BigDecimal[] T01LZ2_A2112PasForSob ;
   private boolean[] T01LZ2_n2112PasForSob ;
   private java.math.BigDecimal[] T01LZ2_A2110PasForCon ;
   private boolean[] T01LZ2_n2110PasForCon ;
   private short[] T01LZ2_A6043PasForPar ;
   private boolean[] T01LZ2_n6043PasForPar ;
   private java.math.BigDecimal[] T01LZ2_A6050PasForCanP ;
   private boolean[] T01LZ2_n6050PasForCanP ;
   private String[] T01LZ2_A396EmprCod ;
   private String[] T01LZ2_A2107PasCod ;
   private boolean[] T01LZ2_n2107PasCod ;
   private String[] T01LZ2_A2144UniEstCod ;
   private boolean[] T01LZ2_n2144UniEstCod ;
   private String[] T01LZ44_A2108PasDsc ;
   private boolean[] T01LZ44_n2108PasDsc ;
   private String[] T01LZ45_A396EmprCod ;
   private int[] T01LZ45_A252CliCod ;
   private String[] T01LZ45_A2141SerEst ;
   private String[] T01LZ45_A1013DibCli ;
   private int[] T01LZ45_A1014DibInt ;
   private String[] T01LZ45_A2074ColCom ;
   private String[] T01LZ45_A2078ColFon ;
   private byte[] T01LZ45_A2098MolCod ;
   private short[] T01LZ45_A2654PasForLin ;
   private String[] T01LZ46_A407EmprNom ;
   private boolean[] T01LZ46_n407EmprNom ;
   private String[] T01LZ47_A396EmprCod ;
   private String[] T01LZ48_A2144UniEstCod ;
   private boolean[] T01LZ48_n2144UniEstCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn21__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn21__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn21__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn21__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LZ2", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP, EmprCod, PasCod, UniEstCod FROM TXPPASFOR WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND PasForLin = ?  FOR UPDATE OF PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP, PasCod, UniEstCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ3", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP, EmprCod, PasCod, UniEstCod FROM TXPPASFOR WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND PasForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ4", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ5", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ6", "SELECT MolCod, PasForUL, MolPesMin, EmprCod, CliCod, DibCli, DibInt, SerEst, ColCom, ColFon FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?  FOR UPDATE OF PasForUL, MolPesMin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ7", "SELECT MolCod, PasForUL, MolPesMin, EmprCod, CliCod, DibCli, DibInt, SerEst, ColCom, ColFon FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ10", "SELECT EmprCod FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ12", "SELECT COALESCE( T1.TotPasFor, 0) AS TotPasFor, COALESCE( T1.TotParPas, 0) AS TotParPas, COALESCE( T1.TotPasForP, 0) AS TotPasForP FROM (SELECT SUM(PasForCan) AS TotPasFor, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PasForPar) AS TotParPas, SUM(PasForCanP) AS TotPasForP FROM TXPPASFOR GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ14", "SELECT COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForCan) AS TotColMol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ17", "SELECT /*+ FIRST_ROWS(100) */ TM1.MolCod, T3.CliNom, TM1.PasForUL, T2.EmprNom, TM1.MolPesMin, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt, TM1.SerEst, TM1.ColCom, TM1.ColFon, COALESCE( T4.TotPasFor, 0) AS TotPasFor, COALESCE( T4.TotParPas, 0) AS TotParPas, COALESCE( T5.TotColMol, 0) AS TotColMol, COALESCE( T4.TotPasForP, 0) AS TotPasForP FROM ((((TXPMFORES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT SUM(PasForCan) AS TotPasFor, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PasForPar) AS TotParPas, SUM(PasForCanP) AS TotPasForP FROM TXPPASFOR GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.SerEst = TM1.SerEst AND T4.DibCli = TM1.DibCli AND T4.DibInt = TM1.DibInt AND T4.ColCom = TM1.ColCom AND T4.ColFon = TM1.ColFon AND T4.MolCod = TM1.MolCod) LEFT JOIN (SELECT SUM(PrdForCan) AS TotColMol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod AND T5.SerEst = TM1.SerEst AND T5.DibCli = TM1.DibCli AND T5.DibInt = TM1.DibInt AND T5.ColCom = TM1.ColCom AND T5.ColFon = TM1.ColFon AND T5.MolCod = TM1.MolCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.SerEst = ? and TM1.DibCli = ? and TM1.DibInt = ? and TM1.ColCom = ? and TM1.ColFon = ? and TM1.MolCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.SerEst, TM1.DibCli, TM1.DibInt, TM1.ColCom, TM1.ColFon, TM1.MolCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ19", "SELECT EmprCod FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ21", "SELECT COALESCE( T1.TotPasFor, 0) AS TotPasFor, COALESCE( T1.TotParPas, 0) AS TotParPas, COALESCE( T1.TotPasForP, 0) AS TotPasForP FROM (SELECT SUM(PasForCan) AS TotPasFor, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PasForPar) AS TotParPas, SUM(PasForCanP) AS TotPasForP FROM TXPPASFOR GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ23", "SELECT COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForCan) AS TotColMol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ24", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE ( CliCod > ? or CliCod = ? and SerEst > ? or SerEst = ? and CliCod = ? and DibCli > ? or DibCli = ? and SerEst = ? and CliCod = ? and DibInt > ? or DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColCom > ? or ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColFon > ? or ColFon = ? and ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and MolCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LZ26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE ( CliCod < ? or CliCod = ? and SerEst < ? or SerEst = ? and CliCod = ? and DibCli < ? or DibCli = ? and SerEst = ? and CliCod = ? and DibInt < ? or DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColCom < ? or ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColFon < ? or ColFon = ? and ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and MolCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, SerEst DESC, DibCli DESC, DibInt DESC, ColCom DESC, ColFon DESC, MolCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LZ27", "INSERT INTO TXPMFORES(MolCod, PasForUL, MolPesMin, EmprCod, CliCod, DibCli, DibInt, SerEst, ColCom, ColFon, MolCon, ForPrdUL, MolForEst, MolPesMax, MolCol, Dg_codigo, MolPorVar, TaesId2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', 0, 0, ' ')", GX_NOMASK, "TXPMFORES")
         ,new UpdateCursor("T01LZ28", "UPDATE TXPMFORES SET PasForUL=?, MolPesMin=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK, "TXPMFORES")
         ,new UpdateCursor("T01LZ29", "DELETE FROM TXPMFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK, "TXPMFORES")
         ,new ForEachCursor("T01LZ30", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ32", "SELECT COALESCE( T1.TotPasFor, 0) AS TotPasFor, COALESCE( T1.TotParPas, 0) AS TotParPas, COALESCE( T1.TotPasForP, 0) AS TotPasForP FROM (SELECT SUM(PasForCan) AS TotPasFor, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PasForPar) AS TotParPas, SUM(PasForCanP) AS TotPasForP FROM TXPPASFOR GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ34", "SELECT COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForCan) AS TotColMol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ35", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LZ36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ37", "SELECT T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasForLin, T2.PasDsc, T1.PasForCan, T1.PasForPre, T1.PasForSob, T1.PasForCon, T1.PasForPar, T1.PasForCanP, T1.EmprCod, T1.PasCod, T1.UniEstCod FROM (TXPPASFOR T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? and T1.PasForLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PasForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ38", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ39", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ40", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND PasForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LZ41", "INSERT INTO TXPPASFOR(CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP, EmprCod, PasCod, UniEstCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPASFOR")
         ,new UpdateCursor("T01LZ42", "UPDATE TXPPASFOR SET PasForCan=?, PasForPre=?, PasForSob=?, PasForCon=?, PasForPar=?, PasForCanP=?, PasCod=?, UniEstCod=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND PasForLin = ?", GX_NOMASK, "TXPPASFOR")
         ,new UpdateCursor("T01LZ43", "DELETE FROM TXPPASFOR  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND PasForLin = ?", GX_NOMASK, "TXPPASFOR")
         ,new ForEachCursor("T01LZ44", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ45", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ47", "SELECT EmprCod FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LZ48", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 3);
               ((String[]) buf[21])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 3);
               ((String[]) buf[21])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 12);
               ((String[]) buf[14])[0] = rslt.getString(12, 12);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 3);
               ((String[]) buf[23])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
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
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 38 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 12);
               stmt.setString(22, (String)parms[21], 12);
               stmt.setString(23, (String)parms[22], 12);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 16);
               stmt.setString(26, (String)parms[25], 16);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setString(29, (String)parms[28], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 12);
               stmt.setString(22, (String)parms[21], 12);
               stmt.setString(23, (String)parms[22], 12);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 16);
               stmt.setString(26, (String)parms[25], 16);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setString(29, (String)parms[28], 3);
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 16);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 16);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setString(10, (String)parms[11], 12);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 16);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 28 :
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
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[19], 3);
               }
               stmt.setString(15, (String)parms[20], 3);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[22], 6);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[24], 3);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 3);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 16);
               stmt.setString(12, (String)parms[19], 16);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setString(14, (String)parms[21], 12);
               stmt.setString(15, (String)parms[22], 12);
               stmt.setByte(16, ((Number) parms[23]).byteValue());
               stmt.setShort(17, ((Number) parms[24]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

