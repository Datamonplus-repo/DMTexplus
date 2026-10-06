package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisob1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A376DisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsLin"))) ;
         AV31ObsMan = (byte)(GXutil.lval( httpContext.GetPar( "ObsMan"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ObsMan", GXutil.str( AV31ObsMan, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_10540( Gx_mode, A396EmprCod, A361DisCod, A376DisObsLin, AV31ObsMan) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A376DisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsLin"))) ;
         AV31ObsMan = (byte)(GXutil.lval( httpContext.GetPar( "ObsMan"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ObsMan", GXutil.str( AV31ObsMan, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_10540( A396EmprCod, A361DisCod, A376DisObsLin, AV31ObsMan) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV37Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV26Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
         AV35Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A377DisObsTxt = httpContext.GetPar( "DisObsTxt") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_10540( A396EmprCod, AV37Pgmname, AV23UsurCod, AV26Station, AV35Inc_obs, A361DisCod, A377DisObsTxt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV36oldObs = httpContext.GetPar( "oldObs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
         A376DisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsLin"))) ;
         A377DisObsTxt = httpContext.GetPar( "DisObsTxt") ;
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV26Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_13_10540( A396EmprCod, A361DisCod, AV36oldObs, A376DisObsLin, A377DisObsTxt, AV23UsurCod, AV26Station, Gx_mode) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Observ. HDR (Solo Agregar)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisEnt_Internalname ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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

   public tdisob1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisob1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisob1_impl.class ));
   }

   public tdisob1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDISOB1.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Entregar a...", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnt_Internalname, GXutil.rtrim( A366DisEnt), GXutil.rtrim( localUtil.format( A366DisEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisEnt_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Precio Metro", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descuento", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7510DisDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDto_Enabled!=0) ? localUtil.format( A7510DisDto, "ZZ9.99 %") : localUtil.format( A7510DisDto, "ZZ9.99 %"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDto_Jsonclick, 0, "", "", "", "", "", 1, edtDisDto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsULin_Internalname, GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisObsULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9") : localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsULin_Jsonclick, 0, "", "", "", "", "", 1, edtDisObsULin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOB1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount40 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_40 = (short)(1) ;
            scanStart10540( ) ;
            while ( RcdFound40 != 0 )
            {
               init_level_properties40( ) ;
               getByPrimaryKey10540( ) ;
               addRow10540( ) ;
               scanNext10540( ) ;
            }
            scanEnd10540( ) ;
            nBlankRcdCount40 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal10540( ) ;
         standaloneModal10540( ) ;
         sMode40 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow10540( ) ;
            edtavnRcdDeleted_40_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_40_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_40_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_40_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisObsLin_Title = httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Title", edtDisObsLin_Title, !bGXsfl_60_Refreshing);
            edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtDisObsTxt_Title = httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Title", edtDisObsTxt_Title, !bGXsfl_60_Refreshing);
            edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_40 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10540( ) ;
            }
            sendRow10540( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount40 = (short)(5) ;
         nRcdExists_40 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10540( ) ;
            while ( RcdFound40 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_6040( ) ;
               init_level_properties40( ) ;
               standaloneNotModal10540( ) ;
               getByPrimaryKey10540( ) ;
               standaloneModal10540( ) ;
               addRow10540( ) ;
               scanNext10540( ) ;
            }
            scanEnd10540( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode40 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_6040( ) ;
      initAll10540( ) ;
      init_level_properties40( ) ;
      nRcdExists_40 = (short)(0) ;
      nIsMod_40 = (short)(0) ;
      nRcdDeleted_40 = (short)(0) ;
      nBlankRcdCount40 = (short)(nBlankRcdUsr40+nBlankRcdCount40) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount40 > 0 )
      {
         standaloneNotModal10540( ) ;
         standaloneModal10540( ) ;
         addRow10540( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisObsLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount40 = (short)(nBlankRcdCount40-1) ;
      }
      Gx_mode = sMode40 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOB1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDISOB1.htm");
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
      e111052 ();
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
            Z366DisEnt = httpContext.cgiGet( "Z366DisEnt") ;
            Z389DisPreMtr = localUtil.ctond( httpContext.cgiGet( "Z389DisPreMtr")) ;
            Z388DisPreKgm = localUtil.ctond( httpContext.cgiGet( "Z388DisPreKgm")) ;
            Z7510DisDto = localUtil.ctond( httpContext.cgiGet( "Z7510DisDto")) ;
            Z378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z378DisObsULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Lit4 = httpContext.cgiGet( "vLIT4") ;
            AV21Lit5 = httpContext.cgiGet( "vLIT5") ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV35Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV36oldObs = httpContext.cgiGet( "vOLDOBS") ;
            AV31ObsMan = (byte)(localUtil.ctol( httpContext.cgiGet( "vOBSMAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV26Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A389DisPreMtr = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            }
            else
            {
               A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A388DisPreKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            else
            {
               A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7510DisDto = DecimalUtil.ZERO ;
               n7510DisDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
            }
            else
            {
               A7510DisDto = localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)) ;
               n7510DisDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISOBSULIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisObsULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A378DisObsULin = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
            }
            else
            {
               A378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
            }
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                        e111052 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121052 ();
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
         /* Execute user event: After Trn */
         e121052 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll10534( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_40_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_40_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes10534( ) ;
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

   public void confirm_1050( )
   {
      beforeValidate10534( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10534( ) ;
         }
         else
         {
            checkExtendedTable10534( ) ;
            if ( AnyError == 0 )
            {
               zm10534( 15) ;
            }
            closeExtendedTableCursors10534( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_10540( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1050( ) ;
      }
   }

   public void confirm_10540( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow10540( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            getKey10540( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               if ( RcdFound40 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10540( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10540( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors10540( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISOBSLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( nRcdDeleted_40 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10540( ) ;
                     load10540( ) ;
                     beforeValidate10540( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10540( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10540( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10540( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors10540( ) ;
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
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_40_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "T377DisObsTxt_"+sGXsfl_60_idx, GXutil.rtrim( O377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_40_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_40_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsLin_Title)) ;
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsTxt_Title)) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1050( )
   {
   }

   public void e111052( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV24LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24LitFe", AV24LitFe);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1101_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1514_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      AV20Lit4 = "#" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV21Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1515_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit5", AV21Lit5);
      GXt_char1 = AV22lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1513_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22lit6", AV22lit6);
      GXt_char1 = AV28Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT52_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit7", AV28Lit7);
      GXt_char1 = AV33Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN304_", ""), (byte)(99), GXv_char2) ;
      tdisob1_impl.this.GXt_char1 = GXv_char2[0] ;
      GXt_char3 = AV33Lit8 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1101_", ""), (byte)(99), GXv_char4) ;
      tdisob1_impl.this.GXt_char3 = GXv_char4[0] ;
      AV33Lit8 = GXutil.trim( GXt_char1) + " " + GXutil.trim( GXt_char3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit8", AV33Lit8);
      AV26Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char2[0] = AV27EmprNom ;
      GXv_char5[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char4, GXv_char2, GXv_char5) ;
      tdisob1_impl.this.AV25EmprCod = GXv_char4[0] ;
      tdisob1_impl.this.AV27EmprNom = GXv_char2[0] ;
      tdisob1_impl.this.AV23UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      AV31ObsMan = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ObsMan", GXutil.str( AV31ObsMan, 1, 0));
      GXv_int6[0] = AV31ObsMan ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "OBSMAN", ""), GXv_int6) ;
      tdisob1_impl.this.AV31ObsMan = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ObsMan", GXutil.str( AV31ObsMan, 1, 0));
   }

   public void e121052( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int7[0] = A361DisCod ;
      new app.pprc109(remoteHandle, context).execute( GXv_char5, GXv_int7) ;
      tdisob1_impl.this.A396EmprCod = GXv_char5[0] ;
      tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm10534( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z366DisEnt = T01055_A366DisEnt[0] ;
            Z389DisPreMtr = T01055_A389DisPreMtr[0] ;
            Z388DisPreKgm = T01055_A388DisPreKgm[0] ;
            Z7510DisDto = T01055_A7510DisDto[0] ;
            Z378DisObsULin = T01055_A378DisObsULin[0] ;
         }
         else
         {
            Z366DisEnt = A366DisEnt ;
            Z389DisPreMtr = A389DisPreMtr ;
            Z388DisPreKgm = A388DisPreKgm ;
            Z7510DisDto = A7510DisDto ;
            Z378DisObsULin = A378DisObsULin ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z361DisCod = A361DisCod ;
         Z366DisEnt = A366DisEnt ;
         Z389DisPreMtr = A389DisPreMtr ;
         Z388DisPreKgm = A388DisPreKgm ;
         Z7510DisDto = A7510DisDto ;
         Z378DisObsULin = A378DisObsULin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV37Pgmname = "TDISOB1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      /* Using cursor T01056 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01056_A407EmprNom[0] ;
      n407EmprNom = T01056_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      edtDisObsLin_Title = AV20Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Title", edtDisObsLin_Title, !bGXsfl_60_Refreshing);
      edtDisObsTxt_Title = AV21Lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Title", edtDisObsTxt_Title, !bGXsfl_60_Refreshing);
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

   public void load10534( )
   {
      /* Using cursor T01057 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A366DisEnt = T01057_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A389DisPreMtr = T01057_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A388DisPreKgm = T01057_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A7510DisDto = T01057_A7510DisDto[0] ;
         n7510DisDto = T01057_n7510DisDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
         A378DisObsULin = T01057_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         A407EmprNom = T01057_A407EmprNom[0] ;
         n407EmprNom = T01057_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm10534( -14) ;
      }
      pr_default.close(5);
      onLoadActions10534( ) ;
   }

   public void onLoadActions10534( )
   {
   }

   public void checkExtendedTable10534( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors10534( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey10534( )
   {
      /* Using cursor T01058 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01055 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01055_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01055_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10534( 14) ;
         RcdFound34 = (short)(1) ;
         A366DisEnt = T01055_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A389DisPreMtr = T01055_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A388DisPreKgm = T01055_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A7510DisDto = T01055_A7510DisDto[0] ;
         n7510DisDto = T01055_n7510DisDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
         A378DisObsULin = T01055_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10534( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey10534( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey10534( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey10534( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T01059 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01059_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01059_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01059_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01059_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T010510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T010510_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010510_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T010510_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010510_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10534( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDisEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10534( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update10534( ) ;
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10534( ) ;
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
                  GX_FocusControl = edtDisEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10534( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         GX_FocusControl = edtDisEnt_Internalname ;
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
      getKey10534( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisob1");
      GX_FocusControl = edtDisEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1050( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDisEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart10534( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10534( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisEnt_Internalname ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisEnt_Internalname ;
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
      scanStart10534( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext10534( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10534( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10534( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01054 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z366DisEnt, T01054_A366DisEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z389DisPreMtr, T01054_A389DisPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z388DisPreKgm, T01054_A388DisPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z7510DisDto, T01054_A7510DisDto[0]) != 0 ) || ( Z378DisObsULin != T01054_A378DisObsULin[0] ) )
         {
            if ( GXutil.strcmp(Z366DisEnt, T01054_A366DisEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisEnt");
               GXutil.writeLogRaw("Old: ",Z366DisEnt);
               GXutil.writeLogRaw("Current: ",T01054_A366DisEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z389DisPreMtr, T01054_A389DisPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisPreMtr");
               GXutil.writeLogRaw("Old: ",Z389DisPreMtr);
               GXutil.writeLogRaw("Current: ",T01054_A389DisPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z388DisPreKgm, T01054_A388DisPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisPreKgm");
               GXutil.writeLogRaw("Old: ",Z388DisPreKgm);
               GXutil.writeLogRaw("Current: ",T01054_A388DisPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z7510DisDto, T01054_A7510DisDto[0]) != 0 )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisDto");
               GXutil.writeLogRaw("Old: ",Z7510DisDto);
               GXutil.writeLogRaw("Current: ",T01054_A7510DisDto[0]);
            }
            if ( Z378DisObsULin != T01054_A378DisObsULin[0] )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisObsULin");
               GXutil.writeLogRaw("Old: ",Z378DisObsULin);
               GXutil.writeLogRaw("Current: ",T01054_A378DisObsULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10534( )
   {
      beforeValidate10534( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10534( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10534( 0) ;
         checkOptimisticConcurrency10534( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10534( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10534( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010511 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A361DisCod), A366DisEnt, A389DisPreMtr, A388DisPreKgm, Boolean.valueOf(n7510DisDto), A7510DisDto, Byte.valueOf(A378DisObsULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel10534( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1050( ) ;
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
            load10534( ) ;
         }
         endLevel10534( ) ;
      }
      closeExtendedTableCursors10534( ) ;
   }

   public void update10534( )
   {
      beforeValidate10534( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10534( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10534( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10534( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10534( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010512 */
                  pr_default.execute(10, new Object[] {A366DisEnt, A389DisPreMtr, A388DisPreKgm, Boolean.valueOf(n7510DisDto), A7510DisDto, Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10534( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char5[0] = A396EmprCod ;
                     GXv_int7[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char5, GXv_int7) ;
                     tdisob1_impl.this.A396EmprCod = GXv_char5[0] ;
                     tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10534( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1050( ) ;
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
         endLevel10534( ) ;
      }
      closeExtendedTableCursors10534( ) ;
   }

   public void deferredUpdate10534( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10534( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10534( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10534( ) ;
         afterConfirm10534( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10534( ) ;
            if ( AnyError == 0 )
            {
               scanStart10540( ) ;
               while ( RcdFound40 != 0 )
               {
                  getByPrimaryKey10540( ) ;
                  delete10540( ) ;
                  scanNext10540( ) ;
               }
               scanEnd10540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010513 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound34 == 0 )
                        {
                           initAll10534( ) ;
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
                        resetCaption1050( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10534( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10534( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010514 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T010515 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T010516 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T010517 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T010518 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T010519 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T010520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T010521 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T010522 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T010523 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T010524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel10540( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow10540( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            standaloneNotModal10540( ) ;
            getKey10540( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10540( ) ;
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( ( nRcdDeleted_40 != 0 ) && ( nRcdExists_40 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10540( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10540( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_40_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "T377DisObsTxt_"+sGXsfl_60_idx, GXutil.rtrim( O377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_40_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_40_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsLin_Title)) ;
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsTxt_Title)) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll10540( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_40 = (short)(0) ;
      nIsMod_40 = (short)(0) ;
      nRcdDeleted_40 = (short)(0) ;
   }

   public void processLevel10534( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel10540( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel10534( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete10534( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisob1");
         if ( AnyError == 0 )
         {
            confirmValues1050( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisob1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10534( )
   {
      /* Scan By routine */
      /* Using cursor T010525 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10534( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd10534( )
   {
      pr_default.close(23);
   }

   public void afterConfirm10534( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10534( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10534( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10534( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10534( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10534( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10534( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEnt_Enabled), 5, 0), true);
      edtDisPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreMtr_Enabled), 5, 0), true);
      edtDisPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreKgm_Enabled), 5, 0), true);
      edtDisDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDto_Enabled), 5, 0), true);
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm10540( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z377DisObsTxt = T01053_A377DisObsTxt[0] ;
         }
         else
         {
            Z377DisObsTxt = A377DisObsTxt ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         Z377DisObsTxt = A377DisObsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal10540( )
   {
   }

   public void standaloneModal10540( )
   {
      if ( isUpd( )  )
      {
         edtDisObsTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisObsTxt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtDisObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load10540( )
   {
      /* Using cursor T010526 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A377DisObsTxt = T010526_A377DisObsTxt[0] ;
         zm10540( -16) ;
      }
      pr_default.close(24);
      onLoadActions10540( ) ;
   }

   public void onLoadActions10540( )
   {
      AV36oldObs = O377DisObsTxt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
   }

   public void checkExtendedTable10540( )
   {
      nIsDirty_40 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal10540( ) ;
      if ( true /* Level */ && true /* After */ && (0==A376DisObsLin) && ( AV31ObsMan == 1 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_int6[0] = A376DisObsLin ;
         new app.pultlob(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int6) ;
         tdisob1_impl.this.A396EmprCod = GXv_char5[0] ;
         tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
         tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( true /* Level */ && (0==A376DisObsLin) && true /* After */ && ( AV31ObsMan == 1 ) )
      {
         GXCCtl = "DISOBSLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe entrar No. Linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisObsLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV36oldObs = O377DisObsTxt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
   }

   public void closeExtendedTableCursors10540( )
   {
   }

   public void enableDisable10540( )
   {
   }

   public void getKey10540( )
   {
      /* Using cursor T010527 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound40 = (short)(1) ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey10540( )
   {
      /* Using cursor T01053 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01053_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01053_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10540( 16) ;
         RcdFound40 = (short)(1) ;
         initializeNonKey10540( ) ;
         A376DisObsLin = T01053_A376DisObsLin[0] ;
         A377DisObsTxt = T01053_A377DisObsTxt[0] ;
         O377DisObsTxt = A377DisObsTxt ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10540( ) ;
         load10540( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound40 = (short)(0) ;
         initializeNonKey10540( ) ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10540( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10540( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10540( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01052 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z377DisObsTxt, T01052_A377DisObsTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z377DisObsTxt, T01052_A377DisObsTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdisob1:[seudo value changed for attri]"+"DisObsTxt");
               GXutil.writeLogRaw("Old: ",Z377DisObsTxt);
               GXutil.writeLogRaw("Current: ",T01052_A377DisObsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSERV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10540( )
   {
      beforeValidate10540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10540( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10540( 0) ;
         checkOptimisticConcurrency10540( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10540( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010528 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                  if ( (pr_default.getStatus(26) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && ! (GXutil.strcmp("", A377DisObsTxt)==0) )
                     {
                        AV35Inc_obs = httpContext.getMessage( httpContext.getMessage( "INS Observaciones nuevas. Linea= ", ""), "") + GXutil.trim( GXutil.str( A376DisObsLin, 1, 0)) + " " + GXutil.trim( A377DisObsTxt) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                     }
                     if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                     {
                        GXv_char5[0] = A396EmprCod ;
                        GXv_int7[0] = A361DisCod ;
                        GXv_char4[0] = AV36oldObs ;
                        GXv_int6[0] = A376DisObsLin ;
                        GXv_char2[0] = A377DisObsTxt ;
                        GXv_char8[0] = AV23UsurCod ;
                        GXv_char9[0] = AV26Station ;
                        GXv_char10[0] = Gx_mode ;
                        new app.pprc171(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char4, GXv_int6, GXv_char2, GXv_char8, GXv_char9, GXv_char10) ;
                        tdisob1_impl.this.A396EmprCod = GXv_char5[0] ;
                        tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
                        tdisob1_impl.this.AV36oldObs = GXv_char4[0] ;
                        tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
                        tdisob1_impl.this.A377DisObsTxt = GXv_char2[0] ;
                        tdisob1_impl.this.AV23UsurCod = GXv_char8[0] ;
                        tdisob1_impl.this.AV26Station = GXv_char9[0] ;
                        tdisob1_impl.this.Gx_mode = GXv_char10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
                        httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     if ( true /* After */ && ! (GXutil.strcmp("", A377DisObsTxt)==0) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV23UsurCod, AV26Station, AV35Inc_obs, A361DisCod, (byte)(0), "") ;
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
            load10540( ) ;
         }
         endLevel10540( ) ;
      }
      closeExtendedTableCursors10540( ) ;
   }

   public void update10540( )
   {
      beforeValidate10540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10540( ) ;
      }
      if ( ( nIsMod_40 != 0 ) || ( nIsDirty_40 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10540( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10540( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10540( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010529 */
                     pr_default.execute(27, new Object[] {A377DisObsTxt, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10540( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char10[0] = A396EmprCod ;
                        GXv_int7[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int7) ;
                        tdisob1_impl.this.A396EmprCod = GXv_char10[0] ;
                        tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
                        /* Start of After( update) rules */
                        if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                        {
                           GXv_char10[0] = A396EmprCod ;
                           GXv_int7[0] = A361DisCod ;
                           GXv_char9[0] = AV36oldObs ;
                           GXv_int6[0] = A376DisObsLin ;
                           GXv_char8[0] = A377DisObsTxt ;
                           GXv_char5[0] = AV23UsurCod ;
                           GXv_char4[0] = AV26Station ;
                           GXv_char2[0] = Gx_mode ;
                           new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_int6, GXv_char8, GXv_char5, GXv_char4, GXv_char2) ;
                           tdisob1_impl.this.A396EmprCod = GXv_char10[0] ;
                           tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
                           tdisob1_impl.this.AV36oldObs = GXv_char9[0] ;
                           tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
                           tdisob1_impl.this.A377DisObsTxt = GXv_char8[0] ;
                           tdisob1_impl.this.AV23UsurCod = GXv_char5[0] ;
                           tdisob1_impl.this.AV26Station = GXv_char4[0] ;
                           tdisob1_impl.this.Gx_mode = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
                           httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10540( ) ;
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
            endLevel10540( ) ;
         }
      }
      closeExtendedTableCursors10540( ) ;
   }

   public void deferredUpdate10540( )
   {
   }

   public void delete10540( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10540( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10540( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10540( ) ;
         afterConfirm10540( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10540( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010530 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                  {
                     GXv_char10[0] = A396EmprCod ;
                     GXv_int7[0] = A361DisCod ;
                     GXv_char9[0] = AV36oldObs ;
                     GXv_int6[0] = A376DisObsLin ;
                     GXv_char8[0] = A377DisObsTxt ;
                     GXv_char5[0] = AV23UsurCod ;
                     GXv_char4[0] = AV26Station ;
                     GXv_char2[0] = Gx_mode ;
                     new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_int6, GXv_char8, GXv_char5, GXv_char4, GXv_char2) ;
                     tdisob1_impl.this.A396EmprCod = GXv_char10[0] ;
                     tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
                     tdisob1_impl.this.AV36oldObs = GXv_char9[0] ;
                     tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
                     tdisob1_impl.this.A377DisObsTxt = GXv_char8[0] ;
                     tdisob1_impl.this.AV23UsurCod = GXv_char5[0] ;
                     tdisob1_impl.this.AV26Station = GXv_char4[0] ;
                     tdisob1_impl.this.Gx_mode = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
                     httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  }
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
      sMode40 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10540( ) ;
      Gx_mode = sMode40 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10540( )
   {
      standaloneModal10540( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV36oldObs = O377DisObsTxt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
      }
   }

   public void endLevel10540( )
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

   public void scanStart10540( )
   {
      /* Scan By routine */
      /* Using cursor T010531 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T010531_A376DisObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10540( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T010531_A376DisObsLin[0] ;
      }
   }

   public void scanEnd10540( )
   {
      pr_default.close(29);
   }

   public void afterConfirm10540( )
   {
      /* After Confirm Rules */
      if ( ( isDlt( )  || isUpd( )  ) && true /* After */ && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( isIns( )  && true /* After */ && true /* Level */ && ( AV31ObsMan == 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_int6[0] = A376DisObsLin ;
         new app.puliobs(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6) ;
         tdisob1_impl.this.A396EmprCod = GXv_char10[0] ;
         tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
         tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void beforeInsert10540( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10540( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10540( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10540( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10540( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10540( )
   {
      edtDisObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisObsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes10540( )
   {
   }

   public void send_integrity_lvl_hashes10534( )
   {
   }

   public void subsflControlProps_6040( )
   {
      edtavnRcdDeleted_40_Internalname = "vNRCDDELETED_40_"+sGXsfl_60_idx ;
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_60_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_6040( )
   {
      edtavnRcdDeleted_40_Internalname = "vNRCDDELETED_40_"+sGXsfl_60_fel_idx ;
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_60_fel_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_60_fel_idx ;
   }

   public void addRow10540( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_6040( ) ;
      sendRow10540( ) ;
   }

   public void sendRow10540( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_40_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_40_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_40), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_40), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_40_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_40_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsTxt_Internalname,GXutil.rtrim( A377DisObsTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisObsTxt_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10540( ) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z377DisObsTxt));
      GXCCtl = "O377DisObsTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O377DisObsTxt));
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_40_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_40_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_40_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_40_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsLin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSTXT_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtDisObsTxt_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10540( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_6040( ) ;
      edtavnRcdDeleted_40_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_40_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisObsLin_Title = httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_60_idx+"Title") ;
      edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisObsTxt_Title = httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_60_idx+"Title") ;
      edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_40_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_40_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_40");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_40_Internalname ;
         wbErr = true ;
         nRcdDeleted_40 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_40 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_40_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DISOBSLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisObsLin_Internalname ;
         wbErr = true ;
         A376DisObsLin = (byte)(0) ;
      }
      else
      {
         A376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A377DisObsTxt = httpContext.cgiGet( edtDisObsTxt_Internalname) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_60_idx ;
      Z376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_60_idx ;
      Z377DisObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O377DisObsTxt_" + sGXsfl_60_idx ;
      O377DisObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_60_idx ;
      nRcdDeleted_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_40_" + sGXsfl_60_idx ;
      nRcdExists_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_40_" + sGXsfl_60_idx ;
      nIsMod_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisObsTxt_Enabled = edtDisObsTxt_Enabled ;
      defedtDisObsLin_Enabled = edtDisObsLin_Enabled ;
   }

   public void confirmValues1050( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_6040( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_6040( ) ;
         httpContext.changePostValue( "Z376DisObsLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z376DisObsLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z377DisObsTxt_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z377DisObsTxt_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O377DisObsTxt", httpContext.cgiGet( "T377DisObsTxt")) ;
      httpContext.deletePostValue( "T377DisObsTxt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdisob1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7510DisDto", GXutil.ltrim( localUtil.ntoc( Z7510DisDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z378DisObsULin", GXutil.ltrim( localUtil.ntoc( Z378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT4", GXutil.rtrim( AV20Lit4));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT5", GXutil.rtrim( AV21Lit5));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV35Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDOBS", GXutil.rtrim( AV36oldObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vOBSMAN", GXutil.ltrim( localUtil.ntoc( AV31ObsMan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV26Station));
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
      return formatLink("app.tdisob1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDISOB1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Observ. HDR (Solo Agregar)", "") ;
   }

   public void initializeNonKey10534( )
   {
      A366DisEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
      A389DisPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
      A388DisPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
      A7510DisDto = DecimalUtil.ZERO ;
      n7510DisDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
      A378DisObsULin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      Z366DisEnt = "" ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z7510DisDto = DecimalUtil.ZERO ;
      Z378DisObsULin = (byte)(0) ;
   }

   public void initAll10534( )
   {
      initializeNonKey10534( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey10540( )
   {
      AV35Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
      AV36oldObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
      A377DisObsTxt = "" ;
      O377DisObsTxt = A377DisObsTxt ;
      Z377DisObsTxt = "" ;
   }

   public void initAll10540( )
   {
      A376DisObsLin = (byte)(0) ;
      initializeNonKey10540( ) ;
   }

   public void standaloneModalInsert10540( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533042", true, true);
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
      httpContext.AddJavascriptSource("tdisob1.js", "?20268241533042", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties40( )
   {
      edtDisObsTxt_Enabled = defedtDisObsTxt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtDisObsLin_Enabled = defedtDisObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_40_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtDisObsLin_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A377DisObsTxt));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtDisObsTxt_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDisEnt_Internalname = "DISENT" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDisPreMtr_Internalname = "DISPREMTR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisPreKgm_Internalname = "DISPREKGM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisDto_Internalname = "DISDTO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDisObsULin_Internalname = "DISOBSULIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_40_Internalname = "vNRCDDELETED_40" ;
      edtDisObsLin_Internalname = "DISOBSLIN" ;
      edtDisObsTxt_Internalname = "DISOBSTXT" ;
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
      Form.setCaption( httpContext.getMessage( "Observ. HDR (Solo Agregar)", "") );
      edtDisObsTxt_Jsonclick = "" ;
      edtDisObsLin_Jsonclick = "" ;
      edtavnRcdDeleted_40_Jsonclick = "" ;
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
      edtDisObsTxt_Enabled = 1 ;
      edtDisObsTxt_Title = httpContext.getMessage( "Texto observaciones", "") ;
      edtDisObsLin_Enabled = 1 ;
      edtDisObsLin_Title = httpContext.getMessage( "Lineas observaciones", "") ;
      edtavnRcdDeleted_40_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDisObsULin_Jsonclick = "" ;
      edtDisObsULin_Backcolor = (int)(0xFFFFFF) ;
      edtDisObsULin_Enabled = 1 ;
      edtDisDto_Jsonclick = "" ;
      edtDisDto_Backcolor = (int)(0xFFFFFF) ;
      edtDisDto_Enabled = 1 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreKgm_Enabled = 1 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreMtr_Enabled = 1 ;
      edtDisEnt_Jsonclick = "" ;
      edtDisEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisEnt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void xc_6_10540( String Gx_mode ,
                           String A396EmprCod ,
                           int A361DisCod ,
                           byte A376DisObsLin ,
                           byte AV31ObsMan )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ && ( AV31ObsMan == 0 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_int6[0] = A376DisObsLin ;
         new app.puliobs(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char10[0] ;
         A361DisCod = GXv_int7[0] ;
         A376DisObsLin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_7_10540( String A396EmprCod ,
                           int A361DisCod ,
                           byte A376DisObsLin ,
                           byte AV31ObsMan )
   {
      if ( true /* Level */ && true /* After */ && (0==A376DisObsLin) && ( AV31ObsMan == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_int6[0] = A376DisObsLin ;
         new app.pultlob(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char10[0] ;
         A361DisCod = GXv_int7[0] ;
         A376DisObsLin = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_10540( String A396EmprCod ,
                            String AV37Pgmname ,
                            String AV23UsurCod ,
                            String AV26Station ,
                            String AV35Inc_obs ,
                            int A361DisCod ,
                            String A377DisObsTxt )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A377DisObsTxt)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV37Pgmname, AV23UsurCod, AV26Station, AV35Inc_obs, A361DisCod, (byte)(0), "") ;
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

   public void xc_13_10540( String A396EmprCod ,
                            int A361DisCod ,
                            String AV36oldObs ,
                            byte A376DisObsLin ,
                            String A377DisObsTxt ,
                            String AV23UsurCod ,
                            String AV26Station ,
                            String Gx_mode )
   {
      if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_char9[0] = AV36oldObs ;
         GXv_int6[0] = A376DisObsLin ;
         GXv_char8[0] = A377DisObsTxt ;
         GXv_char5[0] = AV23UsurCod ;
         GXv_char4[0] = AV26Station ;
         GXv_char2[0] = Gx_mode ;
         new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_int6, GXv_char8, GXv_char5, GXv_char4, GXv_char2) ;
         A396EmprCod = GXv_char10[0] ;
         A361DisCod = GXv_int7[0] ;
         AV36oldObs = GXv_char9[0] ;
         A376DisObsLin = GXv_int6[0] ;
         A377DisObsTxt = GXv_char8[0] ;
         AV23UsurCod = GXv_char5[0] ;
         AV26Station = GXv_char4[0] ;
         Gx_mode = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", AV36oldObs);
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36oldObs))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A377DisObsTxt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV23UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV26Station))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
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
      subsflControlProps_6040( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10540( ) ;
         standaloneModal10540( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10540( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_6040( ) ;
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
      /* Using cursor T010532 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010532_A407EmprNom[0] ;
      n407EmprNom = T010532_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(30);
      GX_FocusControl = edtDisEnt_Internalname ;
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

   public void valid_Discod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", GXutil.rtrim( A366DisEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrim( localUtil.ntoc( A7510DisDto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7510DisDto", GXutil.ltrim( localUtil.ntoc( Z7510DisDto, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z378DisObsULin", GXutil.ltrim( localUtil.ntoc( Z378DisObsULin, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Disobslin( )
   {
      if ( true /* Level */ && true /* After */ && (0==A376DisObsLin) && ( AV31ObsMan == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A361DisCod ;
         GXv_int6[0] = A376DisObsLin ;
         new app.pultlob(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int6) ;
         tdisob1_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdisob1_impl.this.A361DisCod = GXv_int7[0] ;
         A361DisCod = this.A361DisCod ;
         tdisob1_impl.this.A376DisObsLin = GXv_int6[0] ;
         A376DisObsLin = this.A376DisObsLin ;
      }
      if ( true /* Level */ && (0==A376DisObsLin) && true /* After */ && ( AV31ObsMan == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe entrar No. Linea", ""), 1, "DISOBSLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisObsLin_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A376DisObsLin", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Disobstxt( )
   {
      AV36oldObs = O377DisObsTxt ;
      O377DisObsTxt = A377DisObsTxt ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldObs", GXutil.rtrim( AV36oldObs));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121052',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'AV31ObsMan',fld:'vOBSMAN',pic:'9'},{av:'AV23UsurCod',fld:'vUSURCOD',pic:''},{av:'AV26Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV20Lit4',fld:'vLIT4',pic:''},{av:'AV21Lit5',fld:'vLIT5',pic:''}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A366DisEnt',fld:'DISENT',pic:''},{av:'A389DisPreMtr',fld:'DISPREMTR',pic:'ZZZZZZ9.99'},{av:'A388DisPreKgm',fld:'DISPREKGM',pic:'ZZZZZZ9.99'},{av:'A7510DisDto',fld:'DISDTO',pic:'ZZ9.99 %'},{av:'A378DisObsULin',fld:'DISOBSULIN',pic:'9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z366DisEnt'},{av:'Z389DisPreMtr'},{av:'Z388DisPreKgm'},{av:'Z7510DisDto'},{av:'Z378DisObsULin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISOBSLIN","{handler:'valid_Disobslin',iparms:[{av:'AV31ObsMan',fld:'vOBSMAN',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'}]");
      setEventMetadata("VALID_DISOBSLIN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A376DisObsLin',fld:'DISOBSLIN',pic:'9'}]}");
      setEventMetadata("VALID_DISOBSTXT","{handler:'valid_Disobstxt',iparms:[{av:'O377DisObsTxt'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'AV36oldObs',fld:'vOLDOBS',pic:''}]");
      setEventMetadata("VALID_DISOBSTXT",",oparms:[{av:'AV36oldObs',fld:'vOLDOBS',pic:''}]}");
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
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z366DisEnt = "" ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z7510DisDto = DecimalUtil.ZERO ;
      Z377DisObsTxt = "" ;
      O377DisObsTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "" ;
      AV23UsurCod = "" ;
      AV26Station = "" ;
      AV35Inc_obs = "" ;
      A377DisObsTxt = "" ;
      AV36oldObs = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A366DisEnt = "" ;
      lblTextblock4_Jsonclick = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A7510DisDto = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode40 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV20Lit4 = "" ;
      AV21Lit5 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode34 = "" ;
      GXCCtl = "" ;
      T377DisObsTxt = "" ;
      AV16Lit0 = "" ;
      AV24LitFe = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV22lit6 = "" ;
      AV28Lit7 = "" ;
      AV33Lit8 = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
      AV25EmprCod = "" ;
      AV27EmprNom = "" ;
      Z407EmprNom = "" ;
      T01056_A407EmprNom = new String[] {""} ;
      T01056_n407EmprNom = new boolean[] {false} ;
      T01057_A361DisCod = new int[1] ;
      T01057_A366DisEnt = new String[] {""} ;
      T01057_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01057_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01057_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01057_n7510DisDto = new boolean[] {false} ;
      T01057_A378DisObsULin = new byte[1] ;
      T01057_A407EmprNom = new String[] {""} ;
      T01057_n407EmprNom = new boolean[] {false} ;
      T01057_A396EmprCod = new String[] {""} ;
      T01058_A396EmprCod = new String[] {""} ;
      T01058_A361DisCod = new int[1] ;
      T01055_A361DisCod = new int[1] ;
      T01055_A366DisEnt = new String[] {""} ;
      T01055_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01055_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01055_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01055_n7510DisDto = new boolean[] {false} ;
      T01055_A378DisObsULin = new byte[1] ;
      T01055_A396EmprCod = new String[] {""} ;
      T01059_A396EmprCod = new String[] {""} ;
      T01059_A361DisCod = new int[1] ;
      T010510_A396EmprCod = new String[] {""} ;
      T010510_A361DisCod = new int[1] ;
      T01054_A361DisCod = new int[1] ;
      T01054_A366DisEnt = new String[] {""} ;
      T01054_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01054_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01054_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01054_n7510DisDto = new boolean[] {false} ;
      T01054_A378DisObsULin = new byte[1] ;
      T01054_A396EmprCod = new String[] {""} ;
      T010514_A396EmprCod = new String[] {""} ;
      T010514_A361DisCod = new int[1] ;
      T010514_A13376DisTraID = new String[] {""} ;
      T010515_A396EmprCod = new String[] {""} ;
      T010515_A361DisCod = new int[1] ;
      T010515_A13213DisNormID = new String[] {""} ;
      T010516_A396EmprCod = new String[] {""} ;
      T010516_A361DisCod = new int[1] ;
      T010516_A13081DisDGLin = new byte[1] ;
      T010516_A13082DisDGDibCl = new String[] {""} ;
      T010516_A13083DisDGDibIn = new int[1] ;
      T010516_A13084DisDGComb = new String[] {""} ;
      T010516_A13085DisDGFondo = new String[] {""} ;
      T010517_A396EmprCod = new String[] {""} ;
      T010517_A361DisCod = new int[1] ;
      T010517_A7068DisNotLin = new byte[1] ;
      T010518_A396EmprCod = new String[] {""} ;
      T010518_A361DisCod = new int[1] ;
      T010518_A10197ProEspCod = new String[] {""} ;
      T010519_A396EmprCod = new String[] {""} ;
      T010519_A361DisCod = new int[1] ;
      T010519_A4594AccCod = new short[1] ;
      T010520_A396EmprCod = new String[] {""} ;
      T010520_A361DisCod = new int[1] ;
      T010520_A2524DisComLin = new byte[1] ;
      T010520_A1056DisComCod = new String[] {""} ;
      T010520_A1032FonCod = new String[] {""} ;
      T010521_A396EmprCod = new String[] {""} ;
      T010521_A361DisCod = new int[1] ;
      T010521_A3398DisRefBarC = new int[1] ;
      T010521_A3399DisRefBCRe = new byte[1] ;
      T010521_A3400DisRefBCPa = new String[] {""} ;
      T010521_A3607DisRefBPie = new String[] {""} ;
      T010522_A396EmprCod = new String[] {""} ;
      T010522_A361DisCod = new int[1] ;
      T010522_A758ProCod = new String[] {""} ;
      T010523_A396EmprCod = new String[] {""} ;
      T010523_A361DisCod = new int[1] ;
      T010523_A833TipDefCod = new short[1] ;
      T010524_A396EmprCod = new String[] {""} ;
      T010524_A361DisCod = new int[1] ;
      T010524_A44AlbRecCod = new int[1] ;
      T010525_A396EmprCod = new String[] {""} ;
      T010525_A361DisCod = new int[1] ;
      T010526_A361DisCod = new int[1] ;
      T010526_A376DisObsLin = new byte[1] ;
      T010526_A377DisObsTxt = new String[] {""} ;
      T010526_A396EmprCod = new String[] {""} ;
      T010527_A396EmprCod = new String[] {""} ;
      T010527_A361DisCod = new int[1] ;
      T010527_A376DisObsLin = new byte[1] ;
      T01053_A361DisCod = new int[1] ;
      T01053_A376DisObsLin = new byte[1] ;
      T01053_A377DisObsTxt = new String[] {""} ;
      T01053_A396EmprCod = new String[] {""} ;
      T01052_A361DisCod = new int[1] ;
      T01052_A376DisObsLin = new byte[1] ;
      T01052_A377DisObsTxt = new String[] {""} ;
      T01052_A396EmprCod = new String[] {""} ;
      T010531_A396EmprCod = new String[] {""} ;
      T010531_A361DisCod = new int[1] ;
      T010531_A376DisObsLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      T010532_A407EmprNom = new String[] {""} ;
      T010532_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ366DisEnt = "" ;
      ZZ389DisPreMtr = DecimalUtil.ZERO ;
      ZZ388DisPreKgm = DecimalUtil.ZERO ;
      ZZ7510DisDto = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      ZV36oldObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisob1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisob1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisob1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisob1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisob1__default(),
         new Object[] {
             new Object[] {
            T01052_A361DisCod, T01052_A376DisObsLin, T01052_A377DisObsTxt, T01052_A396EmprCod
            }
            , new Object[] {
            T01053_A361DisCod, T01053_A376DisObsLin, T01053_A377DisObsTxt, T01053_A396EmprCod
            }
            , new Object[] {
            T01054_A361DisCod, T01054_A366DisEnt, T01054_A389DisPreMtr, T01054_A388DisPreKgm, T01054_A7510DisDto, T01054_n7510DisDto, T01054_A378DisObsULin, T01054_A396EmprCod
            }
            , new Object[] {
            T01055_A361DisCod, T01055_A366DisEnt, T01055_A389DisPreMtr, T01055_A388DisPreKgm, T01055_A7510DisDto, T01055_n7510DisDto, T01055_A378DisObsULin, T01055_A396EmprCod
            }
            , new Object[] {
            T01056_A407EmprNom, T01056_n407EmprNom
            }
            , new Object[] {
            T01057_A361DisCod, T01057_A366DisEnt, T01057_A389DisPreMtr, T01057_A388DisPreKgm, T01057_A7510DisDto, T01057_n7510DisDto, T01057_A378DisObsULin, T01057_A407EmprNom, T01057_n407EmprNom, T01057_A396EmprCod
            }
            , new Object[] {
            T01058_A396EmprCod, T01058_A361DisCod
            }
            , new Object[] {
            T01059_A396EmprCod, T01059_A361DisCod
            }
            , new Object[] {
            T010510_A396EmprCod, T010510_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010514_A396EmprCod, T010514_A361DisCod, T010514_A13376DisTraID
            }
            , new Object[] {
            T010515_A396EmprCod, T010515_A361DisCod, T010515_A13213DisNormID
            }
            , new Object[] {
            T010516_A396EmprCod, T010516_A361DisCod, T010516_A13081DisDGLin, T010516_A13082DisDGDibCl, T010516_A13083DisDGDibIn, T010516_A13084DisDGComb, T010516_A13085DisDGFondo
            }
            , new Object[] {
            T010517_A396EmprCod, T010517_A361DisCod, T010517_A7068DisNotLin
            }
            , new Object[] {
            T010518_A396EmprCod, T010518_A361DisCod, T010518_A10197ProEspCod
            }
            , new Object[] {
            T010519_A396EmprCod, T010519_A361DisCod, T010519_A4594AccCod
            }
            , new Object[] {
            T010520_A396EmprCod, T010520_A361DisCod, T010520_A2524DisComLin, T010520_A1056DisComCod, T010520_A1032FonCod
            }
            , new Object[] {
            T010521_A396EmprCod, T010521_A361DisCod, T010521_A3398DisRefBarC, T010521_A3399DisRefBCRe, T010521_A3400DisRefBCPa, T010521_A3607DisRefBPie
            }
            , new Object[] {
            T010522_A396EmprCod, T010522_A361DisCod, T010522_A758ProCod
            }
            , new Object[] {
            T010523_A396EmprCod, T010523_A361DisCod, T010523_A833TipDefCod
            }
            , new Object[] {
            T010524_A396EmprCod, T010524_A361DisCod, T010524_A44AlbRecCod
            }
            , new Object[] {
            T010525_A396EmprCod, T010525_A361DisCod
            }
            , new Object[] {
            T010526_A361DisCod, T010526_A376DisObsLin, T010526_A377DisObsTxt, T010526_A396EmprCod
            }
            , new Object[] {
            T010527_A396EmprCod, T010527_A361DisCod, T010527_A376DisObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010531_A396EmprCod, T010531_A361DisCod, T010531_A376DisObsLin
            }
            , new Object[] {
            T010532_A407EmprNom, T010532_n407EmprNom
            }
         }
      );
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TDISOB1" ;
   }

   private byte Z378DisObsULin ;
   private byte Z376DisObsLin ;
   private byte GxWebError ;
   private byte A376DisObsLin ;
   private byte AV31ObsMan ;
   private byte nKeyPressed ;
   private byte A378DisObsULin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ378DisObsULin ;
   private byte GXv_int6[] ;
   private short nRcdDeleted_40 ;
   private short nRcdExists_40 ;
   private short nIsMod_40 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount40 ;
   private short RcdFound40 ;
   private short nBlankRcdUsr40 ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_40 ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDisEnt_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisDto_Enabled ;
   private int edtDisObsULin_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_40_Enabled ;
   private int edtDisObsLin_Enabled ;
   private int edtDisObsTxt_Enabled ;
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
   private int defedtDisObsTxt_Enabled ;
   private int defedtDisObsLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDisObsULin_Backcolor ;
   private int edtDisDto_Backcolor ;
   private int edtDisPreKgm_Backcolor ;
   private int edtDisPreMtr_Backcolor ;
   private int edtDisEnt_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int GXv_int7[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z389DisPreMtr ;
   private java.math.BigDecimal Z388DisPreKgm ;
   private java.math.BigDecimal Z7510DisDto ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A7510DisDto ;
   private java.math.BigDecimal ZZ389DisPreMtr ;
   private java.math.BigDecimal ZZ388DisPreKgm ;
   private java.math.BigDecimal ZZ7510DisDto ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z366DisEnt ;
   private String Z377DisObsTxt ;
   private String O377DisObsTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV37Pgmname ;
   private String AV23UsurCod ;
   private String AV26Station ;
   private String A377DisObsTxt ;
   private String AV36oldObs ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisEnt_Internalname ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A366DisEnt ;
   private String edtDisEnt_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisDto_Internalname ;
   private String edtDisDto_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDisObsULin_Internalname ;
   private String edtDisObsULin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode40 ;
   private String edtavnRcdDeleted_40_Internalname ;
   private String edtDisObsLin_Title ;
   private String edtDisObsLin_Internalname ;
   private String edtDisObsTxt_Title ;
   private String edtDisObsTxt_Internalname ;
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
   private String AV20Lit4 ;
   private String AV21Lit5 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode34 ;
   private String GXCCtl ;
   private String T377DisObsTxt ;
   private String AV16Lit0 ;
   private String AV24LitFe ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV22lit6 ;
   private String AV28Lit7 ;
   private String AV33Lit8 ;
   private String GXt_char1 ;
   private String GXt_char3 ;
   private String AV25EmprCod ;
   private String AV27EmprNom ;
   private String Z407EmprNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_40_Jsonclick ;
   private String edtDisObsLin_Jsonclick ;
   private String edtDisObsTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ366DisEnt ;
   private String ZZ407EmprNom ;
   private String GXv_char10[] ;
   private String ZV36oldObs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n7510DisDto ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String AV35Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01056_A407EmprNom ;
   private boolean[] T01056_n407EmprNom ;
   private int[] T01057_A361DisCod ;
   private String[] T01057_A366DisEnt ;
   private java.math.BigDecimal[] T01057_A389DisPreMtr ;
   private java.math.BigDecimal[] T01057_A388DisPreKgm ;
   private java.math.BigDecimal[] T01057_A7510DisDto ;
   private boolean[] T01057_n7510DisDto ;
   private byte[] T01057_A378DisObsULin ;
   private String[] T01057_A407EmprNom ;
   private boolean[] T01057_n407EmprNom ;
   private String[] T01057_A396EmprCod ;
   private String[] T01058_A396EmprCod ;
   private int[] T01058_A361DisCod ;
   private int[] T01055_A361DisCod ;
   private String[] T01055_A366DisEnt ;
   private java.math.BigDecimal[] T01055_A389DisPreMtr ;
   private java.math.BigDecimal[] T01055_A388DisPreKgm ;
   private java.math.BigDecimal[] T01055_A7510DisDto ;
   private boolean[] T01055_n7510DisDto ;
   private byte[] T01055_A378DisObsULin ;
   private String[] T01055_A396EmprCod ;
   private String[] T01059_A396EmprCod ;
   private int[] T01059_A361DisCod ;
   private String[] T010510_A396EmprCod ;
   private int[] T010510_A361DisCod ;
   private int[] T01054_A361DisCod ;
   private String[] T01054_A366DisEnt ;
   private java.math.BigDecimal[] T01054_A389DisPreMtr ;
   private java.math.BigDecimal[] T01054_A388DisPreKgm ;
   private java.math.BigDecimal[] T01054_A7510DisDto ;
   private boolean[] T01054_n7510DisDto ;
   private byte[] T01054_A378DisObsULin ;
   private String[] T01054_A396EmprCod ;
   private String[] T010514_A396EmprCod ;
   private int[] T010514_A361DisCod ;
   private String[] T010514_A13376DisTraID ;
   private String[] T010515_A396EmprCod ;
   private int[] T010515_A361DisCod ;
   private String[] T010515_A13213DisNormID ;
   private String[] T010516_A396EmprCod ;
   private int[] T010516_A361DisCod ;
   private byte[] T010516_A13081DisDGLin ;
   private String[] T010516_A13082DisDGDibCl ;
   private int[] T010516_A13083DisDGDibIn ;
   private String[] T010516_A13084DisDGComb ;
   private String[] T010516_A13085DisDGFondo ;
   private String[] T010517_A396EmprCod ;
   private int[] T010517_A361DisCod ;
   private byte[] T010517_A7068DisNotLin ;
   private String[] T010518_A396EmprCod ;
   private int[] T010518_A361DisCod ;
   private String[] T010518_A10197ProEspCod ;
   private String[] T010519_A396EmprCod ;
   private int[] T010519_A361DisCod ;
   private short[] T010519_A4594AccCod ;
   private String[] T010520_A396EmprCod ;
   private int[] T010520_A361DisCod ;
   private byte[] T010520_A2524DisComLin ;
   private String[] T010520_A1056DisComCod ;
   private String[] T010520_A1032FonCod ;
   private String[] T010521_A396EmprCod ;
   private int[] T010521_A361DisCod ;
   private int[] T010521_A3398DisRefBarC ;
   private byte[] T010521_A3399DisRefBCRe ;
   private String[] T010521_A3400DisRefBCPa ;
   private String[] T010521_A3607DisRefBPie ;
   private String[] T010522_A396EmprCod ;
   private int[] T010522_A361DisCod ;
   private String[] T010522_A758ProCod ;
   private String[] T010523_A396EmprCod ;
   private int[] T010523_A361DisCod ;
   private short[] T010523_A833TipDefCod ;
   private String[] T010524_A396EmprCod ;
   private int[] T010524_A361DisCod ;
   private int[] T010524_A44AlbRecCod ;
   private String[] T010525_A396EmprCod ;
   private int[] T010525_A361DisCod ;
   private int[] T010526_A361DisCod ;
   private byte[] T010526_A376DisObsLin ;
   private String[] T010526_A377DisObsTxt ;
   private String[] T010526_A396EmprCod ;
   private String[] T010527_A396EmprCod ;
   private int[] T010527_A361DisCod ;
   private byte[] T010527_A376DisObsLin ;
   private int[] T01053_A361DisCod ;
   private byte[] T01053_A376DisObsLin ;
   private String[] T01053_A377DisObsTxt ;
   private String[] T01053_A396EmprCod ;
   private int[] T01052_A361DisCod ;
   private byte[] T01052_A376DisObsLin ;
   private String[] T01052_A377DisObsTxt ;
   private String[] T01052_A396EmprCod ;
   private String[] T010531_A396EmprCod ;
   private int[] T010531_A361DisCod ;
   private byte[] T010531_A376DisObsLin ;
   private String[] T010532_A407EmprNom ;
   private boolean[] T010532_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdisob1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisob1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisob1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisob1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisob1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01052", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?  FOR UPDATE OF DisObsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01053", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01054", "SELECT DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01055", "SELECT DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01056", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01057", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.DisEnt, TM1.DisPreMtr, TM1.DisPreKgm, TM1.DisDto, TM1.DisObsULin, T2.EmprNom, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01058", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01059", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010510", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010511", "INSERT INTO TXPDISPOS(DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T010512", "UPDATE TXPDISPOS SET DisEnt=?, DisPreMtr=?, DisPreKgm=?, DisDto=?, DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T010513", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T010514", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010515", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010516", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010517", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010518", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010519", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010520", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010521", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010522", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010523", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010524", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010525", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010526", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010527", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010528", "INSERT INTO TXPOBSERV(DisCod, DisObsLin, DisObsTxt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T010529", "UPDATE TXPOBSERV SET DisObsTxt=?  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T010530", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new ForEachCursor("T010531", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010532", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setString(2, (String)parms[1], 40);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
      }
   }

}

