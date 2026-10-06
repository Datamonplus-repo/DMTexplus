package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqnp1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
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

   public tmaqnp1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqnp1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqnp1_impl.class ));
   }

   public tmaqnp1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQNP1.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqAnyNP_Internalname, GXutil.ltrim( localUtil.ntoc( A12444MaqAnyNP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqAnyNP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12444MaqAnyNP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12444MaqAnyNP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqAnyNP_Jsonclick, 0, "", "", "", "", "", 1, edtMaqAnyNP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqMesNP_Internalname, GXutil.ltrim( localUtil.ntoc( A12445MaqMesNP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqMesNP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12445MaqMesNP), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12445MaqMesNP), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqMesNP_Jsonclick, 0, "", "", "", "", "", 1, edtMaqMesNP_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Horas NO Planificado Mes_Maquina", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQNP1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqNPMes_Internalname, GXutil.rtrim( A12437MaqNPMes), GXutil.rtrim( localUtil.format( A12437MaqNPMes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqNPMes_Jsonclick, 0, "", "", "", "", "", 1, edtMaqNPMes_Enabled, 0, "text", "", 63, "chr", 1, "row", 63, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQNP1.htm");
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
         nBlankRcdCount1722 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1722 = (short)(1) ;
            scanStart1KF1722( ) ;
            while ( RcdFound1722 != 0 )
            {
               init_level_properties1722( ) ;
               getByPrimaryKey1KF1722( ) ;
               addRow1KF1722( ) ;
               scanNext1KF1722( ) ;
            }
            scanEnd1KF1722( ) ;
            nBlankRcdCount1722 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KF1722( ) ;
         standaloneModal1KF1722( ) ;
         sMode1722 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1KF1722( ) ;
            edtavnRcdDeleted_1722_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1722_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1722_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1722_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPdia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPDIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPdia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPdia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI1I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI1i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPf1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPF1F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPf1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPf1f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI2I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI2i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI2F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI2f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI3I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI3i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqNPI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI3F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI3f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1722 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KF1722( ) ;
            }
            sendRow1KF1722( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1722 = (short)(5) ;
         nRcdExists_1722 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KF1722( ) ;
            while ( RcdFound1722 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501722( ) ;
               init_level_properties1722( ) ;
               standaloneNotModal1KF1722( ) ;
               getByPrimaryKey1KF1722( ) ;
               standaloneModal1KF1722( ) ;
               addRow1KF1722( ) ;
               scanNext1KF1722( ) ;
            }
            scanEnd1KF1722( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1722 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501722( ) ;
      initAll1KF1722( ) ;
      init_level_properties1722( ) ;
      nRcdExists_1722 = (short)(0) ;
      nIsMod_1722 = (short)(0) ;
      nRcdDeleted_1722 = (short)(0) ;
      nBlankRcdCount1722 = (short)(nBlankRcdUsr1722+nBlankRcdCount1722) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1722 > 0 )
      {
         standaloneNotModal1KF1722( ) ;
         standaloneModal1KF1722( ) ;
         addRow1KF1722( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqNPdia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1722 = (short)(nBlankRcdCount1722-1) ;
      }
      Gx_mode = sMode1722 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQNP1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAQNP1.htm");
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
      e111KF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z12444MaqAnyNP = (short)(localUtil.ctol( httpContext.cgiGet( "Z12444MaqAnyNP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12445MaqMesNP = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12445MaqMesNP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12437MaqNPMes = httpContext.cgiGet( "Z12437MaqNPMes") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnyNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnyNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQANYNP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqAnyNP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12444MaqAnyNP = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
            }
            else
            {
               A12444MaqAnyNP = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAnyNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMesNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqMesNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQMESNP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqMesNP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12445MaqMesNP = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
            }
            else
            {
               A12445MaqMesNP = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMesNP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
            }
            A12437MaqNPMes = httpContext.cgiGet( edtMaqNPMes_Internalname) ;
            n12437MaqNPMes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12437MaqNPMes", A12437MaqNPMes);
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A12444MaqAnyNP = (short)(GXutil.lval( httpContext.GetPar( "MaqAnyNP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
               A12445MaqMesNP = (byte)(GXutil.lval( httpContext.GetPar( "MaqMesNP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
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
                        e111KF2 ();
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
            initAll1KF1721( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1722_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1722_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1KF1721( ) ;
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

   public void confirm_1KF0( )
   {
      beforeValidate1KF1721( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KF1721( ) ;
         }
         else
         {
            checkExtendedTable1KF1721( ) ;
            if ( AnyError == 0 )
            {
               zm1KF1721( 2) ;
               zm1KF1721( 3) ;
            }
            closeExtendedTableCursors1KF1721( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1721 = Gx_mode ;
         confirm_1KF1722( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1721 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KF0( ) ;
      }
   }

   public void confirm_1KF1722( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1KF1722( ) ;
         if ( ( nRcdExists_1722 != 0 ) || ( nIsMod_1722 != 0 ) )
         {
            getKey1KF1722( ) ;
            if ( ( nRcdExists_1722 == 0 ) && ( nRcdDeleted_1722 == 0 ) )
            {
               if ( RcdFound1722 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KF1722( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KF1722( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1KF1722( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQNPDIA_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqNPdia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1722 != 0 )
               {
                  if ( nRcdDeleted_1722 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KF1722( ) ;
                     load1KF1722( ) ;
                     beforeValidate1KF1722( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KF1722( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1722 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KF1722( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KF1722( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1KF1722( ) ;
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
                  if ( nRcdDeleted_1722 == 0 )
                  {
                     GXCCtl = "MAQNPDIA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqNPdia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1722_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqNPdia_Internalname, GXutil.ltrim( localUtil.ntoc( A12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqNPI1i_Internalname, localUtil.ttoc( A12438MaqNPI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPf1f_Internalname, localUtil.ttoc( A12439MaqNPf1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI2i_Internalname, localUtil.ttoc( A12440MaqNPI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI2f_Internalname, localUtil.ttoc( A12441MaqNPI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI3i_Internalname, localUtil.ttoc( A12442MaqNPI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI3f_Internalname, localUtil.ttoc( A12443MaqNPI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12446MaqNPdia_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12438MaqNPI1i_"+sGXsfl_50_idx, localUtil.ttoc( Z12438MaqNPI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12439MaqNPf1f_"+sGXsfl_50_idx, localUtil.ttoc( Z12439MaqNPf1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12440MaqNPI2i_"+sGXsfl_50_idx, localUtil.ttoc( Z12440MaqNPI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12441MaqNPI2f_"+sGXsfl_50_idx, localUtil.ttoc( Z12441MaqNPI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12442MaqNPI3i_"+sGXsfl_50_idx, localUtil.ttoc( Z12442MaqNPI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12443MaqNPI3f_"+sGXsfl_50_idx, localUtil.ttoc( Z12443MaqNPI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1722 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1722_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1722_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPDIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPdia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPF1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPf1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KF0( )
   {
   }

   public void e111KF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmaqnp1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tmaqnp1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmaqnp1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqnp1_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqnp1_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmaqnp1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KF1721( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12437MaqNPMes = T01KF5_A12437MaqNPMes[0] ;
         }
         else
         {
            Z12437MaqNPMes = A12437MaqNPMes ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12444MaqAnyNP = A12444MaqAnyNP ;
         Z12445MaqMesNP = A12445MaqMesNP ;
         Z12437MaqNPMes = A12437MaqNPMes ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TMAQNP1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01KF6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KF6_A407EmprNom[0] ;
      n407EmprNom = T01KF6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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

   public void load1KF1721( )
   {
      /* Using cursor T01KF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1721 = (short)(1) ;
         A407EmprNom = T01KF8_A407EmprNom[0] ;
         n407EmprNom = T01KF8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12437MaqNPMes = T01KF8_A12437MaqNPMes[0] ;
         n12437MaqNPMes = T01KF8_n12437MaqNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12437MaqNPMes", A12437MaqNPMes);
         zm1KF1721( -1) ;
      }
      pr_default.close(6);
      onLoadActions1KF1721( ) ;
   }

   public void onLoadActions1KF1721( )
   {
   }

   public void checkExtendedTable1KF1721( )
   {
      nIsDirty_1721 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01KF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1KF1721( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01KF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1KF1721( )
   {
      /* Using cursor T01KF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1721 = (short)(1) ;
      }
      else
      {
         RcdFound1721 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01KF5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KF1721( 1) ;
         RcdFound1721 = (short)(1) ;
         A12444MaqAnyNP = T01KF5_A12444MaqAnyNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
         A12445MaqMesNP = T01KF5_A12445MaqMesNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
         A12437MaqNPMes = T01KF5_A12437MaqNPMes[0] ;
         n12437MaqNPMes = T01KF5_n12437MaqNPMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12437MaqNPMes", A12437MaqNPMes);
         A602MaqCod = T01KF5_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z12444MaqAnyNP = A12444MaqAnyNP ;
         Z12445MaqMesNP = A12445MaqMesNP ;
         sMode1721 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KF1721( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1721 = (short)(0) ;
            initializeNonKey1KF1721( ) ;
         }
         Gx_mode = sMode1721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1721 = (short)(0) ;
         initializeNonKey1KF1721( ) ;
         sMode1721 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1KF1721( ) ;
      if ( RcdFound1721 == 0 )
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
      RcdFound1721 = (short)(0) ;
      /* Using cursor T01KF11 */
      pr_default.execute(9, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Short.valueOf(A12444MaqAnyNP), A602MaqCod, Byte.valueOf(A12445MaqMesNP), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF11_A12444MaqAnyNP[0] < A12444MaqAnyNP ) || ( T01KF11_A12444MaqAnyNP[0] == A12444MaqAnyNP ) && ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF11_A12445MaqMesNP[0] < A12445MaqMesNP ) ) && ( GXutil.strcmp(T01KF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF11_A12444MaqAnyNP[0] > A12444MaqAnyNP ) || ( T01KF11_A12444MaqAnyNP[0] == A12444MaqAnyNP ) && ( GXutil.strcmp(T01KF11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF11_A12445MaqMesNP[0] > A12445MaqMesNP ) ) && ( GXutil.strcmp(T01KF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01KF11_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12444MaqAnyNP = T01KF11_A12444MaqAnyNP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
            A12445MaqMesNP = T01KF11_A12445MaqMesNP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
            RcdFound1721 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1721 = (short)(0) ;
      /* Using cursor T01KF12 */
      pr_default.execute(10, new Object[] {A602MaqCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Short.valueOf(A12444MaqAnyNP), A602MaqCod, Byte.valueOf(A12445MaqMesNP), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF12_A12444MaqAnyNP[0] > A12444MaqAnyNP ) || ( T01KF12_A12444MaqAnyNP[0] == A12444MaqAnyNP ) && ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF12_A12445MaqMesNP[0] > A12445MaqMesNP ) ) && ( GXutil.strcmp(T01KF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF12_A12444MaqAnyNP[0] < A12444MaqAnyNP ) || ( T01KF12_A12444MaqAnyNP[0] == A12444MaqAnyNP ) && ( GXutil.strcmp(T01KF12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T01KF12_A12445MaqMesNP[0] < A12445MaqMesNP ) ) && ( GXutil.strcmp(T01KF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T01KF12_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12444MaqAnyNP = T01KF12_A12444MaqAnyNP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
            A12445MaqMesNP = T01KF12_A12445MaqMesNP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
            RcdFound1721 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KF1721( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KF1721( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1721 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12444MaqAnyNP != Z12444MaqAnyNP ) || ( A12445MaqMesNP != Z12445MaqMesNP ) )
            {
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A12444MaqAnyNP = Z12444MaqAnyNP ;
               httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
               A12445MaqMesNP = Z12445MaqMesNP ;
               httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KF1721( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12444MaqAnyNP != Z12444MaqAnyNP ) || ( A12445MaqMesNP != Z12445MaqMesNP ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KF1721( ) ;
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
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KF1721( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12444MaqAnyNP != Z12444MaqAnyNP ) || ( A12445MaqMesNP != Z12445MaqMesNP ) )
      {
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12444MaqAnyNP = Z12444MaqAnyNP ;
         httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
         A12445MaqMesNP = Z12445MaqMesNP ;
         httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
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
      getKey1KF1721( ) ;
      if ( RcdFound1721 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12444MaqAnyNP != Z12444MaqAnyNP ) || ( A12445MaqMesNP != Z12445MaqMesNP ) )
         {
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A12444MaqAnyNP = Z12444MaqAnyNP ;
            httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
            A12445MaqMesNP = Z12445MaqMesNP ;
            httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A12444MaqAnyNP != Z12444MaqAnyNP ) || ( A12445MaqMesNP != Z12445MaqMesNP ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqnp1");
      GX_FocusControl = edtMaqNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KF0( ) ;
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
      if ( RcdFound1721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KF1721( ) ;
      if ( RcdFound1721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KF1721( ) ;
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
      if ( RcdFound1721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqNPMes_Internalname ;
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
      if ( RcdFound1721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqNPMes_Internalname ;
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
      scanStart1KF1721( ) ;
      if ( RcdFound1721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1721 != 0 )
         {
            scanNext1KF1721( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqNPMes_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KF1721( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KF1721( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQNP1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z12437MaqNPMes, T01KF4_A12437MaqNPMes[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12437MaqNPMes, T01KF4_A12437MaqNPMes[0]) != 0 )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPMes");
               GXutil.writeLogRaw("Old: ",Z12437MaqNPMes);
               GXutil.writeLogRaw("Current: ",T01KF4_A12437MaqNPMes[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQNP1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KF1721( )
   {
      beforeValidate1KF1721( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KF1721( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KF1721( 0) ;
         checkOptimisticConcurrency1KF1721( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KF1721( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KF1721( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KF13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Boolean.valueOf(n12437MaqNPMes), A12437MaqNPMes, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP1");
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
                        processLevel1KF1721( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KF0( ) ;
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
            load1KF1721( ) ;
         }
         endLevel1KF1721( ) ;
      }
      closeExtendedTableCursors1KF1721( ) ;
   }

   public void update1KF1721( )
   {
      beforeValidate1KF1721( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KF1721( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KF1721( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KF1721( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KF1721( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KF14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n12437MaqNPMes), A12437MaqNPMes, A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP1");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQNP1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KF1721( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KF1721( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KF0( ) ;
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
         endLevel1KF1721( ) ;
      }
      closeExtendedTableCursors1KF1721( ) ;
   }

   public void deferredUpdate1KF1721( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KF1721( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KF1721( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KF1721( ) ;
         afterConfirm1KF1721( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KF1721( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KF1722( ) ;
               while ( RcdFound1722 != 0 )
               {
                  getByPrimaryKey1KF1722( ) ;
                  delete1KF1722( ) ;
                  scanNext1KF1722( ) ;
               }
               scanEnd1KF1722( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KF15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1721 == 0 )
                        {
                           initAll1KF1721( ) ;
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
                        resetCaption1KF0( ) ;
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
      sMode1721 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KF1721( ) ;
      Gx_mode = sMode1721 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KF1721( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1KF1722( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1KF1722( ) ;
         if ( ( nRcdExists_1722 != 0 ) || ( nIsMod_1722 != 0 ) )
         {
            standaloneNotModal1KF1722( ) ;
            getKey1KF1722( ) ;
            if ( ( nRcdExists_1722 == 0 ) && ( nRcdDeleted_1722 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KF1722( ) ;
            }
            else
            {
               if ( RcdFound1722 != 0 )
               {
                  if ( ( nRcdDeleted_1722 != 0 ) && ( nRcdExists_1722 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KF1722( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1722 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KF1722( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1722 == 0 )
                  {
                     GXCCtl = "MAQNPDIA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqNPdia_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1722_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqNPdia_Internalname, GXutil.ltrim( localUtil.ntoc( A12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqNPI1i_Internalname, localUtil.ttoc( A12438MaqNPI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPf1f_Internalname, localUtil.ttoc( A12439MaqNPf1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI2i_Internalname, localUtil.ttoc( A12440MaqNPI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI2f_Internalname, localUtil.ttoc( A12441MaqNPI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI3i_Internalname, localUtil.ttoc( A12442MaqNPI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqNPI3f_Internalname, localUtil.ttoc( A12443MaqNPI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12446MaqNPdia_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12438MaqNPI1i_"+sGXsfl_50_idx, localUtil.ttoc( Z12438MaqNPI1i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12439MaqNPf1f_"+sGXsfl_50_idx, localUtil.ttoc( Z12439MaqNPf1f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12440MaqNPI2i_"+sGXsfl_50_idx, localUtil.ttoc( Z12440MaqNPI2i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12441MaqNPI2f_"+sGXsfl_50_idx, localUtil.ttoc( Z12441MaqNPI2f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12442MaqNPI3i_"+sGXsfl_50_idx, localUtil.ttoc( Z12442MaqNPI3i, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12443MaqNPI3f_"+sGXsfl_50_idx, localUtil.ttoc( Z12443MaqNPI3f, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1722_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1722 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1722_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1722_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPDIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPdia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI1i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPF1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPf1f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3i_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQNPI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KF1722( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1722 = (short)(0) ;
      nIsMod_1722 = (short)(0) ;
      nRcdDeleted_1722 = (short)(0) ;
   }

   public void processLevel1KF1721( )
   {
      /* Save parent mode. */
      sMode1721 = Gx_mode ;
      processNestedLevel1KF1722( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1721 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KF1721( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KF1721( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqnp1");
         if ( AnyError == 0 )
         {
            confirmValues1KF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqnp1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KF1721( )
   {
      /* Scan By routine */
      /* Using cursor T01KF16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1721 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1721 = (short)(1) ;
         A602MaqCod = T01KF16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12444MaqAnyNP = T01KF16_A12444MaqAnyNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
         A12445MaqMesNP = T01KF16_A12445MaqMesNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KF1721( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1721 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1721 = (short)(1) ;
         A602MaqCod = T01KF16_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A12444MaqAnyNP = T01KF16_A12444MaqAnyNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
         A12445MaqMesNP = T01KF16_A12445MaqMesNP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
      }
   }

   public void scanEnd1KF1721( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1KF1721( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KF1721( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KF1721( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KF1721( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KF1721( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KF1721( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KF1721( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqAnyNP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAnyNP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAnyNP_Enabled), 5, 0), true);
      edtMaqMesNP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqMesNP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqMesNP_Enabled), 5, 0), true);
      edtMaqNPMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPMes_Enabled), 5, 0), true);
   }

   public void zm1KF1722( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12438MaqNPI1i = T01KF3_A12438MaqNPI1i[0] ;
            Z12439MaqNPf1f = T01KF3_A12439MaqNPf1f[0] ;
            Z12440MaqNPI2i = T01KF3_A12440MaqNPI2i[0] ;
            Z12441MaqNPI2f = T01KF3_A12441MaqNPI2f[0] ;
            Z12442MaqNPI3i = T01KF3_A12442MaqNPI3i[0] ;
            Z12443MaqNPI3f = T01KF3_A12443MaqNPI3f[0] ;
         }
         else
         {
            Z12438MaqNPI1i = A12438MaqNPI1i ;
            Z12439MaqNPf1f = A12439MaqNPf1f ;
            Z12440MaqNPI2i = A12440MaqNPI2i ;
            Z12441MaqNPI2f = A12441MaqNPI2f ;
            Z12442MaqNPI3i = A12442MaqNPI3i ;
            Z12443MaqNPI3f = A12443MaqNPI3f ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z602MaqCod = A602MaqCod ;
         Z12444MaqAnyNP = A12444MaqAnyNP ;
         Z12445MaqMesNP = A12445MaqMesNP ;
         Z12446MaqNPdia = A12446MaqNPdia ;
         Z12438MaqNPI1i = A12438MaqNPI1i ;
         Z12439MaqNPf1f = A12439MaqNPf1f ;
         Z12440MaqNPI2i = A12440MaqNPI2i ;
         Z12441MaqNPI2f = A12441MaqNPI2f ;
         Z12442MaqNPI3i = A12442MaqNPI3i ;
         Z12443MaqNPI3f = A12443MaqNPI3f ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1KF1722( )
   {
   }

   public void standaloneModal1KF1722( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqNPdia_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqNPdia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPdia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtMaqNPdia_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqNPdia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPdia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1KF1722( )
   {
      /* Using cursor T01KF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1722 = (short)(1) ;
         A12438MaqNPI1i = T01KF17_A12438MaqNPI1i[0] ;
         n12438MaqNPI1i = T01KF17_n12438MaqNPI1i[0] ;
         A12439MaqNPf1f = T01KF17_A12439MaqNPf1f[0] ;
         n12439MaqNPf1f = T01KF17_n12439MaqNPf1f[0] ;
         A12440MaqNPI2i = T01KF17_A12440MaqNPI2i[0] ;
         n12440MaqNPI2i = T01KF17_n12440MaqNPI2i[0] ;
         A12441MaqNPI2f = T01KF17_A12441MaqNPI2f[0] ;
         n12441MaqNPI2f = T01KF17_n12441MaqNPI2f[0] ;
         A12442MaqNPI3i = T01KF17_A12442MaqNPI3i[0] ;
         n12442MaqNPI3i = T01KF17_n12442MaqNPI3i[0] ;
         A12443MaqNPI3f = T01KF17_A12443MaqNPI3f[0] ;
         n12443MaqNPI3f = T01KF17_n12443MaqNPI3f[0] ;
         zm1KF1722( -4) ;
      }
      pr_default.close(15);
      onLoadActions1KF1722( ) ;
   }

   public void onLoadActions1KF1722( )
   {
   }

   public void checkExtendedTable1KF1722( )
   {
      nIsDirty_1722 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KF1722( ) ;
   }

   public void closeExtendedTableCursors1KF1722( )
   {
   }

   public void enableDisable1KF1722( )
   {
   }

   public void getKey1KF1722( )
   {
      /* Using cursor T01KF18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1722 = (short)(1) ;
      }
      else
      {
         RcdFound1722 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1KF1722( )
   {
      /* Using cursor T01KF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KF1722( 4) ;
         RcdFound1722 = (short)(1) ;
         initializeNonKey1KF1722( ) ;
         A12446MaqNPdia = T01KF3_A12446MaqNPdia[0] ;
         A12438MaqNPI1i = T01KF3_A12438MaqNPI1i[0] ;
         n12438MaqNPI1i = T01KF3_n12438MaqNPI1i[0] ;
         A12439MaqNPf1f = T01KF3_A12439MaqNPf1f[0] ;
         n12439MaqNPf1f = T01KF3_n12439MaqNPf1f[0] ;
         A12440MaqNPI2i = T01KF3_A12440MaqNPI2i[0] ;
         n12440MaqNPI2i = T01KF3_n12440MaqNPI2i[0] ;
         A12441MaqNPI2f = T01KF3_A12441MaqNPI2f[0] ;
         n12441MaqNPI2f = T01KF3_n12441MaqNPI2f[0] ;
         A12442MaqNPI3i = T01KF3_A12442MaqNPI3i[0] ;
         n12442MaqNPI3i = T01KF3_n12442MaqNPI3i[0] ;
         A12443MaqNPI3f = T01KF3_A12443MaqNPI3f[0] ;
         n12443MaqNPI3f = T01KF3_n12443MaqNPI3f[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z12444MaqAnyNP = A12444MaqAnyNP ;
         Z12445MaqMesNP = A12445MaqMesNP ;
         Z12446MaqNPdia = A12446MaqNPdia ;
         sMode1722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KF1722( ) ;
         load1KF1722( ) ;
         Gx_mode = sMode1722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1722 = (short)(0) ;
         initializeNonKey1KF1722( ) ;
         sMode1722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KF1722( ) ;
         Gx_mode = sMode1722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KF1722( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KF1722( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQNP2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z12438MaqNPI1i, T01KF2_A12438MaqNPI1i[0]) ) || !( GXutil.dateCompare(Z12439MaqNPf1f, T01KF2_A12439MaqNPf1f[0]) ) || !( GXutil.dateCompare(Z12440MaqNPI2i, T01KF2_A12440MaqNPI2i[0]) ) || !( GXutil.dateCompare(Z12441MaqNPI2f, T01KF2_A12441MaqNPI2f[0]) ) || !( GXutil.dateCompare(Z12442MaqNPI3i, T01KF2_A12442MaqNPI3i[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z12443MaqNPI3f, T01KF2_A12443MaqNPI3f[0]) ) )
         {
            if ( !( GXutil.dateCompare(Z12438MaqNPI1i, T01KF2_A12438MaqNPI1i[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPI1i");
               GXutil.writeLogRaw("Old: ",Z12438MaqNPI1i);
               GXutil.writeLogRaw("Current: ",T01KF2_A12438MaqNPI1i[0]);
            }
            if ( !( GXutil.dateCompare(Z12439MaqNPf1f, T01KF2_A12439MaqNPf1f[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPf1f");
               GXutil.writeLogRaw("Old: ",Z12439MaqNPf1f);
               GXutil.writeLogRaw("Current: ",T01KF2_A12439MaqNPf1f[0]);
            }
            if ( !( GXutil.dateCompare(Z12440MaqNPI2i, T01KF2_A12440MaqNPI2i[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPI2i");
               GXutil.writeLogRaw("Old: ",Z12440MaqNPI2i);
               GXutil.writeLogRaw("Current: ",T01KF2_A12440MaqNPI2i[0]);
            }
            if ( !( GXutil.dateCompare(Z12441MaqNPI2f, T01KF2_A12441MaqNPI2f[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPI2f");
               GXutil.writeLogRaw("Old: ",Z12441MaqNPI2f);
               GXutil.writeLogRaw("Current: ",T01KF2_A12441MaqNPI2f[0]);
            }
            if ( !( GXutil.dateCompare(Z12442MaqNPI3i, T01KF2_A12442MaqNPI3i[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPI3i");
               GXutil.writeLogRaw("Old: ",Z12442MaqNPI3i);
               GXutil.writeLogRaw("Current: ",T01KF2_A12442MaqNPI3i[0]);
            }
            if ( !( GXutil.dateCompare(Z12443MaqNPI3f, T01KF2_A12443MaqNPI3f[0]) ) )
            {
               GXutil.writeLogln("tmaqnp1:[seudo value changed for attri]"+"MaqNPI3f");
               GXutil.writeLogRaw("Old: ",Z12443MaqNPI3f);
               GXutil.writeLogRaw("Current: ",T01KF2_A12443MaqNPI3f[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQNP2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KF1722( )
   {
      beforeValidate1KF1722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KF1722( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KF1722( 0) ;
         checkOptimisticConcurrency1KF1722( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KF1722( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KF1722( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KF19 */
                  pr_default.execute(17, new Object[] {A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia), Boolean.valueOf(n12438MaqNPI1i), A12438MaqNPI1i, Boolean.valueOf(n12439MaqNPf1f), A12439MaqNPf1f, Boolean.valueOf(n12440MaqNPI2i), A12440MaqNPI2i, Boolean.valueOf(n12441MaqNPI2f), A12441MaqNPI2f, Boolean.valueOf(n12442MaqNPI3i), A12442MaqNPI3i, Boolean.valueOf(n12443MaqNPI3f), A12443MaqNPI3f, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP2");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load1KF1722( ) ;
         }
         endLevel1KF1722( ) ;
      }
      closeExtendedTableCursors1KF1722( ) ;
   }

   public void update1KF1722( )
   {
      beforeValidate1KF1722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KF1722( ) ;
      }
      if ( ( nIsMod_1722 != 0 ) || ( nIsDirty_1722 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KF1722( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KF1722( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KF1722( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01KF20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n12438MaqNPI1i), A12438MaqNPI1i, Boolean.valueOf(n12439MaqNPf1f), A12439MaqNPf1f, Boolean.valueOf(n12440MaqNPI2i), A12440MaqNPI2i, Boolean.valueOf(n12441MaqNPI2f), A12441MaqNPI2f, Boolean.valueOf(n12442MaqNPI3i), A12442MaqNPI3i, Boolean.valueOf(n12443MaqNPI3f), A12443MaqNPI3f, A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP2");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQNP2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1KF1722( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KF1722( ) ;
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
            endLevel1KF1722( ) ;
         }
      }
      closeExtendedTableCursors1KF1722( ) ;
   }

   public void deferredUpdate1KF1722( )
   {
   }

   public void delete1KF1722( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KF1722( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KF1722( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KF1722( ) ;
         afterConfirm1KF1722( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KF1722( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KF21 */
               pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP), Byte.valueOf(A12446MaqNPdia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQNP2");
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
      sMode1722 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KF1722( ) ;
      Gx_mode = sMode1722 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KF1722( )
   {
      standaloneModal1KF1722( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KF1722( )
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

   public void scanStart1KF1722( )
   {
      /* Scan By routine */
      /* Using cursor T01KF22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A12444MaqAnyNP), Byte.valueOf(A12445MaqMesNP)});
      RcdFound1722 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1722 = (short)(1) ;
         A12446MaqNPdia = T01KF22_A12446MaqNPdia[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KF1722( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1722 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1722 = (short)(1) ;
         A12446MaqNPdia = T01KF22_A12446MaqNPdia[0] ;
      }
   }

   public void scanEnd1KF1722( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1KF1722( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KF1722( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KF1722( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KF1722( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KF1722( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KF1722( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KF1722( )
   {
      edtMaqNPdia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPdia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPdia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPI1i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI1i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI1i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPf1f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPf1f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPf1f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPI2i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI2i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI2i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPI2f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI2f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI2f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPI3i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI3i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI3i_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqNPI3f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPI3f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPI3f_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1KF1722( )
   {
   }

   public void send_integrity_lvl_hashes1KF1721( )
   {
   }

   public void subsflControlProps_501722( )
   {
      edtavnRcdDeleted_1722_Internalname = "vNRCDDELETED_1722_"+sGXsfl_50_idx ;
      edtMaqNPdia_Internalname = "MAQNPDIA_"+sGXsfl_50_idx ;
      edtMaqNPI1i_Internalname = "MAQNPI1I_"+sGXsfl_50_idx ;
      edtMaqNPf1f_Internalname = "MAQNPF1F_"+sGXsfl_50_idx ;
      edtMaqNPI2i_Internalname = "MAQNPI2I_"+sGXsfl_50_idx ;
      edtMaqNPI2f_Internalname = "MAQNPI2F_"+sGXsfl_50_idx ;
      edtMaqNPI3i_Internalname = "MAQNPI3I_"+sGXsfl_50_idx ;
      edtMaqNPI3f_Internalname = "MAQNPI3F_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501722( )
   {
      edtavnRcdDeleted_1722_Internalname = "vNRCDDELETED_1722_"+sGXsfl_50_fel_idx ;
      edtMaqNPdia_Internalname = "MAQNPDIA_"+sGXsfl_50_fel_idx ;
      edtMaqNPI1i_Internalname = "MAQNPI1I_"+sGXsfl_50_fel_idx ;
      edtMaqNPf1f_Internalname = "MAQNPF1F_"+sGXsfl_50_fel_idx ;
      edtMaqNPI2i_Internalname = "MAQNPI2I_"+sGXsfl_50_fel_idx ;
      edtMaqNPI2f_Internalname = "MAQNPI2F_"+sGXsfl_50_fel_idx ;
      edtMaqNPI3i_Internalname = "MAQNPI3I_"+sGXsfl_50_fel_idx ;
      edtMaqNPI3f_Internalname = "MAQNPI3F_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1KF1722( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501722( ) ;
      sendRow1KF1722( ) ;
   }

   public void sendRow1KF1722( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1722_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1722_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1722), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1722), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1722_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1722_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPdia_Internalname,GXutil.ltrim( localUtil.ntoc( A12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12446MaqNPdia), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPdia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPdia_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPI1i_Internalname,localUtil.ttoc( A12438MaqNPI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12438MaqNPI1i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPI1i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPI1i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPf1f_Internalname,localUtil.ttoc( A12439MaqNPf1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12439MaqNPf1f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPf1f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPf1f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPI2i_Internalname,localUtil.ttoc( A12440MaqNPI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12440MaqNPI2i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPI2i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPI2i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPI2f_Internalname,localUtil.ttoc( A12441MaqNPI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12441MaqNPI2f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPI2f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPI2f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPI3i_Internalname,localUtil.ttoc( A12442MaqNPI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12442MaqNPI3i, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPI3i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPI3i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1722_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqNPI3f_Internalname,localUtil.ttoc( A12443MaqNPI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12443MaqNPI3f, "99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqNPI3f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqNPI3f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"GeneXus\\Time","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KF1722( ) ;
      GXCCtl = "Z12446MaqNPdia_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12446MaqNPdia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12438MaqNPI1i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12438MaqNPI1i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12439MaqNPf1f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12439MaqNPf1f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12440MaqNPI2i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12440MaqNPI2i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12441MaqNPI2f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12441MaqNPI2f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12442MaqNPI3i_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12442MaqNPI3i, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12443MaqNPI3f_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12443MaqNPI3f, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1722_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1722_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1722_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1722_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1722_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPDIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPdia_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPI1I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPF1F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPf1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPI2I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPI2F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPI3I_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQNPI3F_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KF1722( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501722( ) ;
      edtavnRcdDeleted_1722_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1722_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPdia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPDIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPI1i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI1I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPf1f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPF1F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPI2i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI2I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPI2f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI2F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPI3i_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI3I_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqNPI3f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQNPI3F_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1722");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1722_Internalname ;
         wbErr = true ;
         nRcdDeleted_1722 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1722 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqNPdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqNPdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MAQNPDIA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPdia_Internalname ;
         wbErr = true ;
         A12446MaqNPdia = (byte)(0) ;
      }
      else
      {
         A12446MaqNPdia = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqNPdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPI1i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPI1I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPI1i_Internalname ;
         wbErr = true ;
         A12438MaqNPI1i = GXutil.resetTime( GXutil.nullDate() );
         n12438MaqNPI1i = false ;
      }
      else
      {
         A12438MaqNPI1i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPI1i_Internalname))) ;
         n12438MaqNPI1i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPf1f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPF1F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPf1f_Internalname ;
         wbErr = true ;
         A12439MaqNPf1f = GXutil.resetTime( GXutil.nullDate() );
         n12439MaqNPf1f = false ;
      }
      else
      {
         A12439MaqNPf1f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPf1f_Internalname))) ;
         n12439MaqNPf1f = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPI2i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPI2I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPI2i_Internalname ;
         wbErr = true ;
         A12440MaqNPI2i = GXutil.resetTime( GXutil.nullDate() );
         n12440MaqNPI2i = false ;
      }
      else
      {
         A12440MaqNPI2i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPI2i_Internalname))) ;
         n12440MaqNPI2i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPI2f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPI2F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPI2f_Internalname ;
         wbErr = true ;
         A12441MaqNPI2f = GXutil.resetTime( GXutil.nullDate() );
         n12441MaqNPI2f = false ;
      }
      else
      {
         A12441MaqNPI2f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPI2f_Internalname))) ;
         n12441MaqNPI2f = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPI3i_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPI3I_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPI3i_Internalname ;
         wbErr = true ;
         A12442MaqNPI3i = GXutil.resetTime( GXutil.nullDate() );
         n12442MaqNPI3i = false ;
      }
      else
      {
         A12442MaqNPI3i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPI3i_Internalname))) ;
         n12442MaqNPI3i = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMaqNPI3f_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MAQNPI3F_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqNPI3f_Internalname ;
         wbErr = true ;
         A12443MaqNPI3f = GXutil.resetTime( GXutil.nullDate() );
         n12443MaqNPI3f = false ;
      }
      else
      {
         A12443MaqNPI3f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtMaqNPI3f_Internalname))) ;
         n12443MaqNPI3f = false ;
      }
      GXCCtl = "Z12446MaqNPdia_" + sGXsfl_50_idx ;
      Z12446MaqNPdia = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12438MaqNPI1i_" + sGXsfl_50_idx ;
      Z12438MaqNPI1i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z12439MaqNPf1f_" + sGXsfl_50_idx ;
      Z12439MaqNPf1f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z12440MaqNPI2i_" + sGXsfl_50_idx ;
      Z12440MaqNPI2i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z12441MaqNPI2f_" + sGXsfl_50_idx ;
      Z12441MaqNPI2f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z12442MaqNPI3i_" + sGXsfl_50_idx ;
      Z12442MaqNPI3i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z12443MaqNPI3f_" + sGXsfl_50_idx ;
      Z12443MaqNPI3f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "nRcdDeleted_1722_" + sGXsfl_50_idx ;
      nRcdDeleted_1722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1722_" + sGXsfl_50_idx ;
      nRcdExists_1722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1722_" + sGXsfl_50_idx ;
      nIsMod_1722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqNPdia_Enabled = edtMaqNPdia_Enabled ;
   }

   public void confirmValues1KF0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501722( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501722( ) ;
         httpContext.changePostValue( "Z12446MaqNPdia_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12446MaqNPdia_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12446MaqNPdia_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12438MaqNPI1i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12438MaqNPI1i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12438MaqNPI1i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12439MaqNPf1f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12439MaqNPf1f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12439MaqNPf1f_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12440MaqNPI2i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12440MaqNPI2i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12440MaqNPI2i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12441MaqNPI2f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12441MaqNPI2f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12441MaqNPI2f_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12442MaqNPI3i_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12442MaqNPI3i_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12442MaqNPI3i_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12443MaqNPI3f_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12443MaqNPI3f_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12443MaqNPI3f_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqnp1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12444MaqAnyNP", GXutil.ltrim( localUtil.ntoc( Z12444MaqAnyNP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12445MaqMesNP", GXutil.ltrim( localUtil.ntoc( Z12445MaqMesNP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12437MaqNPMes", GXutil.rtrim( Z12437MaqNPMes));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmaqnp1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQNP1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "") ;
   }

   public void initializeNonKey1KF1721( )
   {
      A12437MaqNPMes = "" ;
      n12437MaqNPMes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12437MaqNPMes", A12437MaqNPMes);
      Z12437MaqNPMes = "" ;
   }

   public void initAll1KF1721( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A12444MaqAnyNP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12444MaqAnyNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12444MaqAnyNP), 4, 0));
      A12445MaqMesNP = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12445MaqMesNP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12445MaqMesNP), 2, 0));
      initializeNonKey1KF1721( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KF1722( )
   {
      A12438MaqNPI1i = GXutil.resetTime( GXutil.nullDate() );
      n12438MaqNPI1i = false ;
      A12439MaqNPf1f = GXutil.resetTime( GXutil.nullDate() );
      n12439MaqNPf1f = false ;
      A12440MaqNPI2i = GXutil.resetTime( GXutil.nullDate() );
      n12440MaqNPI2i = false ;
      A12441MaqNPI2f = GXutil.resetTime( GXutil.nullDate() );
      n12441MaqNPI2f = false ;
      A12442MaqNPI3i = GXutil.resetTime( GXutil.nullDate() );
      n12442MaqNPI3i = false ;
      A12443MaqNPI3f = GXutil.resetTime( GXutil.nullDate() );
      n12443MaqNPI3f = false ;
      Z12438MaqNPI1i = GXutil.resetTime( GXutil.nullDate() );
      Z12439MaqNPf1f = GXutil.resetTime( GXutil.nullDate() );
      Z12440MaqNPI2i = GXutil.resetTime( GXutil.nullDate() );
      Z12441MaqNPI2f = GXutil.resetTime( GXutil.nullDate() );
      Z12442MaqNPI3i = GXutil.resetTime( GXutil.nullDate() );
      Z12443MaqNPI3f = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1KF1722( )
   {
      A12446MaqNPdia = (byte)(0) ;
      initializeNonKey1KF1722( ) ;
   }

   public void standaloneModalInsert1KF1722( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584519", true, true);
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
      httpContext.AddJavascriptSource("tmaqnp1.js", "?20268241584519", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1722( )
   {
      edtMaqNPdia_Enabled = defedtMaqNPdia_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqNPdia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqNPdia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1722, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1722_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12446MaqNPdia, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPdia_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12438MaqNPI1i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI1i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12439MaqNPf1f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPf1f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12440MaqNPI2i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12441MaqNPI2f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI2f_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12442MaqNPI3i, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3i_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12443MaqNPI3f, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqNPI3f_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqAnyNP_Internalname = "MAQANYNP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqMesNP_Internalname = "MAQMESNP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqNPMes_Internalname = "MAQNPMES" ;
      edtavnRcdDeleted_1722_Internalname = "vNRCDDELETED_1722" ;
      edtMaqNPdia_Internalname = "MAQNPDIA" ;
      edtMaqNPI1i_Internalname = "MAQNPI1I" ;
      edtMaqNPf1f_Internalname = "MAQNPF1F" ;
      edtMaqNPI2i_Internalname = "MAQNPI2I" ;
      edtMaqNPI2f_Internalname = "MAQNPI2F" ;
      edtMaqNPI3i_Internalname = "MAQNPI3I" ;
      edtMaqNPI3f_Internalname = "MAQNPI3F" ;
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
      Form.setCaption( httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "") );
      edtMaqNPI3f_Jsonclick = "" ;
      edtMaqNPI3i_Jsonclick = "" ;
      edtMaqNPI2f_Jsonclick = "" ;
      edtMaqNPI2i_Jsonclick = "" ;
      edtMaqNPf1f_Jsonclick = "" ;
      edtMaqNPI1i_Jsonclick = "" ;
      edtMaqNPdia_Jsonclick = "" ;
      edtavnRcdDeleted_1722_Jsonclick = "" ;
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
      edtMaqNPI3f_Enabled = 1 ;
      edtMaqNPI3i_Enabled = 1 ;
      edtMaqNPI2f_Enabled = 1 ;
      edtMaqNPI2i_Enabled = 1 ;
      edtMaqNPf1f_Enabled = 1 ;
      edtMaqNPI1i_Enabled = 1 ;
      edtMaqNPdia_Enabled = 1 ;
      edtavnRcdDeleted_1722_Enabled = 1 ;
      edtMaqNPMes_Jsonclick = "" ;
      edtMaqNPMes_Backcolor = (int)(0xFFFFFF) ;
      edtMaqNPMes_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqMesNP_Jsonclick = "" ;
      edtMaqMesNP_Backcolor = (int)(0xFFFFFF) ;
      edtMaqMesNP_Enabled = 1 ;
      edtMaqAnyNP_Jsonclick = "" ;
      edtMaqAnyNP_Backcolor = (int)(0xFFFFFF) ;
      edtMaqAnyNP_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_501722( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KF1722( ) ;
         standaloneModal1KF1722( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KF1722( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501722( ) ;
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
      /* Using cursor T01KF23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KF23_A407EmprNom[0] ;
      n407EmprNom = T01KF23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T01KF24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(22);
      GX_FocusControl = edtMaqNPMes_Internalname ;
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

   public void valid_Maqcod( )
   {
      /* Using cursor T01KF24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maqmesnp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12437MaqNPMes", GXutil.rtrim( A12437MaqNPMes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12444MaqAnyNP", GXutil.ltrim( localUtil.ntoc( Z12444MaqAnyNP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12445MaqMesNP", GXutil.ltrim( localUtil.ntoc( Z12445MaqMesNP, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12437MaqNPMes", GXutil.rtrim( Z12437MaqNPMes));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQANYNP","{handler:'valid_Maqanynp',iparms:[]");
      setEventMetadata("VALID_MAQANYNP",",oparms:[]}");
      setEventMetadata("VALID_MAQMESNP","{handler:'valid_Maqmesnp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12444MaqAnyNP',fld:'MAQANYNP',pic:'ZZZ9'},{av:'A12445MaqMesNP',fld:'MAQMESNP',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQMESNP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12437MaqNPMes',fld:'MAQNPMES',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z12444MaqAnyNP'},{av:'Z12445MaqMesNP'},{av:'Z407EmprNom'},{av:'Z12437MaqNPMes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQNPDIA","{handler:'valid_Maqnpdia',iparms:[]");
      setEventMetadata("VALID_MAQNPDIA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqnpi3f',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z12437MaqNPMes = "" ;
      Z12438MaqNPI1i = GXutil.resetTime( GXutil.nullDate() );
      Z12439MaqNPf1f = GXutil.resetTime( GXutil.nullDate() );
      Z12440MaqNPI2i = GXutil.resetTime( GXutil.nullDate() );
      Z12441MaqNPI2f = GXutil.resetTime( GXutil.nullDate() );
      Z12442MaqNPI3i = GXutil.resetTime( GXutil.nullDate() );
      Z12443MaqNPI3f = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12437MaqNPMes = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1722 = "" ;
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
      sMode1721 = "" ;
      GXCCtl = "" ;
      A12438MaqNPI1i = GXutil.resetTime( GXutil.nullDate() );
      A12439MaqNPf1f = GXutil.resetTime( GXutil.nullDate() );
      A12440MaqNPI2i = GXutil.resetTime( GXutil.nullDate() );
      A12441MaqNPI2f = GXutil.resetTime( GXutil.nullDate() );
      A12442MaqNPI3i = GXutil.resetTime( GXutil.nullDate() );
      A12443MaqNPI3f = GXutil.resetTime( GXutil.nullDate() );
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
      T01KF6_A407EmprNom = new String[] {""} ;
      T01KF6_n407EmprNom = new boolean[] {false} ;
      T01KF8_A12444MaqAnyNP = new short[1] ;
      T01KF8_A12445MaqMesNP = new byte[1] ;
      T01KF8_A407EmprNom = new String[] {""} ;
      T01KF8_n407EmprNom = new boolean[] {false} ;
      T01KF8_A12437MaqNPMes = new String[] {""} ;
      T01KF8_n12437MaqNPMes = new boolean[] {false} ;
      T01KF8_A396EmprCod = new String[] {""} ;
      T01KF8_A602MaqCod = new String[] {""} ;
      T01KF7_A396EmprCod = new String[] {""} ;
      T01KF9_A396EmprCod = new String[] {""} ;
      T01KF10_A396EmprCod = new String[] {""} ;
      T01KF10_A602MaqCod = new String[] {""} ;
      T01KF10_A12444MaqAnyNP = new short[1] ;
      T01KF10_A12445MaqMesNP = new byte[1] ;
      T01KF5_A12444MaqAnyNP = new short[1] ;
      T01KF5_A12445MaqMesNP = new byte[1] ;
      T01KF5_A12437MaqNPMes = new String[] {""} ;
      T01KF5_n12437MaqNPMes = new boolean[] {false} ;
      T01KF5_A396EmprCod = new String[] {""} ;
      T01KF5_A602MaqCod = new String[] {""} ;
      T01KF11_A396EmprCod = new String[] {""} ;
      T01KF11_A602MaqCod = new String[] {""} ;
      T01KF11_A12444MaqAnyNP = new short[1] ;
      T01KF11_A12445MaqMesNP = new byte[1] ;
      T01KF12_A396EmprCod = new String[] {""} ;
      T01KF12_A602MaqCod = new String[] {""} ;
      T01KF12_A12444MaqAnyNP = new short[1] ;
      T01KF12_A12445MaqMesNP = new byte[1] ;
      T01KF4_A12444MaqAnyNP = new short[1] ;
      T01KF4_A12445MaqMesNP = new byte[1] ;
      T01KF4_A12437MaqNPMes = new String[] {""} ;
      T01KF4_n12437MaqNPMes = new boolean[] {false} ;
      T01KF4_A396EmprCod = new String[] {""} ;
      T01KF4_A602MaqCod = new String[] {""} ;
      T01KF16_A396EmprCod = new String[] {""} ;
      T01KF16_A602MaqCod = new String[] {""} ;
      T01KF16_A12444MaqAnyNP = new short[1] ;
      T01KF16_A12445MaqMesNP = new byte[1] ;
      T01KF17_A602MaqCod = new String[] {""} ;
      T01KF17_A12444MaqAnyNP = new short[1] ;
      T01KF17_A12445MaqMesNP = new byte[1] ;
      T01KF17_A12446MaqNPdia = new byte[1] ;
      T01KF17_A12438MaqNPI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12438MaqNPI1i = new boolean[] {false} ;
      T01KF17_A12439MaqNPf1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12439MaqNPf1f = new boolean[] {false} ;
      T01KF17_A12440MaqNPI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12440MaqNPI2i = new boolean[] {false} ;
      T01KF17_A12441MaqNPI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12441MaqNPI2f = new boolean[] {false} ;
      T01KF17_A12442MaqNPI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12442MaqNPI3i = new boolean[] {false} ;
      T01KF17_A12443MaqNPI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF17_n12443MaqNPI3f = new boolean[] {false} ;
      T01KF17_A396EmprCod = new String[] {""} ;
      T01KF18_A396EmprCod = new String[] {""} ;
      T01KF18_A602MaqCod = new String[] {""} ;
      T01KF18_A12444MaqAnyNP = new short[1] ;
      T01KF18_A12445MaqMesNP = new byte[1] ;
      T01KF18_A12446MaqNPdia = new byte[1] ;
      T01KF3_A602MaqCod = new String[] {""} ;
      T01KF3_A12444MaqAnyNP = new short[1] ;
      T01KF3_A12445MaqMesNP = new byte[1] ;
      T01KF3_A12446MaqNPdia = new byte[1] ;
      T01KF3_A12438MaqNPI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12438MaqNPI1i = new boolean[] {false} ;
      T01KF3_A12439MaqNPf1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12439MaqNPf1f = new boolean[] {false} ;
      T01KF3_A12440MaqNPI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12440MaqNPI2i = new boolean[] {false} ;
      T01KF3_A12441MaqNPI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12441MaqNPI2f = new boolean[] {false} ;
      T01KF3_A12442MaqNPI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12442MaqNPI3i = new boolean[] {false} ;
      T01KF3_A12443MaqNPI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF3_n12443MaqNPI3f = new boolean[] {false} ;
      T01KF3_A396EmprCod = new String[] {""} ;
      T01KF2_A602MaqCod = new String[] {""} ;
      T01KF2_A12444MaqAnyNP = new short[1] ;
      T01KF2_A12445MaqMesNP = new byte[1] ;
      T01KF2_A12446MaqNPdia = new byte[1] ;
      T01KF2_A12438MaqNPI1i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12438MaqNPI1i = new boolean[] {false} ;
      T01KF2_A12439MaqNPf1f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12439MaqNPf1f = new boolean[] {false} ;
      T01KF2_A12440MaqNPI2i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12440MaqNPI2i = new boolean[] {false} ;
      T01KF2_A12441MaqNPI2f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12441MaqNPI2f = new boolean[] {false} ;
      T01KF2_A12442MaqNPI3i = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12442MaqNPI3i = new boolean[] {false} ;
      T01KF2_A12443MaqNPI3f = new java.util.Date[] {GXutil.nullDate()} ;
      T01KF2_n12443MaqNPI3f = new boolean[] {false} ;
      T01KF2_A396EmprCod = new String[] {""} ;
      T01KF22_A396EmprCod = new String[] {""} ;
      T01KF22_A602MaqCod = new String[] {""} ;
      T01KF22_A12444MaqAnyNP = new short[1] ;
      T01KF22_A12445MaqMesNP = new byte[1] ;
      T01KF22_A12446MaqNPdia = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01KF23_A407EmprNom = new String[] {""} ;
      T01KF23_n407EmprNom = new boolean[] {false} ;
      T01KF24_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ12437MaqNPMes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqnp1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqnp1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqnp1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqnp1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqnp1__default(),
         new Object[] {
             new Object[] {
            T01KF2_A602MaqCod, T01KF2_A12444MaqAnyNP, T01KF2_A12445MaqMesNP, T01KF2_A12446MaqNPdia, T01KF2_A12438MaqNPI1i, T01KF2_n12438MaqNPI1i, T01KF2_A12439MaqNPf1f, T01KF2_n12439MaqNPf1f, T01KF2_A12440MaqNPI2i, T01KF2_n12440MaqNPI2i,
            T01KF2_A12441MaqNPI2f, T01KF2_n12441MaqNPI2f, T01KF2_A12442MaqNPI3i, T01KF2_n12442MaqNPI3i, T01KF2_A12443MaqNPI3f, T01KF2_n12443MaqNPI3f, T01KF2_A396EmprCod
            }
            , new Object[] {
            T01KF3_A602MaqCod, T01KF3_A12444MaqAnyNP, T01KF3_A12445MaqMesNP, T01KF3_A12446MaqNPdia, T01KF3_A12438MaqNPI1i, T01KF3_n12438MaqNPI1i, T01KF3_A12439MaqNPf1f, T01KF3_n12439MaqNPf1f, T01KF3_A12440MaqNPI2i, T01KF3_n12440MaqNPI2i,
            T01KF3_A12441MaqNPI2f, T01KF3_n12441MaqNPI2f, T01KF3_A12442MaqNPI3i, T01KF3_n12442MaqNPI3i, T01KF3_A12443MaqNPI3f, T01KF3_n12443MaqNPI3f, T01KF3_A396EmprCod
            }
            , new Object[] {
            T01KF4_A12444MaqAnyNP, T01KF4_A12445MaqMesNP, T01KF4_A12437MaqNPMes, T01KF4_n12437MaqNPMes, T01KF4_A396EmprCod, T01KF4_A602MaqCod
            }
            , new Object[] {
            T01KF5_A12444MaqAnyNP, T01KF5_A12445MaqMesNP, T01KF5_A12437MaqNPMes, T01KF5_n12437MaqNPMes, T01KF5_A396EmprCod, T01KF5_A602MaqCod
            }
            , new Object[] {
            T01KF6_A407EmprNom, T01KF6_n407EmprNom
            }
            , new Object[] {
            T01KF7_A396EmprCod
            }
            , new Object[] {
            T01KF8_A12444MaqAnyNP, T01KF8_A12445MaqMesNP, T01KF8_A407EmprNom, T01KF8_n407EmprNom, T01KF8_A12437MaqNPMes, T01KF8_n12437MaqNPMes, T01KF8_A396EmprCod, T01KF8_A602MaqCod
            }
            , new Object[] {
            T01KF9_A396EmprCod
            }
            , new Object[] {
            T01KF10_A396EmprCod, T01KF10_A602MaqCod, T01KF10_A12444MaqAnyNP, T01KF10_A12445MaqMesNP
            }
            , new Object[] {
            T01KF11_A396EmprCod, T01KF11_A602MaqCod, T01KF11_A12444MaqAnyNP, T01KF11_A12445MaqMesNP
            }
            , new Object[] {
            T01KF12_A396EmprCod, T01KF12_A602MaqCod, T01KF12_A12444MaqAnyNP, T01KF12_A12445MaqMesNP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KF16_A396EmprCod, T01KF16_A602MaqCod, T01KF16_A12444MaqAnyNP, T01KF16_A12445MaqMesNP
            }
            , new Object[] {
            T01KF17_A602MaqCod, T01KF17_A12444MaqAnyNP, T01KF17_A12445MaqMesNP, T01KF17_A12446MaqNPdia, T01KF17_A12438MaqNPI1i, T01KF17_n12438MaqNPI1i, T01KF17_A12439MaqNPf1f, T01KF17_n12439MaqNPf1f, T01KF17_A12440MaqNPI2i, T01KF17_n12440MaqNPI2i,
            T01KF17_A12441MaqNPI2f, T01KF17_n12441MaqNPI2f, T01KF17_A12442MaqNPI3i, T01KF17_n12442MaqNPI3i, T01KF17_A12443MaqNPI3f, T01KF17_n12443MaqNPI3f, T01KF17_A396EmprCod
            }
            , new Object[] {
            T01KF18_A396EmprCod, T01KF18_A602MaqCod, T01KF18_A12444MaqAnyNP, T01KF18_A12445MaqMesNP, T01KF18_A12446MaqNPdia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KF22_A396EmprCod, T01KF22_A602MaqCod, T01KF22_A12444MaqAnyNP, T01KF22_A12445MaqMesNP, T01KF22_A12446MaqNPdia
            }
            , new Object[] {
            T01KF23_A407EmprNom, T01KF23_n407EmprNom
            }
            , new Object[] {
            T01KF24_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TMAQNP1" ;
   }

   private byte Z12445MaqMesNP ;
   private byte Z12446MaqNPdia ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12445MaqMesNP ;
   private byte A12446MaqNPdia ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12445MaqMesNP ;
   private short Z12444MaqAnyNP ;
   private short nRcdDeleted_1722 ;
   private short nRcdExists_1722 ;
   private short nIsMod_1722 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12444MaqAnyNP ;
   private short nBlankRcdCount1722 ;
   private short RcdFound1722 ;
   private short nBlankRcdUsr1722 ;
   private short RcdFound1721 ;
   private short nIsDirty_1721 ;
   private short nIsDirty_1722 ;
   private short ZZ12444MaqAnyNP ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqAnyNP_Enabled ;
   private int edtMaqMesNP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqNPMes_Enabled ;
   private int edtavnRcdDeleted_1722_Enabled ;
   private int edtMaqNPdia_Enabled ;
   private int edtMaqNPI1i_Enabled ;
   private int edtMaqNPf1f_Enabled ;
   private int edtMaqNPI2i_Enabled ;
   private int edtMaqNPI2f_Enabled ;
   private int edtMaqNPI3i_Enabled ;
   private int edtMaqNPI3f_Enabled ;
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
   private int defedtMaqNPdia_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqNPMes_Backcolor ;
   private int edtMaqMesNP_Backcolor ;
   private int edtMaqAnyNP_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z12437MaqNPMes ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqAnyNP_Internalname ;
   private String edtMaqAnyNP_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqMesNP_Internalname ;
   private String edtMaqMesNP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqNPMes_Internalname ;
   private String A12437MaqNPMes ;
   private String edtMaqNPMes_Jsonclick ;
   private String sMode1722 ;
   private String edtavnRcdDeleted_1722_Internalname ;
   private String edtMaqNPdia_Internalname ;
   private String edtMaqNPI1i_Internalname ;
   private String edtMaqNPf1f_Internalname ;
   private String edtMaqNPI2i_Internalname ;
   private String edtMaqNPI2f_Internalname ;
   private String edtMaqNPI3i_Internalname ;
   private String edtMaqNPI3f_Internalname ;
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
   private String sMode1721 ;
   private String GXCCtl ;
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
   private String edtavnRcdDeleted_1722_Jsonclick ;
   private String edtMaqNPdia_Jsonclick ;
   private String edtMaqNPI1i_Jsonclick ;
   private String edtMaqNPf1f_Jsonclick ;
   private String edtMaqNPI2i_Jsonclick ;
   private String edtMaqNPI2f_Jsonclick ;
   private String edtMaqNPI3i_Jsonclick ;
   private String edtMaqNPI3f_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ12437MaqNPMes ;
   private java.util.Date Z12438MaqNPI1i ;
   private java.util.Date Z12439MaqNPf1f ;
   private java.util.Date Z12440MaqNPI2i ;
   private java.util.Date Z12441MaqNPI2f ;
   private java.util.Date Z12442MaqNPI3i ;
   private java.util.Date Z12443MaqNPI3f ;
   private java.util.Date A12438MaqNPI1i ;
   private java.util.Date A12439MaqNPf1f ;
   private java.util.Date A12440MaqNPI2i ;
   private java.util.Date A12441MaqNPI2f ;
   private java.util.Date A12442MaqNPI3i ;
   private java.util.Date A12443MaqNPI3f ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12437MaqNPMes ;
   private boolean returnInSub ;
   private boolean n12438MaqNPI1i ;
   private boolean n12439MaqNPf1f ;
   private boolean n12440MaqNPI2i ;
   private boolean n12441MaqNPI2f ;
   private boolean n12442MaqNPI3i ;
   private boolean n12443MaqNPI3f ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KF6_A407EmprNom ;
   private boolean[] T01KF6_n407EmprNom ;
   private short[] T01KF8_A12444MaqAnyNP ;
   private byte[] T01KF8_A12445MaqMesNP ;
   private String[] T01KF8_A407EmprNom ;
   private boolean[] T01KF8_n407EmprNom ;
   private String[] T01KF8_A12437MaqNPMes ;
   private boolean[] T01KF8_n12437MaqNPMes ;
   private String[] T01KF8_A396EmprCod ;
   private String[] T01KF8_A602MaqCod ;
   private String[] T01KF7_A396EmprCod ;
   private String[] T01KF9_A396EmprCod ;
   private String[] T01KF10_A396EmprCod ;
   private String[] T01KF10_A602MaqCod ;
   private short[] T01KF10_A12444MaqAnyNP ;
   private byte[] T01KF10_A12445MaqMesNP ;
   private short[] T01KF5_A12444MaqAnyNP ;
   private byte[] T01KF5_A12445MaqMesNP ;
   private String[] T01KF5_A12437MaqNPMes ;
   private boolean[] T01KF5_n12437MaqNPMes ;
   private String[] T01KF5_A396EmprCod ;
   private String[] T01KF5_A602MaqCod ;
   private String[] T01KF11_A396EmprCod ;
   private String[] T01KF11_A602MaqCod ;
   private short[] T01KF11_A12444MaqAnyNP ;
   private byte[] T01KF11_A12445MaqMesNP ;
   private String[] T01KF12_A396EmprCod ;
   private String[] T01KF12_A602MaqCod ;
   private short[] T01KF12_A12444MaqAnyNP ;
   private byte[] T01KF12_A12445MaqMesNP ;
   private short[] T01KF4_A12444MaqAnyNP ;
   private byte[] T01KF4_A12445MaqMesNP ;
   private String[] T01KF4_A12437MaqNPMes ;
   private boolean[] T01KF4_n12437MaqNPMes ;
   private String[] T01KF4_A396EmprCod ;
   private String[] T01KF4_A602MaqCod ;
   private String[] T01KF16_A396EmprCod ;
   private String[] T01KF16_A602MaqCod ;
   private short[] T01KF16_A12444MaqAnyNP ;
   private byte[] T01KF16_A12445MaqMesNP ;
   private String[] T01KF17_A602MaqCod ;
   private short[] T01KF17_A12444MaqAnyNP ;
   private byte[] T01KF17_A12445MaqMesNP ;
   private byte[] T01KF17_A12446MaqNPdia ;
   private java.util.Date[] T01KF17_A12438MaqNPI1i ;
   private boolean[] T01KF17_n12438MaqNPI1i ;
   private java.util.Date[] T01KF17_A12439MaqNPf1f ;
   private boolean[] T01KF17_n12439MaqNPf1f ;
   private java.util.Date[] T01KF17_A12440MaqNPI2i ;
   private boolean[] T01KF17_n12440MaqNPI2i ;
   private java.util.Date[] T01KF17_A12441MaqNPI2f ;
   private boolean[] T01KF17_n12441MaqNPI2f ;
   private java.util.Date[] T01KF17_A12442MaqNPI3i ;
   private boolean[] T01KF17_n12442MaqNPI3i ;
   private java.util.Date[] T01KF17_A12443MaqNPI3f ;
   private boolean[] T01KF17_n12443MaqNPI3f ;
   private String[] T01KF17_A396EmprCod ;
   private String[] T01KF18_A396EmprCod ;
   private String[] T01KF18_A602MaqCod ;
   private short[] T01KF18_A12444MaqAnyNP ;
   private byte[] T01KF18_A12445MaqMesNP ;
   private byte[] T01KF18_A12446MaqNPdia ;
   private String[] T01KF3_A602MaqCod ;
   private short[] T01KF3_A12444MaqAnyNP ;
   private byte[] T01KF3_A12445MaqMesNP ;
   private byte[] T01KF3_A12446MaqNPdia ;
   private java.util.Date[] T01KF3_A12438MaqNPI1i ;
   private boolean[] T01KF3_n12438MaqNPI1i ;
   private java.util.Date[] T01KF3_A12439MaqNPf1f ;
   private boolean[] T01KF3_n12439MaqNPf1f ;
   private java.util.Date[] T01KF3_A12440MaqNPI2i ;
   private boolean[] T01KF3_n12440MaqNPI2i ;
   private java.util.Date[] T01KF3_A12441MaqNPI2f ;
   private boolean[] T01KF3_n12441MaqNPI2f ;
   private java.util.Date[] T01KF3_A12442MaqNPI3i ;
   private boolean[] T01KF3_n12442MaqNPI3i ;
   private java.util.Date[] T01KF3_A12443MaqNPI3f ;
   private boolean[] T01KF3_n12443MaqNPI3f ;
   private String[] T01KF3_A396EmprCod ;
   private String[] T01KF2_A602MaqCod ;
   private short[] T01KF2_A12444MaqAnyNP ;
   private byte[] T01KF2_A12445MaqMesNP ;
   private byte[] T01KF2_A12446MaqNPdia ;
   private java.util.Date[] T01KF2_A12438MaqNPI1i ;
   private boolean[] T01KF2_n12438MaqNPI1i ;
   private java.util.Date[] T01KF2_A12439MaqNPf1f ;
   private boolean[] T01KF2_n12439MaqNPf1f ;
   private java.util.Date[] T01KF2_A12440MaqNPI2i ;
   private boolean[] T01KF2_n12440MaqNPI2i ;
   private java.util.Date[] T01KF2_A12441MaqNPI2f ;
   private boolean[] T01KF2_n12441MaqNPI2f ;
   private java.util.Date[] T01KF2_A12442MaqNPI3i ;
   private boolean[] T01KF2_n12442MaqNPI3i ;
   private java.util.Date[] T01KF2_A12443MaqNPI3f ;
   private boolean[] T01KF2_n12443MaqNPI3f ;
   private String[] T01KF2_A396EmprCod ;
   private String[] T01KF22_A396EmprCod ;
   private String[] T01KF22_A602MaqCod ;
   private short[] T01KF22_A12444MaqAnyNP ;
   private byte[] T01KF22_A12445MaqMesNP ;
   private byte[] T01KF22_A12446MaqNPdia ;
   private String[] T01KF23_A407EmprNom ;
   private boolean[] T01KF23_n407EmprNom ;
   private String[] T01KF24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqnp1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqnp1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqnp1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqnp1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqnp1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KF2", "SELECT MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia, MaqNPI1i, MaqNPf1f, MaqNPI2i, MaqNPI2f, MaqNPI3i, MaqNPI3f, EmprCod FROM TXPMAQNP2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? AND MaqNPdia = ?  FOR UPDATE OF MaqNPI1i, MaqNPf1f, MaqNPI2i, MaqNPI2f, MaqNPI3i, MaqNPI3f NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF3", "SELECT MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia, MaqNPI1i, MaqNPf1f, MaqNPI2i, MaqNPI2f, MaqNPI3i, MaqNPI3f, EmprCod FROM TXPMAQNP2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? AND MaqNPdia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF4", "SELECT MaqAnyNP, MaqMesNP, MaqNPMes, EmprCod, MaqCod FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ?  FOR UPDATE OF MaqNPMes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF5", "SELECT MaqAnyNP, MaqMesNP, MaqNPMes, EmprCod, MaqCod FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF7", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF8", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqAnyNP, TM1.MaqMesNP, T2.EmprNom, TM1.MaqNPMes, TM1.EmprCod, TM1.MaqCod FROM (TXPMAQNP1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqAnyNP = ? and TM1.MaqMesNP = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqAnyNP, TM1.MaqMesNP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF9", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE ( MaqCod > ? or MaqCod = ? and MaqAnyNP > ? or MaqAnyNP = ? and MaqCod = ? and MaqMesNP > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KF12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE ( MaqCod < ? or MaqCod = ? and MaqAnyNP < ? or MaqAnyNP = ? and MaqCod = ? and MaqMesNP < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqAnyNP DESC, MaqMesNP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KF13", "INSERT INTO TXPMAQNP1(MaqAnyNP, MaqMesNP, MaqNPMes, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQNP1")
         ,new UpdateCursor("T01KF14", "UPDATE TXPMAQNP1 SET MaqNPMes=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ?", GX_NOMASK, "TXPMAQNP1")
         ,new UpdateCursor("T01KF15", "DELETE FROM TXPMAQNP1  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ?", GX_NOMASK, "TXPMAQNP1")
         ,new ForEachCursor("T01KF16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF17", "SELECT MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia, MaqNPI1i, MaqNPf1f, MaqNPI2i, MaqNPI2f, MaqNPI3i, MaqNPI3f, EmprCod FROM TXPMAQNP2 WHERE EmprCod = ? and MaqCod = ? and MaqAnyNP = ? and MaqMesNP = ? and MaqNPdia = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF18", "SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia FROM TXPMAQNP2 WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? AND MaqNPdia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KF19", "INSERT INTO TXPMAQNP2(MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia, MaqNPI1i, MaqNPf1f, MaqNPI2i, MaqNPI2f, MaqNPI3i, MaqNPI3f, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQNP2")
         ,new UpdateCursor("T01KF20", "UPDATE TXPMAQNP2 SET MaqNPI1i=?, MaqNPf1f=?, MaqNPI2i=?, MaqNPI2f=?, MaqNPI3i=?, MaqNPI3f=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? AND MaqNPdia = ?", GX_NOMASK, "TXPMAQNP2")
         ,new UpdateCursor("T01KF21", "DELETE FROM TXPMAQNP2  WHERE EmprCod = ? AND MaqCod = ? AND MaqAnyNP = ? AND MaqMesNP = ? AND MaqNPdia = ?", GX_NOMASK, "TXPMAQNP2")
         ,new ForEachCursor("T01KF22", "SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia FROM TXPMAQNP2 WHERE EmprCod = ? and MaqCod = ? and MaqAnyNP = ? and MaqMesNP = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP, MaqNPdia ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KF24", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 63);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 63);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 63);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 63);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 63);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], true);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], true);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], true);
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], true);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], true);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], true);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], true);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], true);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], true);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

