package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn28_impl extends GXDataArea
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Combinaciones", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public ttrn28_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn28_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn28_impl.class ));
   }

   public ttrn28_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn28.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn28.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
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
         nBlankRcdCount533 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_533 = (short)(1) ;
            scanStart1NC533( ) ;
            while ( RcdFound533 != 0 )
            {
               init_level_properties533( ) ;
               getByPrimaryKey1NC533( ) ;
               addRow1NC533( ) ;
               scanNext1NC533( ) ;
            }
            scanEnd1NC533( ) ;
            nBlankRcdCount533 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NC533( ) ;
         standaloneModal1NC533( ) ;
         sMode533 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1NC533( ) ;
            edtavnRcdDeleted_533_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_533_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_533_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_533_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMMTR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComMtr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarComMLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMMLAN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarComMLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComMLan_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarComPLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPLAN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarComPLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPLan_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarComPEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPEST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarComPEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPEst_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAlbEComM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAlbEComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComP_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAlbEComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComPre_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarGasEmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGASEMP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarGasEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGasEmp_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarGasAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGASACA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarGasAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGasAca_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAlbEstObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBESTOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEstObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEstObs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_533 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NC533( ) ;
            }
            sendRow1NC533( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount533 = (short)(5) ;
         nRcdExists_533 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NC533( ) ;
            while ( RcdFound533 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50533( ) ;
               init_level_properties533( ) ;
               standaloneNotModal1NC533( ) ;
               getByPrimaryKey1NC533( ) ;
               standaloneModal1NC533( ) ;
               addRow1NC533( ) ;
               scanNext1NC533( ) ;
            }
            scanEnd1NC533( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode533 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_50533( ) ;
         initAll1NC533( ) ;
         init_level_properties533( ) ;
         nRcdExists_533 = (short)(0) ;
         nIsMod_533 = (short)(0) ;
         nRcdDeleted_533 = (short)(0) ;
         nBlankRcdCount533 = (short)(nBlankRcdUsr533+nBlankRcdCount533) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount533 > 0 )
         {
            standaloneNotModal1NC533( ) ;
            standaloneModal1NC533( ) ;
            addRow1NC533( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisComLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount533 = (short)(nBlankRcdCount533-1) ;
         }
         Gx_mode = sMode533 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn28.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn28.htm");
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
      e111NC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn28");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn28:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                  sMode195 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode195 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound195 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1NC0( ) ;
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
                        e111NC2 ();
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
            initAll1NC195( ) ;
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
         disableAttributes1NC195( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_533_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_533_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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

   public void confirm_1NC0( )
   {
      beforeValidate1NC195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NC195( ) ;
         }
         else
         {
            checkExtendedTable1NC195( ) ;
            if ( AnyError == 0 )
            {
               zm1NC195( 2) ;
               zm1NC195( 3) ;
               zm1NC195( 4) ;
            }
            closeExtendedTableCursors1NC195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_1NC533( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode195 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NC0( ) ;
      }
   }

   public void confirm_1NC533( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1NC533( ) ;
         if ( ( nRcdExists_533 != 0 ) || ( nIsMod_533 != 0 ) )
         {
            getKey1NC533( ) ;
            if ( ( nRcdExists_533 == 0 ) && ( nRcdDeleted_533 == 0 ) )
            {
               if ( RcdFound533 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NC533( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NC533( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NC533( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISCOMLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisComLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound533 != 0 )
               {
                  if ( nRcdDeleted_533 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NC533( ) ;
                     load1NC533( ) ;
                     beforeValidate1NC533( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NC533( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NC533( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NC533( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NC533( ) ;
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
                  if ( nRcdDeleted_533 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_533_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtBarComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1541BarComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1543BarComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComMLan_Internalname, GXutil.ltrim( localUtil.ntoc( A1540BarComMLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPLan_Internalname, GXutil.ltrim( localUtil.ntoc( A1544BarComPLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPEst_Internalname, GXutil.ltrim( localUtil.ntoc( A1542BarComPEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComM_Internalname, GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComP_Internalname, GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarGasEmp_Internalname, GXutil.ltrim( localUtil.ntoc( A2514BarGasEmp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarGasAca_Internalname, GXutil.ltrim( localUtil.ntoc( A2513BarGasAca, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEstObs_Internalname, GXutil.rtrim( A2506AlbEstObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_50_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_50_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2506AlbEstObs_"+sGXsfl_50_idx, GXutil.rtrim( Z2506AlbEstObs)) ;
         httpContext.changePostValue( "nRcdDeleted_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_533 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_533_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMMLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGASEMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasEmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGASACA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBESTOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEstObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NC0( )
   {
   }

   public void e111NC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn28_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttrn28_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn28_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn28_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn28_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn28_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1NC195( int GX_JID )
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
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TTrn28" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01NC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NC6_A407EmprNom[0] ;
      n407EmprNom = T01NC6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01NC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T01NC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
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

   public void load1NC195( )
   {
      /* Using cursor T01NC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A407EmprNom = T01NC9_A407EmprNom[0] ;
         n407EmprNom = T01NC9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1NC195( -1) ;
      }
      pr_default.close(7);
      onLoadActions1NC195( ) ;
   }

   public void onLoadActions1NC195( )
   {
   }

   public void checkExtendedTable1NC195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NC195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NC195( )
   {
      /* Using cursor T01NC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01NC5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC5_A129BarCod[0] == A129BarCod ) && ( T01NC5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NC5_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zm1NC195( 1) ;
         RcdFound195 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NC195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1NC195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1NC195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1NC195( ) ;
      if ( RcdFound195 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01NC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01NC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC11_A129BarCod[0] == A129BarCod ) && ( T01NC11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NC11_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01NC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC11_A129BarCod[0] == A129BarCod ) && ( T01NC11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NC11_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01NC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01NC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC12_A129BarCod[0] == A129BarCod ) && ( T01NC12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NC12_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01NC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC12_A129BarCod[0] == A129BarCod ) && ( T01NC12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01NC12_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NC195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1NC195( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound195 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
               /* Update record */
               update1NC195( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               insert1NC195( ) ;
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
                  insert1NC195( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1NC195( ) ;
      if ( RcdFound195 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn28");
   }

   public void insert_check( )
   {
      confirm_1NC0( ) ;
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

   public void checkOptimisticConcurrency1NC195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NC195( )
   {
      beforeValidate1NC195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NC195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NC195( 0) ;
         checkOptimisticConcurrency1NC195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NC195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NC195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NC13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
                        processLevel1NC195( ) ;
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
            load1NC195( ) ;
         }
         endLevel1NC195( ) ;
      }
      closeExtendedTableCursors1NC195( ) ;
   }

   public void update1NC195( )
   {
      beforeValidate1NC195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NC195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NC195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NC195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NC195( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPALBBAR */
                  deferredUpdate1NC195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NC195( ) ;
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
         endLevel1NC195( ) ;
      }
      closeExtendedTableCursors1NC195( ) ;
   }

   public void deferredUpdate1NC195( )
   {
   }

   public void delete( )
   {
      beforeValidate1NC195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NC195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NC195( ) ;
         afterConfirm1NC195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NC195( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NC533( ) ;
               while ( RcdFound533 != 0 )
               {
                  getByPrimaryKey1NC533( ) ;
                  delete1NC533( ) ;
                  scanNext1NC533( ) ;
               }
               scanEnd1NC533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NC14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NC195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NC195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NC15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01NC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01NC17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01NC18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01NC19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01NC20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01NC21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01NC22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01NC23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01NC24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01NC25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1NC533( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1NC533( ) ;
         if ( ( nRcdExists_533 != 0 ) || ( nIsMod_533 != 0 ) )
         {
            standaloneNotModal1NC533( ) ;
            getKey1NC533( ) ;
            if ( ( nRcdExists_533 == 0 ) && ( nRcdDeleted_533 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NC533( ) ;
            }
            else
            {
               if ( RcdFound533 != 0 )
               {
                  if ( ( nRcdDeleted_533 != 0 ) && ( nRcdExists_533 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NC533( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NC533( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_533 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_533_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtBarComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1541BarComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1543BarComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComMLan_Internalname, GXutil.ltrim( localUtil.ntoc( A1540BarComMLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPLan_Internalname, GXutil.ltrim( localUtil.ntoc( A1544BarComPLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarComPEst_Internalname, GXutil.ltrim( localUtil.ntoc( A1542BarComPEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComM_Internalname, GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComP_Internalname, GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarGasEmp_Internalname, GXutil.ltrim( localUtil.ntoc( A2514BarGasEmp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarGasAca_Internalname, GXutil.ltrim( localUtil.ntoc( A2513BarGasAca, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEstObs_Internalname, GXutil.rtrim( A2506AlbEstObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_50_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_50_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2506AlbEstObs_"+sGXsfl_50_idx, GXutil.rtrim( Z2506AlbEstObs)) ;
         httpContext.changePostValue( "nRcdDeleted_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_533_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_533 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_533_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMMLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOMPEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGASEMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasEmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGASACA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBESTOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEstObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NC533( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_533 = (short)(0) ;
      nIsMod_533 = (short)(0) ;
      nRcdDeleted_533 = (short)(0) ;
   }

   public void processLevel1NC195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1NC533( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NC195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NC195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn28");
         if ( AnyError == 0 )
         {
            confirmValues1NC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn28");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NC195( )
   {
      /* Scan By routine */
      /* Using cursor T01NC26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NC195( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEnd1NC195( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1NC195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NC195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NC195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NC195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NC195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NC195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NC195( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
   }

   public void zm1NC533( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1533AlbEComM = T01NC3_A1533AlbEComM[0] ;
            Z1534AlbEComP = T01NC3_A1534AlbEComP[0] ;
            Z1536AlbEComPre = T01NC3_A1536AlbEComPre[0] ;
            Z2506AlbEstObs = T01NC3_A2506AlbEstObs[0] ;
         }
         else
         {
            Z1533AlbEComM = A1533AlbEComM ;
            Z1534AlbEComP = A1534AlbEComP ;
            Z1536AlbEComPre = A1536AlbEComPre ;
            Z2506AlbEstObs = A2506AlbEstObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z1533AlbEComM = A1533AlbEComM ;
         Z1534AlbEComP = A1534AlbEComP ;
         Z1536AlbEComPre = A1536AlbEComPre ;
         Z2506AlbEstObs = A2506AlbEstObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModal1NC533( )
   {
   }

   public void standaloneModal1NC533( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtDisComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtDisComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFonCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtFonCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1NC533( )
   {
      /* Using cursor T01NC27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A1533AlbEComM = T01NC27_A1533AlbEComM[0] ;
         n1533AlbEComM = T01NC27_n1533AlbEComM[0] ;
         A1534AlbEComP = T01NC27_A1534AlbEComP[0] ;
         n1534AlbEComP = T01NC27_n1534AlbEComP[0] ;
         A1536AlbEComPre = T01NC27_A1536AlbEComPre[0] ;
         n1536AlbEComPre = T01NC27_n1536AlbEComPre[0] ;
         A2506AlbEstObs = T01NC27_A2506AlbEstObs[0] ;
         n2506AlbEstObs = T01NC27_n2506AlbEstObs[0] ;
         zm1NC533( -5) ;
      }
      pr_default.close(25);
      onLoadActions1NC533( ) ;
   }

   public void onLoadActions1NC533( )
   {
   }

   public void checkExtendedTable1NC533( )
   {
      nIsDirty_533 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NC533( ) ;
   }

   public void closeExtendedTableCursors1NC533( )
   {
   }

   public void enableDisable1NC533( )
   {
   }

   public void getKey1NC533( )
   {
      /* Using cursor T01NC28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound533 = (short)(1) ;
      }
      else
      {
         RcdFound533 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1NC533( )
   {
      /* Using cursor T01NC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01NC3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01NC3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NC3_A129BarCod[0] == A129BarCod ) && ( T01NC3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01NC3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1NC533( 5) ;
         RcdFound533 = (short)(1) ;
         initializeNonKey1NC533( ) ;
         A2524DisComLin = T01NC3_A2524DisComLin[0] ;
         A1056DisComCod = T01NC3_A1056DisComCod[0] ;
         A1032FonCod = T01NC3_A1032FonCod[0] ;
         A1533AlbEComM = T01NC3_A1533AlbEComM[0] ;
         n1533AlbEComM = T01NC3_n1533AlbEComM[0] ;
         A1534AlbEComP = T01NC3_A1534AlbEComP[0] ;
         n1534AlbEComP = T01NC3_n1534AlbEComP[0] ;
         A1536AlbEComPre = T01NC3_A1536AlbEComPre[0] ;
         n1536AlbEComPre = T01NC3_n1536AlbEComPre[0] ;
         A2506AlbEstObs = T01NC3_A2506AlbEstObs[0] ;
         n2506AlbEstObs = T01NC3_n2506AlbEstObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NC533( ) ;
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound533 = (short)(0) ;
         initializeNonKey1NC533( ) ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NC533( ) ;
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NC533( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NC533( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1533AlbEComM, T01NC2_A1533AlbEComM[0]) != 0 ) || ( Z1534AlbEComP != T01NC2_A1534AlbEComP[0] ) || ( DecimalUtil.compareTo(Z1536AlbEComPre, T01NC2_A1536AlbEComPre[0]) != 0 ) || ( GXutil.strcmp(Z2506AlbEstObs, T01NC2_A2506AlbEstObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1533AlbEComM, T01NC2_A1533AlbEComM[0]) != 0 )
            {
               GXutil.writeLogln("ttrn28:[seudo value changed for attri]"+"AlbEComM");
               GXutil.writeLogRaw("Old: ",Z1533AlbEComM);
               GXutil.writeLogRaw("Current: ",T01NC2_A1533AlbEComM[0]);
            }
            if ( Z1534AlbEComP != T01NC2_A1534AlbEComP[0] )
            {
               GXutil.writeLogln("ttrn28:[seudo value changed for attri]"+"AlbEComP");
               GXutil.writeLogRaw("Old: ",Z1534AlbEComP);
               GXutil.writeLogRaw("Current: ",T01NC2_A1534AlbEComP[0]);
            }
            if ( DecimalUtil.compareTo(Z1536AlbEComPre, T01NC2_A1536AlbEComPre[0]) != 0 )
            {
               GXutil.writeLogln("ttrn28:[seudo value changed for attri]"+"AlbEComPre");
               GXutil.writeLogRaw("Old: ",Z1536AlbEComPre);
               GXutil.writeLogRaw("Current: ",T01NC2_A1536AlbEComPre[0]);
            }
            if ( GXutil.strcmp(Z2506AlbEstObs, T01NC2_A2506AlbEstObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn28:[seudo value changed for attri]"+"AlbEstObs");
               GXutil.writeLogRaw("Old: ",Z2506AlbEstObs);
               GXutil.writeLogRaw("Current: ",T01NC2_A2506AlbEstObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NC533( )
   {
      beforeValidate1NC533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NC533( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NC533( 0) ;
         checkOptimisticConcurrency1NC533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NC533( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NC533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NC29 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, Boolean.valueOf(n2506AlbEstObs), A2506AlbEstObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1NC533( ) ;
         }
         endLevel1NC533( ) ;
      }
      closeExtendedTableCursors1NC533( ) ;
   }

   public void update1NC533( )
   {
      beforeValidate1NC533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NC533( ) ;
      }
      if ( ( nIsMod_533 != 0 ) || ( nIsDirty_533 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NC533( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NC533( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NC533( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NC30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, Boolean.valueOf(n2506AlbEstObs), A2506AlbEstObs, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NC533( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NC533( ) ;
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
            endLevel1NC533( ) ;
         }
      }
      closeExtendedTableCursors1NC533( ) ;
   }

   public void deferredUpdate1NC533( )
   {
   }

   public void delete1NC533( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NC533( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NC533( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NC533( ) ;
         afterConfirm1NC533( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NC533( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NC31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
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
      sMode533 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NC533( ) ;
      Gx_mode = sMode533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NC533( )
   {
      standaloneModal1NC533( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NC32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01NC33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01NC34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METROS PIEZA (ALB.ESTAMPACION)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01NC35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBETE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01NC36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void endLevel1NC533( )
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

   public void scanStart1NC533( )
   {
      /* Scan By routine */
      /* Using cursor T01NC37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A2524DisComLin = T01NC37_A2524DisComLin[0] ;
         A1056DisComCod = T01NC37_A1056DisComCod[0] ;
         A1032FonCod = T01NC37_A1032FonCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NC533( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A2524DisComLin = T01NC37_A2524DisComLin[0] ;
         A1056DisComCod = T01NC37_A1056DisComCod[0] ;
         A1032FonCod = T01NC37_A1032FonCod[0] ;
      }
   }

   public void scanEnd1NC533( )
   {
      pr_default.close(35);
   }

   public void afterConfirm1NC533( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NC533( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NC533( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NC533( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NC533( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NC533( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NC533( )
   {
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarComMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComMtr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarComPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarComMLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarComMLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComMLan_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarComPLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarComPLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPLan_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarComPEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarComPEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarComPEst_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbEComM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbEComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComP_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbEComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComPre_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarGasEmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGasEmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGasEmp_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarGasAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGasAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGasAca_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbEstObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEstObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEstObs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1NC533( )
   {
   }

   public void send_integrity_lvl_hashes1NC195( )
   {
   }

   public void subsflControlProps_50533( )
   {
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533_"+sGXsfl_50_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_50_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_50_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_50_idx ;
      edtBarComMtr_Internalname = "BARCOMMTR_"+sGXsfl_50_idx ;
      edtBarComPie_Internalname = "BARCOMPIE_"+sGXsfl_50_idx ;
      edtBarComMLan_Internalname = "BARCOMMLAN_"+sGXsfl_50_idx ;
      edtBarComPLan_Internalname = "BARCOMPLAN_"+sGXsfl_50_idx ;
      edtBarComPEst_Internalname = "BARCOMPEST_"+sGXsfl_50_idx ;
      edtAlbEComM_Internalname = "ALBECOMM_"+sGXsfl_50_idx ;
      edtAlbEComP_Internalname = "ALBECOMP_"+sGXsfl_50_idx ;
      edtAlbEComPre_Internalname = "ALBECOMPRE_"+sGXsfl_50_idx ;
      edtBarGasEmp_Internalname = "BARGASEMP_"+sGXsfl_50_idx ;
      edtBarGasAca_Internalname = "BARGASACA_"+sGXsfl_50_idx ;
      edtAlbEstObs_Internalname = "ALBESTOBS_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50533( )
   {
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533_"+sGXsfl_50_fel_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_50_fel_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_50_fel_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_50_fel_idx ;
      edtBarComMtr_Internalname = "BARCOMMTR_"+sGXsfl_50_fel_idx ;
      edtBarComPie_Internalname = "BARCOMPIE_"+sGXsfl_50_fel_idx ;
      edtBarComMLan_Internalname = "BARCOMMLAN_"+sGXsfl_50_fel_idx ;
      edtBarComPLan_Internalname = "BARCOMPLAN_"+sGXsfl_50_fel_idx ;
      edtBarComPEst_Internalname = "BARCOMPEST_"+sGXsfl_50_fel_idx ;
      edtAlbEComM_Internalname = "ALBECOMM_"+sGXsfl_50_fel_idx ;
      edtAlbEComP_Internalname = "ALBECOMP_"+sGXsfl_50_fel_idx ;
      edtAlbEComPre_Internalname = "ALBECOMPRE_"+sGXsfl_50_fel_idx ;
      edtBarGasEmp_Internalname = "BARGASEMP_"+sGXsfl_50_fel_idx ;
      edtBarGasAca_Internalname = "BARGASACA_"+sGXsfl_50_fel_idx ;
      edtAlbEstObs_Internalname = "ALBESTOBS_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1NC533( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50533( ) ;
      sendRow1NC533( ) ;
   }

   public void sendRow1NC533( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_533_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_533_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_533), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_533), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_533_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_533_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComCod_Internalname,GXutil.rtrim( A1056DisComCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFonCod_Internalname,GXutil.rtrim( A1032FonCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFonCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFonCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarComMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1541BarComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarComMtr_Enabled!=0) ? localUtil.format( A1541BarComMtr, "ZZZZZ9.99") : localUtil.format( A1541BarComMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarComMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarComMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarComPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1543BarComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarComPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1543BarComPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1543BarComPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarComPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarComPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarComMLan_Internalname,GXutil.ltrim( localUtil.ntoc( A1540BarComMLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarComMLan_Enabled!=0) ? localUtil.format( A1540BarComMLan, "ZZZZZ9.99") : localUtil.format( A1540BarComMLan, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarComMLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarComMLan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarComPLan_Internalname,GXutil.ltrim( localUtil.ntoc( A1544BarComPLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarComPLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1544BarComPLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1544BarComPLan), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarComPLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarComPLan_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarComPEst_Internalname,GXutil.ltrim( localUtil.ntoc( A1542BarComPEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarComPEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1542BarComPEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A1542BarComPEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarComPEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarComPEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComM_Internalname,GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComM_Enabled!=0) ? localUtil.format( A1533AlbEComM, "ZZZZZ9.99") : localUtil.format( A1533AlbEComM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComP_Internalname,GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1534AlbEComP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1534AlbEComP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComPre_Internalname,GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComPre_Enabled!=0) ? localUtil.format( A1536AlbEComPre, "ZZZZZZ9.999") : localUtil.format( A1536AlbEComPre, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGasEmp_Internalname,GXutil.ltrim( localUtil.ntoc( A2514BarGasEmp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarGasEmp_Enabled!=0) ? localUtil.format( A2514BarGasEmp, "ZZZZZZZ9.99") : localUtil.format( A2514BarGasEmp, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGasEmp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarGasEmp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGasAca_Internalname,GXutil.ltrim( localUtil.ntoc( A2513BarGasAca, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarGasAca_Enabled!=0) ? localUtil.format( A2513BarGasAca, "ZZZZZZZ9.99") : localUtil.format( A2513BarGasAca, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGasAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarGasAca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEstObs_Internalname,GXutil.rtrim( A2506AlbEstObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEstObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEstObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NC533( ) ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1056DisComCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1056DisComCod));
      GXCCtl = "Z1032FonCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1032FonCod));
      GXCCtl = "Z1533AlbEComM_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1534AlbEComP_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1536AlbEComPre_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2506AlbEstObs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2506AlbEstObs));
      GXCCtl = "nRcdDeleted_533_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_533_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_533_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_533_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOMMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOMPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOMMLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOMPLAN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOMPEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMPRE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGASEMP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasEmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGASACA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBESTOBS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEstObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NC533( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50533( ) ;
      edtavnRcdDeleted_533_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_533_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMMTR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarComMLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMMLAN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarComPLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPLAN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarComPEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOMPEST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarGasEmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGASEMP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarGasAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGASACA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEstObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBESTOBS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_533");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_533_Internalname ;
         wbErr = true ;
         nRcdDeleted_533 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_533 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DISCOMLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComLin_Internalname ;
         wbErr = true ;
         A2524DisComLin = (byte)(0) ;
      }
      else
      {
         A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
      A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
      A1541BarComMtr = localUtil.ctond( httpContext.cgiGet( edtBarComMtr_Internalname)) ;
      A1543BarComPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1540BarComMLan = localUtil.ctond( httpContext.cgiGet( edtBarComMLan_Internalname)) ;
      A1544BarComPLan = (short)(localUtil.ctol( httpContext.cgiGet( edtBarComPLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1542BarComPEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarComPEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBECOMM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComM_Internalname ;
         wbErr = true ;
         A1533AlbEComM = DecimalUtil.ZERO ;
         n1533AlbEComM = false ;
      }
      else
      {
         A1533AlbEComM = localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)) ;
         n1533AlbEComM = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBECOMP_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComP_Internalname ;
         wbErr = true ;
         A1534AlbEComP = (short)(0) ;
         n1534AlbEComP = false ;
      }
      else
      {
         A1534AlbEComP = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1534AlbEComP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBECOMPRE_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComPre_Internalname ;
         wbErr = true ;
         A1536AlbEComPre = DecimalUtil.ZERO ;
         n1536AlbEComPre = false ;
      }
      else
      {
         A1536AlbEComPre = localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)) ;
         n1536AlbEComPre = false ;
      }
      A2514BarGasEmp = localUtil.ctond( httpContext.cgiGet( edtBarGasEmp_Internalname)) ;
      A2513BarGasAca = localUtil.ctond( httpContext.cgiGet( edtBarGasAca_Internalname)) ;
      A2506AlbEstObs = httpContext.cgiGet( edtAlbEstObs_Internalname) ;
      n2506AlbEstObs = false ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_50_idx ;
      Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1056DisComCod_" + sGXsfl_50_idx ;
      Z1056DisComCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1032FonCod_" + sGXsfl_50_idx ;
      Z1032FonCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1533AlbEComM_" + sGXsfl_50_idx ;
      Z1533AlbEComM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1534AlbEComP_" + sGXsfl_50_idx ;
      Z1534AlbEComP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1536AlbEComPre_" + sGXsfl_50_idx ;
      Z1536AlbEComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2506AlbEstObs_" + sGXsfl_50_idx ;
      Z2506AlbEstObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_533_" + sGXsfl_50_idx ;
      nRcdDeleted_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_533_" + sGXsfl_50_idx ;
      nRcdExists_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_533_" + sGXsfl_50_idx ;
      nIsMod_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFonCod_Enabled = edtFonCod_Enabled ;
      defedtDisComCod_Enabled = edtDisComCod_Enabled ;
      defedtDisComLin_Enabled = edtDisComLin_Enabled ;
   }

   public void confirmValues1NC0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50533( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50533( ) ;
         httpContext.changePostValue( "Z2524DisComLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2524DisComLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1056DisComCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1056DisComCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1032FonCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1032FonCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1533AlbEComM_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1533AlbEComM_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1534AlbEComP_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1534AlbEComP_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1536AlbEComPre_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2506AlbEstObs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2506AlbEstObs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2506AlbEstObs_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn28", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn28");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn28:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.ttrn28", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn28" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Combinaciones", "") ;
   }

   public void initializeNonKey1NC195( )
   {
   }

   public void initAll1NC195( )
   {
      initializeNonKey1NC195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NC533( )
   {
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1543BarComPie = (short)(0) ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A1544BarComPLan = (short)(0) ;
      A1542BarComPEst = (byte)(0) ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      n1533AlbEComM = false ;
      A1534AlbEComP = (short)(0) ;
      n1534AlbEComP = false ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      n1536AlbEComPre = false ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      A2506AlbEstObs = "" ;
      n2506AlbEstObs = false ;
      Z1533AlbEComM = DecimalUtil.ZERO ;
      Z1534AlbEComP = (short)(0) ;
      Z1536AlbEComPre = DecimalUtil.ZERO ;
      Z2506AlbEstObs = "" ;
   }

   public void initAll1NC533( )
   {
      A2524DisComLin = (byte)(0) ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      initializeNonKey1NC533( ) ;
   }

   public void standaloneModalInsert1NC533( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415102376", true, true);
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
      httpContext.AddJavascriptSource("ttrn28.js", "?202682415102376", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties533( )
   {
      edtFonCod_Enabled = defedtFonCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDisComCod_Enabled = defedtDisComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtDisComLin_Enabled = defedtDisComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1056DisComCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1032FonCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1541BarComMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1543BarComPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1540BarComMLan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComMLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1544BarComPLan, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1542BarComPEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarComPEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2514BarGasEmp, (byte)(11), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasEmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2513BarGasAca, (byte)(11), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGasAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2506AlbEstObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEstObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCod_Internalname = "BARCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      edtFonCod_Internalname = "FONCOD" ;
      edtBarComMtr_Internalname = "BARCOMMTR" ;
      edtBarComPie_Internalname = "BARCOMPIE" ;
      edtBarComMLan_Internalname = "BARCOMMLAN" ;
      edtBarComPLan_Internalname = "BARCOMPLAN" ;
      edtBarComPEst_Internalname = "BARCOMPEST" ;
      edtAlbEComM_Internalname = "ALBECOMM" ;
      edtAlbEComP_Internalname = "ALBECOMP" ;
      edtAlbEComPre_Internalname = "ALBECOMPRE" ;
      edtBarGasEmp_Internalname = "BARGASEMP" ;
      edtBarGasAca_Internalname = "BARGASACA" ;
      edtAlbEstObs_Internalname = "ALBESTOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Combinaciones", "") );
      edtAlbEstObs_Jsonclick = "" ;
      edtBarGasAca_Jsonclick = "" ;
      edtBarGasEmp_Jsonclick = "" ;
      edtAlbEComPre_Jsonclick = "" ;
      edtAlbEComP_Jsonclick = "" ;
      edtAlbEComM_Jsonclick = "" ;
      edtBarComPEst_Jsonclick = "" ;
      edtBarComPLan_Jsonclick = "" ;
      edtBarComMLan_Jsonclick = "" ;
      edtBarComPie_Jsonclick = "" ;
      edtBarComMtr_Jsonclick = "" ;
      edtFonCod_Jsonclick = "" ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComLin_Jsonclick = "" ;
      edtavnRcdDeleted_533_Jsonclick = "" ;
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
      edtAlbEstObs_Enabled = 1 ;
      edtBarGasAca_Enabled = 0 ;
      edtBarGasEmp_Enabled = 0 ;
      edtAlbEComPre_Enabled = 1 ;
      edtAlbEComP_Enabled = 1 ;
      edtAlbEComM_Enabled = 1 ;
      edtBarComPEst_Enabled = 0 ;
      edtBarComPLan_Enabled = 0 ;
      edtBarComMLan_Enabled = 0 ;
      edtBarComPie_Enabled = 0 ;
      edtBarComMtr_Enabled = 0 ;
      edtFonCod_Enabled = 1 ;
      edtDisComCod_Enabled = 1 ;
      edtDisComLin_Enabled = 1 ;
      edtavnRcdDeleted_533_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 0 ;
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
      subsflControlProps_50533( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NC533( ) ;
         standaloneModal1NC533( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NC533( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50533( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[]");
      setEventMetadata("VALID_FONCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albestobs',iparms:[]");
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
      wcpOA130BarCodPar = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z1533AlbEComM = DecimalUtil.ZERO ;
      Z1536AlbEComPre = DecimalUtil.ZERO ;
      Z2506AlbEstObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode533 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode195 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      A2506AlbEstObs = "" ;
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
      T01NC6_A407EmprNom = new String[] {""} ;
      T01NC6_n407EmprNom = new boolean[] {false} ;
      T01NC8_A396EmprCod = new String[] {""} ;
      T01NC7_A396EmprCod = new String[] {""} ;
      T01NC9_A407EmprNom = new String[] {""} ;
      T01NC9_n407EmprNom = new boolean[] {false} ;
      T01NC9_A396EmprCod = new String[] {""} ;
      T01NC9_A129BarCod = new int[1] ;
      T01NC9_A132BarCodReo = new byte[1] ;
      T01NC9_A130BarCodPar = new String[] {""} ;
      T01NC9_A30AlbProCod = new long[1] ;
      T01NC10_A396EmprCod = new String[] {""} ;
      T01NC10_A30AlbProCod = new long[1] ;
      T01NC10_A129BarCod = new int[1] ;
      T01NC10_A132BarCodReo = new byte[1] ;
      T01NC10_A130BarCodPar = new String[] {""} ;
      T01NC5_A396EmprCod = new String[] {""} ;
      T01NC5_A129BarCod = new int[1] ;
      T01NC5_A132BarCodReo = new byte[1] ;
      T01NC5_A130BarCodPar = new String[] {""} ;
      T01NC5_A30AlbProCod = new long[1] ;
      T01NC11_A396EmprCod = new String[] {""} ;
      T01NC11_A129BarCod = new int[1] ;
      T01NC11_A132BarCodReo = new byte[1] ;
      T01NC11_A130BarCodPar = new String[] {""} ;
      T01NC11_A30AlbProCod = new long[1] ;
      T01NC12_A396EmprCod = new String[] {""} ;
      T01NC12_A129BarCod = new int[1] ;
      T01NC12_A132BarCodReo = new byte[1] ;
      T01NC12_A130BarCodPar = new String[] {""} ;
      T01NC12_A30AlbProCod = new long[1] ;
      T01NC4_A396EmprCod = new String[] {""} ;
      T01NC4_A129BarCod = new int[1] ;
      T01NC4_A132BarCodReo = new byte[1] ;
      T01NC4_A130BarCodPar = new String[] {""} ;
      T01NC4_A30AlbProCod = new long[1] ;
      T01NC15_A396EmprCod = new String[] {""} ;
      T01NC15_A30AlbProCod = new long[1] ;
      T01NC15_A129BarCod = new int[1] ;
      T01NC15_A132BarCodReo = new byte[1] ;
      T01NC15_A130BarCodPar = new String[] {""} ;
      T01NC15_A6648AlbMetLin = new short[1] ;
      T01NC16_A396EmprCod = new String[] {""} ;
      T01NC16_A30AlbProCod = new long[1] ;
      T01NC16_A129BarCod = new int[1] ;
      T01NC16_A132BarCodReo = new byte[1] ;
      T01NC16_A130BarCodPar = new String[] {""} ;
      T01NC16_A9639Et_Numero = new short[1] ;
      T01NC17_A396EmprCod = new String[] {""} ;
      T01NC17_A30AlbProCod = new long[1] ;
      T01NC17_A129BarCod = new int[1] ;
      T01NC17_A132BarCodReo = new byte[1] ;
      T01NC17_A130BarCodPar = new String[] {""} ;
      T01NC17_A6622AlbHdRLn = new short[1] ;
      T01NC18_A396EmprCod = new String[] {""} ;
      T01NC18_A30AlbProCod = new long[1] ;
      T01NC18_A129BarCod = new int[1] ;
      T01NC18_A132BarCodReo = new byte[1] ;
      T01NC18_A130BarCodPar = new String[] {""} ;
      T01NC18_A5456P_ForLin = new short[1] ;
      T01NC19_A396EmprCod = new String[] {""} ;
      T01NC19_A30AlbProCod = new long[1] ;
      T01NC19_A129BarCod = new int[1] ;
      T01NC19_A132BarCodReo = new byte[1] ;
      T01NC19_A130BarCodPar = new String[] {""} ;
      T01NC19_A2524DisComLin = new byte[1] ;
      T01NC19_A1056DisComCod = new String[] {""} ;
      T01NC19_A1032FonCod = new String[] {""} ;
      T01NC19_A2666ProceCodA = new short[1] ;
      T01NC20_A396EmprCod = new String[] {""} ;
      T01NC20_A3617AlbTrnCod = new long[1] ;
      T01NC20_A30AlbProCod = new long[1] ;
      T01NC20_A129BarCod = new int[1] ;
      T01NC20_A132BarCodReo = new byte[1] ;
      T01NC20_A130BarCodPar = new String[] {""} ;
      T01NC21_A396EmprCod = new String[] {""} ;
      T01NC21_A30AlbProCod = new long[1] ;
      T01NC21_A129BarCod = new int[1] ;
      T01NC21_A132BarCodReo = new byte[1] ;
      T01NC21_A130BarCodPar = new String[] {""} ;
      T01NC21_A3621AlbPckLin = new short[1] ;
      T01NC22_A396EmprCod = new String[] {""} ;
      T01NC22_A30AlbProCod = new long[1] ;
      T01NC22_A129BarCod = new int[1] ;
      T01NC22_A132BarCodReo = new byte[1] ;
      T01NC22_A130BarCodPar = new String[] {""} ;
      T01NC22_A2764AlbHdrLin = new short[1] ;
      T01NC23_A396EmprCod = new String[] {""} ;
      T01NC23_A30AlbProCod = new long[1] ;
      T01NC23_A129BarCod = new int[1] ;
      T01NC23_A132BarCodReo = new byte[1] ;
      T01NC23_A130BarCodPar = new String[] {""} ;
      T01NC23_A1468AlbPrdLin = new short[1] ;
      T01NC24_A396EmprCod = new String[] {""} ;
      T01NC24_A30AlbProCod = new long[1] ;
      T01NC24_A129BarCod = new int[1] ;
      T01NC24_A132BarCodReo = new byte[1] ;
      T01NC24_A130BarCodPar = new String[] {""} ;
      T01NC24_A200BarPieCod = new String[] {""} ;
      T01NC25_A396EmprCod = new String[] {""} ;
      T01NC25_A30AlbProCod = new long[1] ;
      T01NC25_A129BarCod = new int[1] ;
      T01NC25_A132BarCodReo = new byte[1] ;
      T01NC25_A130BarCodPar = new String[] {""} ;
      T01NC25_A1240GuiFasLin = new short[1] ;
      T01NC26_A396EmprCod = new String[] {""} ;
      T01NC26_A30AlbProCod = new long[1] ;
      T01NC26_A129BarCod = new int[1] ;
      T01NC26_A132BarCodReo = new byte[1] ;
      T01NC26_A130BarCodPar = new String[] {""} ;
      T01NC27_A30AlbProCod = new long[1] ;
      T01NC27_A2524DisComLin = new byte[1] ;
      T01NC27_A1056DisComCod = new String[] {""} ;
      T01NC27_A1032FonCod = new String[] {""} ;
      T01NC27_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC27_n1533AlbEComM = new boolean[] {false} ;
      T01NC27_A1534AlbEComP = new short[1] ;
      T01NC27_n1534AlbEComP = new boolean[] {false} ;
      T01NC27_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC27_n1536AlbEComPre = new boolean[] {false} ;
      T01NC27_A2506AlbEstObs = new String[] {""} ;
      T01NC27_n2506AlbEstObs = new boolean[] {false} ;
      T01NC27_A396EmprCod = new String[] {""} ;
      T01NC27_A129BarCod = new int[1] ;
      T01NC27_A132BarCodReo = new byte[1] ;
      T01NC27_A130BarCodPar = new String[] {""} ;
      T01NC28_A396EmprCod = new String[] {""} ;
      T01NC28_A30AlbProCod = new long[1] ;
      T01NC28_A129BarCod = new int[1] ;
      T01NC28_A132BarCodReo = new byte[1] ;
      T01NC28_A130BarCodPar = new String[] {""} ;
      T01NC28_A2524DisComLin = new byte[1] ;
      T01NC28_A1056DisComCod = new String[] {""} ;
      T01NC28_A1032FonCod = new String[] {""} ;
      T01NC3_A30AlbProCod = new long[1] ;
      T01NC3_A2524DisComLin = new byte[1] ;
      T01NC3_A1056DisComCod = new String[] {""} ;
      T01NC3_A1032FonCod = new String[] {""} ;
      T01NC3_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC3_n1533AlbEComM = new boolean[] {false} ;
      T01NC3_A1534AlbEComP = new short[1] ;
      T01NC3_n1534AlbEComP = new boolean[] {false} ;
      T01NC3_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC3_n1536AlbEComPre = new boolean[] {false} ;
      T01NC3_A2506AlbEstObs = new String[] {""} ;
      T01NC3_n2506AlbEstObs = new boolean[] {false} ;
      T01NC3_A396EmprCod = new String[] {""} ;
      T01NC3_A129BarCod = new int[1] ;
      T01NC3_A132BarCodReo = new byte[1] ;
      T01NC3_A130BarCodPar = new String[] {""} ;
      T01NC2_A30AlbProCod = new long[1] ;
      T01NC2_A2524DisComLin = new byte[1] ;
      T01NC2_A1056DisComCod = new String[] {""} ;
      T01NC2_A1032FonCod = new String[] {""} ;
      T01NC2_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC2_n1533AlbEComM = new boolean[] {false} ;
      T01NC2_A1534AlbEComP = new short[1] ;
      T01NC2_n1534AlbEComP = new boolean[] {false} ;
      T01NC2_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NC2_n1536AlbEComPre = new boolean[] {false} ;
      T01NC2_A2506AlbEstObs = new String[] {""} ;
      T01NC2_n2506AlbEstObs = new boolean[] {false} ;
      T01NC2_A396EmprCod = new String[] {""} ;
      T01NC2_A129BarCod = new int[1] ;
      T01NC2_A132BarCodReo = new byte[1] ;
      T01NC2_A130BarCodPar = new String[] {""} ;
      T01NC32_A396EmprCod = new String[] {""} ;
      T01NC32_A30AlbProCod = new long[1] ;
      T01NC32_A129BarCod = new int[1] ;
      T01NC32_A132BarCodReo = new byte[1] ;
      T01NC32_A130BarCodPar = new String[] {""} ;
      T01NC32_A2524DisComLin = new byte[1] ;
      T01NC32_A1056DisComCod = new String[] {""} ;
      T01NC32_A1032FonCod = new String[] {""} ;
      T01NC32_A200BarPieCod = new String[] {""} ;
      T01NC33_A396EmprCod = new String[] {""} ;
      T01NC33_A30AlbProCod = new long[1] ;
      T01NC33_A129BarCod = new int[1] ;
      T01NC33_A132BarCodReo = new byte[1] ;
      T01NC33_A130BarCodPar = new String[] {""} ;
      T01NC33_A2524DisComLin = new byte[1] ;
      T01NC33_A1056DisComCod = new String[] {""} ;
      T01NC33_A1032FonCod = new String[] {""} ;
      T01NC33_A4433DisComTro = new short[1] ;
      T01NC34_A396EmprCod = new String[] {""} ;
      T01NC34_A30AlbProCod = new long[1] ;
      T01NC34_A129BarCod = new int[1] ;
      T01NC34_A132BarCodReo = new byte[1] ;
      T01NC34_A130BarCodPar = new String[] {""} ;
      T01NC34_A2524DisComLin = new byte[1] ;
      T01NC34_A1056DisComCod = new String[] {""} ;
      T01NC34_A1032FonCod = new String[] {""} ;
      T01NC34_A4336AlbEstPLin = new short[1] ;
      T01NC35_A396EmprCod = new String[] {""} ;
      T01NC35_A30AlbProCod = new long[1] ;
      T01NC35_A129BarCod = new int[1] ;
      T01NC35_A132BarCodReo = new byte[1] ;
      T01NC35_A130BarCodPar = new String[] {""} ;
      T01NC35_A2524DisComLin = new byte[1] ;
      T01NC35_A1056DisComCod = new String[] {""} ;
      T01NC35_A1032FonCod = new String[] {""} ;
      T01NC35_A1761ExtCod = new short[1] ;
      T01NC36_A396EmprCod = new String[] {""} ;
      T01NC36_A30AlbProCod = new long[1] ;
      T01NC36_A129BarCod = new int[1] ;
      T01NC36_A132BarCodReo = new byte[1] ;
      T01NC36_A130BarCodPar = new String[] {""} ;
      T01NC36_A2524DisComLin = new byte[1] ;
      T01NC36_A1056DisComCod = new String[] {""} ;
      T01NC36_A1032FonCod = new String[] {""} ;
      T01NC36_A2666ProceCodA = new short[1] ;
      T01NC37_A396EmprCod = new String[] {""} ;
      T01NC37_A30AlbProCod = new long[1] ;
      T01NC37_A129BarCod = new int[1] ;
      T01NC37_A132BarCodReo = new byte[1] ;
      T01NC37_A130BarCodPar = new String[] {""} ;
      T01NC37_A2524DisComLin = new byte[1] ;
      T01NC37_A1056DisComCod = new String[] {""} ;
      T01NC37_A1032FonCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn28__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn28__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn28__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn28__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn28__default(),
         new Object[] {
             new Object[] {
            T01NC2_A30AlbProCod, T01NC2_A2524DisComLin, T01NC2_A1056DisComCod, T01NC2_A1032FonCod, T01NC2_A1533AlbEComM, T01NC2_n1533AlbEComM, T01NC2_A1534AlbEComP, T01NC2_n1534AlbEComP, T01NC2_A1536AlbEComPre, T01NC2_n1536AlbEComPre,
            T01NC2_A2506AlbEstObs, T01NC2_n2506AlbEstObs, T01NC2_A396EmprCod, T01NC2_A129BarCod, T01NC2_A132BarCodReo, T01NC2_A130BarCodPar
            }
            , new Object[] {
            T01NC3_A30AlbProCod, T01NC3_A2524DisComLin, T01NC3_A1056DisComCod, T01NC3_A1032FonCod, T01NC3_A1533AlbEComM, T01NC3_n1533AlbEComM, T01NC3_A1534AlbEComP, T01NC3_n1534AlbEComP, T01NC3_A1536AlbEComPre, T01NC3_n1536AlbEComPre,
            T01NC3_A2506AlbEstObs, T01NC3_n2506AlbEstObs, T01NC3_A396EmprCod, T01NC3_A129BarCod, T01NC3_A132BarCodReo, T01NC3_A130BarCodPar
            }
            , new Object[] {
            T01NC4_A396EmprCod, T01NC4_A129BarCod, T01NC4_A132BarCodReo, T01NC4_A130BarCodPar, T01NC4_A30AlbProCod
            }
            , new Object[] {
            T01NC5_A396EmprCod, T01NC5_A129BarCod, T01NC5_A132BarCodReo, T01NC5_A130BarCodPar, T01NC5_A30AlbProCod
            }
            , new Object[] {
            T01NC6_A407EmprNom, T01NC6_n407EmprNom
            }
            , new Object[] {
            T01NC7_A396EmprCod
            }
            , new Object[] {
            T01NC8_A396EmprCod
            }
            , new Object[] {
            T01NC9_A407EmprNom, T01NC9_n407EmprNom, T01NC9_A396EmprCod, T01NC9_A129BarCod, T01NC9_A132BarCodReo, T01NC9_A130BarCodPar, T01NC9_A30AlbProCod
            }
            , new Object[] {
            T01NC10_A396EmprCod, T01NC10_A30AlbProCod, T01NC10_A129BarCod, T01NC10_A132BarCodReo, T01NC10_A130BarCodPar
            }
            , new Object[] {
            T01NC11_A396EmprCod, T01NC11_A129BarCod, T01NC11_A132BarCodReo, T01NC11_A130BarCodPar, T01NC11_A30AlbProCod
            }
            , new Object[] {
            T01NC12_A396EmprCod, T01NC12_A129BarCod, T01NC12_A132BarCodReo, T01NC12_A130BarCodPar, T01NC12_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NC15_A396EmprCod, T01NC15_A30AlbProCod, T01NC15_A129BarCod, T01NC15_A132BarCodReo, T01NC15_A130BarCodPar, T01NC15_A6648AlbMetLin
            }
            , new Object[] {
            T01NC16_A396EmprCod, T01NC16_A30AlbProCod, T01NC16_A129BarCod, T01NC16_A132BarCodReo, T01NC16_A130BarCodPar, T01NC16_A9639Et_Numero
            }
            , new Object[] {
            T01NC17_A396EmprCod, T01NC17_A30AlbProCod, T01NC17_A129BarCod, T01NC17_A132BarCodReo, T01NC17_A130BarCodPar, T01NC17_A6622AlbHdRLn
            }
            , new Object[] {
            T01NC18_A396EmprCod, T01NC18_A30AlbProCod, T01NC18_A129BarCod, T01NC18_A132BarCodReo, T01NC18_A130BarCodPar, T01NC18_A5456P_ForLin
            }
            , new Object[] {
            T01NC19_A396EmprCod, T01NC19_A30AlbProCod, T01NC19_A129BarCod, T01NC19_A132BarCodReo, T01NC19_A130BarCodPar, T01NC19_A2524DisComLin, T01NC19_A1056DisComCod, T01NC19_A1032FonCod, T01NC19_A2666ProceCodA
            }
            , new Object[] {
            T01NC20_A396EmprCod, T01NC20_A3617AlbTrnCod, T01NC20_A30AlbProCod, T01NC20_A129BarCod, T01NC20_A132BarCodReo, T01NC20_A130BarCodPar
            }
            , new Object[] {
            T01NC21_A396EmprCod, T01NC21_A30AlbProCod, T01NC21_A129BarCod, T01NC21_A132BarCodReo, T01NC21_A130BarCodPar, T01NC21_A3621AlbPckLin
            }
            , new Object[] {
            T01NC22_A396EmprCod, T01NC22_A30AlbProCod, T01NC22_A129BarCod, T01NC22_A132BarCodReo, T01NC22_A130BarCodPar, T01NC22_A2764AlbHdrLin
            }
            , new Object[] {
            T01NC23_A396EmprCod, T01NC23_A30AlbProCod, T01NC23_A129BarCod, T01NC23_A132BarCodReo, T01NC23_A130BarCodPar, T01NC23_A1468AlbPrdLin
            }
            , new Object[] {
            T01NC24_A396EmprCod, T01NC24_A30AlbProCod, T01NC24_A129BarCod, T01NC24_A132BarCodReo, T01NC24_A130BarCodPar, T01NC24_A200BarPieCod
            }
            , new Object[] {
            T01NC25_A396EmprCod, T01NC25_A30AlbProCod, T01NC25_A129BarCod, T01NC25_A132BarCodReo, T01NC25_A130BarCodPar, T01NC25_A1240GuiFasLin
            }
            , new Object[] {
            T01NC26_A396EmprCod, T01NC26_A30AlbProCod, T01NC26_A129BarCod, T01NC26_A132BarCodReo, T01NC26_A130BarCodPar
            }
            , new Object[] {
            T01NC27_A30AlbProCod, T01NC27_A2524DisComLin, T01NC27_A1056DisComCod, T01NC27_A1032FonCod, T01NC27_A1533AlbEComM, T01NC27_n1533AlbEComM, T01NC27_A1534AlbEComP, T01NC27_n1534AlbEComP, T01NC27_A1536AlbEComPre, T01NC27_n1536AlbEComPre,
            T01NC27_A2506AlbEstObs, T01NC27_n2506AlbEstObs, T01NC27_A396EmprCod, T01NC27_A129BarCod, T01NC27_A132BarCodReo, T01NC27_A130BarCodPar
            }
            , new Object[] {
            T01NC28_A396EmprCod, T01NC28_A30AlbProCod, T01NC28_A129BarCod, T01NC28_A132BarCodReo, T01NC28_A130BarCodPar, T01NC28_A2524DisComLin, T01NC28_A1056DisComCod, T01NC28_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NC32_A396EmprCod, T01NC32_A30AlbProCod, T01NC32_A129BarCod, T01NC32_A132BarCodReo, T01NC32_A130BarCodPar, T01NC32_A2524DisComLin, T01NC32_A1056DisComCod, T01NC32_A1032FonCod, T01NC32_A200BarPieCod
            }
            , new Object[] {
            T01NC33_A396EmprCod, T01NC33_A30AlbProCod, T01NC33_A129BarCod, T01NC33_A132BarCodReo, T01NC33_A130BarCodPar, T01NC33_A2524DisComLin, T01NC33_A1056DisComCod, T01NC33_A1032FonCod, T01NC33_A4433DisComTro
            }
            , new Object[] {
            T01NC34_A396EmprCod, T01NC34_A30AlbProCod, T01NC34_A129BarCod, T01NC34_A132BarCodReo, T01NC34_A130BarCodPar, T01NC34_A2524DisComLin, T01NC34_A1056DisComCod, T01NC34_A1032FonCod, T01NC34_A4336AlbEstPLin
            }
            , new Object[] {
            T01NC35_A396EmprCod, T01NC35_A30AlbProCod, T01NC35_A129BarCod, T01NC35_A132BarCodReo, T01NC35_A130BarCodPar, T01NC35_A2524DisComLin, T01NC35_A1056DisComCod, T01NC35_A1032FonCod, T01NC35_A1761ExtCod
            }
            , new Object[] {
            T01NC36_A396EmprCod, T01NC36_A30AlbProCod, T01NC36_A129BarCod, T01NC36_A132BarCodReo, T01NC36_A130BarCodPar, T01NC36_A2524DisComLin, T01NC36_A1056DisComCod, T01NC36_A1032FonCod, T01NC36_A2666ProceCodA
            }
            , new Object[] {
            T01NC37_A396EmprCod, T01NC37_A30AlbProCod, T01NC37_A129BarCod, T01NC37_A132BarCodReo, T01NC37_A130BarCodPar, T01NC37_A2524DisComLin, T01NC37_A1056DisComCod, T01NC37_A1032FonCod
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z30AlbProCod = 0 ;
      A30AlbProCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTrn28" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z2524DisComLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2524DisComLin ;
   private byte A1542BarComPEst ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z1534AlbEComP ;
   private short nRcdDeleted_533 ;
   private short nRcdExists_533 ;
   private short nIsMod_533 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount533 ;
   private short RcdFound533 ;
   private short nBlankRcdUsr533 ;
   private short RcdFound195 ;
   private short A1543BarComPie ;
   private short A1544BarComPLan ;
   private short A1534AlbEComP ;
   private short nIsDirty_195 ;
   private short nIsDirty_533 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_533_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int edtBarComMtr_Enabled ;
   private int edtBarComPie_Enabled ;
   private int edtBarComMLan_Enabled ;
   private int edtBarComPLan_Enabled ;
   private int edtBarComPEst_Enabled ;
   private int edtAlbEComM_Enabled ;
   private int edtAlbEComP_Enabled ;
   private int edtAlbEComPre_Enabled ;
   private int edtBarGasEmp_Enabled ;
   private int edtBarGasAca_Enabled ;
   private int edtAlbEstObs_Enabled ;
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
   private int defedtFonCod_Enabled ;
   private int defedtDisComCod_Enabled ;
   private int defedtDisComLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarCod_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1533AlbEComM ;
   private java.math.BigDecimal Z1536AlbEComPre ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal A2514BarGasEmp ;
   private java.math.BigDecimal A2513BarGasAca ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z2506AlbEstObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode533 ;
   private String edtavnRcdDeleted_533_Internalname ;
   private String edtDisComLin_Internalname ;
   private String edtDisComCod_Internalname ;
   private String edtFonCod_Internalname ;
   private String edtBarComMtr_Internalname ;
   private String edtBarComPie_Internalname ;
   private String edtBarComMLan_Internalname ;
   private String edtBarComPLan_Internalname ;
   private String edtBarComPEst_Internalname ;
   private String edtAlbEComM_Internalname ;
   private String edtAlbEComP_Internalname ;
   private String edtAlbEComPre_Internalname ;
   private String edtBarGasEmp_Internalname ;
   private String edtBarGasAca_Internalname ;
   private String edtAlbEstObs_Internalname ;
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
   private String hsh ;
   private String sMode195 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2506AlbEstObs ;
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
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_533_Jsonclick ;
   private String edtDisComLin_Jsonclick ;
   private String edtDisComCod_Jsonclick ;
   private String edtFonCod_Jsonclick ;
   private String edtBarComMtr_Jsonclick ;
   private String edtBarComPie_Jsonclick ;
   private String edtBarComMLan_Jsonclick ;
   private String edtBarComPLan_Jsonclick ;
   private String edtBarComPEst_Jsonclick ;
   private String edtAlbEComM_Jsonclick ;
   private String edtAlbEComP_Jsonclick ;
   private String edtAlbEComPre_Jsonclick ;
   private String edtBarGasEmp_Jsonclick ;
   private String edtBarGasAca_Jsonclick ;
   private String edtAlbEstObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean n1536AlbEComPre ;
   private boolean n2506AlbEstObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01NC6_A407EmprNom ;
   private boolean[] T01NC6_n407EmprNom ;
   private String[] T01NC8_A396EmprCod ;
   private String[] T01NC7_A396EmprCod ;
   private String[] T01NC9_A407EmprNom ;
   private boolean[] T01NC9_n407EmprNom ;
   private String[] T01NC9_A396EmprCod ;
   private int[] T01NC9_A129BarCod ;
   private byte[] T01NC9_A132BarCodReo ;
   private String[] T01NC9_A130BarCodPar ;
   private long[] T01NC9_A30AlbProCod ;
   private String[] T01NC10_A396EmprCod ;
   private long[] T01NC10_A30AlbProCod ;
   private int[] T01NC10_A129BarCod ;
   private byte[] T01NC10_A132BarCodReo ;
   private String[] T01NC10_A130BarCodPar ;
   private String[] T01NC5_A396EmprCod ;
   private int[] T01NC5_A129BarCod ;
   private byte[] T01NC5_A132BarCodReo ;
   private String[] T01NC5_A130BarCodPar ;
   private long[] T01NC5_A30AlbProCod ;
   private String[] T01NC11_A396EmprCod ;
   private int[] T01NC11_A129BarCod ;
   private byte[] T01NC11_A132BarCodReo ;
   private String[] T01NC11_A130BarCodPar ;
   private long[] T01NC11_A30AlbProCod ;
   private String[] T01NC12_A396EmprCod ;
   private int[] T01NC12_A129BarCod ;
   private byte[] T01NC12_A132BarCodReo ;
   private String[] T01NC12_A130BarCodPar ;
   private long[] T01NC12_A30AlbProCod ;
   private String[] T01NC4_A396EmprCod ;
   private int[] T01NC4_A129BarCod ;
   private byte[] T01NC4_A132BarCodReo ;
   private String[] T01NC4_A130BarCodPar ;
   private long[] T01NC4_A30AlbProCod ;
   private String[] T01NC15_A396EmprCod ;
   private long[] T01NC15_A30AlbProCod ;
   private int[] T01NC15_A129BarCod ;
   private byte[] T01NC15_A132BarCodReo ;
   private String[] T01NC15_A130BarCodPar ;
   private short[] T01NC15_A6648AlbMetLin ;
   private String[] T01NC16_A396EmprCod ;
   private long[] T01NC16_A30AlbProCod ;
   private int[] T01NC16_A129BarCod ;
   private byte[] T01NC16_A132BarCodReo ;
   private String[] T01NC16_A130BarCodPar ;
   private short[] T01NC16_A9639Et_Numero ;
   private String[] T01NC17_A396EmprCod ;
   private long[] T01NC17_A30AlbProCod ;
   private int[] T01NC17_A129BarCod ;
   private byte[] T01NC17_A132BarCodReo ;
   private String[] T01NC17_A130BarCodPar ;
   private short[] T01NC17_A6622AlbHdRLn ;
   private String[] T01NC18_A396EmprCod ;
   private long[] T01NC18_A30AlbProCod ;
   private int[] T01NC18_A129BarCod ;
   private byte[] T01NC18_A132BarCodReo ;
   private String[] T01NC18_A130BarCodPar ;
   private short[] T01NC18_A5456P_ForLin ;
   private String[] T01NC19_A396EmprCod ;
   private long[] T01NC19_A30AlbProCod ;
   private int[] T01NC19_A129BarCod ;
   private byte[] T01NC19_A132BarCodReo ;
   private String[] T01NC19_A130BarCodPar ;
   private byte[] T01NC19_A2524DisComLin ;
   private String[] T01NC19_A1056DisComCod ;
   private String[] T01NC19_A1032FonCod ;
   private short[] T01NC19_A2666ProceCodA ;
   private String[] T01NC20_A396EmprCod ;
   private long[] T01NC20_A3617AlbTrnCod ;
   private long[] T01NC20_A30AlbProCod ;
   private int[] T01NC20_A129BarCod ;
   private byte[] T01NC20_A132BarCodReo ;
   private String[] T01NC20_A130BarCodPar ;
   private String[] T01NC21_A396EmprCod ;
   private long[] T01NC21_A30AlbProCod ;
   private int[] T01NC21_A129BarCod ;
   private byte[] T01NC21_A132BarCodReo ;
   private String[] T01NC21_A130BarCodPar ;
   private short[] T01NC21_A3621AlbPckLin ;
   private String[] T01NC22_A396EmprCod ;
   private long[] T01NC22_A30AlbProCod ;
   private int[] T01NC22_A129BarCod ;
   private byte[] T01NC22_A132BarCodReo ;
   private String[] T01NC22_A130BarCodPar ;
   private short[] T01NC22_A2764AlbHdrLin ;
   private String[] T01NC23_A396EmprCod ;
   private long[] T01NC23_A30AlbProCod ;
   private int[] T01NC23_A129BarCod ;
   private byte[] T01NC23_A132BarCodReo ;
   private String[] T01NC23_A130BarCodPar ;
   private short[] T01NC23_A1468AlbPrdLin ;
   private String[] T01NC24_A396EmprCod ;
   private long[] T01NC24_A30AlbProCod ;
   private int[] T01NC24_A129BarCod ;
   private byte[] T01NC24_A132BarCodReo ;
   private String[] T01NC24_A130BarCodPar ;
   private String[] T01NC24_A200BarPieCod ;
   private String[] T01NC25_A396EmprCod ;
   private long[] T01NC25_A30AlbProCod ;
   private int[] T01NC25_A129BarCod ;
   private byte[] T01NC25_A132BarCodReo ;
   private String[] T01NC25_A130BarCodPar ;
   private short[] T01NC25_A1240GuiFasLin ;
   private String[] T01NC26_A396EmprCod ;
   private long[] T01NC26_A30AlbProCod ;
   private int[] T01NC26_A129BarCod ;
   private byte[] T01NC26_A132BarCodReo ;
   private String[] T01NC26_A130BarCodPar ;
   private long[] T01NC27_A30AlbProCod ;
   private byte[] T01NC27_A2524DisComLin ;
   private String[] T01NC27_A1056DisComCod ;
   private String[] T01NC27_A1032FonCod ;
   private java.math.BigDecimal[] T01NC27_A1533AlbEComM ;
   private boolean[] T01NC27_n1533AlbEComM ;
   private short[] T01NC27_A1534AlbEComP ;
   private boolean[] T01NC27_n1534AlbEComP ;
   private java.math.BigDecimal[] T01NC27_A1536AlbEComPre ;
   private boolean[] T01NC27_n1536AlbEComPre ;
   private String[] T01NC27_A2506AlbEstObs ;
   private boolean[] T01NC27_n2506AlbEstObs ;
   private String[] T01NC27_A396EmprCod ;
   private int[] T01NC27_A129BarCod ;
   private byte[] T01NC27_A132BarCodReo ;
   private String[] T01NC27_A130BarCodPar ;
   private String[] T01NC28_A396EmprCod ;
   private long[] T01NC28_A30AlbProCod ;
   private int[] T01NC28_A129BarCod ;
   private byte[] T01NC28_A132BarCodReo ;
   private String[] T01NC28_A130BarCodPar ;
   private byte[] T01NC28_A2524DisComLin ;
   private String[] T01NC28_A1056DisComCod ;
   private String[] T01NC28_A1032FonCod ;
   private long[] T01NC3_A30AlbProCod ;
   private byte[] T01NC3_A2524DisComLin ;
   private String[] T01NC3_A1056DisComCod ;
   private String[] T01NC3_A1032FonCod ;
   private java.math.BigDecimal[] T01NC3_A1533AlbEComM ;
   private boolean[] T01NC3_n1533AlbEComM ;
   private short[] T01NC3_A1534AlbEComP ;
   private boolean[] T01NC3_n1534AlbEComP ;
   private java.math.BigDecimal[] T01NC3_A1536AlbEComPre ;
   private boolean[] T01NC3_n1536AlbEComPre ;
   private String[] T01NC3_A2506AlbEstObs ;
   private boolean[] T01NC3_n2506AlbEstObs ;
   private String[] T01NC3_A396EmprCod ;
   private int[] T01NC3_A129BarCod ;
   private byte[] T01NC3_A132BarCodReo ;
   private String[] T01NC3_A130BarCodPar ;
   private long[] T01NC2_A30AlbProCod ;
   private byte[] T01NC2_A2524DisComLin ;
   private String[] T01NC2_A1056DisComCod ;
   private String[] T01NC2_A1032FonCod ;
   private java.math.BigDecimal[] T01NC2_A1533AlbEComM ;
   private boolean[] T01NC2_n1533AlbEComM ;
   private short[] T01NC2_A1534AlbEComP ;
   private boolean[] T01NC2_n1534AlbEComP ;
   private java.math.BigDecimal[] T01NC2_A1536AlbEComPre ;
   private boolean[] T01NC2_n1536AlbEComPre ;
   private String[] T01NC2_A2506AlbEstObs ;
   private boolean[] T01NC2_n2506AlbEstObs ;
   private String[] T01NC2_A396EmprCod ;
   private int[] T01NC2_A129BarCod ;
   private byte[] T01NC2_A132BarCodReo ;
   private String[] T01NC2_A130BarCodPar ;
   private String[] T01NC32_A396EmprCod ;
   private long[] T01NC32_A30AlbProCod ;
   private int[] T01NC32_A129BarCod ;
   private byte[] T01NC32_A132BarCodReo ;
   private String[] T01NC32_A130BarCodPar ;
   private byte[] T01NC32_A2524DisComLin ;
   private String[] T01NC32_A1056DisComCod ;
   private String[] T01NC32_A1032FonCod ;
   private String[] T01NC32_A200BarPieCod ;
   private String[] T01NC33_A396EmprCod ;
   private long[] T01NC33_A30AlbProCod ;
   private int[] T01NC33_A129BarCod ;
   private byte[] T01NC33_A132BarCodReo ;
   private String[] T01NC33_A130BarCodPar ;
   private byte[] T01NC33_A2524DisComLin ;
   private String[] T01NC33_A1056DisComCod ;
   private String[] T01NC33_A1032FonCod ;
   private short[] T01NC33_A4433DisComTro ;
   private String[] T01NC34_A396EmprCod ;
   private long[] T01NC34_A30AlbProCod ;
   private int[] T01NC34_A129BarCod ;
   private byte[] T01NC34_A132BarCodReo ;
   private String[] T01NC34_A130BarCodPar ;
   private byte[] T01NC34_A2524DisComLin ;
   private String[] T01NC34_A1056DisComCod ;
   private String[] T01NC34_A1032FonCod ;
   private short[] T01NC34_A4336AlbEstPLin ;
   private String[] T01NC35_A396EmprCod ;
   private long[] T01NC35_A30AlbProCod ;
   private int[] T01NC35_A129BarCod ;
   private byte[] T01NC35_A132BarCodReo ;
   private String[] T01NC35_A130BarCodPar ;
   private byte[] T01NC35_A2524DisComLin ;
   private String[] T01NC35_A1056DisComCod ;
   private String[] T01NC35_A1032FonCod ;
   private short[] T01NC35_A1761ExtCod ;
   private String[] T01NC36_A396EmprCod ;
   private long[] T01NC36_A30AlbProCod ;
   private int[] T01NC36_A129BarCod ;
   private byte[] T01NC36_A132BarCodReo ;
   private String[] T01NC36_A130BarCodPar ;
   private byte[] T01NC36_A2524DisComLin ;
   private String[] T01NC36_A1056DisComCod ;
   private String[] T01NC36_A1032FonCod ;
   private short[] T01NC36_A2666ProceCodA ;
   private String[] T01NC37_A396EmprCod ;
   private long[] T01NC37_A30AlbProCod ;
   private int[] T01NC37_A129BarCod ;
   private byte[] T01NC37_A132BarCodReo ;
   private String[] T01NC37_A130BarCodPar ;
   private byte[] T01NC37_A2524DisComLin ;
   private String[] T01NC37_A1056DisComCod ;
   private String[] T01NC37_A1032FonCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn28__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn28__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn28__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn28__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn28__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NC2", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF AlbEComM, AlbEComP, AlbEComPre, AlbEstObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NC3", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NC4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC8", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC9", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod FROM (TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NC13", "INSERT INTO TXPALBBAR(EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01NC14", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01NC15", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC16", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC18", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC20", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC23", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC24", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC27", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NC28", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NC29", "INSERT INTO TXPALBEST(AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, EmprCod, BarCod, BarCodReo, BarCodPar, AlbEComUPz, DisComUtr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T01NC30", "UPDATE TXPALBEST SET AlbEComM=?, AlbEComP=?, AlbEComPre=?, AlbEstObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T01NC31", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new ForEachCursor("T01NC32", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod FROM TXPALBTEP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC33", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC34", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEstPLin FROM TXPALESTP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC35", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod FROM TXPALBETE WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC36", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NC37", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 25 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 30);
               }
               stmt.setString(9, (String)parms[12], 3);
               stmt.setInt(10, ((Number) parms[13]).intValue());
               stmt.setByte(11, ((Number) parms[14]).byteValue());
               stmt.setString(12, (String)parms[15], 1);
               return;
            case 28 :
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setLong(6, ((Number) parms[9]).longValue());
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 12);
               stmt.setString(12, (String)parms[15], 12);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

