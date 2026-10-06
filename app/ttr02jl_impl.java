package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr02jl_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10272Hz_cod = httpContext.GetPar( "Hz_cod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A10272Hz_cod) ;
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ASOCIAR HILAZAS A ARTICULO", ""), (short)(0)) ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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

   public ttr02jl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr02jl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr02jl_impl.class ));
   }

   public ttr02jl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR02JL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1394 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1394 = (short)(1) ;
            scanStart17Q1394( ) ;
            while ( RcdFound1394 != 0 )
            {
               init_level_properties1394( ) ;
               getByPrimaryKey17Q1394( ) ;
               addRow17Q1394( ) ;
               scanNext17Q1394( ) ;
            }
            scanEnd17Q1394( ) ;
            nBlankRcdCount1394 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17Q1394( ) ;
         standaloneModal17Q1394( ) ;
         sMode1394 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow17Q1394( ) ;
            edtavnRcdDeleted_1394_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1394_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1394_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1394_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_COD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_cod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_clase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_CLASE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_clase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_clase_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_DESC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_desc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_descg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_DESCG_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_descg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_descg_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_PORC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_porc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtHz_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_PROV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHz_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_Prov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1394 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17Q1394( ) ;
            }
            sendRow17Q1394( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1394 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1394 = (short)(5) ;
         nRcdExists_1394 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17Q1394( ) ;
            while ( RcdFound1394 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401394( ) ;
               init_level_properties1394( ) ;
               standaloneNotModal17Q1394( ) ;
               getByPrimaryKey17Q1394( ) ;
               standaloneModal17Q1394( ) ;
               addRow17Q1394( ) ;
               scanNext17Q1394( ) ;
            }
            scanEnd17Q1394( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1394 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401394( ) ;
      initAll17Q1394( ) ;
      init_level_properties1394( ) ;
      nRcdExists_1394 = (short)(0) ;
      nIsMod_1394 = (short)(0) ;
      nRcdDeleted_1394 = (short)(0) ;
      nBlankRcdCount1394 = (short)(nBlankRcdUsr1394+nBlankRcdCount1394) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1394 > 0 )
      {
         standaloneNotModal17Q1394( ) ;
         standaloneModal17Q1394( ) ;
         addRow17Q1394( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHz_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1394 = (short)(nBlankRcdCount1394-1) ;
      }
      Gx_mode = sMode1394 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR02JL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR02JL.htm");
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
      e1117Q2 ();
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
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                        e1117Q2 ();
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
            initAll17Q10( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1394_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1394_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes17Q10( ) ;
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

   public void confirm_17Q0( )
   {
      beforeValidate17Q10( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17Q10( ) ;
         }
         else
         {
            checkExtendedTable17Q10( ) ;
            if ( AnyError == 0 )
            {
               zm17Q10( 2) ;
               zm17Q10( 3) ;
            }
            closeExtendedTableCursors17Q10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_17Q1394( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17Q0( ) ;
      }
   }

   public void confirm_17Q1394( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow17Q1394( ) ;
         if ( ( nRcdExists_1394 != 0 ) || ( nIsMod_1394 != 0 ) )
         {
            getKey17Q1394( ) ;
            if ( ( nRcdExists_1394 == 0 ) && ( nRcdDeleted_1394 == 0 ) )
            {
               if ( RcdFound1394 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17Q1394( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17Q1394( ) ;
                     if ( AnyError == 0 )
                     {
                        zm17Q1394( 5) ;
                     }
                     closeExtendedTableCursors17Q1394( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HZ_COD_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHz_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1394 != 0 )
               {
                  if ( nRcdDeleted_1394 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17Q1394( ) ;
                     load17Q1394( ) ;
                     beforeValidate17Q1394( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17Q1394( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1394 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17Q1394( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17Q1394( ) ;
                           if ( AnyError == 0 )
                           {
                              zm17Q1394( 5) ;
                           }
                           closeExtendedTableCursors17Q1394( ) ;
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
                  if ( nRcdDeleted_1394 == 0 )
                  {
                     GXCCtl = "HZ_COD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHz_cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1394_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHz_cod_Internalname, GXutil.rtrim( A10272Hz_cod)) ;
         httpContext.changePostValue( edtHz_clase_Internalname, GXutil.rtrim( A10275Hz_clase)) ;
         httpContext.changePostValue( edtHz_desc_Internalname, GXutil.rtrim( A10273Hz_desc)) ;
         httpContext.changePostValue( edtHz_descg_Internalname, GXutil.rtrim( A10274Hz_descg)) ;
         httpContext.changePostValue( edtHz_porc_Internalname, GXutil.ltrim( localUtil.ntoc( A10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHz_Prov_Internalname, GXutil.rtrim( A10277Hz_Prov)) ;
         httpContext.changePostValue( "ZT_"+"Z10272Hz_cod_"+sGXsfl_40_idx, GXutil.rtrim( Z10272Hz_cod)) ;
         httpContext.changePostValue( "ZT_"+"Z10276Hz_porc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1394 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1394_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1394_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_COD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_CLASE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_clase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_DESCG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_descg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_PORC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_PROV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17Q0( )
   {
   }

   public void e1117Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr02jl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr02jl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr02jl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr02jl_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr02jl_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr02jl_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17Q10( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z65ArtCod = A65ArtCod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR02JL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T017Q7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017Q7_A407EmprNom[0] ;
      n407EmprNom = T017Q7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T017Q8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
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

   public void load17Q10( )
   {
      /* Using cursor T017Q9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A407EmprNom = T017Q9_A407EmprNom[0] ;
         n407EmprNom = T017Q9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm17Q10( -1) ;
      }
      pr_default.close(7);
      onLoadActions17Q10( ) ;
   }

   public void onLoadActions17Q10( )
   {
   }

   public void checkExtendedTable17Q10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17Q10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17Q10( )
   {
      /* Using cursor T017Q10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017Q6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T017Q6_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T017Q6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017Q6_A252CliCod[0] == A252CliCod ) )
      {
         zm17Q10( 1) ;
         RcdFound10 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17Q10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey17Q10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey17Q10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey17Q10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T017Q11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017Q11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017Q11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017Q11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017Q11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017Q11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017Q11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T017Q12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T017Q12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017Q12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017Q12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T017Q12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017Q12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017Q12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17Q10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert17Q10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17Q10( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert17Q10( ) ;
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
                  insert17Q10( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      getKey17Q10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr02jl");
   }

   public void insert_check( )
   {
      confirm_17Q0( ) ;
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
      if ( RcdFound10 == 0 )
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
      scanStart17Q10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17Q10( ) ;
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
      if ( RcdFound10 == 0 )
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
      if ( RcdFound10 == 0 )
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
      scanStart17Q10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext17Q10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17Q10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17Q10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017Q5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17Q10( )
   {
      beforeValidate17Q10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17Q10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17Q10( 0) ;
         checkOptimisticConcurrency17Q10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17Q10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17Q10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017Q13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        processLevel17Q10( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17Q0( ) ;
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
            load17Q10( ) ;
         }
         endLevel17Q10( ) ;
      }
      closeExtendedTableCursors17Q10( ) ;
   }

   public void update17Q10( )
   {
      beforeValidate17Q10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17Q10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17Q10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17Q10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17Q10( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPARTICU */
                  deferredUpdate17Q10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                     ttr02jl_impl.this.A396EmprCod = GXv_char4[0] ;
                     ttr02jl_impl.this.A252CliCod = GXv_int5[0] ;
                     ttr02jl_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17Q10( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17Q0( ) ;
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
         endLevel17Q10( ) ;
      }
      closeExtendedTableCursors17Q10( ) ;
   }

   public void deferredUpdate17Q10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17Q10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17Q10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17Q10( ) ;
         afterConfirm17Q10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17Q10( ) ;
            if ( AnyError == 0 )
            {
               scanStart17Q1394( ) ;
               while ( RcdFound1394 != 0 )
               {
                  getByPrimaryKey17Q1394( ) ;
                  delete17Q1394( ) ;
                  scanNext17Q1394( ) ;
               }
               scanEnd17Q1394( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017Q14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound10 == 0 )
                        {
                           initAll17Q10( ) ;
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
                        resetCaption17Q0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17Q10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17Q10( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017Q15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T017Q16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T017Q17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T017Q18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T017Q19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T017Q20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T017Q21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T017Q22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T017Q23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T017Q24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T017Q25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T017Q26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T017Q27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T017Q28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T017Q29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T017Q30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T017Q31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T017Q32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T017Q33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T017Q34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T017Q35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T017Q36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T017Q37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T017Q38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T017Q39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T017Q40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T017Q41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T017Q42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T017Q43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T017Q44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T017Q45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T017Q46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T017Q47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T017Q48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T017Q49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T017Q50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T017Q51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T017Q52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T017Q53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T017Q54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T017Q55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T017Q56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T017Q57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
      }
   }

   public void processNestedLevel17Q1394( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow17Q1394( ) ;
         if ( ( nRcdExists_1394 != 0 ) || ( nIsMod_1394 != 0 ) )
         {
            standaloneNotModal17Q1394( ) ;
            getKey17Q1394( ) ;
            if ( ( nRcdExists_1394 == 0 ) && ( nRcdDeleted_1394 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17Q1394( ) ;
            }
            else
            {
               if ( RcdFound1394 != 0 )
               {
                  if ( ( nRcdDeleted_1394 != 0 ) && ( nRcdExists_1394 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17Q1394( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1394 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17Q1394( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1394 == 0 )
                  {
                     GXCCtl = "HZ_COD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHz_cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1394_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHz_cod_Internalname, GXutil.rtrim( A10272Hz_cod)) ;
         httpContext.changePostValue( edtHz_clase_Internalname, GXutil.rtrim( A10275Hz_clase)) ;
         httpContext.changePostValue( edtHz_desc_Internalname, GXutil.rtrim( A10273Hz_desc)) ;
         httpContext.changePostValue( edtHz_descg_Internalname, GXutil.rtrim( A10274Hz_descg)) ;
         httpContext.changePostValue( edtHz_porc_Internalname, GXutil.ltrim( localUtil.ntoc( A10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHz_Prov_Internalname, GXutil.rtrim( A10277Hz_Prov)) ;
         httpContext.changePostValue( "ZT_"+"Z10272Hz_cod_"+sGXsfl_40_idx, GXutil.rtrim( Z10272Hz_cod)) ;
         httpContext.changePostValue( "ZT_"+"Z10276Hz_porc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1394_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1394 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1394_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1394_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_COD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_CLASE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_clase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_DESCG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_descg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_PORC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HZ_PROV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17Q1394( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1394 = (short)(0) ;
      nIsMod_1394 = (short)(0) ;
      nRcdDeleted_1394 = (short)(0) ;
   }

   public void processLevel17Q10( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel17Q1394( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17Q10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17Q10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr02jl");
         if ( AnyError == 0 )
         {
            confirmValues17Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr02jl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17Q10( )
   {
      /* Scan By routine */
      /* Using cursor T017Q58 */
      pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17Q10( )
   {
      /* Scan next routine */
      pr_default.readNext(56);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
   }

   public void scanEnd17Q10( )
   {
      pr_default.close(56);
   }

   public void afterConfirm17Q10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17Q10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17Q10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17Q10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17Q10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17Q10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17Q10( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
   }

   public void zm17Q1394( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10276Hz_porc = T017Q3_A10276Hz_porc[0] ;
         }
         else
         {
            Z10276Hz_porc = A10276Hz_porc ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10276Hz_porc = A10276Hz_porc ;
         Z396EmprCod = A396EmprCod ;
         Z10272Hz_cod = A10272Hz_cod ;
         Z10275Hz_clase = A10275Hz_clase ;
         Z10273Hz_desc = A10273Hz_desc ;
         Z10274Hz_descg = A10274Hz_descg ;
         Z10277Hz_Prov = A10277Hz_Prov ;
      }
   }

   public void standaloneNotModal17Q1394( )
   {
   }

   public void standaloneModal17Q1394( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHz_cod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHz_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_cod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtHz_cod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHz_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_cod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load17Q1394( )
   {
      /* Using cursor T017Q59 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound1394 = (short)(1) ;
         A10275Hz_clase = T017Q59_A10275Hz_clase[0] ;
         n10275Hz_clase = T017Q59_n10275Hz_clase[0] ;
         A10273Hz_desc = T017Q59_A10273Hz_desc[0] ;
         n10273Hz_desc = T017Q59_n10273Hz_desc[0] ;
         A10274Hz_descg = T017Q59_A10274Hz_descg[0] ;
         n10274Hz_descg = T017Q59_n10274Hz_descg[0] ;
         A10276Hz_porc = T017Q59_A10276Hz_porc[0] ;
         n10276Hz_porc = T017Q59_n10276Hz_porc[0] ;
         A10277Hz_Prov = T017Q59_A10277Hz_Prov[0] ;
         n10277Hz_Prov = T017Q59_n10277Hz_Prov[0] ;
         zm17Q1394( -4) ;
      }
      pr_default.close(57);
      onLoadActions17Q1394( ) ;
   }

   public void onLoadActions17Q1394( )
   {
   }

   public void checkExtendedTable17Q1394( )
   {
      nIsDirty_1394 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17Q1394( ) ;
      /* Using cursor T017Q4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A10272Hz_cod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "HZ_COD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR01JL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHz_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10275Hz_clase = T017Q4_A10275Hz_clase[0] ;
      n10275Hz_clase = T017Q4_n10275Hz_clase[0] ;
      A10273Hz_desc = T017Q4_A10273Hz_desc[0] ;
      n10273Hz_desc = T017Q4_n10273Hz_desc[0] ;
      A10274Hz_descg = T017Q4_A10274Hz_descg[0] ;
      n10274Hz_descg = T017Q4_n10274Hz_descg[0] ;
      A10277Hz_Prov = T017Q4_A10277Hz_Prov[0] ;
      n10277Hz_Prov = T017Q4_n10277Hz_Prov[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors17Q1394( )
   {
      pr_default.close(2);
   }

   public void enableDisable17Q1394( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A10272Hz_cod )
   {
      /* Using cursor T017Q60 */
      pr_default.execute(58, new Object[] {A396EmprCod, A10272Hz_cod});
      if ( (pr_default.getStatus(58) == 101) )
      {
         GXCCtl = "HZ_COD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR01JL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHz_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10275Hz_clase = T017Q60_A10275Hz_clase[0] ;
      n10275Hz_clase = T017Q60_n10275Hz_clase[0] ;
      A10273Hz_desc = T017Q60_A10273Hz_desc[0] ;
      n10273Hz_desc = T017Q60_n10273Hz_desc[0] ;
      A10274Hz_descg = T017Q60_A10274Hz_descg[0] ;
      n10274Hz_descg = T017Q60_n10274Hz_descg[0] ;
      A10277Hz_Prov = T017Q60_A10277Hz_Prov[0] ;
      n10277Hz_Prov = T017Q60_n10277Hz_Prov[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10275Hz_clase))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10273Hz_desc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10274Hz_descg))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10277Hz_Prov))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(58) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(58);
   }

   public void getKey17Q1394( )
   {
      /* Using cursor T017Q61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound1394 = (short)(1) ;
      }
      else
      {
         RcdFound1394 = (short)(0) ;
      }
      pr_default.close(59);
   }

   public void getByPrimaryKey17Q1394( )
   {
      /* Using cursor T017Q3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
      if ( (pr_default.getStatus(1) != 101) && ( T017Q3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017Q3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T017Q3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17Q1394( 4) ;
         RcdFound1394 = (short)(1) ;
         initializeNonKey17Q1394( ) ;
         A10276Hz_porc = T017Q3_A10276Hz_porc[0] ;
         n10276Hz_porc = T017Q3_n10276Hz_porc[0] ;
         A10272Hz_cod = T017Q3_A10272Hz_cod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10272Hz_cod = A10272Hz_cod ;
         sMode1394 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17Q1394( ) ;
         load17Q1394( ) ;
         Gx_mode = sMode1394 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1394 = (short)(0) ;
         initializeNonKey17Q1394( ) ;
         sMode1394 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17Q1394( ) ;
         Gx_mode = sMode1394 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17Q1394( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17Q1394( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR02JL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10276Hz_porc, T017Q2_A10276Hz_porc[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10276Hz_porc, T017Q2_A10276Hz_porc[0]) != 0 )
            {
               GXutil.writeLogln("ttr02jl:[seudo value changed for attri]"+"Hz_porc");
               GXutil.writeLogRaw("Old: ",Z10276Hz_porc);
               GXutil.writeLogRaw("Current: ",T017Q2_A10276Hz_porc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR02JL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17Q1394( )
   {
      beforeValidate17Q1394( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17Q1394( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17Q1394( 0) ;
         checkOptimisticConcurrency17Q1394( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17Q1394( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17Q1394( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017Q62 */
                  pr_default.execute(60, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n10276Hz_porc), A10276Hz_porc, A396EmprCod, A10272Hz_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR02JL");
                  if ( (pr_default.getStatus(60) == 1) )
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
            load17Q1394( ) ;
         }
         endLevel17Q1394( ) ;
      }
      closeExtendedTableCursors17Q1394( ) ;
   }

   public void update17Q1394( )
   {
      beforeValidate17Q1394( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17Q1394( ) ;
      }
      if ( ( nIsMod_1394 != 0 ) || ( nIsDirty_1394 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17Q1394( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17Q1394( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17Q1394( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017Q63 */
                     pr_default.execute(61, new Object[] {Boolean.valueOf(n10276Hz_porc), A10276Hz_porc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR02JL");
                     if ( (pr_default.getStatus(61) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR02JL"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17Q1394( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        ttr02jl_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttr02jl_impl.this.A252CliCod = GXv_int5[0] ;
                        ttr02jl_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17Q1394( ) ;
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
            endLevel17Q1394( ) ;
         }
      }
      closeExtendedTableCursors17Q1394( ) ;
   }

   public void deferredUpdate17Q1394( )
   {
   }

   public void delete17Q1394( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17Q1394( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17Q1394( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17Q1394( ) ;
         afterConfirm17Q1394( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17Q1394( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017Q64 */
               pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10272Hz_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR02JL");
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
      sMode1394 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17Q1394( ) ;
      Gx_mode = sMode1394 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17Q1394( )
   {
      standaloneModal17Q1394( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017Q65 */
         pr_default.execute(63, new Object[] {A396EmprCod, A10272Hz_cod});
         A10275Hz_clase = T017Q65_A10275Hz_clase[0] ;
         n10275Hz_clase = T017Q65_n10275Hz_clase[0] ;
         A10273Hz_desc = T017Q65_A10273Hz_desc[0] ;
         n10273Hz_desc = T017Q65_n10273Hz_desc[0] ;
         A10274Hz_descg = T017Q65_A10274Hz_descg[0] ;
         n10274Hz_descg = T017Q65_n10274Hz_descg[0] ;
         A10277Hz_Prov = T017Q65_A10277Hz_Prov[0] ;
         n10277Hz_Prov = T017Q65_n10277Hz_Prov[0] ;
         pr_default.close(63);
      }
   }

   public void endLevel17Q1394( )
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

   public void scanStart17Q1394( )
   {
      /* Scan By routine */
      /* Using cursor T017Q66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1394 = (short)(0) ;
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound1394 = (short)(1) ;
         A10272Hz_cod = T017Q66_A10272Hz_cod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17Q1394( )
   {
      /* Scan next routine */
      pr_default.readNext(64);
      RcdFound1394 = (short)(0) ;
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound1394 = (short)(1) ;
         A10272Hz_cod = T017Q66_A10272Hz_cod[0] ;
      }
   }

   public void scanEnd17Q1394( )
   {
      pr_default.close(64);
   }

   public void afterConfirm17Q1394( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17Q1394( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17Q1394( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17Q1394( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17Q1394( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17Q1394( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17Q1394( )
   {
      edtHz_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_cod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHz_clase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_clase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_clase_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHz_desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_desc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHz_descg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_descg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_descg_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHz_porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_porc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtHz_Prov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_Prov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes17Q1394( )
   {
   }

   public void send_integrity_lvl_hashes17Q10( )
   {
   }

   public void subsflControlProps_401394( )
   {
      edtavnRcdDeleted_1394_Internalname = "vNRCDDELETED_1394_"+sGXsfl_40_idx ;
      edtHz_cod_Internalname = "HZ_COD_"+sGXsfl_40_idx ;
      edtHz_clase_Internalname = "HZ_CLASE_"+sGXsfl_40_idx ;
      edtHz_desc_Internalname = "HZ_DESC_"+sGXsfl_40_idx ;
      edtHz_descg_Internalname = "HZ_DESCG_"+sGXsfl_40_idx ;
      edtHz_porc_Internalname = "HZ_PORC_"+sGXsfl_40_idx ;
      edtHz_Prov_Internalname = "HZ_PROV_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401394( )
   {
      edtavnRcdDeleted_1394_Internalname = "vNRCDDELETED_1394_"+sGXsfl_40_fel_idx ;
      edtHz_cod_Internalname = "HZ_COD_"+sGXsfl_40_fel_idx ;
      edtHz_clase_Internalname = "HZ_CLASE_"+sGXsfl_40_fel_idx ;
      edtHz_desc_Internalname = "HZ_DESC_"+sGXsfl_40_fel_idx ;
      edtHz_descg_Internalname = "HZ_DESCG_"+sGXsfl_40_fel_idx ;
      edtHz_porc_Internalname = "HZ_PORC_"+sGXsfl_40_fel_idx ;
      edtHz_Prov_Internalname = "HZ_PROV_"+sGXsfl_40_fel_idx ;
   }

   public void addRow17Q1394( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401394( ) ;
      sendRow17Q1394( ) ;
   }

   public void sendRow17Q1394( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1394_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1394_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1394_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1394), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1394), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1394_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1394_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1394_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_cod_Internalname,GXutil.rtrim( A10272Hz_cod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_cod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_clase_Internalname,GXutil.rtrim( A10275Hz_clase),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_clase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_clase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_desc_Internalname,GXutil.rtrim( A10273Hz_desc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_desc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_desc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_descg_Internalname,GXutil.rtrim( A10274Hz_descg),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_descg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_descg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1394_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_porc_Internalname,GXutil.ltrim( localUtil.ntoc( A10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHz_porc_Enabled!=0) ? localUtil.format( A10276Hz_porc, "ZZ9.99") : localUtil.format( A10276Hz_porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_porc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_porc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHz_Prov_Internalname,GXutil.rtrim( A10277Hz_Prov),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHz_Prov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHz_Prov_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17Q1394( ) ;
      GXCCtl = "Z10272Hz_cod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10272Hz_cod));
      GXCCtl = "Z10276Hz_porc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10276Hz_porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1394_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1394_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1394_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1394, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1394_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1394_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_COD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_CLASE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_clase_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_DESCG_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_descg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_PORC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HZ_PROV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17Q1394( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401394( ) ;
      edtavnRcdDeleted_1394_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1394_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_COD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_clase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_CLASE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_DESC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_descg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_DESCG_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_PORC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHz_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HZ_PROV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1394_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1394_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1394");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1394_Internalname ;
         wbErr = true ;
         nRcdDeleted_1394 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1394 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1394_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10272Hz_cod = httpContext.cgiGet( edtHz_cod_Internalname) ;
      A10275Hz_clase = httpContext.cgiGet( edtHz_clase_Internalname) ;
      n10275Hz_clase = false ;
      A10273Hz_desc = httpContext.cgiGet( edtHz_desc_Internalname) ;
      n10273Hz_desc = false ;
      A10274Hz_descg = httpContext.cgiGet( edtHz_descg_Internalname) ;
      n10274Hz_descg = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHz_porc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHz_porc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "HZ_PORC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHz_porc_Internalname ;
         wbErr = true ;
         A10276Hz_porc = DecimalUtil.ZERO ;
         n10276Hz_porc = false ;
      }
      else
      {
         A10276Hz_porc = localUtil.ctond( httpContext.cgiGet( edtHz_porc_Internalname)) ;
         n10276Hz_porc = false ;
      }
      A10277Hz_Prov = httpContext.cgiGet( edtHz_Prov_Internalname) ;
      n10277Hz_Prov = false ;
      GXCCtl = "Z10272Hz_cod_" + sGXsfl_40_idx ;
      Z10272Hz_cod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10276Hz_porc_" + sGXsfl_40_idx ;
      Z10276Hz_porc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1394_" + sGXsfl_40_idx ;
      nRcdDeleted_1394 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1394_" + sGXsfl_40_idx ;
      nRcdExists_1394 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1394_" + sGXsfl_40_idx ;
      nIsMod_1394 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHz_cod_Enabled = edtHz_cod_Enabled ;
   }

   public void confirmValues17Q0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401394( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401394( ) ;
         httpContext.changePostValue( "Z10272Hz_cod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10272Hz_cod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10272Hz_cod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10276Hz_porc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10276Hz_porc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10276Hz_porc_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr02jl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.ttr02jl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTR02JL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ASOCIAR HILAZAS A ARTICULO", "") ;
   }

   public void initializeNonKey17Q10( )
   {
   }

   public void initAll17Q10( )
   {
      initializeNonKey17Q10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17Q1394( )
   {
      A10275Hz_clase = "" ;
      n10275Hz_clase = false ;
      A10273Hz_desc = "" ;
      n10273Hz_desc = false ;
      A10274Hz_descg = "" ;
      n10274Hz_descg = false ;
      A10276Hz_porc = DecimalUtil.ZERO ;
      n10276Hz_porc = false ;
      A10277Hz_Prov = "" ;
      n10277Hz_Prov = false ;
      Z10276Hz_porc = DecimalUtil.ZERO ;
   }

   public void initAll17Q1394( )
   {
      A10272Hz_cod = "" ;
      initializeNonKey17Q1394( ) ;
   }

   public void standaloneModalInsert17Q1394( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553185", true, true);
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
      httpContext.AddJavascriptSource("ttr02jl.js", "?20268241553185", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1394( )
   {
      edtHz_cod_Enabled = defedtHz_cod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHz_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHz_cod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1394, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1394_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10272Hz_cod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10275Hz_clase));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_clase_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10273Hz_desc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10274Hz_descg));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_descg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10276Hz_porc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10277Hz_Prov));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHz_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1394_Internalname = "vNRCDDELETED_1394" ;
      edtHz_cod_Internalname = "HZ_COD" ;
      edtHz_clase_Internalname = "HZ_CLASE" ;
      edtHz_desc_Internalname = "HZ_DESC" ;
      edtHz_descg_Internalname = "HZ_DESCG" ;
      edtHz_porc_Internalname = "HZ_PORC" ;
      edtHz_Prov_Internalname = "HZ_PROV" ;
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
      Form.setCaption( httpContext.getMessage( "ASOCIAR HILAZAS A ARTICULO", "") );
      edtHz_Prov_Jsonclick = "" ;
      edtHz_porc_Jsonclick = "" ;
      edtHz_descg_Jsonclick = "" ;
      edtHz_desc_Jsonclick = "" ;
      edtHz_clase_Jsonclick = "" ;
      edtHz_cod_Jsonclick = "" ;
      edtavnRcdDeleted_1394_Jsonclick = "" ;
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
      edtHz_Prov_Enabled = 0 ;
      edtHz_porc_Enabled = 1 ;
      edtHz_descg_Enabled = 0 ;
      edtHz_desc_Enabled = 0 ;
      edtHz_clase_Enabled = 0 ;
      edtHz_cod_Enabled = 1 ;
      edtavnRcdDeleted_1394_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
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
      subsflControlProps_401394( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17Q1394( ) ;
         standaloneModal17Q1394( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17Q1394( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401394( ) ;
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
      /* Using cursor T017Q67 */
      pr_default.execute(65, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017Q67_A407EmprNom[0] ;
      n407EmprNom = T017Q67_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(65);
      /* Using cursor T017Q68 */
      pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(66) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(66);
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

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Hz_cod( )
   {
      n10275Hz_clase = false ;
      n10273Hz_desc = false ;
      n10274Hz_descg = false ;
      n10277Hz_Prov = false ;
      /* Using cursor T017Q65 */
      pr_default.execute(63, new Object[] {A396EmprCod, A10272Hz_cod});
      if ( (pr_default.getStatus(63) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR01JL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HZ_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHz_cod_Internalname ;
      }
      A10275Hz_clase = T017Q65_A10275Hz_clase[0] ;
      n10275Hz_clase = T017Q65_n10275Hz_clase[0] ;
      A10273Hz_desc = T017Q65_A10273Hz_desc[0] ;
      n10273Hz_desc = T017Q65_n10273Hz_desc[0] ;
      A10274Hz_descg = T017Q65_A10274Hz_descg[0] ;
      n10274Hz_descg = T017Q65_n10274Hz_descg[0] ;
      A10277Hz_Prov = T017Q65_A10277Hz_Prov[0] ;
      n10277Hz_Prov = T017Q65_n10277Hz_Prov[0] ;
      pr_default.close(63);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10275Hz_clase", GXutil.rtrim( A10275Hz_clase));
      httpContext.ajax_rsp_assign_attri("", false, "A10273Hz_desc", GXutil.rtrim( A10273Hz_desc));
      httpContext.ajax_rsp_assign_attri("", false, "A10274Hz_descg", GXutil.rtrim( A10274Hz_descg));
      httpContext.ajax_rsp_assign_attri("", false, "A10277Hz_Prov", GXutil.rtrim( A10277Hz_Prov));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HZ_COD","{handler:'valid_Hz_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10272Hz_cod',fld:'HZ_COD',pic:''},{av:'A10275Hz_clase',fld:'HZ_CLASE',pic:''},{av:'A10273Hz_desc',fld:'HZ_DESC',pic:''},{av:'A10274Hz_descg',fld:'HZ_DESCG',pic:''},{av:'A10277Hz_Prov',fld:'HZ_PROV',pic:''}]");
      setEventMetadata("VALID_HZ_COD",",oparms:[{av:'A10275Hz_clase',fld:'HZ_CLASE',pic:''},{av:'A10273Hz_desc',fld:'HZ_DESC',pic:''},{av:'A10274Hz_descg',fld:'HZ_DESCG',pic:''},{av:'A10277Hz_Prov',fld:'HZ_PROV',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Hz_prov',iparms:[]");
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
      pr_default.close(63);
      pr_default.close(66);
      pr_default.close(65);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z10272Hz_cod = "" ;
      Z10276Hz_porc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10272Hz_cod = "" ;
      A65ArtCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1394 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode10 = "" ;
      GXCCtl = "" ;
      A10275Hz_clase = "" ;
      A10273Hz_desc = "" ;
      A10274Hz_descg = "" ;
      A10276Hz_porc = DecimalUtil.ZERO ;
      A10277Hz_Prov = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T017Q7_A407EmprNom = new String[] {""} ;
      T017Q7_n407EmprNom = new boolean[] {false} ;
      T017Q8_A396EmprCod = new String[] {""} ;
      T017Q9_A65ArtCod = new String[] {""} ;
      T017Q9_n65ArtCod = new boolean[] {false} ;
      T017Q9_A407EmprNom = new String[] {""} ;
      T017Q9_n407EmprNom = new boolean[] {false} ;
      T017Q9_A396EmprCod = new String[] {""} ;
      T017Q9_A252CliCod = new int[1] ;
      T017Q9_n252CliCod = new boolean[] {false} ;
      T017Q10_A396EmprCod = new String[] {""} ;
      T017Q10_A252CliCod = new int[1] ;
      T017Q10_n252CliCod = new boolean[] {false} ;
      T017Q10_A65ArtCod = new String[] {""} ;
      T017Q10_n65ArtCod = new boolean[] {false} ;
      T017Q6_A65ArtCod = new String[] {""} ;
      T017Q6_n65ArtCod = new boolean[] {false} ;
      T017Q6_A396EmprCod = new String[] {""} ;
      T017Q6_A252CliCod = new int[1] ;
      T017Q6_n252CliCod = new boolean[] {false} ;
      T017Q11_A396EmprCod = new String[] {""} ;
      T017Q11_A252CliCod = new int[1] ;
      T017Q11_n252CliCod = new boolean[] {false} ;
      T017Q11_A65ArtCod = new String[] {""} ;
      T017Q11_n65ArtCod = new boolean[] {false} ;
      T017Q12_A396EmprCod = new String[] {""} ;
      T017Q12_A252CliCod = new int[1] ;
      T017Q12_n252CliCod = new boolean[] {false} ;
      T017Q12_A65ArtCod = new String[] {""} ;
      T017Q12_n65ArtCod = new boolean[] {false} ;
      T017Q5_A65ArtCod = new String[] {""} ;
      T017Q5_n65ArtCod = new boolean[] {false} ;
      T017Q5_A396EmprCod = new String[] {""} ;
      T017Q5_A252CliCod = new int[1] ;
      T017Q5_n252CliCod = new boolean[] {false} ;
      T017Q15_A396EmprCod = new String[] {""} ;
      T017Q15_A252CliCod = new int[1] ;
      T017Q15_n252CliCod = new boolean[] {false} ;
      T017Q15_A65ArtCod = new String[] {""} ;
      T017Q15_n65ArtCod = new boolean[] {false} ;
      T017Q15_A499GrpFamCod = new byte[1] ;
      T017Q16_A396EmprCod = new String[] {""} ;
      T017Q16_A252CliCod = new int[1] ;
      T017Q16_n252CliCod = new boolean[] {false} ;
      T017Q16_A12814ARTConID = new String[] {""} ;
      T017Q16_A65ArtCod = new String[] {""} ;
      T017Q16_n65ArtCod = new boolean[] {false} ;
      T017Q17_A396EmprCod = new String[] {""} ;
      T017Q17_A252CliCod = new int[1] ;
      T017Q17_n252CliCod = new boolean[] {false} ;
      T017Q17_A65ArtCod = new String[] {""} ;
      T017Q17_n65ArtCod = new boolean[] {false} ;
      T017Q17_A12363SocInt = new byte[1] ;
      T017Q18_A396EmprCod = new String[] {""} ;
      T017Q18_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017Q18_A5728JBCLLin = new short[1] ;
      T017Q19_A396EmprCod = new String[] {""} ;
      T017Q19_A252CliCod = new int[1] ;
      T017Q19_n252CliCod = new boolean[] {false} ;
      T017Q19_A5809MMezCod = new String[] {""} ;
      T017Q19_A65ArtCod = new String[] {""} ;
      T017Q19_n65ArtCod = new boolean[] {false} ;
      T017Q20_A396EmprCod = new String[] {""} ;
      T017Q20_A252CliCod = new int[1] ;
      T017Q20_n252CliCod = new boolean[] {false} ;
      T017Q20_A5234MezCod = new String[] {""} ;
      T017Q20_A5240MezLin = new byte[1] ;
      T017Q21_A396EmprCod = new String[] {""} ;
      T017Q21_A252CliCod = new int[1] ;
      T017Q21_n252CliCod = new boolean[] {false} ;
      T017Q21_A65ArtCod = new String[] {""} ;
      T017Q21_n65ArtCod = new boolean[] {false} ;
      T017Q21_A4116estreclim = new int[1] ;
      T017Q22_A396EmprCod = new String[] {""} ;
      T017Q22_A252CliCod = new int[1] ;
      T017Q22_n252CliCod = new boolean[] {false} ;
      T017Q22_A65ArtCod = new String[] {""} ;
      T017Q22_n65ArtCod = new boolean[] {false} ;
      T017Q22_A4061EstNomCol = new String[] {""} ;
      T017Q23_A396EmprCod = new String[] {""} ;
      T017Q23_A9705ErpNped = new String[] {""} ;
      T017Q23_A8652ErpLin = new short[1] ;
      T017Q24_A396EmprCod = new String[] {""} ;
      T017Q24_A252CliCod = new int[1] ;
      T017Q24_n252CliCod = new boolean[] {false} ;
      T017Q24_A65ArtCod = new String[] {""} ;
      T017Q24_n65ArtCod = new boolean[] {false} ;
      T017Q24_A7266CAAqP = new String[] {""} ;
      T017Q25_A396EmprCod = new String[] {""} ;
      T017Q25_A252CliCod = new int[1] ;
      T017Q25_n252CliCod = new boolean[] {false} ;
      T017Q25_A65ArtCod = new String[] {""} ;
      T017Q25_n65ArtCod = new boolean[] {false} ;
      T017Q25_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T017Q26_A396EmprCod = new String[] {""} ;
      T017Q26_A252CliCod = new int[1] ;
      T017Q26_n252CliCod = new boolean[] {false} ;
      T017Q26_A65ArtCod = new String[] {""} ;
      T017Q26_n65ArtCod = new boolean[] {false} ;
      T017Q26_A10972Int_cod = new byte[1] ;
      T017Q27_A396EmprCod = new String[] {""} ;
      T017Q27_A252CliCod = new int[1] ;
      T017Q27_n252CliCod = new boolean[] {false} ;
      T017Q27_A65ArtCod = new String[] {""} ;
      T017Q27_n65ArtCod = new boolean[] {false} ;
      T017Q27_A10577Pg_Procod = new String[] {""} ;
      T017Q28_A396EmprCod = new String[] {""} ;
      T017Q28_A252CliCod = new int[1] ;
      T017Q28_n252CliCod = new boolean[] {false} ;
      T017Q28_A65ArtCod = new String[] {""} ;
      T017Q28_n65ArtCod = new boolean[] {false} ;
      T017Q28_A10041ArtSH = new String[] {""} ;
      T017Q29_A396EmprCod = new String[] {""} ;
      T017Q29_A252CliCod = new int[1] ;
      T017Q29_n252CliCod = new boolean[] {false} ;
      T017Q29_A65ArtCod = new String[] {""} ;
      T017Q29_n65ArtCod = new boolean[] {false} ;
      T017Q29_A8427TipoCt = new String[] {""} ;
      T017Q29_A8428CapMxMq = new int[1] ;
      T017Q30_A396EmprCod = new String[] {""} ;
      T017Q30_A252CliCod = new int[1] ;
      T017Q30_n252CliCod = new boolean[] {false} ;
      T017Q30_A65ArtCod = new String[] {""} ;
      T017Q30_n65ArtCod = new boolean[] {false} ;
      T017Q30_A8342CodPred = new short[1] ;
      T017Q31_A396EmprCod = new String[] {""} ;
      T017Q31_A252CliCod = new int[1] ;
      T017Q31_n252CliCod = new boolean[] {false} ;
      T017Q31_A65ArtCod = new String[] {""} ;
      T017Q31_n65ArtCod = new boolean[] {false} ;
      T017Q31_A8089ArtcodTj = new String[] {""} ;
      T017Q32_A396EmprCod = new String[] {""} ;
      T017Q32_A252CliCod = new int[1] ;
      T017Q32_n252CliCod = new boolean[] {false} ;
      T017Q32_A65ArtCod = new String[] {""} ;
      T017Q32_n65ArtCod = new boolean[] {false} ;
      T017Q32_A7956Mq_CodM = new String[] {""} ;
      T017Q33_A396EmprCod = new String[] {""} ;
      T017Q33_A252CliCod = new int[1] ;
      T017Q33_n252CliCod = new boolean[] {false} ;
      T017Q33_A65ArtCod = new String[] {""} ;
      T017Q33_n65ArtCod = new boolean[] {false} ;
      T017Q33_A7949Par_Art = new short[1] ;
      T017Q34_A396EmprCod = new String[] {""} ;
      T017Q34_A252CliCod = new int[1] ;
      T017Q34_n252CliCod = new boolean[] {false} ;
      T017Q34_A65ArtCod = new String[] {""} ;
      T017Q34_n65ArtCod = new boolean[] {false} ;
      T017Q34_A7135Lin_fast = new short[1] ;
      T017Q35_A396EmprCod = new String[] {""} ;
      T017Q35_A252CliCod = new int[1] ;
      T017Q35_n252CliCod = new boolean[] {false} ;
      T017Q35_A65ArtCod = new String[] {""} ;
      T017Q35_n65ArtCod = new boolean[] {false} ;
      T017Q35_A6954Mat_lin = new short[1] ;
      T017Q36_A396EmprCod = new String[] {""} ;
      T017Q36_A602MaqCod = new String[] {""} ;
      T017Q36_A6078MaqCliCod = new int[1] ;
      T017Q36_A6079MaqArtCod = new String[] {""} ;
      T017Q37_A396EmprCod = new String[] {""} ;
      T017Q37_A252CliCod = new int[1] ;
      T017Q37_n252CliCod = new boolean[] {false} ;
      T017Q37_A65ArtCod = new String[] {""} ;
      T017Q37_n65ArtCod = new boolean[] {false} ;
      T017Q37_A5382EstCatAny = new short[1] ;
      T017Q37_A5383EstCatSer = new String[] {""} ;
      T017Q37_A5384EstCatTip = new short[1] ;
      T017Q38_A396EmprCod = new String[] {""} ;
      T017Q38_A252CliCod = new int[1] ;
      T017Q38_n252CliCod = new boolean[] {false} ;
      T017Q38_A65ArtCod = new String[] {""} ;
      T017Q38_n65ArtCod = new boolean[] {false} ;
      T017Q38_A4658MdlCod = new String[] {""} ;
      T017Q39_A396EmprCod = new String[] {""} ;
      T017Q39_A252CliCod = new int[1] ;
      T017Q39_n252CliCod = new boolean[] {false} ;
      T017Q39_A4175WebEmpCod = new String[] {""} ;
      T017Q40_A396EmprCod = new String[] {""} ;
      T017Q40_A252CliCod = new int[1] ;
      T017Q40_n252CliCod = new boolean[] {false} ;
      T017Q40_A4079WEBDISCOD = new String[] {""} ;
      T017Q41_A396EmprCod = new String[] {""} ;
      T017Q41_A252CliCod = new int[1] ;
      T017Q41_n252CliCod = new boolean[] {false} ;
      T017Q41_A65ArtCod = new String[] {""} ;
      T017Q41_n65ArtCod = new boolean[] {false} ;
      T017Q41_A4058CCFColNom = new String[] {""} ;
      T017Q41_A4059CCFColNum = new int[1] ;
      T017Q42_A396EmprCod = new String[] {""} ;
      T017Q42_A252CliCod = new int[1] ;
      T017Q42_n252CliCod = new boolean[] {false} ;
      T017Q42_A65ArtCod = new String[] {""} ;
      T017Q42_n65ArtCod = new boolean[] {false} ;
      T017Q42_A1177Dibujo = new String[] {""} ;
      T017Q42_A1790DibIntCod = new int[1] ;
      T017Q43_A396EmprCod = new String[] {""} ;
      T017Q43_A252CliCod = new int[1] ;
      T017Q43_n252CliCod = new boolean[] {false} ;
      T017Q43_A65ArtCod = new String[] {""} ;
      T017Q43_n65ArtCod = new boolean[] {false} ;
      T017Q43_A1080LinPre = new byte[1] ;
      T017Q44_A396EmprCod = new String[] {""} ;
      T017Q44_A3814PePCod = new long[1] ;
      T017Q45_A396EmprCod = new String[] {""} ;
      T017Q45_A3413OpeManCod = new byte[1] ;
      T017Q45_A3430PreManNMt = new String[] {""} ;
      T017Q45_A252CliCod = new int[1] ;
      T017Q45_n252CliCod = new boolean[] {false} ;
      T017Q45_A65ArtCod = new String[] {""} ;
      T017Q45_n65ArtCod = new boolean[] {false} ;
      T017Q46_A396EmprCod = new String[] {""} ;
      T017Q46_A3415ParManNum = new int[1] ;
      T017Q47_A396EmprCod = new String[] {""} ;
      T017Q47_A3331LanBroCod = new byte[1] ;
      T017Q47_A3333LanBroLin = new short[1] ;
      T017Q48_A396EmprCod = new String[] {""} ;
      T017Q48_A252CliCod = new int[1] ;
      T017Q48_n252CliCod = new boolean[] {false} ;
      T017Q48_A65ArtCod = new String[] {""} ;
      T017Q48_n65ArtCod = new boolean[] {false} ;
      T017Q48_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017Q49_A396EmprCod = new String[] {""} ;
      T017Q49_A252CliCod = new int[1] ;
      T017Q49_n252CliCod = new boolean[] {false} ;
      T017Q49_A65ArtCod = new String[] {""} ;
      T017Q49_n65ArtCod = new boolean[] {false} ;
      T017Q49_A3288CCalCod = new String[] {""} ;
      T017Q50_A396EmprCod = new String[] {""} ;
      T017Q50_A252CliCod = new int[1] ;
      T017Q50_n252CliCod = new boolean[] {false} ;
      T017Q50_A65ArtCod = new String[] {""} ;
      T017Q50_n65ArtCod = new boolean[] {false} ;
      T017Q50_A3033CCCod = new String[] {""} ;
      T017Q51_A396EmprCod = new String[] {""} ;
      T017Q51_A252CliCod = new int[1] ;
      T017Q51_n252CliCod = new boolean[] {false} ;
      T017Q51_A65ArtCod = new String[] {""} ;
      T017Q51_n65ArtCod = new boolean[] {false} ;
      T017Q51_A2937RecIntCod = new byte[1] ;
      T017Q52_A396EmprCod = new String[] {""} ;
      T017Q52_A252CliCod = new int[1] ;
      T017Q52_n252CliCod = new boolean[] {false} ;
      T017Q52_A65ArtCod = new String[] {""} ;
      T017Q52_n65ArtCod = new boolean[] {false} ;
      T017Q52_A2931Limite2 = new short[1] ;
      T017Q53_A396EmprCod = new String[] {""} ;
      T017Q53_A252CliCod = new int[1] ;
      T017Q53_n252CliCod = new boolean[] {false} ;
      T017Q53_A65ArtCod = new String[] {""} ;
      T017Q53_n65ArtCod = new boolean[] {false} ;
      T017Q53_A71ArtEstAny = new short[1] ;
      T017Q53_A2756ArtEstSer = new String[] {""} ;
      T017Q54_A396EmprCod = new String[] {""} ;
      T017Q54_A252CliCod = new int[1] ;
      T017Q54_n252CliCod = new boolean[] {false} ;
      T017Q54_A1504CliProCod = new String[] {""} ;
      T017Q54_A65ArtCod = new String[] {""} ;
      T017Q54_n65ArtCod = new boolean[] {false} ;
      T017Q55_A396EmprCod = new String[] {""} ;
      T017Q55_A252CliCod = new int[1] ;
      T017Q55_n252CliCod = new boolean[] {false} ;
      T017Q55_A65ArtCod = new String[] {""} ;
      T017Q55_n65ArtCod = new boolean[] {false} ;
      T017Q55_A598LinRec = new byte[1] ;
      T017Q56_A396EmprCod = new String[] {""} ;
      T017Q56_A252CliCod = new int[1] ;
      T017Q56_n252CliCod = new boolean[] {false} ;
      T017Q56_A65ArtCod = new String[] {""} ;
      T017Q56_n65ArtCod = new boolean[] {false} ;
      T017Q56_A831TipColCod = new byte[1] ;
      T017Q57_A396EmprCod = new String[] {""} ;
      T017Q57_A252CliCod = new int[1] ;
      T017Q57_n252CliCod = new boolean[] {false} ;
      T017Q57_A65ArtCod = new String[] {""} ;
      T017Q57_n65ArtCod = new boolean[] {false} ;
      T017Q57_A758ProCod = new String[] {""} ;
      T017Q58_A396EmprCod = new String[] {""} ;
      T017Q58_A252CliCod = new int[1] ;
      T017Q58_n252CliCod = new boolean[] {false} ;
      T017Q58_A65ArtCod = new String[] {""} ;
      T017Q58_n65ArtCod = new boolean[] {false} ;
      Z10275Hz_clase = "" ;
      Z10273Hz_desc = "" ;
      Z10274Hz_descg = "" ;
      Z10277Hz_Prov = "" ;
      T017Q59_A252CliCod = new int[1] ;
      T017Q59_n252CliCod = new boolean[] {false} ;
      T017Q59_A65ArtCod = new String[] {""} ;
      T017Q59_n65ArtCod = new boolean[] {false} ;
      T017Q59_A10275Hz_clase = new String[] {""} ;
      T017Q59_n10275Hz_clase = new boolean[] {false} ;
      T017Q59_A10273Hz_desc = new String[] {""} ;
      T017Q59_n10273Hz_desc = new boolean[] {false} ;
      T017Q59_A10274Hz_descg = new String[] {""} ;
      T017Q59_n10274Hz_descg = new boolean[] {false} ;
      T017Q59_A10276Hz_porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017Q59_n10276Hz_porc = new boolean[] {false} ;
      T017Q59_A10277Hz_Prov = new String[] {""} ;
      T017Q59_n10277Hz_Prov = new boolean[] {false} ;
      T017Q59_A396EmprCod = new String[] {""} ;
      T017Q59_A10272Hz_cod = new String[] {""} ;
      T017Q4_A10275Hz_clase = new String[] {""} ;
      T017Q4_n10275Hz_clase = new boolean[] {false} ;
      T017Q4_A10273Hz_desc = new String[] {""} ;
      T017Q4_n10273Hz_desc = new boolean[] {false} ;
      T017Q4_A10274Hz_descg = new String[] {""} ;
      T017Q4_n10274Hz_descg = new boolean[] {false} ;
      T017Q4_A10277Hz_Prov = new String[] {""} ;
      T017Q4_n10277Hz_Prov = new boolean[] {false} ;
      T017Q60_A10275Hz_clase = new String[] {""} ;
      T017Q60_n10275Hz_clase = new boolean[] {false} ;
      T017Q60_A10273Hz_desc = new String[] {""} ;
      T017Q60_n10273Hz_desc = new boolean[] {false} ;
      T017Q60_A10274Hz_descg = new String[] {""} ;
      T017Q60_n10274Hz_descg = new boolean[] {false} ;
      T017Q60_A10277Hz_Prov = new String[] {""} ;
      T017Q60_n10277Hz_Prov = new boolean[] {false} ;
      T017Q61_A396EmprCod = new String[] {""} ;
      T017Q61_A252CliCod = new int[1] ;
      T017Q61_n252CliCod = new boolean[] {false} ;
      T017Q61_A65ArtCod = new String[] {""} ;
      T017Q61_n65ArtCod = new boolean[] {false} ;
      T017Q61_A10272Hz_cod = new String[] {""} ;
      T017Q3_A252CliCod = new int[1] ;
      T017Q3_n252CliCod = new boolean[] {false} ;
      T017Q3_A65ArtCod = new String[] {""} ;
      T017Q3_n65ArtCod = new boolean[] {false} ;
      T017Q3_A10276Hz_porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017Q3_n10276Hz_porc = new boolean[] {false} ;
      T017Q3_A396EmprCod = new String[] {""} ;
      T017Q3_A10272Hz_cod = new String[] {""} ;
      T017Q2_A252CliCod = new int[1] ;
      T017Q2_n252CliCod = new boolean[] {false} ;
      T017Q2_A65ArtCod = new String[] {""} ;
      T017Q2_n65ArtCod = new boolean[] {false} ;
      T017Q2_A10276Hz_porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017Q2_n10276Hz_porc = new boolean[] {false} ;
      T017Q2_A396EmprCod = new String[] {""} ;
      T017Q2_A10272Hz_cod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      T017Q65_A10275Hz_clase = new String[] {""} ;
      T017Q65_n10275Hz_clase = new boolean[] {false} ;
      T017Q65_A10273Hz_desc = new String[] {""} ;
      T017Q65_n10273Hz_desc = new boolean[] {false} ;
      T017Q65_A10274Hz_descg = new String[] {""} ;
      T017Q65_n10274Hz_descg = new boolean[] {false} ;
      T017Q65_A10277Hz_Prov = new String[] {""} ;
      T017Q65_n10277Hz_Prov = new boolean[] {false} ;
      T017Q66_A396EmprCod = new String[] {""} ;
      T017Q66_A252CliCod = new int[1] ;
      T017Q66_n252CliCod = new boolean[] {false} ;
      T017Q66_A65ArtCod = new String[] {""} ;
      T017Q66_n65ArtCod = new boolean[] {false} ;
      T017Q66_A10272Hz_cod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017Q67_A407EmprNom = new String[] {""} ;
      T017Q67_n407EmprNom = new boolean[] {false} ;
      T017Q68_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr02jl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr02jl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr02jl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr02jl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr02jl__default(),
         new Object[] {
             new Object[] {
            T017Q2_A252CliCod, T017Q2_A65ArtCod, T017Q2_A10276Hz_porc, T017Q2_n10276Hz_porc, T017Q2_A396EmprCod, T017Q2_A10272Hz_cod
            }
            , new Object[] {
            T017Q3_A252CliCod, T017Q3_A65ArtCod, T017Q3_A10276Hz_porc, T017Q3_n10276Hz_porc, T017Q3_A396EmprCod, T017Q3_A10272Hz_cod
            }
            , new Object[] {
            T017Q4_A10275Hz_clase, T017Q4_n10275Hz_clase, T017Q4_A10273Hz_desc, T017Q4_n10273Hz_desc, T017Q4_A10274Hz_descg, T017Q4_n10274Hz_descg, T017Q4_A10277Hz_Prov, T017Q4_n10277Hz_Prov
            }
            , new Object[] {
            T017Q5_A65ArtCod, T017Q5_A396EmprCod, T017Q5_A252CliCod
            }
            , new Object[] {
            T017Q6_A65ArtCod, T017Q6_A396EmprCod, T017Q6_A252CliCod
            }
            , new Object[] {
            T017Q7_A407EmprNom, T017Q7_n407EmprNom
            }
            , new Object[] {
            T017Q8_A396EmprCod
            }
            , new Object[] {
            T017Q9_A65ArtCod, T017Q9_A407EmprNom, T017Q9_n407EmprNom, T017Q9_A396EmprCod, T017Q9_A252CliCod
            }
            , new Object[] {
            T017Q10_A396EmprCod, T017Q10_A252CliCod, T017Q10_A65ArtCod
            }
            , new Object[] {
            T017Q11_A396EmprCod, T017Q11_A252CliCod, T017Q11_A65ArtCod
            }
            , new Object[] {
            T017Q12_A396EmprCod, T017Q12_A252CliCod, T017Q12_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017Q15_A396EmprCod, T017Q15_A252CliCod, T017Q15_A65ArtCod, T017Q15_A499GrpFamCod
            }
            , new Object[] {
            T017Q16_A396EmprCod, T017Q16_A252CliCod, T017Q16_A12814ARTConID, T017Q16_A65ArtCod
            }
            , new Object[] {
            T017Q17_A396EmprCod, T017Q17_A252CliCod, T017Q17_A65ArtCod, T017Q17_A12363SocInt
            }
            , new Object[] {
            T017Q18_A396EmprCod, T017Q18_A4929Inc_Dia, T017Q18_A5728JBCLLin
            }
            , new Object[] {
            T017Q19_A396EmprCod, T017Q19_A252CliCod, T017Q19_A5809MMezCod, T017Q19_A65ArtCod
            }
            , new Object[] {
            T017Q20_A396EmprCod, T017Q20_A252CliCod, T017Q20_A5234MezCod, T017Q20_A5240MezLin
            }
            , new Object[] {
            T017Q21_A396EmprCod, T017Q21_A252CliCod, T017Q21_A65ArtCod, T017Q21_A4116estreclim
            }
            , new Object[] {
            T017Q22_A396EmprCod, T017Q22_A252CliCod, T017Q22_A65ArtCod, T017Q22_A4061EstNomCol
            }
            , new Object[] {
            T017Q23_A396EmprCod, T017Q23_A9705ErpNped, T017Q23_A8652ErpLin
            }
            , new Object[] {
            T017Q24_A396EmprCod, T017Q24_A252CliCod, T017Q24_A65ArtCod, T017Q24_A7266CAAqP
            }
            , new Object[] {
            T017Q25_A396EmprCod, T017Q25_A252CliCod, T017Q25_A65ArtCod, T017Q25_A11084H_DiaA
            }
            , new Object[] {
            T017Q26_A396EmprCod, T017Q26_A252CliCod, T017Q26_A65ArtCod, T017Q26_A10972Int_cod
            }
            , new Object[] {
            T017Q27_A396EmprCod, T017Q27_A252CliCod, T017Q27_A65ArtCod, T017Q27_A10577Pg_Procod
            }
            , new Object[] {
            T017Q28_A396EmprCod, T017Q28_A252CliCod, T017Q28_A65ArtCod, T017Q28_A10041ArtSH
            }
            , new Object[] {
            T017Q29_A396EmprCod, T017Q29_A252CliCod, T017Q29_A65ArtCod, T017Q29_A8427TipoCt, T017Q29_A8428CapMxMq
            }
            , new Object[] {
            T017Q30_A396EmprCod, T017Q30_A252CliCod, T017Q30_A65ArtCod, T017Q30_A8342CodPred
            }
            , new Object[] {
            T017Q31_A396EmprCod, T017Q31_A252CliCod, T017Q31_A65ArtCod, T017Q31_A8089ArtcodTj
            }
            , new Object[] {
            T017Q32_A396EmprCod, T017Q32_A252CliCod, T017Q32_A65ArtCod, T017Q32_A7956Mq_CodM
            }
            , new Object[] {
            T017Q33_A396EmprCod, T017Q33_A252CliCod, T017Q33_A65ArtCod, T017Q33_A7949Par_Art
            }
            , new Object[] {
            T017Q34_A396EmprCod, T017Q34_A252CliCod, T017Q34_A65ArtCod, T017Q34_A7135Lin_fast
            }
            , new Object[] {
            T017Q35_A396EmprCod, T017Q35_A252CliCod, T017Q35_A65ArtCod, T017Q35_A6954Mat_lin
            }
            , new Object[] {
            T017Q36_A396EmprCod, T017Q36_A602MaqCod, T017Q36_A6078MaqCliCod, T017Q36_A6079MaqArtCod
            }
            , new Object[] {
            T017Q37_A396EmprCod, T017Q37_A252CliCod, T017Q37_A65ArtCod, T017Q37_A5382EstCatAny, T017Q37_A5383EstCatSer, T017Q37_A5384EstCatTip
            }
            , new Object[] {
            T017Q38_A396EmprCod, T017Q38_A252CliCod, T017Q38_A65ArtCod, T017Q38_A4658MdlCod
            }
            , new Object[] {
            T017Q39_A396EmprCod, T017Q39_A252CliCod, T017Q39_A4175WebEmpCod
            }
            , new Object[] {
            T017Q40_A396EmprCod, T017Q40_A252CliCod, T017Q40_A4079WEBDISCOD
            }
            , new Object[] {
            T017Q41_A396EmprCod, T017Q41_A252CliCod, T017Q41_A65ArtCod, T017Q41_A4058CCFColNom, T017Q41_A4059CCFColNum
            }
            , new Object[] {
            T017Q42_A396EmprCod, T017Q42_A252CliCod, T017Q42_A65ArtCod, T017Q42_A1177Dibujo, T017Q42_A1790DibIntCod
            }
            , new Object[] {
            T017Q43_A396EmprCod, T017Q43_A252CliCod, T017Q43_A65ArtCod, T017Q43_A1080LinPre
            }
            , new Object[] {
            T017Q44_A396EmprCod, T017Q44_A3814PePCod
            }
            , new Object[] {
            T017Q45_A396EmprCod, T017Q45_A3413OpeManCod, T017Q45_A3430PreManNMt, T017Q45_A252CliCod, T017Q45_A65ArtCod
            }
            , new Object[] {
            T017Q46_A396EmprCod, T017Q46_A3415ParManNum
            }
            , new Object[] {
            T017Q47_A396EmprCod, T017Q47_A3331LanBroCod, T017Q47_A3333LanBroLin
            }
            , new Object[] {
            T017Q48_A396EmprCod, T017Q48_A252CliCod, T017Q48_A65ArtCod, T017Q48_A3319ArtCapKgs
            }
            , new Object[] {
            T017Q49_A396EmprCod, T017Q49_A252CliCod, T017Q49_A65ArtCod, T017Q49_A3288CCalCod
            }
            , new Object[] {
            T017Q50_A396EmprCod, T017Q50_A252CliCod, T017Q50_A65ArtCod, T017Q50_A3033CCCod
            }
            , new Object[] {
            T017Q51_A396EmprCod, T017Q51_A252CliCod, T017Q51_A65ArtCod, T017Q51_A2937RecIntCod
            }
            , new Object[] {
            T017Q52_A396EmprCod, T017Q52_A252CliCod, T017Q52_A65ArtCod, T017Q52_A2931Limite2
            }
            , new Object[] {
            T017Q53_A396EmprCod, T017Q53_A252CliCod, T017Q53_A65ArtCod, T017Q53_A71ArtEstAny, T017Q53_A2756ArtEstSer
            }
            , new Object[] {
            T017Q54_A396EmprCod, T017Q54_A252CliCod, T017Q54_A1504CliProCod, T017Q54_A65ArtCod
            }
            , new Object[] {
            T017Q55_A396EmprCod, T017Q55_A252CliCod, T017Q55_A65ArtCod, T017Q55_A598LinRec
            }
            , new Object[] {
            T017Q56_A396EmprCod, T017Q56_A252CliCod, T017Q56_A65ArtCod, T017Q56_A831TipColCod
            }
            , new Object[] {
            T017Q57_A396EmprCod, T017Q57_A252CliCod, T017Q57_A65ArtCod, T017Q57_A758ProCod
            }
            , new Object[] {
            T017Q58_A396EmprCod, T017Q58_A252CliCod, T017Q58_A65ArtCod
            }
            , new Object[] {
            T017Q59_A252CliCod, T017Q59_A65ArtCod, T017Q59_A10275Hz_clase, T017Q59_n10275Hz_clase, T017Q59_A10273Hz_desc, T017Q59_n10273Hz_desc, T017Q59_A10274Hz_descg, T017Q59_n10274Hz_descg, T017Q59_A10276Hz_porc, T017Q59_n10276Hz_porc,
            T017Q59_A10277Hz_Prov, T017Q59_n10277Hz_Prov, T017Q59_A396EmprCod, T017Q59_A10272Hz_cod
            }
            , new Object[] {
            T017Q60_A10275Hz_clase, T017Q60_n10275Hz_clase, T017Q60_A10273Hz_desc, T017Q60_n10273Hz_desc, T017Q60_A10274Hz_descg, T017Q60_n10274Hz_descg, T017Q60_A10277Hz_Prov, T017Q60_n10277Hz_Prov
            }
            , new Object[] {
            T017Q61_A396EmprCod, T017Q61_A252CliCod, T017Q61_A65ArtCod, T017Q61_A10272Hz_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017Q65_A10275Hz_clase, T017Q65_n10275Hz_clase, T017Q65_A10273Hz_desc, T017Q65_n10273Hz_desc, T017Q65_A10274Hz_descg, T017Q65_n10274Hz_descg, T017Q65_A10277Hz_Prov, T017Q65_n10277Hz_Prov
            }
            , new Object[] {
            T017Q66_A396EmprCod, T017Q66_A252CliCod, T017Q66_A65ArtCod, T017Q66_A10272Hz_cod
            }
            , new Object[] {
            T017Q67_A407EmprNom, T017Q67_n407EmprNom
            }
            , new Object[] {
            T017Q68_A396EmprCod
            }
         }
      );
      Z65ArtCod = "" ;
      n65ArtCod = false ;
      A65ArtCod = "" ;
      n65ArtCod = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR02JL" ;
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
   private short nRcdDeleted_1394 ;
   private short nRcdExists_1394 ;
   private short nIsMod_1394 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1394 ;
   private short RcdFound1394 ;
   private short nBlankRcdUsr1394 ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_1394 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
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
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1394_Enabled ;
   private int edtHz_cod_Enabled ;
   private int edtHz_clase_Enabled ;
   private int edtHz_desc_Enabled ;
   private int edtHz_descg_Enabled ;
   private int edtHz_porc_Enabled ;
   private int edtHz_Prov_Enabled ;
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
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHz_cod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10276Hz_porc ;
   private java.math.BigDecimal A10276Hz_porc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z10272Hz_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10272Hz_cod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1394 ;
   private String edtavnRcdDeleted_1394_Internalname ;
   private String edtHz_cod_Internalname ;
   private String edtHz_clase_Internalname ;
   private String edtHz_desc_Internalname ;
   private String edtHz_descg_Internalname ;
   private String edtHz_porc_Internalname ;
   private String edtHz_Prov_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode10 ;
   private String GXCCtl ;
   private String A10275Hz_clase ;
   private String A10273Hz_desc ;
   private String A10274Hz_descg ;
   private String A10277Hz_Prov ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z10275Hz_clase ;
   private String Z10273Hz_desc ;
   private String Z10274Hz_descg ;
   private String Z10277Hz_Prov ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1394_Jsonclick ;
   private String edtHz_cod_Jsonclick ;
   private String edtHz_clase_Jsonclick ;
   private String edtHz_desc_Jsonclick ;
   private String edtHz_descg_Jsonclick ;
   private String edtHz_porc_Jsonclick ;
   private String edtHz_Prov_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10275Hz_clase ;
   private boolean n10273Hz_desc ;
   private boolean n10274Hz_descg ;
   private boolean n10276Hz_porc ;
   private boolean n10277Hz_Prov ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017Q7_A407EmprNom ;
   private boolean[] T017Q7_n407EmprNom ;
   private String[] T017Q8_A396EmprCod ;
   private String[] T017Q9_A65ArtCod ;
   private boolean[] T017Q9_n65ArtCod ;
   private String[] T017Q9_A407EmprNom ;
   private boolean[] T017Q9_n407EmprNom ;
   private String[] T017Q9_A396EmprCod ;
   private int[] T017Q9_A252CliCod ;
   private boolean[] T017Q9_n252CliCod ;
   private String[] T017Q10_A396EmprCod ;
   private int[] T017Q10_A252CliCod ;
   private boolean[] T017Q10_n252CliCod ;
   private String[] T017Q10_A65ArtCod ;
   private boolean[] T017Q10_n65ArtCod ;
   private String[] T017Q6_A65ArtCod ;
   private boolean[] T017Q6_n65ArtCod ;
   private String[] T017Q6_A396EmprCod ;
   private int[] T017Q6_A252CliCod ;
   private boolean[] T017Q6_n252CliCod ;
   private String[] T017Q11_A396EmprCod ;
   private int[] T017Q11_A252CliCod ;
   private boolean[] T017Q11_n252CliCod ;
   private String[] T017Q11_A65ArtCod ;
   private boolean[] T017Q11_n65ArtCod ;
   private String[] T017Q12_A396EmprCod ;
   private int[] T017Q12_A252CliCod ;
   private boolean[] T017Q12_n252CliCod ;
   private String[] T017Q12_A65ArtCod ;
   private boolean[] T017Q12_n65ArtCod ;
   private String[] T017Q5_A65ArtCod ;
   private boolean[] T017Q5_n65ArtCod ;
   private String[] T017Q5_A396EmprCod ;
   private int[] T017Q5_A252CliCod ;
   private boolean[] T017Q5_n252CliCod ;
   private String[] T017Q15_A396EmprCod ;
   private int[] T017Q15_A252CliCod ;
   private boolean[] T017Q15_n252CliCod ;
   private String[] T017Q15_A65ArtCod ;
   private boolean[] T017Q15_n65ArtCod ;
   private byte[] T017Q15_A499GrpFamCod ;
   private String[] T017Q16_A396EmprCod ;
   private int[] T017Q16_A252CliCod ;
   private boolean[] T017Q16_n252CliCod ;
   private String[] T017Q16_A12814ARTConID ;
   private String[] T017Q16_A65ArtCod ;
   private boolean[] T017Q16_n65ArtCod ;
   private String[] T017Q17_A396EmprCod ;
   private int[] T017Q17_A252CliCod ;
   private boolean[] T017Q17_n252CliCod ;
   private String[] T017Q17_A65ArtCod ;
   private boolean[] T017Q17_n65ArtCod ;
   private byte[] T017Q17_A12363SocInt ;
   private String[] T017Q18_A396EmprCod ;
   private java.util.Date[] T017Q18_A4929Inc_Dia ;
   private short[] T017Q18_A5728JBCLLin ;
   private String[] T017Q19_A396EmprCod ;
   private int[] T017Q19_A252CliCod ;
   private boolean[] T017Q19_n252CliCod ;
   private String[] T017Q19_A5809MMezCod ;
   private String[] T017Q19_A65ArtCod ;
   private boolean[] T017Q19_n65ArtCod ;
   private String[] T017Q20_A396EmprCod ;
   private int[] T017Q20_A252CliCod ;
   private boolean[] T017Q20_n252CliCod ;
   private String[] T017Q20_A5234MezCod ;
   private byte[] T017Q20_A5240MezLin ;
   private String[] T017Q21_A396EmprCod ;
   private int[] T017Q21_A252CliCod ;
   private boolean[] T017Q21_n252CliCod ;
   private String[] T017Q21_A65ArtCod ;
   private boolean[] T017Q21_n65ArtCod ;
   private int[] T017Q21_A4116estreclim ;
   private String[] T017Q22_A396EmprCod ;
   private int[] T017Q22_A252CliCod ;
   private boolean[] T017Q22_n252CliCod ;
   private String[] T017Q22_A65ArtCod ;
   private boolean[] T017Q22_n65ArtCod ;
   private String[] T017Q22_A4061EstNomCol ;
   private String[] T017Q23_A396EmprCod ;
   private String[] T017Q23_A9705ErpNped ;
   private short[] T017Q23_A8652ErpLin ;
   private String[] T017Q24_A396EmprCod ;
   private int[] T017Q24_A252CliCod ;
   private boolean[] T017Q24_n252CliCod ;
   private String[] T017Q24_A65ArtCod ;
   private boolean[] T017Q24_n65ArtCod ;
   private String[] T017Q24_A7266CAAqP ;
   private String[] T017Q25_A396EmprCod ;
   private int[] T017Q25_A252CliCod ;
   private boolean[] T017Q25_n252CliCod ;
   private String[] T017Q25_A65ArtCod ;
   private boolean[] T017Q25_n65ArtCod ;
   private java.util.Date[] T017Q25_A11084H_DiaA ;
   private String[] T017Q26_A396EmprCod ;
   private int[] T017Q26_A252CliCod ;
   private boolean[] T017Q26_n252CliCod ;
   private String[] T017Q26_A65ArtCod ;
   private boolean[] T017Q26_n65ArtCod ;
   private byte[] T017Q26_A10972Int_cod ;
   private String[] T017Q27_A396EmprCod ;
   private int[] T017Q27_A252CliCod ;
   private boolean[] T017Q27_n252CliCod ;
   private String[] T017Q27_A65ArtCod ;
   private boolean[] T017Q27_n65ArtCod ;
   private String[] T017Q27_A10577Pg_Procod ;
   private String[] T017Q28_A396EmprCod ;
   private int[] T017Q28_A252CliCod ;
   private boolean[] T017Q28_n252CliCod ;
   private String[] T017Q28_A65ArtCod ;
   private boolean[] T017Q28_n65ArtCod ;
   private String[] T017Q28_A10041ArtSH ;
   private String[] T017Q29_A396EmprCod ;
   private int[] T017Q29_A252CliCod ;
   private boolean[] T017Q29_n252CliCod ;
   private String[] T017Q29_A65ArtCod ;
   private boolean[] T017Q29_n65ArtCod ;
   private String[] T017Q29_A8427TipoCt ;
   private int[] T017Q29_A8428CapMxMq ;
   private String[] T017Q30_A396EmprCod ;
   private int[] T017Q30_A252CliCod ;
   private boolean[] T017Q30_n252CliCod ;
   private String[] T017Q30_A65ArtCod ;
   private boolean[] T017Q30_n65ArtCod ;
   private short[] T017Q30_A8342CodPred ;
   private String[] T017Q31_A396EmprCod ;
   private int[] T017Q31_A252CliCod ;
   private boolean[] T017Q31_n252CliCod ;
   private String[] T017Q31_A65ArtCod ;
   private boolean[] T017Q31_n65ArtCod ;
   private String[] T017Q31_A8089ArtcodTj ;
   private String[] T017Q32_A396EmprCod ;
   private int[] T017Q32_A252CliCod ;
   private boolean[] T017Q32_n252CliCod ;
   private String[] T017Q32_A65ArtCod ;
   private boolean[] T017Q32_n65ArtCod ;
   private String[] T017Q32_A7956Mq_CodM ;
   private String[] T017Q33_A396EmprCod ;
   private int[] T017Q33_A252CliCod ;
   private boolean[] T017Q33_n252CliCod ;
   private String[] T017Q33_A65ArtCod ;
   private boolean[] T017Q33_n65ArtCod ;
   private short[] T017Q33_A7949Par_Art ;
   private String[] T017Q34_A396EmprCod ;
   private int[] T017Q34_A252CliCod ;
   private boolean[] T017Q34_n252CliCod ;
   private String[] T017Q34_A65ArtCod ;
   private boolean[] T017Q34_n65ArtCod ;
   private short[] T017Q34_A7135Lin_fast ;
   private String[] T017Q35_A396EmprCod ;
   private int[] T017Q35_A252CliCod ;
   private boolean[] T017Q35_n252CliCod ;
   private String[] T017Q35_A65ArtCod ;
   private boolean[] T017Q35_n65ArtCod ;
   private short[] T017Q35_A6954Mat_lin ;
   private String[] T017Q36_A396EmprCod ;
   private String[] T017Q36_A602MaqCod ;
   private int[] T017Q36_A6078MaqCliCod ;
   private String[] T017Q36_A6079MaqArtCod ;
   private String[] T017Q37_A396EmprCod ;
   private int[] T017Q37_A252CliCod ;
   private boolean[] T017Q37_n252CliCod ;
   private String[] T017Q37_A65ArtCod ;
   private boolean[] T017Q37_n65ArtCod ;
   private short[] T017Q37_A5382EstCatAny ;
   private String[] T017Q37_A5383EstCatSer ;
   private short[] T017Q37_A5384EstCatTip ;
   private String[] T017Q38_A396EmprCod ;
   private int[] T017Q38_A252CliCod ;
   private boolean[] T017Q38_n252CliCod ;
   private String[] T017Q38_A65ArtCod ;
   private boolean[] T017Q38_n65ArtCod ;
   private String[] T017Q38_A4658MdlCod ;
   private String[] T017Q39_A396EmprCod ;
   private int[] T017Q39_A252CliCod ;
   private boolean[] T017Q39_n252CliCod ;
   private String[] T017Q39_A4175WebEmpCod ;
   private String[] T017Q40_A396EmprCod ;
   private int[] T017Q40_A252CliCod ;
   private boolean[] T017Q40_n252CliCod ;
   private String[] T017Q40_A4079WEBDISCOD ;
   private String[] T017Q41_A396EmprCod ;
   private int[] T017Q41_A252CliCod ;
   private boolean[] T017Q41_n252CliCod ;
   private String[] T017Q41_A65ArtCod ;
   private boolean[] T017Q41_n65ArtCod ;
   private String[] T017Q41_A4058CCFColNom ;
   private int[] T017Q41_A4059CCFColNum ;
   private String[] T017Q42_A396EmprCod ;
   private int[] T017Q42_A252CliCod ;
   private boolean[] T017Q42_n252CliCod ;
   private String[] T017Q42_A65ArtCod ;
   private boolean[] T017Q42_n65ArtCod ;
   private String[] T017Q42_A1177Dibujo ;
   private int[] T017Q42_A1790DibIntCod ;
   private String[] T017Q43_A396EmprCod ;
   private int[] T017Q43_A252CliCod ;
   private boolean[] T017Q43_n252CliCod ;
   private String[] T017Q43_A65ArtCod ;
   private boolean[] T017Q43_n65ArtCod ;
   private byte[] T017Q43_A1080LinPre ;
   private String[] T017Q44_A396EmprCod ;
   private long[] T017Q44_A3814PePCod ;
   private String[] T017Q45_A396EmprCod ;
   private byte[] T017Q45_A3413OpeManCod ;
   private String[] T017Q45_A3430PreManNMt ;
   private int[] T017Q45_A252CliCod ;
   private boolean[] T017Q45_n252CliCod ;
   private String[] T017Q45_A65ArtCod ;
   private boolean[] T017Q45_n65ArtCod ;
   private String[] T017Q46_A396EmprCod ;
   private int[] T017Q46_A3415ParManNum ;
   private String[] T017Q47_A396EmprCod ;
   private byte[] T017Q47_A3331LanBroCod ;
   private short[] T017Q47_A3333LanBroLin ;
   private String[] T017Q48_A396EmprCod ;
   private int[] T017Q48_A252CliCod ;
   private boolean[] T017Q48_n252CliCod ;
   private String[] T017Q48_A65ArtCod ;
   private boolean[] T017Q48_n65ArtCod ;
   private java.math.BigDecimal[] T017Q48_A3319ArtCapKgs ;
   private String[] T017Q49_A396EmprCod ;
   private int[] T017Q49_A252CliCod ;
   private boolean[] T017Q49_n252CliCod ;
   private String[] T017Q49_A65ArtCod ;
   private boolean[] T017Q49_n65ArtCod ;
   private String[] T017Q49_A3288CCalCod ;
   private String[] T017Q50_A396EmprCod ;
   private int[] T017Q50_A252CliCod ;
   private boolean[] T017Q50_n252CliCod ;
   private String[] T017Q50_A65ArtCod ;
   private boolean[] T017Q50_n65ArtCod ;
   private String[] T017Q50_A3033CCCod ;
   private String[] T017Q51_A396EmprCod ;
   private int[] T017Q51_A252CliCod ;
   private boolean[] T017Q51_n252CliCod ;
   private String[] T017Q51_A65ArtCod ;
   private boolean[] T017Q51_n65ArtCod ;
   private byte[] T017Q51_A2937RecIntCod ;
   private String[] T017Q52_A396EmprCod ;
   private int[] T017Q52_A252CliCod ;
   private boolean[] T017Q52_n252CliCod ;
   private String[] T017Q52_A65ArtCod ;
   private boolean[] T017Q52_n65ArtCod ;
   private short[] T017Q52_A2931Limite2 ;
   private String[] T017Q53_A396EmprCod ;
   private int[] T017Q53_A252CliCod ;
   private boolean[] T017Q53_n252CliCod ;
   private String[] T017Q53_A65ArtCod ;
   private boolean[] T017Q53_n65ArtCod ;
   private short[] T017Q53_A71ArtEstAny ;
   private String[] T017Q53_A2756ArtEstSer ;
   private String[] T017Q54_A396EmprCod ;
   private int[] T017Q54_A252CliCod ;
   private boolean[] T017Q54_n252CliCod ;
   private String[] T017Q54_A1504CliProCod ;
   private String[] T017Q54_A65ArtCod ;
   private boolean[] T017Q54_n65ArtCod ;
   private String[] T017Q55_A396EmprCod ;
   private int[] T017Q55_A252CliCod ;
   private boolean[] T017Q55_n252CliCod ;
   private String[] T017Q55_A65ArtCod ;
   private boolean[] T017Q55_n65ArtCod ;
   private byte[] T017Q55_A598LinRec ;
   private String[] T017Q56_A396EmprCod ;
   private int[] T017Q56_A252CliCod ;
   private boolean[] T017Q56_n252CliCod ;
   private String[] T017Q56_A65ArtCod ;
   private boolean[] T017Q56_n65ArtCod ;
   private byte[] T017Q56_A831TipColCod ;
   private String[] T017Q57_A396EmprCod ;
   private int[] T017Q57_A252CliCod ;
   private boolean[] T017Q57_n252CliCod ;
   private String[] T017Q57_A65ArtCod ;
   private boolean[] T017Q57_n65ArtCod ;
   private String[] T017Q57_A758ProCod ;
   private String[] T017Q58_A396EmprCod ;
   private int[] T017Q58_A252CliCod ;
   private boolean[] T017Q58_n252CliCod ;
   private String[] T017Q58_A65ArtCod ;
   private boolean[] T017Q58_n65ArtCod ;
   private int[] T017Q59_A252CliCod ;
   private boolean[] T017Q59_n252CliCod ;
   private String[] T017Q59_A65ArtCod ;
   private boolean[] T017Q59_n65ArtCod ;
   private String[] T017Q59_A10275Hz_clase ;
   private boolean[] T017Q59_n10275Hz_clase ;
   private String[] T017Q59_A10273Hz_desc ;
   private boolean[] T017Q59_n10273Hz_desc ;
   private String[] T017Q59_A10274Hz_descg ;
   private boolean[] T017Q59_n10274Hz_descg ;
   private java.math.BigDecimal[] T017Q59_A10276Hz_porc ;
   private boolean[] T017Q59_n10276Hz_porc ;
   private String[] T017Q59_A10277Hz_Prov ;
   private boolean[] T017Q59_n10277Hz_Prov ;
   private String[] T017Q59_A396EmprCod ;
   private String[] T017Q59_A10272Hz_cod ;
   private String[] T017Q4_A10275Hz_clase ;
   private boolean[] T017Q4_n10275Hz_clase ;
   private String[] T017Q4_A10273Hz_desc ;
   private boolean[] T017Q4_n10273Hz_desc ;
   private String[] T017Q4_A10274Hz_descg ;
   private boolean[] T017Q4_n10274Hz_descg ;
   private String[] T017Q4_A10277Hz_Prov ;
   private boolean[] T017Q4_n10277Hz_Prov ;
   private String[] T017Q60_A10275Hz_clase ;
   private boolean[] T017Q60_n10275Hz_clase ;
   private String[] T017Q60_A10273Hz_desc ;
   private boolean[] T017Q60_n10273Hz_desc ;
   private String[] T017Q60_A10274Hz_descg ;
   private boolean[] T017Q60_n10274Hz_descg ;
   private String[] T017Q60_A10277Hz_Prov ;
   private boolean[] T017Q60_n10277Hz_Prov ;
   private String[] T017Q61_A396EmprCod ;
   private int[] T017Q61_A252CliCod ;
   private boolean[] T017Q61_n252CliCod ;
   private String[] T017Q61_A65ArtCod ;
   private boolean[] T017Q61_n65ArtCod ;
   private String[] T017Q61_A10272Hz_cod ;
   private int[] T017Q3_A252CliCod ;
   private boolean[] T017Q3_n252CliCod ;
   private String[] T017Q3_A65ArtCod ;
   private boolean[] T017Q3_n65ArtCod ;
   private java.math.BigDecimal[] T017Q3_A10276Hz_porc ;
   private boolean[] T017Q3_n10276Hz_porc ;
   private String[] T017Q3_A396EmprCod ;
   private String[] T017Q3_A10272Hz_cod ;
   private int[] T017Q2_A252CliCod ;
   private boolean[] T017Q2_n252CliCod ;
   private String[] T017Q2_A65ArtCod ;
   private boolean[] T017Q2_n65ArtCod ;
   private java.math.BigDecimal[] T017Q2_A10276Hz_porc ;
   private boolean[] T017Q2_n10276Hz_porc ;
   private String[] T017Q2_A396EmprCod ;
   private String[] T017Q2_A10272Hz_cod ;
   private String[] T017Q65_A10275Hz_clase ;
   private boolean[] T017Q65_n10275Hz_clase ;
   private String[] T017Q65_A10273Hz_desc ;
   private boolean[] T017Q65_n10273Hz_desc ;
   private String[] T017Q65_A10274Hz_descg ;
   private boolean[] T017Q65_n10274Hz_descg ;
   private String[] T017Q65_A10277Hz_Prov ;
   private boolean[] T017Q65_n10277Hz_Prov ;
   private String[] T017Q66_A396EmprCod ;
   private int[] T017Q66_A252CliCod ;
   private boolean[] T017Q66_n252CliCod ;
   private String[] T017Q66_A65ArtCod ;
   private boolean[] T017Q66_n65ArtCod ;
   private String[] T017Q66_A10272Hz_cod ;
   private String[] T017Q67_A407EmprNom ;
   private boolean[] T017Q67_n407EmprNom ;
   private String[] T017Q68_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr02jl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr02jl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr02jl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr02jl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr02jl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017Q2", "SELECT CliCod, ArtCod, Hz_porc, EmprCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Hz_cod = ?  FOR UPDATE OF Hz_porc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q3", "SELECT CliCod, ArtCod, Hz_porc, EmprCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Hz_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q4", "SELECT Hz_clase, Hz_desc, Hz_descg, Hz_Prov FROM TXPTR01JL WHERE EmprCod = ? AND Hz_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q5", "SELECT ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q6", "SELECT ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q8", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q9", "SELECT /*+ FIRST_ROWS(1) */ TM1.ArtCod, T2.EmprNom, TM1.EmprCod, TM1.CliCod FROM (TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017Q13", "INSERT INTO TXPARTICU(ArtCod, EmprCod, CliCod, ArtMat, TipArtCod, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T017Q14", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T017Q15", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q16", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q18", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q19", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q20", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q23", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q24", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q26", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q36", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q38", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q39", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q40", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q41", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q42", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q44", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q45", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q46", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q47", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q48", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q49", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q50", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q51", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q54", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q55", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q56", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q58", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017Q59", "SELECT T1.CliCod, T1.ArtCod, T2.Hz_clase, T2.Hz_desc, T2.Hz_descg, T1.Hz_porc, T2.Hz_Prov, T1.EmprCod, T1.Hz_cod FROM (TXPTR02JL T1 INNER JOIN TXPTR01JL T2 ON T2.EmprCod = T1.EmprCod AND T2.Hz_cod = T1.Hz_cod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.Hz_cod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Hz_cod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q60", "SELECT Hz_clase, Hz_desc, Hz_descg, Hz_Prov FROM TXPTR01JL WHERE EmprCod = ? AND Hz_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q61", "SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Hz_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017Q62", "INSERT INTO TXPTR02JL(CliCod, ArtCod, Hz_porc, EmprCod, Hz_cod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR02JL")
         ,new UpdateCursor("T017Q63", "UPDATE TXPTR02JL SET Hz_porc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Hz_cod = ?", GX_NOMASK, "TXPTR02JL")
         ,new UpdateCursor("T017Q64", "DELETE FROM TXPTR02JL  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Hz_cod = ?", GX_NOMASK, "TXPTR02JL")
         ,new ForEachCursor("T017Q65", "SELECT Hz_clase, Hz_desc, Hz_descg, Hz_Prov FROM TXPTR01JL WHERE EmprCod = ? AND Hz_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q66", "SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Hz_cod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q67", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017Q68", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 57 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((String[]) buf[13])[0] = rslt.getString(9, 12);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 66 :
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
               stmt.setString(4, (String)parms[5], 12);
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
               stmt.setString(4, (String)parms[5], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 12);
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
               return;
            case 8 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 15 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               stmt.setString(4, (String)parms[5], 12);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 12);
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
               stmt.setString(4, (String)parms[5], 12);
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 12);
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               stmt.setString(5, (String)parms[7], 12);
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
               stmt.setString(4, (String)parms[5], 12);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 12);
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
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
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
      }
   }

}

