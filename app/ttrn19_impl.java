package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn19_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
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
         xc_10_1LV545( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
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
            AV33DibCli = httpContext.GetPar( "DibCli") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33DibCli", AV33DibCli);
            AV34clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34clicod), 6, 0));
            AV35dibInt = (int)(GXutil.lval( httpContext.GetPar( "dibInt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35dibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35dibInt), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Dibujos MEZCLAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDibCli_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public ttrn19_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn19_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn19_impl.class ));
   }

   public ttrn19_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn19.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1055 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1055 = (short)(1) ;
            scanStart1LV1055( ) ;
            while ( RcdFound1055 != 0 )
            {
               init_level_properties1055( ) ;
               getByPrimaryKey1LV1055( ) ;
               addRow1LV1055( ) ;
               scanNext1LV1055( ) ;
            }
            scanEnd1LV1055( ) ;
            nBlankRcdCount1055 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LV1055( ) ;
         standaloneModal1LV1055( ) ;
         sMode1055 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1LV1055( ) ;
            edtavnRcdDeleted_1055_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1055_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1055_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1055_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAMDibCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMDIBCLI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAMDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAMDibInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMDIBINT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAMDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibInt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAMCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMCLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAMOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMORDEN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAMOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMOrden_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1055 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LV1055( ) ;
            }
            sendRow1LV1055( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1055 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1055 = (short)(5) ;
         nRcdExists_1055 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LV1055( ) ;
            while ( RcdFound1055 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501055( ) ;
               init_level_properties1055( ) ;
               standaloneNotModal1LV1055( ) ;
               getByPrimaryKey1LV1055( ) ;
               standaloneModal1LV1055( ) ;
               addRow1LV1055( ) ;
               scanNext1LV1055( ) ;
            }
            scanEnd1LV1055( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1055 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_501055( ) ;
         initAll1LV1055( ) ;
         init_level_properties1055( ) ;
         nRcdExists_1055 = (short)(0) ;
         nIsMod_1055 = (short)(0) ;
         nRcdDeleted_1055 = (short)(0) ;
         nBlankRcdCount1055 = (short)(nBlankRcdUsr1055+nBlankRcdCount1055) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1055 > 0 )
         {
            standaloneNotModal1LV1055( ) ;
            standaloneModal1LV1055( ) ;
            addRow1LV1055( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAMDibCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1055 = (short)(nBlankRcdCount1055-1) ;
         }
         Gx_mode = sMode1055 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn19.htm");
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
      e111LV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33DibCli = httpContext.cgiGet( "vDIBCLI") ;
            AV34clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35dibInt = (int)(localUtil.ctol( httpContext.cgiGet( "vDIBINT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1014DibInt = 0 ;
               n1014DibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            else
            {
               A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1014DibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
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
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn19");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn19:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               n1013DibCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               n1014DibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               getEqualNoModal( ) ;
               if ( ! isIns( )  )
               {
                  A1013DibCli = AV33DibCli ;
                  n1013DibCli = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               }
               if ( ! isIns( )  )
               {
                  A252CliCod = AV34clicod ;
                  n252CliCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               }
               if ( ! isIns( )  )
               {
                  A1014DibInt = AV35dibInt ;
                  n1014DibInt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode545 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! isIns( )  )
                  {
                     A1013DibCli = AV33DibCli ;
                     n1013DibCli = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
                  }
                  if ( ! isIns( )  )
                  {
                     A252CliCod = AV34clicod ;
                     n252CliCod = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                  }
                  if ( ! isIns( )  )
                  {
                     A1014DibInt = AV35dibInt ;
                     n1014DibInt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
                  }
                  Gx_mode = sMode545 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound545 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1LV0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e111LV2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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
            initAll1LV545( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1LV545( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1055_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1055_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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

   public void confirm_1LV0( )
   {
      beforeValidate1LV545( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LV545( ) ;
         }
         else
         {
            checkExtendedTable1LV545( ) ;
            if ( AnyError == 0 )
            {
               zm1LV545( 14) ;
               zm1LV545( 15) ;
            }
            closeExtendedTableCursors1LV545( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode545 = Gx_mode ;
         confirm_1LV1055( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode545 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LV0( ) ;
      }
   }

   public void confirm_1LV1055( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1LV1055( ) ;
         if ( ( nRcdExists_1055 != 0 ) || ( nIsMod_1055 != 0 ) )
         {
            getKey1LV1055( ) ;
            if ( ( nRcdExists_1055 == 0 ) && ( nRcdDeleted_1055 == 0 ) )
            {
               if ( RcdFound1055 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LV1055( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LV1055( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LV1055( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "AMDIBCLI_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAMDibCli_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1055 != 0 )
               {
                  if ( nRcdDeleted_1055 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LV1055( ) ;
                     load1LV1055( ) ;
                     beforeValidate1LV1055( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LV1055( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1055 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LV1055( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LV1055( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LV1055( ) ;
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
                  if ( nRcdDeleted_1055 == 0 )
                  {
                     GXCCtl = "AMDIBCLI_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAMDibCli_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1055_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMDibCli_Internalname, GXutil.rtrim( A7502AMDibCli)) ;
         httpContext.changePostValue( edtAMDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7502AMDibCli_"+sGXsfl_50_idx, GXutil.rtrim( Z7502AMDibCli)) ;
         httpContext.changePostValue( "ZT_"+"Z7503AMDibInt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7504AMCliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7675AMOrden_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1055 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1055_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1055_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMDIBCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMDIBINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMCLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMORDEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LV0( )
   {
   }

   public void e111LV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn19_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      ttrn19_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn19_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn19_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn19_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn19_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LV545( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -13 )
      {
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV37Pgmname = "TTrn19" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01LV6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LV6_A407EmprNom[0] ;
      n407EmprNom = T01LV6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  )
      {
         edtDibCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      }
      else
      {
         edtDibCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtDibInt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      }
      else
      {
         edtDibInt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtDibCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtDibInt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      }
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
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
      if ( ! isIns( )  )
      {
         A1014DibInt = AV35dibInt ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      }
      if ( ! isIns( )  )
      {
         A252CliCod = AV34clicod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! isIns( )  )
      {
         A1013DibCli = AV33DibCli ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01LV7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01LV7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(5);
      }
   }

   public void load1LV545( )
   {
      /* Using cursor T01LV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound545 = (short)(1) ;
         A407EmprNom = T01LV8_A407EmprNom[0] ;
         n407EmprNom = T01LV8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01LV8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1LV545( -13) ;
      }
      pr_default.close(6);
      onLoadActions1LV545( ) ;
   }

   public void onLoadActions1LV545( )
   {
   }

   public void checkExtendedTable1LV545( )
   {
      nIsDirty_545 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01LV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LV7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1LV545( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01LV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LV9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1LV545( )
   {
      /* Using cursor T01LV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound545 = (short)(1) ;
      }
      else
      {
         RcdFound545 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01LV5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LV545( 13) ;
         RcdFound545 = (short)(1) ;
         A1013DibCli = T01LV5_A1013DibCli[0] ;
         n1013DibCli = T01LV5_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LV5_A1014DibInt[0] ;
         n1014DibInt = T01LV5_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A252CliCod = T01LV5_A252CliCod[0] ;
         n252CliCod = T01LV5_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         sMode545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LV545( ) ;
         if ( AnyError == 1 )
         {
            RcdFound545 = (short)(0) ;
            initializeNonKey1LV545( ) ;
         }
         Gx_mode = sMode545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound545 = (short)(0) ;
         initializeNonKey1LV545( ) ;
         sMode545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1LV545( ) ;
      if ( RcdFound545 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound545 = (short)(0) ;
      /* Using cursor T01LV11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV11_A252CliCod[0] < A252CliCod ) || ( T01LV11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV11_A1014DibInt[0] < A1014DibInt ) ) && ( GXutil.strcmp(T01LV11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV11_A252CliCod[0] > A252CliCod ) || ( T01LV11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LV11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV11_A1014DibInt[0] > A1014DibInt ) ) && ( GXutil.strcmp(T01LV11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1013DibCli = T01LV11_A1013DibCli[0] ;
            n1013DibCli = T01LV11_n1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = T01LV11_A252CliCod[0] ;
            n252CliCod = T01LV11_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = T01LV11_A1014DibInt[0] ;
            n1014DibInt = T01LV11_n1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            RcdFound545 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound545 = (short)(0) ;
      /* Using cursor T01LV12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV12_A252CliCod[0] > A252CliCod ) || ( T01LV12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV12_A1014DibInt[0] > A1014DibInt ) ) && ( GXutil.strcmp(T01LV12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV12_A252CliCod[0] < A252CliCod ) || ( T01LV12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LV12_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LV12_A1014DibInt[0] < A1014DibInt ) ) && ( GXutil.strcmp(T01LV12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1013DibCli = T01LV12_A1013DibCli[0] ;
            n1013DibCli = T01LV12_n1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = T01LV12_A252CliCod[0] ;
            n252CliCod = T01LV12_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = T01LV12_A1014DibInt[0] ;
            n1014DibInt = T01LV12_n1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            RcdFound545 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LV545( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LV545( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound545 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
            {
               A1013DibCli = Z1013DibCli ;
               n1013DibCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1014DibInt = Z1014DibInt ;
               n1014DibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDibCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1LV545( ) ;
               GX_FocusControl = edtDibCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
            {
               /* Insert record */
               GX_FocusControl = edtDibCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LV545( ) ;
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
                  GX_FocusControl = edtDibCli_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LV545( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
      {
         A1013DibCli = Z1013DibCli ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = Z1014DibInt ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1LV545( ) ;
      if ( RcdFound545 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
         {
            A1013DibCli = Z1013DibCli ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = Z1014DibInt ;
            n1014DibInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn19");
   }

   public void insert_check( )
   {
      confirm_1LV0( ) ;
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

   public void checkOptimisticConcurrency1LV545( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDIBUJ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDIBUJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LV545( )
   {
      beforeValidate1LV545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LV545( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LV545( 0) ;
         checkOptimisticConcurrency1LV545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LV545( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LV545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LV13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1LV545( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load1LV545( ) ;
         }
         endLevel1LV545( ) ;
      }
      closeExtendedTableCursors1LV545( ) ;
   }

   public void update1LV545( )
   {
      beforeValidate1LV545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LV545( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LV545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LV545( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LV545( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCDIBUJ */
                  deferredUpdate1LV545( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LV545( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1LV545( ) ;
      }
      closeExtendedTableCursors1LV545( ) ;
   }

   public void deferredUpdate1LV545( )
   {
   }

   public void delete( )
   {
      beforeValidate1LV545( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LV545( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LV545( ) ;
         afterConfirm1LV545( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LV545( ) ;
            if ( AnyError == 0 )
            {
               scanStart1LV1055( ) ;
               while ( RcdFound1055 != 0 )
               {
                  getByPrimaryKey1LV1055( ) ;
                  delete1LV1055( ) ;
                  scanNext1LV1055( ) ;
               }
               scanEnd1LV1055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LV14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode545 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LV545( ) ;
      Gx_mode = sMode545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LV545( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LV15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01LV15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LV16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01LV17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01LV18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01LV19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01LV20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDIBUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01LV21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DIBOBS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01LV22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESTDI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01LV23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1LV1055( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1LV1055( ) ;
         if ( ( nRcdExists_1055 != 0 ) || ( nIsMod_1055 != 0 ) )
         {
            standaloneNotModal1LV1055( ) ;
            getKey1LV1055( ) ;
            if ( ( nRcdExists_1055 == 0 ) && ( nRcdDeleted_1055 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LV1055( ) ;
            }
            else
            {
               if ( RcdFound1055 != 0 )
               {
                  if ( ( nRcdDeleted_1055 != 0 ) && ( nRcdExists_1055 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LV1055( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1055 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LV1055( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1055 == 0 )
                  {
                     GXCCtl = "AMDIBCLI_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAMDibCli_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1055_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMDibCli_Internalname, GXutil.rtrim( A7502AMDibCli)) ;
         httpContext.changePostValue( edtAMDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAMOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7502AMDibCli_"+sGXsfl_50_idx, GXutil.rtrim( Z7502AMDibCli)) ;
         httpContext.changePostValue( "ZT_"+"Z7503AMDibInt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7504AMCliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7675AMOrden_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1055_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1055 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1055_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1055_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMDIBCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMDIBINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMCLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AMORDEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LV1055( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1055 = (short)(0) ;
      nIsMod_1055 = (short)(0) ;
      nRcdDeleted_1055 = (short)(0) ;
   }

   public void processLevel1LV545( )
   {
      /* Save parent mode. */
      sMode545 = Gx_mode ;
      processNestedLevel1LV1055( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LV545( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LV545( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn19");
         if ( AnyError == 0 )
         {
            confirmValues1LV0( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A1013DibCli ;
            GXv_int5[0] = A252CliCod ;
            GXv_int6[0] = A1014DibInt ;
            new app.parmmza(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6) ;
            ttrn19_impl.this.A396EmprCod = GXv_char4[0] ;
            ttrn19_impl.this.A1013DibCli = GXv_char3[0] ;
            ttrn19_impl.this.A252CliCod = GXv_int5[0] ;
            ttrn19_impl.this.A1014DibInt = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn19");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LV545( )
   {
      /* Scan By routine */
      /* Using cursor T01LV24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      RcdFound545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound545 = (short)(1) ;
         A1013DibCli = T01LV24_A1013DibCli[0] ;
         n1013DibCli = T01LV24_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = T01LV24_A252CliCod[0] ;
         n252CliCod = T01LV24_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = T01LV24_A1014DibInt[0] ;
         n1014DibInt = T01LV24_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LV545( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound545 = (short)(1) ;
         A1013DibCli = T01LV24_A1013DibCli[0] ;
         n1013DibCli = T01LV24_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = T01LV24_A252CliCod[0] ;
         n252CliCod = T01LV24_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = T01LV24_A1014DibInt[0] ;
         n1014DibInt = T01LV24_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      }
   }

   public void scanEnd1LV545( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1LV545( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LV545( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LV545( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LV545( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LV545( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LV545( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LV545( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1LV1055( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7675AMOrden = T01LV3_A7675AMOrden[0] ;
         }
         else
         {
            Z7675AMOrden = A7675AMOrden ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z7502AMDibCli = A7502AMDibCli ;
         Z7503AMDibInt = A7503AMDibInt ;
         Z7504AMCliCod = A7504AMCliCod ;
         Z7675AMOrden = A7675AMOrden ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LV1055( )
   {
   }

   public void standaloneModal1LV1055( )
   {
      if ( isIns( )  && (0==A7675AMOrden) && ( Gx_BScreen == 0 ) )
      {
         A7675AMOrden = (byte)(0) ;
         n7675AMOrden = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAMDibCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAMDibCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAMDibInt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibInt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAMDibInt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibInt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAMCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAMCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1LV1055( )
   {
      /* Using cursor T01LV25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1055 = (short)(1) ;
         A7675AMOrden = T01LV25_A7675AMOrden[0] ;
         n7675AMOrden = T01LV25_n7675AMOrden[0] ;
         zm1LV1055( -16) ;
      }
      pr_default.close(23);
      onLoadActions1LV1055( ) ;
   }

   public void onLoadActions1LV1055( )
   {
   }

   public void checkExtendedTable1LV1055( )
   {
      nIsDirty_1055 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1LV1055( ) ;
      if ( ( GXutil.strcmp(GXutil.substring( A7502AMDibCli, 1, 1), GXutil.substring( A1013DibCli, 1, 1)) != 0 ) && true /* Level */ )
      {
         GXCCtl = "AMDIBCLI_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Dibujo Invalido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAMDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1LV1055( )
   {
   }

   public void enableDisable1LV1055( )
   {
   }

   public void getKey1LV1055( )
   {
      /* Using cursor T01LV26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1055 = (short)(1) ;
      }
      else
      {
         RcdFound1055 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey1LV1055( )
   {
      /* Using cursor T01LV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LV3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LV1055( 16) ;
         RcdFound1055 = (short)(1) ;
         initializeNonKey1LV1055( ) ;
         A7502AMDibCli = T01LV3_A7502AMDibCli[0] ;
         A7503AMDibInt = T01LV3_A7503AMDibInt[0] ;
         A7504AMCliCod = T01LV3_A7504AMCliCod[0] ;
         A7675AMOrden = T01LV3_A7675AMOrden[0] ;
         n7675AMOrden = T01LV3_n7675AMOrden[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z252CliCod = A252CliCod ;
         Z7502AMDibCli = A7502AMDibCli ;
         Z7503AMDibInt = A7503AMDibInt ;
         Z7504AMCliCod = A7504AMCliCod ;
         sMode1055 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LV1055( ) ;
         Gx_mode = sMode1055 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1055 = (short)(0) ;
         initializeNonKey1LV1055( ) ;
         sMode1055 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LV1055( ) ;
         Gx_mode = sMode1055 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LV1055( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LV1055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTMZA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z7675AMOrden != T01LV2_A7675AMOrden[0] ) )
         {
            if ( Z7675AMOrden != T01LV2_A7675AMOrden[0] )
            {
               GXutil.writeLogln("ttrn19:[seudo value changed for attri]"+"AMOrden");
               GXutil.writeLogRaw("Old: ",Z7675AMOrden);
               GXutil.writeLogRaw("Current: ",T01LV2_A7675AMOrden[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTMZA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LV1055( )
   {
      beforeValidate1LV1055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LV1055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LV1055( 0) ;
         checkOptimisticConcurrency1LV1055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LV1055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LV1055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LV27 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod), Boolean.valueOf(n7675AMOrden), Byte.valueOf(A7675AMOrden), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMZA");
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
            load1LV1055( ) ;
         }
         endLevel1LV1055( ) ;
      }
      closeExtendedTableCursors1LV1055( ) ;
   }

   public void update1LV1055( )
   {
      beforeValidate1LV1055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LV1055( ) ;
      }
      if ( ( nIsMod_1055 != 0 ) || ( nIsDirty_1055 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LV1055( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LV1055( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LV1055( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LV28 */
                     pr_default.execute(26, new Object[] {Boolean.valueOf(n7675AMOrden), Byte.valueOf(A7675AMOrden), A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMZA");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTMZA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LV1055( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LV1055( ) ;
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
            endLevel1LV1055( ) ;
         }
      }
      closeExtendedTableCursors1LV1055( ) ;
   }

   public void deferredUpdate1LV1055( )
   {
   }

   public void delete1LV1055( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LV1055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LV1055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LV1055( ) ;
         afterConfirm1LV1055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LV1055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LV29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMZA");
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
      sMode1055 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LV1055( ) ;
      Gx_mode = sMode1055 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LV1055( )
   {
      standaloneModal1LV1055( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LV1055( )
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

   public void scanStart1LV1055( )
   {
      /* Scan By routine */
      /* Using cursor T01LV30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1055 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1055 = (short)(1) ;
         A7502AMDibCli = T01LV30_A7502AMDibCli[0] ;
         A7503AMDibInt = T01LV30_A7503AMDibInt[0] ;
         A7504AMCliCod = T01LV30_A7504AMCliCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LV1055( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1055 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1055 = (short)(1) ;
         A7502AMDibCli = T01LV30_A7502AMDibCli[0] ;
         A7503AMDibInt = T01LV30_A7503AMDibInt[0] ;
         A7504AMCliCod = T01LV30_A7504AMCliCod[0] ;
      }
   }

   public void scanEnd1LV1055( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1LV1055( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LV1055( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LV1055( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LV1055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LV1055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LV1055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LV1055( )
   {
      edtAMDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAMDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibInt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAMCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAMOrden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMOrden_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1LV1055( )
   {
   }

   public void send_integrity_lvl_hashes1LV545( )
   {
   }

   public void subsflControlProps_501055( )
   {
      edtavnRcdDeleted_1055_Internalname = "vNRCDDELETED_1055_"+sGXsfl_50_idx ;
      edtAMDibCli_Internalname = "AMDIBCLI_"+sGXsfl_50_idx ;
      edtAMDibInt_Internalname = "AMDIBINT_"+sGXsfl_50_idx ;
      edtAMCliCod_Internalname = "AMCLICOD_"+sGXsfl_50_idx ;
      edtAMOrden_Internalname = "AMORDEN_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501055( )
   {
      edtavnRcdDeleted_1055_Internalname = "vNRCDDELETED_1055_"+sGXsfl_50_fel_idx ;
      edtAMDibCli_Internalname = "AMDIBCLI_"+sGXsfl_50_fel_idx ;
      edtAMDibInt_Internalname = "AMDIBINT_"+sGXsfl_50_fel_idx ;
      edtAMCliCod_Internalname = "AMCLICOD_"+sGXsfl_50_fel_idx ;
      edtAMOrden_Internalname = "AMORDEN_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1LV1055( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501055( ) ;
      sendRow1LV1055( ) ;
   }

   public void sendRow1LV1055( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1055_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1055_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1055_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1055), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1055), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1055_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1055_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1055_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAMDibCli_Internalname,GXutil.rtrim( A7502AMDibCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAMDibCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAMDibCli_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1055_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAMDibInt_Internalname,GXutil.ltrim( localUtil.ntoc( A7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7503AMDibInt), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAMDibInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAMDibInt_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1055_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAMCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7504AMCliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAMCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAMCliCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1055_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAMOrden_Internalname,GXutil.ltrim( localUtil.ntoc( A7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAMOrden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7675AMOrden), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7675AMOrden), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAMOrden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAMOrden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LV1055( ) ;
      GXCCtl = "Z7502AMDibCli_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7502AMDibCli));
      GXCCtl = "Z7503AMDibInt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7503AMDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7504AMCliCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7504AMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7675AMOrden_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7675AMOrden, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1055_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1055_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1055_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1055, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDIBCLI_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33DibCli));
      GXCCtl = "vCLICOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDIBINT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35dibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1055_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1055_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AMDIBCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AMDIBINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AMCLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AMORDEN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAMOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LV1055( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501055( ) ;
      edtavnRcdDeleted_1055_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1055_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAMDibCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMDIBCLI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAMDibInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMDIBINT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAMCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMCLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAMOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AMORDEN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1055_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1055_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1055");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1055_Internalname ;
         wbErr = true ;
         nRcdDeleted_1055 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1055 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1055_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7502AMDibCli = httpContext.cgiGet( edtAMDibCli_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAMDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAMDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "AMDIBINT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAMDibInt_Internalname ;
         wbErr = true ;
         A7503AMDibInt = 0 ;
      }
      else
      {
         A7503AMDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtAMDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "AMCLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAMCliCod_Internalname ;
         wbErr = true ;
         A7504AMCliCod = 0 ;
      }
      else
      {
         A7504AMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAMOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAMOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "AMORDEN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAMOrden_Internalname ;
         wbErr = true ;
         A7675AMOrden = (byte)(0) ;
         n7675AMOrden = false ;
      }
      else
      {
         A7675AMOrden = (byte)(localUtil.ctol( httpContext.cgiGet( edtAMOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7675AMOrden = false ;
      }
      GXCCtl = "Z7502AMDibCli_" + sGXsfl_50_idx ;
      Z7502AMDibCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7503AMDibInt_" + sGXsfl_50_idx ;
      Z7503AMDibInt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7504AMCliCod_" + sGXsfl_50_idx ;
      Z7504AMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7675AMOrden_" + sGXsfl_50_idx ;
      Z7675AMOrden = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1055_" + sGXsfl_50_idx ;
      nRcdDeleted_1055 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1055_" + sGXsfl_50_idx ;
      nRcdExists_1055 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1055_" + sGXsfl_50_idx ;
      nIsMod_1055 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAMCliCod_Enabled = edtAMCliCod_Enabled ;
      defedtAMDibInt_Enabled = edtAMDibInt_Enabled ;
      defedtAMDibCli_Enabled = edtAMDibCli_Enabled ;
   }

   public void confirmValues1LV0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501055( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501055( ) ;
         httpContext.changePostValue( "Z7502AMDibCli_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7502AMDibCli_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7502AMDibCli_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7503AMDibInt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7503AMDibInt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7503AMDibInt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7504AMCliCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7504AMCliCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7504AMCliCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z7675AMOrden_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z7675AMOrden_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7675AMOrden_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn19", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33DibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV34clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35dibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","DibCli","clicod","dibInt","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn19");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn19:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIBCLI", GXutil.rtrim( AV33DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV34clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIBINT", GXutil.ltrim( localUtil.ntoc( AV35dibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
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
      return formatLink("app.ttrn19", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33DibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV34clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35dibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","DibCli","clicod","dibInt","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn19" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Dibujos MEZCLAS", "") ;
   }

   public void initializeNonKey1LV545( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
   }

   public void initAll1LV545( )
   {
      A1013DibCli = "" ;
      n1013DibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      initializeNonKey1LV545( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LV1055( )
   {
      A7675AMOrden = (byte)(0) ;
      n7675AMOrden = false ;
      Z7675AMOrden = (byte)(0) ;
   }

   public void initAll1LV1055( )
   {
      A7502AMDibCli = "" ;
      A7503AMDibInt = 0 ;
      A7504AMCliCod = 0 ;
      initializeNonKey1LV1055( ) ;
   }

   public void standaloneModalInsert1LV1055( )
   {
      A7675AMOrden = i7675AMOrden ;
      n7675AMOrden = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241592166", true, true);
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
      httpContext.AddJavascriptSource("ttrn19.js", "?20268241592166", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1055( )
   {
      edtAMCliCod_Enabled = defedtAMCliCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAMDibInt_Enabled = defedtAMDibInt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibInt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAMDibCli_Enabled = defedtAMDibCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAMDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAMDibCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1055, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1055_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7502AMDibCli));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7503AMDibInt, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAMDibInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7504AMCliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAMCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7675AMOrden, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAMOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliCod_Internalname = "CLICOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_1055_Internalname = "vNRCDDELETED_1055" ;
      edtAMDibCli_Internalname = "AMDIBCLI" ;
      edtAMDibInt_Internalname = "AMDIBINT" ;
      edtAMCliCod_Internalname = "AMCLICOD" ;
      edtAMOrden_Internalname = "AMORDEN" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Dibujos MEZCLAS", "") );
      edtAMOrden_Jsonclick = "" ;
      edtAMCliCod_Jsonclick = "" ;
      edtAMDibInt_Jsonclick = "" ;
      edtAMDibCli_Jsonclick = "" ;
      edtavnRcdDeleted_1055_Jsonclick = "" ;
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
      edtAMOrden_Enabled = 1 ;
      edtAMCliCod_Enabled = 1 ;
      edtAMDibInt_Enabled = 1 ;
      edtAMDibCli_Enabled = 1 ;
      edtavnRcdDeleted_1055_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 1 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 1 ;
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

   public void xc_10_1LV545( String A396EmprCod ,
                             String A1013DibCli ,
                             int A252CliCod ,
                             int A1014DibInt )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1013DibCli ;
         GXv_int6[0] = A252CliCod ;
         GXv_int5[0] = A1014DibInt ;
         new app.parmmza(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         A1013DibCli = GXv_char3[0] ;
         A252CliCod = GXv_int6[0] ;
         A1014DibInt = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1013DibCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_501055( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LV1055( ) ;
         standaloneModal1LV1055( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LV1055( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501055( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01LV15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01LV15_A279CliNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Amdibcli( )
   {
      n1013DibCli = false ;
      if ( ( GXutil.strcmp(GXutil.substring( A7502AMDibCli, 1, 1), GXutil.substring( A1013DibCli, 1, 1)) != 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Dibujo Invalido", ""), 1, "AMDIBCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAMDibCli_Internalname ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33DibCli',fld:'vDIBCLI',pic:''},{av:'AV34clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV35dibInt',fld:'vDIBINT',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_AMDIBCLI","{handler:'valid_Amdibcli',iparms:[{av:'A7502AMDibCli',fld:'AMDIBCLI',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''}]");
      setEventMetadata("VALID_AMDIBCLI",",oparms:[]}");
      setEventMetadata("VALID_AMDIBINT","{handler:'valid_Amdibint',iparms:[]");
      setEventMetadata("VALID_AMDIBINT",",oparms:[]}");
      setEventMetadata("VALID_AMCLICOD","{handler:'valid_Amclicod',iparms:[]");
      setEventMetadata("VALID_AMCLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Amorden',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV33DibCli = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z1013DibCli = "" ;
      Z7502AMDibCli = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      AV33DibCli = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1055 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode545 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A7502AMDibCli = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01LV6_A407EmprNom = new String[] {""} ;
      T01LV6_n407EmprNom = new boolean[] {false} ;
      T01LV7_A279CliNom = new String[] {""} ;
      T01LV8_A1013DibCli = new String[] {""} ;
      T01LV8_n1013DibCli = new boolean[] {false} ;
      T01LV8_A1014DibInt = new int[1] ;
      T01LV8_n1014DibInt = new boolean[] {false} ;
      T01LV8_A407EmprNom = new String[] {""} ;
      T01LV8_n407EmprNom = new boolean[] {false} ;
      T01LV8_A279CliNom = new String[] {""} ;
      T01LV8_A396EmprCod = new String[] {""} ;
      T01LV8_A252CliCod = new int[1] ;
      T01LV8_n252CliCod = new boolean[] {false} ;
      T01LV9_A279CliNom = new String[] {""} ;
      T01LV10_A396EmprCod = new String[] {""} ;
      T01LV10_A1013DibCli = new String[] {""} ;
      T01LV10_n1013DibCli = new boolean[] {false} ;
      T01LV10_A252CliCod = new int[1] ;
      T01LV10_n252CliCod = new boolean[] {false} ;
      T01LV10_A1014DibInt = new int[1] ;
      T01LV10_n1014DibInt = new boolean[] {false} ;
      T01LV5_A1013DibCli = new String[] {""} ;
      T01LV5_n1013DibCli = new boolean[] {false} ;
      T01LV5_A1014DibInt = new int[1] ;
      T01LV5_n1014DibInt = new boolean[] {false} ;
      T01LV5_A396EmprCod = new String[] {""} ;
      T01LV5_A252CliCod = new int[1] ;
      T01LV5_n252CliCod = new boolean[] {false} ;
      T01LV11_A396EmprCod = new String[] {""} ;
      T01LV11_A1013DibCli = new String[] {""} ;
      T01LV11_n1013DibCli = new boolean[] {false} ;
      T01LV11_A252CliCod = new int[1] ;
      T01LV11_n252CliCod = new boolean[] {false} ;
      T01LV11_A1014DibInt = new int[1] ;
      T01LV11_n1014DibInt = new boolean[] {false} ;
      T01LV12_A396EmprCod = new String[] {""} ;
      T01LV12_A1013DibCli = new String[] {""} ;
      T01LV12_n1013DibCli = new boolean[] {false} ;
      T01LV12_A252CliCod = new int[1] ;
      T01LV12_n252CliCod = new boolean[] {false} ;
      T01LV12_A1014DibInt = new int[1] ;
      T01LV12_n1014DibInt = new boolean[] {false} ;
      T01LV4_A1013DibCli = new String[] {""} ;
      T01LV4_n1013DibCli = new boolean[] {false} ;
      T01LV4_A1014DibInt = new int[1] ;
      T01LV4_n1014DibInt = new boolean[] {false} ;
      T01LV4_A396EmprCod = new String[] {""} ;
      T01LV4_A252CliCod = new int[1] ;
      T01LV4_n252CliCod = new boolean[] {false} ;
      T01LV15_A279CliNom = new String[] {""} ;
      T01LV16_A396EmprCod = new String[] {""} ;
      T01LV16_A11604PArtId = new int[1] ;
      T01LV17_A396EmprCod = new String[] {""} ;
      T01LV17_A2600GrrNumOrd = new int[1] ;
      T01LV18_A396EmprCod = new String[] {""} ;
      T01LV18_A252CliCod = new int[1] ;
      T01LV18_n252CliCod = new boolean[] {false} ;
      T01LV18_A2141SerEst = new String[] {""} ;
      T01LV18_A1013DibCli = new String[] {""} ;
      T01LV18_n1013DibCli = new boolean[] {false} ;
      T01LV18_A1014DibInt = new int[1] ;
      T01LV18_n1014DibInt = new boolean[] {false} ;
      T01LV18_A2074ColCom = new String[] {""} ;
      T01LV18_A2078ColFon = new String[] {""} ;
      T01LV19_A396EmprCod = new String[] {""} ;
      T01LV19_A1013DibCli = new String[] {""} ;
      T01LV19_n1013DibCli = new boolean[] {false} ;
      T01LV19_A252CliCod = new int[1] ;
      T01LV19_n252CliCod = new boolean[] {false} ;
      T01LV19_A1014DibInt = new int[1] ;
      T01LV19_n1014DibInt = new boolean[] {false} ;
      T01LV19_A1029DibLin = new short[1] ;
      T01LV20_A396EmprCod = new String[] {""} ;
      T01LV20_A1013DibCli = new String[] {""} ;
      T01LV20_n1013DibCli = new boolean[] {false} ;
      T01LV20_A252CliCod = new int[1] ;
      T01LV20_n252CliCod = new boolean[] {false} ;
      T01LV20_A1014DibInt = new int[1] ;
      T01LV20_n1014DibInt = new boolean[] {false} ;
      T01LV20_A1807DibLinCil = new short[1] ;
      T01LV21_A396EmprCod = new String[] {""} ;
      T01LV21_A1013DibCli = new String[] {""} ;
      T01LV21_n1013DibCli = new boolean[] {false} ;
      T01LV21_A252CliCod = new int[1] ;
      T01LV21_n252CliCod = new boolean[] {false} ;
      T01LV21_A1014DibInt = new int[1] ;
      T01LV21_n1014DibInt = new boolean[] {false} ;
      T01LV21_A2521DibObsLin = new byte[1] ;
      T01LV22_A396EmprCod = new String[] {""} ;
      T01LV22_A1013DibCli = new String[] {""} ;
      T01LV22_n1013DibCli = new boolean[] {false} ;
      T01LV22_A252CliCod = new int[1] ;
      T01LV22_n252CliCod = new boolean[] {false} ;
      T01LV22_A1014DibInt = new int[1] ;
      T01LV22_n1014DibInt = new boolean[] {false} ;
      T01LV22_A425EstAny = new short[1] ;
      T01LV22_A3913DibSerFac = new String[] {""} ;
      T01LV23_A396EmprCod = new String[] {""} ;
      T01LV23_A361DisCod = new int[1] ;
      T01LV24_A396EmprCod = new String[] {""} ;
      T01LV24_A1013DibCli = new String[] {""} ;
      T01LV24_n1013DibCli = new boolean[] {false} ;
      T01LV24_A252CliCod = new int[1] ;
      T01LV24_n252CliCod = new boolean[] {false} ;
      T01LV24_A1014DibInt = new int[1] ;
      T01LV24_n1014DibInt = new boolean[] {false} ;
      T01LV25_A1013DibCli = new String[] {""} ;
      T01LV25_n1013DibCli = new boolean[] {false} ;
      T01LV25_A252CliCod = new int[1] ;
      T01LV25_n252CliCod = new boolean[] {false} ;
      T01LV25_A1014DibInt = new int[1] ;
      T01LV25_n1014DibInt = new boolean[] {false} ;
      T01LV25_A7502AMDibCli = new String[] {""} ;
      T01LV25_A7503AMDibInt = new int[1] ;
      T01LV25_A7504AMCliCod = new int[1] ;
      T01LV25_A7675AMOrden = new byte[1] ;
      T01LV25_n7675AMOrden = new boolean[] {false} ;
      T01LV25_A396EmprCod = new String[] {""} ;
      T01LV26_A396EmprCod = new String[] {""} ;
      T01LV26_A1013DibCli = new String[] {""} ;
      T01LV26_n1013DibCli = new boolean[] {false} ;
      T01LV26_A1014DibInt = new int[1] ;
      T01LV26_n1014DibInt = new boolean[] {false} ;
      T01LV26_A252CliCod = new int[1] ;
      T01LV26_n252CliCod = new boolean[] {false} ;
      T01LV26_A7502AMDibCli = new String[] {""} ;
      T01LV26_A7503AMDibInt = new int[1] ;
      T01LV26_A7504AMCliCod = new int[1] ;
      T01LV3_A1013DibCli = new String[] {""} ;
      T01LV3_n1013DibCli = new boolean[] {false} ;
      T01LV3_A252CliCod = new int[1] ;
      T01LV3_n252CliCod = new boolean[] {false} ;
      T01LV3_A1014DibInt = new int[1] ;
      T01LV3_n1014DibInt = new boolean[] {false} ;
      T01LV3_A7502AMDibCli = new String[] {""} ;
      T01LV3_A7503AMDibInt = new int[1] ;
      T01LV3_A7504AMCliCod = new int[1] ;
      T01LV3_A7675AMOrden = new byte[1] ;
      T01LV3_n7675AMOrden = new boolean[] {false} ;
      T01LV3_A396EmprCod = new String[] {""} ;
      T01LV2_A1013DibCli = new String[] {""} ;
      T01LV2_n1013DibCli = new boolean[] {false} ;
      T01LV2_A252CliCod = new int[1] ;
      T01LV2_n252CliCod = new boolean[] {false} ;
      T01LV2_A1014DibInt = new int[1] ;
      T01LV2_n1014DibInt = new boolean[] {false} ;
      T01LV2_A7502AMDibCli = new String[] {""} ;
      T01LV2_A7503AMDibInt = new int[1] ;
      T01LV2_A7504AMCliCod = new int[1] ;
      T01LV2_A7675AMOrden = new byte[1] ;
      T01LV2_n7675AMOrden = new boolean[] {false} ;
      T01LV2_A396EmprCod = new String[] {""} ;
      T01LV30_A396EmprCod = new String[] {""} ;
      T01LV30_A1013DibCli = new String[] {""} ;
      T01LV30_n1013DibCli = new boolean[] {false} ;
      T01LV30_A1014DibInt = new int[1] ;
      T01LV30_n1014DibInt = new boolean[] {false} ;
      T01LV30_A252CliCod = new int[1] ;
      T01LV30_n252CliCod = new boolean[] {false} ;
      T01LV30_A7502AMDibCli = new String[] {""} ;
      T01LV30_A7503AMDibInt = new int[1] ;
      T01LV30_A7504AMCliCod = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn19__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn19__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn19__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn19__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn19__default(),
         new Object[] {
             new Object[] {
            T01LV2_A1013DibCli, T01LV2_A252CliCod, T01LV2_A1014DibInt, T01LV2_A7502AMDibCli, T01LV2_A7503AMDibInt, T01LV2_A7504AMCliCod, T01LV2_A7675AMOrden, T01LV2_n7675AMOrden, T01LV2_A396EmprCod
            }
            , new Object[] {
            T01LV3_A1013DibCli, T01LV3_A252CliCod, T01LV3_A1014DibInt, T01LV3_A7502AMDibCli, T01LV3_A7503AMDibInt, T01LV3_A7504AMCliCod, T01LV3_A7675AMOrden, T01LV3_n7675AMOrden, T01LV3_A396EmprCod
            }
            , new Object[] {
            T01LV4_A1013DibCli, T01LV4_A1014DibInt, T01LV4_A396EmprCod, T01LV4_A252CliCod
            }
            , new Object[] {
            T01LV5_A1013DibCli, T01LV5_A1014DibInt, T01LV5_A396EmprCod, T01LV5_A252CliCod
            }
            , new Object[] {
            T01LV6_A407EmprNom, T01LV6_n407EmprNom
            }
            , new Object[] {
            T01LV7_A279CliNom
            }
            , new Object[] {
            T01LV8_A1013DibCli, T01LV8_A1014DibInt, T01LV8_A407EmprNom, T01LV8_n407EmprNom, T01LV8_A279CliNom, T01LV8_A396EmprCod, T01LV8_A252CliCod
            }
            , new Object[] {
            T01LV9_A279CliNom
            }
            , new Object[] {
            T01LV10_A396EmprCod, T01LV10_A1013DibCli, T01LV10_A252CliCod, T01LV10_A1014DibInt
            }
            , new Object[] {
            T01LV11_A396EmprCod, T01LV11_A1013DibCli, T01LV11_A252CliCod, T01LV11_A1014DibInt
            }
            , new Object[] {
            T01LV12_A396EmprCod, T01LV12_A1013DibCli, T01LV12_A252CliCod, T01LV12_A1014DibInt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LV15_A279CliNom
            }
            , new Object[] {
            T01LV16_A396EmprCod, T01LV16_A11604PArtId
            }
            , new Object[] {
            T01LV17_A396EmprCod, T01LV17_A2600GrrNumOrd
            }
            , new Object[] {
            T01LV18_A396EmprCod, T01LV18_A252CliCod, T01LV18_A2141SerEst, T01LV18_A1013DibCli, T01LV18_A1014DibInt, T01LV18_A2074ColCom, T01LV18_A2078ColFon
            }
            , new Object[] {
            T01LV19_A396EmprCod, T01LV19_A1013DibCli, T01LV19_A252CliCod, T01LV19_A1014DibInt, T01LV19_A1029DibLin
            }
            , new Object[] {
            T01LV20_A396EmprCod, T01LV20_A1013DibCli, T01LV20_A252CliCod, T01LV20_A1014DibInt, T01LV20_A1807DibLinCil
            }
            , new Object[] {
            T01LV21_A396EmprCod, T01LV21_A1013DibCli, T01LV21_A252CliCod, T01LV21_A1014DibInt, T01LV21_A2521DibObsLin
            }
            , new Object[] {
            T01LV22_A396EmprCod, T01LV22_A1013DibCli, T01LV22_A252CliCod, T01LV22_A1014DibInt, T01LV22_A425EstAny, T01LV22_A3913DibSerFac
            }
            , new Object[] {
            T01LV23_A396EmprCod, T01LV23_A361DisCod
            }
            , new Object[] {
            T01LV24_A396EmprCod, T01LV24_A1013DibCli, T01LV24_A252CliCod, T01LV24_A1014DibInt
            }
            , new Object[] {
            T01LV25_A1013DibCli, T01LV25_A252CliCod, T01LV25_A1014DibInt, T01LV25_A7502AMDibCli, T01LV25_A7503AMDibInt, T01LV25_A7504AMCliCod, T01LV25_A7675AMOrden, T01LV25_n7675AMOrden, T01LV25_A396EmprCod
            }
            , new Object[] {
            T01LV26_A396EmprCod, T01LV26_A1013DibCli, T01LV26_A1014DibInt, T01LV26_A252CliCod, T01LV26_A7502AMDibCli, T01LV26_A7503AMDibInt, T01LV26_A7504AMCliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LV30_A396EmprCod, T01LV30_A1013DibCli, T01LV30_A1014DibInt, T01LV30_A252CliCod, T01LV30_A7502AMDibCli, T01LV30_A7503AMDibInt, T01LV30_A7504AMCliCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TTrn19" ;
      Z7675AMOrden = (byte)(0) ;
      n7675AMOrden = false ;
      A7675AMOrden = (byte)(0) ;
      n7675AMOrden = false ;
      i7675AMOrden = (byte)(0) ;
      n7675AMOrden = false ;
   }

   private byte Z7675AMOrden ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A7675AMOrden ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i7675AMOrden ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1055 ;
   private short nRcdExists_1055 ;
   private short nIsMod_1055 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1055 ;
   private short RcdFound1055 ;
   private short nBlankRcdUsr1055 ;
   private short RcdFound545 ;
   private short nIsDirty_545 ;
   private short nIsDirty_1055 ;
   private int wcpOAV34clicod ;
   private int wcpOAV35dibInt ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z7503AMDibInt ;
   private int Z7504AMCliCod ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV34clicod ;
   private int AV35dibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_1055_Enabled ;
   private int edtAMDibCli_Enabled ;
   private int edtAMDibInt_Enabled ;
   private int edtAMCliCod_Enabled ;
   private int edtAMOrden_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7503AMDibInt ;
   private int A7504AMCliCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAMCliCod_Enabled ;
   private int defedtAMDibInt_Enabled ;
   private int defedtAMDibCli_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV33DibCli ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z1013DibCli ;
   private String Z7502AMDibCli ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV33DibCli ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDibCli_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtDibCli_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode1055 ;
   private String edtavnRcdDeleted_1055_Internalname ;
   private String edtAMDibCli_Internalname ;
   private String edtAMDibInt_Internalname ;
   private String edtAMCliCod_Internalname ;
   private String edtAMOrden_Internalname ;
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
   private String AV37Pgmname ;
   private String hsh ;
   private String sMode545 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A7502AMDibCli ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1055_Jsonclick ;
   private String edtAMDibCli_Jsonclick ;
   private String edtAMDibInt_Jsonclick ;
   private String edtAMCliCod_Jsonclick ;
   private String edtAMOrden_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1013DibCli ;
   private boolean n252CliCod ;
   private boolean n1014DibInt ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7675AMOrden ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01LV6_A407EmprNom ;
   private boolean[] T01LV6_n407EmprNom ;
   private String[] T01LV7_A279CliNom ;
   private String[] T01LV8_A1013DibCli ;
   private boolean[] T01LV8_n1013DibCli ;
   private int[] T01LV8_A1014DibInt ;
   private boolean[] T01LV8_n1014DibInt ;
   private String[] T01LV8_A407EmprNom ;
   private boolean[] T01LV8_n407EmprNom ;
   private String[] T01LV8_A279CliNom ;
   private String[] T01LV8_A396EmprCod ;
   private int[] T01LV8_A252CliCod ;
   private boolean[] T01LV8_n252CliCod ;
   private String[] T01LV9_A279CliNom ;
   private String[] T01LV10_A396EmprCod ;
   private String[] T01LV10_A1013DibCli ;
   private boolean[] T01LV10_n1013DibCli ;
   private int[] T01LV10_A252CliCod ;
   private boolean[] T01LV10_n252CliCod ;
   private int[] T01LV10_A1014DibInt ;
   private boolean[] T01LV10_n1014DibInt ;
   private String[] T01LV5_A1013DibCli ;
   private boolean[] T01LV5_n1013DibCli ;
   private int[] T01LV5_A1014DibInt ;
   private boolean[] T01LV5_n1014DibInt ;
   private String[] T01LV5_A396EmprCod ;
   private int[] T01LV5_A252CliCod ;
   private boolean[] T01LV5_n252CliCod ;
   private String[] T01LV11_A396EmprCod ;
   private String[] T01LV11_A1013DibCli ;
   private boolean[] T01LV11_n1013DibCli ;
   private int[] T01LV11_A252CliCod ;
   private boolean[] T01LV11_n252CliCod ;
   private int[] T01LV11_A1014DibInt ;
   private boolean[] T01LV11_n1014DibInt ;
   private String[] T01LV12_A396EmprCod ;
   private String[] T01LV12_A1013DibCli ;
   private boolean[] T01LV12_n1013DibCli ;
   private int[] T01LV12_A252CliCod ;
   private boolean[] T01LV12_n252CliCod ;
   private int[] T01LV12_A1014DibInt ;
   private boolean[] T01LV12_n1014DibInt ;
   private String[] T01LV4_A1013DibCli ;
   private boolean[] T01LV4_n1013DibCli ;
   private int[] T01LV4_A1014DibInt ;
   private boolean[] T01LV4_n1014DibInt ;
   private String[] T01LV4_A396EmprCod ;
   private int[] T01LV4_A252CliCod ;
   private boolean[] T01LV4_n252CliCod ;
   private String[] T01LV15_A279CliNom ;
   private String[] T01LV16_A396EmprCod ;
   private int[] T01LV16_A11604PArtId ;
   private String[] T01LV17_A396EmprCod ;
   private int[] T01LV17_A2600GrrNumOrd ;
   private String[] T01LV18_A396EmprCod ;
   private int[] T01LV18_A252CliCod ;
   private boolean[] T01LV18_n252CliCod ;
   private String[] T01LV18_A2141SerEst ;
   private String[] T01LV18_A1013DibCli ;
   private boolean[] T01LV18_n1013DibCli ;
   private int[] T01LV18_A1014DibInt ;
   private boolean[] T01LV18_n1014DibInt ;
   private String[] T01LV18_A2074ColCom ;
   private String[] T01LV18_A2078ColFon ;
   private String[] T01LV19_A396EmprCod ;
   private String[] T01LV19_A1013DibCli ;
   private boolean[] T01LV19_n1013DibCli ;
   private int[] T01LV19_A252CliCod ;
   private boolean[] T01LV19_n252CliCod ;
   private int[] T01LV19_A1014DibInt ;
   private boolean[] T01LV19_n1014DibInt ;
   private short[] T01LV19_A1029DibLin ;
   private String[] T01LV20_A396EmprCod ;
   private String[] T01LV20_A1013DibCli ;
   private boolean[] T01LV20_n1013DibCli ;
   private int[] T01LV20_A252CliCod ;
   private boolean[] T01LV20_n252CliCod ;
   private int[] T01LV20_A1014DibInt ;
   private boolean[] T01LV20_n1014DibInt ;
   private short[] T01LV20_A1807DibLinCil ;
   private String[] T01LV21_A396EmprCod ;
   private String[] T01LV21_A1013DibCli ;
   private boolean[] T01LV21_n1013DibCli ;
   private int[] T01LV21_A252CliCod ;
   private boolean[] T01LV21_n252CliCod ;
   private int[] T01LV21_A1014DibInt ;
   private boolean[] T01LV21_n1014DibInt ;
   private byte[] T01LV21_A2521DibObsLin ;
   private String[] T01LV22_A396EmprCod ;
   private String[] T01LV22_A1013DibCli ;
   private boolean[] T01LV22_n1013DibCli ;
   private int[] T01LV22_A252CliCod ;
   private boolean[] T01LV22_n252CliCod ;
   private int[] T01LV22_A1014DibInt ;
   private boolean[] T01LV22_n1014DibInt ;
   private short[] T01LV22_A425EstAny ;
   private String[] T01LV22_A3913DibSerFac ;
   private String[] T01LV23_A396EmprCod ;
   private int[] T01LV23_A361DisCod ;
   private String[] T01LV24_A396EmprCod ;
   private String[] T01LV24_A1013DibCli ;
   private boolean[] T01LV24_n1013DibCli ;
   private int[] T01LV24_A252CliCod ;
   private boolean[] T01LV24_n252CliCod ;
   private int[] T01LV24_A1014DibInt ;
   private boolean[] T01LV24_n1014DibInt ;
   private String[] T01LV25_A1013DibCli ;
   private boolean[] T01LV25_n1013DibCli ;
   private int[] T01LV25_A252CliCod ;
   private boolean[] T01LV25_n252CliCod ;
   private int[] T01LV25_A1014DibInt ;
   private boolean[] T01LV25_n1014DibInt ;
   private String[] T01LV25_A7502AMDibCli ;
   private int[] T01LV25_A7503AMDibInt ;
   private int[] T01LV25_A7504AMCliCod ;
   private byte[] T01LV25_A7675AMOrden ;
   private boolean[] T01LV25_n7675AMOrden ;
   private String[] T01LV25_A396EmprCod ;
   private String[] T01LV26_A396EmprCod ;
   private String[] T01LV26_A1013DibCli ;
   private boolean[] T01LV26_n1013DibCli ;
   private int[] T01LV26_A1014DibInt ;
   private boolean[] T01LV26_n1014DibInt ;
   private int[] T01LV26_A252CliCod ;
   private boolean[] T01LV26_n252CliCod ;
   private String[] T01LV26_A7502AMDibCli ;
   private int[] T01LV26_A7503AMDibInt ;
   private int[] T01LV26_A7504AMCliCod ;
   private String[] T01LV3_A1013DibCli ;
   private boolean[] T01LV3_n1013DibCli ;
   private int[] T01LV3_A252CliCod ;
   private boolean[] T01LV3_n252CliCod ;
   private int[] T01LV3_A1014DibInt ;
   private boolean[] T01LV3_n1014DibInt ;
   private String[] T01LV3_A7502AMDibCli ;
   private int[] T01LV3_A7503AMDibInt ;
   private int[] T01LV3_A7504AMCliCod ;
   private byte[] T01LV3_A7675AMOrden ;
   private boolean[] T01LV3_n7675AMOrden ;
   private String[] T01LV3_A396EmprCod ;
   private String[] T01LV2_A1013DibCli ;
   private boolean[] T01LV2_n1013DibCli ;
   private int[] T01LV2_A252CliCod ;
   private boolean[] T01LV2_n252CliCod ;
   private int[] T01LV2_A1014DibInt ;
   private boolean[] T01LV2_n1014DibInt ;
   private String[] T01LV2_A7502AMDibCli ;
   private int[] T01LV2_A7503AMDibInt ;
   private int[] T01LV2_A7504AMCliCod ;
   private byte[] T01LV2_A7675AMOrden ;
   private boolean[] T01LV2_n7675AMOrden ;
   private String[] T01LV2_A396EmprCod ;
   private String[] T01LV30_A396EmprCod ;
   private String[] T01LV30_A1013DibCli ;
   private boolean[] T01LV30_n1013DibCli ;
   private int[] T01LV30_A1014DibInt ;
   private boolean[] T01LV30_n1014DibInt ;
   private int[] T01LV30_A252CliCod ;
   private boolean[] T01LV30_n252CliCod ;
   private String[] T01LV30_A7502AMDibCli ;
   private int[] T01LV30_A7503AMDibInt ;
   private int[] T01LV30_A7504AMCliCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn19__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn19__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn19__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn19__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn19__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LV2", "SELECT DibCli, CliCod, DibInt, AMDibCli, AMDibInt, AMCliCod, AMOrden, EmprCod FROM TXPARTMZA WHERE EmprCod = ? AND DibCli = ? AND DibInt = ? AND CliCod = ? AND AMDibCli = ? AND AMDibInt = ? AND AMCliCod = ?  FOR UPDATE OF AMOrden NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV3", "SELECT DibCli, CliCod, DibInt, AMDibCli, AMDibInt, AMCliCod, AMOrden, EmprCod FROM TXPARTMZA WHERE EmprCod = ? AND DibCli = ? AND DibInt = ? AND CliCod = ? AND AMDibCli = ? AND AMDibInt = ? AND AMCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV4", "SELECT DibCli, DibInt, EmprCod, CliCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibCli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV5", "SELECT DibCli, DibInt, EmprCod, CliCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV8", "SELECT /*+ FIRST_ROWS(100) */ TM1.DibCli, TM1.DibInt, T2.EmprNom, T3.CliNom, TM1.EmprCod, TM1.CliCod FROM ((TXPCDIBUJ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.DibCli = ? and TM1.CliCod = ? and TM1.DibInt = ? ORDER BY TM1.EmprCod, TM1.DibCli, TM1.CliCod, TM1.DibInt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE ( DibCli > ? or DibCli = ? and CliCod > ? or CliCod = ? and DibCli = ? and DibInt > ?) and EmprCod = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE ( DibCli < ? or DibCli = ? and CliCod < ? or CliCod = ? and DibCli = ? and DibInt < ?) and EmprCod = ? ORDER BY EmprCod DESC, DibCli DESC, CliCod DESC, DibInt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LV13", "INSERT INTO TXPCDIBUJ(DibCli, DibInt, EmprCod, CliCod, GrabCod, DibFecUlt, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibObsUL, DibMolCil, DibMed, DibPosVor, DibLevMaq, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil, DibMolCi2, DibTipRas, DibPosRas, DibRap, DibUltLin, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibCob, DibDsc, DibBmp, DibFecBor, DibGra, DibSep, DibUltUti, DibAct, DibSentido) VALUES(?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPCDIBUJ")
         ,new UpdateCursor("T01LV14", "DELETE FROM TXPCDIBUJ  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new ForEachCursor("T01LV15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV16", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV17", "SELECT * FROM (SELECT EmprCod, GrrNumOrd FROM TXPCGRREP WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV18", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV19", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibLin FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV20", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV21", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibObsLin FROM TXPDIBOBS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV22", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV23", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LV24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV25", "SELECT DibCli, CliCod, DibInt, AMDibCli, AMDibInt, AMCliCod, AMOrden, EmprCod FROM TXPARTMZA WHERE EmprCod = ? and DibCli = ? and DibInt = ? and CliCod = ? and AMDibCli = ? and AMDibInt = ? and AMCliCod = ? ORDER BY EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LV26", "SELECT EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod FROM TXPARTMZA WHERE EmprCod = ? AND DibCli = ? AND DibInt = ? AND CliCod = ? AND AMDibCli = ? AND AMDibInt = ? AND AMCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LV27", "INSERT INTO TXPARTMZA(DibCli, CliCod, DibInt, AMDibCli, AMDibInt, AMCliCod, AMOrden, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPARTMZA")
         ,new UpdateCursor("T01LV28", "UPDATE TXPARTMZA SET AMOrden=?  WHERE EmprCod = ? AND DibCli = ? AND DibInt = ? AND CliCod = ? AND AMDibCli = ? AND AMDibInt = ? AND AMCliCod = ?", GX_NOMASK, "TXPARTMZA")
         ,new UpdateCursor("T01LV29", "DELETE FROM TXPARTMZA  WHERE EmprCod = ? AND DibCli = ? AND DibInt = ? AND CliCod = ? AND AMDibCli = ? AND AMDibInt = ? AND AMCliCod = ?", GX_NOMASK, "TXPARTMZA")
         ,new ForEachCursor("T01LV30", "SELECT EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod FROM TXPARTMZA WHERE EmprCod = ? and DibCli = ? and DibInt = ? and CliCod = ? ORDER BY EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 1 :
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
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 9 :
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
                  stmt.setString(2, (String)parms[3], 16);
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               return;
            case 10 :
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
                  stmt.setString(2, (String)parms[3], 16);
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               return;
            case 11 :
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
               return;
            case 12 :
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
            case 16 :
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
            case 17 :
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
            case 18 :
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
            case 19 :
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
            case 20 :
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
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
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
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
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
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 25 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 16);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[10]).byteValue());
               }
               stmt.setString(8, (String)parms[11], 3);
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
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setInt(8, ((Number) parms[11]).intValue());
               return;
            case 27 :
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
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 28 :
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
      }
   }

}

