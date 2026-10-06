package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpcarc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"CAAQPD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7266CAAqP = httpContext.GetPar( "CAAqP") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asacaaqpd1F61564( A396EmprCod, A7266CAAqP) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-RACABADO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtArtDsc_Internalname ;
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

   public tpcarc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpcarc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpcarc_impl.class ));
   }

   public tpcarc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPCARC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCARC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCARC.htm");
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
         nBlankRcdCount1564 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1564 = (short)(1) ;
            scanStart1F61564( ) ;
            while ( RcdFound1564 != 0 )
            {
               init_level_properties1564( ) ;
               getByPrimaryKey1F61564( ) ;
               addRow1F61564( ) ;
               scanNext1F61564( ) ;
            }
            scanEnd1F61564( ) ;
            nBlankRcdCount1564 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1F61564( ) ;
         standaloneModal1F61564( ) ;
         sMode1564 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1F61564( ) ;
            edtavnRcdDeleted_1564_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1564_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1564_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1564_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCAAqP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCAAqP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCAAqPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCAAqPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCAAqPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPRK_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCAAqPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPrK_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCAAqPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPRM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCAAqPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPrM_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1564 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1F61564( ) ;
            }
            sendRow1F61564( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1564 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1564 = (short)(5) ;
         nRcdExists_1564 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1F61564( ) ;
            while ( RcdFound1564 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451564( ) ;
               init_level_properties1564( ) ;
               standaloneNotModal1F61564( ) ;
               getByPrimaryKey1F61564( ) ;
               standaloneModal1F61564( ) ;
               addRow1F61564( ) ;
               scanNext1F61564( ) ;
            }
            scanEnd1F61564( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1564 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451564( ) ;
      initAll1F61564( ) ;
      init_level_properties1564( ) ;
      nRcdExists_1564 = (short)(0) ;
      nIsMod_1564 = (short)(0) ;
      nRcdDeleted_1564 = (short)(0) ;
      nBlankRcdCount1564 = (short)(nBlankRcdUsr1564+nBlankRcdCount1564) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1564 > 0 )
      {
         standaloneNotModal1F61564( ) ;
         standaloneModal1F61564( ) ;
         addRow1F61564( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCAAqP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1564 = (short)(nBlankRcdCount1564-1) ;
      }
      Gx_mode = sMode1564 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCARC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPCARC.htm");
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
      e111F62 ();
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
            Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
                        e111F62 ();
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
            initAll1F610( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1564_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1564_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1F610( ) ;
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

   public void confirm_1F60( )
   {
      beforeValidate1F610( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F610( ) ;
         }
         else
         {
            checkExtendedTable1F610( ) ;
            if ( AnyError == 0 )
            {
               zm1F610( 4) ;
            }
            closeExtendedTableCursors1F610( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_1F61564( ) ;
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
         confirmValues1F60( ) ;
      }
   }

   public void confirm_1F61564( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1F61564( ) ;
         if ( ( nRcdExists_1564 != 0 ) || ( nIsMod_1564 != 0 ) )
         {
            getKey1F61564( ) ;
            if ( ( nRcdExists_1564 == 0 ) && ( nRcdDeleted_1564 == 0 ) )
            {
               if ( RcdFound1564 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1F61564( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1F61564( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1F61564( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CAAQP_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCAAqP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1564 != 0 )
               {
                  if ( nRcdDeleted_1564 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1F61564( ) ;
                     load1F61564( ) ;
                     beforeValidate1F61564( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1F61564( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1564 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1F61564( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1F61564( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1F61564( ) ;
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
                  if ( nRcdDeleted_1564 == 0 )
                  {
                     GXCCtl = "CAAQP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCAAqP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1564_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCAAqP_Internalname, GXutil.rtrim( A7266CAAqP)) ;
         httpContext.changePostValue( edtCAAqPD_Internalname, GXutil.rtrim( A7267CAAqPD)) ;
         httpContext.changePostValue( edtCAAqPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCAAqPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7266CAAqP_"+sGXsfl_45_idx, GXutil.rtrim( Z7266CAAqP)) ;
         httpContext.changePostValue( "ZT_"+"Z7268CAAqPrK_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7269CAAqPrM_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1564 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1564_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1564_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPRK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPRM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1F60( )
   {
   }

   public void e111F62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpcarc_impl.this.A396EmprCod = GXv_char2[0] ;
      tpcarc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpcarc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1F610( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T01F65_A69ArtDsc[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TPCARC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01F66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01F66_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
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

   public void load1F610( )
   {
      /* Using cursor T01F67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A69ArtDsc = T01F67_A69ArtDsc[0] ;
         n69ArtDsc = T01F67_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A279CliNom = T01F67_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1F610( -3) ;
      }
      pr_default.close(5);
      onLoadActions1F610( ) ;
   }

   public void onLoadActions1F610( )
   {
   }

   public void checkExtendedTable1F610( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1F610( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F610( )
   {
      /* Using cursor T01F68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01F65_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01F65_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F65_A252CliCod[0] == A252CliCod ) )
      {
         zm1F610( 3) ;
         RcdFound10 = (short)(1) ;
         A69ArtDsc = T01F65_A69ArtDsc[0] ;
         n69ArtDsc = T01F65_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F610( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey1F610( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey1F610( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1F610( ) ;
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
      /* Using cursor T01F69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01F69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F69_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F69_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01F69_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F69_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F69_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T01F610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F610_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F610_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F610_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F610_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F610( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtArtDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F610( ) ;
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
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1F610( ) ;
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtArtDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F610( ) ;
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
                  GX_FocusControl = edtArtDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F610( ) ;
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
         GX_FocusControl = edtArtDsc_Internalname ;
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
      getKey1F610( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcarc");
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1F60( ) ;
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
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1F610( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F610( ) ;
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
      GX_FocusControl = edtArtDsc_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      scanStart1F610( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext1F610( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F610( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F610( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F64 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z69ArtDsc, T01F64_A69ArtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T01F64_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpcarc:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T01F64_A69ArtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F610( )
   {
      beforeValidate1F610( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F610( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F610( 0) ;
         checkOptimisticConcurrency1F610( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F610( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F610( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F611 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel1F610( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1F60( ) ;
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
            load1F610( ) ;
         }
         endLevel1F610( ) ;
      }
      closeExtendedTableCursors1F610( ) ;
   }

   public void update1F610( )
   {
      beforeValidate1F610( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F610( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F610( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F610( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F610( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F612 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F610( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                     tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
                     tpcarc_impl.this.A252CliCod = GXv_int5[0] ;
                     tpcarc_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F610( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1F60( ) ;
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
         endLevel1F610( ) ;
      }
      closeExtendedTableCursors1F610( ) ;
   }

   public void deferredUpdate1F610( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F610( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F610( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F610( ) ;
         afterConfirm1F610( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F610( ) ;
            if ( AnyError == 0 )
            {
               scanStart1F61564( ) ;
               while ( RcdFound1564 != 0 )
               {
                  getByPrimaryKey1F61564( ) ;
                  delete1F61564( ) ;
                  scanNext1F61564( ) ;
               }
               scanEnd1F61564( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F613 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
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
                           initAll1F610( ) ;
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
                        resetCaption1F60( ) ;
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
      endLevel1F610( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F610( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01F614 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01F615 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01F616 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01F617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01F618 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01F619 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01F620 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01F621 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01F622 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01F623 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01F624 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01F625 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01F626 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01F627 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01F628 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01F629 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01F630 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01F631 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01F632 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01F633 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01F634 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01F635 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01F636 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01F637 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01F638 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01F639 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01F640 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01F641 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01F642 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01F643 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01F644 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01F645 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01F646 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01F647 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01F648 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01F649 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01F650 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01F651 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01F652 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01F653 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01F654 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01F655 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01F656 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
      }
   }

   public void processNestedLevel1F61564( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1F61564( ) ;
         if ( ( nRcdExists_1564 != 0 ) || ( nIsMod_1564 != 0 ) )
         {
            standaloneNotModal1F61564( ) ;
            getKey1F61564( ) ;
            if ( ( nRcdExists_1564 == 0 ) && ( nRcdDeleted_1564 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1F61564( ) ;
            }
            else
            {
               if ( RcdFound1564 != 0 )
               {
                  if ( ( nRcdDeleted_1564 != 0 ) && ( nRcdExists_1564 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1F61564( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1564 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1F61564( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1564 == 0 )
                  {
                     GXCCtl = "CAAQP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCAAqP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1564_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCAAqP_Internalname, GXutil.rtrim( A7266CAAqP)) ;
         httpContext.changePostValue( edtCAAqPD_Internalname, GXutil.rtrim( A7267CAAqPD)) ;
         httpContext.changePostValue( edtCAAqPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCAAqPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7266CAAqP_"+sGXsfl_45_idx, GXutil.rtrim( Z7266CAAqP)) ;
         httpContext.changePostValue( "ZT_"+"Z7268CAAqPrK_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7269CAAqPrM_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1564_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1564 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1564_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1564_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPRK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CAAQPRM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1F61564( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1564 = (short)(0) ;
      nIsMod_1564 = (short)(0) ;
      nRcdDeleted_1564 = (short)(0) ;
   }

   public void processLevel1F610( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel1F61564( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1F610( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F610( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpcarc");
         if ( AnyError == 0 )
         {
            confirmValues1F60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcarc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F610( )
   {
      /* Scan By routine */
      /* Using cursor T01F657 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F610( )
   {
      /* Scan next routine */
      pr_default.readNext(55);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
   }

   public void scanEnd1F610( )
   {
      pr_default.close(55);
   }

   public void afterConfirm1F610( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F610( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F610( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F610( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F610( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F610( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F610( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1F61564( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7268CAAqPrK = T01F63_A7268CAAqPrK[0] ;
            Z7269CAAqPrM = T01F63_A7269CAAqPrM[0] ;
         }
         else
         {
            Z7268CAAqPrK = A7268CAAqPrK ;
            Z7269CAAqPrM = A7269CAAqPrM ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7266CAAqP = A7266CAAqP ;
         Z7268CAAqPrK = A7268CAAqPrK ;
         Z7269CAAqPrM = A7269CAAqPrM ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1F61564( )
   {
   }

   public void standaloneModal1F61564( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCAAqP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCAAqP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtCAAqP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCAAqP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1F61564( )
   {
      /* Using cursor T01F658 */
      pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound1564 = (short)(1) ;
         A7268CAAqPrK = T01F658_A7268CAAqPrK[0] ;
         n7268CAAqPrK = T01F658_n7268CAAqPrK[0] ;
         A7269CAAqPrM = T01F658_A7269CAAqPrM[0] ;
         n7269CAAqPrM = T01F658_n7269CAAqPrM[0] ;
         zm1F61564( -5) ;
      }
      pr_default.close(56);
      onLoadActions1F61564( ) ;
   }

   public void onLoadActions1F61564( )
   {
      GXt_char1 = A7267CAAqPD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7266CAAqP ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
      tpcarc_impl.this.A7266CAAqP = GXv_char3[0] ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7267CAAqPD = GXt_char1 ;
   }

   public void checkExtendedTable1F61564( )
   {
      nIsDirty_1564 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1F61564( ) ;
      nIsDirty_1564 = (short)(1) ;
      GXt_char1 = A7267CAAqPD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7266CAAqP ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
      tpcarc_impl.this.A7266CAAqP = GXv_char3[0] ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7267CAAqPD = GXt_char1 ;
   }

   public void closeExtendedTableCursors1F61564( )
   {
   }

   public void enableDisable1F61564( )
   {
   }

   public void getKey1F61564( )
   {
      /* Using cursor T01F659 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound1564 = (short)(1) ;
      }
      else
      {
         RcdFound1564 = (short)(0) ;
      }
      pr_default.close(57);
   }

   public void getByPrimaryKey1F61564( )
   {
      /* Using cursor T01F63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
      if ( (pr_default.getStatus(1) != 101) && ( T01F63_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F63_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01F63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1F61564( 5) ;
         RcdFound1564 = (short)(1) ;
         initializeNonKey1F61564( ) ;
         A7266CAAqP = T01F63_A7266CAAqP[0] ;
         A7268CAAqPrK = T01F63_A7268CAAqPrK[0] ;
         n7268CAAqPrK = T01F63_n7268CAAqPrK[0] ;
         A7269CAAqPrM = T01F63_A7269CAAqPrM[0] ;
         n7269CAAqPrM = T01F63_n7269CAAqPrM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z7266CAAqP = A7266CAAqP ;
         sMode1564 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F61564( ) ;
         load1F61564( ) ;
         Gx_mode = sMode1564 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1564 = (short)(0) ;
         initializeNonKey1F61564( ) ;
         sMode1564 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F61564( ) ;
         Gx_mode = sMode1564 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1F61564( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1F61564( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCARC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7268CAAqPrK, T01F62_A7268CAAqPrK[0]) != 0 ) || ( DecimalUtil.compareTo(Z7269CAAqPrM, T01F62_A7269CAAqPrM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7268CAAqPrK, T01F62_A7268CAAqPrK[0]) != 0 )
            {
               GXutil.writeLogln("tpcarc:[seudo value changed for attri]"+"CAAqPrK");
               GXutil.writeLogRaw("Old: ",Z7268CAAqPrK);
               GXutil.writeLogRaw("Current: ",T01F62_A7268CAAqPrK[0]);
            }
            if ( DecimalUtil.compareTo(Z7269CAAqPrM, T01F62_A7269CAAqPrM[0]) != 0 )
            {
               GXutil.writeLogln("tpcarc:[seudo value changed for attri]"+"CAAqPrM");
               GXutil.writeLogRaw("Old: ",Z7269CAAqPrM);
               GXutil.writeLogRaw("Current: ",T01F62_A7269CAAqPrM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCARC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F61564( )
   {
      beforeValidate1F61564( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F61564( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F61564( 0) ;
         checkOptimisticConcurrency1F61564( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F61564( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F61564( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F660 */
                  pr_default.execute(58, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP, Boolean.valueOf(n7268CAAqPrK), A7268CAAqPrK, Boolean.valueOf(n7269CAAqPrM), A7269CAAqPrM, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCARC");
                  if ( (pr_default.getStatus(58) == 1) )
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
            load1F61564( ) ;
         }
         endLevel1F61564( ) ;
      }
      closeExtendedTableCursors1F61564( ) ;
   }

   public void update1F61564( )
   {
      beforeValidate1F61564( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F61564( ) ;
      }
      if ( ( nIsMod_1564 != 0 ) || ( nIsDirty_1564 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1F61564( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1F61564( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1F61564( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01F661 */
                     pr_default.execute(59, new Object[] {Boolean.valueOf(n7268CAAqPrK), A7268CAAqPrK, Boolean.valueOf(n7269CAAqPrM), A7269CAAqPrM, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCARC");
                     if ( (pr_default.getStatus(59) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCARC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1F61564( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
                        tpcarc_impl.this.A252CliCod = GXv_int5[0] ;
                        tpcarc_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1F61564( ) ;
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
            endLevel1F61564( ) ;
         }
      }
      closeExtendedTableCursors1F61564( ) ;
   }

   public void deferredUpdate1F61564( )
   {
   }

   public void delete1F61564( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F61564( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F61564( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F61564( ) ;
         afterConfirm1F61564( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F61564( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F662 */
               pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A7266CAAqP});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCARC");
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
      sMode1564 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F61564( ) ;
      Gx_mode = sMode1564 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F61564( )
   {
      standaloneModal1F61564( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7267CAAqPD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A7266CAAqP ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
         tpcarc_impl.this.A7266CAAqP = GXv_char3[0] ;
         tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7267CAAqPD = GXt_char1 ;
      }
   }

   public void endLevel1F61564( )
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

   public void scanStart1F61564( )
   {
      /* Scan By routine */
      /* Using cursor T01F663 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1564 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound1564 = (short)(1) ;
         A7266CAAqP = T01F663_A7266CAAqP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F61564( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound1564 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound1564 = (short)(1) ;
         A7266CAAqP = T01F663_A7266CAAqP[0] ;
      }
   }

   public void scanEnd1F61564( )
   {
      pr_default.close(61);
   }

   public void afterConfirm1F61564( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F61564( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F61564( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F61564( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F61564( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F61564( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F61564( )
   {
      edtCAAqP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCAAqP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCAAqPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCAAqPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCAAqPrK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCAAqPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPrK_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCAAqPrM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCAAqPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqPrM_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1F61564( )
   {
   }

   public void send_integrity_lvl_hashes1F610( )
   {
   }

   public void subsflControlProps_451564( )
   {
      edtavnRcdDeleted_1564_Internalname = "vNRCDDELETED_1564_"+sGXsfl_45_idx ;
      edtCAAqP_Internalname = "CAAQP_"+sGXsfl_45_idx ;
      edtCAAqPD_Internalname = "CAAQPD_"+sGXsfl_45_idx ;
      edtCAAqPrK_Internalname = "CAAQPRK_"+sGXsfl_45_idx ;
      edtCAAqPrM_Internalname = "CAAQPRM_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451564( )
   {
      edtavnRcdDeleted_1564_Internalname = "vNRCDDELETED_1564_"+sGXsfl_45_fel_idx ;
      edtCAAqP_Internalname = "CAAQP_"+sGXsfl_45_fel_idx ;
      edtCAAqPD_Internalname = "CAAQPD_"+sGXsfl_45_fel_idx ;
      edtCAAqPrK_Internalname = "CAAQPRK_"+sGXsfl_45_fel_idx ;
      edtCAAqPrM_Internalname = "CAAQPRM_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1F61564( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451564( ) ;
      sendRow1F61564( ) ;
   }

   public void sendRow1F61564( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1564_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1564_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1564_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1564), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1564), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1564_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1564_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1564_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCAAqP_Internalname,GXutil.rtrim( A7266CAAqP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCAAqP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCAAqP_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCAAqPD_Internalname,GXutil.rtrim( A7267CAAqPD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCAAqPD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCAAqPD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1564_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCAAqPrK_Internalname,GXutil.ltrim( localUtil.ntoc( A7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCAAqPrK_Enabled!=0) ? localUtil.format( A7268CAAqPrK, "ZZZZZ9.99999") : localUtil.format( A7268CAAqPrK, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCAAqPrK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCAAqPrK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1564_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCAAqPrM_Internalname,GXutil.ltrim( localUtil.ntoc( A7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCAAqPrM_Enabled!=0) ? localUtil.format( A7269CAAqPrM, "ZZZZZ9.99999") : localUtil.format( A7269CAAqPrM, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCAAqPrM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCAAqPrM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1F61564( ) ;
      GXCCtl = "Z7266CAAqP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7266CAAqP));
      GXCCtl = "Z7268CAAqPrK_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7268CAAqPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7269CAAqPrM_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7269CAAqPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1564_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1564_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1564_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1564, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1564_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1564_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CAAQP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CAAQPD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CAAQPRK_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CAAQPRM_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1F61564( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451564( ) ;
      edtavnRcdDeleted_1564_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1564_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCAAqP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCAAqPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCAAqPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPRK_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCAAqPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CAAQPRM_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1564_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1564_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1564");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1564_Internalname ;
         wbErr = true ;
         nRcdDeleted_1564 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1564 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1564_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7266CAAqP = httpContext.cgiGet( edtCAAqP_Internalname) ;
      A7267CAAqPD = httpContext.cgiGet( edtCAAqPD_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCAAqPrK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCAAqPrK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CAAQPRK_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCAAqPrK_Internalname ;
         wbErr = true ;
         A7268CAAqPrK = DecimalUtil.ZERO ;
         n7268CAAqPrK = false ;
      }
      else
      {
         A7268CAAqPrK = localUtil.ctond( httpContext.cgiGet( edtCAAqPrK_Internalname)) ;
         n7268CAAqPrK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCAAqPrM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCAAqPrM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CAAQPRM_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCAAqPrM_Internalname ;
         wbErr = true ;
         A7269CAAqPrM = DecimalUtil.ZERO ;
         n7269CAAqPrM = false ;
      }
      else
      {
         A7269CAAqPrM = localUtil.ctond( httpContext.cgiGet( edtCAAqPrM_Internalname)) ;
         n7269CAAqPrM = false ;
      }
      GXCCtl = "Z7266CAAqP_" + sGXsfl_45_idx ;
      Z7266CAAqP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7268CAAqPrK_" + sGXsfl_45_idx ;
      Z7268CAAqPrK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7269CAAqPrM_" + sGXsfl_45_idx ;
      Z7269CAAqPrM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1564_" + sGXsfl_45_idx ;
      nRcdDeleted_1564 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1564_" + sGXsfl_45_idx ;
      nRcdExists_1564 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1564_" + sGXsfl_45_idx ;
      nIsMod_1564 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCAAqP_Enabled = edtCAAqP_Enabled ;
   }

   public void confirmValues1F60( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451564( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451564( ) ;
         httpContext.changePostValue( "Z7266CAAqP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z7266CAAqP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7266CAAqP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z7268CAAqPrK_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z7268CAAqPrK_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7268CAAqPrK_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z7269CAAqPrM_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z7269CAAqPrM_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7269CAAqPrM_"+sGXsfl_45_idx) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpcarc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpcarc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPCARC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-RACABADO", "") ;
   }

   public void initializeNonKey1F610( )
   {
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      Z69ArtDsc = "" ;
   }

   public void initAll1F610( )
   {
      initializeNonKey1F610( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1F61564( )
   {
      A7267CAAqPD = "" ;
      A7268CAAqPrK = DecimalUtil.ZERO ;
      n7268CAAqPrK = false ;
      A7269CAAqPrM = DecimalUtil.ZERO ;
      n7269CAAqPrM = false ;
      Z7268CAAqPrK = DecimalUtil.ZERO ;
      Z7269CAAqPrM = DecimalUtil.ZERO ;
   }

   public void initAll1F61564( )
   {
      A7266CAAqP = "" ;
      initializeNonKey1F61564( ) ;
   }

   public void standaloneModalInsert1F61564( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016313418", true, true);
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
      httpContext.AddJavascriptSource("tpcarc.js", "?202661016313418", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1564( )
   {
      edtCAAqP_Enabled = defedtCAAqP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCAAqP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCAAqP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1564, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1564_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7266CAAqP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7267CAAqPD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7268CAAqPrK, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7269CAAqPrM, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCAAqPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_1564_Internalname = "vNRCDDELETED_1564" ;
      edtCAAqP_Internalname = "CAAQP" ;
      edtCAAqPD_Internalname = "CAAQPD" ;
      edtCAAqPrK_Internalname = "CAAQPRK" ;
      edtCAAqPrM_Internalname = "CAAQPRM" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-RACABADO", "") );
      edtCAAqPrM_Jsonclick = "" ;
      edtCAAqPrK_Jsonclick = "" ;
      edtCAAqPD_Jsonclick = "" ;
      edtCAAqP_Jsonclick = "" ;
      edtavnRcdDeleted_1564_Jsonclick = "" ;
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
      edtCAAqPrM_Enabled = 1 ;
      edtCAAqPrK_Enabled = 1 ;
      edtCAAqPD_Enabled = 0 ;
      edtCAAqP_Enabled = 1 ;
      edtavnRcdDeleted_1564_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gx2asacaaqpd1F61564( String A396EmprCod ,
                                    String A7266CAAqP )
   {
      GXt_char1 = A7267CAAqPD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7266CAAqP ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
      tpcarc_impl.this.A7266CAAqP = GXv_char3[0] ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7267CAAqPD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7267CAAqPD))+"\"") ;
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
      subsflControlProps_451564( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1F61564( ) ;
         standaloneModal1F61564( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1F61564( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451564( ) ;
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
      /* Using cursor T01F664 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(62) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01F664_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(62);
      GX_FocusControl = edtArtDsc_Internalname ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Caaqp( )
   {
      GXt_char1 = A7267CAAqPD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A7266CAAqP ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpcarc_impl.this.A396EmprCod = GXv_char4[0] ;
      tpcarc_impl.this.A7266CAAqP = GXv_char3[0] ;
      tpcarc_impl.this.GXt_char1 = GXv_char2[0] ;
      A7267CAAqPD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7267CAAqPD", GXutil.rtrim( A7267CAAqPD));
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
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z69ArtDsc'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CAAQP","{handler:'valid_Caaqp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7266CAAqP',fld:'CAAQP',pic:''},{av:'A7267CAAqPD',fld:'CAAQPD',pic:''}]");
      setEventMetadata("VALID_CAAQP",",oparms:[{av:'A7267CAAqPD',fld:'CAAQPD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Caaqprm',iparms:[]");
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
      pr_default.close(62);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z7266CAAqP = "" ;
      Z7268CAAqPrK = DecimalUtil.ZERO ;
      Z7269CAAqPrM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7266CAAqP = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1564 = "" ;
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
      A7267CAAqPD = "" ;
      A7268CAAqPrK = DecimalUtil.ZERO ;
      A7269CAAqPrM = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z279CliNom = "" ;
      T01F66_A279CliNom = new String[] {""} ;
      T01F67_A65ArtCod = new String[] {""} ;
      T01F67_n65ArtCod = new boolean[] {false} ;
      T01F67_A69ArtDsc = new String[] {""} ;
      T01F67_n69ArtDsc = new boolean[] {false} ;
      T01F67_A279CliNom = new String[] {""} ;
      T01F67_A396EmprCod = new String[] {""} ;
      T01F67_A252CliCod = new int[1] ;
      T01F67_n252CliCod = new boolean[] {false} ;
      T01F68_A396EmprCod = new String[] {""} ;
      T01F68_A252CliCod = new int[1] ;
      T01F68_n252CliCod = new boolean[] {false} ;
      T01F68_A65ArtCod = new String[] {""} ;
      T01F68_n65ArtCod = new boolean[] {false} ;
      T01F65_A65ArtCod = new String[] {""} ;
      T01F65_n65ArtCod = new boolean[] {false} ;
      T01F65_A69ArtDsc = new String[] {""} ;
      T01F65_n69ArtDsc = new boolean[] {false} ;
      T01F65_A396EmprCod = new String[] {""} ;
      T01F65_A252CliCod = new int[1] ;
      T01F65_n252CliCod = new boolean[] {false} ;
      T01F69_A396EmprCod = new String[] {""} ;
      T01F69_A252CliCod = new int[1] ;
      T01F69_n252CliCod = new boolean[] {false} ;
      T01F69_A65ArtCod = new String[] {""} ;
      T01F69_n65ArtCod = new boolean[] {false} ;
      T01F610_A396EmprCod = new String[] {""} ;
      T01F610_A252CliCod = new int[1] ;
      T01F610_n252CliCod = new boolean[] {false} ;
      T01F610_A65ArtCod = new String[] {""} ;
      T01F610_n65ArtCod = new boolean[] {false} ;
      T01F64_A65ArtCod = new String[] {""} ;
      T01F64_n65ArtCod = new boolean[] {false} ;
      T01F64_A69ArtDsc = new String[] {""} ;
      T01F64_n69ArtDsc = new boolean[] {false} ;
      T01F64_A396EmprCod = new String[] {""} ;
      T01F64_A252CliCod = new int[1] ;
      T01F64_n252CliCod = new boolean[] {false} ;
      T01F614_A396EmprCod = new String[] {""} ;
      T01F614_A252CliCod = new int[1] ;
      T01F614_n252CliCod = new boolean[] {false} ;
      T01F614_A65ArtCod = new String[] {""} ;
      T01F614_n65ArtCod = new boolean[] {false} ;
      T01F614_A499GrpFamCod = new byte[1] ;
      T01F615_A396EmprCod = new String[] {""} ;
      T01F615_A252CliCod = new int[1] ;
      T01F615_n252CliCod = new boolean[] {false} ;
      T01F615_A12814ARTConID = new String[] {""} ;
      T01F615_A65ArtCod = new String[] {""} ;
      T01F615_n65ArtCod = new boolean[] {false} ;
      T01F616_A396EmprCod = new String[] {""} ;
      T01F616_A252CliCod = new int[1] ;
      T01F616_n252CliCod = new boolean[] {false} ;
      T01F616_A65ArtCod = new String[] {""} ;
      T01F616_n65ArtCod = new boolean[] {false} ;
      T01F616_A12363SocInt = new byte[1] ;
      T01F617_A396EmprCod = new String[] {""} ;
      T01F617_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01F617_A5728JBCLLin = new short[1] ;
      T01F618_A396EmprCod = new String[] {""} ;
      T01F618_A252CliCod = new int[1] ;
      T01F618_n252CliCod = new boolean[] {false} ;
      T01F618_A5809MMezCod = new String[] {""} ;
      T01F618_A65ArtCod = new String[] {""} ;
      T01F618_n65ArtCod = new boolean[] {false} ;
      T01F619_A396EmprCod = new String[] {""} ;
      T01F619_A252CliCod = new int[1] ;
      T01F619_n252CliCod = new boolean[] {false} ;
      T01F619_A5234MezCod = new String[] {""} ;
      T01F619_A5240MezLin = new byte[1] ;
      T01F620_A396EmprCod = new String[] {""} ;
      T01F620_A252CliCod = new int[1] ;
      T01F620_n252CliCod = new boolean[] {false} ;
      T01F620_A65ArtCod = new String[] {""} ;
      T01F620_n65ArtCod = new boolean[] {false} ;
      T01F620_A4116estreclim = new int[1] ;
      T01F621_A396EmprCod = new String[] {""} ;
      T01F621_A252CliCod = new int[1] ;
      T01F621_n252CliCod = new boolean[] {false} ;
      T01F621_A65ArtCod = new String[] {""} ;
      T01F621_n65ArtCod = new boolean[] {false} ;
      T01F621_A4061EstNomCol = new String[] {""} ;
      T01F622_A396EmprCod = new String[] {""} ;
      T01F622_A9705ErpNped = new String[] {""} ;
      T01F622_A8652ErpLin = new short[1] ;
      T01F623_A396EmprCod = new String[] {""} ;
      T01F623_A252CliCod = new int[1] ;
      T01F623_n252CliCod = new boolean[] {false} ;
      T01F623_A65ArtCod = new String[] {""} ;
      T01F623_n65ArtCod = new boolean[] {false} ;
      T01F623_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01F624_A396EmprCod = new String[] {""} ;
      T01F624_A252CliCod = new int[1] ;
      T01F624_n252CliCod = new boolean[] {false} ;
      T01F624_A65ArtCod = new String[] {""} ;
      T01F624_n65ArtCod = new boolean[] {false} ;
      T01F624_A10972Int_cod = new byte[1] ;
      T01F625_A396EmprCod = new String[] {""} ;
      T01F625_A252CliCod = new int[1] ;
      T01F625_n252CliCod = new boolean[] {false} ;
      T01F625_A65ArtCod = new String[] {""} ;
      T01F625_n65ArtCod = new boolean[] {false} ;
      T01F625_A10577Pg_Procod = new String[] {""} ;
      T01F626_A396EmprCod = new String[] {""} ;
      T01F626_A252CliCod = new int[1] ;
      T01F626_n252CliCod = new boolean[] {false} ;
      T01F626_A65ArtCod = new String[] {""} ;
      T01F626_n65ArtCod = new boolean[] {false} ;
      T01F626_A10272Hz_cod = new String[] {""} ;
      T01F627_A396EmprCod = new String[] {""} ;
      T01F627_A252CliCod = new int[1] ;
      T01F627_n252CliCod = new boolean[] {false} ;
      T01F627_A65ArtCod = new String[] {""} ;
      T01F627_n65ArtCod = new boolean[] {false} ;
      T01F627_A10041ArtSH = new String[] {""} ;
      T01F628_A396EmprCod = new String[] {""} ;
      T01F628_A252CliCod = new int[1] ;
      T01F628_n252CliCod = new boolean[] {false} ;
      T01F628_A65ArtCod = new String[] {""} ;
      T01F628_n65ArtCod = new boolean[] {false} ;
      T01F628_A8427TipoCt = new String[] {""} ;
      T01F628_A8428CapMxMq = new int[1] ;
      T01F629_A396EmprCod = new String[] {""} ;
      T01F629_A252CliCod = new int[1] ;
      T01F629_n252CliCod = new boolean[] {false} ;
      T01F629_A65ArtCod = new String[] {""} ;
      T01F629_n65ArtCod = new boolean[] {false} ;
      T01F629_A8342CodPred = new short[1] ;
      T01F630_A396EmprCod = new String[] {""} ;
      T01F630_A252CliCod = new int[1] ;
      T01F630_n252CliCod = new boolean[] {false} ;
      T01F630_A65ArtCod = new String[] {""} ;
      T01F630_n65ArtCod = new boolean[] {false} ;
      T01F630_A8089ArtcodTj = new String[] {""} ;
      T01F631_A396EmprCod = new String[] {""} ;
      T01F631_A252CliCod = new int[1] ;
      T01F631_n252CliCod = new boolean[] {false} ;
      T01F631_A65ArtCod = new String[] {""} ;
      T01F631_n65ArtCod = new boolean[] {false} ;
      T01F631_A7956Mq_CodM = new String[] {""} ;
      T01F632_A396EmprCod = new String[] {""} ;
      T01F632_A252CliCod = new int[1] ;
      T01F632_n252CliCod = new boolean[] {false} ;
      T01F632_A65ArtCod = new String[] {""} ;
      T01F632_n65ArtCod = new boolean[] {false} ;
      T01F632_A7949Par_Art = new short[1] ;
      T01F633_A396EmprCod = new String[] {""} ;
      T01F633_A252CliCod = new int[1] ;
      T01F633_n252CliCod = new boolean[] {false} ;
      T01F633_A65ArtCod = new String[] {""} ;
      T01F633_n65ArtCod = new boolean[] {false} ;
      T01F633_A7135Lin_fast = new short[1] ;
      T01F634_A396EmprCod = new String[] {""} ;
      T01F634_A252CliCod = new int[1] ;
      T01F634_n252CliCod = new boolean[] {false} ;
      T01F634_A65ArtCod = new String[] {""} ;
      T01F634_n65ArtCod = new boolean[] {false} ;
      T01F634_A6954Mat_lin = new short[1] ;
      T01F635_A396EmprCod = new String[] {""} ;
      T01F635_A602MaqCod = new String[] {""} ;
      T01F635_A6078MaqCliCod = new int[1] ;
      T01F635_A6079MaqArtCod = new String[] {""} ;
      T01F636_A396EmprCod = new String[] {""} ;
      T01F636_A252CliCod = new int[1] ;
      T01F636_n252CliCod = new boolean[] {false} ;
      T01F636_A65ArtCod = new String[] {""} ;
      T01F636_n65ArtCod = new boolean[] {false} ;
      T01F636_A5382EstCatAny = new short[1] ;
      T01F636_A5383EstCatSer = new String[] {""} ;
      T01F636_A5384EstCatTip = new short[1] ;
      T01F637_A396EmprCod = new String[] {""} ;
      T01F637_A252CliCod = new int[1] ;
      T01F637_n252CliCod = new boolean[] {false} ;
      T01F637_A65ArtCod = new String[] {""} ;
      T01F637_n65ArtCod = new boolean[] {false} ;
      T01F637_A4658MdlCod = new String[] {""} ;
      T01F638_A396EmprCod = new String[] {""} ;
      T01F638_A252CliCod = new int[1] ;
      T01F638_n252CliCod = new boolean[] {false} ;
      T01F638_A4175WebEmpCod = new String[] {""} ;
      T01F639_A396EmprCod = new String[] {""} ;
      T01F639_A252CliCod = new int[1] ;
      T01F639_n252CliCod = new boolean[] {false} ;
      T01F639_A4079WEBDISCOD = new String[] {""} ;
      T01F640_A396EmprCod = new String[] {""} ;
      T01F640_A252CliCod = new int[1] ;
      T01F640_n252CliCod = new boolean[] {false} ;
      T01F640_A65ArtCod = new String[] {""} ;
      T01F640_n65ArtCod = new boolean[] {false} ;
      T01F640_A4058CCFColNom = new String[] {""} ;
      T01F640_A4059CCFColNum = new int[1] ;
      T01F641_A396EmprCod = new String[] {""} ;
      T01F641_A252CliCod = new int[1] ;
      T01F641_n252CliCod = new boolean[] {false} ;
      T01F641_A65ArtCod = new String[] {""} ;
      T01F641_n65ArtCod = new boolean[] {false} ;
      T01F641_A1177Dibujo = new String[] {""} ;
      T01F641_A1790DibIntCod = new int[1] ;
      T01F642_A396EmprCod = new String[] {""} ;
      T01F642_A252CliCod = new int[1] ;
      T01F642_n252CliCod = new boolean[] {false} ;
      T01F642_A65ArtCod = new String[] {""} ;
      T01F642_n65ArtCod = new boolean[] {false} ;
      T01F642_A1080LinPre = new byte[1] ;
      T01F643_A396EmprCod = new String[] {""} ;
      T01F643_A3814PePCod = new long[1] ;
      T01F644_A396EmprCod = new String[] {""} ;
      T01F644_A3413OpeManCod = new byte[1] ;
      T01F644_A3430PreManNMt = new String[] {""} ;
      T01F644_A252CliCod = new int[1] ;
      T01F644_n252CliCod = new boolean[] {false} ;
      T01F644_A65ArtCod = new String[] {""} ;
      T01F644_n65ArtCod = new boolean[] {false} ;
      T01F645_A396EmprCod = new String[] {""} ;
      T01F645_A3415ParManNum = new int[1] ;
      T01F646_A396EmprCod = new String[] {""} ;
      T01F646_A3331LanBroCod = new byte[1] ;
      T01F646_A3333LanBroLin = new short[1] ;
      T01F647_A396EmprCod = new String[] {""} ;
      T01F647_A252CliCod = new int[1] ;
      T01F647_n252CliCod = new boolean[] {false} ;
      T01F647_A65ArtCod = new String[] {""} ;
      T01F647_n65ArtCod = new boolean[] {false} ;
      T01F647_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F648_A396EmprCod = new String[] {""} ;
      T01F648_A252CliCod = new int[1] ;
      T01F648_n252CliCod = new boolean[] {false} ;
      T01F648_A65ArtCod = new String[] {""} ;
      T01F648_n65ArtCod = new boolean[] {false} ;
      T01F648_A3288CCalCod = new String[] {""} ;
      T01F649_A396EmprCod = new String[] {""} ;
      T01F649_A252CliCod = new int[1] ;
      T01F649_n252CliCod = new boolean[] {false} ;
      T01F649_A65ArtCod = new String[] {""} ;
      T01F649_n65ArtCod = new boolean[] {false} ;
      T01F649_A3033CCCod = new String[] {""} ;
      T01F650_A396EmprCod = new String[] {""} ;
      T01F650_A252CliCod = new int[1] ;
      T01F650_n252CliCod = new boolean[] {false} ;
      T01F650_A65ArtCod = new String[] {""} ;
      T01F650_n65ArtCod = new boolean[] {false} ;
      T01F650_A2937RecIntCod = new byte[1] ;
      T01F651_A396EmprCod = new String[] {""} ;
      T01F651_A252CliCod = new int[1] ;
      T01F651_n252CliCod = new boolean[] {false} ;
      T01F651_A65ArtCod = new String[] {""} ;
      T01F651_n65ArtCod = new boolean[] {false} ;
      T01F651_A2931Limite2 = new short[1] ;
      T01F652_A396EmprCod = new String[] {""} ;
      T01F652_A252CliCod = new int[1] ;
      T01F652_n252CliCod = new boolean[] {false} ;
      T01F652_A65ArtCod = new String[] {""} ;
      T01F652_n65ArtCod = new boolean[] {false} ;
      T01F652_A71ArtEstAny = new short[1] ;
      T01F652_A2756ArtEstSer = new String[] {""} ;
      T01F653_A396EmprCod = new String[] {""} ;
      T01F653_A252CliCod = new int[1] ;
      T01F653_n252CliCod = new boolean[] {false} ;
      T01F653_A1504CliProCod = new String[] {""} ;
      T01F653_A65ArtCod = new String[] {""} ;
      T01F653_n65ArtCod = new boolean[] {false} ;
      T01F654_A396EmprCod = new String[] {""} ;
      T01F654_A252CliCod = new int[1] ;
      T01F654_n252CliCod = new boolean[] {false} ;
      T01F654_A65ArtCod = new String[] {""} ;
      T01F654_n65ArtCod = new boolean[] {false} ;
      T01F654_A598LinRec = new byte[1] ;
      T01F655_A396EmprCod = new String[] {""} ;
      T01F655_A252CliCod = new int[1] ;
      T01F655_n252CliCod = new boolean[] {false} ;
      T01F655_A65ArtCod = new String[] {""} ;
      T01F655_n65ArtCod = new boolean[] {false} ;
      T01F655_A831TipColCod = new byte[1] ;
      T01F656_A396EmprCod = new String[] {""} ;
      T01F656_A252CliCod = new int[1] ;
      T01F656_n252CliCod = new boolean[] {false} ;
      T01F656_A65ArtCod = new String[] {""} ;
      T01F656_n65ArtCod = new boolean[] {false} ;
      T01F656_A758ProCod = new String[] {""} ;
      T01F657_A396EmprCod = new String[] {""} ;
      T01F657_A252CliCod = new int[1] ;
      T01F657_n252CliCod = new boolean[] {false} ;
      T01F657_A65ArtCod = new String[] {""} ;
      T01F657_n65ArtCod = new boolean[] {false} ;
      T01F658_A252CliCod = new int[1] ;
      T01F658_n252CliCod = new boolean[] {false} ;
      T01F658_A65ArtCod = new String[] {""} ;
      T01F658_n65ArtCod = new boolean[] {false} ;
      T01F658_A7266CAAqP = new String[] {""} ;
      T01F658_A7268CAAqPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F658_n7268CAAqPrK = new boolean[] {false} ;
      T01F658_A7269CAAqPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F658_n7269CAAqPrM = new boolean[] {false} ;
      T01F658_A396EmprCod = new String[] {""} ;
      T01F659_A396EmprCod = new String[] {""} ;
      T01F659_A252CliCod = new int[1] ;
      T01F659_n252CliCod = new boolean[] {false} ;
      T01F659_A65ArtCod = new String[] {""} ;
      T01F659_n65ArtCod = new boolean[] {false} ;
      T01F659_A7266CAAqP = new String[] {""} ;
      T01F63_A252CliCod = new int[1] ;
      T01F63_n252CliCod = new boolean[] {false} ;
      T01F63_A65ArtCod = new String[] {""} ;
      T01F63_n65ArtCod = new boolean[] {false} ;
      T01F63_A7266CAAqP = new String[] {""} ;
      T01F63_A7268CAAqPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F63_n7268CAAqPrK = new boolean[] {false} ;
      T01F63_A7269CAAqPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F63_n7269CAAqPrM = new boolean[] {false} ;
      T01F63_A396EmprCod = new String[] {""} ;
      T01F62_A252CliCod = new int[1] ;
      T01F62_n252CliCod = new boolean[] {false} ;
      T01F62_A65ArtCod = new String[] {""} ;
      T01F62_n65ArtCod = new boolean[] {false} ;
      T01F62_A7266CAAqP = new String[] {""} ;
      T01F62_A7268CAAqPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F62_n7268CAAqPrK = new boolean[] {false} ;
      T01F62_A7269CAAqPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F62_n7269CAAqPrM = new boolean[] {false} ;
      T01F62_A396EmprCod = new String[] {""} ;
      GXv_int5 = new int[1] ;
      T01F663_A396EmprCod = new String[] {""} ;
      T01F663_A252CliCod = new int[1] ;
      T01F663_n252CliCod = new boolean[] {false} ;
      T01F663_A65ArtCod = new String[] {""} ;
      T01F663_n65ArtCod = new boolean[] {false} ;
      T01F663_A7266CAAqP = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01F664_A279CliNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ69ArtDsc = "" ;
      ZZ279CliNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z7267CAAqPD = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpcarc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpcarc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpcarc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpcarc__default(),
         new Object[] {
             new Object[] {
            T01F62_A252CliCod, T01F62_A65ArtCod, T01F62_A7266CAAqP, T01F62_A7268CAAqPrK, T01F62_n7268CAAqPrK, T01F62_A7269CAAqPrM, T01F62_n7269CAAqPrM, T01F62_A396EmprCod
            }
            , new Object[] {
            T01F63_A252CliCod, T01F63_A65ArtCod, T01F63_A7266CAAqP, T01F63_A7268CAAqPrK, T01F63_n7268CAAqPrK, T01F63_A7269CAAqPrM, T01F63_n7269CAAqPrM, T01F63_A396EmprCod
            }
            , new Object[] {
            T01F64_A65ArtCod, T01F64_A69ArtDsc, T01F64_n69ArtDsc, T01F64_A396EmprCod, T01F64_A252CliCod
            }
            , new Object[] {
            T01F65_A65ArtCod, T01F65_A69ArtDsc, T01F65_n69ArtDsc, T01F65_A396EmprCod, T01F65_A252CliCod
            }
            , new Object[] {
            T01F66_A279CliNom
            }
            , new Object[] {
            T01F67_A65ArtCod, T01F67_A69ArtDsc, T01F67_n69ArtDsc, T01F67_A279CliNom, T01F67_A396EmprCod, T01F67_A252CliCod
            }
            , new Object[] {
            T01F68_A396EmprCod, T01F68_A252CliCod, T01F68_A65ArtCod
            }
            , new Object[] {
            T01F69_A396EmprCod, T01F69_A252CliCod, T01F69_A65ArtCod
            }
            , new Object[] {
            T01F610_A396EmprCod, T01F610_A252CliCod, T01F610_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F614_A396EmprCod, T01F614_A252CliCod, T01F614_A65ArtCod, T01F614_A499GrpFamCod
            }
            , new Object[] {
            T01F615_A396EmprCod, T01F615_A252CliCod, T01F615_A12814ARTConID, T01F615_A65ArtCod
            }
            , new Object[] {
            T01F616_A396EmprCod, T01F616_A252CliCod, T01F616_A65ArtCod, T01F616_A12363SocInt
            }
            , new Object[] {
            T01F617_A396EmprCod, T01F617_A4929Inc_Dia, T01F617_A5728JBCLLin
            }
            , new Object[] {
            T01F618_A396EmprCod, T01F618_A252CliCod, T01F618_A5809MMezCod, T01F618_A65ArtCod
            }
            , new Object[] {
            T01F619_A396EmprCod, T01F619_A252CliCod, T01F619_A5234MezCod, T01F619_A5240MezLin
            }
            , new Object[] {
            T01F620_A396EmprCod, T01F620_A252CliCod, T01F620_A65ArtCod, T01F620_A4116estreclim
            }
            , new Object[] {
            T01F621_A396EmprCod, T01F621_A252CliCod, T01F621_A65ArtCod, T01F621_A4061EstNomCol
            }
            , new Object[] {
            T01F622_A396EmprCod, T01F622_A9705ErpNped, T01F622_A8652ErpLin
            }
            , new Object[] {
            T01F623_A396EmprCod, T01F623_A252CliCod, T01F623_A65ArtCod, T01F623_A11084H_DiaA
            }
            , new Object[] {
            T01F624_A396EmprCod, T01F624_A252CliCod, T01F624_A65ArtCod, T01F624_A10972Int_cod
            }
            , new Object[] {
            T01F625_A396EmprCod, T01F625_A252CliCod, T01F625_A65ArtCod, T01F625_A10577Pg_Procod
            }
            , new Object[] {
            T01F626_A396EmprCod, T01F626_A252CliCod, T01F626_A65ArtCod, T01F626_A10272Hz_cod
            }
            , new Object[] {
            T01F627_A396EmprCod, T01F627_A252CliCod, T01F627_A65ArtCod, T01F627_A10041ArtSH
            }
            , new Object[] {
            T01F628_A396EmprCod, T01F628_A252CliCod, T01F628_A65ArtCod, T01F628_A8427TipoCt, T01F628_A8428CapMxMq
            }
            , new Object[] {
            T01F629_A396EmprCod, T01F629_A252CliCod, T01F629_A65ArtCod, T01F629_A8342CodPred
            }
            , new Object[] {
            T01F630_A396EmprCod, T01F630_A252CliCod, T01F630_A65ArtCod, T01F630_A8089ArtcodTj
            }
            , new Object[] {
            T01F631_A396EmprCod, T01F631_A252CliCod, T01F631_A65ArtCod, T01F631_A7956Mq_CodM
            }
            , new Object[] {
            T01F632_A396EmprCod, T01F632_A252CliCod, T01F632_A65ArtCod, T01F632_A7949Par_Art
            }
            , new Object[] {
            T01F633_A396EmprCod, T01F633_A252CliCod, T01F633_A65ArtCod, T01F633_A7135Lin_fast
            }
            , new Object[] {
            T01F634_A396EmprCod, T01F634_A252CliCod, T01F634_A65ArtCod, T01F634_A6954Mat_lin
            }
            , new Object[] {
            T01F635_A396EmprCod, T01F635_A602MaqCod, T01F635_A6078MaqCliCod, T01F635_A6079MaqArtCod
            }
            , new Object[] {
            T01F636_A396EmprCod, T01F636_A252CliCod, T01F636_A65ArtCod, T01F636_A5382EstCatAny, T01F636_A5383EstCatSer, T01F636_A5384EstCatTip
            }
            , new Object[] {
            T01F637_A396EmprCod, T01F637_A252CliCod, T01F637_A65ArtCod, T01F637_A4658MdlCod
            }
            , new Object[] {
            T01F638_A396EmprCod, T01F638_A252CliCod, T01F638_A4175WebEmpCod
            }
            , new Object[] {
            T01F639_A396EmprCod, T01F639_A252CliCod, T01F639_A4079WEBDISCOD
            }
            , new Object[] {
            T01F640_A396EmprCod, T01F640_A252CliCod, T01F640_A65ArtCod, T01F640_A4058CCFColNom, T01F640_A4059CCFColNum
            }
            , new Object[] {
            T01F641_A396EmprCod, T01F641_A252CliCod, T01F641_A65ArtCod, T01F641_A1177Dibujo, T01F641_A1790DibIntCod
            }
            , new Object[] {
            T01F642_A396EmprCod, T01F642_A252CliCod, T01F642_A65ArtCod, T01F642_A1080LinPre
            }
            , new Object[] {
            T01F643_A396EmprCod, T01F643_A3814PePCod
            }
            , new Object[] {
            T01F644_A396EmprCod, T01F644_A3413OpeManCod, T01F644_A3430PreManNMt, T01F644_A252CliCod, T01F644_A65ArtCod
            }
            , new Object[] {
            T01F645_A396EmprCod, T01F645_A3415ParManNum
            }
            , new Object[] {
            T01F646_A396EmprCod, T01F646_A3331LanBroCod, T01F646_A3333LanBroLin
            }
            , new Object[] {
            T01F647_A396EmprCod, T01F647_A252CliCod, T01F647_A65ArtCod, T01F647_A3319ArtCapKgs
            }
            , new Object[] {
            T01F648_A396EmprCod, T01F648_A252CliCod, T01F648_A65ArtCod, T01F648_A3288CCalCod
            }
            , new Object[] {
            T01F649_A396EmprCod, T01F649_A252CliCod, T01F649_A65ArtCod, T01F649_A3033CCCod
            }
            , new Object[] {
            T01F650_A396EmprCod, T01F650_A252CliCod, T01F650_A65ArtCod, T01F650_A2937RecIntCod
            }
            , new Object[] {
            T01F651_A396EmprCod, T01F651_A252CliCod, T01F651_A65ArtCod, T01F651_A2931Limite2
            }
            , new Object[] {
            T01F652_A396EmprCod, T01F652_A252CliCod, T01F652_A65ArtCod, T01F652_A71ArtEstAny, T01F652_A2756ArtEstSer
            }
            , new Object[] {
            T01F653_A396EmprCod, T01F653_A252CliCod, T01F653_A1504CliProCod, T01F653_A65ArtCod
            }
            , new Object[] {
            T01F654_A396EmprCod, T01F654_A252CliCod, T01F654_A65ArtCod, T01F654_A598LinRec
            }
            , new Object[] {
            T01F655_A396EmprCod, T01F655_A252CliCod, T01F655_A65ArtCod, T01F655_A831TipColCod
            }
            , new Object[] {
            T01F656_A396EmprCod, T01F656_A252CliCod, T01F656_A65ArtCod, T01F656_A758ProCod
            }
            , new Object[] {
            T01F657_A396EmprCod, T01F657_A252CliCod, T01F657_A65ArtCod
            }
            , new Object[] {
            T01F658_A252CliCod, T01F658_A65ArtCod, T01F658_A7266CAAqP, T01F658_A7268CAAqPrK, T01F658_n7268CAAqPrK, T01F658_A7269CAAqPrM, T01F658_n7269CAAqPrM, T01F658_A396EmprCod
            }
            , new Object[] {
            T01F659_A396EmprCod, T01F659_A252CliCod, T01F659_A65ArtCod, T01F659_A7266CAAqP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F663_A396EmprCod, T01F663_A252CliCod, T01F663_A65ArtCod, T01F663_A7266CAAqP
            }
            , new Object[] {
            T01F664_A279CliNom
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
      AV32Pgmname = "TPCARC" ;
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
   private short nRcdDeleted_1564 ;
   private short nRcdExists_1564 ;
   private short nIsMod_1564 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1564 ;
   private short RcdFound1564 ;
   private short nBlankRcdUsr1564 ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_1564 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_1564_Enabled ;
   private int edtCAAqP_Enabled ;
   private int edtCAAqPD_Enabled ;
   private int edtCAAqPrK_Enabled ;
   private int edtCAAqPrM_Enabled ;
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
   private int defedtCAAqP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7268CAAqPrK ;
   private java.math.BigDecimal Z7269CAAqPrM ;
   private java.math.BigDecimal A7268CAAqPrK ;
   private java.math.BigDecimal A7269CAAqPrM ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z7266CAAqP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7266CAAqP ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArtDsc_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode1564 ;
   private String edtavnRcdDeleted_1564_Internalname ;
   private String edtCAAqP_Internalname ;
   private String edtCAAqPD_Internalname ;
   private String edtCAAqPrK_Internalname ;
   private String edtCAAqPrM_Internalname ;
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
   private String A7267CAAqPD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z279CliNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1564_Jsonclick ;
   private String edtCAAqP_Jsonclick ;
   private String edtCAAqPD_Jsonclick ;
   private String edtCAAqPrK_Jsonclick ;
   private String edtCAAqPrM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ69ArtDsc ;
   private String ZZ279CliNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z7267CAAqPD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean n7268CAAqPrK ;
   private boolean n7269CAAqPrM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01F66_A279CliNom ;
   private String[] T01F67_A65ArtCod ;
   private boolean[] T01F67_n65ArtCod ;
   private String[] T01F67_A69ArtDsc ;
   private boolean[] T01F67_n69ArtDsc ;
   private String[] T01F67_A279CliNom ;
   private String[] T01F67_A396EmprCod ;
   private int[] T01F67_A252CliCod ;
   private boolean[] T01F67_n252CliCod ;
   private String[] T01F68_A396EmprCod ;
   private int[] T01F68_A252CliCod ;
   private boolean[] T01F68_n252CliCod ;
   private String[] T01F68_A65ArtCod ;
   private boolean[] T01F68_n65ArtCod ;
   private String[] T01F65_A65ArtCod ;
   private boolean[] T01F65_n65ArtCod ;
   private String[] T01F65_A69ArtDsc ;
   private boolean[] T01F65_n69ArtDsc ;
   private String[] T01F65_A396EmprCod ;
   private int[] T01F65_A252CliCod ;
   private boolean[] T01F65_n252CliCod ;
   private String[] T01F69_A396EmprCod ;
   private int[] T01F69_A252CliCod ;
   private boolean[] T01F69_n252CliCod ;
   private String[] T01F69_A65ArtCod ;
   private boolean[] T01F69_n65ArtCod ;
   private String[] T01F610_A396EmprCod ;
   private int[] T01F610_A252CliCod ;
   private boolean[] T01F610_n252CliCod ;
   private String[] T01F610_A65ArtCod ;
   private boolean[] T01F610_n65ArtCod ;
   private String[] T01F64_A65ArtCod ;
   private boolean[] T01F64_n65ArtCod ;
   private String[] T01F64_A69ArtDsc ;
   private boolean[] T01F64_n69ArtDsc ;
   private String[] T01F64_A396EmprCod ;
   private int[] T01F64_A252CliCod ;
   private boolean[] T01F64_n252CliCod ;
   private String[] T01F614_A396EmprCod ;
   private int[] T01F614_A252CliCod ;
   private boolean[] T01F614_n252CliCod ;
   private String[] T01F614_A65ArtCod ;
   private boolean[] T01F614_n65ArtCod ;
   private byte[] T01F614_A499GrpFamCod ;
   private String[] T01F615_A396EmprCod ;
   private int[] T01F615_A252CliCod ;
   private boolean[] T01F615_n252CliCod ;
   private String[] T01F615_A12814ARTConID ;
   private String[] T01F615_A65ArtCod ;
   private boolean[] T01F615_n65ArtCod ;
   private String[] T01F616_A396EmprCod ;
   private int[] T01F616_A252CliCod ;
   private boolean[] T01F616_n252CliCod ;
   private String[] T01F616_A65ArtCod ;
   private boolean[] T01F616_n65ArtCod ;
   private byte[] T01F616_A12363SocInt ;
   private String[] T01F617_A396EmprCod ;
   private java.util.Date[] T01F617_A4929Inc_Dia ;
   private short[] T01F617_A5728JBCLLin ;
   private String[] T01F618_A396EmprCod ;
   private int[] T01F618_A252CliCod ;
   private boolean[] T01F618_n252CliCod ;
   private String[] T01F618_A5809MMezCod ;
   private String[] T01F618_A65ArtCod ;
   private boolean[] T01F618_n65ArtCod ;
   private String[] T01F619_A396EmprCod ;
   private int[] T01F619_A252CliCod ;
   private boolean[] T01F619_n252CliCod ;
   private String[] T01F619_A5234MezCod ;
   private byte[] T01F619_A5240MezLin ;
   private String[] T01F620_A396EmprCod ;
   private int[] T01F620_A252CliCod ;
   private boolean[] T01F620_n252CliCod ;
   private String[] T01F620_A65ArtCod ;
   private boolean[] T01F620_n65ArtCod ;
   private int[] T01F620_A4116estreclim ;
   private String[] T01F621_A396EmprCod ;
   private int[] T01F621_A252CliCod ;
   private boolean[] T01F621_n252CliCod ;
   private String[] T01F621_A65ArtCod ;
   private boolean[] T01F621_n65ArtCod ;
   private String[] T01F621_A4061EstNomCol ;
   private String[] T01F622_A396EmprCod ;
   private String[] T01F622_A9705ErpNped ;
   private short[] T01F622_A8652ErpLin ;
   private String[] T01F623_A396EmprCod ;
   private int[] T01F623_A252CliCod ;
   private boolean[] T01F623_n252CliCod ;
   private String[] T01F623_A65ArtCod ;
   private boolean[] T01F623_n65ArtCod ;
   private java.util.Date[] T01F623_A11084H_DiaA ;
   private String[] T01F624_A396EmprCod ;
   private int[] T01F624_A252CliCod ;
   private boolean[] T01F624_n252CliCod ;
   private String[] T01F624_A65ArtCod ;
   private boolean[] T01F624_n65ArtCod ;
   private byte[] T01F624_A10972Int_cod ;
   private String[] T01F625_A396EmprCod ;
   private int[] T01F625_A252CliCod ;
   private boolean[] T01F625_n252CliCod ;
   private String[] T01F625_A65ArtCod ;
   private boolean[] T01F625_n65ArtCod ;
   private String[] T01F625_A10577Pg_Procod ;
   private String[] T01F626_A396EmprCod ;
   private int[] T01F626_A252CliCod ;
   private boolean[] T01F626_n252CliCod ;
   private String[] T01F626_A65ArtCod ;
   private boolean[] T01F626_n65ArtCod ;
   private String[] T01F626_A10272Hz_cod ;
   private String[] T01F627_A396EmprCod ;
   private int[] T01F627_A252CliCod ;
   private boolean[] T01F627_n252CliCod ;
   private String[] T01F627_A65ArtCod ;
   private boolean[] T01F627_n65ArtCod ;
   private String[] T01F627_A10041ArtSH ;
   private String[] T01F628_A396EmprCod ;
   private int[] T01F628_A252CliCod ;
   private boolean[] T01F628_n252CliCod ;
   private String[] T01F628_A65ArtCod ;
   private boolean[] T01F628_n65ArtCod ;
   private String[] T01F628_A8427TipoCt ;
   private int[] T01F628_A8428CapMxMq ;
   private String[] T01F629_A396EmprCod ;
   private int[] T01F629_A252CliCod ;
   private boolean[] T01F629_n252CliCod ;
   private String[] T01F629_A65ArtCod ;
   private boolean[] T01F629_n65ArtCod ;
   private short[] T01F629_A8342CodPred ;
   private String[] T01F630_A396EmprCod ;
   private int[] T01F630_A252CliCod ;
   private boolean[] T01F630_n252CliCod ;
   private String[] T01F630_A65ArtCod ;
   private boolean[] T01F630_n65ArtCod ;
   private String[] T01F630_A8089ArtcodTj ;
   private String[] T01F631_A396EmprCod ;
   private int[] T01F631_A252CliCod ;
   private boolean[] T01F631_n252CliCod ;
   private String[] T01F631_A65ArtCod ;
   private boolean[] T01F631_n65ArtCod ;
   private String[] T01F631_A7956Mq_CodM ;
   private String[] T01F632_A396EmprCod ;
   private int[] T01F632_A252CliCod ;
   private boolean[] T01F632_n252CliCod ;
   private String[] T01F632_A65ArtCod ;
   private boolean[] T01F632_n65ArtCod ;
   private short[] T01F632_A7949Par_Art ;
   private String[] T01F633_A396EmprCod ;
   private int[] T01F633_A252CliCod ;
   private boolean[] T01F633_n252CliCod ;
   private String[] T01F633_A65ArtCod ;
   private boolean[] T01F633_n65ArtCod ;
   private short[] T01F633_A7135Lin_fast ;
   private String[] T01F634_A396EmprCod ;
   private int[] T01F634_A252CliCod ;
   private boolean[] T01F634_n252CliCod ;
   private String[] T01F634_A65ArtCod ;
   private boolean[] T01F634_n65ArtCod ;
   private short[] T01F634_A6954Mat_lin ;
   private String[] T01F635_A396EmprCod ;
   private String[] T01F635_A602MaqCod ;
   private int[] T01F635_A6078MaqCliCod ;
   private String[] T01F635_A6079MaqArtCod ;
   private String[] T01F636_A396EmprCod ;
   private int[] T01F636_A252CliCod ;
   private boolean[] T01F636_n252CliCod ;
   private String[] T01F636_A65ArtCod ;
   private boolean[] T01F636_n65ArtCod ;
   private short[] T01F636_A5382EstCatAny ;
   private String[] T01F636_A5383EstCatSer ;
   private short[] T01F636_A5384EstCatTip ;
   private String[] T01F637_A396EmprCod ;
   private int[] T01F637_A252CliCod ;
   private boolean[] T01F637_n252CliCod ;
   private String[] T01F637_A65ArtCod ;
   private boolean[] T01F637_n65ArtCod ;
   private String[] T01F637_A4658MdlCod ;
   private String[] T01F638_A396EmprCod ;
   private int[] T01F638_A252CliCod ;
   private boolean[] T01F638_n252CliCod ;
   private String[] T01F638_A4175WebEmpCod ;
   private String[] T01F639_A396EmprCod ;
   private int[] T01F639_A252CliCod ;
   private boolean[] T01F639_n252CliCod ;
   private String[] T01F639_A4079WEBDISCOD ;
   private String[] T01F640_A396EmprCod ;
   private int[] T01F640_A252CliCod ;
   private boolean[] T01F640_n252CliCod ;
   private String[] T01F640_A65ArtCod ;
   private boolean[] T01F640_n65ArtCod ;
   private String[] T01F640_A4058CCFColNom ;
   private int[] T01F640_A4059CCFColNum ;
   private String[] T01F641_A396EmprCod ;
   private int[] T01F641_A252CliCod ;
   private boolean[] T01F641_n252CliCod ;
   private String[] T01F641_A65ArtCod ;
   private boolean[] T01F641_n65ArtCod ;
   private String[] T01F641_A1177Dibujo ;
   private int[] T01F641_A1790DibIntCod ;
   private String[] T01F642_A396EmprCod ;
   private int[] T01F642_A252CliCod ;
   private boolean[] T01F642_n252CliCod ;
   private String[] T01F642_A65ArtCod ;
   private boolean[] T01F642_n65ArtCod ;
   private byte[] T01F642_A1080LinPre ;
   private String[] T01F643_A396EmprCod ;
   private long[] T01F643_A3814PePCod ;
   private String[] T01F644_A396EmprCod ;
   private byte[] T01F644_A3413OpeManCod ;
   private String[] T01F644_A3430PreManNMt ;
   private int[] T01F644_A252CliCod ;
   private boolean[] T01F644_n252CliCod ;
   private String[] T01F644_A65ArtCod ;
   private boolean[] T01F644_n65ArtCod ;
   private String[] T01F645_A396EmprCod ;
   private int[] T01F645_A3415ParManNum ;
   private String[] T01F646_A396EmprCod ;
   private byte[] T01F646_A3331LanBroCod ;
   private short[] T01F646_A3333LanBroLin ;
   private String[] T01F647_A396EmprCod ;
   private int[] T01F647_A252CliCod ;
   private boolean[] T01F647_n252CliCod ;
   private String[] T01F647_A65ArtCod ;
   private boolean[] T01F647_n65ArtCod ;
   private java.math.BigDecimal[] T01F647_A3319ArtCapKgs ;
   private String[] T01F648_A396EmprCod ;
   private int[] T01F648_A252CliCod ;
   private boolean[] T01F648_n252CliCod ;
   private String[] T01F648_A65ArtCod ;
   private boolean[] T01F648_n65ArtCod ;
   private String[] T01F648_A3288CCalCod ;
   private String[] T01F649_A396EmprCod ;
   private int[] T01F649_A252CliCod ;
   private boolean[] T01F649_n252CliCod ;
   private String[] T01F649_A65ArtCod ;
   private boolean[] T01F649_n65ArtCod ;
   private String[] T01F649_A3033CCCod ;
   private String[] T01F650_A396EmprCod ;
   private int[] T01F650_A252CliCod ;
   private boolean[] T01F650_n252CliCod ;
   private String[] T01F650_A65ArtCod ;
   private boolean[] T01F650_n65ArtCod ;
   private byte[] T01F650_A2937RecIntCod ;
   private String[] T01F651_A396EmprCod ;
   private int[] T01F651_A252CliCod ;
   private boolean[] T01F651_n252CliCod ;
   private String[] T01F651_A65ArtCod ;
   private boolean[] T01F651_n65ArtCod ;
   private short[] T01F651_A2931Limite2 ;
   private String[] T01F652_A396EmprCod ;
   private int[] T01F652_A252CliCod ;
   private boolean[] T01F652_n252CliCod ;
   private String[] T01F652_A65ArtCod ;
   private boolean[] T01F652_n65ArtCod ;
   private short[] T01F652_A71ArtEstAny ;
   private String[] T01F652_A2756ArtEstSer ;
   private String[] T01F653_A396EmprCod ;
   private int[] T01F653_A252CliCod ;
   private boolean[] T01F653_n252CliCod ;
   private String[] T01F653_A1504CliProCod ;
   private String[] T01F653_A65ArtCod ;
   private boolean[] T01F653_n65ArtCod ;
   private String[] T01F654_A396EmprCod ;
   private int[] T01F654_A252CliCod ;
   private boolean[] T01F654_n252CliCod ;
   private String[] T01F654_A65ArtCod ;
   private boolean[] T01F654_n65ArtCod ;
   private byte[] T01F654_A598LinRec ;
   private String[] T01F655_A396EmprCod ;
   private int[] T01F655_A252CliCod ;
   private boolean[] T01F655_n252CliCod ;
   private String[] T01F655_A65ArtCod ;
   private boolean[] T01F655_n65ArtCod ;
   private byte[] T01F655_A831TipColCod ;
   private String[] T01F656_A396EmprCod ;
   private int[] T01F656_A252CliCod ;
   private boolean[] T01F656_n252CliCod ;
   private String[] T01F656_A65ArtCod ;
   private boolean[] T01F656_n65ArtCod ;
   private String[] T01F656_A758ProCod ;
   private String[] T01F657_A396EmprCod ;
   private int[] T01F657_A252CliCod ;
   private boolean[] T01F657_n252CliCod ;
   private String[] T01F657_A65ArtCod ;
   private boolean[] T01F657_n65ArtCod ;
   private int[] T01F658_A252CliCod ;
   private boolean[] T01F658_n252CliCod ;
   private String[] T01F658_A65ArtCod ;
   private boolean[] T01F658_n65ArtCod ;
   private String[] T01F658_A7266CAAqP ;
   private java.math.BigDecimal[] T01F658_A7268CAAqPrK ;
   private boolean[] T01F658_n7268CAAqPrK ;
   private java.math.BigDecimal[] T01F658_A7269CAAqPrM ;
   private boolean[] T01F658_n7269CAAqPrM ;
   private String[] T01F658_A396EmprCod ;
   private String[] T01F659_A396EmprCod ;
   private int[] T01F659_A252CliCod ;
   private boolean[] T01F659_n252CliCod ;
   private String[] T01F659_A65ArtCod ;
   private boolean[] T01F659_n65ArtCod ;
   private String[] T01F659_A7266CAAqP ;
   private int[] T01F63_A252CliCod ;
   private boolean[] T01F63_n252CliCod ;
   private String[] T01F63_A65ArtCod ;
   private boolean[] T01F63_n65ArtCod ;
   private String[] T01F63_A7266CAAqP ;
   private java.math.BigDecimal[] T01F63_A7268CAAqPrK ;
   private boolean[] T01F63_n7268CAAqPrK ;
   private java.math.BigDecimal[] T01F63_A7269CAAqPrM ;
   private boolean[] T01F63_n7269CAAqPrM ;
   private String[] T01F63_A396EmprCod ;
   private int[] T01F62_A252CliCod ;
   private boolean[] T01F62_n252CliCod ;
   private String[] T01F62_A65ArtCod ;
   private boolean[] T01F62_n65ArtCod ;
   private String[] T01F62_A7266CAAqP ;
   private java.math.BigDecimal[] T01F62_A7268CAAqPrK ;
   private boolean[] T01F62_n7268CAAqPrK ;
   private java.math.BigDecimal[] T01F62_A7269CAAqPrM ;
   private boolean[] T01F62_n7269CAAqPrM ;
   private String[] T01F62_A396EmprCod ;
   private String[] T01F663_A396EmprCod ;
   private int[] T01F663_A252CliCod ;
   private boolean[] T01F663_n252CliCod ;
   private String[] T01F663_A65ArtCod ;
   private boolean[] T01F663_n65ArtCod ;
   private String[] T01F663_A7266CAAqP ;
   private String[] T01F664_A279CliNom ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpcarc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcarc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcarc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcarc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F62", "SELECT CliCod, ArtCod, CAAqP, CAAqPrK, CAAqPrM, EmprCod FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CAAqP = ?  FOR UPDATE OF CAAqPrK, CAAqPrM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F63", "SELECT CliCod, ArtCod, CAAqP, CAAqPrK, CAAqPrM, EmprCod FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CAAqP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F64", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F65", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F66", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F67", "SELECT /*+ FIRST_ROWS(1) */ TM1.ArtCod, TM1.ArtDsc, T2.CliNom, TM1.EmprCod, TM1.CliCod FROM (TXPARTICU TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F68", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F69", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F611", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01F612", "UPDATE TXPARTICU SET ArtDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01F613", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01F614", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F615", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F616", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F617", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F618", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F619", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F620", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F621", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F622", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F623", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F624", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F625", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F626", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F627", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F628", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F629", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F630", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F631", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F632", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F633", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F634", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F635", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F636", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F637", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F638", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F639", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F640", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F641", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F642", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F643", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F644", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F645", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F646", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F647", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F648", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F649", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F650", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F651", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F652", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F653", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F654", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F655", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F656", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F657", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F658", "SELECT CliCod, ArtCod, CAAqP, CAAqPrK, CAAqPrM, EmprCod FROM TXPPCARC WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CAAqP = ? ORDER BY EmprCod, CliCod, ArtCod, CAAqP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F659", "SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CAAqP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01F660", "INSERT INTO TXPPCARC(CliCod, ArtCod, CAAqP, CAAqPrK, CAAqPrM, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPCARC")
         ,new UpdateCursor("T01F661", "UPDATE TXPPCARC SET CAAqPrK=?, CAAqPrM=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CAAqP = ?", GX_NOMASK, "TXPPCARC")
         ,new UpdateCursor("T01F662", "DELETE FROM TXPPCARC  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CAAqP = ?", GX_NOMASK, "TXPPCARC")
         ,new ForEachCursor("T01F663", "SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, CAAqP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F664", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 56 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 62 :
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
               stmt.setString(4, (String)parms[5], 6);
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
               stmt.setString(4, (String)parms[5], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(2, (String)parms[3], 26);
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
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               stmt.setString(4, (String)parms[5], 6);
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
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 58 :
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
               stmt.setString(3, (String)parms[4], 6);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 5);
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               stmt.setString(6, (String)parms[9], 6);
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
               stmt.setString(4, (String)parms[5], 6);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
      }
   }

}

