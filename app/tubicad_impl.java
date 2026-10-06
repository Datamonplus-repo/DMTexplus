package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubicad_impl extends GXDataArea
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
            A8688Ub_CodUb = httpContext.GetPar( "Ub_CodUb") ;
            httpContext.ajax_rsp_assign_attri("", false, "A8688Ub_CodUb", A8688Ub_CodUb);
            A8686Ub_CodZ = (short)(GXutil.lval( httpContext.GetPar( "Ub_CodZ"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8686Ub_CodZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8686Ub_CodZ), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONTROL OT/OE EN UBICACIONES", ""), (short)(0)) ;
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

   public tubicad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubicad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubicad_impl.class ));
   }

   public tubicad_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBICAd.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ubicacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUb_CodUb_Internalname, GXutil.rtrim( A8688Ub_CodUb), GXutil.rtrim( localUtil.format( A8688Ub_CodUb, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUb_CodUb_Jsonclick, 0, "", "", "", "", "", 1, edtUb_CodUb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Zona", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUb_CodZ_Internalname, GXutil.ltrim( localUtil.ntoc( A8686Ub_CodZ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUb_CodZ_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8686Ub_CodZ), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8686Ub_CodZ), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUb_CodZ_Jsonclick, 0, "", "", "", "", "", 1, edtUb_CodZ_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Zona", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBICAd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUb_DscZ_Internalname, GXutil.rtrim( A8687Ub_DscZ), GXutil.rtrim( localUtil.format( A8687Ub_DscZ, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUb_DscZ_Jsonclick, 0, "", "", "", "", "", 1, edtUb_DscZ_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBICAd.htm");
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
         nBlankRcdCount1187 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1187 = (short)(1) ;
            scanStart12L1187( ) ;
            while ( RcdFound1187 != 0 )
            {
               init_level_properties1187( ) ;
               getByPrimaryKey12L1187( ) ;
               addRow12L1187( ) ;
               scanNext12L1187( ) ;
            }
            scanEnd12L1187( ) ;
            nBlankRcdCount1187 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal12L1187( ) ;
         standaloneModal12L1187( ) ;
         sMode1187 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow12L1187( ) ;
            edtavnRcdDeleted_1187_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1187_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1187_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1187_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Hdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDRR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Hdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDRP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_PED_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Ped_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_ART_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Art_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_ColN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_COLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_ColN_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_ColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_COLNN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_ColNn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_KGS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Kgs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_PZS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_pzs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_DIB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Dib_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_Mts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_MTS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Mts_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtUb_CodB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_CODB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUb_CodB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_CodB_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1187 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal12L1187( ) ;
            }
            sendRow12L1187( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1187 = (short)(5) ;
         nRcdExists_1187 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart12L1187( ) ;
            while ( RcdFound1187 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451187( ) ;
               init_level_properties1187( ) ;
               standaloneNotModal12L1187( ) ;
               getByPrimaryKey12L1187( ) ;
               standaloneModal12L1187( ) ;
               addRow12L1187( ) ;
               scanNext12L1187( ) ;
            }
            scanEnd12L1187( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1187 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451187( ) ;
      initAll12L1187( ) ;
      init_level_properties1187( ) ;
      nRcdExists_1187 = (short)(0) ;
      nIsMod_1187 = (short)(0) ;
      nRcdDeleted_1187 = (short)(0) ;
      nBlankRcdCount1187 = (short)(nBlankRcdUsr1187+nBlankRcdCount1187) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1187 > 0 )
      {
         standaloneNotModal12L1187( ) ;
         standaloneModal12L1187( ) ;
         addRow12L1187( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtUb_Hdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1187 = (short)(nBlankRcdCount1187-1) ;
      }
      Gx_mode = sMode1187 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBICAd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBICAd.htm");
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
      e1112L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z8688Ub_CodUb = httpContext.cgiGet( "Z8688Ub_CodUb") ;
            Z8686Ub_CodZ = (short)(localUtil.ctol( httpContext.cgiGet( "Z8686Ub_CodZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A8688Ub_CodUb = httpContext.cgiGet( edtUb_CodUb_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8688Ub_CodUb", A8688Ub_CodUb);
            A8686Ub_CodZ = (short)(localUtil.ctol( httpContext.cgiGet( edtUb_CodZ_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8686Ub_CodZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8686Ub_CodZ), 4, 0));
            A8687Ub_DscZ = httpContext.cgiGet( edtUb_DscZ_Internalname) ;
            n8687Ub_DscZ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8687Ub_DscZ", A8687Ub_DscZ);
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
               A8688Ub_CodUb = httpContext.GetPar( "Ub_CodUb") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8688Ub_CodUb", A8688Ub_CodUb);
               A8686Ub_CodZ = (short)(GXutil.lval( httpContext.GetPar( "Ub_CodZ"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8686Ub_CodZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8686Ub_CodZ), 4, 0));
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
                        e1112L2 ();
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
            initAll12L1186( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1187_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1187_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes12L1186( ) ;
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

   public void confirm_12L0( )
   {
      beforeValidate12L1186( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12L1186( ) ;
         }
         else
         {
            checkExtendedTable12L1186( ) ;
            if ( AnyError == 0 )
            {
               zm12L1186( 3) ;
               zm12L1186( 4) ;
            }
            closeExtendedTableCursors12L1186( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1186 = Gx_mode ;
         confirm_12L1187( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1186 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues12L0( ) ;
      }
   }

   public void confirm_12L1187( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow12L1187( ) ;
         if ( ( nRcdExists_1187 != 0 ) || ( nIsMod_1187 != 0 ) )
         {
            getKey12L1187( ) ;
            if ( ( nRcdExists_1187 == 0 ) && ( nRcdDeleted_1187 == 0 ) )
            {
               if ( RcdFound1187 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate12L1187( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable12L1187( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors12L1187( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "UB_HDR_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUb_Hdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1187 != 0 )
               {
                  if ( nRcdDeleted_1187 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey12L1187( ) ;
                     load12L1187( ) ;
                     beforeValidate12L1187( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls12L1187( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1187 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate12L1187( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable12L1187( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors12L1187( ) ;
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
                  if ( nRcdDeleted_1187 == 0 )
                  {
                     GXCCtl = "UB_HDR_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtUb_Hdr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1187_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdrp_Internalname, GXutil.rtrim( A8691Ub_Hdrp)) ;
         httpContext.changePostValue( edtUb_Ped_Internalname, GXutil.rtrim( A8763Ub_Ped)) ;
         httpContext.changePostValue( edtUb_Art_Internalname, GXutil.rtrim( A8764Ub_Art)) ;
         httpContext.changePostValue( edtUb_ColN_Internalname, GXutil.rtrim( A8765Ub_ColN)) ;
         httpContext.changePostValue( edtUb_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Dib_Internalname, GXutil.rtrim( A8769Ub_Dib)) ;
         httpContext.changePostValue( edtUb_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_CodB_Internalname, GXutil.rtrim( A11700Ub_CodB)) ;
         httpContext.changePostValue( "ZT_"+"Z8689Ub_Hdr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8690Ub_Hdrr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8691Ub_Hdrp_"+sGXsfl_45_idx, GXutil.rtrim( Z8691Ub_Hdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z8763Ub_Ped_"+sGXsfl_45_idx, GXutil.rtrim( Z8763Ub_Ped)) ;
         httpContext.changePostValue( "ZT_"+"Z8764Ub_Art_"+sGXsfl_45_idx, GXutil.rtrim( Z8764Ub_Art)) ;
         httpContext.changePostValue( "ZT_"+"Z8765Ub_ColN_"+sGXsfl_45_idx, GXutil.rtrim( Z8765Ub_ColN)) ;
         httpContext.changePostValue( "ZT_"+"Z8766Ub_ColNn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8767Ub_Kgs_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8768Ub_pzs_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8769Ub_Dib_"+sGXsfl_45_idx, GXutil.rtrim( Z8769Ub_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z9539Ub_Mts_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11700Ub_CodB_"+sGXsfl_45_idx, GXutil.rtrim( Z11700Ub_CodB)) ;
         httpContext.changePostValue( "nRcdDeleted_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1187 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1187_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1187_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDRR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDRP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_PED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_ART_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_COLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_COLNN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_KGS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_PZS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_DIB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_MTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Mts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_CODB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_CodB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption12L0( )
   {
   }

   public void e1112L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubicad_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tubicad_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubicad_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubicad_impl.this.A396EmprCod = GXv_char2[0] ;
      tubicad_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubicad_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV32Reg000 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      tubicad_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Reg000", GXutil.str( AV32Reg000, 1, 0));
   }

   public void zm12L1186( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z8688Ub_CodUb = A8688Ub_CodUb ;
         Z396EmprCod = A396EmprCod ;
         Z8686Ub_CodZ = A8686Ub_CodZ ;
         Z407EmprNom = A407EmprNom ;
         Z8687Ub_DscZ = A8687Ub_DscZ ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      AV33Pgmname = "TUBICAd" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T012L6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012L6_A407EmprNom[0] ;
      n407EmprNom = T012L6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T012L7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UB_CODZ");
         AnyError = (short)(1) ;
      }
      A8687Ub_DscZ = T012L7_A8687Ub_DscZ[0] ;
      n8687Ub_DscZ = T012L7_n8687Ub_DscZ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8687Ub_DscZ", A8687Ub_DscZ);
      pr_default.close(5);
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

   public void load12L1186( )
   {
      /* Using cursor T012L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1186 = (short)(1) ;
         A407EmprNom = T012L8_A407EmprNom[0] ;
         n407EmprNom = T012L8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8687Ub_DscZ = T012L8_A8687Ub_DscZ[0] ;
         n8687Ub_DscZ = T012L8_n8687Ub_DscZ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8687Ub_DscZ", A8687Ub_DscZ);
         zm12L1186( -2) ;
      }
      pr_default.close(6);
      onLoadActions12L1186( ) ;
   }

   public void onLoadActions12L1186( )
   {
   }

   public void checkExtendedTable12L1186( )
   {
      nIsDirty_1186 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors12L1186( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey12L1186( )
   {
      /* Using cursor T012L9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1186 = (short)(1) ;
      }
      else
      {
         RcdFound1186 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012L5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T012L5_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( GXutil.strcmp(T012L5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012L5_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
      {
         zm12L1186( 2) ;
         RcdFound1186 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z8688Ub_CodUb = A8688Ub_CodUb ;
         Z8686Ub_CodZ = A8686Ub_CodZ ;
         sMode1186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12L1186( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1186 = (short)(0) ;
            initializeNonKey12L1186( ) ;
         }
         Gx_mode = sMode1186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1186 = (short)(0) ;
         initializeNonKey12L1186( ) ;
         sMode1186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey12L1186( ) ;
      if ( RcdFound1186 == 0 )
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
      RcdFound1186 = (short)(0) ;
      /* Using cursor T012L10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T012L10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012L10_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( T012L10_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T012L10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012L10_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( T012L10_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
         {
            RcdFound1186 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1186 = (short)(0) ;
      /* Using cursor T012L11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T012L11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012L11_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( T012L11_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T012L11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012L11_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( T012L11_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
         {
            RcdFound1186 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12L1186( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert12L1186( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1186 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8688Ub_CodUb, Z8688Ub_CodUb) != 0 ) || ( A8686Ub_CodZ != Z8686Ub_CodZ ) )
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
               update12L1186( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8688Ub_CodUb, Z8688Ub_CodUb) != 0 ) || ( A8686Ub_CodZ != Z8686Ub_CodZ ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert12L1186( ) ;
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
                  insert12L1186( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8688Ub_CodUb, Z8688Ub_CodUb) != 0 ) || ( A8686Ub_CodZ != Z8686Ub_CodZ ) )
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
      getKey12L1186( ) ;
      if ( RcdFound1186 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8688Ub_CodUb, Z8688Ub_CodUb) != 0 ) || ( A8686Ub_CodZ != Z8686Ub_CodZ ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8688Ub_CodUb, Z8688Ub_CodUb) != 0 ) || ( A8686Ub_CodZ != Z8686Ub_CodZ ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubicad");
   }

   public void insert_check( )
   {
      confirm_12L0( ) ;
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
      if ( RcdFound1186 == 0 )
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
      scanStart12L1186( ) ;
      if ( RcdFound1186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd12L1186( ) ;
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
      if ( RcdFound1186 == 0 )
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
      if ( RcdFound1186 == 0 )
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
      scanStart12L1186( ) ;
      if ( RcdFound1186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1186 != 0 )
         {
            scanNext12L1186( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd12L1186( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12L1186( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012L4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBICA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBICA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12L1186( )
   {
      beforeValidate12L1186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12L1186( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12L1186( 0) ;
         checkOptimisticConcurrency12L1186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12L1186( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12L1186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012L12 */
                  pr_default.execute(10, new Object[] {A8688Ub_CodUb, A396EmprCod, Short.valueOf(A8686Ub_CodZ)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBICA");
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
                        processLevel12L1186( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption12L0( ) ;
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
            load12L1186( ) ;
         }
         endLevel12L1186( ) ;
      }
      closeExtendedTableCursors12L1186( ) ;
   }

   public void update12L1186( )
   {
      beforeValidate12L1186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12L1186( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12L1186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12L1186( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12L1186( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPUBICA */
                  deferredUpdate12L1186( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel12L1186( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption12L0( ) ;
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
         endLevel12L1186( ) ;
      }
      closeExtendedTableCursors12L1186( ) ;
   }

   public void deferredUpdate12L1186( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12L1186( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12L1186( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12L1186( ) ;
         afterConfirm12L1186( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12L1186( ) ;
            if ( AnyError == 0 )
            {
               scanStart12L1187( ) ;
               while ( RcdFound1187 != 0 )
               {
                  getByPrimaryKey12L1187( ) ;
                  delete12L1187( ) ;
                  scanNext12L1187( ) ;
               }
               scanEnd12L1187( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012L13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBICA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1186 == 0 )
                        {
                           initAll12L1186( ) ;
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
                        resetCaption12L0( ) ;
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
      sMode1186 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12L1186( ) ;
      Gx_mode = sMode1186 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12L1186( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel12L1187( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow12L1187( ) ;
         if ( ( nRcdExists_1187 != 0 ) || ( nIsMod_1187 != 0 ) )
         {
            standaloneNotModal12L1187( ) ;
            getKey12L1187( ) ;
            if ( ( nRcdExists_1187 == 0 ) && ( nRcdDeleted_1187 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert12L1187( ) ;
            }
            else
            {
               if ( RcdFound1187 != 0 )
               {
                  if ( ( nRcdDeleted_1187 != 0 ) && ( nRcdExists_1187 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete12L1187( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1187 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update12L1187( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1187 == 0 )
                  {
                     GXCCtl = "UB_HDR_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtUb_Hdr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1187_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Hdrp_Internalname, GXutil.rtrim( A8691Ub_Hdrp)) ;
         httpContext.changePostValue( edtUb_Ped_Internalname, GXutil.rtrim( A8763Ub_Ped)) ;
         httpContext.changePostValue( edtUb_Art_Internalname, GXutil.rtrim( A8764Ub_Art)) ;
         httpContext.changePostValue( edtUb_ColN_Internalname, GXutil.rtrim( A8765Ub_ColN)) ;
         httpContext.changePostValue( edtUb_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_Dib_Internalname, GXutil.rtrim( A8769Ub_Dib)) ;
         httpContext.changePostValue( edtUb_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtUb_CodB_Internalname, GXutil.rtrim( A11700Ub_CodB)) ;
         httpContext.changePostValue( "ZT_"+"Z8689Ub_Hdr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8690Ub_Hdrr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8691Ub_Hdrp_"+sGXsfl_45_idx, GXutil.rtrim( Z8691Ub_Hdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z8763Ub_Ped_"+sGXsfl_45_idx, GXutil.rtrim( Z8763Ub_Ped)) ;
         httpContext.changePostValue( "ZT_"+"Z8764Ub_Art_"+sGXsfl_45_idx, GXutil.rtrim( Z8764Ub_Art)) ;
         httpContext.changePostValue( "ZT_"+"Z8765Ub_ColN_"+sGXsfl_45_idx, GXutil.rtrim( Z8765Ub_ColN)) ;
         httpContext.changePostValue( "ZT_"+"Z8766Ub_ColNn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8767Ub_Kgs_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8768Ub_pzs_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8769Ub_Dib_"+sGXsfl_45_idx, GXutil.rtrim( Z8769Ub_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z9539Ub_Mts_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11700Ub_CodB_"+sGXsfl_45_idx, GXutil.rtrim( Z11700Ub_CodB)) ;
         httpContext.changePostValue( "nRcdDeleted_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1187_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1187 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1187_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1187_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDRR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_HDRP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_PED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_ART_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_COLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_COLNN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_KGS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_PZS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_DIB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_MTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Mts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UB_CODB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_CodB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll12L1187( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1187 = (short)(0) ;
      nIsMod_1187 = (short)(0) ;
      nRcdDeleted_1187 = (short)(0) ;
   }

   public void processLevel12L1186( )
   {
      /* Save parent mode. */
      sMode1186 = Gx_mode ;
      processNestedLevel12L1187( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1186 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel12L1186( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12L1186( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubicad");
         if ( AnyError == 0 )
         {
            confirmValues12L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubicad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12L1186( )
   {
      /* Scan By routine */
      /* Using cursor T012L14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      RcdFound1186 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1186 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12L1186( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1186 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1186 = (short)(1) ;
      }
   }

   public void scanEnd12L1186( )
   {
      pr_default.close(12);
   }

   public void afterConfirm12L1186( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12L1186( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12L1186( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12L1186( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12L1186( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12L1186( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12L1186( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtUb_CodUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_CodUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_CodUb_Enabled), 5, 0), true);
      edtUb_CodZ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_CodZ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_CodZ_Enabled), 5, 0), true);
      edtUb_DscZ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_DscZ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_DscZ_Enabled), 5, 0), true);
   }

   public void zm12L1187( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8763Ub_Ped = T012L3_A8763Ub_Ped[0] ;
            Z8764Ub_Art = T012L3_A8764Ub_Art[0] ;
            Z8765Ub_ColN = T012L3_A8765Ub_ColN[0] ;
            Z8766Ub_ColNn = T012L3_A8766Ub_ColNn[0] ;
            Z8767Ub_Kgs = T012L3_A8767Ub_Kgs[0] ;
            Z8768Ub_pzs = T012L3_A8768Ub_pzs[0] ;
            Z8769Ub_Dib = T012L3_A8769Ub_Dib[0] ;
            Z9539Ub_Mts = T012L3_A9539Ub_Mts[0] ;
            Z11700Ub_CodB = T012L3_A11700Ub_CodB[0] ;
         }
         else
         {
            Z8763Ub_Ped = A8763Ub_Ped ;
            Z8764Ub_Art = A8764Ub_Art ;
            Z8765Ub_ColN = A8765Ub_ColN ;
            Z8766Ub_ColNn = A8766Ub_ColNn ;
            Z8767Ub_Kgs = A8767Ub_Kgs ;
            Z8768Ub_pzs = A8768Ub_pzs ;
            Z8769Ub_Dib = A8769Ub_Dib ;
            Z9539Ub_Mts = A9539Ub_Mts ;
            Z11700Ub_CodB = A11700Ub_CodB ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z396EmprCod = A396EmprCod ;
         Z8688Ub_CodUb = A8688Ub_CodUb ;
         Z8686Ub_CodZ = A8686Ub_CodZ ;
         Z8689Ub_Hdr = A8689Ub_Hdr ;
         Z8690Ub_Hdrr = A8690Ub_Hdrr ;
         Z8691Ub_Hdrp = A8691Ub_Hdrp ;
         Z8763Ub_Ped = A8763Ub_Ped ;
         Z8764Ub_Art = A8764Ub_Art ;
         Z8765Ub_ColN = A8765Ub_ColN ;
         Z8766Ub_ColNn = A8766Ub_ColNn ;
         Z8767Ub_Kgs = A8767Ub_Kgs ;
         Z8768Ub_pzs = A8768Ub_pzs ;
         Z8769Ub_Dib = A8769Ub_Dib ;
         Z9539Ub_Mts = A9539Ub_Mts ;
         Z11700Ub_CodB = A11700Ub_CodB ;
      }
   }

   public void standaloneNotModal12L1187( )
   {
   }

   public void standaloneModal12L1187( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtUb_Hdr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtUb_Hdr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtUb_Hdrr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtUb_Hdrr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtUb_Hdrp_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtUb_Hdrp_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load12L1187( )
   {
      /* Using cursor T012L15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1187 = (short)(1) ;
         A8763Ub_Ped = T012L15_A8763Ub_Ped[0] ;
         n8763Ub_Ped = T012L15_n8763Ub_Ped[0] ;
         A8764Ub_Art = T012L15_A8764Ub_Art[0] ;
         n8764Ub_Art = T012L15_n8764Ub_Art[0] ;
         A8765Ub_ColN = T012L15_A8765Ub_ColN[0] ;
         n8765Ub_ColN = T012L15_n8765Ub_ColN[0] ;
         A8766Ub_ColNn = T012L15_A8766Ub_ColNn[0] ;
         n8766Ub_ColNn = T012L15_n8766Ub_ColNn[0] ;
         A8767Ub_Kgs = T012L15_A8767Ub_Kgs[0] ;
         n8767Ub_Kgs = T012L15_n8767Ub_Kgs[0] ;
         A8768Ub_pzs = T012L15_A8768Ub_pzs[0] ;
         n8768Ub_pzs = T012L15_n8768Ub_pzs[0] ;
         A8769Ub_Dib = T012L15_A8769Ub_Dib[0] ;
         n8769Ub_Dib = T012L15_n8769Ub_Dib[0] ;
         A9539Ub_Mts = T012L15_A9539Ub_Mts[0] ;
         n9539Ub_Mts = T012L15_n9539Ub_Mts[0] ;
         A11700Ub_CodB = T012L15_A11700Ub_CodB[0] ;
         n11700Ub_CodB = T012L15_n11700Ub_CodB[0] ;
         zm12L1187( -5) ;
      }
      pr_default.close(13);
      onLoadActions12L1187( ) ;
   }

   public void onLoadActions12L1187( )
   {
   }

   public void checkExtendedTable12L1187( )
   {
      nIsDirty_1187 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal12L1187( ) ;
   }

   public void closeExtendedTableCursors12L1187( )
   {
   }

   public void enableDisable12L1187( )
   {
   }

   public void getKey12L1187( )
   {
      /* Using cursor T012L16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1187 = (short)(1) ;
      }
      else
      {
         RcdFound1187 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey12L1187( )
   {
      /* Using cursor T012L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T012L3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012L3_A8688Ub_CodUb[0], A8688Ub_CodUb) == 0 ) && ( T012L3_A8686Ub_CodZ[0] == A8686Ub_CodZ ) )
      {
         zm12L1187( 5) ;
         RcdFound1187 = (short)(1) ;
         initializeNonKey12L1187( ) ;
         A8689Ub_Hdr = T012L3_A8689Ub_Hdr[0] ;
         A8690Ub_Hdrr = T012L3_A8690Ub_Hdrr[0] ;
         A8691Ub_Hdrp = T012L3_A8691Ub_Hdrp[0] ;
         A8763Ub_Ped = T012L3_A8763Ub_Ped[0] ;
         n8763Ub_Ped = T012L3_n8763Ub_Ped[0] ;
         A8764Ub_Art = T012L3_A8764Ub_Art[0] ;
         n8764Ub_Art = T012L3_n8764Ub_Art[0] ;
         A8765Ub_ColN = T012L3_A8765Ub_ColN[0] ;
         n8765Ub_ColN = T012L3_n8765Ub_ColN[0] ;
         A8766Ub_ColNn = T012L3_A8766Ub_ColNn[0] ;
         n8766Ub_ColNn = T012L3_n8766Ub_ColNn[0] ;
         A8767Ub_Kgs = T012L3_A8767Ub_Kgs[0] ;
         n8767Ub_Kgs = T012L3_n8767Ub_Kgs[0] ;
         A8768Ub_pzs = T012L3_A8768Ub_pzs[0] ;
         n8768Ub_pzs = T012L3_n8768Ub_pzs[0] ;
         A8769Ub_Dib = T012L3_A8769Ub_Dib[0] ;
         n8769Ub_Dib = T012L3_n8769Ub_Dib[0] ;
         A9539Ub_Mts = T012L3_A9539Ub_Mts[0] ;
         n9539Ub_Mts = T012L3_n9539Ub_Mts[0] ;
         A11700Ub_CodB = T012L3_A11700Ub_CodB[0] ;
         n11700Ub_CodB = T012L3_n11700Ub_CodB[0] ;
         Z396EmprCod = A396EmprCod ;
         Z8688Ub_CodUb = A8688Ub_CodUb ;
         Z8686Ub_CodZ = A8686Ub_CodZ ;
         Z8689Ub_Hdr = A8689Ub_Hdr ;
         Z8690Ub_Hdrr = A8690Ub_Hdrr ;
         Z8691Ub_Hdrp = A8691Ub_Hdrp ;
         sMode1187 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12L1187( ) ;
         load12L1187( ) ;
         Gx_mode = sMode1187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1187 = (short)(0) ;
         initializeNonKey12L1187( ) ;
         sMode1187 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12L1187( ) ;
         Gx_mode = sMode1187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes12L1187( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency12L1187( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBICAd"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8763Ub_Ped, T012L2_A8763Ub_Ped[0]) != 0 ) || ( GXutil.strcmp(Z8764Ub_Art, T012L2_A8764Ub_Art[0]) != 0 ) || ( GXutil.strcmp(Z8765Ub_ColN, T012L2_A8765Ub_ColN[0]) != 0 ) || ( Z8766Ub_ColNn != T012L2_A8766Ub_ColNn[0] ) || ( DecimalUtil.compareTo(Z8767Ub_Kgs, T012L2_A8767Ub_Kgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8768Ub_pzs != T012L2_A8768Ub_pzs[0] ) || ( GXutil.strcmp(Z8769Ub_Dib, T012L2_A8769Ub_Dib[0]) != 0 ) || ( DecimalUtil.compareTo(Z9539Ub_Mts, T012L2_A9539Ub_Mts[0]) != 0 ) || ( GXutil.strcmp(Z11700Ub_CodB, T012L2_A11700Ub_CodB[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8763Ub_Ped, T012L2_A8763Ub_Ped[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_Ped");
               GXutil.writeLogRaw("Old: ",Z8763Ub_Ped);
               GXutil.writeLogRaw("Current: ",T012L2_A8763Ub_Ped[0]);
            }
            if ( GXutil.strcmp(Z8764Ub_Art, T012L2_A8764Ub_Art[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_Art");
               GXutil.writeLogRaw("Old: ",Z8764Ub_Art);
               GXutil.writeLogRaw("Current: ",T012L2_A8764Ub_Art[0]);
            }
            if ( GXutil.strcmp(Z8765Ub_ColN, T012L2_A8765Ub_ColN[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_ColN");
               GXutil.writeLogRaw("Old: ",Z8765Ub_ColN);
               GXutil.writeLogRaw("Current: ",T012L2_A8765Ub_ColN[0]);
            }
            if ( Z8766Ub_ColNn != T012L2_A8766Ub_ColNn[0] )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_ColNn");
               GXutil.writeLogRaw("Old: ",Z8766Ub_ColNn);
               GXutil.writeLogRaw("Current: ",T012L2_A8766Ub_ColNn[0]);
            }
            if ( DecimalUtil.compareTo(Z8767Ub_Kgs, T012L2_A8767Ub_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_Kgs");
               GXutil.writeLogRaw("Old: ",Z8767Ub_Kgs);
               GXutil.writeLogRaw("Current: ",T012L2_A8767Ub_Kgs[0]);
            }
            if ( Z8768Ub_pzs != T012L2_A8768Ub_pzs[0] )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_pzs");
               GXutil.writeLogRaw("Old: ",Z8768Ub_pzs);
               GXutil.writeLogRaw("Current: ",T012L2_A8768Ub_pzs[0]);
            }
            if ( GXutil.strcmp(Z8769Ub_Dib, T012L2_A8769Ub_Dib[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_Dib");
               GXutil.writeLogRaw("Old: ",Z8769Ub_Dib);
               GXutil.writeLogRaw("Current: ",T012L2_A8769Ub_Dib[0]);
            }
            if ( DecimalUtil.compareTo(Z9539Ub_Mts, T012L2_A9539Ub_Mts[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_Mts");
               GXutil.writeLogRaw("Old: ",Z9539Ub_Mts);
               GXutil.writeLogRaw("Current: ",T012L2_A9539Ub_Mts[0]);
            }
            if ( GXutil.strcmp(Z11700Ub_CodB, T012L2_A11700Ub_CodB[0]) != 0 )
            {
               GXutil.writeLogln("tubicad:[seudo value changed for attri]"+"Ub_CodB");
               GXutil.writeLogRaw("Old: ",Z11700Ub_CodB);
               GXutil.writeLogRaw("Current: ",T012L2_A11700Ub_CodB[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBICAd"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12L1187( )
   {
      beforeValidate12L1187( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12L1187( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12L1187( 0) ;
         checkOptimisticConcurrency12L1187( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12L1187( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12L1187( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012L17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp, Boolean.valueOf(n8763Ub_Ped), A8763Ub_Ped, Boolean.valueOf(n8764Ub_Art), A8764Ub_Art, Boolean.valueOf(n8765Ub_ColN), A8765Ub_ColN, Boolean.valueOf(n8766Ub_ColNn), Integer.valueOf(A8766Ub_ColNn), Boolean.valueOf(n8767Ub_Kgs), A8767Ub_Kgs, Boolean.valueOf(n8768Ub_pzs), Integer.valueOf(A8768Ub_pzs), Boolean.valueOf(n8769Ub_Dib), A8769Ub_Dib, Boolean.valueOf(n9539Ub_Mts), A9539Ub_Mts, Boolean.valueOf(n11700Ub_CodB), A11700Ub_CodB});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBICAd");
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
            load12L1187( ) ;
         }
         endLevel12L1187( ) ;
      }
      closeExtendedTableCursors12L1187( ) ;
   }

   public void update12L1187( )
   {
      beforeValidate12L1187( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12L1187( ) ;
      }
      if ( ( nIsMod_1187 != 0 ) || ( nIsDirty_1187 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency12L1187( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm12L1187( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate12L1187( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T012L18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n8763Ub_Ped), A8763Ub_Ped, Boolean.valueOf(n8764Ub_Art), A8764Ub_Art, Boolean.valueOf(n8765Ub_ColN), A8765Ub_ColN, Boolean.valueOf(n8766Ub_ColNn), Integer.valueOf(A8766Ub_ColNn), Boolean.valueOf(n8767Ub_Kgs), A8767Ub_Kgs, Boolean.valueOf(n8768Ub_pzs), Integer.valueOf(A8768Ub_pzs), Boolean.valueOf(n8769Ub_Dib), A8769Ub_Dib, Boolean.valueOf(n9539Ub_Mts), A9539Ub_Mts, Boolean.valueOf(n11700Ub_CodB), A11700Ub_CodB, A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBICAd");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBICAd"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate12L1187( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey12L1187( ) ;
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
            endLevel12L1187( ) ;
         }
      }
      closeExtendedTableCursors12L1187( ) ;
   }

   public void deferredUpdate12L1187( )
   {
   }

   public void delete12L1187( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12L1187( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12L1187( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12L1187( ) ;
         afterConfirm12L1187( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12L1187( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012L19 */
               pr_default.execute(17, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ), Integer.valueOf(A8689Ub_Hdr), Byte.valueOf(A8690Ub_Hdrr), A8691Ub_Hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBICAd");
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
      sMode1187 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12L1187( ) ;
      Gx_mode = sMode1187 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12L1187( )
   {
      standaloneModal12L1187( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel12L1187( )
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

   public void scanStart12L1187( )
   {
      /* Scan By routine */
      /* Using cursor T012L20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A8688Ub_CodUb, Short.valueOf(A8686Ub_CodZ)});
      RcdFound1187 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1187 = (short)(1) ;
         A8689Ub_Hdr = T012L20_A8689Ub_Hdr[0] ;
         A8690Ub_Hdrr = T012L20_A8690Ub_Hdrr[0] ;
         A8691Ub_Hdrp = T012L20_A8691Ub_Hdrp[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12L1187( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1187 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1187 = (short)(1) ;
         A8689Ub_Hdr = T012L20_A8689Ub_Hdr[0] ;
         A8690Ub_Hdrr = T012L20_A8690Ub_Hdrr[0] ;
         A8691Ub_Hdrp = T012L20_A8691Ub_Hdrp[0] ;
      }
   }

   public void scanEnd12L1187( )
   {
      pr_default.close(18);
   }

   public void afterConfirm12L1187( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12L1187( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12L1187( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12L1187( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12L1187( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12L1187( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12L1187( )
   {
      edtUb_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Ped_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Art_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_ColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_ColN_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_ColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_ColNn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Kgs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_pzs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Dib_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Mts_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_CodB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_CodB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_CodB_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes12L1187( )
   {
   }

   public void send_integrity_lvl_hashes12L1186( )
   {
   }

   public void subsflControlProps_451187( )
   {
      edtavnRcdDeleted_1187_Internalname = "vNRCDDELETED_1187_"+sGXsfl_45_idx ;
      edtUb_Hdr_Internalname = "UB_HDR_"+sGXsfl_45_idx ;
      edtUb_Hdrr_Internalname = "UB_HDRR_"+sGXsfl_45_idx ;
      edtUb_Hdrp_Internalname = "UB_HDRP_"+sGXsfl_45_idx ;
      edtUb_Ped_Internalname = "UB_PED_"+sGXsfl_45_idx ;
      edtUb_Art_Internalname = "UB_ART_"+sGXsfl_45_idx ;
      edtUb_ColN_Internalname = "UB_COLN_"+sGXsfl_45_idx ;
      edtUb_ColNn_Internalname = "UB_COLNN_"+sGXsfl_45_idx ;
      edtUb_Kgs_Internalname = "UB_KGS_"+sGXsfl_45_idx ;
      edtUb_pzs_Internalname = "UB_PZS_"+sGXsfl_45_idx ;
      edtUb_Dib_Internalname = "UB_DIB_"+sGXsfl_45_idx ;
      edtUb_Mts_Internalname = "UB_MTS_"+sGXsfl_45_idx ;
      edtUb_CodB_Internalname = "UB_CODB_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451187( )
   {
      edtavnRcdDeleted_1187_Internalname = "vNRCDDELETED_1187_"+sGXsfl_45_fel_idx ;
      edtUb_Hdr_Internalname = "UB_HDR_"+sGXsfl_45_fel_idx ;
      edtUb_Hdrr_Internalname = "UB_HDRR_"+sGXsfl_45_fel_idx ;
      edtUb_Hdrp_Internalname = "UB_HDRP_"+sGXsfl_45_fel_idx ;
      edtUb_Ped_Internalname = "UB_PED_"+sGXsfl_45_fel_idx ;
      edtUb_Art_Internalname = "UB_ART_"+sGXsfl_45_fel_idx ;
      edtUb_ColN_Internalname = "UB_COLN_"+sGXsfl_45_fel_idx ;
      edtUb_ColNn_Internalname = "UB_COLNN_"+sGXsfl_45_fel_idx ;
      edtUb_Kgs_Internalname = "UB_KGS_"+sGXsfl_45_fel_idx ;
      edtUb_pzs_Internalname = "UB_PZS_"+sGXsfl_45_fel_idx ;
      edtUb_Dib_Internalname = "UB_DIB_"+sGXsfl_45_fel_idx ;
      edtUb_Mts_Internalname = "UB_MTS_"+sGXsfl_45_fel_idx ;
      edtUb_CodB_Internalname = "UB_CODB_"+sGXsfl_45_fel_idx ;
   }

   public void addRow12L1187( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451187( ) ;
      sendRow12L1187( ) ;
   }

   public void sendRow12L1187( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1187_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1187_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1187), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1187), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1187_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1187_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Hdr_Internalname,GXutil.ltrim( localUtil.ntoc( A8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8689Ub_Hdr), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Hdr_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Hdrr_Internalname,GXutil.ltrim( localUtil.ntoc( A8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8690Ub_Hdrr), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Hdrr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Hdrr_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Hdrp_Internalname,GXutil.rtrim( A8691Ub_Hdrp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Hdrp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Hdrp_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Ped_Internalname,GXutil.rtrim( A8763Ub_Ped),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Ped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Ped_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Art_Internalname,GXutil.rtrim( A8764Ub_Art),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Art_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Art_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_ColN_Internalname,GXutil.rtrim( A8765Ub_ColN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_ColN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_ColN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_ColNn_Internalname,GXutil.ltrim( localUtil.ntoc( A8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtUb_ColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8766Ub_ColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8766Ub_ColNn), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_ColNn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_ColNn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Kgs_Internalname,GXutil.ltrim( localUtil.ntoc( A8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtUb_Kgs_Enabled!=0) ? localUtil.format( A8767Ub_Kgs, "ZZZZZ9.99") : localUtil.format( A8767Ub_Kgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_pzs_Internalname,GXutil.ltrim( localUtil.ntoc( A8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtUb_pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8768Ub_pzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8768Ub_pzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_pzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_pzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Dib_Internalname,GXutil.rtrim( A8769Ub_Dib),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Dib_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Dib_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_Mts_Internalname,GXutil.ltrim( localUtil.ntoc( A9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtUb_Mts_Enabled!=0) ? localUtil.format( A9539Ub_Mts, "ZZZZZ9.99") : localUtil.format( A9539Ub_Mts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_Mts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_Mts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1187_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUb_CodB_Internalname,GXutil.rtrim( A11700Ub_CodB),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUb_CodB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUb_CodB_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes12L1187( ) ;
      GXCCtl = "Z8689Ub_Hdr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8689Ub_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8690Ub_Hdrr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8690Ub_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8691Ub_Hdrp_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8691Ub_Hdrp));
      GXCCtl = "Z8763Ub_Ped_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8763Ub_Ped));
      GXCCtl = "Z8764Ub_Art_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8764Ub_Art));
      GXCCtl = "Z8765Ub_ColN_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8765Ub_ColN));
      GXCCtl = "Z8766Ub_ColNn_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8766Ub_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8767Ub_Kgs_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8767Ub_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8768Ub_pzs_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8768Ub_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8769Ub_Dib_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8769Ub_Dib));
      GXCCtl = "Z9539Ub_Mts_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9539Ub_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11700Ub_CodB_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11700Ub_CodB));
      GXCCtl = "nRcdDeleted_1187_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1187_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1187_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1187_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1187_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_HDR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_HDRR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_HDRP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_PED_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_ART_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_COLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_COLNN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_KGS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_PZS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_DIB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_MTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Mts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UB_CODB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_CodB_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow12L1187( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451187( ) ;
      edtavnRcdDeleted_1187_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1187_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Hdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDRR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Hdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_HDRP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_PED_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_ART_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_ColN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_COLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_ColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_COLNN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_KGS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_PZS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_DIB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_Mts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_MTS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUb_CodB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UB_CODB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1187");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1187_Internalname ;
         wbErr = true ;
         nRcdDeleted_1187 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1187 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUb_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUb_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "UB_HDR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_Hdr_Internalname ;
         wbErr = true ;
         A8689Ub_Hdr = 0 ;
      }
      else
      {
         A8689Ub_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtUb_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUb_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUb_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "UB_HDRR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_Hdrr_Internalname ;
         wbErr = true ;
         A8690Ub_Hdrr = (byte)(0) ;
      }
      else
      {
         A8690Ub_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtUb_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8691Ub_Hdrp = httpContext.cgiGet( edtUb_Hdrp_Internalname) ;
      A8763Ub_Ped = httpContext.cgiGet( edtUb_Ped_Internalname) ;
      n8763Ub_Ped = false ;
      A8764Ub_Art = httpContext.cgiGet( edtUb_Art_Internalname) ;
      n8764Ub_Art = false ;
      A8765Ub_ColN = httpContext.cgiGet( edtUb_ColN_Internalname) ;
      n8765Ub_ColN = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUb_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUb_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "UB_COLNN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_ColNn_Internalname ;
         wbErr = true ;
         A8766Ub_ColNn = 0 ;
         n8766Ub_ColNn = false ;
      }
      else
      {
         A8766Ub_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtUb_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8766Ub_ColNn = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtUb_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtUb_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "UB_KGS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_Kgs_Internalname ;
         wbErr = true ;
         A8767Ub_Kgs = DecimalUtil.ZERO ;
         n8767Ub_Kgs = false ;
      }
      else
      {
         A8767Ub_Kgs = localUtil.ctond( httpContext.cgiGet( edtUb_Kgs_Internalname)) ;
         n8767Ub_Kgs = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUb_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUb_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "UB_PZS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_pzs_Internalname ;
         wbErr = true ;
         A8768Ub_pzs = 0 ;
         n8768Ub_pzs = false ;
      }
      else
      {
         A8768Ub_pzs = (int)(localUtil.ctol( httpContext.cgiGet( edtUb_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8768Ub_pzs = false ;
      }
      A8769Ub_Dib = httpContext.cgiGet( edtUb_Dib_Internalname) ;
      n8769Ub_Dib = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtUb_Mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtUb_Mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "UB_MTS_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUb_Mts_Internalname ;
         wbErr = true ;
         A9539Ub_Mts = DecimalUtil.ZERO ;
         n9539Ub_Mts = false ;
      }
      else
      {
         A9539Ub_Mts = localUtil.ctond( httpContext.cgiGet( edtUb_Mts_Internalname)) ;
         n9539Ub_Mts = false ;
      }
      A11700Ub_CodB = httpContext.cgiGet( edtUb_CodB_Internalname) ;
      n11700Ub_CodB = false ;
      GXCCtl = "Z8689Ub_Hdr_" + sGXsfl_45_idx ;
      Z8689Ub_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8690Ub_Hdrr_" + sGXsfl_45_idx ;
      Z8690Ub_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8691Ub_Hdrp_" + sGXsfl_45_idx ;
      Z8691Ub_Hdrp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8763Ub_Ped_" + sGXsfl_45_idx ;
      Z8763Ub_Ped = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8764Ub_Art_" + sGXsfl_45_idx ;
      Z8764Ub_Art = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8765Ub_ColN_" + sGXsfl_45_idx ;
      Z8765Ub_ColN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8766Ub_ColNn_" + sGXsfl_45_idx ;
      Z8766Ub_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8767Ub_Kgs_" + sGXsfl_45_idx ;
      Z8767Ub_Kgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8768Ub_pzs_" + sGXsfl_45_idx ;
      Z8768Ub_pzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8769Ub_Dib_" + sGXsfl_45_idx ;
      Z8769Ub_Dib = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9539Ub_Mts_" + sGXsfl_45_idx ;
      Z9539Ub_Mts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11700Ub_CodB_" + sGXsfl_45_idx ;
      Z11700Ub_CodB = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1187_" + sGXsfl_45_idx ;
      nRcdDeleted_1187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1187_" + sGXsfl_45_idx ;
      nRcdExists_1187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1187_" + sGXsfl_45_idx ;
      nIsMod_1187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtUb_Hdrp_Enabled = edtUb_Hdrp_Enabled ;
      defedtUb_Hdrr_Enabled = edtUb_Hdrr_Enabled ;
      defedtUb_Hdr_Enabled = edtUb_Hdr_Enabled ;
   }

   public void confirmValues12L0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451187( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451187( ) ;
         httpContext.changePostValue( "Z8689Ub_Hdr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8689Ub_Hdr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8689Ub_Hdr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8690Ub_Hdrr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8690Ub_Hdrr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8690Ub_Hdrr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8691Ub_Hdrp_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8691Ub_Hdrp_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8691Ub_Hdrp_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8763Ub_Ped_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8763Ub_Ped_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8763Ub_Ped_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8764Ub_Art_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8764Ub_Art_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8764Ub_Art_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8765Ub_ColN_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8765Ub_ColN_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8765Ub_ColN_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8766Ub_ColNn_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8766Ub_ColNn_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8766Ub_ColNn_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8767Ub_Kgs_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8767Ub_Kgs_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8767Ub_Kgs_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8768Ub_pzs_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8768Ub_pzs_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8768Ub_pzs_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z8769Ub_Dib_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z8769Ub_Dib_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8769Ub_Dib_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z9539Ub_Mts_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z9539Ub_Mts_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9539Ub_Mts_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z11700Ub_CodB_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11700Ub_CodB_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11700Ub_CodB_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubicad", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A8688Ub_CodUb)),GXutil.URLEncode(GXutil.ltrimstr(A8686Ub_CodZ,4,0))}, new String[] {"EmprCod","Ub_CodUb","Ub_CodZ"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8688Ub_CodUb", GXutil.rtrim( Z8688Ub_CodUb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8686Ub_CodZ", GXutil.ltrim( localUtil.ntoc( Z8686Ub_CodZ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tubicad", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A8688Ub_CodUb)),GXutil.URLEncode(GXutil.ltrimstr(A8686Ub_CodZ,4,0))}, new String[] {"EmprCod","Ub_CodUb","Ub_CodZ"})  ;
   }

   public String getPgmname( )
   {
      return "TUBICAd" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONTROL OT/OE EN UBICACIONES", "") ;
   }

   public void initializeNonKey12L1186( )
   {
   }

   public void initAll12L1186( )
   {
      initializeNonKey12L1186( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey12L1187( )
   {
      A8763Ub_Ped = "" ;
      n8763Ub_Ped = false ;
      A8764Ub_Art = "" ;
      n8764Ub_Art = false ;
      A8765Ub_ColN = "" ;
      n8765Ub_ColN = false ;
      A8766Ub_ColNn = 0 ;
      n8766Ub_ColNn = false ;
      A8767Ub_Kgs = DecimalUtil.ZERO ;
      n8767Ub_Kgs = false ;
      A8768Ub_pzs = 0 ;
      n8768Ub_pzs = false ;
      A8769Ub_Dib = "" ;
      n8769Ub_Dib = false ;
      A9539Ub_Mts = DecimalUtil.ZERO ;
      n9539Ub_Mts = false ;
      A11700Ub_CodB = "" ;
      n11700Ub_CodB = false ;
      Z8763Ub_Ped = "" ;
      Z8764Ub_Art = "" ;
      Z8765Ub_ColN = "" ;
      Z8766Ub_ColNn = 0 ;
      Z8767Ub_Kgs = DecimalUtil.ZERO ;
      Z8768Ub_pzs = 0 ;
      Z8769Ub_Dib = "" ;
      Z9539Ub_Mts = DecimalUtil.ZERO ;
      Z11700Ub_CodB = "" ;
   }

   public void initAll12L1187( )
   {
      A8689Ub_Hdr = 0 ;
      A8690Ub_Hdrr = (byte)(0) ;
      A8691Ub_Hdrp = "" ;
      initializeNonKey12L1187( ) ;
   }

   public void standaloneModalInsert12L1187( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241535415", true, true);
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
      httpContext.AddJavascriptSource("tubicad.js", "?20268241535415", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1187( )
   {
      edtUb_Hdrp_Enabled = defedtUb_Hdrp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Hdrr_Enabled = defedtUb_Hdrr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdrr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtUb_Hdr_Enabled = defedtUb_Hdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtUb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUb_Hdr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1187, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1187_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8689Ub_Hdr, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8690Ub_Hdrr, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8691Ub_Hdrp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Hdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8763Ub_Ped));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8764Ub_Art));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8765Ub_ColN));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8766Ub_ColNn, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_ColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8767Ub_Kgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8768Ub_pzs, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8769Ub_Dib));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9539Ub_Mts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_Mts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11700Ub_CodB));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUb_CodB_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtUb_CodUb_Internalname = "UB_CODUB" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtUb_CodZ_Internalname = "UB_CODZ" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtUb_DscZ_Internalname = "UB_DSCZ" ;
      edtavnRcdDeleted_1187_Internalname = "vNRCDDELETED_1187" ;
      edtUb_Hdr_Internalname = "UB_HDR" ;
      edtUb_Hdrr_Internalname = "UB_HDRR" ;
      edtUb_Hdrp_Internalname = "UB_HDRP" ;
      edtUb_Ped_Internalname = "UB_PED" ;
      edtUb_Art_Internalname = "UB_ART" ;
      edtUb_ColN_Internalname = "UB_COLN" ;
      edtUb_ColNn_Internalname = "UB_COLNN" ;
      edtUb_Kgs_Internalname = "UB_KGS" ;
      edtUb_pzs_Internalname = "UB_PZS" ;
      edtUb_Dib_Internalname = "UB_DIB" ;
      edtUb_Mts_Internalname = "UB_MTS" ;
      edtUb_CodB_Internalname = "UB_CODB" ;
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
      Form.setCaption( httpContext.getMessage( "CONTROL OT/OE EN UBICACIONES", "") );
      edtUb_CodB_Jsonclick = "" ;
      edtUb_Mts_Jsonclick = "" ;
      edtUb_Dib_Jsonclick = "" ;
      edtUb_pzs_Jsonclick = "" ;
      edtUb_Kgs_Jsonclick = "" ;
      edtUb_ColNn_Jsonclick = "" ;
      edtUb_ColN_Jsonclick = "" ;
      edtUb_Art_Jsonclick = "" ;
      edtUb_Ped_Jsonclick = "" ;
      edtUb_Hdrp_Jsonclick = "" ;
      edtUb_Hdrr_Jsonclick = "" ;
      edtUb_Hdr_Jsonclick = "" ;
      edtavnRcdDeleted_1187_Jsonclick = "" ;
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
      edtUb_CodB_Enabled = 1 ;
      edtUb_Mts_Enabled = 1 ;
      edtUb_Dib_Enabled = 1 ;
      edtUb_pzs_Enabled = 1 ;
      edtUb_Kgs_Enabled = 1 ;
      edtUb_ColNn_Enabled = 1 ;
      edtUb_ColN_Enabled = 1 ;
      edtUb_Art_Enabled = 1 ;
      edtUb_Ped_Enabled = 1 ;
      edtUb_Hdrp_Enabled = 1 ;
      edtUb_Hdrr_Enabled = 1 ;
      edtUb_Hdr_Enabled = 1 ;
      edtavnRcdDeleted_1187_Enabled = 1 ;
      edtUb_DscZ_Jsonclick = "" ;
      edtUb_DscZ_Backcolor = (int)(0xFFFFFF) ;
      edtUb_DscZ_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtUb_CodZ_Jsonclick = "" ;
      edtUb_CodZ_Backcolor = (int)(0xFFFFFF) ;
      edtUb_CodZ_Enabled = 0 ;
      edtUb_CodUb_Jsonclick = "" ;
      edtUb_CodUb_Backcolor = (int)(0xFFFFFF) ;
      edtUb_CodUb_Enabled = 0 ;
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
      subsflControlProps_451187( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal12L1187( ) ;
         standaloneModal12L1187( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow12L1187( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451187( ) ;
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
      /* Using cursor T012L21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012L21_A407EmprNom[0] ;
      n407EmprNom = T012L21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T012L22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A8686Ub_CodZ)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UB_CODZ");
         AnyError = (short)(1) ;
      }
      A8687Ub_DscZ = T012L22_A8687Ub_DscZ[0] ;
      n8687Ub_DscZ = T012L22_n8687Ub_DscZ[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8687Ub_DscZ", A8687Ub_DscZ);
      pr_default.close(20);
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

   public void valid_Ub_codz( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8687Ub_DscZ", GXutil.rtrim( A8687Ub_DscZ));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8688Ub_CodUb", GXutil.rtrim( Z8688Ub_CodUb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8686Ub_CodZ", GXutil.ltrim( localUtil.ntoc( Z8686Ub_CodZ, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8687Ub_DscZ", GXutil.rtrim( Z8687Ub_DscZ));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8688Ub_CodUb',fld:'UB_CODUB',pic:''},{av:'A8686Ub_CodZ',fld:'UB_CODZ',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_UB_CODUB","{handler:'valid_Ub_codub',iparms:[]");
      setEventMetadata("VALID_UB_CODUB",",oparms:[]}");
      setEventMetadata("VALID_UB_CODZ","{handler:'valid_Ub_codz',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8688Ub_CodUb',fld:'UB_CODUB',pic:''},{av:'A8686Ub_CodZ',fld:'UB_CODZ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_UB_CODZ",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8687Ub_DscZ',fld:'UB_DSCZ',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8688Ub_CodUb'},{av:'Z8686Ub_CodZ'},{av:'Z407EmprNom'},{av:'Z8687Ub_DscZ'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_UB_HDR","{handler:'valid_Ub_hdr',iparms:[]");
      setEventMetadata("VALID_UB_HDR",",oparms:[]}");
      setEventMetadata("VALID_UB_HDRR","{handler:'valid_Ub_hdrr',iparms:[]");
      setEventMetadata("VALID_UB_HDRR",",oparms:[]}");
      setEventMetadata("VALID_UB_HDRP","{handler:'valid_Ub_hdrp',iparms:[]");
      setEventMetadata("VALID_UB_HDRP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ub_codb',iparms:[]");
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
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA8688Ub_CodUb = "" ;
      Z396EmprCod = "" ;
      Z8688Ub_CodUb = "" ;
      Z8691Ub_Hdrp = "" ;
      Z8763Ub_Ped = "" ;
      Z8764Ub_Art = "" ;
      Z8765Ub_ColN = "" ;
      Z8767Ub_Kgs = DecimalUtil.ZERO ;
      Z8769Ub_Dib = "" ;
      Z9539Ub_Mts = DecimalUtil.ZERO ;
      Z11700Ub_CodB = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A8688Ub_CodUb = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      A8687Ub_DscZ = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1187 = "" ;
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
      sMode1186 = "" ;
      GXCCtl = "" ;
      A8691Ub_Hdrp = "" ;
      A8763Ub_Ped = "" ;
      A8764Ub_Art = "" ;
      A8765Ub_ColN = "" ;
      A8767Ub_Kgs = DecimalUtil.ZERO ;
      A8769Ub_Dib = "" ;
      A9539Ub_Mts = DecimalUtil.ZERO ;
      A11700Ub_CodB = "" ;
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
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z8687Ub_DscZ = "" ;
      T012L6_A407EmprNom = new String[] {""} ;
      T012L6_n407EmprNom = new boolean[] {false} ;
      T012L7_A8687Ub_DscZ = new String[] {""} ;
      T012L7_n8687Ub_DscZ = new boolean[] {false} ;
      T012L8_A8688Ub_CodUb = new String[] {""} ;
      T012L8_A407EmprNom = new String[] {""} ;
      T012L8_n407EmprNom = new boolean[] {false} ;
      T012L8_A8687Ub_DscZ = new String[] {""} ;
      T012L8_n8687Ub_DscZ = new boolean[] {false} ;
      T012L8_A396EmprCod = new String[] {""} ;
      T012L8_A8686Ub_CodZ = new short[1] ;
      T012L9_A396EmprCod = new String[] {""} ;
      T012L9_A8688Ub_CodUb = new String[] {""} ;
      T012L9_A8686Ub_CodZ = new short[1] ;
      T012L5_A8688Ub_CodUb = new String[] {""} ;
      T012L5_A396EmprCod = new String[] {""} ;
      T012L5_A8686Ub_CodZ = new short[1] ;
      T012L10_A396EmprCod = new String[] {""} ;
      T012L10_A8688Ub_CodUb = new String[] {""} ;
      T012L10_A8686Ub_CodZ = new short[1] ;
      T012L11_A396EmprCod = new String[] {""} ;
      T012L11_A8688Ub_CodUb = new String[] {""} ;
      T012L11_A8686Ub_CodZ = new short[1] ;
      T012L4_A8688Ub_CodUb = new String[] {""} ;
      T012L4_A396EmprCod = new String[] {""} ;
      T012L4_A8686Ub_CodZ = new short[1] ;
      T012L14_A396EmprCod = new String[] {""} ;
      T012L14_A8688Ub_CodUb = new String[] {""} ;
      T012L14_A8686Ub_CodZ = new short[1] ;
      T012L15_A396EmprCod = new String[] {""} ;
      T012L15_A8688Ub_CodUb = new String[] {""} ;
      T012L15_A8686Ub_CodZ = new short[1] ;
      T012L15_A8689Ub_Hdr = new int[1] ;
      T012L15_A8690Ub_Hdrr = new byte[1] ;
      T012L15_A8691Ub_Hdrp = new String[] {""} ;
      T012L15_A8763Ub_Ped = new String[] {""} ;
      T012L15_n8763Ub_Ped = new boolean[] {false} ;
      T012L15_A8764Ub_Art = new String[] {""} ;
      T012L15_n8764Ub_Art = new boolean[] {false} ;
      T012L15_A8765Ub_ColN = new String[] {""} ;
      T012L15_n8765Ub_ColN = new boolean[] {false} ;
      T012L15_A8766Ub_ColNn = new int[1] ;
      T012L15_n8766Ub_ColNn = new boolean[] {false} ;
      T012L15_A8767Ub_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L15_n8767Ub_Kgs = new boolean[] {false} ;
      T012L15_A8768Ub_pzs = new int[1] ;
      T012L15_n8768Ub_pzs = new boolean[] {false} ;
      T012L15_A8769Ub_Dib = new String[] {""} ;
      T012L15_n8769Ub_Dib = new boolean[] {false} ;
      T012L15_A9539Ub_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L15_n9539Ub_Mts = new boolean[] {false} ;
      T012L15_A11700Ub_CodB = new String[] {""} ;
      T012L15_n11700Ub_CodB = new boolean[] {false} ;
      T012L16_A396EmprCod = new String[] {""} ;
      T012L16_A8688Ub_CodUb = new String[] {""} ;
      T012L16_A8686Ub_CodZ = new short[1] ;
      T012L16_A8689Ub_Hdr = new int[1] ;
      T012L16_A8690Ub_Hdrr = new byte[1] ;
      T012L16_A8691Ub_Hdrp = new String[] {""} ;
      T012L3_A396EmprCod = new String[] {""} ;
      T012L3_A8688Ub_CodUb = new String[] {""} ;
      T012L3_A8686Ub_CodZ = new short[1] ;
      T012L3_A8689Ub_Hdr = new int[1] ;
      T012L3_A8690Ub_Hdrr = new byte[1] ;
      T012L3_A8691Ub_Hdrp = new String[] {""} ;
      T012L3_A8763Ub_Ped = new String[] {""} ;
      T012L3_n8763Ub_Ped = new boolean[] {false} ;
      T012L3_A8764Ub_Art = new String[] {""} ;
      T012L3_n8764Ub_Art = new boolean[] {false} ;
      T012L3_A8765Ub_ColN = new String[] {""} ;
      T012L3_n8765Ub_ColN = new boolean[] {false} ;
      T012L3_A8766Ub_ColNn = new int[1] ;
      T012L3_n8766Ub_ColNn = new boolean[] {false} ;
      T012L3_A8767Ub_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L3_n8767Ub_Kgs = new boolean[] {false} ;
      T012L3_A8768Ub_pzs = new int[1] ;
      T012L3_n8768Ub_pzs = new boolean[] {false} ;
      T012L3_A8769Ub_Dib = new String[] {""} ;
      T012L3_n8769Ub_Dib = new boolean[] {false} ;
      T012L3_A9539Ub_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L3_n9539Ub_Mts = new boolean[] {false} ;
      T012L3_A11700Ub_CodB = new String[] {""} ;
      T012L3_n11700Ub_CodB = new boolean[] {false} ;
      T012L2_A396EmprCod = new String[] {""} ;
      T012L2_A8688Ub_CodUb = new String[] {""} ;
      T012L2_A8686Ub_CodZ = new short[1] ;
      T012L2_A8689Ub_Hdr = new int[1] ;
      T012L2_A8690Ub_Hdrr = new byte[1] ;
      T012L2_A8691Ub_Hdrp = new String[] {""} ;
      T012L2_A8763Ub_Ped = new String[] {""} ;
      T012L2_n8763Ub_Ped = new boolean[] {false} ;
      T012L2_A8764Ub_Art = new String[] {""} ;
      T012L2_n8764Ub_Art = new boolean[] {false} ;
      T012L2_A8765Ub_ColN = new String[] {""} ;
      T012L2_n8765Ub_ColN = new boolean[] {false} ;
      T012L2_A8766Ub_ColNn = new int[1] ;
      T012L2_n8766Ub_ColNn = new boolean[] {false} ;
      T012L2_A8767Ub_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L2_n8767Ub_Kgs = new boolean[] {false} ;
      T012L2_A8768Ub_pzs = new int[1] ;
      T012L2_n8768Ub_pzs = new boolean[] {false} ;
      T012L2_A8769Ub_Dib = new String[] {""} ;
      T012L2_n8769Ub_Dib = new boolean[] {false} ;
      T012L2_A9539Ub_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012L2_n9539Ub_Mts = new boolean[] {false} ;
      T012L2_A11700Ub_CodB = new String[] {""} ;
      T012L2_n11700Ub_CodB = new boolean[] {false} ;
      T012L20_A396EmprCod = new String[] {""} ;
      T012L20_A8688Ub_CodUb = new String[] {""} ;
      T012L20_A8686Ub_CodZ = new short[1] ;
      T012L20_A8689Ub_Hdr = new int[1] ;
      T012L20_A8690Ub_Hdrr = new byte[1] ;
      T012L20_A8691Ub_Hdrp = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T012L21_A407EmprNom = new String[] {""} ;
      T012L21_n407EmprNom = new boolean[] {false} ;
      T012L22_A8687Ub_DscZ = new String[] {""} ;
      T012L22_n8687Ub_DscZ = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ8688Ub_CodUb = "" ;
      ZZ407EmprNom = "" ;
      ZZ8687Ub_DscZ = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubicad__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubicad__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubicad__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubicad__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubicad__default(),
         new Object[] {
             new Object[] {
            T012L2_A396EmprCod, T012L2_A8688Ub_CodUb, T012L2_A8686Ub_CodZ, T012L2_A8689Ub_Hdr, T012L2_A8690Ub_Hdrr, T012L2_A8691Ub_Hdrp, T012L2_A8763Ub_Ped, T012L2_n8763Ub_Ped, T012L2_A8764Ub_Art, T012L2_n8764Ub_Art,
            T012L2_A8765Ub_ColN, T012L2_n8765Ub_ColN, T012L2_A8766Ub_ColNn, T012L2_n8766Ub_ColNn, T012L2_A8767Ub_Kgs, T012L2_n8767Ub_Kgs, T012L2_A8768Ub_pzs, T012L2_n8768Ub_pzs, T012L2_A8769Ub_Dib, T012L2_n8769Ub_Dib,
            T012L2_A9539Ub_Mts, T012L2_n9539Ub_Mts, T012L2_A11700Ub_CodB, T012L2_n11700Ub_CodB
            }
            , new Object[] {
            T012L3_A396EmprCod, T012L3_A8688Ub_CodUb, T012L3_A8686Ub_CodZ, T012L3_A8689Ub_Hdr, T012L3_A8690Ub_Hdrr, T012L3_A8691Ub_Hdrp, T012L3_A8763Ub_Ped, T012L3_n8763Ub_Ped, T012L3_A8764Ub_Art, T012L3_n8764Ub_Art,
            T012L3_A8765Ub_ColN, T012L3_n8765Ub_ColN, T012L3_A8766Ub_ColNn, T012L3_n8766Ub_ColNn, T012L3_A8767Ub_Kgs, T012L3_n8767Ub_Kgs, T012L3_A8768Ub_pzs, T012L3_n8768Ub_pzs, T012L3_A8769Ub_Dib, T012L3_n8769Ub_Dib,
            T012L3_A9539Ub_Mts, T012L3_n9539Ub_Mts, T012L3_A11700Ub_CodB, T012L3_n11700Ub_CodB
            }
            , new Object[] {
            T012L4_A8688Ub_CodUb, T012L4_A396EmprCod, T012L4_A8686Ub_CodZ
            }
            , new Object[] {
            T012L5_A8688Ub_CodUb, T012L5_A396EmprCod, T012L5_A8686Ub_CodZ
            }
            , new Object[] {
            T012L6_A407EmprNom, T012L6_n407EmprNom
            }
            , new Object[] {
            T012L7_A8687Ub_DscZ, T012L7_n8687Ub_DscZ
            }
            , new Object[] {
            T012L8_A8688Ub_CodUb, T012L8_A407EmprNom, T012L8_n407EmprNom, T012L8_A8687Ub_DscZ, T012L8_n8687Ub_DscZ, T012L8_A396EmprCod, T012L8_A8686Ub_CodZ
            }
            , new Object[] {
            T012L9_A396EmprCod, T012L9_A8688Ub_CodUb, T012L9_A8686Ub_CodZ
            }
            , new Object[] {
            T012L10_A396EmprCod, T012L10_A8688Ub_CodUb, T012L10_A8686Ub_CodZ
            }
            , new Object[] {
            T012L11_A396EmprCod, T012L11_A8688Ub_CodUb, T012L11_A8686Ub_CodZ
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012L14_A396EmprCod, T012L14_A8688Ub_CodUb, T012L14_A8686Ub_CodZ
            }
            , new Object[] {
            T012L15_A396EmprCod, T012L15_A8688Ub_CodUb, T012L15_A8686Ub_CodZ, T012L15_A8689Ub_Hdr, T012L15_A8690Ub_Hdrr, T012L15_A8691Ub_Hdrp, T012L15_A8763Ub_Ped, T012L15_n8763Ub_Ped, T012L15_A8764Ub_Art, T012L15_n8764Ub_Art,
            T012L15_A8765Ub_ColN, T012L15_n8765Ub_ColN, T012L15_A8766Ub_ColNn, T012L15_n8766Ub_ColNn, T012L15_A8767Ub_Kgs, T012L15_n8767Ub_Kgs, T012L15_A8768Ub_pzs, T012L15_n8768Ub_pzs, T012L15_A8769Ub_Dib, T012L15_n8769Ub_Dib,
            T012L15_A9539Ub_Mts, T012L15_n9539Ub_Mts, T012L15_A11700Ub_CodB, T012L15_n11700Ub_CodB
            }
            , new Object[] {
            T012L16_A396EmprCod, T012L16_A8688Ub_CodUb, T012L16_A8686Ub_CodZ, T012L16_A8689Ub_Hdr, T012L16_A8690Ub_Hdrr, T012L16_A8691Ub_Hdrp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012L20_A396EmprCod, T012L20_A8688Ub_CodUb, T012L20_A8686Ub_CodZ, T012L20_A8689Ub_Hdr, T012L20_A8690Ub_Hdrr, T012L20_A8691Ub_Hdrp
            }
            , new Object[] {
            T012L21_A407EmprNom, T012L21_n407EmprNom
            }
            , new Object[] {
            T012L22_A8687Ub_DscZ, T012L22_n8687Ub_DscZ
            }
         }
      );
      Z8686Ub_CodZ = (short)(0) ;
      A8686Ub_CodZ = (short)(0) ;
      Z8688Ub_CodUb = "" ;
      A8688Ub_CodUb = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TUBICAd" ;
   }

   private byte Z8690Ub_Hdrr ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8690Ub_Hdrr ;
   private byte AV32Reg000 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short wcpOA8686Ub_CodZ ;
   private short Z8686Ub_CodZ ;
   private short nRcdDeleted_1187 ;
   private short nRcdExists_1187 ;
   private short nIsMod_1187 ;
   private short A8686Ub_CodZ ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1187 ;
   private short RcdFound1187 ;
   private short nBlankRcdUsr1187 ;
   private short RcdFound1186 ;
   private short nIsDirty_1186 ;
   private short nIsDirty_1187 ;
   private short ZZ8686Ub_CodZ ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z8689Ub_Hdr ;
   private int Z8766Ub_ColNn ;
   private int Z8768Ub_pzs ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtUb_CodUb_Enabled ;
   private int edtUb_CodZ_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtUb_DscZ_Enabled ;
   private int edtavnRcdDeleted_1187_Enabled ;
   private int edtUb_Hdr_Enabled ;
   private int edtUb_Hdrr_Enabled ;
   private int edtUb_Hdrp_Enabled ;
   private int edtUb_Ped_Enabled ;
   private int edtUb_Art_Enabled ;
   private int edtUb_ColN_Enabled ;
   private int edtUb_ColNn_Enabled ;
   private int edtUb_Kgs_Enabled ;
   private int edtUb_pzs_Enabled ;
   private int edtUb_Dib_Enabled ;
   private int edtUb_Mts_Enabled ;
   private int edtUb_CodB_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A8689Ub_Hdr ;
   private int A8766Ub_ColNn ;
   private int A8768Ub_pzs ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtUb_Hdrp_Enabled ;
   private int defedtUb_Hdrr_Enabled ;
   private int defedtUb_Hdr_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtUb_DscZ_Backcolor ;
   private int edtUb_CodZ_Backcolor ;
   private int edtUb_CodUb_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8767Ub_Kgs ;
   private java.math.BigDecimal Z9539Ub_Mts ;
   private java.math.BigDecimal A8767Ub_Kgs ;
   private java.math.BigDecimal A9539Ub_Mts ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA8688Ub_CodUb ;
   private String Z396EmprCod ;
   private String Z8688Ub_CodUb ;
   private String Z8691Ub_Hdrp ;
   private String Z8763Ub_Ped ;
   private String Z8764Ub_Art ;
   private String Z8765Ub_ColN ;
   private String Z8769Ub_Dib ;
   private String Z11700Ub_CodB ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A8688Ub_CodUb ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtUb_CodUb_Internalname ;
   private String edtUb_CodUb_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtUb_CodZ_Internalname ;
   private String edtUb_CodZ_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtUb_DscZ_Internalname ;
   private String A8687Ub_DscZ ;
   private String edtUb_DscZ_Jsonclick ;
   private String sMode1187 ;
   private String edtavnRcdDeleted_1187_Internalname ;
   private String edtUb_Hdr_Internalname ;
   private String edtUb_Hdrr_Internalname ;
   private String edtUb_Hdrp_Internalname ;
   private String edtUb_Ped_Internalname ;
   private String edtUb_Art_Internalname ;
   private String edtUb_ColN_Internalname ;
   private String edtUb_ColNn_Internalname ;
   private String edtUb_Kgs_Internalname ;
   private String edtUb_pzs_Internalname ;
   private String edtUb_Dib_Internalname ;
   private String edtUb_Mts_Internalname ;
   private String edtUb_CodB_Internalname ;
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
   private String sMode1186 ;
   private String GXCCtl ;
   private String A8691Ub_Hdrp ;
   private String A8763Ub_Ped ;
   private String A8764Ub_Art ;
   private String A8765Ub_ColN ;
   private String A8769Ub_Dib ;
   private String A11700Ub_CodB ;
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
   private String Z8687Ub_DscZ ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1187_Jsonclick ;
   private String edtUb_Hdr_Jsonclick ;
   private String edtUb_Hdrr_Jsonclick ;
   private String edtUb_Hdrp_Jsonclick ;
   private String edtUb_Ped_Jsonclick ;
   private String edtUb_Art_Jsonclick ;
   private String edtUb_ColN_Jsonclick ;
   private String edtUb_ColNn_Jsonclick ;
   private String edtUb_Kgs_Jsonclick ;
   private String edtUb_pzs_Jsonclick ;
   private String edtUb_Dib_Jsonclick ;
   private String edtUb_Mts_Jsonclick ;
   private String edtUb_CodB_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ8688Ub_CodUb ;
   private String ZZ407EmprNom ;
   private String ZZ8687Ub_DscZ ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8687Ub_DscZ ;
   private boolean returnInSub ;
   private boolean n8763Ub_Ped ;
   private boolean n8764Ub_Art ;
   private boolean n8765Ub_ColN ;
   private boolean n8766Ub_ColNn ;
   private boolean n8767Ub_Kgs ;
   private boolean n8768Ub_pzs ;
   private boolean n8769Ub_Dib ;
   private boolean n9539Ub_Mts ;
   private boolean n11700Ub_CodB ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T012L6_A407EmprNom ;
   private boolean[] T012L6_n407EmprNom ;
   private String[] T012L7_A8687Ub_DscZ ;
   private boolean[] T012L7_n8687Ub_DscZ ;
   private String[] T012L8_A8688Ub_CodUb ;
   private String[] T012L8_A407EmprNom ;
   private boolean[] T012L8_n407EmprNom ;
   private String[] T012L8_A8687Ub_DscZ ;
   private boolean[] T012L8_n8687Ub_DscZ ;
   private String[] T012L8_A396EmprCod ;
   private short[] T012L8_A8686Ub_CodZ ;
   private String[] T012L9_A396EmprCod ;
   private String[] T012L9_A8688Ub_CodUb ;
   private short[] T012L9_A8686Ub_CodZ ;
   private String[] T012L5_A8688Ub_CodUb ;
   private String[] T012L5_A396EmprCod ;
   private short[] T012L5_A8686Ub_CodZ ;
   private String[] T012L10_A396EmprCod ;
   private String[] T012L10_A8688Ub_CodUb ;
   private short[] T012L10_A8686Ub_CodZ ;
   private String[] T012L11_A396EmprCod ;
   private String[] T012L11_A8688Ub_CodUb ;
   private short[] T012L11_A8686Ub_CodZ ;
   private String[] T012L4_A8688Ub_CodUb ;
   private String[] T012L4_A396EmprCod ;
   private short[] T012L4_A8686Ub_CodZ ;
   private String[] T012L14_A396EmprCod ;
   private String[] T012L14_A8688Ub_CodUb ;
   private short[] T012L14_A8686Ub_CodZ ;
   private String[] T012L15_A396EmprCod ;
   private String[] T012L15_A8688Ub_CodUb ;
   private short[] T012L15_A8686Ub_CodZ ;
   private int[] T012L15_A8689Ub_Hdr ;
   private byte[] T012L15_A8690Ub_Hdrr ;
   private String[] T012L15_A8691Ub_Hdrp ;
   private String[] T012L15_A8763Ub_Ped ;
   private boolean[] T012L15_n8763Ub_Ped ;
   private String[] T012L15_A8764Ub_Art ;
   private boolean[] T012L15_n8764Ub_Art ;
   private String[] T012L15_A8765Ub_ColN ;
   private boolean[] T012L15_n8765Ub_ColN ;
   private int[] T012L15_A8766Ub_ColNn ;
   private boolean[] T012L15_n8766Ub_ColNn ;
   private java.math.BigDecimal[] T012L15_A8767Ub_Kgs ;
   private boolean[] T012L15_n8767Ub_Kgs ;
   private int[] T012L15_A8768Ub_pzs ;
   private boolean[] T012L15_n8768Ub_pzs ;
   private String[] T012L15_A8769Ub_Dib ;
   private boolean[] T012L15_n8769Ub_Dib ;
   private java.math.BigDecimal[] T012L15_A9539Ub_Mts ;
   private boolean[] T012L15_n9539Ub_Mts ;
   private String[] T012L15_A11700Ub_CodB ;
   private boolean[] T012L15_n11700Ub_CodB ;
   private String[] T012L16_A396EmprCod ;
   private String[] T012L16_A8688Ub_CodUb ;
   private short[] T012L16_A8686Ub_CodZ ;
   private int[] T012L16_A8689Ub_Hdr ;
   private byte[] T012L16_A8690Ub_Hdrr ;
   private String[] T012L16_A8691Ub_Hdrp ;
   private String[] T012L3_A396EmprCod ;
   private String[] T012L3_A8688Ub_CodUb ;
   private short[] T012L3_A8686Ub_CodZ ;
   private int[] T012L3_A8689Ub_Hdr ;
   private byte[] T012L3_A8690Ub_Hdrr ;
   private String[] T012L3_A8691Ub_Hdrp ;
   private String[] T012L3_A8763Ub_Ped ;
   private boolean[] T012L3_n8763Ub_Ped ;
   private String[] T012L3_A8764Ub_Art ;
   private boolean[] T012L3_n8764Ub_Art ;
   private String[] T012L3_A8765Ub_ColN ;
   private boolean[] T012L3_n8765Ub_ColN ;
   private int[] T012L3_A8766Ub_ColNn ;
   private boolean[] T012L3_n8766Ub_ColNn ;
   private java.math.BigDecimal[] T012L3_A8767Ub_Kgs ;
   private boolean[] T012L3_n8767Ub_Kgs ;
   private int[] T012L3_A8768Ub_pzs ;
   private boolean[] T012L3_n8768Ub_pzs ;
   private String[] T012L3_A8769Ub_Dib ;
   private boolean[] T012L3_n8769Ub_Dib ;
   private java.math.BigDecimal[] T012L3_A9539Ub_Mts ;
   private boolean[] T012L3_n9539Ub_Mts ;
   private String[] T012L3_A11700Ub_CodB ;
   private boolean[] T012L3_n11700Ub_CodB ;
   private String[] T012L2_A396EmprCod ;
   private String[] T012L2_A8688Ub_CodUb ;
   private short[] T012L2_A8686Ub_CodZ ;
   private int[] T012L2_A8689Ub_Hdr ;
   private byte[] T012L2_A8690Ub_Hdrr ;
   private String[] T012L2_A8691Ub_Hdrp ;
   private String[] T012L2_A8763Ub_Ped ;
   private boolean[] T012L2_n8763Ub_Ped ;
   private String[] T012L2_A8764Ub_Art ;
   private boolean[] T012L2_n8764Ub_Art ;
   private String[] T012L2_A8765Ub_ColN ;
   private boolean[] T012L2_n8765Ub_ColN ;
   private int[] T012L2_A8766Ub_ColNn ;
   private boolean[] T012L2_n8766Ub_ColNn ;
   private java.math.BigDecimal[] T012L2_A8767Ub_Kgs ;
   private boolean[] T012L2_n8767Ub_Kgs ;
   private int[] T012L2_A8768Ub_pzs ;
   private boolean[] T012L2_n8768Ub_pzs ;
   private String[] T012L2_A8769Ub_Dib ;
   private boolean[] T012L2_n8769Ub_Dib ;
   private java.math.BigDecimal[] T012L2_A9539Ub_Mts ;
   private boolean[] T012L2_n9539Ub_Mts ;
   private String[] T012L2_A11700Ub_CodB ;
   private boolean[] T012L2_n11700Ub_CodB ;
   private String[] T012L20_A396EmprCod ;
   private String[] T012L20_A8688Ub_CodUb ;
   private short[] T012L20_A8686Ub_CodZ ;
   private int[] T012L20_A8689Ub_Hdr ;
   private byte[] T012L20_A8690Ub_Hdrr ;
   private String[] T012L20_A8691Ub_Hdrp ;
   private String[] T012L21_A407EmprNom ;
   private boolean[] T012L21_n407EmprNom ;
   private String[] T012L22_A8687Ub_DscZ ;
   private boolean[] T012L22_n8687Ub_DscZ ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubicad__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubicad__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubicad__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubicad__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubicad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012L2", "SELECT EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp, Ub_Ped, Ub_Art, Ub_ColN, Ub_ColNn, Ub_Kgs, Ub_pzs, Ub_Dib, Ub_Mts, Ub_CodB FROM TXPUBICAd WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? AND Ub_Hdr = ? AND Ub_Hdrr = ? AND Ub_Hdrp = ?  FOR UPDATE OF Ub_Ped, Ub_Art, Ub_ColN, Ub_ColNn, Ub_Kgs, Ub_pzs, Ub_Dib, Ub_Mts, Ub_CodB NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012L3", "SELECT EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp, Ub_Ped, Ub_Art, Ub_ColN, Ub_ColNn, Ub_Kgs, Ub_pzs, Ub_Dib, Ub_Mts, Ub_CodB FROM TXPUBICAd WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? AND Ub_Hdr = ? AND Ub_Hdrr = ? AND Ub_Hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012L4", "SELECT Ub_CodUb, EmprCod, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ?  FOR UPDATE OF Ub_CodUb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L5", "SELECT Ub_CodUb, EmprCod, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L7", "SELECT Ub_DscZ FROM TXPZONAS WHERE EmprCod = ? AND Ub_CodZ = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L8", "SELECT /*+ FIRST_ROWS(1) */ TM1.Ub_CodUb, T2.EmprNom, T3.Ub_DscZ, TM1.EmprCod, TM1.Ub_CodZ FROM ((TXPUBICA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPZONAS T3 ON T3.EmprCod = TM1.EmprCod AND T3.Ub_CodZ = TM1.Ub_CodZ) WHERE TM1.EmprCod = ? and TM1.Ub_CodUb = ? and TM1.Ub_CodZ = ? ORDER BY TM1.EmprCod, TM1.Ub_CodUb, TM1.Ub_CodZ ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ub_CodUb, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ub_CodUb, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? and Ub_CodUb = ? and Ub_CodZ = ? ORDER BY EmprCod, Ub_CodUb, Ub_CodZ) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ub_CodUb, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? and Ub_CodUb = ? and Ub_CodZ = ? ORDER BY EmprCod DESC, Ub_CodUb DESC, Ub_CodZ DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012L12", "INSERT INTO TXPUBICA(Ub_CodUb, EmprCod, Ub_CodZ) VALUES(?, ?, ?)", GX_NOMASK, "TXPUBICA")
         ,new UpdateCursor("T012L13", "DELETE FROM TXPUBICA  WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ?", GX_NOMASK, "TXPUBICA")
         ,new ForEachCursor("T012L14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ub_CodUb, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? and Ub_CodUb = ? and Ub_CodZ = ? ORDER BY EmprCod, Ub_CodUb, Ub_CodZ ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L15", "SELECT EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp, Ub_Ped, Ub_Art, Ub_ColN, Ub_ColNn, Ub_Kgs, Ub_pzs, Ub_Dib, Ub_Mts, Ub_CodB FROM TXPUBICAd WHERE EmprCod = ? and Ub_CodUb = ? and Ub_CodZ = ? and Ub_Hdr = ? and Ub_Hdrr = ? and Ub_Hdrp = ? ORDER BY EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012L16", "SELECT EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp FROM TXPUBICAd WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? AND Ub_Hdr = ? AND Ub_Hdrr = ? AND Ub_Hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T012L17", "INSERT INTO TXPUBICAd(EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp, Ub_Ped, Ub_Art, Ub_ColN, Ub_ColNn, Ub_Kgs, Ub_pzs, Ub_Dib, Ub_Mts, Ub_CodB) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBICAd")
         ,new UpdateCursor("T012L18", "UPDATE TXPUBICAd SET Ub_Ped=?, Ub_Art=?, Ub_ColN=?, Ub_ColNn=?, Ub_Kgs=?, Ub_pzs=?, Ub_Dib=?, Ub_Mts=?, Ub_CodB=?  WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? AND Ub_Hdr = ? AND Ub_Hdrr = ? AND Ub_Hdrp = ?", GX_NOMASK, "TXPUBICAd")
         ,new UpdateCursor("T012L19", "DELETE FROM TXPUBICAd  WHERE EmprCod = ? AND Ub_CodUb = ? AND Ub_CodZ = ? AND Ub_Hdr = ? AND Ub_Hdrr = ? AND Ub_Hdrp = ?", GX_NOMASK, "TXPUBICAd")
         ,new ForEachCursor("T012L20", "SELECT EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp FROM TXPUBICAd WHERE EmprCod = ? and Ub_CodUb = ? and Ub_CodZ = ? ORDER BY EmprCod, Ub_CodUb, Ub_CodZ, Ub_Hdr, Ub_Hdrr, Ub_Hdrp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012L21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012L22", "SELECT Ub_DscZ FROM TXPZONAS WHERE EmprCod = ? AND Ub_CodZ = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[23], 20);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 13);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 20);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setString(11, (String)parms[19], 10);
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               stmt.setInt(13, ((Number) parms[21]).intValue());
               stmt.setByte(14, ((Number) parms[22]).byteValue());
               stmt.setString(15, (String)parms[23], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

