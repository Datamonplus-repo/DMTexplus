package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisfpa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"ARTADICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaartadicod1041085( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DISFASPREL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadisfasprel10439( A396EmprCod, A361DisCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"ARTADIPRE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaartadipre1041085( Gx_mode, A396EmprCod, A361DisCod, A457FasCod, A7727ArtAdiCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"vPRECIO") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asaprecio1041085( Gx_mode, A396EmprCod, A361DisCod, A457FasCod, A7727ArtAdiCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7727ArtAdiCod = (short)(GXutil.lval( httpContext.GetPar( "ArtAdiCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A7727ArtAdiCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            A457FasCod = httpContext.GetPar( "FasCod") ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Adiicionales p/Fase Artextil", ""), (short)(0)) ;
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
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tdisfpa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisfpa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisfpa_impl.class ));
   }

   public tdisfpa_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkDisFasPrLs = UIFactory.getCheckbox(this);
      dynArtAdiCod = new HTMLChoice();
      cmbArtAdiUni = new HTMLChoice();
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
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
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
      /* Execute user event: Exit */
      e111042 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDisFPA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea Fase", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFasLin_Jsonclick, 0, "", "", "", "", "", 1, edtDisFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDisFPA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisFasPrLs.getInternalname(), GXutil.str( A8508DisFasPrLs, 1, 0), "", "", 1, chkDisFasPrLs.getEnabled(), "1", httpContext.getMessage( "Lst", ""), StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1085 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1085 = (short)(1) ;
            scanStart1041085( ) ;
            while ( RcdFound1085 != 0 )
            {
               init_level_properties1085( ) ;
               getByPrimaryKey1041085( ) ;
               addRow1041085( ) ;
               scanNext1041085( ) ;
            }
            scanEnd1041085( ) ;
            nBlankRcdCount1085 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1041085( ) ;
         standaloneModal1041085( ) ;
         sMode1085 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1041085( ) ;
            edtavnRcdDeleted_1085_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1085_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1085_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1085_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            edtArtAdiPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTADIPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbArtAdiUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADIUNI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_1085 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1041085( ) ;
            }
            sendRow1041085( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode1085 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1085 = (short)(5) ;
         nRcdExists_1085 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1041085( ) ;
            while ( RcdFound1085 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_591085( ) ;
               init_level_properties1085( ) ;
               standaloneNotModal1041085( ) ;
               getByPrimaryKey1041085( ) ;
               standaloneModal1041085( ) ;
               addRow1041085( ) ;
               scanNext1041085( ) ;
            }
            scanEnd1041085( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1085 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_591085( ) ;
      initAll1041085( ) ;
      init_level_properties1085( ) ;
      nRcdExists_1085 = (short)(0) ;
      nIsMod_1085 = (short)(0) ;
      nRcdDeleted_1085 = (short)(0) ;
      nBlankRcdCount1085 = (short)(nBlankRcdUsr1085+nBlankRcdCount1085) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1085 > 0 )
      {
         standaloneNotModal1041085( ) ;
         standaloneModal1041085( ) ;
         addRow1041085( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = dynArtAdiCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1085 = (short)(nBlankRcdCount1085-1) ;
      }
      Gx_mode = sMode1085 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDisFPA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDisFPA.htm");
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
      e121042 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z368DisFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8509DisFasPreL = localUtil.ctond( httpContext.cgiGet( "DISFASPREL")) ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            AV38Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            AV36Precio = localUtil.ctond( httpContext.cgiGet( "vPRECIO")) ;
            A7728ArtAdiDsc = httpContext.cgiGet( "ARTADIDSC") ;
            n7728ArtAdiDsc = false ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A8508DisFasPrLs = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFasPrLs.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDisFPA");
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV38Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdisfpa:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A368DisFasLin), 4, 0));
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
                        e121042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111042 ();
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
            initAll10439( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1085_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1085_Enabled), 5, 0), !bGXsfl_59_Refreshing);
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
      disableAttributes10439( ) ;
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

   public void confirm_1040( )
   {
      beforeValidate10439( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10439( ) ;
         }
         else
         {
            checkExtendedTable10439( ) ;
            if ( AnyError == 0 )
            {
               zm10439( 17) ;
               zm10439( 18) ;
               zm10439( 19) ;
            }
            closeExtendedTableCursors10439( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode39 = Gx_mode ;
         confirm_1041085( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode39 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1040( ) ;
      }
   }

   public void confirm_1041085( )
   {
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1041085( ) ;
         if ( ( nRcdExists_1085 != 0 ) || ( nIsMod_1085 != 0 ) )
         {
            getKey1041085( ) ;
            if ( ( nRcdExists_1085 == 0 ) && ( nRcdDeleted_1085 == 0 ) )
            {
               if ( RcdFound1085 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1041085( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1041085( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1041085( 21) ;
                     }
                     closeExtendedTableCursors1041085( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                     app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                  }
               }
               else
               {
                  GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = dynArtAdiCod.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1085 != 0 )
               {
                  if ( nRcdDeleted_1085 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1041085( ) ;
                     load1041085( ) ;
                     beforeValidate1041085( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1041085( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1085 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1041085( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1041085( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1041085( 21) ;
                           }
                           closeExtendedTableCursors1041085( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1085 == 0 )
                  {
                     GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = dynArtAdiCod.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1085_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtArtAdiPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbArtAdiUni.getInternalname(), GXutil.rtrim( A7737ArtAdiUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( Z7737ArtAdiUni)) ;
         httpContext.changePostValue( "T7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( O7737ArtAdiUni)) ;
         httpContext.changePostValue( "T7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( A7737ArtAdiUni)) ;
         if ( nIsMod_1085 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1085_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1085_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADIPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtAdiPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADIUNI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbArtAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1040( )
   {
   }

   public void e121042( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdisfpa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV38Pgmname, (byte)(99), GXv_char2) ;
      tdisfpa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdisfpa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdisfpa_impl.this.A396EmprCod = GXv_char2[0] ;
      tdisfpa_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdisfpa_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111042 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111042( )
   {
      /* Exit Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_msg, "") != 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A361DisCod ;
         GXv_int6[0] = AV33BarCod ;
         GXv_int7[0] = AV34BarCodReo ;
         GXv_char3[0] = AV35BarCodPar ;
         new app.partdish(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int5[0] ;
         tdisfpa_impl.this.AV33BarCod = GXv_int6[0] ;
         tdisfpa_impl.this.AV34BarCodReo = GXv_int7[0] ;
         tdisfpa_impl.this.AV35BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarCod), "ZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodReo", GXutil.str( AV34BarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34BarCodReo), "9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodPar", AV35BarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35BarCodPar, ""))));
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV8UsurCod, AV12Station, Gx_msg, AV33BarCod, AV34BarCodReo, AV35BarCodPar) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm10439( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -16 )
      {
         Z368DisFasLin = A368DisFasLin ;
         Z457FasCod = A457FasCod ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV38Pgmname = "TDisFPA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      /* Using cursor T01047 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01047_A407EmprNom[0] ;
      n407EmprNom = T01047_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01048 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T01049 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T01049_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A7744FasPreObl = T01049_A7744FasPreObl[0] ;
      n7744FasPreObl = T01049_n7744FasPreObl[0] ;
      pr_default.close(7);
      GXt_int8 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int9[0] = (short)(0) ;
      GXv_char2[0] = "P" ;
      GXv_int10[0] = GXt_int8 ;
      new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
      tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
      tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
      tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
      tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8509DisFasPreL", GXutil.ltrimstr( A8509DisFasPreL, 4, 5));
      if ( A8509DisFasPreL.doubleValue() > 0 )
      {
         A8508DisFasPrLs = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
      }
      else
      {
         if ( A8509DisFasPreL.doubleValue() == 0 )
         {
            A8508DisFasPrLs = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
         }
         else
         {
            A8508DisFasPrLs = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
         }
      }
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

   public void load10439( )
   {
      /* Using cursor T010410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A407EmprNom = T010410_A407EmprNom[0] ;
         n407EmprNom = T010410_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A460FasDsc = T010410_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A7744FasPreObl = T010410_A7744FasPreObl[0] ;
         n7744FasPreObl = T010410_n7744FasPreObl[0] ;
         zm10439( -16) ;
      }
      pr_default.close(8);
      onLoadActions10439( ) ;
   }

   public void onLoadActions10439( )
   {
   }

   public void checkExtendedTable10439( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10439( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10439( )
   {
      /* Using cursor T010411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01046 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(4) != 101) && ( T01046_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T01046_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T01046_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01046_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01046_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm10439( 16) ;
         RcdFound39 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10439( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey10439( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey10439( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey10439( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T010412 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010412_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010412_A758ProCod[0], A758ProCod) == 0 ) && ( T010412_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010412_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T010412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010412_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010412_A758ProCod[0], A758ProCod) == 0 ) && ( T010412_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010412_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T010413 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010413_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010413_A758ProCod[0], A758ProCod) == 0 ) && ( T010413_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010413_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T010413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010413_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T010413_A758ProCod[0], A758ProCod) == 0 ) && ( T010413_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T010413_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10439( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
         insert10439( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
               update10439( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
               insert10439( ) ;
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
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                  insert10439( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
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
      getKey10439( ) ;
      if ( RcdFound39 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A368DisFasLin != Z368DisFasLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisfpa");
   }

   public void insert_check( )
   {
      confirm_1040( ) ;
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
      if ( RcdFound39 == 0 )
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
      scanStart10439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10439( ) ;
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
      if ( RcdFound39 == 0 )
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
      if ( RcdFound39 == 0 )
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
      scanStart10439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNext10439( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd10439( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10439( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01045 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10439( )
   {
      beforeValidate10439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10439( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10439( 0) ;
         checkOptimisticConcurrency10439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10439( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010414 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Short.valueOf(A368DisFasLin), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel10439( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1040( ) ;
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
            load10439( ) ;
         }
         endLevel10439( ) ;
      }
      closeExtendedTableCursors10439( ) ;
   }

   public void update10439( )
   {
      beforeValidate10439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10439( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10439( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010415 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10439( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10439( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1040( ) ;
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
         endLevel10439( ) ;
      }
      closeExtendedTableCursors10439( ) ;
   }

   public void deferredUpdate10439( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10439( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10439( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10439( ) ;
         afterConfirm10439( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10439( ) ;
            if ( AnyError == 0 )
            {
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
               scanStart1041085( ) ;
               while ( RcdFound1085 != 0 )
               {
                  getByPrimaryKey1041085( ) ;
                  delete1041085( ) ;
                  scanNext1041085( ) ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
               }
               scanEnd1041085( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010416 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound39 == 0 )
                        {
                           initAll10439( ) ;
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
                        resetCaption1040( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10439( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10439( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T010418 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T010419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T010420 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1041085( )
   {
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1041085( ) ;
         if ( ( nRcdExists_1085 != 0 ) || ( nIsMod_1085 != 0 ) )
         {
            standaloneNotModal1041085( ) ;
            getKey1041085( ) ;
            if ( ( nRcdExists_1085 == 0 ) && ( nRcdDeleted_1085 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1041085( ) ;
            }
            else
            {
               if ( RcdFound1085 != 0 )
               {
                  if ( ( nRcdDeleted_1085 != 0 ) && ( nRcdExists_1085 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1041085( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1085 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1041085( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1085 == 0 )
                  {
                     GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = dynArtAdiCod.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1085_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( dynArtAdiCod.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtArtAdiPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbArtAdiUni.getInternalname(), GXutil.rtrim( A7737ArtAdiUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( Z7737ArtAdiUni)) ;
         httpContext.changePostValue( "T7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( O7737ArtAdiUni)) ;
         httpContext.changePostValue( "T7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1085_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N7736ArtAdiPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N7737ArtAdiUni_"+sGXsfl_59_idx, GXutil.rtrim( A7737ArtAdiUni)) ;
         if ( nIsMod_1085 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1085_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1085_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADICOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADIPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtAdiPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTADIUNI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbArtAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1041085( ) ;
      if ( AnyError != 0 )
      {
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      }
      nRcdExists_1085 = (short)(0) ;
      nIsMod_1085 = (short)(0) ;
      nRcdDeleted_1085 = (short)(0) ;
   }

   public void processLevel10439( )
   {
      /* Save parent mode. */
      sMode39 = Gx_mode ;
      processNestedLevel1041085( ) ;
      if ( AnyError != 0 )
      {
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      }
      /* Restore parent mode. */
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel10439( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete10439( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisfpa");
         if ( AnyError == 0 )
         {
            confirmValues1040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisfpa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10439( )
   {
      /* Scan By routine */
      /* Using cursor T010421 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10439( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
   }

   public void scanEnd10439( )
   {
      pr_default.close(19);
   }

   public void afterConfirm10439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10439( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10439( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10439( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10439( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10439( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10439( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      chkDisFasPrLs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrLs.getEnabled(), 5, 0), true);
   }

   public void zm1041085( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7736ArtAdiPre = T01043_A7736ArtAdiPre[0] ;
            Z7737ArtAdiUni = T01043_A7737ArtAdiUni[0] ;
         }
         else
         {
            Z7736ArtAdiPre = A7736ArtAdiPre ;
            Z7737ArtAdiUni = A7737ArtAdiUni ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7736ArtAdiPre = A7736ArtAdiPre ;
         Z7737ArtAdiUni = A7737ArtAdiUni ;
         Z396EmprCod = A396EmprCod ;
         Z7727ArtAdiCod = A7727ArtAdiCod ;
         Z7728ArtAdiDsc = A7728ArtAdiDsc ;
      }
   }

   public void standaloneNotModal1041085( )
   {
      gxaartadicod_html1041085( A396EmprCod) ;
   }

   public void standaloneModal1041085( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         dynArtAdiCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         dynArtAdiCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01044 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
         A7728ArtAdiDsc = T01044_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T01044_n7728ArtAdiDsc[0] ;
         pr_default.close(2);
      }
   }

   public void load1041085( )
   {
      /* Using cursor T010422 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1085 = (short)(1) ;
         A7736ArtAdiPre = T010422_A7736ArtAdiPre[0] ;
         n7736ArtAdiPre = T010422_n7736ArtAdiPre[0] ;
         A7728ArtAdiDsc = T010422_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T010422_n7728ArtAdiDsc[0] ;
         A7737ArtAdiUni = T010422_A7737ArtAdiUni[0] ;
         n7737ArtAdiUni = T010422_n7737ArtAdiUni[0] ;
         zm1041085( -20) ;
      }
      pr_default.close(20);
      onLoadActions1041085( ) ;
   }

   public void onLoadActions1041085( )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(A7736ArtAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7736ArtAdiPre = DecimalUtil.doubleToDec(GXt_int8) ;
         n7736ArtAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(AV36Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV36Precio = DecimalUtil.doubleToDec(GXt_int8) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrimstr( AV36Precio, 10, 2));
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         edtArtAdiPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtArtAdiPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         cmbArtAdiUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         cmbArtAdiUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void checkExtendedTable1041085( )
   {
      nIsDirty_1085 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1041085( ) ;
      /* Using cursor T01044 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7728ArtAdiDsc = T01044_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T01044_n7728ArtAdiDsc[0] ;
      pr_default.close(2);
      if ( isIns( )  && true /* After */ )
      {
         nIsDirty_1085 = (short)(1) ;
         GXt_int8 = (long)(DecimalUtil.decToDouble(A7736ArtAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7736ArtAdiPre = DecimalUtil.doubleToDec(GXt_int8) ;
         n7736ArtAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(AV36Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV36Precio = DecimalUtil.doubleToDec(GXt_int8) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrimstr( AV36Precio, 10, 2));
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         edtArtAdiPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtArtAdiPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         cmbArtAdiUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         cmbArtAdiUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      }
      if ( ( DecimalUtil.compareTo(O7736ArtAdiPre, A7736ArtAdiPre) != 0 ) && ( AV36Precio.doubleValue() > 0 ) && ( O7736ArtAdiPre.doubleValue() > 0 ) )
      {
         GXCCtl = "ARTADIPRE_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atención el precio de lista a cambiado, se actualizará la disposición.", ""), 0, GXCCtl);
      }
      if ( A7736ArtAdiPre.doubleValue() <= 0 )
      {
         GXCCtl = "ARTADIPRE_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe ingresar un precio", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtAdiPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A7737ArtAdiUni, "K") == 0 ) || ( GXutil.strcmp(A7737ArtAdiUni, "M") == 0 ) || ( GXutil.strcmp(A7737ArtAdiUni, "F") == 0 ) || ( GXutil.strcmp(A7737ArtAdiUni, "C") == 0 ) ) )
      {
         GXCCtl = "ARTADIUNI_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbArtAdiUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1041085( )
   {
      pr_default.close(2);
   }

   public void enableDisable1041085( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          short A7727ArtAdiCod )
   {
      /* Using cursor T010423 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7728ArtAdiDsc = T010423_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T010423_n7728ArtAdiDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7728ArtAdiDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1041085( )
   {
      /* Using cursor T010424 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1085 = (short)(1) ;
      }
      else
      {
         RcdFound1085 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1041085( )
   {
      /* Using cursor T01043 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01043_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01043_A758ProCod[0], A758ProCod) == 0 ) && ( T01043_A368DisFasLin[0] == A368DisFasLin ) && ( GXutil.strcmp(T01043_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1041085( 20) ;
         RcdFound1085 = (short)(1) ;
         initializeNonKey1041085( ) ;
         A7736ArtAdiPre = T01043_A7736ArtAdiPre[0] ;
         n7736ArtAdiPre = T01043_n7736ArtAdiPre[0] ;
         A7737ArtAdiUni = T01043_A7737ArtAdiUni[0] ;
         n7737ArtAdiUni = T01043_n7737ArtAdiUni[0] ;
         A7727ArtAdiCod = T01043_A7727ArtAdiCod[0] ;
         O7737ArtAdiUni = A7737ArtAdiUni ;
         n7737ArtAdiUni = false ;
         O7736ArtAdiPre = A7736ArtAdiPre ;
         n7736ArtAdiPre = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7727ArtAdiCod = A7727ArtAdiCod ;
         sMode1085 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1041085( ) ;
         load1041085( ) ;
         Gx_mode = sMode1085 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1085 = (short)(0) ;
         initializeNonKey1041085( ) ;
         sMode1085 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1041085( ) ;
         Gx_mode = sMode1085 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1041085( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1041085( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01042 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisFPA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7736ArtAdiPre, T01042_A7736ArtAdiPre[0]) != 0 ) || ( GXutil.strcmp(Z7737ArtAdiUni, T01042_A7737ArtAdiUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7736ArtAdiPre, T01042_A7736ArtAdiPre[0]) != 0 )
            {
               GXutil.writeLogln("tdisfpa:[seudo value changed for attri]"+"ArtAdiPre");
               GXutil.writeLogRaw("Old: ",Z7736ArtAdiPre);
               GXutil.writeLogRaw("Current: ",T01042_A7736ArtAdiPre[0]);
            }
            if ( GXutil.strcmp(Z7737ArtAdiUni, T01042_A7737ArtAdiUni[0]) != 0 )
            {
               GXutil.writeLogln("tdisfpa:[seudo value changed for attri]"+"ArtAdiUni");
               GXutil.writeLogRaw("Old: ",Z7737ArtAdiUni);
               GXutil.writeLogRaw("Current: ",T01042_A7737ArtAdiUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDisFPA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1041085( )
   {
      beforeValidate1041085( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1041085( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1041085( 0) ;
         checkOptimisticConcurrency1041085( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1041085( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1041085( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010425 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n7736ArtAdiPre), A7736ArtAdiPre, Boolean.valueOf(n7737ArtAdiUni), A7737ArtAdiUni, A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisFPA");
                  if ( (pr_default.getStatus(23) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Creacion ", ""), "") + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
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
            load1041085( ) ;
         }
         endLevel1041085( ) ;
      }
      closeExtendedTableCursors1041085( ) ;
   }

   public void update1041085( )
   {
      beforeValidate1041085( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1041085( ) ;
      }
      if ( ( nIsMod_1085 != 0 ) || ( nIsDirty_1085 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1041085( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1041085( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1041085( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010426 */
                     pr_default.execute(24, new Object[] {Boolean.valueOf(n7736ArtAdiPre), A7736ArtAdiPre, Boolean.valueOf(n7737ArtAdiUni), A7737ArtAdiUni, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisFPA");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDisFPA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1041085( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && true /* Level */ && ( DecimalUtil.compareTo(A7736ArtAdiPre, O7736ArtAdiPre) != 0 ) )
                        {
                           Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Mod.Pre ", ""), "") + GXutil.trim( GXutil.str( O7736ArtAdiPre, 10, 0)) + "=>" + GXutil.trim( GXutil.str( A7736ArtAdiPre, 10, 0)) + GXutil.newLine( ) ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                        }
                        else
                        {
                           if ( true /* After */ && true /* Level */ && ( GXutil.strcmp(A7737ArtAdiUni, O7737ArtAdiUni) != 0 ) )
                           {
                              Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Mod.Uni ", ""), "") + GXutil.trim( O7737ArtAdiUni) + "=>" + GXutil.trim( A7737ArtAdiUni) + GXutil.newLine( ) ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1041085( ) ;
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
            endLevel1041085( ) ;
         }
      }
      closeExtendedTableCursors1041085( ) ;
   }

   public void deferredUpdate1041085( )
   {
   }

   public void delete1041085( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1041085( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1041085( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1041085( ) ;
         afterConfirm1041085( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1041085( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010427 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7727ArtAdiCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDisFPA");
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
      sMode1085 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1041085( ) ;
      Gx_mode = sMode1085 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1041085( )
   {
      standaloneModal1041085( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
         A7728ArtAdiDsc = T010428_A7728ArtAdiDsc[0] ;
         n7728ArtAdiDsc = T010428_n7728ArtAdiDsc[0] ;
         pr_default.close(26);
         if ( isIns( )  && true /* After */ )
         {
            GXt_int8 = (long)(DecimalUtil.decToDouble(AV36Precio)) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A361DisCod ;
            GXv_char3[0] = A457FasCod ;
            GXv_int9[0] = A7727ArtAdiCod ;
            GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
            GXv_int10[0] = GXt_int8 ;
            new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
            tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
            tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
            tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
            tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
            tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            AV36Precio = DecimalUtil.doubleToDec(GXt_int8) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrimstr( AV36Precio, 10, 2));
         }
         if ( AV36Precio.doubleValue() > 0 )
         {
            edtArtAdiPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
         }
         else
         {
            edtArtAdiPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
         }
         if ( AV36Precio.doubleValue() > 0 )
         {
            cmbArtAdiUni.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
         }
         else
         {
            cmbArtAdiUni.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
         }
      }
   }

   public void endLevel1041085( )
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

   public void scanStart1041085( )
   {
      /* Scan By routine */
      /* Using cursor T010429 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      RcdFound1085 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1085 = (short)(1) ;
         A7727ArtAdiCod = T010429_A7727ArtAdiCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1041085( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1085 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1085 = (short)(1) ;
         A7727ArtAdiCod = T010429_A7727ArtAdiCod[0] ;
      }
   }

   public void scanEnd1041085( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1041085( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isDlt( )  && true /* Level */ )
      {
         Gx_msg += GXutil.trim( GXutil.str( A7727ArtAdiCod, 10, 0)) + httpContext.getMessage( httpContext.getMessage( ".Eliminacion ", ""), "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      }
   }

   public void beforeInsert1041085( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1041085( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1041085( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1041085( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1041085( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1041085( )
   {
      dynArtAdiCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtArtAdiPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbArtAdiUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1041085( )
   {
   }

   public void send_integrity_lvl_hashes10439( )
   {
   }

   public void subsflControlProps_591085( )
   {
      edtavnRcdDeleted_1085_Internalname = "vNRCDDELETED_1085_"+sGXsfl_59_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_59_idx );
      edtArtAdiPre_Internalname = "ARTADIPRE_"+sGXsfl_59_idx ;
      cmbArtAdiUni.setInternalname( "ARTADIUNI_"+sGXsfl_59_idx );
   }

   public void subsflControlProps_fel_591085( )
   {
      edtavnRcdDeleted_1085_Internalname = "vNRCDDELETED_1085_"+sGXsfl_59_fel_idx ;
      dynArtAdiCod.setInternalname( "ARTADICOD_"+sGXsfl_59_fel_idx );
      edtArtAdiPre_Internalname = "ARTADIPRE_"+sGXsfl_59_fel_idx ;
      cmbArtAdiUni.setInternalname( "ARTADIUNI_"+sGXsfl_59_fel_idx );
   }

   public void addRow1041085( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591085( ) ;
      sendRow1041085( ) ;
   }

   public void sendRow1041085( )
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
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1085_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1085_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1085_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1085), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1085), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1085_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1085_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      gxaartadicod_html1041085( A396EmprCod) ;
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1085_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynArtAdiCod,dynArtAdiCod.getInternalname(),GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)),Integer.valueOf(1),dynArtAdiCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(dynArtAdiCod.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynArtAdiCod.setValue( GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Values", dynArtAdiCod.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1085_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtAdiPre_Internalname,GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A7736ArtAdiPre, "Z,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtAdiPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtAdiPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1085_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      GXCCtl = "ARTADIUNI_" + sGXsfl_59_idx ;
      cmbArtAdiUni.setName( GXCCtl );
      cmbArtAdiUni.setWebtags( "" );
      cmbArtAdiUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
      cmbArtAdiUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
      cmbArtAdiUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
      cmbArtAdiUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
      if ( cmbArtAdiUni.getItemCount() > 0 )
      {
         A7737ArtAdiUni = cmbArtAdiUni.getValidValue(A7737ArtAdiUni) ;
         n7737ArtAdiUni = false ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbArtAdiUni,cmbArtAdiUni.getInternalname(),GXutil.rtrim( A7737ArtAdiUni),Integer.valueOf(1),cmbArtAdiUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbArtAdiUni.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbArtAdiUni.setValue( GXutil.rtrim( A7737ArtAdiUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Values", cmbArtAdiUni.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1041085( ) ;
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7727ArtAdiCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7736ArtAdiPre_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7737ArtAdiUni_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7737ArtAdiUni));
      GXCCtl = "O7737ArtAdiUni_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O7737ArtAdiUni));
      GXCCtl = "O7736ArtAdiPre_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1085_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1085_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1085_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1085, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N7736ArtAdiPre_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N7737ArtAdiUni_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A7737ArtAdiUni));
      GXCCtl = "vMSG_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_msg));
      GXCCtl = "vBARCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV35BarCodPar));
      GXCCtl = "vPGMNAME_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38Pgmname));
      GXCCtl = "vUSURCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1085_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1085_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADICOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADIPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtAdiPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADIUNI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbArtAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1041085( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591085( ) ;
      edtavnRcdDeleted_1085_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1085_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      dynArtAdiCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADICOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtArtAdiPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTADIPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbArtAdiUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ARTADIUNI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1085_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1085_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1085");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1085_Internalname ;
         wbErr = true ;
         nRcdDeleted_1085 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1085 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1085_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      dynArtAdiCod.setName( dynArtAdiCod.getInternalname() );
      dynArtAdiCod.setValue( httpContext.cgiGet( dynArtAdiCod.getInternalname()) );
      A7727ArtAdiCod = (short)(GXutil.lval( httpContext.cgiGet( dynArtAdiCod.getInternalname()))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtAdiPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtAdiPre_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ARTADIPRE_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtAdiPre_Internalname ;
         wbErr = true ;
         A7736ArtAdiPre = DecimalUtil.ZERO ;
         n7736ArtAdiPre = false ;
      }
      else
      {
         A7736ArtAdiPre = localUtil.ctond( httpContext.cgiGet( edtArtAdiPre_Internalname)) ;
         n7736ArtAdiPre = false ;
      }
      cmbArtAdiUni.setName( cmbArtAdiUni.getInternalname() );
      cmbArtAdiUni.setValue( httpContext.cgiGet( cmbArtAdiUni.getInternalname()) );
      A7737ArtAdiUni = httpContext.cgiGet( cmbArtAdiUni.getInternalname()) ;
      n7737ArtAdiUni = false ;
      GXCCtl = "Z7727ArtAdiCod_" + sGXsfl_59_idx ;
      Z7727ArtAdiCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7736ArtAdiPre_" + sGXsfl_59_idx ;
      Z7736ArtAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7737ArtAdiUni_" + sGXsfl_59_idx ;
      Z7737ArtAdiUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7737ArtAdiUni_" + sGXsfl_59_idx ;
      O7737ArtAdiUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O7736ArtAdiPre_" + sGXsfl_59_idx ;
      O7736ArtAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1085_" + sGXsfl_59_idx ;
      nRcdDeleted_1085 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1085_" + sGXsfl_59_idx ;
      nRcdExists_1085 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1085_" + sGXsfl_59_idx ;
      nIsMod_1085 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N7736ArtAdiPre_" + sGXsfl_59_idx ;
      N7736ArtAdiPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N7737ArtAdiUni_" + sGXsfl_59_idx ;
      N7737ArtAdiUni = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defcmbArtAdiUni_Enabled = cmbArtAdiUni.getEnabled() ;
      defedtArtAdiPre_Enabled = edtArtAdiPre_Enabled ;
      defdynArtAdiCod_Enabled = dynArtAdiCod.getEnabled() ;
   }

   public void confirmValues1040( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591085( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591085( ) ;
         httpContext.changePostValue( "Z7727ArtAdiCod_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7727ArtAdiCod_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z7736ArtAdiPre_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z7736ArtAdiPre_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7736ArtAdiPre_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z7737ArtAdiUni_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z7737ArtAdiUni_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7737ArtAdiUni_"+sGXsfl_59_idx) ;
      }
      httpContext.changePostValue( "O7737ArtAdiUni", httpContext.cgiGet( "T7737ArtAdiUni")) ;
      httpContext.deletePostValue( "T7737ArtAdiUni") ;
      httpContext.changePostValue( "O7736ArtAdiPre", httpContext.cgiGet( "T7736ArtAdiPre")) ;
      httpContext.deletePostValue( "T7736ArtAdiPre") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdisfpa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDisFPA");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV38Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdisfpa:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV33BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV34BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV35BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPREL", GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(4), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV38Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECIO", GXutil.ltrim( localUtil.ntoc( AV36Precio, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTADIDSC", GXutil.rtrim( A7728ArtAdiDsc));
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
      return formatLink("app.tdisfpa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDisFPA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Adiicionales p/Fase Artextil", "") ;
   }

   public void initializeNonKey10439( )
   {
   }

   public void initAll10439( )
   {
      initializeNonKey10439( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1041085( )
   {
      A7736ArtAdiPre = DecimalUtil.ZERO ;
      n7736ArtAdiPre = false ;
      AV36Precio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrimstr( AV36Precio, 10, 2));
      A7728ArtAdiDsc = "" ;
      n7728ArtAdiDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7728ArtAdiDsc", A7728ArtAdiDsc);
      A7737ArtAdiUni = "" ;
      n7737ArtAdiUni = false ;
      O7737ArtAdiUni = A7737ArtAdiUni ;
      n7737ArtAdiUni = false ;
      O7736ArtAdiPre = A7736ArtAdiPre ;
      n7736ArtAdiPre = false ;
      Z7736ArtAdiPre = DecimalUtil.ZERO ;
      Z7737ArtAdiUni = "" ;
   }

   public void initAll1041085( )
   {
      A7727ArtAdiCod = (short)(0) ;
      initializeNonKey1041085( ) ;
   }

   public void standaloneModalInsert1041085( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532814", true, true);
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
      httpContext.AddJavascriptSource("tdisfpa.js", "?20268241532814", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1085( )
   {
      cmbArtAdiUni.setEnabled( defcmbArtAdiUni_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtArtAdiPre_Enabled = defedtArtAdiPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      dynArtAdiCod.setEnabled( defdynArtAdiCod_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, dynArtAdiCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynArtAdiCod.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1085, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1085_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7727ArtAdiCod, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynArtAdiCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(12), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtAdiPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7737ArtAdiUni));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbArtAdiUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFasDsc_Internalname = "FASDSC" ;
      chkDisFasPrLs.setInternalname( "DISFASPRLS" );
      edtavnRcdDeleted_1085_Internalname = "vNRCDDELETED_1085" ;
      dynArtAdiCod.setInternalname( "ARTADICOD" );
      edtArtAdiPre_Internalname = "ARTADIPRE" ;
      cmbArtAdiUni.setInternalname( "ARTADIUNI" );
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
      Form.setCaption( httpContext.getMessage( "Adiicionales p/Fase Artextil", "") );
      cmbArtAdiUni.setJsonclick( "" );
      edtArtAdiPre_Jsonclick = "" ;
      dynArtAdiCod.setJsonclick( "" );
      edtavnRcdDeleted_1085_Jsonclick = "" ;
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
      cmbArtAdiUni.setEnabled( 1 );
      edtArtAdiPre_Enabled = 1 ;
      dynArtAdiCod.setEnabled( 1 );
      edtavnRcdDeleted_1085_Enabled = 1 ;
      chkDisFasPrLs.setIBackground( (int)(0xFFFFFF) );
      chkDisFasPrLs.setEnabled( 0 );
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisFasLin_Jsonclick = "" ;
      edtDisFasLin_Backcolor = (int)(0xFFFFFF) ;
      edtDisFasLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void gxdlaartadicod1041085( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaartadicod_data1041085( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxaartadicod_html1041085( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaartadicod_data1041085( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynArtAdiCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynArtAdiCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 3, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaartadicod_data1041085( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T010430 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(28) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T010430_A7727ArtAdiCod[0], (byte)(3), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T010430_A7728ArtAdiDsc[0]));
         pr_default.readNext(28);
      }
      pr_default.close(28);
   }

   public void gx2asadisfasprel10439( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A457FasCod )
   {
      GXt_int8 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int9[0] = (short)(0) ;
      GXv_char2[0] = "P" ;
      GXv_int10[0] = GXt_int8 ;
      new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
      tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
      tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
      tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
      tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8509DisFasPreL", GXutil.ltrimstr( A8509DisFasPreL, 4, 5));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(4), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaartadipre1041085( String Gx_mode ,
                                       String A396EmprCod ,
                                       int A361DisCod ,
                                       String A457FasCod ,
                                       short A7727ArtAdiCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(A7736ArtAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A7736ArtAdiPre = DecimalUtil.doubleToDec(GXt_int8) ;
         n7736ArtAdiPre = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx8asaprecio1041085( String Gx_mode ,
                                    String A396EmprCod ,
                                    int A361DisCod ,
                                    String A457FasCod ,
                                    short A7727ArtAdiCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(AV36Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         AV36Precio = DecimalUtil.doubleToDec(GXt_int8) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrimstr( AV36Precio, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV36Precio, (byte)(10), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_591085( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1041085( ) ;
         standaloneModal1041085( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1041085( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591085( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkDisFasPrLs.setName( "DISFASPRLS" );
      chkDisFasPrLs.setWebtags( "" );
      chkDisFasPrLs.setCaption( httpContext.getMessage( "Lst", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "TitleCaption", chkDisFasPrLs.getCaption(), true);
      chkDisFasPrLs.setCheckedValue( "0" );
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.str( A8508DisFasPrLs, 1, 0));
      GXCCtl = "ARTADICOD_" + sGXsfl_59_idx ;
      dynArtAdiCod.setName( GXCCtl );
      dynArtAdiCod.setWebtags( "" );
      GXCCtl = "ARTADIUNI_" + sGXsfl_59_idx ;
      cmbArtAdiUni.setName( GXCCtl );
      cmbArtAdiUni.setWebtags( "" );
      cmbArtAdiUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
      cmbArtAdiUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
      cmbArtAdiUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
      cmbArtAdiUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
      if ( cmbArtAdiUni.getItemCount() > 0 )
      {
         A7737ArtAdiUni = cmbArtAdiUni.getValidValue(A7737ArtAdiUni) ;
         n7737ArtAdiUni = false ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T010431 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010431_A407EmprNom[0] ;
      n407EmprNom = T010431_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(29);
      /* Using cursor T010432 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(30);
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

   public void valid_Emprcod( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Disfaslin( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A8509DisFasPreL", GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(4), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z368DisFasLin", GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8508DisFasPrLs", GXutil.ltrim( localUtil.ntoc( Z8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8509DisFasPreL", GXutil.ltrim( localUtil.ntoc( Z8509DisFasPreL, (byte)(4), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7744FasPreObl", GXutil.ltrim( localUtil.ntoc( Z7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Artadicod( )
   {
      A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValue())) ;
      n7728ArtAdiDsc = false ;
      n7736ArtAdiPre = false ;
      /* Using cursor T010433 */
      pr_default.execute(31, new Object[] {A396EmprCod, Short.valueOf(A7727ArtAdiCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ArtAdi", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTADICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynArtAdiCod.getInternalname() ;
      }
      A7728ArtAdiDsc = T010433_A7728ArtAdiDsc[0] ;
      n7728ArtAdiDsc = T010433_n7728ArtAdiDsc[0] ;
      pr_default.close(31);
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(A7736ArtAdiPre)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         A7736ArtAdiPre = DecimalUtil.doubleToDec(GXt_int8) ;
         n7736ArtAdiPre = false ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int8 = (long)(DecimalUtil.decToDouble(AV36Precio)) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A7727ArtAdiCod ;
         GXv_char2[0] = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         GXv_int10[0] = GXt_int8 ;
         new app.partpre(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int9, GXv_char2, GXv_int10) ;
         tdisfpa_impl.this.A396EmprCod = GXv_char4[0] ;
         tdisfpa_impl.this.A361DisCod = GXv_int6[0] ;
         tdisfpa_impl.this.A457FasCod = GXv_char3[0] ;
         tdisfpa_impl.this.A7727ArtAdiCod = GXv_int9[0] ;
         tdisfpa_impl.this.GXt_int8 = GXv_int10[0] ;
         AV36Precio = DecimalUtil.doubleToDec(GXt_int8) ;
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         edtArtAdiPre_Enabled = 0 ;
      }
      else
      {
         edtArtAdiPre_Enabled = 1 ;
      }
      if ( AV36Precio.doubleValue() > 0 )
      {
         cmbArtAdiUni.setEnabled( 0 );
      }
      else
      {
         cmbArtAdiUni.setEnabled( 1 );
      }
      dynload_actions( ) ;
      if ( dynArtAdiCod.getItemCount() > 0 )
      {
         A7727ArtAdiCod = (short)(GXutil.lval( dynArtAdiCod.getValidValue(GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynArtAdiCod.setValue( GXutil.trim( GXutil.str( A7727ArtAdiCod, 3, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7728ArtAdiDsc", GXutil.rtrim( A7728ArtAdiDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7736ArtAdiPre", GXutil.ltrim( localUtil.ntoc( A7736ArtAdiPre, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Precio", GXutil.ltrim( localUtil.ntoc( AV36Precio, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtArtAdiPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAdiPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, cmbArtAdiUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbArtAdiUni.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("EXIT","{handler:'e111042',iparms:[{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV35BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV33BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV38Pgmname',fld:'vPGMNAME',pic:''},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{av:'Z368DisFasLin'},{av:'Z8508DisFasPrLs'},{av:'Z407EmprNom'},{av:'Z460FasDsc'},{av:'Z8509DisFasPreL'},{av:'Z7744FasPreObl'},{av:'Z457FasCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_ARTADICOD","{handler:'valid_Artadicod',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV36Precio',fld:'vPRECIO',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynArtAdiCod'},{av:'A7727ArtAdiCod',fld:'ARTADICOD',pic:'ZZ9'},{av:'A7728ArtAdiDsc',fld:'ARTADIDSC',pic:''},{av:'A7736ArtAdiPre',fld:'ARTADIPRE',pic:'Z,ZZZ,ZZ9.99'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_ARTADICOD",",oparms:[{av:'A7728ArtAdiDsc',fld:'ARTADIDSC',pic:''},{av:'A7736ArtAdiPre',fld:'ARTADIPRE',pic:'Z,ZZZ,ZZ9.99'},{av:'AV36Precio',fld:'vPRECIO',pic:'ZZZZZZ9.99'},{av:'edtArtAdiPre_Enabled',ctrl:'ARTADIPRE',prop:'Enabled'},{av:'cmbArtAdiUni'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_ARTADIPRE","{handler:'valid_Artadipre',iparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_ARTADIPRE",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
      setEventMetadata("VALID_ARTADIUNI","{handler:'valid_Artadiuni',iparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]");
      setEventMetadata("VALID_ARTADIUNI",",oparms:[{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'}]}");
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
      pr_default.close(31);
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      wcpOA457FasCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z7736ArtAdiPre = DecimalUtil.ZERO ;
      Z7737ArtAdiUni = "" ;
      O7737ArtAdiUni = "" ;
      O7736ArtAdiPre = DecimalUtil.ZERO ;
      N7736ArtAdiPre = DecimalUtil.ZERO ;
      N7737ArtAdiUni = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      A758ProCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A460FasDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1085 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A8509DisFasPreL = DecimalUtil.ZERO ;
      AV38Pgmname = "" ;
      Gx_msg = "" ;
      AV36Precio = DecimalUtil.ZERO ;
      A7728ArtAdiDsc = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode39 = "" ;
      GXCCtl = "" ;
      A7736ArtAdiPre = DecimalUtil.ZERO ;
      A7737ArtAdiUni = "" ;
      T7737ArtAdiUni = "" ;
      T7736ArtAdiPre = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int5 = new int[1] ;
      GXv_int7 = new byte[1] ;
      AV35BarCodPar = "" ;
      Z457FasCod = "" ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      T01047_A407EmprNom = new String[] {""} ;
      T01047_n407EmprNom = new boolean[] {false} ;
      T01048_A396EmprCod = new String[] {""} ;
      T01049_A460FasDsc = new String[] {""} ;
      T01049_A7744FasPreObl = new byte[1] ;
      T01049_n7744FasPreObl = new boolean[] {false} ;
      T010410_A368DisFasLin = new short[1] ;
      T010410_A457FasCod = new String[] {""} ;
      T010410_A407EmprNom = new String[] {""} ;
      T010410_n407EmprNom = new boolean[] {false} ;
      T010410_A460FasDsc = new String[] {""} ;
      T010410_A7744FasPreObl = new byte[1] ;
      T010410_n7744FasPreObl = new boolean[] {false} ;
      T010410_A396EmprCod = new String[] {""} ;
      T010410_A361DisCod = new int[1] ;
      T010410_A758ProCod = new String[] {""} ;
      T010411_A396EmprCod = new String[] {""} ;
      T010411_A361DisCod = new int[1] ;
      T010411_A758ProCod = new String[] {""} ;
      T010411_A368DisFasLin = new short[1] ;
      T01046_A368DisFasLin = new short[1] ;
      T01046_A457FasCod = new String[] {""} ;
      T01046_A396EmprCod = new String[] {""} ;
      T01046_A361DisCod = new int[1] ;
      T01046_A758ProCod = new String[] {""} ;
      T01046_A7744FasPreObl = new byte[1] ;
      T01046_n7744FasPreObl = new boolean[] {false} ;
      T010412_A396EmprCod = new String[] {""} ;
      T010412_A361DisCod = new int[1] ;
      T010412_A758ProCod = new String[] {""} ;
      T010412_A368DisFasLin = new short[1] ;
      T010412_A457FasCod = new String[] {""} ;
      T010413_A396EmprCod = new String[] {""} ;
      T010413_A361DisCod = new int[1] ;
      T010413_A758ProCod = new String[] {""} ;
      T010413_A368DisFasLin = new short[1] ;
      T010413_A457FasCod = new String[] {""} ;
      T01045_A368DisFasLin = new short[1] ;
      T01045_A457FasCod = new String[] {""} ;
      T01045_A396EmprCod = new String[] {""} ;
      T01045_A361DisCod = new int[1] ;
      T01045_A758ProCod = new String[] {""} ;
      T01045_A7744FasPreObl = new byte[1] ;
      T01045_n7744FasPreObl = new boolean[] {false} ;
      T010417_A396EmprCod = new String[] {""} ;
      T010417_A361DisCod = new int[1] ;
      T010417_A758ProCod = new String[] {""} ;
      T010417_A368DisFasLin = new short[1] ;
      T010417_A7919Dta_Ordl = new short[1] ;
      T010418_A396EmprCod = new String[] {""} ;
      T010418_A361DisCod = new int[1] ;
      T010418_A758ProCod = new String[] {""} ;
      T010418_A368DisFasLin = new short[1] ;
      T010418_A5377DisQuiLin = new short[1] ;
      T010419_A396EmprCod = new String[] {""} ;
      T010419_A361DisCod = new int[1] ;
      T010419_A758ProCod = new String[] {""} ;
      T010419_A368DisFasLin = new short[1] ;
      T010419_A5035A_Discod = new int[1] ;
      T010419_A5038A_DProcod = new String[] {""} ;
      T010419_A5039A_DOrdlin = new short[1] ;
      T010420_A396EmprCod = new String[] {""} ;
      T010420_A361DisCod = new int[1] ;
      T010420_A758ProCod = new String[] {""} ;
      T010420_A368DisFasLin = new short[1] ;
      T010420_A1664ParFasCod = new short[1] ;
      T010421_A396EmprCod = new String[] {""} ;
      T010421_A361DisCod = new int[1] ;
      T010421_A758ProCod = new String[] {""} ;
      T010421_A368DisFasLin = new short[1] ;
      Z7728ArtAdiDsc = "" ;
      T01044_A7728ArtAdiDsc = new String[] {""} ;
      T01044_n7728ArtAdiDsc = new boolean[] {false} ;
      T010422_A361DisCod = new int[1] ;
      T010422_A758ProCod = new String[] {""} ;
      T010422_A368DisFasLin = new short[1] ;
      T010422_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010422_n7736ArtAdiPre = new boolean[] {false} ;
      T010422_A7728ArtAdiDsc = new String[] {""} ;
      T010422_n7728ArtAdiDsc = new boolean[] {false} ;
      T010422_A7737ArtAdiUni = new String[] {""} ;
      T010422_n7737ArtAdiUni = new boolean[] {false} ;
      T010422_A396EmprCod = new String[] {""} ;
      T010422_A7727ArtAdiCod = new short[1] ;
      T010423_A7728ArtAdiDsc = new String[] {""} ;
      T010423_n7728ArtAdiDsc = new boolean[] {false} ;
      T010424_A396EmprCod = new String[] {""} ;
      T010424_A361DisCod = new int[1] ;
      T010424_A758ProCod = new String[] {""} ;
      T010424_A368DisFasLin = new short[1] ;
      T010424_A7727ArtAdiCod = new short[1] ;
      T01043_A361DisCod = new int[1] ;
      T01043_A758ProCod = new String[] {""} ;
      T01043_A368DisFasLin = new short[1] ;
      T01043_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01043_n7736ArtAdiPre = new boolean[] {false} ;
      T01043_A7737ArtAdiUni = new String[] {""} ;
      T01043_n7737ArtAdiUni = new boolean[] {false} ;
      T01043_A396EmprCod = new String[] {""} ;
      T01043_A7727ArtAdiCod = new short[1] ;
      T01042_A361DisCod = new int[1] ;
      T01042_A758ProCod = new String[] {""} ;
      T01042_A368DisFasLin = new short[1] ;
      T01042_A7736ArtAdiPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01042_n7736ArtAdiPre = new boolean[] {false} ;
      T01042_A7737ArtAdiUni = new String[] {""} ;
      T01042_n7737ArtAdiUni = new boolean[] {false} ;
      T01042_A396EmprCod = new String[] {""} ;
      T01042_A7727ArtAdiCod = new short[1] ;
      T010428_A7728ArtAdiDsc = new String[] {""} ;
      T010428_n7728ArtAdiDsc = new boolean[] {false} ;
      T010429_A396EmprCod = new String[] {""} ;
      T010429_A361DisCod = new int[1] ;
      T010429_A758ProCod = new String[] {""} ;
      T010429_A368DisFasLin = new short[1] ;
      T010429_A7727ArtAdiCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T010430_A396EmprCod = new String[] {""} ;
      T010430_A7727ArtAdiCod = new short[1] ;
      T010430_A7728ArtAdiDsc = new String[] {""} ;
      T010430_n7728ArtAdiDsc = new boolean[] {false} ;
      T010431_A407EmprNom = new String[] {""} ;
      T010431_n407EmprNom = new boolean[] {false} ;
      T010432_A396EmprCod = new String[] {""} ;
      Z8509DisFasPreL = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ460FasDsc = "" ;
      ZZ8509DisFasPreL = DecimalUtil.ZERO ;
      ZZ457FasCod = "" ;
      T010433_A7728ArtAdiDsc = new String[] {""} ;
      T010433_n7728ArtAdiDsc = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new long[1] ;
      ZV36Precio = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisfpa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisfpa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisfpa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisfpa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisfpa__default(),
         new Object[] {
             new Object[] {
            T01042_A361DisCod, T01042_A758ProCod, T01042_A368DisFasLin, T01042_A7736ArtAdiPre, T01042_n7736ArtAdiPre, T01042_A7737ArtAdiUni, T01042_n7737ArtAdiUni, T01042_A396EmprCod, T01042_A7727ArtAdiCod
            }
            , new Object[] {
            T01043_A361DisCod, T01043_A758ProCod, T01043_A368DisFasLin, T01043_A7736ArtAdiPre, T01043_n7736ArtAdiPre, T01043_A7737ArtAdiUni, T01043_n7737ArtAdiUni, T01043_A396EmprCod, T01043_A7727ArtAdiCod
            }
            , new Object[] {
            T01044_A7728ArtAdiDsc, T01044_n7728ArtAdiDsc
            }
            , new Object[] {
            T01045_A368DisFasLin, T01045_A457FasCod, T01045_A396EmprCod, T01045_A361DisCod, T01045_A758ProCod, T01045_A7744FasPreObl, T01045_n7744FasPreObl
            }
            , new Object[] {
            T01046_A368DisFasLin, T01046_A457FasCod, T01046_A396EmprCod, T01046_A361DisCod, T01046_A758ProCod, T01046_A7744FasPreObl, T01046_n7744FasPreObl
            }
            , new Object[] {
            T01047_A407EmprNom, T01047_n407EmprNom
            }
            , new Object[] {
            T01048_A396EmprCod
            }
            , new Object[] {
            T01049_A460FasDsc, T01049_A7744FasPreObl, T01049_n7744FasPreObl
            }
            , new Object[] {
            T010410_A368DisFasLin, T010410_A457FasCod, T010410_A407EmprNom, T010410_n407EmprNom, T010410_A460FasDsc, T010410_A7744FasPreObl, T010410_n7744FasPreObl, T010410_A396EmprCod, T010410_A361DisCod, T010410_A758ProCod
            }
            , new Object[] {
            T010411_A396EmprCod, T010411_A361DisCod, T010411_A758ProCod, T010411_A368DisFasLin
            }
            , new Object[] {
            T010412_A396EmprCod, T010412_A361DisCod, T010412_A758ProCod, T010412_A368DisFasLin, T010412_A457FasCod
            }
            , new Object[] {
            T010413_A396EmprCod, T010413_A361DisCod, T010413_A758ProCod, T010413_A368DisFasLin, T010413_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010417_A396EmprCod, T010417_A361DisCod, T010417_A758ProCod, T010417_A368DisFasLin, T010417_A7919Dta_Ordl
            }
            , new Object[] {
            T010418_A396EmprCod, T010418_A361DisCod, T010418_A758ProCod, T010418_A368DisFasLin, T010418_A5377DisQuiLin
            }
            , new Object[] {
            T010419_A396EmprCod, T010419_A361DisCod, T010419_A758ProCod, T010419_A368DisFasLin, T010419_A5035A_Discod, T010419_A5038A_DProcod, T010419_A5039A_DOrdlin
            }
            , new Object[] {
            T010420_A396EmprCod, T010420_A361DisCod, T010420_A758ProCod, T010420_A368DisFasLin, T010420_A1664ParFasCod
            }
            , new Object[] {
            T010421_A396EmprCod, T010421_A361DisCod, T010421_A758ProCod, T010421_A368DisFasLin
            }
            , new Object[] {
            T010422_A361DisCod, T010422_A758ProCod, T010422_A368DisFasLin, T010422_A7736ArtAdiPre, T010422_n7736ArtAdiPre, T010422_A7728ArtAdiDsc, T010422_n7728ArtAdiDsc, T010422_A7737ArtAdiUni, T010422_n7737ArtAdiUni, T010422_A396EmprCod,
            T010422_A7727ArtAdiCod
            }
            , new Object[] {
            T010423_A7728ArtAdiDsc, T010423_n7728ArtAdiDsc
            }
            , new Object[] {
            T010424_A396EmprCod, T010424_A361DisCod, T010424_A758ProCod, T010424_A368DisFasLin, T010424_A7727ArtAdiCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010428_A7728ArtAdiDsc, T010428_n7728ArtAdiDsc
            }
            , new Object[] {
            T010429_A396EmprCod, T010429_A361DisCod, T010429_A758ProCod, T010429_A368DisFasLin, T010429_A7727ArtAdiCod
            }
            , new Object[] {
            T010430_A396EmprCod, T010430_A7727ArtAdiCod, T010430_A7728ArtAdiDsc, T010430_n7728ArtAdiDsc
            }
            , new Object[] {
            T010431_A407EmprNom, T010431_n407EmprNom
            }
            , new Object[] {
            T010432_A396EmprCod
            }
            , new Object[] {
            T010433_A7728ArtAdiDsc, T010433_n7728ArtAdiDsc
            }
         }
      );
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z368DisFasLin = (short)(0) ;
      A368DisFasLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV38Pgmname = "TDisFPA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8508DisFasPrLs ;
   private byte A7744FasPreObl ;
   private byte AV34BarCodReo ;
   private byte GXv_int7[] ;
   private byte Z7744FasPreObl ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte Z8508DisFasPrLs ;
   private byte ZZ8508DisFasPrLs ;
   private byte ZZ7744FasPreObl ;
   private short wcpOA368DisFasLin ;
   private short Z368DisFasLin ;
   private short Z7727ArtAdiCod ;
   private short nRcdDeleted_1085 ;
   private short nRcdExists_1085 ;
   private short nIsMod_1085 ;
   private short A7727ArtAdiCod ;
   private short A368DisFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1085 ;
   private short RcdFound1085 ;
   private short nBlankRcdUsr1085 ;
   private short RcdFound39 ;
   private short nIsDirty_39 ;
   private short nIsDirty_1085 ;
   private short ZZ368DisFasLin ;
   private short GXv_int9[] ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtavnRcdDeleted_1085_Enabled ;
   private int edtArtAdiPre_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int AV33BarCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defcmbArtAdiUni_Enabled ;
   private int defedtArtAdiPre_Enabled ;
   private int defdynArtAdiCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtDisFasLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int gxdynajaxindex ;
   private int ZZ361DisCod ;
   private int GXv_int6[] ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXt_int8 ;
   private long GXv_int10[] ;
   private java.math.BigDecimal Z7736ArtAdiPre ;
   private java.math.BigDecimal O7736ArtAdiPre ;
   private java.math.BigDecimal N7736ArtAdiPre ;
   private java.math.BigDecimal A8509DisFasPreL ;
   private java.math.BigDecimal AV36Precio ;
   private java.math.BigDecimal A7736ArtAdiPre ;
   private java.math.BigDecimal T7736ArtAdiPre ;
   private java.math.BigDecimal Z8509DisFasPreL ;
   private java.math.BigDecimal ZZ8509DisFasPreL ;
   private java.math.BigDecimal ZV36Precio ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String wcpOA457FasCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z7737ArtAdiUni ;
   private String O7737ArtAdiUni ;
   private String N7737ArtAdiUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_59_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisFasLin_Internalname ;
   private String edtDisFasLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String sMode1085 ;
   private String edtavnRcdDeleted_1085_Internalname ;
   private String edtArtAdiPre_Internalname ;
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
   private String AV38Pgmname ;
   private String Gx_msg ;
   private String A7728ArtAdiDsc ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode39 ;
   private String GXCCtl ;
   private String A7737ArtAdiUni ;
   private String T7737ArtAdiUni ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV35BarCodPar ;
   private String Z457FasCod ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z7728ArtAdiDsc ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1085_Jsonclick ;
   private String edtArtAdiPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String gxwrpcisep ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ460FasDsc ;
   private String ZZ457FasCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean n7728ArtAdiDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7736ArtAdiPre ;
   private boolean n7737ArtAdiUni ;
   private boolean gxdyncontrolsrefreshing ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkDisFasPrLs ;
   private HTMLChoice dynArtAdiCod ;
   private HTMLChoice cmbArtAdiUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01047_A407EmprNom ;
   private boolean[] T01047_n407EmprNom ;
   private String[] T01048_A396EmprCod ;
   private String[] T01049_A460FasDsc ;
   private byte[] T01049_A7744FasPreObl ;
   private boolean[] T01049_n7744FasPreObl ;
   private short[] T010410_A368DisFasLin ;
   private String[] T010410_A457FasCod ;
   private String[] T010410_A407EmprNom ;
   private boolean[] T010410_n407EmprNom ;
   private String[] T010410_A460FasDsc ;
   private byte[] T010410_A7744FasPreObl ;
   private boolean[] T010410_n7744FasPreObl ;
   private String[] T010410_A396EmprCod ;
   private int[] T010410_A361DisCod ;
   private String[] T010410_A758ProCod ;
   private String[] T010411_A396EmprCod ;
   private int[] T010411_A361DisCod ;
   private String[] T010411_A758ProCod ;
   private short[] T010411_A368DisFasLin ;
   private short[] T01046_A368DisFasLin ;
   private String[] T01046_A457FasCod ;
   private String[] T01046_A396EmprCod ;
   private int[] T01046_A361DisCod ;
   private String[] T01046_A758ProCod ;
   private byte[] T01046_A7744FasPreObl ;
   private boolean[] T01046_n7744FasPreObl ;
   private String[] T010412_A396EmprCod ;
   private int[] T010412_A361DisCod ;
   private String[] T010412_A758ProCod ;
   private short[] T010412_A368DisFasLin ;
   private String[] T010412_A457FasCod ;
   private String[] T010413_A396EmprCod ;
   private int[] T010413_A361DisCod ;
   private String[] T010413_A758ProCod ;
   private short[] T010413_A368DisFasLin ;
   private String[] T010413_A457FasCod ;
   private short[] T01045_A368DisFasLin ;
   private String[] T01045_A457FasCod ;
   private String[] T01045_A396EmprCod ;
   private int[] T01045_A361DisCod ;
   private String[] T01045_A758ProCod ;
   private byte[] T01045_A7744FasPreObl ;
   private boolean[] T01045_n7744FasPreObl ;
   private String[] T010417_A396EmprCod ;
   private int[] T010417_A361DisCod ;
   private String[] T010417_A758ProCod ;
   private short[] T010417_A368DisFasLin ;
   private short[] T010417_A7919Dta_Ordl ;
   private String[] T010418_A396EmprCod ;
   private int[] T010418_A361DisCod ;
   private String[] T010418_A758ProCod ;
   private short[] T010418_A368DisFasLin ;
   private short[] T010418_A5377DisQuiLin ;
   private String[] T010419_A396EmprCod ;
   private int[] T010419_A361DisCod ;
   private String[] T010419_A758ProCod ;
   private short[] T010419_A368DisFasLin ;
   private int[] T010419_A5035A_Discod ;
   private String[] T010419_A5038A_DProcod ;
   private short[] T010419_A5039A_DOrdlin ;
   private String[] T010420_A396EmprCod ;
   private int[] T010420_A361DisCod ;
   private String[] T010420_A758ProCod ;
   private short[] T010420_A368DisFasLin ;
   private short[] T010420_A1664ParFasCod ;
   private String[] T010421_A396EmprCod ;
   private int[] T010421_A361DisCod ;
   private String[] T010421_A758ProCod ;
   private short[] T010421_A368DisFasLin ;
   private String[] T01044_A7728ArtAdiDsc ;
   private boolean[] T01044_n7728ArtAdiDsc ;
   private int[] T010422_A361DisCod ;
   private String[] T010422_A758ProCod ;
   private short[] T010422_A368DisFasLin ;
   private java.math.BigDecimal[] T010422_A7736ArtAdiPre ;
   private boolean[] T010422_n7736ArtAdiPre ;
   private String[] T010422_A7728ArtAdiDsc ;
   private boolean[] T010422_n7728ArtAdiDsc ;
   private String[] T010422_A7737ArtAdiUni ;
   private boolean[] T010422_n7737ArtAdiUni ;
   private String[] T010422_A396EmprCod ;
   private short[] T010422_A7727ArtAdiCod ;
   private String[] T010423_A7728ArtAdiDsc ;
   private boolean[] T010423_n7728ArtAdiDsc ;
   private String[] T010424_A396EmprCod ;
   private int[] T010424_A361DisCod ;
   private String[] T010424_A758ProCod ;
   private short[] T010424_A368DisFasLin ;
   private short[] T010424_A7727ArtAdiCod ;
   private int[] T01043_A361DisCod ;
   private String[] T01043_A758ProCod ;
   private short[] T01043_A368DisFasLin ;
   private java.math.BigDecimal[] T01043_A7736ArtAdiPre ;
   private boolean[] T01043_n7736ArtAdiPre ;
   private String[] T01043_A7737ArtAdiUni ;
   private boolean[] T01043_n7737ArtAdiUni ;
   private String[] T01043_A396EmprCod ;
   private short[] T01043_A7727ArtAdiCod ;
   private int[] T01042_A361DisCod ;
   private String[] T01042_A758ProCod ;
   private short[] T01042_A368DisFasLin ;
   private java.math.BigDecimal[] T01042_A7736ArtAdiPre ;
   private boolean[] T01042_n7736ArtAdiPre ;
   private String[] T01042_A7737ArtAdiUni ;
   private boolean[] T01042_n7737ArtAdiUni ;
   private String[] T01042_A396EmprCod ;
   private short[] T01042_A7727ArtAdiCod ;
   private String[] T010428_A7728ArtAdiDsc ;
   private boolean[] T010428_n7728ArtAdiDsc ;
   private String[] T010429_A396EmprCod ;
   private int[] T010429_A361DisCod ;
   private String[] T010429_A758ProCod ;
   private short[] T010429_A368DisFasLin ;
   private short[] T010429_A7727ArtAdiCod ;
   private String[] T010430_A396EmprCod ;
   private short[] T010430_A7727ArtAdiCod ;
   private String[] T010430_A7728ArtAdiDsc ;
   private boolean[] T010430_n7728ArtAdiDsc ;
   private String[] T010431_A407EmprNom ;
   private boolean[] T010431_n407EmprNom ;
   private String[] T010432_A396EmprCod ;
   private String[] T010433_A7728ArtAdiDsc ;
   private boolean[] T010433_n7728ArtAdiDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdisfpa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisfpa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisfpa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisfpa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisfpa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01042", "SELECT DisCod, ProCod, DisFasLin, ArtAdiPre, ArtAdiUni, EmprCod, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ArtAdiCod = ?  FOR UPDATE OF ArtAdiPre, ArtAdiUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01043", "SELECT DisCod, ProCod, DisFasLin, ArtAdiPre, ArtAdiUni, EmprCod, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01044", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01045", "SELECT DisFasLin, FasCod, EmprCod, DisCod, ProCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01046", "SELECT DisFasLin, FasCod, EmprCod, DisCod, ProCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01047", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01048", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01049", "SELECT FasDsc, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010410", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisFasLin, TM1.FasCod, T2.EmprNom, T3.FasDsc, TM1.FasPreObl, TM1.EmprCod, TM1.DisCod, TM1.ProCod FROM ((TXPDISFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? and TM1.DisFasLin = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod, TM1.DisFasLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010411", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin, FasCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and FasCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010413", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod, DisFasLin, FasCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and FasCod = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC, DisFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010414", "INSERT INTO TXPDISFAS(FasPreObl, DisFasLin, FasCod, EmprCod, DisCod, ProCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T010415", "UPDATE TXPDISFAS SET FasPreObl=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T010416", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T010417", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010418", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010419", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010420", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010421", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and FasCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010422", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ArtAdiPre, T2.ArtAdiDsc, T1.ArtAdiUni, T1.EmprCod, T1.ArtAdiCod FROM (TXPDisFPA T1 INNER JOIN TXPArtAdi T2 ON T2.EmprCod = T1.EmprCod AND T2.ArtAdiCod = T1.ArtAdiCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.ArtAdiCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ArtAdiCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010423", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010424", "SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010425", "INSERT INTO TXPDisFPA(DisCod, ProCod, DisFasLin, ArtAdiPre, ArtAdiUni, EmprCod, ArtAdiCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDisFPA")
         ,new UpdateCursor("T010426", "UPDATE TXPDisFPA SET ArtAdiPre=?, ArtAdiUni=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ArtAdiCod = ?", GX_NOMASK, "TXPDisFPA")
         ,new UpdateCursor("T010427", "DELETE FROM TXPDisFPA  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND ArtAdiCod = ?", GX_NOMASK, "TXPDisFPA")
         ,new ForEachCursor("T010428", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010429", "SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010430", "SELECT EmprCod, ArtAdiCod, ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? ORDER BY ArtAdiDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010431", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010432", "SELECT EmprCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010433", "SELECT ArtAdiDsc FROM TXPArtAdi WHERE EmprCod = ? AND ArtAdiCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               return;
            case 31 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 8);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 8);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 24 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

