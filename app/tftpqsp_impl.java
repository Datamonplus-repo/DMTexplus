package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tftpqsp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"FT_PRGD1") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6384Ft_PrgC1 = (int)(GXutil.lval( httpContext.GetPar( "Ft_PrgC1"))) ;
         n6384Ft_PrgC1 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaft_prgd11ER1553( A396EmprCod, A6384Ft_PrgC1) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"FT_PRGD2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6386Ft_PrgC2 = (int)(GXutil.lval( httpContext.GetPar( "Ft_PrgC2"))) ;
         n6386Ft_PrgC2 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaft_prgd21ER1553( A396EmprCod, A6386Ft_PrgC2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"FT_PRGD3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6388Ft_PrgC3 = (int)(GXutil.lval( httpContext.GetPar( "Ft_PrgC3"))) ;
         n6388Ft_PrgC3 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaft_prgd31ER1553( A396EmprCod, A6388Ft_PrgC3) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6037Mq_Grupo = (byte)(GXutil.lval( httpContext.GetPar( "Mq_Grupo"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A6037Mq_Grupo) ;
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
            A6380Ft_procod = httpContext.GetPar( "Ft_procod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FICHA TECNICA PQ, PROGRAMAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFt_ProDsc_Internalname ;
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

   public tftpqsp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tftpqsp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tftpqsp_impl.class ));
   }

   public tftpqsp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFTPQSP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_procod_Internalname, GXutil.rtrim( A6380Ft_procod), GXutil.rtrim( localUtil.format( A6380Ft_procod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_procod_Jsonclick, 0, "", "", "", "", "", 1, edtFt_procod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ft ProDsc", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_ProDsc_Internalname, GXutil.rtrim( A6381Ft_ProDsc), GXutil.rtrim( localUtil.format( A6381Ft_ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_ProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFt_ProDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQSP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQSP.htm");
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
         nBlankRcdCount1553 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1553 = (short)(1) ;
            scanStart1ER1553( ) ;
            while ( RcdFound1553 != 0 )
            {
               init_level_properties1553( ) ;
               getByPrimaryKey1ER1553( ) ;
               addRow1ER1553( ) ;
               scanNext1ER1553( ) ;
            }
            scanEnd1ER1553( ) ;
            nBlankRcdCount1553 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1ER1553( ) ;
         standaloneModal1ER1553( ) ;
         sMode1553 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1ER1553( ) ;
            edtavnRcdDeleted_1553_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1553_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1553_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1553_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMq_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_GRUPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMq_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DESC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Desc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgC1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgD1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgC2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgD2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgC3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFt_PrgD3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1553 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1ER1553( ) ;
            }
            sendRow1ER1553( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1553 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1553 = (short)(5) ;
         nRcdExists_1553 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1ER1553( ) ;
            while ( RcdFound1553 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401553( ) ;
               init_level_properties1553( ) ;
               standaloneNotModal1ER1553( ) ;
               getByPrimaryKey1ER1553( ) ;
               standaloneModal1ER1553( ) ;
               addRow1ER1553( ) ;
               scanNext1ER1553( ) ;
            }
            scanEnd1ER1553( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1553 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401553( ) ;
      initAll1ER1553( ) ;
      init_level_properties1553( ) ;
      nRcdExists_1553 = (short)(0) ;
      nIsMod_1553 = (short)(0) ;
      nRcdDeleted_1553 = (short)(0) ;
      nBlankRcdCount1553 = (short)(nBlankRcdUsr1553+nBlankRcdCount1553) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1553 > 0 )
      {
         standaloneNotModal1ER1553( ) ;
         standaloneModal1ER1553( ) ;
         addRow1ER1553( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMq_Grupo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1553 = (short)(nBlankRcdCount1553-1) ;
      }
      Gx_mode = sMode1553 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQSP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFTPQSP.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z6380Ft_procod = httpContext.cgiGet( "Z6380Ft_procod") ;
         Z6381Ft_ProDsc = httpContext.cgiGet( "Z6381Ft_ProDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6380Ft_procod = httpContext.cgiGet( edtFt_procod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
         A6381Ft_ProDsc = httpContext.cgiGet( edtFt_ProDsc_Internalname) ;
         n6381Ft_ProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A6380Ft_procod = httpContext.GetPar( "Ft_procod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1ER1551( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1553_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1553_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1ER1551( ) ;
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

   public void confirm_1ER0( )
   {
      beforeValidate1ER1551( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1ER1551( ) ;
         }
         else
         {
            checkExtendedTable1ER1551( ) ;
            if ( AnyError == 0 )
            {
               zm1ER1551( 5) ;
            }
            closeExtendedTableCursors1ER1551( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1551 = Gx_mode ;
         confirm_1ER1553( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1551 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1ER0( ) ;
      }
   }

   public void confirm_1ER1553( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1ER1553( ) ;
         if ( ( nRcdExists_1553 != 0 ) || ( nIsMod_1553 != 0 ) )
         {
            getKey1ER1553( ) ;
            if ( ( nRcdExists_1553 == 0 ) && ( nRcdDeleted_1553 == 0 ) )
            {
               if ( RcdFound1553 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1ER1553( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1ER1553( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1ER1553( 7) ;
                     }
                     closeExtendedTableCursors1ER1553( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMq_Grupo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1553 != 0 )
               {
                  if ( nRcdDeleted_1553 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1ER1553( ) ;
                     load1ER1553( ) ;
                     beforeValidate1ER1553( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1ER1553( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1553 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1ER1553( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1ER1553( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1ER1553( 7) ;
                           }
                           closeExtendedTableCursors1ER1553( ) ;
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
                  if ( nRcdDeleted_1553 == 0 )
                  {
                     GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_Grupo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1553_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Desc_Internalname, GXutil.rtrim( A6038Mq_Desc)) ;
         httpContext.changePostValue( edtFt_PrgC1_Internalname, GXutil.ltrim( localUtil.ntoc( A6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD1_Internalname, GXutil.rtrim( A6385Ft_PrgD1)) ;
         httpContext.changePostValue( edtFt_PrgC2_Internalname, GXutil.ltrim( localUtil.ntoc( A6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD2_Internalname, GXutil.rtrim( A6387Ft_PrgD2)) ;
         httpContext.changePostValue( edtFt_PrgC3_Internalname, GXutil.ltrim( localUtil.ntoc( A6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD3_Internalname, GXutil.rtrim( A6389Ft_PrgD3)) ;
         httpContext.changePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6384Ft_PrgC1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6386Ft_PrgC2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6388Ft_PrgC3_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1553 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1553_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1553_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_GRUPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1ER0( )
   {
   }

   public void zm1ER1551( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6381Ft_ProDsc = T01ER6_A6381Ft_ProDsc[0] ;
         }
         else
         {
            Z6381Ft_ProDsc = A6381Ft_ProDsc ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z6380Ft_procod = A6380Ft_procod ;
         Z6381Ft_ProDsc = A6381Ft_ProDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01ER7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ER7_A407EmprNom[0] ;
      n407EmprNom = T01ER7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load1ER1551( )
   {
      /* Using cursor T01ER8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1551 = (short)(1) ;
         A6381Ft_ProDsc = T01ER8_A6381Ft_ProDsc[0] ;
         n6381Ft_ProDsc = T01ER8_n6381Ft_ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         A407EmprNom = T01ER8_A407EmprNom[0] ;
         n407EmprNom = T01ER8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1ER1551( -4) ;
      }
      pr_default.close(6);
      onLoadActions1ER1551( ) ;
   }

   public void onLoadActions1ER1551( )
   {
   }

   public void checkExtendedTable1ER1551( )
   {
      nIsDirty_1551 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1ER1551( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1ER1551( )
   {
      /* Using cursor T01ER9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1551 = (short)(1) ;
      }
      else
      {
         RcdFound1551 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01ER6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01ER6_A6380Ft_procod[0], A6380Ft_procod) == 0 ) && ( GXutil.strcmp(T01ER6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1ER1551( 4) ;
         RcdFound1551 = (short)(1) ;
         A6381Ft_ProDsc = T01ER6_A6381Ft_ProDsc[0] ;
         n6381Ft_ProDsc = T01ER6_n6381Ft_ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         Z396EmprCod = A396EmprCod ;
         Z6380Ft_procod = A6380Ft_procod ;
         sMode1551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1ER1551( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1551 = (short)(0) ;
            initializeNonKey1ER1551( ) ;
         }
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1551 = (short)(0) ;
         initializeNonKey1ER1551( ) ;
         sMode1551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1ER1551( ) ;
      if ( RcdFound1551 == 0 )
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
      RcdFound1551 = (short)(0) ;
      /* Using cursor T01ER10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01ER10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01ER10_A6380Ft_procod[0], A6380Ft_procod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01ER10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01ER10_A6380Ft_procod[0], A6380Ft_procod) == 0 ) )
         {
            RcdFound1551 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1551 = (short)(0) ;
      /* Using cursor T01ER11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01ER11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01ER11_A6380Ft_procod[0], A6380Ft_procod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01ER11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01ER11_A6380Ft_procod[0], A6380Ft_procod) == 0 ) )
         {
            RcdFound1551 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1ER1551( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFt_ProDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1ER1551( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1551 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
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
               GX_FocusControl = edtFt_ProDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1ER1551( ) ;
               GX_FocusControl = edtFt_ProDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFt_ProDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1ER1551( ) ;
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
                  GX_FocusControl = edtFt_ProDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1ER1551( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
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
         GX_FocusControl = edtFt_ProDsc_Internalname ;
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
      getKey1ER1551( ) ;
      if ( RcdFound1551 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tftpqsp");
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1ER0( ) ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1ER1551( ) ;
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1ER1551( ) ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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
      scanStart1ER1551( ) ;
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1551 != 0 )
         {
            scanNext1ER1551( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1ER1551( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1ER1551( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ER5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A6380Ft_procod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z6381Ft_ProDsc, T01ER5_A6381Ft_ProDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6381Ft_ProDsc, T01ER5_A6381Ft_ProDsc[0]) != 0 )
            {
               GXutil.writeLogln("tftpqsp:[seudo value changed for attri]"+"Ft_ProDsc");
               GXutil.writeLogRaw("Old: ",Z6381Ft_ProDsc);
               GXutil.writeLogRaw("Current: ",T01ER5_A6381Ft_ProDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFTPQS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ER1551( )
   {
      beforeValidate1ER1551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ER1551( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ER1551( 0) ;
         checkOptimisticConcurrency1ER1551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ER1551( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ER1551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ER12 */
                  pr_default.execute(10, new Object[] {A6380Ft_procod, Boolean.valueOf(n6381Ft_ProDsc), A6381Ft_ProDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
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
                        processLevel1ER1551( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1ER0( ) ;
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
            load1ER1551( ) ;
         }
         endLevel1ER1551( ) ;
      }
      closeExtendedTableCursors1ER1551( ) ;
   }

   public void update1ER1551( )
   {
      beforeValidate1ER1551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ER1551( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ER1551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ER1551( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1ER1551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ER13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n6381Ft_ProDsc), A6381Ft_ProDsc, A396EmprCod, A6380Ft_procod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1ER1551( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1ER1551( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1ER0( ) ;
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
         endLevel1ER1551( ) ;
      }
      closeExtendedTableCursors1ER1551( ) ;
   }

   public void deferredUpdate1ER1551( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ER1551( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ER1551( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ER1551( ) ;
         afterConfirm1ER1551( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ER1551( ) ;
            if ( AnyError == 0 )
            {
               scanStart1ER1553( ) ;
               while ( RcdFound1553 != 0 )
               {
                  getByPrimaryKey1ER1553( ) ;
                  delete1ER1553( ) ;
                  scanNext1ER1553( ) ;
               }
               scanEnd1ER1553( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ER14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A6380Ft_procod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1551 == 0 )
                        {
                           initAll1ER1551( ) ;
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
                        resetCaption1ER0( ) ;
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
      sMode1551 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ER1551( ) ;
      Gx_mode = sMode1551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ER1551( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01ER15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A6380Ft_procod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1ER1553( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1ER1553( ) ;
         if ( ( nRcdExists_1553 != 0 ) || ( nIsMod_1553 != 0 ) )
         {
            standaloneNotModal1ER1553( ) ;
            getKey1ER1553( ) ;
            if ( ( nRcdExists_1553 == 0 ) && ( nRcdDeleted_1553 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1ER1553( ) ;
            }
            else
            {
               if ( RcdFound1553 != 0 )
               {
                  if ( ( nRcdDeleted_1553 != 0 ) && ( nRcdExists_1553 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1ER1553( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1553 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1ER1553( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1553 == 0 )
                  {
                     GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_Grupo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1553_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Desc_Internalname, GXutil.rtrim( A6038Mq_Desc)) ;
         httpContext.changePostValue( edtFt_PrgC1_Internalname, GXutil.ltrim( localUtil.ntoc( A6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD1_Internalname, GXutil.rtrim( A6385Ft_PrgD1)) ;
         httpContext.changePostValue( edtFt_PrgC2_Internalname, GXutil.ltrim( localUtil.ntoc( A6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD2_Internalname, GXutil.rtrim( A6387Ft_PrgD2)) ;
         httpContext.changePostValue( edtFt_PrgC3_Internalname, GXutil.ltrim( localUtil.ntoc( A6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_PrgD3_Internalname, GXutil.rtrim( A6389Ft_PrgD3)) ;
         httpContext.changePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6384Ft_PrgC1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6386Ft_PrgC2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6388Ft_PrgC3_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1553_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1553 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1553_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1553_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_GRUPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGC3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PRGD3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1ER1553( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1553 = (short)(0) ;
      nIsMod_1553 = (short)(0) ;
      nRcdDeleted_1553 = (short)(0) ;
   }

   public void processLevel1ER1551( )
   {
      /* Save parent mode. */
      sMode1551 = Gx_mode ;
      processNestedLevel1ER1553( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1ER1551( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1ER1551( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tftpqsp");
         if ( AnyError == 0 )
         {
            confirmValues1ER0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tftpqsp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1ER1551( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A6380Ft_procod = A6380Ft_procod ;
      /* Scan By routine */
      /* Using cursor T01ER16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A6380Ft_procod});
      RcdFound1551 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1551 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ER1551( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1551 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1551 = (short)(1) ;
      }
   }

   public void scanEnd1ER1551( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1ER1551( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ER1551( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ER1551( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ER1551( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ER1551( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ER1551( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ER1551( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtFt_procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_procod_Enabled), 5, 0), true);
      edtFt_ProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_ProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1ER1553( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6384Ft_PrgC1 = T01ER3_A6384Ft_PrgC1[0] ;
            Z6386Ft_PrgC2 = T01ER3_A6386Ft_PrgC2[0] ;
            Z6388Ft_PrgC3 = T01ER3_A6388Ft_PrgC3[0] ;
         }
         else
         {
            Z6384Ft_PrgC1 = A6384Ft_PrgC1 ;
            Z6386Ft_PrgC2 = A6386Ft_PrgC2 ;
            Z6388Ft_PrgC3 = A6388Ft_PrgC3 ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z6380Ft_procod = A6380Ft_procod ;
         Z6384Ft_PrgC1 = A6384Ft_PrgC1 ;
         Z6386Ft_PrgC2 = A6386Ft_PrgC2 ;
         Z6388Ft_PrgC3 = A6388Ft_PrgC3 ;
         Z396EmprCod = A396EmprCod ;
         Z6037Mq_Grupo = A6037Mq_Grupo ;
         Z6038Mq_Desc = A6038Mq_Desc ;
      }
   }

   public void standaloneNotModal1ER1553( )
   {
   }

   public void standaloneModal1ER1553( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMq_Grupo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMq_Grupo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1ER1553( )
   {
      /* Using cursor T01ER17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1553 = (short)(1) ;
         A6038Mq_Desc = T01ER17_A6038Mq_Desc[0] ;
         n6038Mq_Desc = T01ER17_n6038Mq_Desc[0] ;
         A6384Ft_PrgC1 = T01ER17_A6384Ft_PrgC1[0] ;
         n6384Ft_PrgC1 = T01ER17_n6384Ft_PrgC1[0] ;
         A6386Ft_PrgC2 = T01ER17_A6386Ft_PrgC2[0] ;
         n6386Ft_PrgC2 = T01ER17_n6386Ft_PrgC2[0] ;
         A6388Ft_PrgC3 = T01ER17_A6388Ft_PrgC3[0] ;
         n6388Ft_PrgC3 = T01ER17_n6388Ft_PrgC3[0] ;
         zm1ER1553( -6) ;
      }
      pr_default.close(15);
      onLoadActions1ER1553( ) ;
   }

   public void onLoadActions1ER1553( )
   {
      GXt_char1 = A6385Ft_PrgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6384Ft_PrgC1, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6385Ft_PrgD1 = GXt_char1 ;
      GXt_char1 = A6387Ft_PrgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6386Ft_PrgC2, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6387Ft_PrgD2 = GXt_char1 ;
      GXt_char1 = A6389Ft_PrgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6388Ft_PrgC3, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6389Ft_PrgD3 = GXt_char1 ;
   }

   public void checkExtendedTable1ER1553( )
   {
      nIsDirty_1553 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1ER1553( ) ;
      nIsDirty_1553 = (short)(1) ;
      GXt_char1 = A6385Ft_PrgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6384Ft_PrgC1, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6385Ft_PrgD1 = GXt_char1 ;
      nIsDirty_1553 = (short)(1) ;
      GXt_char1 = A6387Ft_PrgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6386Ft_PrgC2, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6387Ft_PrgD2 = GXt_char1 ;
      nIsDirty_1553 = (short)(1) ;
      GXt_char1 = A6389Ft_PrgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6388Ft_PrgC3, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6389Ft_PrgD3 = GXt_char1 ;
      /* Using cursor T01ER4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6038Mq_Desc = T01ER4_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01ER4_n6038Mq_Desc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1ER1553( )
   {
      pr_default.close(2);
   }

   public void enableDisable1ER1553( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         byte A6037Mq_Grupo )
   {
      /* Using cursor T01ER18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6038Mq_Desc = T01ER18_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01ER18_n6038Mq_Desc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6038Mq_Desc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1ER1553( )
   {
      /* Using cursor T01ER19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1553 = (short)(1) ;
      }
      else
      {
         RcdFound1553 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1ER1553( )
   {
      /* Using cursor T01ER3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01ER3_A6380Ft_procod[0], A6380Ft_procod) == 0 ) && ( GXutil.strcmp(T01ER3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1ER1553( 6) ;
         RcdFound1553 = (short)(1) ;
         initializeNonKey1ER1553( ) ;
         A6384Ft_PrgC1 = T01ER3_A6384Ft_PrgC1[0] ;
         n6384Ft_PrgC1 = T01ER3_n6384Ft_PrgC1[0] ;
         A6386Ft_PrgC2 = T01ER3_A6386Ft_PrgC2[0] ;
         n6386Ft_PrgC2 = T01ER3_n6386Ft_PrgC2[0] ;
         A6388Ft_PrgC3 = T01ER3_A6388Ft_PrgC3[0] ;
         n6388Ft_PrgC3 = T01ER3_n6388Ft_PrgC3[0] ;
         A6037Mq_Grupo = T01ER3_A6037Mq_Grupo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6380Ft_procod = A6380Ft_procod ;
         Z6037Mq_Grupo = A6037Mq_Grupo ;
         sMode1553 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ER1553( ) ;
         load1ER1553( ) ;
         Gx_mode = sMode1553 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1553 = (short)(0) ;
         initializeNonKey1ER1553( ) ;
         sMode1553 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1ER1553( ) ;
         Gx_mode = sMode1553 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1ER1553( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1ER1553( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01ER2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQSP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6384Ft_PrgC1 != T01ER2_A6384Ft_PrgC1[0] ) || ( Z6386Ft_PrgC2 != T01ER2_A6386Ft_PrgC2[0] ) || ( Z6388Ft_PrgC3 != T01ER2_A6388Ft_PrgC3[0] ) )
         {
            if ( Z6384Ft_PrgC1 != T01ER2_A6384Ft_PrgC1[0] )
            {
               GXutil.writeLogln("tftpqsp:[seudo value changed for attri]"+"Ft_PrgC1");
               GXutil.writeLogRaw("Old: ",Z6384Ft_PrgC1);
               GXutil.writeLogRaw("Current: ",T01ER2_A6384Ft_PrgC1[0]);
            }
            if ( Z6386Ft_PrgC2 != T01ER2_A6386Ft_PrgC2[0] )
            {
               GXutil.writeLogln("tftpqsp:[seudo value changed for attri]"+"Ft_PrgC2");
               GXutil.writeLogRaw("Old: ",Z6386Ft_PrgC2);
               GXutil.writeLogRaw("Current: ",T01ER2_A6386Ft_PrgC2[0]);
            }
            if ( Z6388Ft_PrgC3 != T01ER2_A6388Ft_PrgC3[0] )
            {
               GXutil.writeLogln("tftpqsp:[seudo value changed for attri]"+"Ft_PrgC3");
               GXutil.writeLogRaw("Old: ",Z6388Ft_PrgC3);
               GXutil.writeLogRaw("Current: ",T01ER2_A6388Ft_PrgC3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFTPQSP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1ER1553( )
   {
      beforeValidate1ER1553( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ER1553( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1ER1553( 0) ;
         checkOptimisticConcurrency1ER1553( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1ER1553( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1ER1553( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01ER20 */
                  pr_default.execute(18, new Object[] {A6380Ft_procod, Boolean.valueOf(n6384Ft_PrgC1), Integer.valueOf(A6384Ft_PrgC1), Boolean.valueOf(n6386Ft_PrgC2), Integer.valueOf(A6386Ft_PrgC2), Boolean.valueOf(n6388Ft_PrgC3), Integer.valueOf(A6388Ft_PrgC3), A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQSP");
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
            load1ER1553( ) ;
         }
         endLevel1ER1553( ) ;
      }
      closeExtendedTableCursors1ER1553( ) ;
   }

   public void update1ER1553( )
   {
      beforeValidate1ER1553( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1ER1553( ) ;
      }
      if ( ( nIsMod_1553 != 0 ) || ( nIsDirty_1553 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1ER1553( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1ER1553( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1ER1553( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01ER21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n6384Ft_PrgC1), Integer.valueOf(A6384Ft_PrgC1), Boolean.valueOf(n6386Ft_PrgC2), Integer.valueOf(A6386Ft_PrgC2), Boolean.valueOf(n6388Ft_PrgC3), Integer.valueOf(A6388Ft_PrgC3), A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQSP");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQSP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1ER1553( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1ER1553( ) ;
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
            endLevel1ER1553( ) ;
         }
      }
      closeExtendedTableCursors1ER1553( ) ;
   }

   public void deferredUpdate1ER1553( )
   {
   }

   public void delete1ER1553( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1ER1553( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1ER1553( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1ER1553( ) ;
         afterConfirm1ER1553( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1ER1553( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01ER22 */
               pr_default.execute(20, new Object[] {A396EmprCod, A6380Ft_procod, Byte.valueOf(A6037Mq_Grupo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQSP");
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
      sMode1553 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1ER1553( ) ;
      Gx_mode = sMode1553 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1ER1553( )
   {
      standaloneModal1ER1553( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01ER23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
         A6038Mq_Desc = T01ER23_A6038Mq_Desc[0] ;
         n6038Mq_Desc = T01ER23_n6038Mq_Desc[0] ;
         pr_default.close(21);
         GXt_char1 = A6385Ft_PrgD1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6384Ft_PrgC1, GXv_char2) ;
         tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6385Ft_PrgD1 = GXt_char1 ;
         GXt_char1 = A6387Ft_PrgD2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6386Ft_PrgC2, GXv_char2) ;
         tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6387Ft_PrgD2 = GXt_char1 ;
         GXt_char1 = A6389Ft_PrgD3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6388Ft_PrgC3, GXv_char2) ;
         tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6389Ft_PrgD3 = GXt_char1 ;
      }
   }

   public void endLevel1ER1553( )
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

   public void scanStart1ER1553( )
   {
      /* Scan By routine */
      /* Using cursor T01ER24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A6380Ft_procod});
      RcdFound1553 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1553 = (short)(1) ;
         A6037Mq_Grupo = T01ER24_A6037Mq_Grupo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1ER1553( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1553 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1553 = (short)(1) ;
         A6037Mq_Grupo = T01ER24_A6037Mq_Grupo[0] ;
      }
   }

   public void scanEnd1ER1553( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1ER1553( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1ER1553( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1ER1553( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1ER1553( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1ER1553( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1ER1553( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1ER1553( )
   {
      edtMq_Grupo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMq_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Desc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgC1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgD1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgC2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgD2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgC3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgC3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgC3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFt_PrgD3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_PrgD3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_PrgD3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1ER1553( )
   {
   }

   public void send_integrity_lvl_hashes1ER1551( )
   {
   }

   public void subsflControlProps_401553( )
   {
      edtavnRcdDeleted_1553_Internalname = "vNRCDDELETED_1553_"+sGXsfl_40_idx ;
      edtMq_Grupo_Internalname = "MQ_GRUPO_"+sGXsfl_40_idx ;
      edtMq_Desc_Internalname = "MQ_DESC_"+sGXsfl_40_idx ;
      edtFt_PrgC1_Internalname = "FT_PRGC1_"+sGXsfl_40_idx ;
      edtFt_PrgD1_Internalname = "FT_PRGD1_"+sGXsfl_40_idx ;
      edtFt_PrgC2_Internalname = "FT_PRGC2_"+sGXsfl_40_idx ;
      edtFt_PrgD2_Internalname = "FT_PRGD2_"+sGXsfl_40_idx ;
      edtFt_PrgC3_Internalname = "FT_PRGC3_"+sGXsfl_40_idx ;
      edtFt_PrgD3_Internalname = "FT_PRGD3_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401553( )
   {
      edtavnRcdDeleted_1553_Internalname = "vNRCDDELETED_1553_"+sGXsfl_40_fel_idx ;
      edtMq_Grupo_Internalname = "MQ_GRUPO_"+sGXsfl_40_fel_idx ;
      edtMq_Desc_Internalname = "MQ_DESC_"+sGXsfl_40_fel_idx ;
      edtFt_PrgC1_Internalname = "FT_PRGC1_"+sGXsfl_40_fel_idx ;
      edtFt_PrgD1_Internalname = "FT_PRGD1_"+sGXsfl_40_fel_idx ;
      edtFt_PrgC2_Internalname = "FT_PRGC2_"+sGXsfl_40_fel_idx ;
      edtFt_PrgD2_Internalname = "FT_PRGD2_"+sGXsfl_40_fel_idx ;
      edtFt_PrgC3_Internalname = "FT_PRGC3_"+sGXsfl_40_fel_idx ;
      edtFt_PrgD3_Internalname = "FT_PRGD3_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1ER1553( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401553( ) ;
      sendRow1ER1553( ) ;
   }

   public void sendRow1ER1553( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1553_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1553_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1553_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1553), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1553), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1553_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1553_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1553_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Grupo_Internalname,GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6037Mq_Grupo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Grupo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Grupo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Desc_Internalname,GXutil.rtrim( A6038Mq_Desc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Desc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Desc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1553_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgC1_Internalname,GXutil.ltrim( localUtil.ntoc( A6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFt_PrgC1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6384Ft_PrgC1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6384Ft_PrgC1), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgC1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgC1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgD1_Internalname,GXutil.rtrim( A6385Ft_PrgD1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgD1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgD1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1553_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgC2_Internalname,GXutil.ltrim( localUtil.ntoc( A6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFt_PrgC2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6386Ft_PrgC2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6386Ft_PrgC2), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgC2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgC2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgD2_Internalname,GXutil.rtrim( A6387Ft_PrgD2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgD2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgD2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1553_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgC3_Internalname,GXutil.ltrim( localUtil.ntoc( A6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFt_PrgC3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6388Ft_PrgC3), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6388Ft_PrgC3), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgC3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgC3_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_PrgD3_Internalname,GXutil.rtrim( A6389Ft_PrgD3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_PrgD3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_PrgD3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1ER1553( ) ;
      GXCCtl = "Z6037Mq_Grupo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6384Ft_PrgC1_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6384Ft_PrgC1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6386Ft_PrgC2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6386Ft_PrgC2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6388Ft_PrgC3_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6388Ft_PrgC3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1553_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1553_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1553_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1553, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1553_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1553_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_GRUPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_DESC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGC1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGD1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGD2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGC3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PRGD3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD3_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1ER1553( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401553( ) ;
      edtavnRcdDeleted_1553_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1553_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_GRUPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DESC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgC1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgD1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgC2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgD2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgC3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGC3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_PrgD3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PRGD3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1553_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1553_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1553");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1553_Internalname ;
         wbErr = true ;
         nRcdDeleted_1553 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1553 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1553_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         wbErr = true ;
         A6037Mq_Grupo = (byte)(0) ;
      }
      else
      {
         A6037Mq_Grupo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6038Mq_Desc = httpContext.cgiGet( edtMq_Desc_Internalname) ;
      n6038Mq_Desc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FT_PRGC1_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFt_PrgC1_Internalname ;
         wbErr = true ;
         A6384Ft_PrgC1 = 0 ;
         n6384Ft_PrgC1 = false ;
      }
      else
      {
         A6384Ft_PrgC1 = (int)(localUtil.ctol( httpContext.cgiGet( edtFt_PrgC1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6384Ft_PrgC1 = false ;
      }
      A6385Ft_PrgD1 = httpContext.cgiGet( edtFt_PrgD1_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FT_PRGC2_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFt_PrgC2_Internalname ;
         wbErr = true ;
         A6386Ft_PrgC2 = 0 ;
         n6386Ft_PrgC2 = false ;
      }
      else
      {
         A6386Ft_PrgC2 = (int)(localUtil.ctol( httpContext.cgiGet( edtFt_PrgC2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6386Ft_PrgC2 = false ;
      }
      A6387Ft_PrgD2 = httpContext.cgiGet( edtFt_PrgD2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFt_PrgC3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FT_PRGC3_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFt_PrgC3_Internalname ;
         wbErr = true ;
         A6388Ft_PrgC3 = 0 ;
         n6388Ft_PrgC3 = false ;
      }
      else
      {
         A6388Ft_PrgC3 = (int)(localUtil.ctol( httpContext.cgiGet( edtFt_PrgC3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6388Ft_PrgC3 = false ;
      }
      A6389Ft_PrgD3 = httpContext.cgiGet( edtFt_PrgD3_Internalname) ;
      GXCCtl = "Z6037Mq_Grupo_" + sGXsfl_40_idx ;
      Z6037Mq_Grupo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6384Ft_PrgC1_" + sGXsfl_40_idx ;
      Z6384Ft_PrgC1 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6386Ft_PrgC2_" + sGXsfl_40_idx ;
      Z6386Ft_PrgC2 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6388Ft_PrgC3_" + sGXsfl_40_idx ;
      Z6388Ft_PrgC3 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1553_" + sGXsfl_40_idx ;
      nRcdDeleted_1553 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1553_" + sGXsfl_40_idx ;
      nRcdExists_1553 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1553_" + sGXsfl_40_idx ;
      nIsMod_1553 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMq_Grupo_Enabled = edtMq_Grupo_Enabled ;
   }

   public void confirmValues1ER0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401553( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401553( ) ;
         httpContext.changePostValue( "Z6037Mq_Grupo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6384Ft_PrgC1_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6384Ft_PrgC1_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6384Ft_PrgC1_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6386Ft_PrgC2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6386Ft_PrgC2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6386Ft_PrgC2_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6388Ft_PrgC3_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6388Ft_PrgC3_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6388Ft_PrgC3_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tftpqsp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A6380Ft_procod))}, new String[] {"EmprCod","Ft_procod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6380Ft_procod", GXutil.rtrim( Z6380Ft_procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6381Ft_ProDsc", GXutil.rtrim( Z6381Ft_ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tftpqsp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A6380Ft_procod))}, new String[] {"EmprCod","Ft_procod"})  ;
   }

   public String getPgmname( )
   {
      return "TFTPQSP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FICHA TECNICA PQ, PROGRAMAS", "") ;
   }

   public void initializeNonKey1ER1551( )
   {
      A6381Ft_ProDsc = "" ;
      n6381Ft_ProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
      Z6381Ft_ProDsc = "" ;
   }

   public void initAll1ER1551( )
   {
      initializeNonKey1ER1551( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1ER1553( )
   {
      A6389Ft_PrgD3 = "" ;
      A6387Ft_PrgD2 = "" ;
      A6385Ft_PrgD1 = "" ;
      A6038Mq_Desc = "" ;
      n6038Mq_Desc = false ;
      A6384Ft_PrgC1 = 0 ;
      n6384Ft_PrgC1 = false ;
      A6386Ft_PrgC2 = 0 ;
      n6386Ft_PrgC2 = false ;
      A6388Ft_PrgC3 = 0 ;
      n6388Ft_PrgC3 = false ;
      Z6384Ft_PrgC1 = 0 ;
      Z6386Ft_PrgC2 = 0 ;
      Z6388Ft_PrgC3 = 0 ;
   }

   public void initAll1ER1553( )
   {
      A6037Mq_Grupo = (byte)(0) ;
      initializeNonKey1ER1553( ) ;
   }

   public void standaloneModalInsert1ER1553( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565816", true, true);
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
      httpContext.AddJavascriptSource("tftpqsp.js", "?20268241565816", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1553( )
   {
      edtMq_Grupo_Enabled = defedtMq_Grupo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1553, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1553_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6038Mq_Desc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6384Ft_PrgC1, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6385Ft_PrgD1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6386Ft_PrgC2, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6387Ft_PrgD2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6388Ft_PrgC3, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgC3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6389Ft_PrgD3));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_PrgD3_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFt_procod_Internalname = "FT_PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtFt_ProDsc_Internalname = "FT_PRODSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1553_Internalname = "vNRCDDELETED_1553" ;
      edtMq_Grupo_Internalname = "MQ_GRUPO" ;
      edtMq_Desc_Internalname = "MQ_DESC" ;
      edtFt_PrgC1_Internalname = "FT_PRGC1" ;
      edtFt_PrgD1_Internalname = "FT_PRGD1" ;
      edtFt_PrgC2_Internalname = "FT_PRGC2" ;
      edtFt_PrgD2_Internalname = "FT_PRGD2" ;
      edtFt_PrgC3_Internalname = "FT_PRGC3" ;
      edtFt_PrgD3_Internalname = "FT_PRGD3" ;
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
      Form.setCaption( httpContext.getMessage( "FICHA TECNICA PQ, PROGRAMAS", "") );
      edtFt_PrgD3_Jsonclick = "" ;
      edtFt_PrgC3_Jsonclick = "" ;
      edtFt_PrgD2_Jsonclick = "" ;
      edtFt_PrgC2_Jsonclick = "" ;
      edtFt_PrgD1_Jsonclick = "" ;
      edtFt_PrgC1_Jsonclick = "" ;
      edtMq_Desc_Jsonclick = "" ;
      edtMq_Grupo_Jsonclick = "" ;
      edtavnRcdDeleted_1553_Jsonclick = "" ;
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
      edtFt_PrgD3_Enabled = 0 ;
      edtFt_PrgC3_Enabled = 1 ;
      edtFt_PrgD2_Enabled = 0 ;
      edtFt_PrgC2_Enabled = 1 ;
      edtFt_PrgD1_Enabled = 0 ;
      edtFt_PrgC1_Enabled = 1 ;
      edtMq_Desc_Enabled = 0 ;
      edtMq_Grupo_Enabled = 1 ;
      edtavnRcdDeleted_1553_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtFt_ProDsc_Jsonclick = "" ;
      edtFt_ProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFt_ProDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFt_procod_Jsonclick = "" ;
      edtFt_procod_Backcolor = (int)(0xFFFFFF) ;
      edtFt_procod_Enabled = 0 ;
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

   public void gx1asaft_prgd11ER1553( String A396EmprCod ,
                                      int A6384Ft_PrgC1 )
   {
      GXt_char1 = A6385Ft_PrgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6384Ft_PrgC1, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6385Ft_PrgD1 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6385Ft_PrgD1))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asaft_prgd21ER1553( String A396EmprCod ,
                                      int A6386Ft_PrgC2 )
   {
      GXt_char1 = A6387Ft_PrgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6386Ft_PrgC2, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6387Ft_PrgD2 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6387Ft_PrgD2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asaft_prgd31ER1553( String A396EmprCod ,
                                      int A6388Ft_PrgC3 )
   {
      GXt_char1 = A6389Ft_PrgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6388Ft_PrgC3, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6389Ft_PrgD3 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6389Ft_PrgD3))+"\"") ;
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
      subsflControlProps_401553( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1ER1553( ) ;
         standaloneModal1ER1553( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1ER1553( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401553( ) ;
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
      /* Using cursor T01ER25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01ER25_A407EmprNom[0] ;
      n407EmprNom = T01ER25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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

   public void valid_Ft_procod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", GXutil.rtrim( A6381Ft_ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6380Ft_procod", GXutil.rtrim( Z6380Ft_procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6381Ft_ProDsc", GXutil.rtrim( Z6381Ft_ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mq_grupo( )
   {
      n6038Mq_Desc = false ;
      /* Using cursor T01ER23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_GRUPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
      }
      A6038Mq_Desc = T01ER23_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01ER23_n6038Mq_Desc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6038Mq_Desc", GXutil.rtrim( A6038Mq_Desc));
   }

   public void valid_Ft_prgc1( )
   {
      n6384Ft_PrgC1 = false ;
      GXt_char1 = A6385Ft_PrgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6384Ft_PrgC1, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6385Ft_PrgD1 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6385Ft_PrgD1", GXutil.rtrim( A6385Ft_PrgD1));
   }

   public void valid_Ft_prgc2( )
   {
      n6386Ft_PrgC2 = false ;
      GXt_char1 = A6387Ft_PrgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6386Ft_PrgC2, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6387Ft_PrgD2 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6387Ft_PrgD2", GXutil.rtrim( A6387Ft_PrgD2));
   }

   public void valid_Ft_prgc3( )
   {
      n6388Ft_PrgC3 = false ;
      GXt_char1 = A6389Ft_PrgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6388Ft_PrgC3, GXv_char2) ;
      tftpqsp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6389Ft_PrgD3 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6389Ft_PrgD3", GXutil.rtrim( A6389Ft_PrgD3));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6380Ft_procod',fld:'FT_PROCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FT_PROCOD","{handler:'valid_Ft_procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6380Ft_procod',fld:'FT_PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FT_PROCOD",",oparms:[{av:'A6381Ft_ProDsc',fld:'FT_PRODSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6380Ft_procod'},{av:'Z6381Ft_ProDsc'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQ_GRUPO","{handler:'valid_Mq_grupo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6037Mq_Grupo',fld:'MQ_GRUPO',pic:'Z9'},{av:'A6038Mq_Desc',fld:'MQ_DESC',pic:''}]");
      setEventMetadata("VALID_MQ_GRUPO",",oparms:[{av:'A6038Mq_Desc',fld:'MQ_DESC',pic:''}]}");
      setEventMetadata("VALID_FT_PRGC1","{handler:'valid_Ft_prgc1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6384Ft_PrgC1',fld:'FT_PRGC1',pic:'ZZZZZ9'},{av:'A6385Ft_PrgD1',fld:'FT_PRGD1',pic:''}]");
      setEventMetadata("VALID_FT_PRGC1",",oparms:[{av:'A6385Ft_PrgD1',fld:'FT_PRGD1',pic:''}]}");
      setEventMetadata("VALID_FT_PRGC2","{handler:'valid_Ft_prgc2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6386Ft_PrgC2',fld:'FT_PRGC2',pic:'ZZZZZ9'},{av:'A6387Ft_PrgD2',fld:'FT_PRGD2',pic:''}]");
      setEventMetadata("VALID_FT_PRGC2",",oparms:[{av:'A6387Ft_PrgD2',fld:'FT_PRGD2',pic:''}]}");
      setEventMetadata("VALID_FT_PRGC3","{handler:'valid_Ft_prgc3',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6388Ft_PrgC3',fld:'FT_PRGC3',pic:'ZZZZZ9'},{av:'A6389Ft_PrgD3',fld:'FT_PRGD3',pic:''}]");
      setEventMetadata("VALID_FT_PRGC3",",oparms:[{av:'A6389Ft_PrgD3',fld:'FT_PRGD3',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ft_prgd3',iparms:[]");
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
      wcpOA6380Ft_procod = "" ;
      Z396EmprCod = "" ;
      Z6380Ft_procod = "" ;
      Z6381Ft_ProDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6380Ft_procod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A6381Ft_ProDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1553 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1551 = "" ;
      GXCCtl = "" ;
      A6038Mq_Desc = "" ;
      A6385Ft_PrgD1 = "" ;
      A6387Ft_PrgD2 = "" ;
      A6389Ft_PrgD3 = "" ;
      Z407EmprNom = "" ;
      T01ER7_A407EmprNom = new String[] {""} ;
      T01ER7_n407EmprNom = new boolean[] {false} ;
      T01ER8_A6380Ft_procod = new String[] {""} ;
      T01ER8_A6381Ft_ProDsc = new String[] {""} ;
      T01ER8_n6381Ft_ProDsc = new boolean[] {false} ;
      T01ER8_A407EmprNom = new String[] {""} ;
      T01ER8_n407EmprNom = new boolean[] {false} ;
      T01ER8_A396EmprCod = new String[] {""} ;
      T01ER9_A396EmprCod = new String[] {""} ;
      T01ER9_A6380Ft_procod = new String[] {""} ;
      T01ER6_A6380Ft_procod = new String[] {""} ;
      T01ER6_A6381Ft_ProDsc = new String[] {""} ;
      T01ER6_n6381Ft_ProDsc = new boolean[] {false} ;
      T01ER6_A396EmprCod = new String[] {""} ;
      T01ER10_A396EmprCod = new String[] {""} ;
      T01ER10_A6380Ft_procod = new String[] {""} ;
      T01ER11_A396EmprCod = new String[] {""} ;
      T01ER11_A6380Ft_procod = new String[] {""} ;
      T01ER5_A6380Ft_procod = new String[] {""} ;
      T01ER5_A6381Ft_ProDsc = new String[] {""} ;
      T01ER5_n6381Ft_ProDsc = new boolean[] {false} ;
      T01ER5_A396EmprCod = new String[] {""} ;
      T01ER15_A396EmprCod = new String[] {""} ;
      T01ER15_A6380Ft_procod = new String[] {""} ;
      T01ER15_A6383Ft_ProLin = new short[1] ;
      T01ER16_A396EmprCod = new String[] {""} ;
      T01ER16_A6380Ft_procod = new String[] {""} ;
      Z6038Mq_Desc = "" ;
      T01ER17_A6380Ft_procod = new String[] {""} ;
      T01ER17_A6038Mq_Desc = new String[] {""} ;
      T01ER17_n6038Mq_Desc = new boolean[] {false} ;
      T01ER17_A6384Ft_PrgC1 = new int[1] ;
      T01ER17_n6384Ft_PrgC1 = new boolean[] {false} ;
      T01ER17_A6386Ft_PrgC2 = new int[1] ;
      T01ER17_n6386Ft_PrgC2 = new boolean[] {false} ;
      T01ER17_A6388Ft_PrgC3 = new int[1] ;
      T01ER17_n6388Ft_PrgC3 = new boolean[] {false} ;
      T01ER17_A396EmprCod = new String[] {""} ;
      T01ER17_A6037Mq_Grupo = new byte[1] ;
      T01ER4_A6038Mq_Desc = new String[] {""} ;
      T01ER4_n6038Mq_Desc = new boolean[] {false} ;
      T01ER18_A6038Mq_Desc = new String[] {""} ;
      T01ER18_n6038Mq_Desc = new boolean[] {false} ;
      T01ER19_A396EmprCod = new String[] {""} ;
      T01ER19_A6380Ft_procod = new String[] {""} ;
      T01ER19_A6037Mq_Grupo = new byte[1] ;
      T01ER3_A6380Ft_procod = new String[] {""} ;
      T01ER3_A6384Ft_PrgC1 = new int[1] ;
      T01ER3_n6384Ft_PrgC1 = new boolean[] {false} ;
      T01ER3_A6386Ft_PrgC2 = new int[1] ;
      T01ER3_n6386Ft_PrgC2 = new boolean[] {false} ;
      T01ER3_A6388Ft_PrgC3 = new int[1] ;
      T01ER3_n6388Ft_PrgC3 = new boolean[] {false} ;
      T01ER3_A396EmprCod = new String[] {""} ;
      T01ER3_A6037Mq_Grupo = new byte[1] ;
      T01ER2_A6380Ft_procod = new String[] {""} ;
      T01ER2_A6384Ft_PrgC1 = new int[1] ;
      T01ER2_n6384Ft_PrgC1 = new boolean[] {false} ;
      T01ER2_A6386Ft_PrgC2 = new int[1] ;
      T01ER2_n6386Ft_PrgC2 = new boolean[] {false} ;
      T01ER2_A6388Ft_PrgC3 = new int[1] ;
      T01ER2_n6388Ft_PrgC3 = new boolean[] {false} ;
      T01ER2_A396EmprCod = new String[] {""} ;
      T01ER2_A6037Mq_Grupo = new byte[1] ;
      T01ER23_A6038Mq_Desc = new String[] {""} ;
      T01ER23_n6038Mq_Desc = new boolean[] {false} ;
      T01ER24_A396EmprCod = new String[] {""} ;
      T01ER24_A6380Ft_procod = new String[] {""} ;
      T01ER24_A6037Mq_Grupo = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01ER25_A407EmprNom = new String[] {""} ;
      T01ER25_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ6380Ft_procod = "" ;
      ZZ6381Ft_ProDsc = "" ;
      ZZ407EmprNom = "" ;
      Z6385Ft_PrgD1 = "" ;
      Z6387Ft_PrgD2 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Z6389Ft_PrgD3 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tftpqsp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tftpqsp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tftpqsp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tftpqsp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tftpqsp__default(),
         new Object[] {
             new Object[] {
            T01ER2_A6380Ft_procod, T01ER2_A6384Ft_PrgC1, T01ER2_n6384Ft_PrgC1, T01ER2_A6386Ft_PrgC2, T01ER2_n6386Ft_PrgC2, T01ER2_A6388Ft_PrgC3, T01ER2_n6388Ft_PrgC3, T01ER2_A396EmprCod, T01ER2_A6037Mq_Grupo
            }
            , new Object[] {
            T01ER3_A6380Ft_procod, T01ER3_A6384Ft_PrgC1, T01ER3_n6384Ft_PrgC1, T01ER3_A6386Ft_PrgC2, T01ER3_n6386Ft_PrgC2, T01ER3_A6388Ft_PrgC3, T01ER3_n6388Ft_PrgC3, T01ER3_A396EmprCod, T01ER3_A6037Mq_Grupo
            }
            , new Object[] {
            T01ER4_A6038Mq_Desc, T01ER4_n6038Mq_Desc
            }
            , new Object[] {
            T01ER5_A6380Ft_procod, T01ER5_A6381Ft_ProDsc, T01ER5_n6381Ft_ProDsc, T01ER5_A396EmprCod
            }
            , new Object[] {
            T01ER6_A6380Ft_procod, T01ER6_A6381Ft_ProDsc, T01ER6_n6381Ft_ProDsc, T01ER6_A396EmprCod
            }
            , new Object[] {
            T01ER7_A407EmprNom, T01ER7_n407EmprNom
            }
            , new Object[] {
            T01ER8_A6380Ft_procod, T01ER8_A6381Ft_ProDsc, T01ER8_n6381Ft_ProDsc, T01ER8_A407EmprNom, T01ER8_n407EmprNom, T01ER8_A396EmprCod
            }
            , new Object[] {
            T01ER9_A396EmprCod, T01ER9_A6380Ft_procod
            }
            , new Object[] {
            T01ER10_A396EmprCod, T01ER10_A6380Ft_procod
            }
            , new Object[] {
            T01ER11_A396EmprCod, T01ER11_A6380Ft_procod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ER15_A396EmprCod, T01ER15_A6380Ft_procod, T01ER15_A6383Ft_ProLin
            }
            , new Object[] {
            T01ER16_A396EmprCod, T01ER16_A6380Ft_procod
            }
            , new Object[] {
            T01ER17_A6380Ft_procod, T01ER17_A6038Mq_Desc, T01ER17_n6038Mq_Desc, T01ER17_A6384Ft_PrgC1, T01ER17_n6384Ft_PrgC1, T01ER17_A6386Ft_PrgC2, T01ER17_n6386Ft_PrgC2, T01ER17_A6388Ft_PrgC3, T01ER17_n6388Ft_PrgC3, T01ER17_A396EmprCod,
            T01ER17_A6037Mq_Grupo
            }
            , new Object[] {
            T01ER18_A6038Mq_Desc, T01ER18_n6038Mq_Desc
            }
            , new Object[] {
            T01ER19_A396EmprCod, T01ER19_A6380Ft_procod, T01ER19_A6037Mq_Grupo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01ER23_A6038Mq_Desc, T01ER23_n6038Mq_Desc
            }
            , new Object[] {
            T01ER24_A396EmprCod, T01ER24_A6380Ft_procod, T01ER24_A6037Mq_Grupo
            }
            , new Object[] {
            T01ER25_A407EmprNom, T01ER25_n407EmprNom
            }
         }
      );
      Z6380Ft_procod = "" ;
      A6380Ft_procod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z6037Mq_Grupo ;
   private byte GxWebError ;
   private byte A6037Mq_Grupo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1553 ;
   private short nRcdExists_1553 ;
   private short nIsMod_1553 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1553 ;
   private short RcdFound1553 ;
   private short nBlankRcdUsr1553 ;
   private short RcdFound1551 ;
   private short nIsDirty_1551 ;
   private short nIsDirty_1553 ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z6384Ft_PrgC1 ;
   private int Z6386Ft_PrgC2 ;
   private int Z6388Ft_PrgC3 ;
   private int A6384Ft_PrgC1 ;
   private int A6386Ft_PrgC2 ;
   private int A6388Ft_PrgC3 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtFt_procod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFt_ProDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1553_Enabled ;
   private int edtMq_Grupo_Enabled ;
   private int edtMq_Desc_Enabled ;
   private int edtFt_PrgC1_Enabled ;
   private int edtFt_PrgD1_Enabled ;
   private int edtFt_PrgC2_Enabled ;
   private int edtFt_PrgD2_Enabled ;
   private int edtFt_PrgC3_Enabled ;
   private int edtFt_PrgD3_Enabled ;
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
   private int defedtMq_Grupo_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtFt_ProDsc_Backcolor ;
   private int edtFt_procod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA6380Ft_procod ;
   private String Z396EmprCod ;
   private String Z6380Ft_procod ;
   private String Z6381Ft_ProDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6380Ft_procod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFt_ProDsc_Internalname ;
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
   private String edtFt_procod_Internalname ;
   private String edtFt_procod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A6381Ft_ProDsc ;
   private String edtFt_ProDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1553 ;
   private String edtavnRcdDeleted_1553_Internalname ;
   private String edtMq_Grupo_Internalname ;
   private String edtMq_Desc_Internalname ;
   private String edtFt_PrgC1_Internalname ;
   private String edtFt_PrgD1_Internalname ;
   private String edtFt_PrgC2_Internalname ;
   private String edtFt_PrgD2_Internalname ;
   private String edtFt_PrgC3_Internalname ;
   private String edtFt_PrgD3_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1551 ;
   private String GXCCtl ;
   private String A6038Mq_Desc ;
   private String A6385Ft_PrgD1 ;
   private String A6387Ft_PrgD2 ;
   private String A6389Ft_PrgD3 ;
   private String Z407EmprNom ;
   private String Z6038Mq_Desc ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1553_Jsonclick ;
   private String edtMq_Grupo_Jsonclick ;
   private String edtMq_Desc_Jsonclick ;
   private String edtFt_PrgC1_Jsonclick ;
   private String edtFt_PrgD1_Jsonclick ;
   private String edtFt_PrgC2_Jsonclick ;
   private String edtFt_PrgD2_Jsonclick ;
   private String edtFt_PrgC3_Jsonclick ;
   private String edtFt_PrgD3_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6380Ft_procod ;
   private String ZZ6381Ft_ProDsc ;
   private String ZZ407EmprNom ;
   private String Z6385Ft_PrgD1 ;
   private String Z6387Ft_PrgD2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z6389Ft_PrgD3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6384Ft_PrgC1 ;
   private boolean n6386Ft_PrgC2 ;
   private boolean n6388Ft_PrgC3 ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n6381Ft_ProDsc ;
   private boolean n407EmprNom ;
   private boolean n6038Mq_Desc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01ER7_A407EmprNom ;
   private boolean[] T01ER7_n407EmprNom ;
   private String[] T01ER8_A6380Ft_procod ;
   private String[] T01ER8_A6381Ft_ProDsc ;
   private boolean[] T01ER8_n6381Ft_ProDsc ;
   private String[] T01ER8_A407EmprNom ;
   private boolean[] T01ER8_n407EmprNom ;
   private String[] T01ER8_A396EmprCod ;
   private String[] T01ER9_A396EmprCod ;
   private String[] T01ER9_A6380Ft_procod ;
   private String[] T01ER6_A6380Ft_procod ;
   private String[] T01ER6_A6381Ft_ProDsc ;
   private boolean[] T01ER6_n6381Ft_ProDsc ;
   private String[] T01ER6_A396EmprCod ;
   private String[] T01ER10_A396EmprCod ;
   private String[] T01ER10_A6380Ft_procod ;
   private String[] T01ER11_A396EmprCod ;
   private String[] T01ER11_A6380Ft_procod ;
   private String[] T01ER5_A6380Ft_procod ;
   private String[] T01ER5_A6381Ft_ProDsc ;
   private boolean[] T01ER5_n6381Ft_ProDsc ;
   private String[] T01ER5_A396EmprCod ;
   private String[] T01ER15_A396EmprCod ;
   private String[] T01ER15_A6380Ft_procod ;
   private short[] T01ER15_A6383Ft_ProLin ;
   private String[] T01ER16_A396EmprCod ;
   private String[] T01ER16_A6380Ft_procod ;
   private String[] T01ER17_A6380Ft_procod ;
   private String[] T01ER17_A6038Mq_Desc ;
   private boolean[] T01ER17_n6038Mq_Desc ;
   private int[] T01ER17_A6384Ft_PrgC1 ;
   private boolean[] T01ER17_n6384Ft_PrgC1 ;
   private int[] T01ER17_A6386Ft_PrgC2 ;
   private boolean[] T01ER17_n6386Ft_PrgC2 ;
   private int[] T01ER17_A6388Ft_PrgC3 ;
   private boolean[] T01ER17_n6388Ft_PrgC3 ;
   private String[] T01ER17_A396EmprCod ;
   private byte[] T01ER17_A6037Mq_Grupo ;
   private String[] T01ER4_A6038Mq_Desc ;
   private boolean[] T01ER4_n6038Mq_Desc ;
   private String[] T01ER18_A6038Mq_Desc ;
   private boolean[] T01ER18_n6038Mq_Desc ;
   private String[] T01ER19_A396EmprCod ;
   private String[] T01ER19_A6380Ft_procod ;
   private byte[] T01ER19_A6037Mq_Grupo ;
   private String[] T01ER3_A6380Ft_procod ;
   private int[] T01ER3_A6384Ft_PrgC1 ;
   private boolean[] T01ER3_n6384Ft_PrgC1 ;
   private int[] T01ER3_A6386Ft_PrgC2 ;
   private boolean[] T01ER3_n6386Ft_PrgC2 ;
   private int[] T01ER3_A6388Ft_PrgC3 ;
   private boolean[] T01ER3_n6388Ft_PrgC3 ;
   private String[] T01ER3_A396EmprCod ;
   private byte[] T01ER3_A6037Mq_Grupo ;
   private String[] T01ER2_A6380Ft_procod ;
   private int[] T01ER2_A6384Ft_PrgC1 ;
   private boolean[] T01ER2_n6384Ft_PrgC1 ;
   private int[] T01ER2_A6386Ft_PrgC2 ;
   private boolean[] T01ER2_n6386Ft_PrgC2 ;
   private int[] T01ER2_A6388Ft_PrgC3 ;
   private boolean[] T01ER2_n6388Ft_PrgC3 ;
   private String[] T01ER2_A396EmprCod ;
   private byte[] T01ER2_A6037Mq_Grupo ;
   private String[] T01ER23_A6038Mq_Desc ;
   private boolean[] T01ER23_n6038Mq_Desc ;
   private String[] T01ER24_A396EmprCod ;
   private String[] T01ER24_A6380Ft_procod ;
   private byte[] T01ER24_A6037Mq_Grupo ;
   private String[] T01ER25_A407EmprNom ;
   private boolean[] T01ER25_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tftpqsp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqsp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqsp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqsp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqsp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01ER2", "SELECT Ft_procod, Ft_PrgC1, Ft_PrgC2, Ft_PrgC3, EmprCod, Mq_Grupo FROM TXPFTPQSP WHERE EmprCod = ? AND Ft_procod = ? AND Mq_Grupo = ?  FOR UPDATE OF Ft_PrgC1, Ft_PrgC2, Ft_PrgC3 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER3", "SELECT Ft_procod, Ft_PrgC1, Ft_PrgC2, Ft_PrgC3, EmprCod, Mq_Grupo FROM TXPFTPQSP WHERE EmprCod = ? AND Ft_procod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER4", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER5", "SELECT Ft_procod, Ft_ProDsc, EmprCod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ?  FOR UPDATE OF Ft_ProDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER6", "SELECT Ft_procod, Ft_ProDsc, EmprCod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER8", "SELECT /*+ FIRST_ROWS(1) */ TM1.Ft_procod, TM1.Ft_ProDsc, T2.EmprNom, TM1.EmprCod FROM (TXPFTPQS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Ft_procod = ? ORDER BY TM1.EmprCod, TM1.Ft_procod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE EmprCod = ? and Ft_procod = ? ORDER BY EmprCod, Ft_procod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE EmprCod = ? and Ft_procod = ? ORDER BY EmprCod DESC, Ft_procod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01ER12", "INSERT INTO TXPFTPQS(Ft_procod, Ft_ProDsc, EmprCod, Ft_ProULin) VALUES(?, ?, ?, 0)", GX_NOMASK, "TXPFTPQS")
         ,new UpdateCursor("T01ER13", "UPDATE TXPFTPQS SET Ft_ProDsc=?  WHERE EmprCod = ? AND Ft_procod = ?", GX_NOMASK, "TXPFTPQS")
         ,new UpdateCursor("T01ER14", "DELETE FROM TXPFTPQS  WHERE EmprCod = ? AND Ft_procod = ?", GX_NOMASK, "TXPFTPQS")
         ,new ForEachCursor("T01ER15", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND Ft_procod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE EmprCod = ? and Ft_procod = ? ORDER BY EmprCod, Ft_procod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01ER17", "SELECT T1.Ft_procod, T2.Mq_Desc, T1.Ft_PrgC1, T1.Ft_PrgC2, T1.Ft_PrgC3, T1.EmprCod, T1.Mq_Grupo FROM (TXPFTPQSP T1 INNER JOIN TXPMAQGRP T2 ON T2.EmprCod = T1.EmprCod AND T2.Mq_Grupo = T1.Mq_Grupo) WHERE T1.EmprCod = ? and T1.Ft_procod = ? and T1.Mq_Grupo = ? ORDER BY T1.EmprCod, T1.Ft_procod, T1.Mq_Grupo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER18", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER19", "SELECT EmprCod, Ft_procod, Mq_Grupo FROM TXPFTPQSP WHERE EmprCod = ? AND Ft_procod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01ER20", "INSERT INTO TXPFTPQSP(Ft_procod, Ft_PrgC1, Ft_PrgC2, Ft_PrgC3, EmprCod, Mq_Grupo) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFTPQSP")
         ,new UpdateCursor("T01ER21", "UPDATE TXPFTPQSP SET Ft_PrgC1=?, Ft_PrgC2=?, Ft_PrgC3=?  WHERE EmprCod = ? AND Ft_procod = ? AND Mq_Grupo = ?", GX_NOMASK, "TXPFTPQSP")
         ,new UpdateCursor("T01ER22", "DELETE FROM TXPFTPQSP  WHERE EmprCod = ? AND Ft_procod = ? AND Mq_Grupo = ?", GX_NOMASK, "TXPFTPQSP")
         ,new ForEachCursor("T01ER23", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER24", "SELECT EmprCod, Ft_procod, Mq_Grupo FROM TXPFTPQSP WHERE EmprCod = ? and Ft_procod = ? ORDER BY EmprCod, Ft_procod, Mq_Grupo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01ER25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 6);
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
               stmt.setString(5, (String)parms[7], 3);
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               return;
            case 19 :
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 6);
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

