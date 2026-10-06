package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpromd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"PMDCOLNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8531PMDConCod = (int)(GXutil.lval( httpContext.GetPar( "PMDConCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asapmdcolnom11M1159( A396EmprCod, A252CliCod, A8531PMDConCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Programas de Tint. Moda 21", ""), (short)(0)) ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_67 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_67"))) ;
      nGXsfl_67_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_67_idx"))) ;
      sGXsfl_67_idx = httpContext.GetPar( "sGXsfl_67_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tpromd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpromd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_impl.class ));
   }

   public tpromd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\TProMD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nro de Ultimo Programa", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDProUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A8390PMDProUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDProUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8390PMDProUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8390PMDProUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDProUlt_Jsonclick, 0, "", "", "", "", "", 1, edtPMDProUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      /* Save parent mode. */
      sMode1158 = Gx_mode ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1158 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1158 = (short)(1) ;
            scanStart11M1158( ) ;
            while ( RcdFound1158 != 0 )
            {
               init_level_properties1158( ) ;
               getByPrimaryKey11M1158( ) ;
               addRow11M1158( ) ;
               scanNext11M1158( ) ;
            }
            scanEnd11M1158( ) ;
            nBlankRcdCount1158 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal11M1158( ) ;
         standaloneModal11M1158( ) ;
         sMode1158 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow11M1158( ) ;
            edtPMDCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPMDDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPMDUltCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDULTCON_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDUltCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDUltCon_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1158 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal11M1158( ) ;
            }
            sendRow11M1158( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1158 = (short)(5) ;
         nRcdExists_1158 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart11M1158( ) ;
            while ( RcdFound1158 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451158( ) ;
               init_level_properties1158( ) ;
               standaloneNotModal11M1158( ) ;
               getByPrimaryKey11M1158( ) ;
               standaloneModal11M1158( ) ;
               addRow11M1158( ) ;
               scanNext11M1158( ) ;
            }
            scanEnd11M1158( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1158 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451158( ) ;
      initAll11M1158( ) ;
      init_level_properties1158( ) ;
      nRcdExists_1158 = (short)(0) ;
      nIsMod_1158 = (short)(0) ;
      nRcdDeleted_1158 = (short)(0) ;
      nBlankRcdCount1158 = (short)(nBlankRcdUsr1158+nBlankRcdCount1158) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1158 > 0 )
      {
         standaloneNotModal11M1158( ) ;
         standaloneModal11M1158( ) ;
         addRow11M1158( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPMDCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1158 = (short)(nBlankRcdCount1158-1) ;
      }
      Gx_mode = sMode1158 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1158 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_Facturacion\\TProMD.htm");
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
      e1111M2 ();
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
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z8390PMDProUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8390PMDProUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14009Id_PMDDsc = httpContext.cgiGet( "ID_PMDDSC") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDProUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDProUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDPROULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMDProUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8390PMDProUlt = (short)(0) ;
               n8390PMDProUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
            }
            else
            {
               A8390PMDProUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDProUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8390PMDProUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
                        e1111M2 ();
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
            initAll11M21( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1159_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1159_Enabled), 5, 0), !bGXsfl_67_Refreshing);
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
      disableAttributes11M21( ) ;
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

   public void confirm_11M0( )
   {
      beforeValidate11M21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls11M21( ) ;
         }
         else
         {
            checkExtendedTable11M21( ) ;
            if ( AnyError == 0 )
            {
               zm11M21( 4) ;
            }
            closeExtendedTableCursors11M21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_11M1158( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues11M0( ) ;
      }
   }

   public void confirm_11M1159( )
   {
      nGXsfl_67_idx = 0 ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         readRow11M1159( ) ;
         if ( ( nRcdExists_1159 != 0 ) || ( nIsMod_1159 != 0 ) )
         {
            getKey11M1159( ) ;
            if ( ( nRcdExists_1159 == 0 ) && ( nRcdDeleted_1159 == 0 ) )
            {
               if ( RcdFound1159 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate11M1159( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable11M1159( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors11M1159( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMDCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1159 != 0 )
               {
                  if ( nRcdDeleted_1159 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey11M1159( ) ;
                     load11M1159( ) ;
                     beforeValidate11M1159( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls11M1159( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1159 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate11M1159( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable11M1159( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors11M1159( ) ;
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
                  if ( nRcdDeleted_1159 == 0 )
                  {
                     GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1159_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColNom_Internalname, GXutil.rtrim( A8394PMDColNom)) ;
         httpContext.changePostValue( edtPMDPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDEntKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoAca_Internalname, GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDValFch_Internalname, localUtil.format(A8399PMDValFch, "99/99/99")) ;
         httpContext.changePostValue( edtPMDColCli_Internalname, GXutil.rtrim( A8530PMDColCli)) ;
         httpContext.changePostValue( edtPMDConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_67_idx, localUtil.dtoc( Z8399PMDValFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_67_idx, GXutil.rtrim( Z8530PMDColCli)) ;
         httpContext.changePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1159 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1159_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1159_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNOM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDENTKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOTIN_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOACA_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDVALFCH_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLCLI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCONCOD_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREUNI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_11M1158( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow11M1158( ) ;
         if ( ( nRcdExists_1158 != 0 ) || ( nIsMod_1158 != 0 ) )
         {
            getKey11M1158( ) ;
            if ( ( nRcdExists_1158 == 0 ) && ( nRcdDeleted_1158 == 0 ) )
            {
               if ( RcdFound1158 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate11M1158( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable11M1158( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors11M1158( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1158 = Gx_mode ;
                        confirm_11M1159( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1158 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1158 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMDCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1158 != 0 )
               {
                  if ( nRcdDeleted_1158 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey11M1158( ) ;
                     load11M1158( ) ;
                     beforeValidate11M1158( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls11M1158( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1158 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate11M1158( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable11M1158( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors11M1158( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1158 = Gx_mode ;
                              confirm_11M1159( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1158 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1158 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1158 == 0 )
                  {
                     GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMDCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDsc_Internalname, GXutil.rtrim( A8392PMDDsc)) ;
         httpContext.changePostValue( edtPMDUltCon_Internalname, GXutil.ltrim( localUtil.ntoc( A8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8391PMDCod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8392PMDDsc_"+sGXsfl_45_idx, GXutil.rtrim( Z8392PMDDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z8529PMDUltCon_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_67_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1158 != 0 )
         {
            httpContext.changePostValue( "PMDCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDULTCON_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDUltCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption11M0( )
   {
   }

   public void e1111M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpromd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpromd_impl.this.AV32EmprCod = GXv_char2[0] ;
      tpromd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpromd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm11M21( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T011M7_A279CliNom[0] ;
            Z8390PMDProUlt = T011M7_A8390PMDProUlt[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z8390PMDProUlt = A8390PMDProUlt ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z8390PMDProUlt = A8390PMDProUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void load11M21( )
   {
      /* Using cursor T011M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T011M9_A407EmprNom[0] ;
         n407EmprNom = T011M9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T011M9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8390PMDProUlt = T011M9_A8390PMDProUlt[0] ;
         n8390PMDProUlt = T011M9_n8390PMDProUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
         zm11M21( -3) ;
      }
      pr_default.close(7);
      onLoadActions11M21( ) ;
   }

   public void onLoadActions11M21( )
   {
   }

   public void checkExtendedTable11M21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T011M8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011M8_A407EmprNom[0] ;
      n407EmprNom = T011M8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors11M21( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T011M10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011M10_A407EmprNom[0] ;
      n407EmprNom = T011M10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey11M21( )
   {
      /* Using cursor T011M11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T011M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm11M21( 3) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T011M7_A252CliCod[0] ;
         n252CliCod = T011M7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T011M7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8390PMDProUlt = T011M7_A8390PMDProUlt[0] ;
         n8390PMDProUlt = T011M7_n8390PMDProUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
         A396EmprCod = T011M7_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load11M21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey11M21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey11M21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey11M21( ) ;
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
      /* Using cursor T011M12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T011M12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011M12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011M12_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T011M12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011M12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011M12_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T011M12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T011M12_A252CliCod[0] ;
            n252CliCod = T011M12_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T011M13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T011M13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011M13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011M13_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T011M13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011M13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011M13_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T011M13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T011M13_A252CliCod[0] ;
            n252CliCod = T011M13_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey11M21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert11M21( ) ;
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
               update11M21( ) ;
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
               insert11M21( ) ;
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
                  insert11M21( ) ;
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
      getKey11M21( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tpromd");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_11M0( ) ;
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
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart11M21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11M21( ) ;
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
      GX_FocusControl = edtCliNom_Internalname ;
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
      GX_FocusControl = edtCliNom_Internalname ;
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
      scanStart11M21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext11M21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11M21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency11M21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011M6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z279CliNom, T011M6_A279CliNom[0]) != 0 ) || ( Z8390PMDProUlt != T011M6_A8390PMDProUlt[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T011M6_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T011M6_A279CliNom[0]);
            }
            if ( Z8390PMDProUlt != T011M6_A8390PMDProUlt[0] )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDProUlt");
               GXutil.writeLogRaw("Old: ",Z8390PMDProUlt);
               GXutil.writeLogRaw("Current: ",T011M6_A8390PMDProUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11M21( )
   {
      beforeValidate11M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11M21( 0) ;
         checkOptimisticConcurrency11M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11M21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011M14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n8390PMDProUlt), Short.valueOf(A8390PMDProUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel11M21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption11M0( ) ;
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
            load11M21( ) ;
         }
         endLevel11M21( ) ;
      }
      closeExtendedTableCursors11M21( ) ;
   }

   public void update11M21( )
   {
      beforeValidate11M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11M21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate11M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011M15 */
                  pr_default.execute(13, new Object[] {A279CliNom, Boolean.valueOf(n8390PMDProUlt), Short.valueOf(A8390PMDProUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate11M21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel11M21( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption11M0( ) ;
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
         endLevel11M21( ) ;
      }
      closeExtendedTableCursors11M21( ) ;
   }

   public void deferredUpdate11M21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11M21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11M21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11M21( ) ;
         afterConfirm11M21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11M21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011M16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
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
                        initAll11M21( ) ;
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
                     resetCaption11M0( ) ;
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
      endLevel11M21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11M21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T011M17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T011M17_A407EmprNom[0] ;
         n407EmprNom = T011M17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T011M18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T011M19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T011M20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T011M21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T011M22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T011M23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T011M24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T011M25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T011M26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T011M27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T011M28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T011M29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T011M30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T011M31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T011M32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T011M33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T011M34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T011M35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T011M36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T011M37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T011M38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T011M39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T011M40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T011M41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T011M42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T011M43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T011M44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T011M45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T011M46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T011M47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T011M48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T011M49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T011M50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T011M51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T011M52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T011M53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T011M54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T011M55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T011M56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T011M57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T011M58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T011M59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T011M60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T011M61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T011M62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T011M63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T011M64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T011M65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T011M66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T011M67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T011M68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T011M69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T011M70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T011M71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T011M72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T011M73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T011M74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T011M75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T011M76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T011M77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T011M78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T011M79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
      }
   }

   public void processNestedLevel11M1158( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow11M1158( ) ;
         if ( ( nRcdExists_1158 != 0 ) || ( nIsMod_1158 != 0 ) )
         {
            standaloneNotModal11M1158( ) ;
            getKey11M1158( ) ;
            if ( ( nRcdExists_1158 == 0 ) && ( nRcdDeleted_1158 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert11M1158( ) ;
            }
            else
            {
               if ( RcdFound1158 != 0 )
               {
                  if ( ( nRcdDeleted_1158 != 0 ) && ( nRcdExists_1158 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete11M1158( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1158 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update11M1158( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1158 == 0 )
                  {
                     GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMDCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDsc_Internalname, GXutil.rtrim( A8392PMDDsc)) ;
         httpContext.changePostValue( edtPMDUltCon_Internalname, GXutil.ltrim( localUtil.ntoc( A8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8391PMDCod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8392PMDDsc_"+sGXsfl_45_idx, GXutil.rtrim( Z8392PMDDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z8529PMDUltCon_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_67_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1158_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1158 != 0 )
         {
            httpContext.changePostValue( "PMDCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDULTCON_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDUltCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll11M1158( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1158 = (short)(0) ;
      nIsMod_1158 = (short)(0) ;
      nRcdDeleted_1158 = (short)(0) ;
   }

   public void processLevel11M21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel11M1158( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel11M21( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete11M21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd");
         if ( AnyError == 0 )
         {
            confirmValues11M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tpromd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11M21( )
   {
      /* Scan By routine */
      /* Using cursor T011M80 */
      pr_default.execute(78);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T011M80_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T011M80_A252CliCod[0] ;
         n252CliCod = T011M80_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11M21( )
   {
      /* Scan next routine */
      pr_default.readNext(78);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T011M80_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T011M80_A252CliCod[0] ;
         n252CliCod = T011M80_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd11M21( )
   {
      pr_default.close(78);
   }

   public void afterConfirm11M21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11M21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11M21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11M21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11M21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11M21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11M21( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPMDProUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDProUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDProUlt_Enabled), 5, 0), true);
   }

   public void zm11M1158( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8392PMDDsc = T011M5_A8392PMDDsc[0] ;
            Z8529PMDUltCon = T011M5_A8529PMDUltCon[0] ;
         }
         else
         {
            Z8392PMDDsc = A8392PMDDsc ;
            Z8529PMDUltCon = A8529PMDUltCon ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8392PMDDsc = A8392PMDDsc ;
         Z8529PMDUltCon = A8529PMDUltCon ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal11M1158( )
   {
   }

   public void standaloneModal11M1158( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMDCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtPMDCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load11M1158( )
   {
      /* Using cursor T011M81 */
      pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A8392PMDDsc = T011M81_A8392PMDDsc[0] ;
         n8392PMDDsc = T011M81_n8392PMDDsc[0] ;
         A8529PMDUltCon = T011M81_A8529PMDUltCon[0] ;
         n8529PMDUltCon = T011M81_n8529PMDUltCon[0] ;
         zm11M1158( -5) ;
      }
      pr_default.close(79);
      onLoadActions11M1158( ) ;
   }

   public void onLoadActions11M1158( )
   {
      A14009Id_PMDDsc = GXutil.trim( GXutil.str( A8391PMDCod, 4, 0)) + "-" + GXutil.trim( A8392PMDDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14009Id_PMDDsc", A14009Id_PMDDsc);
   }

   public void checkExtendedTable11M1158( )
   {
      nIsDirty_1158 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal11M1158( ) ;
      nIsDirty_1158 = (short)(1) ;
      A14009Id_PMDDsc = GXutil.trim( GXutil.str( A8391PMDCod, 4, 0)) + "-" + GXutil.trim( A8392PMDDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14009Id_PMDDsc", A14009Id_PMDDsc);
   }

   public void closeExtendedTableCursors11M1158( )
   {
   }

   public void enableDisable11M1158( )
   {
   }

   public void getKey11M1158( )
   {
      /* Using cursor T011M82 */
      pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound1158 = (short)(1) ;
      }
      else
      {
         RcdFound1158 = (short)(0) ;
      }
      pr_default.close(80);
   }

   public void getByPrimaryKey11M1158( )
   {
      /* Using cursor T011M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm11M1158( 5) ;
         RcdFound1158 = (short)(1) ;
         initializeNonKey11M1158( ) ;
         A8391PMDCod = T011M5_A8391PMDCod[0] ;
         A8392PMDDsc = T011M5_A8392PMDDsc[0] ;
         n8392PMDDsc = T011M5_n8392PMDDsc[0] ;
         A8529PMDUltCon = T011M5_A8529PMDUltCon[0] ;
         n8529PMDUltCon = T011M5_n8529PMDUltCon[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         sMode1158 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11M1158( ) ;
         load11M1158( ) ;
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1158 = (short)(0) ;
         initializeNonKey11M1158( ) ;
         sMode1158 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11M1158( ) ;
         Gx_mode = sMode1158 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes11M1158( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency11M1158( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z8392PMDDsc, T011M4_A8392PMDDsc[0]) != 0 ) || ( Z8529PMDUltCon != T011M4_A8529PMDUltCon[0] ) )
         {
            if ( GXutil.strcmp(Z8392PMDDsc, T011M4_A8392PMDDsc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDDsc");
               GXutil.writeLogRaw("Old: ",Z8392PMDDsc);
               GXutil.writeLogRaw("Current: ",T011M4_A8392PMDDsc[0]);
            }
            if ( Z8529PMDUltCon != T011M4_A8529PMDUltCon[0] )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDUltCon");
               GXutil.writeLogRaw("Old: ",Z8529PMDUltCon);
               GXutil.writeLogRaw("Current: ",T011M4_A8529PMDUltCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPProMD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11M1158( )
   {
      beforeValidate11M1158( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M1158( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11M1158( 0) ;
         checkOptimisticConcurrency11M1158( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11M1158( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11M1158( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011M83 */
                  pr_default.execute(81, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Boolean.valueOf(n8392PMDDsc), A8392PMDDsc, Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
                  if ( (pr_default.getStatus(81) == 1) )
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
                        processLevel11M1158( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load11M1158( ) ;
         }
         endLevel11M1158( ) ;
      }
      closeExtendedTableCursors11M1158( ) ;
   }

   public void update11M1158( )
   {
      beforeValidate11M1158( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M1158( ) ;
      }
      if ( ( nIsMod_1158 != 0 ) || ( nIsDirty_1158 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency11M1158( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm11M1158( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate11M1158( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011M84 */
                     pr_default.execute(82, new Object[] {Boolean.valueOf(n8392PMDDsc), A8392PMDDsc, Boolean.valueOf(n8529PMDUltCon), Integer.valueOf(A8529PMDUltCon), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
                     if ( (pr_default.getStatus(82) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate11M1158( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel11M1158( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey11M1158( ) ;
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
            endLevel11M1158( ) ;
         }
      }
      closeExtendedTableCursors11M1158( ) ;
   }

   public void deferredUpdate11M1158( )
   {
   }

   public void delete11M1158( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11M1158( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11M1158( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11M1158( ) ;
         afterConfirm11M1158( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11M1158( ) ;
            if ( AnyError == 0 )
            {
               scanStart11M1159( ) ;
               while ( RcdFound1159 != 0 )
               {
                  getByPrimaryKey11M1159( ) ;
                  delete11M1159( ) ;
                  scanNext11M1159( ) ;
               }
               scanEnd11M1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011M85 */
                  pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
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
      }
      sMode1158 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11M1158( ) ;
      Gx_mode = sMode1158 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11M1158( )
   {
      standaloneModal11M1158( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14009Id_PMDDsc = GXutil.trim( GXutil.str( A8391PMDCod, 4, 0)) + "-" + GXutil.trim( A8392PMDDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14009Id_PMDDsc", A14009Id_PMDDsc);
      }
   }

   public void processNestedLevel11M1159( )
   {
      nGXsfl_67_idx = 0 ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         readRow11M1159( ) ;
         if ( ( nRcdExists_1159 != 0 ) || ( nIsMod_1159 != 0 ) )
         {
            standaloneNotModal11M1159( ) ;
            getKey11M1159( ) ;
            if ( ( nRcdExists_1159 == 0 ) && ( nRcdDeleted_1159 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert11M1159( ) ;
            }
            else
            {
               if ( RcdFound1159 != 0 )
               {
                  if ( ( nRcdDeleted_1159 != 0 ) && ( nRcdExists_1159 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete11M1159( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1159 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update11M1159( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1159 == 0 )
                  {
                     GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1159_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDColNom_Internalname, GXutil.rtrim( A8394PMDColNom)) ;
         httpContext.changePostValue( edtPMDPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDEntKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDDtoAca_Internalname, GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDValFch_Internalname, localUtil.format(A8399PMDValFch, "99/99/99")) ;
         httpContext.changePostValue( edtPMDColCli_Internalname, GXutil.rtrim( A8530PMDColCli)) ;
         httpContext.changePostValue( edtPMDConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDPreUni_Internalname, GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_67_idx, localUtil.dtoc( Z8399PMDValFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_67_idx, GXutil.rtrim( Z8530PMDColCli)) ;
         httpContext.changePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1159_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1159 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1159_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1159_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLNOM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDENTKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOTIN_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDDTOACA_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDVALFCH_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCOLCLI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDCONCOD_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDPREUNI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll11M1159( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1159 = (short)(0) ;
      nIsMod_1159 = (short)(0) ;
      nRcdDeleted_1159 = (short)(0) ;
   }

   public void processLevel11M1158( )
   {
      /* Save parent mode. */
      sMode1158 = Gx_mode ;
      processNestedLevel11M1159( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1158 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel11M1158( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11M1158( )
   {
      /* Scan By routine */
      /* Using cursor T011M86 */
      pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1158 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A8391PMDCod = T011M86_A8391PMDCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11M1158( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound1158 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1158 = (short)(1) ;
         A8391PMDCod = T011M86_A8391PMDCod[0] ;
      }
   }

   public void scanEnd11M1158( )
   {
      pr_default.close(84);
   }

   public void afterConfirm11M1158( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11M1158( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11M1158( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11M1158( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11M1158( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11M1158( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11M1158( )
   {
      edtPMDCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPMDDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPMDUltCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDUltCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDUltCon_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void zm11M1159( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8395PMDPreKgm = T011M3_A8395PMDPreKgm[0] ;
            Z8396PMDEntKgm = T011M3_A8396PMDEntKgm[0] ;
            Z8397PMDDtoTin = T011M3_A8397PMDDtoTin[0] ;
            Z8398PMDDtoAca = T011M3_A8398PMDDtoAca[0] ;
            Z8399PMDValFch = T011M3_A8399PMDValFch[0] ;
            Z8530PMDColCli = T011M3_A8530PMDColCli[0] ;
            Z8531PMDConCod = T011M3_A8531PMDConCod[0] ;
            Z8532PMDPreUni = T011M3_A8532PMDPreUni[0] ;
         }
         else
         {
            Z8395PMDPreKgm = A8395PMDPreKgm ;
            Z8396PMDEntKgm = A8396PMDEntKgm ;
            Z8397PMDDtoTin = A8397PMDDtoTin ;
            Z8398PMDDtoAca = A8398PMDDtoAca ;
            Z8399PMDValFch = A8399PMDValFch ;
            Z8530PMDColCli = A8530PMDColCli ;
            Z8531PMDConCod = A8531PMDConCod ;
            Z8532PMDPreUni = A8532PMDPreUni ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8393PMDColNum = A8393PMDColNum ;
         Z8395PMDPreKgm = A8395PMDPreKgm ;
         Z8396PMDEntKgm = A8396PMDEntKgm ;
         Z8397PMDDtoTin = A8397PMDDtoTin ;
         Z8398PMDDtoAca = A8398PMDDtoAca ;
         Z8399PMDValFch = A8399PMDValFch ;
         Z8530PMDColCli = A8530PMDColCli ;
         Z8531PMDConCod = A8531PMDConCod ;
         Z8532PMDPreUni = A8532PMDPreUni ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal11M1159( )
   {
   }

   public void standaloneModal11M1159( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMDColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      }
      else
      {
         edtPMDColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      }
   }

   public void load11M1159( )
   {
      /* Using cursor T011M87 */
      pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8395PMDPreKgm = T011M87_A8395PMDPreKgm[0] ;
         A8396PMDEntKgm = T011M87_A8396PMDEntKgm[0] ;
         A8397PMDDtoTin = T011M87_A8397PMDDtoTin[0] ;
         A8398PMDDtoAca = T011M87_A8398PMDDtoAca[0] ;
         A8399PMDValFch = T011M87_A8399PMDValFch[0] ;
         A8530PMDColCli = T011M87_A8530PMDColCli[0] ;
         A8531PMDConCod = T011M87_A8531PMDConCod[0] ;
         A8532PMDPreUni = T011M87_A8532PMDPreUni[0] ;
         zm11M1159( -6) ;
      }
      pr_default.close(85);
      onLoadActions11M1159( ) ;
   }

   public void onLoadActions11M1159( )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      tpromd_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
   }

   public void checkExtendedTable11M1159( )
   {
      nIsDirty_1159 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal11M1159( ) ;
      nIsDirty_1159 = (short)(1) ;
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      tpromd_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
   }

   public void closeExtendedTableCursors11M1159( )
   {
   }

   public void enableDisable11M1159( )
   {
   }

   public void getKey11M1159( )
   {
      /* Using cursor T011M88 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1159 = (short)(1) ;
      }
      else
      {
         RcdFound1159 = (short)(0) ;
      }
      pr_default.close(86);
   }

   public void getByPrimaryKey11M1159( )
   {
      /* Using cursor T011M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm11M1159( 6) ;
         RcdFound1159 = (short)(1) ;
         initializeNonKey11M1159( ) ;
         A8393PMDColNum = T011M3_A8393PMDColNum[0] ;
         A8395PMDPreKgm = T011M3_A8395PMDPreKgm[0] ;
         A8396PMDEntKgm = T011M3_A8396PMDEntKgm[0] ;
         A8397PMDDtoTin = T011M3_A8397PMDDtoTin[0] ;
         A8398PMDDtoAca = T011M3_A8398PMDDtoAca[0] ;
         A8399PMDValFch = T011M3_A8399PMDValFch[0] ;
         A8530PMDColCli = T011M3_A8530PMDColCli[0] ;
         A8531PMDConCod = T011M3_A8531PMDConCod[0] ;
         A8532PMDPreUni = T011M3_A8532PMDPreUni[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8391PMDCod = A8391PMDCod ;
         Z8393PMDColNum = A8393PMDColNum ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11M1159( ) ;
         load11M1159( ) ;
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1159 = (short)(0) ;
         initializeNonKey11M1159( ) ;
         sMode1159 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11M1159( ) ;
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes11M1159( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency11M1159( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8395PMDPreKgm, T011M2_A8395PMDPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8396PMDEntKgm, T011M2_A8396PMDEntKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z8397PMDDtoTin, T011M2_A8397PMDDtoTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8398PMDDtoAca, T011M2_A8398PMDDtoAca[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T011M2_A8399PMDValFch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8530PMDColCli, T011M2_A8530PMDColCli[0]) != 0 ) || ( Z8531PMDConCod != T011M2_A8531PMDConCod[0] ) || ( DecimalUtil.compareTo(Z8532PMDPreUni, T011M2_A8532PMDPreUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8395PMDPreKgm, T011M2_A8395PMDPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDPreKgm");
               GXutil.writeLogRaw("Old: ",Z8395PMDPreKgm);
               GXutil.writeLogRaw("Current: ",T011M2_A8395PMDPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8396PMDEntKgm, T011M2_A8396PMDEntKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDEntKgm");
               GXutil.writeLogRaw("Old: ",Z8396PMDEntKgm);
               GXutil.writeLogRaw("Current: ",T011M2_A8396PMDEntKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z8397PMDDtoTin, T011M2_A8397PMDDtoTin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDDtoTin");
               GXutil.writeLogRaw("Old: ",Z8397PMDDtoTin);
               GXutil.writeLogRaw("Current: ",T011M2_A8397PMDDtoTin[0]);
            }
            if ( DecimalUtil.compareTo(Z8398PMDDtoAca, T011M2_A8398PMDDtoAca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDDtoAca");
               GXutil.writeLogRaw("Old: ",Z8398PMDDtoAca);
               GXutil.writeLogRaw("Current: ",T011M2_A8398PMDDtoAca[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8399PMDValFch), GXutil.resetTime(T011M2_A8399PMDValFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDValFch");
               GXutil.writeLogRaw("Old: ",Z8399PMDValFch);
               GXutil.writeLogRaw("Current: ",T011M2_A8399PMDValFch[0]);
            }
            if ( GXutil.strcmp(Z8530PMDColCli, T011M2_A8530PMDColCli[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDColCli");
               GXutil.writeLogRaw("Old: ",Z8530PMDColCli);
               GXutil.writeLogRaw("Current: ",T011M2_A8530PMDColCli[0]);
            }
            if ( Z8531PMDConCod != T011M2_A8531PMDConCod[0] )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDConCod");
               GXutil.writeLogRaw("Old: ",Z8531PMDConCod);
               GXutil.writeLogRaw("Current: ",T011M2_A8531PMDConCod[0]);
            }
            if ( DecimalUtil.compareTo(Z8532PMDPreUni, T011M2_A8532PMDPreUni[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpromd:[seudo value changed for attri]"+"PMDPreUni");
               GXutil.writeLogRaw("Old: ",Z8532PMDPreUni);
               GXutil.writeLogRaw("Current: ",T011M2_A8532PMDPreUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPProMD1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11M1159( )
   {
      beforeValidate11M1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M1159( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11M1159( 0) ;
         checkOptimisticConcurrency11M1159( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11M1159( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11M1159( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011M89 */
                  pr_default.execute(87, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum), A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8398PMDDtoAca, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
                  if ( (pr_default.getStatus(87) == 1) )
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
            load11M1159( ) ;
         }
         endLevel11M1159( ) ;
      }
      closeExtendedTableCursors11M1159( ) ;
   }

   public void update11M1159( )
   {
      beforeValidate11M1159( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11M1159( ) ;
      }
      if ( ( nIsMod_1159 != 0 ) || ( nIsDirty_1159 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency11M1159( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm11M1159( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate11M1159( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011M90 */
                     pr_default.execute(88, new Object[] {A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8398PMDDtoAca, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
                     if ( (pr_default.getStatus(88) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPProMD1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate11M1159( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey11M1159( ) ;
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
            endLevel11M1159( ) ;
         }
      }
      closeExtendedTableCursors11M1159( ) ;
   }

   public void deferredUpdate11M1159( )
   {
   }

   public void delete11M1159( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11M1159( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11M1159( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11M1159( ) ;
         afterConfirm11M1159( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11M1159( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011M91 */
               pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
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
      sMode1159 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11M1159( ) ;
      Gx_mode = sMode1159 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11M1159( )
   {
      standaloneModal11M1159( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A8394PMDColNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
         tpromd_impl.this.GXt_char1 = GXv_char4[0] ;
         A8394PMDColNom = GXt_char1 ;
      }
   }

   public void endLevel11M1159( )
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

   public void scanStart11M1159( )
   {
      /* Scan By routine */
      /* Using cursor T011M92 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8393PMDColNum = T011M92_A8393PMDColNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11M1159( )
   {
      /* Scan next routine */
      pr_default.readNext(90);
      RcdFound1159 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound1159 = (short)(1) ;
         A8393PMDColNum = T011M92_A8393PMDColNum[0] ;
      }
   }

   public void scanEnd11M1159( )
   {
      pr_default.close(90);
   }

   public void afterConfirm11M1159( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11M1159( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11M1159( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11M1159( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11M1159( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11M1159( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11M1159( )
   {
      edtPMDColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNom_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreKgm_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDEntKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDEntKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDEntKgm_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDDtoTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoTin_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDDtoAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoAca_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDValFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDValFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDValFch_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDColCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColCli_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDConCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDConCod_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPMDPreUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreUni_Enabled), 5, 0), !bGXsfl_67_Refreshing);
   }

   public void send_integrity_lvl_hashes11M1159( )
   {
   }

   public void send_integrity_lvl_hashes11M1158( )
   {
   }

   public void send_integrity_lvl_hashes11M21( )
   {
   }

   public void subsflControlProps_451158( )
   {
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_45_idx ;
      edtPMDCod_Internalname = "PMDCOD_"+sGXsfl_45_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_45_idx ;
      edtPMDDsc_Internalname = "PMDDSC_"+sGXsfl_45_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_45_idx ;
      edtPMDUltCon_Internalname = "PMDULTCON_"+sGXsfl_45_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451158( )
   {
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_45_fel_idx ;
      edtPMDCod_Internalname = "PMDCOD_"+sGXsfl_45_fel_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_45_fel_idx ;
      edtPMDDsc_Internalname = "PMDDSC_"+sGXsfl_45_fel_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_45_fel_idx ;
      edtPMDUltCon_Internalname = "PMDULTCON_"+sGXsfl_45_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_45_fel_idx ;
   }

   public void addRow11M1158( )
   {
      nRC_GXsfl_67 = 0 ;
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451158( ) ;
      sendRow11M1158( ) ;
   }

   public void sendRow11M1158( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_45_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_45_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_45_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Programa", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPMDCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock7_Internalname,httpContext.getMessage( "Descripción Programa", ""),"","",lblTextblock7_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDsc_Internalname,GXutil.rtrim( A8392PMDDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPMDDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Ultimo nro de línea", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDUltCon_Internalname,GXutil.ltrim( localUtil.ntoc( A8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDUltCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8529PMDUltCon), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8529PMDUltCon), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDUltCon_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPMDUltCon_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol67( ) ;
      nGXsfl_67_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1159 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1159 = (short)(1) ;
            scanStart11M1159( ) ;
            while ( RcdFound1159 != 0 )
            {
               init_level_properties1159( ) ;
               getByPrimaryKey11M1159( ) ;
               addRow11M1159( ) ;
               scanNext11M1159( ) ;
            }
            scanEnd11M1159( ) ;
            nBlankRcdCount1159 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal11M1159( ) ;
         standaloneModal11M1159( ) ;
         sMode1159 = Gx_mode ;
         while ( nGXsfl_67_idx < nRC_GXsfl_67 )
         {
            bGXsfl_67_Refreshing = true ;
            readRow11M1159( ) ;
            edtavnRcdDeleted_1159_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1159_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1159_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1159_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNUM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNOM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNom_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREKGM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreKgm_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDEntKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDENTKGM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDEntKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDEntKgm_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDDtoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOTIN_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoTin_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDDtoAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOACA_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDDtoAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDDtoAca_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDValFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDVALFCH_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDValFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDValFch_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDColCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLCLI_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDColCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColCli_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCONCOD_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDConCod_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPMDPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREUNI_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDPreUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreUni_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            if ( ( nRcdExists_1159 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal11M1159( ) ;
            }
            sendRow11M1159( ) ;
            bGXsfl_67_Refreshing = false ;
         }
         Gx_mode = sMode1159 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1159 = (short)(5) ;
         nRcdExists_1159 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart11M1159( ) ;
            while ( RcdFound1159 != 0 )
            {
               sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx+1), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
               subsflControlProps_671159( ) ;
               init_level_properties1159( ) ;
               standaloneNotModal11M1159( ) ;
               getByPrimaryKey11M1159( ) ;
               standaloneModal11M1159( ) ;
               addRow11M1159( ) ;
               scanNext11M1159( ) ;
            }
            scanEnd11M1159( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1159 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx+1), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
      subsflControlProps_671159( ) ;
      initAll11M1159( ) ;
      init_level_properties1159( ) ;
      nRcdExists_1159 = (short)(0) ;
      nIsMod_1159 = (short)(0) ;
      nRcdDeleted_1159 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 45 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_45_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1159 = (short)(nBlankRcdUsr1159+nBlankRcdCount1159) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1159 > 0 )
      {
         standaloneNotModal11M1159( ) ;
         standaloneModal11M1159( ) ;
         addRow11M1159( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPMDColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1159 = (short)(nBlankRcdCount1159-1) ;
      }
      Gx_mode = sMode1159 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_45_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_45_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_45_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes11M1158( ) ;
      GXCCtl = "Z8391PMDCod_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8392PMDDsc_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8392PMDDsc));
      GXCCtl = "Z8529PMDUltCon_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8529PMDUltCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_67_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1158_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1158_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1158_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1158, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDULTCON_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDUltCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_45_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow11M1158( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451158( ) ;
      edtPMDCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDUltCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDULTCON_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PMDCOD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDCod_Internalname ;
         wbErr = true ;
         A8391PMDCod = (short)(0) ;
      }
      else
      {
         A8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8392PMDDsc = httpContext.cgiGet( edtPMDDsc_Internalname) ;
      n8392PMDDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDUltCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDUltCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PMDULTCON_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDUltCon_Internalname ;
         wbErr = true ;
         A8529PMDUltCon = 0 ;
         n8529PMDUltCon = false ;
      }
      else
      {
         A8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDUltCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8529PMDUltCon = false ;
      }
      GXCCtl = "Z8391PMDCod_" + sGXsfl_45_idx ;
      Z8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8392PMDDsc_" + sGXsfl_45_idx ;
      Z8392PMDDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8529PMDUltCon_" + sGXsfl_45_idx ;
      Z8529PMDUltCon = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_45_idx ;
      nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1158_" + sGXsfl_45_idx ;
      nRcdDeleted_1158 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1158_" + sGXsfl_45_idx ;
      nRcdExists_1158 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1158_" + sGXsfl_45_idx ;
      nIsMod_1158 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_45_idx ;
      nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_671159( )
   {
      edtavnRcdDeleted_1159_Internalname = "vNRCDDELETED_1159_"+sGXsfl_67_idx ;
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_67_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_67_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_67_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_67_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_67_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_67_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_67_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_67_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_67_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_671159( )
   {
      edtavnRcdDeleted_1159_Internalname = "vNRCDDELETED_1159_"+sGXsfl_67_fel_idx ;
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_67_fel_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_67_fel_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_67_fel_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_67_fel_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_67_fel_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_67_fel_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_67_fel_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_67_fel_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_67_fel_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_67_fel_idx ;
   }

   public void addRow11M1159( )
   {
      nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
      subsflControlProps_671159( ) ;
      sendRow11M1159( ) ;
   }

   public void sendRow11M1159( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1159_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1159_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1159), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1159), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1159_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1159_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDColNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNom_Internalname,GXutil.rtrim( A8394PMDColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDPreKgm_Enabled!=0) ? localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99") : localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDEntKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDEntKgm_Enabled!=0) ? localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 ") : localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 "))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDEntKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDEntKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDDtoTin_Enabled!=0) ? localUtil.format( A8397PMDDtoTin, "ZZ9.99 ") : localUtil.format( A8397PMDDtoTin, "ZZ9.99 "))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDDtoTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoAca_Internalname,GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDDtoAca_Enabled!=0) ? localUtil.format( A8398PMDDtoAca, "ZZ9.99") : localUtil.format( A8398PMDDtoAca, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDDtoAca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDValFch_Internalname,localUtil.format(A8399PMDValFch, "99/99/99"),localUtil.format( A8399PMDValFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDValFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDValFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColCli_Internalname,GXutil.rtrim( A8530PMDColCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDColCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDConCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDConCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDConCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDConCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1159_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1158_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDPreUni_Enabled!=0) ? localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999") : localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPMDPreUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes11M1159( ) ;
      GXCCtl = "Z8393PMDColNum_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8395PMDPreKgm_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8395PMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8396PMDEntKgm_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8396PMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8397PMDDtoTin_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8397PMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8398PMDDtoAca_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8399PMDValFch_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8399PMDValFch, 0, "/"));
      GXCCtl = "Z8530PMDColCli_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8530PMDColCli));
      GXCCtl = "Z8531PMDConCod_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8532PMDPreUni_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1159_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1159_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1159_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1159, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1159_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1159_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLNOM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDPREKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDENTKGM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDDTOTIN_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDDTOACA_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDVALFCH_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLCLI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCONCOD_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDPREUNI_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow11M1159( )
   {
      nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
      subsflControlProps_671159( ) ;
      edtavnRcdDeleted_1159_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1159_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNUM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLNOM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREKGM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDEntKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDENTKGM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDDtoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOTIN_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDDtoAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDDTOACA_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDValFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDVALFCH_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDColCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCOLCLI_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDCONCOD_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDPreUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDPREUNI_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1159_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1159_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1159");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1159_Internalname ;
         wbErr = true ;
         nRcdDeleted_1159 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1159 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1159_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PMDCOLNUM_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDColNum_Internalname ;
         wbErr = true ;
         A8393PMDColNum = 0 ;
      }
      else
      {
         A8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8394PMDColNom = httpContext.cgiGet( edtPMDColNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDPREKGM_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDPreKgm_Internalname ;
         wbErr = true ;
         A8395PMDPreKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDENTKGM_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDEntKgm_Internalname ;
         wbErr = true ;
         A8396PMDEntKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDDTOTIN_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDDtoTin_Internalname ;
         wbErr = true ;
         A8397PMDDtoTin = DecimalUtil.ZERO ;
      }
      else
      {
         A8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDDTOACA_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDDtoAca_Internalname ;
         wbErr = true ;
         A8398PMDDtoAca = DecimalUtil.ZERO ;
      }
      else
      {
         A8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtPMDValFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "PMDVALFCH_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDValFch_Internalname ;
         wbErr = true ;
         A8399PMDValFch = GXutil.nullDate() ;
      }
      else
      {
         A8399PMDValFch = localUtil.ctod( httpContext.cgiGet( edtPMDValFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      A8530PMDColCli = httpContext.cgiGet( edtPMDColCli_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PMDCONCOD_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDConCod_Internalname ;
         wbErr = true ;
         A8531PMDConCod = 0 ;
      }
      else
      {
         A8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PMDPREUNI_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDPreUni_Internalname ;
         wbErr = true ;
         A8532PMDPreUni = DecimalUtil.ZERO ;
      }
      else
      {
         A8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)) ;
      }
      GXCCtl = "Z8393PMDColNum_" + sGXsfl_67_idx ;
      Z8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8395PMDPreKgm_" + sGXsfl_67_idx ;
      Z8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8396PMDEntKgm_" + sGXsfl_67_idx ;
      Z8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8397PMDDtoTin_" + sGXsfl_67_idx ;
      Z8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8398PMDDtoAca_" + sGXsfl_67_idx ;
      Z8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8399PMDValFch_" + sGXsfl_67_idx ;
      Z8399PMDValFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8530PMDColCli_" + sGXsfl_67_idx ;
      Z8530PMDColCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8531PMDConCod_" + sGXsfl_67_idx ;
      Z8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8532PMDPreUni_" + sGXsfl_67_idx ;
      Z8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1159_" + sGXsfl_67_idx ;
      nRcdDeleted_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1159_" + sGXsfl_67_idx ;
      nRcdExists_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1159_" + sGXsfl_67_idx ;
      nIsMod_1159 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPMDColNum_Enabled = edtPMDColNum_Enabled ;
      defedtPMDCod_Enabled = edtPMDCod_Enabled ;
   }

   public void confirmValues11M0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451158( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451158( ) ;
         httpContext.changePostValue( "Z8391PMDCod_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8391PMDCod_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8391PMDCod_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8392PMDDsc_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8392PMDDsc_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8392PMDDsc_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8529PMDUltCon_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8529PMDUltCon_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8529PMDUltCon_"+sGXsfl_45_idx) ;
      }
      nGXsfl_67_idx = 0 ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
      subsflControlProps_671159( ) ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
         subsflControlProps_671159( ) ;
         httpContext.changePostValue( "Z8393PMDColNum_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8393PMDColNum_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8393PMDColNum_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8395PMDPreKgm_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8395PMDPreKgm_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8396PMDEntKgm_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8396PMDEntKgm_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8397PMDDtoTin_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8397PMDDtoTin_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8398PMDDtoAca_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8398PMDDtoAca_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8399PMDValFch_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8399PMDValFch_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8399PMDValFch_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8530PMDColCli_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8530PMDColCli_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8530PMDColCli_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8531PMDConCod_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8531PMDConCod_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8531PMDConCod_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z8532PMDPreUni_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8532PMDPreUni_"+sGXsfl_67_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.facturacion.tpromd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8390PMDProUlt", GXutil.ltrim( localUtil.ntoc( Z8390PMDProUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ID_PMDDSC", GXutil.rtrim( A14009Id_PMDDsc));
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
      return formatLink("app.facturacion.tpromd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TProMD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programas de Tint. Moda 21", "") ;
   }

   public void initializeNonKey11M21( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8390PMDProUlt = (short)(0) ;
      n8390PMDProUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8390PMDProUlt), 4, 0));
      Z279CliNom = "" ;
      Z8390PMDProUlt = (short)(0) ;
   }

   public void initAll11M21( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey11M21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey11M1158( )
   {
      A14009Id_PMDDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14009Id_PMDDsc", A14009Id_PMDDsc);
      A8392PMDDsc = "" ;
      n8392PMDDsc = false ;
      A8529PMDUltCon = 0 ;
      n8529PMDUltCon = false ;
      Z8392PMDDsc = "" ;
      Z8529PMDUltCon = 0 ;
   }

   public void initAll11M1158( )
   {
      A8391PMDCod = (short)(0) ;
      initializeNonKey11M1158( ) ;
   }

   public void standaloneModalInsert11M1158( )
   {
   }

   public void initializeNonKey11M1159( )
   {
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      A8531PMDConCod = 0 ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8531PMDConCod = 0 ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
   }

   public void initAll11M1159( )
   {
      A8393PMDColNum = 0 ;
      initializeNonKey11M1159( ) ;
   }

   public void standaloneModalInsert11M1159( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543734", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpromd.js", "?20268241543734", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1158( )
   {
      edtPMDCod_Enabled = defedtPMDCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void init_level_properties1159( )
   {
      edtPMDColNum_Enabled = defedtPMDColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDColNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
   }

   public void startgridcontrol45( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock6_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock7_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8392PMDDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8529PMDUltCon, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDUltCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol67( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1159, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1159_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8394PMDColNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDEntKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDDtoAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A8399PMDValFch, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDValFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A8530PMDColCli));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDColCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDPreUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPMDProUlt_Internalname = "PMDPROULT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPMDCod_Internalname = "PMDCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPMDDsc_Internalname = "PMDDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPMDUltCon_Internalname = "PMDULTCON" ;
      edtavnRcdDeleted_1159_Internalname = "vNRCDDELETED_1159" ;
      edtPMDColNum_Internalname = "PMDCOLNUM" ;
      edtPMDColNom_Internalname = "PMDCOLNOM" ;
      edtPMDPreKgm_Internalname = "PMDPREKGM" ;
      edtPMDEntKgm_Internalname = "PMDENTKGM" ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN" ;
      edtPMDDtoAca_Internalname = "PMDDTOACA" ;
      edtPMDValFch_Internalname = "PMDVALFCH" ;
      edtPMDColCli_Internalname = "PMDCOLCLI" ;
      edtPMDConCod_Internalname = "PMDCONCOD" ;
      edtPMDPreUni_Internalname = "PMDPREUNI" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock8_Caption = httpContext.getMessage( "Ultimo nro de línea", "") ;
      lblTextblock7_Caption = httpContext.getMessage( "Descripción Programa", "") ;
      lblTextblock6_Caption = httpContext.getMessage( "Programa", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programas de Tint. Moda 21", "") );
      edtPMDPreUni_Jsonclick = "" ;
      edtPMDConCod_Jsonclick = "" ;
      edtPMDColCli_Jsonclick = "" ;
      edtPMDValFch_Jsonclick = "" ;
      edtPMDDtoAca_Jsonclick = "" ;
      edtPMDDtoTin_Jsonclick = "" ;
      edtPMDEntKgm_Jsonclick = "" ;
      edtPMDPreKgm_Jsonclick = "" ;
      edtPMDColNom_Jsonclick = "" ;
      edtPMDColNum_Jsonclick = "" ;
      edtavnRcdDeleted_1159_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtPMDUltCon_Jsonclick = "" ;
      edtPMDDsc_Jsonclick = "" ;
      edtPMDCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtPMDPreUni_Enabled = 1 ;
      edtPMDConCod_Enabled = 1 ;
      edtPMDColCli_Enabled = 1 ;
      edtPMDValFch_Enabled = 1 ;
      edtPMDDtoAca_Enabled = 1 ;
      edtPMDDtoTin_Enabled = 1 ;
      edtPMDEntKgm_Enabled = 1 ;
      edtPMDPreKgm_Enabled = 1 ;
      edtPMDColNom_Enabled = 0 ;
      edtPMDColNum_Enabled = 1 ;
      edtavnRcdDeleted_1159_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPMDUltCon_Enabled = 1 ;
      edtPMDDsc_Enabled = 1 ;
      edtPMDCod_Enabled = 1 ;
      edtPMDProUlt_Jsonclick = "" ;
      edtPMDProUlt_Backcolor = (int)(0xFFFFFF) ;
      edtPMDProUlt_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gx2asapmdcolnom11M1159( String A396EmprCod ,
                                       int A252CliCod ,
                                       int A8531PMDConCod )
   {
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      tpromd_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8394PMDColNom))+"\"") ;
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
      subsflControlProps_451158( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal11M1158( ) ;
         standaloneModal11M1158( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow11M1158( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451158( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_671159( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal11M1158( ) ;
         standaloneModal11M1158( ) ;
         standaloneNotModal11M1159( ) ;
         standaloneModal11M1159( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow11M1159( ) ;
         nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_45_idx ;
         subsflControlProps_671159( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T011M17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011M17_A407EmprNom[0] ;
      n407EmprNom = T011M17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      GX_FocusControl = edtCliNom_Internalname ;
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
      /* Using cursor T011M17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T011M17_A407EmprNom[0] ;
      n407EmprNom = T011M17_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8390PMDProUlt", GXutil.ltrim( localUtil.ntoc( A8390PMDProUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8390PMDProUlt", GXutil.ltrim( localUtil.ntoc( Z8390PMDProUlt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pmdconcod( )
   {
      n252CliCod = false ;
      GXt_char1 = A8394PMDColNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char4) ;
      tpromd_impl.this.GXt_char1 = GXv_char4[0] ;
      A8394PMDColNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8394PMDColNom", GXutil.rtrim( A8394PMDColNom));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8390PMDProUlt',fld:'PMDPROULT',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z8390PMDProUlt'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PMDCOD","{handler:'valid_Pmdcod',iparms:[]");
      setEventMetadata("VALID_PMDCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDDSC","{handler:'valid_Pmddsc',iparms:[]");
      setEventMetadata("VALID_PMDDSC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pmdultcon',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PMDCOLNUM","{handler:'valid_Pmdcolnum',iparms:[]");
      setEventMetadata("VALID_PMDCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_PMDCONCOD","{handler:'valid_Pmdconcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8531PMDConCod',fld:'PMDCONCOD',pic:'ZZZZZ9'},{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]");
      setEventMetadata("VALID_PMDCONCOD",",oparms:[{av:'A8394PMDColNom',fld:'PMDCOLNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pmdpreuni',iparms:[]");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z8392PMDDsc = "" ;
      Z8395PMDPreKgm = DecimalUtil.ZERO ;
      Z8396PMDEntKgm = DecimalUtil.ZERO ;
      Z8397PMDDtoTin = DecimalUtil.ZERO ;
      Z8398PMDDtoAca = DecimalUtil.ZERO ;
      Z8399PMDValFch = GXutil.nullDate() ;
      Z8530PMDColCli = "" ;
      Z8532PMDPreUni = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1158 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A14009Id_PMDDsc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode21 = "" ;
      GXCCtl = "" ;
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8392PMDDsc = "" ;
      AV12Station = "" ;
      AV32EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T011M9_A252CliCod = new int[1] ;
      T011M9_n252CliCod = new boolean[] {false} ;
      T011M9_A407EmprNom = new String[] {""} ;
      T011M9_n407EmprNom = new boolean[] {false} ;
      T011M9_A279CliNom = new String[] {""} ;
      T011M9_A8390PMDProUlt = new short[1] ;
      T011M9_n8390PMDProUlt = new boolean[] {false} ;
      T011M9_A396EmprCod = new String[] {""} ;
      T011M8_A407EmprNom = new String[] {""} ;
      T011M8_n407EmprNom = new boolean[] {false} ;
      T011M10_A407EmprNom = new String[] {""} ;
      T011M10_n407EmprNom = new boolean[] {false} ;
      T011M11_A396EmprCod = new String[] {""} ;
      T011M11_A252CliCod = new int[1] ;
      T011M11_n252CliCod = new boolean[] {false} ;
      T011M7_A252CliCod = new int[1] ;
      T011M7_n252CliCod = new boolean[] {false} ;
      T011M7_A279CliNom = new String[] {""} ;
      T011M7_A8390PMDProUlt = new short[1] ;
      T011M7_n8390PMDProUlt = new boolean[] {false} ;
      T011M7_A396EmprCod = new String[] {""} ;
      T011M12_A396EmprCod = new String[] {""} ;
      T011M12_A252CliCod = new int[1] ;
      T011M12_n252CliCod = new boolean[] {false} ;
      T011M13_A396EmprCod = new String[] {""} ;
      T011M13_A252CliCod = new int[1] ;
      T011M13_n252CliCod = new boolean[] {false} ;
      T011M6_A252CliCod = new int[1] ;
      T011M6_n252CliCod = new boolean[] {false} ;
      T011M6_A279CliNom = new String[] {""} ;
      T011M6_A8390PMDProUlt = new short[1] ;
      T011M6_n8390PMDProUlt = new boolean[] {false} ;
      T011M6_A396EmprCod = new String[] {""} ;
      T011M17_A407EmprNom = new String[] {""} ;
      T011M17_n407EmprNom = new boolean[] {false} ;
      T011M18_A396EmprCod = new String[] {""} ;
      T011M18_A252CliCod = new int[1] ;
      T011M18_n252CliCod = new boolean[] {false} ;
      T011M18_A6930Lb_rclin = new int[1] ;
      T011M19_A396EmprCod = new String[] {""} ;
      T011M19_A6850Tex_NPed = new int[1] ;
      T011M20_A396EmprCod = new String[] {""} ;
      T011M20_A252CliCod = new int[1] ;
      T011M20_n252CliCod = new boolean[] {false} ;
      T011M20_A829TipArtCod = new short[1] ;
      T011M20_A831TipColCod = new byte[1] ;
      T011M20_A583IntCod = new byte[1] ;
      T011M20_A5098TipDisCod = new String[] {""} ;
      T011M20_A6603Est1_anyo = new short[1] ;
      T011M20_A6604Est1_mes = new byte[1] ;
      T011M20_A6605Est1_dia = new byte[1] ;
      T011M21_A396EmprCod = new String[] {""} ;
      T011M21_A6319C_Barcod = new int[1] ;
      T011M21_A6320C_Barcodre = new byte[1] ;
      T011M21_A6321C_Barcodpa = new String[] {""} ;
      T011M21_A6322C_Reclinma = new short[1] ;
      T011M22_A396EmprCod = new String[] {""} ;
      T011M22_A6235DevEmpCod = new int[1] ;
      T011M23_A396EmprCod = new String[] {""} ;
      T011M23_A602MaqCod = new String[] {""} ;
      T011M23_A6078MaqCliCod = new int[1] ;
      T011M23_A6079MaqArtCod = new String[] {""} ;
      T011M24_A396EmprCod = new String[] {""} ;
      T011M24_A5532Lb_numero = new int[1] ;
      T011M25_A396EmprCod = new String[] {""} ;
      T011M25_A252CliCod = new int[1] ;
      T011M25_n252CliCod = new boolean[] {false} ;
      T011M25_A5503CliifLin = new short[1] ;
      T011M26_A396EmprCod = new String[] {""} ;
      T011M26_A252CliCod = new int[1] ;
      T011M26_n252CliCod = new boolean[] {false} ;
      T011M26_A5499ClieiLin = new short[1] ;
      T011M27_A396EmprCod = new String[] {""} ;
      T011M27_A252CliCod = new int[1] ;
      T011M27_n252CliCod = new boolean[] {false} ;
      T011M27_A5495ClidtLin = new short[1] ;
      T011M28_A396EmprCod = new String[] {""} ;
      T011M28_A252CliCod = new int[1] ;
      T011M28_n252CliCod = new boolean[] {false} ;
      T011M28_A5491CliedLin = new short[1] ;
      T011M29_A396EmprCod = new String[] {""} ;
      T011M29_A252CliCod = new int[1] ;
      T011M29_n252CliCod = new boolean[] {false} ;
      T011M29_A5452P_ForCod = new String[] {""} ;
      T011M30_A396EmprCod = new String[] {""} ;
      T011M30_A252CliCod = new int[1] ;
      T011M30_n252CliCod = new boolean[] {false} ;
      T011M30_A5443Mdl_Cod = new String[] {""} ;
      T011M31_A396EmprCod = new String[] {""} ;
      T011M31_A252CliCod = new int[1] ;
      T011M31_n252CliCod = new boolean[] {false} ;
      T011M31_A5436IntCodF2 = new short[1] ;
      T011M32_A396EmprCod = new String[] {""} ;
      T011M32_A252CliCod = new int[1] ;
      T011M32_n252CliCod = new boolean[] {false} ;
      T011M32_A5396IntCodFC = new byte[1] ;
      T011M32_A5434Tip_ColC = new byte[1] ;
      T011M33_A396EmprCod = new String[] {""} ;
      T011M33_A252CliCod = new int[1] ;
      T011M33_n252CliCod = new boolean[] {false} ;
      T011M33_A5428FasPreCod = new String[] {""} ;
      T011M34_A396EmprCod = new String[] {""} ;
      T011M34_A252CliCod = new int[1] ;
      T011M34_n252CliCod = new boolean[] {false} ;
      T011M34_A5398Cli_Proc = new String[] {""} ;
      T011M35_A396EmprCod = new String[] {""} ;
      T011M35_A5130PagIden = new int[1] ;
      T011M36_A396EmprCod = new String[] {""} ;
      T011M36_A5059Hl_hdr = new int[1] ;
      T011M36_A5060Hl_hdrr = new byte[1] ;
      T011M36_A5061Hl_hdrp = new String[] {""} ;
      T011M37_A396EmprCod = new String[] {""} ;
      T011M37_A252CliCod = new int[1] ;
      T011M37_n252CliCod = new boolean[] {false} ;
      T011M37_A4718DishCod = new String[] {""} ;
      T011M37_A5020TipEstCod = new byte[1] ;
      T011M37_A5022GraCod = new byte[1] ;
      T011M38_A396EmprCod = new String[] {""} ;
      T011M38_A4618EnsLCod = new int[1] ;
      T011M39_A396EmprCod = new String[] {""} ;
      T011M39_A4492HreBarCod = new int[1] ;
      T011M39_A4493HreBarReo = new byte[1] ;
      T011M39_A4494HreBarPar = new String[] {""} ;
      T011M39_A4495HreNumCie = new byte[1] ;
      T011M40_A396EmprCod = new String[] {""} ;
      T011M40_A252CliCod = new int[1] ;
      T011M40_n252CliCod = new boolean[] {false} ;
      T011M40_A4415EstCol = new String[] {""} ;
      T011M41_A396EmprCod = new String[] {""} ;
      T011M41_A4185WEBUSU = new String[] {""} ;
      T011M42_A396EmprCod = new String[] {""} ;
      T011M42_A252CliCod = new int[1] ;
      T011M42_n252CliCod = new boolean[] {false} ;
      T011M42_A4079WEBDISCOD = new String[] {""} ;
      T011M42_A4078EMPCOD = new String[] {""} ;
      T011M43_A396EmprCod = new String[] {""} ;
      T011M43_A2637HisEstHRu = new int[1] ;
      T011M43_A2636HisEstHRe = new byte[1] ;
      T011M43_A2635HisEstHPa = new String[] {""} ;
      T011M43_A2638HisEstLCo = new byte[1] ;
      T011M43_A2630HisEstCom = new String[] {""} ;
      T011M43_A2634HisEstFon = new String[] {""} ;
      T011M44_A396EmprCod = new String[] {""} ;
      T011M44_A2574GrpDibCod = new int[1] ;
      T011M45_A396EmprCod = new String[] {""} ;
      T011M45_A2558GrmDibCod = new int[1] ;
      T011M46_A396EmprCod = new String[] {""} ;
      T011M46_A2542GrcDibCod = new int[1] ;
      T011M47_A396EmprCod = new String[] {""} ;
      T011M47_A1031EmpesCod = new String[] {""} ;
      T011M47_A252CliCod = new int[1] ;
      T011M47_n252CliCod = new boolean[] {false} ;
      T011M47_A1032FonCod = new String[] {""} ;
      T011M48_A396EmprCod = new String[] {""} ;
      T011M48_A1013DibCli = new String[] {""} ;
      T011M48_A252CliCod = new int[1] ;
      T011M48_n252CliCod = new boolean[] {false} ;
      T011M48_A1014DibInt = new int[1] ;
      T011M49_A396EmprCod = new String[] {""} ;
      T011M49_A1736AlbExtCod = new long[1] ;
      T011M50_A396EmprCod = new String[] {""} ;
      T011M50_A252CliCod = new int[1] ;
      T011M50_n252CliCod = new boolean[] {false} ;
      T011M50_A3661FacProAny = new short[1] ;
      T011M50_A3662FacProSer = new String[] {""} ;
      T011M50_A3663FacProInt = new byte[1] ;
      T011M50_A3664FacProTip = new byte[1] ;
      T011M50_A3665FacProTar = new short[1] ;
      T011M51_A396EmprCod = new String[] {""} ;
      T011M51_A3646EstTinAny = new short[1] ;
      T011M51_A3647EstTinMes = new byte[1] ;
      T011M51_A3648EstTinDia = new byte[1] ;
      T011M51_A1929EstTinNr = new short[1] ;
      T011M52_A396EmprCod = new String[] {""} ;
      T011M52_A3617AlbTrnCod = new long[1] ;
      T011M53_A396EmprCod = new String[] {""} ;
      T011M53_A252CliCod = new int[1] ;
      T011M53_n252CliCod = new boolean[] {false} ;
      T011M53_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M54_A396EmprCod = new String[] {""} ;
      T011M54_A3073RepCod = new String[] {""} ;
      T011M54_A252CliCod = new int[1] ;
      T011M54_n252CliCod = new boolean[] {false} ;
      T011M55_A396EmprCod = new String[] {""} ;
      T011M55_A3061Codia = new byte[1] ;
      T011M55_A3062CoMes = new byte[1] ;
      T011M55_A3063CoAny = new short[1] ;
      T011M55_A3065CoLin = new byte[1] ;
      T011M55_A3010CoBarCod = new int[1] ;
      T011M55_A3011CoBarReo = new byte[1] ;
      T011M55_A3012CoBarPar = new String[] {""} ;
      T011M56_A396EmprCod = new String[] {""} ;
      T011M56_A2971SabFacCod = new int[1] ;
      T011M57_A396EmprCod = new String[] {""} ;
      T011M57_A2954TiDia = new byte[1] ;
      T011M57_A2955TiMes = new byte[1] ;
      T011M57_A2956TiAny = new short[1] ;
      T011M57_A2958TiLin = new byte[1] ;
      T011M57_A2959TiBarCod = new int[1] ;
      T011M57_A2960TiBarReo = new byte[1] ;
      T011M57_A2961TiBarPar = new String[] {""} ;
      T011M58_A396EmprCod = new String[] {""} ;
      T011M58_A252CliCod = new int[1] ;
      T011M58_n252CliCod = new boolean[] {false} ;
      T011M58_A2933RecTipCon = new short[1] ;
      T011M59_A396EmprCod = new String[] {""} ;
      T011M59_A252CliCod = new int[1] ;
      T011M59_n252CliCod = new boolean[] {false} ;
      T011M59_A2927RecProCod = new String[] {""} ;
      T011M60_A396EmprCod = new String[] {""} ;
      T011M60_A252CliCod = new int[1] ;
      T011M60_n252CliCod = new boolean[] {false} ;
      T011M60_A2891HMaForSer = new String[] {""} ;
      T011M60_A2892HMaForCNom = new String[] {""} ;
      T011M60_A2893HMaForCNum = new int[1] ;
      T011M60_A2894HMaTipCCod = new byte[1] ;
      T011M60_A2895HMaForNumC = new int[1] ;
      T011M60_A2897HMaColLin = new short[1] ;
      T011M60_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T011M60_A2907HmaLin = new short[1] ;
      T011M61_A396EmprCod = new String[] {""} ;
      T011M61_A252CliCod = new int[1] ;
      T011M61_n252CliCod = new boolean[] {false} ;
      T011M61_A425EstAny = new short[1] ;
      T011M61_A2755EstSerFac = new String[] {""} ;
      T011M62_A396EmprCod = new String[] {""} ;
      T011M62_A2730RecTipCo = new short[1] ;
      T011M62_A252CliCod = new int[1] ;
      T011M62_n252CliCod = new boolean[] {false} ;
      T011M63_A396EmprCod = new String[] {""} ;
      T011M63_A2720TarSec = new String[] {""} ;
      T011M63_A252CliCod = new int[1] ;
      T011M63_n252CliCod = new boolean[] {false} ;
      T011M63_A829TipArtCod = new short[1] ;
      T011M63_A831TipColCod = new byte[1] ;
      T011M64_A396EmprCod = new String[] {""} ;
      T011M64_A2382AbcTerCod = new String[] {""} ;
      T011M64_A2381AbcSec = new String[] {""} ;
      T011M64_A252CliCod = new int[1] ;
      T011M64_n252CliCod = new boolean[] {false} ;
      T011M65_A396EmprCod = new String[] {""} ;
      T011M65_A252CliCod = new int[1] ;
      T011M65_n252CliCod = new boolean[] {false} ;
      T011M65_A2308CliDesCod = new int[1] ;
      T011M66_A396EmprCod = new String[] {""} ;
      T011M66_A2268MovParCod = new String[] {""} ;
      T011M66_A252CliCod = new int[1] ;
      T011M66_n252CliCod = new boolean[] {false} ;
      T011M67_A396EmprCod = new String[] {""} ;
      T011M67_A966PartCod = new String[] {""} ;
      T011M67_A252CliCod = new int[1] ;
      T011M67_n252CliCod = new boolean[] {false} ;
      T011M68_A396EmprCod = new String[] {""} ;
      T011M68_A1387AlbPrvCod = new int[1] ;
      T011M69_A396EmprCod = new String[] {""} ;
      T011M69_A252CliCod = new int[1] ;
      T011M69_n252CliCod = new boolean[] {false} ;
      T011M69_A1213TalCod = new String[] {""} ;
      T011M70_A396EmprCod = new String[] {""} ;
      T011M70_A252CliCod = new int[1] ;
      T011M70_n252CliCod = new boolean[] {false} ;
      T011M70_A457FasCod = new String[] {""} ;
      T011M71_A396EmprCod = new String[] {""} ;
      T011M71_A539HisBarCod = new int[1] ;
      T011M71_A545HisCodReo = new byte[1] ;
      T011M71_A544HisCodPar = new String[] {""} ;
      T011M71_A833TipDefCod = new short[1] ;
      T011M72_A396EmprCod = new String[] {""} ;
      T011M72_A506HbaBarCod = new int[1] ;
      T011M72_A508HbaBarReo = new byte[1] ;
      T011M72_A507HbaBarPar = new String[] {""} ;
      T011M73_A396EmprCod = new String[] {""} ;
      T011M73_A252CliCod = new int[1] ;
      T011M73_n252CliCod = new boolean[] {false} ;
      T011M73_A494ForSer = new String[] {""} ;
      T011M73_A482ForColNom = new String[] {""} ;
      T011M73_A483ForColNum = new int[1] ;
      T011M73_A831TipColCod = new byte[1] ;
      T011M74_A396EmprCod = new String[] {""} ;
      T011M74_A252CliCod = new int[1] ;
      T011M74_n252CliCod = new boolean[] {false} ;
      T011M74_A287CliPagLin = new byte[1] ;
      T011M75_A396EmprCod = new String[] {""} ;
      T011M75_A252CliCod = new int[1] ;
      T011M75_n252CliCod = new boolean[] {false} ;
      T011M75_A266CliEnvLin = new byte[1] ;
      T011M76_A396EmprCod = new String[] {""} ;
      T011M76_A252CliCod = new int[1] ;
      T011M76_n252CliCod = new boolean[] {false} ;
      T011M76_A65ArtCod = new String[] {""} ;
      T011M77_A396EmprCod = new String[] {""} ;
      T011M77_A44AlbRecCod = new int[1] ;
      T011M78_A396EmprCod = new String[] {""} ;
      T011M78_A30AlbProCod = new long[1] ;
      T011M79_A396EmprCod = new String[] {""} ;
      T011M79_A14AlbComCod = new int[1] ;
      T011M80_A396EmprCod = new String[] {""} ;
      T011M80_A252CliCod = new int[1] ;
      T011M80_n252CliCod = new boolean[] {false} ;
      T011M81_A252CliCod = new int[1] ;
      T011M81_n252CliCod = new boolean[] {false} ;
      T011M81_A8391PMDCod = new short[1] ;
      T011M81_A8392PMDDsc = new String[] {""} ;
      T011M81_n8392PMDDsc = new boolean[] {false} ;
      T011M81_A8529PMDUltCon = new int[1] ;
      T011M81_n8529PMDUltCon = new boolean[] {false} ;
      T011M81_A396EmprCod = new String[] {""} ;
      T011M82_A396EmprCod = new String[] {""} ;
      T011M82_A252CliCod = new int[1] ;
      T011M82_n252CliCod = new boolean[] {false} ;
      T011M82_A8391PMDCod = new short[1] ;
      T011M5_A252CliCod = new int[1] ;
      T011M5_n252CliCod = new boolean[] {false} ;
      T011M5_A8391PMDCod = new short[1] ;
      T011M5_A8392PMDDsc = new String[] {""} ;
      T011M5_n8392PMDDsc = new boolean[] {false} ;
      T011M5_A8529PMDUltCon = new int[1] ;
      T011M5_n8529PMDUltCon = new boolean[] {false} ;
      T011M5_A396EmprCod = new String[] {""} ;
      T011M4_A252CliCod = new int[1] ;
      T011M4_n252CliCod = new boolean[] {false} ;
      T011M4_A8391PMDCod = new short[1] ;
      T011M4_A8392PMDDsc = new String[] {""} ;
      T011M4_n8392PMDDsc = new boolean[] {false} ;
      T011M4_A8529PMDUltCon = new int[1] ;
      T011M4_n8529PMDUltCon = new boolean[] {false} ;
      T011M4_A396EmprCod = new String[] {""} ;
      T011M86_A396EmprCod = new String[] {""} ;
      T011M86_A252CliCod = new int[1] ;
      T011M86_n252CliCod = new boolean[] {false} ;
      T011M86_A8391PMDCod = new short[1] ;
      T011M87_A252CliCod = new int[1] ;
      T011M87_n252CliCod = new boolean[] {false} ;
      T011M87_A8391PMDCod = new short[1] ;
      T011M87_A8393PMDColNum = new int[1] ;
      T011M87_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M87_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M87_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M87_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M87_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011M87_A8530PMDColCli = new String[] {""} ;
      T011M87_A8531PMDConCod = new int[1] ;
      T011M87_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M87_A396EmprCod = new String[] {""} ;
      T011M88_A396EmprCod = new String[] {""} ;
      T011M88_A252CliCod = new int[1] ;
      T011M88_n252CliCod = new boolean[] {false} ;
      T011M88_A8391PMDCod = new short[1] ;
      T011M88_A8393PMDColNum = new int[1] ;
      T011M3_A252CliCod = new int[1] ;
      T011M3_n252CliCod = new boolean[] {false} ;
      T011M3_A8391PMDCod = new short[1] ;
      T011M3_A8393PMDColNum = new int[1] ;
      T011M3_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M3_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M3_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M3_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M3_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011M3_A8530PMDColCli = new String[] {""} ;
      T011M3_A8531PMDConCod = new int[1] ;
      T011M3_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M3_A396EmprCod = new String[] {""} ;
      sMode1159 = "" ;
      T011M2_A252CliCod = new int[1] ;
      T011M2_n252CliCod = new boolean[] {false} ;
      T011M2_A8391PMDCod = new short[1] ;
      T011M2_A8393PMDColNum = new int[1] ;
      T011M2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011M2_A8530PMDColCli = new String[] {""} ;
      T011M2_A8531PMDConCod = new int[1] ;
      T011M2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011M2_A396EmprCod = new String[] {""} ;
      T011M92_A396EmprCod = new String[] {""} ;
      T011M92_A252CliCod = new int[1] ;
      T011M92_n252CliCod = new boolean[] {false} ;
      T011M92_A8391PMDCod = new short[1] ;
      T011M92_A8393PMDColNum = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock6_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z8394PMDColNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd__default(),
         new Object[] {
             new Object[] {
            T011M2_A252CliCod, T011M2_A8391PMDCod, T011M2_A8393PMDColNum, T011M2_A8395PMDPreKgm, T011M2_A8396PMDEntKgm, T011M2_A8397PMDDtoTin, T011M2_A8398PMDDtoAca, T011M2_A8399PMDValFch, T011M2_A8530PMDColCli, T011M2_A8531PMDConCod,
            T011M2_A8532PMDPreUni, T011M2_A396EmprCod
            }
            , new Object[] {
            T011M3_A252CliCod, T011M3_A8391PMDCod, T011M3_A8393PMDColNum, T011M3_A8395PMDPreKgm, T011M3_A8396PMDEntKgm, T011M3_A8397PMDDtoTin, T011M3_A8398PMDDtoAca, T011M3_A8399PMDValFch, T011M3_A8530PMDColCli, T011M3_A8531PMDConCod,
            T011M3_A8532PMDPreUni, T011M3_A396EmprCod
            }
            , new Object[] {
            T011M4_A252CliCod, T011M4_A8391PMDCod, T011M4_A8392PMDDsc, T011M4_n8392PMDDsc, T011M4_A8529PMDUltCon, T011M4_n8529PMDUltCon, T011M4_A396EmprCod
            }
            , new Object[] {
            T011M5_A252CliCod, T011M5_A8391PMDCod, T011M5_A8392PMDDsc, T011M5_n8392PMDDsc, T011M5_A8529PMDUltCon, T011M5_n8529PMDUltCon, T011M5_A396EmprCod
            }
            , new Object[] {
            T011M6_A252CliCod, T011M6_A279CliNom, T011M6_A8390PMDProUlt, T011M6_n8390PMDProUlt, T011M6_A396EmprCod
            }
            , new Object[] {
            T011M7_A252CliCod, T011M7_A279CliNom, T011M7_A8390PMDProUlt, T011M7_n8390PMDProUlt, T011M7_A396EmprCod
            }
            , new Object[] {
            T011M8_A407EmprNom, T011M8_n407EmprNom
            }
            , new Object[] {
            T011M9_A252CliCod, T011M9_A407EmprNom, T011M9_n407EmprNom, T011M9_A279CliNom, T011M9_A8390PMDProUlt, T011M9_n8390PMDProUlt, T011M9_A396EmprCod
            }
            , new Object[] {
            T011M10_A407EmprNom, T011M10_n407EmprNom
            }
            , new Object[] {
            T011M11_A396EmprCod, T011M11_A252CliCod
            }
            , new Object[] {
            T011M12_A396EmprCod, T011M12_A252CliCod
            }
            , new Object[] {
            T011M13_A396EmprCod, T011M13_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011M17_A407EmprNom, T011M17_n407EmprNom
            }
            , new Object[] {
            T011M18_A396EmprCod, T011M18_A252CliCod, T011M18_A6930Lb_rclin
            }
            , new Object[] {
            T011M19_A396EmprCod, T011M19_A6850Tex_NPed
            }
            , new Object[] {
            T011M20_A396EmprCod, T011M20_A252CliCod, T011M20_A829TipArtCod, T011M20_A831TipColCod, T011M20_A583IntCod, T011M20_A5098TipDisCod, T011M20_A6603Est1_anyo, T011M20_A6604Est1_mes, T011M20_A6605Est1_dia
            }
            , new Object[] {
            T011M21_A396EmprCod, T011M21_A6319C_Barcod, T011M21_A6320C_Barcodre, T011M21_A6321C_Barcodpa, T011M21_A6322C_Reclinma
            }
            , new Object[] {
            T011M22_A396EmprCod, T011M22_A6235DevEmpCod
            }
            , new Object[] {
            T011M23_A396EmprCod, T011M23_A602MaqCod, T011M23_A6078MaqCliCod, T011M23_A6079MaqArtCod
            }
            , new Object[] {
            T011M24_A396EmprCod, T011M24_A5532Lb_numero
            }
            , new Object[] {
            T011M25_A396EmprCod, T011M25_A252CliCod, T011M25_A5503CliifLin
            }
            , new Object[] {
            T011M26_A396EmprCod, T011M26_A252CliCod, T011M26_A5499ClieiLin
            }
            , new Object[] {
            T011M27_A396EmprCod, T011M27_A252CliCod, T011M27_A5495ClidtLin
            }
            , new Object[] {
            T011M28_A396EmprCod, T011M28_A252CliCod, T011M28_A5491CliedLin
            }
            , new Object[] {
            T011M29_A396EmprCod, T011M29_A252CliCod, T011M29_A5452P_ForCod
            }
            , new Object[] {
            T011M30_A396EmprCod, T011M30_A252CliCod, T011M30_A5443Mdl_Cod
            }
            , new Object[] {
            T011M31_A396EmprCod, T011M31_A252CliCod, T011M31_A5436IntCodF2
            }
            , new Object[] {
            T011M32_A396EmprCod, T011M32_A252CliCod, T011M32_A5396IntCodFC, T011M32_A5434Tip_ColC
            }
            , new Object[] {
            T011M33_A396EmprCod, T011M33_A252CliCod, T011M33_A5428FasPreCod
            }
            , new Object[] {
            T011M34_A396EmprCod, T011M34_A252CliCod, T011M34_A5398Cli_Proc
            }
            , new Object[] {
            T011M35_A396EmprCod, T011M35_A5130PagIden
            }
            , new Object[] {
            T011M36_A396EmprCod, T011M36_A5059Hl_hdr, T011M36_A5060Hl_hdrr, T011M36_A5061Hl_hdrp
            }
            , new Object[] {
            T011M37_A396EmprCod, T011M37_A252CliCod, T011M37_A4718DishCod, T011M37_A5020TipEstCod, T011M37_A5022GraCod
            }
            , new Object[] {
            T011M38_A396EmprCod, T011M38_A4618EnsLCod
            }
            , new Object[] {
            T011M39_A396EmprCod, T011M39_A4492HreBarCod, T011M39_A4493HreBarReo, T011M39_A4494HreBarPar, T011M39_A4495HreNumCie
            }
            , new Object[] {
            T011M40_A396EmprCod, T011M40_A252CliCod, T011M40_A4415EstCol
            }
            , new Object[] {
            T011M41_A396EmprCod, T011M41_A4185WEBUSU
            }
            , new Object[] {
            T011M42_A396EmprCod, T011M42_A252CliCod, T011M42_A4079WEBDISCOD, T011M42_A4078EMPCOD
            }
            , new Object[] {
            T011M43_A396EmprCod, T011M43_A2637HisEstHRu, T011M43_A2636HisEstHRe, T011M43_A2635HisEstHPa, T011M43_A2638HisEstLCo, T011M43_A2630HisEstCom, T011M43_A2634HisEstFon
            }
            , new Object[] {
            T011M44_A396EmprCod, T011M44_A2574GrpDibCod
            }
            , new Object[] {
            T011M45_A396EmprCod, T011M45_A2558GrmDibCod
            }
            , new Object[] {
            T011M46_A396EmprCod, T011M46_A2542GrcDibCod
            }
            , new Object[] {
            T011M47_A396EmprCod, T011M47_A1031EmpesCod, T011M47_A252CliCod, T011M47_A1032FonCod
            }
            , new Object[] {
            T011M48_A396EmprCod, T011M48_A1013DibCli, T011M48_A252CliCod, T011M48_A1014DibInt
            }
            , new Object[] {
            T011M49_A396EmprCod, T011M49_A1736AlbExtCod
            }
            , new Object[] {
            T011M50_A396EmprCod, T011M50_A252CliCod, T011M50_A3661FacProAny, T011M50_A3662FacProSer, T011M50_A3663FacProInt, T011M50_A3664FacProTip, T011M50_A3665FacProTar
            }
            , new Object[] {
            T011M51_A396EmprCod, T011M51_A3646EstTinAny, T011M51_A3647EstTinMes, T011M51_A3648EstTinDia, T011M51_A1929EstTinNr
            }
            , new Object[] {
            T011M52_A396EmprCod, T011M52_A3617AlbTrnCod
            }
            , new Object[] {
            T011M53_A396EmprCod, T011M53_A252CliCod, T011M53_A3320CliLimKgs
            }
            , new Object[] {
            T011M54_A396EmprCod, T011M54_A3073RepCod, T011M54_A252CliCod
            }
            , new Object[] {
            T011M55_A396EmprCod, T011M55_A3061Codia, T011M55_A3062CoMes, T011M55_A3063CoAny, T011M55_A3065CoLin, T011M55_A3010CoBarCod, T011M55_A3011CoBarReo, T011M55_A3012CoBarPar
            }
            , new Object[] {
            T011M56_A396EmprCod, T011M56_A2971SabFacCod
            }
            , new Object[] {
            T011M57_A396EmprCod, T011M57_A2954TiDia, T011M57_A2955TiMes, T011M57_A2956TiAny, T011M57_A2958TiLin, T011M57_A2959TiBarCod, T011M57_A2960TiBarReo, T011M57_A2961TiBarPar
            }
            , new Object[] {
            T011M58_A396EmprCod, T011M58_A252CliCod, T011M58_A2933RecTipCon
            }
            , new Object[] {
            T011M59_A396EmprCod, T011M59_A252CliCod, T011M59_A2927RecProCod
            }
            , new Object[] {
            T011M60_A396EmprCod, T011M60_A252CliCod, T011M60_A2891HMaForSer, T011M60_A2892HMaForCNom, T011M60_A2893HMaForCNum, T011M60_A2894HMaTipCCod, T011M60_A2895HMaForNumC, T011M60_A2897HMaColLin, T011M60_A2896HMaFec, T011M60_A2907HmaLin
            }
            , new Object[] {
            T011M61_A396EmprCod, T011M61_A252CliCod, T011M61_A425EstAny, T011M61_A2755EstSerFac
            }
            , new Object[] {
            T011M62_A396EmprCod, T011M62_A2730RecTipCo, T011M62_A252CliCod
            }
            , new Object[] {
            T011M63_A396EmprCod, T011M63_A2720TarSec, T011M63_A252CliCod, T011M63_A829TipArtCod, T011M63_A831TipColCod
            }
            , new Object[] {
            T011M64_A396EmprCod, T011M64_A2382AbcTerCod, T011M64_A2381AbcSec, T011M64_A252CliCod
            }
            , new Object[] {
            T011M65_A396EmprCod, T011M65_A252CliCod, T011M65_A2308CliDesCod
            }
            , new Object[] {
            T011M66_A396EmprCod, T011M66_A2268MovParCod, T011M66_A252CliCod
            }
            , new Object[] {
            T011M67_A396EmprCod, T011M67_A966PartCod, T011M67_A252CliCod
            }
            , new Object[] {
            T011M68_A396EmprCod, T011M68_A1387AlbPrvCod
            }
            , new Object[] {
            T011M69_A396EmprCod, T011M69_A252CliCod, T011M69_A1213TalCod
            }
            , new Object[] {
            T011M70_A396EmprCod, T011M70_A252CliCod, T011M70_A457FasCod
            }
            , new Object[] {
            T011M71_A396EmprCod, T011M71_A539HisBarCod, T011M71_A545HisCodReo, T011M71_A544HisCodPar, T011M71_A833TipDefCod
            }
            , new Object[] {
            T011M72_A396EmprCod, T011M72_A506HbaBarCod, T011M72_A508HbaBarReo, T011M72_A507HbaBarPar
            }
            , new Object[] {
            T011M73_A396EmprCod, T011M73_A252CliCod, T011M73_A494ForSer, T011M73_A482ForColNom, T011M73_A483ForColNum, T011M73_A831TipColCod
            }
            , new Object[] {
            T011M74_A396EmprCod, T011M74_A252CliCod, T011M74_A287CliPagLin
            }
            , new Object[] {
            T011M75_A396EmprCod, T011M75_A252CliCod, T011M75_A266CliEnvLin
            }
            , new Object[] {
            T011M76_A396EmprCod, T011M76_A252CliCod, T011M76_A65ArtCod
            }
            , new Object[] {
            T011M77_A396EmprCod, T011M77_A44AlbRecCod
            }
            , new Object[] {
            T011M78_A396EmprCod, T011M78_A30AlbProCod
            }
            , new Object[] {
            T011M79_A396EmprCod, T011M79_A14AlbComCod
            }
            , new Object[] {
            T011M80_A396EmprCod, T011M80_A252CliCod
            }
            , new Object[] {
            T011M81_A252CliCod, T011M81_A8391PMDCod, T011M81_A8392PMDDsc, T011M81_n8392PMDDsc, T011M81_A8529PMDUltCon, T011M81_n8529PMDUltCon, T011M81_A396EmprCod
            }
            , new Object[] {
            T011M82_A396EmprCod, T011M82_A252CliCod, T011M82_A8391PMDCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011M86_A396EmprCod, T011M86_A252CliCod, T011M86_A8391PMDCod
            }
            , new Object[] {
            T011M87_A252CliCod, T011M87_A8391PMDCod, T011M87_A8393PMDColNum, T011M87_A8395PMDPreKgm, T011M87_A8396PMDEntKgm, T011M87_A8397PMDDtoTin, T011M87_A8398PMDDtoAca, T011M87_A8399PMDValFch, T011M87_A8530PMDColCli, T011M87_A8531PMDConCod,
            T011M87_A8532PMDPreUni, T011M87_A396EmprCod
            }
            , new Object[] {
            T011M88_A396EmprCod, T011M88_A252CliCod, T011M88_A8391PMDCod, T011M88_A8393PMDColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011M92_A396EmprCod, T011M92_A252CliCod, T011M92_A8391PMDCod, T011M92_A8393PMDColNum
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z8390PMDProUlt ;
   private short Z8391PMDCod ;
   private short nRcdDeleted_1158 ;
   private short nRcdExists_1158 ;
   private short nIsMod_1158 ;
   private short nRcdDeleted_1159 ;
   private short nRcdExists_1159 ;
   private short nIsMod_1159 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8390PMDProUlt ;
   private short nBlankRcdCount1158 ;
   private short RcdFound1158 ;
   private short nBlankRcdUsr1158 ;
   private short RcdFound1159 ;
   private short A8391PMDCod ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_1158 ;
   private short nIsDirty_1159 ;
   private short nBlankRcdCount1159 ;
   private short nBlankRcdUsr1159 ;
   private short subGrid1_Borderwidth ;
   private short ZZ8390PMDProUlt ;
   private int Z252CliCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z8529PMDUltCon ;
   private int nRC_GXsfl_67 ;
   private int nGXsfl_67_idx=1 ;
   private int Z8393PMDColNum ;
   private int Z8531PMDConCod ;
   private int A252CliCod ;
   private int A8531PMDConCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtPMDProUlt_Enabled ;
   private int edtPMDCod_Enabled ;
   private int edtPMDDsc_Enabled ;
   private int edtPMDUltCon_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1159_Enabled ;
   private int A8393PMDColNum ;
   private int edtPMDColNum_Enabled ;
   private int edtPMDColNom_Enabled ;
   private int edtPMDPreKgm_Enabled ;
   private int edtPMDEntKgm_Enabled ;
   private int edtPMDDtoTin_Enabled ;
   private int edtPMDDtoAca_Enabled ;
   private int edtPMDValFch_Enabled ;
   private int edtPMDColCli_Enabled ;
   private int edtPMDConCod_Enabled ;
   private int edtPMDPreUni_Enabled ;
   private int A8529PMDUltCon ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtPMDColNum_Enabled ;
   private int defedtPMDCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtPMDProUlt_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z8395PMDPreKgm ;
   private java.math.BigDecimal Z8396PMDEntKgm ;
   private java.math.BigDecimal Z8397PMDDtoTin ;
   private java.math.BigDecimal Z8398PMDDtoAca ;
   private java.math.BigDecimal Z8532PMDPreUni ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z8392PMDDsc ;
   private String Z8530PMDColCli ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_67_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPMDProUlt_Internalname ;
   private String edtPMDProUlt_Jsonclick ;
   private String sMode1158 ;
   private String edtPMDCod_Internalname ;
   private String edtPMDDsc_Internalname ;
   private String edtPMDUltCon_Internalname ;
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
   private String A14009Id_PMDDsc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1159_Internalname ;
   private String sMode21 ;
   private String GXCCtl ;
   private String edtPMDColNum_Internalname ;
   private String edtPMDColNom_Internalname ;
   private String A8394PMDColNom ;
   private String edtPMDPreKgm_Internalname ;
   private String edtPMDEntKgm_Internalname ;
   private String edtPMDDtoTin_Internalname ;
   private String edtPMDDtoAca_Internalname ;
   private String edtPMDValFch_Internalname ;
   private String edtPMDColCli_Internalname ;
   private String A8530PMDColCli ;
   private String edtPMDConCod_Internalname ;
   private String edtPMDPreUni_Internalname ;
   private String A8392PMDDsc ;
   private String AV12Station ;
   private String AV32EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sMode1159 ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock8_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String ROClassString ;
   private String edtPMDCod_Jsonclick ;
   private String lblTextblock7_Jsonclick ;
   private String edtPMDDsc_Jsonclick ;
   private String lblTextblock8_Jsonclick ;
   private String edtPMDUltCon_Jsonclick ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1159_Jsonclick ;
   private String edtPMDColNum_Jsonclick ;
   private String edtPMDColNom_Jsonclick ;
   private String edtPMDPreKgm_Jsonclick ;
   private String edtPMDEntKgm_Jsonclick ;
   private String edtPMDDtoTin_Jsonclick ;
   private String edtPMDDtoAca_Jsonclick ;
   private String edtPMDValFch_Jsonclick ;
   private String edtPMDColCli_Jsonclick ;
   private String edtPMDConCod_Jsonclick ;
   private String edtPMDPreUni_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock6_Caption ;
   private String lblTextblock7_Caption ;
   private String lblTextblock8_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z8394PMDColNom ;
   private java.util.Date Z8399PMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8390PMDProUlt ;
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n8392PMDDsc ;
   private boolean n8529PMDUltCon ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private int[] T011M9_A252CliCod ;
   private boolean[] T011M9_n252CliCod ;
   private String[] T011M9_A407EmprNom ;
   private boolean[] T011M9_n407EmprNom ;
   private String[] T011M9_A279CliNom ;
   private short[] T011M9_A8390PMDProUlt ;
   private boolean[] T011M9_n8390PMDProUlt ;
   private String[] T011M9_A396EmprCod ;
   private String[] T011M8_A407EmprNom ;
   private boolean[] T011M8_n407EmprNom ;
   private String[] T011M10_A407EmprNom ;
   private boolean[] T011M10_n407EmprNom ;
   private String[] T011M11_A396EmprCod ;
   private int[] T011M11_A252CliCod ;
   private boolean[] T011M11_n252CliCod ;
   private int[] T011M7_A252CliCod ;
   private boolean[] T011M7_n252CliCod ;
   private String[] T011M7_A279CliNom ;
   private short[] T011M7_A8390PMDProUlt ;
   private boolean[] T011M7_n8390PMDProUlt ;
   private String[] T011M7_A396EmprCod ;
   private String[] T011M12_A396EmprCod ;
   private int[] T011M12_A252CliCod ;
   private boolean[] T011M12_n252CliCod ;
   private String[] T011M13_A396EmprCod ;
   private int[] T011M13_A252CliCod ;
   private boolean[] T011M13_n252CliCod ;
   private int[] T011M6_A252CliCod ;
   private boolean[] T011M6_n252CliCod ;
   private String[] T011M6_A279CliNom ;
   private short[] T011M6_A8390PMDProUlt ;
   private boolean[] T011M6_n8390PMDProUlt ;
   private String[] T011M6_A396EmprCod ;
   private String[] T011M17_A407EmprNom ;
   private boolean[] T011M17_n407EmprNom ;
   private String[] T011M18_A396EmprCod ;
   private int[] T011M18_A252CliCod ;
   private boolean[] T011M18_n252CliCod ;
   private int[] T011M18_A6930Lb_rclin ;
   private String[] T011M19_A396EmprCod ;
   private int[] T011M19_A6850Tex_NPed ;
   private String[] T011M20_A396EmprCod ;
   private int[] T011M20_A252CliCod ;
   private boolean[] T011M20_n252CliCod ;
   private short[] T011M20_A829TipArtCod ;
   private byte[] T011M20_A831TipColCod ;
   private byte[] T011M20_A583IntCod ;
   private String[] T011M20_A5098TipDisCod ;
   private short[] T011M20_A6603Est1_anyo ;
   private byte[] T011M20_A6604Est1_mes ;
   private byte[] T011M20_A6605Est1_dia ;
   private String[] T011M21_A396EmprCod ;
   private int[] T011M21_A6319C_Barcod ;
   private byte[] T011M21_A6320C_Barcodre ;
   private String[] T011M21_A6321C_Barcodpa ;
   private short[] T011M21_A6322C_Reclinma ;
   private String[] T011M22_A396EmprCod ;
   private int[] T011M22_A6235DevEmpCod ;
   private String[] T011M23_A396EmprCod ;
   private String[] T011M23_A602MaqCod ;
   private int[] T011M23_A6078MaqCliCod ;
   private String[] T011M23_A6079MaqArtCod ;
   private String[] T011M24_A396EmprCod ;
   private int[] T011M24_A5532Lb_numero ;
   private String[] T011M25_A396EmprCod ;
   private int[] T011M25_A252CliCod ;
   private boolean[] T011M25_n252CliCod ;
   private short[] T011M25_A5503CliifLin ;
   private String[] T011M26_A396EmprCod ;
   private int[] T011M26_A252CliCod ;
   private boolean[] T011M26_n252CliCod ;
   private short[] T011M26_A5499ClieiLin ;
   private String[] T011M27_A396EmprCod ;
   private int[] T011M27_A252CliCod ;
   private boolean[] T011M27_n252CliCod ;
   private short[] T011M27_A5495ClidtLin ;
   private String[] T011M28_A396EmprCod ;
   private int[] T011M28_A252CliCod ;
   private boolean[] T011M28_n252CliCod ;
   private short[] T011M28_A5491CliedLin ;
   private String[] T011M29_A396EmprCod ;
   private int[] T011M29_A252CliCod ;
   private boolean[] T011M29_n252CliCod ;
   private String[] T011M29_A5452P_ForCod ;
   private String[] T011M30_A396EmprCod ;
   private int[] T011M30_A252CliCod ;
   private boolean[] T011M30_n252CliCod ;
   private String[] T011M30_A5443Mdl_Cod ;
   private String[] T011M31_A396EmprCod ;
   private int[] T011M31_A252CliCod ;
   private boolean[] T011M31_n252CliCod ;
   private short[] T011M31_A5436IntCodF2 ;
   private String[] T011M32_A396EmprCod ;
   private int[] T011M32_A252CliCod ;
   private boolean[] T011M32_n252CliCod ;
   private byte[] T011M32_A5396IntCodFC ;
   private byte[] T011M32_A5434Tip_ColC ;
   private String[] T011M33_A396EmprCod ;
   private int[] T011M33_A252CliCod ;
   private boolean[] T011M33_n252CliCod ;
   private String[] T011M33_A5428FasPreCod ;
   private String[] T011M34_A396EmprCod ;
   private int[] T011M34_A252CliCod ;
   private boolean[] T011M34_n252CliCod ;
   private String[] T011M34_A5398Cli_Proc ;
   private String[] T011M35_A396EmprCod ;
   private int[] T011M35_A5130PagIden ;
   private String[] T011M36_A396EmprCod ;
   private int[] T011M36_A5059Hl_hdr ;
   private byte[] T011M36_A5060Hl_hdrr ;
   private String[] T011M36_A5061Hl_hdrp ;
   private String[] T011M37_A396EmprCod ;
   private int[] T011M37_A252CliCod ;
   private boolean[] T011M37_n252CliCod ;
   private String[] T011M37_A4718DishCod ;
   private byte[] T011M37_A5020TipEstCod ;
   private byte[] T011M37_A5022GraCod ;
   private String[] T011M38_A396EmprCod ;
   private int[] T011M38_A4618EnsLCod ;
   private String[] T011M39_A396EmprCod ;
   private int[] T011M39_A4492HreBarCod ;
   private byte[] T011M39_A4493HreBarReo ;
   private String[] T011M39_A4494HreBarPar ;
   private byte[] T011M39_A4495HreNumCie ;
   private String[] T011M40_A396EmprCod ;
   private int[] T011M40_A252CliCod ;
   private boolean[] T011M40_n252CliCod ;
   private String[] T011M40_A4415EstCol ;
   private String[] T011M41_A396EmprCod ;
   private String[] T011M41_A4185WEBUSU ;
   private String[] T011M42_A396EmprCod ;
   private int[] T011M42_A252CliCod ;
   private boolean[] T011M42_n252CliCod ;
   private String[] T011M42_A4079WEBDISCOD ;
   private String[] T011M42_A4078EMPCOD ;
   private String[] T011M43_A396EmprCod ;
   private int[] T011M43_A2637HisEstHRu ;
   private byte[] T011M43_A2636HisEstHRe ;
   private String[] T011M43_A2635HisEstHPa ;
   private byte[] T011M43_A2638HisEstLCo ;
   private String[] T011M43_A2630HisEstCom ;
   private String[] T011M43_A2634HisEstFon ;
   private String[] T011M44_A396EmprCod ;
   private int[] T011M44_A2574GrpDibCod ;
   private String[] T011M45_A396EmprCod ;
   private int[] T011M45_A2558GrmDibCod ;
   private String[] T011M46_A396EmprCod ;
   private int[] T011M46_A2542GrcDibCod ;
   private String[] T011M47_A396EmprCod ;
   private String[] T011M47_A1031EmpesCod ;
   private int[] T011M47_A252CliCod ;
   private boolean[] T011M47_n252CliCod ;
   private String[] T011M47_A1032FonCod ;
   private String[] T011M48_A396EmprCod ;
   private String[] T011M48_A1013DibCli ;
   private int[] T011M48_A252CliCod ;
   private boolean[] T011M48_n252CliCod ;
   private int[] T011M48_A1014DibInt ;
   private String[] T011M49_A396EmprCod ;
   private long[] T011M49_A1736AlbExtCod ;
   private String[] T011M50_A396EmprCod ;
   private int[] T011M50_A252CliCod ;
   private boolean[] T011M50_n252CliCod ;
   private short[] T011M50_A3661FacProAny ;
   private String[] T011M50_A3662FacProSer ;
   private byte[] T011M50_A3663FacProInt ;
   private byte[] T011M50_A3664FacProTip ;
   private short[] T011M50_A3665FacProTar ;
   private String[] T011M51_A396EmprCod ;
   private short[] T011M51_A3646EstTinAny ;
   private byte[] T011M51_A3647EstTinMes ;
   private byte[] T011M51_A3648EstTinDia ;
   private short[] T011M51_A1929EstTinNr ;
   private String[] T011M52_A396EmprCod ;
   private long[] T011M52_A3617AlbTrnCod ;
   private String[] T011M53_A396EmprCod ;
   private int[] T011M53_A252CliCod ;
   private boolean[] T011M53_n252CliCod ;
   private java.math.BigDecimal[] T011M53_A3320CliLimKgs ;
   private String[] T011M54_A396EmprCod ;
   private String[] T011M54_A3073RepCod ;
   private int[] T011M54_A252CliCod ;
   private boolean[] T011M54_n252CliCod ;
   private String[] T011M55_A396EmprCod ;
   private byte[] T011M55_A3061Codia ;
   private byte[] T011M55_A3062CoMes ;
   private short[] T011M55_A3063CoAny ;
   private byte[] T011M55_A3065CoLin ;
   private int[] T011M55_A3010CoBarCod ;
   private byte[] T011M55_A3011CoBarReo ;
   private String[] T011M55_A3012CoBarPar ;
   private String[] T011M56_A396EmprCod ;
   private int[] T011M56_A2971SabFacCod ;
   private String[] T011M57_A396EmprCod ;
   private byte[] T011M57_A2954TiDia ;
   private byte[] T011M57_A2955TiMes ;
   private short[] T011M57_A2956TiAny ;
   private byte[] T011M57_A2958TiLin ;
   private int[] T011M57_A2959TiBarCod ;
   private byte[] T011M57_A2960TiBarReo ;
   private String[] T011M57_A2961TiBarPar ;
   private String[] T011M58_A396EmprCod ;
   private int[] T011M58_A252CliCod ;
   private boolean[] T011M58_n252CliCod ;
   private short[] T011M58_A2933RecTipCon ;
   private String[] T011M59_A396EmprCod ;
   private int[] T011M59_A252CliCod ;
   private boolean[] T011M59_n252CliCod ;
   private String[] T011M59_A2927RecProCod ;
   private String[] T011M60_A396EmprCod ;
   private int[] T011M60_A252CliCod ;
   private boolean[] T011M60_n252CliCod ;
   private String[] T011M60_A2891HMaForSer ;
   private String[] T011M60_A2892HMaForCNom ;
   private int[] T011M60_A2893HMaForCNum ;
   private byte[] T011M60_A2894HMaTipCCod ;
   private int[] T011M60_A2895HMaForNumC ;
   private short[] T011M60_A2897HMaColLin ;
   private java.util.Date[] T011M60_A2896HMaFec ;
   private short[] T011M60_A2907HmaLin ;
   private String[] T011M61_A396EmprCod ;
   private int[] T011M61_A252CliCod ;
   private boolean[] T011M61_n252CliCod ;
   private short[] T011M61_A425EstAny ;
   private String[] T011M61_A2755EstSerFac ;
   private String[] T011M62_A396EmprCod ;
   private short[] T011M62_A2730RecTipCo ;
   private int[] T011M62_A252CliCod ;
   private boolean[] T011M62_n252CliCod ;
   private String[] T011M63_A396EmprCod ;
   private String[] T011M63_A2720TarSec ;
   private int[] T011M63_A252CliCod ;
   private boolean[] T011M63_n252CliCod ;
   private short[] T011M63_A829TipArtCod ;
   private byte[] T011M63_A831TipColCod ;
   private String[] T011M64_A396EmprCod ;
   private String[] T011M64_A2382AbcTerCod ;
   private String[] T011M64_A2381AbcSec ;
   private int[] T011M64_A252CliCod ;
   private boolean[] T011M64_n252CliCod ;
   private String[] T011M65_A396EmprCod ;
   private int[] T011M65_A252CliCod ;
   private boolean[] T011M65_n252CliCod ;
   private int[] T011M65_A2308CliDesCod ;
   private String[] T011M66_A396EmprCod ;
   private String[] T011M66_A2268MovParCod ;
   private int[] T011M66_A252CliCod ;
   private boolean[] T011M66_n252CliCod ;
   private String[] T011M67_A396EmprCod ;
   private String[] T011M67_A966PartCod ;
   private int[] T011M67_A252CliCod ;
   private boolean[] T011M67_n252CliCod ;
   private String[] T011M68_A396EmprCod ;
   private int[] T011M68_A1387AlbPrvCod ;
   private String[] T011M69_A396EmprCod ;
   private int[] T011M69_A252CliCod ;
   private boolean[] T011M69_n252CliCod ;
   private String[] T011M69_A1213TalCod ;
   private String[] T011M70_A396EmprCod ;
   private int[] T011M70_A252CliCod ;
   private boolean[] T011M70_n252CliCod ;
   private String[] T011M70_A457FasCod ;
   private String[] T011M71_A396EmprCod ;
   private int[] T011M71_A539HisBarCod ;
   private byte[] T011M71_A545HisCodReo ;
   private String[] T011M71_A544HisCodPar ;
   private short[] T011M71_A833TipDefCod ;
   private String[] T011M72_A396EmprCod ;
   private int[] T011M72_A506HbaBarCod ;
   private byte[] T011M72_A508HbaBarReo ;
   private String[] T011M72_A507HbaBarPar ;
   private String[] T011M73_A396EmprCod ;
   private int[] T011M73_A252CliCod ;
   private boolean[] T011M73_n252CliCod ;
   private String[] T011M73_A494ForSer ;
   private String[] T011M73_A482ForColNom ;
   private int[] T011M73_A483ForColNum ;
   private byte[] T011M73_A831TipColCod ;
   private String[] T011M74_A396EmprCod ;
   private int[] T011M74_A252CliCod ;
   private boolean[] T011M74_n252CliCod ;
   private byte[] T011M74_A287CliPagLin ;
   private String[] T011M75_A396EmprCod ;
   private int[] T011M75_A252CliCod ;
   private boolean[] T011M75_n252CliCod ;
   private byte[] T011M75_A266CliEnvLin ;
   private String[] T011M76_A396EmprCod ;
   private int[] T011M76_A252CliCod ;
   private boolean[] T011M76_n252CliCod ;
   private String[] T011M76_A65ArtCod ;
   private String[] T011M77_A396EmprCod ;
   private int[] T011M77_A44AlbRecCod ;
   private String[] T011M78_A396EmprCod ;
   private long[] T011M78_A30AlbProCod ;
   private String[] T011M79_A396EmprCod ;
   private int[] T011M79_A14AlbComCod ;
   private String[] T011M80_A396EmprCod ;
   private int[] T011M80_A252CliCod ;
   private boolean[] T011M80_n252CliCod ;
   private int[] T011M81_A252CliCod ;
   private boolean[] T011M81_n252CliCod ;
   private short[] T011M81_A8391PMDCod ;
   private String[] T011M81_A8392PMDDsc ;
   private boolean[] T011M81_n8392PMDDsc ;
   private int[] T011M81_A8529PMDUltCon ;
   private boolean[] T011M81_n8529PMDUltCon ;
   private String[] T011M81_A396EmprCod ;
   private String[] T011M82_A396EmprCod ;
   private int[] T011M82_A252CliCod ;
   private boolean[] T011M82_n252CliCod ;
   private short[] T011M82_A8391PMDCod ;
   private int[] T011M5_A252CliCod ;
   private boolean[] T011M5_n252CliCod ;
   private short[] T011M5_A8391PMDCod ;
   private String[] T011M5_A8392PMDDsc ;
   private boolean[] T011M5_n8392PMDDsc ;
   private int[] T011M5_A8529PMDUltCon ;
   private boolean[] T011M5_n8529PMDUltCon ;
   private String[] T011M5_A396EmprCod ;
   private int[] T011M4_A252CliCod ;
   private boolean[] T011M4_n252CliCod ;
   private short[] T011M4_A8391PMDCod ;
   private String[] T011M4_A8392PMDDsc ;
   private boolean[] T011M4_n8392PMDDsc ;
   private int[] T011M4_A8529PMDUltCon ;
   private boolean[] T011M4_n8529PMDUltCon ;
   private String[] T011M4_A396EmprCod ;
   private String[] T011M86_A396EmprCod ;
   private int[] T011M86_A252CliCod ;
   private boolean[] T011M86_n252CliCod ;
   private short[] T011M86_A8391PMDCod ;
   private int[] T011M87_A252CliCod ;
   private boolean[] T011M87_n252CliCod ;
   private short[] T011M87_A8391PMDCod ;
   private int[] T011M87_A8393PMDColNum ;
   private java.math.BigDecimal[] T011M87_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T011M87_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T011M87_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T011M87_A8398PMDDtoAca ;
   private java.util.Date[] T011M87_A8399PMDValFch ;
   private String[] T011M87_A8530PMDColCli ;
   private int[] T011M87_A8531PMDConCod ;
   private java.math.BigDecimal[] T011M87_A8532PMDPreUni ;
   private String[] T011M87_A396EmprCod ;
   private String[] T011M88_A396EmprCod ;
   private int[] T011M88_A252CliCod ;
   private boolean[] T011M88_n252CliCod ;
   private short[] T011M88_A8391PMDCod ;
   private int[] T011M88_A8393PMDColNum ;
   private int[] T011M3_A252CliCod ;
   private boolean[] T011M3_n252CliCod ;
   private short[] T011M3_A8391PMDCod ;
   private int[] T011M3_A8393PMDColNum ;
   private java.math.BigDecimal[] T011M3_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T011M3_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T011M3_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T011M3_A8398PMDDtoAca ;
   private java.util.Date[] T011M3_A8399PMDValFch ;
   private String[] T011M3_A8530PMDColCli ;
   private int[] T011M3_A8531PMDConCod ;
   private java.math.BigDecimal[] T011M3_A8532PMDPreUni ;
   private String[] T011M3_A396EmprCod ;
   private int[] T011M2_A252CliCod ;
   private boolean[] T011M2_n252CliCod ;
   private short[] T011M2_A8391PMDCod ;
   private int[] T011M2_A8393PMDColNum ;
   private java.math.BigDecimal[] T011M2_A8395PMDPreKgm ;
   private java.math.BigDecimal[] T011M2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] T011M2_A8397PMDDtoTin ;
   private java.math.BigDecimal[] T011M2_A8398PMDDtoAca ;
   private java.util.Date[] T011M2_A8399PMDValFch ;
   private String[] T011M2_A8530PMDColCli ;
   private int[] T011M2_A8531PMDConCod ;
   private java.math.BigDecimal[] T011M2_A8532PMDPreUni ;
   private String[] T011M2_A396EmprCod ;
   private String[] T011M92_A396EmprCod ;
   private int[] T011M92_A252CliCod ;
   private boolean[] T011M92_n252CliCod ;
   private short[] T011M92_A8391PMDCod ;
   private int[] T011M92_A8393PMDColNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpromd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpromd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T011M2", "SELECT CliCod, PMDCod, PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?  FOR UPDATE OF PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M3", "SELECT CliCod, PMDCod, PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M4", "SELECT CliCod, PMDCod, PMDDsc, PMDUltCon, EmprCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?  FOR UPDATE OF PMDDsc, PMDUltCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M5", "SELECT CliCod, PMDCod, PMDDsc, PMDUltCon, EmprCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M6", "SELECT CliCod, CliNom, PMDProUlt, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, PMDProUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M7", "SELECT CliCod, CliNom, PMDProUlt, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M9", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.PMDProUlt, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011M14", "INSERT INTO TXPCLIENT(CliCod, CliNom, PMDProUlt, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T011M15", "UPDATE TXPCLIENT SET CliNom=?, PMDProUlt=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T011M16", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T011M17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M18", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M19", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M20", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M21", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M22", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M23", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M24", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M25", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M26", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M27", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M28", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M29", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M30", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M31", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M32", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M33", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M34", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M35", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M36", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M37", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M38", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M39", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M40", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M41", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M42", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M43", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M44", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M45", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M46", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M47", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M48", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M49", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M50", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M51", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M52", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M53", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M54", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M55", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M56", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M57", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M58", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M59", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M60", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M61", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M62", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M63", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M64", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M65", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M66", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M67", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M68", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M69", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M70", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M71", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M72", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M73", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M74", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M75", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M76", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M77", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M78", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M79", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011M80", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M81", "SELECT CliCod, PMDCod, PMDDsc, PMDUltCon, EmprCod FROM TXPProMD WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M82", "SELECT EmprCod, CliCod, PMDCod FROM TXPProMD WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011M83", "INSERT INTO TXPProMD(CliCod, PMDCod, PMDDsc, PMDUltCon, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPProMD")
         ,new UpdateCursor("T011M84", "UPDATE TXPProMD SET PMDDsc=?, PMDUltCon=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK, "TXPProMD")
         ,new UpdateCursor("T011M85", "DELETE FROM TXPProMD  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK, "TXPProMD")
         ,new ForEachCursor("T011M86", "SELECT EmprCod, CliCod, PMDCod FROM TXPProMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, PMDCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M87", "SELECT CliCod, PMDCod, PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011M88", "SELECT EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011M89", "INSERT INTO TXPProMD1(CliCod, PMDCod, PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T011M90", "UPDATE TXPProMD1 SET PMDPreKgm=?, PMDEntKgm=?, PMDDtoTin=?, PMDDtoAca=?, PMDValFch=?, PMDColCli=?, PMDConCod=?, PMDPreUni=?  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new UpdateCursor("T011M91", "DELETE FROM TXPProMD1  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ? AND PMDColNum = ?", GX_NOMASK, "TXPProMD1")
         ,new ForEachCursor("T011M92", "SELECT EmprCod, CliCod, PMDCod, PMDColNum FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
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
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 58 :
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
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 79 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 85 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
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
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 19 :
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
            case 20 :
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 84 :
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
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setString(9, (String)parms[9], 13);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 5);
               stmt.setString(12, (String)parms[12], 3);
               return;
            case 88 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[10]).intValue());
               }
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

