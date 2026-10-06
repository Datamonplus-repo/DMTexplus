package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcestam_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1H91570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4062EstAcab = httpContext.GetPar( "EstAcab") ;
         n4062EstAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         AV33ok = (byte)(GXutil.lval( httpContext.GetPar( "ok"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.str( AV33ok, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_1H91570( A396EmprCod, A4062EstAcab, AV33ok) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
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
         gxload_15( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A252CliCod, A65ArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CESTAM", ""), (short)(0)) ;
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

   public tcestam_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcestam_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcestam_impl.class ));
   }

   public tcestam_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCESTAM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol), GXutil.rtrim( localUtil.format( A4061EstNomCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNomCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNomCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Acabado del color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstAcab_Internalname, GXutil.rtrim( A4062EstAcab), GXutil.rtrim( localUtil.format( A4062EstAcab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstAcab_Jsonclick, 0, "", "", "", "", "", 1, edtEstAcab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cuba", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCuba_Internalname, GXutil.ltrim( localUtil.ntoc( A4063EstCuba, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCuba_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4063EstCuba), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4063EstCuba), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCuba_Jsonclick, 0, "", "", "", "", "", 1, edtEstCuba_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Separación", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSepara_Internalname, GXutil.ltrim( localUtil.ntoc( A4064EstSepara, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSepara_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4064EstSepara), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4064EstSepara), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSepara_Jsonclick, 0, "", "", "", "", "", 1, edtEstSepara_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEstFechaE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstFechaE_Internalname, localUtil.format(A4065EstFechaE, "99/99/99"), localUtil.format( A4065EstFechaE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstFechaE_Jsonclick, 0, "", "", "", "", "", 1, edtEstFechaE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstFechaE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstFechaE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCESTAM.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Ultima Utilización", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtEstFechaU_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstFechaU_Internalname, localUtil.format(A4066EstFechaU, "99/99/99"), localUtil.format( A4066EstFechaU, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstFechaU_Jsonclick, 0, "", "", "", "", "", 1, edtEstFechaU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstFechaU_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstFechaU_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCESTAM.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Barcada", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4067EstBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4067EstBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4067EstBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Reoperado barcada", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarREo_Internalname, GXutil.ltrim( localUtil.ntoc( A4068EstBarREo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstBarREo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4068EstBarREo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4068EstBarREo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarREo_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarREo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "BarCodPar", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarPar_Internalname, GXutil.rtrim( A4069EstBarPar), GXutil.rtrim( localUtil.format( A4069EstBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero de formula Interno", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumFor_Internalname, GXutil.ltrim( localUtil.ntoc( A4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumFor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumFor_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumFor_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Precio Facturación", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstPreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstPreKg_Enabled!=0) ? localUtil.format( A4070EstPreKg, "ZZZZZ9.99") : localUtil.format( A4070EstPreKg, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstPreKg_Jsonclick, 0, "", "", "", "", "", 1, edtEstPreKg_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Definitivo (S/N)", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstPreDef_Internalname, GXutil.rtrim( A4071EstPreDef), GXutil.rtrim( localUtil.format( A4071EstPreDef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstPreDef_Jsonclick, 0, "", "", "", "", "", 1, edtEstPreDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTAM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTAM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCESTAM.htm");
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
      e111H92 ();
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
            Z4061EstNomCol = httpContext.cgiGet( "Z4061EstNomCol") ;
            Z4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( "Z4052EstNumFor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4062EstAcab = httpContext.cgiGet( "Z4062EstAcab") ;
            Z4063EstCuba = (short)(localUtil.ctol( httpContext.cgiGet( "Z4063EstCuba"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4064EstSepara = (short)(localUtil.ctol( httpContext.cgiGet( "Z4064EstSepara"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4065EstFechaE = localUtil.ctod( httpContext.cgiGet( "Z4065EstFechaE"), 0) ;
            Z4066EstFechaU = localUtil.ctod( httpContext.cgiGet( "Z4066EstFechaU"), 0) ;
            Z4067EstBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4067EstBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4068EstBarREo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4068EstBarREo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4069EstBarPar = httpContext.cgiGet( "Z4069EstBarPar") ;
            Z4070EstPreKg = localUtil.ctond( httpContext.cgiGet( "Z4070EstPreKg")) ;
            Z4071EstPreDef = httpContext.cgiGet( "Z4071EstPreDef") ;
            O4062EstAcab = httpContext.cgiGet( "O4062EstAcab") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33ok = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = httpContext.cgiGet( edtEstNomCol_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            A4062EstAcab = httpContext.cgiGet( edtEstAcab_Internalname) ;
            n4062EstAcab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCuba_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCuba_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCUBA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstCuba_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4063EstCuba = (short)(0) ;
               n4063EstCuba = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
            }
            else
            {
               A4063EstCuba = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCuba_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4063EstCuba = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstSepara_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstSepara_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSEPARA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstSepara_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4064EstSepara = (short)(0) ;
               n4064EstSepara = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
            }
            else
            {
               A4064EstSepara = (short)(localUtil.ctol( httpContext.cgiGet( edtEstSepara_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4064EstSepara = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEstFechaE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ESTFECHAE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstFechaE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4065EstFechaE = GXutil.nullDate() ;
               n4065EstFechaE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
            }
            else
            {
               A4065EstFechaE = localUtil.ctod( httpContext.cgiGet( edtEstFechaE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4065EstFechaE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
            }
            A4066EstFechaU = localUtil.ctod( httpContext.cgiGet( edtEstFechaU_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4066EstFechaU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTBARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4067EstBarCod = 0 ;
               n4067EstBarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
            }
            else
            {
               A4067EstBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEstBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4067EstBarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstBarREo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstBarREo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTBARREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstBarREo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4068EstBarREo = (byte)(0) ;
               n4068EstBarREo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
            }
            else
            {
               A4068EstBarREo = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstBarREo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4068EstBarREo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
            }
            A4069EstBarPar = httpContext.cgiGet( edtEstBarPar_Internalname) ;
            n4069EstBarPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTNUMFOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstNumFor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4052EstNumFor = 0 ;
               n4052EstNumFor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
            }
            else
            {
               A4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( edtEstNumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4052EstNumFor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTPREKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstPreKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4070EstPreKg = DecimalUtil.ZERO ;
               n4070EstPreKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
            }
            else
            {
               A4070EstPreKg = localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)) ;
               n4070EstPreKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
            }
            A4071EstPreDef = httpContext.cgiGet( edtEstPreDef_Internalname) ;
            n4071EstPreDef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCESTAM");
            A4066EstFechaU = localUtil.ctod( httpContext.cgiGet( edtEstFechaU_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4066EstFechaU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
            forbiddenHiddens.add("EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcestam:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4061EstNomCol = httpContext.GetPar( "EstNomCol") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
                     if ( GXutil.strcmp(sEvt, "'CCOPRO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'ccopro' */
                        e121H92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'LCOCOL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'lcocol' */
                        e131H92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'CESTOBS2'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'cestobs2' */
                        e141H92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'LCOPRV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'lcoprv' */
                        e151H92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'LCOOBS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'lcoobs' */
                        e161H92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111H92 ();
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
            initAll1H91570( ) ;
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
      disableAttributes1H91570( ) ;
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

   public void confirm_1H90( )
   {
      beforeValidate1H91570( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1H91570( ) ;
         }
         else
         {
            checkExtendedTable1H91570( ) ;
            if ( AnyError == 0 )
            {
               zm1H91570( 14) ;
               zm1H91570( 15) ;
               zm1H91570( 16) ;
            }
            closeExtendedTableCursors1H91570( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1H90( ) ;
      }
   }

   public void resetCaption1H90( )
   {
   }

   public void e111H92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcestam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tcestam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "MANTENIMIENTO DE FORMULAS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      AV29station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29station", AV29station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30emprnom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29station, GXv_char2, GXv_char3, GXv_char4) ;
      tcestam_impl.this.A396EmprCod = GXv_char2[0] ;
      tcestam_impl.this.AV30emprnom = GXv_char3[0] ;
      tcestam_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30emprnom", AV30emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_int5[0] = AV32contador ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "estnum", ""), GXv_int5) ;
      tcestam_impl.this.AV32contador = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32contador), 8, 0));
   }

   public void e121H92( )
   {
      /* 'ccopro' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tccopro", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e131H92( )
   {
      /* 'lcocol' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tlcocol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e141H92( )
   {
      /* 'cestobs2' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tcestob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4061EstNomCol))}, new String[] {"EmprCod","CliCod","ArtCod","EstNomCol"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e151H92( )
   {
      /* 'lcoprv' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tlcoprv", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e161H92( )
   {
      /* 'lcoobs' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tlcoobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm1H91570( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4052EstNumFor = T01H93_A4052EstNumFor[0] ;
            Z4062EstAcab = T01H93_A4062EstAcab[0] ;
            Z4063EstCuba = T01H93_A4063EstCuba[0] ;
            Z4064EstSepara = T01H93_A4064EstSepara[0] ;
            Z4065EstFechaE = T01H93_A4065EstFechaE[0] ;
            Z4066EstFechaU = T01H93_A4066EstFechaU[0] ;
            Z4067EstBarCod = T01H93_A4067EstBarCod[0] ;
            Z4068EstBarREo = T01H93_A4068EstBarREo[0] ;
            Z4069EstBarPar = T01H93_A4069EstBarPar[0] ;
            Z4070EstPreKg = T01H93_A4070EstPreKg[0] ;
            Z4071EstPreDef = T01H93_A4071EstPreDef[0] ;
         }
         else
         {
            Z4052EstNumFor = A4052EstNumFor ;
            Z4062EstAcab = A4062EstAcab ;
            Z4063EstCuba = A4063EstCuba ;
            Z4064EstSepara = A4064EstSepara ;
            Z4065EstFechaE = A4065EstFechaE ;
            Z4066EstFechaU = A4066EstFechaU ;
            Z4067EstBarCod = A4067EstBarCod ;
            Z4068EstBarREo = A4068EstBarREo ;
            Z4069EstBarPar = A4069EstBarPar ;
            Z4070EstPreKg = A4070EstPreKg ;
            Z4071EstPreDef = A4071EstPreDef ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z4061EstNomCol = A4061EstNomCol ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4062EstAcab = A4062EstAcab ;
         Z4063EstCuba = A4063EstCuba ;
         Z4064EstSepara = A4064EstSepara ;
         Z4065EstFechaE = A4065EstFechaE ;
         Z4066EstFechaU = A4066EstFechaU ;
         Z4067EstBarCod = A4067EstBarCod ;
         Z4068EstBarREo = A4068EstBarREo ;
         Z4069EstBarPar = A4069EstBarPar ;
         Z4070EstPreKg = A4070EstPreKg ;
         Z4071EstPreDef = A4071EstPreDef ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEstFechaU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstFechaU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFechaU_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      edtEstFechaU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstFechaU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFechaU_Enabled), 5, 0), true);
      /* Using cursor T01H94 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H94_A407EmprNom[0] ;
      n407EmprNom = T01H94_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4065EstFechaE)) && ( Gx_BScreen == 0 ) )
      {
         A4065EstFechaE = Gx_date ;
         n4065EstFechaE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
      }
      if ( isIns( )  && (0==A4063EstCuba) && ( Gx_BScreen == 0 ) )
      {
         A4063EstCuba = (short)(400) ;
         n4063EstCuba = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
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

   public void load1H91570( )
   {
      /* Using cursor T01H97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4052EstNumFor = T01H97_A4052EstNumFor[0] ;
         n4052EstNumFor = T01H97_n4052EstNumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
         A4062EstAcab = T01H97_A4062EstAcab[0] ;
         n4062EstAcab = T01H97_n4062EstAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         A4063EstCuba = T01H97_A4063EstCuba[0] ;
         n4063EstCuba = T01H97_n4063EstCuba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
         A4064EstSepara = T01H97_A4064EstSepara[0] ;
         n4064EstSepara = T01H97_n4064EstSepara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
         A4065EstFechaE = T01H97_A4065EstFechaE[0] ;
         n4065EstFechaE = T01H97_n4065EstFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
         A4066EstFechaU = T01H97_A4066EstFechaU[0] ;
         n4066EstFechaU = T01H97_n4066EstFechaU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
         A4067EstBarCod = T01H97_A4067EstBarCod[0] ;
         n4067EstBarCod = T01H97_n4067EstBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
         A4068EstBarREo = T01H97_A4068EstBarREo[0] ;
         n4068EstBarREo = T01H97_n4068EstBarREo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
         A4069EstBarPar = T01H97_A4069EstBarPar[0] ;
         n4069EstBarPar = T01H97_n4069EstBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
         A4070EstPreKg = T01H97_A4070EstPreKg[0] ;
         n4070EstPreKg = T01H97_n4070EstPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
         A4071EstPreDef = T01H97_A4071EstPreDef[0] ;
         n4071EstPreDef = T01H97_n4071EstPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
         A407EmprNom = T01H97_A407EmprNom[0] ;
         n407EmprNom = T01H97_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01H97_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1H91570( -13) ;
      }
      pr_default.close(5);
      onLoadActions1H91570( ) ;
   }

   public void onLoadActions1H91570( )
   {
   }

   public void checkExtendedTable1H91570( )
   {
      nIsDirty_1570 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A4062EstAcab, "") != 0 ) && ( GXutil.strcmp(A4062EstAcab, O4062EstAcab) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4062EstAcab ;
         GXv_int6[0] = AV33ok ;
         new app.pmircprofo(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tcestam_impl.this.A396EmprCod = GXv_char4[0] ;
         tcestam_impl.this.A4062EstAcab = GXv_char3[0] ;
         tcestam_impl.this.AV33ok = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.str( AV33ok, 1, 0));
      }
      if ( ( AV33ok == 0 ) && ( GXutil.strcmp(A4062EstAcab, "") != 0 ) && ( GXutil.strcmp(A4062EstAcab, O4062EstAcab) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Acabado incorrecto", ""), 1, "ESTACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstAcab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01H95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01H95_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01H96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( ! ( ( GXutil.strcmp(A4071EstPreDef, "S") == 0 ) || ( GXutil.strcmp(A4071EstPreDef, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Definitivo (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ESTPREDEF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstPreDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1H91570( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01H98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01H98_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_16( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01H99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
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

   public void getKey1H91570( )
   {
      /* Using cursor T01H910 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
      else
      {
         RcdFound1570 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01H93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01H93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H91570( 13) ;
         RcdFound1570 = (short)(1) ;
         A4061EstNomCol = T01H93_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         A4052EstNumFor = T01H93_A4052EstNumFor[0] ;
         n4052EstNumFor = T01H93_n4052EstNumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
         A4062EstAcab = T01H93_A4062EstAcab[0] ;
         n4062EstAcab = T01H93_n4062EstAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         A4063EstCuba = T01H93_A4063EstCuba[0] ;
         n4063EstCuba = T01H93_n4063EstCuba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
         A4064EstSepara = T01H93_A4064EstSepara[0] ;
         n4064EstSepara = T01H93_n4064EstSepara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
         A4065EstFechaE = T01H93_A4065EstFechaE[0] ;
         n4065EstFechaE = T01H93_n4065EstFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
         A4066EstFechaU = T01H93_A4066EstFechaU[0] ;
         n4066EstFechaU = T01H93_n4066EstFechaU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
         A4067EstBarCod = T01H93_A4067EstBarCod[0] ;
         n4067EstBarCod = T01H93_n4067EstBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
         A4068EstBarREo = T01H93_A4068EstBarREo[0] ;
         n4068EstBarREo = T01H93_n4068EstBarREo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
         A4069EstBarPar = T01H93_A4069EstBarPar[0] ;
         n4069EstBarPar = T01H93_n4069EstBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
         A4070EstPreKg = T01H93_A4070EstPreKg[0] ;
         n4070EstPreKg = T01H93_n4070EstPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
         A4071EstPreDef = T01H93_A4071EstPreDef[0] ;
         n4071EstPreDef = T01H93_n4071EstPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
         A252CliCod = T01H93_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01H93_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         O4062EstAcab = A4062EstAcab ;
         n4062EstAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1H91570( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1570 = (short)(0) ;
            initializeNonKey1H91570( ) ;
         }
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1570 = (short)(0) ;
         initializeNonKey1H91570( ) ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1H91570( ) ;
      if ( RcdFound1570 == 0 )
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
      RcdFound1570 = (short)(0) ;
      /* Using cursor T01H911 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01H911_A252CliCod[0] < A252CliCod ) || ( T01H911_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H911_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01H911_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01H911_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H911_A4061EstNomCol[0], A4061EstNomCol) < 0 ) ) && ( GXutil.strcmp(T01H911_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01H911_A252CliCod[0] > A252CliCod ) || ( T01H911_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H911_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01H911_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01H911_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H911_A4061EstNomCol[0], A4061EstNomCol) > 0 ) ) && ( GXutil.strcmp(T01H911_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01H911_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01H911_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01H911_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1570 = (short)(0) ;
      /* Using cursor T01H912 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01H912_A252CliCod[0] > A252CliCod ) || ( T01H912_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H912_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01H912_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01H912_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H912_A4061EstNomCol[0], A4061EstNomCol) > 0 ) ) && ( GXutil.strcmp(T01H912_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01H912_A252CliCod[0] < A252CliCod ) || ( T01H912_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H912_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01H912_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01H912_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01H912_A4061EstNomCol[0], A4061EstNomCol) < 0 ) ) && ( GXutil.strcmp(T01H912_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01H912_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01H912_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01H912_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H91570( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H91570( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1570 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4061EstNomCol = Z4061EstNomCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
               update1H91570( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H91570( ) ;
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
                  insert1H91570( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = Z4061EstNomCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
      getKey1H91570( ) ;
      if ( RcdFound1570 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = Z4061EstNomCol ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestam");
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1H90( ) ;
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
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1H91570( ) ;
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H91570( ) ;
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
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
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
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
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
      scanStart1H91570( ) ;
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1570 != 0 )
         {
            scanNext1H91570( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H91570( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1H91570( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z4052EstNumFor != T01H92_A4052EstNumFor[0] ) || ( GXutil.strcmp(Z4062EstAcab, T01H92_A4062EstAcab[0]) != 0 ) || ( Z4063EstCuba != T01H92_A4063EstCuba[0] ) || ( Z4064EstSepara != T01H92_A4064EstSepara[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4065EstFechaE), GXutil.resetTime(T01H92_A4065EstFechaE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4066EstFechaU), GXutil.resetTime(T01H92_A4066EstFechaU[0])) ) || ( Z4067EstBarCod != T01H92_A4067EstBarCod[0] ) || ( Z4068EstBarREo != T01H92_A4068EstBarREo[0] ) || ( GXutil.strcmp(Z4069EstBarPar, T01H92_A4069EstBarPar[0]) != 0 ) || ( DecimalUtil.compareTo(Z4070EstPreKg, T01H92_A4070EstPreKg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4071EstPreDef, T01H92_A4071EstPreDef[0]) != 0 ) )
         {
            if ( Z4052EstNumFor != T01H92_A4052EstNumFor[0] )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstNumFor");
               GXutil.writeLogRaw("Old: ",Z4052EstNumFor);
               GXutil.writeLogRaw("Current: ",T01H92_A4052EstNumFor[0]);
            }
            if ( GXutil.strcmp(Z4062EstAcab, T01H92_A4062EstAcab[0]) != 0 )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstAcab");
               GXutil.writeLogRaw("Old: ",Z4062EstAcab);
               GXutil.writeLogRaw("Current: ",T01H92_A4062EstAcab[0]);
            }
            if ( Z4063EstCuba != T01H92_A4063EstCuba[0] )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstCuba");
               GXutil.writeLogRaw("Old: ",Z4063EstCuba);
               GXutil.writeLogRaw("Current: ",T01H92_A4063EstCuba[0]);
            }
            if ( Z4064EstSepara != T01H92_A4064EstSepara[0] )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstSepara");
               GXutil.writeLogRaw("Old: ",Z4064EstSepara);
               GXutil.writeLogRaw("Current: ",T01H92_A4064EstSepara[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4065EstFechaE), GXutil.resetTime(T01H92_A4065EstFechaE[0])) ) )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstFechaE");
               GXutil.writeLogRaw("Old: ",Z4065EstFechaE);
               GXutil.writeLogRaw("Current: ",T01H92_A4065EstFechaE[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4066EstFechaU), GXutil.resetTime(T01H92_A4066EstFechaU[0])) ) )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstFechaU");
               GXutil.writeLogRaw("Old: ",Z4066EstFechaU);
               GXutil.writeLogRaw("Current: ",T01H92_A4066EstFechaU[0]);
            }
            if ( Z4067EstBarCod != T01H92_A4067EstBarCod[0] )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstBarCod");
               GXutil.writeLogRaw("Old: ",Z4067EstBarCod);
               GXutil.writeLogRaw("Current: ",T01H92_A4067EstBarCod[0]);
            }
            if ( Z4068EstBarREo != T01H92_A4068EstBarREo[0] )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstBarREo");
               GXutil.writeLogRaw("Old: ",Z4068EstBarREo);
               GXutil.writeLogRaw("Current: ",T01H92_A4068EstBarREo[0]);
            }
            if ( GXutil.strcmp(Z4069EstBarPar, T01H92_A4069EstBarPar[0]) != 0 )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstBarPar");
               GXutil.writeLogRaw("Old: ",Z4069EstBarPar);
               GXutil.writeLogRaw("Current: ",T01H92_A4069EstBarPar[0]);
            }
            if ( DecimalUtil.compareTo(Z4070EstPreKg, T01H92_A4070EstPreKg[0]) != 0 )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstPreKg");
               GXutil.writeLogRaw("Old: ",Z4070EstPreKg);
               GXutil.writeLogRaw("Current: ",T01H92_A4070EstPreKg[0]);
            }
            if ( GXutil.strcmp(Z4071EstPreDef, T01H92_A4071EstPreDef[0]) != 0 )
            {
               GXutil.writeLogln("tcestam:[seudo value changed for attri]"+"EstPreDef");
               GXutil.writeLogRaw("Old: ",Z4071EstPreDef);
               GXutil.writeLogRaw("Current: ",T01H92_A4071EstPreDef[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESTAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H91570( )
   {
      beforeValidate1H91570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H91570( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H91570( 0) ;
         checkOptimisticConcurrency1H91570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H91570( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H91570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H913 */
                  pr_default.execute(11, new Object[] {A4061EstNomCol, Boolean.valueOf(n4052EstNumFor), Integer.valueOf(A4052EstNumFor), Boolean.valueOf(n4062EstAcab), A4062EstAcab, Boolean.valueOf(n4063EstCuba), Short.valueOf(A4063EstCuba), Boolean.valueOf(n4064EstSepara), Short.valueOf(A4064EstSepara), Boolean.valueOf(n4065EstFechaE), A4065EstFechaE, Boolean.valueOf(n4066EstFechaU), A4066EstFechaU, Boolean.valueOf(n4067EstBarCod), Integer.valueOf(A4067EstBarCod), Boolean.valueOf(n4068EstBarREo), Byte.valueOf(A4068EstBarREo), Boolean.valueOf(n4069EstBarPar), A4069EstBarPar, Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1H90( ) ;
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
            load1H91570( ) ;
         }
         endLevel1H91570( ) ;
      }
      closeExtendedTableCursors1H91570( ) ;
   }

   public void update1H91570( )
   {
      beforeValidate1H91570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H91570( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H91570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H91570( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H91570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H914 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4052EstNumFor), Integer.valueOf(A4052EstNumFor), Boolean.valueOf(n4062EstAcab), A4062EstAcab, Boolean.valueOf(n4063EstCuba), Short.valueOf(A4063EstCuba), Boolean.valueOf(n4064EstSepara), Short.valueOf(A4064EstSepara), Boolean.valueOf(n4065EstFechaE), A4065EstFechaE, Boolean.valueOf(n4066EstFechaU), A4066EstFechaU, Boolean.valueOf(n4067EstBarCod), Integer.valueOf(A4067EstBarCod), Boolean.valueOf(n4068EstBarREo), Byte.valueOf(A4068EstBarREo), Boolean.valueOf(n4069EstBarPar), A4069EstBarPar, Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H91570( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1H90( ) ;
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
         endLevel1H91570( ) ;
      }
      closeExtendedTableCursors1H91570( ) ;
   }

   public void deferredUpdate1H91570( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H91570( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H91570( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H91570( ) ;
         afterConfirm1H91570( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H91570( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01H915 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1570 == 0 )
                     {
                        initAll1H91570( ) ;
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
                     resetCaption1H90( ) ;
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
      sMode1570 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H91570( ) ;
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H91570( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01H916 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01H916_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01H917 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Observaciones formula", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1H91570( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H91570( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcestam");
         if ( AnyError == 0 )
         {
            confirmValues1H90( ) ;
         }
         /* After transaction rules */
         if ( isIns( )  && true /* After */ )
         {
            httpContext.wjLoc = formatLink("app.tcestob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4061EstNomCol))}, new String[] {"EmprCod","CliCod","ArtCod","EstNomCol"})  ;
         }
         if ( isIns( )  && true /* After */ )
         {
            httpContext.wjLoc = formatLink("app.tccopro", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
         }
         if ( isIns( )  && true /* After */ )
         {
            httpContext.wjLoc = formatLink("app.tlcocol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
         }
         if ( isIns( )  && true /* After */ )
         {
            httpContext.wjLoc = formatLink("app.tlcoprv", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
         }
         if ( isIns( )  && true /* After */ )
         {
            httpContext.wjLoc = formatLink("app.tlcoobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestam");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H91570( )
   {
      /* Scan By routine */
      /* Using cursor T01H918 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A252CliCod = T01H918_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01H918_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01H918_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H91570( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A252CliCod = T01H918_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01H918_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01H918_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      }
   }

   public void scanEnd1H91570( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1H91570( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_int5[0] = A4052EstNumFor ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTNUM", ""), GXv_int5) ;
         tcestam_impl.this.A4052EstNumFor = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
      }
   }

   public void beforeInsert1H91570( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H91570( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H91570( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H91570( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H91570( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H91570( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtEstNomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), true);
      edtEstAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstAcab_Enabled), 5, 0), true);
      edtEstCuba_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCuba_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCuba_Enabled), 5, 0), true);
      edtEstSepara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSepara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSepara_Enabled), 5, 0), true);
      edtEstFechaE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstFechaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFechaE_Enabled), 5, 0), true);
      edtEstFechaU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstFechaU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFechaU_Enabled), 5, 0), true);
      edtEstBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstBarCod_Enabled), 5, 0), true);
      edtEstBarREo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstBarREo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstBarREo_Enabled), 5, 0), true);
      edtEstBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstBarPar_Enabled), 5, 0), true);
      edtEstNumFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNumFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNumFor_Enabled), 5, 0), true);
      edtEstPreKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstPreKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreKg_Enabled), 5, 0), true);
      edtEstPreDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstPreDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreDef_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1H91570( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1H90( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcestam", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCESTAM");
      forbiddenHiddens.add("EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcestam:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4062EstAcab", GXutil.rtrim( Z4062EstAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4063EstCuba", GXutil.ltrim( localUtil.ntoc( Z4063EstCuba, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4064EstSepara", GXutil.ltrim( localUtil.ntoc( Z4064EstSepara, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4065EstFechaE", localUtil.dtoc( Z4065EstFechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4066EstFechaU", localUtil.dtoc( Z4066EstFechaU, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4067EstBarCod", GXutil.ltrim( localUtil.ntoc( Z4067EstBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4068EstBarREo", GXutil.ltrim( localUtil.ntoc( Z4068EstBarREo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4069EstBarPar", GXutil.rtrim( Z4069EstBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4070EstPreKg", GXutil.ltrim( localUtil.ntoc( Z4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4071EstPreDef", GXutil.rtrim( Z4071EstPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "O4062EstAcab", GXutil.rtrim( O4062EstAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV33ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcestam", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCESTAM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CESTAM", "") ;
   }

   public void initializeNonKey1H91570( )
   {
      A4052EstNumFor = 0 ;
      n4052EstNumFor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
      AV33ok = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.str( AV33ok, 1, 0));
      A4062EstAcab = "" ;
      n4062EstAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
      A4064EstSepara = (short)(0) ;
      n4064EstSepara = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
      A4066EstFechaU = GXutil.nullDate() ;
      n4066EstFechaU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
      A4067EstBarCod = 0 ;
      n4067EstBarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
      A4068EstBarREo = (byte)(0) ;
      n4068EstBarREo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
      A4069EstBarPar = "" ;
      n4069EstBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
      A4070EstPreKg = DecimalUtil.ZERO ;
      n4070EstPreKg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
      A4071EstPreDef = "" ;
      n4071EstPreDef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4063EstCuba = (short)(400) ;
      n4063EstCuba = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
      A4065EstFechaE = Gx_date ;
      n4065EstFechaE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
      O4062EstAcab = A4062EstAcab ;
      n4062EstAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
      Z4052EstNumFor = 0 ;
      Z4062EstAcab = "" ;
      Z4063EstCuba = (short)(0) ;
      Z4064EstSepara = (short)(0) ;
      Z4065EstFechaE = GXutil.nullDate() ;
      Z4066EstFechaU = GXutil.nullDate() ;
      Z4067EstBarCod = 0 ;
      Z4068EstBarREo = (byte)(0) ;
      Z4069EstBarPar = "" ;
      Z4070EstPreKg = DecimalUtil.ZERO ;
      Z4071EstPreDef = "" ;
   }

   public void initAll1H91570( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4061EstNomCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      initializeNonKey1H91570( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4065EstFechaE = i4065EstFechaE ;
      n4065EstFechaE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
      A4063EstCuba = i4063EstCuba ;
      n4063EstCuba = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575987", true, true);
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
      httpContext.AddJavascriptSource("tcestam.js", "?20268241575987", false, true);
      /* End function include_jscripts */
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstNomCol_Internalname = "ESTNOMCOL" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstAcab_Internalname = "ESTACAB" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEstCuba_Internalname = "ESTCUBA" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEstSepara_Internalname = "ESTSEPARA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEstFechaE_Internalname = "ESTFECHAE" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEstFechaU_Internalname = "ESTFECHAU" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEstBarCod_Internalname = "ESTBARCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEstBarREo_Internalname = "ESTBARREO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEstBarPar_Internalname = "ESTBARPAR" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEstNumFor_Internalname = "ESTNUMFOR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEstPreKg_Internalname = "ESTPREKG" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEstPreDef_Internalname = "ESTPREDEF" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtCliNom_Internalname = "CLINOM" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "CESTAM", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEstPreDef_Jsonclick = "" ;
      edtEstPreDef_Backcolor = (int)(0xFFFFFF) ;
      edtEstPreDef_Enabled = 1 ;
      edtEstPreKg_Jsonclick = "" ;
      edtEstPreKg_Backcolor = (int)(0xFFFFFF) ;
      edtEstPreKg_Enabled = 1 ;
      edtEstNumFor_Jsonclick = "" ;
      edtEstNumFor_Backcolor = (int)(0xFFFFFF) ;
      edtEstNumFor_Enabled = 1 ;
      edtEstBarPar_Jsonclick = "" ;
      edtEstBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtEstBarPar_Enabled = 1 ;
      edtEstBarREo_Jsonclick = "" ;
      edtEstBarREo_Backcolor = (int)(0xFFFFFF) ;
      edtEstBarREo_Enabled = 1 ;
      edtEstBarCod_Jsonclick = "" ;
      edtEstBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtEstBarCod_Enabled = 1 ;
      edtEstFechaU_Jsonclick = "" ;
      edtEstFechaU_Backcolor = (int)(0xFFFFFF) ;
      edtEstFechaU_Enabled = 0 ;
      edtEstFechaE_Jsonclick = "" ;
      edtEstFechaE_Backcolor = (int)(0xFFFFFF) ;
      edtEstFechaE_Enabled = 1 ;
      edtEstSepara_Jsonclick = "" ;
      edtEstSepara_Backcolor = (int)(0xFFFFFF) ;
      edtEstSepara_Enabled = 1 ;
      edtEstCuba_Jsonclick = "" ;
      edtEstCuba_Backcolor = (int)(0xFFFFFF) ;
      edtEstCuba_Enabled = 1 ;
      edtEstAcab_Jsonclick = "" ;
      edtEstAcab_Backcolor = (int)(0xFFFFFF) ;
      edtEstAcab_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstNomCol_Jsonclick = "" ;
      edtEstNomCol_Backcolor = (int)(0xFFFFFF) ;
      edtEstNomCol_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
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

   public void xc_5_1H91570( )
   {
      if ( isIns( )  && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tccopro", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
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

   public void xc_6_1H91570( )
   {
      if ( isIns( )  && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tlcocol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
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

   public void xc_7_1H91570( )
   {
      if ( isIns( )  && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tcestob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4061EstNomCol))}, new String[] {"EmprCod","CliCod","ArtCod","EstNomCol"})  ;
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

   public void xc_8_1H91570( )
   {
      if ( isIns( )  && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tlcoprv", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
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

   public void xc_9_1H91570( )
   {
      if ( isIns( )  && true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tlcoobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
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

   public void xc_10_1H91570( )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_int5[0] = A4052EstNumFor ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTNUM", ""), GXv_int5) ;
         A4052EstNumFor = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
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

   public void xc_11_1H91570( String A396EmprCod ,
                              String A4062EstAcab ,
                              byte AV33ok )
   {
      if ( ( GXutil.strcmp(A4062EstAcab, "") != 0 ) && ( GXutil.strcmp(A4062EstAcab, O4062EstAcab) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4062EstAcab ;
         GXv_int6[0] = AV33ok ;
         new app.pmircprofo(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A4062EstAcab = GXv_char3[0] ;
         AV33ok = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.str( AV33ok, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4062EstAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33ok, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01H919 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H919_A407EmprNom[0] ;
      n407EmprNom = T01H919_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T01H916 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01H916_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(14);
      /* Using cursor T01H920 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(18);
      GX_FocusControl = edtEstAcab_Internalname ;
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
      /* Using cursor T01H916 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01H916_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      /* Using cursor T01H920 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Estnomcol( )
   {
      n4066EstFechaU = false ;
      n4065EstFechaE = false ;
      n4063EstCuba = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrim( localUtil.ntoc( A4052EstNumFor, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", GXutil.rtrim( A4062EstAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrim( localUtil.ntoc( A4063EstCuba, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrim( localUtil.ntoc( A4064EstSepara, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrim( localUtil.ntoc( A4067EstBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.ltrim( localUtil.ntoc( A4068EstBarREo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", GXutil.rtrim( A4069EstBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", GXutil.rtrim( A4071EstPreDef));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.ltrim( localUtil.ntoc( AV33ok, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4062EstAcab", GXutil.rtrim( Z4062EstAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4063EstCuba", GXutil.ltrim( localUtil.ntoc( Z4063EstCuba, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4064EstSepara", GXutil.ltrim( localUtil.ntoc( Z4064EstSepara, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4065EstFechaE", localUtil.format(Z4065EstFechaE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4066EstFechaU", localUtil.format(Z4066EstFechaU, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4067EstBarCod", GXutil.ltrim( localUtil.ntoc( Z4067EstBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4068EstBarREo", GXutil.ltrim( localUtil.ntoc( Z4068EstBarREo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4069EstBarPar", GXutil.rtrim( Z4069EstBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4070EstPreKg", GXutil.ltrim( localUtil.ntoc( Z4070EstPreKg, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4071EstPreDef", GXutil.rtrim( Z4071EstPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV33ok", GXutil.ltrim( localUtil.ntoc( ZV33ok, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "O4062EstAcab", GXutil.rtrim( O4062EstAcab));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Estacab( )
   {
      n4062EstAcab = false ;
      if ( ( GXutil.strcmp(A4062EstAcab, "") != 0 ) && ( GXutil.strcmp(A4062EstAcab, O4062EstAcab) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4062EstAcab ;
         GXv_int6[0] = AV33ok ;
         new app.pmircprofo(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         tcestam_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcestam_impl.this.A4062EstAcab = GXv_char3[0] ;
         A4062EstAcab = this.A4062EstAcab ;
         tcestam_impl.this.AV33ok = GXv_int6[0] ;
         AV33ok = this.AV33ok ;
      }
      if ( ( AV33ok == 0 ) && ( GXutil.strcmp(A4062EstAcab, "") != 0 ) && ( GXutil.strcmp(A4062EstAcab, O4062EstAcab) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Acabado incorrecto", ""), 1, "ESTACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstAcab_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", GXutil.rtrim( A4062EstAcab));
      httpContext.ajax_rsp_assign_attri("", false, "AV33ok", GXutil.ltrim( localUtil.ntoc( AV33ok, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A4066EstFechaU',fld:'ESTFECHAU',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'CCOPRO'","{handler:'e121H92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'CCOPRO'",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'LCOCOL'","{handler:'e131H92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'LCOCOL'",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'CESTOBS2'","{handler:'e141H92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''}]");
      setEventMetadata("'CESTOBS2'",",oparms:[{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'LCOPRV'","{handler:'e151H92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'LCOPRV'",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'LCOOBS'","{handler:'e161H92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'LCOOBS'",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNOMCOL","{handler:'valid_Estnomcol',iparms:[{av:'A4066EstFechaU',fld:'ESTFECHAU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A4065EstFechaE',fld:'ESTFECHAE',pic:''},{av:'A4063EstCuba',fld:'ESTCUBA',pic:'ZZZ9'},{av:'AV33ok',fld:'vOK',pic:'9'}]");
      setEventMetadata("VALID_ESTNOMCOL",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A4062EstAcab',fld:'ESTACAB',pic:''},{av:'A4063EstCuba',fld:'ESTCUBA',pic:'ZZZ9'},{av:'A4064EstSepara',fld:'ESTSEPARA',pic:'ZZZ9'},{av:'A4065EstFechaE',fld:'ESTFECHAE',pic:''},{av:'A4066EstFechaU',fld:'ESTFECHAU',pic:''},{av:'A4067EstBarCod',fld:'ESTBARCOD',pic:'ZZZZZZZ9'},{av:'A4068EstBarREo',fld:'ESTBARREO',pic:'9'},{av:'A4069EstBarPar',fld:'ESTBARPAR',pic:''},{av:'A4070EstPreKg',fld:'ESTPREKG',pic:'ZZZZZ9.99'},{av:'A4071EstPreDef',fld:'ESTPREDEF',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV33ok',fld:'vOK',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4061EstNomCol'},{av:'Z4052EstNumFor'},{av:'Z4062EstAcab'},{av:'Z4063EstCuba'},{av:'Z4064EstSepara'},{av:'Z4065EstFechaE'},{av:'Z4066EstFechaU'},{av:'Z4067EstBarCod'},{av:'Z4068EstBarREo'},{av:'Z4069EstBarPar'},{av:'Z4070EstPreKg'},{av:'Z4071EstPreDef'},{av:'Z407EmprNom'},{av:'ZV33ok'},{av:'Z279CliNom'},{av:'O4062EstAcab'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTACAB","{handler:'valid_Estacab',iparms:[{av:'O4062EstAcab'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4062EstAcab',fld:'ESTACAB',pic:''},{av:'AV33ok',fld:'vOK',pic:'9'}]");
      setEventMetadata("VALID_ESTACAB",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4062EstAcab',fld:'ESTACAB',pic:''},{av:'AV33ok',fld:'vOK',pic:'9'}]}");
      setEventMetadata("VALID_ESTNUMFOR","{handler:'valid_Estnumfor',iparms:[]");
      setEventMetadata("VALID_ESTNUMFOR",",oparms:[]}");
      setEventMetadata("VALID_ESTPREDEF","{handler:'valid_Estpredef',iparms:[]");
      setEventMetadata("VALID_ESTPREDEF",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(14);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4061EstNomCol = "" ;
      Z4062EstAcab = "" ;
      Z4065EstFechaE = GXutil.nullDate() ;
      Z4066EstFechaU = GXutil.nullDate() ;
      Z4069EstBarPar = "" ;
      Z4070EstPreKg = DecimalUtil.ZERO ;
      Z4071EstPreDef = "" ;
      O4062EstAcab = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4062EstAcab = "" ;
      A65ArtCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      A4061EstNomCol = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4065EstFechaE = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A4066EstFechaU = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4069EstBarPar = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4070EstPreKg = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A4071EstPreDef = "" ;
      lblTextblock16_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock17_Jsonclick = "" ;
      A279CliNom = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      Gx_date = GXutil.nullDate() ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9LitFe = "" ;
      AV7Lit0 = "" ;
      GXt_char1 = "" ;
      AV10Lit1 = "" ;
      AV29station = "" ;
      GXv_char2 = new String[1] ;
      AV30emprnom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01H94_A407EmprNom = new String[] {""} ;
      T01H94_n407EmprNom = new boolean[] {false} ;
      T01H97_A4061EstNomCol = new String[] {""} ;
      T01H97_A4052EstNumFor = new int[1] ;
      T01H97_n4052EstNumFor = new boolean[] {false} ;
      T01H97_A4062EstAcab = new String[] {""} ;
      T01H97_n4062EstAcab = new boolean[] {false} ;
      T01H97_A4063EstCuba = new short[1] ;
      T01H97_n4063EstCuba = new boolean[] {false} ;
      T01H97_A4064EstSepara = new short[1] ;
      T01H97_n4064EstSepara = new boolean[] {false} ;
      T01H97_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01H97_n4065EstFechaE = new boolean[] {false} ;
      T01H97_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01H97_n4066EstFechaU = new boolean[] {false} ;
      T01H97_A4067EstBarCod = new int[1] ;
      T01H97_n4067EstBarCod = new boolean[] {false} ;
      T01H97_A4068EstBarREo = new byte[1] ;
      T01H97_n4068EstBarREo = new boolean[] {false} ;
      T01H97_A4069EstBarPar = new String[] {""} ;
      T01H97_n4069EstBarPar = new boolean[] {false} ;
      T01H97_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H97_n4070EstPreKg = new boolean[] {false} ;
      T01H97_A4071EstPreDef = new String[] {""} ;
      T01H97_n4071EstPreDef = new boolean[] {false} ;
      T01H97_A407EmprNom = new String[] {""} ;
      T01H97_n407EmprNom = new boolean[] {false} ;
      T01H97_A279CliNom = new String[] {""} ;
      T01H97_A396EmprCod = new String[] {""} ;
      T01H97_A252CliCod = new int[1] ;
      T01H97_A65ArtCod = new String[] {""} ;
      T01H95_A279CliNom = new String[] {""} ;
      T01H96_A396EmprCod = new String[] {""} ;
      T01H98_A279CliNom = new String[] {""} ;
      T01H99_A396EmprCod = new String[] {""} ;
      T01H910_A396EmprCod = new String[] {""} ;
      T01H910_A252CliCod = new int[1] ;
      T01H910_A65ArtCod = new String[] {""} ;
      T01H910_A4061EstNomCol = new String[] {""} ;
      T01H93_A4061EstNomCol = new String[] {""} ;
      T01H93_A4052EstNumFor = new int[1] ;
      T01H93_n4052EstNumFor = new boolean[] {false} ;
      T01H93_A4062EstAcab = new String[] {""} ;
      T01H93_n4062EstAcab = new boolean[] {false} ;
      T01H93_A4063EstCuba = new short[1] ;
      T01H93_n4063EstCuba = new boolean[] {false} ;
      T01H93_A4064EstSepara = new short[1] ;
      T01H93_n4064EstSepara = new boolean[] {false} ;
      T01H93_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01H93_n4065EstFechaE = new boolean[] {false} ;
      T01H93_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01H93_n4066EstFechaU = new boolean[] {false} ;
      T01H93_A4067EstBarCod = new int[1] ;
      T01H93_n4067EstBarCod = new boolean[] {false} ;
      T01H93_A4068EstBarREo = new byte[1] ;
      T01H93_n4068EstBarREo = new boolean[] {false} ;
      T01H93_A4069EstBarPar = new String[] {""} ;
      T01H93_n4069EstBarPar = new boolean[] {false} ;
      T01H93_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H93_n4070EstPreKg = new boolean[] {false} ;
      T01H93_A4071EstPreDef = new String[] {""} ;
      T01H93_n4071EstPreDef = new boolean[] {false} ;
      T01H93_A396EmprCod = new String[] {""} ;
      T01H93_A252CliCod = new int[1] ;
      T01H93_A65ArtCod = new String[] {""} ;
      sMode1570 = "" ;
      T01H911_A396EmprCod = new String[] {""} ;
      T01H911_A252CliCod = new int[1] ;
      T01H911_A65ArtCod = new String[] {""} ;
      T01H911_A4061EstNomCol = new String[] {""} ;
      T01H912_A396EmprCod = new String[] {""} ;
      T01H912_A252CliCod = new int[1] ;
      T01H912_A65ArtCod = new String[] {""} ;
      T01H912_A4061EstNomCol = new String[] {""} ;
      T01H92_A4061EstNomCol = new String[] {""} ;
      T01H92_A4052EstNumFor = new int[1] ;
      T01H92_n4052EstNumFor = new boolean[] {false} ;
      T01H92_A4062EstAcab = new String[] {""} ;
      T01H92_n4062EstAcab = new boolean[] {false} ;
      T01H92_A4063EstCuba = new short[1] ;
      T01H92_n4063EstCuba = new boolean[] {false} ;
      T01H92_A4064EstSepara = new short[1] ;
      T01H92_n4064EstSepara = new boolean[] {false} ;
      T01H92_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01H92_n4065EstFechaE = new boolean[] {false} ;
      T01H92_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01H92_n4066EstFechaU = new boolean[] {false} ;
      T01H92_A4067EstBarCod = new int[1] ;
      T01H92_n4067EstBarCod = new boolean[] {false} ;
      T01H92_A4068EstBarREo = new byte[1] ;
      T01H92_n4068EstBarREo = new boolean[] {false} ;
      T01H92_A4069EstBarPar = new String[] {""} ;
      T01H92_n4069EstBarPar = new boolean[] {false} ;
      T01H92_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H92_n4070EstPreKg = new boolean[] {false} ;
      T01H92_A4071EstPreDef = new String[] {""} ;
      T01H92_n4071EstPreDef = new boolean[] {false} ;
      T01H92_A396EmprCod = new String[] {""} ;
      T01H92_A252CliCod = new int[1] ;
      T01H92_A65ArtCod = new String[] {""} ;
      T01H916_A279CliNom = new String[] {""} ;
      T01H917_A396EmprCod = new String[] {""} ;
      T01H917_A252CliCod = new int[1] ;
      T01H917_A65ArtCod = new String[] {""} ;
      T01H917_A4061EstNomCol = new String[] {""} ;
      T01H917_A4073EstObsLin2 = new byte[1] ;
      T01H918_A396EmprCod = new String[] {""} ;
      T01H918_A252CliCod = new int[1] ;
      T01H918_A65ArtCod = new String[] {""} ;
      T01H918_A4061EstNomCol = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4065EstFechaE = GXutil.nullDate() ;
      GXv_int5 = new int[1] ;
      T01H919_A407EmprNom = new String[] {""} ;
      T01H919_n407EmprNom = new boolean[] {false} ;
      T01H920_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4061EstNomCol = "" ;
      ZZ4062EstAcab = "" ;
      ZZ4065EstFechaE = GXutil.nullDate() ;
      ZZ4066EstFechaU = GXutil.nullDate() ;
      ZZ4069EstBarPar = "" ;
      ZZ4070EstPreKg = DecimalUtil.ZERO ;
      ZZ4071EstPreDef = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZO4062EstAcab = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcestam__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcestam__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcestam__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcestam__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcestam__default(),
         new Object[] {
             new Object[] {
            T01H92_A4061EstNomCol, T01H92_A4052EstNumFor, T01H92_n4052EstNumFor, T01H92_A4062EstAcab, T01H92_n4062EstAcab, T01H92_A4063EstCuba, T01H92_n4063EstCuba, T01H92_A4064EstSepara, T01H92_n4064EstSepara, T01H92_A4065EstFechaE,
            T01H92_n4065EstFechaE, T01H92_A4066EstFechaU, T01H92_n4066EstFechaU, T01H92_A4067EstBarCod, T01H92_n4067EstBarCod, T01H92_A4068EstBarREo, T01H92_n4068EstBarREo, T01H92_A4069EstBarPar, T01H92_n4069EstBarPar, T01H92_A4070EstPreKg,
            T01H92_n4070EstPreKg, T01H92_A4071EstPreDef, T01H92_n4071EstPreDef, T01H92_A396EmprCod, T01H92_A252CliCod, T01H92_A65ArtCod
            }
            , new Object[] {
            T01H93_A4061EstNomCol, T01H93_A4052EstNumFor, T01H93_n4052EstNumFor, T01H93_A4062EstAcab, T01H93_n4062EstAcab, T01H93_A4063EstCuba, T01H93_n4063EstCuba, T01H93_A4064EstSepara, T01H93_n4064EstSepara, T01H93_A4065EstFechaE,
            T01H93_n4065EstFechaE, T01H93_A4066EstFechaU, T01H93_n4066EstFechaU, T01H93_A4067EstBarCod, T01H93_n4067EstBarCod, T01H93_A4068EstBarREo, T01H93_n4068EstBarREo, T01H93_A4069EstBarPar, T01H93_n4069EstBarPar, T01H93_A4070EstPreKg,
            T01H93_n4070EstPreKg, T01H93_A4071EstPreDef, T01H93_n4071EstPreDef, T01H93_A396EmprCod, T01H93_A252CliCod, T01H93_A65ArtCod
            }
            , new Object[] {
            T01H94_A407EmprNom, T01H94_n407EmprNom
            }
            , new Object[] {
            T01H95_A279CliNom
            }
            , new Object[] {
            T01H96_A396EmprCod
            }
            , new Object[] {
            T01H97_A4061EstNomCol, T01H97_A4052EstNumFor, T01H97_n4052EstNumFor, T01H97_A4062EstAcab, T01H97_n4062EstAcab, T01H97_A4063EstCuba, T01H97_n4063EstCuba, T01H97_A4064EstSepara, T01H97_n4064EstSepara, T01H97_A4065EstFechaE,
            T01H97_n4065EstFechaE, T01H97_A4066EstFechaU, T01H97_n4066EstFechaU, T01H97_A4067EstBarCod, T01H97_n4067EstBarCod, T01H97_A4068EstBarREo, T01H97_n4068EstBarREo, T01H97_A4069EstBarPar, T01H97_n4069EstBarPar, T01H97_A4070EstPreKg,
            T01H97_n4070EstPreKg, T01H97_A4071EstPreDef, T01H97_n4071EstPreDef, T01H97_A407EmprNom, T01H97_n407EmprNom, T01H97_A279CliNom, T01H97_A396EmprCod, T01H97_A252CliCod, T01H97_A65ArtCod
            }
            , new Object[] {
            T01H98_A279CliNom
            }
            , new Object[] {
            T01H99_A396EmprCod
            }
            , new Object[] {
            T01H910_A396EmprCod, T01H910_A252CliCod, T01H910_A65ArtCod, T01H910_A4061EstNomCol
            }
            , new Object[] {
            T01H911_A396EmprCod, T01H911_A252CliCod, T01H911_A65ArtCod, T01H911_A4061EstNomCol
            }
            , new Object[] {
            T01H912_A396EmprCod, T01H912_A252CliCod, T01H912_A65ArtCod, T01H912_A4061EstNomCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H916_A279CliNom
            }
            , new Object[] {
            T01H917_A396EmprCod, T01H917_A252CliCod, T01H917_A65ArtCod, T01H917_A4061EstNomCol, T01H917_A4073EstObsLin2
            }
            , new Object[] {
            T01H918_A396EmprCod, T01H918_A252CliCod, T01H918_A65ArtCod, T01H918_A4061EstNomCol
            }
            , new Object[] {
            T01H919_A407EmprNom, T01H919_n407EmprNom
            }
            , new Object[] {
            T01H920_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4063EstCuba = (short)(400) ;
      n4063EstCuba = false ;
      A4063EstCuba = (short)(400) ;
      n4063EstCuba = false ;
      i4063EstCuba = (short)(400) ;
      n4063EstCuba = false ;
      Z4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      A4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      i4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      Gx_date = GXutil.today( ) ;
   }

   private byte Z4068EstBarREo ;
   private byte GxWebError ;
   private byte AV33ok ;
   private byte nKeyPressed ;
   private byte A4068EstBarREo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZV33ok ;
   private byte ZZ4068EstBarREo ;
   private byte ZZV33ok ;
   private byte GXv_int6[] ;
   private short Z4063EstCuba ;
   private short Z4064EstSepara ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4063EstCuba ;
   private short A4064EstSepara ;
   private short RcdFound1570 ;
   private short nIsDirty_1570 ;
   private short i4063EstCuba ;
   private short ZZ4063EstCuba ;
   private short ZZ4064EstSepara ;
   private int Z252CliCod ;
   private int Z4052EstNumFor ;
   private int Z4067EstBarCod ;
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
   private int edtEstNomCol_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEstAcab_Enabled ;
   private int edtEstCuba_Enabled ;
   private int edtEstSepara_Enabled ;
   private int edtEstFechaE_Enabled ;
   private int edtEstFechaU_Enabled ;
   private int A4067EstBarCod ;
   private int edtEstBarCod_Enabled ;
   private int edtEstBarREo_Enabled ;
   private int edtEstBarPar_Enabled ;
   private int A4052EstNumFor ;
   private int edtEstNumFor_Enabled ;
   private int edtEstPreKg_Enabled ;
   private int edtEstPreDef_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV32contador ;
   private int GX_JID ;
   private int idxLst ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstPreDef_Backcolor ;
   private int edtEstPreKg_Backcolor ;
   private int edtEstNumFor_Backcolor ;
   private int edtEstBarPar_Backcolor ;
   private int edtEstBarREo_Backcolor ;
   private int edtEstBarCod_Backcolor ;
   private int edtEstFechaU_Backcolor ;
   private int edtEstFechaE_Backcolor ;
   private int edtEstSepara_Backcolor ;
   private int edtEstCuba_Backcolor ;
   private int edtEstAcab_Backcolor ;
   private int edtEstNomCol_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int5[] ;
   private int ZZ252CliCod ;
   private int ZZ4052EstNumFor ;
   private int ZZ4067EstBarCod ;
   private java.math.BigDecimal Z4070EstPreKg ;
   private java.math.BigDecimal A4070EstPreKg ;
   private java.math.BigDecimal ZZ4070EstPreKg ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4061EstNomCol ;
   private String Z4062EstAcab ;
   private String Z4069EstBarPar ;
   private String Z4071EstPreDef ;
   private String O4062EstAcab ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4062EstAcab ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstNomCol_Internalname ;
   private String A4061EstNomCol ;
   private String edtEstNomCol_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstAcab_Internalname ;
   private String edtEstAcab_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEstCuba_Internalname ;
   private String edtEstCuba_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEstSepara_Internalname ;
   private String edtEstSepara_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEstFechaE_Internalname ;
   private String edtEstFechaE_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEstFechaU_Internalname ;
   private String edtEstFechaU_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEstBarCod_Internalname ;
   private String edtEstBarCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEstBarREo_Internalname ;
   private String edtEstBarREo_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEstBarPar_Internalname ;
   private String A4069EstBarPar ;
   private String edtEstBarPar_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEstNumFor_Internalname ;
   private String edtEstNumFor_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEstPreKg_Internalname ;
   private String edtEstPreKg_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEstPreDef_Internalname ;
   private String A4071EstPreDef ;
   private String edtEstPreDef_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
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
   private String Gx_mode ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV9LitFe ;
   private String AV7Lit0 ;
   private String GXt_char1 ;
   private String AV10Lit1 ;
   private String AV29station ;
   private String GXv_char2[] ;
   private String AV30emprnom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1570 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4061EstNomCol ;
   private String ZZ4062EstAcab ;
   private String ZZ4069EstBarPar ;
   private String ZZ4071EstPreDef ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZO4062EstAcab ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z4065EstFechaE ;
   private java.util.Date Z4066EstFechaU ;
   private java.util.Date A4065EstFechaE ;
   private java.util.Date A4066EstFechaU ;
   private java.util.Date Gx_date ;
   private java.util.Date i4065EstFechaE ;
   private java.util.Date ZZ4065EstFechaE ;
   private java.util.Date ZZ4066EstFechaU ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4062EstAcab ;
   private boolean wbErr ;
   private boolean n4063EstCuba ;
   private boolean n4064EstSepara ;
   private boolean n4065EstFechaE ;
   private boolean n4066EstFechaU ;
   private boolean n4067EstBarCod ;
   private boolean n4068EstBarREo ;
   private boolean n4069EstBarPar ;
   private boolean n4052EstNumFor ;
   private boolean n4070EstPreKg ;
   private boolean n4071EstPreDef ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01H94_A407EmprNom ;
   private boolean[] T01H94_n407EmprNom ;
   private String[] T01H97_A4061EstNomCol ;
   private int[] T01H97_A4052EstNumFor ;
   private boolean[] T01H97_n4052EstNumFor ;
   private String[] T01H97_A4062EstAcab ;
   private boolean[] T01H97_n4062EstAcab ;
   private short[] T01H97_A4063EstCuba ;
   private boolean[] T01H97_n4063EstCuba ;
   private short[] T01H97_A4064EstSepara ;
   private boolean[] T01H97_n4064EstSepara ;
   private java.util.Date[] T01H97_A4065EstFechaE ;
   private boolean[] T01H97_n4065EstFechaE ;
   private java.util.Date[] T01H97_A4066EstFechaU ;
   private boolean[] T01H97_n4066EstFechaU ;
   private int[] T01H97_A4067EstBarCod ;
   private boolean[] T01H97_n4067EstBarCod ;
   private byte[] T01H97_A4068EstBarREo ;
   private boolean[] T01H97_n4068EstBarREo ;
   private String[] T01H97_A4069EstBarPar ;
   private boolean[] T01H97_n4069EstBarPar ;
   private java.math.BigDecimal[] T01H97_A4070EstPreKg ;
   private boolean[] T01H97_n4070EstPreKg ;
   private String[] T01H97_A4071EstPreDef ;
   private boolean[] T01H97_n4071EstPreDef ;
   private String[] T01H97_A407EmprNom ;
   private boolean[] T01H97_n407EmprNom ;
   private String[] T01H97_A279CliNom ;
   private String[] T01H97_A396EmprCod ;
   private int[] T01H97_A252CliCod ;
   private String[] T01H97_A65ArtCod ;
   private String[] T01H95_A279CliNom ;
   private String[] T01H96_A396EmprCod ;
   private String[] T01H98_A279CliNom ;
   private String[] T01H99_A396EmprCod ;
   private String[] T01H910_A396EmprCod ;
   private int[] T01H910_A252CliCod ;
   private String[] T01H910_A65ArtCod ;
   private String[] T01H910_A4061EstNomCol ;
   private String[] T01H93_A4061EstNomCol ;
   private int[] T01H93_A4052EstNumFor ;
   private boolean[] T01H93_n4052EstNumFor ;
   private String[] T01H93_A4062EstAcab ;
   private boolean[] T01H93_n4062EstAcab ;
   private short[] T01H93_A4063EstCuba ;
   private boolean[] T01H93_n4063EstCuba ;
   private short[] T01H93_A4064EstSepara ;
   private boolean[] T01H93_n4064EstSepara ;
   private java.util.Date[] T01H93_A4065EstFechaE ;
   private boolean[] T01H93_n4065EstFechaE ;
   private java.util.Date[] T01H93_A4066EstFechaU ;
   private boolean[] T01H93_n4066EstFechaU ;
   private int[] T01H93_A4067EstBarCod ;
   private boolean[] T01H93_n4067EstBarCod ;
   private byte[] T01H93_A4068EstBarREo ;
   private boolean[] T01H93_n4068EstBarREo ;
   private String[] T01H93_A4069EstBarPar ;
   private boolean[] T01H93_n4069EstBarPar ;
   private java.math.BigDecimal[] T01H93_A4070EstPreKg ;
   private boolean[] T01H93_n4070EstPreKg ;
   private String[] T01H93_A4071EstPreDef ;
   private boolean[] T01H93_n4071EstPreDef ;
   private String[] T01H93_A396EmprCod ;
   private int[] T01H93_A252CliCod ;
   private String[] T01H93_A65ArtCod ;
   private String[] T01H911_A396EmprCod ;
   private int[] T01H911_A252CliCod ;
   private String[] T01H911_A65ArtCod ;
   private String[] T01H911_A4061EstNomCol ;
   private String[] T01H912_A396EmprCod ;
   private int[] T01H912_A252CliCod ;
   private String[] T01H912_A65ArtCod ;
   private String[] T01H912_A4061EstNomCol ;
   private String[] T01H92_A4061EstNomCol ;
   private int[] T01H92_A4052EstNumFor ;
   private boolean[] T01H92_n4052EstNumFor ;
   private String[] T01H92_A4062EstAcab ;
   private boolean[] T01H92_n4062EstAcab ;
   private short[] T01H92_A4063EstCuba ;
   private boolean[] T01H92_n4063EstCuba ;
   private short[] T01H92_A4064EstSepara ;
   private boolean[] T01H92_n4064EstSepara ;
   private java.util.Date[] T01H92_A4065EstFechaE ;
   private boolean[] T01H92_n4065EstFechaE ;
   private java.util.Date[] T01H92_A4066EstFechaU ;
   private boolean[] T01H92_n4066EstFechaU ;
   private int[] T01H92_A4067EstBarCod ;
   private boolean[] T01H92_n4067EstBarCod ;
   private byte[] T01H92_A4068EstBarREo ;
   private boolean[] T01H92_n4068EstBarREo ;
   private String[] T01H92_A4069EstBarPar ;
   private boolean[] T01H92_n4069EstBarPar ;
   private java.math.BigDecimal[] T01H92_A4070EstPreKg ;
   private boolean[] T01H92_n4070EstPreKg ;
   private String[] T01H92_A4071EstPreDef ;
   private boolean[] T01H92_n4071EstPreDef ;
   private String[] T01H92_A396EmprCod ;
   private int[] T01H92_A252CliCod ;
   private String[] T01H92_A65ArtCod ;
   private String[] T01H916_A279CliNom ;
   private String[] T01H917_A396EmprCod ;
   private int[] T01H917_A252CliCod ;
   private String[] T01H917_A65ArtCod ;
   private String[] T01H917_A4061EstNomCol ;
   private byte[] T01H917_A4073EstObsLin2 ;
   private String[] T01H918_A396EmprCod ;
   private int[] T01H918_A252CliCod ;
   private String[] T01H918_A65ArtCod ;
   private String[] T01H918_A4061EstNomCol ;
   private String[] T01H919_A407EmprNom ;
   private boolean[] T01H919_n407EmprNom ;
   private String[] T01H920_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcestam__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestam__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestam__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestam__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01H92", "SELECT EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?  FOR UPDATE OF EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H93", "SELECT EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H94", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H95", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H96", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H97", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstNomCol, TM1.EstNumFor, TM1.EstAcab, TM1.EstCuba, TM1.EstSepara, TM1.EstFechaE, TM1.EstFechaU, TM1.EstBarCod, TM1.EstBarREo, TM1.EstBarPar, TM1.EstPreKg, TM1.EstPreDef, T2.EmprNom, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM ((TXPCESTAM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.EstNomCol = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.EstNomCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H98", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H99", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H910", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EstNomCol > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H912", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EstNomCol < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, EstNomCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01H913", "INSERT INTO TXPCESTAM(EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EmprCod, CliCod, ArtCod, EstObsUlt2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01H914", "UPDATE TXPCESTAM SET EstNumFor=?, EstAcab=?, EstCuba=?, EstSepara=?, EstFechaE=?, EstFechaU=?, EstBarCod=?, EstBarREo=?, EstBarPar=?, EstPreKg=?, EstPreDef=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01H915", "DELETE FROM TXPCESTAM  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new ForEachCursor("T01H916", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H917", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H918", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H919", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H920", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((String[]) buf[26])[0] = rslt.getString(15, 3);
               ((int[]) buf[27])[0] = rslt.getInt(16);
               ((String[]) buf[28])[0] = rslt.getString(17, 16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 13);
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
                  stmt.setString(3, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               stmt.setString(13, (String)parms[23], 3);
               stmt.setInt(14, ((Number) parms[24]).intValue());
               stmt.setString(15, (String)parms[25], 16);
               return;
            case 12 :
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
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setString(14, (String)parms[24], 16);
               stmt.setString(15, (String)parms[25], 13);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

