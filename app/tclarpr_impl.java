package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclarpr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
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
         gxload_12( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1504CliProCod = httpContext.GetPar( "CliProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A1504CliProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A252CliCod, A65ArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CLIENTE-ARTIGO-PROCESO-LARG", ""), (short)(0)) ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      A7424ClarprUl = (short)(GXutil.lval( httpContext.GetPar( "ClarprUl"))) ;
      n7424ClarprUl = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tclarpr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclarpr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclarpr_impl.class ));
   }

   public tclarpr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLARPR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProCod_Internalname, GXutil.rtrim( A1504CliProCod), GXutil.rtrim( localUtil.format( A1504CliProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripción Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProDsc_Internalname, GXutil.rtrim( A1505CliProDsc), GXutil.rtrim( localUtil.format( A1505CliProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCliProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Busqueda Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliProBus_Internalname, GXutil.rtrim( A1506CliProBus), GXutil.rtrim( localUtil.format( A1506CliProBus, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliProBus_Jsonclick, 0, "", "", "", "", "", 1, edtCliProBus_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClarprUl_Internalname, GXutil.ltrim( localUtil.ntoc( A7424ClarprUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtClarprUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7424ClarprUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7424ClarprUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClarprUl_Jsonclick, 0, "", "", "", "", "", 1, edtClarprUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1601 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1601 = (short)(1) ;
            scanStart1G91601( ) ;
            while ( RcdFound1601 != 0 )
            {
               init_level_properties1601( ) ;
               getByPrimaryKey1G91601( ) ;
               addRow1G91601( ) ;
               scanNext1G91601( ) ;
            }
            scanEnd1G91601( ) ;
            nBlankRcdCount1601 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B7424ClarprUl = A7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         standaloneNotModal1G91601( ) ;
         standaloneModal1G91601( ) ;
         sMode1601 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1G91601( ) ;
            edtavnRcdDeleted_1601_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1601_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1601_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1601_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClarprnl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRNL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClarprnl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprnl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClarprmi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClarprmi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmi_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClarprmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClarprmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClarprmkm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMKM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClarprmkm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmkm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtClarprmmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClarprmmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1601 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1G91601( ) ;
            }
            sendRow1G91601( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1601 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A7424ClarprUl = B7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1601 = (short)(5) ;
         nRcdExists_1601 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1G91601( ) ;
            while ( RcdFound1601 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651601( ) ;
               init_level_properties1601( ) ;
               standaloneNotModal1G91601( ) ;
               getByPrimaryKey1G91601( ) ;
               standaloneModal1G91601( ) ;
               addRow1G91601( ) ;
               scanNext1G91601( ) ;
            }
            scanEnd1G91601( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1601 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651601( ) ;
      initAll1G91601( ) ;
      init_level_properties1601( ) ;
      B7424ClarprUl = A7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      nRcdExists_1601 = (short)(0) ;
      nIsMod_1601 = (short)(0) ;
      nRcdDeleted_1601 = (short)(0) ;
      nBlankRcdCount1601 = (short)(nBlankRcdUsr1601+nBlankRcdCount1601) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1601 > 0 )
      {
         standaloneNotModal1G91601( ) ;
         standaloneModal1G91601( ) ;
         addRow1G91601( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtClarprnl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1601 = (short)(nBlankRcdCount1601-1) ;
      }
      Gx_mode = sMode1601 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A7424ClarprUl = B7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLARPR.htm");
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
      e111G92 ();
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
            Z1504CliProCod = httpContext.cgiGet( "Z1504CliProCod") ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z7424ClarprUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z7424ClarprUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O7424ClarprUl = (short)(localUtil.ctol( httpContext.cgiGet( "O7424ClarprUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A1504CliProCod = httpContext.cgiGet( edtCliProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A1505CliProDsc = httpContext.cgiGet( edtCliProDsc_Internalname) ;
            n1505CliProDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
            A1506CliProBus = httpContext.cgiGet( edtCliProBus_Internalname) ;
            n1506CliProBus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A7424ClarprUl = (short)(localUtil.ctol( httpContext.cgiGet( edtClarprUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7424ClarprUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
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
               A1504CliProCod = httpContext.GetPar( "CliProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
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
                        e111G92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'CONSULTA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Consulta' */
                        e121G92 ();
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
            initAll1G9212( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1601_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1601_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1G9212( ) ;
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

   public void confirm_1G90( )
   {
      beforeValidate1G9212( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G9212( ) ;
         }
         else
         {
            checkExtendedTable1G9212( ) ;
            if ( AnyError == 0 )
            {
               zm1G9212( 11) ;
               zm1G9212( 12) ;
               zm1G9212( 13) ;
               zm1G9212( 14) ;
            }
            closeExtendedTableCursors1G9212( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode212 = Gx_mode ;
         confirm_1G91601( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode212 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1G90( ) ;
      }
   }

   public void confirm_1G91601( )
   {
      s7424ClarprUl = O7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1G91601( ) ;
         if ( ( nRcdExists_1601 != 0 ) || ( nIsMod_1601 != 0 ) )
         {
            getKey1G91601( ) ;
            if ( ( nRcdExists_1601 == 0 ) && ( nRcdDeleted_1601 == 0 ) )
            {
               if ( RcdFound1601 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1G91601( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1G91601( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1G91601( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O7424ClarprUl = A7424ClarprUl ;
                     n7424ClarprUl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "CLARPRNL_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtClarprnl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1601 != 0 )
               {
                  if ( nRcdDeleted_1601 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1G91601( ) ;
                     load1G91601( ) ;
                     beforeValidate1G91601( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1G91601( ) ;
                        O7424ClarprUl = A7424ClarprUl ;
                        n7424ClarprUl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1601 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1G91601( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1G91601( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1G91601( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O7424ClarprUl = A7424ClarprUl ;
                           n7424ClarprUl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1601 == 0 )
                  {
                     GXCCtl = "CLARPRNL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClarprnl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1601_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprnl_Internalname, GXutil.ltrim( localUtil.ntoc( A7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmi_Internalname, GXutil.ltrim( localUtil.ntoc( A7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmkm_Internalname, GXutil.ltrim( localUtil.ntoc( A7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7425Clarprnl_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7426Clarprmi_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7427Clarprmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7428Clarprmkm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7429Clarprmmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1601 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1601_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1601_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRNL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprnl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMKM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmkm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O7424ClarprUl = s7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1G90( )
   {
   }

   public void e111G92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char1 = AV22lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22lit1", AV22lit1);
      GXt_char1 = AV23lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23lit2", AV23lit2);
      GXt_char1 = AV24lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24lit3", AV24lit3);
      GXt_char1 = AV25lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FASPREKGMC", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25lit4", AV25lit4);
      GXt_char1 = AV26lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "INTPREMTRC", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26lit5", AV26lit5);
      GXt_char1 = AV27lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT291_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27lit6", AV27lit6);
      GXt_char1 = AV28lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28lit7", AV28lit7);
      GXt_char1 = AV29Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char1 = AV30Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit9", AV30Lit9);
      GXt_char1 = AV32Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1152_", ""), (byte)(99), GXv_char2) ;
      tclarpr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit10", AV32Lit10);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclarpr_impl.this.A396EmprCod = GXv_char2[0] ;
      tclarpr_impl.this.A407EmprNom = GXv_char3[0] ;
      tclarpr_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void e121G92( )
   {
      /* 'Consulta' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1G9212( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7424ClarprUl = T01G95_A7424ClarprUl[0] ;
         }
         else
         {
            Z7424ClarprUl = A7424ClarprUl ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z1504CliProCod = A1504CliProCod ;
         Z7424ClarprUl = A7424ClarprUl ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z1505CliProDsc = A1505CliProDsc ;
         Z1506CliProBus = A1506CliProBus ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtClarprUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprUl_Enabled), 5, 0), true);
      AV34Pgmname = "TCLARPR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtClarprUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprUl_Enabled), 5, 0), true);
      /* Using cursor T01G96 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
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

   public void load1G9212( )
   {
      /* Using cursor T01G910 */
      pr_default.execute(8, new Object[] {A1504CliProCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A279CliNom = T01G910_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A7424ClarprUl = T01G910_A7424ClarprUl[0] ;
         n7424ClarprUl = T01G910_n7424ClarprUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         A1505CliProDsc = T01G910_A1505CliProDsc[0] ;
         n1505CliProDsc = T01G910_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T01G910_A1506CliProBus[0] ;
         n1506CliProBus = T01G910_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         zm1G9212( -10) ;
      }
      pr_default.close(8);
      onLoadActions1G9212( ) ;
   }

   public void onLoadActions1G9212( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable1G9212( )
   {
      nIsDirty_212 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T01G97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01G97_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01G99 */
      pr_default.execute(7, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1505CliProDsc = T01G99_A1505CliProDsc[0] ;
         n1505CliProDsc = T01G99_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T01G99_A1506CliProBus[0] ;
         n1506CliProBus = T01G99_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         nIsDirty_212 = (short)(1) ;
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         nIsDirty_212 = (short)(1) ;
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      pr_default.close(7);
      if ( true /* After */ && ( GXutil.strcmp(A1506CliProBus, "XXXXXXXX") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso", ""), 1, "CLIPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01G98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1G9212( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01G911 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01G911_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_14( String A396EmprCod ,
                          String A1504CliProCod )
   {
      /* Using cursor T01G912 */
      pr_default.execute(10, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A1505CliProDsc = T01G912_A1505CliProDsc[0] ;
         n1505CliProDsc = T01G912_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T01G912_A1506CliProBus[0] ;
         n1506CliProBus = T01G912_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1505CliProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1506CliProBus))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_13( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01G913 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1G9212( )
   {
      /* Using cursor T01G914 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound212 = (short)(1) ;
      }
      else
      {
         RcdFound212 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01G95_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G9212( 10) ;
         RcdFound212 = (short)(1) ;
         A1504CliProCod = T01G95_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A7424ClarprUl = T01G95_A7424ClarprUl[0] ;
         n7424ClarprUl = T01G95_n7424ClarprUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         A252CliCod = T01G95_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01G95_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         O7424ClarprUl = A7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         sMode212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G9212( ) ;
         if ( AnyError == 1 )
         {
            RcdFound212 = (short)(0) ;
            initializeNonKey1G9212( ) ;
         }
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound212 = (short)(0) ;
         initializeNonKey1G9212( ) ;
         sMode212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1G9212( ) ;
      if ( RcdFound212 == 0 )
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
      RcdFound212 = (short)(0) ;
      /* Using cursor T01G915 */
      pr_default.execute(13, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T01G915_A252CliCod[0] < A252CliCod ) || ( T01G915_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T01G915_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T01G915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T01G915_A252CliCod[0] > A252CliCod ) || ( T01G915_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G915_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T01G915_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T01G915_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T01G915_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T01G915_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01G915_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound212 = (short)(0) ;
      /* Using cursor T01G916 */
      pr_default.execute(14, new Object[] {A1504CliProCod, A1504CliProCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) > 0 ) || ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T01G916_A252CliCod[0] > A252CliCod ) || ( T01G916_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T01G916_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T01G916_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) < 0 ) || ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( T01G916_A252CliCod[0] < A252CliCod ) || ( T01G916_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G916_A1504CliProCod[0], A1504CliProCod) == 0 ) && ( GXutil.strcmp(T01G916_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T01G916_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1504CliProCod = T01G916_A1504CliProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A252CliCod = T01G916_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01G916_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound212 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G9212( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A7424ClarprUl = O7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G9212( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound212 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1504CliProCod = Z1504CliProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A7424ClarprUl = O7424ClarprUl ;
               n7424ClarprUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
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
               A7424ClarprUl = O7424ClarprUl ;
               n7424ClarprUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
               update1G9212( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A7424ClarprUl = O7424ClarprUl ;
               n7424ClarprUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G9212( ) ;
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
                  A7424ClarprUl = O7424ClarprUl ;
                  n7424ClarprUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1G9212( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = Z1504CliProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A7424ClarprUl = O7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
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
      getKey1G9212( ) ;
      if ( RcdFound212 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1504CliProCod = Z1504CliProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A1504CliProCod, Z1504CliProCod) != 0 ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpr");
   }

   public void insert_check( )
   {
      confirm_1G90( ) ;
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
      if ( RcdFound212 == 0 )
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
      scanStart1G9212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G9212( ) ;
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
      if ( RcdFound212 == 0 )
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
      if ( RcdFound212 == 0 )
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
      scanStart1G9212( ) ;
      if ( RcdFound212 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound212 != 0 )
         {
            scanNext1G9212( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G9212( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G9212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G94 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPREPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z7424ClarprUl != T01G94_A7424ClarprUl[0] ) )
         {
            if ( Z7424ClarprUl != T01G94_A7424ClarprUl[0] )
            {
               GXutil.writeLogln("tclarpr:[seudo value changed for attri]"+"ClarprUl");
               GXutil.writeLogRaw("Old: ",Z7424ClarprUl);
               GXutil.writeLogRaw("Current: ",T01G94_A7424ClarprUl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPREPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G9212( )
   {
      beforeValidate1G9212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G9212( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G9212( 0) ;
         checkOptimisticConcurrency1G9212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G9212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G9212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G917 */
                  pr_default.execute(15, new Object[] {A1504CliProCod, Boolean.valueOf(n7424ClarprUl), Short.valueOf(A7424ClarprUl), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
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
                        processLevel1G9212( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1G90( ) ;
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
            load1G9212( ) ;
         }
         endLevel1G9212( ) ;
      }
      closeExtendedTableCursors1G9212( ) ;
   }

   public void update1G9212( )
   {
      beforeValidate1G9212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G9212( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G9212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G9212( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G9212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G918 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n7424ClarprUl), Short.valueOf(A7424ClarprUl), A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPREPR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G9212( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G9212( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1G90( ) ;
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
         endLevel1G9212( ) ;
      }
      closeExtendedTableCursors1G9212( ) ;
   }

   public void deferredUpdate1G9212( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G9212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G9212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G9212( ) ;
         afterConfirm1G9212( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G9212( ) ;
            if ( AnyError == 0 )
            {
               A7424ClarprUl = O7424ClarprUl ;
               n7424ClarprUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
               scanStart1G91601( ) ;
               while ( RcdFound1601 != 0 )
               {
                  getByPrimaryKey1G91601( ) ;
                  delete1G91601( ) ;
                  scanNext1G91601( ) ;
                  O7424ClarprUl = A7424ClarprUl ;
                  n7424ClarprUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
               }
               scanEnd1G91601( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G919 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound212 == 0 )
                        {
                           initAll1G9212( ) ;
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
                        resetCaption1G90( ) ;
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
      sMode212 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G9212( ) ;
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G9212( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T01G920 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01G920_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
         /* Using cursor T01G921 */
         pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A1505CliProDsc = T01G921_A1505CliProDsc[0] ;
            n1505CliProDsc = T01G921_n1505CliProDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
            A1506CliProBus = T01G921_A1506CliProBus[0] ;
            n1506CliProBus = T01G921_n1506CliProBus[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         }
         else
         {
            A1506CliProBus = "XXXXXXXX" ;
            n1506CliProBus = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
            A1505CliProDsc = "                            " ;
            n1505CliProDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         }
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01G922 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREGBL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01G923 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1G91601( )
   {
      s7424ClarprUl = O7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1G91601( ) ;
         if ( ( nRcdExists_1601 != 0 ) || ( nIsMod_1601 != 0 ) )
         {
            standaloneNotModal1G91601( ) ;
            getKey1G91601( ) ;
            if ( ( nRcdExists_1601 == 0 ) && ( nRcdDeleted_1601 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1G91601( ) ;
            }
            else
            {
               if ( RcdFound1601 != 0 )
               {
                  if ( ( nRcdDeleted_1601 != 0 ) && ( nRcdExists_1601 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1G91601( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1601 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1G91601( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1601 == 0 )
                  {
                     GXCCtl = "CLARPRNL_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClarprnl_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O7424ClarprUl = A7424ClarprUl ;
            n7424ClarprUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1601_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprnl_Internalname, GXutil.ltrim( localUtil.ntoc( A7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmi_Internalname, GXutil.ltrim( localUtil.ntoc( A7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmkm_Internalname, GXutil.ltrim( localUtil.ntoc( A7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClarprmmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7425Clarprnl_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7426Clarprmi_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7427Clarprmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7428Clarprmkm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7429Clarprmmx_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1601_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1601 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1601_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1601_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRNL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprnl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMKM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmkm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLARPRMMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1G91601( ) ;
      if ( AnyError != 0 )
      {
         O7424ClarprUl = s7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      }
      nRcdExists_1601 = (short)(0) ;
      nIsMod_1601 = (short)(0) ;
      nRcdDeleted_1601 = (short)(0) ;
   }

   public void processLevel1G9212( )
   {
      /* Save parent mode. */
      sMode212 = Gx_mode ;
      processNestedLevel1G91601( ) ;
      if ( AnyError != 0 )
      {
         O7424ClarprUl = s7424ClarprUl ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01G924 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n7424ClarprUl), Short.valueOf(A7424ClarprUl), A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPREPR");
   }

   public void endLevel1G9212( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1G9212( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclarpr");
         if ( AnyError == 0 )
         {
            confirmValues1G90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G9212( )
   {
      /* Scan By routine */
      /* Using cursor T01G925 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T01G925_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T01G925_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T01G925_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G9212( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound212 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound212 = (short)(1) ;
         A252CliCod = T01G925_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1504CliProCod = T01G925_A1504CliProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
         A65ArtCod = T01G925_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd1G9212( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1G9212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G9212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G9212( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G9212( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G9212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G9212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G9212( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtCliProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProDsc_Enabled), 5, 0), true);
      edtCliProBus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliProBus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliProBus_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtClarprUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprUl_Enabled), 5, 0), true);
   }

   public void zm1G91601( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7426Clarprmi = T01G93_A7426Clarprmi[0] ;
            Z7427Clarprmx = T01G93_A7427Clarprmx[0] ;
            Z7428Clarprmkm = T01G93_A7428Clarprmkm[0] ;
            Z7429Clarprmmx = T01G93_A7429Clarprmmx[0] ;
         }
         else
         {
            Z7426Clarprmi = A7426Clarprmi ;
            Z7427Clarprmx = A7427Clarprmx ;
            Z7428Clarprmkm = A7428Clarprmkm ;
            Z7429Clarprmmx = A7429Clarprmmx ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z7425Clarprnl = A7425Clarprnl ;
         Z7426Clarprmi = A7426Clarprmi ;
         Z7427Clarprmx = A7427Clarprmx ;
         Z7428Clarprmkm = A7428Clarprmkm ;
         Z7429Clarprmmx = A7429Clarprmmx ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1G91601( )
   {
      edtClarprUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprUl_Enabled), 5, 0), true);
      edtClarprUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprUl_Enabled), 5, 0), true);
   }

   public void standaloneModal1G91601( )
   {
      if ( isIns( )  )
      {
         A7424ClarprUl = (short)(O7424ClarprUl+1) ;
         n7424ClarprUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A7425Clarprnl = A7424ClarprUl ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtClarprnl_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClarprnl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprnl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtClarprnl_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClarprnl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprnl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1G91601( )
   {
      /* Using cursor T01G926 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1601 = (short)(1) ;
         A7426Clarprmi = T01G926_A7426Clarprmi[0] ;
         n7426Clarprmi = T01G926_n7426Clarprmi[0] ;
         A7427Clarprmx = T01G926_A7427Clarprmx[0] ;
         n7427Clarprmx = T01G926_n7427Clarprmx[0] ;
         A7428Clarprmkm = T01G926_A7428Clarprmkm[0] ;
         n7428Clarprmkm = T01G926_n7428Clarprmkm[0] ;
         A7429Clarprmmx = T01G926_A7429Clarprmmx[0] ;
         n7429Clarprmmx = T01G926_n7429Clarprmmx[0] ;
         zm1G91601( -15) ;
      }
      pr_default.close(24);
      onLoadActions1G91601( ) ;
   }

   public void onLoadActions1G91601( )
   {
   }

   public void checkExtendedTable1G91601( )
   {
      nIsDirty_1601 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1G91601( ) ;
   }

   public void closeExtendedTableCursors1G91601( )
   {
   }

   public void enableDisable1G91601( )
   {
   }

   public void getKey1G91601( )
   {
      /* Using cursor T01G927 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1601 = (short)(1) ;
      }
      else
      {
         RcdFound1601 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1G91601( )
   {
      /* Using cursor T01G93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G91601( 15) ;
         RcdFound1601 = (short)(1) ;
         initializeNonKey1G91601( ) ;
         A7425Clarprnl = T01G93_A7425Clarprnl[0] ;
         A7426Clarprmi = T01G93_A7426Clarprmi[0] ;
         n7426Clarprmi = T01G93_n7426Clarprmi[0] ;
         A7427Clarprmx = T01G93_A7427Clarprmx[0] ;
         n7427Clarprmx = T01G93_n7427Clarprmx[0] ;
         A7428Clarprmkm = T01G93_A7428Clarprmkm[0] ;
         n7428Clarprmkm = T01G93_n7428Clarprmkm[0] ;
         A7429Clarprmmx = T01G93_A7429Clarprmmx[0] ;
         n7429Clarprmmx = T01G93_n7429Clarprmmx[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1504CliProCod = A1504CliProCod ;
         Z65ArtCod = A65ArtCod ;
         Z7425Clarprnl = A7425Clarprnl ;
         sMode1601 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G91601( ) ;
         load1G91601( ) ;
         Gx_mode = sMode1601 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1601 = (short)(0) ;
         initializeNonKey1G91601( ) ;
         sMode1601 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G91601( ) ;
         Gx_mode = sMode1601 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1G91601( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1G91601( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z7426Clarprmi != T01G92_A7426Clarprmi[0] ) || ( Z7427Clarprmx != T01G92_A7427Clarprmx[0] ) || ( DecimalUtil.compareTo(Z7428Clarprmkm, T01G92_A7428Clarprmkm[0]) != 0 ) || ( DecimalUtil.compareTo(Z7429Clarprmmx, T01G92_A7429Clarprmmx[0]) != 0 ) )
         {
            if ( Z7426Clarprmi != T01G92_A7426Clarprmi[0] )
            {
               GXutil.writeLogln("tclarpr:[seudo value changed for attri]"+"Clarprmi");
               GXutil.writeLogRaw("Old: ",Z7426Clarprmi);
               GXutil.writeLogRaw("Current: ",T01G92_A7426Clarprmi[0]);
            }
            if ( Z7427Clarprmx != T01G92_A7427Clarprmx[0] )
            {
               GXutil.writeLogln("tclarpr:[seudo value changed for attri]"+"Clarprmx");
               GXutil.writeLogRaw("Old: ",Z7427Clarprmx);
               GXutil.writeLogRaw("Current: ",T01G92_A7427Clarprmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7428Clarprmkm, T01G92_A7428Clarprmkm[0]) != 0 )
            {
               GXutil.writeLogln("tclarpr:[seudo value changed for attri]"+"Clarprmkm");
               GXutil.writeLogRaw("Old: ",Z7428Clarprmkm);
               GXutil.writeLogRaw("Current: ",T01G92_A7428Clarprmkm[0]);
            }
            if ( DecimalUtil.compareTo(Z7429Clarprmmx, T01G92_A7429Clarprmmx[0]) != 0 )
            {
               GXutil.writeLogln("tclarpr:[seudo value changed for attri]"+"Clarprmmx");
               GXutil.writeLogRaw("Old: ",Z7429Clarprmmx);
               GXutil.writeLogRaw("Current: ",T01G92_A7429Clarprmmx[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G91601( )
   {
      beforeValidate1G91601( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G91601( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G91601( 0) ;
         checkOptimisticConcurrency1G91601( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G91601( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G91601( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G928 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl), Boolean.valueOf(n7426Clarprmi), Short.valueOf(A7426Clarprmi), Boolean.valueOf(n7427Clarprmx), Short.valueOf(A7427Clarprmx), Boolean.valueOf(n7428Clarprmkm), A7428Clarprmkm, Boolean.valueOf(n7429Clarprmmx), A7429Clarprmmx, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPR");
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
            load1G91601( ) ;
         }
         endLevel1G91601( ) ;
      }
      closeExtendedTableCursors1G91601( ) ;
   }

   public void update1G91601( )
   {
      beforeValidate1G91601( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G91601( ) ;
      }
      if ( ( nIsMod_1601 != 0 ) || ( nIsDirty_1601 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1G91601( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1G91601( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1G91601( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01G929 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n7426Clarprmi), Short.valueOf(A7426Clarprmi), Boolean.valueOf(n7427Clarprmx), Short.valueOf(A7427Clarprmx), Boolean.valueOf(n7428Clarprmkm), A7428Clarprmkm, Boolean.valueOf(n7429Clarprmmx), A7429Clarprmmx, A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPR");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1G91601( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1G91601( ) ;
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
            endLevel1G91601( ) ;
         }
      }
      closeExtendedTableCursors1G91601( ) ;
   }

   public void deferredUpdate1G91601( )
   {
   }

   public void delete1G91601( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G91601( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G91601( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G91601( ) ;
         afterConfirm1G91601( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G91601( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G930 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Short.valueOf(A7425Clarprnl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPR");
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
      sMode1601 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G91601( ) ;
      Gx_mode = sMode1601 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G91601( )
   {
      standaloneModal1G91601( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G91601( )
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

   public void scanStart1G91601( )
   {
      /* Scan By routine */
      /* Using cursor T01G931 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod});
      RcdFound1601 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1601 = (short)(1) ;
         A7425Clarprnl = T01G931_A7425Clarprnl[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G91601( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1601 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1601 = (short)(1) ;
         A7425Clarprnl = T01G931_A7425Clarprnl[0] ;
      }
   }

   public void scanEnd1G91601( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1G91601( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G91601( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G91601( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G91601( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G91601( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G91601( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G91601( )
   {
      edtClarprnl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprnl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprnl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClarprmi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprmi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmi_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClarprmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClarprmkm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprmkm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmkm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtClarprmmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprmmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprmmx_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1G91601( )
   {
   }

   public void send_integrity_lvl_hashes1G9212( )
   {
   }

   public void subsflControlProps_651601( )
   {
      edtavnRcdDeleted_1601_Internalname = "vNRCDDELETED_1601_"+sGXsfl_65_idx ;
      edtClarprnl_Internalname = "CLARPRNL_"+sGXsfl_65_idx ;
      edtClarprmi_Internalname = "CLARPRMI_"+sGXsfl_65_idx ;
      edtClarprmx_Internalname = "CLARPRMX_"+sGXsfl_65_idx ;
      edtClarprmkm_Internalname = "CLARPRMKM_"+sGXsfl_65_idx ;
      edtClarprmmx_Internalname = "CLARPRMMX_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651601( )
   {
      edtavnRcdDeleted_1601_Internalname = "vNRCDDELETED_1601_"+sGXsfl_65_fel_idx ;
      edtClarprnl_Internalname = "CLARPRNL_"+sGXsfl_65_fel_idx ;
      edtClarprmi_Internalname = "CLARPRMI_"+sGXsfl_65_fel_idx ;
      edtClarprmx_Internalname = "CLARPRMX_"+sGXsfl_65_fel_idx ;
      edtClarprmkm_Internalname = "CLARPRMKM_"+sGXsfl_65_fel_idx ;
      edtClarprmmx_Internalname = "CLARPRMMX_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1G91601( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651601( ) ;
      sendRow1G91601( ) ;
   }

   public void sendRow1G91601( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1601_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1601_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1601), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1601), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1601_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1601_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClarprnl_Internalname,GXutil.ltrim( localUtil.ntoc( A7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7425Clarprnl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClarprnl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClarprnl_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClarprmi_Internalname,GXutil.ltrim( localUtil.ntoc( A7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClarprmi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7426Clarprmi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7426Clarprmi), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClarprmi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClarprmi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClarprmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClarprmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7427Clarprmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7427Clarprmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClarprmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClarprmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClarprmkm_Internalname,GXutil.ltrim( localUtil.ntoc( A7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClarprmkm_Enabled!=0) ? localUtil.format( A7428Clarprmkm, "ZZZZZ9.99999") : localUtil.format( A7428Clarprmkm, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClarprmkm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClarprmkm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1601_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClarprmmx_Internalname,GXutil.ltrim( localUtil.ntoc( A7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClarprmmx_Enabled!=0) ? localUtil.format( A7429Clarprmmx, "ZZZZZ9.99999") : localUtil.format( A7429Clarprmmx, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClarprmmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClarprmmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1G91601( ) ;
      GXCCtl = "Z7425Clarprnl_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7425Clarprnl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7426Clarprmi_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7426Clarprmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7427Clarprmx_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7427Clarprmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7428Clarprmkm_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7428Clarprmkm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7429Clarprmmx_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7429Clarprmmx, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1601_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1601_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1601_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1601, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1601_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1601_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLARPRNL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprnl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLARPRMI_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLARPRMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLARPRMKM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmkm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLARPRMMX_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1G91601( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651601( ) ;
      edtavnRcdDeleted_1601_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1601_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClarprnl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRNL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClarprmi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMI_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClarprmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClarprmkm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMKM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClarprmmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLARPRMMX_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1601_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1601_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1601");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1601_Internalname ;
         wbErr = true ;
         nRcdDeleted_1601 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1601 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1601_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClarprnl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClarprnl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLARPRNL_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClarprnl_Internalname ;
         wbErr = true ;
         A7425Clarprnl = (short)(0) ;
      }
      else
      {
         A7425Clarprnl = (short)(localUtil.ctol( httpContext.cgiGet( edtClarprnl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClarprmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClarprmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLARPRMI_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClarprmi_Internalname ;
         wbErr = true ;
         A7426Clarprmi = (short)(0) ;
         n7426Clarprmi = false ;
      }
      else
      {
         A7426Clarprmi = (short)(localUtil.ctol( httpContext.cgiGet( edtClarprmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7426Clarprmi = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClarprmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClarprmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLARPRMX_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClarprmx_Internalname ;
         wbErr = true ;
         A7427Clarprmx = (short)(0) ;
         n7427Clarprmx = false ;
      }
      else
      {
         A7427Clarprmx = (short)(localUtil.ctol( httpContext.cgiGet( edtClarprmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7427Clarprmx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtClarprmkm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtClarprmkm_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CLARPRMKM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClarprmkm_Internalname ;
         wbErr = true ;
         A7428Clarprmkm = DecimalUtil.ZERO ;
         n7428Clarprmkm = false ;
      }
      else
      {
         A7428Clarprmkm = localUtil.ctond( httpContext.cgiGet( edtClarprmkm_Internalname)) ;
         n7428Clarprmkm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtClarprmmx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtClarprmmx_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CLARPRMMX_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtClarprmmx_Internalname ;
         wbErr = true ;
         A7429Clarprmmx = DecimalUtil.ZERO ;
         n7429Clarprmmx = false ;
      }
      else
      {
         A7429Clarprmmx = localUtil.ctond( httpContext.cgiGet( edtClarprmmx_Internalname)) ;
         n7429Clarprmmx = false ;
      }
      GXCCtl = "Z7425Clarprnl_" + sGXsfl_65_idx ;
      Z7425Clarprnl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7426Clarprmi_" + sGXsfl_65_idx ;
      Z7426Clarprmi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7427Clarprmx_" + sGXsfl_65_idx ;
      Z7427Clarprmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7428Clarprmkm_" + sGXsfl_65_idx ;
      Z7428Clarprmkm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7429Clarprmmx_" + sGXsfl_65_idx ;
      Z7429Clarprmmx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1601_" + sGXsfl_65_idx ;
      nRcdDeleted_1601 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1601_" + sGXsfl_65_idx ;
      nRcdExists_1601 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1601_" + sGXsfl_65_idx ;
      nIsMod_1601 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtClarprnl_Enabled = edtClarprnl_Enabled ;
   }

   public void confirmValues1G90( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651601( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651601( ) ;
         httpContext.changePostValue( "Z7425Clarprnl_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7425Clarprnl_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7425Clarprnl_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7426Clarprmi_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7426Clarprmi_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7426Clarprmi_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7427Clarprmx_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7427Clarprmx_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7427Clarprmx_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7428Clarprmkm_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7428Clarprmkm_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7428Clarprmkm_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7429Clarprmmx_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7429Clarprmmx_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7429Clarprmmx_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclarpr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7424ClarprUl", GXutil.ltrim( localUtil.ntoc( Z7424ClarprUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O7424ClarprUl", GXutil.ltrim( localUtil.ntoc( O7424ClarprUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tclarpr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCLARPR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CLIENTE-ARTIGO-PROCESO-LARG", "") ;
   }

   public void initializeNonKey1G9212( )
   {
      A1505CliProDsc = "" ;
      n1505CliProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      A1506CliProBus = "" ;
      n1506CliProBus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A7424ClarprUl = (short)(0) ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      O7424ClarprUl = A7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
      Z7424ClarprUl = (short)(0) ;
   }

   public void initAll1G9212( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1504CliProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1504CliProCod", A1504CliProCod);
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey1G9212( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1G91601( )
   {
      A7426Clarprmi = (short)(0) ;
      n7426Clarprmi = false ;
      A7427Clarprmx = (short)(0) ;
      n7427Clarprmx = false ;
      A7428Clarprmkm = DecimalUtil.ZERO ;
      n7428Clarprmkm = false ;
      A7429Clarprmmx = DecimalUtil.ZERO ;
      n7429Clarprmmx = false ;
      Z7426Clarprmi = (short)(0) ;
      Z7427Clarprmx = (short)(0) ;
      Z7428Clarprmkm = DecimalUtil.ZERO ;
      Z7429Clarprmmx = DecimalUtil.ZERO ;
   }

   public void initAll1G91601( )
   {
      A7425Clarprnl = (short)(0) ;
      initializeNonKey1G91601( ) ;
   }

   public void standaloneModalInsert1G91601( )
   {
      A7424ClarprUl = i7424ClarprUl ;
      n7424ClarprUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7424ClarprUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575959", true, true);
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
      httpContext.AddJavascriptSource("tclarpr.js", "?20268241575959", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1601( )
   {
      edtClarprnl_Enabled = defedtClarprnl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtClarprnl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClarprnl_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1601, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1601_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7425Clarprnl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprnl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7426Clarprmi, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7427Clarprmx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7428Clarprmkm, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmkm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7429Clarprmmx, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClarprmmx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliProCod_Internalname = "CLIPROCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliProDsc_Internalname = "CLIPRODSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliProBus_Internalname = "CLIPROBUS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtClarprUl_Internalname = "CLARPRUL" ;
      edtavnRcdDeleted_1601_Internalname = "vNRCDDELETED_1601" ;
      edtClarprnl_Internalname = "CLARPRNL" ;
      edtClarprmi_Internalname = "CLARPRMI" ;
      edtClarprmx_Internalname = "CLARPRMX" ;
      edtClarprmkm_Internalname = "CLARPRMKM" ;
      edtClarprmmx_Internalname = "CLARPRMMX" ;
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
      Form.setCaption( httpContext.getMessage( "CLIENTE-ARTIGO-PROCESO-LARG", "") );
      edtClarprmmx_Jsonclick = "" ;
      edtClarprmkm_Jsonclick = "" ;
      edtClarprmx_Jsonclick = "" ;
      edtClarprmi_Jsonclick = "" ;
      edtClarprnl_Jsonclick = "" ;
      edtavnRcdDeleted_1601_Jsonclick = "" ;
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
      edtClarprmmx_Enabled = 1 ;
      edtClarprmkm_Enabled = 1 ;
      edtClarprmx_Enabled = 1 ;
      edtClarprmi_Enabled = 1 ;
      edtClarprnl_Enabled = 1 ;
      edtavnRcdDeleted_1601_Enabled = 1 ;
      edtClarprUl_Jsonclick = "" ;
      edtClarprUl_Backcolor = (int)(0xFFFFFF) ;
      edtClarprUl_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliProBus_Jsonclick = "" ;
      edtCliProBus_Backcolor = (int)(0xFFFFFF) ;
      edtCliProBus_Enabled = 0 ;
      edtCliProDsc_Jsonclick = "" ;
      edtCliProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCliProDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliProCod_Jsonclick = "" ;
      edtCliProCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliProCod_Enabled = 1 ;
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
      subsflControlProps_651601( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1G91601( ) ;
         standaloneModal1G91601( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1G91601( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651601( ) ;
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
      /* Using cursor T01G932 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G932_A407EmprNom[0] ;
      n407EmprNom = T01G932_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(30);
      /* Using cursor T01G920 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01G920_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(18);
      /* Using cursor T01G921 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T01G921_A1505CliProDsc[0] ;
         n1505CliProDsc = T01G921_n1505CliProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
         A1506CliProBus = T01G921_A1506CliProBus[0] ;
         n1506CliProBus = T01G921_n1506CliProBus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", A1506CliProBus);
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", A1505CliProDsc);
      }
      pr_default.close(19);
      /* Using cursor T01G933 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(31);
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

   public void valid_Clicod( )
   {
      /* Using cursor T01G920 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01G920_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Cliprocod( )
   {
      n1505CliProDsc = false ;
      n1506CliProBus = false ;
      /* Using cursor T01G921 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1504CliProCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1505CliProDsc = T01G921_A1505CliProDsc[0] ;
         n1505CliProDsc = T01G921_n1505CliProDsc[0] ;
         A1506CliProBus = T01G921_A1506CliProBus[0] ;
         n1506CliProBus = T01G921_n1506CliProBus[0] ;
      }
      else
      {
         A1506CliProBus = "XXXXXXXX" ;
         n1506CliProBus = false ;
         A1505CliProDsc = "                            " ;
         n1505CliProDsc = false ;
      }
      pr_default.close(19);
      if ( true /* After */ && ( GXutil.strcmp(A1506CliProBus, "XXXXXXXX") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso", ""), 1, "CLIPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliProCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", GXutil.rtrim( A1505CliProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", GXutil.rtrim( A1506CliProBus));
   }

   public void valid_Artcod( )
   {
      n7424ClarprUl = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01G933 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7424ClarprUl", GXutil.ltrim( localUtil.ntoc( A7424ClarprUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1505CliProDsc", GXutil.rtrim( A1505CliProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1506CliProBus", GXutil.rtrim( A1506CliProBus));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1504CliProCod", GXutil.rtrim( Z1504CliProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7424ClarprUl", GXutil.ltrim( localUtil.ntoc( Z7424ClarprUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1505CliProDsc", GXutil.rtrim( Z1505CliProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1506CliProBus", GXutil.rtrim( Z1506CliProBus));
      httpContext.ajax_rsp_assign_attri("", false, "O7424ClarprUl", GXutil.ltrim( localUtil.ntoc( O7424ClarprUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'CONSULTA'","{handler:'e121G92',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''}]");
      setEventMetadata("'CONSULTA'",",oparms:[{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLIPROCOD","{handler:'valid_Cliprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]");
      setEventMetadata("VALID_CLIPROCOD",",oparms:[{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A7424ClarprUl',fld:'CLARPRUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1504CliProCod',fld:'CLIPROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A7424ClarprUl',fld:'CLARPRUL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1505CliProDsc',fld:'CLIPRODSC',pic:''},{av:'A1506CliProBus',fld:'CLIPROBUS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z1504CliProCod'},{av:'Z65ArtCod'},{av:'Z7424ClarprUl'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{av:'Z1505CliProDsc'},{av:'Z1506CliProBus'},{av:'O7424ClarprUl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLARPRUL","{handler:'valid_Clarprul',iparms:[]");
      setEventMetadata("VALID_CLARPRUL",",oparms:[]}");
      setEventMetadata("VALID_CLARPRNL","{handler:'valid_Clarprnl',iparms:[]");
      setEventMetadata("VALID_CLARPRNL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Clarprmmx',iparms:[]");
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
      pr_default.close(31);
      pr_default.close(18);
      pr_default.close(30);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1504CliProCod = "" ;
      Z65ArtCod = "" ;
      Z7428Clarprmkm = DecimalUtil.ZERO ;
      Z7429Clarprmmx = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1504CliProCod = "" ;
      A65ArtCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A1505CliProDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1506CliProBus = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1601 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode212 = "" ;
      GXCCtl = "" ;
      A7428Clarprmkm = DecimalUtil.ZERO ;
      A7429Clarprmmx = DecimalUtil.ZERO ;
      AV19Lit0 = "" ;
      AV21LitFe = "" ;
      AV22lit1 = "" ;
      AV23lit2 = "" ;
      AV24lit3 = "" ;
      AV25lit4 = "" ;
      AV26lit5 = "" ;
      AV27lit6 = "" ;
      AV28lit7 = "" ;
      AV29Lit8 = "" ;
      AV30Lit9 = "" ;
      AV32Lit10 = "" ;
      GXt_char1 = "" ;
      AV18Station = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z1505CliProDsc = "" ;
      Z1506CliProBus = "" ;
      T01G96_A407EmprNom = new String[] {""} ;
      T01G96_n407EmprNom = new boolean[] {false} ;
      T01G910_A758ProCod = new String[] {""} ;
      T01G910_A407EmprNom = new String[] {""} ;
      T01G910_n407EmprNom = new boolean[] {false} ;
      T01G910_A1504CliProCod = new String[] {""} ;
      T01G910_A279CliNom = new String[] {""} ;
      T01G910_A7424ClarprUl = new short[1] ;
      T01G910_n7424ClarprUl = new boolean[] {false} ;
      T01G910_A396EmprCod = new String[] {""} ;
      T01G910_A252CliCod = new int[1] ;
      T01G910_A65ArtCod = new String[] {""} ;
      T01G910_A1505CliProDsc = new String[] {""} ;
      T01G910_n1505CliProDsc = new boolean[] {false} ;
      T01G910_A1506CliProBus = new String[] {""} ;
      T01G910_n1506CliProBus = new boolean[] {false} ;
      T01G97_A279CliNom = new String[] {""} ;
      T01G99_A1505CliProDsc = new String[] {""} ;
      T01G99_n1505CliProDsc = new boolean[] {false} ;
      T01G99_A1506CliProBus = new String[] {""} ;
      T01G99_n1506CliProBus = new boolean[] {false} ;
      T01G98_A396EmprCod = new String[] {""} ;
      T01G911_A279CliNom = new String[] {""} ;
      T01G912_A1505CliProDsc = new String[] {""} ;
      T01G912_n1505CliProDsc = new boolean[] {false} ;
      T01G912_A1506CliProBus = new String[] {""} ;
      T01G912_n1506CliProBus = new boolean[] {false} ;
      T01G913_A396EmprCod = new String[] {""} ;
      T01G914_A396EmprCod = new String[] {""} ;
      T01G914_A252CliCod = new int[1] ;
      T01G914_A1504CliProCod = new String[] {""} ;
      T01G914_A65ArtCod = new String[] {""} ;
      T01G95_A1504CliProCod = new String[] {""} ;
      T01G95_A7424ClarprUl = new short[1] ;
      T01G95_n7424ClarprUl = new boolean[] {false} ;
      T01G95_A396EmprCod = new String[] {""} ;
      T01G95_A252CliCod = new int[1] ;
      T01G95_A65ArtCod = new String[] {""} ;
      T01G915_A1504CliProCod = new String[] {""} ;
      T01G915_A396EmprCod = new String[] {""} ;
      T01G915_A252CliCod = new int[1] ;
      T01G915_A65ArtCod = new String[] {""} ;
      T01G916_A1504CliProCod = new String[] {""} ;
      T01G916_A396EmprCod = new String[] {""} ;
      T01G916_A252CliCod = new int[1] ;
      T01G916_A65ArtCod = new String[] {""} ;
      T01G94_A1504CliProCod = new String[] {""} ;
      T01G94_A7424ClarprUl = new short[1] ;
      T01G94_n7424ClarprUl = new boolean[] {false} ;
      T01G94_A396EmprCod = new String[] {""} ;
      T01G94_A252CliCod = new int[1] ;
      T01G94_A65ArtCod = new String[] {""} ;
      T01G920_A279CliNom = new String[] {""} ;
      T01G921_A1505CliProDsc = new String[] {""} ;
      T01G921_n1505CliProDsc = new boolean[] {false} ;
      T01G921_A1506CliProBus = new String[] {""} ;
      T01G921_n1506CliProBus = new boolean[] {false} ;
      T01G922_A396EmprCod = new String[] {""} ;
      T01G922_A252CliCod = new int[1] ;
      T01G922_A1504CliProCod = new String[] {""} ;
      T01G922_A65ArtCod = new String[] {""} ;
      T01G922_A5362IntCodF = new byte[1] ;
      T01G923_A396EmprCod = new String[] {""} ;
      T01G923_A252CliCod = new int[1] ;
      T01G923_A1504CliProCod = new String[] {""} ;
      T01G923_A65ArtCod = new String[] {""} ;
      T01G923_A583IntCod = new byte[1] ;
      T01G925_A396EmprCod = new String[] {""} ;
      T01G925_A252CliCod = new int[1] ;
      T01G925_A1504CliProCod = new String[] {""} ;
      T01G925_A65ArtCod = new String[] {""} ;
      T01G926_A252CliCod = new int[1] ;
      T01G926_A1504CliProCod = new String[] {""} ;
      T01G926_A65ArtCod = new String[] {""} ;
      T01G926_A7425Clarprnl = new short[1] ;
      T01G926_A7426Clarprmi = new short[1] ;
      T01G926_n7426Clarprmi = new boolean[] {false} ;
      T01G926_A7427Clarprmx = new short[1] ;
      T01G926_n7427Clarprmx = new boolean[] {false} ;
      T01G926_A7428Clarprmkm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G926_n7428Clarprmkm = new boolean[] {false} ;
      T01G926_A7429Clarprmmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G926_n7429Clarprmmx = new boolean[] {false} ;
      T01G926_A396EmprCod = new String[] {""} ;
      T01G927_A396EmprCod = new String[] {""} ;
      T01G927_A252CliCod = new int[1] ;
      T01G927_A1504CliProCod = new String[] {""} ;
      T01G927_A65ArtCod = new String[] {""} ;
      T01G927_A7425Clarprnl = new short[1] ;
      T01G93_A252CliCod = new int[1] ;
      T01G93_A1504CliProCod = new String[] {""} ;
      T01G93_A65ArtCod = new String[] {""} ;
      T01G93_A7425Clarprnl = new short[1] ;
      T01G93_A7426Clarprmi = new short[1] ;
      T01G93_n7426Clarprmi = new boolean[] {false} ;
      T01G93_A7427Clarprmx = new short[1] ;
      T01G93_n7427Clarprmx = new boolean[] {false} ;
      T01G93_A7428Clarprmkm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G93_n7428Clarprmkm = new boolean[] {false} ;
      T01G93_A7429Clarprmmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G93_n7429Clarprmmx = new boolean[] {false} ;
      T01G93_A396EmprCod = new String[] {""} ;
      T01G92_A252CliCod = new int[1] ;
      T01G92_A1504CliProCod = new String[] {""} ;
      T01G92_A65ArtCod = new String[] {""} ;
      T01G92_A7425Clarprnl = new short[1] ;
      T01G92_A7426Clarprmi = new short[1] ;
      T01G92_n7426Clarprmi = new boolean[] {false} ;
      T01G92_A7427Clarprmx = new short[1] ;
      T01G92_n7427Clarprmx = new boolean[] {false} ;
      T01G92_A7428Clarprmkm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G92_n7428Clarprmkm = new boolean[] {false} ;
      T01G92_A7429Clarprmmx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G92_n7429Clarprmmx = new boolean[] {false} ;
      T01G92_A396EmprCod = new String[] {""} ;
      T01G931_A396EmprCod = new String[] {""} ;
      T01G931_A252CliCod = new int[1] ;
      T01G931_A1504CliProCod = new String[] {""} ;
      T01G931_A65ArtCod = new String[] {""} ;
      T01G931_A7425Clarprnl = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01G932_A407EmprNom = new String[] {""} ;
      T01G932_n407EmprNom = new boolean[] {false} ;
      T01G933_A396EmprCod = new String[] {""} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ1504CliProCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      ZZ1505CliProDsc = "" ;
      ZZ1506CliProBus = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclarpr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclarpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclarpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclarpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclarpr__default(),
         new Object[] {
             new Object[] {
            T01G92_A252CliCod, T01G92_A1504CliProCod, T01G92_A65ArtCod, T01G92_A7425Clarprnl, T01G92_A7426Clarprmi, T01G92_n7426Clarprmi, T01G92_A7427Clarprmx, T01G92_n7427Clarprmx, T01G92_A7428Clarprmkm, T01G92_n7428Clarprmkm,
            T01G92_A7429Clarprmmx, T01G92_n7429Clarprmmx, T01G92_A396EmprCod
            }
            , new Object[] {
            T01G93_A252CliCod, T01G93_A1504CliProCod, T01G93_A65ArtCod, T01G93_A7425Clarprnl, T01G93_A7426Clarprmi, T01G93_n7426Clarprmi, T01G93_A7427Clarprmx, T01G93_n7427Clarprmx, T01G93_A7428Clarprmkm, T01G93_n7428Clarprmkm,
            T01G93_A7429Clarprmmx, T01G93_n7429Clarprmmx, T01G93_A396EmprCod
            }
            , new Object[] {
            T01G94_A1504CliProCod, T01G94_A7424ClarprUl, T01G94_n7424ClarprUl, T01G94_A396EmprCod, T01G94_A252CliCod, T01G94_A65ArtCod
            }
            , new Object[] {
            T01G95_A1504CliProCod, T01G95_A7424ClarprUl, T01G95_n7424ClarprUl, T01G95_A396EmprCod, T01G95_A252CliCod, T01G95_A65ArtCod
            }
            , new Object[] {
            T01G96_A407EmprNom, T01G96_n407EmprNom
            }
            , new Object[] {
            T01G97_A279CliNom
            }
            , new Object[] {
            T01G98_A396EmprCod
            }
            , new Object[] {
            T01G99_A1505CliProDsc, T01G99_n1505CliProDsc, T01G99_A1506CliProBus, T01G99_n1506CliProBus
            }
            , new Object[] {
            T01G910_A758ProCod, T01G910_A407EmprNom, T01G910_n407EmprNom, T01G910_A1504CliProCod, T01G910_A279CliNom, T01G910_A7424ClarprUl, T01G910_n7424ClarprUl, T01G910_A396EmprCod, T01G910_A252CliCod, T01G910_A65ArtCod,
            T01G910_A1505CliProDsc, T01G910_n1505CliProDsc, T01G910_A1506CliProBus, T01G910_n1506CliProBus
            }
            , new Object[] {
            T01G911_A279CliNom
            }
            , new Object[] {
            T01G912_A1505CliProDsc, T01G912_n1505CliProDsc, T01G912_A1506CliProBus, T01G912_n1506CliProBus
            }
            , new Object[] {
            T01G913_A396EmprCod
            }
            , new Object[] {
            T01G914_A396EmprCod, T01G914_A252CliCod, T01G914_A1504CliProCod, T01G914_A65ArtCod
            }
            , new Object[] {
            T01G915_A1504CliProCod, T01G915_A396EmprCod, T01G915_A252CliCod, T01G915_A65ArtCod
            }
            , new Object[] {
            T01G916_A1504CliProCod, T01G916_A396EmprCod, T01G916_A252CliCod, T01G916_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G920_A279CliNom
            }
            , new Object[] {
            T01G921_A1505CliProDsc, T01G921_n1505CliProDsc, T01G921_A1506CliProBus, T01G921_n1506CliProBus
            }
            , new Object[] {
            T01G922_A396EmprCod, T01G922_A252CliCod, T01G922_A1504CliProCod, T01G922_A65ArtCod, T01G922_A5362IntCodF
            }
            , new Object[] {
            T01G923_A396EmprCod, T01G923_A252CliCod, T01G923_A1504CliProCod, T01G923_A65ArtCod, T01G923_A583IntCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01G925_A396EmprCod, T01G925_A252CliCod, T01G925_A1504CliProCod, T01G925_A65ArtCod
            }
            , new Object[] {
            T01G926_A252CliCod, T01G926_A1504CliProCod, T01G926_A65ArtCod, T01G926_A7425Clarprnl, T01G926_A7426Clarprmi, T01G926_n7426Clarprmi, T01G926_A7427Clarprmx, T01G926_n7427Clarprmx, T01G926_A7428Clarprmkm, T01G926_n7428Clarprmkm,
            T01G926_A7429Clarprmmx, T01G926_n7429Clarprmmx, T01G926_A396EmprCod
            }
            , new Object[] {
            T01G927_A396EmprCod, T01G927_A252CliCod, T01G927_A1504CliProCod, T01G927_A65ArtCod, T01G927_A7425Clarprnl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G931_A396EmprCod, T01G931_A252CliCod, T01G931_A1504CliProCod, T01G931_A65ArtCod, T01G931_A7425Clarprnl
            }
            , new Object[] {
            T01G932_A407EmprNom, T01G932_n407EmprNom
            }
            , new Object[] {
            T01G933_A396EmprCod
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TCLARPR" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z7424ClarprUl ;
   private short O7424ClarprUl ;
   private short Z7425Clarprnl ;
   private short Z7426Clarprmi ;
   private short Z7427Clarprmx ;
   private short nRcdDeleted_1601 ;
   private short nRcdExists_1601 ;
   private short nIsMod_1601 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7424ClarprUl ;
   private short nBlankRcdCount1601 ;
   private short RcdFound1601 ;
   private short B7424ClarprUl ;
   private short nBlankRcdUsr1601 ;
   private short s7424ClarprUl ;
   private short A7425Clarprnl ;
   private short A7426Clarprmi ;
   private short A7427Clarprmx ;
   private short RcdFound212 ;
   private short nIsDirty_212 ;
   private short nIsDirty_1601 ;
   private short i7424ClarprUl ;
   private short ZZ7424ClarprUl ;
   private short ZO7424ClarprUl ;
   private int Z252CliCod ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliProCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtCliProDsc_Enabled ;
   private int edtCliProBus_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtClarprUl_Enabled ;
   private int edtavnRcdDeleted_1601_Enabled ;
   private int edtClarprnl_Enabled ;
   private int edtClarprmi_Enabled ;
   private int edtClarprmx_Enabled ;
   private int edtClarprmkm_Enabled ;
   private int edtClarprmmx_Enabled ;
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
   private int defedtClarprnl_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtClarprUl_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliProBus_Backcolor ;
   private int edtCliProDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliProCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7428Clarprmkm ;
   private java.math.BigDecimal Z7429Clarprmmx ;
   private java.math.BigDecimal A7428Clarprmkm ;
   private java.math.BigDecimal A7429Clarprmmx ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1504CliProCod ;
   private String Z65ArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1504CliProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtCliProCod_Internalname ;
   private String edtCliProCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliProDsc_Internalname ;
   private String A1505CliProDsc ;
   private String edtCliProDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliProBus_Internalname ;
   private String A1506CliProBus ;
   private String edtCliProBus_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtClarprUl_Internalname ;
   private String edtClarprUl_Jsonclick ;
   private String sMode1601 ;
   private String edtavnRcdDeleted_1601_Internalname ;
   private String edtClarprnl_Internalname ;
   private String edtClarprmi_Internalname ;
   private String edtClarprmx_Internalname ;
   private String edtClarprmkm_Internalname ;
   private String edtClarprmmx_Internalname ;
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
   private String AV17UsurCod ;
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode212 ;
   private String GXCCtl ;
   private String AV19Lit0 ;
   private String AV21LitFe ;
   private String AV22lit1 ;
   private String AV23lit2 ;
   private String AV24lit3 ;
   private String AV25lit4 ;
   private String AV26lit5 ;
   private String AV27lit6 ;
   private String AV28lit7 ;
   private String AV29Lit8 ;
   private String AV30Lit9 ;
   private String AV32Lit10 ;
   private String GXt_char1 ;
   private String AV18Station ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z1505CliProDsc ;
   private String Z1506CliProBus ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1601_Jsonclick ;
   private String edtClarprnl_Jsonclick ;
   private String edtClarprmi_Jsonclick ;
   private String edtClarprmx_Jsonclick ;
   private String edtClarprmkm_Jsonclick ;
   private String edtClarprmmx_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ1504CliProCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZZ279CliNom ;
   private String ZZ1505CliProDsc ;
   private String ZZ1506CliProBus ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n7424ClarprUl ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n1505CliProDsc ;
   private boolean n1506CliProBus ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7426Clarprmi ;
   private boolean n7427Clarprmx ;
   private boolean n7428Clarprmkm ;
   private boolean n7429Clarprmmx ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01G96_A407EmprNom ;
   private boolean[] T01G96_n407EmprNom ;
   private String[] T01G910_A758ProCod ;
   private String[] T01G910_A407EmprNom ;
   private boolean[] T01G910_n407EmprNom ;
   private String[] T01G910_A1504CliProCod ;
   private String[] T01G910_A279CliNom ;
   private short[] T01G910_A7424ClarprUl ;
   private boolean[] T01G910_n7424ClarprUl ;
   private String[] T01G910_A396EmprCod ;
   private int[] T01G910_A252CliCod ;
   private String[] T01G910_A65ArtCod ;
   private String[] T01G910_A1505CliProDsc ;
   private boolean[] T01G910_n1505CliProDsc ;
   private String[] T01G910_A1506CliProBus ;
   private boolean[] T01G910_n1506CliProBus ;
   private String[] T01G97_A279CliNom ;
   private String[] T01G99_A1505CliProDsc ;
   private boolean[] T01G99_n1505CliProDsc ;
   private String[] T01G99_A1506CliProBus ;
   private boolean[] T01G99_n1506CliProBus ;
   private String[] T01G98_A396EmprCod ;
   private String[] T01G911_A279CliNom ;
   private String[] T01G912_A1505CliProDsc ;
   private boolean[] T01G912_n1505CliProDsc ;
   private String[] T01G912_A1506CliProBus ;
   private boolean[] T01G912_n1506CliProBus ;
   private String[] T01G913_A396EmprCod ;
   private String[] T01G914_A396EmprCod ;
   private int[] T01G914_A252CliCod ;
   private String[] T01G914_A1504CliProCod ;
   private String[] T01G914_A65ArtCod ;
   private String[] T01G95_A1504CliProCod ;
   private short[] T01G95_A7424ClarprUl ;
   private boolean[] T01G95_n7424ClarprUl ;
   private String[] T01G95_A396EmprCod ;
   private int[] T01G95_A252CliCod ;
   private String[] T01G95_A65ArtCod ;
   private String[] T01G915_A1504CliProCod ;
   private String[] T01G915_A396EmprCod ;
   private int[] T01G915_A252CliCod ;
   private String[] T01G915_A65ArtCod ;
   private String[] T01G916_A1504CliProCod ;
   private String[] T01G916_A396EmprCod ;
   private int[] T01G916_A252CliCod ;
   private String[] T01G916_A65ArtCod ;
   private String[] T01G94_A1504CliProCod ;
   private short[] T01G94_A7424ClarprUl ;
   private boolean[] T01G94_n7424ClarprUl ;
   private String[] T01G94_A396EmprCod ;
   private int[] T01G94_A252CliCod ;
   private String[] T01G94_A65ArtCod ;
   private String[] T01G920_A279CliNom ;
   private String[] T01G921_A1505CliProDsc ;
   private boolean[] T01G921_n1505CliProDsc ;
   private String[] T01G921_A1506CliProBus ;
   private boolean[] T01G921_n1506CliProBus ;
   private String[] T01G922_A396EmprCod ;
   private int[] T01G922_A252CliCod ;
   private String[] T01G922_A1504CliProCod ;
   private String[] T01G922_A65ArtCod ;
   private byte[] T01G922_A5362IntCodF ;
   private String[] T01G923_A396EmprCod ;
   private int[] T01G923_A252CliCod ;
   private String[] T01G923_A1504CliProCod ;
   private String[] T01G923_A65ArtCod ;
   private byte[] T01G923_A583IntCod ;
   private String[] T01G925_A396EmprCod ;
   private int[] T01G925_A252CliCod ;
   private String[] T01G925_A1504CliProCod ;
   private String[] T01G925_A65ArtCod ;
   private int[] T01G926_A252CliCod ;
   private String[] T01G926_A1504CliProCod ;
   private String[] T01G926_A65ArtCod ;
   private short[] T01G926_A7425Clarprnl ;
   private short[] T01G926_A7426Clarprmi ;
   private boolean[] T01G926_n7426Clarprmi ;
   private short[] T01G926_A7427Clarprmx ;
   private boolean[] T01G926_n7427Clarprmx ;
   private java.math.BigDecimal[] T01G926_A7428Clarprmkm ;
   private boolean[] T01G926_n7428Clarprmkm ;
   private java.math.BigDecimal[] T01G926_A7429Clarprmmx ;
   private boolean[] T01G926_n7429Clarprmmx ;
   private String[] T01G926_A396EmprCod ;
   private String[] T01G927_A396EmprCod ;
   private int[] T01G927_A252CliCod ;
   private String[] T01G927_A1504CliProCod ;
   private String[] T01G927_A65ArtCod ;
   private short[] T01G927_A7425Clarprnl ;
   private int[] T01G93_A252CliCod ;
   private String[] T01G93_A1504CliProCod ;
   private String[] T01G93_A65ArtCod ;
   private short[] T01G93_A7425Clarprnl ;
   private short[] T01G93_A7426Clarprmi ;
   private boolean[] T01G93_n7426Clarprmi ;
   private short[] T01G93_A7427Clarprmx ;
   private boolean[] T01G93_n7427Clarprmx ;
   private java.math.BigDecimal[] T01G93_A7428Clarprmkm ;
   private boolean[] T01G93_n7428Clarprmkm ;
   private java.math.BigDecimal[] T01G93_A7429Clarprmmx ;
   private boolean[] T01G93_n7429Clarprmmx ;
   private String[] T01G93_A396EmprCod ;
   private int[] T01G92_A252CliCod ;
   private String[] T01G92_A1504CliProCod ;
   private String[] T01G92_A65ArtCod ;
   private short[] T01G92_A7425Clarprnl ;
   private short[] T01G92_A7426Clarprmi ;
   private boolean[] T01G92_n7426Clarprmi ;
   private short[] T01G92_A7427Clarprmx ;
   private boolean[] T01G92_n7427Clarprmx ;
   private java.math.BigDecimal[] T01G92_A7428Clarprmkm ;
   private boolean[] T01G92_n7428Clarprmkm ;
   private java.math.BigDecimal[] T01G92_A7429Clarprmmx ;
   private boolean[] T01G92_n7429Clarprmmx ;
   private String[] T01G92_A396EmprCod ;
   private String[] T01G931_A396EmprCod ;
   private int[] T01G931_A252CliCod ;
   private String[] T01G931_A1504CliProCod ;
   private String[] T01G931_A65ArtCod ;
   private short[] T01G931_A7425Clarprnl ;
   private String[] T01G932_A407EmprNom ;
   private boolean[] T01G932_n407EmprNom ;
   private String[] T01G933_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclarpr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G92", "SELECT CliCod, CliProCod, ArtCod, Clarprnl, Clarprmi, Clarprmx, Clarprmkm, Clarprmmx, EmprCod FROM TXPCLARPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND Clarprnl = ?  FOR UPDATE OF Clarprmi, Clarprmx, Clarprmkm, Clarprmmx NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G93", "SELECT CliCod, CliProCod, ArtCod, Clarprnl, Clarprmi, Clarprmx, Clarprmkm, Clarprmmx, EmprCod FROM TXPCLARPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND Clarprnl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G94", "SELECT CliProCod, ClarprUl, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?  FOR UPDATE OF ClarprUl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G95", "SELECT CliProCod, ClarprUl, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G96", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G97", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G98", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G99", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G910", "SELECT /*+ FIRST_ROWS(100) */ T4.ProCod, T2.EmprNom, TM1.CliProCod, T3.CliNom, TM1.ClarprUl, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, COALESCE( T4.ProDsc, '                            ') AS CliProDsc, COALESCE( T4.ProCod, 'XXXXXXXX') AS CliProBus FROM (((TXPCPREPR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.CliProCod) WHERE TM1.CliProCod = ? and TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.CliProCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G911", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G912", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G913", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G914", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G915", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod > ? or CliProCod = ? and CliCod > ? or CliCod = ? and CliProCod = ? and ArtCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G916", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CliProCod, EmprCod, CliCod, ArtCod FROM TXPCPREPR WHERE ( CliProCod < ? or CliProCod = ? and CliCod < ? or CliCod = ? and CliProCod = ? and ArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, CliProCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G917", "INSERT INTO TXPCPREPR(CliProCod, ClarprUl, EmprCod, CliCod, ArtCod, Clpratpk, Clpratpm, ProPreAct, ProFecAnt, ProPreAnt, ProFecAct, ProDscMtr, ProDscKgm, ProFecCri, ProPreEst) VALUES(?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPCPREPR")
         ,new UpdateCursor("T01G918", "UPDATE TXPCPREPR SET ClarprUl=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK, "TXPCPREPR")
         ,new UpdateCursor("T01G919", "DELETE FROM TXPCPREPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK, "TXPCPREPR")
         ,new ForEachCursor("T01G920", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G921", "SELECT COALESCE( ProDsc, '                            ') AS CliProDsc, COALESCE( ProCod, 'XXXXXXXX') AS CliProBus FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G922", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCodF FROM TXPPREGBL WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G923", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G924", "UPDATE TXPCPREPR SET ClarprUl=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ?", GX_NOMASK, "TXPCPREPR")
         ,new ForEachCursor("T01G925", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G926", "SELECT CliCod, CliProCod, ArtCod, Clarprnl, Clarprmi, Clarprmx, Clarprmkm, Clarprmmx, EmprCod FROM TXPCLARPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and Clarprnl = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, Clarprnl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G927", "SELECT EmprCod, CliCod, CliProCod, ArtCod, Clarprnl FROM TXPCLARPR WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND Clarprnl = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01G928", "INSERT INTO TXPCLARPR(CliCod, CliProCod, ArtCod, Clarprnl, Clarprmi, Clarprmx, Clarprmkm, Clarprmmx, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLARPR")
         ,new UpdateCursor("T01G929", "UPDATE TXPCLARPR SET Clarprmi=?, Clarprmx=?, Clarprmkm=?, Clarprmmx=?  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND Clarprnl = ?", GX_NOMASK, "TXPCLARPR")
         ,new UpdateCursor("T01G930", "DELETE FROM TXPCLARPR  WHERE EmprCod = ? AND CliCod = ? AND CliProCod = ? AND ArtCod = ? AND Clarprnl = ?", GX_NOMASK, "TXPCLARPR")
         ,new ForEachCursor("T01G931", "SELECT EmprCod, CliCod, CliProCod, ArtCod, Clarprnl FROM TXPCLARPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, Clarprnl ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G932", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G933", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 5);
               }
               stmt.setString(9, (String)parms[12], 3);
               return;
            case 27 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 8);
               stmt.setString(8, (String)parms[11], 16);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

