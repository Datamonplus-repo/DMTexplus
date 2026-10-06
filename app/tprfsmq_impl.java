package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprfsmq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_15B1290( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A9832MaqCodF = httpContext.GetPar( "MaqCodF") ;
         A9860MaqAnc = (short)(GXutil.lval( httpContext.GetPar( "MaqAnc"))) ;
         n9860MaqAnc = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_15B1290( A396EmprCod, A457FasCod, A9832MaqCodF, A9860MaqAnc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"MAQDSCF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9832MaqCodF = httpContext.GetPar( "MaqCodF") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asamaqdscf15B1290( A396EmprCod, A9832MaqCodF) ;
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
            A457FasCod = httpContext.GetPar( "FasCod") ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS FASE-MAQUINA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasDsc_Internalname ;
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

   public tprfsmq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprfsmq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprfsmq_impl.class ));
   }

   public tprfsmq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRFSMQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRFSMQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRFSMQ.htm");
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
         nBlankRcdCount1290 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1290 = (short)(1) ;
            scanStart15B1290( ) ;
            while ( RcdFound1290 != 0 )
            {
               init_level_properties1290( ) ;
               getByPrimaryKey15B1290( ) ;
               addRow15B1290( ) ;
               scanNext15B1290( ) ;
            }
            scanEnd15B1290( ) ;
            nBlankRcdCount1290 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal15B1290( ) ;
         standaloneModal15B1290( ) ;
         sMode1290 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow15B1290( ) ;
            edtavnRcdDeleted_1290_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1290_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1290_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1290_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqCodF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqDscF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSCF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQANC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAnc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1290 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15B1290( ) ;
            }
            sendRow15B1290( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1290 = (short)(5) ;
         nRcdExists_1290 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15B1290( ) ;
            while ( RcdFound1290 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401290( ) ;
               init_level_properties1290( ) ;
               standaloneNotModal15B1290( ) ;
               getByPrimaryKey15B1290( ) ;
               standaloneModal15B1290( ) ;
               addRow15B1290( ) ;
               scanNext15B1290( ) ;
            }
            scanEnd15B1290( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1290 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401290( ) ;
      initAll15B1290( ) ;
      init_level_properties1290( ) ;
      nRcdExists_1290 = (short)(0) ;
      nIsMod_1290 = (short)(0) ;
      nRcdDeleted_1290 = (short)(0) ;
      nBlankRcdCount1290 = (short)(nBlankRcdUsr1290+nBlankRcdCount1290) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1290 > 0 )
      {
         standaloneNotModal15B1290( ) ;
         standaloneModal15B1290( ) ;
         addRow15B1290( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqCodF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1290 = (short)(nBlankRcdCount1290-1) ;
      }
      Gx_mode = sMode1290 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRFSMQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRFSMQ.htm");
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
      e1115B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z460FasDsc = httpContext.cgiGet( "Z460FasDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
                        e1115B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PARAMETROS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Parametros' */
                        e1215B2 ();
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
            initAll15B45( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1290_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1290_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes15B45( ) ;
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

   public void confirm_15B0( )
   {
      beforeValidate15B45( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15B45( ) ;
         }
         else
         {
            checkExtendedTable15B45( ) ;
            if ( AnyError == 0 )
            {
               zm15B45( 7) ;
            }
            closeExtendedTableCursors15B45( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode45 = Gx_mode ;
         confirm_15B1290( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode45 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15B0( ) ;
      }
   }

   public void confirm_15B1290( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow15B1290( ) ;
         if ( ( nRcdExists_1290 != 0 ) || ( nIsMod_1290 != 0 ) )
         {
            getKey15B1290( ) ;
            if ( ( nRcdExists_1290 == 0 ) && ( nRcdDeleted_1290 == 0 ) )
            {
               if ( RcdFound1290 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15B1290( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15B1290( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors15B1290( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQCODF_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqCodF_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1290 != 0 )
               {
                  if ( nRcdDeleted_1290 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15B1290( ) ;
                     load15B1290( ) ;
                     beforeValidate15B1290( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15B1290( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1290 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15B1290( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15B1290( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors15B1290( ) ;
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
                  if ( nRcdDeleted_1290 == 0 )
                  {
                     GXCCtl = "MAQCODF_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCodF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1290_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCodF_Internalname, GXutil.rtrim( A9832MaqCodF)) ;
         httpContext.changePostValue( edtMaqDscF_Internalname, GXutil.rtrim( A9833MaqDscF)) ;
         httpContext.changePostValue( edtMaqAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9832MaqCodF_"+sGXsfl_40_idx, GXutil.rtrim( Z9832MaqCodF)) ;
         httpContext.changePostValue( "ZT_"+"Z9860MaqAnc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1290 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1290_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1290_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSCF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDscF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQANC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15B0( )
   {
   }

   public void e1115B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Fase", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprfsmq_impl.this.A396EmprCod = GXv_char2[0] ;
      tprfsmq_impl.this.AV11EmprNom = GXv_char3[0] ;
      tprfsmq_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e1215B2( )
   {
      /* 'Parametros' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         if ( A9860MaqAnc == 999 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A457FasCod ;
            GXv_char2[0] = A9832MaqCodF ;
            GXv_int5[0] = AV32Num_ri ;
            new app.pedivat(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
            tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
            tprfsmq_impl.this.A457FasCod = GXv_char3[0] ;
            tprfsmq_impl.this.A9832MaqCodF = GXv_char2[0] ;
            tprfsmq_impl.this.AV32Num_ri = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Num_ri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Num_ri), 4, 0));
            callWebObject(formatLink("app.tprmqfs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A457FasCod ;
            GXv_char2[0] = A9832MaqCodF ;
            GXv_int5[0] = AV33Num_rf ;
            new app.pedivat(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
            tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
            tprfsmq_impl.this.A457FasCod = GXv_char3[0] ;
            tprfsmq_impl.this.A9832MaqCodF = GXv_char2[0] ;
            tprfsmq_impl.this.AV33Num_rf = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV33Num_rf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Num_rf), 4, 0));
            if ( ( AV33Num_rf > AV32Num_ri ) && ( AV32Num_ri > 0 ) )
            {
            }
         }
         if ( ( A9860MaqAnc == 0 ) && ( A9860MaqAnc != 999 ) )
         {
            callWebObject(formatLink("app.tprmqfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void zm15B45( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z460FasDsc = T015B5_A460FasDsc[0] ;
         }
         else
         {
            Z460FasDsc = A460FasDsc ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TPRFSMQ" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T015B6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015B6_A407EmprNom[0] ;
      n407EmprNom = T015B6_n407EmprNom[0] ;
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

   public void load15B45( )
   {
      /* Using cursor T015B7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A407EmprNom = T015B7_A407EmprNom[0] ;
         n407EmprNom = T015B7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A460FasDsc = T015B7_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         zm15B45( -6) ;
      }
      pr_default.close(5);
      onLoadActions15B45( ) ;
   }

   public void onLoadActions15B45( )
   {
   }

   public void checkExtendedTable15B45( )
   {
      nIsDirty_45 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15B45( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15B45( )
   {
      /* Using cursor T015B8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015B5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T015B5_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015B5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15B45( 6) ;
         RcdFound45 = (short)(1) ;
         A460FasDsc = T015B5_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15B45( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey15B45( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey15B45( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15B45( ) ;
      if ( RcdFound45 == 0 )
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
      RcdFound45 = (short)(0) ;
      /* Using cursor T015B9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T015B9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015B9_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T015B9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015B9_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T015B10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T015B10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015B10_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T015B10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T015B10_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15B45( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFasDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15B45( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
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
               GX_FocusControl = edtFasDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15B45( ) ;
               GX_FocusControl = edtFasDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFasDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15B45( ) ;
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
                  GX_FocusControl = edtFasDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15B45( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
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
         GX_FocusControl = edtFasDsc_Internalname ;
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
      getKey15B45( ) ;
      if ( RcdFound45 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprfsmq");
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15B0( ) ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15B45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15B45( ) ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
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
      scanStart15B45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound45 != 0 )
         {
            scanNext15B45( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15B45( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15B45( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015B4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z460FasDsc, T015B4_A460FasDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z460FasDsc, T015B4_A460FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tprfsmq:[seudo value changed for attri]"+"FasDsc");
               GXutil.writeLogRaw("Old: ",Z460FasDsc);
               GXutil.writeLogRaw("Current: ",T015B4_A460FasDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15B45( )
   {
      beforeValidate15B45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15B45( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15B45( 0) ;
         checkOptimisticConcurrency15B45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15B45( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15B45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015B11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A460FasDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
                        processLevel15B45( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15B0( ) ;
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
            load15B45( ) ;
         }
         endLevel15B45( ) ;
      }
      closeExtendedTableCursors15B45( ) ;
   }

   public void update15B45( )
   {
      beforeValidate15B45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15B45( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15B45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15B45( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15B45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015B12 */
                  pr_default.execute(10, new Object[] {A460FasDsc, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15B45( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A457FasCod ;
                     new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                     tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
                     tprfsmq_impl.this.A457FasCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15B45( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15B0( ) ;
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
         endLevel15B45( ) ;
      }
      closeExtendedTableCursors15B45( ) ;
   }

   public void deferredUpdate15B45( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15B45( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15B45( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15B45( ) ;
         afterConfirm15B45( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15B45( ) ;
            if ( AnyError == 0 )
            {
               scanStart15B1290( ) ;
               while ( RcdFound1290 != 0 )
               {
                  getByPrimaryKey15B1290( ) ;
                  delete15B1290( ) ;
                  scanNext15B1290( ) ;
               }
               scanEnd15B1290( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015B13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound45 == 0 )
                        {
                           initAll15B45( ) ;
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
                        resetCaption15B0( ) ;
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15B45( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15B45( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015B14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T015B15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T015B16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T015B17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T015B18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T015B19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AVI001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T015B20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T015B21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T015B22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtPrd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T015B23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T015B24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T015B25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALAPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T015B26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERECL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T015B27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T015B28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T015B29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASES (TERMINALES BROS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T015B30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T015B31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T015B32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T015B33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T015B34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T015B35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T015B36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T015B37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void processNestedLevel15B1290( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow15B1290( ) ;
         if ( ( nRcdExists_1290 != 0 ) || ( nIsMod_1290 != 0 ) )
         {
            standaloneNotModal15B1290( ) ;
            getKey15B1290( ) ;
            if ( ( nRcdExists_1290 == 0 ) && ( nRcdDeleted_1290 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15B1290( ) ;
            }
            else
            {
               if ( RcdFound1290 != 0 )
               {
                  if ( ( nRcdDeleted_1290 != 0 ) && ( nRcdExists_1290 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15B1290( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1290 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15B1290( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1290 == 0 )
                  {
                     GXCCtl = "MAQCODF_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCodF_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1290_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCodF_Internalname, GXutil.rtrim( A9832MaqCodF)) ;
         httpContext.changePostValue( edtMaqDscF_Internalname, GXutil.rtrim( A9833MaqDscF)) ;
         httpContext.changePostValue( edtMaqAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9832MaqCodF_"+sGXsfl_40_idx, GXutil.rtrim( Z9832MaqCodF)) ;
         httpContext.changePostValue( "ZT_"+"Z9860MaqAnc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1290_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1290 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1290_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1290_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCODF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSCF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDscF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQANC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15B1290( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1290 = (short)(0) ;
      nIsMod_1290 = (short)(0) ;
      nRcdDeleted_1290 = (short)(0) ;
   }

   public void processLevel15B45( )
   {
      /* Save parent mode. */
      sMode45 = Gx_mode ;
      processNestedLevel15B1290( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15B45( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15B45( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprfsmq");
         if ( AnyError == 0 )
         {
            confirmValues15B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprfsmq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15B45( )
   {
      /* Scan By routine */
      /* Using cursor T015B38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15B45( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
   }

   public void scanEnd15B45( )
   {
      pr_default.close(36);
   }

   public void afterConfirm15B45( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15B45( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15B45( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15B45( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15B45( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15B45( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15B45( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
   }

   public void zm15B1290( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9860MaqAnc = T015B3_A9860MaqAnc[0] ;
         }
         else
         {
            Z9860MaqAnc = A9860MaqAnc ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         Z9860MaqAnc = A9860MaqAnc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal15B1290( )
   {
   }

   public void standaloneModal15B1290( )
   {
      if ( isIns( )  && (0==A9860MaqAnc) && ( Gx_BScreen == 0 ) )
      {
         A9860MaqAnc = (short)(999) ;
         n9860MaqAnc = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqCodF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMaqCodF_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load15B1290( )
   {
      /* Using cursor T015B39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1290 = (short)(1) ;
         A9860MaqAnc = T015B39_A9860MaqAnc[0] ;
         n9860MaqAnc = T015B39_n9860MaqAnc[0] ;
         zm15B1290( -8) ;
      }
      pr_default.close(37);
      onLoadActions15B1290( ) ;
   }

   public void onLoadActions15B1290( )
   {
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
      tprfsmq_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9833MaqDscF = GXt_char1 ;
   }

   public void checkExtendedTable15B1290( )
   {
      nIsDirty_1290 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal15B1290( ) ;
      nIsDirty_1290 = (short)(1) ;
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
      tprfsmq_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9833MaqDscF = GXt_char1 ;
      if ( ( GXutil.strcmp(A9833MaqDscF, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ && true /* After */ )
      {
         GXCCtl = "MAQCODF_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15B1290( )
   {
   }

   public void enableDisable15B1290( )
   {
   }

   public void getKey15B1290( )
   {
      /* Using cursor T015B40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1290 = (short)(1) ;
      }
      else
      {
         RcdFound1290 = (short)(0) ;
      }
      pr_default.close(38);
   }

   public void getByPrimaryKey15B1290( )
   {
      /* Using cursor T015B3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015B3_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T015B3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15B1290( 8) ;
         RcdFound1290 = (short)(1) ;
         initializeNonKey15B1290( ) ;
         A9832MaqCodF = T015B3_A9832MaqCodF[0] ;
         A9860MaqAnc = T015B3_A9860MaqAnc[0] ;
         n9860MaqAnc = T015B3_n9860MaqAnc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z9832MaqCodF = A9832MaqCodF ;
         sMode1290 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15B1290( ) ;
         load15B1290( ) ;
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1290 = (short)(0) ;
         initializeNonKey15B1290( ) ;
         sMode1290 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15B1290( ) ;
         Gx_mode = sMode1290 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15B1290( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15B1290( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015B2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPARFSM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z9860MaqAnc != T015B2_A9860MaqAnc[0] ) )
         {
            if ( Z9860MaqAnc != T015B2_A9860MaqAnc[0] )
            {
               GXutil.writeLogln("tprfsmq:[seudo value changed for attri]"+"MaqAnc");
               GXutil.writeLogRaw("Old: ",Z9860MaqAnc);
               GXutil.writeLogRaw("Current: ",T015B2_A9860MaqAnc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPARFSM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15B1290( )
   {
      beforeValidate15B1290( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15B1290( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15B1290( 0) ;
         checkOptimisticConcurrency15B1290( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15B1290( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15B1290( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015B41 */
                  pr_default.execute(39, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF, Boolean.valueOf(n9860MaqAnc), Short.valueOf(A9860MaqAnc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
                  if ( (pr_default.getStatus(39) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ && ( A9860MaqAnc == 999 ) )
                     {
                        httpContext.wjLoc = formatLink("app.tprmqfs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"})  ;
                     }
                     if ( true /* After */ && ( A9860MaqAnc == 0 ) && ( A9860MaqAnc != 999 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A457FasCod ;
                        GXv_char2[0] = A9832MaqCodF ;
                        GXv_int5[0] = A9860MaqAnc ;
                        new app.pprmqfa(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
                        tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
                        tprfsmq_impl.this.A457FasCod = GXv_char3[0] ;
                        tprfsmq_impl.this.A9832MaqCodF = GXv_char2[0] ;
                        tprfsmq_impl.this.A9860MaqAnc = GXv_int5[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
                     }
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
            load15B1290( ) ;
         }
         endLevel15B1290( ) ;
      }
      closeExtendedTableCursors15B1290( ) ;
   }

   public void update15B1290( )
   {
      beforeValidate15B1290( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15B1290( ) ;
      }
      if ( ( nIsMod_1290 != 0 ) || ( nIsDirty_1290 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15B1290( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15B1290( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15B1290( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015B42 */
                     pr_default.execute(40, new Object[] {Boolean.valueOf(n9860MaqAnc), Short.valueOf(A9860MaqAnc), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
                     if ( (pr_default.getStatus(40) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPARFSM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15B1290( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A457FasCod ;
                        new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
                        tprfsmq_impl.this.A457FasCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15B1290( ) ;
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
            endLevel15B1290( ) ;
         }
      }
      closeExtendedTableCursors15B1290( ) ;
   }

   public void deferredUpdate15B1290( )
   {
   }

   public void delete15B1290( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15B1290( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15B1290( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15B1290( ) ;
         afterConfirm15B1290( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15B1290( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015B43 */
               pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
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
      sMode1290 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15B1290( ) ;
      Gx_mode = sMode1290 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15B1290( )
   {
      standaloneModal15B1290( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A9833MaqDscF ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9832MaqCodF ;
         GXv_char2[0] = GXt_char1 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
         tprfsmq_impl.this.A9832MaqCodF = GXv_char3[0] ;
         tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9833MaqDscF = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T015B44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRMQFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T015B45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRFSMQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T015B46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, A9832MaqCodF});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
      }
   }

   public void endLevel15B1290( )
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

   public void scanStart15B1290( )
   {
      /* Scan By routine */
      /* Using cursor T015B47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      RcdFound1290 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1290 = (short)(1) ;
         A9832MaqCodF = T015B47_A9832MaqCodF[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15B1290( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1290 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1290 = (short)(1) ;
         A9832MaqCodF = T015B47_A9832MaqCodF[0] ;
      }
   }

   public void scanEnd15B1290( )
   {
      pr_default.close(45);
   }

   public void afterConfirm15B1290( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15B1290( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15B1290( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15B1290( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15B1290( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15B1290( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15B1290( )
   {
      edtMaqCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMaqDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDscF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMaqAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqAnc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes15B1290( )
   {
   }

   public void send_integrity_lvl_hashes15B45( )
   {
   }

   public void subsflControlProps_401290( )
   {
      edtavnRcdDeleted_1290_Internalname = "vNRCDDELETED_1290_"+sGXsfl_40_idx ;
      edtMaqCodF_Internalname = "MAQCODF_"+sGXsfl_40_idx ;
      edtMaqDscF_Internalname = "MAQDSCF_"+sGXsfl_40_idx ;
      edtMaqAnc_Internalname = "MAQANC_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401290( )
   {
      edtavnRcdDeleted_1290_Internalname = "vNRCDDELETED_1290_"+sGXsfl_40_fel_idx ;
      edtMaqCodF_Internalname = "MAQCODF_"+sGXsfl_40_fel_idx ;
      edtMaqDscF_Internalname = "MAQDSCF_"+sGXsfl_40_fel_idx ;
      edtMaqAnc_Internalname = "MAQANC_"+sGXsfl_40_fel_idx ;
   }

   public void addRow15B1290( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401290( ) ;
      sendRow15B1290( ) ;
   }

   public void sendRow15B1290( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1290_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1290_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1290_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1290), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1290), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1290_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1290_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1290_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodF_Internalname,GXutil.rtrim( A9832MaqCodF),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCodF_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDscF_Internalname,GXutil.rtrim( A9833MaqDscF),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDscF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDscF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1290_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9860MaqAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9860MaqAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15B1290( ) ;
      GXCCtl = "Z9832MaqCodF_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9832MaqCodF));
      GXCCtl = "Z9860MaqAnc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9860MaqAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1290_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1290_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1290_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1290, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vNUM_RI_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32Num_ri, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vNUM_RF_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Num_rf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1290_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1290_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSCF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDscF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQANC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15B1290( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401290( ) ;
      edtavnRcdDeleted_1290_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1290_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCodF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCODF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDscF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSCF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQANC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1290_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1290_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1290");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1290_Internalname ;
         wbErr = true ;
         nRcdDeleted_1290 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1290 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1290_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9832MaqCodF = httpContext.cgiGet( edtMaqCodF_Internalname) ;
      A9833MaqDscF = httpContext.cgiGet( edtMaqDscF_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "MAQANC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqAnc_Internalname ;
         wbErr = true ;
         A9860MaqAnc = (short)(0) ;
         n9860MaqAnc = false ;
      }
      else
      {
         A9860MaqAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9860MaqAnc = false ;
      }
      GXCCtl = "Z9832MaqCodF_" + sGXsfl_40_idx ;
      Z9832MaqCodF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9860MaqAnc_" + sGXsfl_40_idx ;
      Z9860MaqAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1290_" + sGXsfl_40_idx ;
      nRcdDeleted_1290 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1290_" + sGXsfl_40_idx ;
      nRcdExists_1290 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1290_" + sGXsfl_40_idx ;
      nIsMod_1290 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqCodF_Enabled = edtMaqCodF_Enabled ;
   }

   public void confirmValues15B0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401290( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401290( ) ;
         httpContext.changePostValue( "Z9832MaqCodF_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z9832MaqCodF_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9832MaqCodF_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z9860MaqAnc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z9860MaqAnc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9860MaqAnc_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprfsmq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","FasCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_RI", GXutil.ltrim( localUtil.ntoc( AV32Num_ri, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_RF", GXutil.ltrim( localUtil.ntoc( AV33Num_rf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.tprfsmq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPRFSMQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS FASE-MAQUINA", "") ;
   }

   public void initializeNonKey15B45( )
   {
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      Z460FasDsc = "" ;
   }

   public void initAll15B45( )
   {
      initializeNonKey15B45( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15B1290( )
   {
      A9833MaqDscF = "" ;
      A9860MaqAnc = (short)(999) ;
      n9860MaqAnc = false ;
      Z9860MaqAnc = (short)(0) ;
   }

   public void initAll15B1290( )
   {
      A9832MaqCodF = "" ;
      initializeNonKey15B1290( ) ;
   }

   public void standaloneModalInsert15B1290( )
   {
      A9860MaqAnc = i9860MaqAnc ;
      n9860MaqAnc = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543278", true, true);
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
      httpContext.AddJavascriptSource("tprfsmq.js", "?20268241543278", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1290( )
   {
      edtMaqCodF_Enabled = defedtMaqCodF_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodF_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1290, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1290_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9832MaqCodF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCodF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9833MaqDscF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDscF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9860MaqAnc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFasCod_Internalname = "FASCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtavnRcdDeleted_1290_Internalname = "vNRCDDELETED_1290" ;
      edtMaqCodF_Internalname = "MAQCODF" ;
      edtMaqDscF_Internalname = "MAQDSCF" ;
      edtMaqAnc_Internalname = "MAQANC" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS FASE-MAQUINA", "") );
      edtMaqAnc_Jsonclick = "" ;
      edtMaqDscF_Jsonclick = "" ;
      edtMaqCodF_Jsonclick = "" ;
      edtavnRcdDeleted_1290_Jsonclick = "" ;
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
      edtMaqAnc_Enabled = 1 ;
      edtMaqDscF_Enabled = 0 ;
      edtMaqCodF_Enabled = 1 ;
      edtavnRcdDeleted_1290_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
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

   public void gx1asamaqdscf15B1290( String A396EmprCod ,
                                     String A9832MaqCodF )
   {
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
      tprfsmq_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9833MaqDscF = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9833MaqDscF))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_4_15B1290( )
   {
      if ( true /* After */ && true /* Level */ && ( A9860MaqAnc == 999 ) )
      {
         httpContext.wjLoc = formatLink("app.tprmqfs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A9832MaqCodF))}, new String[] {"EmprCod","FasCod","MaqCodF"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_5_15B1290( String A396EmprCod ,
                             String A457FasCod ,
                             String A9832MaqCodF ,
                             short A9860MaqAnc )
   {
      if ( true /* After */ && ( A9860MaqAnc == 0 ) && ( A9860MaqAnc != 999 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char2[0] = A9832MaqCodF ;
         GXv_int5[0] = A9860MaqAnc ;
         new app.pprmqfa(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         A457FasCod = GXv_char3[0] ;
         A9832MaqCodF = GXv_char2[0] ;
         A9860MaqAnc = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9832MaqCodF))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9860MaqAnc, (byte)(3), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_401290( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15B1290( ) ;
         standaloneModal15B1290( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15B1290( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401290( ) ;
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
      /* Using cursor T015B48 */
      pr_default.execute(46, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015B48_A407EmprNom[0] ;
      n407EmprNom = T015B48_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(46);
      GX_FocusControl = edtFasDsc_Internalname ;
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

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Maqcodf( )
   {
      GXt_char1 = A9833MaqDscF ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9832MaqCodF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprfsmq_impl.this.A396EmprCod = GXv_char4[0] ;
      tprfsmq_impl.this.A9832MaqCodF = GXv_char3[0] ;
      tprfsmq_impl.this.GXt_char1 = GXv_char2[0] ;
      A9833MaqDscF = GXt_char1 ;
      if ( ( GXutil.strcmp(A9833MaqDscF, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina Inexistente", ""), 1, "MAQCODF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodF_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9833MaqDscF", GXutil.rtrim( A9833MaqDscF));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'PARAMETROS'","{handler:'e1215B2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A9860MaqAnc',fld:'MAQANC',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'AV32Num_ri',fld:'vNUM_RI',pic:'ZZZ9'},{av:'AV33Num_rf',fld:'vNUM_RF',pic:'ZZZ9'}]");
      setEventMetadata("'PARAMETROS'",",oparms:[{av:'AV32Num_ri',fld:'vNUM_RI',pic:'ZZZ9'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33Num_rf',fld:'vNUM_RF',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z457FasCod'},{av:'Z407EmprNom'},{av:'Z460FasDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCODF","{handler:'valid_Maqcodf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9832MaqCodF',fld:'MAQCODF',pic:''},{av:'A9833MaqDscF',fld:'MAQDSCF',pic:''}]");
      setEventMetadata("VALID_MAQCODF",",oparms:[{av:'A9833MaqDscF',fld:'MAQDSCF',pic:''}]}");
      setEventMetadata("VALID_MAQANC","{handler:'valid_Maqanc',iparms:[]");
      setEventMetadata("VALID_MAQANC",",oparms:[]}");
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
      pr_default.close(46);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA457FasCod = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      Z9832MaqCodF = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A9832MaqCodF = "" ;
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
      A460FasDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1290 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode45 = "" ;
      GXCCtl = "" ;
      A9833MaqDscF = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T015B6_A407EmprNom = new String[] {""} ;
      T015B6_n407EmprNom = new boolean[] {false} ;
      T015B7_A457FasCod = new String[] {""} ;
      T015B7_n457FasCod = new boolean[] {false} ;
      T015B7_A407EmprNom = new String[] {""} ;
      T015B7_n407EmprNom = new boolean[] {false} ;
      T015B7_A460FasDsc = new String[] {""} ;
      T015B7_A396EmprCod = new String[] {""} ;
      T015B8_A396EmprCod = new String[] {""} ;
      T015B8_A457FasCod = new String[] {""} ;
      T015B8_n457FasCod = new boolean[] {false} ;
      T015B5_A457FasCod = new String[] {""} ;
      T015B5_n457FasCod = new boolean[] {false} ;
      T015B5_A460FasDsc = new String[] {""} ;
      T015B5_A396EmprCod = new String[] {""} ;
      T015B9_A396EmprCod = new String[] {""} ;
      T015B9_A457FasCod = new String[] {""} ;
      T015B9_n457FasCod = new boolean[] {false} ;
      T015B10_A396EmprCod = new String[] {""} ;
      T015B10_A457FasCod = new String[] {""} ;
      T015B10_n457FasCod = new boolean[] {false} ;
      T015B4_A457FasCod = new String[] {""} ;
      T015B4_n457FasCod = new boolean[] {false} ;
      T015B4_A460FasDsc = new String[] {""} ;
      T015B4_A396EmprCod = new String[] {""} ;
      T015B14_A396EmprCod = new String[] {""} ;
      T015B14_A129BarCod = new int[1] ;
      T015B14_A132BarCodReo = new byte[1] ;
      T015B14_A130BarCodPar = new String[] {""} ;
      T015B14_A14152MEnvOrd = new short[1] ;
      T015B15_A396EmprCod = new String[] {""} ;
      T015B15_A13026PedDGId = new int[1] ;
      T015B15_A758ProCod = new String[] {""} ;
      T015B15_A13045PedDGFasLi = new short[1] ;
      T015B16_A396EmprCod = new String[] {""} ;
      T015B16_A6882Tas_num = new int[1] ;
      T015B16_A6922Tas_lin = new short[1] ;
      T015B17_A396EmprCod = new String[] {""} ;
      T015B17_A11604PArtId = new int[1] ;
      T015B17_A11611PAFOrd = new short[1] ;
      T015B18_A396EmprCod = new String[] {""} ;
      T015B18_A11278Regc_c1 = new String[] {""} ;
      T015B18_A457FasCod = new String[] {""} ;
      T015B18_n457FasCod = new boolean[] {false} ;
      T015B19_A396EmprCod = new String[] {""} ;
      T015B19_A1131AviNumero = new long[1] ;
      T015B19_A457FasCod = new String[] {""} ;
      T015B19_n457FasCod = new boolean[] {false} ;
      T015B20_A396EmprCod = new String[] {""} ;
      T015B20_A457FasCod = new String[] {""} ;
      T015B20_n457FasCod = new boolean[] {false} ;
      T015B20_A9832MaqCodF = new String[] {""} ;
      T015B20_A9723Cod_par = new short[1] ;
      T015B21_A396EmprCod = new String[] {""} ;
      T015B21_A457FasCod = new String[] {""} ;
      T015B21_n457FasCod = new boolean[] {false} ;
      T015B21_A9723Cod_par = new short[1] ;
      T015B22_A396EmprCod = new String[] {""} ;
      T015B22_A457FasCod = new String[] {""} ;
      T015B22_n457FasCod = new boolean[] {false} ;
      T015B22_A8096FasArtTip = new short[1] ;
      T015B22_A7730FasArtInt = new byte[1] ;
      T015B22_A7731FasArtSeg = new String[] {""} ;
      T015B23_A396EmprCod = new String[] {""} ;
      T015B23_A6633NumOrd = new short[1] ;
      T015B23_A457FasCod = new String[] {""} ;
      T015B23_n457FasCod = new boolean[] {false} ;
      T015B24_A396EmprCod = new String[] {""} ;
      T015B24_A2253SalExtAlb = new int[1] ;
      T015B24_A6248SalExNln = new short[1] ;
      T015B25_A396EmprCod = new String[] {""} ;
      T015B25_A457FasCod = new String[] {""} ;
      T015B25_n457FasCod = new boolean[] {false} ;
      T015B25_A5703Hh_FLin = new short[1] ;
      T015B26_A396EmprCod = new String[] {""} ;
      T015B26_A4744RecPreCod = new int[1] ;
      T015B27_A396EmprCod = new String[] {""} ;
      T015B27_A457FasCod = new String[] {""} ;
      T015B27_n457FasCod = new boolean[] {false} ;
      T015B27_A4650FasForLin = new short[1] ;
      T015B28_A396EmprCod = new String[] {""} ;
      T015B28_A457FasCod = new String[] {""} ;
      T015B28_n457FasCod = new boolean[] {false} ;
      T015B28_A4031CCTCod = new int[1] ;
      T015B29_A396EmprCod = new String[] {""} ;
      T015B29_A457FasCod = new String[] {""} ;
      T015B29_n457FasCod = new boolean[] {false} ;
      T015B29_A3635FasTerCod = new byte[1] ;
      T015B30_A396EmprCod = new String[] {""} ;
      T015B30_A2406ExhAlbCod = new int[1] ;
      T015B30_A129BarCod = new int[1] ;
      T015B30_A132BarCodReo = new byte[1] ;
      T015B30_A130BarCodPar = new String[] {""} ;
      T015B31_A396EmprCod = new String[] {""} ;
      T015B31_A2253SalExtAlb = new int[1] ;
      T015B31_A129BarCod = new int[1] ;
      T015B31_A132BarCodReo = new byte[1] ;
      T015B31_A130BarCodPar = new String[] {""} ;
      T015B32_A396EmprCod = new String[] {""} ;
      T015B32_A30AlbProCod = new long[1] ;
      T015B32_A129BarCod = new int[1] ;
      T015B32_A132BarCodReo = new byte[1] ;
      T015B32_A130BarCodPar = new String[] {""} ;
      T015B32_A1240GuiFasLin = new short[1] ;
      T015B33_A396EmprCod = new String[] {""} ;
      T015B33_A758ProCod = new String[] {""} ;
      T015B33_A774ProNumLin = new short[1] ;
      T015B34_A396EmprCod = new String[] {""} ;
      T015B34_A252CliCod = new int[1] ;
      T015B34_A457FasCod = new String[] {""} ;
      T015B34_n457FasCod = new boolean[] {false} ;
      T015B35_A396EmprCod = new String[] {""} ;
      T015B35_A457FasCod = new String[] {""} ;
      T015B35_n457FasCod = new boolean[] {false} ;
      T015B35_A463FasNumLin = new byte[1] ;
      T015B36_A396EmprCod = new String[] {""} ;
      T015B36_A361DisCod = new int[1] ;
      T015B36_A758ProCod = new String[] {""} ;
      T015B36_A368DisFasLin = new short[1] ;
      T015B37_A396EmprCod = new String[] {""} ;
      T015B37_A129BarCod = new int[1] ;
      T015B37_A132BarCodReo = new byte[1] ;
      T015B37_A130BarCodPar = new String[] {""} ;
      T015B37_A758ProCod = new String[] {""} ;
      T015B37_A194BarOrdLin = new short[1] ;
      T015B38_A396EmprCod = new String[] {""} ;
      T015B38_A457FasCod = new String[] {""} ;
      T015B38_n457FasCod = new boolean[] {false} ;
      T015B39_A457FasCod = new String[] {""} ;
      T015B39_n457FasCod = new boolean[] {false} ;
      T015B39_A9832MaqCodF = new String[] {""} ;
      T015B39_A9860MaqAnc = new short[1] ;
      T015B39_n9860MaqAnc = new boolean[] {false} ;
      T015B39_A396EmprCod = new String[] {""} ;
      T015B40_A396EmprCod = new String[] {""} ;
      T015B40_A457FasCod = new String[] {""} ;
      T015B40_n457FasCod = new boolean[] {false} ;
      T015B40_A9832MaqCodF = new String[] {""} ;
      T015B3_A457FasCod = new String[] {""} ;
      T015B3_n457FasCod = new boolean[] {false} ;
      T015B3_A9832MaqCodF = new String[] {""} ;
      T015B3_A9860MaqAnc = new short[1] ;
      T015B3_n9860MaqAnc = new boolean[] {false} ;
      T015B3_A396EmprCod = new String[] {""} ;
      T015B2_A457FasCod = new String[] {""} ;
      T015B2_n457FasCod = new boolean[] {false} ;
      T015B2_A9832MaqCodF = new String[] {""} ;
      T015B2_A9860MaqAnc = new short[1] ;
      T015B2_n9860MaqAnc = new boolean[] {false} ;
      T015B2_A396EmprCod = new String[] {""} ;
      T015B44_A396EmprCod = new String[] {""} ;
      T015B44_A457FasCod = new String[] {""} ;
      T015B44_n457FasCod = new boolean[] {false} ;
      T015B44_A9832MaqCodF = new String[] {""} ;
      T015B44_A9863MaqAncM = new short[1] ;
      T015B45_A396EmprCod = new String[] {""} ;
      T015B45_A457FasCod = new String[] {""} ;
      T015B45_n457FasCod = new boolean[] {false} ;
      T015B45_A9832MaqCodF = new String[] {""} ;
      T015B45_A9834Cod_parF = new short[1] ;
      T015B46_A396EmprCod = new String[] {""} ;
      T015B46_A457FasCod = new String[] {""} ;
      T015B46_n457FasCod = new boolean[] {false} ;
      T015B46_A9832MaqCodF = new String[] {""} ;
      T015B46_A9723Cod_par = new short[1] ;
      T015B47_A396EmprCod = new String[] {""} ;
      T015B47_A457FasCod = new String[] {""} ;
      T015B47_n457FasCod = new boolean[] {false} ;
      T015B47_A9832MaqCodF = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int5 = new short[1] ;
      T015B48_A407EmprNom = new String[] {""} ;
      T015B48_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ460FasDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z9833MaqDscF = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprfsmq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprfsmq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprfsmq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprfsmq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprfsmq__default(),
         new Object[] {
             new Object[] {
            T015B2_A457FasCod, T015B2_A9832MaqCodF, T015B2_A9860MaqAnc, T015B2_n9860MaqAnc, T015B2_A396EmprCod
            }
            , new Object[] {
            T015B3_A457FasCod, T015B3_A9832MaqCodF, T015B3_A9860MaqAnc, T015B3_n9860MaqAnc, T015B3_A396EmprCod
            }
            , new Object[] {
            T015B4_A457FasCod, T015B4_A460FasDsc, T015B4_A396EmprCod
            }
            , new Object[] {
            T015B5_A457FasCod, T015B5_A460FasDsc, T015B5_A396EmprCod
            }
            , new Object[] {
            T015B6_A407EmprNom, T015B6_n407EmprNom
            }
            , new Object[] {
            T015B7_A457FasCod, T015B7_A407EmprNom, T015B7_n407EmprNom, T015B7_A460FasDsc, T015B7_A396EmprCod
            }
            , new Object[] {
            T015B8_A396EmprCod, T015B8_A457FasCod
            }
            , new Object[] {
            T015B9_A396EmprCod, T015B9_A457FasCod
            }
            , new Object[] {
            T015B10_A396EmprCod, T015B10_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015B14_A396EmprCod, T015B14_A129BarCod, T015B14_A132BarCodReo, T015B14_A130BarCodPar, T015B14_A14152MEnvOrd
            }
            , new Object[] {
            T015B15_A396EmprCod, T015B15_A13026PedDGId, T015B15_A758ProCod, T015B15_A13045PedDGFasLi
            }
            , new Object[] {
            T015B16_A396EmprCod, T015B16_A6882Tas_num, T015B16_A6922Tas_lin
            }
            , new Object[] {
            T015B17_A396EmprCod, T015B17_A11604PArtId, T015B17_A11611PAFOrd
            }
            , new Object[] {
            T015B18_A396EmprCod, T015B18_A11278Regc_c1, T015B18_A457FasCod
            }
            , new Object[] {
            T015B19_A396EmprCod, T015B19_A1131AviNumero, T015B19_A457FasCod
            }
            , new Object[] {
            T015B20_A396EmprCod, T015B20_A457FasCod, T015B20_A9832MaqCodF, T015B20_A9723Cod_par
            }
            , new Object[] {
            T015B21_A396EmprCod, T015B21_A457FasCod, T015B21_A9723Cod_par
            }
            , new Object[] {
            T015B22_A396EmprCod, T015B22_A457FasCod, T015B22_A8096FasArtTip, T015B22_A7730FasArtInt, T015B22_A7731FasArtSeg
            }
            , new Object[] {
            T015B23_A396EmprCod, T015B23_A6633NumOrd, T015B23_A457FasCod
            }
            , new Object[] {
            T015B24_A396EmprCod, T015B24_A2253SalExtAlb, T015B24_A6248SalExNln
            }
            , new Object[] {
            T015B25_A396EmprCod, T015B25_A457FasCod, T015B25_A5703Hh_FLin
            }
            , new Object[] {
            T015B26_A396EmprCod, T015B26_A4744RecPreCod
            }
            , new Object[] {
            T015B27_A396EmprCod, T015B27_A457FasCod, T015B27_A4650FasForLin
            }
            , new Object[] {
            T015B28_A396EmprCod, T015B28_A457FasCod, T015B28_A4031CCTCod
            }
            , new Object[] {
            T015B29_A396EmprCod, T015B29_A457FasCod, T015B29_A3635FasTerCod
            }
            , new Object[] {
            T015B30_A396EmprCod, T015B30_A2406ExhAlbCod, T015B30_A129BarCod, T015B30_A132BarCodReo, T015B30_A130BarCodPar
            }
            , new Object[] {
            T015B31_A396EmprCod, T015B31_A2253SalExtAlb, T015B31_A129BarCod, T015B31_A132BarCodReo, T015B31_A130BarCodPar
            }
            , new Object[] {
            T015B32_A396EmprCod, T015B32_A30AlbProCod, T015B32_A129BarCod, T015B32_A132BarCodReo, T015B32_A130BarCodPar, T015B32_A1240GuiFasLin
            }
            , new Object[] {
            T015B33_A396EmprCod, T015B33_A758ProCod, T015B33_A774ProNumLin
            }
            , new Object[] {
            T015B34_A396EmprCod, T015B34_A252CliCod, T015B34_A457FasCod
            }
            , new Object[] {
            T015B35_A396EmprCod, T015B35_A457FasCod, T015B35_A463FasNumLin
            }
            , new Object[] {
            T015B36_A396EmprCod, T015B36_A361DisCod, T015B36_A758ProCod, T015B36_A368DisFasLin
            }
            , new Object[] {
            T015B37_A396EmprCod, T015B37_A129BarCod, T015B37_A132BarCodReo, T015B37_A130BarCodPar, T015B37_A758ProCod, T015B37_A194BarOrdLin
            }
            , new Object[] {
            T015B38_A396EmprCod, T015B38_A457FasCod
            }
            , new Object[] {
            T015B39_A457FasCod, T015B39_A9832MaqCodF, T015B39_A9860MaqAnc, T015B39_n9860MaqAnc, T015B39_A396EmprCod
            }
            , new Object[] {
            T015B40_A396EmprCod, T015B40_A457FasCod, T015B40_A9832MaqCodF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015B44_A396EmprCod, T015B44_A457FasCod, T015B44_A9832MaqCodF, T015B44_A9863MaqAncM
            }
            , new Object[] {
            T015B45_A396EmprCod, T015B45_A457FasCod, T015B45_A9832MaqCodF, T015B45_A9834Cod_parF
            }
            , new Object[] {
            T015B46_A396EmprCod, T015B46_A457FasCod, T015B46_A9832MaqCodF, T015B46_A9723Cod_par
            }
            , new Object[] {
            T015B47_A396EmprCod, T015B47_A457FasCod, T015B47_A9832MaqCodF
            }
            , new Object[] {
            T015B48_A407EmprNom, T015B48_n407EmprNom
            }
         }
      );
      Z457FasCod = "" ;
      n457FasCod = false ;
      A457FasCod = "" ;
      n457FasCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TPRFSMQ" ;
      Z9860MaqAnc = (short)(999) ;
      n9860MaqAnc = false ;
      i9860MaqAnc = (short)(999) ;
      n9860MaqAnc = false ;
      A9860MaqAnc = (short)(999) ;
      n9860MaqAnc = false ;
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
   private short Z9860MaqAnc ;
   private short nRcdDeleted_1290 ;
   private short nRcdExists_1290 ;
   private short nIsMod_1290 ;
   private short A9860MaqAnc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1290 ;
   private short RcdFound1290 ;
   private short nBlankRcdUsr1290 ;
   private short AV32Num_ri ;
   private short AV33Num_rf ;
   private short RcdFound45 ;
   private short nIsDirty_45 ;
   private short nIsDirty_1290 ;
   private short i9860MaqAnc ;
   private short GXv_int5[] ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtavnRcdDeleted_1290_Enabled ;
   private int edtMaqCodF_Enabled ;
   private int edtMaqDscF_Enabled ;
   private int edtMaqAnc_Enabled ;
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
   private int defedtMaqCodF_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA457FasCod ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String Z9832MaqCodF ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A9832MaqCodF ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasDsc_Internalname ;
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
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String sMode1290 ;
   private String edtavnRcdDeleted_1290_Internalname ;
   private String edtMaqCodF_Internalname ;
   private String edtMaqDscF_Internalname ;
   private String edtMaqAnc_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode45 ;
   private String GXCCtl ;
   private String A9833MaqDscF ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1290_Jsonclick ;
   private String edtMaqCodF_Jsonclick ;
   private String edtMaqDscF_Jsonclick ;
   private String edtMaqAnc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ407EmprNom ;
   private String ZZ460FasDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9833MaqDscF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n457FasCod ;
   private boolean n9860MaqAnc ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015B6_A407EmprNom ;
   private boolean[] T015B6_n407EmprNom ;
   private String[] T015B7_A457FasCod ;
   private boolean[] T015B7_n457FasCod ;
   private String[] T015B7_A407EmprNom ;
   private boolean[] T015B7_n407EmprNom ;
   private String[] T015B7_A460FasDsc ;
   private String[] T015B7_A396EmprCod ;
   private String[] T015B8_A396EmprCod ;
   private String[] T015B8_A457FasCod ;
   private boolean[] T015B8_n457FasCod ;
   private String[] T015B5_A457FasCod ;
   private boolean[] T015B5_n457FasCod ;
   private String[] T015B5_A460FasDsc ;
   private String[] T015B5_A396EmprCod ;
   private String[] T015B9_A396EmprCod ;
   private String[] T015B9_A457FasCod ;
   private boolean[] T015B9_n457FasCod ;
   private String[] T015B10_A396EmprCod ;
   private String[] T015B10_A457FasCod ;
   private boolean[] T015B10_n457FasCod ;
   private String[] T015B4_A457FasCod ;
   private boolean[] T015B4_n457FasCod ;
   private String[] T015B4_A460FasDsc ;
   private String[] T015B4_A396EmprCod ;
   private String[] T015B14_A396EmprCod ;
   private int[] T015B14_A129BarCod ;
   private byte[] T015B14_A132BarCodReo ;
   private String[] T015B14_A130BarCodPar ;
   private short[] T015B14_A14152MEnvOrd ;
   private String[] T015B15_A396EmprCod ;
   private int[] T015B15_A13026PedDGId ;
   private String[] T015B15_A758ProCod ;
   private short[] T015B15_A13045PedDGFasLi ;
   private String[] T015B16_A396EmprCod ;
   private int[] T015B16_A6882Tas_num ;
   private short[] T015B16_A6922Tas_lin ;
   private String[] T015B17_A396EmprCod ;
   private int[] T015B17_A11604PArtId ;
   private short[] T015B17_A11611PAFOrd ;
   private String[] T015B18_A396EmprCod ;
   private String[] T015B18_A11278Regc_c1 ;
   private String[] T015B18_A457FasCod ;
   private boolean[] T015B18_n457FasCod ;
   private String[] T015B19_A396EmprCod ;
   private long[] T015B19_A1131AviNumero ;
   private String[] T015B19_A457FasCod ;
   private boolean[] T015B19_n457FasCod ;
   private String[] T015B20_A396EmprCod ;
   private String[] T015B20_A457FasCod ;
   private boolean[] T015B20_n457FasCod ;
   private String[] T015B20_A9832MaqCodF ;
   private short[] T015B20_A9723Cod_par ;
   private String[] T015B21_A396EmprCod ;
   private String[] T015B21_A457FasCod ;
   private boolean[] T015B21_n457FasCod ;
   private short[] T015B21_A9723Cod_par ;
   private String[] T015B22_A396EmprCod ;
   private String[] T015B22_A457FasCod ;
   private boolean[] T015B22_n457FasCod ;
   private short[] T015B22_A8096FasArtTip ;
   private byte[] T015B22_A7730FasArtInt ;
   private String[] T015B22_A7731FasArtSeg ;
   private String[] T015B23_A396EmprCod ;
   private short[] T015B23_A6633NumOrd ;
   private String[] T015B23_A457FasCod ;
   private boolean[] T015B23_n457FasCod ;
   private String[] T015B24_A396EmprCod ;
   private int[] T015B24_A2253SalExtAlb ;
   private short[] T015B24_A6248SalExNln ;
   private String[] T015B25_A396EmprCod ;
   private String[] T015B25_A457FasCod ;
   private boolean[] T015B25_n457FasCod ;
   private short[] T015B25_A5703Hh_FLin ;
   private String[] T015B26_A396EmprCod ;
   private int[] T015B26_A4744RecPreCod ;
   private String[] T015B27_A396EmprCod ;
   private String[] T015B27_A457FasCod ;
   private boolean[] T015B27_n457FasCod ;
   private short[] T015B27_A4650FasForLin ;
   private String[] T015B28_A396EmprCod ;
   private String[] T015B28_A457FasCod ;
   private boolean[] T015B28_n457FasCod ;
   private int[] T015B28_A4031CCTCod ;
   private String[] T015B29_A396EmprCod ;
   private String[] T015B29_A457FasCod ;
   private boolean[] T015B29_n457FasCod ;
   private byte[] T015B29_A3635FasTerCod ;
   private String[] T015B30_A396EmprCod ;
   private int[] T015B30_A2406ExhAlbCod ;
   private int[] T015B30_A129BarCod ;
   private byte[] T015B30_A132BarCodReo ;
   private String[] T015B30_A130BarCodPar ;
   private String[] T015B31_A396EmprCod ;
   private int[] T015B31_A2253SalExtAlb ;
   private int[] T015B31_A129BarCod ;
   private byte[] T015B31_A132BarCodReo ;
   private String[] T015B31_A130BarCodPar ;
   private String[] T015B32_A396EmprCod ;
   private long[] T015B32_A30AlbProCod ;
   private int[] T015B32_A129BarCod ;
   private byte[] T015B32_A132BarCodReo ;
   private String[] T015B32_A130BarCodPar ;
   private short[] T015B32_A1240GuiFasLin ;
   private String[] T015B33_A396EmprCod ;
   private String[] T015B33_A758ProCod ;
   private short[] T015B33_A774ProNumLin ;
   private String[] T015B34_A396EmprCod ;
   private int[] T015B34_A252CliCod ;
   private String[] T015B34_A457FasCod ;
   private boolean[] T015B34_n457FasCod ;
   private String[] T015B35_A396EmprCod ;
   private String[] T015B35_A457FasCod ;
   private boolean[] T015B35_n457FasCod ;
   private byte[] T015B35_A463FasNumLin ;
   private String[] T015B36_A396EmprCod ;
   private int[] T015B36_A361DisCod ;
   private String[] T015B36_A758ProCod ;
   private short[] T015B36_A368DisFasLin ;
   private String[] T015B37_A396EmprCod ;
   private int[] T015B37_A129BarCod ;
   private byte[] T015B37_A132BarCodReo ;
   private String[] T015B37_A130BarCodPar ;
   private String[] T015B37_A758ProCod ;
   private short[] T015B37_A194BarOrdLin ;
   private String[] T015B38_A396EmprCod ;
   private String[] T015B38_A457FasCod ;
   private boolean[] T015B38_n457FasCod ;
   private String[] T015B39_A457FasCod ;
   private boolean[] T015B39_n457FasCod ;
   private String[] T015B39_A9832MaqCodF ;
   private short[] T015B39_A9860MaqAnc ;
   private boolean[] T015B39_n9860MaqAnc ;
   private String[] T015B39_A396EmprCod ;
   private String[] T015B40_A396EmprCod ;
   private String[] T015B40_A457FasCod ;
   private boolean[] T015B40_n457FasCod ;
   private String[] T015B40_A9832MaqCodF ;
   private String[] T015B3_A457FasCod ;
   private boolean[] T015B3_n457FasCod ;
   private String[] T015B3_A9832MaqCodF ;
   private short[] T015B3_A9860MaqAnc ;
   private boolean[] T015B3_n9860MaqAnc ;
   private String[] T015B3_A396EmprCod ;
   private String[] T015B2_A457FasCod ;
   private boolean[] T015B2_n457FasCod ;
   private String[] T015B2_A9832MaqCodF ;
   private short[] T015B2_A9860MaqAnc ;
   private boolean[] T015B2_n9860MaqAnc ;
   private String[] T015B2_A396EmprCod ;
   private String[] T015B44_A396EmprCod ;
   private String[] T015B44_A457FasCod ;
   private boolean[] T015B44_n457FasCod ;
   private String[] T015B44_A9832MaqCodF ;
   private short[] T015B44_A9863MaqAncM ;
   private String[] T015B45_A396EmprCod ;
   private String[] T015B45_A457FasCod ;
   private boolean[] T015B45_n457FasCod ;
   private String[] T015B45_A9832MaqCodF ;
   private short[] T015B45_A9834Cod_parF ;
   private String[] T015B46_A396EmprCod ;
   private String[] T015B46_A457FasCod ;
   private boolean[] T015B46_n457FasCod ;
   private String[] T015B46_A9832MaqCodF ;
   private short[] T015B46_A9723Cod_par ;
   private String[] T015B47_A396EmprCod ;
   private String[] T015B47_A457FasCod ;
   private boolean[] T015B47_n457FasCod ;
   private String[] T015B47_A9832MaqCodF ;
   private String[] T015B48_A407EmprNom ;
   private boolean[] T015B48_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprfsmq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprfsmq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprfsmq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprfsmq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprfsmq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015B2", "SELECT FasCod, MaqCodF, MaqAnc, EmprCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?  FOR UPDATE OF MaqAnc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015B3", "SELECT FasCod, MaqCodF, MaqAnc, EmprCod FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015B4", "SELECT FasCod, FasDsc, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B5", "SELECT FasCod, FasDsc, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B7", "SELECT /*+ FIRST_ROWS(1) */ TM1.FasCod, T2.EmprNom, TM1.FasDsc, TM1.EmprCod FROM (TXPFASPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.FasCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015B11", "INSERT INTO TXPFASPRO(FasCod, FasDsc, EmprCod, MaqCod, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasUltLin, FasForMul, FasConPla, FasEstamp, FasCC, FasCara, FasUltFor, FasProDsc, FasDsc2, FasUltForL, FasValMtr, FasAcab, FasPreMC, FasProCtb, FasGral, FasFact, FasTExt, Hh_FUltL, FasDec2, FasTip, SecCodF, FasTpp, FasTog, FasFGp, FasUnpLt, FasOpeIns, FasPesInt, FasSigla, Tip_CodFas, FasObl, FasRbCost, FasTpCost, FasH2OReh, FasPreObl, FasPesExp, FasObsF, FasCrgNor, FasCrgOpt, FasOpeTip, FasGrupo, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime) VALUES(?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T015B12", "UPDATE TXPFASPRO SET FasDsc=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T015B13", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T015B14", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B15", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B16", "SELECT * FROM (SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B17", "SELECT * FROM (SELECT EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B18", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B19", "SELECT * FROM (SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B20", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, Cod_par FROM TXPPARFS1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B21", "SELECT * FROM (SELECT EmprCod, FasCod, Cod_par FROM TXPPARFSS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B22", "SELECT * FROM (SELECT EmprCod, FasCod, FasArtTip, FasArtInt, FasArtSeg FROM TXPArtPrd WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B23", "SELECT * FROM (SELECT EmprCod, NumOrd, FasCod FROM TXPFASMUS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B24", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND FasCodn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B25", "SELECT * FROM (SELECT EmprCod, FasCod, Hh_FLin FROM TXPALAPFA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B26", "SELECT * FROM (SELECT EmprCod, RecPreCod FROM TXPPREREC WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B27", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B28", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B29", "SELECT * FROM (SELECT EmprCod, FasCod, FasTerCod FROM TXPFASTER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B30", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B31", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B32", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B33", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B34", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B35", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B36", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B38", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B39", "SELECT FasCod, MaqCodF, MaqAnc, EmprCod FROM TXPPARFSM WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015B40", "SELECT EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015B41", "INSERT INTO TXPPARFSM(FasCod, MaqCodF, MaqAnc, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPARFSM")
         ,new UpdateCursor("T015B42", "UPDATE TXPPARFSM SET MaqAnc=?  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?", GX_NOMASK, "TXPPARFSM")
         ,new UpdateCursor("T015B43", "DELETE FROM TXPPARFSM  WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?", GX_NOMASK, "TXPPARFSM")
         ,new ForEachCursor("T015B44", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, MaqAncM FROM TXPPRMQFA WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B45", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, Cod_parF FROM TXPPRFSMQ WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B46", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF, Cod_par FROM TXPPARFS1 WHERE EmprCod = ? AND FasCod = ? AND MaqCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015B47", "SELECT EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, MaqCodF ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015B48", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 28);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 28);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

