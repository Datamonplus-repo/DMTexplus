package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn18_impl extends GXDataArea
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
            A1013DibCli = httpContext.GetPar( "DibCli") ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
            n1014DibInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Dibujos OBSERVACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      A2523DibObsUL = (byte)(GXutil.lval( httpContext.GetPar( "DibObsUL"))) ;
      n2523DibObsUL = false ;
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

   public ttrn18_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn18_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn18_impl.class ));
   }

   public ttrn18_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn18.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibObsUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2523DibObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibObsUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2523DibObsUL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2523DibObsUL), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibObsUL_Jsonclick, 0, "", "", "", "", "", 1, edtDibObsUL_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn18.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn18.htm");
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
         nBlankRcdCount548 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_548 = (short)(1) ;
            scanStart1LU548( ) ;
            while ( RcdFound548 != 0 )
            {
               init_level_properties548( ) ;
               getByPrimaryKey1LU548( ) ;
               addRow1LU548( ) ;
               scanNext1LU548( ) ;
            }
            scanEnd1LU548( ) ;
            nBlankRcdCount548 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2523DibObsUL = A2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         standaloneNotModal1LU548( ) ;
         standaloneModal1LU548( ) ;
         sMode548 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1LU548( ) ;
            edtavnRcdDeleted_548_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_548_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_548_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_548_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDibObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBOBSLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtDibObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBOBSTXT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsTxt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_548 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LU548( ) ;
            }
            sendRow1LU548( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2523DibObsUL = B2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount548 = (short)(5) ;
         nRcdExists_548 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LU548( ) ;
            while ( RcdFound548 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55548( ) ;
               init_level_properties548( ) ;
               standaloneNotModal1LU548( ) ;
               getByPrimaryKey1LU548( ) ;
               standaloneModal1LU548( ) ;
               addRow1LU548( ) ;
               scanNext1LU548( ) ;
            }
            scanEnd1LU548( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode548 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_55548( ) ;
         initAll1LU548( ) ;
         init_level_properties548( ) ;
         B2523DibObsUL = A2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         nRcdExists_548 = (short)(0) ;
         nIsMod_548 = (short)(0) ;
         nRcdDeleted_548 = (short)(0) ;
         nBlankRcdCount548 = (short)(nBlankRcdUsr548+nBlankRcdCount548) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount548 > 0 )
         {
            standaloneNotModal1LU548( ) ;
            standaloneModal1LU548( ) ;
            addRow1LU548( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDibObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount548 = (short)(nBlankRcdCount548-1) ;
         }
         Gx_mode = sMode548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2523DibObsUL = B2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn18.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn18.htm");
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
      e111LU2 ();
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
            Z2523DibObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2523DibObsUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O2523DibObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "O2523DibObsUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            n1013DibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1014DibInt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A2523DibObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( edtDibObsUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2523DibObsUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn18");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn18:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1LU0( ) ;
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
                        e111LU2 ();
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
            initAll1LU545( ) ;
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
         disableAttributes1LU545( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_548_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_548_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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

   public void confirm_1LU0( )
   {
      beforeValidate1LU545( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LU545( ) ;
         }
         else
         {
            checkExtendedTable1LU545( ) ;
            if ( AnyError == 0 )
            {
               zm1LU545( 12) ;
               zm1LU545( 13) ;
            }
            closeExtendedTableCursors1LU545( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode545 = Gx_mode ;
         confirm_1LU548( ) ;
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
         confirmValues1LU0( ) ;
      }
   }

   public void confirm_1LU548( )
   {
      s2523DibObsUL = O2523DibObsUL ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1LU548( ) ;
         if ( ( nRcdExists_548 != 0 ) || ( nIsMod_548 != 0 ) )
         {
            getKey1LU548( ) ;
            if ( ( nRcdExists_548 == 0 ) && ( nRcdDeleted_548 == 0 ) )
            {
               if ( RcdFound548 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LU548( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LU548( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LU548( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2523DibObsUL = A2523DibObsUL ;
                     n2523DibObsUL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "DIBOBSLIN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDibObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound548 != 0 )
               {
                  if ( nRcdDeleted_548 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LU548( ) ;
                     load1LU548( ) ;
                     beforeValidate1LU548( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LU548( ) ;
                        O2523DibObsUL = A2523DibObsUL ;
                        n2523DibObsUL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_548 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LU548( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LU548( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LU548( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2523DibObsUL = A2523DibObsUL ;
                           n2523DibObsUL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_548 == 0 )
                  {
                     GXCCtl = "DIBOBSLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDibObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_548_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibObsTxt_Internalname, GXutil.rtrim( A2522DibObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2521DibObsLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2522DibObsTxt_"+sGXsfl_55_idx, GXutil.rtrim( Z2522DibObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_548 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_548_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_548_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBOBSLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBOBSTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2523DibObsUL = s2523DibObsUL ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LU0( )
   {
   }

   public void e111LU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn18_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV38Pgmname, (byte)(99), GXv_char2) ;
      ttrn18_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn18_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn18_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn18_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn18_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LU545( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2523DibObsUL = T01LU5_A2523DibObsUL[0] ;
         }
         else
         {
            Z2523DibObsUL = A2523DibObsUL ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2523DibObsUL = A2523DibObsUL ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDibObsUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsUL_Enabled), 5, 0), true);
      AV38Pgmname = "TTrn18" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDibObsUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsUL_Enabled), 5, 0), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01LU6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LU6_A407EmprNom[0] ;
      n407EmprNom = T01LU6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01LU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01LU7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
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
   }

   public void load1LU545( )
   {
      /* Using cursor T01LU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound545 = (short)(1) ;
         A279CliNom = T01LU8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A2523DibObsUL = T01LU8_A2523DibObsUL[0] ;
         n2523DibObsUL = T01LU8_n2523DibObsUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         A407EmprNom = T01LU8_A407EmprNom[0] ;
         n407EmprNom = T01LU8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1LU545( -11) ;
      }
      pr_default.close(6);
      onLoadActions1LU545( ) ;
   }

   public void onLoadActions1LU545( )
   {
   }

   public void checkExtendedTable1LU545( )
   {
      nIsDirty_545 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1LU545( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1LU545( )
   {
      /* Using cursor T01LU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound545 = (short)(1) ;
      }
      else
      {
         RcdFound545 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01LU5_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU5_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LU5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LU5_A252CliCod[0] == A252CliCod ) )
      {
         zm1LU545( 11) ;
         RcdFound545 = (short)(1) ;
         A2523DibObsUL = T01LU5_A2523DibObsUL[0] ;
         n2523DibObsUL = T01LU5_n2523DibObsUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         O2523DibObsUL = A2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         sMode545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LU545( ) ;
         if ( AnyError == 1 )
         {
            RcdFound545 = (short)(0) ;
            initializeNonKey1LU545( ) ;
         }
         Gx_mode = sMode545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound545 = (short)(0) ;
         initializeNonKey1LU545( ) ;
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
      getKey1LU545( ) ;
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
      /* Using cursor T01LU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01LU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01LU10_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU10_A252CliCod[0] == A252CliCod ) && ( T01LU10_A1014DibInt[0] == A1014DibInt ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01LU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01LU10_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU10_A252CliCod[0] == A252CliCod ) && ( T01LU10_A1014DibInt[0] == A1014DibInt ) )
         {
            RcdFound545 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound545 = (short)(0) ;
      /* Using cursor T01LU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01LU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01LU11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU11_A252CliCod[0] == A252CliCod ) && ( T01LU11_A1014DibInt[0] == A1014DibInt ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01LU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01LU11_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU11_A252CliCod[0] == A252CliCod ) && ( T01LU11_A1014DibInt[0] == A1014DibInt ) )
         {
            RcdFound545 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LU545( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2523DibObsUL = O2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         insert1LU545( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2523DibObsUL = O2523DibObsUL ;
               n2523DibObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A2523DibObsUL = O2523DibObsUL ;
               n2523DibObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
               update1LU545( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) )
            {
               /* Insert record */
               A2523DibObsUL = O2523DibObsUL ;
               n2523DibObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
               insert1LU545( ) ;
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
                  A2523DibObsUL = O2523DibObsUL ;
                  n2523DibObsUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
                  insert1LU545( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2523DibObsUL = O2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey1LU545( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn18");
   }

   public void insert_check( )
   {
      confirm_1LU0( ) ;
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

   public void checkOptimisticConcurrency1LU545( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDIBUJ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z2523DibObsUL != T01LU4_A2523DibObsUL[0] ) )
         {
            if ( Z2523DibObsUL != T01LU4_A2523DibObsUL[0] )
            {
               GXutil.writeLogln("ttrn18:[seudo value changed for attri]"+"DibObsUL");
               GXutil.writeLogRaw("Old: ",Z2523DibObsUL);
               GXutil.writeLogRaw("Current: ",T01LU4_A2523DibObsUL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDIBUJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LU545( )
   {
      beforeValidate1LU545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LU545( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LU545( 0) ;
         checkOptimisticConcurrency1LU545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LU545( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LU545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LU12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n2523DibObsUL), Byte.valueOf(A2523DibObsUL), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1LU545( ) ;
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
            load1LU545( ) ;
         }
         endLevel1LU545( ) ;
      }
      closeExtendedTableCursors1LU545( ) ;
   }

   public void update1LU545( )
   {
      beforeValidate1LU545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LU545( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LU545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LU545( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LU545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LU13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n2523DibObsUL), Byte.valueOf(A2523DibObsUL), A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDIBUJ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LU545( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LU545( ) ;
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
         endLevel1LU545( ) ;
      }
      closeExtendedTableCursors1LU545( ) ;
   }

   public void deferredUpdate1LU545( )
   {
   }

   public void delete( )
   {
      beforeValidate1LU545( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LU545( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LU545( ) ;
         afterConfirm1LU545( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LU545( ) ;
            if ( AnyError == 0 )
            {
               A2523DibObsUL = O2523DibObsUL ;
               n2523DibObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
               scanStart1LU548( ) ;
               while ( RcdFound548 != 0 )
               {
                  getByPrimaryKey1LU548( ) ;
                  delete1LU548( ) ;
                  scanNext1LU548( ) ;
                  O2523DibObsUL = A2523DibObsUL ;
                  n2523DibObsUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
               }
               scanEnd1LU548( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LU14 */
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
      endLevel1LU545( ) ;
      Gx_mode = sMode545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LU545( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01LU15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01LU16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMZA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01LU17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01LU18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01LU19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01LU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDIBUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01LU21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESTDI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01LU22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel1LU548( )
   {
      s2523DibObsUL = O2523DibObsUL ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1LU548( ) ;
         if ( ( nRcdExists_548 != 0 ) || ( nIsMod_548 != 0 ) )
         {
            standaloneNotModal1LU548( ) ;
            getKey1LU548( ) ;
            if ( ( nRcdExists_548 == 0 ) && ( nRcdDeleted_548 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LU548( ) ;
            }
            else
            {
               if ( RcdFound548 != 0 )
               {
                  if ( ( nRcdDeleted_548 != 0 ) && ( nRcdExists_548 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LU548( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_548 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LU548( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_548 == 0 )
                  {
                     GXCCtl = "DIBOBSLIN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDibObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2523DibObsUL = A2523DibObsUL ;
            n2523DibObsUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_548_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibObsTxt_Internalname, GXutil.rtrim( A2522DibObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2521DibObsLin_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2522DibObsTxt_"+sGXsfl_55_idx, GXutil.rtrim( Z2522DibObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_548_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_548 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_548_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_548_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBOBSLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBOBSTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LU548( ) ;
      if ( AnyError != 0 )
      {
         O2523DibObsUL = s2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      }
      nRcdExists_548 = (short)(0) ;
      nIsMod_548 = (short)(0) ;
      nRcdDeleted_548 = (short)(0) ;
   }

   public void processLevel1LU545( )
   {
      /* Save parent mode. */
      sMode545 = Gx_mode ;
      processNestedLevel1LU548( ) ;
      if ( AnyError != 0 )
      {
         O2523DibObsUL = s2523DibObsUL ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01LU23 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n2523DibObsUL), Byte.valueOf(A2523DibObsUL), A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
   }

   public void endLevel1LU545( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1LU545( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn18");
         if ( AnyError == 0 )
         {
            confirmValues1LU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn18");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LU545( )
   {
      /* Scan By routine */
      /* Using cursor T01LU24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      RcdFound545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound545 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LU545( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound545 = (short)(1) ;
      }
   }

   public void scanEnd1LU545( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1LU545( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LU545( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LU545( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LU545( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LU545( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LU545( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LU545( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDibObsUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsUL_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1LU548( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2522DibObsTxt = T01LU3_A2522DibObsTxt[0] ;
         }
         else
         {
            Z2522DibObsTxt = A2522DibObsTxt ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z2521DibObsLin = A2521DibObsLin ;
         Z2522DibObsTxt = A2522DibObsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LU548( )
   {
      edtDibObsUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsUL_Enabled), 5, 0), true);
      edtDibObsUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsUL_Enabled), 5, 0), true);
   }

   public void standaloneModal1LU548( )
   {
      if ( isIns( )  )
      {
         A2523DibObsUL = (byte)(O2523DibObsUL+1) ;
         n2523DibObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2521DibObsLin = A2523DibObsUL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDibObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtDibObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1LU548( )
   {
      /* Using cursor T01LU25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound548 = (short)(1) ;
         A2522DibObsTxt = T01LU25_A2522DibObsTxt[0] ;
         n2522DibObsTxt = T01LU25_n2522DibObsTxt[0] ;
         zm1LU548( -14) ;
      }
      pr_default.close(23);
      onLoadActions1LU548( ) ;
   }

   public void onLoadActions1LU548( )
   {
   }

   public void checkExtendedTable1LU548( )
   {
      nIsDirty_548 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1LU548( ) ;
   }

   public void closeExtendedTableCursors1LU548( )
   {
   }

   public void enableDisable1LU548( )
   {
   }

   public void getKey1LU548( )
   {
      /* Using cursor T01LU26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound548 = (short)(1) ;
      }
      else
      {
         RcdFound548 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey1LU548( )
   {
      /* Using cursor T01LU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LU3_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01LU3_A252CliCod[0] == A252CliCod ) && ( T01LU3_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LU3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LU548( 14) ;
         RcdFound548 = (short)(1) ;
         initializeNonKey1LU548( ) ;
         A2521DibObsLin = T01LU3_A2521DibObsLin[0] ;
         A2522DibObsTxt = T01LU3_A2522DibObsTxt[0] ;
         n2522DibObsTxt = T01LU3_n2522DibObsTxt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z2521DibObsLin = A2521DibObsLin ;
         sMode548 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LU548( ) ;
         Gx_mode = sMode548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound548 = (short)(0) ;
         initializeNonKey1LU548( ) ;
         sMode548 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LU548( ) ;
         Gx_mode = sMode548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LU548( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LU548( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIBOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2522DibObsTxt, T01LU2_A2522DibObsTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2522DibObsTxt, T01LU2_A2522DibObsTxt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn18:[seudo value changed for attri]"+"DibObsTxt");
               GXutil.writeLogRaw("Old: ",Z2522DibObsTxt);
               GXutil.writeLogRaw("Current: ",T01LU2_A2522DibObsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDIBOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LU548( )
   {
      beforeValidate1LU548( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LU548( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LU548( 0) ;
         checkOptimisticConcurrency1LU548( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LU548( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LU548( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LU27 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin), Boolean.valueOf(n2522DibObsTxt), A2522DibObsTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
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
            load1LU548( ) ;
         }
         endLevel1LU548( ) ;
      }
      closeExtendedTableCursors1LU548( ) ;
   }

   public void update1LU548( )
   {
      beforeValidate1LU548( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LU548( ) ;
      }
      if ( ( nIsMod_548 != 0 ) || ( nIsDirty_548 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LU548( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LU548( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LU548( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LU28 */
                     pr_default.execute(26, new Object[] {Boolean.valueOf(n2522DibObsTxt), A2522DibObsTxt, A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIBOBS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LU548( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LU548( ) ;
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
            endLevel1LU548( ) ;
         }
      }
      closeExtendedTableCursors1LU548( ) ;
   }

   public void deferredUpdate1LU548( )
   {
   }

   public void delete1LU548( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LU548( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LU548( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LU548( ) ;
         afterConfirm1LU548( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LU548( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LU29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
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
      sMode548 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LU548( ) ;
      Gx_mode = sMode548 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LU548( )
   {
      standaloneModal1LU548( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LU548( )
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

   public void scanStart1LU548( )
   {
      /* Scan By routine */
      /* Using cursor T01LU30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      RcdFound548 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound548 = (short)(1) ;
         A2521DibObsLin = T01LU30_A2521DibObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LU548( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound548 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound548 = (short)(1) ;
         A2521DibObsLin = T01LU30_A2521DibObsLin[0] ;
      }
   }

   public void scanEnd1LU548( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1LU548( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LU548( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LU548( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LU548( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LU548( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LU548( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LU548( )
   {
      edtDibObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtDibObsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsTxt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1LU548( )
   {
   }

   public void send_integrity_lvl_hashes1LU545( )
   {
   }

   public void subsflControlProps_55548( )
   {
      edtavnRcdDeleted_548_Internalname = "vNRCDDELETED_548_"+sGXsfl_55_idx ;
      edtDibObsLin_Internalname = "DIBOBSLIN_"+sGXsfl_55_idx ;
      edtDibObsTxt_Internalname = "DIBOBSTXT_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55548( )
   {
      edtavnRcdDeleted_548_Internalname = "vNRCDDELETED_548_"+sGXsfl_55_fel_idx ;
      edtDibObsLin_Internalname = "DIBOBSLIN_"+sGXsfl_55_fel_idx ;
      edtDibObsTxt_Internalname = "DIBOBSTXT_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1LU548( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55548( ) ;
      sendRow1LU548( ) ;
   }

   public void sendRow1LU548( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_548_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_548_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_548_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_548), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_548), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_548_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_548_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_548_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2521DibObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_548_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibObsTxt_Internalname,GXutil.rtrim( A2522DibObsTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibObsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibObsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LU548( ) ;
      GXCCtl = "Z2521DibObsLin_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2521DibObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2522DibObsTxt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2522DibObsTxt));
      GXCCtl = "nRcdDeleted_548_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_548_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_548_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_548_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_548_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBOBSLIN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBOBSTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LU548( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55548( ) ;
      edtavnRcdDeleted_548_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_548_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBOBSLIN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBOBSTXT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_548");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_548_Internalname ;
         wbErr = true ;
         nRcdDeleted_548 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_548 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DIBOBSLIN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibObsLin_Internalname ;
         wbErr = true ;
         A2521DibObsLin = (byte)(0) ;
      }
      else
      {
         A2521DibObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDibObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2522DibObsTxt = httpContext.cgiGet( edtDibObsTxt_Internalname) ;
      n2522DibObsTxt = false ;
      GXCCtl = "Z2521DibObsLin_" + sGXsfl_55_idx ;
      Z2521DibObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2522DibObsTxt_" + sGXsfl_55_idx ;
      Z2522DibObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_548_" + sGXsfl_55_idx ;
      nRcdDeleted_548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_548_" + sGXsfl_55_idx ;
      nRcdExists_548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_548_" + sGXsfl_55_idx ;
      nIsMod_548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDibObsLin_Enabled = edtDibObsLin_Enabled ;
   }

   public void confirmValues1LU0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55548( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55548( ) ;
         httpContext.changePostValue( "Z2521DibObsLin_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2521DibObsLin_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2521DibObsLin_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2522DibObsTxt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2522DibObsTxt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2522DibObsTxt_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn18", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","DibCli","CliCod","DibInt","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn18");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn18:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2523DibObsUL", GXutil.ltrim( localUtil.ntoc( Z2523DibObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2523DibObsUL", GXutil.ltrim( localUtil.ntoc( O2523DibObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV38Pgmname));
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
      return formatLink("app.ttrn18", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","DibCli","CliCod","DibInt","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn18" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Dibujos OBSERVACIONES", "") ;
   }

   public void initializeNonKey1LU545( )
   {
      A2523DibObsUL = (byte)(0) ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      O2523DibObsUL = A2523DibObsUL ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
      Z2523DibObsUL = (byte)(0) ;
   }

   public void initAll1LU545( )
   {
      initializeNonKey1LU545( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LU548( )
   {
      A2522DibObsTxt = "" ;
      n2522DibObsTxt = false ;
      Z2522DibObsTxt = "" ;
   }

   public void initAll1LU548( )
   {
      A2521DibObsLin = (byte)(0) ;
      initializeNonKey1LU548( ) ;
   }

   public void standaloneModalInsert1LU548( )
   {
      A2523DibObsUL = i2523DibObsUL ;
      n2523DibObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2523DibObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2523DibObsUL), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241510198", true, true);
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
      httpContext.AddJavascriptSource("ttrn18.js", "?20268241510198", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties548( )
   {
      edtDibObsLin_Enabled = defedtDibObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibObsLin_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_548, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_548_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2521DibObsLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2522DibObsTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibInt_Internalname = "DIBINT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDibObsUL_Internalname = "DIBOBSUL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_548_Internalname = "vNRCDDELETED_548" ;
      edtDibObsLin_Internalname = "DIBOBSLIN" ;
      edtDibObsTxt_Internalname = "DIBOBSTXT" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Dibujos OBSERVACIONES", "") );
      edtDibObsTxt_Jsonclick = "" ;
      edtDibObsLin_Jsonclick = "" ;
      edtavnRcdDeleted_548_Jsonclick = "" ;
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
      edtDibObsTxt_Enabled = 1 ;
      edtDibObsLin_Enabled = 1 ;
      edtavnRcdDeleted_548_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDibObsUL_Jsonclick = "" ;
      edtDibObsUL_Backcolor = (int)(0xFFFFFF) ;
      edtDibObsUL_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 0 ;
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
      subsflControlProps_55548( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LU548( ) ;
         standaloneModal1LU548( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LU548( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55548( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_DIBOBSUL","{handler:'valid_Dibobsul',iparms:[]");
      setEventMetadata("VALID_DIBOBSUL",",oparms:[]}");
      setEventMetadata("VALID_DIBOBSLIN","{handler:'valid_Dibobslin',iparms:[]");
      setEventMetadata("VALID_DIBOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dibobstxt',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA1013DibCli = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z1013DibCli = "" ;
      Z2522DibObsTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode548 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV38Pgmname = "" ;
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
      A2522DibObsTxt = "" ;
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
      T01LU6_A407EmprNom = new String[] {""} ;
      T01LU6_n407EmprNom = new boolean[] {false} ;
      T01LU7_A279CliNom = new String[] {""} ;
      T01LU8_A1013DibCli = new String[] {""} ;
      T01LU8_n1013DibCli = new boolean[] {false} ;
      T01LU8_A1014DibInt = new int[1] ;
      T01LU8_n1014DibInt = new boolean[] {false} ;
      T01LU8_A279CliNom = new String[] {""} ;
      T01LU8_A2523DibObsUL = new byte[1] ;
      T01LU8_n2523DibObsUL = new boolean[] {false} ;
      T01LU8_A407EmprNom = new String[] {""} ;
      T01LU8_n407EmprNom = new boolean[] {false} ;
      T01LU8_A396EmprCod = new String[] {""} ;
      T01LU8_A252CliCod = new int[1] ;
      T01LU8_n252CliCod = new boolean[] {false} ;
      T01LU9_A396EmprCod = new String[] {""} ;
      T01LU9_A1013DibCli = new String[] {""} ;
      T01LU9_n1013DibCli = new boolean[] {false} ;
      T01LU9_A252CliCod = new int[1] ;
      T01LU9_n252CliCod = new boolean[] {false} ;
      T01LU9_A1014DibInt = new int[1] ;
      T01LU9_n1014DibInt = new boolean[] {false} ;
      T01LU5_A1013DibCli = new String[] {""} ;
      T01LU5_n1013DibCli = new boolean[] {false} ;
      T01LU5_A1014DibInt = new int[1] ;
      T01LU5_n1014DibInt = new boolean[] {false} ;
      T01LU5_A2523DibObsUL = new byte[1] ;
      T01LU5_n2523DibObsUL = new boolean[] {false} ;
      T01LU5_A396EmprCod = new String[] {""} ;
      T01LU5_A252CliCod = new int[1] ;
      T01LU5_n252CliCod = new boolean[] {false} ;
      T01LU10_A396EmprCod = new String[] {""} ;
      T01LU10_A1013DibCli = new String[] {""} ;
      T01LU10_n1013DibCli = new boolean[] {false} ;
      T01LU10_A252CliCod = new int[1] ;
      T01LU10_n252CliCod = new boolean[] {false} ;
      T01LU10_A1014DibInt = new int[1] ;
      T01LU10_n1014DibInt = new boolean[] {false} ;
      T01LU11_A396EmprCod = new String[] {""} ;
      T01LU11_A1013DibCli = new String[] {""} ;
      T01LU11_n1013DibCli = new boolean[] {false} ;
      T01LU11_A252CliCod = new int[1] ;
      T01LU11_n252CliCod = new boolean[] {false} ;
      T01LU11_A1014DibInt = new int[1] ;
      T01LU11_n1014DibInt = new boolean[] {false} ;
      T01LU4_A1013DibCli = new String[] {""} ;
      T01LU4_n1013DibCli = new boolean[] {false} ;
      T01LU4_A1014DibInt = new int[1] ;
      T01LU4_n1014DibInt = new boolean[] {false} ;
      T01LU4_A2523DibObsUL = new byte[1] ;
      T01LU4_n2523DibObsUL = new boolean[] {false} ;
      T01LU4_A396EmprCod = new String[] {""} ;
      T01LU4_A252CliCod = new int[1] ;
      T01LU4_n252CliCod = new boolean[] {false} ;
      T01LU15_A396EmprCod = new String[] {""} ;
      T01LU15_A11604PArtId = new int[1] ;
      T01LU16_A396EmprCod = new String[] {""} ;
      T01LU16_A1013DibCli = new String[] {""} ;
      T01LU16_n1013DibCli = new boolean[] {false} ;
      T01LU16_A1014DibInt = new int[1] ;
      T01LU16_n1014DibInt = new boolean[] {false} ;
      T01LU16_A252CliCod = new int[1] ;
      T01LU16_n252CliCod = new boolean[] {false} ;
      T01LU16_A7502AMDibCli = new String[] {""} ;
      T01LU16_A7503AMDibInt = new int[1] ;
      T01LU16_A7504AMCliCod = new int[1] ;
      T01LU17_A396EmprCod = new String[] {""} ;
      T01LU17_A2600GrrNumOrd = new int[1] ;
      T01LU18_A396EmprCod = new String[] {""} ;
      T01LU18_A252CliCod = new int[1] ;
      T01LU18_n252CliCod = new boolean[] {false} ;
      T01LU18_A2141SerEst = new String[] {""} ;
      T01LU18_A1013DibCli = new String[] {""} ;
      T01LU18_n1013DibCli = new boolean[] {false} ;
      T01LU18_A1014DibInt = new int[1] ;
      T01LU18_n1014DibInt = new boolean[] {false} ;
      T01LU18_A2074ColCom = new String[] {""} ;
      T01LU18_A2078ColFon = new String[] {""} ;
      T01LU19_A396EmprCod = new String[] {""} ;
      T01LU19_A1013DibCli = new String[] {""} ;
      T01LU19_n1013DibCli = new boolean[] {false} ;
      T01LU19_A252CliCod = new int[1] ;
      T01LU19_n252CliCod = new boolean[] {false} ;
      T01LU19_A1014DibInt = new int[1] ;
      T01LU19_n1014DibInt = new boolean[] {false} ;
      T01LU19_A1029DibLin = new short[1] ;
      T01LU20_A396EmprCod = new String[] {""} ;
      T01LU20_A1013DibCli = new String[] {""} ;
      T01LU20_n1013DibCli = new boolean[] {false} ;
      T01LU20_A252CliCod = new int[1] ;
      T01LU20_n252CliCod = new boolean[] {false} ;
      T01LU20_A1014DibInt = new int[1] ;
      T01LU20_n1014DibInt = new boolean[] {false} ;
      T01LU20_A1807DibLinCil = new short[1] ;
      T01LU21_A396EmprCod = new String[] {""} ;
      T01LU21_A1013DibCli = new String[] {""} ;
      T01LU21_n1013DibCli = new boolean[] {false} ;
      T01LU21_A252CliCod = new int[1] ;
      T01LU21_n252CliCod = new boolean[] {false} ;
      T01LU21_A1014DibInt = new int[1] ;
      T01LU21_n1014DibInt = new boolean[] {false} ;
      T01LU21_A425EstAny = new short[1] ;
      T01LU21_A3913DibSerFac = new String[] {""} ;
      T01LU22_A396EmprCod = new String[] {""} ;
      T01LU22_A361DisCod = new int[1] ;
      T01LU24_A396EmprCod = new String[] {""} ;
      T01LU24_A1013DibCli = new String[] {""} ;
      T01LU24_n1013DibCli = new boolean[] {false} ;
      T01LU24_A252CliCod = new int[1] ;
      T01LU24_n252CliCod = new boolean[] {false} ;
      T01LU24_A1014DibInt = new int[1] ;
      T01LU24_n1014DibInt = new boolean[] {false} ;
      T01LU25_A1013DibCli = new String[] {""} ;
      T01LU25_n1013DibCli = new boolean[] {false} ;
      T01LU25_A252CliCod = new int[1] ;
      T01LU25_n252CliCod = new boolean[] {false} ;
      T01LU25_A1014DibInt = new int[1] ;
      T01LU25_n1014DibInt = new boolean[] {false} ;
      T01LU25_A2521DibObsLin = new byte[1] ;
      T01LU25_A2522DibObsTxt = new String[] {""} ;
      T01LU25_n2522DibObsTxt = new boolean[] {false} ;
      T01LU25_A396EmprCod = new String[] {""} ;
      T01LU26_A396EmprCod = new String[] {""} ;
      T01LU26_A1013DibCli = new String[] {""} ;
      T01LU26_n1013DibCli = new boolean[] {false} ;
      T01LU26_A252CliCod = new int[1] ;
      T01LU26_n252CliCod = new boolean[] {false} ;
      T01LU26_A1014DibInt = new int[1] ;
      T01LU26_n1014DibInt = new boolean[] {false} ;
      T01LU26_A2521DibObsLin = new byte[1] ;
      T01LU3_A1013DibCli = new String[] {""} ;
      T01LU3_n1013DibCli = new boolean[] {false} ;
      T01LU3_A252CliCod = new int[1] ;
      T01LU3_n252CliCod = new boolean[] {false} ;
      T01LU3_A1014DibInt = new int[1] ;
      T01LU3_n1014DibInt = new boolean[] {false} ;
      T01LU3_A2521DibObsLin = new byte[1] ;
      T01LU3_A2522DibObsTxt = new String[] {""} ;
      T01LU3_n2522DibObsTxt = new boolean[] {false} ;
      T01LU3_A396EmprCod = new String[] {""} ;
      T01LU2_A1013DibCli = new String[] {""} ;
      T01LU2_n1013DibCli = new boolean[] {false} ;
      T01LU2_A252CliCod = new int[1] ;
      T01LU2_n252CliCod = new boolean[] {false} ;
      T01LU2_A1014DibInt = new int[1] ;
      T01LU2_n1014DibInt = new boolean[] {false} ;
      T01LU2_A2521DibObsLin = new byte[1] ;
      T01LU2_A2522DibObsTxt = new String[] {""} ;
      T01LU2_n2522DibObsTxt = new boolean[] {false} ;
      T01LU2_A396EmprCod = new String[] {""} ;
      T01LU30_A396EmprCod = new String[] {""} ;
      T01LU30_A1013DibCli = new String[] {""} ;
      T01LU30_n1013DibCli = new boolean[] {false} ;
      T01LU30_A252CliCod = new int[1] ;
      T01LU30_n252CliCod = new boolean[] {false} ;
      T01LU30_A1014DibInt = new int[1] ;
      T01LU30_n1014DibInt = new boolean[] {false} ;
      T01LU30_A2521DibObsLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn18__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn18__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn18__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn18__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn18__default(),
         new Object[] {
             new Object[] {
            T01LU2_A1013DibCli, T01LU2_A252CliCod, T01LU2_A1014DibInt, T01LU2_A2521DibObsLin, T01LU2_A2522DibObsTxt, T01LU2_n2522DibObsTxt, T01LU2_A396EmprCod
            }
            , new Object[] {
            T01LU3_A1013DibCli, T01LU3_A252CliCod, T01LU3_A1014DibInt, T01LU3_A2521DibObsLin, T01LU3_A2522DibObsTxt, T01LU3_n2522DibObsTxt, T01LU3_A396EmprCod
            }
            , new Object[] {
            T01LU4_A1013DibCli, T01LU4_A1014DibInt, T01LU4_A2523DibObsUL, T01LU4_n2523DibObsUL, T01LU4_A396EmprCod, T01LU4_A252CliCod
            }
            , new Object[] {
            T01LU5_A1013DibCli, T01LU5_A1014DibInt, T01LU5_A2523DibObsUL, T01LU5_n2523DibObsUL, T01LU5_A396EmprCod, T01LU5_A252CliCod
            }
            , new Object[] {
            T01LU6_A407EmprNom, T01LU6_n407EmprNom
            }
            , new Object[] {
            T01LU7_A279CliNom
            }
            , new Object[] {
            T01LU8_A1013DibCli, T01LU8_A1014DibInt, T01LU8_A279CliNom, T01LU8_A2523DibObsUL, T01LU8_n2523DibObsUL, T01LU8_A407EmprNom, T01LU8_n407EmprNom, T01LU8_A396EmprCod, T01LU8_A252CliCod
            }
            , new Object[] {
            T01LU9_A396EmprCod, T01LU9_A1013DibCli, T01LU9_A252CliCod, T01LU9_A1014DibInt
            }
            , new Object[] {
            T01LU10_A396EmprCod, T01LU10_A1013DibCli, T01LU10_A252CliCod, T01LU10_A1014DibInt
            }
            , new Object[] {
            T01LU11_A396EmprCod, T01LU11_A1013DibCli, T01LU11_A252CliCod, T01LU11_A1014DibInt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LU15_A396EmprCod, T01LU15_A11604PArtId
            }
            , new Object[] {
            T01LU16_A396EmprCod, T01LU16_A1013DibCli, T01LU16_A1014DibInt, T01LU16_A252CliCod, T01LU16_A7502AMDibCli, T01LU16_A7503AMDibInt, T01LU16_A7504AMCliCod
            }
            , new Object[] {
            T01LU17_A396EmprCod, T01LU17_A2600GrrNumOrd
            }
            , new Object[] {
            T01LU18_A396EmprCod, T01LU18_A252CliCod, T01LU18_A2141SerEst, T01LU18_A1013DibCli, T01LU18_A1014DibInt, T01LU18_A2074ColCom, T01LU18_A2078ColFon
            }
            , new Object[] {
            T01LU19_A396EmprCod, T01LU19_A1013DibCli, T01LU19_A252CliCod, T01LU19_A1014DibInt, T01LU19_A1029DibLin
            }
            , new Object[] {
            T01LU20_A396EmprCod, T01LU20_A1013DibCli, T01LU20_A252CliCod, T01LU20_A1014DibInt, T01LU20_A1807DibLinCil
            }
            , new Object[] {
            T01LU21_A396EmprCod, T01LU21_A1013DibCli, T01LU21_A252CliCod, T01LU21_A1014DibInt, T01LU21_A425EstAny, T01LU21_A3913DibSerFac
            }
            , new Object[] {
            T01LU22_A396EmprCod, T01LU22_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01LU24_A396EmprCod, T01LU24_A1013DibCli, T01LU24_A252CliCod, T01LU24_A1014DibInt
            }
            , new Object[] {
            T01LU25_A1013DibCli, T01LU25_A252CliCod, T01LU25_A1014DibInt, T01LU25_A2521DibObsLin, T01LU25_A2522DibObsTxt, T01LU25_n2522DibObsTxt, T01LU25_A396EmprCod
            }
            , new Object[] {
            T01LU26_A396EmprCod, T01LU26_A1013DibCli, T01LU26_A252CliCod, T01LU26_A1014DibInt, T01LU26_A2521DibObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LU30_A396EmprCod, T01LU30_A1013DibCli, T01LU30_A252CliCod, T01LU30_A1014DibInt, T01LU30_A2521DibObsLin
            }
         }
      );
      Z1014DibInt = 0 ;
      n1014DibInt = false ;
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z1013DibCli = "" ;
      n1013DibCli = false ;
      A1013DibCli = "" ;
      n1013DibCli = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV38Pgmname = "TTrn18" ;
   }

   private byte Z2523DibObsUL ;
   private byte O2523DibObsUL ;
   private byte Z2521DibObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A2523DibObsUL ;
   private byte Gx_BScreen ;
   private byte B2523DibObsUL ;
   private byte s2523DibObsUL ;
   private byte A2521DibObsLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2523DibObsUL ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_548 ;
   private short nRcdExists_548 ;
   private short nIsMod_548 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount548 ;
   private short RcdFound548 ;
   private short nBlankRcdUsr548 ;
   private short RcdFound545 ;
   private short nIsDirty_545 ;
   private short nIsDirty_548 ;
   private int wcpOA252CliCod ;
   private int wcpOA1014DibInt ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtDibInt_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDibObsUL_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_548_Enabled ;
   private int edtDibObsLin_Enabled ;
   private int edtDibObsTxt_Enabled ;
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
   private int defedtDibObsLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDibObsUL_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA1013DibCli ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z1013DibCli ;
   private String Z2522DibObsTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDibObsUL_Internalname ;
   private String edtDibObsUL_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode548 ;
   private String edtavnRcdDeleted_548_Internalname ;
   private String edtDibObsLin_Internalname ;
   private String edtDibObsTxt_Internalname ;
   private String GX_FocusControl ;
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
   private String AV38Pgmname ;
   private String hsh ;
   private String sMode545 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2522DibObsTxt ;
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
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_548_Jsonclick ;
   private String edtDibObsLin_Jsonclick ;
   private String edtDibObsTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1013DibCli ;
   private boolean n252CliCod ;
   private boolean n1014DibInt ;
   private boolean wbErr ;
   private boolean n2523DibObsUL ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n2522DibObsTxt ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01LU6_A407EmprNom ;
   private boolean[] T01LU6_n407EmprNom ;
   private String[] T01LU7_A279CliNom ;
   private String[] T01LU8_A1013DibCli ;
   private boolean[] T01LU8_n1013DibCli ;
   private int[] T01LU8_A1014DibInt ;
   private boolean[] T01LU8_n1014DibInt ;
   private String[] T01LU8_A279CliNom ;
   private byte[] T01LU8_A2523DibObsUL ;
   private boolean[] T01LU8_n2523DibObsUL ;
   private String[] T01LU8_A407EmprNom ;
   private boolean[] T01LU8_n407EmprNom ;
   private String[] T01LU8_A396EmprCod ;
   private int[] T01LU8_A252CliCod ;
   private boolean[] T01LU8_n252CliCod ;
   private String[] T01LU9_A396EmprCod ;
   private String[] T01LU9_A1013DibCli ;
   private boolean[] T01LU9_n1013DibCli ;
   private int[] T01LU9_A252CliCod ;
   private boolean[] T01LU9_n252CliCod ;
   private int[] T01LU9_A1014DibInt ;
   private boolean[] T01LU9_n1014DibInt ;
   private String[] T01LU5_A1013DibCli ;
   private boolean[] T01LU5_n1013DibCli ;
   private int[] T01LU5_A1014DibInt ;
   private boolean[] T01LU5_n1014DibInt ;
   private byte[] T01LU5_A2523DibObsUL ;
   private boolean[] T01LU5_n2523DibObsUL ;
   private String[] T01LU5_A396EmprCod ;
   private int[] T01LU5_A252CliCod ;
   private boolean[] T01LU5_n252CliCod ;
   private String[] T01LU10_A396EmprCod ;
   private String[] T01LU10_A1013DibCli ;
   private boolean[] T01LU10_n1013DibCli ;
   private int[] T01LU10_A252CliCod ;
   private boolean[] T01LU10_n252CliCod ;
   private int[] T01LU10_A1014DibInt ;
   private boolean[] T01LU10_n1014DibInt ;
   private String[] T01LU11_A396EmprCod ;
   private String[] T01LU11_A1013DibCli ;
   private boolean[] T01LU11_n1013DibCli ;
   private int[] T01LU11_A252CliCod ;
   private boolean[] T01LU11_n252CliCod ;
   private int[] T01LU11_A1014DibInt ;
   private boolean[] T01LU11_n1014DibInt ;
   private String[] T01LU4_A1013DibCli ;
   private boolean[] T01LU4_n1013DibCli ;
   private int[] T01LU4_A1014DibInt ;
   private boolean[] T01LU4_n1014DibInt ;
   private byte[] T01LU4_A2523DibObsUL ;
   private boolean[] T01LU4_n2523DibObsUL ;
   private String[] T01LU4_A396EmprCod ;
   private int[] T01LU4_A252CliCod ;
   private boolean[] T01LU4_n252CliCod ;
   private String[] T01LU15_A396EmprCod ;
   private int[] T01LU15_A11604PArtId ;
   private String[] T01LU16_A396EmprCod ;
   private String[] T01LU16_A1013DibCli ;
   private boolean[] T01LU16_n1013DibCli ;
   private int[] T01LU16_A1014DibInt ;
   private boolean[] T01LU16_n1014DibInt ;
   private int[] T01LU16_A252CliCod ;
   private boolean[] T01LU16_n252CliCod ;
   private String[] T01LU16_A7502AMDibCli ;
   private int[] T01LU16_A7503AMDibInt ;
   private int[] T01LU16_A7504AMCliCod ;
   private String[] T01LU17_A396EmprCod ;
   private int[] T01LU17_A2600GrrNumOrd ;
   private String[] T01LU18_A396EmprCod ;
   private int[] T01LU18_A252CliCod ;
   private boolean[] T01LU18_n252CliCod ;
   private String[] T01LU18_A2141SerEst ;
   private String[] T01LU18_A1013DibCli ;
   private boolean[] T01LU18_n1013DibCli ;
   private int[] T01LU18_A1014DibInt ;
   private boolean[] T01LU18_n1014DibInt ;
   private String[] T01LU18_A2074ColCom ;
   private String[] T01LU18_A2078ColFon ;
   private String[] T01LU19_A396EmprCod ;
   private String[] T01LU19_A1013DibCli ;
   private boolean[] T01LU19_n1013DibCli ;
   private int[] T01LU19_A252CliCod ;
   private boolean[] T01LU19_n252CliCod ;
   private int[] T01LU19_A1014DibInt ;
   private boolean[] T01LU19_n1014DibInt ;
   private short[] T01LU19_A1029DibLin ;
   private String[] T01LU20_A396EmprCod ;
   private String[] T01LU20_A1013DibCli ;
   private boolean[] T01LU20_n1013DibCli ;
   private int[] T01LU20_A252CliCod ;
   private boolean[] T01LU20_n252CliCod ;
   private int[] T01LU20_A1014DibInt ;
   private boolean[] T01LU20_n1014DibInt ;
   private short[] T01LU20_A1807DibLinCil ;
   private String[] T01LU21_A396EmprCod ;
   private String[] T01LU21_A1013DibCli ;
   private boolean[] T01LU21_n1013DibCli ;
   private int[] T01LU21_A252CliCod ;
   private boolean[] T01LU21_n252CliCod ;
   private int[] T01LU21_A1014DibInt ;
   private boolean[] T01LU21_n1014DibInt ;
   private short[] T01LU21_A425EstAny ;
   private String[] T01LU21_A3913DibSerFac ;
   private String[] T01LU22_A396EmprCod ;
   private int[] T01LU22_A361DisCod ;
   private String[] T01LU24_A396EmprCod ;
   private String[] T01LU24_A1013DibCli ;
   private boolean[] T01LU24_n1013DibCli ;
   private int[] T01LU24_A252CliCod ;
   private boolean[] T01LU24_n252CliCod ;
   private int[] T01LU24_A1014DibInt ;
   private boolean[] T01LU24_n1014DibInt ;
   private String[] T01LU25_A1013DibCli ;
   private boolean[] T01LU25_n1013DibCli ;
   private int[] T01LU25_A252CliCod ;
   private boolean[] T01LU25_n252CliCod ;
   private int[] T01LU25_A1014DibInt ;
   private boolean[] T01LU25_n1014DibInt ;
   private byte[] T01LU25_A2521DibObsLin ;
   private String[] T01LU25_A2522DibObsTxt ;
   private boolean[] T01LU25_n2522DibObsTxt ;
   private String[] T01LU25_A396EmprCod ;
   private String[] T01LU26_A396EmprCod ;
   private String[] T01LU26_A1013DibCli ;
   private boolean[] T01LU26_n1013DibCli ;
   private int[] T01LU26_A252CliCod ;
   private boolean[] T01LU26_n252CliCod ;
   private int[] T01LU26_A1014DibInt ;
   private boolean[] T01LU26_n1014DibInt ;
   private byte[] T01LU26_A2521DibObsLin ;
   private String[] T01LU3_A1013DibCli ;
   private boolean[] T01LU3_n1013DibCli ;
   private int[] T01LU3_A252CliCod ;
   private boolean[] T01LU3_n252CliCod ;
   private int[] T01LU3_A1014DibInt ;
   private boolean[] T01LU3_n1014DibInt ;
   private byte[] T01LU3_A2521DibObsLin ;
   private String[] T01LU3_A2522DibObsTxt ;
   private boolean[] T01LU3_n2522DibObsTxt ;
   private String[] T01LU3_A396EmprCod ;
   private String[] T01LU2_A1013DibCli ;
   private boolean[] T01LU2_n1013DibCli ;
   private int[] T01LU2_A252CliCod ;
   private boolean[] T01LU2_n252CliCod ;
   private int[] T01LU2_A1014DibInt ;
   private boolean[] T01LU2_n1014DibInt ;
   private byte[] T01LU2_A2521DibObsLin ;
   private String[] T01LU2_A2522DibObsTxt ;
   private boolean[] T01LU2_n2522DibObsTxt ;
   private String[] T01LU2_A396EmprCod ;
   private String[] T01LU30_A396EmprCod ;
   private String[] T01LU30_A1013DibCli ;
   private boolean[] T01LU30_n1013DibCli ;
   private int[] T01LU30_A252CliCod ;
   private boolean[] T01LU30_n252CliCod ;
   private int[] T01LU30_A1014DibInt ;
   private boolean[] T01LU30_n1014DibInt ;
   private byte[] T01LU30_A2521DibObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn18__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn18__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn18__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn18__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn18__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LU2", "SELECT DibCli, CliCod, DibInt, DibObsLin, DibObsTxt, EmprCod FROM TXPDIBOBS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibObsLin = ?  FOR UPDATE OF DibObsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LU3", "SELECT DibCli, CliCod, DibInt, DibObsLin, DibObsTxt, EmprCod FROM TXPDIBOBS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LU4", "SELECT DibCli, DibInt, DibObsUL, EmprCod, CliCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibObsUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU5", "SELECT DibCli, DibInt, DibObsUL, EmprCod, CliCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU8", "SELECT /*+ FIRST_ROWS(1) */ TM1.DibCli, TM1.DibInt, T3.CliNom, TM1.DibObsUL, T2.EmprNom, TM1.EmprCod, TM1.CliCod FROM ((TXPCDIBUJ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.DibCli = ? and TM1.CliCod = ? and TM1.DibInt = ? ORDER BY TM1.EmprCod, TM1.DibCli, TM1.CliCod, TM1.DibInt ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod DESC, DibCli DESC, CliCod DESC, DibInt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LU12", "INSERT INTO TXPCDIBUJ(DibCli, DibInt, DibObsUL, EmprCod, CliCod, GrabCod, DibFecUlt, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibMolCil, DibMed, DibPosVor, DibLevMaq, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil, DibMolCi2, DibTipRas, DibPosRas, DibRap, DibUltLin, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibCob, DibDsc, DibBmp, DibFecBor, DibGra, DibSep, DibUltUti, DibAct, DibSentido) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPCDIBUJ")
         ,new UpdateCursor("T01LU13", "UPDATE TXPCDIBUJ SET DibObsUL=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new UpdateCursor("T01LU14", "DELETE FROM TXPCDIBUJ  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new ForEachCursor("T01LU15", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU16", "SELECT * FROM (SELECT EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod FROM TXPARTMZA WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU17", "SELECT * FROM (SELECT EmprCod, GrrNumOrd FROM TXPCGRREP WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU18", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU19", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibLin FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU20", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU21", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU22", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LU23", "UPDATE TXPCDIBUJ SET DibObsUL=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new ForEachCursor("T01LU24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LU25", "SELECT DibCli, CliCod, DibInt, DibObsLin, DibObsTxt, EmprCod FROM TXPDIBOBS WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibObsLin = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LU26", "SELECT EmprCod, DibCli, CliCod, DibInt, DibObsLin FROM TXPDIBOBS WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LU27", "INSERT INTO TXPDIBOBS(DibCli, CliCod, DibInt, DibObsLin, DibObsTxt, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDIBOBS")
         ,new UpdateCursor("T01LU28", "UPDATE TXPDIBOBS SET DibObsTxt=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibObsLin = ?", GX_NOMASK, "TXPDIBOBS")
         ,new UpdateCursor("T01LU29", "DELETE FROM TXPDIBOBS  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibObsLin = ?", GX_NOMASK, "TXPDIBOBS")
         ,new ForEachCursor("T01LU30", "SELECT EmprCod, DibCli, CliCod, DibInt, DibObsLin FROM TXPDIBOBS WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 20 :
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setByte(5, ((Number) parms[7]).byteValue());
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
               stmt.setByte(5, ((Number) parms[7]).byteValue());
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
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               return;
            case 11 :
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
               return;
            case 22 :
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
               stmt.setByte(5, ((Number) parms[7]).byteValue());
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
               stmt.setByte(5, ((Number) parms[7]).byteValue());
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
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 60);
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
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
               stmt.setByte(6, ((Number) parms[9]).byteValue());
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
               stmt.setByte(5, ((Number) parms[7]).byteValue());
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

