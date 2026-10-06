package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttaruni_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2933RecTipCon = (short)(GXutil.lval( httpContext.GetPar( "RecTipCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         A2934RecTipDsc = httpContext.GetPar( "RecTipDsc") ;
         n2934RecTipDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
         AV28FlagCon = (byte)(GXutil.lval( httpContext.GetPar( "FlagCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.str( AV28FlagCon, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_X4431( Gx_mode, A396EmprCod, A2933RecTipCon, A2934RecTipDsc, AV28FlagCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2933RecTipCon = (short)(GXutil.lval( httpContext.GetPar( "RecTipCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         A2935Limite3 = (short)(GXutil.lval( httpContext.GetPar( "Limite3"))) ;
         AV31Op = httpContext.GetPar( "Op") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
         AV29CliGen = (byte)(GXutil.lval( httpContext.GetPar( "CliGen"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CliGen", GXutil.str( AV29CliGen, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_X4432( A396EmprCod, A252CliCod, A2933RecTipCon, A2935Limite3, AV31Op, AV29CliGen) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TARIFA UNICA - Cliente Std", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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

   public ttaruni_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttaruni_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttaruni_impl.class ));
   }

   public ttaruni_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTARUNI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Tipo Cono", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecTipCon_Internalname, GXutil.ltrim( localUtil.ntoc( A2933RecTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecTipCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2933RecTipCon), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2933RecTipCon), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTipCon_Jsonclick, 0, "", "", "", "", "", 1, edtRecTipCon_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion Cono", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecTipDsc_Internalname, GXutil.rtrim( A2934RecTipDsc), GXutil.rtrim( localUtil.format( A2934RecTipDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTipDsc_Jsonclick, 0, "", "", "", "", "", 1, edtRecTipDsc_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTARUNI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARUNI.htm");
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
         nBlankRcdCount432 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_432 = (short)(1) ;
            scanStartX4432( ) ;
            while ( RcdFound432 != 0 )
            {
               init_level_properties432( ) ;
               getByPrimaryKeyX4432( ) ;
               addRowX4432( ) ;
               scanNextX4432( ) ;
            }
            scanEndX4432( ) ;
            nBlankRcdCount432 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalX4432( ) ;
         standaloneModalX4432( ) ;
         sMode432 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRowX4432( ) ;
            edtavnRcdDeleted_432_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_432_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_432_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_432_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtLimite3_Title = httpContext.cgiGet( "LIMITE3_"+sGXsfl_50_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Title", edtLimite3_Title, !bGXsfl_50_Refreshing);
            edtLimite3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIMITE3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLimite3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrecio3_Title = httpContext.cgiGet( "PRECIO3_"+sGXsfl_50_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrecio3_Internalname, "Title", edtPrecio3_Title, !bGXsfl_50_Refreshing);
            edtPrecio3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRECIO3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrecio3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrecio3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPorBon3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PORBON3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPorBon3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorBon3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_432 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalX4432( ) ;
            }
            sendRowX4432( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode432 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount432 = (short)(5) ;
         nRcdExists_432 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartX4432( ) ;
            while ( RcdFound432 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50432( ) ;
               init_level_properties432( ) ;
               standaloneNotModalX4432( ) ;
               getByPrimaryKeyX4432( ) ;
               standaloneModalX4432( ) ;
               addRowX4432( ) ;
               scanNextX4432( ) ;
            }
            scanEndX4432( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode432 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_50432( ) ;
      initAllX4432( ) ;
      init_level_properties432( ) ;
      nRcdExists_432 = (short)(0) ;
      nIsMod_432 = (short)(0) ;
      nRcdDeleted_432 = (short)(0) ;
      nBlankRcdCount432 = (short)(nBlankRcdUsr432+nBlankRcdCount432) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount432 > 0 )
      {
         standaloneNotModalX4432( ) ;
         standaloneModalX4432( ) ;
         addRowX4432( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLimite3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount432 = (short)(nBlankRcdCount432-1) ;
      }
      Gx_mode = sMode432 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARUNI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTARUNI.htm");
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
      e11X42 ();
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
            Z2933RecTipCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z2933RecTipCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2934RecTipDsc = httpContext.cgiGet( "Z2934RecTipDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV23Lit5 = httpContext.cgiGet( "vLIT5") ;
            AV24Lit6 = httpContext.cgiGet( "vLIT6") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28FlagCon = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Op = httpContext.cgiGet( "vOP") ;
            AV29CliGen = (byte)(localUtil.ctol( httpContext.cgiGet( "vCLIGEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECTIPCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecTipCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2933RecTipCon = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
            }
            else
            {
               A2933RecTipCon = (short)(localUtil.ctol( httpContext.cgiGet( edtRecTipCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A2934RecTipDsc = httpContext.cgiGet( edtRecTipDsc_Internalname) ;
            n2934RecTipDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2933RecTipCon = (short)(GXutil.lval( httpContext.GetPar( "RecTipCon"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
               getEqualNoModal( ) ;
               if ( isIns( )  && (0==A2933RecTipCon) && ( Gx_BScreen == 0 ) )
               {
                  A2933RecTipCon = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
               }
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
                        e11X42 ();
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
            initAllX4431( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_432_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_432_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributesX4431( ) ;
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

   public void confirm_X40( )
   {
      beforeValidateX4431( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsX4431( ) ;
         }
         else
         {
            checkExtendedTableX4431( ) ;
            if ( AnyError == 0 )
            {
               zmX4431( 11) ;
               zmX4431( 12) ;
            }
            closeExtendedTableCursorsX4431( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode431 = Gx_mode ;
         confirm_X4432( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode431 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode431 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesX40( ) ;
      }
   }

   public void confirm_X4432( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowX4432( ) ;
         if ( ( nRcdExists_432 != 0 ) || ( nIsMod_432 != 0 ) )
         {
            getKeyX4432( ) ;
            if ( ( nRcdExists_432 == 0 ) && ( nRcdDeleted_432 == 0 ) )
            {
               if ( RcdFound432 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateX4432( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableX4432( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsX4432( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LIMITE3_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLimite3_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound432 != 0 )
               {
                  if ( nRcdDeleted_432 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyX4432( ) ;
                     loadX4432( ) ;
                     beforeValidateX4432( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsX4432( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_432 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateX4432( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableX4432( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsX4432( ) ;
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
                  if ( nRcdDeleted_432 == 0 )
                  {
                     GXCCtl = "LIMITE3_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLimite3_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_432_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLimite3_Internalname, GXutil.ltrim( localUtil.ntoc( A2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrecio3_Internalname, GXutil.ltrim( localUtil.ntoc( A2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPorBon3_Internalname, GXutil.ltrim( localUtil.ntoc( A5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2935Limite3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2936Precio3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5043PorBon3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_432 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_432_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_432_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIMITE3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtLimite3_Title)) ;
            httpContext.changePostValue( "LIMITE3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLimite3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRECIO3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtPrecio3_Title)) ;
            httpContext.changePostValue( "PRECIO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrecio3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PORBON3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorBon3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionX40( )
   {
   }

   public void e11X42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1341_", ""), (byte)(99), GXv_char2) ;
      ttaruni_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV18Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      ttaruni_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit0", AV18Lit0);
      GXt_char1 = AV19Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      ttaruni_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit1", AV19Lit1);
      AV20Lit2 = httpContext.getMessage( "TARIFA UNICA CLIENTES", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit2", AV20Lit2);
      AV21Lit3 = httpContext.getMessage( "Tipo Tarifa", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit3", AV21Lit3);
      GXt_char1 = AV22Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1209_", ""), (byte)(99), GXv_char2) ;
      ttaruni_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit4", AV22Lit4);
      AV23Lit5 = httpContext.getMessage( "<= a", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit5", AV23Lit5);
      AV24Lit6 = httpContext.getMessage( "Precio", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit6", AV24Lit6);
      GXt_char1 = AV25LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      ttaruni_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25LitFe", AV25LitFe);
      AV27Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttaruni_impl.this.A396EmprCod = GXv_char2[0] ;
      ttaruni_impl.this.A407EmprNom = GXv_char3[0] ;
      ttaruni_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV29CliGen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29CliGen", GXutil.str( AV29CliGen, 1, 0));
   }

   public void zmX4431( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2934RecTipDsc = T00X45_A2934RecTipDsc[0] ;
         }
         else
         {
            Z2934RecTipDsc = A2934RecTipDsc ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z2933RecTipCon = A2933RecTipCon ;
         Z2934RecTipDsc = A2934RecTipDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtLimite3_Title = AV23Lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Title", edtLimite3_Title, !bGXsfl_50_Refreshing);
      edtPrecio3_Title = AV24Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrecio3_Internalname, "Title", edtPrecio3_Title, !bGXsfl_50_Refreshing);
      /* Using cursor T00X46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
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
      if ( isIns( )  && (0==A2933RecTipCon) && ( Gx_BScreen == 0 ) )
      {
         A2933RecTipCon = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void loadX4431( )
   {
      /* Using cursor T00X48 */
      pr_default.execute(6, new Object[] {Short.valueOf(A2933RecTipCon), A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound431 = (short)(1) ;
         A279CliNom = T00X48_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A2934RecTipDsc = T00X48_A2934RecTipDsc[0] ;
         n2934RecTipDsc = T00X48_n2934RecTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
         zmX4431( -10) ;
      }
      pr_default.close(6);
      onLoadActionsX4431( ) ;
   }

   public void onLoadActionsX4431( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTableX4431( )
   {
      nIsDirty_431 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T00X47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00X47_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      if ( true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A2933RecTipCon ;
         GXv_char3[0] = A2934RecTipDsc ;
         GXv_int6[0] = AV28FlagCon ;
         new app.pbustco(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
         ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
         ttaruni_impl.this.A2933RecTipCon = GXv_int5[0] ;
         ttaruni_impl.this.A2934RecTipDsc = GXv_char3[0] ;
         ttaruni_impl.this.AV28FlagCon = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.str( AV28FlagCon, 1, 0));
      }
      if ( true /* After */ && isIns( )  && (0==AV28FlagCon) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Tipo Tarifa", ""), 1, "RECTIPCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecTipCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A2933RecTipCon != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Tarifa Erronea. Solo se acepta Tipo = 0", ""), 1, "RECTIPCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecTipCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsX4431( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00X49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00X49_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyX4431( )
   {
      /* Using cursor T00X410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound431 = (short)(1) ;
      }
      else
      {
         RcdFound431 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00X45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00X45_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmX4431( 10) ;
         RcdFound431 = (short)(1) ;
         A2933RecTipCon = T00X45_A2933RecTipCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         A2934RecTipDsc = T00X45_A2934RecTipDsc[0] ;
         n2934RecTipDsc = T00X45_n2934RecTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
         A252CliCod = T00X45_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2933RecTipCon = A2933RecTipCon ;
         sMode431 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadX4431( ) ;
         if ( AnyError == 1 )
         {
            RcdFound431 = (short)(0) ;
            initializeNonKeyX4431( ) ;
         }
         Gx_mode = sMode431 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound431 = (short)(0) ;
         initializeNonKeyX4431( ) ;
         sMode431 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode431 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyX4431( ) ;
      if ( RcdFound431 == 0 )
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
      RcdFound431 = (short)(0) ;
      /* Using cursor T00X411 */
      pr_default.execute(9, new Object[] {Short.valueOf(A2933RecTipCon), Short.valueOf(A2933RecTipCon), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00X411_A2933RecTipCon[0] < A2933RecTipCon ) || ( T00X411_A2933RecTipCon[0] == A2933RecTipCon ) && ( T00X411_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00X411_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00X411_A2933RecTipCon[0] > A2933RecTipCon ) || ( T00X411_A2933RecTipCon[0] == A2933RecTipCon ) && ( T00X411_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00X411_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2933RecTipCon = T00X411_A2933RecTipCon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
            A252CliCod = T00X411_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound431 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound431 = (short)(0) ;
      /* Using cursor T00X412 */
      pr_default.execute(10, new Object[] {Short.valueOf(A2933RecTipCon), Short.valueOf(A2933RecTipCon), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00X412_A2933RecTipCon[0] > A2933RecTipCon ) || ( T00X412_A2933RecTipCon[0] == A2933RecTipCon ) && ( T00X412_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00X412_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00X412_A2933RecTipCon[0] < A2933RecTipCon ) || ( T00X412_A2933RecTipCon[0] == A2933RecTipCon ) && ( T00X412_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00X412_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2933RecTipCon = T00X412_A2933RecTipCon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
            A252CliCod = T00X412_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound431 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyX4431( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertX4431( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound431 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A2933RecTipCon != Z2933RecTipCon ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2933RecTipCon = Z2933RecTipCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateX4431( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A2933RecTipCon != Z2933RecTipCon ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertX4431( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertX4431( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A2933RecTipCon != Z2933RecTipCon ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2933RecTipCon = Z2933RecTipCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKeyX4431( ) ;
      if ( RcdFound431 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A2933RecTipCon != Z2933RecTipCon ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2933RecTipCon = Z2933RecTipCon ;
            httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A2933RecTipCon != Z2933RecTipCon ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaruni");
      GX_FocusControl = edtRecTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_X40( ) ;
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
      if ( RcdFound431 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartX4431( ) ;
      if ( RcdFound431 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndX4431( ) ;
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
      if ( RcdFound431 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecTipDsc_Internalname ;
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
      if ( RcdFound431 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecTipDsc_Internalname ;
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
      scanStartX4431( ) ;
      if ( RcdFound431 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound431 != 0 )
         {
            scanNextX4431( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndX4431( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyX4431( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00X44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECON"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z2934RecTipDsc, T00X44_A2934RecTipDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2934RecTipDsc, T00X44_A2934RecTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("ttaruni:[seudo value changed for attri]"+"RecTipDsc");
               GXutil.writeLogRaw("Old: ",Z2934RecTipDsc);
               GXutil.writeLogRaw("Current: ",T00X44_A2934RecTipDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRECON"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertX4431( )
   {
      beforeValidateX4431( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX4431( ) ;
      }
      if ( AnyError == 0 )
      {
         zmX4431( 0) ;
         checkOptimisticConcurrencyX4431( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX4431( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertX4431( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X413 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A2933RecTipCon), Boolean.valueOf(n2934RecTipDsc), A2934RecTipDsc, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECON");
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
                        processLevelX4431( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionX40( ) ;
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
            loadX4431( ) ;
         }
         endLevelX4431( ) ;
      }
      closeExtendedTableCursorsX4431( ) ;
   }

   public void updateX4431( )
   {
      beforeValidateX4431( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX4431( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX4431( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX4431( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateX4431( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X414 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n2934RecTipDsc), A2934RecTipDsc, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECON");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECON"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateX4431( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelX4431( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionX40( ) ;
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
         endLevelX4431( ) ;
      }
      closeExtendedTableCursorsX4431( ) ;
   }

   public void deferredUpdateX4431( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateX4431( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX4431( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsX4431( ) ;
         afterConfirmX4431( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteX4431( ) ;
            if ( AnyError == 0 )
            {
               scanStartX4432( ) ;
               while ( RcdFound432 != 0 )
               {
                  getByPrimaryKeyX4432( ) ;
                  deleteX4432( ) ;
                  scanNextX4432( ) ;
               }
               scanEndX4432( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X415 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECON");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound431 == 0 )
                        {
                           initAllX4431( ) ;
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
                        resetCaptionX40( ) ;
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
      sMode431 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelX4431( ) ;
      Gx_mode = sMode431 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsX4431( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && isIns( )  )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A2933RecTipCon ;
            GXv_char3[0] = A2934RecTipDsc ;
            GXv_int6[0] = AV28FlagCon ;
            new app.pbustco(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
            ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
            ttaruni_impl.this.A2933RecTipCon = GXv_int5[0] ;
            ttaruni_impl.this.A2934RecTipDsc = GXv_char3[0] ;
            ttaruni_impl.this.AV28FlagCon = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
            httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.str( AV28FlagCon, 1, 0));
         }
         if ( true /* After */ && isIns( )  && (0==AV28FlagCon) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Tipo Tarifa", ""), 1, "RECTIPCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecTipCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T00X416 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T00X416_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevelX4432( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowX4432( ) ;
         if ( ( nRcdExists_432 != 0 ) || ( nIsMod_432 != 0 ) )
         {
            standaloneNotModalX4432( ) ;
            getKeyX4432( ) ;
            if ( ( nRcdExists_432 == 0 ) && ( nRcdDeleted_432 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertX4432( ) ;
            }
            else
            {
               if ( RcdFound432 != 0 )
               {
                  if ( ( nRcdDeleted_432 != 0 ) && ( nRcdExists_432 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteX4432( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_432 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateX4432( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_432 == 0 )
                  {
                     GXCCtl = "LIMITE3_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLimite3_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_432_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLimite3_Internalname, GXutil.ltrim( localUtil.ntoc( A2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrecio3_Internalname, GXutil.ltrim( localUtil.ntoc( A2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPorBon3_Internalname, GXutil.ltrim( localUtil.ntoc( A5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2935Limite3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2936Precio3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5043PorBon3_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_432_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_432 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_432_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_432_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIMITE3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtLimite3_Title)) ;
            httpContext.changePostValue( "LIMITE3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLimite3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRECIO3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtPrecio3_Title)) ;
            httpContext.changePostValue( "PRECIO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrecio3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PORBON3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorBon3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllX4432( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_432 = (short)(0) ;
      nIsMod_432 = (short)(0) ;
      nRcdDeleted_432 = (short)(0) ;
   }

   public void processLevelX4431( )
   {
      /* Save parent mode. */
      sMode431 = Gx_mode ;
      processNestedLevelX4432( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode431 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelX4431( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteX4431( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttaruni");
         if ( AnyError == 0 )
         {
            confirmValuesX40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaruni");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartX4431( )
   {
      /* Scan By routine */
      /* Using cursor T00X417 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound431 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound431 = (short)(1) ;
         A252CliCod = T00X417_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2933RecTipCon = T00X417_A2933RecTipCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextX4431( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound431 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound431 = (short)(1) ;
         A252CliCod = T00X417_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2933RecTipCon = T00X417_A2933RecTipCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
      }
   }

   public void scanEndX4431( )
   {
      pr_default.close(15);
   }

   public void afterConfirmX4431( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertX4431( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateX4431( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteX4431( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteX4431( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateX4431( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesX4431( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtRecTipCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTipCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTipCon_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtRecTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTipDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmX4432( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2936Precio3 = T00X43_A2936Precio3[0] ;
            Z5043PorBon3 = T00X43_A5043PorBon3[0] ;
         }
         else
         {
            Z2936Precio3 = A2936Precio3 ;
            Z5043PorBon3 = A5043PorBon3 ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z252CliCod = A252CliCod ;
         Z2933RecTipCon = A2933RecTipCon ;
         Z2935Limite3 = A2935Limite3 ;
         Z2936Precio3 = A2936Precio3 ;
         Z5043PorBon3 = A5043PorBon3 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalX4432( )
   {
   }

   public void standaloneModalX4432( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV31Op = httpContext.getMessage( httpContext.getMessage( "A", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV31Op = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV31Op = httpContext.getMessage( httpContext.getMessage( "B", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLimite3_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLimite3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtLimite3_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLimite3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void loadX4432( )
   {
      /* Using cursor T00X418 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound432 = (short)(1) ;
         A2936Precio3 = T00X418_A2936Precio3[0] ;
         n2936Precio3 = T00X418_n2936Precio3[0] ;
         A5043PorBon3 = T00X418_A5043PorBon3[0] ;
         n5043PorBon3 = T00X418_n5043PorBon3[0] ;
         zmX4432( -13) ;
      }
      pr_default.close(16);
      onLoadActionsX4432( ) ;
   }

   public void onLoadActionsX4432( )
   {
   }

   public void checkExtendedTableX4432( )
   {
      nIsDirty_432 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalX4432( ) ;
   }

   public void closeExtendedTableCursorsX4432( )
   {
   }

   public void enableDisableX4432( )
   {
   }

   public void getKeyX4432( )
   {
      /* Using cursor T00X419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound432 = (short)(1) ;
      }
      else
      {
         RcdFound432 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyX4432( )
   {
      /* Using cursor T00X43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00X43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmX4432( 13) ;
         RcdFound432 = (short)(1) ;
         initializeNonKeyX4432( ) ;
         A2935Limite3 = T00X43_A2935Limite3[0] ;
         A2936Precio3 = T00X43_A2936Precio3[0] ;
         n2936Precio3 = T00X43_n2936Precio3[0] ;
         A5043PorBon3 = T00X43_A5043PorBon3[0] ;
         n5043PorBon3 = T00X43_n5043PorBon3[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2933RecTipCon = A2933RecTipCon ;
         Z2935Limite3 = A2935Limite3 ;
         sMode432 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalX4432( ) ;
         loadX4432( ) ;
         Gx_mode = sMode432 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound432 = (short)(0) ;
         initializeNonKeyX4432( ) ;
         sMode432 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalX4432( ) ;
         Gx_mode = sMode432 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesX4432( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyX4432( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00X42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECON"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2936Precio3, T00X42_A2936Precio3[0]) != 0 ) || ( DecimalUtil.compareTo(Z5043PorBon3, T00X42_A5043PorBon3[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2936Precio3, T00X42_A2936Precio3[0]) != 0 )
            {
               GXutil.writeLogln("ttaruni:[seudo value changed for attri]"+"Precio3");
               GXutil.writeLogRaw("Old: ",Z2936Precio3);
               GXutil.writeLogRaw("Current: ",T00X42_A2936Precio3[0]);
            }
            if ( DecimalUtil.compareTo(Z5043PorBon3, T00X42_A5043PorBon3[0]) != 0 )
            {
               GXutil.writeLogln("ttaruni:[seudo value changed for attri]"+"PorBon3");
               GXutil.writeLogRaw("Old: ",Z5043PorBon3);
               GXutil.writeLogRaw("Current: ",T00X42_A5043PorBon3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRECON"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertX4432( )
   {
      beforeValidateX4432( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX4432( ) ;
      }
      if ( AnyError == 0 )
      {
         zmX4432( 0) ;
         checkOptimisticConcurrencyX4432( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmX4432( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertX4432( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00X420 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3), Boolean.valueOf(n2936Precio3), A2936Precio3, Boolean.valueOf(n5043PorBon3), A5043PorBon3, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ && ( AV29CliGen == 1 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int7[0] = A252CliCod ;
                        GXv_int5[0] = A2933RecTipCon ;
                        GXv_int8[0] = A2935Limite3 ;
                        GXv_char3[0] = AV31Op ;
                        new app.ptaruni(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int5, GXv_int8, GXv_char3) ;
                        ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttaruni_impl.this.A252CliCod = GXv_int7[0] ;
                        ttaruni_impl.this.A2933RecTipCon = GXv_int5[0] ;
                        ttaruni_impl.this.A2935Limite3 = GXv_int8[0] ;
                        ttaruni_impl.this.AV31Op = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
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
            loadX4432( ) ;
         }
         endLevelX4432( ) ;
      }
      closeExtendedTableCursorsX4432( ) ;
   }

   public void updateX4432( )
   {
      beforeValidateX4432( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableX4432( ) ;
      }
      if ( ( nIsMod_432 != 0 ) || ( nIsDirty_432 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyX4432( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmX4432( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateX4432( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00X421 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n2936Precio3), A2936Precio3, Boolean.valueOf(n5043PorBon3), A5043PorBon3, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECON"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateX4432( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ && ( AV29CliGen == 1 ) )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int7[0] = A252CliCod ;
                           GXv_int8[0] = A2933RecTipCon ;
                           GXv_int5[0] = A2935Limite3 ;
                           GXv_char3[0] = AV31Op ;
                           new app.ptaruni(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int5, GXv_char3) ;
                           ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
                           ttaruni_impl.this.A252CliCod = GXv_int7[0] ;
                           ttaruni_impl.this.A2933RecTipCon = GXv_int8[0] ;
                           ttaruni_impl.this.A2935Limite3 = GXv_int5[0] ;
                           ttaruni_impl.this.AV31Op = GXv_char3[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyX4432( ) ;
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
            endLevelX4432( ) ;
         }
      }
      closeExtendedTableCursorsX4432( ) ;
   }

   public void deferredUpdateX4432( )
   {
   }

   public void deleteX4432( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateX4432( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyX4432( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsX4432( ) ;
         afterConfirmX4432( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteX4432( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00X422 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ && ( AV29CliGen == 1 ) )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int7[0] = A252CliCod ;
                     GXv_int8[0] = A2933RecTipCon ;
                     GXv_int5[0] = A2935Limite3 ;
                     GXv_char3[0] = AV31Op ;
                     new app.ptaruni(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int5, GXv_char3) ;
                     ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
                     ttaruni_impl.this.A252CliCod = GXv_int7[0] ;
                     ttaruni_impl.this.A2933RecTipCon = GXv_int8[0] ;
                     ttaruni_impl.this.A2935Limite3 = GXv_int5[0] ;
                     ttaruni_impl.this.AV31Op = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
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
      sMode432 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelX4432( ) ;
      Gx_mode = sMode432 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsX4432( )
   {
      standaloneModalX4432( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelX4432( )
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

   public void scanStartX4432( )
   {
      /* Scan By routine */
      /* Using cursor T00X423 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon)});
      RcdFound432 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound432 = (short)(1) ;
         A2935Limite3 = T00X423_A2935Limite3[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextX4432( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound432 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound432 = (short)(1) ;
         A2935Limite3 = T00X423_A2935Limite3[0] ;
      }
   }

   public void scanEndX4432( )
   {
      pr_default.close(21);
   }

   public void afterConfirmX4432( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertX4432( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateX4432( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteX4432( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteX4432( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateX4432( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesX4432( )
   {
      edtLimite3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLimite3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPrecio3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrecio3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrecio3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPorBon3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPorBon3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorBon3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashesX4432( )
   {
   }

   public void send_integrity_lvl_hashesX4431( )
   {
   }

   public void subsflControlProps_50432( )
   {
      edtavnRcdDeleted_432_Internalname = "vNRCDDELETED_432_"+sGXsfl_50_idx ;
      edtLimite3_Internalname = "LIMITE3_"+sGXsfl_50_idx ;
      edtPrecio3_Internalname = "PRECIO3_"+sGXsfl_50_idx ;
      edtPorBon3_Internalname = "PORBON3_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50432( )
   {
      edtavnRcdDeleted_432_Internalname = "vNRCDDELETED_432_"+sGXsfl_50_fel_idx ;
      edtLimite3_Internalname = "LIMITE3_"+sGXsfl_50_fel_idx ;
      edtPrecio3_Internalname = "PRECIO3_"+sGXsfl_50_fel_idx ;
      edtPorBon3_Internalname = "PORBON3_"+sGXsfl_50_fel_idx ;
   }

   public void addRowX4432( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50432( ) ;
      sendRowX4432( ) ;
   }

   public void sendRowX4432( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_432_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_432_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_432_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_432), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_432), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_432_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_432_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_432_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLimite3_Internalname,GXutil.ltrim( localUtil.ntoc( A2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2935Limite3), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLimite3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLimite3_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_432_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrecio3_Internalname,GXutil.ltrim( localUtil.ntoc( A2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrecio3_Enabled!=0) ? localUtil.format( A2936Precio3, "ZZZZ9.999") : localUtil.format( A2936Precio3, "ZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrecio3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrecio3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_432_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPorBon3_Internalname,GXutil.ltrim( localUtil.ntoc( A5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPorBon3_Enabled!=0) ? localUtil.format( A5043PorBon3, "ZZ9.99") : localUtil.format( A5043PorBon3, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPorBon3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPorBon3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesX4432( ) ;
      GXCCtl = "Z2935Limite3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2935Limite3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2936Precio3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2936Precio3, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5043PorBon3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5043PorBon3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_432_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_432_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_432_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_432, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "OP_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31Op));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_432_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_432_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LIMITE3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtLimite3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "LIMITE3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLimite3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRECIO3_"+sGXsfl_50_idx+"Title", GXutil.rtrim( edtPrecio3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PRECIO3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrecio3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PORBON3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPorBon3_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowX4432( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50432( ) ;
      edtavnRcdDeleted_432_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_432_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLimite3_Title = httpContext.cgiGet( "LIMITE3_"+sGXsfl_50_idx+"Title") ;
      edtLimite3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIMITE3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrecio3_Title = httpContext.cgiGet( "PRECIO3_"+sGXsfl_50_idx+"Title") ;
      edtPrecio3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRECIO3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPorBon3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PORBON3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_432_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_432_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_432");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_432_Internalname ;
         wbErr = true ;
         nRcdDeleted_432 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_432 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_432_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLimite3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLimite3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LIMITE3_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLimite3_Internalname ;
         wbErr = true ;
         A2935Limite3 = (short)(0) ;
      }
      else
      {
         A2935Limite3 = (short)(localUtil.ctol( httpContext.cgiGet( edtLimite3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecio3_Internalname)), DecimalUtil.stringToDec("-9999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrecio3_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "PRECIO3_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrecio3_Internalname ;
         wbErr = true ;
         A2936Precio3 = DecimalUtil.ZERO ;
         n2936Precio3 = false ;
      }
      else
      {
         A2936Precio3 = localUtil.ctond( httpContext.cgiGet( edtPrecio3_Internalname)) ;
         n2936Precio3 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPorBon3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPorBon3_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PORBON3_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPorBon3_Internalname ;
         wbErr = true ;
         A5043PorBon3 = DecimalUtil.ZERO ;
         n5043PorBon3 = false ;
      }
      else
      {
         A5043PorBon3 = localUtil.ctond( httpContext.cgiGet( edtPorBon3_Internalname)) ;
         n5043PorBon3 = false ;
      }
      GXCCtl = "Z2935Limite3_" + sGXsfl_50_idx ;
      Z2935Limite3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2936Precio3_" + sGXsfl_50_idx ;
      Z2936Precio3 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5043PorBon3_" + sGXsfl_50_idx ;
      Z5043PorBon3 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_432_" + sGXsfl_50_idx ;
      nRcdDeleted_432 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_432_" + sGXsfl_50_idx ;
      nRcdExists_432 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_432_" + sGXsfl_50_idx ;
      nIsMod_432 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "OP_" + sGXsfl_50_idx ;
      AV31Op = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtLimite3_Enabled = edtLimite3_Enabled ;
   }

   public void confirmValuesX40( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50432( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50432( ) ;
         httpContext.changePostValue( "Z2935Limite3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2935Limite3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2935Limite3_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2936Precio3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2936Precio3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2936Precio3_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5043PorBon3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5043PorBon3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5043PorBon3_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttaruni", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2933RecTipCon", GXutil.ltrim( localUtil.ntoc( Z2933RecTipCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2934RecTipDsc", GXutil.rtrim( Z2934RecTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT5", GXutil.rtrim( AV23Lit5));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT6", GXutil.rtrim( AV24Lit6));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCON", GXutil.ltrim( localUtil.ntoc( AV28FlagCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOP", GXutil.rtrim( AV31Op));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIGEN", GXutil.ltrim( localUtil.ntoc( AV29CliGen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttaruni", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTARUNI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TARIFA UNICA - Cliente Std", "") ;
   }

   public void initializeNonKeyX4431( )
   {
      AV28FlagCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.str( AV28FlagCon, 1, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A2934RecTipDsc = "" ;
      n2934RecTipDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
      Z2934RecTipDsc = "" ;
   }

   public void initAllX4431( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A2933RecTipCon = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
      initializeNonKeyX4431( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyX4432( )
   {
      AV31Op = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
      A2936Precio3 = DecimalUtil.ZERO ;
      n2936Precio3 = false ;
      A5043PorBon3 = DecimalUtil.ZERO ;
      n5043PorBon3 = false ;
      Z2936Precio3 = DecimalUtil.ZERO ;
      Z5043PorBon3 = DecimalUtil.ZERO ;
   }

   public void initAllX4432( )
   {
      A2935Limite3 = (short)(0) ;
      initializeNonKeyX4432( ) ;
   }

   public void standaloneModalInsertX4432( )
   {
      AV31Op = iV31Op ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531542", true, true);
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
      httpContext.AddJavascriptSource("ttaruni.js", "?20268241531542", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties432( )
   {
      edtLimite3_Enabled = defedtLimite3_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLimite3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLimite3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_432, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_432_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2935Limite3, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtLimite3_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLimite3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2936Precio3, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtPrecio3_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrecio3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5043PorBon3, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPorBon3_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtRecTipCon_Internalname = "RECTIPCON" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRecTipDsc_Internalname = "RECTIPDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_432_Internalname = "vNRCDDELETED_432" ;
      edtLimite3_Internalname = "LIMITE3" ;
      edtPrecio3_Internalname = "PRECIO3" ;
      edtPorBon3_Internalname = "PORBON3" ;
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
      Form.setCaption( httpContext.getMessage( "TARIFA UNICA - Cliente Std", "") );
      edtPorBon3_Jsonclick = "" ;
      edtPrecio3_Jsonclick = "" ;
      edtLimite3_Jsonclick = "" ;
      edtavnRcdDeleted_432_Jsonclick = "" ;
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
      edtPorBon3_Enabled = 1 ;
      edtPrecio3_Enabled = 1 ;
      edtPrecio3_Title = httpContext.getMessage( "Precio", "") ;
      edtLimite3_Enabled = 1 ;
      edtLimite3_Title = httpContext.getMessage( "Limite", "") ;
      edtavnRcdDeleted_432_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtRecTipDsc_Jsonclick = "" ;
      edtRecTipDsc_Backcolor = (int)(0xFFFFFF) ;
      edtRecTipDsc_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRecTipCon_Jsonclick = "" ;
      edtRecTipCon_Backcolor = (int)(0xFFFFFF) ;
      edtRecTipCon_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void xc_5_X4431( String Gx_mode ,
                           String A396EmprCod ,
                           short A2933RecTipCon ,
                           String A2934RecTipDsc ,
                           byte AV28FlagCon )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A2933RecTipCon ;
         GXv_char3[0] = A2934RecTipDsc ;
         GXv_int6[0] = AV28FlagCon ;
         new app.pbustco(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A2933RecTipCon = GXv_int8[0] ;
         A2934RecTipDsc = GXv_char3[0] ;
         AV28FlagCon = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", A2934RecTipDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.str( AV28FlagCon, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2933RecTipCon, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2934RecTipDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28FlagCon, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_9_X4432( String A396EmprCod ,
                           int A252CliCod ,
                           short A2933RecTipCon ,
                           short A2935Limite3 ,
                           String AV31Op ,
                           byte AV29CliGen )
   {
      if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ && ( AV29CliGen == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_int8[0] = A2933RecTipCon ;
         GXv_int5[0] = A2935Limite3 ;
         GXv_char3[0] = AV31Op ;
         new app.ptaruni(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int5, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int7[0] ;
         A2933RecTipCon = GXv_int8[0] ;
         A2935Limite3 = GXv_int5[0] ;
         AV31Op = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2933RecTipCon), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Op", AV31Op);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2933RecTipCon, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2935Limite3, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV31Op))+"\"") ;
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
      subsflControlProps_50432( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalX4432( ) ;
         standaloneModalX4432( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowX4432( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50432( ) ;
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
      /* Using cursor T00X424 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00X424_A407EmprNom[0] ;
      n407EmprNom = T00X424_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T00X416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00X416_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(14);
      GX_FocusControl = edtRecTipDsc_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T00X416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T00X416_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Rectipcon( )
   {
      n2934RecTipDsc = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A2933RecTipCon ;
         GXv_char3[0] = A2934RecTipDsc ;
         GXv_int6[0] = AV28FlagCon ;
         new app.pbustco(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6) ;
         ttaruni_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttaruni_impl.this.A2933RecTipCon = GXv_int8[0] ;
         A2933RecTipCon = this.A2933RecTipCon ;
         ttaruni_impl.this.A2934RecTipDsc = GXv_char3[0] ;
         A2934RecTipDsc = this.A2934RecTipDsc ;
         ttaruni_impl.this.AV28FlagCon = GXv_int6[0] ;
         AV28FlagCon = this.AV28FlagCon ;
      }
      if ( true /* After */ && isIns( )  && (0==AV28FlagCon) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Tipo Tarifa", ""), 1, "RECTIPCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecTipCon_Internalname ;
      }
      if ( A2933RecTipCon != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Tarifa Erronea. Solo se acepta Tipo = 0", ""), 1, "RECTIPCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecTipCon_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2933RecTipCon", GXutil.ltrim( localUtil.ntoc( Z2933RecTipCon, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2934RecTipDsc", GXutil.rtrim( Z2934RecTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV28FlagCon", GXutil.ltrim( localUtil.ntoc( ZV28FlagCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2933RecTipCon", GXutil.ltrim( localUtil.ntoc( A2933RecTipCon, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2934RecTipDsc", GXutil.rtrim( A2934RecTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCon", GXutil.ltrim( localUtil.ntoc( AV28FlagCon, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_RECTIPCON","{handler:'valid_Rectipcon',iparms:[{av:'A2934RecTipDsc',fld:'RECTIPDSC',pic:''},{av:'AV29CliGen',fld:'vCLIGEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2933RecTipCon',fld:'RECTIPCON',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV23Lit5',fld:'vLIT5',pic:''},{av:'AV24Lit6',fld:'vLIT6',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV28FlagCon',fld:'vFLAGCON',pic:'9'}]");
      setEventMetadata("VALID_RECTIPCON",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z2933RecTipCon'},{av:'Z2934RecTipDsc'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{av:'ZV28FlagCon'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2933RecTipCon',fld:'RECTIPCON',pic:'ZZZ9'},{av:'A2934RecTipDsc',fld:'RECTIPDSC',pic:''},{av:'AV28FlagCon',fld:'vFLAGCON',pic:'9'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LIMITE3","{handler:'valid_Limite3',iparms:[]");
      setEventMetadata("VALID_LIMITE3",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Porbon3',iparms:[]");
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
      pr_default.close(14);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2934RecTipDsc = "" ;
      Z2936Precio3 = DecimalUtil.ZERO ;
      Z5043PorBon3 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2934RecTipDsc = "" ;
      AV31Op = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode432 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode431 = "" ;
      GXCCtl = "" ;
      A2936Precio3 = DecimalUtil.ZERO ;
      A5043PorBon3 = DecimalUtil.ZERO ;
      AV26Lit7 = "" ;
      AV18Lit0 = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV21Lit3 = "" ;
      AV22Lit4 = "" ;
      AV25LitFe = "" ;
      GXt_char1 = "" ;
      AV27Station = "" ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00X46_A407EmprNom = new String[] {""} ;
      T00X46_n407EmprNom = new boolean[] {false} ;
      T00X48_A407EmprNom = new String[] {""} ;
      T00X48_n407EmprNom = new boolean[] {false} ;
      T00X48_A2933RecTipCon = new short[1] ;
      T00X48_A279CliNom = new String[] {""} ;
      T00X48_A2934RecTipDsc = new String[] {""} ;
      T00X48_n2934RecTipDsc = new boolean[] {false} ;
      T00X48_A396EmprCod = new String[] {""} ;
      T00X48_A252CliCod = new int[1] ;
      T00X47_A279CliNom = new String[] {""} ;
      T00X49_A279CliNom = new String[] {""} ;
      T00X410_A396EmprCod = new String[] {""} ;
      T00X410_A252CliCod = new int[1] ;
      T00X410_A2933RecTipCon = new short[1] ;
      T00X45_A2933RecTipCon = new short[1] ;
      T00X45_A2934RecTipDsc = new String[] {""} ;
      T00X45_n2934RecTipDsc = new boolean[] {false} ;
      T00X45_A396EmprCod = new String[] {""} ;
      T00X45_A252CliCod = new int[1] ;
      T00X411_A2933RecTipCon = new short[1] ;
      T00X411_A396EmprCod = new String[] {""} ;
      T00X411_A252CliCod = new int[1] ;
      T00X412_A2933RecTipCon = new short[1] ;
      T00X412_A396EmprCod = new String[] {""} ;
      T00X412_A252CliCod = new int[1] ;
      T00X44_A2933RecTipCon = new short[1] ;
      T00X44_A2934RecTipDsc = new String[] {""} ;
      T00X44_n2934RecTipDsc = new boolean[] {false} ;
      T00X44_A396EmprCod = new String[] {""} ;
      T00X44_A252CliCod = new int[1] ;
      T00X416_A279CliNom = new String[] {""} ;
      T00X417_A396EmprCod = new String[] {""} ;
      T00X417_A252CliCod = new int[1] ;
      T00X417_A2933RecTipCon = new short[1] ;
      T00X418_A252CliCod = new int[1] ;
      T00X418_A2933RecTipCon = new short[1] ;
      T00X418_A2935Limite3 = new short[1] ;
      T00X418_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X418_n2936Precio3 = new boolean[] {false} ;
      T00X418_A5043PorBon3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X418_n5043PorBon3 = new boolean[] {false} ;
      T00X418_A396EmprCod = new String[] {""} ;
      T00X419_A396EmprCod = new String[] {""} ;
      T00X419_A252CliCod = new int[1] ;
      T00X419_A2933RecTipCon = new short[1] ;
      T00X419_A2935Limite3 = new short[1] ;
      T00X43_A252CliCod = new int[1] ;
      T00X43_A2933RecTipCon = new short[1] ;
      T00X43_A2935Limite3 = new short[1] ;
      T00X43_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X43_n2936Precio3 = new boolean[] {false} ;
      T00X43_A5043PorBon3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X43_n5043PorBon3 = new boolean[] {false} ;
      T00X43_A396EmprCod = new String[] {""} ;
      T00X42_A252CliCod = new int[1] ;
      T00X42_A2933RecTipCon = new short[1] ;
      T00X42_A2935Limite3 = new short[1] ;
      T00X42_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X42_n2936Precio3 = new boolean[] {false} ;
      T00X42_A5043PorBon3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00X42_n5043PorBon3 = new boolean[] {false} ;
      T00X42_A396EmprCod = new String[] {""} ;
      T00X423_A396EmprCod = new String[] {""} ;
      T00X423_A252CliCod = new int[1] ;
      T00X423_A2933RecTipCon = new short[1] ;
      T00X423_A2935Limite3 = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV31Op = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int7 = new int[1] ;
      GXv_int5 = new short[1] ;
      T00X424_A407EmprNom = new String[] {""} ;
      T00X424_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      ZZ396EmprCod = "" ;
      ZZ2934RecTipDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttaruni__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttaruni__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttaruni__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttaruni__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttaruni__default(),
         new Object[] {
             new Object[] {
            T00X42_A252CliCod, T00X42_A2933RecTipCon, T00X42_A2935Limite3, T00X42_A2936Precio3, T00X42_n2936Precio3, T00X42_A5043PorBon3, T00X42_n5043PorBon3, T00X42_A396EmprCod
            }
            , new Object[] {
            T00X43_A252CliCod, T00X43_A2933RecTipCon, T00X43_A2935Limite3, T00X43_A2936Precio3, T00X43_n2936Precio3, T00X43_A5043PorBon3, T00X43_n5043PorBon3, T00X43_A396EmprCod
            }
            , new Object[] {
            T00X44_A2933RecTipCon, T00X44_A2934RecTipDsc, T00X44_n2934RecTipDsc, T00X44_A396EmprCod, T00X44_A252CliCod
            }
            , new Object[] {
            T00X45_A2933RecTipCon, T00X45_A2934RecTipDsc, T00X45_n2934RecTipDsc, T00X45_A396EmprCod, T00X45_A252CliCod
            }
            , new Object[] {
            T00X46_A407EmprNom, T00X46_n407EmprNom
            }
            , new Object[] {
            T00X47_A279CliNom
            }
            , new Object[] {
            T00X48_A407EmprNom, T00X48_n407EmprNom, T00X48_A2933RecTipCon, T00X48_A279CliNom, T00X48_A2934RecTipDsc, T00X48_n2934RecTipDsc, T00X48_A396EmprCod, T00X48_A252CliCod
            }
            , new Object[] {
            T00X49_A279CliNom
            }
            , new Object[] {
            T00X410_A396EmprCod, T00X410_A252CliCod, T00X410_A2933RecTipCon
            }
            , new Object[] {
            T00X411_A2933RecTipCon, T00X411_A396EmprCod, T00X411_A252CliCod
            }
            , new Object[] {
            T00X412_A2933RecTipCon, T00X412_A396EmprCod, T00X412_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00X416_A279CliNom
            }
            , new Object[] {
            T00X417_A396EmprCod, T00X417_A252CliCod, T00X417_A2933RecTipCon
            }
            , new Object[] {
            T00X418_A252CliCod, T00X418_A2933RecTipCon, T00X418_A2935Limite3, T00X418_A2936Precio3, T00X418_n2936Precio3, T00X418_A5043PorBon3, T00X418_n5043PorBon3, T00X418_A396EmprCod
            }
            , new Object[] {
            T00X419_A396EmprCod, T00X419_A252CliCod, T00X419_A2933RecTipCon, T00X419_A2935Limite3
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00X423_A396EmprCod, T00X423_A252CliCod, T00X423_A2933RecTipCon, T00X423_A2935Limite3
            }
            , new Object[] {
            T00X424_A407EmprNom, T00X424_n407EmprNom
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z2933RecTipCon = (short)(0) ;
      A2933RecTipCon = (short)(0) ;
   }

   private byte GxWebError ;
   private byte AV28FlagCon ;
   private byte AV29CliGen ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV28FlagCon ;
   private byte GXv_int6[] ;
   private byte ZZV28FlagCon ;
   private short Z2933RecTipCon ;
   private short Z2935Limite3 ;
   private short nRcdDeleted_432 ;
   private short nRcdExists_432 ;
   private short nIsMod_432 ;
   private short A2933RecTipCon ;
   private short A2935Limite3 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount432 ;
   private short RcdFound432 ;
   private short nBlankRcdUsr432 ;
   private short RcdFound431 ;
   private short nIsDirty_431 ;
   private short nIsDirty_432 ;
   private short GXv_int5[] ;
   private short GXv_int8[] ;
   private short ZZ2933RecTipCon ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtRecTipCon_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtRecTipDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_432_Enabled ;
   private int edtLimite3_Enabled ;
   private int edtPrecio3_Enabled ;
   private int edtPorBon3_Enabled ;
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
   private int defedtLimite3_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtRecTipDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtRecTipCon_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2936Precio3 ;
   private java.math.BigDecimal Z5043PorBon3 ;
   private java.math.BigDecimal A2936Precio3 ;
   private java.math.BigDecimal A5043PorBon3 ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2934RecTipDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A2934RecTipDsc ;
   private String AV31Op ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtRecTipCon_Internalname ;
   private String edtRecTipCon_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRecTipDsc_Internalname ;
   private String edtRecTipDsc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode432 ;
   private String edtavnRcdDeleted_432_Internalname ;
   private String edtLimite3_Title ;
   private String edtLimite3_Internalname ;
   private String edtPrecio3_Title ;
   private String edtPrecio3_Internalname ;
   private String edtPorBon3_Internalname ;
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
   private String AV17UsurCod ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode431 ;
   private String GXCCtl ;
   private String AV26Lit7 ;
   private String AV18Lit0 ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV21Lit3 ;
   private String AV22Lit4 ;
   private String AV25LitFe ;
   private String GXt_char1 ;
   private String AV27Station ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_432_Jsonclick ;
   private String edtLimite3_Jsonclick ;
   private String edtPrecio3_Jsonclick ;
   private String edtPorBon3_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV31Op ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZZ396EmprCod ;
   private String ZZ2934RecTipDsc ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2934RecTipDsc ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n2936Precio3 ;
   private boolean n5043PorBon3 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00X46_A407EmprNom ;
   private boolean[] T00X46_n407EmprNom ;
   private String[] T00X48_A407EmprNom ;
   private boolean[] T00X48_n407EmprNom ;
   private short[] T00X48_A2933RecTipCon ;
   private String[] T00X48_A279CliNom ;
   private String[] T00X48_A2934RecTipDsc ;
   private boolean[] T00X48_n2934RecTipDsc ;
   private String[] T00X48_A396EmprCod ;
   private int[] T00X48_A252CliCod ;
   private String[] T00X47_A279CliNom ;
   private String[] T00X49_A279CliNom ;
   private String[] T00X410_A396EmprCod ;
   private int[] T00X410_A252CliCod ;
   private short[] T00X410_A2933RecTipCon ;
   private short[] T00X45_A2933RecTipCon ;
   private String[] T00X45_A2934RecTipDsc ;
   private boolean[] T00X45_n2934RecTipDsc ;
   private String[] T00X45_A396EmprCod ;
   private int[] T00X45_A252CliCod ;
   private short[] T00X411_A2933RecTipCon ;
   private String[] T00X411_A396EmprCod ;
   private int[] T00X411_A252CliCod ;
   private short[] T00X412_A2933RecTipCon ;
   private String[] T00X412_A396EmprCod ;
   private int[] T00X412_A252CliCod ;
   private short[] T00X44_A2933RecTipCon ;
   private String[] T00X44_A2934RecTipDsc ;
   private boolean[] T00X44_n2934RecTipDsc ;
   private String[] T00X44_A396EmprCod ;
   private int[] T00X44_A252CliCod ;
   private String[] T00X416_A279CliNom ;
   private String[] T00X417_A396EmprCod ;
   private int[] T00X417_A252CliCod ;
   private short[] T00X417_A2933RecTipCon ;
   private int[] T00X418_A252CliCod ;
   private short[] T00X418_A2933RecTipCon ;
   private short[] T00X418_A2935Limite3 ;
   private java.math.BigDecimal[] T00X418_A2936Precio3 ;
   private boolean[] T00X418_n2936Precio3 ;
   private java.math.BigDecimal[] T00X418_A5043PorBon3 ;
   private boolean[] T00X418_n5043PorBon3 ;
   private String[] T00X418_A396EmprCod ;
   private String[] T00X419_A396EmprCod ;
   private int[] T00X419_A252CliCod ;
   private short[] T00X419_A2933RecTipCon ;
   private short[] T00X419_A2935Limite3 ;
   private int[] T00X43_A252CliCod ;
   private short[] T00X43_A2933RecTipCon ;
   private short[] T00X43_A2935Limite3 ;
   private java.math.BigDecimal[] T00X43_A2936Precio3 ;
   private boolean[] T00X43_n2936Precio3 ;
   private java.math.BigDecimal[] T00X43_A5043PorBon3 ;
   private boolean[] T00X43_n5043PorBon3 ;
   private String[] T00X43_A396EmprCod ;
   private int[] T00X42_A252CliCod ;
   private short[] T00X42_A2933RecTipCon ;
   private short[] T00X42_A2935Limite3 ;
   private java.math.BigDecimal[] T00X42_A2936Precio3 ;
   private boolean[] T00X42_n2936Precio3 ;
   private java.math.BigDecimal[] T00X42_A5043PorBon3 ;
   private boolean[] T00X42_n5043PorBon3 ;
   private String[] T00X42_A396EmprCod ;
   private String[] T00X423_A396EmprCod ;
   private int[] T00X423_A252CliCod ;
   private short[] T00X423_A2933RecTipCon ;
   private short[] T00X423_A2935Limite3 ;
   private String[] T00X424_A407EmprNom ;
   private boolean[] T00X424_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttaruni__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaruni__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaruni__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaruni__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaruni__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00X42", "SELECT CliCod, RecTipCon, Limite3, Precio3, PorBon3, EmprCod FROM TXPLRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ?  FOR UPDATE OF Precio3, PorBon3 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X43", "SELECT CliCod, RecTipCon, Limite3, Precio3, PorBon3, EmprCod FROM TXPLRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X44", "SELECT RecTipCon, RecTipDsc, EmprCod, CliCod FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ?  FOR UPDATE OF RecTipDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X45", "SELECT RecTipCon, RecTipDsc, EmprCod, CliCod FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X47", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X48", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.RecTipCon, T3.CliNom, TM1.RecTipDsc, TM1.EmprCod, TM1.CliCod FROM ((TXPCRECON TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.RecTipCon = ? and TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.RecTipCon ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X49", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X410", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecTipCon, EmprCod, CliCod FROM TXPCRECON WHERE ( RecTipCon > ? or RecTipCon = ? and CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, RecTipCon) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00X412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecTipCon, EmprCod, CliCod FROM TXPCRECON WHERE ( RecTipCon < ? or RecTipCon = ? and CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, RecTipCon DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00X413", "INSERT INTO TXPCRECON(RecTipCon, RecTipDsc, EmprCod, CliCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCRECON")
         ,new UpdateCursor("T00X414", "UPDATE TXPCRECON SET RecTipDsc=?  WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ?", GX_NOMASK, "TXPCRECON")
         ,new UpdateCursor("T00X415", "DELETE FROM TXPCRECON  WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ?", GX_NOMASK, "TXPCRECON")
         ,new ForEachCursor("T00X416", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X417", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? ORDER BY EmprCod, CliCod, RecTipCon ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X418", "SELECT CliCod, RecTipCon, Limite3, Precio3, PorBon3, EmprCod FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 = ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X419", "SELECT EmprCod, CliCod, RecTipCon, Limite3 FROM TXPLRECON WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00X420", "INSERT INTO TXPLRECON(CliCod, RecTipCon, Limite3, Precio3, PorBon3, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLRECON")
         ,new UpdateCursor("T00X421", "UPDATE TXPLRECON SET Precio3=?, PorBon3=?  WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ?", GX_NOMASK, "TXPLRECON")
         ,new UpdateCursor("T00X422", "DELETE FROM TXPLRECON  WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ?", GX_NOMASK, "TXPLRECON")
         ,new ForEachCursor("T00X423", "SELECT EmprCod, CliCod, RecTipCon, Limite3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00X424", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 35);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setString(6, (String)parms[7], 3);
               return;
            case 19 :
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

