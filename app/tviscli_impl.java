package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tviscli_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A23Com_Cod = (byte)(GXutil.lval( httpContext.GetPar( "Com_Cod"))) ;
         n23Com_Cod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A23Com_Cod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONTROL VISITAS CLIENTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliNom_Internalname ;
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
      A28Com_ult = (int)(GXutil.lval( httpContext.GetPar( "Com_ult"))) ;
      n28Com_ult = false ;
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

   public tviscli_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tviscli_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tviscli_impl.class ));
   }

   public tviscli_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVISCLI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVISCLI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCom_ult_Internalname, GXutil.ltrim( localUtil.ntoc( A28Com_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCom_ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A28Com_ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A28Com_ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCom_ult_Jsonclick, 0, "", "", "", "", "", 1, edtCom_ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVISCLI.htm");
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
         nBlankRcdCount1329 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1329 = (short)(1) ;
            scanStart1641329( ) ;
            while ( RcdFound1329 != 0 )
            {
               init_level_properties1329( ) ;
               getByPrimaryKey1641329( ) ;
               addRow1641329( ) ;
               scanNext1641329( ) ;
            }
            scanEnd1641329( ) ;
            nBlankRcdCount1329 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B28Com_ult = A28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         standaloneNotModal1641329( ) ;
         standaloneModal1641329( ) ;
         sMode1329 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1641329( ) ;
            edtavnRcdDeleted_1329_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1329_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1329_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1329_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_LIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_lin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_diav_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DIAV_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_diav_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_diav_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_diae_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DIAE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_diae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_diae_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_OBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_obs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_COD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_Cod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_dsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCom_Cont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_CONT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCom_Cont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_Cont_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1329 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1641329( ) ;
            }
            sendRow1641329( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1329 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A28Com_ult = B28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1329 = (short)(5) ;
         nRcdExists_1329 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1641329( ) ;
            while ( RcdFound1329 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451329( ) ;
               init_level_properties1329( ) ;
               standaloneNotModal1641329( ) ;
               getByPrimaryKey1641329( ) ;
               standaloneModal1641329( ) ;
               addRow1641329( ) ;
               scanNext1641329( ) ;
            }
            scanEnd1641329( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1329 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451329( ) ;
      initAll1641329( ) ;
      init_level_properties1329( ) ;
      B28Com_ult = A28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      nRcdExists_1329 = (short)(0) ;
      nIsMod_1329 = (short)(0) ;
      nRcdDeleted_1329 = (short)(0) ;
      nBlankRcdCount1329 = (short)(nBlankRcdUsr1329+nBlankRcdCount1329) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1329 > 0 )
      {
         standaloneNotModal1641329( ) ;
         standaloneModal1641329( ) ;
         addRow1641329( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCom_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1329 = (short)(nBlankRcdCount1329-1) ;
      }
      Gx_mode = sMode1329 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A28Com_ult = B28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVISCLI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVISCLI.htm");
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
      e111642 ();
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
            Z28Com_ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z28Com_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O28Com_ult = (int)(localUtil.ctol( httpContext.cgiGet( "O28Com_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A28Com_ult = (int)(localUtil.ctol( httpContext.cgiGet( edtCom_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n28Com_ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
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
                        e111642 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'IMPRIMIR RELATORIO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Imprimir Relatorio' */
                        e121642 ();
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
            initAll16421( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1329_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1329_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes16421( ) ;
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

   public void confirm_1640( )
   {
      beforeValidate16421( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16421( ) ;
         }
         else
         {
            checkExtendedTable16421( ) ;
            if ( AnyError == 0 )
            {
               zm16421( 9) ;
            }
            closeExtendedTableCursors16421( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_1641329( ) ;
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
         confirmValues1640( ) ;
      }
   }

   public void confirm_1641329( )
   {
      s28Com_ult = O28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1641329( ) ;
         if ( ( nRcdExists_1329 != 0 ) || ( nIsMod_1329 != 0 ) )
         {
            getKey1641329( ) ;
            if ( ( nRcdExists_1329 == 0 ) && ( nRcdDeleted_1329 == 0 ) )
            {
               if ( RcdFound1329 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1641329( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1641329( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1641329( 11) ;
                     }
                     closeExtendedTableCursors1641329( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O28Com_ult = A28Com_ult ;
                     n28Com_ult = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "COM_LIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCom_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1329 != 0 )
               {
                  if ( nRcdDeleted_1329 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1641329( ) ;
                     load1641329( ) ;
                     beforeValidate1641329( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1641329( ) ;
                        O28Com_ult = A28Com_ult ;
                        n28Com_ult = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1329 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1641329( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1641329( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1641329( 11) ;
                           }
                           closeExtendedTableCursors1641329( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O28Com_ult = A28Com_ult ;
                           n28Com_ult = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1329 == 0 )
                  {
                     GXCCtl = "COM_LIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCom_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1329_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_diav_Internalname, localUtil.ttoc( A31Com_diav, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCom_diae_Internalname, localUtil.ttoc( A36Com_diae, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCom_obs_Internalname, A41Com_obs) ;
         httpContext.changePostValue( edtCom_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_dsc_Internalname, GXutil.rtrim( A24Com_dsc)) ;
         httpContext.changePostValue( edtCom_Cont_Internalname, GXutil.rtrim( A608Com_Cont)) ;
         httpContext.changePostValue( "ZT_"+"Z29Com_lin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z36Com_diae_"+sGXsfl_45_idx, localUtil.ttoc( Z36Com_diae, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z31Com_diav_"+sGXsfl_45_idx, localUtil.ttoc( Z31Com_diav, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z41Com_obs_"+sGXsfl_45_idx, Z41Com_obs) ;
         httpContext.changePostValue( "ZT_"+"Z608Com_Cont_"+sGXsfl_45_idx, GXutil.rtrim( Z608Com_Cont)) ;
         httpContext.changePostValue( "ZT_"+"Z23Com_Cod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1329 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1329_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1329_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_LIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DIAV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diav_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DIAE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diae_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_OBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_COD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_CONT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O28Com_ult = s28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1640( )
   {
   }

   public void e111642( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tviscli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tviscli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tviscli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "N Informe", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Dia Visita", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Dia Entrada Inf", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV18Lit6 = httpContext.getMessage( "Tipo Visita", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV19Lit7 = httpContext.getMessage( "Persona Contacto", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      AV20Lit8 = httpContext.getMessage( "Texto", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tviscli_impl.this.A396EmprCod = GXv_char2[0] ;
      tviscli_impl.this.AV11EmprNom = GXv_char3[0] ;
      tviscli_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121642( )
   {
      /* 'Imprimir Relatorio' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_int6[0] = A29Com_lin ;
         new app.rviscli(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
         tviscli_impl.this.A396EmprCod = GXv_char4[0] ;
         tviscli_impl.this.A252CliCod = GXv_int5[0] ;
         tviscli_impl.this.A29Com_lin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /*  Sending Event outputs  */
   }

   public void zm16421( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T01646_A279CliNom[0] ;
            Z28Com_ult = T01646_A28Com_ult[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z28Com_ult = A28Com_ult ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z28Com_ult = A28Com_ult ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCom_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_ult_Enabled), 5, 0), true);
      AV33Pgmname = "TVISCLI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCom_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_ult_Enabled), 5, 0), true);
      /* Using cursor T01647 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01647_A407EmprNom[0] ;
      n407EmprNom = T01647_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load16421( )
   {
      /* Using cursor T01648 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T01648_A407EmprNom[0] ;
         n407EmprNom = T01648_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01648_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A28Com_ult = T01648_A28Com_ult[0] ;
         n28Com_ult = T01648_n28Com_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         zm16421( -8) ;
      }
      pr_default.close(6);
      onLoadActions16421( ) ;
   }

   public void onLoadActions16421( )
   {
   }

   public void checkExtendedTable16421( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16421( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16421( )
   {
      /* Using cursor T01649 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01646 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T01646_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01646_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16421( 8) ;
         RcdFound21 = (short)(1) ;
         A279CliNom = T01646_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A28Com_ult = T01646_A28Com_ult[0] ;
         n28Com_ult = T01646_n28Com_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         O28Com_ult = A28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16421( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey16421( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey16421( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16421( ) ;
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
      /* Using cursor T016410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T016410_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016410_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T016410_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016410_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T016411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016411_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016411_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16421( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A28Com_ult = O28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         GX_FocusControl = edtCliNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16421( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A28Com_ult = O28Com_ult ;
               n28Com_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A28Com_ult = O28Com_ult ;
               n28Com_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
               update16421( ) ;
               GX_FocusControl = edtCliNom_Internalname ;
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
               A28Com_ult = O28Com_ult ;
               n28Com_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
               GX_FocusControl = edtCliNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16421( ) ;
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
                  A28Com_ult = O28Com_ult ;
                  n28Com_ult = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
                  GX_FocusControl = edtCliNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16421( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A28Com_ult = O28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliNom_Internalname ;
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
      getKey16421( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tviscli");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1640( ) ;
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
      scanStart16421( ) ;
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
      scanEnd16421( ) ;
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
      scanStart16421( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext16421( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16421( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16421( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01645 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T01645_A279CliNom[0]) != 0 ) || ( Z28Com_ult != T01645_A28Com_ult[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T01645_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T01645_A279CliNom[0]);
            }
            if ( Z28Com_ult != T01645_A28Com_ult[0] )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_ult");
               GXutil.writeLogRaw("Old: ",Z28Com_ult);
               GXutil.writeLogRaw("Current: ",T01645_A28Com_ult[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16421( )
   {
      beforeValidate16421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16421( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16421( 0) ;
         checkOptimisticConcurrency16421( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16421( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016412 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n28Com_ult), Integer.valueOf(A28Com_ult), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevel16421( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1640( ) ;
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
            load16421( ) ;
         }
         endLevel16421( ) ;
      }
      closeExtendedTableCursors16421( ) ;
   }

   public void update16421( )
   {
      beforeValidate16421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16421( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16421( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16421( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016413 */
                  pr_default.execute(11, new Object[] {A279CliNom, Boolean.valueOf(n28Com_ult), Integer.valueOf(A28Com_ult), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16421( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16421( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1640( ) ;
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
         endLevel16421( ) ;
      }
      closeExtendedTableCursors16421( ) ;
   }

   public void deferredUpdate16421( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16421( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16421( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16421( ) ;
         afterConfirm16421( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16421( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016414 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
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
                        initAll16421( ) ;
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
                     resetCaption1640( ) ;
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
      endLevel16421( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16421( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1641329( )
   {
      s28Com_ult = O28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1641329( ) ;
         if ( ( nRcdExists_1329 != 0 ) || ( nIsMod_1329 != 0 ) )
         {
            standaloneNotModal1641329( ) ;
            getKey1641329( ) ;
            if ( ( nRcdExists_1329 == 0 ) && ( nRcdDeleted_1329 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1641329( ) ;
            }
            else
            {
               if ( RcdFound1329 != 0 )
               {
                  if ( ( nRcdDeleted_1329 != 0 ) && ( nRcdExists_1329 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1641329( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1329 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1641329( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1329 == 0 )
                  {
                     GXCCtl = "COM_LIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCom_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O28Com_ult = A28Com_ult ;
            n28Com_ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1329_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_diav_Internalname, localUtil.ttoc( A31Com_diav, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCom_diae_Internalname, localUtil.ttoc( A36Com_diae, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCom_obs_Internalname, A41Com_obs) ;
         httpContext.changePostValue( edtCom_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCom_dsc_Internalname, GXutil.rtrim( A24Com_dsc)) ;
         httpContext.changePostValue( edtCom_Cont_Internalname, GXutil.rtrim( A608Com_Cont)) ;
         httpContext.changePostValue( "ZT_"+"Z29Com_lin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z36Com_diae_"+sGXsfl_45_idx, localUtil.ttoc( Z36Com_diae, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z31Com_diav_"+sGXsfl_45_idx, localUtil.ttoc( Z31Com_diav, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z41Com_obs_"+sGXsfl_45_idx, Z41Com_obs) ;
         httpContext.changePostValue( "ZT_"+"Z608Com_Cont_"+sGXsfl_45_idx, GXutil.rtrim( Z608Com_Cont)) ;
         httpContext.changePostValue( "ZT_"+"Z23Com_Cod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1329_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1329 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1329_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1329_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_LIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DIAV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diav_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DIAE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diae_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_OBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_COD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_DSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COM_CONT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1641329( ) ;
      if ( AnyError != 0 )
      {
         O28Com_ult = s28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      }
      nRcdExists_1329 = (short)(0) ;
      nIsMod_1329 = (short)(0) ;
      nRcdDeleted_1329 = (short)(0) ;
   }

   public void processLevel16421( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel1641329( ) ;
      if ( AnyError != 0 )
      {
         O28Com_ult = s28Com_ult ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T016415 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n28Com_ult), Integer.valueOf(A28Com_ult), A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel16421( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete16421( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tviscli");
         if ( AnyError == 0 )
         {
            confirmValues1640( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tviscli");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16421( )
   {
      /* Scan By routine */
      /* Using cursor T016416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16421( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
   }

   public void scanEnd16421( )
   {
      pr_default.close(14);
   }

   public void afterConfirm16421( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16421( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16421( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16421( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16421( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16421( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16421( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtCom_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_ult_Enabled), 5, 0), true);
   }

   public void zm1641329( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z36Com_diae = T01643_A36Com_diae[0] ;
            Z31Com_diav = T01643_A31Com_diav[0] ;
            Z41Com_obs = T01643_A41Com_obs[0] ;
            Z608Com_Cont = T01643_A608Com_Cont[0] ;
            Z23Com_Cod = T01643_A23Com_Cod[0] ;
         }
         else
         {
            Z36Com_diae = A36Com_diae ;
            Z31Com_diav = A31Com_diav ;
            Z41Com_obs = A41Com_obs ;
            Z608Com_Cont = A608Com_Cont ;
            Z23Com_Cod = A23Com_Cod ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z29Com_lin = A29Com_lin ;
         Z36Com_diae = A36Com_diae ;
         Z31Com_diav = A31Com_diav ;
         Z41Com_obs = A41Com_obs ;
         Z608Com_Cont = A608Com_Cont ;
         Z396EmprCod = A396EmprCod ;
         Z23Com_Cod = A23Com_Cod ;
         Z24Com_dsc = A24Com_dsc ;
      }
   }

   public void standaloneNotModal1641329( )
   {
      edtCom_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_ult_Enabled), 5, 0), true);
      edtCom_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_ult_Enabled), 5, 0), true);
   }

   public void standaloneModal1641329( )
   {
      if ( isIns( )  )
      {
         A28Com_ult = (int)(O28Com_ult+1) ;
         n28Com_ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A29Com_lin = A28Com_ult ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A36Com_diae) && ( Gx_BScreen == 0 ) )
      {
         A36Com_diae = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n36Com_diae = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCom_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCom_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_lin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtCom_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCom_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_lin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1641329( )
   {
      /* Using cursor T016417 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1329 = (short)(1) ;
         A36Com_diae = T016417_A36Com_diae[0] ;
         n36Com_diae = T016417_n36Com_diae[0] ;
         A31Com_diav = T016417_A31Com_diav[0] ;
         n31Com_diav = T016417_n31Com_diav[0] ;
         A41Com_obs = T016417_A41Com_obs[0] ;
         n41Com_obs = T016417_n41Com_obs[0] ;
         A24Com_dsc = T016417_A24Com_dsc[0] ;
         n24Com_dsc = T016417_n24Com_dsc[0] ;
         A608Com_Cont = T016417_A608Com_Cont[0] ;
         n608Com_Cont = T016417_n608Com_Cont[0] ;
         A23Com_Cod = T016417_A23Com_Cod[0] ;
         n23Com_Cod = T016417_n23Com_Cod[0] ;
         zm1641329( -10) ;
      }
      pr_default.close(15);
      onLoadActions1641329( ) ;
   }

   public void onLoadActions1641329( )
   {
   }

   public void checkExtendedTable1641329( )
   {
      nIsDirty_1329 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1641329( ) ;
      /* Using cursor T01644 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "COM_COD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A24Com_dsc = T01644_A24Com_dsc[0] ;
      n24Com_dsc = T01644_n24Com_dsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1641329( )
   {
      pr_default.close(2);
   }

   public void enableDisable1641329( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          byte A23Com_Cod )
   {
      /* Using cursor T016418 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "COM_COD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A24Com_dsc = T016418_A24Com_dsc[0] ;
      n24Com_dsc = T016418_n24Com_dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A24Com_dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1641329( )
   {
      /* Using cursor T016419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1329 = (short)(1) ;
      }
      else
      {
         RcdFound1329 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1641329( )
   {
      /* Using cursor T01643 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01643_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01643_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1641329( 10) ;
         RcdFound1329 = (short)(1) ;
         initializeNonKey1641329( ) ;
         A29Com_lin = T01643_A29Com_lin[0] ;
         A36Com_diae = T01643_A36Com_diae[0] ;
         n36Com_diae = T01643_n36Com_diae[0] ;
         A31Com_diav = T01643_A31Com_diav[0] ;
         n31Com_diav = T01643_n31Com_diav[0] ;
         A41Com_obs = T01643_A41Com_obs[0] ;
         n41Com_obs = T01643_n41Com_obs[0] ;
         A608Com_Cont = T01643_A608Com_Cont[0] ;
         n608Com_Cont = T01643_n608Com_Cont[0] ;
         A23Com_Cod = T01643_A23Com_Cod[0] ;
         n23Com_Cod = T01643_n23Com_Cod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z29Com_lin = A29Com_lin ;
         sMode1329 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1641329( ) ;
         load1641329( ) ;
         Gx_mode = sMode1329 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1329 = (short)(0) ;
         initializeNonKey1641329( ) ;
         sMode1329 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1641329( ) ;
         Gx_mode = sMode1329 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1641329( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1641329( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01642 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVISCLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z36Com_diae, T01642_A36Com_diae[0]) ) || !( GXutil.dateCompare(Z31Com_diav, T01642_A31Com_diav[0]) ) || ( GXutil.strcmp(Z41Com_obs, T01642_A41Com_obs[0]) != 0 ) || ( GXutil.strcmp(Z608Com_Cont, T01642_A608Com_Cont[0]) != 0 ) || ( Z23Com_Cod != T01642_A23Com_Cod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z36Com_diae, T01642_A36Com_diae[0]) ) )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_diae");
               GXutil.writeLogRaw("Old: ",Z36Com_diae);
               GXutil.writeLogRaw("Current: ",T01642_A36Com_diae[0]);
            }
            if ( !( GXutil.dateCompare(Z31Com_diav, T01642_A31Com_diav[0]) ) )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_diav");
               GXutil.writeLogRaw("Old: ",Z31Com_diav);
               GXutil.writeLogRaw("Current: ",T01642_A31Com_diav[0]);
            }
            if ( GXutil.strcmp(Z41Com_obs, T01642_A41Com_obs[0]) != 0 )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_obs");
               GXutil.writeLogRaw("Old: ",Z41Com_obs);
               GXutil.writeLogRaw("Current: ",T01642_A41Com_obs[0]);
            }
            if ( GXutil.strcmp(Z608Com_Cont, T01642_A608Com_Cont[0]) != 0 )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_Cont");
               GXutil.writeLogRaw("Old: ",Z608Com_Cont);
               GXutil.writeLogRaw("Current: ",T01642_A608Com_Cont[0]);
            }
            if ( Z23Com_Cod != T01642_A23Com_Cod[0] )
            {
               GXutil.writeLogln("tviscli:[seudo value changed for attri]"+"Com_Cod");
               GXutil.writeLogRaw("Old: ",Z23Com_Cod);
               GXutil.writeLogRaw("Current: ",T01642_A23Com_Cod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVISCLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1641329( )
   {
      beforeValidate1641329( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641329( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1641329( 0) ;
         checkOptimisticConcurrency1641329( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1641329( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1641329( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016420 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin), Boolean.valueOf(n36Com_diae), A36Com_diae, Boolean.valueOf(n31Com_diav), A31Com_diav, Boolean.valueOf(n41Com_obs), A41Com_obs, Boolean.valueOf(n608Com_Cont), A608Com_Cont, A396EmprCod, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVISCLI");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load1641329( ) ;
         }
         endLevel1641329( ) ;
      }
      closeExtendedTableCursors1641329( ) ;
   }

   public void update1641329( )
   {
      beforeValidate1641329( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641329( ) ;
      }
      if ( ( nIsMod_1329 != 0 ) || ( nIsDirty_1329 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1641329( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1641329( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1641329( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016421 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n36Com_diae), A36Com_diae, Boolean.valueOf(n31Com_diav), A31Com_diav, Boolean.valueOf(n41Com_obs), A41Com_obs, Boolean.valueOf(n608Com_Cont), A608Com_Cont, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod), A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVISCLI");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVISCLI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1641329( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1641329( ) ;
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
            endLevel1641329( ) ;
         }
      }
      closeExtendedTableCursors1641329( ) ;
   }

   public void deferredUpdate1641329( )
   {
   }

   public void delete1641329( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1641329( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1641329( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1641329( ) ;
         afterConfirm1641329( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1641329( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016422 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A29Com_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVISCLI");
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
      sMode1329 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1641329( ) ;
      Gx_mode = sMode1329 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1641329( )
   {
      standaloneModal1641329( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod)});
         A24Com_dsc = T016423_A24Com_dsc[0] ;
         n24Com_dsc = T016423_n24Com_dsc[0] ;
         pr_default.close(21);
      }
   }

   public void endLevel1641329( )
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

   public void scanStart1641329( )
   {
      /* Scan By routine */
      /* Using cursor T016424 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      RcdFound1329 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1329 = (short)(1) ;
         A29Com_lin = T016424_A29Com_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1641329( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1329 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1329 = (short)(1) ;
         A29Com_lin = T016424_A29Com_lin[0] ;
      }
   }

   public void scanEnd1641329( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1641329( )
   {
      /* After Confirm Rules */
      if ( GXutil.dateCompare(GXutil.nullDate(), A31Com_diav) && true /* After */ )
      {
         GXCCtl = "COM_DIAV_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto en Dia Visita", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_diav_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1641329( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1641329( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1641329( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1641329( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1641329( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1641329( )
   {
      edtCom_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_lin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_diav_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_diav_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_diav_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_diae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_diae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_diae_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_obs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_Cod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_dsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCom_Cont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_Cont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_Cont_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1641329( )
   {
   }

   public void send_integrity_lvl_hashes16421( )
   {
   }

   public void subsflControlProps_451329( )
   {
      edtavnRcdDeleted_1329_Internalname = "vNRCDDELETED_1329_"+sGXsfl_45_idx ;
      edtCom_lin_Internalname = "COM_LIN_"+sGXsfl_45_idx ;
      edtCom_diav_Internalname = "COM_DIAV_"+sGXsfl_45_idx ;
      edtCom_diae_Internalname = "COM_DIAE_"+sGXsfl_45_idx ;
      edtCom_obs_Internalname = "COM_OBS_"+sGXsfl_45_idx ;
      edtCom_Cod_Internalname = "COM_COD_"+sGXsfl_45_idx ;
      edtCom_dsc_Internalname = "COM_DSC_"+sGXsfl_45_idx ;
      edtCom_Cont_Internalname = "COM_CONT_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451329( )
   {
      edtavnRcdDeleted_1329_Internalname = "vNRCDDELETED_1329_"+sGXsfl_45_fel_idx ;
      edtCom_lin_Internalname = "COM_LIN_"+sGXsfl_45_fel_idx ;
      edtCom_diav_Internalname = "COM_DIAV_"+sGXsfl_45_fel_idx ;
      edtCom_diae_Internalname = "COM_DIAE_"+sGXsfl_45_fel_idx ;
      edtCom_obs_Internalname = "COM_OBS_"+sGXsfl_45_fel_idx ;
      edtCom_Cod_Internalname = "COM_COD_"+sGXsfl_45_fel_idx ;
      edtCom_dsc_Internalname = "COM_DSC_"+sGXsfl_45_fel_idx ;
      edtCom_Cont_Internalname = "COM_CONT_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1641329( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451329( ) ;
      sendRow1641329( ) ;
   }

   public void sendRow1641329( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1329_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1329_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1329), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1329), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1329_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1329_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A29Com_lin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_diav_Internalname,localUtil.ttoc( A31Com_diav, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A31Com_diav, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_diav_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_diav_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_diae_Internalname,localUtil.ttoc( A36Com_diae, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A36Com_diae, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_diae_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_diae_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_obs_Internalname,A41Com_obs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(800),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCom_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A23Com_Cod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A23Com_Cod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_Cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_Cod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_dsc_Internalname,GXutil.rtrim( A24Com_dsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1329_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCom_Cont_Internalname,GXutil.rtrim( A608Com_Cont),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCom_Cont_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCom_Cont_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1641329( ) ;
      GXCCtl = "Z29Com_lin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z29Com_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z36Com_diae_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z36Com_diae, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z31Com_diav_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z31Com_diav, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z41Com_obs_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z41Com_obs);
      GXCCtl = "Z608Com_Cont_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z608Com_Cont));
      GXCCtl = "Z23Com_Cod_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z23Com_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1329_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1329_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1329_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1329, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1329_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1329_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_LIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_DIAV_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diav_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_DIAE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diae_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_OBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_COD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_DSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COM_CONT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cont_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1641329( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451329( ) ;
      edtavnRcdDeleted_1329_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1329_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_LIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_diav_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DIAV_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_diae_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DIAE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_OBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_COD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_DSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCom_Cont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COM_CONT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1329_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1329_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1329");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1329_Internalname ;
         wbErr = true ;
         nRcdDeleted_1329 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1329 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1329_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCom_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCom_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "COM_LIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_lin_Internalname ;
         wbErr = true ;
         A29Com_lin = 0 ;
      }
      else
      {
         A29Com_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtCom_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtCom_diav_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "COM_DIAV_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_diav_Internalname ;
         wbErr = true ;
         A31Com_diav = GXutil.resetTime( GXutil.nullDate() );
         n31Com_diav = false ;
      }
      else
      {
         A31Com_diav = localUtil.ctot( httpContext.cgiGet( edtCom_diav_Internalname)) ;
         n31Com_diav = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtCom_diae_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "COM_DIAE_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_diae_Internalname ;
         wbErr = true ;
         A36Com_diae = GXutil.resetTime( GXutil.nullDate() );
         n36Com_diae = false ;
      }
      else
      {
         A36Com_diae = localUtil.ctot( httpContext.cgiGet( edtCom_diae_Internalname)) ;
         n36Com_diae = false ;
      }
      A41Com_obs = httpContext.cgiGet( edtCom_obs_Internalname) ;
      n41Com_obs = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCom_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCom_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "COM_COD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_Cod_Internalname ;
         wbErr = true ;
         A23Com_Cod = (byte)(0) ;
         n23Com_Cod = false ;
      }
      else
      {
         A23Com_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCom_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n23Com_Cod = false ;
      }
      A24Com_dsc = httpContext.cgiGet( edtCom_dsc_Internalname) ;
      n24Com_dsc = false ;
      A608Com_Cont = httpContext.cgiGet( edtCom_Cont_Internalname) ;
      n608Com_Cont = false ;
      GXCCtl = "Z29Com_lin_" + sGXsfl_45_idx ;
      Z29Com_lin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z36Com_diae_" + sGXsfl_45_idx ;
      Z36Com_diae = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z31Com_diav_" + sGXsfl_45_idx ;
      Z31Com_diav = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z41Com_obs_" + sGXsfl_45_idx ;
      Z41Com_obs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z608Com_Cont_" + sGXsfl_45_idx ;
      Z608Com_Cont = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z23Com_Cod_" + sGXsfl_45_idx ;
      Z23Com_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1329_" + sGXsfl_45_idx ;
      nRcdDeleted_1329 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1329_" + sGXsfl_45_idx ;
      nRcdExists_1329 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1329_" + sGXsfl_45_idx ;
      nIsMod_1329 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCom_lin_Enabled = edtCom_lin_Enabled ;
   }

   public void confirmValues1640( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451329( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451329( ) ;
         httpContext.changePostValue( "Z29Com_lin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z29Com_lin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z29Com_lin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z36Com_diae_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z36Com_diae_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z36Com_diae_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z31Com_diav_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z31Com_diav_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z31Com_diav_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z41Com_obs_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z41Com_obs_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z41Com_obs_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z608Com_Cont_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z608Com_Cont_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z608Com_Cont_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z23Com_Cod_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z23Com_Cod_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z23Com_Cod_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tviscli", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"EmprCod","CliCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z28Com_ult", GXutil.ltrim( localUtil.ntoc( Z28Com_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O28Com_ult", GXutil.ltrim( localUtil.ntoc( O28Com_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      return formatLink("app.tviscli", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "TVISCLI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONTROL VISITAS CLIENTES", "") ;
   }

   public void initializeNonKey16421( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A28Com_ult = 0 ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      O28Com_ult = A28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      Z279CliNom = "" ;
      Z28Com_ult = 0 ;
   }

   public void initAll16421( )
   {
      initializeNonKey16421( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1641329( )
   {
      A31Com_diav = GXutil.resetTime( GXutil.nullDate() );
      n31Com_diav = false ;
      A41Com_obs = "" ;
      n41Com_obs = false ;
      A23Com_Cod = (byte)(0) ;
      n23Com_Cod = false ;
      A24Com_dsc = "" ;
      n24Com_dsc = false ;
      A608Com_Cont = "" ;
      n608Com_Cont = false ;
      A36Com_diae = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n36Com_diae = false ;
      Z36Com_diae = GXutil.resetTime( GXutil.nullDate() );
      Z31Com_diav = GXutil.resetTime( GXutil.nullDate() );
      Z41Com_obs = "" ;
      Z608Com_Cont = "" ;
      Z23Com_Cod = (byte)(0) ;
   }

   public void initAll1641329( )
   {
      A29Com_lin = 0 ;
      initializeNonKey1641329( ) ;
   }

   public void standaloneModalInsert1641329( )
   {
      A28Com_ult = i28Com_ult ;
      n28Com_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A28Com_ult), 6, 0));
      A36Com_diae = i36Com_diae ;
      n36Com_diae = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241544427", true, true);
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
      httpContext.AddJavascriptSource("tviscli.js", "?20268241544427", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1329( )
   {
      edtCom_lin_Enabled = defedtCom_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCom_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCom_lin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1329, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1329_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A29Com_lin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A31Com_diav, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diav_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A36Com_diae, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_diae_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A41Com_obs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A23Com_Cod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A24Com_dsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A608Com_Cont));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCom_Cont_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCom_ult_Internalname = "COM_ULT" ;
      edtavnRcdDeleted_1329_Internalname = "vNRCDDELETED_1329" ;
      edtCom_lin_Internalname = "COM_LIN" ;
      edtCom_diav_Internalname = "COM_DIAV" ;
      edtCom_diae_Internalname = "COM_DIAE" ;
      edtCom_obs_Internalname = "COM_OBS" ;
      edtCom_Cod_Internalname = "COM_COD" ;
      edtCom_dsc_Internalname = "COM_DSC" ;
      edtCom_Cont_Internalname = "COM_CONT" ;
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
      Form.setCaption( httpContext.getMessage( "CONTROL VISITAS CLIENTES", "") );
      edtCom_Cont_Jsonclick = "" ;
      edtCom_dsc_Jsonclick = "" ;
      edtCom_Cod_Jsonclick = "" ;
      edtCom_obs_Jsonclick = "" ;
      edtCom_diae_Jsonclick = "" ;
      edtCom_diav_Jsonclick = "" ;
      edtCom_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1329_Jsonclick = "" ;
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
      edtCom_Cont_Enabled = 1 ;
      edtCom_dsc_Enabled = 0 ;
      edtCom_Cod_Enabled = 1 ;
      edtCom_obs_Enabled = 1 ;
      edtCom_diae_Enabled = 1 ;
      edtCom_diav_Enabled = 1 ;
      edtCom_lin_Enabled = 1 ;
      edtavnRcdDeleted_1329_Enabled = 1 ;
      edtCom_ult_Jsonclick = "" ;
      edtCom_ult_Backcolor = (int)(0xFFFFFF) ;
      edtCom_ult_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_451329( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1641329( ) ;
         standaloneModal1641329( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1641329( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451329( ) ;
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
      /* Using cursor T016425 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016425_A407EmprNom[0] ;
      n407EmprNom = T016425_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
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

   public void valid_Clicod( )
   {
      n28Com_ult = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A28Com_ult", GXutil.ltrim( localUtil.ntoc( A28Com_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z28Com_ult", GXutil.ltrim( localUtil.ntoc( Z28Com_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O28Com_ult", GXutil.ltrim( localUtil.ntoc( O28Com_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Com_cod( )
   {
      n23Com_Cod = false ;
      n24Com_dsc = false ;
      /* Using cursor T016423 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n23Com_Cod), Byte.valueOf(A23Com_Cod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COM_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCom_Cod_Internalname ;
      }
      A24Com_dsc = T016423_A24Com_dsc[0] ;
      n24Com_dsc = T016423_n24Com_dsc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A24Com_dsc", GXutil.rtrim( A24Com_dsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'IMPRIMIR RELATORIO'","{handler:'e121642',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A29Com_lin',fld:'COM_LIN',pic:'ZZZZZ9'}]");
      setEventMetadata("'IMPRIMIR RELATORIO'",",oparms:[{av:'A29Com_lin',fld:'COM_LIN',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A28Com_ult',fld:'COM_ULT',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A28Com_ult',fld:'COM_ULT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z28Com_ult'},{av:'O28Com_ult'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COM_ULT","{handler:'valid_Com_ult',iparms:[]");
      setEventMetadata("VALID_COM_ULT",",oparms:[]}");
      setEventMetadata("VALID_COM_LIN","{handler:'valid_Com_lin',iparms:[]");
      setEventMetadata("VALID_COM_LIN",",oparms:[]}");
      setEventMetadata("VALID_COM_DIAV","{handler:'valid_Com_diav',iparms:[]");
      setEventMetadata("VALID_COM_DIAV",",oparms:[]}");
      setEventMetadata("VALID_COM_COD","{handler:'valid_Com_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A23Com_Cod',fld:'COM_COD',pic:'Z9'},{av:'A24Com_dsc',fld:'COM_DSC',pic:''}]");
      setEventMetadata("VALID_COM_COD",",oparms:[{av:'A24Com_dsc',fld:'COM_DSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Com_cont',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z36Com_diae = GXutil.resetTime( GXutil.nullDate() );
      Z31Com_diav = GXutil.resetTime( GXutil.nullDate() );
      Z41Com_obs = "" ;
      Z608Com_Cont = "" ;
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
      sMode1329 = "" ;
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
      sMode21 = "" ;
      GXCCtl = "" ;
      A31Com_diav = GXutil.resetTime( GXutil.nullDate() );
      A36Com_diae = GXutil.resetTime( GXutil.nullDate() );
      A41Com_obs = "" ;
      A24Com_dsc = "" ;
      A608Com_Cont = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      Z407EmprNom = "" ;
      T01647_A407EmprNom = new String[] {""} ;
      T01647_n407EmprNom = new boolean[] {false} ;
      T01648_A252CliCod = new int[1] ;
      T01648_A407EmprNom = new String[] {""} ;
      T01648_n407EmprNom = new boolean[] {false} ;
      T01648_A279CliNom = new String[] {""} ;
      T01648_A28Com_ult = new int[1] ;
      T01648_n28Com_ult = new boolean[] {false} ;
      T01648_A396EmprCod = new String[] {""} ;
      T01649_A396EmprCod = new String[] {""} ;
      T01649_A252CliCod = new int[1] ;
      T01646_A252CliCod = new int[1] ;
      T01646_A279CliNom = new String[] {""} ;
      T01646_A28Com_ult = new int[1] ;
      T01646_n28Com_ult = new boolean[] {false} ;
      T01646_A396EmprCod = new String[] {""} ;
      T016410_A396EmprCod = new String[] {""} ;
      T016410_A252CliCod = new int[1] ;
      T016411_A396EmprCod = new String[] {""} ;
      T016411_A252CliCod = new int[1] ;
      T01645_A252CliCod = new int[1] ;
      T01645_A279CliNom = new String[] {""} ;
      T01645_A28Com_ult = new int[1] ;
      T01645_n28Com_ult = new boolean[] {false} ;
      T01645_A396EmprCod = new String[] {""} ;
      T016416_A396EmprCod = new String[] {""} ;
      T016416_A252CliCod = new int[1] ;
      Z24Com_dsc = "" ;
      T016417_A252CliCod = new int[1] ;
      T016417_A29Com_lin = new int[1] ;
      T016417_A36Com_diae = new java.util.Date[] {GXutil.nullDate()} ;
      T016417_n36Com_diae = new boolean[] {false} ;
      T016417_A31Com_diav = new java.util.Date[] {GXutil.nullDate()} ;
      T016417_n31Com_diav = new boolean[] {false} ;
      T016417_A41Com_obs = new String[] {""} ;
      T016417_n41Com_obs = new boolean[] {false} ;
      T016417_A24Com_dsc = new String[] {""} ;
      T016417_n24Com_dsc = new boolean[] {false} ;
      T016417_A608Com_Cont = new String[] {""} ;
      T016417_n608Com_Cont = new boolean[] {false} ;
      T016417_A396EmprCod = new String[] {""} ;
      T016417_A23Com_Cod = new byte[1] ;
      T016417_n23Com_Cod = new boolean[] {false} ;
      T01644_A24Com_dsc = new String[] {""} ;
      T01644_n24Com_dsc = new boolean[] {false} ;
      T016418_A24Com_dsc = new String[] {""} ;
      T016418_n24Com_dsc = new boolean[] {false} ;
      T016419_A396EmprCod = new String[] {""} ;
      T016419_A252CliCod = new int[1] ;
      T016419_A29Com_lin = new int[1] ;
      T01643_A252CliCod = new int[1] ;
      T01643_A29Com_lin = new int[1] ;
      T01643_A36Com_diae = new java.util.Date[] {GXutil.nullDate()} ;
      T01643_n36Com_diae = new boolean[] {false} ;
      T01643_A31Com_diav = new java.util.Date[] {GXutil.nullDate()} ;
      T01643_n31Com_diav = new boolean[] {false} ;
      T01643_A41Com_obs = new String[] {""} ;
      T01643_n41Com_obs = new boolean[] {false} ;
      T01643_A608Com_Cont = new String[] {""} ;
      T01643_n608Com_Cont = new boolean[] {false} ;
      T01643_A396EmprCod = new String[] {""} ;
      T01643_A23Com_Cod = new byte[1] ;
      T01643_n23Com_Cod = new boolean[] {false} ;
      T01642_A252CliCod = new int[1] ;
      T01642_A29Com_lin = new int[1] ;
      T01642_A36Com_diae = new java.util.Date[] {GXutil.nullDate()} ;
      T01642_n36Com_diae = new boolean[] {false} ;
      T01642_A31Com_diav = new java.util.Date[] {GXutil.nullDate()} ;
      T01642_n31Com_diav = new boolean[] {false} ;
      T01642_A41Com_obs = new String[] {""} ;
      T01642_n41Com_obs = new boolean[] {false} ;
      T01642_A608Com_Cont = new String[] {""} ;
      T01642_n608Com_Cont = new boolean[] {false} ;
      T01642_A396EmprCod = new String[] {""} ;
      T01642_A23Com_Cod = new byte[1] ;
      T01642_n23Com_Cod = new boolean[] {false} ;
      T016423_A24Com_dsc = new String[] {""} ;
      T016423_n24Com_dsc = new boolean[] {false} ;
      T016424_A396EmprCod = new String[] {""} ;
      T016424_A252CliCod = new int[1] ;
      T016424_A29Com_lin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i36Com_diae = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016425_A407EmprNom = new String[] {""} ;
      T016425_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tviscli__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tviscli__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tviscli__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tviscli__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tviscli__default(),
         new Object[] {
             new Object[] {
            T01642_A252CliCod, T01642_A29Com_lin, T01642_A36Com_diae, T01642_n36Com_diae, T01642_A31Com_diav, T01642_n31Com_diav, T01642_A41Com_obs, T01642_n41Com_obs, T01642_A608Com_Cont, T01642_n608Com_Cont,
            T01642_A396EmprCod, T01642_A23Com_Cod, T01642_n23Com_Cod
            }
            , new Object[] {
            T01643_A252CliCod, T01643_A29Com_lin, T01643_A36Com_diae, T01643_n36Com_diae, T01643_A31Com_diav, T01643_n31Com_diav, T01643_A41Com_obs, T01643_n41Com_obs, T01643_A608Com_Cont, T01643_n608Com_Cont,
            T01643_A396EmprCod, T01643_A23Com_Cod, T01643_n23Com_Cod
            }
            , new Object[] {
            T01644_A24Com_dsc, T01644_n24Com_dsc
            }
            , new Object[] {
            T01645_A252CliCod, T01645_A279CliNom, T01645_A28Com_ult, T01645_n28Com_ult, T01645_A396EmprCod
            }
            , new Object[] {
            T01646_A252CliCod, T01646_A279CliNom, T01646_A28Com_ult, T01646_n28Com_ult, T01646_A396EmprCod
            }
            , new Object[] {
            T01647_A407EmprNom, T01647_n407EmprNom
            }
            , new Object[] {
            T01648_A252CliCod, T01648_A407EmprNom, T01648_n407EmprNom, T01648_A279CliNom, T01648_A28Com_ult, T01648_n28Com_ult, T01648_A396EmprCod
            }
            , new Object[] {
            T01649_A396EmprCod, T01649_A252CliCod
            }
            , new Object[] {
            T016410_A396EmprCod, T016410_A252CliCod
            }
            , new Object[] {
            T016411_A396EmprCod, T016411_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016416_A396EmprCod, T016416_A252CliCod
            }
            , new Object[] {
            T016417_A252CliCod, T016417_A29Com_lin, T016417_A36Com_diae, T016417_n36Com_diae, T016417_A31Com_diav, T016417_n31Com_diav, T016417_A41Com_obs, T016417_n41Com_obs, T016417_A24Com_dsc, T016417_n24Com_dsc,
            T016417_A608Com_Cont, T016417_n608Com_Cont, T016417_A396EmprCod, T016417_A23Com_Cod, T016417_n23Com_Cod
            }
            , new Object[] {
            T016418_A24Com_dsc, T016418_n24Com_dsc
            }
            , new Object[] {
            T016419_A396EmprCod, T016419_A252CliCod, T016419_A29Com_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016423_A24Com_dsc, T016423_n24Com_dsc
            }
            , new Object[] {
            T016424_A396EmprCod, T016424_A252CliCod, T016424_A29Com_lin
            }
            , new Object[] {
            T016425_A407EmprNom, T016425_n407EmprNom
            }
         }
      );
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TVISCLI" ;
      Z36Com_diae = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n36Com_diae = false ;
      A36Com_diae = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n36Com_diae = false ;
      i36Com_diae = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n36Com_diae = false ;
   }

   private byte Z23Com_Cod ;
   private byte GxWebError ;
   private byte A23Com_Cod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1329 ;
   private short nRcdExists_1329 ;
   private short nIsMod_1329 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1329 ;
   private short RcdFound1329 ;
   private short nBlankRcdUsr1329 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_1329 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int Z28Com_ult ;
   private int O28Com_ult ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z29Com_lin ;
   private int A252CliCod ;
   private int trnEnded ;
   private int A28Com_ult ;
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
   private int edtCom_ult_Enabled ;
   private int B28Com_ult ;
   private int edtavnRcdDeleted_1329_Enabled ;
   private int edtCom_lin_Enabled ;
   private int edtCom_diav_Enabled ;
   private int edtCom_diae_Enabled ;
   private int edtCom_obs_Enabled ;
   private int edtCom_Cod_Enabled ;
   private int edtCom_dsc_Enabled ;
   private int edtCom_Cont_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s28Com_ult ;
   private int A29Com_lin ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCom_lin_Enabled ;
   private int i28Com_ult ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCom_ult_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ28Com_ult ;
   private int ZO28Com_ult ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z608Com_Cont ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliNom_Internalname ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCom_ult_Internalname ;
   private String edtCom_ult_Jsonclick ;
   private String sMode1329 ;
   private String edtavnRcdDeleted_1329_Internalname ;
   private String edtCom_lin_Internalname ;
   private String edtCom_diav_Internalname ;
   private String edtCom_diae_Internalname ;
   private String edtCom_obs_Internalname ;
   private String edtCom_Cod_Internalname ;
   private String edtCom_dsc_Internalname ;
   private String edtCom_Cont_Internalname ;
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
   private String sMode21 ;
   private String GXCCtl ;
   private String A24Com_dsc ;
   private String A608Com_Cont ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z24Com_dsc ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1329_Jsonclick ;
   private String edtCom_lin_Jsonclick ;
   private String edtCom_diav_Jsonclick ;
   private String edtCom_diae_Jsonclick ;
   private String edtCom_obs_Jsonclick ;
   private String edtCom_Cod_Jsonclick ;
   private String edtCom_dsc_Jsonclick ;
   private String edtCom_Cont_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private java.util.Date Z36Com_diae ;
   private java.util.Date Z31Com_diav ;
   private java.util.Date A31Com_diav ;
   private java.util.Date A36Com_diae ;
   private java.util.Date i36Com_diae ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n23Com_Cod ;
   private boolean wbErr ;
   private boolean n28Com_ult ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n36Com_diae ;
   private boolean n31Com_diav ;
   private boolean n41Com_obs ;
   private boolean n24Com_dsc ;
   private boolean n608Com_Cont ;
   private String Z41Com_obs ;
   private String A41Com_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01647_A407EmprNom ;
   private boolean[] T01647_n407EmprNom ;
   private int[] T01648_A252CliCod ;
   private String[] T01648_A407EmprNom ;
   private boolean[] T01648_n407EmprNom ;
   private String[] T01648_A279CliNom ;
   private int[] T01648_A28Com_ult ;
   private boolean[] T01648_n28Com_ult ;
   private String[] T01648_A396EmprCod ;
   private String[] T01649_A396EmprCod ;
   private int[] T01649_A252CliCod ;
   private int[] T01646_A252CliCod ;
   private String[] T01646_A279CliNom ;
   private int[] T01646_A28Com_ult ;
   private boolean[] T01646_n28Com_ult ;
   private String[] T01646_A396EmprCod ;
   private String[] T016410_A396EmprCod ;
   private int[] T016410_A252CliCod ;
   private String[] T016411_A396EmprCod ;
   private int[] T016411_A252CliCod ;
   private int[] T01645_A252CliCod ;
   private String[] T01645_A279CliNom ;
   private int[] T01645_A28Com_ult ;
   private boolean[] T01645_n28Com_ult ;
   private String[] T01645_A396EmprCod ;
   private String[] T016416_A396EmprCod ;
   private int[] T016416_A252CliCod ;
   private int[] T016417_A252CliCod ;
   private int[] T016417_A29Com_lin ;
   private java.util.Date[] T016417_A36Com_diae ;
   private boolean[] T016417_n36Com_diae ;
   private java.util.Date[] T016417_A31Com_diav ;
   private boolean[] T016417_n31Com_diav ;
   private String[] T016417_A41Com_obs ;
   private boolean[] T016417_n41Com_obs ;
   private String[] T016417_A24Com_dsc ;
   private boolean[] T016417_n24Com_dsc ;
   private String[] T016417_A608Com_Cont ;
   private boolean[] T016417_n608Com_Cont ;
   private String[] T016417_A396EmprCod ;
   private byte[] T016417_A23Com_Cod ;
   private boolean[] T016417_n23Com_Cod ;
   private String[] T01644_A24Com_dsc ;
   private boolean[] T01644_n24Com_dsc ;
   private String[] T016418_A24Com_dsc ;
   private boolean[] T016418_n24Com_dsc ;
   private String[] T016419_A396EmprCod ;
   private int[] T016419_A252CliCod ;
   private int[] T016419_A29Com_lin ;
   private int[] T01643_A252CliCod ;
   private int[] T01643_A29Com_lin ;
   private java.util.Date[] T01643_A36Com_diae ;
   private boolean[] T01643_n36Com_diae ;
   private java.util.Date[] T01643_A31Com_diav ;
   private boolean[] T01643_n31Com_diav ;
   private String[] T01643_A41Com_obs ;
   private boolean[] T01643_n41Com_obs ;
   private String[] T01643_A608Com_Cont ;
   private boolean[] T01643_n608Com_Cont ;
   private String[] T01643_A396EmprCod ;
   private byte[] T01643_A23Com_Cod ;
   private boolean[] T01643_n23Com_Cod ;
   private int[] T01642_A252CliCod ;
   private int[] T01642_A29Com_lin ;
   private java.util.Date[] T01642_A36Com_diae ;
   private boolean[] T01642_n36Com_diae ;
   private java.util.Date[] T01642_A31Com_diav ;
   private boolean[] T01642_n31Com_diav ;
   private String[] T01642_A41Com_obs ;
   private boolean[] T01642_n41Com_obs ;
   private String[] T01642_A608Com_Cont ;
   private boolean[] T01642_n608Com_Cont ;
   private String[] T01642_A396EmprCod ;
   private byte[] T01642_A23Com_Cod ;
   private boolean[] T01642_n23Com_Cod ;
   private String[] T016423_A24Com_dsc ;
   private boolean[] T016423_n24Com_dsc ;
   private String[] T016424_A396EmprCod ;
   private int[] T016424_A252CliCod ;
   private int[] T016424_A29Com_lin ;
   private String[] T016425_A407EmprNom ;
   private boolean[] T016425_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tviscli__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tviscli__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tviscli__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tviscli__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tviscli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01642", "SELECT CliCod, Com_lin, Com_diae, Com_diav, Com_obs, Com_Cont, EmprCod, Com_Cod FROM TXPVISCLI WHERE EmprCod = ? AND CliCod = ? AND Com_lin = ?  FOR UPDATE OF Com_diae, Com_diav, Com_obs, Com_Cont, Com_Cod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01643", "SELECT CliCod, Com_lin, Com_diae, Com_diav, Com_obs, Com_Cont, EmprCod, Com_Cod FROM TXPVISCLI WHERE EmprCod = ? AND CliCod = ? AND Com_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01644", "SELECT Com_dsc FROM TXPTIPVIS WHERE EmprCod = ? AND Com_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01645", "SELECT CliCod, CliNom, Com_ult, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, Com_ult NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01646", "SELECT CliCod, CliNom, Com_ult, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01647", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01648", "SELECT /*+ FIRST_ROWS(1) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.Com_ult, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01649", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016412", "INSERT INTO TXPCLIENT(CliCod, CliNom, Com_ult, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T016413", "UPDATE TXPCLIENT SET CliNom=?, Com_ult=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T016414", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T016415", "UPDATE TXPCLIENT SET Com_ult=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T016416", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016417", "SELECT T1.CliCod, T1.Com_lin, T1.Com_diae, T1.Com_diav, T1.Com_obs, T2.Com_dsc, T1.Com_Cont, T1.EmprCod, T1.Com_Cod FROM (TXPVISCLI T1 LEFT JOIN TXPTIPVIS T2 ON T2.EmprCod = T1.EmprCod AND T2.Com_Cod = T1.Com_Cod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.Com_lin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.Com_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016418", "SELECT Com_dsc FROM TXPTIPVIS WHERE EmprCod = ? AND Com_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016419", "SELECT EmprCod, CliCod, Com_lin FROM TXPVISCLI WHERE EmprCod = ? AND CliCod = ? AND Com_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016420", "INSERT INTO TXPVISCLI(CliCod, Com_lin, Com_diae, Com_diav, Com_obs, Com_Cont, EmprCod, Com_Cod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPVISCLI")
         ,new UpdateCursor("T016421", "UPDATE TXPVISCLI SET Com_diae=?, Com_diav=?, Com_obs=?, Com_Cont=?, Com_Cod=?  WHERE EmprCod = ? AND CliCod = ? AND Com_lin = ?", GX_NOMASK, "TXPVISCLI")
         ,new UpdateCursor("T016422", "DELETE FROM TXPVISCLI  WHERE EmprCod = ? AND CliCod = ? AND Com_lin = ?", GX_NOMASK, "TXPVISCLI")
         ,new ForEachCursor("T016423", "SELECT Com_dsc FROM TXPTIPVIS WHERE EmprCod = ? AND Com_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016424", "SELECT EmprCod, CliCod, Com_lin FROM TXPVISCLI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Com_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016425", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 800);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 40);
               }
               stmt.setString(7, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 800);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

