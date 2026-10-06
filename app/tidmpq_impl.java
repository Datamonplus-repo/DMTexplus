package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tidmpq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"LB_FORDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5553Lb_ForCod = httpContext.GetPar( "Lb_ForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asalb_fordsc1CB818( A396EmprCod, A5553Lb_ForCod) ;
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
            A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ASIGNACION PROCESOS IDM", ""), (short)(0)) ;
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
      A5550Lb_UltlPq = (short)(GXutil.lval( httpContext.GetPar( "Lb_UltlPq"))) ;
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

   public tidmpq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tidmpq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tidmpq_impl.class ));
   }

   public tidmpq_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkLb_Envio = UIFactory.getCheckbox(this);
      chkLb_RecPip = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TIDMPQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "", "", "", "", "", 1, edtLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea Procesos", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIDMPQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UltlPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_UltlPq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5550Lb_UltlPq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5550Lb_UltlPq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UltlPq_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UltlPq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIDMPQ.htm");
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
         nBlankRcdCount818 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_818 = (short)(1) ;
            scanStart1CB818( ) ;
            while ( RcdFound818 != 0 )
            {
               init_level_properties818( ) ;
               getByPrimaryKey1CB818( ) ;
               addRow1CB818( ) ;
               scanNext1CB818( ) ;
            }
            scanEnd1CB818( ) ;
            nBlankRcdCount818 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5550Lb_UltlPq = A5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         standaloneNotModal1CB818( ) ;
         standaloneModal1CB818( ) ;
         sMode818 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1CB818( ) ;
            edtavnRcdDeleted_818_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_818_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_818_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_818_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_lineaPq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPQ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            chkLb_Envio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_ENVIO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_Envio.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
            chkLb_RecPip.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_RECPIP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_RecPip.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_ForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_ForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_ForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_ForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_818 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1CB818( ) ;
            }
            sendRow1CB818( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5550Lb_UltlPq = B5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount818 = (short)(5) ;
         nRcdExists_818 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1CB818( ) ;
            while ( RcdFound818 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_40818( ) ;
               init_level_properties818( ) ;
               standaloneNotModal1CB818( ) ;
               getByPrimaryKey1CB818( ) ;
               standaloneModal1CB818( ) ;
               addRow1CB818( ) ;
               scanNext1CB818( ) ;
            }
            scanEnd1CB818( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode818 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_40818( ) ;
      initAll1CB818( ) ;
      init_level_properties818( ) ;
      B5550Lb_UltlPq = A5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      nRcdExists_818 = (short)(0) ;
      nIsMod_818 = (short)(0) ;
      nRcdDeleted_818 = (short)(0) ;
      nBlankRcdCount818 = (short)(nBlankRcdUsr818+nBlankRcdCount818) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount818 > 0 )
      {
         standaloneNotModal1CB818( ) ;
         standaloneModal1CB818( ) ;
         addRow1CB818( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_lineaPq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount818 = (short)(nBlankRcdCount818-1) ;
      }
      Gx_mode = sMode818 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5550Lb_UltlPq = B5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIDMPQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TIDMPQ.htm");
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
      e111CB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5550Lb_UltlPq = (short)(localUtil.ctol( httpContext.cgiGet( "Z5550Lb_UltlPq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5550Lb_UltlPq = (short)(localUtil.ctol( httpContext.cgiGet( "O5550Lb_UltlPq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5550Lb_UltlPq = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_UltlPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
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
               A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
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
                        e111CB2 ();
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
            initAll1CB817( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_818_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_818_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1CB817( ) ;
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

   public void confirm_1CB0( )
   {
      beforeValidate1CB817( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1CB817( ) ;
         }
         else
         {
            checkExtendedTable1CB817( ) ;
            if ( AnyError == 0 )
            {
               zm1CB817( 12) ;
            }
            closeExtendedTableCursors1CB817( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode817 = Gx_mode ;
         confirm_1CB818( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode817 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1CB0( ) ;
      }
   }

   public void confirm_1CB818( )
   {
      s5550Lb_UltlPq = O5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1CB818( ) ;
         if ( ( nRcdExists_818 != 0 ) || ( nIsMod_818 != 0 ) )
         {
            getKey1CB818( ) ;
            if ( ( nRcdExists_818 == 0 ) && ( nRcdDeleted_818 == 0 ) )
            {
               if ( RcdFound818 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1CB818( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1CB818( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1CB818( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5550Lb_UltlPq = A5550Lb_UltlPq ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "LB_LINEAPQ_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_lineaPq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound818 != 0 )
               {
                  if ( nRcdDeleted_818 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1CB818( ) ;
                     load1CB818( ) ;
                     beforeValidate1CB818( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1CB818( ) ;
                        O5550Lb_UltlPq = A5550Lb_UltlPq ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_818 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1CB818( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1CB818( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1CB818( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5550Lb_UltlPq = A5550Lb_UltlPq ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_818 == 0 )
                  {
                     GXCCtl = "LB_LINEAPQ_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_lineaPq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_818_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_lineaPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkLb_Envio.getInternalname(), ((GXutil.strcmp(A8621Lb_Envio, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkLb_RecPip.getInternalname(), ((GXutil.strcmp(A6372Lb_RecPip, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtLb_ForDsc_Internalname, GXutil.rtrim( A5554Lb_ForDsc)) ;
         httpContext.changePostValue( edtLb_ForCod_Internalname, GXutil.rtrim( A5553Lb_ForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_40_idx, GXutil.rtrim( Z8621Lb_Envio)) ;
         httpContext.changePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_40_idx, GXutil.rtrim( Z6372Lb_RecPip)) ;
         httpContext.changePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_40_idx, GXutil.rtrim( Z5553Lb_ForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_818 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_818_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINEAPQ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ENVIO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RECPIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5550Lb_UltlPq = s5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1CB0( )
   {
   }

   public void e111CB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tidmpq_impl.this.A396EmprCod = GXv_char2[0] ;
      tidmpq_impl.this.AV11EmprNom = GXv_char3[0] ;
      tidmpq_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1CB817( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5550Lb_UltlPq = T01CB5_A5550Lb_UltlPq[0] ;
         }
         else
         {
            Z5550Lb_UltlPq = A5550Lb_UltlPq ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5550Lb_UltlPq = A5550Lb_UltlPq ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
      AV33Pgmname = "TIDMPQ" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
      /* Using cursor T01CB6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01CB6_A407EmprNom[0] ;
      n407EmprNom = T01CB6_n407EmprNom[0] ;
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

   public void load1CB817( )
   {
      /* Using cursor T01CB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound817 = (short)(1) ;
         A407EmprNom = T01CB7_A407EmprNom[0] ;
         n407EmprNom = T01CB7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5550Lb_UltlPq = T01CB7_A5550Lb_UltlPq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         zm1CB817( -11) ;
      }
      pr_default.close(5);
      onLoadActions1CB817( ) ;
   }

   public void onLoadActions1CB817( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTable1CB817( )
   {
      nIsDirty_817 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void closeExtendedTableCursors1CB817( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1CB817( )
   {
      /* Using cursor T01CB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound817 = (short)(1) ;
      }
      else
      {
         RcdFound817 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01CB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(3) != 101) && ( T01CB5_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01CB5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1CB817( 11) ;
         RcdFound817 = (short)(1) ;
         A5550Lb_UltlPq = T01CB5_A5550Lb_UltlPq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         O5550Lb_UltlPq = A5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         sMode817 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1CB817( ) ;
         if ( AnyError == 1 )
         {
            RcdFound817 = (short)(0) ;
            initializeNonKey1CB817( ) ;
         }
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound817 = (short)(0) ;
         initializeNonKey1CB817( ) ;
         sMode817 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode817 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1CB817( ) ;
      if ( RcdFound817 == 0 )
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
      RcdFound817 = (short)(0) ;
      /* Using cursor T01CB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01CB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CB9_A5532Lb_numero[0] == A5532Lb_numero ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01CB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CB9_A5532Lb_numero[0] == A5532Lb_numero ) )
         {
            RcdFound817 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound817 = (short)(0) ;
      /* Using cursor T01CB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01CB10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CB10_A5532Lb_numero[0] == A5532Lb_numero ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01CB10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01CB10_A5532Lb_numero[0] == A5532Lb_numero ) )
         {
            RcdFound817 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1CB817( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5550Lb_UltlPq = O5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         insert1CB817( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound817 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5550Lb_UltlPq = O5550Lb_UltlPq ;
               httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A5550Lb_UltlPq = O5550Lb_UltlPq ;
               httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
               update1CB817( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5550Lb_UltlPq = O5550Lb_UltlPq ;
               httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
               insert1CB817( ) ;
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
                  A5550Lb_UltlPq = O5550Lb_UltlPq ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
                  insert1CB817( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5550Lb_UltlPq = O5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
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
      getKey1CB817( ) ;
      if ( RcdFound817 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tidmpq");
   }

   public void insert_check( )
   {
      confirm_1CB0( ) ;
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
      if ( RcdFound817 == 0 )
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
      scanStart1CB817( ) ;
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1CB817( ) ;
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
      if ( RcdFound817 == 0 )
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
      if ( RcdFound817 == 0 )
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
      scanStart1CB817( ) ;
      if ( RcdFound817 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound817 != 0 )
         {
            scanNext1CB817( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1CB817( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1CB817( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01CB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z5550Lb_UltlPq != T01CB4_A5550Lb_UltlPq[0] ) )
         {
            if ( Z5550Lb_UltlPq != T01CB4_A5550Lb_UltlPq[0] )
            {
               GXutil.writeLogln("tidmpq:[seudo value changed for attri]"+"Lb_UltlPq");
               GXutil.writeLogRaw("Old: ",Z5550Lb_UltlPq);
               GXutil.writeLogRaw("Current: ",T01CB4_A5550Lb_UltlPq[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1CB817( )
   {
      beforeValidate1CB817( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CB817( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1CB817( 0) ;
         checkOptimisticConcurrency1CB817( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CB817( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1CB817( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CB11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A5532Lb_numero), Short.valueOf(A5550Lb_UltlPq), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
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
                        processLevel1CB817( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1CB0( ) ;
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
            load1CB817( ) ;
         }
         endLevel1CB817( ) ;
      }
      closeExtendedTableCursors1CB817( ) ;
   }

   public void update1CB817( )
   {
      beforeValidate1CB817( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CB817( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CB817( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CB817( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1CB817( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CB12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A5550Lb_UltlPq), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS001"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1CB817( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1CB817( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1CB0( ) ;
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
         endLevel1CB817( ) ;
      }
      closeExtendedTableCursors1CB817( ) ;
   }

   public void deferredUpdate1CB817( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1CB817( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CB817( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1CB817( ) ;
         afterConfirm1CB817( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1CB817( ) ;
            if ( AnyError == 0 )
            {
               A5550Lb_UltlPq = O5550Lb_UltlPq ;
               httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
               scanStart1CB818( ) ;
               while ( RcdFound818 != 0 )
               {
                  getByPrimaryKey1CB818( ) ;
                  delete1CB818( ) ;
                  scanNext1CB818( ) ;
                  O5550Lb_UltlPq = A5550Lb_UltlPq ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
               }
               scanEnd1CB818( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CB13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound817 == 0 )
                        {
                           initAll1CB817( ) ;
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
                        resetCaption1CB0( ) ;
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
      sMode817 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1CB817( ) ;
      Gx_mode = sMode817 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1CB817( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01CB14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01CB15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1CB818( )
   {
      s5550Lb_UltlPq = O5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1CB818( ) ;
         if ( ( nRcdExists_818 != 0 ) || ( nIsMod_818 != 0 ) )
         {
            standaloneNotModal1CB818( ) ;
            getKey1CB818( ) ;
            if ( ( nRcdExists_818 == 0 ) && ( nRcdDeleted_818 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1CB818( ) ;
            }
            else
            {
               if ( RcdFound818 != 0 )
               {
                  if ( ( nRcdDeleted_818 != 0 ) && ( nRcdExists_818 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1CB818( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_818 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1CB818( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_818 == 0 )
                  {
                     GXCCtl = "LB_LINEAPQ_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_lineaPq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5550Lb_UltlPq = A5550Lb_UltlPq ;
            httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_818_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_lineaPq_Internalname, GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkLb_Envio.getInternalname(), ((GXutil.strcmp(A8621Lb_Envio, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkLb_RecPip.getInternalname(), ((GXutil.strcmp(A6372Lb_RecPip, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtLb_ForDsc_Internalname, GXutil.rtrim( A5554Lb_ForDsc)) ;
         httpContext.changePostValue( edtLb_ForCod_Internalname, GXutil.rtrim( A5553Lb_ForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_40_idx, GXutil.rtrim( Z8621Lb_Envio)) ;
         httpContext.changePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_40_idx, GXutil.rtrim( Z6372Lb_RecPip)) ;
         httpContext.changePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_40_idx, GXutil.rtrim( Z5553Lb_ForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_818_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_818 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_818_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINEAPQ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ENVIO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_RECPIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FORCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1CB818( ) ;
      if ( AnyError != 0 )
      {
         O5550Lb_UltlPq = s5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      }
      nRcdExists_818 = (short)(0) ;
      nIsMod_818 = (short)(0) ;
      nRcdDeleted_818 = (short)(0) ;
   }

   public void processLevel1CB817( )
   {
      /* Save parent mode. */
      sMode817 = Gx_mode ;
      processNestedLevel1CB818( ) ;
      if ( AnyError != 0 )
      {
         O5550Lb_UltlPq = s5550Lb_UltlPq ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode817 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01CB16 */
      pr_default.execute(14, new Object[] {Short.valueOf(A5550Lb_UltlPq), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
   }

   public void endLevel1CB817( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1CB817( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tidmpq");
         if ( AnyError == 0 )
         {
            confirmValues1CB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tidmpq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1CB817( )
   {
      /* Scan By routine */
      /* Using cursor T01CB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      RcdFound817 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound817 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1CB817( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound817 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound817 = (short)(1) ;
      }
   }

   public void scanEnd1CB817( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1CB817( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1CB817( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1CB817( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1CB817( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1CB817( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1CB817( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1CB817( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
   }

   public void zm1CB818( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8621Lb_Envio = T01CB3_A8621Lb_Envio[0] ;
            Z6372Lb_RecPip = T01CB3_A6372Lb_RecPip[0] ;
            Z5553Lb_ForCod = T01CB3_A5553Lb_ForCod[0] ;
         }
         else
         {
            Z8621Lb_Envio = A8621Lb_Envio ;
            Z6372Lb_RecPip = A6372Lb_RecPip ;
            Z5553Lb_ForCod = A5553Lb_ForCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5551Lb_lineaPq = A5551Lb_lineaPq ;
         Z8621Lb_Envio = A8621Lb_Envio ;
         Z6372Lb_RecPip = A6372Lb_RecPip ;
         Z5553Lb_ForCod = A5553Lb_ForCod ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1CB818( )
   {
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
      edtLb_UltlPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltlPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltlPq_Enabled), 5, 0), true);
   }

   public void standaloneModal1CB818( )
   {
      if ( isIns( )  )
      {
         A5550Lb_UltlPq = (short)(O5550Lb_UltlPq+10) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5551Lb_lineaPq = A5550Lb_UltlPq ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8621Lb_Envio)==0) && ( Gx_BScreen == 0 ) )
      {
         A8621Lb_Envio = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6372Lb_RecPip)==0) && ( Gx_BScreen == 0 ) )
      {
         A6372Lb_RecPip = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_lineaPq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtLb_lineaPq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1CB818( )
   {
      /* Using cursor T01CB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A8621Lb_Envio = T01CB18_A8621Lb_Envio[0] ;
         A6372Lb_RecPip = T01CB18_A6372Lb_RecPip[0] ;
         A5553Lb_ForCod = T01CB18_A5553Lb_ForCod[0] ;
         zm1CB818( -13) ;
      }
      pr_default.close(16);
      onLoadActions1CB818( ) ;
   }

   public void onLoadActions1CB818( )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tidmpq_impl.this.A396EmprCod = GXv_char4[0] ;
      tidmpq_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
   }

   public void checkExtendedTable1CB818( )
   {
      nIsDirty_818 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1CB818( ) ;
      nIsDirty_818 = (short)(1) ;
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tidmpq_impl.this.A396EmprCod = GXv_char4[0] ;
      tidmpq_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
      if ( ! ( ( GXutil.strcmp(A6372Lb_RecPip, "S") == 0 ) || ( GXutil.strcmp(A6372Lb_RecPip, "N") == 0 ) ) )
      {
         GXCCtl = "LB_RECPIP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Proceso en Receta Pipetaje", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkLb_RecPip.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1CB818( )
   {
   }

   public void enableDisable1CB818( )
   {
   }

   public void getKey1CB818( )
   {
      /* Using cursor T01CB19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound818 = (short)(1) ;
      }
      else
      {
         RcdFound818 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1CB818( )
   {
      /* Using cursor T01CB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
      if ( (pr_default.getStatus(1) != 101) && ( T01CB3_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01CB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1CB818( 13) ;
         RcdFound818 = (short)(1) ;
         initializeNonKey1CB818( ) ;
         A5551Lb_lineaPq = T01CB3_A5551Lb_lineaPq[0] ;
         A8621Lb_Envio = T01CB3_A8621Lb_Envio[0] ;
         A6372Lb_RecPip = T01CB3_A6372Lb_RecPip[0] ;
         A5553Lb_ForCod = T01CB3_A5553Lb_ForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5551Lb_lineaPq = A5551Lb_lineaPq ;
         sMode818 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1CB818( ) ;
         load1CB818( ) ;
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound818 = (short)(0) ;
         initializeNonKey1CB818( ) ;
         sMode818 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1CB818( ) ;
         Gx_mode = sMode818 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1CB818( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1CB818( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01CB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8621Lb_Envio, T01CB2_A8621Lb_Envio[0]) != 0 ) || ( GXutil.strcmp(Z6372Lb_RecPip, T01CB2_A6372Lb_RecPip[0]) != 0 ) || ( GXutil.strcmp(Z5553Lb_ForCod, T01CB2_A5553Lb_ForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8621Lb_Envio, T01CB2_A8621Lb_Envio[0]) != 0 )
            {
               GXutil.writeLogln("tidmpq:[seudo value changed for attri]"+"Lb_Envio");
               GXutil.writeLogRaw("Old: ",Z8621Lb_Envio);
               GXutil.writeLogRaw("Current: ",T01CB2_A8621Lb_Envio[0]);
            }
            if ( GXutil.strcmp(Z6372Lb_RecPip, T01CB2_A6372Lb_RecPip[0]) != 0 )
            {
               GXutil.writeLogln("tidmpq:[seudo value changed for attri]"+"Lb_RecPip");
               GXutil.writeLogRaw("Old: ",Z6372Lb_RecPip);
               GXutil.writeLogRaw("Current: ",T01CB2_A6372Lb_RecPip[0]);
            }
            if ( GXutil.strcmp(Z5553Lb_ForCod, T01CB2_A5553Lb_ForCod[0]) != 0 )
            {
               GXutil.writeLogln("tidmpq:[seudo value changed for attri]"+"Lb_ForCod");
               GXutil.writeLogRaw("Old: ",Z5553Lb_ForCod);
               GXutil.writeLogRaw("Current: ",T01CB2_A5553Lb_ForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1CB818( )
   {
      beforeValidate1CB818( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CB818( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1CB818( 0) ;
         checkOptimisticConcurrency1CB818( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1CB818( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1CB818( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01CB20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq), A8621Lb_Envio, A6372Lb_RecPip, A5553Lb_ForCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
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
            load1CB818( ) ;
         }
         endLevel1CB818( ) ;
      }
      closeExtendedTableCursors1CB818( ) ;
   }

   public void update1CB818( )
   {
      beforeValidate1CB818( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1CB818( ) ;
      }
      if ( ( nIsMod_818 != 0 ) || ( nIsDirty_818 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1CB818( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1CB818( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1CB818( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01CB21 */
                     pr_default.execute(19, new Object[] {A8621Lb_Envio, A6372Lb_RecPip, A5553Lb_ForCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS000"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1CB818( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1CB818( ) ;
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
            endLevel1CB818( ) ;
         }
      }
      closeExtendedTableCursors1CB818( ) ;
   }

   public void deferredUpdate1CB818( )
   {
   }

   public void delete1CB818( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1CB818( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1CB818( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1CB818( ) ;
         afterConfirm1CB818( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1CB818( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01CB22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
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
      sMode818 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1CB818( ) ;
      Gx_mode = sMode818 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1CB818( )
   {
      standaloneModal1CB818( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A5554Lb_ForDsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A5553Lb_ForCod ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tidmpq_impl.this.A396EmprCod = GXv_char4[0] ;
         tidmpq_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
         tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5554Lb_ForDsc = GXt_char1 ;
      }
   }

   public void endLevel1CB818( )
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

   public void scanStart1CB818( )
   {
      /* Scan By routine */
      /* Using cursor T01CB23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      RcdFound818 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A5551Lb_lineaPq = T01CB23_A5551Lb_lineaPq[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1CB818( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound818 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound818 = (short)(1) ;
         A5551Lb_lineaPq = T01CB23_A5551Lb_lineaPq[0] ;
      }
   }

   public void scanEnd1CB818( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1CB818( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1CB818( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1CB818( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1CB818( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1CB818( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1CB818( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1CB818( )
   {
      edtLb_lineaPq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      chkLb_Envio.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_Envio.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      chkLb_RecPip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "Enabled", GXutil.ltrimstr( chkLb_RecPip.getEnabled(), 5, 0), !bGXsfl_40_Refreshing);
      edtLb_ForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtLb_ForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ForCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1CB818( )
   {
   }

   public void send_integrity_lvl_hashes1CB817( )
   {
   }

   public void subsflControlProps_40818( )
   {
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818_"+sGXsfl_40_idx ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ_"+sGXsfl_40_idx ;
      chkLb_Envio.setInternalname( "LB_ENVIO_"+sGXsfl_40_idx );
      chkLb_RecPip.setInternalname( "LB_RECPIP_"+sGXsfl_40_idx );
      edtLb_ForDsc_Internalname = "LB_FORDSC_"+sGXsfl_40_idx ;
      edtLb_ForCod_Internalname = "LB_FORCOD_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_40818( )
   {
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818_"+sGXsfl_40_fel_idx ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ_"+sGXsfl_40_fel_idx ;
      chkLb_Envio.setInternalname( "LB_ENVIO_"+sGXsfl_40_fel_idx );
      chkLb_RecPip.setInternalname( "LB_RECPIP_"+sGXsfl_40_fel_idx );
      edtLb_ForDsc_Internalname = "LB_FORDSC_"+sGXsfl_40_fel_idx ;
      edtLb_ForCod_Internalname = "LB_FORCOD_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1CB818( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_40818( ) ;
      sendRow1CB818( ) ;
   }

   public void sendRow1CB818( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_818_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_818_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_818), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_818), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_818_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_818_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_lineaPq_Internalname,GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5551Lb_lineaPq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_lineaPq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_lineaPq_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "LB_ENVIO_" + sGXsfl_40_idx ;
      chkLb_Envio.setName( GXCCtl );
      chkLb_Envio.setWebtags( "" );
      chkLb_Envio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "TitleCaption", chkLb_Envio.getCaption(), !bGXsfl_40_Refreshing);
      chkLb_Envio.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A8621Lb_Envio)==0) )
      {
         A8621Lb_Envio = httpContext.getMessage( "S", "") ;
      }
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkLb_Envio.getInternalname(),A8621Lb_Envio,"","",Integer.valueOf(-1),Integer.valueOf(chkLb_Envio.getEnabled()),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(43, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,43);\""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "LB_RECPIP_" + sGXsfl_40_idx ;
      chkLb_RecPip.setName( GXCCtl );
      chkLb_RecPip.setWebtags( "" );
      chkLb_RecPip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "TitleCaption", chkLb_RecPip.getCaption(), !bGXsfl_40_Refreshing);
      chkLb_RecPip.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A6372Lb_RecPip)==0) )
      {
         A6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      }
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkLb_RecPip.getInternalname(),A6372Lb_RecPip,"","",Integer.valueOf(-1),Integer.valueOf(chkLb_RecPip.getEnabled()),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(44, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,44);\""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ForDsc_Internalname,GXutil.rtrim( A5554Lb_ForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_ForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_818_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ForCod_Internalname,GXutil.rtrim( A5553Lb_ForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_ForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1CB818( ) ;
      GXCCtl = "Z5551Lb_lineaPq_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5551Lb_lineaPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8621Lb_Envio_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8621Lb_Envio));
      GXCCtl = "Z6372Lb_RecPip_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6372Lb_RecPip));
      GXCCtl = "Z5553Lb_ForCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5553Lb_ForCod));
      GXCCtl = "nRcdDeleted_818_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_818_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_818_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_818, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_818_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINEAPQ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ENVIO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RECPIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FORDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FORCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1CB818( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_40818( ) ;
      edtavnRcdDeleted_818_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_818_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_lineaPq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPQ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkLb_Envio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_ENVIO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkLb_RecPip.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LB_RECPIP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtLb_ForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_ForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FORCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_818");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_818_Internalname ;
         wbErr = true ;
         nRcdDeleted_818 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_818 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_818_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINEAPQ_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_lineaPq_Internalname ;
         wbErr = true ;
         A5551Lb_lineaPq = (short)(0) ;
      }
      else
      {
         A5551Lb_lineaPq = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_lineaPq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8621Lb_Envio = ((GXutil.strcmp(httpContext.cgiGet( chkLb_Envio.getInternalname()), "S")==0) ? "S" : "N") ;
      A6372Lb_RecPip = ((GXutil.strcmp(httpContext.cgiGet( chkLb_RecPip.getInternalname()), "S")==0) ? "S" : "N") ;
      A5554Lb_ForDsc = httpContext.cgiGet( edtLb_ForDsc_Internalname) ;
      A5553Lb_ForCod = httpContext.cgiGet( edtLb_ForCod_Internalname) ;
      GXCCtl = "Z5551Lb_lineaPq_" + sGXsfl_40_idx ;
      Z5551Lb_lineaPq = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8621Lb_Envio_" + sGXsfl_40_idx ;
      Z8621Lb_Envio = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6372Lb_RecPip_" + sGXsfl_40_idx ;
      Z6372Lb_RecPip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5553Lb_ForCod_" + sGXsfl_40_idx ;
      Z5553Lb_ForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_818_" + sGXsfl_40_idx ;
      nRcdDeleted_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_818_" + sGXsfl_40_idx ;
      nRcdExists_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_818_" + sGXsfl_40_idx ;
      nIsMod_818 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_lineaPq_Enabled = edtLb_lineaPq_Enabled ;
   }

   public void confirmValues1CB0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_40818( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_40818( ) ;
         httpContext.changePostValue( "Z5551Lb_lineaPq_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5551Lb_lineaPq_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8621Lb_Envio_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8621Lb_Envio_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6372Lb_RecPip_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6372Lb_RecPip_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z5553Lb_ForCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5553Lb_ForCod_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tidmpq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"EmprCod","Lb_numero"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( Z5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( O5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
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
      return formatLink("app.tidmpq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"EmprCod","Lb_numero"})  ;
   }

   public String getPgmname( )
   {
      return "TIDMPQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ASIGNACION PROCESOS IDM", "") ;
   }

   public void initializeNonKey1CB817( )
   {
      A5550Lb_UltlPq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      O5550Lb_UltlPq = A5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      Z5550Lb_UltlPq = (short)(0) ;
   }

   public void initAll1CB817( )
   {
      initializeNonKey1CB817( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1CB818( )
   {
      A5554Lb_ForDsc = "" ;
      A5553Lb_ForCod = "" ;
      A8621Lb_Envio = httpContext.getMessage( "S", "") ;
      A6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      Z8621Lb_Envio = "" ;
      Z6372Lb_RecPip = "" ;
      Z5553Lb_ForCod = "" ;
   }

   public void initAll1CB818( )
   {
      A5551Lb_lineaPq = (short)(0) ;
      initializeNonKey1CB818( ) ;
   }

   public void standaloneModalInsert1CB818( )
   {
      A5550Lb_UltlPq = i5550Lb_UltlPq ;
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5550Lb_UltlPq), 4, 0));
      A8621Lb_Envio = i8621Lb_Envio ;
      A6372Lb_RecPip = i6372Lb_RecPip ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156540", true, true);
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
      httpContext.AddJavascriptSource("tidmpq.js", "?2026824156541", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties818( )
   {
      edtLb_lineaPq_Enabled = defedtLb_lineaPq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_lineaPq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_lineaPq_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_818, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_818_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5551Lb_lineaPq, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_lineaPq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8621Lb_Envio));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_Envio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6372Lb_RecPip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkLb_RecPip.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5554Lb_ForDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5553Lb_ForCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_ForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtLb_numero_Internalname = "LB_NUMERO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtLb_UltlPq_Internalname = "LB_ULTLPQ" ;
      edtavnRcdDeleted_818_Internalname = "vNRCDDELETED_818" ;
      edtLb_lineaPq_Internalname = "LB_LINEAPQ" ;
      chkLb_Envio.setInternalname( "LB_ENVIO" );
      chkLb_RecPip.setInternalname( "LB_RECPIP" );
      edtLb_ForDsc_Internalname = "LB_FORDSC" ;
      edtLb_ForCod_Internalname = "LB_FORCOD" ;
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
      Form.setCaption( httpContext.getMessage( "ASIGNACION PROCESOS IDM", "") );
      edtLb_ForCod_Jsonclick = "" ;
      edtLb_ForDsc_Jsonclick = "" ;
      chkLb_RecPip.setCaption( "" );
      chkLb_Envio.setCaption( "" );
      edtLb_lineaPq_Jsonclick = "" ;
      edtavnRcdDeleted_818_Jsonclick = "" ;
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
      edtLb_ForCod_Enabled = 1 ;
      edtLb_ForDsc_Enabled = 0 ;
      chkLb_RecPip.setEnabled( 1 );
      chkLb_Envio.setEnabled( 1 );
      edtLb_lineaPq_Enabled = 1 ;
      edtavnRcdDeleted_818_Enabled = 1 ;
      edtLb_UltlPq_Jsonclick = "" ;
      edtLb_UltlPq_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UltlPq_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Backcolor = (int)(0xFFFFFF) ;
      edtLb_numero_Enabled = 0 ;
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

   public void gx5asalb_fordsc1CB818( String A396EmprCod ,
                                      String A5553Lb_ForCod )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tidmpq_impl.this.A396EmprCod = GXv_char4[0] ;
      tidmpq_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5554Lb_ForDsc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5554Lb_ForDsc))+"\"") ;
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
      subsflControlProps_40818( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1CB818( ) ;
         standaloneModal1CB818( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1CB818( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_40818( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "LB_ENVIO_" + sGXsfl_40_idx ;
      chkLb_Envio.setName( GXCCtl );
      chkLb_Envio.setWebtags( "" );
      chkLb_Envio.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_Envio.getInternalname(), "TitleCaption", chkLb_Envio.getCaption(), !bGXsfl_40_Refreshing);
      chkLb_Envio.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A8621Lb_Envio)==0) )
      {
         A8621Lb_Envio = httpContext.getMessage( "S", "") ;
      }
      GXCCtl = "LB_RECPIP_" + sGXsfl_40_idx ;
      chkLb_RecPip.setName( GXCCtl );
      chkLb_RecPip.setWebtags( "" );
      chkLb_RecPip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLb_RecPip.getInternalname(), "TitleCaption", chkLb_RecPip.getCaption(), !bGXsfl_40_Refreshing);
      chkLb_RecPip.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A6372Lb_RecPip)==0) )
      {
         A6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01CB24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01CB24_A407EmprNom[0] ;
      n407EmprNom = T01CB24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
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

   public void valid_Lb_numero( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( A5550Lb_UltlPq, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( Z5550Lb_UltlPq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O5550Lb_UltlPq", GXutil.ltrim( localUtil.ntoc( O5550Lb_UltlPq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Lb_forcod( )
   {
      GXt_char1 = A5554Lb_ForDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A5553Lb_ForCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tidmpq_impl.this.A396EmprCod = GXv_char4[0] ;
      tidmpq_impl.this.A5553Lb_ForCod = GXv_char3[0] ;
      tidmpq_impl.this.GXt_char1 = GXv_char2[0] ;
      A5554Lb_ForDsc = GXt_char1 ;
      O5550Lb_UltlPq = A5550Lb_UltlPq ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5554Lb_ForDsc", GXutil.rtrim( A5554Lb_ForDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A5550Lb_UltlPq',fld:'LB_ULTLPQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5550Lb_UltlPq',fld:'LB_ULTLPQ',pic:'ZZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z5532Lb_numero'},{av:'Z407EmprNom'},{av:'Z5550Lb_UltlPq'},{av:'ZV8UsurCod'},{av:'O5550Lb_UltlPq'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LB_ULTLPQ","{handler:'valid_Lb_ultlpq',iparms:[]");
      setEventMetadata("VALID_LB_ULTLPQ",",oparms:[]}");
      setEventMetadata("VALID_LB_LINEAPQ","{handler:'valid_Lb_lineapq',iparms:[]");
      setEventMetadata("VALID_LB_LINEAPQ",",oparms:[]}");
      setEventMetadata("VALID_LB_RECPIP","{handler:'valid_Lb_recpip',iparms:[]");
      setEventMetadata("VALID_LB_RECPIP",",oparms:[]}");
      setEventMetadata("VALID_LB_FORCOD","{handler:'valid_Lb_forcod',iparms:[{av:'A5550Lb_UltlPq',fld:'LB_ULTLPQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5553Lb_ForCod',fld:'LB_FORCOD',pic:''},{av:'A5554Lb_ForDsc',fld:'LB_FORDSC',pic:''}]");
      setEventMetadata("VALID_LB_FORCOD",",oparms:[{av:'A5554Lb_ForDsc',fld:'LB_FORDSC',pic:''}]}");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8621Lb_Envio = "" ;
      Z6372Lb_RecPip = "" ;
      Z5553Lb_ForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5553Lb_ForCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode818 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode817 = "" ;
      GXCCtl = "" ;
      A8621Lb_Envio = "" ;
      A6372Lb_RecPip = "" ;
      A5554Lb_ForDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      Z407EmprNom = "" ;
      T01CB6_A407EmprNom = new String[] {""} ;
      T01CB6_n407EmprNom = new boolean[] {false} ;
      T01CB7_A5532Lb_numero = new int[1] ;
      T01CB7_A407EmprNom = new String[] {""} ;
      T01CB7_n407EmprNom = new boolean[] {false} ;
      T01CB7_A5550Lb_UltlPq = new short[1] ;
      T01CB7_A396EmprCod = new String[] {""} ;
      T01CB8_A396EmprCod = new String[] {""} ;
      T01CB8_A5532Lb_numero = new int[1] ;
      T01CB5_A5532Lb_numero = new int[1] ;
      T01CB5_A5550Lb_UltlPq = new short[1] ;
      T01CB5_A396EmprCod = new String[] {""} ;
      T01CB9_A396EmprCod = new String[] {""} ;
      T01CB9_A5532Lb_numero = new int[1] ;
      T01CB10_A396EmprCod = new String[] {""} ;
      T01CB10_A5532Lb_numero = new int[1] ;
      T01CB4_A5532Lb_numero = new int[1] ;
      T01CB4_A5550Lb_UltlPq = new short[1] ;
      T01CB4_A396EmprCod = new String[] {""} ;
      T01CB14_A396EmprCod = new String[] {""} ;
      T01CB14_A5532Lb_numero = new int[1] ;
      T01CB14_A13379LbNormaID = new String[] {""} ;
      T01CB15_A396EmprCod = new String[] {""} ;
      T01CB15_A5532Lb_numero = new int[1] ;
      T01CB15_A5555Lb_opcion = new String[] {""} ;
      T01CB17_A396EmprCod = new String[] {""} ;
      T01CB17_A5532Lb_numero = new int[1] ;
      T01CB18_A5532Lb_numero = new int[1] ;
      T01CB18_A5551Lb_lineaPq = new short[1] ;
      T01CB18_A8621Lb_Envio = new String[] {""} ;
      T01CB18_A6372Lb_RecPip = new String[] {""} ;
      T01CB18_A5553Lb_ForCod = new String[] {""} ;
      T01CB18_A396EmprCod = new String[] {""} ;
      T01CB19_A396EmprCod = new String[] {""} ;
      T01CB19_A5532Lb_numero = new int[1] ;
      T01CB19_A5551Lb_lineaPq = new short[1] ;
      T01CB3_A5532Lb_numero = new int[1] ;
      T01CB3_A5551Lb_lineaPq = new short[1] ;
      T01CB3_A8621Lb_Envio = new String[] {""} ;
      T01CB3_A6372Lb_RecPip = new String[] {""} ;
      T01CB3_A5553Lb_ForCod = new String[] {""} ;
      T01CB3_A396EmprCod = new String[] {""} ;
      T01CB2_A5532Lb_numero = new int[1] ;
      T01CB2_A5551Lb_lineaPq = new short[1] ;
      T01CB2_A8621Lb_Envio = new String[] {""} ;
      T01CB2_A6372Lb_RecPip = new String[] {""} ;
      T01CB2_A5553Lb_ForCod = new String[] {""} ;
      T01CB2_A396EmprCod = new String[] {""} ;
      T01CB23_A396EmprCod = new String[] {""} ;
      T01CB23_A5532Lb_numero = new int[1] ;
      T01CB23_A5551Lb_lineaPq = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8621Lb_Envio = "" ;
      i6372Lb_RecPip = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01CB24_A407EmprNom = new String[] {""} ;
      T01CB24_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z5554Lb_ForDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tidmpq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tidmpq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tidmpq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tidmpq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tidmpq__default(),
         new Object[] {
             new Object[] {
            T01CB2_A5532Lb_numero, T01CB2_A5551Lb_lineaPq, T01CB2_A8621Lb_Envio, T01CB2_A6372Lb_RecPip, T01CB2_A5553Lb_ForCod, T01CB2_A396EmprCod
            }
            , new Object[] {
            T01CB3_A5532Lb_numero, T01CB3_A5551Lb_lineaPq, T01CB3_A8621Lb_Envio, T01CB3_A6372Lb_RecPip, T01CB3_A5553Lb_ForCod, T01CB3_A396EmprCod
            }
            , new Object[] {
            T01CB4_A5532Lb_numero, T01CB4_A5550Lb_UltlPq, T01CB4_A396EmprCod
            }
            , new Object[] {
            T01CB5_A5532Lb_numero, T01CB5_A5550Lb_UltlPq, T01CB5_A396EmprCod
            }
            , new Object[] {
            T01CB6_A407EmprNom, T01CB6_n407EmprNom
            }
            , new Object[] {
            T01CB7_A5532Lb_numero, T01CB7_A407EmprNom, T01CB7_n407EmprNom, T01CB7_A5550Lb_UltlPq, T01CB7_A396EmprCod
            }
            , new Object[] {
            T01CB8_A396EmprCod, T01CB8_A5532Lb_numero
            }
            , new Object[] {
            T01CB9_A396EmprCod, T01CB9_A5532Lb_numero
            }
            , new Object[] {
            T01CB10_A396EmprCod, T01CB10_A5532Lb_numero
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01CB14_A396EmprCod, T01CB14_A5532Lb_numero, T01CB14_A13379LbNormaID
            }
            , new Object[] {
            T01CB15_A396EmprCod, T01CB15_A5532Lb_numero, T01CB15_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            T01CB17_A396EmprCod, T01CB17_A5532Lb_numero
            }
            , new Object[] {
            T01CB18_A5532Lb_numero, T01CB18_A5551Lb_lineaPq, T01CB18_A8621Lb_Envio, T01CB18_A6372Lb_RecPip, T01CB18_A5553Lb_ForCod, T01CB18_A396EmprCod
            }
            , new Object[] {
            T01CB19_A396EmprCod, T01CB19_A5532Lb_numero, T01CB19_A5551Lb_lineaPq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01CB23_A396EmprCod, T01CB23_A5532Lb_numero, T01CB23_A5551Lb_lineaPq
            }
            , new Object[] {
            T01CB24_A407EmprNom, T01CB24_n407EmprNom
            }
         }
      );
      Z5532Lb_numero = 0 ;
      A5532Lb_numero = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TIDMPQ" ;
      Z6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      A6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      i6372Lb_RecPip = httpContext.getMessage( "S", "") ;
      Z8621Lb_Envio = httpContext.getMessage( "S", "") ;
      A8621Lb_Envio = httpContext.getMessage( "S", "") ;
      i8621Lb_Envio = httpContext.getMessage( "S", "") ;
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
   private short Z5550Lb_UltlPq ;
   private short O5550Lb_UltlPq ;
   private short Z5551Lb_lineaPq ;
   private short nRcdDeleted_818 ;
   private short nRcdExists_818 ;
   private short nIsMod_818 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5550Lb_UltlPq ;
   private short nBlankRcdCount818 ;
   private short RcdFound818 ;
   private short B5550Lb_UltlPq ;
   private short nBlankRcdUsr818 ;
   private short s5550Lb_UltlPq ;
   private short A5551Lb_lineaPq ;
   private short RcdFound817 ;
   private short nIsDirty_817 ;
   private short nIsDirty_818 ;
   private short i5550Lb_UltlPq ;
   private short ZZ5550Lb_UltlPq ;
   private short ZO5550Lb_UltlPq ;
   private int wcpOA5532Lb_numero ;
   private int Z5532Lb_numero ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int A5532Lb_numero ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtLb_numero_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtLb_UltlPq_Enabled ;
   private int edtavnRcdDeleted_818_Enabled ;
   private int edtLb_lineaPq_Enabled ;
   private int edtLb_ForDsc_Enabled ;
   private int edtLb_ForCod_Enabled ;
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
   private int defedtLb_lineaPq_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtLb_UltlPq_Backcolor ;
   private int edtLb_numero_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ5532Lb_numero ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z8621Lb_Envio ;
   private String Z6372Lb_RecPip ;
   private String Z5553Lb_ForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5553Lb_ForCod ;
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
   private String edtLb_numero_Internalname ;
   private String edtLb_numero_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtLb_UltlPq_Internalname ;
   private String edtLb_UltlPq_Jsonclick ;
   private String sMode818 ;
   private String edtavnRcdDeleted_818_Internalname ;
   private String edtLb_lineaPq_Internalname ;
   private String edtLb_ForDsc_Internalname ;
   private String edtLb_ForCod_Internalname ;
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
   private String AV8UsurCod ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode817 ;
   private String GXCCtl ;
   private String A8621Lb_Envio ;
   private String A6372Lb_RecPip ;
   private String A5554Lb_ForDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_818_Jsonclick ;
   private String edtLb_lineaPq_Jsonclick ;
   private String edtLb_ForDsc_Jsonclick ;
   private String edtLb_ForCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8621Lb_Envio ;
   private String i6372Lb_RecPip ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z5554Lb_ForDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkLb_Envio ;
   private ICheckbox chkLb_RecPip ;
   private IDataStoreProvider pr_default ;
   private String[] T01CB6_A407EmprNom ;
   private boolean[] T01CB6_n407EmprNom ;
   private int[] T01CB7_A5532Lb_numero ;
   private String[] T01CB7_A407EmprNom ;
   private boolean[] T01CB7_n407EmprNom ;
   private short[] T01CB7_A5550Lb_UltlPq ;
   private String[] T01CB7_A396EmprCod ;
   private String[] T01CB8_A396EmprCod ;
   private int[] T01CB8_A5532Lb_numero ;
   private int[] T01CB5_A5532Lb_numero ;
   private short[] T01CB5_A5550Lb_UltlPq ;
   private String[] T01CB5_A396EmprCod ;
   private String[] T01CB9_A396EmprCod ;
   private int[] T01CB9_A5532Lb_numero ;
   private String[] T01CB10_A396EmprCod ;
   private int[] T01CB10_A5532Lb_numero ;
   private int[] T01CB4_A5532Lb_numero ;
   private short[] T01CB4_A5550Lb_UltlPq ;
   private String[] T01CB4_A396EmprCod ;
   private String[] T01CB14_A396EmprCod ;
   private int[] T01CB14_A5532Lb_numero ;
   private String[] T01CB14_A13379LbNormaID ;
   private String[] T01CB15_A396EmprCod ;
   private int[] T01CB15_A5532Lb_numero ;
   private String[] T01CB15_A5555Lb_opcion ;
   private String[] T01CB17_A396EmprCod ;
   private int[] T01CB17_A5532Lb_numero ;
   private int[] T01CB18_A5532Lb_numero ;
   private short[] T01CB18_A5551Lb_lineaPq ;
   private String[] T01CB18_A8621Lb_Envio ;
   private String[] T01CB18_A6372Lb_RecPip ;
   private String[] T01CB18_A5553Lb_ForCod ;
   private String[] T01CB18_A396EmprCod ;
   private String[] T01CB19_A396EmprCod ;
   private int[] T01CB19_A5532Lb_numero ;
   private short[] T01CB19_A5551Lb_lineaPq ;
   private int[] T01CB3_A5532Lb_numero ;
   private short[] T01CB3_A5551Lb_lineaPq ;
   private String[] T01CB3_A8621Lb_Envio ;
   private String[] T01CB3_A6372Lb_RecPip ;
   private String[] T01CB3_A5553Lb_ForCod ;
   private String[] T01CB3_A396EmprCod ;
   private int[] T01CB2_A5532Lb_numero ;
   private short[] T01CB2_A5551Lb_lineaPq ;
   private String[] T01CB2_A8621Lb_Envio ;
   private String[] T01CB2_A6372Lb_RecPip ;
   private String[] T01CB2_A5553Lb_ForCod ;
   private String[] T01CB2_A396EmprCod ;
   private String[] T01CB23_A396EmprCod ;
   private int[] T01CB23_A5532Lb_numero ;
   private short[] T01CB23_A5551Lb_lineaPq ;
   private String[] T01CB24_A407EmprNom ;
   private boolean[] T01CB24_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tidmpq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tidmpq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tidmpq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tidmpq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tidmpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01CB2", "SELECT Lb_numero, Lb_lineaPq, Lb_Envio, Lb_RecPip, Lb_ForCod, EmprCod FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?  FOR UPDATE OF Lb_Envio, Lb_RecPip, Lb_ForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CB3", "SELECT Lb_numero, Lb_lineaPq, Lb_Envio, Lb_RecPip, Lb_ForCod, EmprCod FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CB4", "SELECT Lb_numero, Lb_UltlPq, EmprCod FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ?  FOR UPDATE OF Lb_UltlPq NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB5", "SELECT Lb_numero, Lb_UltlPq, EmprCod FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB7", "SELECT /*+ FIRST_ROWS(1) */ TM1.Lb_numero, T2.EmprNom, TM1.Lb_UltlPq, TM1.EmprCod FROM (TXPENS001 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? ORDER BY TM1.EmprCod, TM1.Lb_numero ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod DESC, Lb_numero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01CB11", "INSERT INTO TXPENS001(Lb_numero, Lb_UltlPq, EmprCod, CliCod, Lb_ArtCod, Lb_ArtDsc, Lb_TipArt, Lb_ColNom, Lb_ColNum, TipColCod, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_FechaE, Lb_HoraE, Lb_Usuario, Lb_FechaM, Lb_HoraM, Lb_UsuM, Lb_Rb, IntCod, MatCod, CodSol, Lb_Obs, Lb_UltOp, Lb_TipArtD, Lb_EstEns, Lb_Tipo, Lb_cartazf, Lb_malha, Lb_reprod, Lb_TipRec, Lb_impreso, Lb_RGB, Lb_IDM, Lb_Tempt, Lb_Temp2, Lb_Temp3, Lb_EstLab, Lb_Talao, Lb_Local, Lb_numopu, Lab_CodCau, Lab_desvio, TipDisCod, Lb_nfibras, Lb_pesom, Lb_volum, MacProCod, Lb_Pantone, Lb_PedCod, Lb_PriEns, Lb_Tra1, Lb_TraP1, Lb_Tra2, Lb_TraP2, Lb_Tra3, Lb_TraP3, Lb_Tra4, Lb_TraP4, Lb_Tra5, Lb_TraP5, Lb_Tra6, Lb_TraP6, Lb_Hila, Lb_NCoS, Lb_NOpR, Lb_NCoE, Lb_NOpE, Lb_NOpN, Lb_FecE, Lb_FecN, Lb_FecR, Lb_diasER, Lb_obsCl, Lb_obsLb, Lb_staLb, Lb_PquiID, Lb_PrecioP, Lb_Branco1, Lb_Gots, Lb_WebCode, Lb_CliDest, IluminaID) VALUES(?, ?, ?, 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0)", GX_NOMASK, "TXPENS001")
         ,new UpdateCursor("T01CB12", "UPDATE TXPENS001 SET Lb_UltlPq=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK, "TXPENS001")
         ,new UpdateCursor("T01CB13", "DELETE FROM TXPENS001  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK, "TXPENS001")
         ,new ForEachCursor("T01CB14", "SELECT * FROM (SELECT EmprCod, Lb_numero, LbNormaID FROM TXPLBDNOR WHERE EmprCod = ? AND Lb_numero = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB15", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01CB16", "UPDATE TXPENS001 SET Lb_UltlPq=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK, "TXPENS001")
         ,new ForEachCursor("T01CB17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01CB18", "SELECT Lb_numero, Lb_lineaPq, Lb_Envio, Lb_RecPip, Lb_ForCod, EmprCod FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? and Lb_lineaPq = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CB19", "SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01CB20", "INSERT INTO TXPENS000(Lb_numero, Lb_lineaPq, Lb_Envio, Lb_RecPip, Lb_ForCod, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS000")
         ,new UpdateCursor("T01CB21", "UPDATE TXPENS000 SET Lb_Envio=?, Lb_RecPip=?, Lb_ForCod=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?", GX_NOMASK, "TXPENS000")
         ,new UpdateCursor("T01CB22", "DELETE FROM TXPENS000  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_lineaPq = ?", GX_NOMASK, "TXPENS000")
         ,new ForEachCursor("T01CB23", "SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01CB24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

