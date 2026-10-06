package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tminacs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"P_FORDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5452P_ForCod = httpContext.GetPar( "P_ForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asap_fordsc1BP801( A396EmprCod, A5452P_ForCod) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5452P_ForCod = httpContext.GetPar( "P_ForCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Minimos ACS", ""), (short)(0)) ;
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
      A11324P_ultmn = (short)(GXutil.lval( httpContext.GetPar( "P_ultmn"))) ;
      n11324P_ultmn = false ;
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

   public tminacs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tminacs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tminacs_impl.class ));
   }

   public tminacs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMinAcs.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso Formula", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtP_ForCod_Internalname, GXutil.rtrim( A5452P_ForCod), GXutil.rtrim( localUtil.format( A5452P_ForCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtP_ForCod_Jsonclick, 0, "", "", "", "", "", 1, edtP_ForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Proceso Formula", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtP_ForDsc_Internalname, GXutil.rtrim( A5453P_ForDsc), GXutil.rtrim( localUtil.format( A5453P_ForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtP_ForDsc_Jsonclick, 0, "", "", "", "", "", 1, edtP_ForDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea Minimos", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMinAcs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtP_ultmn_Internalname, GXutil.ltrim( localUtil.ntoc( A11324P_ultmn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtP_ultmn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11324P_ultmn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11324P_ultmn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtP_ultmn_Jsonclick, 0, "", "", "", "", "", 1, edtP_ultmn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMinAcs.htm");
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
         nBlankRcdCount1512 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1512 = (short)(1) ;
            scanStart1BP1512( ) ;
            while ( RcdFound1512 != 0 )
            {
               init_level_properties1512( ) ;
               getByPrimaryKey1BP1512( ) ;
               addRow1BP1512( ) ;
               scanNext1BP1512( ) ;
            }
            scanEnd1BP1512( ) ;
            nBlankRcdCount1512 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11324P_ultmn = A11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         standaloneNotModal1BP1512( ) ;
         standaloneModal1BP1512( ) ;
         sMode1512 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1BP1512( ) ;
            edtavnRcdDeleted_1512_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1512_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1512_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1512_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtP_linMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_LINMN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtP_linMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_linMn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtP_Vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_VI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtP_Vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_Vi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtP_Vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_VF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtP_Vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_Vf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtP_inc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_INC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtP_inc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_inc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1512 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BP1512( ) ;
            }
            sendRow1BP1512( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11324P_ultmn = B11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1512 = (short)(5) ;
         nRcdExists_1512 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BP1512( ) ;
            while ( RcdFound1512 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551512( ) ;
               init_level_properties1512( ) ;
               standaloneNotModal1BP1512( ) ;
               getByPrimaryKey1BP1512( ) ;
               standaloneModal1BP1512( ) ;
               addRow1BP1512( ) ;
               scanNext1BP1512( ) ;
            }
            scanEnd1BP1512( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1512 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551512( ) ;
      initAll1BP1512( ) ;
      init_level_properties1512( ) ;
      B11324P_ultmn = A11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      nRcdExists_1512 = (short)(0) ;
      nIsMod_1512 = (short)(0) ;
      nRcdDeleted_1512 = (short)(0) ;
      nBlankRcdCount1512 = (short)(nBlankRcdUsr1512+nBlankRcdCount1512) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1512 > 0 )
      {
         standaloneNotModal1BP1512( ) ;
         standaloneModal1BP1512( ) ;
         addRow1BP1512( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtP_linMn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1512 = (short)(nBlankRcdCount1512-1) ;
      }
      Gx_mode = sMode1512 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11324P_ultmn = B11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMinAcs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMinAcs.htm");
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
      e111BP2 ();
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
            Z5452P_ForCod = httpContext.cgiGet( "Z5452P_ForCod") ;
            Z11324P_ultmn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11324P_ultmn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11324P_ultmn = (short)(localUtil.ctol( httpContext.cgiGet( "O11324P_ultmn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A5452P_ForCod = httpContext.cgiGet( edtP_ForCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
            A5453P_ForDsc = httpContext.cgiGet( edtP_ForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5453P_ForDsc", A5453P_ForDsc);
            A11324P_ultmn = (short)(localUtil.ctol( httpContext.cgiGet( edtP_ultmn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11324P_ultmn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
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
               A5452P_ForCod = httpContext.GetPar( "P_ForCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e111BP2 ();
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
            initAll1BP801( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1512_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1512_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1BP801( ) ;
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

   public void confirm_1BP0( )
   {
      beforeValidate1BP801( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BP801( ) ;
         }
         else
         {
            checkExtendedTable1BP801( ) ;
            if ( AnyError == 0 )
            {
               zm1BP801( 8) ;
               zm1BP801( 9) ;
            }
            closeExtendedTableCursors1BP801( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode801 = Gx_mode ;
         confirm_1BP1512( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode801 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BP0( ) ;
      }
   }

   public void confirm_1BP1512( )
   {
      s11324P_ultmn = O11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1BP1512( ) ;
         if ( ( nRcdExists_1512 != 0 ) || ( nIsMod_1512 != 0 ) )
         {
            getKey1BP1512( ) ;
            if ( ( nRcdExists_1512 == 0 ) && ( nRcdDeleted_1512 == 0 ) )
            {
               if ( RcdFound1512 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BP1512( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BP1512( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BP1512( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11324P_ultmn = A11324P_ultmn ;
                     n11324P_ultmn = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "P_LINMN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtP_linMn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1512 != 0 )
               {
                  if ( nRcdDeleted_1512 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BP1512( ) ;
                     load1BP1512( ) ;
                     beforeValidate1BP1512( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BP1512( ) ;
                        O11324P_ultmn = A11324P_ultmn ;
                        n11324P_ultmn = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1512 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BP1512( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BP1512( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BP1512( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11324P_ultmn = A11324P_ultmn ;
                           n11324P_ultmn = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1512 == 0 )
                  {
                     GXCCtl = "P_LINMN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtP_linMn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1512_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_linMn_Internalname, GXutil.ltrim( localUtil.ntoc( A11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_Vi_Internalname, GXutil.ltrim( localUtil.ntoc( A11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_Vf_Internalname, GXutil.ltrim( localUtil.ntoc( A11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_inc_Internalname, GXutil.ltrim( localUtil.ntoc( A11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11325P_linMn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11326P_Vi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11327P_Vf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11328P_inc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1512 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1512_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1512_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_LINMN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_linMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_VI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_VF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_INC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_inc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11324P_ultmn = s11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BP0( )
   {
   }

   public void e111BP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "Acs", ""), (byte)(99), GXv_char2) ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "Cliente", ""), (byte)(99), GXv_char2) ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tminacs_impl.this.A396EmprCod = GXv_char2[0] ;
      tminacs_impl.this.AV11EmprNom = GXv_char3[0] ;
      tminacs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1BP801( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11324P_ultmn = T01BP5_A11324P_ultmn[0] ;
         }
         else
         {
            Z11324P_ultmn = A11324P_ultmn ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z5452P_ForCod = A5452P_ForCod ;
         Z11324P_ultmn = A11324P_ultmn ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtP_ultmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ultmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ultmn_Enabled), 5, 0), true);
      AV33Pgmname = "TMinAcs" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtP_ultmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ultmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ultmn_Enabled), 5, 0), true);
      /* Using cursor T01BP6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BP6_A407EmprNom[0] ;
      n407EmprNom = T01BP6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01BP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01BP7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      GXt_char1 = A5453P_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5452P_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tminacs_impl.this.A396EmprCod = GXv_char4[0] ;
      tminacs_impl.this.A5452P_ForCod = GXv_char3[0] ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
      A5453P_ForDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5453P_ForDsc", A5453P_ForDsc);
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

   public void load1BP801( )
   {
      /* Using cursor T01BP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound801 = (short)(1) ;
         A407EmprNom = T01BP8_A407EmprNom[0] ;
         n407EmprNom = T01BP8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01BP8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A11324P_ultmn = T01BP8_A11324P_ultmn[0] ;
         n11324P_ultmn = T01BP8_n11324P_ultmn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         zm1BP801( -7) ;
      }
      pr_default.close(6);
      onLoadActions1BP801( ) ;
   }

   public void onLoadActions1BP801( )
   {
   }

   public void checkExtendedTable1BP801( )
   {
      nIsDirty_801 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1BP801( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BP801( )
   {
      /* Using cursor T01BP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound801 = (short)(1) ;
      }
      else
      {
         RcdFound801 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01BP5_A5452P_ForCod[0], A5452P_ForCod) == 0 ) && ( GXutil.strcmp(T01BP5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BP5_A252CliCod[0] == A252CliCod ) )
      {
         zm1BP801( 7) ;
         RcdFound801 = (short)(1) ;
         A11324P_ultmn = T01BP5_A11324P_ultmn[0] ;
         n11324P_ultmn = T01BP5_n11324P_ultmn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         O11324P_ultmn = A11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5452P_ForCod = A5452P_ForCod ;
         sMode801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BP801( ) ;
         if ( AnyError == 1 )
         {
            RcdFound801 = (short)(0) ;
            initializeNonKey1BP801( ) ;
         }
         Gx_mode = sMode801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound801 = (short)(0) ;
         initializeNonKey1BP801( ) ;
         sMode801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1BP801( ) ;
      if ( RcdFound801 == 0 )
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
      RcdFound801 = (short)(0) ;
      /* Using cursor T01BP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BP10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BP10_A5452P_ForCod[0], A5452P_ForCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BP10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BP10_A5452P_ForCod[0], A5452P_ForCod) == 0 ) )
         {
            RcdFound801 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound801 = (short)(0) ;
      /* Using cursor T01BP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BP11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BP11_A5452P_ForCod[0], A5452P_ForCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BP11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BP11_A5452P_ForCod[0], A5452P_ForCod) == 0 ) )
         {
            RcdFound801 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BP801( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11324P_ultmn = O11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         insert1BP801( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound801 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5452P_ForCod, Z5452P_ForCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11324P_ultmn = O11324P_ultmn ;
               n11324P_ultmn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11324P_ultmn = O11324P_ultmn ;
               n11324P_ultmn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
               update1BP801( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5452P_ForCod, Z5452P_ForCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11324P_ultmn = O11324P_ultmn ;
               n11324P_ultmn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
               insert1BP801( ) ;
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
                  A11324P_ultmn = O11324P_ultmn ;
                  n11324P_ultmn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
                  insert1BP801( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5452P_ForCod, Z5452P_ForCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11324P_ultmn = O11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey1BP801( ) ;
      if ( RcdFound801 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5452P_ForCod, Z5452P_ForCod) != 0 ) )
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
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5452P_ForCod, Z5452P_ForCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tminacs");
   }

   public void insert_check( )
   {
      confirm_1BP0( ) ;
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
      if ( RcdFound801 == 0 )
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
      scanStart1BP801( ) ;
      if ( RcdFound801 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BP801( ) ;
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
      if ( RcdFound801 == 0 )
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
      if ( RcdFound801 == 0 )
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
      scanStart1BP801( ) ;
      if ( RcdFound801 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound801 != 0 )
         {
            scanNext1BP801( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BP801( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BP801( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREQL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11324P_ultmn != T01BP4_A11324P_ultmn[0] ) )
         {
            if ( Z11324P_ultmn != T01BP4_A11324P_ultmn[0] )
            {
               GXutil.writeLogln("tminacs:[seudo value changed for attri]"+"P_ultmn");
               GXutil.writeLogRaw("Old: ",Z11324P_ultmn);
               GXutil.writeLogRaw("Current: ",T01BP4_A11324P_ultmn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREQL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BP801( )
   {
      beforeValidate1BP801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BP801( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BP801( 0) ;
         checkOptimisticConcurrency1BP801( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BP801( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BP801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BP12 */
                  pr_default.execute(10, new Object[] {A5452P_ForCod, Boolean.valueOf(n11324P_ultmn), Short.valueOf(A11324P_ultmn), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQL");
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
                        processLevel1BP801( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BP0( ) ;
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
            load1BP801( ) ;
         }
         endLevel1BP801( ) ;
      }
      closeExtendedTableCursors1BP801( ) ;
   }

   public void update1BP801( )
   {
      beforeValidate1BP801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BP801( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BP801( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BP801( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BP801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BP13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n11324P_ultmn), Short.valueOf(A11324P_ultmn), A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQL");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREQL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BP801( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BP801( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BP0( ) ;
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
         endLevel1BP801( ) ;
      }
      closeExtendedTableCursors1BP801( ) ;
   }

   public void deferredUpdate1BP801( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BP801( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BP801( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BP801( ) ;
         afterConfirm1BP801( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BP801( ) ;
            if ( AnyError == 0 )
            {
               A11324P_ultmn = O11324P_ultmn ;
               n11324P_ultmn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
               scanStart1BP1512( ) ;
               while ( RcdFound1512 != 0 )
               {
                  getByPrimaryKey1BP1512( ) ;
                  delete1BP1512( ) ;
                  scanNext1BP1512( ) ;
                  O11324P_ultmn = A11324P_ultmn ;
                  n11324P_ultmn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
               }
               scanEnd1BP1512( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BP14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQL");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound801 == 0 )
                        {
                           initAll1BP801( ) ;
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
                        resetCaption1BP0( ) ;
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
      sMode801 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BP801( ) ;
      Gx_mode = sMode801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BP801( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01BP15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPQI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01BP16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPQD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01BP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1BP1512( )
   {
      s11324P_ultmn = O11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1BP1512( ) ;
         if ( ( nRcdExists_1512 != 0 ) || ( nIsMod_1512 != 0 ) )
         {
            standaloneNotModal1BP1512( ) ;
            getKey1BP1512( ) ;
            if ( ( nRcdExists_1512 == 0 ) && ( nRcdDeleted_1512 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BP1512( ) ;
            }
            else
            {
               if ( RcdFound1512 != 0 )
               {
                  if ( ( nRcdDeleted_1512 != 0 ) && ( nRcdExists_1512 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BP1512( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1512 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BP1512( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1512 == 0 )
                  {
                     GXCCtl = "P_LINMN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtP_linMn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11324P_ultmn = A11324P_ultmn ;
            n11324P_ultmn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1512_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_linMn_Internalname, GXutil.ltrim( localUtil.ntoc( A11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_Vi_Internalname, GXutil.ltrim( localUtil.ntoc( A11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_Vf_Internalname, GXutil.ltrim( localUtil.ntoc( A11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtP_inc_Internalname, GXutil.ltrim( localUtil.ntoc( A11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11325P_linMn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11326P_Vi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11327P_Vf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11328P_inc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1512_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1512 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1512_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1512_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_LINMN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_linMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_VI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_VF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "P_INC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_inc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BP1512( ) ;
      if ( AnyError != 0 )
      {
         O11324P_ultmn = s11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      }
      nRcdExists_1512 = (short)(0) ;
      nIsMod_1512 = (short)(0) ;
      nRcdDeleted_1512 = (short)(0) ;
   }

   public void processLevel1BP801( )
   {
      /* Save parent mode. */
      sMode801 = Gx_mode ;
      processNestedLevel1BP1512( ) ;
      if ( AnyError != 0 )
      {
         O11324P_ultmn = s11324P_ultmn ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01BP18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n11324P_ultmn), Short.valueOf(A11324P_ultmn), A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQL");
   }

   public void endLevel1BP801( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1BP801( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tminacs");
         if ( AnyError == 0 )
         {
            confirmValues1BP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tminacs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BP801( )
   {
      /* Scan By routine */
      /* Using cursor T01BP19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      RcdFound801 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound801 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BP801( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound801 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound801 = (short)(1) ;
      }
   }

   public void scanEnd1BP801( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1BP801( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BP801( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BP801( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BP801( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BP801( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BP801( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BP801( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtP_ForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ForCod_Enabled), 5, 0), true);
      edtP_ForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ForDsc_Enabled), 5, 0), true);
      edtP_ultmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ultmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ultmn_Enabled), 5, 0), true);
   }

   public void zm1BP1512( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11326P_Vi = T01BP3_A11326P_Vi[0] ;
            Z11327P_Vf = T01BP3_A11327P_Vf[0] ;
            Z11328P_inc = T01BP3_A11328P_inc[0] ;
         }
         else
         {
            Z11326P_Vi = A11326P_Vi ;
            Z11327P_Vf = A11327P_Vf ;
            Z11328P_inc = A11328P_inc ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z5452P_ForCod = A5452P_ForCod ;
         Z11325P_linMn = A11325P_linMn ;
         Z11326P_Vi = A11326P_Vi ;
         Z11327P_Vf = A11327P_Vf ;
         Z11328P_inc = A11328P_inc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1BP1512( )
   {
      edtP_ultmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ultmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ultmn_Enabled), 5, 0), true);
      edtP_ultmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_ultmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_ultmn_Enabled), 5, 0), true);
   }

   public void standaloneModal1BP1512( )
   {
      if ( isIns( )  )
      {
         A11324P_ultmn = (short)(O11324P_ultmn+1) ;
         n11324P_ultmn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11325P_linMn = A11324P_ultmn ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtP_linMn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtP_linMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_linMn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtP_linMn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtP_linMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_linMn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1BP1512( )
   {
      /* Using cursor T01BP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1512 = (short)(1) ;
         A11326P_Vi = T01BP20_A11326P_Vi[0] ;
         n11326P_Vi = T01BP20_n11326P_Vi[0] ;
         A11327P_Vf = T01BP20_A11327P_Vf[0] ;
         n11327P_Vf = T01BP20_n11327P_Vf[0] ;
         A11328P_inc = T01BP20_A11328P_inc[0] ;
         n11328P_inc = T01BP20_n11328P_inc[0] ;
         zm1BP1512( -10) ;
      }
      pr_default.close(18);
      onLoadActions1BP1512( ) ;
   }

   public void onLoadActions1BP1512( )
   {
   }

   public void checkExtendedTable1BP1512( )
   {
      nIsDirty_1512 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1BP1512( ) ;
   }

   public void closeExtendedTableCursors1BP1512( )
   {
   }

   public void enableDisable1BP1512( )
   {
   }

   public void getKey1BP1512( )
   {
      /* Using cursor T01BP21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1512 = (short)(1) ;
      }
      else
      {
         RcdFound1512 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1BP1512( )
   {
      /* Using cursor T01BP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
      if ( (pr_default.getStatus(1) != 101) && ( T01BP3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BP3_A5452P_ForCod[0], A5452P_ForCod) == 0 ) && ( GXutil.strcmp(T01BP3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BP1512( 10) ;
         RcdFound1512 = (short)(1) ;
         initializeNonKey1BP1512( ) ;
         A11325P_linMn = T01BP3_A11325P_linMn[0] ;
         A11326P_Vi = T01BP3_A11326P_Vi[0] ;
         n11326P_Vi = T01BP3_n11326P_Vi[0] ;
         A11327P_Vf = T01BP3_A11327P_Vf[0] ;
         n11327P_Vf = T01BP3_n11327P_Vf[0] ;
         A11328P_inc = T01BP3_A11328P_inc[0] ;
         n11328P_inc = T01BP3_n11328P_inc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5452P_ForCod = A5452P_ForCod ;
         Z11325P_linMn = A11325P_linMn ;
         sMode1512 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BP1512( ) ;
         load1BP1512( ) ;
         Gx_mode = sMode1512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1512 = (short)(0) ;
         initializeNonKey1BP1512( ) ;
         sMode1512 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BP1512( ) ;
         Gx_mode = sMode1512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BP1512( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BP1512( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMinAcs"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11326P_Vi, T01BP2_A11326P_Vi[0]) != 0 ) || ( DecimalUtil.compareTo(Z11327P_Vf, T01BP2_A11327P_Vf[0]) != 0 ) || ( DecimalUtil.compareTo(Z11328P_inc, T01BP2_A11328P_inc[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11326P_Vi, T01BP2_A11326P_Vi[0]) != 0 )
            {
               GXutil.writeLogln("tminacs:[seudo value changed for attri]"+"P_Vi");
               GXutil.writeLogRaw("Old: ",Z11326P_Vi);
               GXutil.writeLogRaw("Current: ",T01BP2_A11326P_Vi[0]);
            }
            if ( DecimalUtil.compareTo(Z11327P_Vf, T01BP2_A11327P_Vf[0]) != 0 )
            {
               GXutil.writeLogln("tminacs:[seudo value changed for attri]"+"P_Vf");
               GXutil.writeLogRaw("Old: ",Z11327P_Vf);
               GXutil.writeLogRaw("Current: ",T01BP2_A11327P_Vf[0]);
            }
            if ( DecimalUtil.compareTo(Z11328P_inc, T01BP2_A11328P_inc[0]) != 0 )
            {
               GXutil.writeLogln("tminacs:[seudo value changed for attri]"+"P_inc");
               GXutil.writeLogRaw("Old: ",Z11328P_inc);
               GXutil.writeLogRaw("Current: ",T01BP2_A11328P_inc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMinAcs"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BP1512( )
   {
      beforeValidate1BP1512( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BP1512( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BP1512( 0) ;
         checkOptimisticConcurrency1BP1512( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BP1512( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BP1512( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BP22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn), Boolean.valueOf(n11326P_Vi), A11326P_Vi, Boolean.valueOf(n11327P_Vf), A11327P_Vf, Boolean.valueOf(n11328P_inc), A11328P_inc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMinAcs");
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
            load1BP1512( ) ;
         }
         endLevel1BP1512( ) ;
      }
      closeExtendedTableCursors1BP1512( ) ;
   }

   public void update1BP1512( )
   {
      beforeValidate1BP1512( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BP1512( ) ;
      }
      if ( ( nIsMod_1512 != 0 ) || ( nIsDirty_1512 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BP1512( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BP1512( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BP1512( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BP23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n11326P_Vi), A11326P_Vi, Boolean.valueOf(n11327P_Vf), A11327P_Vf, Boolean.valueOf(n11328P_inc), A11328P_inc, A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMinAcs");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMinAcs"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BP1512( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BP1512( ) ;
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
            endLevel1BP1512( ) ;
         }
      }
      closeExtendedTableCursors1BP1512( ) ;
   }

   public void deferredUpdate1BP1512( )
   {
   }

   public void delete1BP1512( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BP1512( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BP1512( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BP1512( ) ;
         afterConfirm1BP1512( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BP1512( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BP24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod, Short.valueOf(A11325P_linMn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMinAcs");
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
      sMode1512 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BP1512( ) ;
      Gx_mode = sMode1512 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BP1512( )
   {
      standaloneModal1BP1512( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BP1512( )
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

   public void scanStart1BP1512( )
   {
      /* Scan By routine */
      /* Using cursor T01BP25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      RcdFound1512 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1512 = (short)(1) ;
         A11325P_linMn = T01BP25_A11325P_linMn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BP1512( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1512 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1512 = (short)(1) ;
         A11325P_linMn = T01BP25_A11325P_linMn[0] ;
      }
   }

   public void scanEnd1BP1512( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1BP1512( )
   {
      /* After Confirm Rules */
      if ( ( A11327P_Vf.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "P_VF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Final = 0 ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtP_Vf_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1BP1512( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BP1512( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BP1512( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BP1512( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BP1512( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BP1512( )
   {
      edtP_linMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_linMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_linMn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtP_Vi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_Vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_Vi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtP_Vf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_Vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_Vf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtP_inc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_inc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_inc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1BP1512( )
   {
   }

   public void send_integrity_lvl_hashes1BP801( )
   {
   }

   public void subsflControlProps_551512( )
   {
      edtavnRcdDeleted_1512_Internalname = "vNRCDDELETED_1512_"+sGXsfl_55_idx ;
      edtP_linMn_Internalname = "P_LINMN_"+sGXsfl_55_idx ;
      edtP_Vi_Internalname = "P_VI_"+sGXsfl_55_idx ;
      edtP_Vf_Internalname = "P_VF_"+sGXsfl_55_idx ;
      edtP_inc_Internalname = "P_INC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551512( )
   {
      edtavnRcdDeleted_1512_Internalname = "vNRCDDELETED_1512_"+sGXsfl_55_fel_idx ;
      edtP_linMn_Internalname = "P_LINMN_"+sGXsfl_55_fel_idx ;
      edtP_Vi_Internalname = "P_VI_"+sGXsfl_55_fel_idx ;
      edtP_Vf_Internalname = "P_VF_"+sGXsfl_55_fel_idx ;
      edtP_inc_Internalname = "P_INC_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1BP1512( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551512( ) ;
      sendRow1BP1512( ) ;
   }

   public void sendRow1BP1512( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1512_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1512_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1512_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1512), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1512), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1512_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1512_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1512_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtP_linMn_Internalname,GXutil.ltrim( localUtil.ntoc( A11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11325P_linMn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtP_linMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtP_linMn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1512_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtP_Vi_Internalname,GXutil.ltrim( localUtil.ntoc( A11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtP_Vi_Enabled!=0) ? localUtil.format( A11326P_Vi, "ZZZZZ9.99") : localUtil.format( A11326P_Vi, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtP_Vi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtP_Vi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1512_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtP_Vf_Internalname,GXutil.ltrim( localUtil.ntoc( A11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtP_Vf_Enabled!=0) ? localUtil.format( A11327P_Vf, "ZZZZZ9.99") : localUtil.format( A11327P_Vf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtP_Vf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtP_Vf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1512_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtP_inc_Internalname,GXutil.ltrim( localUtil.ntoc( A11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtP_inc_Enabled!=0) ? localUtil.format( A11328P_inc, "ZZ9.99") : localUtil.format( A11328P_inc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtP_inc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtP_inc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BP1512( ) ;
      GXCCtl = "Z11325P_linMn_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11325P_linMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11326P_Vi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11326P_Vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11327P_Vf_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11327P_Vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11328P_inc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11328P_inc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1512_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1512_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1512_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1512, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1512_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1512_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "P_LINMN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_linMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "P_VI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "P_VF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "P_INC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtP_inc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BP1512( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551512( ) ;
      edtavnRcdDeleted_1512_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1512_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtP_linMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_LINMN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtP_Vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_VI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtP_Vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_VF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtP_inc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "P_INC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1512_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1512_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1512");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1512_Internalname ;
         wbErr = true ;
         nRcdDeleted_1512 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1512 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1512_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtP_linMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtP_linMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "P_LINMN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtP_linMn_Internalname ;
         wbErr = true ;
         A11325P_linMn = (short)(0) ;
      }
      else
      {
         A11325P_linMn = (short)(localUtil.ctol( httpContext.cgiGet( edtP_linMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtP_Vi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtP_Vi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "P_VI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtP_Vi_Internalname ;
         wbErr = true ;
         A11326P_Vi = DecimalUtil.ZERO ;
         n11326P_Vi = false ;
      }
      else
      {
         A11326P_Vi = localUtil.ctond( httpContext.cgiGet( edtP_Vi_Internalname)) ;
         n11326P_Vi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtP_Vf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtP_Vf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "P_VF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtP_Vf_Internalname ;
         wbErr = true ;
         A11327P_Vf = DecimalUtil.ZERO ;
         n11327P_Vf = false ;
      }
      else
      {
         A11327P_Vf = localUtil.ctond( httpContext.cgiGet( edtP_Vf_Internalname)) ;
         n11327P_Vf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtP_inc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtP_inc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "P_INC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtP_inc_Internalname ;
         wbErr = true ;
         A11328P_inc = DecimalUtil.ZERO ;
         n11328P_inc = false ;
      }
      else
      {
         A11328P_inc = localUtil.ctond( httpContext.cgiGet( edtP_inc_Internalname)) ;
         n11328P_inc = false ;
      }
      GXCCtl = "Z11325P_linMn_" + sGXsfl_55_idx ;
      Z11325P_linMn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11326P_Vi_" + sGXsfl_55_idx ;
      Z11326P_Vi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11327P_Vf_" + sGXsfl_55_idx ;
      Z11327P_Vf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11328P_inc_" + sGXsfl_55_idx ;
      Z11328P_inc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1512_" + sGXsfl_55_idx ;
      nRcdDeleted_1512 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1512_" + sGXsfl_55_idx ;
      nRcdExists_1512 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1512_" + sGXsfl_55_idx ;
      nIsMod_1512 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtP_linMn_Enabled = edtP_linMn_Enabled ;
   }

   public void confirmValues1BP0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551512( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551512( ) ;
         httpContext.changePostValue( "Z11325P_linMn_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z11325P_linMn_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11325P_linMn_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z11326P_Vi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z11326P_Vi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11326P_Vi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z11327P_Vf_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z11327P_Vf_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11327P_Vf_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z11328P_inc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z11328P_inc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11328P_inc_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tminacs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5452P_ForCod))}, new String[] {"EmprCod","CliCod","P_ForCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5452P_ForCod", GXutil.rtrim( Z5452P_ForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11324P_ultmn", GXutil.ltrim( localUtil.ntoc( Z11324P_ultmn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11324P_ultmn", GXutil.ltrim( localUtil.ntoc( O11324P_ultmn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tminacs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A5452P_ForCod))}, new String[] {"EmprCod","CliCod","P_ForCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMinAcs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Minimos ACS", "") ;
   }

   public void initializeNonKey1BP801( )
   {
      A11324P_ultmn = (short)(0) ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      O11324P_ultmn = A11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
      Z11324P_ultmn = (short)(0) ;
   }

   public void initAll1BP801( )
   {
      initializeNonKey1BP801( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BP1512( )
   {
      A11326P_Vi = DecimalUtil.ZERO ;
      n11326P_Vi = false ;
      A11327P_Vf = DecimalUtil.ZERO ;
      n11327P_Vf = false ;
      A11328P_inc = DecimalUtil.ZERO ;
      n11328P_inc = false ;
      Z11326P_Vi = DecimalUtil.ZERO ;
      Z11327P_Vf = DecimalUtil.ZERO ;
      Z11328P_inc = DecimalUtil.ZERO ;
   }

   public void initAll1BP1512( )
   {
      A11325P_linMn = (short)(0) ;
      initializeNonKey1BP1512( ) ;
   }

   public void standaloneModalInsert1BP1512( )
   {
      A11324P_ultmn = i11324P_ultmn ;
      n11324P_ultmn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11324P_ultmn), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564644", true, true);
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
      httpContext.AddJavascriptSource("tminacs.js", "?20268241564644", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1512( )
   {
      edtP_linMn_Enabled = defedtP_linMn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtP_linMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtP_linMn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1512, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1512_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11325P_linMn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtP_linMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11326P_Vi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11327P_Vf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtP_Vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11328P_inc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtP_inc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtP_ForCod_Internalname = "P_FORCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtP_ForDsc_Internalname = "P_FORDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtP_ultmn_Internalname = "P_ULTMN" ;
      edtavnRcdDeleted_1512_Internalname = "vNRCDDELETED_1512" ;
      edtP_linMn_Internalname = "P_LINMN" ;
      edtP_Vi_Internalname = "P_VI" ;
      edtP_Vf_Internalname = "P_VF" ;
      edtP_inc_Internalname = "P_INC" ;
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
      Form.setCaption( httpContext.getMessage( "Minimos ACS", "") );
      edtP_inc_Jsonclick = "" ;
      edtP_Vf_Jsonclick = "" ;
      edtP_Vi_Jsonclick = "" ;
      edtP_linMn_Jsonclick = "" ;
      edtavnRcdDeleted_1512_Jsonclick = "" ;
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
      edtP_inc_Enabled = 1 ;
      edtP_Vf_Enabled = 1 ;
      edtP_Vi_Enabled = 1 ;
      edtP_linMn_Enabled = 1 ;
      edtavnRcdDeleted_1512_Enabled = 1 ;
      edtP_ultmn_Jsonclick = "" ;
      edtP_ultmn_Backcolor = (int)(0xFFFFFF) ;
      edtP_ultmn_Enabled = 0 ;
      edtP_ForDsc_Jsonclick = "" ;
      edtP_ForDsc_Backcolor = (int)(0xFFFFFF) ;
      edtP_ForDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtP_ForCod_Jsonclick = "" ;
      edtP_ForCod_Backcolor = (int)(0xFFFFFF) ;
      edtP_ForCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gx1asap_fordsc1BP801( String A396EmprCod ,
                                     String A5452P_ForCod )
   {
      GXt_char1 = A5453P_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5452P_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tminacs_impl.this.A396EmprCod = GXv_char4[0] ;
      tminacs_impl.this.A5452P_ForCod = GXv_char3[0] ;
      tminacs_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5452P_ForCod", A5452P_ForCod);
      A5453P_ForDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5453P_ForDsc", A5453P_ForDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5453P_ForDsc))+"\"") ;
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
      subsflControlProps_551512( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BP1512( ) ;
         standaloneModal1BP1512( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BP1512( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551512( ) ;
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
      /* Using cursor T01BP26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BP26_A407EmprNom[0] ;
      n407EmprNom = T01BP26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T01BP27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01BP27_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(25);
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

   public void valid_P_forcod( )
   {
      n11324P_ultmn = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5453P_ForDsc", GXutil.rtrim( A5453P_ForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11324P_ultmn", GXutil.ltrim( localUtil.ntoc( A11324P_ultmn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5452P_ForCod", GXutil.rtrim( Z5452P_ForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5453P_ForDsc", GXutil.rtrim( Z5453P_ForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11324P_ultmn", GXutil.ltrim( localUtil.ntoc( Z11324P_ultmn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O11324P_ultmn", GXutil.ltrim( localUtil.ntoc( O11324P_ultmn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5452P_ForCod',fld:'P_FORCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_P_FORCOD","{handler:'valid_P_forcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11324P_ultmn',fld:'P_ULTMN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5452P_ForCod',fld:'P_FORCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_P_FORCOD",",oparms:[{av:'A5453P_ForDsc',fld:'P_FORDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A11324P_ultmn',fld:'P_ULTMN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z5452P_ForCod'},{av:'Z5453P_ForDsc'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z11324P_ultmn'},{av:'O11324P_ultmn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_P_ULTMN","{handler:'valid_P_ultmn',iparms:[]");
      setEventMetadata("VALID_P_ULTMN",",oparms:[]}");
      setEventMetadata("VALID_P_LINMN","{handler:'valid_P_linmn',iparms:[]");
      setEventMetadata("VALID_P_LINMN",",oparms:[]}");
      setEventMetadata("VALID_P_VF","{handler:'valid_P_vf',iparms:[]");
      setEventMetadata("VALID_P_VF",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_P_inc',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA5452P_ForCod = "" ;
      Z396EmprCod = "" ;
      Z5452P_ForCod = "" ;
      Z11326P_Vi = DecimalUtil.ZERO ;
      Z11327P_Vf = DecimalUtil.ZERO ;
      Z11328P_inc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5452P_ForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5453P_ForDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1512 = "" ;
      GX_FocusControl = "" ;
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
      sMode801 = "" ;
      GXCCtl = "" ;
      A11326P_Vi = DecimalUtil.ZERO ;
      A11327P_Vf = DecimalUtil.ZERO ;
      A11328P_inc = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01BP6_A407EmprNom = new String[] {""} ;
      T01BP6_n407EmprNom = new boolean[] {false} ;
      T01BP7_A279CliNom = new String[] {""} ;
      T01BP8_A5452P_ForCod = new String[] {""} ;
      T01BP8_A407EmprNom = new String[] {""} ;
      T01BP8_n407EmprNom = new boolean[] {false} ;
      T01BP8_A279CliNom = new String[] {""} ;
      T01BP8_A11324P_ultmn = new short[1] ;
      T01BP8_n11324P_ultmn = new boolean[] {false} ;
      T01BP8_A396EmprCod = new String[] {""} ;
      T01BP8_A252CliCod = new int[1] ;
      T01BP9_A396EmprCod = new String[] {""} ;
      T01BP9_A252CliCod = new int[1] ;
      T01BP9_A5452P_ForCod = new String[] {""} ;
      T01BP5_A5452P_ForCod = new String[] {""} ;
      T01BP5_A11324P_ultmn = new short[1] ;
      T01BP5_n11324P_ultmn = new boolean[] {false} ;
      T01BP5_A396EmprCod = new String[] {""} ;
      T01BP5_A252CliCod = new int[1] ;
      T01BP10_A396EmprCod = new String[] {""} ;
      T01BP10_A252CliCod = new int[1] ;
      T01BP10_A5452P_ForCod = new String[] {""} ;
      T01BP11_A396EmprCod = new String[] {""} ;
      T01BP11_A252CliCod = new int[1] ;
      T01BP11_A5452P_ForCod = new String[] {""} ;
      T01BP4_A5452P_ForCod = new String[] {""} ;
      T01BP4_A11324P_ultmn = new short[1] ;
      T01BP4_n11324P_ultmn = new boolean[] {false} ;
      T01BP4_A396EmprCod = new String[] {""} ;
      T01BP4_A252CliCod = new int[1] ;
      T01BP15_A396EmprCod = new String[] {""} ;
      T01BP15_A252CliCod = new int[1] ;
      T01BP15_A5452P_ForCod = new String[] {""} ;
      T01BP15_A5511ClipqiLin = new short[1] ;
      T01BP16_A396EmprCod = new String[] {""} ;
      T01BP16_A252CliCod = new int[1] ;
      T01BP16_A5452P_ForCod = new String[] {""} ;
      T01BP16_A5507ClipqdLin = new short[1] ;
      T01BP17_A396EmprCod = new String[] {""} ;
      T01BP17_A252CliCod = new int[1] ;
      T01BP17_A5452P_ForCod = new String[] {""} ;
      T01BP17_A4295ClasCod = new short[1] ;
      T01BP19_A396EmprCod = new String[] {""} ;
      T01BP19_A252CliCod = new int[1] ;
      T01BP19_A5452P_ForCod = new String[] {""} ;
      T01BP20_A252CliCod = new int[1] ;
      T01BP20_A5452P_ForCod = new String[] {""} ;
      T01BP20_A11325P_linMn = new short[1] ;
      T01BP20_A11326P_Vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP20_n11326P_Vi = new boolean[] {false} ;
      T01BP20_A11327P_Vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP20_n11327P_Vf = new boolean[] {false} ;
      T01BP20_A11328P_inc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP20_n11328P_inc = new boolean[] {false} ;
      T01BP20_A396EmprCod = new String[] {""} ;
      T01BP21_A396EmprCod = new String[] {""} ;
      T01BP21_A252CliCod = new int[1] ;
      T01BP21_A5452P_ForCod = new String[] {""} ;
      T01BP21_A11325P_linMn = new short[1] ;
      T01BP3_A252CliCod = new int[1] ;
      T01BP3_A5452P_ForCod = new String[] {""} ;
      T01BP3_A11325P_linMn = new short[1] ;
      T01BP3_A11326P_Vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP3_n11326P_Vi = new boolean[] {false} ;
      T01BP3_A11327P_Vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP3_n11327P_Vf = new boolean[] {false} ;
      T01BP3_A11328P_inc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP3_n11328P_inc = new boolean[] {false} ;
      T01BP3_A396EmprCod = new String[] {""} ;
      T01BP2_A252CliCod = new int[1] ;
      T01BP2_A5452P_ForCod = new String[] {""} ;
      T01BP2_A11325P_linMn = new short[1] ;
      T01BP2_A11326P_Vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP2_n11326P_Vi = new boolean[] {false} ;
      T01BP2_A11327P_Vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP2_n11327P_Vf = new boolean[] {false} ;
      T01BP2_A11328P_inc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BP2_n11328P_inc = new boolean[] {false} ;
      T01BP2_A396EmprCod = new String[] {""} ;
      T01BP25_A396EmprCod = new String[] {""} ;
      T01BP25_A252CliCod = new int[1] ;
      T01BP25_A5452P_ForCod = new String[] {""} ;
      T01BP25_A11325P_linMn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T01BP26_A407EmprNom = new String[] {""} ;
      T01BP26_n407EmprNom = new boolean[] {false} ;
      T01BP27_A279CliNom = new String[] {""} ;
      Z5453P_ForDsc = "" ;
      ZZ396EmprCod = "" ;
      ZZ5452P_ForCod = "" ;
      ZZ5453P_ForDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tminacs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tminacs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tminacs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tminacs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tminacs__default(),
         new Object[] {
             new Object[] {
            T01BP2_A252CliCod, T01BP2_A5452P_ForCod, T01BP2_A11325P_linMn, T01BP2_A11326P_Vi, T01BP2_n11326P_Vi, T01BP2_A11327P_Vf, T01BP2_n11327P_Vf, T01BP2_A11328P_inc, T01BP2_n11328P_inc, T01BP2_A396EmprCod
            }
            , new Object[] {
            T01BP3_A252CliCod, T01BP3_A5452P_ForCod, T01BP3_A11325P_linMn, T01BP3_A11326P_Vi, T01BP3_n11326P_Vi, T01BP3_A11327P_Vf, T01BP3_n11327P_Vf, T01BP3_A11328P_inc, T01BP3_n11328P_inc, T01BP3_A396EmprCod
            }
            , new Object[] {
            T01BP4_A5452P_ForCod, T01BP4_A11324P_ultmn, T01BP4_n11324P_ultmn, T01BP4_A396EmprCod, T01BP4_A252CliCod
            }
            , new Object[] {
            T01BP5_A5452P_ForCod, T01BP5_A11324P_ultmn, T01BP5_n11324P_ultmn, T01BP5_A396EmprCod, T01BP5_A252CliCod
            }
            , new Object[] {
            T01BP6_A407EmprNom, T01BP6_n407EmprNom
            }
            , new Object[] {
            T01BP7_A279CliNom
            }
            , new Object[] {
            T01BP8_A5452P_ForCod, T01BP8_A407EmprNom, T01BP8_n407EmprNom, T01BP8_A279CliNom, T01BP8_A11324P_ultmn, T01BP8_n11324P_ultmn, T01BP8_A396EmprCod, T01BP8_A252CliCod
            }
            , new Object[] {
            T01BP9_A396EmprCod, T01BP9_A252CliCod, T01BP9_A5452P_ForCod
            }
            , new Object[] {
            T01BP10_A396EmprCod, T01BP10_A252CliCod, T01BP10_A5452P_ForCod
            }
            , new Object[] {
            T01BP11_A396EmprCod, T01BP11_A252CliCod, T01BP11_A5452P_ForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BP15_A396EmprCod, T01BP15_A252CliCod, T01BP15_A5452P_ForCod, T01BP15_A5511ClipqiLin
            }
            , new Object[] {
            T01BP16_A396EmprCod, T01BP16_A252CliCod, T01BP16_A5452P_ForCod, T01BP16_A5507ClipqdLin
            }
            , new Object[] {
            T01BP17_A396EmprCod, T01BP17_A252CliCod, T01BP17_A5452P_ForCod, T01BP17_A4295ClasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01BP19_A396EmprCod, T01BP19_A252CliCod, T01BP19_A5452P_ForCod
            }
            , new Object[] {
            T01BP20_A252CliCod, T01BP20_A5452P_ForCod, T01BP20_A11325P_linMn, T01BP20_A11326P_Vi, T01BP20_n11326P_Vi, T01BP20_A11327P_Vf, T01BP20_n11327P_Vf, T01BP20_A11328P_inc, T01BP20_n11328P_inc, T01BP20_A396EmprCod
            }
            , new Object[] {
            T01BP21_A396EmprCod, T01BP21_A252CliCod, T01BP21_A5452P_ForCod, T01BP21_A11325P_linMn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BP25_A396EmprCod, T01BP25_A252CliCod, T01BP25_A5452P_ForCod, T01BP25_A11325P_linMn
            }
            , new Object[] {
            T01BP26_A407EmprNom, T01BP26_n407EmprNom
            }
            , new Object[] {
            T01BP27_A279CliNom
            }
         }
      );
      Z5452P_ForCod = "" ;
      A5452P_ForCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TMinAcs" ;
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
   private short Z11324P_ultmn ;
   private short O11324P_ultmn ;
   private short Z11325P_linMn ;
   private short nRcdDeleted_1512 ;
   private short nRcdExists_1512 ;
   private short nIsMod_1512 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11324P_ultmn ;
   private short nBlankRcdCount1512 ;
   private short RcdFound1512 ;
   private short B11324P_ultmn ;
   private short nBlankRcdUsr1512 ;
   private short s11324P_ultmn ;
   private short A11325P_linMn ;
   private short RcdFound801 ;
   private short nIsDirty_801 ;
   private short nIsDirty_1512 ;
   private short i11324P_ultmn ;
   private short ZZ11324P_ultmn ;
   private short ZO11324P_ultmn ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtP_ForCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtP_ForDsc_Enabled ;
   private int edtP_ultmn_Enabled ;
   private int edtavnRcdDeleted_1512_Enabled ;
   private int edtP_linMn_Enabled ;
   private int edtP_Vi_Enabled ;
   private int edtP_Vf_Enabled ;
   private int edtP_inc_Enabled ;
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
   private int defedtP_linMn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtP_ultmn_Backcolor ;
   private int edtP_ForDsc_Backcolor ;
   private int edtP_ForCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11326P_Vi ;
   private java.math.BigDecimal Z11327P_Vf ;
   private java.math.BigDecimal Z11328P_inc ;
   private java.math.BigDecimal A11326P_Vi ;
   private java.math.BigDecimal A11327P_Vf ;
   private java.math.BigDecimal A11328P_inc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA5452P_ForCod ;
   private String Z396EmprCod ;
   private String Z5452P_ForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5452P_ForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtEmprCod_Internalname ;
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
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtP_ForCod_Internalname ;
   private String edtP_ForCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtP_ForDsc_Internalname ;
   private String A5453P_ForDsc ;
   private String edtP_ForDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtP_ultmn_Internalname ;
   private String edtP_ultmn_Jsonclick ;
   private String sMode1512 ;
   private String edtavnRcdDeleted_1512_Internalname ;
   private String edtP_linMn_Internalname ;
   private String edtP_Vi_Internalname ;
   private String edtP_Vf_Internalname ;
   private String edtP_inc_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode801 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1512_Jsonclick ;
   private String edtP_linMn_Jsonclick ;
   private String edtP_Vi_Jsonclick ;
   private String edtP_Vf_Jsonclick ;
   private String edtP_inc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z5453P_ForDsc ;
   private String ZZ396EmprCod ;
   private String ZZ5452P_ForCod ;
   private String ZZ5453P_ForDsc ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11324P_ultmn ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n11326P_Vi ;
   private boolean n11327P_Vf ;
   private boolean n11328P_inc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BP6_A407EmprNom ;
   private boolean[] T01BP6_n407EmprNom ;
   private String[] T01BP7_A279CliNom ;
   private String[] T01BP8_A5452P_ForCod ;
   private String[] T01BP8_A407EmprNom ;
   private boolean[] T01BP8_n407EmprNom ;
   private String[] T01BP8_A279CliNom ;
   private short[] T01BP8_A11324P_ultmn ;
   private boolean[] T01BP8_n11324P_ultmn ;
   private String[] T01BP8_A396EmprCod ;
   private int[] T01BP8_A252CliCod ;
   private String[] T01BP9_A396EmprCod ;
   private int[] T01BP9_A252CliCod ;
   private String[] T01BP9_A5452P_ForCod ;
   private String[] T01BP5_A5452P_ForCod ;
   private short[] T01BP5_A11324P_ultmn ;
   private boolean[] T01BP5_n11324P_ultmn ;
   private String[] T01BP5_A396EmprCod ;
   private int[] T01BP5_A252CliCod ;
   private String[] T01BP10_A396EmprCod ;
   private int[] T01BP10_A252CliCod ;
   private String[] T01BP10_A5452P_ForCod ;
   private String[] T01BP11_A396EmprCod ;
   private int[] T01BP11_A252CliCod ;
   private String[] T01BP11_A5452P_ForCod ;
   private String[] T01BP4_A5452P_ForCod ;
   private short[] T01BP4_A11324P_ultmn ;
   private boolean[] T01BP4_n11324P_ultmn ;
   private String[] T01BP4_A396EmprCod ;
   private int[] T01BP4_A252CliCod ;
   private String[] T01BP15_A396EmprCod ;
   private int[] T01BP15_A252CliCod ;
   private String[] T01BP15_A5452P_ForCod ;
   private short[] T01BP15_A5511ClipqiLin ;
   private String[] T01BP16_A396EmprCod ;
   private int[] T01BP16_A252CliCod ;
   private String[] T01BP16_A5452P_ForCod ;
   private short[] T01BP16_A5507ClipqdLin ;
   private String[] T01BP17_A396EmprCod ;
   private int[] T01BP17_A252CliCod ;
   private String[] T01BP17_A5452P_ForCod ;
   private short[] T01BP17_A4295ClasCod ;
   private String[] T01BP19_A396EmprCod ;
   private int[] T01BP19_A252CliCod ;
   private String[] T01BP19_A5452P_ForCod ;
   private int[] T01BP20_A252CliCod ;
   private String[] T01BP20_A5452P_ForCod ;
   private short[] T01BP20_A11325P_linMn ;
   private java.math.BigDecimal[] T01BP20_A11326P_Vi ;
   private boolean[] T01BP20_n11326P_Vi ;
   private java.math.BigDecimal[] T01BP20_A11327P_Vf ;
   private boolean[] T01BP20_n11327P_Vf ;
   private java.math.BigDecimal[] T01BP20_A11328P_inc ;
   private boolean[] T01BP20_n11328P_inc ;
   private String[] T01BP20_A396EmprCod ;
   private String[] T01BP21_A396EmprCod ;
   private int[] T01BP21_A252CliCod ;
   private String[] T01BP21_A5452P_ForCod ;
   private short[] T01BP21_A11325P_linMn ;
   private int[] T01BP3_A252CliCod ;
   private String[] T01BP3_A5452P_ForCod ;
   private short[] T01BP3_A11325P_linMn ;
   private java.math.BigDecimal[] T01BP3_A11326P_Vi ;
   private boolean[] T01BP3_n11326P_Vi ;
   private java.math.BigDecimal[] T01BP3_A11327P_Vf ;
   private boolean[] T01BP3_n11327P_Vf ;
   private java.math.BigDecimal[] T01BP3_A11328P_inc ;
   private boolean[] T01BP3_n11328P_inc ;
   private String[] T01BP3_A396EmprCod ;
   private int[] T01BP2_A252CliCod ;
   private String[] T01BP2_A5452P_ForCod ;
   private short[] T01BP2_A11325P_linMn ;
   private java.math.BigDecimal[] T01BP2_A11326P_Vi ;
   private boolean[] T01BP2_n11326P_Vi ;
   private java.math.BigDecimal[] T01BP2_A11327P_Vf ;
   private boolean[] T01BP2_n11327P_Vf ;
   private java.math.BigDecimal[] T01BP2_A11328P_inc ;
   private boolean[] T01BP2_n11328P_inc ;
   private String[] T01BP2_A396EmprCod ;
   private String[] T01BP25_A396EmprCod ;
   private int[] T01BP25_A252CliCod ;
   private String[] T01BP25_A5452P_ForCod ;
   private short[] T01BP25_A11325P_linMn ;
   private String[] T01BP26_A407EmprNom ;
   private boolean[] T01BP26_n407EmprNom ;
   private String[] T01BP27_A279CliNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tminacs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminacs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminacs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminacs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminacs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BP2", "SELECT CliCod, P_ForCod, P_linMn, P_Vi, P_Vf, P_inc, EmprCod FROM TXPMinAcs WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? AND P_linMn = ?  FOR UPDATE OF P_Vi, P_Vf, P_inc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BP3", "SELECT CliCod, P_ForCod, P_linMn, P_Vi, P_Vf, P_inc, EmprCod FROM TXPMinAcs WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? AND P_linMn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BP4", "SELECT P_ForCod, P_ultmn, EmprCod, CliCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?  FOR UPDATE OF P_ultmn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP5", "SELECT P_ForCod, P_ultmn, EmprCod, CliCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP8", "SELECT /*+ FIRST_ROWS(1) */ TM1.P_ForCod, T2.EmprNom, T3.CliNom, TM1.P_ultmn, TM1.EmprCod, TM1.CliCod FROM ((TXPPREQL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.P_ForCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.P_ForCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod DESC, CliCod DESC, P_ForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BP12", "INSERT INTO TXPPREQL(P_ForCod, P_ultmn, EmprCod, CliCod, ProForPM, ProForPK, ProForPP, ClipqdUl, ClipqiUl) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPPREQL")
         ,new UpdateCursor("T01BP13", "UPDATE TXPPREQL SET P_ultmn=?  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?", GX_NOMASK, "TXPPREQL")
         ,new UpdateCursor("T01BP14", "DELETE FROM TXPPREQL  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?", GX_NOMASK, "TXPPREQL")
         ,new ForEachCursor("T01BP15", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod, ClipqiLin FROM TXPCLIPQI WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP16", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod, ClipqdLin FROM TXPCLIPQD WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP17", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod, ClasCod FROM TXPPREQP WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BP18", "UPDATE TXPPREQL SET P_ultmn=?  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?", GX_NOMASK, "TXPPREQL")
         ,new ForEachCursor("T01BP19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BP20", "SELECT CliCod, P_ForCod, P_linMn, P_Vi, P_Vf, P_inc, EmprCod FROM TXPMinAcs WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? and P_linMn = ? ORDER BY EmprCod, CliCod, P_ForCod, P_linMn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BP21", "SELECT EmprCod, CliCod, P_ForCod, P_linMn FROM TXPMinAcs WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? AND P_linMn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BP22", "INSERT INTO TXPMinAcs(CliCod, P_ForCod, P_linMn, P_Vi, P_Vf, P_inc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMinAcs")
         ,new UpdateCursor("T01BP23", "UPDATE TXPMinAcs SET P_Vi=?, P_Vf=?, P_inc=?  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? AND P_linMn = ?", GX_NOMASK, "TXPMinAcs")
         ,new UpdateCursor("T01BP24", "DELETE FROM TXPMinAcs  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ? AND P_linMn = ?", GX_NOMASK, "TXPMinAcs")
         ,new ForEachCursor("T01BP25", "SELECT EmprCod, CliCod, P_ForCod, P_linMn FROM TXPMinAcs WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod, P_linMn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BP26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BP27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
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
               return;
            case 11 :
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
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(7, (String)parms[9], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 6);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

